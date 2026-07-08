package X;

import android.os.Build;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.function.BiFunction;
import java.util.function.Function;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.13rj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20143313rj {
    public final ConcurrentHashMap<String, C20143613rm> LIZ = new ConcurrentHashMap<>();
    public final boolean LIZIZ;

    public C20143313rj() {
        this.LIZIZ = Build.VERSION.SDK_INT >= 24;
    }

    public final ReadWriteLock LIZ(final String str) {
        C20143613rm c20143613rmComputeIfAbsent;
        final C20143413rk c20143413rk = new C20143413rk();
        if (this.LIZIZ) {
            c20143613rmComputeIfAbsent = this.LIZ.computeIfAbsent(str, new Function() { // from class: X.13ri
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return c20143413rk.invoke(str);
                }
            });
        } else {
            synchronized (this.LIZ) {
                try {
                    c20143613rmComputeIfAbsent = this.LIZ.get(str);
                    if (c20143613rmComputeIfAbsent == null) {
                        Object objInvoke = c20143413rk.invoke(str);
                        this.LIZ.put(str, (C20143613rm) objInvoke);
                        c20143613rmComputeIfAbsent = (C20143613rm) objInvoke;
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        c20143613rmComputeIfAbsent.LIZIZ.incrementAndGet();
        return c20143613rmComputeIfAbsent.LIZ;
    }

    public final void LIZIZ(String str) {
        C20143613rm c20143613rm;
        final C20143513rl c20143513rl = new C20143513rl();
        if (this.LIZIZ) {
            this.LIZ.computeIfPresent(str, new BiFunction() { // from class: X.13rc
                @Override // java.util.function.BiFunction
                public final Object apply(Object obj, Object obj2) {
                    return c20143513rl.invoke(obj, obj2);
                }
            });
            return;
        }
        synchronized (this.LIZ) {
            try {
                C20143613rm c20143613rm2 = this.LIZ.get(str);
                if (c20143613rm2 != null && (c20143613rm = (C20143613rm) c20143513rl.invoke(str, c20143613rm2)) != null) {
                    this.LIZ.put(str, c20143613rm);
                } else {
                    this.LIZ.remove(str);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final <R> R LIZJ(String str, Function0<? extends R> function0) {
        Lock lockWriteLock = LIZ(str).writeLock();
        lockWriteLock.lock();
        try {
            R rInvoke = function0.invoke();
            lockWriteLock.unlock();
            LIZIZ(str);
            return rInvoke;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            lockWriteLock.unlock();
            LIZIZ(str);
            throw th;
        }
    }
}
