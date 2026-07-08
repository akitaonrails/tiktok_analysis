package X;

import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.deviceregister.DeviceRegisterManager;
import com.ss.android.ugc.aweme.poi.anchor.sensor.UserGlobalControl;
import com.ss.android.ugc.aweme.poi.experiment.EncouragingPostingViaUserVisitStatusSettings;
import kotlin.jvm.internal.AFwS225S0000000_34;

/* JADX INFO: renamed from: X.1Ctj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2244891Ctj {
    public static final int LIZ = EncouragingPostingViaUserVisitStatusSettings.LIZ().encouragePostedPoiCacheMaximum;
    public static final int LIZIZ = EncouragingPostingViaUserVisitStatusSettings.LIZ().encourageShowPoiCacheMaximum;
    public static final int LIZJ = EncouragingPostingViaUserVisitStatusSettings.LIZ().noClickImpressionThreshold;
    public static final int LIZLLL = EncouragingPostingViaUserVisitStatusSettings.LIZ().noShowDurationDays;
    public static final int LJ = EncouragingPostingViaUserVisitStatusSettings.LIZ().showIntervalWithSamePoiAndDid;
    public static final int LJFF = EncouragingPostingViaUserVisitStatusSettings.LIZ().showMaximumInOneDay;
    public static final C01GW LJI = C452501pT.LIZIZ(AFwS225S0000000_34.get$arr$(92));
    public static final String LJII = DeviceRegisterManager.com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId();

    public static Keva LIZ() {
        return (Keva) LJI.getValue();
    }

    public static UserGlobalControl LIZIZ() {
        Keva kevaLIZ = LIZ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("encouraging_posting_user_guide_control_");
        sbLIZ.append(LJII);
        String string = kevaLIZ.getString(C2188811AlT.LIZIZ(sbLIZ), "");
        if (string != null) {
            try {
                C1227904rF.LIZ.getClass();
                UserGlobalControl userGlobalControl = (UserGlobalControl) C1227904rF.LIZLLL().LJII(string, UserGlobalControl.class);
                if (userGlobalControl != null) {
                    return userGlobalControl;
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("something was wrong when getUserGlobalControl, e=");
                sbLIZ2.append(e.getMessage());
                C2188811AlT.LIZIZ(sbLIZ2);
            }
        }
        return new UserGlobalControl(0, 0L, 0L, 0, 0L);
    }

    public static void LIZJ(int i, long j) {
        UserGlobalControl userGlobalControlLIZ = UserGlobalControl.LIZ(LIZIZ(), null, null, null, Integer.valueOf(i), Long.valueOf(j), 7);
        Keva kevaLIZ = LIZ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("encouraging_posting_user_guide_control_");
        sbLIZ.append(LJII);
        kevaLIZ.storeString(C2188811AlT.LIZIZ(sbLIZ), userGlobalControlLIZ.LIZIZ());
    }
}
