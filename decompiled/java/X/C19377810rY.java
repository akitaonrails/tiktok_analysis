package X;

import com.bytedance.android.livesdk.livesetting.broadcast.GameLiveAnchorBlackCheckConfigSetting;
import com.bytedance.android.livesdk.livesetting.other.LiveOptPlayerFluencyExp;
import com.bytedance.android.livesdk.livesetting.other.SlardarSampleSetting;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.10rY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19377810rY {
    public static int LIZIZ;
    public static int LIZLLL;
    public static int LJI;
    public static int LJIIIIZZ;
    public static final C19377810rY LIZ = new C19377810rY();
    public static final C19377510rV LIZJ = new C19377510rV(LJI(), LJII());
    public static final C19377510rV LJ = new C19377510rV(LJIIJJI(), LJIIJ());
    public static final C19377410rU LJFF = new C19377410rU(LJIIJJI(), LJIIIZ());
    public static final C19377410rU LJII = new C19377410rU(LIZLLL(), LJ());

    public final synchronized void LJIILJJIL() {
        Map<String, Object> map = C1338270kvh.LIZ;
        LJIILIIL();
        LJI = 0;
        LJIIIIZZ = 0;
        LIZLLL = 0;
        LJ.LIZJ();
        LJFF.LIZJ();
        LJII.LIZJ();
        LIZJ.LIZJ();
    }

    public static int LIZLLL() {
        GameLiveAnchorBlackCheckConfigSetting gameLiveAnchorBlackCheckConfigSetting = GameLiveAnchorBlackCheckConfigSetting.INSTANCE;
        if (gameLiveAnchorBlackCheckConfigSetting.getValue().getEnable()) {
            return gameLiveAnchorBlackCheckConfigSetting.getValue().getCaptureBlackSampleCounts();
        }
        return 0;
    }

    public static long LJ() {
        GameLiveAnchorBlackCheckConfigSetting gameLiveAnchorBlackCheckConfigSetting = GameLiveAnchorBlackCheckConfigSetting.INSTANCE;
        if (gameLiveAnchorBlackCheckConfigSetting.getValue().getEnable()) {
            return gameLiveAnchorBlackCheckConfigSetting.getValue().getCaptureBlackThreshold();
        }
        return 0L;
    }

    public static float LJFF() {
        GameLiveAnchorBlackCheckConfigSetting gameLiveAnchorBlackCheckConfigSetting = GameLiveAnchorBlackCheckConfigSetting.INSTANCE;
        if (gameLiveAnchorBlackCheckConfigSetting.getValue().getEnable()) {
            return gameLiveAnchorBlackCheckConfigSetting.getValue().getCaptureBlackUnexpectedRate();
        }
        return 0.0f;
    }

    public static int LJI() {
        GameLiveAnchorBlackCheckConfigSetting gameLiveAnchorBlackCheckConfigSetting = GameLiveAnchorBlackCheckConfigSetting.INSTANCE;
        if (gameLiveAnchorBlackCheckConfigSetting.getValue().getEnable()) {
            return gameLiveAnchorBlackCheckConfigSetting.getValue().getDeviceLagFpsSampleCounts();
        }
        return 0;
    }

    public static int LJII() {
        GameLiveAnchorBlackCheckConfigSetting gameLiveAnchorBlackCheckConfigSetting = GameLiveAnchorBlackCheckConfigSetting.INSTANCE;
        if (gameLiveAnchorBlackCheckConfigSetting.getValue().getEnable()) {
            return gameLiveAnchorBlackCheckConfigSetting.getValue().getDeviceLagFpsThreshold();
        }
        return 0;
    }

    public static float LJIIIIZZ() {
        GameLiveAnchorBlackCheckConfigSetting gameLiveAnchorBlackCheckConfigSetting = GameLiveAnchorBlackCheckConfigSetting.INSTANCE;
        if (gameLiveAnchorBlackCheckConfigSetting.getValue().getEnable()) {
            return gameLiveAnchorBlackCheckConfigSetting.getValue().getDeviceLagFpsUnexpectedRate();
        }
        return 0.0f;
    }

    public static long LJIIIZ() {
        GameLiveAnchorBlackCheckConfigSetting gameLiveAnchorBlackCheckConfigSetting = GameLiveAnchorBlackCheckConfigSetting.INSTANCE;
        if (gameLiveAnchorBlackCheckConfigSetting.getValue().getEnable()) {
            return gameLiveAnchorBlackCheckConfigSetting.getValue().getPermissionBitrateThreshold();
        }
        return 0L;
    }

    public static int LJIIJ() {
        GameLiveAnchorBlackCheckConfigSetting gameLiveAnchorBlackCheckConfigSetting = GameLiveAnchorBlackCheckConfigSetting.INSTANCE;
        if (gameLiveAnchorBlackCheckConfigSetting.getValue().getEnable()) {
            return gameLiveAnchorBlackCheckConfigSetting.getValue().getPermissionFpsThreshold();
        }
        return 0;
    }

    public static int LJIIJJI() {
        GameLiveAnchorBlackCheckConfigSetting gameLiveAnchorBlackCheckConfigSetting = GameLiveAnchorBlackCheckConfigSetting.INSTANCE;
        if (gameLiveAnchorBlackCheckConfigSetting.getValue().getEnable()) {
            return gameLiveAnchorBlackCheckConfigSetting.getValue().getPermissionSampleCounts();
        }
        return 0;
    }

    public static float LJIIL() {
        GameLiveAnchorBlackCheckConfigSetting gameLiveAnchorBlackCheckConfigSetting = GameLiveAnchorBlackCheckConfigSetting.INSTANCE;
        if (gameLiveAnchorBlackCheckConfigSetting.getValue().getEnable()) {
            return gameLiveAnchorBlackCheckConfigSetting.getValue().getPermissionUnexpectedRate();
        }
        return 0.0f;
    }

    public static void LJIILIIL() {
        if (!LiveOptPlayerFluencyExp.enableOpt() && SlardarSampleSetting.INSTANCE.isSampleReportSlardar("livesdk_gamelive_anchor_black_monitor", 0.0d)) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("black_check_permission_miss_count", LJI);
                jSONObject.put("black_check_capture_black_count", LJIIIIZZ);
                jSONObject.put("black_check_device_lag_count", LIZLLL);
                jSONObject.put("black_check_screen_lock_count", LIZIZ);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C20441214yg.LJ("GameLiveBroadcastBlackCheckManager", String.valueOf(e.getMessage()));
            }
            C1CC2.LIZJ("livesdk_gamelive_anchor_black_monitor", jSONObject, new JSONObject(), new JSONObject());
        }
    }

    public static void LIZ(long j) {
        if (LIZLLL() > 0 && LJFF() > 0.0f && LJ() > 0) {
            C19377410rU c19377410rU = LJII;
            if (c19377410rU.LIZ()) {
                if (c19377410rU.LJFF / c19377410rU.LIZJ >= LJFF()) {
                    LJIIIIZZ++;
                }
                Map<String, Object> map = C1338270kvh.LIZ;
            }
            c19377410rU.LIZIZ(j);
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("checkCaptureBlack params not valid. captureBlackSampleCounts=");
        sbLIZ.append(LIZLLL());
        sbLIZ.append(", captureBlackUnexpectedRate=");
        sbLIZ.append(LJFF());
        sbLIZ.append(", captureBlackThreshold=");
        sbLIZ.append(LJ());
        C20441214yg.LJ("GameLiveBroadcastBlackCheckManager", C2188811AlT.LIZIZ(sbLIZ));
    }

    public static void LIZIZ(int i) {
        if (LJI() > 0 && LJIIIIZZ() > 0.0f && LJII() > 0) {
            C19377510rV c19377510rV = LIZJ;
            if (c19377510rV.LIZ()) {
                if (c19377510rV.LJFF / c19377510rV.LIZJ >= LJIIIIZZ()) {
                    LIZLLL++;
                }
                Map<String, Object> map = C1338270kvh.LIZ;
            }
            c19377510rV.LIZIZ(i);
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("checkDeviceLag params not valid. deviceLagFpsSampleCounts=");
        sbLIZ.append(LJI());
        sbLIZ.append(", deviceLagFpsUnexpectedRate=");
        sbLIZ.append(LJIIIIZZ());
        sbLIZ.append(", deviceLagFpsThreshold=");
        sbLIZ.append(LJII());
        C20441214yg.LJ("GameLiveBroadcastBlackCheckManager", C2188811AlT.LIZIZ(sbLIZ));
    }

    public static void LIZJ(int i, long j) {
        if (LJIIJJI() > 0 && LJIIL() > 0.0f && LJIIJ() > 0 && LJIIIZ() > 0) {
            C19377510rV c19377510rV = LJ;
            if (c19377510rV.LIZ()) {
                if (LJFF.LIZ()) {
                    if (c19377510rV.LJFF / c19377510rV.LIZJ >= LJIIL() && r3.LJFF / r3.LIZJ >= LJIIL()) {
                        LJI++;
                    }
                    Map<String, Object> map = C1338270kvh.LIZ;
                }
            }
            c19377510rV.LIZIZ(i);
            LJFF.LIZIZ(j);
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("checkScreenPermission params not valid. permissionSampleCounts=");
        sbLIZ.append(LJIIJJI());
        sbLIZ.append(", permissionUnexpectedRate=");
        sbLIZ.append(LJIIL());
        sbLIZ.append(", permissionThreshold=");
        sbLIZ.append(LJIIJ());
        sbLIZ.append(",permissionBitrateThreshold=");
        sbLIZ.append(LJIIIZ());
        C20441214yg.LJ("GameLiveBroadcastBlackCheckManager", C2188811AlT.LIZIZ(sbLIZ));
    }
}
