package X;

import android.os.Bundle;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.account.login.utils.PhoneNumberUtil;
import com.ss.android.ugc.aweme.account.login.v2.ui.fragments.SignUpTermsConsentFragment;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0iLO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class C1238880iLO extends C2217421BqW implements Function0<Unit> {
    public C1238880iLO(Object obj) {
        super(0, obj, SignUpTermsConsentFragment.class, "onNextAction", "onNextAction()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        Bundle arguments;
        SignUpTermsConsentFragment signUpTermsConsentFragment = (SignUpTermsConsentFragment) this.receiver;
        signUpTermsConsentFragment.RS(signUpTermsConsentFragment.LLLJIL ? 2 : 1);
        if (signUpTermsConsentFragment.LLLILZ) {
            signUpTermsConsentFragment.getContext();
            try {
                if (C036E.LIZ.LIZIZ()) {
                    signUpTermsConsentFragment.LLLILZLLLI = -1;
                    signUpTermsConsentFragment.NS();
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
            C1389890mGx c1389890mGx = new C1389890mGx(signUpTermsConsentFragment);
            c1389890mGx.LJIIIZ(2131837962);
            c1389890mGx.LJIIJJI();
            return Unit.LIZ;
        }
        if (signUpTermsConsentFragment.VR() == EnumC852910Xd3.TERMS_CONSENT_SIGN_UP) {
            Bundle bundleRequireArguments = signUpTermsConsentFragment.requireArguments();
            int i = bundleRequireArguments.getInt("previous_page", EnumC852910Xd3.NONE.getValue());
            boolean z = bundleRequireArguments.getBoolean("check_kr_consent", false);
            if (i == EnumC852910Xd3.INPUT_PHONE_SIGN_UP.getValue() && z) {
                bundleRequireArguments.putInt("next_page", EnumC852910Xd3.PHONE_SMS_SIGN_UP.getValue());
                bundleRequireArguments.putBoolean("check_kr_consent", false);
            } else {
                bundleRequireArguments.putInt("next_page", EnumC852910Xd3.PHONE_EMAIL_SIGN_UP.getValue());
            }
            signUpTermsConsentFragment.fo(bundleRequireArguments);
        } else if (signUpTermsConsentFragment.VR() == EnumC852910Xd3.TERMS_CONSENT_NEW_PHONE_USER) {
            Set<String> set = C1260730iud.LIZ;
            if (!C851730Xb9.LIZIZ() || ((arguments = signUpTermsConsentFragment.getArguments()) != null && arguments.getInt("previous_page", -1) == EnumC852910Xd3.AGE_GATE_LOGIN.getValue())) {
                C852810Xct.LIZ.getClass();
                PhoneNumberUtil.PhoneNumber phoneNumberLJII = C852810Xct.LJII(signUpTermsConsentFragment.getArguments());
                C0XZ4 c0xz4 = C0XZ4.LIZ;
                String strLIZ = PhoneNumberUtil.LIZ(phoneNumberLJII);
                String str = signUpTermsConsentFragment.LLLIZZ;
                EnumC852910Xd3 enumC852910Xd3VR = signUpTermsConsentFragment.VR();
                c0xz4.getClass();
                C0XZ4.LJIJI(signUpTermsConsentFragment, signUpTermsConsentFragment, strLIZ, str, enumC852910Xd3VR, true).LJIILL();
            } else {
                Bundle arguments2 = signUpTermsConsentFragment.getArguments();
                if (arguments2 == null) {
                    arguments2 = new Bundle();
                }
                arguments2.putInt("next_page", EnumC852910Xd3.AGE_GATE_SIGN_UP.getValue());
                C786410Ut5.LJJJI("sms_code_key", signUpTermsConsentFragment.LLLIZZ, arguments2);
                signUpTermsConsentFragment.fo(arguments2);
            }
        }
        C0XGR c0xgr = new C0XGR();
        c0xgr.LIZLLL("enter_from", signUpTermsConsentFragment.getEnterFrom());
        c0xgr.LIZLLL("enter_method", signUpTermsConsentFragment.getEnterMethod());
        c0xgr.LIZLLL("platform", signUpTermsConsentFragment.LLLIL);
        c0xgr.LIZLLL("trending_on", signUpTermsConsentFragment.LLLJIL ? "1" : CardStruct.IStatusCode.DEFAULT);
        C20684815ws.LJIILLIIL("register_terms_click_next", c0xgr.LIZ);
        return Unit.LIZ;
    }
}
