package X;

import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.ss.android.ugc.aweme.account.agegate.ftc.FtcCreateAccountFragment;
import com.ss.android.ugc.aweme.account.agegate.ftc.FtcCreatePasswordFragment;
import com.ss.android.ugc.aweme.account.bind.BindEmailCodeVerifyFragment;
import com.ss.android.ugc.aweme.account.bind.BindEmailFragment;
import com.ss.android.ugc.aweme.account.bind.BindPhoneCodeVerifyFragment;
import com.ss.android.ugc.aweme.account.bind.BindTOTPFragment;
import com.ss.android.ugc.aweme.account.changemail.ChangeEmailFragment;
import com.ss.android.ugc.aweme.account.changemail.ChangeEmailVerifyFragment;
import com.ss.android.ugc.aweme.account.changemail.VerifyEmailBeforeChangeFragment;
import com.ss.android.ugc.aweme.account.login.passkey.RecoveryPasskeyUpsellFragment;
import com.ss.android.ugc.aweme.account.login.passkey.SettingsPasskeySetupFragment;
import com.ss.android.ugc.aweme.account.login.twostep.AddCurrentAuthDeviceFragment;
import com.ss.android.ugc.aweme.account.login.twostep.RecentDevicesFragment;
import com.ss.android.ugc.aweme.account.login.twostep.TOTPCodeVerifyFragment;
import com.ss.android.ugc.aweme.account.login.twostep.TrustedDevicesFragment;
import com.ss.android.ugc.aweme.account.login.twostep.TwoStepVerifyEmailFor2046Fragment;
import com.ss.android.ugc.aweme.account.login.twostep.TwoStepVerifySmsFor2046Fragment;
import com.ss.android.ugc.aweme.account.login.twostep.VerifyEmailForTicketFragment;
import com.ss.android.ugc.aweme.account.login.twostep.VerifyPhoneForTicketFragment;
import com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment;
import com.ss.android.ugc.aweme.account.login.v2.ui.AccountPrivateAccountTipsFragment;
import com.ss.android.ugc.aweme.account.login.v2.ui.fragments.ChildrenChangePasswordFragment;
import com.ss.android.ugc.aweme.account.login.v2.ui.fragments.CreatePasswordFragment;
import com.ss.android.ugc.aweme.account.login.v2.ui.fragments.EmailLinkVerifyFragment;
import com.ss.android.ugc.aweme.account.login.v2.ui.fragments.EmailLoginFragment;
import com.ss.android.ugc.aweme.account.login.v2.ui.fragments.EmailOTPLoginCodeVerifyFragment;
import com.ss.android.ugc.aweme.account.login.v2.ui.fragments.EmailOTPSignupCodeVerifyFragment;
import com.ss.android.ugc.aweme.account.login.v2.ui.fragments.EmailSignUpTabFragment;
import com.ss.android.ugc.aweme.account.login.v2.ui.fragments.EmailSignUpWithoutTabFragment;
import com.ss.android.ugc.aweme.account.login.v2.ui.fragments.ForceVerifyPhoneInputCodeFragment;
import com.ss.android.ugc.aweme.account.login.v2.ui.fragments.GSMAProcessHandlingFragment;
import com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputCodeFragment;
import com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputEmailFragment;
import com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputPasswordFragment;
import com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputPhoneFragment;
import com.ss.android.ugc.aweme.account.login.v2.ui.fragments.LoginChooseAccountsFragment;
import com.ss.android.ugc.aweme.account.login.v2.ui.fragments.PaPromptAccountFlowFragment;
import com.ss.android.ugc.aweme.account.login.v2.ui.fragments.PhlAccountFlowFragment;
import com.ss.android.ugc.aweme.account.login.v2.ui.fragments.PhoneCodeLoginVerifyOrBindFragment;
import com.ss.android.ugc.aweme.account.login.v2.ui.fragments.PhoneEmailLoginFragment;
import com.ss.android.ugc.aweme.account.login.v2.ui.fragments.PhoneEmailSignUpFragment;
import com.ss.android.ugc.aweme.account.login.v2.ui.fragments.PhoneLoginFragment;
import com.ss.android.ugc.aweme.account.login.v2.ui.fragments.PhoneNon1pBindFragment;
import com.ss.android.ugc.aweme.account.login.v2.ui.fragments.PhoneSignUpFragment;
import com.ss.android.ugc.aweme.account.login.v2.ui.fragments.SetAvatarFragment;
import com.ss.android.ugc.aweme.account.login.v2.ui.fragments.SetAvatarNicknameFragment;
import com.ss.android.ugc.aweme.account.login.v2.ui.fragments.SetNicknameFragment;
import com.ss.android.ugc.aweme.account.login.v2.ui.fragments.SignUpTermsConsentFragment;
import com.ss.android.ugc.aweme.account.setpwd.BaseUpdatePasswordFragment;
import com.ss.android.ugc.aweme.account.setpwd.EmailCodeChangePwdFragment;
import com.ss.android.ugc.aweme.account.setpwd.OrgLoginOtpFragment;
import com.ss.android.ugc.aweme.account.setpwd.PhoneChangePwdVerifyFragment;
import com.ss.android.ugc.aweme.account.setpwd.VerifyPasswordFragment;
import com.ss.android.ugc.aweme.account.unbind.UnbindConfirmFragment;
import com.ss.android.ugc.aweme.account.unbind.UnbindInputCodeFragment;
import com.ss.android.ugc.aweme.account.verify.ConfirmEmailFragment;
import com.ss.android.ugc.aweme.account.verify.VerifyEmailCodeFragment;
import com.ss.android.ugc.aweme.account.verify.VerifyPhoneFragment;
import com.ss.android.ugc.aweme.exp.DMInboxChangeRightZoneClickableSizeExp;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;

