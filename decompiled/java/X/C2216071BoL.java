package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.1BoL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2216071BoL {
    public final ReentrantLock LIZ;
    public final ConditionC2216081BoM LIZIZ;

    public C2216071BoL() {
        ReentrantLock reentrantLock = new ReentrantLock();
        this.LIZ = reentrantLock;
        this.LIZIZ = new ConditionC2216081BoM(reentrantLock.newCondition());
    }

    public final void LIZ(Function1 function1) {
        this.LIZ.lock();
        try {
            function1.invoke(this.LIZIZ);
            this.LIZ.unlock();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LIZ.unlock();
            throw th;
        }
    }
}
