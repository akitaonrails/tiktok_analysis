package X;

import Y.ACListenerS154S0100000_19;
import Y.AfS188S0100000_19;
import Y.AfS51S1100000_19;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.account.experiment.AccountGSMAPhase2Experiment;
import com.ss.android.ugc.aweme.account.login.auth.SignupViewModel;
import com.ss.android.ugc.aweme.account.login.utils.PhoneNumberUtil;
import com.ss.android.ugc.aweme.account.login.v2.ui.experiment.SMSPermissionCheckboxExp;
import com.ss.android.ugc.aweme.account.oneclicklogin.IOneClickLoginService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.GSMAService;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.AwS598S0100000_19;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0iLQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1238900iLQ extends RecyclerView.ViewHolder implements InterfaceC1232290iAl, InterfaceC1238810iLH {
    public static final /* synthetic */ int LLJILJILJ = 0;
    public final View LL;
    public final SignupViewModel LLILLJJLI;
    public final C1238240iKM LLILLL;
    public final C197039127h LLILZ;
    public final C197039127h LLILZIL;
    public final TuxTextView LLILZLL;
    public final ConstraintLayout LLIZ;
    public boolean LLIZLLLIL;
    public C0HZQ LLJ;
    public boolean LLJI;
    public final String LLJIJIL;
    public DialogC1389620mGW LLJILJIL;

    static {
        new C1238920iLS();
    }

    @Override // X.InterfaceC1238810iLH
    public final void BM() {
        this.LLILLJJLI.GQ2().putBoolean("gsma_available", false);
    }

    public final void L5() {
        C1237220iIi c1237220iIi;
        String string = this.LLILLJJLI.GQ2().getString("gsma_fail_reason");
        String fullPhoneNumber = this.LLILLL.getFullPhoneNumber();
        EnumC852660Xce enumC852660Xce = EnumC852660Xce.SIGN_UP;
        C851370XaZ c851370XaZLIZ = C1236990iIL.LIZ(fullPhoneNumber, enumC852660Xce);
        if (c851370XaZLIZ != null && (c1237220iIi = c851370XaZLIZ.LIZ) != null && c1237220iIi.LIZIZ()) {
            N5(false);
            C1238920iLS.LIZ(0, this.LLILLJJLI.getEnterFrom(), this.LLILLJJLI.getEnterMethod(), this.LLILLJJLI.yQ2(), null, 96);
            I5(null, false, "", string);
        } else {
            N5(true);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            if (SMSPermissionCheckboxExp.INSTANCE.showCheckbox()) {
                linkedHashMap.put("query_sms_permission", "1");
            }
            C0XZ4.LJIILLIIL(C0XZ4.LIZ, this.LLILLJJLI.getEnterFrom(), this.LLILLJJLI.getEnterMethod(), PhoneNumberUtil.LIZ(this.LLILLL.getPhoneNumberObject()), enumC852660Xce, EnumC852910Xd3.PHONE_SMS_SIGN_UP, "user_click", "signup", null, null, null, null, null, "signup_prioritize_panel", null, null, null, null, string, null, linkedHashMap, 388992).LJIIIIZZ(new AfS51S1100000_19(this, string, 1)).LJII(new AfS188S0100000_19(this, 85)).LJFF(new C1266060j3E(this, 9)).LJIILL();
        }
    }

    @Override // X.InterfaceC1232290iAl
    public final void LLIIIZ() {
        if (this.LLJ != null) {
            this.LLJ = P5(false);
        }
        if (this.LLILZLL.getVisibility() != 8) {
            C786410Ut5.LLLLZLL(this.LLILZLL, 8);
        }
        if (this.LLILZIL.getVisibility() != 8) {
            C786410Ut5.LLLLLLJ(this.LLILZIL, 8);
        }
        if (AccountGSMAPhase2Experiment.LIZJ()) {
            this.LLILZ.setText(this.LL.getContext().getString(2131837635));
        }
    }

    @Override // X.InterfaceC1238810iLH
    public final C19EG getActivity() {
        WeakReference<C19EG> weakReference = this.LLILLJJLI.LLILLJJLI;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    @Override // X.InterfaceC1238810iLH
    public final void ha() {
        this.LLILLJJLI.GQ2().putBoolean("gsma_available", true);
    }

    @Override // X.InterfaceC1232290iAl
    public final void ln() {
        if (((IOneClickLoginService) ServiceManager.get().getService(IOneClickLoginService.class)).LIZIZ() && this.LLJ == null) {
            this.LLJ = P5(true);
        }
        if (this.LLILZLL.getVisibility() == 8) {
            TuxTextView tuxTextView = this.LLILZLL;
            C786410Ut5.LLLLZLL(tuxTextView, 0);
            C19293810e0.LIZJ(tuxTextView.getContext(), tuxTextView, Integer.valueOf(AccountGSMAPhase2Experiment.LIZJ() ? 10 : 7), new View.OnClickListener() { // from class: X.0iLT
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                }
            });
        }
        if (AccountGSMAPhase2Experiment.LIZIZ() && this.LLILZIL.getVisibility() == 8) {
            C786410Ut5.LLLLLLJ(this.LLILZIL, 0);
        }
        if (AccountGSMAPhase2Experiment.LIZJ()) {
            this.LLILZ.setText(this.LL.getContext().getString(2131824511));
        }
    }

    @Override // X.InterfaceC1238810iLH
    public final void CQ() {
        C1238820iLI.LIZIZ(this);
    }

    @Override // X.InterfaceC1238810iLH
    public final DialogC1389620mGW Jz() {
        return this.LLJILJIL;
    }

    @Override // X.InterfaceC1238810iLH
    public final void WP() {
        C1238820iLI.LIZ(this);
    }

    public final void N5(boolean z) {
        this.LLILZ.setLoading(z);
        if (AccountGSMAPhase2Experiment.LIZIZ()) {
            this.LLILZIL.setLoading(z);
        }
    }

    public final C0HZQ P5(boolean z) {
        boolean z2;
        C851910XbR c851910XbR = C851910XbR.LIZ;
        ConstraintLayout constraintLayout = this.LLIZ;
        if (z && ((IOneClickLoginService) ServiceManager.get().getService(IOneClickLoginService.class)).LIZIZ()) {
            z2 = true;
        } else {
            z2 = false;
        }
        boolean z3 = this.LLJI;
        String str = this.LLJIJIL;
        AwS598S0100000_19 awS598S0100000_19 = new AwS598S0100000_19(this, 855);
        c851910XbR.getClass();
        return C851910XbR.LIZ(constraintLayout, z2, z3, "signup", str, awS598S0100000_19, false);
    }

    @Override // X.InterfaceC1238810iLH
    public final void kD(String str) {
        C19EG activity;
        C786410Ut5.LJJJI("gsma_fail_reason", str, this.LLILLJJLI.GQ2());
        C1238820iLI.LIZ(this);
        if (AccountGSMAPhase2Experiment.LIZJ() && !Intrinsics.LJFF(str, "quit") && (activity = getActivity()) != null) {
            GSMAService.INSTANCE.showGSMAFailureToast(activity);
        }
        L5();
    }

    @Override // X.InterfaceC1238810iLH
    public final void rC(DialogC1389620mGW dialogC1389620mGW) {
        this.LLJILJIL = dialogC1389620mGW;
    }

    public C1238900iLQ(View view, SignupViewModel signupViewModel) {
        Integer numLIZJ;
        super(view);
        this.LL = view;
        this.LLILLJJLI = signupViewModel;
        this.LLILLL = (C1238240iKM) view.findViewById(R.id.qbf);
        C197039127h c197039127h = (C197039127h) view.findViewById(R.id.qbh);
        this.LLILZ = c197039127h;
        C197039127h c197039127h2 = (C197039127h) view.findViewById(R.id.qbj);
        this.LLILZIL = c197039127h2;
        this.LLILZLL = (TuxTextView) view.findViewById(R.id.qbi);
        this.LLIZ = (ConstraintLayout) view.findViewById(R.id.qaw);
        this.LLIZLLLIL = true;
        this.LLJI = true;
        this.LLJIJIL = "phone";
        View viewFindViewById = view.findViewById(R.id.qbg);
        if (viewFindViewById != null) {
            C786410Ut5.W5(viewFindViewById, new LinearLayout.LayoutParams(-1, -2));
        }
        int iIntValue = 0;
        if (viewFindViewById != null) {
            viewFindViewById.setPadding(0, 0, 0, 0);
        }
        C1238240iKM c1238240iKM = this.LLILLL;
        c1238240iKM.setImeOptionForEditText(6);
        signupViewModel.getEnterFrom();
        c1238240iKM.LLILZIL = "signup";
        c1238240iKM.LLILZLL = "signup_prioritize_panel";
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1238240iKM);
        c1238240iKM.setLayoutParams(layoutParams);
        c1238240iKM.LIZIZ();
        c1238240iKM.setOnCountryCodeChanged(new AwS563S0100000_19(c1238240iKM, 3320));
        EditText editText = c1238240iKM.getEditText();
        editText.setOnFocusChangeListener(new ViewOnFocusChangeListenerC1265950j33(this, 5));
        editText.addTextChangedListener(new C1266020j3A(this, 18));
        c197039127h.setText(view.getContext().getString(2131837635));
        C786410Ut5.U8(c197039127h, new ACListenerS154S0100000_19(this, 294));
        if (AccountGSMAPhase2Experiment.LIZIZ()) {
            c197039127h2.setText(view.getContext().getString(2131824507));
            Context context = c197039127h2.getContext();
            if (context != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.c5, context)) != null) {
                iIntValue = numLIZJ.intValue();
            }
            c197039127h2.setBackgroundColor(iIntValue);
            C786410Ut5.U8(c197039127h2, new ACListenerS154S0100000_19(this, 295));
        }
    }

    @Override // X.InterfaceC1238810iLH
    public final void yq(String str, boolean z, Boolean bool) {
        if (this.LLJ != null) {
            this.LLILLJJLI.GQ2().putBoolean("ocl_checkbox_checked", this.LLJI);
        }
        C786410Ut5.LJJIZ(this.LLILLJJLI.GQ2(), "args_phone_number", this.LLILLL.getPhoneNumberObject());
        this.LLILLJJLI.GQ2().remove("gsma_fail_reason");
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(this.LL.getContext(), "//account/login/signup_or_login");
        smartRouteBuildRoute.withParam("current_scene", EnumC852660Xce.SIGN_UP.getValue());
        smartRouteBuildRoute.withParam("current_page", EnumC852910Xd3.INPUT_PHONE_SIGN_UP.getValue());
        smartRouteBuildRoute.withParam("next_page", EnumC852910Xd3.GSMA_VERIFY.getValue());
        smartRouteBuildRoute.withParam("page", "signup_prioritize_panel");
        Bundle bundleGQ2 = this.LLILLJJLI.GQ2();
        C786410Ut5.LJJIZ(bundleGQ2, "args_phone_number", this.LLILLL.getPhoneNumberObject());
        if (this.LLJ != null) {
            bundleGQ2.putBoolean("ocl_checkbox_checked", this.LLJI);
        }
        smartRouteBuildRoute.withParam(bundleGQ2);
        smartRouteBuildRoute.withParam("channel_for_ocl", this.LLJIJIL);
        smartRouteBuildRoute.withParam("enter_from", this.LLILLJJLI.getEnterFrom());
        smartRouteBuildRoute.withParam("enter_method", this.LLILLJJLI.getEnterMethod());
        smartRouteBuildRoute.withParam("login_panel_type", "signup");
        smartRouteBuildRoute.withParam("gsma_code", str);
        smartRouteBuildRoute.withParam("need_show_gsma_text", !z);
        smartRouteBuildRoute.withParam("is_gsma", true);
        if (bool != null) {
            smartRouteBuildRoute.withParam("is_register", !bool.booleanValue());
        }
        smartRouteBuildRoute.open(1846, new C1266040j3C(this, 4));
    }

    public final void I5(Boolean bool, boolean z, String str, String str2) {
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(this.LL.getContext(), "//account/login/signup_or_login");
        smartRouteBuildRoute.withParam("current_scene", EnumC852660Xce.SIGN_UP.getValue());
        smartRouteBuildRoute.withParam("current_page", EnumC852910Xd3.INPUT_PHONE_SIGN_UP.getValue());
        smartRouteBuildRoute.withParam("next_page", EnumC852910Xd3.PHONE_SMS_SIGN_UP.getValue());
        smartRouteBuildRoute.withParam("page", "signup_prioritize_panel");
        Bundle bundleGQ2 = this.LLILLJJLI.GQ2();
        bundleGQ2.putBoolean("code_sent", z);
        C786410Ut5.LJJIZ(bundleGQ2, "args_phone_number", this.LLILLL.getPhoneNumberObject());
        bundleGQ2.putBoolean("user_cross_activity_timer", true);
        if (this.LLJ != null) {
            bundleGQ2.putBoolean("ocl_checkbox_checked", this.LLJI);
        }
        smartRouteBuildRoute.withParam(bundleGQ2);
        smartRouteBuildRoute.withParam("channel_for_ocl", this.LLJIJIL);
        smartRouteBuildRoute.withParam("enter_from", this.LLILLJJLI.getEnterFrom());
        smartRouteBuildRoute.withParam("enter_method", this.LLILLJJLI.getEnterMethod());
        smartRouteBuildRoute.withParam("login_panel_type", "signup");
        smartRouteBuildRoute.withParam("check_kr_consent", true);
        Bundle bundle = this.LLILLJJLI.LLLFZ;
        if (bundle != null) {
            smartRouteBuildRoute.withParam("et_params", bundle);
        }
        if (bool != null) {
            smartRouteBuildRoute.withParam("is_register", !bool.booleanValue());
        }
        if (!TextUtils.isEmpty(str)) {
            smartRouteBuildRoute.withParam("has_sms_permission", str);
        }
        if (str2 != null) {
            smartRouteBuildRoute.withParam("gsma_fail_reason", str2);
        }
        smartRouteBuildRoute.open();
    }
}
