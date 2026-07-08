package X;

import android.app.Activity;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.changeregionapi.api.IPNSChangeRegionService;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.compliance.api.services.consent.model.InlineLink;
import com.ss.android.ugc.aweme.compliance.api.services.policy.ICompliancePolicyService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0zsg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1913000zsg {
    public static final C1913000zsg LIZ = new C1913000zsg();

    public static void LIZIZ() {
        Activity activity;
        final IPNSChangeRegionService iPNSChangeRegionService = (IPNSChangeRegionService) PluggableExtentionKt.pluggableSpi$default(IPNSChangeRegionService.class, false, false, false, 14, null);
        if (iPNSChangeRegionService == null) {
            return;
        }
        AbstractC1387200mCc abstractC1387200mCcLJ = C1906580ziK.LJ();
        if (abstractC1387200mCcLJ instanceof C1844400y62) {
            activity = ((C1844400y62) abstractC1387200mCcLJ).LIZLLL.getActivity();
        } else if (!(abstractC1387200mCcLJ instanceof C1397950mTx)) {
            return;
        } else {
            activity = ((C1397950mTx) abstractC1387200mCcLJ).LIZLLL;
        }
        if (activity != null) {
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("enter_from", "signup_login_page");
            C20684815ws.LJIILLIIL("account_region_status_click", c2344009Gk.LIZ);
            iPNSChangeRegionService.LJIILLIIL(activity, new InterfaceC1710120ubS() { // from class: X.0zsh
                @Override // X.InterfaceC1710120ubS
                public void onError(String str) {
                }

                @Override // X.InterfaceC1710120ubS
                public void onExit() {
                }

                @Override // X.InterfaceC1710120ubS
                public void onChanged(String str, String str2) {
                    iPNSChangeRegionService.LJIIIZ(1, str, str2, "user_selected");
                }
            });
        }
    }

    public static void LIZJ(String str) {
        C052C.LIZ.getClass();
        try {
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ(Scene.SCENE_SERVICE, str);
            c2344009Gk.LIZJ(C052C.LIZ(), "is_first_launch");
            C20684815ws.LJIILLIIL("pns_device_consent_config_exception", c2344009Gk.LIZ);
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    public static void LIZLLL(String str) {
        C052C.LIZ.getClass();
        try {
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ(Scene.SCENE_SERVICE, str);
            c2344009Gk.LIZJ(C052C.LIZ(), "is_first_launch");
            C20684815ws.LJIILLIIL("pns_device_consent_config_success", c2344009Gk.LIZ);
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    public static void LIZ(InlineLink inlineLink, String str) {
        String str2 = inlineLink.url;
        if (str2 != null && str2.length() != 0) {
            C1913610ztf c1913610ztf = new C1913610ztf(str, "", true, true, false, null, false, 32);
            ICompliancePolicyService iCompliancePolicyServiceLJIIIIZZ = ComplianceServiceProvider.LJIIIIZZ();
            if (iCompliancePolicyServiceLJIIIIZZ != null) {
                iCompliancePolicyServiceLJIIIIZZ.LIZIZ(str2, c1913610ztf, new InterfaceC1913620ztg() { // from class: X.0zsi
                    @Override // X.InterfaceC1913620ztg
                    public final void onComplete() {
                    }
                });
            }
        }
    }
}
