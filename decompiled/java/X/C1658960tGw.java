package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0tGw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1658960tGw<T> implements InterfaceC608270NtR<Object, T> {
    public Function0<? extends T> LL;
    public final Object LLILLJJLI;
    public Object LLILLL;

    public C1658960tGw(Function0<? extends T> function0, Object obj) {
        this.LL = function0;
        this.LLILLJJLI = obj == null ? this : obj;
        this.LLILLL = C1658970tGx.LIZ;
    }

    @Override // X.InterfaceC608270NtR, X.InterfaceC1731706qJ
    public final T getValue(Object obj, InterfaceC2217461Bqa<?> interfaceC2217461Bqa) {
        synchronized (this.LLILLJJLI) {
            try {
                T t = (T) this.LLILLL;
                if (t != C1658970tGx.LIZ) {
                    return t;
                }
                Function0<? extends T> function0 = this.LL;
                if (function0 != null) {
                    T tInvoke = function0.invoke();
                    this.LLILLL = tInvoke;
                    this.LL = null;
                    return tInvoke;
                }
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // X.InterfaceC608270NtR
    public final void setValue(Object obj, InterfaceC2217461Bqa<?> interfaceC2217461Bqa, T t) {
        synchronized (this.LLILLJJLI) {
            try {
                this.LLILLL = t;
                this.LL = null;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }
}
