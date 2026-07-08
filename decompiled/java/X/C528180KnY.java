package X;

import com.ss.android.ugc.aweme.experiment.Text2ImageConfig;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.tools.integration.plugin.integration.api.CreativeToolsPluginService;
import kotlin.jvm.internal.AFwS194S0000000_8;

/* JADX INFO: renamed from: X.0KnY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C528180KnY {
    public static final C528180KnY LIZ = new C528180KnY();
    public static final Text2ImageConfig LIZIZ = new Text2ImageConfig(false, false, false);
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS194S0000000_8.get$arr$(91));

    public static final Text2ImageConfig LIZIZ() {
        return (Text2ImageConfig) LIZJ.getValue();
    }

    public static final boolean LIZJ() {
        LIZ.getClass();
        return (LIZ() || !LIZIZ().enable || ((Number) C04RA.LIZ.getValue()).intValue() == 0) ? false : true;
    }

    public static boolean LIZ() {
        return C10EU.LJIILIIL() || !C2276971EAl.LIZ();
    }

    public static boolean LIZLLL() {
        return !LIZ() && LIZIZ().enable && LIZIZ().showNewEntrance;
    }

    public static boolean LJ() {
        return (LIZ() || !LIZIZ().enable || LIZIZ().showNewEntrance) ? false : true;
    }

    public static boolean LJFF() {
        CreativeToolsPluginService creativeToolsPluginService;
        if (!LIZ() && (creativeToolsPluginService = (CreativeToolsPluginService) PluggableExtentionKt.pluggableSpi$default(CreativeToolsPluginService.class, false, false, false, 14, null)) != null) {
            C844470XAv.LIZ.getClass();
            if (creativeToolsPluginService.LJI(C844470XAv.LIZ())) {
                return LIZIZ().enable;
            }
        }
        return false;
    }
}
