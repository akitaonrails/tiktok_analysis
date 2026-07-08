package X;

import android.os.SystemClock;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Region;
import com.ss.android.ugc.aweme.ecommerce.core.ab.AEPOptimizeConfig;
import com.ss.android.ugc.aweme.ecommerce.dependency.location.LocationDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.location.ILocationDependencyService;
import java.util.Locale;
import kotlin.jvm.internal.AFwS215S0000000_26;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0vYD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1746550vYD {
    public static final C1746550vYD LIZ = new C1746550vYD();
    public static final boolean LIZIZ;
    public static final boolean LIZJ;
    public static final C01GW LIZLLL;

    public static Region LIZIZ() {
        AnonymousClass0317 anonymousClass0317CreateILocationDependencyServicebyMonsterPlugin;
        try {
            if (C034S.LIZ()) {
                C1120604Zw.LIZ.LIZ();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                anonymousClass0317CreateILocationDependencyServicebyMonsterPlugin = LocationDependencyService.createILocationDependencyServicebyMonsterPlugin(false);
                C1AQS.LIZJ(jElapsedRealtime, 1, ILocationDependencyService.class.getName(), anonymousClass0317CreateILocationDependencyServicebyMonsterPlugin != null ? anonymousClass0317CreateILocationDependencyServicebyMonsterPlugin.getClass().getName() : null, anonymousClass0317CreateILocationDependencyServicebyMonsterPlugin != null);
            } else {
                C1120604Zw.LIZ.LIZ();
                anonymousClass0317CreateILocationDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(ILocationDependencyService.class);
            }
            ILocationDependencyService iLocationDependencyService = (ILocationDependencyService) anonymousClass0317CreateILocationDependencyServicebyMonsterPlugin;
            String priorityRegion = iLocationDependencyService.getPriorityRegion();
            if (a0.LJJJIL(priorityRegion)) {
                priorityRegion = iLocationDependencyService.getCurrentRegionCode();
            }
            return new Region(null, null, priorityRegion, null, null, null, null);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    static {
        C01GW c01gw = C1747560vZq.LIZIZ;
        LIZIZ = ((AEPOptimizeConfig) c01gw.getValue()).enablePreload;
        LIZJ = ((AEPOptimizeConfig) c01gw.getValue()).enableCache;
        LIZLLL = C452501pT.LIZIZ(AFwS215S0000000_26.get$arr$(521));
    }

    public static String LIZ(String str) {
        int iLJIIJJI = AnonymousClass0408.LJIIJJI(AnonymousClass0408.LIZ, C955103oL.LIZ(null), "shipping_address", null, null, 12);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("aep_preload_");
        sbLIZ.append(str.toUpperCase(Locale.ROOT));
        sbLIZ.append('_');
        sbLIZ.append(iLJIIJJI);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static void LIZJ(Integer num, String str, InterfaceC497601wk interfaceC497601wk) {
        Region regionLIZIZ;
        String str2;
        C1747600vZu c1747600vZuLIZIZ;
        if (LIZJ && LIZIZ && (regionLIZIZ = LIZIZ()) != null && (str2 = regionLIZIZ.code) != null) {
            String strLIZ = LIZ(str2);
            if (C1746530vYB.LIZ && (c1747600vZuLIZIZ = C1746530vYB.LIZIZ.LIZIZ(strLIZ)) != null && C756302xN.LIZ(c1747600vZuLIZIZ.LIZ.inputItems)) {
                return;
            }
            C23250099c.LIZLLL(interfaceC497601wk, null, null, new C1746560vYE(regionLIZIZ, num, str, strLIZ, null), 3);
        }
    }
}
