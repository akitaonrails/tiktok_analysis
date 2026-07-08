package X;

import android.app.Activity;
import android.content.Context;
import android.os.SystemClock;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.application.IApplicationDependencyService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.03lx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C940303lx implements InterfaceC10490048i {
    @Override // X.InterfaceC10490048i
    public final void LIZIZ(Integer num, List list) {
        IECommerceHostService iECommerceHostService;
        Context applicationContext;
        boolean z;
        IECommerceHostService iECommerceHostService2;
        boolean z2;
        String name = null;
        if (num != null) {
            if (C034S.LIZ()) {
                C1120604Zw.LIZ.LIZ();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                iECommerceHostService2 = (IECommerceHostService) ServiceManager.get().getService(IApplicationDependencyService.class);
                if (iECommerceHostService2 != null) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                String name2 = IApplicationDependencyService.class.getName();
                if (iECommerceHostService2 != null) {
                    name = iECommerceHostService2.getClass().getName();
                }
                C1AQS.LIZJ(jElapsedRealtime, 1, name2, name, z2);
            } else {
                C1120604Zw.LIZ.LIZ();
                iECommerceHostService2 = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IApplicationDependencyService.class);
            }
            applicationContext = new ContextThemeWrapper(((IApplicationDependencyService) iECommerceHostService2).getApplicationContext(), num.intValue());
        } else {
            if (C034S.LIZ()) {
                C1120604Zw.LIZ.LIZ();
                long jElapsedRealtime2 = SystemClock.elapsedRealtime();
                iECommerceHostService = (IECommerceHostService) ServiceManager.get().getService(IApplicationDependencyService.class);
                if (iECommerceHostService != null) {
                    z = true;
                } else {
                    z = false;
                }
                String name3 = IApplicationDependencyService.class.getName();
                if (iECommerceHostService != null) {
                    name = iECommerceHostService.getClass().getName();
                }
                C1AQS.LIZJ(jElapsedRealtime2, 1, name3, name, z);
            } else {
                C1120604Zw.LIZ.LIZ();
                iECommerceHostService = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IApplicationDependencyService.class);
            }
            applicationContext = ((IApplicationDependencyService) iECommerceHostService).getApplicationContext();
        }
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            C03XI c03xi = (C03XI) it2.next();
            int i = c03xi.LIZJ;
            for (int i2 = 0; i2 < i; i2++) {
                Integer num2 = c03xi.LIZ;
                if (num2 != null) {
                    C21146717pB.LIZJ(applicationContext, num2.intValue());
                } else {
                    String str = c03xi.LIZIZ;
                    if (str != null) {
                        C21146717pB.LIZLLL(applicationContext, str);
                    }
                }
            }
        }
    }

    @Override // X.InterfaceC10490048i
    public final void LIZ(Activity activity, List<C03XI> list, Integer num) {
        int iIntValue;
        if (num != null) {
            iIntValue = num.intValue();
        } else if (C1744700vVE.LJ(activity, null)) {
            iIntValue = R.style.y0;
        } else {
            iIntValue = R.style.xx;
        }
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(activity, iIntValue);
        for (C03XI c03xi : list) {
            int i = c03xi.LIZJ;
            for (int i2 = 0; i2 < i; i2++) {
                Integer num2 = c03xi.LIZ;
                if (num2 != null) {
                    C21146717pB.LIZJ(contextThemeWrapper, num2.intValue());
                } else {
                    String str = c03xi.LIZIZ;
                    if (str != null) {
                        C21146717pB.LIZLLL(contextThemeWrapper, str);
                    }
                }
            }
        }
    }

    @Override // X.InterfaceC10490048i
    public final View inflate(Context context, int i, ViewGroup viewGroup, boolean z) {
        try {
            return C21146717pB.LIZIZ(context, i, viewGroup, z);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return C786410Ut5.Td(C786410Ut5.ne(context), i, viewGroup, z);
        }
    }
}
