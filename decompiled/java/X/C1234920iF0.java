package X;

import android.content.Context;
import android.os.Bundle;
import androidx.lifecycle.Observer;
import androidx.lifecycle.Transformations;
import androidx.lifecycle.ViewModelProviders;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.IAccountLoginMethodsService;
import com.ss.android.ugc.aweme.account.login.v2.base.AvailableWaysViewModel;
import com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment;
import com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0iF0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1234920iF0 {
    public static AvailableWaysViewModel.GetAvailableWayType LIZIZ(BaseI18nLoginFragment baseI18nLoginFragment) {
        AvailableWaysViewModel.GetAvailableWayType getAvailableWayType;
        Bundle arguments = baseI18nLoginFragment.getArguments();
        if (arguments == null || (getAvailableWayType = (AvailableWaysViewModel.GetAvailableWayType) arguments.getParcelable("get_available_ways_approach")) == null) {
            return new AvailableWaysViewModel.GetAvailableWayType(true, false);
        }
        return getAvailableWayType;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static C0XGR LIZJ(InterfaceC1234930iF1 interfaceC1234930iF1) {
        C0XGR c0xgr = new C0XGR();
        BaseAccountFlowFragment baseAccountFlowFragment = (BaseAccountFlowFragment) interfaceC1234930iF1;
        c0xgr.LIZLLL("enter_method", baseAccountFlowFragment.getEnterMethod());
        c0xgr.LIZLLL("enter_from", baseAccountFlowFragment.getEnterFrom());
        c0xgr.LIZLLL("login_panel_type", baseAccountFlowFragment.PR());
        c0xgr.LIZLLL("page", baseAccountFlowFragment.RR());
        return c0xgr;
    }

    public static void LJ(InterfaceC1234930iF1 interfaceC1234930iF1) {
        C0XGR c0xgrNP = interfaceC1234930iF1.nP();
        c0xgrNP.getClass();
        c0xgrNP.LIZLLL("click", "log_in_with_password");
        c0xgrNP.LIZLLL("platform", "email");
        C20684815ws.LJIILLIIL("switch_to_password", c0xgrNP.LIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void LJFF(InterfaceC1234930iF1 interfaceC1234930iF1, Context context) {
        C1234940iF2 c1234940iF2 = C1234940iF2.LIZ;
        String enterMethod = ((BaseAccountFlowFragment) interfaceC1234930iF1).getEnterMethod();
        c1234940iF2.getClass();
        C1234940iF2.LIZ("email_login", enterMethod);
        C1234940iF2.LIZIZ(c1234940iF2, context, "email_login");
    }

    public static List<C1247510iZJ> LIZ(InterfaceC1234930iF1 interfaceC1234930iF1, BaseI18nLoginFragment baseI18nLoginFragment, AvailableWaysViewModel.AvailableWays availableWays) {
        boolean z;
        boolean z2;
        String str;
        ArrayList arrayList = new ArrayList();
        Keva keva = AvailableWaysViewModel.LLILLL;
        if (availableWays.hasMobile && availableWays.mobile != null && availableWays.safe && (str = availableWays.mobile) != null) {
            arrayList.add(interfaceC1234930iF1.ve(str));
            z = true;
        } else {
            z = false;
        }
        if (availableWays.hasPWD) {
            arrayList.add(interfaceC1234930iF1.lo());
            z2 = true;
        } else {
            z2 = false;
        }
        interfaceC1234930iF1.hB(baseI18nLoginFragment.getEnterFrom(), baseI18nLoginFragment.getEnterMethod(), z, z2);
        IAccountLoginMethodsService iAccountLoginMethodsService = (IAccountLoginMethodsService) PluggableExtentionKt.pluggableSpi$default(IAccountLoginMethodsService.class, false, false, false, 14, null);
        if (iAccountLoginMethodsService == null || !iAccountLoginMethodsService.LIZJ() || iAccountLoginMethodsService.LJIIIZ()) {
            arrayList.add(interfaceC1234930iF1.HL(baseI18nLoginFragment.requireContext()));
        }
        return arrayList;
    }

    public static void LJI(final BaseI18nLoginFragment baseI18nLoginFragment, final InterfaceC1234930iF1 interfaceC1234930iF1, final String str) {
        C19EG activity = baseI18nLoginFragment.getActivity();
        if (activity == null) {
            interfaceC1234930iF1.mp();
        } else {
            Transformations.distinctUntilChanged(((AvailableWaysViewModel) ViewModelProviders.of(activity).get(AvailableWaysViewModel.class)).LLILLJJLI).observe(baseI18nLoginFragment, new Observer() { // from class: X.0iEz
                @Override // androidx.lifecycle.Observer
                public final void onChanged(Object obj) {
                    boolean zLJIIIZ;
                    interfaceC1234930iF1.mp();
                    AvailableWaysViewModel.AvailableWays availableWays = (AvailableWaysViewModel.AvailableWays) ((Map) obj).get(str);
                    if (availableWays != null) {
                        IAccountLoginMethodsService iAccountLoginMethodsService = (IAccountLoginMethodsService) PluggableExtentionKt.pluggableSpi$default(IAccountLoginMethodsService.class, false, false, false, 14, null);
                        if (iAccountLoginMethodsService != null && iAccountLoginMethodsService.LIZJ()) {
                            zLJIIIZ = iAccountLoginMethodsService.LJIIIZ();
                        } else {
                            zLJIIIZ = true;
                        }
                        if (!availableWays.hasPWD) {
                            Keva keva = AvailableWaysViewModel.LLILLL;
                            if ((!availableWays.hasMobile || availableWays.mobile == null || !availableWays.safe) && zLJIIIZ) {
                                interfaceC1234930iF1.hB(baseI18nLoginFragment.getEnterFrom(), baseI18nLoginFragment.getEnterMethod(), false, false);
                                interfaceC1234930iF1.Dr();
                                return;
                            }
                        }
                        interfaceC1234930iF1.Us(baseI18nLoginFragment, availableWays);
                    }
                }
            });
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void LIZLLL(InterfaceC1234930iF1 interfaceC1234930iF1, String str, String str2, boolean z, boolean z2) {
        C0XGR c0xgr = new C0XGR();
        c0xgr.LIZLLL("enter_from", str);
        c0xgr.LIZLLL("page", ((BaseAccountFlowFragment) interfaceC1234930iF1).RR());
        C20684815ws.LJIILLIIL("click_need_help", c0xgr.LIZ);
        C0XGR c0xgr2 = new C0XGR();
        c0xgr2.LIZLLL("enter_from", str);
        c0xgr2.LIZLLL("enter_method", str2);
        c0xgr2.LIZLLL("page", "login");
        c0xgr2.LIZ(z ? 1 : 0, "has_phone");
        c0xgr2.LIZ(z2 ? 1 : 0, "has_pw");
        C20684815ws.LJIILLIIL("email_unfold_other_methods", c0xgr2.LIZ);
    }
}
