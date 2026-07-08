package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: X.0kUN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1321330kUN {
    public static C1321200kUA LIZ(Throwable th) {
        C1321200kUA c1321200kUA = new C1321200kUA();
        c1321200kUA.LJIIJJI(th);
        return c1321200kUA;
    }

    public static <T> T LIZIZ(InterfaceC1320200kSY<T> interfaceC1320200kSY) throws Throwable {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        final C1321350kUP c1321350kUP = new C1321350kUP();
        final C1321350kUP c1321350kUP2 = new C1321350kUP();
        interfaceC1320200kSY.LIZJ(new InterfaceC589510NAf<T>() { // from class: X.0kUO
            @Override // X.InterfaceC589510NAf
            public final void LIZJ(AbstractC1321260kUG abstractC1321260kUG) {
            }

            @Override // X.InterfaceC589510NAf
            public final void LIZ(InterfaceC1320200kSY<T> interfaceC1320200kSY2) {
                if (!interfaceC1320200kSY2.LIZ()) {
                    return;
                }
                try {
                    c1321350kUP.LIZ = interfaceC1320200kSY2.getResult();
                    countDownLatch.countDown();
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    countDownLatch.countDown();
                    throw th;
                }
            }

            @Override // X.InterfaceC589510NAf
            public final void LIZIZ(InterfaceC1320200kSY<T> interfaceC1320200kSY2) {
                try {
                    c1321350kUP2.LIZ = (T) ((AbstractC1321260kUG) interfaceC1320200kSY2).LIZLLL();
                    countDownLatch.countDown();
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    countDownLatch.countDown();
                    throw th;
                }
            }

            @Override // X.InterfaceC589510NAf
            public final void LIZLLL(AbstractC1321260kUG abstractC1321260kUG) {
                countDownLatch.countDown();
            }
        }, new Executor() { // from class: X.0L6R
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                runnable.run();
            }
        });
        countDownLatch.await();
        T t = c1321350kUP2.LIZ;
        if (t == null) {
            return c1321350kUP.LIZ;
        }
        throw ((Throwable) t);
    }
}
