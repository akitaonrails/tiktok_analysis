package X;

import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.tools.integration.plugin.integration.api.CreativeToolsPluginService;

/* JADX INFO: renamed from: X.0LpV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C554870LpV {
    public static final C554870LpV LIZ = new C554870LpV();

    public static boolean LIZ() {
        boolean z = false;
        CreativeToolsPluginService creativeToolsPluginService = (CreativeToolsPluginService) PluggableExtentionKt.pluggableSpi$default(CreativeToolsPluginService.class, false, false, false, 14, null);
        if (creativeToolsPluginService != null && creativeToolsPluginService.LJI(null)) {
            z = true;
        }
        C554740LpI c554740LpI = C554740LpI.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CreativeToolContainerScene isVEPluginReady: ");
        sbLIZ.append(z);
        C201955140j.LIZJ(c554740LpI, C2188811AlT.LIZIZ(sbLIZ));
        return z;
    }
}
