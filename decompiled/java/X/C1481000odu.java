package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.player.ab.PlayerTypeAbConfig;
import com.ss.android.ugc.aweme.simkit.model.bitrateselect.RateSettingsResponse;
import com.ss.android.ugc.aweme.simkit.model.hwdec.PlayerTypeAbConfigV2;
import com.ss.android.ugc.aweme.video.VideoBitRateABManager;

/* JADX INFO: renamed from: X.0odu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1481000odu {
    public static final boolean LIZ;
    public static boolean LIZIZ;

    public static PlayerTypeAbConfig LIZ() {
        PlayerTypeAbConfigV2 decodeType;
        try {
            PlayerTypeAbConfig playerTypeAbConfig = (PlayerTypeAbConfig) C0C64.LJIILLIIL().LJJII(PlayerTypeAbConfig.class, null, "player_type_v2", false);
            RateSettingsResponse rateSettingsResponse = VideoBitRateABManager.LJFF.LIZ;
            if (rateSettingsResponse == null || (decodeType = rateSettingsResponse.getDecodeType()) == null) {
                return playerTypeAbConfig;
            }
            PlayerTypeAbConfig playerTypeAbConfig2 = new PlayerTypeAbConfig();
            int i = decodeType.playerType;
            if (i != -1) {
                playerTypeAbConfig2.playerType = i;
            } else {
                playerTypeAbConfig2.playerType = playerTypeAbConfig != null ? playerTypeAbConfig.playerType : 0;
            }
            int i2 = decodeType.bytevc1DecodeType;
            if (i2 != -1) {
                playerTypeAbConfig2.bytevc1DecodeType = i2;
            } else {
                playerTypeAbConfig2.bytevc1DecodeType = playerTypeAbConfig != null ? playerTypeAbConfig.bytevc1DecodeType : 0;
            }
            int i3 = decodeType.h264DecodeType;
            if (i3 != -1) {
                playerTypeAbConfig2.h264DecodeType = i3;
                return playerTypeAbConfig2;
            }
            playerTypeAbConfig2.h264DecodeType = playerTypeAbConfig != null ? playerTypeAbConfig.h264DecodeType : 0;
            return playerTypeAbConfig2;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return null;
        }
    }

    static {
        boolean z = C2523609uk.LIZ;
        LIZ = C2523609uk.LIZ;
        LIZIZ = false;
    }

    public static EnumC1479760obu LIZIZ() {
        return LIZ() != null ? EnumC1479760obu.TT : C0C64.LJIILLIIL().LJIJ(31744, 0, "player_type", true) == 6 ? EnumC1479760obu.TT_HARDWARE : EnumC1479760obu.TT;
    }
}
