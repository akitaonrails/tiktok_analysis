package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.jvm.internal.AFwS229S0000000_2;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.0yBY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1847820yBY {
    public static final C1847900yBg LIZ = new C1847900yBg();
    public static final C1847810yBX LIZIZ = new C1847810yBX();
    public static final C1490470otB LIZJ = new C1490470otB();
    public static final C1848150yC5 LIZLLL = new C1848150yC5();
    public static String LJ = "";
    public static int LJFF;

    public static void LIZ() {
        if (C1847960yBm.LJIIIIZZ) {
            C1847900yBg c1847900yBg = LIZ;
            ((ReentrantReadWriteLock) c1847900yBg.LIZIZ).readLock().lock();
            try {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("all refer list: ");
                sbLIZ.append(C0VP1.LIZIZ(c1847900yBg.LIZ));
                C2188811AlT.LIZIZ(sbLIZ);
                ((ReentrantReadWriteLock) c1847900yBg.LIZIZ).readLock().unlock();
                C1847810yBX c1847810yBX = LIZIZ;
                ((ReentrantReadWriteLock) c1847810yBX.LIZIZ).readLock().lock();
                try {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("psrefer list: ");
                    sbLIZ2.append(C13LP.LJJLIIIJ(c1847810yBX.LIZ, ", ", e3.e, "\n]", 0, null, AFwS229S0000000_2.get$arr$(627), 24));
                    C2188811AlT.LIZIZ(sbLIZ2);
                    ((ReentrantReadWriteLock) c1847810yBX.LIZIZ).readLock().unlock();
                    C1490470otB c1490470otB = LIZJ;
                    ((ReentrantReadWriteLock) c1490470otB.LIZIZ).readLock().lock();
                    try {
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append("Activity refer list: ");
                        sbLIZ3.append(C0VP1.LIZ(c1490470otB.LIZ));
                        C2188811AlT.LIZIZ(sbLIZ3);
                        ((ReentrantReadWriteLock) c1490470otB.LIZIZ).readLock().unlock();
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        ((ReentrantReadWriteLock) c1490470otB.LIZIZ).readLock().unlock();
                        throw th;
                    }
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                    ((ReentrantReadWriteLock) c1847810yBX.LIZIZ).readLock().unlock();
                    throw th2;
                }
            } catch (Throwable th3) {
                TryCatchGuardChecker.doCheck(th3);
                ((ReentrantReadWriteLock) c1847900yBg.LIZIZ).readLock().unlock();
                throw th3;
            }
        }
    }
}
