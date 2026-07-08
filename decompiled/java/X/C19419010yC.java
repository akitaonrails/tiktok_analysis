package X;

import android.content.Context;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.tools.integration.plugin.integration.api.CreativeToolsPluginService;

/* JADX INFO: renamed from: X.10yC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19419010yC {
    public static final C19419010yC LIZ = new C19419010yC();

    public static final boolean LIZ(Context context, String str, boolean z) {
        if (!z) {
            CreativeToolsPluginService creativeToolsPluginService = (CreativeToolsPluginService) PluggableExtentionKt.pluggableSpi$default(CreativeToolsPluginService.class, false, false, false, 14, null);
            if (creativeToolsPluginService == null || !creativeToolsPluginService.LJI(context)) {
                return false;
            }
            return true;
        }
        CreativeToolsPluginService creativeToolsPluginService2 = (CreativeToolsPluginService) PluggableExtentionKt.pluggableSpi$default(CreativeToolsPluginService.class, false, false, false, 14, null);
        if (creativeToolsPluginService2 == null || !creativeToolsPluginService2.LIZJ(context, str, true)) {
            return false;
        }
        return true;
    }
}
