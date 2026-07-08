package X;

import android.app.Activity;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.WeakHashMap;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.12LP, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C12LP implements C12LO {
    public final C12LO LIZ;
    public final ReentrantLock LIZIZ = new ReentrantLock();
    public final WeakHashMap<Activity, C0N9B> LIZJ = new WeakHashMap<>();

    public C12LP(C12LL c12ll) {
        this.LIZ = c12ll;
    }

    @Override // X.C12LO
    public final void LIZ(Activity activity, C0N9B c0n9b) {
        ReentrantLock reentrantLock = this.LIZIZ;
        reentrantLock.lock();
        try {
            if (Intrinsics.LJFF(c0n9b, this.LIZJ.get(activity))) {
                reentrantLock.unlock();
                return;
            }
            this.LIZJ.put(activity, c0n9b);
            reentrantLock.unlock();
            this.LIZ.LIZ(activity, c0n9b);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            reentrantLock.unlock();
            throw th;
        }
    }
}
