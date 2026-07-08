package X;

import com.bytedance.ies.ugc.aweme.plugin.service.IPluginService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.143O, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C143O {
    public static final void LIZ(Boolean bool, String str, String str2) {
        boolean z;
        int i = 0;
        IPluginService iPluginService = (IPluginService) PluggableExtentionKt.pluggableSpi$default(IPluginService.class, false, false, false, 14, null);
        if (iPluginService != null && iPluginService.checkPluginInstalled("com.bytedance.tiktok.ship")) {
            z = true;
        } else {
            z = false;
        }
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("plugin_name", "df_ship");
        c0lab.LJ("enterFrom", str);
        c0lab.LJ("shootWay", str2);
        c0lab.LIZ(Intrinsics.LJFF(bool, Boolean.TRUE) ? 1 : 0, "isFromDraft");
        if (z) {
            i = 1;
        }
        c0lab.LIZ(i, "plugin_installed");
        C20684815ws.LJIILLIIL("df_block_rate_camera", c0lab.LIZ);
    }
}
