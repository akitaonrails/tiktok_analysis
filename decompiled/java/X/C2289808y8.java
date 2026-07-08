package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: renamed from: X.08y8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2289808y8 {
    public final /* synthetic */ AbstractC2289508y5 LIZ;

    public C2289808y8(AbstractC2289508y5 abstractC2289508y5) {
        this.LIZ = abstractC2289508y5;
    }

    public static final void LIZ(C2290408yE c2290408yE) {
        int readHoldCount;
        C2288608xw.LIZ.getClass();
        try {
            ReentrantReadWriteLock reentrantReadWriteLock = C2288608xw.LJFF;
            ReentrantReadWriteLock.ReadLock lock = reentrantReadWriteLock.readLock();
            int i = 0;
            if (reentrantReadWriteLock.getWriteHoldCount() == 0) {
                readHoldCount = reentrantReadWriteLock.getReadHoldCount();
                for (int i2 = 0; i2 < readHoldCount; i2++) {
                    lock.unlock();
                }
            } else {
                readHoldCount = 0;
            }
            ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
            writeLock.lock();
            try {
                C2207811Bb1 c2207811Bb1 = c2290408yE.LIZLLL;
                if (c2207811Bb1 != null) {
                    c2207811Bb1.LIZJ();
                }
                c2290408yE.LIZLLL = null;
                c2290408yE.LIZJ = null;
                c2290408yE.LIZ = null;
                c2290408yE.LIZIZ = null;
                while (i < readHoldCount) {
                    lock.lock();
                    i++;
                }
                writeLock.unlock();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                while (i < readHoldCount) {
                    lock.lock();
                    i++;
                }
                writeLock.unlock();
                throw th;
            }
        } catch (C564610MCl e) {
            TryCatchGuardChecker.doCheck(e);
            C201955140j.LJIILIIL("AIMusicConfigOptHelper", "finishTask happend IOException");
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("finishTask Unexpected error msg: ");
            sbLIZ.append(e2.getMessage());
            C201955140j.LJIILIIL("AIMusicConfigOptHelper", C2188811AlT.LIZIZ(sbLIZ));
        }
    }
}
