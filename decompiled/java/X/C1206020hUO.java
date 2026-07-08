package X;

import android.content.res.Resources;
import android.os.SystemClock;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.application.IApplicationDependencyService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS591S0100000_12;

/* JADX INFO: renamed from: X.0hUO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1206020hUO {
    public static final C1722300uv6 LIZ(Function0 function0, boolean z) {
        IECommerceHostService iECommerceHostService;
        IECommerceHostService iECommerceHostService2;
        String string;
        boolean z2;
        String string2;
        boolean z3;
        String name;
        C1722300uv6 c1722300uv6 = new C1722300uv6();
        c1722300uv6.LJIIIZ = new AwS591S0100000_12(function0, (Function0<Unit>) 763);
        String name2 = null;
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            iECommerceHostService = (IECommerceHostService) ServiceManager.get().getService(IApplicationDependencyService.class);
            if (iECommerceHostService != null) {
                z3 = true;
            } else {
                z3 = false;
            }
            String name3 = IApplicationDependencyService.class.getName();
            if (iECommerceHostService != null) {
                name = iECommerceHostService.getClass().getName();
            } else {
                name = null;
            }
            C1AQS.LIZJ(jElapsedRealtime, 1, name3, name, z3);
        } else {
            C1120604Zw.LIZ.LIZ();
            iECommerceHostService = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IApplicationDependencyService.class);
        }
        Resources resources = ((IApplicationDependencyService) iECommerceHostService).getResources();
        if (resources != null && (string2 = resources.getString(2131832573)) != null) {
            c1722300uv6.LJI = string2;
        }
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime2 = SystemClock.elapsedRealtime();
            iECommerceHostService2 = (IECommerceHostService) ServiceManager.get().getService(IApplicationDependencyService.class);
            if (iECommerceHostService2 != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            String name4 = IApplicationDependencyService.class.getName();
            if (iECommerceHostService2 != null) {
                name2 = iECommerceHostService2.getClass().getName();
            }
            C1AQS.LIZJ(jElapsedRealtime2, 1, name4, name2, z2);
        } else {
            C1120604Zw.LIZ.LIZ();
            iECommerceHostService2 = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IApplicationDependencyService.class);
        }
        Resources resources2 = ((IApplicationDependencyService) iECommerceHostService2).getResources();
        if (resources2 != null && (string = resources2.getString(2131832572)) != null) {
            c1722300uv6.LJIIIIZZ = string;
        }
        if (z) {
            C419910GdJ c419910GdJ = new C419910GdJ();
            c419910GdJ.LIZ = R.raw.icon_large_wifi_slash;
            c419910GdJ.LJ = Integer.valueOf(R.attr.a1p);
            c1722300uv6.LIZ(c419910GdJ);
        }
        return c1722300uv6;
    }

    public static final C1722300uv6 LIZLLL(Function0 function0, boolean z) {
        IECommerceHostService iECommerceHostService;
        IECommerceHostService iECommerceHostService2;
        String string;
        boolean z2;
        String string2;
        boolean z3;
        String name;
        C1722300uv6 c1722300uv6 = new C1722300uv6();
        c1722300uv6.LJIIIZ = new AwS591S0100000_12(function0, (Function0<Unit>) 764);
        String name2 = null;
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            iECommerceHostService = (IECommerceHostService) ServiceManager.get().getService(IApplicationDependencyService.class);
            if (iECommerceHostService != null) {
                z3 = true;
            } else {
                z3 = false;
            }
            String name3 = IApplicationDependencyService.class.getName();
            if (iECommerceHostService != null) {
                name = iECommerceHostService.getClass().getName();
            } else {
                name = null;
            }
            C1AQS.LIZJ(jElapsedRealtime, 1, name3, name, z3);
        } else {
            C1120604Zw.LIZ.LIZ();
            iECommerceHostService = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IApplicationDependencyService.class);
        }
        Resources resources = ((IApplicationDependencyService) iECommerceHostService).getResources();
        if (resources != null && (string2 = resources.getString(2131832569)) != null) {
            c1722300uv6.LJI = string2;
        }
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime2 = SystemClock.elapsedRealtime();
            iECommerceHostService2 = (IECommerceHostService) ServiceManager.get().getService(IApplicationDependencyService.class);
            if (iECommerceHostService2 != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            String name4 = IApplicationDependencyService.class.getName();
            if (iECommerceHostService2 != null) {
                name2 = iECommerceHostService2.getClass().getName();
            }
            C1AQS.LIZJ(jElapsedRealtime2, 1, name4, name2, z2);
        } else {
            C1120604Zw.LIZ.LIZ();
            iECommerceHostService2 = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IApplicationDependencyService.class);
        }
        Resources resources2 = ((IApplicationDependencyService) iECommerceHostService2).getResources();
        if (resources2 != null && (string = resources2.getString(2131832568)) != null) {
            c1722300uv6.LJIIIIZZ = string;
        }
        if (z) {
            C419910GdJ c419910GdJ = new C419910GdJ();
            c419910GdJ.LIZ = R.raw.icon_large_error_robot;
            c419910GdJ.LJ = Integer.valueOf(R.attr.a1p);
            c1722300uv6.LIZ(c419910GdJ);
        }
        return c1722300uv6;
    }

    public static final void LIZIZ(C1749280vcc c1749280vcc, int i, Function0<Unit> function0) {
        if (i != -1) {
            if (i != 0) {
                if (i != 2) {
                    if (i == 3 && c1749280vcc != null) {
                        C1722300uv6 c1722300uv6 = new C1722300uv6();
                        C1893080zMY.LJFF(c1722300uv6, function0);
                        c1749280vcc.setStatus(c1722300uv6);
                        C786410Ut5.LLLZLZ(c1749280vcc, 0);
                        return;
                    }
                    return;
                }
                if (c1749280vcc == null) {
                    return;
                }
                C1722300uv6 c1722300uv62 = new C1722300uv6();
                C1893080zMY.LIZ(c1722300uv62, function0);
                c1749280vcc.setStatus(c1722300uv62);
                C786410Ut5.LLLZLZ(c1749280vcc, 0);
                return;
            }
            if (c1749280vcc == null) {
                return;
            }
            c1749280vcc.LJ();
            C786410Ut5.LLLZLZ(c1749280vcc, 0);
            return;
        }
        if (c1749280vcc == null) {
            return;
        }
        C786410Ut5.LLLZLZ(c1749280vcc, 8);
    }

    public static final void LIZJ(C1749280vcc c1749280vcc, int i, C1722300uv6 c1722300uv6, Function0<Unit> function0) {
        if (i == 1) {
            if (c1722300uv6 != null) {
                if (c1749280vcc != null) {
                    c1749280vcc.setStatus(c1722300uv6);
                } else {
                    return;
                }
            } else {
                if (c1749280vcc == null) {
                    return;
                }
                C1722300uv6 c1722300uv62 = new C1722300uv6();
                C1893080zMY.LJ(c1722300uv62);
                c1749280vcc.setStatus(c1722300uv62);
            }
            C786410Ut5.LLLZLZ(c1749280vcc, 0);
            return;
        }
        LIZIZ(c1749280vcc, i, function0);
    }
}
