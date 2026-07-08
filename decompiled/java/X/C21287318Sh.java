package X;

import com.bytedance.keva.Keva;
import com.bytedance.keva.KevaImpl;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.im.saas.host.api.feature.privacy.PrivacySettingsFeature;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: renamed from: X.18Sh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21287318Sh {
    public static Keva LIZIZ;
    public static final C01GW LIZ = C452501pT.LIZIZ(new C21351318h5());
    public static final ReentrantReadWriteLock LIZJ = new ReentrantReadWriteLock();

    public static Keva LIZ() {
        int readHoldCount;
        ReentrantReadWriteLock reentrantReadWriteLock = LIZJ;
        ReentrantReadWriteLock.ReadLock lock = reentrantReadWriteLock.readLock();
        lock.lock();
        try {
            Keva keva = LIZIZ;
            if (keva != null) {
                lock.unlock();
                return keva;
            }
            lock.unlock();
            ReentrantReadWriteLock.ReadLock lock2 = reentrantReadWriteLock.readLock();
            int i = 0;
            if (reentrantReadWriteLock.getWriteHoldCount() == 0) {
                readHoldCount = reentrantReadWriteLock.getReadHoldCount();
                for (int i2 = 0; i2 < readHoldCount; i2++) {
                    lock2.unlock();
                }
            } else {
                readHoldCount = 0;
            }
            ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
            writeLock.lock();
            try {
                Keva repo = LIZIZ;
                if (repo == null) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("im_contact_repo-");
                    String curUserId = ((C1400340mXo) C0I0B.LJFF.LIZ()).getCurUserId();
                    if (curUserId == null) {
                        curUserId = "";
                    }
                    sbLIZ.append(curUserId);
                    repo = KevaImpl.getRepo(C2188811AlT.LIZIZ(sbLIZ), 1);
                    LIZIZ = repo;
                }
                while (i < readHoldCount) {
                    lock2.lock();
                    i++;
                }
                writeLock.unlock();
                return repo;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                while (i < readHoldCount) {
                    lock2.lock();
                    i++;
                }
                writeLock.unlock();
                throw th;
            }
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            lock.unlock();
            throw th2;
        }
    }

    public static boolean LIZIZ() {
        C01GW c01gw = LIZ;
        int iLJIIIZ = ((PrivacySettingsFeature) c01gw.getValue()).LJIIIZ("dm_setting_others");
        if (iLJIIIZ == -1) {
            return false;
        }
        int iLJIIIZ2 = ((PrivacySettingsFeature) c01gw.getValue()).LJJI() ? ((PrivacySettingsFeature) c01gw.getValue()).LJIIIZ("dm_setting_friends") : -2;
        int iLJIIIZ3 = ((PrivacySettingsFeature) c01gw.getValue()).LJIIIZ("dm_setting_potential_connection");
        int i = LIZ().getInt("key_dm_setting_others", -2);
        if (i == -2 || i != iLJIIIZ) {
            LIZJ(iLJIIIZ2, iLJIIIZ3, iLJIIIZ);
            return true;
        }
        if (LIZ().getInt("key_dm_setting_potential_connection", -2) != iLJIIIZ3) {
            LIZJ(iLJIIIZ2, iLJIIIZ3, iLJIIIZ);
            return true;
        }
        if (iLJIIIZ2 == -2 || LIZ().getInt("key_dm_setting_friends", -2) == iLJIIIZ2) {
            return false;
        }
        LIZJ(iLJIIIZ2, iLJIIIZ3, iLJIIIZ);
        return true;
    }

    public static void LIZJ(int i, int i2, int i3) {
        LIZ().storeInt("key_dm_setting_friends", i);
        LIZ().storeInt("key_dm_setting_potential_connection", i2);
        LIZ().storeInt("key_dm_setting_others", i3);
    }
}
