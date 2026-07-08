package X;

import Y.AfS182S0100000_13;
import Y.AfS46S1100000_13;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.MediatorLiveData;
import androidx.lifecycle.ViewModelProviders;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.router.SmartRouter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.AccountUserService;
import com.ss.android.ugc.aweme.ILoginServiceAppDiff;
import com.ss.android.ugc.aweme.IPrevLoginPlatformService;
import com.ss.android.ugc.aweme.account.hook.AfterLoginHook;
import com.ss.android.ugc.aweme.account.login.model.PhoneLoginMethod;
import com.ss.android.ugc.aweme.account.login.utils.PhoneNumberUtil;
import com.ss.android.ugc.aweme.account.login.v2.base.ActionResultModel;
import com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment;
import com.ss.android.ugc.aweme.account.login.v2.ui.SignUpOrLoginActivity;
import com.ss.android.ugc.aweme.account.model.BaseLoginMethod;
import com.ss.android.ugc.aweme.account.model.CommonUserInfo;
import com.ss.android.ugc.aweme.account.model.LoginMethodName;
import com.ss.android.ugc.aweme.account.network.AccountRetrofitInetcept;
import com.ss.android.ugc.aweme.account.oneclicklogin.IOneClickLoginService;
import com.ss.android.ugc.aweme.account.oneclicklogin.OIDCToken;
import com.ss.android.ugc.aweme.app.services.IWebViewService;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.local_test.LocalTestApi;
import com.ss.android.ugc.aweme.main.service.ILanguageService;
import com.ss.android.ugc.aweme.offline.debug.router.IDebugRouterService;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.service.IRegionMockService;
import com.ss.android.ugc.aweme.services.GSMAService;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AwS100S0110000_13;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0XYO, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0XYO {
    public static final C0XYO LIZ = new C0XYO();

    public static BaseLoginMethod LIZ(Bundle bundle, boolean z) {
        C852810Xct.LIZ.getClass();
        PhoneNumberUtil.PhoneNumber phoneNumberLJII = C852810Xct.LJII(bundle);
        String string = bundle.getString("args_string_phone_number", "");
        String strLIZLLL = C0XQ5.LIZLLL();
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (phoneNumberLJII != null) {
            LoginMethodName loginMethodName = LoginMethodName.PHONE_SMS;
            Long lValueOf = Long.valueOf(jCurrentTimeMillis);
            CommonUserInfo.Companion.getClass();
            return new PhoneLoginMethod(strLIZLLL, loginMethodName, phoneNumberLJII, C0XTZ.LIZ(), lValueOf, -1L, z, null, null, null);
        }
        if (C123100dR.LIZ(string)) {
            PhoneNumberUtil.PhoneNumber phoneNumberCreate = PhoneNumberUtil.PhoneNumber.create(0, string);
            LoginMethodName loginMethodName2 = LoginMethodName.PHONE_SMS;
            Long lValueOf2 = Long.valueOf(jCurrentTimeMillis);
            CommonUserInfo.Companion.getClass();
            return new PhoneLoginMethod(strLIZLLL, loginMethodName2, phoneNumberCreate, C0XTZ.LIZ(), lValueOf2, -1L, z, null, null, null);
        }
        Long lValueOf3 = Long.valueOf(jCurrentTimeMillis);
        LoginMethodName loginMethodName3 = LoginMethodName.DEFAULT;
        CommonUserInfo.Companion.getClass();
        return new BaseLoginMethod(strLIZLLL, loginMethodName3, C0XTZ.LIZ(), new Date(System.currentTimeMillis() + 31536000000L), lValueOf3, -1L, Boolean.FALSE, Boolean.FALSE, null, null, Boolean.FALSE, null, null, null);
    }

    public static void LJFF(Bundle bundle, C0XO2 c0xo2) {
        OIDCToken oIDCTokenLIZLLL;
        if (!c0xo2.LJIJI && !c0xo2.LJIJJLI) {
            if (C846430XIj.LIZIZ()) {
                C0XGC.LIZ.getClass();
                oIDCTokenLIZLLL = C0XGC.LIZLLL(c0xo2);
            } else {
                oIDCTokenLIZLLL = null;
            }
            if (bundle != null) {
                if (oIDCTokenLIZLLL != null) {
                    C786410Ut5.LJJIZ(bundle, "oidc_token", oIDCTokenLIZLLL);
                }
                ((IOneClickLoginService) ServiceManager.get().getService(IOneClickLoginService.class)).LJIILIIL(bundle);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0332  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJI(android.os.Bundle r22, X.C0XO2 r23) {
        /*
            Method dump skipped, instruction units count: 874
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0XYO.LJI(android.os.Bundle, X.0XO2):void");
    }

    public static void LJ(PhoneNumberUtil.PhoneNumber phoneNumber, BaseAccountFlowFragment baseAccountFlowFragment, C850330XXj c850330XXj) {
        JSONObject jSONObjectOptJSONObject;
        Bundle arguments = baseAccountFlowFragment.getArguments();
        if (arguments == null) {
            arguments = new Bundle();
        }
        User userLIZJ = C0XQ5.LIZJ();
        if (phoneNumber != null) {
            C0XUE c0xue = C0XUE.LIZ;
            String uid = userLIZJ.getUid();
            synchronized (c0xue) {
                boolean z = false;
                for (BaseLoginMethod baseLoginMethod : (ArrayList) C0XUE.LIZIZ) {
                    if (Intrinsics.LJFF(baseLoginMethod.getUid(), uid) && (baseLoginMethod instanceof PhoneLoginMethod)) {
                        ((PhoneLoginMethod) baseLoginMethod).setPhoneNumber(phoneNumber);
                        z = true;
                    }
                }
                if (z) {
                    C0XU4 c0xu4 = C0XU4.LIZ;
                    List<BaseLoginMethod> list = C0XUE.LIZIZ;
                    c0xu4.getClass();
                    C0XU4.LIZJ(list, false);
                }
            }
        }
        if (c850330XXj != null) {
            try {
                JSONObject jSONObject = c850330XXj.LJ;
                if (jSONObject != null && (jSONObjectOptJSONObject = jSONObject.optJSONObject("data")) != null) {
                    String strOptString = jSONObjectOptJSONObject.optString("mobile");
                    userLIZJ.setPhoneBinded(true);
                    userLIZJ.setBindPhone(strOptString);
                    AccountUserService accountUserServiceLIZ = C0XQ5.LIZ();
                    C0XO3 c0xo3 = new C0XO3(jSONObject);
                    c0xo3.LIZ();
                    accountUserServiceLIZ.LJJLL(c0xo3, null, false);
                    C0XQ5.LJIIJJI(7, 1, new C851860XbM(strOptString, C786410Ut5.J3(jSONObjectOptJSONObject)));
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        int i = C2187451AjH.LIZ;
        arguments.putBoolean("show_modify_phone_success_toast", true);
        baseAccountFlowFragment.WR(arguments);
    }

    public static void LIZJ(Fragment fragment, C0XYD c0xyd, EnumC852660Xce enumC852660Xce, EnumC852910Xd3 enumC852910Xd3, JSONObject jSONObject, C0XO2 c0xo2) {
        String str;
        Bundle arguments;
        boolean z;
        IRegionMockService iRegionMockService;
        JSONObject jSONObject2;
        C0XO3 c0xo3;
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AccountPassportResultHandler.handleLoginSuccess(Scene: ");
        sbLIZ.append(enumC852660Xce);
        sbLIZ.append(", Step: ");
        sbLIZ.append(enumC852910Xd3);
        sbLIZ.append(", userInfo: ");
        sbLIZ.append(c0xo2.LIZ);
        sbLIZ.append(", fragment: ");
        sbLIZ.append(C13LE.LIZ(fragment.getClass()).LJI());
        sbLIZ.append(')');
        C2188811AlT.LIZIZ(sbLIZ);
        C847910XOb c847910XOb = C847910XOb.LIZ;
        String str2 = c0xo2.LJFF;
        if ((c0xo2 instanceof C0XO3) && (c0xo3 = (C0XO3) c0xo2) != null) {
            str = c0xo3.LJJIJ;
        } else {
            str = null;
        }
        c847910XOb.getClass();
        C847910XOb.LIZ(str2, str);
        C0XQ5.LJIIL(c0xo2, "login");
        AccountRetrofitInetcept.LL.getClass();
        String str3 = "";
        AccountRetrofitInetcept.LLILLJJLI = "";
        Bundle extras = c0xyd.getExtras();
        if (extras == null) {
            extras = new Bundle();
        }
        if (!c0xo2.LJIILL) {
            LJI(extras, c0xo2);
        } else {
            C0XUE.LIZ.LJIIIIZZ(String.valueOf(c0xo2.LIZ), false);
        }
        if (!C293980Bfg.LIZIZ()) {
            ((LocalTestApi) ServiceManager.get().getService(LocalTestApi.class)).setIsLoggedIn(true);
            ((IDebugRouterService) ServiceManager.get().getService(IDebugRouterService.class)).LIZ();
        }
        if ((fragment instanceof BaseAccountFlowFragment) && fragment != null) {
            arguments = fragment.getArguments();
        } else {
            arguments = null;
        }
        LJFF(arguments, c0xo2);
        if (extras.getBoolean("gsma_available")) {
            GSMAService.INSTANCE.updateGSMALocalCache(null, null, null, null, C0XQ5.LIZLLL(), null);
        }
        Bundle arguments2 = fragment.getArguments();
        if (arguments2 != null) {
            z = arguments2.getBoolean("need_upload_sms_consent_status");
        } else {
            z = false;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("AccountPassportResultHandler.tryUploadSmsConsentAfterLogin(");
        sbLIZ2.append(z);
        sbLIZ2.append(")...");
        C2188811AlT.LIZIZ(sbLIZ2);
        if (z) {
            C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C850580XYi(fragment, enumC852910Xd3, null), 3);
        }
        C19EG activity = fragment.getActivity();
        if (activity != null) {
            if (jSONObject != null && JSONObjectProtectorUtils.getBoolean(jSONObject, "need_show_gsma_toast")) {
                GSMAService.INSTANCE.showGSMAToast(activity, c0xyd.getMobParams().LJJLIIIJJI(), c0xyd.getMobParams().LLIIJI());
            }
            MediatorLiveData<Bundle> mediatorLiveData = ((ActionResultModel) ViewModelProviders.of(activity).get(ActionResultModel.class)).LLILLJJLI;
            if (c0xo2.LJII) {
                Bundle extras2 = c0xyd.getExtras();
                if (extras2 != null) {
                    if (enumC852910Xd3 != EnumC852910Xd3.EMAIL_SMS_SIGN_UP && enumC852910Xd3 != EnumC852910Xd3.CREATE_PASSWORD_FOR_EMAIL) {
                        if (!c0xo2.LJIILIIL) {
                            C786410Ut5.LJJJI("set_nickname_platform", "sms_verification", extras2);
                            C786410Ut5.LJJJI("platform_profile", "sms_verification", extras2);
                        }
                    } else {
                        C786410Ut5.LJJJI("set_nickname_platform", "email", extras2);
                        C786410Ut5.LJJJI("platform_profile", "email", extras2);
                    }
                }
            } else if (fragment.getActivity() instanceof SignUpOrLoginActivity) {
                ComplianceServiceProvider.LIZLLL().LJIILL(null);
            }
            if (C13LQ.LJIILLIIL("org_account.pin.management", c0xo2.LJIL) && (((jSONObject2 = c0xo2.LJJII) == null || !jSONObject2.optBoolean("has_org_account_pin")) && !c0xo2.LJIJJLI)) {
                extras.putBoolean("should_setup_pin", true);
            }
            LIZ.getClass();
            switch (C852900Xd2.LIZ[enumC852910Xd3.ordinal()]) {
                case 1:
                case 3:
                case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                case BdTuring.TYPE_SMS_VOICE /* 13 */:
                case 15:
                case 16:
                case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                case LiveToolbarIconStyleSetting.GRAY_WITHOUT_TEXT /* 33 */:
                    str3 = "mobile";
                    break;
                case 5:
                case 6:
                case 19:
                case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                case 22:
                case 23:
                case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                    str3 = "email";
                    break;
            }
            IPrevLoginPlatformService iPrevLoginPlatformService = (IPrevLoginPlatformService) ServiceManager.get().getService(IPrevLoginPlatformService.class);
            if (!Intrinsics.LJFF(iPrevLoginPlatformService.LIZ(c0xo2.LIZ), "username")) {
                iPrevLoginPlatformService.LIZLLL(c0xo2.LIZ, str3);
                iPrevLoginPlatformService.LJIIJ(str3);
            }
            if (!TextUtils.isEmpty(str3)) {
                C786410Ut5.LJJJI("platform", str3, extras);
            }
            mediatorLiveData.postValue(extras);
        }
        if (C0XX7.LIZ() && (iRegionMockService = (IRegionMockService) ServiceManager.get().getService(IRegionMockService.class, false, false)) != null) {
            iRegionMockService.LIZJ();
        }
    }

    public static void LIZIZ(final int i, final Fragment fragment, final EnumC852660Xce enumC852660Xce, final EnumC852910Xd3 enumC852910Xd3, final C0XYD c0xyd, String str, final JSONObject jSONObject) {
        String string;
        boolean z;
        String strOptString;
        String strOptString2;
        String strOptString3;
        String strOptString4;
        C0XQW c852010Xbb;
        Bundle extras;
        final String string2 = str;
        Bundle extras2 = c0xyd.getExtras();
        if (extras2 != null) {
            string = extras2.getString("page");
        } else {
            string = null;
        }
        if ((Intrinsics.LJFF(string, "failed_3p_login") && (extras = c0xyd.getExtras()) != null && extras.getBoolean("is_handling_login_after_failed_3p")) || C0XHD.LIZ.contains(Integer.valueOf(i)) || C0XHD.LIZIZ.contains(Integer.valueOf(i)) || i == 2135) {
            return;
        }
        ((LocalTestApi) ServiceManager.get().getService(LocalTestApi.class)).setIsLoggedIn(false);
        ((IDebugRouterService) ServiceManager.get().getService(IDebugRouterService.class)).LIZ();
        List<InterfaceC586170Myt> list = C0XQ5.LIZ;
        Application application = C0XPY.LIZIZ;
        if (c0xyd.LLJJLIIIJLLLLLLLZ() != EnumC852910Xd3.PHONE_PASSWORD_LOGIN && c0xyd.LLJJLIIIJLLLLLLLZ() != EnumC852910Xd3.PHONE_EMAIL_LOGIN) {
            z = false;
        } else {
            z = true;
        }
        switch (i) {
            case 1001:
                c852010Xbb = new C0XQW(fragment, c0xyd, i, string2) { // from class: X.0XYN
                    public final int LIZJ;
                    public final String LIZLLL;

                    @Override // X.C0XQW
                    public final boolean LIZ() {
                        if (!this.LIZIZ.isViewValid()) {
                            return true;
                        }
                        C0XYD c0xyd2 = this.LIZIZ;
                        int i2 = this.LIZJ;
                        c0xyd2.pn(i2, C849760XVe.LIZIZ(Integer.valueOf(i2), this.LIZLLL));
                        return true;
                    }

                    {
                        this.LIZJ = i;
                        this.LIZLLL = string2;
                    }
                };
                break;
            case 1002:
            case 1003:
                final String string3 = application.getString(2131829357);
                c852010Xbb = new C0XQW(fragment, c0xyd, i, string3) { // from class: X.0XYN
                    public final int LIZJ;
                    public final String LIZLLL;

                    @Override // X.C0XQW
                    public final boolean LIZ() {
                        if (!this.LIZIZ.isViewValid()) {
                            return true;
                        }
                        C0XYD c0xyd2 = this.LIZIZ;
                        int i2 = this.LIZJ;
                        c0xyd2.pn(i2, C849760XVe.LIZIZ(Integer.valueOf(i2), this.LIZLLL));
                        return true;
                    }

                    {
                        this.LIZJ = i;
                        this.LIZLLL = string3;
                    }
                };
                break;
            case 1009:
                if (z) {
                    final String string4 = application.getString(2131829311);
                    c852010Xbb = new C0XQW(fragment, c0xyd, i, string4) { // from class: X.0XYN
                        public final int LIZJ;
                        public final String LIZLLL;

                        @Override // X.C0XQW
                        public final boolean LIZ() {
                            if (!this.LIZIZ.isViewValid()) {
                                return true;
                            }
                            C0XYD c0xyd2 = this.LIZIZ;
                            int i2 = this.LIZJ;
                            c0xyd2.pn(i2, C849760XVe.LIZIZ(Integer.valueOf(i2), this.LIZLLL));
                            return true;
                        }

                        {
                            this.LIZJ = i;
                            this.LIZLLL = string4;
                        }
                    };
                } else if (c0xyd.LLJJLIIIJLLLLLLLZ() != EnumC852910Xd3.EMAIL_PASSWORD_LOGIN && c0xyd.LLJJLIIIJLLLLLLLZ() != EnumC852910Xd3.INPUT_EMAIL_LOGIN) {
                    c852010Xbb = new C0XQW(fragment, c0xyd, i, string2) { // from class: X.0XYN
                        public final int LIZJ;
                        public final String LIZLLL;

                        @Override // X.C0XQW
                        public final boolean LIZ() {
                            if (!this.LIZIZ.isViewValid()) {
                                return true;
                            }
                            C0XYD c0xyd2 = this.LIZIZ;
                            int i2 = this.LIZJ;
                            c0xyd2.pn(i2, C849760XVe.LIZIZ(Integer.valueOf(i2), this.LIZLLL));
                            return true;
                        }

                        {
                            this.LIZJ = i;
                            this.LIZLLL = string2;
                        }
                    };
                } else {
                    final String string5 = application.getString(2131829301);
                    c852010Xbb = new C0XQW(fragment, c0xyd, i, string5) { // from class: X.0XYN
                        public final int LIZJ;
                        public final String LIZLLL;

                        @Override // X.C0XQW
                        public final boolean LIZ() {
                            if (!this.LIZIZ.isViewValid()) {
                                return true;
                            }
                            C0XYD c0xyd2 = this.LIZIZ;
                            int i2 = this.LIZJ;
                            c0xyd2.pn(i2, C849760XVe.LIZIZ(Integer.valueOf(i2), this.LIZLLL));
                            return true;
                        }

                        {
                            this.LIZJ = i;
                            this.LIZLLL = string5;
                        }
                    };
                }
                break;
            case 1011:
                final String str2 = "";
                switch (C852900Xd2.LIZ[c0xyd.LLJJLIIIJLLLLLLLZ().ordinal()]) {
                    case 1:
                    case 2:
                        if (jSONObject != null && (strOptString = jSONObject.optString("sms_code_key")) != null) {
                            str2 = strOptString;
                        }
                        c852010Xbb = new C0XQW(fragment, c0xyd, str2) { // from class: X.0Xb0
                            public final String LIZJ;

                            @Override // X.C0XQW
                            public final boolean LIZ() {
                                C852810Xct c852810Xct = C852810Xct.LIZ;
                                Fragment fragment2 = this.LIZ;
                                c852810Xct.getClass();
                                PhoneNumberUtil.PhoneNumber phoneNumberLJI = C852810Xct.LJI(fragment2);
                                Bundle extras3 = this.LIZIZ.getExtras();
                                if (extras3 == null) {
                                    extras3 = new Bundle();
                                }
                                extras3.putBoolean("phone_signup", true);
                                if (C852810Xct.LIZIZ) {
                                    extras3.putBoolean("finish_activity_after_signup_login", true);
                                }
                                Set<String> set = C1260730iud.LIZ;
                                if (C851730Xb9.LIZIZ()) {
                                    C0XYD c0xyd2 = this.LIZIZ;
                                    Bundle extras4 = c0xyd2.getExtras();
                                    if (extras4 == null) {
                                        extras4 = new Bundle();
                                    }
                                    extras4.putInt("next_page", EnumC852910Xd3.AGE_GATE_SIGN_UP.getValue());
                                    C786410Ut5.LJJJI("sms_code_key", this.LIZJ, extras4);
                                    c0xyd2.fo(extras4);
                                    return true;
                                }
                                C0XZ4 c0xz4 = C0XZ4.LIZ;
                                Fragment fragment3 = this.LIZ;
                                C0XYD c0xyd3 = this.LIZIZ;
                                String strLIZ = PhoneNumberUtil.LIZ(phoneNumberLJI);
                                String str3 = this.LIZJ;
                                EnumC852910Xd3 enumC852910Xd3LLJJLIIIJLLLLLLLZ = this.LIZIZ.LLJJLIIIJLLLLLLLZ();
                                c0xz4.getClass();
                                C0XZ4.LJIJI(fragment3, c0xyd3, strLIZ, str3, enumC852910Xd3LLJJLIIIJLLLLLLLZ, true).LJIILL();
                                return true;
                            }

                            {
                                this.LIZJ = str2;
                            }
                        };
                        break;
                    case 3:
                        if (jSONObject != null && (strOptString2 = jSONObject.optString("sms_code_key")) != null) {
                            str2 = strOptString2;
                        }
                        c852010Xbb = new C852010Xbb(fragment, c0xyd, str2);
                        break;
                    case 4:
                    case 5:
                    case 6:
                        final String string6 = application.getString(2131822988);
                        c852010Xbb = new C0XQW(fragment, c0xyd, i, string6) { // from class: X.0XYN
                            public final int LIZJ;
                            public final String LIZLLL;

                            @Override // X.C0XQW
                            public final boolean LIZ() {
                                if (!this.LIZIZ.isViewValid()) {
                                    return true;
                                }
                                C0XYD c0xyd2 = this.LIZIZ;
                                int i2 = this.LIZJ;
                                c0xyd2.pn(i2, C849760XVe.LIZIZ(Integer.valueOf(i2), this.LIZLLL));
                                return true;
                            }

                            {
                                this.LIZJ = i;
                                this.LIZLLL = string6;
                            }
                        };
                        break;
                    case 7:
                        final String string7 = application.getString(2131829315);
                        c852010Xbb = new C0XQW(fragment, c0xyd, i, string7) { // from class: X.0XYN
                            public final int LIZJ;
                            public final String LIZLLL;

                            @Override // X.C0XQW
                            public final boolean LIZ() {
                                if (!this.LIZIZ.isViewValid()) {
                                    return true;
                                }
                                C0XYD c0xyd2 = this.LIZIZ;
                                int i2 = this.LIZJ;
                                c0xyd2.pn(i2, C849760XVe.LIZIZ(Integer.valueOf(i2), this.LIZLLL));
                                return true;
                            }

                            {
                                this.LIZJ = i;
                                this.LIZLLL = string7;
                            }
                        };
                        break;
                    case 8:
                        Bundle arguments = fragment.getArguments();
                        if (arguments != null && arguments.getBoolean("from_sms_login_only")) {
                            if (jSONObject != null && (strOptString3 = jSONObject.optString("sms_code_key")) != null) {
                                str2 = strOptString3;
                            }
                            c852010Xbb = new C852010Xbb(fragment, c0xyd, str2);
                        } else {
                            c852010Xbb = new C0XQW(fragment, c0xyd, i, string2) { // from class: X.0XYN
                                public final int LIZJ;
                                public final String LIZLLL;

                                @Override // X.C0XQW
                                public final boolean LIZ() {
                                    if (!this.LIZIZ.isViewValid()) {
                                        return true;
                                    }
                                    C0XYD c0xyd2 = this.LIZIZ;
                                    int i2 = this.LIZJ;
                                    c0xyd2.pn(i2, C849760XVe.LIZIZ(Integer.valueOf(i2), this.LIZLLL));
                                    return true;
                                }

                                {
                                    this.LIZJ = i;
                                    this.LIZLLL = string2;
                                }
                            };
                        }
                        break;
                    case BdTuring.TYPE_ECAF /* 9 */:
                        Bundle arguments2 = fragment.getArguments();
                        if (arguments2 != null && arguments2.getBoolean("from_sms_login_only")) {
                            if (jSONObject != null && (strOptString4 = jSONObject.optString("sms_code_key")) != null) {
                                str2 = strOptString4;
                            }
                            c852010Xbb = new C0XQW(fragment, c0xyd, str2) { // from class: X.0Xb0
                                public final String LIZJ;

                                @Override // X.C0XQW
                                public final boolean LIZ() {
                                    C852810Xct c852810Xct = C852810Xct.LIZ;
                                    Fragment fragment2 = this.LIZ;
                                    c852810Xct.getClass();
                                    PhoneNumberUtil.PhoneNumber phoneNumberLJI = C852810Xct.LJI(fragment2);
                                    Bundle extras3 = this.LIZIZ.getExtras();
                                    if (extras3 == null) {
                                        extras3 = new Bundle();
                                    }
                                    extras3.putBoolean("phone_signup", true);
                                    if (C852810Xct.LIZIZ) {
                                        extras3.putBoolean("finish_activity_after_signup_login", true);
                                    }
                                    Set<String> set = C1260730iud.LIZ;
                                    if (C851730Xb9.LIZIZ()) {
                                        C0XYD c0xyd2 = this.LIZIZ;
                                        Bundle extras4 = c0xyd2.getExtras();
                                        if (extras4 == null) {
                                            extras4 = new Bundle();
                                        }
                                        extras4.putInt("next_page", EnumC852910Xd3.AGE_GATE_SIGN_UP.getValue());
                                        C786410Ut5.LJJJI("sms_code_key", this.LIZJ, extras4);
                                        c0xyd2.fo(extras4);
                                        return true;
                                    }
                                    C0XZ4 c0xz4 = C0XZ4.LIZ;
                                    Fragment fragment3 = this.LIZ;
                                    C0XYD c0xyd3 = this.LIZIZ;
                                    String strLIZ = PhoneNumberUtil.LIZ(phoneNumberLJI);
                                    String str3 = this.LIZJ;
                                    EnumC852910Xd3 enumC852910Xd3LLJJLIIIJLLLLLLLZ = this.LIZIZ.LLJJLIIIJLLLLLLLZ();
                                    c0xz4.getClass();
                                    C0XZ4.LJIJI(fragment3, c0xyd3, strLIZ, str3, enumC852910Xd3LLJJLIIIJLLLLLLLZ, true).LJIILL();
                                    return true;
                                }

                                {
                                    this.LIZJ = str2;
                                }
                            };
                        } else {
                            c852010Xbb = new C0XQW(fragment, c0xyd, i, string2) { // from class: X.0XYN
                                public final int LIZJ;
                                public final String LIZLLL;

                                @Override // X.C0XQW
                                public final boolean LIZ() {
                                    if (!this.LIZIZ.isViewValid()) {
                                        return true;
                                    }
                                    C0XYD c0xyd2 = this.LIZIZ;
                                    int i2 = this.LIZJ;
                                    c0xyd2.pn(i2, C849760XVe.LIZIZ(Integer.valueOf(i2), this.LIZLLL));
                                    return true;
                                }

                                {
                                    this.LIZJ = i;
                                    this.LIZLLL = string2;
                                }
                            };
                        }
                        break;
                    default:
                        c852010Xbb = new C0XQW(fragment, c0xyd, i, string2) { // from class: X.0XYN
                            public final int LIZJ;
                            public final String LIZLLL;

                            @Override // X.C0XQW
                            public final boolean LIZ() {
                                if (!this.LIZIZ.isViewValid()) {
                                    return true;
                                }
                                C0XYD c0xyd2 = this.LIZIZ;
                                int i2 = this.LIZJ;
                                c0xyd2.pn(i2, C849760XVe.LIZIZ(Integer.valueOf(i2), this.LIZLLL));
                                return true;
                            }

                            {
                                this.LIZJ = i;
                                this.LIZLLL = string2;
                            }
                        };
                        break;
                }
                break;
            case 1023:
                final String string8 = application.getString(2131833857);
                c852010Xbb = new C0XQW(fragment, c0xyd, i, string8) { // from class: X.0XYN
                    public final int LIZJ;
                    public final String LIZLLL;

                    @Override // X.C0XQW
                    public final boolean LIZ() {
                        if (!this.LIZIZ.isViewValid()) {
                            return true;
                        }
                        C0XYD c0xyd2 = this.LIZIZ;
                        int i2 = this.LIZJ;
                        c0xyd2.pn(i2, C849760XVe.LIZIZ(Integer.valueOf(i2), this.LIZLLL));
                        return true;
                    }

                    {
                        this.LIZJ = i;
                        this.LIZLLL = string8;
                    }
                };
                break;
            case 1024:
            case 1028:
                final String string9 = application.getString(2131829375);
                c852010Xbb = new C0XQW(fragment, c0xyd, i, string9) { // from class: X.0XYN
                    public final int LIZJ;
                    public final String LIZLLL;

                    @Override // X.C0XQW
                    public final boolean LIZ() {
                        if (!this.LIZIZ.isViewValid()) {
                            return true;
                        }
                        C0XYD c0xyd2 = this.LIZIZ;
                        int i2 = this.LIZJ;
                        c0xyd2.pn(i2, C849760XVe.LIZIZ(Integer.valueOf(i2), this.LIZLLL));
                        return true;
                    }

                    {
                        this.LIZJ = i;
                        this.LIZLLL = string9;
                    }
                };
                break;
            case 1027:
                final String string10 = application.getString(2131829376);
                c852010Xbb = new C0XQW(fragment, c0xyd, i, string10) { // from class: X.0XYN
                    public final int LIZJ;
                    public final String LIZLLL;

                    @Override // X.C0XQW
                    public final boolean LIZ() {
                        if (!this.LIZIZ.isViewValid()) {
                            return true;
                        }
                        C0XYD c0xyd2 = this.LIZIZ;
                        int i2 = this.LIZJ;
                        c0xyd2.pn(i2, C849760XVe.LIZIZ(Integer.valueOf(i2), this.LIZLLL));
                        return true;
                    }

                    {
                        this.LIZJ = i;
                        this.LIZLLL = string10;
                    }
                };
                break;
            case 1033:
            case 1034:
                c852010Xbb = new C0XQW(fragment, c0xyd, i, string2) { // from class: X.0XYN
                    public final int LIZJ;
                    public final String LIZLLL;

                    @Override // X.C0XQW
                    public final boolean LIZ() {
                        if (!this.LIZIZ.isViewValid()) {
                            return true;
                        }
                        C0XYD c0xyd2 = this.LIZIZ;
                        int i2 = this.LIZJ;
                        c0xyd2.pn(i2, C849760XVe.LIZIZ(Integer.valueOf(i2), this.LIZLLL));
                        return true;
                    }

                    {
                        this.LIZJ = i;
                        this.LIZLLL = string2;
                    }
                };
                break;
            case 1039:
                C852810Xct.LIZ.getClass();
                final PhoneNumberUtil.PhoneNumber phoneNumberLJII = C852810Xct.LJII(fragment.getArguments());
                if (z && phoneNumberLJII != null) {
                    c852010Xbb = new C0XQW(fragment, c0xyd, phoneNumberLJII, enumC852660Xce, enumC852910Xd3) { // from class: X.0XaD
                        public final PhoneNumberUtil.PhoneNumber LIZJ;
                        public final EnumC852660Xce LIZLLL;
                        public final EnumC852910Xd3 LJ;

                        @Override // X.C0XQW
                        public final boolean LIZ() {
                            C1237220iIi c1237220iIi;
                            C851370XaZ c851370XaZLIZ = C851360XaY.LIZ(this.LIZ.getActivity(), PhoneNumberUtil.LIZ(this.LIZJ), this.LIZLLL);
                            if (c851370XaZLIZ == null || (c1237220iIi = c851370XaZLIZ.LIZ) == null || !c1237220iIi.LIZIZ()) {
                                C0XZ4 c0xz4 = C0XZ4.LIZ;
                                Fragment fragment2 = this.LIZ;
                                C0XYD c0xyd2 = this.LIZIZ;
                                String strLIZ = PhoneNumberUtil.LIZ(this.LIZJ);
                                EnumC852660Xce enumC852660Xce2 = this.LIZLLL;
                                EnumC852910Xd3 enumC852910Xd32 = this.LJ;
                                c0xz4.getClass();
                                C0XZ4.LJJIIZ(fragment2, c0xyd2, strLIZ, enumC852660Xce2, enumC852910Xd32, "", "auto_system", null).LJIIIIZZ(new AfS182S0100000_13(this, 3)).LJIILL();
                                return true;
                            }
                            C0XYD c0xyd3 = this.LIZIZ;
                            Bundle arguments3 = this.LIZ.getArguments();
                            if (arguments3 == null) {
                                arguments3 = new Bundle();
                            }
                            arguments3.putInt("next_page", EnumC852910Xd3.PHONE_SMS_LOGIN.getValue());
                            arguments3.putBoolean("code_sent", false);
                            arguments3.putBoolean("bind_secure", true);
                            c0xyd3.fo(arguments3);
                            return true;
                        }

                        {
                            this.LIZJ = phoneNumberLJII;
                            this.LIZLLL = enumC852660Xce;
                            this.LJ = enumC852910Xd3;
                        }
                    };
                } else {
                    c852010Xbb = new C0XQW(fragment, c0xyd, i, string2) { // from class: X.0XYN
                        public final int LIZJ;
                        public final String LIZLLL;

                        @Override // X.C0XQW
                        public final boolean LIZ() {
                            if (!this.LIZIZ.isViewValid()) {
                                return true;
                            }
                            C0XYD c0xyd2 = this.LIZIZ;
                            int i2 = this.LIZJ;
                            c0xyd2.pn(i2, C849760XVe.LIZIZ(Integer.valueOf(i2), this.LIZLLL));
                            return true;
                        }

                        {
                            this.LIZJ = i;
                            this.LIZLLL = string2;
                        }
                    };
                }
                break;
            case 1051:
                final String string11 = application.getString(2131829353);
                c852010Xbb = new C0XQW(fragment, c0xyd, i, string11) { // from class: X.0XYN
                    public final int LIZJ;
                    public final String LIZLLL;

                    @Override // X.C0XQW
                    public final boolean LIZ() {
                        if (!this.LIZIZ.isViewValid()) {
                            return true;
                        }
                        C0XYD c0xyd2 = this.LIZIZ;
                        int i2 = this.LIZJ;
                        c0xyd2.pn(i2, C849760XVe.LIZIZ(Integer.valueOf(i2), this.LIZLLL));
                        return true;
                    }

                    {
                        this.LIZJ = i;
                        this.LIZLLL = string11;
                    }
                };
                break;
            case 1053:
                final String string12 = application.getString(2131857417);
                c852010Xbb = new C0XQW(fragment, c0xyd, i, string12) { // from class: X.0XYN
                    public final int LIZJ;
                    public final String LIZLLL;

                    @Override // X.C0XQW
                    public final boolean LIZ() {
                        if (!this.LIZIZ.isViewValid()) {
                            return true;
                        }
                        C0XYD c0xyd2 = this.LIZIZ;
                        int i2 = this.LIZJ;
                        c0xyd2.pn(i2, C849760XVe.LIZIZ(Integer.valueOf(i2), this.LIZLLL));
                        return true;
                    }

                    {
                        this.LIZJ = i;
                        this.LIZLLL = string12;
                    }
                };
                break;
            case 1054:
                final String string13 = application.getString(2131829320);
                c852010Xbb = new C0XQW(fragment, c0xyd, i, string13) { // from class: X.0XYN
                    public final int LIZJ;
                    public final String LIZLLL;

                    @Override // X.C0XQW
                    public final boolean LIZ() {
                        if (!this.LIZIZ.isViewValid()) {
                            return true;
                        }
                        C0XYD c0xyd2 = this.LIZIZ;
                        int i2 = this.LIZJ;
                        c0xyd2.pn(i2, C849760XVe.LIZIZ(Integer.valueOf(i2), this.LIZLLL));
                        return true;
                    }

                    {
                        this.LIZJ = i;
                        this.LIZLLL = string13;
                    }
                };
                break;
            case 1075:
            case 1430:
                c852010Xbb = new C0XYM(i, fragment, enumC852660Xce, enumC852910Xd3, c0xyd, string2, jSONObject);
                break;
            case 1202:
                final String string14 = application.getString(2131829358);
                c852010Xbb = new C0XQW(fragment, c0xyd, i, string14) { // from class: X.0XYN
                    public final int LIZJ;
                    public final String LIZLLL;

                    @Override // X.C0XQW
                    public final boolean LIZ() {
                        if (!this.LIZIZ.isViewValid()) {
                            return true;
                        }
                        C0XYD c0xyd2 = this.LIZIZ;
                        int i2 = this.LIZJ;
                        c0xyd2.pn(i2, C849760XVe.LIZIZ(Integer.valueOf(i2), this.LIZLLL));
                        return true;
                    }

                    {
                        this.LIZJ = i;
                        this.LIZLLL = string14;
                    }
                };
                break;
            case 1203:
                if (string2.length() == 0) {
                    string2 = application.getString(2131837641);
                }
                c852010Xbb = new C0XQW(fragment, c0xyd, i, string2) { // from class: X.0XYN
                    public final int LIZJ;
                    public final String LIZLLL;

                    @Override // X.C0XQW
                    public final boolean LIZ() {
                        if (!this.LIZIZ.isViewValid()) {
                            return true;
                        }
                        C0XYD c0xyd2 = this.LIZIZ;
                        int i2 = this.LIZJ;
                        c0xyd2.pn(i2, C849760XVe.LIZIZ(Integer.valueOf(i2), this.LIZLLL));
                        return true;
                    }

                    {
                        this.LIZJ = i;
                        this.LIZLLL = string2;
                    }
                };
                break;
            case 1320:
                c852010Xbb = new C852020Xbc(fragment, c0xyd, i, string2);
                break;
            case 1356:
                final String string15 = application.getString(2131857420);
                c852010Xbb = new C0XQW(fragment, c0xyd, i, string15) { // from class: X.0XYN
                    public final int LIZJ;
                    public final String LIZLLL;

                    @Override // X.C0XQW
                    public final boolean LIZ() {
                        if (!this.LIZIZ.isViewValid()) {
                            return true;
                        }
                        C0XYD c0xyd2 = this.LIZIZ;
                        int i2 = this.LIZJ;
                        c0xyd2.pn(i2, C849760XVe.LIZIZ(Integer.valueOf(i2), this.LIZLLL));
                        return true;
                    }

                    {
                        this.LIZJ = i;
                        this.LIZLLL = string15;
                    }
                };
                break;
            case 1381:
                C0XYP c0xyp = new C0XYP(fragment, c0xyd, jSONObject);
                boolean z2 = c0xyp.LIZJ.LIZLLL;
                c852010Xbb = c0xyp;
                if (!z2) {
                    final String string16 = application.getString(2131834217);
                    c852010Xbb = new C0XQW(fragment, c0xyd, i, string16) { // from class: X.0XYN
                        public final int LIZJ;
                        public final String LIZLLL;

                        @Override // X.C0XQW
                        public final boolean LIZ() {
                            if (!this.LIZIZ.isViewValid()) {
                                return true;
                            }
                            C0XYD c0xyd2 = this.LIZIZ;
                            int i2 = this.LIZJ;
                            c0xyd2.pn(i2, C849760XVe.LIZIZ(Integer.valueOf(i2), this.LIZLLL));
                            return true;
                        }

                        {
                            this.LIZJ = i;
                            this.LIZLLL = string16;
                        }
                    };
                }
                break;
            case 1382:
                final String string17 = application.getString(2131829650);
                c852010Xbb = new C0XQW(fragment, c0xyd, i, string17) { // from class: X.0XYN
                    public final int LIZJ;
                    public final String LIZLLL;

                    @Override // X.C0XQW
                    public final boolean LIZ() {
                        if (!this.LIZIZ.isViewValid()) {
                            return true;
                        }
                        C0XYD c0xyd2 = this.LIZIZ;
                        int i2 = this.LIZJ;
                        c0xyd2.pn(i2, C849760XVe.LIZIZ(Integer.valueOf(i2), this.LIZLLL));
                        return true;
                    }

                    {
                        this.LIZJ = i;
                        this.LIZLLL = string17;
                    }
                };
                break;
            case 1383:
                final String string18 = application.getString(2131829651);
                c852010Xbb = new C0XQW(fragment, c0xyd, i, string18) { // from class: X.0XYN
                    public final int LIZJ;
                    public final String LIZLLL;

                    @Override // X.C0XQW
                    public final boolean LIZ() {
                        if (!this.LIZIZ.isViewValid()) {
                            return true;
                        }
                        C0XYD c0xyd2 = this.LIZIZ;
                        int i2 = this.LIZJ;
                        c0xyd2.pn(i2, C849760XVe.LIZIZ(Integer.valueOf(i2), this.LIZLLL));
                        return true;
                    }

                    {
                        this.LIZJ = i;
                        this.LIZLLL = string18;
                    }
                };
                break;
            case 1388:
                C2344009Gk c2344009Gk = new C2344009Gk();
                c2344009Gk.LJIIIIZZ("enter_from", "missing_birthday");
                C20684815ws.LJIILLIIL("pns_analysis_event", c2344009Gk.LIZ);
                c852010Xbb = new C0XQW(fragment, c0xyd, string2) { // from class: X.0XVf
                    public final String LIZJ;

                    @Override // X.C0XQW
                    public final boolean LIZ() {
                        C844470XAv.LIZ.getClass();
                        C1233040iBy c1233040iBy = new C1233040iBy(C844470XAv.LIZ());
                        c1233040iBy.LIZJ(this.LIZJ);
                        c1233040iBy.LIZLLL();
                        this.LIZ.requireActivity().finish();
                        return true;
                    }

                    {
                        this.LIZJ = string2;
                    }
                };
                break;
            case 1450:
                c852010Xbb = new C0XQW(fragment, c0xyd, jSONObject) { // from class: X.0XQV
                    public final JSONObject LIZJ;

                    @Override // X.C0XQW
                    public final boolean LIZ() {
                        if (this.LIZJ == null) {
                            return false;
                        }
                        C0XQF.LIZ = new WeakReference<>(this.LIZ);
                        C0XQF.LIZIZ = new WeakReference<>(this.LIZIZ);
                        String strOptString5 = this.LIZJ.optString("webapp_url");
                        if (TextUtils.isEmpty(strOptString5)) {
                            return false;
                        }
                        SmartRouter.buildRoute(this.LIZ.getActivity(), strOptString5).open();
                        return true;
                    }

                    {
                        this.LIZJ = jSONObject;
                    }
                };
                break;
            case 2003:
            case 2004:
                if (c0xyd.scene() != EnumC852660Xce.BIND_PHONE && c0xyd.scene() != EnumC852660Xce.MODIFY_PHONE) {
                    c852010Xbb = new C0XQW(fragment, c0xyd, i, string2) { // from class: X.0XYN
                        public final int LIZJ;
                        public final String LIZLLL;

                        @Override // X.C0XQW
                        public final boolean LIZ() {
                            if (!this.LIZIZ.isViewValid()) {
                                return true;
                            }
                            C0XYD c0xyd2 = this.LIZIZ;
                            int i2 = this.LIZJ;
                            c0xyd2.pn(i2, C849760XVe.LIZIZ(Integer.valueOf(i2), this.LIZLLL));
                            return true;
                        }

                        {
                            this.LIZJ = i;
                            this.LIZLLL = string2;
                        }
                    };
                } else {
                    final String string19 = application.getString(2131847698);
                    c852010Xbb = new C0XQW(fragment, c0xyd, i, string19) { // from class: X.0XYN
                        public final int LIZJ;
                        public final String LIZLLL;

                        @Override // X.C0XQW
                        public final boolean LIZ() {
                            if (!this.LIZIZ.isViewValid()) {
                                return true;
                            }
                            C0XYD c0xyd2 = this.LIZIZ;
                            int i2 = this.LIZJ;
                            c0xyd2.pn(i2, C849760XVe.LIZIZ(Integer.valueOf(i2), this.LIZLLL));
                            return true;
                        }

                        {
                            this.LIZJ = i;
                            this.LIZLLL = string19;
                        }
                    };
                }
                break;
            case 2006:
                if (enumC852660Xce == EnumC852660Xce.RECOVER_ACCOUNT) {
                    final String string20 = application.getString(2131845875);
                    c852010Xbb = new C0XQW(fragment, c0xyd, i, string20) { // from class: X.0XYN
                        public final int LIZJ;
                        public final String LIZLLL;

                        @Override // X.C0XQW
                        public final boolean LIZ() {
                            if (!this.LIZIZ.isViewValid()) {
                                return true;
                            }
                            C0XYD c0xyd2 = this.LIZIZ;
                            int i2 = this.LIZJ;
                            c0xyd2.pn(i2, C849760XVe.LIZIZ(Integer.valueOf(i2), this.LIZLLL));
                            return true;
                        }

                        {
                            this.LIZJ = i;
                            this.LIZLLL = string20;
                        }
                    };
                } else {
                    c852010Xbb = new C0XQW(fragment, c0xyd, i, string2) { // from class: X.0XYN
                        public final int LIZJ;
                        public final String LIZLLL;

                        @Override // X.C0XQW
                        public final boolean LIZ() {
                            if (!this.LIZIZ.isViewValid()) {
                                return true;
                            }
                            C0XYD c0xyd2 = this.LIZIZ;
                            int i2 = this.LIZJ;
                            c0xyd2.pn(i2, C849760XVe.LIZIZ(Integer.valueOf(i2), this.LIZLLL));
                            return true;
                        }

                        {
                            this.LIZJ = i;
                            this.LIZLLL = string2;
                        }
                    };
                }
                break;
            case 2013:
                c852010Xbb = new C0XQW(fragment, c0xyd, jSONObject) { // from class: X.0XaC
                    public final JSONObject LIZJ;

                    @Override // X.C0XQW
                    public final boolean LIZ() {
                        C1237220iIi c1237220iIi;
                        JSONObject jSONObject2 = this.LIZJ;
                        if (jSONObject2 != null) {
                            String string21 = JSONObjectProtectorUtils.getString(jSONObject2, "email");
                            String string22 = JSONObjectProtectorUtils.getString(this.LIZJ, "password");
                            if (!TextUtils.isEmpty(string21) && !TextUtils.isEmpty(string22)) {
                                C851370XaZ c851370XaZLIZ = C851360XaY.LIZ(this.LIZ.getActivity(), string21, EnumC852660Xce.SIGN_UP);
                                if (c851370XaZLIZ != null && (c1237220iIi = c851370XaZLIZ.LIZ) != null && c1237220iIi.LIZIZ()) {
                                    C0XYD c0xyd2 = this.LIZIZ;
                                    Bundle arguments3 = this.LIZ.getArguments();
                                    if (arguments3 == null) {
                                        arguments3 = new Bundle();
                                    }
                                    arguments3.putBoolean("code_sent", false);
                                    arguments3.putInt("next_page", EnumC852910Xd3.EMAIL_SMS_SIGN_UP.getValue());
                                    C786410Ut5.LJJJI("password", string22, arguments3);
                                    c0xyd2.fo(arguments3);
                                    return true;
                                }
                                C0XZ4.LJJIII(C0XZ4.LIZ, this.LIZ, this.LIZIZ, string21, 1, "auto_system", null, string22, null, null, null, 896).LJIIIIZZ(new AfS46S1100000_13(this, string22, 0)).LJIILL();
                            }
                        }
                        return true;
                    }

                    {
                        this.LIZJ = jSONObject;
                    }
                };
                break;
            case 2015:
                c852010Xbb = new C0XQW(fragment, enumC852660Xce, enumC852910Xd3, c0xyd) { // from class: X.0XYT
                    public final EnumC852660Xce LIZJ;
                    public final EnumC852910Xd3 LIZLLL;

                    @Override // X.C0XQW
                    public final boolean LIZ() {
                        Serializable serializable;
                        Bundle arguments3 = this.LIZ.getArguments();
                        if (arguments3 == null || (serializable = arguments3.getSerializable("phone_number")) == null) {
                            return true;
                        }
                        C0XZ4 c0xz4 = C0XZ4.LIZ;
                        Fragment fragment2 = this.LIZ;
                        C0XYD c0xyd2 = this.LIZIZ;
                        String strLIZ = PhoneNumberUtil.LIZ((PhoneNumberUtil.PhoneNumber) serializable);
                        EnumC852660Xce enumC852660Xce2 = this.LIZJ;
                        EnumC852910Xd3 enumC852910Xd32 = this.LIZLLL;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        c0xz4.getClass();
                        C0XZ4.LJJIJIIJI(fragment2, c0xyd2, strLIZ, false, enumC852660Xce2, enumC852910Xd32, "anti_spam", linkedHashMap).LJIILL();
                        return true;
                    }

                    {
                        this.LIZJ = enumC852660Xce;
                        this.LIZLLL = enumC852910Xd3;
                    }
                };
                break;
            case 2027:
            case 2028:
                if (TextUtils.isEmpty(string2)) {
                    string2 = application.getString(2131836834);
                }
                c852010Xbb = new C0XQW(fragment, c0xyd, i, string2) { // from class: X.0XYN
                    public final int LIZJ;
                    public final String LIZLLL;

                    @Override // X.C0XQW
                    public final boolean LIZ() {
                        if (!this.LIZIZ.isViewValid()) {
                            return true;
                        }
                        C0XYD c0xyd2 = this.LIZIZ;
                        int i2 = this.LIZJ;
                        c0xyd2.pn(i2, C849760XVe.LIZIZ(Integer.valueOf(i2), this.LIZLLL));
                        return true;
                    }

                    {
                        this.LIZJ = i;
                        this.LIZLLL = string2;
                    }
                };
                break;
            case 2037:
                c852010Xbb = new C0XQW(fragment, c0xyd) { // from class: X.0XYV
                    @Override // X.C0XQW
                    public final boolean LIZ() {
                        Context context = this.LIZ.getContext();
                        String strLJJLIIIJJI = this.LIZIZ.getMobParams().LJJLIIIJJI();
                        String strLLIIJI = this.LIZIZ.getMobParams().LLIIJI();
                        if (context != null) {
                            if (TextUtils.isEmpty(strLJJLIIIJJI)) {
                                strLJJLIIIJJI = "";
                            }
                            if (TextUtils.isEmpty(strLLIIJI)) {
                                strLLIIJI = "";
                            }
                            C0XGR c0xgr = new C0XGR();
                            c0xgr.LIZLLL("enter_method", strLLIIJI);
                            c0xgr.LIZLLL("enter_from", strLJJLIIIJJI);
                            C20684815ws.LJIILLIIL("click_feedback_entrance", c0xgr.LIZ);
                            try {
                                String normalEntry = C0CLW.LIZIZ.LIZ.getFeedbackConf().getNormalEntry();
                                if (normalEntry != null) {
                                    C19724912Fj.LIZLLL().LJII(normalEntry);
                                    return true;
                                }
                                C0XI4 c0xi4 = new C0XI4("https://www.tiktok.com/falcon/tiktok_rn_web/feedback/?hide_nav_bar=1");
                                c0xi4.LJ("enter_from", strLJJLIIIJJI);
                                List<InterfaceC586170Myt> list2 = C0XQ5.LIZ;
                                c0xi4.LJ("locale", ((ILanguageService) C0XPY.LIZIZ(ILanguageService.class)).getAppLanguage());
                                ((IWebViewService) C0XPY.LIZIZ(IWebViewService.class)).LIZ(context, c0xi4.LJFF(), true);
                                return true;
                            } catch (Exception e) {
                                TryCatchGuardChecker.doCheck(e);
                                C0XI4 c0xi42 = new C0XI4("https://www.tiktok.com/falcon/tiktok_rn_web/feedback/?hide_nav_bar=1");
                                c0xi42.LJ("enter_from", strLJJLIIIJJI);
                                List<InterfaceC586170Myt> list3 = C0XQ5.LIZ;
                                c0xi42.LJ("locale", ((ILanguageService) C0XPY.LIZIZ(ILanguageService.class)).getAppLanguage());
                                ((IWebViewService) C0XPY.LIZIZ(IWebViewService.class)).LIZ(context, c0xi42.LJFF(), true);
                            }
                        }
                        return true;
                    }
                };
                break;
            case 2100:
                c852010Xbb = new C0XQW(fragment, c0xyd, i, string2) { // from class: X.0XYR
                    public static final /* synthetic */ int LJ = 0;
                    public final int LIZJ;
                    public final String LIZLLL;

                    @Override // X.C0XQW
                    public final boolean LIZ() {
                        boolean zLIZ;
                        C19EG activity = this.LIZ.getActivity();
                        if (activity != null) {
                            C0XYD c0xyd2 = this.LIZIZ;
                            Bundle arguments3 = this.LIZ.getArguments();
                            if (arguments3 == null) {
                                arguments3 = new Bundle();
                            }
                            zLIZ = C851220XaK.LIZ(c0xyd2, activity, arguments3);
                            if (!zLIZ) {
                            }
                            return zLIZ;
                        }
                        zLIZ = false;
                        this.LIZIZ.pn(this.LIZJ, this.LIZLLL);
                        return zLIZ;
                    }

                    {
                        this.LIZJ = i;
                        this.LIZLLL = string2;
                    }
                };
                break;
            case 8038:
                c852010Xbb = new C0XQW(fragment, c0xyd, jSONObject) { // from class: X.0XYQ
                    public final JSONObject LIZJ;

                    @Override // X.C0XQW
                    public final boolean LIZ() {
                        if (this.LIZJ == null) {
                            return false;
                        }
                        C0XYD c0xyd2 = this.LIZIZ;
                        Bundle arguments3 = this.LIZ.getArguments();
                        if (arguments3 == null) {
                            arguments3 = new Bundle();
                        }
                        arguments3.putInt("previous_page", this.LIZIZ.LLJJLIIIJLLLLLLLZ().getValue());
                        arguments3.putInt("next_page", EnumC852910Xd3.ACCOUNT_SELECTIONS.getValue());
                        C786410Ut5.LJJJI("account_selections_data", C786410Ut5.J3(this.LIZJ), arguments3);
                        c0xyd2.fo(arguments3);
                        return true;
                    }

                    {
                        this.LIZJ = jSONObject;
                    }
                };
                break;
            case 15000:
            case 15001:
                if (string2.length() == 0) {
                    string2 = application.getString(2131834217);
                }
                c852010Xbb = new C0XQW(fragment, c0xyd, i, string2) { // from class: X.0XYN
                    public final int LIZJ;
                    public final String LIZLLL;

                    @Override // X.C0XQW
                    public final boolean LIZ() {
                        if (!this.LIZIZ.isViewValid()) {
                            return true;
                        }
                        C0XYD c0xyd2 = this.LIZIZ;
                        int i2 = this.LIZJ;
                        c0xyd2.pn(i2, C849760XVe.LIZIZ(Integer.valueOf(i2), this.LIZLLL));
                        return true;
                    }

                    {
                        this.LIZJ = i;
                        this.LIZLLL = string2;
                    }
                };
                break;
            case 18000:
                final String string21 = application.getString(2131839099);
                c852010Xbb = new C0XQW(fragment, c0xyd, i, string21) { // from class: X.0XYN
                    public final int LIZJ;
                    public final String LIZLLL;

                    @Override // X.C0XQW
                    public final boolean LIZ() {
                        if (!this.LIZIZ.isViewValid()) {
                            return true;
                        }
                        C0XYD c0xyd2 = this.LIZIZ;
                        int i2 = this.LIZJ;
                        c0xyd2.pn(i2, C849760XVe.LIZIZ(Integer.valueOf(i2), this.LIZLLL));
                        return true;
                    }

                    {
                        this.LIZJ = i;
                        this.LIZLLL = string21;
                    }
                };
                break;
            default:
                c852010Xbb = new C0XQW(fragment, c0xyd, i, string2) { // from class: X.0XYN
                    public final int LIZJ;
                    public final String LIZLLL;

                    @Override // X.C0XQW
                    public final boolean LIZ() {
                        if (!this.LIZIZ.isViewValid()) {
                            return true;
                        }
                        C0XYD c0xyd2 = this.LIZIZ;
                        int i2 = this.LIZJ;
                        c0xyd2.pn(i2, C849760XVe.LIZIZ(Integer.valueOf(i2), this.LIZLLL));
                        return true;
                    }

                    {
                        this.LIZJ = i;
                        this.LIZLLL = string2;
                    }
                };
                break;
        }
        c852010Xbb.LIZ();
    }

    public static void LIZLLL(C0XYO c0xyo, Activity activity, JSONObject jSONObject, C0XO2 c0xo2, boolean z, Bundle bundle, boolean z2, int i) {
        String str;
        Intent intent;
        Object objOpt;
        IRegionMockService iRegionMockService;
        IRegionMockService iRegionMockService2;
        Bundle bundle2;
        C0XO3 c0xo3;
        Bundle bundle3 = bundle;
        if ((i & 32) != 0) {
            bundle3 = null;
        }
        if ((i & 64) != 0) {
            z2 = false;
        }
        c0xyo.getClass();
        C847910XOb c847910XOb = C847910XOb.LIZ;
        String str2 = c0xo2.LJFF;
        if ((c0xo2 instanceof C0XO3) && (c0xo3 = (C0XO3) c0xo2) != null) {
            str = c0xo3.LJJIJ;
        } else {
            str = null;
        }
        c847910XOb.getClass();
        C847910XOb.LIZ(str2, str);
        C0XQ5.LJIIL(c0xo2, "login");
        AccountRetrofitInetcept.LL.getClass();
        AccountRetrofitInetcept.LLILLJJLI = "";
        if (activity != null) {
            intent = activity.getIntent();
        } else {
            intent = null;
        }
        Bundle bundle4 = new Bundle();
        if (intent != null) {
            try {
                Bundle extras = intent.getExtras();
                if (extras != null) {
                    C786410Ut5.LJJIIJZLJL(bundle4, extras);
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        if (bundle3 != null) {
            C786410Ut5.LJJIIJZLJL(bundle4, bundle3);
        }
        if (jSONObject != null) {
            objOpt = jSONObject.opt("arguments");
        } else {
            objOpt = null;
        }
        if ((objOpt instanceof Bundle) && (bundle2 = (Bundle) objOpt) != null) {
            if (!c0xo2.LJIILL) {
                LJI(bundle2, c0xo2);
            } else {
                C0XUE.LIZ.LJIIIIZZ(String.valueOf(c0xo2.LIZ), false);
            }
        } else if (C293990Bfh.LIZ() && !c0xo2.LJIILL && !z2) {
            C0XUE c0xue = C0XUE.LIZ;
            String strLIZLLL = C0XQ5.LIZLLL();
            Long lValueOf = Long.valueOf(System.currentTimeMillis());
            String str3 = c0xo2.LJJIFFI;
            String str4 = c0xo2.LJIIIZ;
            String str5 = c0xo2.LJIIJ;
            LoginMethodName loginMethodName = LoginMethodName.DEFAULT;
            CommonUserInfo.Companion.getClass();
            c0xue.LJI(new BaseLoginMethod(strLIZLLL, loginMethodName, C0XTZ.LIZ(), new Date(System.currentTimeMillis() + 31536000000L), lValueOf, -1L, Boolean.FALSE, Boolean.FALSE, null, null, Boolean.FALSE, str3, str4, str5), true);
        }
        LJFF(bundle4, c0xo2);
        if (C293980Bfg.LIZIZ()) {
            C849800XVi.LIZIZ(new C0XVI(bundle4, c0xo2, false), C0NQH.LIZ(AfterLoginHook.LIZ, null, null, new C0XW0(activity, null, z), 7));
            if (C0XX7.LIZ() && (iRegionMockService2 = (IRegionMockService) PluggableExtentionKt.pluggableSpi$default(IRegionMockService.class, false, false, false, 14, null)) != null) {
                iRegionMockService2.LIZJ();
            }
            ILoginServiceAppDiff iLoginServiceAppDiff = (ILoginServiceAppDiff) PluggableExtentionKt.pluggableSpi$default(ILoginServiceAppDiff.class, false, false, false, 14, null);
            if (iLoginServiceAppDiff != null) {
                iLoginServiceAppDiff.handleLoginSuccess(activity);
                return;
            }
            return;
        }
        C849800XVi.LIZ(bundle4, new AwS100S0110000_13(activity, z, 0));
        if (C0XX7.LIZ() && (iRegionMockService = (IRegionMockService) ServiceManager.get().getService(IRegionMockService.class, false, false)) != null) {
            iRegionMockService.LIZJ();
        }
        ILoginServiceAppDiff iLoginServiceAppDiff2 = (ILoginServiceAppDiff) PluggableExtentionKt.pluggableSpi$default(ILoginServiceAppDiff.class, false, false, false, 14, null);
        if (iLoginServiceAppDiff2 == null) {
            return;
        }
        iLoginServiceAppDiff2.handleLoginSuccess(activity);
    }
}