/* JADX INFO: renamed from: X.0XeH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C853670XeH {
    public static final C853670XeH LIZ = new C853670XeH();

    public static BaseAccountFlowFragment LIZ(EnumC852910Xd3 enumC852910Xd3) {
        switch (C852920Xd4.LIZ[enumC852910Xd3.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
                return new CreatePasswordFragment();
            case 5:
            case 6:
            case 7:
            case 8:
            case BdTuring.TYPE_ECAF /* 9 */:
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
            case BdTuring.TYPE_EMAIL /* 11 */:
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return new InputCodeFragment();
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                return new VerifyEmailCodeFragment();
            case 14:
            case 15:
            case 16:
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                return new InputPhoneFragment();
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                return new InputEmailFragment();
            case 19:
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
            case 21:
            case 22:
            case 23:
                return new InputPasswordFragment();
            case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                return new PhoneEmailLoginFragment();
            case 25:
                return new PhoneEmailSignUpFragment();
            case 26:
                return new SetNicknameFragment();
            case 27:
            case 28:
                return new EmailLoginFragment();
            case 29:
                return new PhoneLoginFragment();
            case 30:
                return new PhoneSignUpFragment();
            case 31:
                return new EmailSignUpTabFragment();
            case 32:
                return new EmailSignUpWithoutTabFragment();
            case LiveToolbarIconStyleSetting.GRAY_WITHOUT_TEXT /* 33 */:
                return new PhoneChangePwdVerifyFragment();
            case LiveToolbarIconStyleSetting.COLORFUL_WITHOUT_TEXT /* 34 */:
            case 35:
                return new BaseUpdatePasswordFragment();
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITHOUT_TEXT /* 36 */:
            case 37:
            case 38:
            case 39:
                return new VerifyPasswordFragment();
            case 40:
                return new BindEmailFragment();
            case 41:
                return new BindEmailCodeVerifyFragment();
            case 42:
                return new ChangeEmailVerifyFragment();
            case 43:
                return new VerifyEmailBeforeChangeFragment();
            case 44:
                return new ChangeEmailFragment();
            case 45:
                return new ConfirmEmailFragment();
            case 46:
                return new VerifyPhoneFragment();
            case 47:
                return new EmailCodeChangePwdFragment();
            case 48:
            case 49:
            case BaseNotice.RECOMMEND_LIVE /* 50 */:
                return new SignUpTermsConsentFragment();
            case 51:
                return new FtcCreateAccountFragment();
            case 52:
                return new FtcCreatePasswordFragment();
            case 53:
                return new ChildrenChangePasswordFragment();
            case 54:
            case 55:
                return new TwoStepVerifyEmailFor2046Fragment();
            case 56:
                return new TwoStepVerifySmsFor2046Fragment();
            case 57:
                return new VerifyEmailForTicketFragment();
            case 58:
                return new VerifyPhoneForTicketFragment();
            case 59:
                return new AccountPrivateAccountTipsFragment();
            case 60:
            case 61:
                return new UnbindConfirmFragment();
            case BaseNotice.CREATOR /* 62 */:
            case 63:
            case 64:
            case 65:
                return new UnbindInputCodeFragment();
            case 66:
                return new ForceVerifyPhoneInputCodeFragment();
            case 67:
                return new BindTOTPFragment();
            case 68:
                return new TOTPCodeVerifyFragment();
            case 69:
                return new SetAvatarFragment();
            case 70:
                return new SetAvatarNicknameFragment();
            case 71:
                return new PaPromptAccountFlowFragment();
            case DMInboxChangeRightZoneClickableSizeExp.NEW_DP_SIZE /* 72 */:
                return new PhlAccountFlowFragment();
            case 73:
                return new AddCurrentAuthDeviceFragment();
            case 74:
                return new TrustedDevicesFragment();
            case 75:
                return new RecentDevicesFragment();
            case 76:
                return new SettingsPasskeySetupFragment();
            case 77:
                return new RecoveryPasskeyUpsellFragment();
            case 78:
                return new EmailOTPLoginCodeVerifyFragment();
            case 79:
                return new EmailLinkVerifyFragment();
            case 80:
                return new EmailOTPSignupCodeVerifyFragment();
            case 81:
                return new PhoneNon1pBindFragment();
            case 82:
                return new PhoneCodeLoginVerifyOrBindFragment();
            case 83:
                return new OrgLoginOtpFragment();
            case 84:
                return new GSMAProcessHandlingFragment();
            case 85:
                return new LoginChooseAccountsFragment();
            case 86:
                return new BindPhoneCodeVerifyFragment();
            default:
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Unknown step ");
                sbLIZ.append(enumC852910Xd3);
                sbLIZ.append(" in LoginFlowFactory");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
        }
    }
}
