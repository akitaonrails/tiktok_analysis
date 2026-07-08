package X;

import Y.AfS52S1100000_23;
import android.net.Uri;
import android.os.SystemClock;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.ecommerce.lynx.spark.SinglePageMonitorObserver;
import com.ss.android.ugc.aweme.ecommerce.model.EcomRouteConfigModel;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.application.IApplicationDependencyService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.Map;
import java.util.UUID;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS389S0200000_23;

/* JADX INFO: renamed from: X.0pkP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1523470pkP {
    public static final C1523470pkP LIZ = new C1523470pkP();

    public static boolean LIZ(Uri uri, String str, Map map) {
        String str2;
        EcomRouteConfigModel ecomRouteConfigModel = (EcomRouteConfigModel) map.get(str);
        if (ecomRouteConfigModel == null || !ecomRouteConfigModel.LIZ(uri) || (str2 = ecomRouteConfigModel.scene) == null) {
            return false;
        }
        C2232408os c2232408os = C1507830pLB.LIZ;
        C1507830pLB.LIZ(str2);
        return true;
    }

    public static Object LIZIZ(Uri uri, C1523480pkQ c1523480pkQ, Function1 function1) {
        IECommerceHostService iECommerceHostService;
        C928103jz top;
        LifecycleOwner lifecycleOwner;
        Lifecycle lifecycle;
        long jCurrentTimeMillis;
        Long lLJIILIIL;
        boolean z;
        C1523480pkQ c1523480pkQ2 = c1523480pkQ;
        if (c1523480pkQ2 == null) {
            c1523480pkQ2 = new C1523480pkQ(uri);
        }
        if (uri != null && C585850MyN.LIZ()) {
            AwS389S0200000_23 awS389S0200000_23 = new AwS389S0200000_23(uri, (Uri) function1, (Function1<? super C1523480pkQ, Object>) 6);
            Uri uri2 = c1523480pkQ2.LIZ;
            if (uri2 != null) {
                C1523590pkb c1523590pkb = C1523590pkb.LIZ;
                c1523590pkb.getClass();
                if (C1523590pkb.LIZJ(uri2)) {
                    String string = UUID.randomUUID().toString();
                    Uri uriBuild = uri2.buildUpon().appendQueryParameter("ec_lynx_open_id", string).build();
                    String name = null;
                    if (C034S.LIZ()) {
                        C1120604Zw.LIZ.LIZ();
                        long jElapsedRealtime = SystemClock.elapsedRealtime();
                        iECommerceHostService = (IECommerceHostService) ServiceManager.get().getService(IApplicationDependencyService.class);
                        if (iECommerceHostService != null) {
                            z = true;
                        } else {
                            z = false;
                        }
                        String name2 = IApplicationDependencyService.class.getName();
                        if (iECommerceHostService != null) {
                            name = iECommerceHostService.getClass().getName();
                        }
                        C1AQS.LIZJ(jElapsedRealtime, 1, name2, name, z);
                    } else {
                        C1120604Zw.LIZ.LIZ();
                        iECommerceHostService = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IApplicationDependencyService.class);
                    }
                    InterfaceC911603hK rootPageMonitor = ((IApplicationDependencyService) iECommerceHostService).getRootPageMonitor();
                    if (rootPageMonitor != null && (top = rootPageMonitor.getTop()) != null && (lifecycleOwner = top.LIZJ) != null && (lifecycle = lifecycleOwner.getLifecycle()) != null) {
                        String strLIZIZ = C1942307jB.LIZIZ(uriBuild, "start_click_time");
                        if (strLIZIZ != null && (lLJIILIIL = C2095008Iq.LJIILIIL(strLIZIZ)) != null) {
                            jCurrentTimeMillis = lLJIILIIL.longValue();
                        } else {
                            jCurrentTimeMillis = System.currentTimeMillis();
                        }
                        C1523590pkb.LIZLLL(uriBuild, string, "start_time", true, Long.valueOf(jCurrentTimeMillis), true);
                        C2232408os c2232408os = C1507830pLB.LIZ;
                        String str = C1507830pLB.LJIILL;
                        if (str != null) {
                            C1523590pkb.LJFF(string, C2097608Jq.LJIIIIZZ(new Pair("last_page_create_btm", str), new Pair("last_page_create_to_start", Long.valueOf(jCurrentTimeMillis - C1507830pLB.LJIILJJIL))));
                        }
                        lifecycle.addObserver(new SinglePageMonitorObserver(lifecycle, C1906580ziK.LIZJ().LJIIJJI(), new AfS52S1100000_23(uriBuild, string, 0)));
                        lifecycle.addObserver(new SinglePageMonitorObserver(lifecycle, C1906580ziK.LIZJ().LJIILIIL(), new AfS52S1100000_23(uriBuild, string, 1)));
                    }
                    c1523590pkb.getClass();
                    C1523590pkb.LIZLLL(uriBuild, string, "route_start", false, null, true);
                    c1523480pkQ2.LIZ = uriBuild;
                    Object objInvoke = awS389S0200000_23.invoke(c1523480pkQ2);
                    c1523590pkb.getClass();
                    C1523590pkb.LIZLLL(uriBuild, string, "route_end", false, null, false);
                    return objInvoke;
                }
            }
            return awS389S0200000_23.invoke(c1523480pkQ2);
        }
        return function1.invoke(c1523480pkQ2);
    }
}
