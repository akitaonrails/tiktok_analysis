package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0QFN, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class C0QFN extends C2217421BqW implements Function1<C0QFL, Unit> {
    public C0QFN(C0QFM c0qfm) {
        super(1, c0qfm, C0QFM.class, "onDetach", "onDetach(Lcom/bytedance/analytics/IBTMPageNode;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C0QFL c0qfl) {
        C0QFL c0qfl2 = c0qfl;
        this.receiver.getClass();
        ReentrantLock reentrantLock = C0QFM.LIZIZ;
        reentrantLock.lock();
        try {
            C0QFM.LIZ.getClass();
            reentrantLock.unlock();
            return Unit.LIZ;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            reentrantLock.unlock();
            throw th;
        }
    }
}
