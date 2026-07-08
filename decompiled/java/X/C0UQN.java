package X;

import com.bytedance.android.livesdk.livesetting.broadcast.GameCastLiveStudioSetting;
import com.bytedance.android.livesdk.utils.LiveAppBundleUtils;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.user.DetailLivePermission;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;

/* JADX INFO: renamed from: X.0UQN, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0UQN {
    public static boolean LIZ() {
        if (!GameCastLiveStudioSetting.INSTANCE.enable()) {
            return true;
        }
        DetailLivePermission detailLivePermission = (DetailLivePermission) DataChannelGlobal.LLILZ.gg0(C168F.class);
        return C500260Jjc.LJJJI(detailLivePermission != null ? Boolean.valueOf(detailLivePermission.enableLiveStudio) : null);
    }

    public static boolean LIZIZ() {
        boolean zIsPluginAvailable = LiveAppBundleUtils.isPluginAvailable(EnumC785640Urq.CAST, "other");
        if (!zIsPluginAvailable) {
            LiveAppBundleUtils.ensurePluginAvailable(EnumC785640Urq.CAST, new C0UVS() { // from class: X.0UQP
                @Override // X.C0UVS
                public final void LIZ(int i, String str, boolean z) {
                }

                @Override // X.C0UVS
                public final void onFailed() {
                    C474500IjA c474500IjALIZ = C0IJT.LIZ("ttlive_casting_aab_plugin_install");
                    c474500IjALIZ.LJJII("fail", "result");
                    c474500IjALIZ.LIZ();
                }

                @Override // X.C0UVS
                public final void onSuccess() {
                    C474500IjA c474500IjALIZ = C0IJT.LIZ("ttlive_casting_aab_plugin_install");
                    c474500IjALIZ.LJJII("success", "result");
                    c474500IjALIZ.LIZ();
                }
            }, true);
            C766270U4b.LIZLLL(2131843792);
            return zIsPluginAvailable;
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_screencasting_livestudio_btn_click_plugin_result");
        c474500IjALIZ.LJJII("PluginInstalled", "result_type");
        c474500IjALIZ.LIZ();
        return zIsPluginAvailable;
    }

    public static void LIZJ(DataChannel dataChannel, String str, boolean z, boolean z2) {
        String str2;
        if (!z) {
            str2 = "screencasting_entrance_show";
        } else {
            str2 = "screencasting_entrance_click";
        }
        String str3 = LiveMode.LIVE_STUDIO.logStreamingType;
        C474500IjA c474500IjALIZ = C0IJT.LIZ(str2);
        c474500IjALIZ.LJIJJLI(dataChannel);
        c474500IjALIZ.LJJII(str3, "live_type");
        c474500IjALIZ.LJJII(str, "event_page");
        if (z) {
            c474500IjALIZ.LJJII(Integer.valueOf(z2 ? 1 : 0), "screencasting_status");
        }
        c474500IjALIZ.LIZ();
    }
}
