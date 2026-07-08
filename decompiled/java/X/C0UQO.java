package X;

import com.bytedance.android.livesdk.utils.LiveAppBundleUtils;

/* JADX INFO: renamed from: X.0UQO, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0UQO {
    public static boolean LIZ() {
        C0TFE.LIZ.getClass();
        boolean zIsPluginAvailable = LiveAppBundleUtils.isPluginAvailable(EnumC785640Urq.CAST, "other");
        if (!zIsPluginAvailable) {
            LiveAppBundleUtils.ensurePluginAvailable(EnumC785640Urq.CAST, new C0UVS() { // from class: X.0UQQ
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
}
