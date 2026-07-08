package X;

import android.os.Bundle;
import android.os.SystemClock;
import com.bytedance.mt.protector.impl.string2number.CastFloatProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.application.IApplicationDependencyService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;

/* JADX INFO: renamed from: X.0kYG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1323740kYG {
    public static final C1323740kYG LIZ = new C1323740kYG();
    public static float LIZIZ = -1.0f;
    public static float LIZJ = -1.0f;

    public static float LIZ() {
        IECommerceHostService iECommerceHostService;
        Float f;
        if (LIZIZ == -1.0f) {
            float fLIZIZ = LIZIZ();
            if (fLIZIZ == -1.0f) {
                C212350188e c212350188eLIZJ = C212350188e.LIZJ();
                Object obj = null;
                if (C034S.LIZ()) {
                    C1120604Zw.LIZ.LIZ();
                    long jElapsedRealtime = SystemClock.elapsedRealtime();
                    iECommerceHostService = (IECommerceHostService) ServiceManager.get().getService(IApplicationDependencyService.class);
                    C1AQS.LIZJ(jElapsedRealtime, 1, IApplicationDependencyService.class.getName(), iECommerceHostService != null ? iECommerceHostService.getClass().getName() : null, iECommerceHostService != null);
                } else {
                    C1120604Zw.LIZ.LIZ();
                    iECommerceHostService = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IApplicationDependencyService.class);
                }
                C09GA c09gaLIZIZ = c212350188eLIZJ.LIZIZ(((IApplicationDependencyService) iECommerceHostService).getAppId());
                C1300610jwx c1300610jwx = C1300610jwx.LIZJ;
                C1300610jwx[] c1300610jwxArr = {c1300610jwx};
                Bundle bundle = new Bundle();
                if (c09gaLIZIZ != null) {
                    c09gaLIZIZ.LJIILJJIL(c1300610jwxArr, bundle);
                }
                try {
                    obj = bundle.get(c1300610jwx.LIZ);
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                } catch (OutOfMemoryError e2) {
                    TryCatchGuardChecker.doCheck(e2);
                }
                float fFloatValue = (!(obj instanceof Float) || (f = (Float) obj) == null) ? 0.0f : f.floatValue();
                LIZIZ = fFloatValue;
                LIZLLL(fFloatValue);
            } else {
                LIZIZ = fLIZIZ;
            }
        }
        return LIZIZ;
    }

    public static float LIZIZ() {
        IECommerceHostService iECommerceHostService;
        String str;
        float f = -1.0f;
        if (LIZJ == -1.0f) {
            if (C034S.LIZ()) {
                C1120604Zw.LIZ.LIZ();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                iECommerceHostService = (IECommerceHostService) ServiceManager.get().getService(IApplicationDependencyService.class);
                C1AQS.LIZJ(jElapsedRealtime, 1, IApplicationDependencyService.class.getName(), iECommerceHostService != null ? iECommerceHostService.getClass().getName() : null, iECommerceHostService != null);
            } else {
                C1120604Zw.LIZ.LIZ();
                iECommerceHostService = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IApplicationDependencyService.class);
            }
            Object objLIZ = C1323720kYE.LIZ(((IApplicationDependencyService) iECommerceHostService).getApplication()).LIZ("ecom_osp_device_score");
            if (objLIZ != null) {
                if ((objLIZ instanceof String) && (str = (String) objLIZ) != null) {
                    f = CastFloatProtector.parseFloat(str);
                }
                LIZJ = f;
            }
        }
        return LIZJ;
    }

    public static void LIZJ() {
        IECommerceHostService iECommerceHostService;
        Object obj;
        C212350188e c212350188eLIZJ = C212350188e.LIZJ();
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            iECommerceHostService = (IECommerceHostService) ServiceManager.get().getService(IApplicationDependencyService.class);
            C1AQS.LIZJ(jElapsedRealtime, 1, IApplicationDependencyService.class.getName(), iECommerceHostService != null ? iECommerceHostService.getClass().getName() : null, iECommerceHostService != null);
        } else {
            C1120604Zw.LIZ.LIZ();
            iECommerceHostService = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IApplicationDependencyService.class);
        }
        C09GA c09gaLIZIZ = c212350188eLIZJ.LIZIZ(((IApplicationDependencyService) iECommerceHostService).getAppId());
        C1300610jwx c1300610jwx = C1300610jwx.LIZJ;
        C1300610jwx[] c1300610jwxArr = {c1300610jwx};
        Bundle bundle = new Bundle();
        if (c09gaLIZIZ != null) {
            c09gaLIZIZ.LJIILJJIL(c1300610jwxArr, bundle);
        }
        try {
            obj = bundle.get(c1300610jwx.LIZ);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            obj = null;
        } catch (OutOfMemoryError e2) {
            TryCatchGuardChecker.doCheck(e2);
            obj = null;
        }
        Float f = obj instanceof Float ? (Float) obj : null;
        float fFloatValue = f != null ? f.floatValue() : 0.0f;
        float fLIZIZ = LIZIZ();
        if (fFloatValue == 0.0f || fFloatValue == fLIZIZ) {
            return;
        }
        LIZLLL(fFloatValue);
    }

    public static void LIZLLL(float f) {
        IECommerceHostService iECommerceHostService;
        boolean z;
        String name;
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
            } else {
                name = null;
            }
            C1AQS.LIZJ(jElapsedRealtime, 1, name2, name, z);
        } else {
            C1120604Zw.LIZ.LIZ();
            iECommerceHostService = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IApplicationDependencyService.class);
        }
        C1323720kYE.LIZ(((IApplicationDependencyService) iECommerceHostService).getApplication()).LJIIIIZZ(String.valueOf(f), "ecom_osp_device_score");
    }
}
