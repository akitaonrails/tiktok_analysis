package X;

import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.tools.integration.plugin.integration.api.CreativeToolsPluginService;
import kotlin.jvm.internal.AFwS190S0000000_4;

/* JADX INFO: renamed from: X.0CsK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C327300CsK {
    public static final C327300CsK LIZ = new C327300CsK();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(705));

    public static boolean LIZ() {
        boolean z = false;
        if (!((Boolean) LIZIZ.getValue()).booleanValue()) {
            return false;
        }
        CreativeToolsPluginService creativeToolsPluginService = (CreativeToolsPluginService) PluggableExtentionKt.pluggableSpi$default(CreativeToolsPluginService.class, false, false, false, 14, null);
        if (creativeToolsPluginService != null) {
            C0I0B.LJFF.LIZJ();
            if (creativeToolsPluginService.LJI(C894660Z7w.LIZ())) {
                z = true;
            }
        }
        return !z;
    }
}
