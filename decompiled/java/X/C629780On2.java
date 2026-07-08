package X;

import com.bytedance.keva.Keva;
import com.ss.android.deviceregister.DeviceRegisterManager;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.Arrays;

/* JADX INFO: renamed from: X.0On2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C629780On2 {
    public final Keva LIZ = Keva.getRepo("music_collect_repo");

    public final boolean LIZIZ() {
        if (!this.LIZ.getBoolean(LIZ("need_show_collect_guide_%s"), true)) {
            return false;
        }
        boolean zLIZJ = C1238740iLA.LIZJ("music_sp").LIZJ("is_need_show_collect_guide", true);
        if (zLIZJ) {
            return zLIZJ && !C0C64.LJIILLIIL().LJIIIZ(31744, "creative_tools_offline_music_collect", true, false);
        }
        this.LIZ.storeBoolean(LIZ("need_show_collect_guide_%s"), zLIZJ);
        C1238740iLA.LIZJ("music_sp").LIZLLL().remove("is_need_show_collect_guide").apply();
        return false;
    }

    public static String LIZ(String str) {
        String strCom_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId = DeviceRegisterManager.com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId();
        if (strCom_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId == null || strCom_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId.length() == 0) {
            strCom_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId = CardStruct.IStatusCode.DEFAULT;
        }
        return C786410Ut5.j4(str, Arrays.copyOf(new Object[]{strCom_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId}, 1));
    }
}
