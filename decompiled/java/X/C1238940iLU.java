package X;

import android.os.Bundle;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.account.experiment.AccountGSMAPhase2Experiment;
import com.ss.android.ugc.aweme.account.login.auth.SignupViewModel;
import com.ss.android.ugc.aweme.account.login.auth.ui.login.SmsInputViewModel;
import com.ss.android.ugc.aweme.account.login.utils.PhoneNumberUtil;
import com.ss.android.ugc.aweme.services.GSMAService;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.AwS133S1100000_19;
import kotlin.jvm.internal.AwS168S1100000_19;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0iLU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1238940iLU implements InterfaceC1238810iLH {
    public DialogC1389620mGW LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ SignupViewModel LLILLL;
    public final /* synthetic */ C05P1<C1238980iLY> LLILZ;
    public final /* synthetic */ SmsInputViewModel LLILZIL;
    public final /* synthetic */ String LLILZLL;

    @Override // X.InterfaceC1238810iLH
    public final void BM() {
        this.LLILLL.GQ2().putBoolean("gsma_available", false);
    }

    @Override // X.InterfaceC1238810iLH
    public final C19EG getActivity() {
        WeakReference<C19EG> weakReference = this.LLILLL.LLILLJJLI;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    @Override // X.InterfaceC1238810iLH
    public final void ha() {
        this.LLILLL.GQ2().putBoolean("gsma_available", true);
    }

    @Override // X.InterfaceC1238810iLH
    public final void CQ() {
        C1238820iLI.LIZIZ(this);
    }

    @Override // X.InterfaceC1238810iLH
    public final DialogC1389620mGW Jz() {
        return this.LL;
    }

    @Override // X.InterfaceC1238810iLH
    public final void WP() {
        C1238820iLI.LIZ(this);
    }

    @Override // X.InterfaceC1238810iLH
    public final void kD(String str) {
        Boolean boolValueOf;
        C19EG activity;
        C1238820iLI.LIZ(this);
        if (AccountGSMAPhase2Experiment.LIZJ() && !Intrinsics.LJFF(str, "quit") && (activity = getActivity()) != null) {
            GSMAService.INSTANCE.showGSMAFailureToast(activity);
        }
        SignupViewModel signupViewModel = this.LLILLL;
        String str2 = C1669520tXy.LIZJ(this.LLILZ).LJ;
        AwS563S0100000_19 awS563S0100000_19 = new AwS563S0100000_19(this.LLILZIL, 3416);
        AwS168S1100000_19 awS168S1100000_19 = new AwS168S1100000_19(this.LLILZIL, this.LLILZLL, 13);
        AwS133S1100000_19 awS133S1100000_19 = new AwS133S1100000_19(this.LLILZIL, this.LLILZLL, 34);
        if (this.LLILLJJLI) {
            boolValueOf = Boolean.valueOf(C1669520tXy.LIZJ(this.LLILZ).LJFF);
        } else {
            boolValueOf = null;
        }
        signupViewModel.SQ2(str2, awS563S0100000_19, awS168S1100000_19, awS133S1100000_19, boolValueOf, str);
    }

    @Override // X.InterfaceC1238810iLH
    public final void rC(DialogC1389620mGW dialogC1389620mGW) {
        this.LL = dialogC1389620mGW;
    }

    @Override // X.InterfaceC1238810iLH
    public final void yq(String str, boolean z, Boolean bool) {
        Boolean boolValueOf;
        C19EG c19eg;
        if (this.LLILLJJLI) {
            this.LLILLL.GQ2().putBoolean("ocl_checkbox_checked", C1669520tXy.LIZJ(this.LLILZ).LJFF);
        }
        C786410Ut5.LJJIZ(this.LLILLL.GQ2(), "args_phone_number", PhoneNumberUtil.LIZLLL(C1669520tXy.LIZJ(this.LLILZ).LJ));
        SignupViewModel signupViewModel = this.LLILLL;
        String str2 = C1669520tXy.LIZJ(this.LLILZ).LJ;
        if (this.LLILLJJLI) {
            boolValueOf = Boolean.valueOf(C1669520tXy.LIZJ(this.LLILZ).LJFF);
        } else {
            boolValueOf = null;
        }
        AwS563S0100000_19 awS563S0100000_19 = new AwS563S0100000_19(this, 3417);
        WeakReference<C19EG> weakReference = signupViewModel.LLILLJJLI;
        if (weakReference != null && (c19eg = weakReference.get()) != null) {
            SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(c19eg, "//account/login/signup_or_login");
            smartRouteBuildRoute.withParam("current_scene", EnumC852660Xce.SIGN_UP.getValue());
            smartRouteBuildRoute.withParam("current_page", EnumC852910Xd3.INPUT_PHONE_SIGN_UP.getValue());
            smartRouteBuildRoute.withParam("next_page", EnumC852910Xd3.GSMA_VERIFY.getValue());
            smartRouteBuildRoute.withParam("page", "signup_prioritize_panel");
            Bundle bundleGQ2 = signupViewModel.GQ2();
            C786410Ut5.LJJIZ(bundleGQ2, "args_phone_number", PhoneNumberUtil.LIZLLL(str2));
            if (boolValueOf != null) {
                bundleGQ2.putBoolean("ocl_checkbox_checked", boolValueOf.booleanValue());
            }
            smartRouteBuildRoute.withParam(bundleGQ2);
            smartRouteBuildRoute.withParam("channel_for_ocl", "phone");
            smartRouteBuildRoute.withParam("enter_from", signupViewModel.getEnterFrom());
            smartRouteBuildRoute.withParam("enter_method", signupViewModel.getEnterMethod());
            smartRouteBuildRoute.withParam("login_panel_type", "signup");
            smartRouteBuildRoute.withParam("gsma_code", str);
            smartRouteBuildRoute.withParam("need_show_gsma_text", !z);
            smartRouteBuildRoute.withParam("is_gsma", true);
            if (bool != null) {
                smartRouteBuildRoute.withParam("is_register", !bool.booleanValue());
            }
            smartRouteBuildRoute.open(1846, new C1266040j3C(awS563S0100000_19, 5));
        }
    }

    public C1238940iLU(boolean z, SignupViewModel signupViewModel, C05P1<C1238980iLY> c05p1, SmsInputViewModel smsInputViewModel, String str) {
        this.LLILLJJLI = z;
        this.LLILLL = signupViewModel;
        this.LLILZ = c05p1;
        this.LLILZIL = smsInputViewModel;
        this.LLILZLL = str;
    }
}
