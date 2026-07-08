package X;

import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.compliance.protection.amberalert.AmberAlertStorage;

/* JADX INFO: renamed from: X.15av, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20548715av {
    public static final Keva LIZ = Keva.getRepo("amber_alert_storage");
    public static volatile int LIZIZ = 86400000;
    public static volatile C20548815aw LIZJ = new C20548815aw(false, null);

    public static AmberAlertStorage LIZ(String str) {
        try {
            return (AmberAlertStorage) C08JS.LIZIZ().LJII(LIZ.getString(str, ""), AmberAlertStorage.class);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return null;
        }
    }

    public static void LIZIZ(Long l, String str) {
        AmberAlertStorage amberAlertStorageLIZ;
        AmberAlertStorage amberAlertStorageCopy;
        if (str == null || (amberAlertStorageLIZ = LIZ(str)) == null) {
            return;
        }
        long j = amberAlertStorageLIZ.lastUpdateTime;
        if (l != null && l.longValue() == j) {
            amberAlertStorageCopy = amberAlertStorageLIZ.copy(amberAlertStorageLIZ.alertId, amberAlertStorageLIZ.lastUpdateTime, System.currentTimeMillis(), amberAlertStorageLIZ.totalShownTimes + 1);
        } else {
            amberAlertStorageCopy = amberAlertStorageLIZ.copy(amberAlertStorageLIZ.alertId, amberAlertStorageLIZ.lastUpdateTime, System.currentTimeMillis(), amberAlertStorageLIZ.totalShownTimes);
        }
        LIZ.storeString(str, C08JS.LIZLLL(amberAlertStorageCopy));
    }
}
