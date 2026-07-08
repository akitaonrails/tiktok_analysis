package X;

import com.bytedance.ies.ugc.aweme.plugin.service.IPluginService;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import jv6.a;

/* JADX INFO: renamed from: X.08Oo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2110408Oo {
    public static volatile boolean LIZIZ;
    public static volatile boolean LIZJ;
    public static volatile boolean LIZLLL;
    public static final C2110408Oo LIZ = new C2110408Oo();
    public static final C01GW LJ = C452501pT.LIZIZ(new C13080059y());
    public static final C01GW LJFF = C452501pT.LIZIZ(new C07H9());

    public static boolean LIZIZ() {
        if (LIZJ) {
            return true;
        }
        try {
            IPluginService iPluginServiceLIZ = LIZ();
            LIZJ = iPluginServiceLIZ != null && iPluginServiceLIZ.checkPluginInstalled("com.ss.android.ugc.aweme.cast") && LIZJ();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        return LIZJ;
    }

    public static boolean LIZJ() {
        if (LIZIZ) {
            return true;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("tryLoadPlugin pluginService: ");
        sbLIZ.append(LIZ());
        sbLIZ.append(" aabService: ");
        IPluginService iPluginServiceLIZ = LIZ();
        sbLIZ.append(iPluginServiceLIZ != null ? iPluginServiceLIZ.LIZLLL() : null);
        C2188811AlT.LIZIZ(sbLIZ);
        IPluginService iPluginServiceLIZ2 = LIZ();
        if (iPluginServiceLIZ2 != null && iPluginServiceLIZ2.LIZLLL() != null) {
            C844470XAv.LIZ.getClass();
            LIZIZ = a.install(C844470XAv.LIZ());
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("tryLoadPlugin isPluginLoaded: ");
            sbLIZ2.append(LIZIZ);
            C2188811AlT.LIZIZ(sbLIZ2);
        }
        return LIZIZ;
    }

    public static IPluginService LIZ() {
        return (IPluginService) ServiceManager.get().getService(IPluginService.class);
    }
}
