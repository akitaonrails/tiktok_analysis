package X;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.ss.android.ugc.aweme.account.login.twostep.AddCurrentAuthDeviceFragment;
import com.ss.android.ugc.aweme.account.login.twostep.AddVerificationResponse;
import com.ss.android.ugc.aweme.account.login.twostep.AuthDeviceResponse;
import com.ss.android.ugc.aweme.account.login.twostep.AvailableWaysResponse;
import com.ss.android.ugc.aweme.account.login.twostep.AvailableWaysUserData;
import com.ss.android.ugc.aweme.account.login.twostep.BindVerifyResponse;
import com.ss.android.ugc.aweme.account.login.twostep.Device;
import com.ss.android.ugc.aweme.account.login.twostep.RecentDevicesFragmentViewModel;
import com.ss.android.ugc.aweme.account.login.twostep.SendSmsCodeResponse;
import com.ss.android.ugc.aweme.account.login.twostep.TOTPCodeVerifyFragment;
import com.ss.android.ugc.aweme.account.login.twostep.TrustedDevicesFragmentViewModel;
import com.ss.android.ugc.aweme.account.login.twostep.TwoStepApiResponse;
import com.ss.android.ugc.aweme.account.login.twostep.TwoStepAuthActivity;
import com.ss.android.ugc.aweme.account.login.twostep.TwoStepVerificationActivityViewModel;
import com.ss.android.ugc.aweme.account.login.twostep.VerifyTOTPResponse;
import com.ss.android.ugc.aweme.account.loginsetting.BoolData;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.profile.business.profile.popup.BaseMyProfileGuideWidget;
import com.ss.android.ugc.profile.business.profile.survey.SurveyData;
import com.ss.android.ugc.profile.business.user.creator.product.hybrid.activity.AuthTransitActivity;
import com.ss.android.ugc.profile.platform.framework.aweme.profile.viewmodel.MyProfileGuideViewModel;
import com.tts.oecverify.BdTuring;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS283S0000000_35;
import kotlin.jvm.internal.AwS103S1200000_19;
import kotlin.jvm.internal.AwS385S0200000_19;
import kotlin.jvm.internal.AwS598S0100000_19;
import kotlin.jvm.internal.AwS614S0100000_35;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0j3O, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public class C1266160j3O implements InterfaceC2385309Wh {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC2385309Wh
    public final Object then(C15O7 c15o7) {
        switch (this.$t) {
            case 0:
                return then$0(this, c15o7);
            case 1:
                return then$1(this, c15o7);
            case 2:
                return then$2(this, c15o7);
            case 3:
                return then$3(this, c15o7);
            case 4:
                return then$4(this, c15o7);
            case 5:
                return then$5(this, c15o7);
            case 6:
                return then$6(this, c15o7);
            case 7:
                return then$7(this, c15o7);
            case 8:
                return then$8(this, c15o7);
            case BdTuring.TYPE_ECAF /* 9 */:
                return then$9(this, c15o7);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return then$10(this, c15o7);
            case BdTuring.TYPE_EMAIL /* 11 */:
                return then$11(this, c15o7);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return then$12(this, c15o7);
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                return then$13(this, c15o7);
            case 14:
                return then$14(this, c15o7);
            case 15:
                return then$15(this, c15o7);
            case 16:
                return then$16(this, c15o7);
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                return then$17(this, c15o7);
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                return then$18(this, c15o7);
            case 19:
                return then$19(this, c15o7);
            default:
                return null;
        }
    }

    public C1266160j3O(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final Object then$0(C1266160j3O c1266160j3O, C15O7 c15o7) {
        C1C7U.LIZ("YoutubePresenter@d036.onActivityResult$2");
        if (!C09UZ.LIZLLL(c15o7) || !((Boolean) c15o7.LJIIL()).booleanValue()) {
            C2193801AtW.LIZIZ((C2193801AtW) c1266160j3O.l0, new Exception(c15o7.LJIIJJI()), null, "send_token_to_sever", null, 10);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("YoutubePresenter@d036.onActivityResult$2");
        return unit;
    }

    public static final Object then$1(C1266160j3O c1266160j3O, C15O7 c15o7) {
        int iIntValue;
        AuthDeviceResponse.Data data;
        Integer num;
        String str;
        C1C7U.LIZ("AddCurrentAuthDeviceFragment@a4bd.getCommonUiParam$1$1$1$1");
        if (!C09UZ.LIZLLL(c15o7)) {
            C1233960iDS c1233960iDS = C1233960iDS.LIZ;
            String enterFrom = ((AddCurrentAuthDeviceFragment) c1266160j3O.l0).getEnterFrom();
            String str2 = ((AddCurrentAuthDeviceFragment) c1266160j3O.l0).LLLIILIL;
            Integer numValueOf = Integer.valueOf(C0XWH.LIZ(c15o7.LJIIJJI()));
            c1233960iDS.getClass();
            C1233960iDS.LJIILIIL(0, numValueOf, enterFrom, str2);
            C19EG activity = ((AddCurrentAuthDeviceFragment) c1266160j3O.l0).getActivity();
            if (activity != null) {
                activity.finish();
            }
            C1C7U.LIZIZ("AddCurrentAuthDeviceFragment@a4bd.getCommonUiParam$1$1$1$1");
            return null;
        }
        AuthDeviceResponse authDeviceResponse = (AuthDeviceResponse) c15o7.LJIIL();
        if (u.LJIJI("success", authDeviceResponse.message, true) && authDeviceResponse.data != null) {
            C1233960iDS c1233960iDS2 = C1233960iDS.LIZ;
            String enterFrom2 = ((AddCurrentAuthDeviceFragment) c1266160j3O.l0).getEnterFrom();
            String str3 = ((AddCurrentAuthDeviceFragment) c1266160j3O.l0).LLLIILIL;
            c1233960iDS2.getClass();
            C1233960iDS.LJIILIIL(1, null, enterFrom2, str3);
            Bundle arguments = ((AddCurrentAuthDeviceFragment) c1266160j3O.l0).getArguments();
            if (arguments == null) {
                arguments = new Bundle();
            }
            AddCurrentAuthDeviceFragment addCurrentAuthDeviceFragment = (AddCurrentAuthDeviceFragment) c1266160j3O.l0;
            Bundle bundle = new Bundle();
            C786410Ut5.LJJIZ(bundle, "auth_device_response", authDeviceResponse);
            AuthDeviceResponse.Data data2 = authDeviceResponse.data;
            if (data2 != null && (str = data2.ticket) != null) {
                C786410Ut5.LJJJI("ticket", str, bundle);
            }
            C786410Ut5.LJJIIZI(arguments, bundle, "final_data");
            addCurrentAuthDeviceFragment.WR(arguments);
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("AddCurrentAuthDeviceFragment@a4bd.getCommonUiParam$1$1$1$1");
            return unit;
        }
        C1233960iDS c1233960iDS3 = C1233960iDS.LIZ;
        String enterFrom3 = ((AddCurrentAuthDeviceFragment) c1266160j3O.l0).getEnterFrom();
        String str4 = ((AddCurrentAuthDeviceFragment) c1266160j3O.l0).LLLIILIL;
        AuthDeviceResponse authDeviceResponse2 = (AuthDeviceResponse) c15o7.LJIIL();
        if (authDeviceResponse2 != null && (data = authDeviceResponse2.data) != null && (num = data.errorCode) != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = -2;
        }
        Integer numValueOf2 = Integer.valueOf(iIntValue);
        c1233960iDS3.getClass();
        C1233960iDS.LJIILIIL(0, numValueOf2, enterFrom3, str4);
        C19EG activity2 = ((AddCurrentAuthDeviceFragment) c1266160j3O.l0).getActivity();
        if (activity2 != null) {
            activity2.finish();
        }
        C1C7U.LIZIZ("AddCurrentAuthDeviceFragment@a4bd.getCommonUiParam$1$1$1$1");
        return null;
    }

    public static final Object then$10(C1266160j3O c1266160j3O, C15O7 c15o7) {
        Integer num;
        C1C7U.LIZ("TOTPCodeVerifyFragment@d5b4.verifyTOTPToSignIn$1$1");
        ((TOTPCodeVerifyFragment) c1266160j3O.l0).aS();
        ((TOTPCodeVerifyFragment) c1266160j3O.l0).CT().setEnabled(true);
        ((TOTPCodeVerifyFragment) c1266160j3O.l0).CT().setLoading(false);
        Unit unit = null;
        String str = null;
        int iIntValue = -2;
        if (!((TOTPCodeVerifyFragment) c1266160j3O.l0).NT(c15o7, false)) {
            C1233960iDS c1233960iDS = C1233960iDS.LIZ;
            String strDT = ((TOTPCodeVerifyFragment) c1266160j3O.l0).DT();
            c1233960iDS.getClass();
            C1233960iDS.LJIIL(strDT, "totp", false);
            C1233960iDS.LJIIIZ(0, -2, ((TOTPCodeVerifyFragment) c1266160j3O.l0).getEnterFrom(), ((TOTPCodeVerifyFragment) c1266160j3O.l0).getEnterMethod(), ((TOTPCodeVerifyFragment) c1266160j3O.l0).DT(), "totp", ((TOTPCodeVerifyFragment) c1266160j3O.l0).zT().isChecked());
            C1C7U.LIZIZ("TOTPCodeVerifyFragment@d5b4.verifyTOTPToSignIn$1$1");
            return null;
        }
        VerifyTOTPResponse verifyTOTPResponse = (VerifyTOTPResponse) c15o7.LJIIL();
        if (!u.LJIJI("success", verifyTOTPResponse.message, true)) {
            VerifyTOTPResponse.VerifyData verifyData = verifyTOTPResponse.data;
            if (verifyData != null && (num = verifyData.errorCode) != null) {
                iIntValue = num.intValue();
            }
            String string = ((TOTPCodeVerifyFragment) c1266160j3O.l0).getString(2131850706);
            C1233960iDS c1233960iDS2 = C1233960iDS.LIZ;
            String strDT2 = ((TOTPCodeVerifyFragment) c1266160j3O.l0).DT();
            c1233960iDS2.getClass();
            C1233960iDS.LJIIL(strDT2, "totp", false);
            C1233960iDS.LJIIIZ(0, Integer.valueOf(iIntValue), ((TOTPCodeVerifyFragment) c1266160j3O.l0).getEnterFrom(), ((TOTPCodeVerifyFragment) c1266160j3O.l0).getEnterMethod(), ((TOTPCodeVerifyFragment) c1266160j3O.l0).DT(), "totp", ((TOTPCodeVerifyFragment) c1266160j3O.l0).zT().isChecked());
            ((TOTPCodeVerifyFragment) c1266160j3O.l0).ET(iIntValue, string);
            Unit unit2 = Unit.LIZ;
            C1C7U.LIZIZ("TOTPCodeVerifyFragment@d5b4.verifyTOTPToSignIn$1$1");
            return unit2;
        }
        C1233960iDS c1233960iDS3 = C1233960iDS.LIZ;
        String strDT3 = ((TOTPCodeVerifyFragment) c1266160j3O.l0).DT();
        c1233960iDS3.getClass();
        C1233960iDS.LJIIL(strDT3, "totp", true);
        String enterFrom = ((TOTPCodeVerifyFragment) c1266160j3O.l0).getEnterFrom();
        String enterMethod = ((TOTPCodeVerifyFragment) c1266160j3O.l0).getEnterMethod();
        String strDT4 = ((TOTPCodeVerifyFragment) c1266160j3O.l0).DT();
        boolean zIsChecked = ((TOTPCodeVerifyFragment) c1266160j3O.l0).zT().isChecked();
        c1233960iDS3.getClass();
        C1233960iDS.LJIIIZ(1, null, enterFrom, enterMethod, strDT4, "totp", zIsChecked);
        C853660XeG c853660XeG = C853660XeG.LIZ;
        TOTPCodeVerifyFragment tOTPCodeVerifyFragment = (TOTPCodeVerifyFragment) c1266160j3O.l0;
        EnumC1237100iIW enumC1237100iIW = tOTPCodeVerifyFragment.LLLLLIL;
        boolean z = tOTPCodeVerifyFragment.LLLLL;
        c853660XeG.getClass();
        C853660XeG.LJFF(enumC1237100iIW, z);
        Bundle arguments = ((TOTPCodeVerifyFragment) c1266160j3O.l0).getArguments();
        if (arguments != null) {
            TOTPCodeVerifyFragment tOTPCodeVerifyFragment2 = (TOTPCodeVerifyFragment) c1266160j3O.l0;
            Bundle bundle = new Bundle();
            VerifyTOTPResponse.VerifyData verifyData2 = verifyTOTPResponse.data;
            if (verifyData2 != null) {
                str = verifyData2.ticket;
            }
            C786410Ut5.LJJJI("ticket", str, bundle);
            C786410Ut5.LJJIIZI(arguments, bundle, "final_data");
            tOTPCodeVerifyFragment2.WR(arguments);
            unit = Unit.LIZ;
        }
        C1C7U.LIZIZ("TOTPCodeVerifyFragment@d5b4.verifyTOTPToSignIn$1$1");
        return unit;
    }

    public static final Object then$11(C1266160j3O c1266160j3O, C15O7 c15o7) {
        Integer num;
        String str;
        TwoStepApiResponse.Data data;
        C1C7U.LIZ("ThirdPartyAuthenticator@c769.verifyThirdPartyResult$1");
        C1239720iMk c1239720iMk = null;
        if (!C09UZ.LIZLLL(c15o7)) {
            ((C1239800iMs) c1266160j3O.l0).LJIIJ(null, "TwoStepAuthApi.verifyThirdParty bolts Task error");
            C1C7U.LIZIZ("ThirdPartyAuthenticator@c769.verifyThirdPartyResult$1");
            return null;
        }
        TwoStepApiResponse twoStepApiResponse = (TwoStepApiResponse) c15o7.LJIIL();
        if (u.LJIJI("success", twoStepApiResponse.message, true) && (data = twoStepApiResponse.data) != null && !TextUtils.isEmpty(data.ticket)) {
            C1239800iMs c1239800iMs = (C1239800iMs) c1266160j3O.l0;
            String str2 = twoStepApiResponse.data.ticket;
            C1239720iMk c1239720iMk2 = c1239800iMs.LLIZLLLIL;
            if (c1239720iMk2 != null) {
                c1239720iMk = c1239720iMk2;
            }
            c1239720iMk.LIZ(true);
            InterfaceC1239890iN1 interfaceC1239890iN1 = c1239800iMs.LLILLJJLI;
            if (interfaceC1239890iN1 != null) {
                interfaceC1239890iN1.onSuccess(str2);
            }
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("ThirdPartyAuthenticator@c769.verifyThirdPartyResult$1");
            return unit;
        }
        TwoStepApiResponse.Data data2 = twoStepApiResponse.data;
        if (data2 != null) {
            num = data2.errorCode;
            str = data2.errorDescription;
        } else {
            num = null;
            str = null;
        }
        ((C1239800iMs) c1266160j3O.l0).LJIIJ(num, str);
        if (str != null) {
            C1233040iBy c1233040iBy = new C1233040iBy(((C1239800iMs) c1266160j3O.l0).LIZ());
            c1233040iBy.LIZJ(str);
            c1233040iBy.LIZLLL();
        }
        C1C7U.LIZIZ("ThirdPartyAuthenticator@c769.verifyThirdPartyResult$1");
        return null;
    }

    public static final Object then$12(C1266160j3O c1266160j3O, C15O7 c15o7) {
        C1C7U.LIZ("TwoStepVerificationActivityViewModel@3f.fetchTrustDeviceStatus$1");
        if (!C09UZ.LIZLLL(c15o7)) {
            C1C7U.LIZIZ("TwoStepVerificationActivityViewModel@3f.fetchTrustDeviceStatus$1");
            return null;
        }
        AuthDeviceResponse authDeviceResponse = (AuthDeviceResponse) c15o7.LJIIL();
        if (u.LJIJI("success", authDeviceResponse.message, true) && authDeviceResponse.data != null) {
            ((TwoStepVerificationActivityViewModel) c1266160j3O.l0).LLILZ.setAuthDeviceListStatus(authDeviceResponse);
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("TwoStepVerificationActivityViewModel@3f.fetchTrustDeviceStatus$1");
            return unit;
        }
        C1C7U.LIZIZ("TwoStepVerificationActivityViewModel@3f.fetchTrustDeviceStatus$1");
        return null;
    }

    public static final Object then$13(C1266160j3O c1266160j3O, C15O7 c15o7) {
        C1256940ioW c1256940ioW = (C1256940ioW) c1266160j3O.l0;
        c1256940ioW.getClass();
        C1C7U.LIZ("SurveyManager@516d.requestData$1L");
        if (!C09UZ.LIZLLL(c15o7)) {
            C1257000ioc c1257000ioc = c1256940ioW.LIZ;
            if (c1257000ioc != null) {
                c15o7.LJIIJJI();
                MyProfileGuideViewModel myProfileGuideViewModel = c1257000ioc.LIZ.get();
                if (myProfileGuideViewModel != null) {
                    myProfileGuideViewModel.setState(AFwS283S0000000_35.get$arr$(112));
                }
            }
            C1C7U.LIZIZ("SurveyManager@516d.requestData$1L");
            return null;
        }
        SurveyData surveyData = (SurveyData) c15o7.LJIIL();
        C1257000ioc c1257000ioc2 = c1256940ioW.LIZ;
        if (c1257000ioc2 != null) {
            if (surveyData == null || surveyData.dialogId == 0) {
                surveyData = null;
            }
            MyProfileGuideViewModel myProfileGuideViewModel2 = c1257000ioc2.LIZ.get();
            if (myProfileGuideViewModel2 != null) {
                myProfileGuideViewModel2.setState(new AwS614S0100000_35(surveyData, 122));
            }
        }
        C1C7U.LIZIZ("SurveyManager@516d.requestData$1L");
        return null;
    }

    public static final Object then$14(C1266160j3O c1266160j3O, C15O7 c15o7) {
        C1C7U.LIZ("VoiceCodeHelper@a7a9.checkAvailability$1");
        if (!C09UZ.LIZLLL(c15o7)) {
            InterfaceC1236910iID interfaceC1236910iID = (InterfaceC1236910iID) c1266160j3O.l0;
            if (interfaceC1236910iID != null) {
                interfaceC1236910iID.LIZ(false);
            }
        } else {
            BoolData boolData = (BoolData) c15o7.LJIIL();
            InterfaceC1236910iID interfaceC1236910iID2 = (InterfaceC1236910iID) c1266160j3O.l0;
            if (interfaceC1236910iID2 != null) {
                interfaceC1236910iID2.LIZ(boolData.data.result);
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("VoiceCodeHelper@a7a9.checkAvailability$1");
        return unit;
    }

    public static final Object then$15(C1266160j3O c1266160j3O, C15O7 c15o7) {
        C1C7U.LIZ("AuthTransitActivity@7912.handleYoutubeResult$2");
        if (!C09UZ.LIZLLL(c15o7) || !((Boolean) c15o7.LJIIL()).booleanValue()) {
            AuthTransitActivity authTransitActivity = (AuthTransitActivity) c1266160j3O.l0;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("exception in send_token_to_sever ");
            sbLIZ.append(c15o7.LJIIJJI().getMessage());
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            authTransitActivity.getClass();
            AuthTransitActivity.LLLLLZL(strLIZIZ);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AuthTransitActivity@7912.handleYoutubeResult$2");
        return unit;
    }

    public static final Object then$16(C1266160j3O c1266160j3O, C15O7 c15o7) {
        Integer num;
        C1C7U.LIZ("BaseMyProfileGuideWidget@aba5.checkYouTubeState$2");
        if (C09UZ.LIZLLL(c15o7) && (num = (Integer) c15o7.LJIIL()) != null && num.intValue() == 1) {
            BaseMyProfileGuideWidget baseMyProfileGuideWidget = (BaseMyProfileGuideWidget) c1266160j3O.l0;
            baseMyProfileGuideWidget.getClass();
            C1233040iBy c1233040iBy = new C1233040iBy(C1745060vVo.LIZ(baseMyProfileGuideWidget));
            c1233040iBy.LIZIZ(2131845493);
            c1233040iBy.LIZLLL();
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("BaseMyProfileGuideWidget@aba5.checkYouTubeState$2");
        return unit;
    }

    public static final Object then$17(C1266160j3O c1266160j3O, C15O7 c15o7) {
        C1C7U.LIZ("BlockedAuthenticator@6b85.initData$3");
        if (C09UZ.LIZLLL(c15o7) && !TextUtils.isEmpty((CharSequence) c15o7.LJIIL())) {
            TextView textView = ((C1239820iMu) c1266160j3O.l0).LLIZLLLIL;
            if (textView == null) {
                textView = null;
            }
            textView.setText((CharSequence) c15o7.LJIIL());
        } else {
            C1239820iMu c1239820iMu = (C1239820iMu) c1266160j3O.l0;
            TextView textView2 = c1239820iMu.LLIZLLLIL;
            if (textView2 == null) {
                textView2 = null;
            }
            textView2.setText(c1239820iMu.LIZ().getString(2131829388));
        }
        C1C7U.LIZIZ("BlockedAuthenticator@6b85.initData$3");
        return null;
    }

    public static final Object then$18(C1266160j3O c1266160j3O, C15O7 c15o7) {
        Object objLIZJ;
        C1C7U.LIZ("TwoStepAuthActivity@5ddc.setupViews$2");
        if (C09UZ.LIZLLL(c15o7)) {
            TwoStepAuthActivity twoStepAuthActivity = (TwoStepAuthActivity) c1266160j3O.l0;
            C1239830iMv c1239830iMv = twoStepAuthActivity.LLILZ;
            if (c1239830iMv != null) {
                c1239830iMv.LLILZLL = twoStepAuthActivity.LLILZLL;
                objLIZJ = c1239830iMv.LIZJ();
            } else {
                objLIZJ = null;
            }
        } else {
            ((TwoStepAuthActivity) c1266160j3O.l0).getClass();
            objLIZJ = Unit.LIZ;
        }
        C1C7U.LIZIZ("TwoStepAuthActivity@5ddc.setupViews$2");
        return objLIZJ;
    }

    public static final Object then$19(C1266160j3O c1266160j3O, C15O7 c15o7) {
        Integer num;
        AvailableWaysUserData availableWaysUserData;
        C1C7U.LIZ("TwoStepVerificationActivityViewModel@3f.fetchMethodStatusInLogoutState$1");
        if (!C09UZ.LIZLLL(c15o7)) {
            TwoStepVerificationActivityViewModel.MQ2((TwoStepVerificationActivityViewModel) c1266160j3O.l0, null, null, 7);
            C1C7U.LIZIZ("TwoStepVerificationActivityViewModel@3f.fetchMethodStatusInLogoutState$1");
            return null;
        }
        AvailableWaysResponse availableWaysResponse = (AvailableWaysResponse) c15o7.LJIIL();
        if (u.LJIJI("success", availableWaysResponse.message, true) && (availableWaysUserData = availableWaysResponse.data) != null) {
            TwoStepVerificationActivityViewModel twoStepVerificationActivityViewModel = (TwoStepVerificationActivityViewModel) c1266160j3O.l0;
            Map<EnumC1233840iDG, C1233790iDB> map = twoStepVerificationActivityViewModel.LLILZLL;
            EnumC1233840iDG enumC1233840iDG = EnumC1233840iDG.SMS;
            Boolean bool = availableWaysUserData.has_mobile;
            Boolean bool2 = Boolean.TRUE;
            map.put(enumC1233840iDG, new C1233790iDB(Intrinsics.LJFF(bool, bool2), false, null, availableWaysUserData.mobile, false, false, 54));
            Map<EnumC1233840iDG, C1233790iDB> map2 = twoStepVerificationActivityViewModel.LLILZLL;
            EnumC1233840iDG enumC1233840iDG2 = EnumC1233840iDG.EMAIL;
            map2.put(enumC1233840iDG2, new C1233790iDB(Intrinsics.LJFF(availableWaysUserData.has_email, bool2), false, enumC1233840iDG2, availableWaysUserData.email, false, false, 50));
            Map<EnumC1233840iDG, C1233790iDB> map3 = twoStepVerificationActivityViewModel.LLILZLL;
            EnumC1233840iDG enumC1233840iDG3 = EnumC1233840iDG.TOTP;
            map3.put(enumC1233840iDG3, new C1233790iDB(false, false, enumC1233840iDG3, null, false, false, 59));
            Map<EnumC1233840iDG, C1233790iDB> map4 = twoStepVerificationActivityViewModel.LLILZLL;
            EnumC1233840iDG enumC1233840iDG4 = EnumC1233840iDG.PASSWORD;
            map4.put(enumC1233840iDG4, new C1233790iDB(Intrinsics.LJFF(availableWaysUserData.has_pwd, bool2), false, enumC1233840iDG4, null, false, false, 58));
            twoStepVerificationActivityViewModel.OQ2(null);
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("TwoStepVerificationActivityViewModel@3f.fetchMethodStatusInLogoutState$1");
            return unit;
        }
        TwoStepVerificationActivityViewModel twoStepVerificationActivityViewModel2 = (TwoStepVerificationActivityViewModel) c1266160j3O.l0;
        AvailableWaysUserData availableWaysUserData2 = availableWaysResponse.data;
        if (availableWaysUserData2 != null) {
            num = availableWaysUserData2.errorCode;
        } else {
            num = null;
        }
        TwoStepVerificationActivityViewModel.MQ2(twoStepVerificationActivityViewModel2, num, availableWaysResponse.message, 4);
        C1C7U.LIZIZ("TwoStepVerificationActivityViewModel@3f.fetchMethodStatusInLogoutState$1");
        return null;
    }

    public static final Object then$2(C1266160j3O c1266160j3O, C15O7 c15o7) {
        int iIntValue;
        Integer num;
        C1C7U.LIZ("TOTPCodeVerifyFragment@d5b4.onValidateCode$1");
        ((TOTPCodeVerifyFragment) c1266160j3O.l0).aS();
        Unit unit = null;
        if (!((TOTPCodeVerifyFragment) c1266160j3O.l0).NT(c15o7, false)) {
            C1C7U.LIZIZ("TOTPCodeVerifyFragment@d5b4.onValidateCode$1");
            return null;
        }
        BindVerifyResponse bindVerifyResponse = (BindVerifyResponse) c15o7.LJIIL();
        if (!u.LJIJI("success", bindVerifyResponse.message, true)) {
            BindVerifyResponse.BindErrorData bindErrorData = bindVerifyResponse.data;
            if (bindErrorData != null && (num = bindErrorData.errorCode) != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = -2;
            }
            ((TOTPCodeVerifyFragment) c1266160j3O.l0).ET(iIntValue, ((TOTPCodeVerifyFragment) c1266160j3O.l0).getString(2131850706));
            Unit unit2 = Unit.LIZ;
            C1C7U.LIZIZ("TOTPCodeVerifyFragment@d5b4.onValidateCode$1");
            return unit2;
        }
        C1233960iDS c1233960iDS = C1233960iDS.LIZ;
        String enterFrom = ((TOTPCodeVerifyFragment) c1266160j3O.l0).getEnterFrom();
        String strAT = ((TOTPCodeVerifyFragment) c1266160j3O.l0).AT();
        c1233960iDS.getClass();
        C1233960iDS.LJIIIIZZ(enterFrom, strAT);
        C853660XeG c853660XeG = C853660XeG.LIZ;
        TOTPCodeVerifyFragment tOTPCodeVerifyFragment = (TOTPCodeVerifyFragment) c1266160j3O.l0;
        EnumC1237100iIW enumC1237100iIW = tOTPCodeVerifyFragment.LLLLLIL;
        boolean z = tOTPCodeVerifyFragment.LLLLL;
        c853660XeG.getClass();
        C853660XeG.LJFF(enumC1237100iIW, z);
        Bundle arguments = ((TOTPCodeVerifyFragment) c1266160j3O.l0).getArguments();
        if (arguments != null) {
            ((TOTPCodeVerifyFragment) c1266160j3O.l0).WR(arguments);
            unit = Unit.LIZ;
        }
        C1C7U.LIZIZ("TOTPCodeVerifyFragment@d5b4.onValidateCode$1");
        return unit;
    }

    public static final Object then$3(C1266160j3O c1266160j3O, C15O7 c15o7) {
        int iIntValue;
        Integer num;
        C1C7U.LIZ("TOTPCodeVerifyFragment@d5b4.onValidateCode$2");
        ((TOTPCodeVerifyFragment) c1266160j3O.l0).aS();
        Unit unit = null;
        String str = null;
        if (!((TOTPCodeVerifyFragment) c1266160j3O.l0).NT(c15o7, false)) {
            C1C7U.LIZIZ("TOTPCodeVerifyFragment@d5b4.onValidateCode$2");
            return null;
        }
        VerifyTOTPResponse verifyTOTPResponse = (VerifyTOTPResponse) c15o7.LJIIL();
        if (!u.LJIJI("success", verifyTOTPResponse.message, true)) {
            VerifyTOTPResponse.VerifyData verifyData = verifyTOTPResponse.data;
            if (verifyData != null && (num = verifyData.errorCode) != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = -2;
            }
            ((TOTPCodeVerifyFragment) c1266160j3O.l0).ET(iIntValue, ((TOTPCodeVerifyFragment) c1266160j3O.l0).getString(2131850706));
            Unit unit2 = Unit.LIZ;
            C1C7U.LIZIZ("TOTPCodeVerifyFragment@d5b4.onValidateCode$2");
            return unit2;
        }
        C1233960iDS c1233960iDS = C1233960iDS.LIZ;
        String enterFrom = ((TOTPCodeVerifyFragment) c1266160j3O.l0).getEnterFrom();
        String strAT = ((TOTPCodeVerifyFragment) c1266160j3O.l0).AT();
        c1233960iDS.getClass();
        C1233960iDS.LJIIIIZZ(enterFrom, strAT);
        C853660XeG c853660XeG = C853660XeG.LIZ;
        TOTPCodeVerifyFragment tOTPCodeVerifyFragment = (TOTPCodeVerifyFragment) c1266160j3O.l0;
        EnumC1237100iIW enumC1237100iIW = tOTPCodeVerifyFragment.LLLLLIL;
        boolean z = tOTPCodeVerifyFragment.LLLLL;
        c853660XeG.getClass();
        C853660XeG.LJFF(enumC1237100iIW, z);
        Bundle arguments = ((TOTPCodeVerifyFragment) c1266160j3O.l0).getArguments();
        if (arguments != null) {
            TOTPCodeVerifyFragment tOTPCodeVerifyFragment2 = (TOTPCodeVerifyFragment) c1266160j3O.l0;
            Bundle bundle = new Bundle();
            VerifyTOTPResponse.VerifyData verifyData2 = verifyTOTPResponse.data;
            if (verifyData2 != null) {
                str = verifyData2.ticket;
            }
            C786410Ut5.LJJJI("ticket", str, bundle);
            C786410Ut5.LJJIIZI(arguments, bundle, "final_data");
            tOTPCodeVerifyFragment2.WR(arguments);
            unit = Unit.LIZ;
        }
        C1C7U.LIZIZ("TOTPCodeVerifyFragment@d5b4.onValidateCode$2");
        return unit;
    }

    public static final Object then$4(C1266160j3O c1266160j3O, C15O7 c15o7) {
        Integer num;
        String str;
        AuthDeviceResponse.Data data;
        C1C7U.LIZ("TrustedDevicesFragmentViewModel@7377.deleteClick$1");
        if (!C09UZ.LIZLLL(c15o7)) {
            TrustedDevicesFragmentViewModel trustedDevicesFragmentViewModel = (TrustedDevicesFragmentViewModel) c1266160j3O.l0;
            TrustedDevicesFragmentViewModel.xQ2(trustedDevicesFragmentViewModel, -2, null, 6);
            trustedDevicesFragmentViewModel.setState(new AwS598S0100000_19(trustedDevicesFragmentViewModel, 889));
            C1C7U.LIZIZ("TrustedDevicesFragmentViewModel@7377.deleteClick$1");
            return null;
        }
        AuthDeviceResponse authDeviceResponse = (AuthDeviceResponse) c15o7.LJIIL();
        if (u.LJIJI("success", authDeviceResponse.message, true) && (data = authDeviceResponse.data) != null) {
            List<Device> list = data.auth_device;
            if (list != null) {
                ((TrustedDevicesFragmentViewModel) c1266160j3O.l0).LL = list;
            }
            TrustedDevicesFragmentViewModel trustedDevicesFragmentViewModel2 = (TrustedDevicesFragmentViewModel) c1266160j3O.l0;
            trustedDevicesFragmentViewModel2.LLILZIL.setAuthDeviceListStatus(authDeviceResponse);
            trustedDevicesFragmentViewModel2.withState(new AwS385S0200000_19(trustedDevicesFragmentViewModel2, authDeviceResponse, 150));
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("TrustedDevicesFragmentViewModel@7377.deleteClick$1");
            return unit;
        }
        AuthDeviceResponse.Data data2 = authDeviceResponse.data;
        if (data2 != null) {
            num = data2.errorCode;
            str = data2.errorDescription;
        } else {
            num = null;
            str = null;
        }
        TrustedDevicesFragmentViewModel trustedDevicesFragmentViewModel3 = (TrustedDevicesFragmentViewModel) c1266160j3O.l0;
        TrustedDevicesFragmentViewModel.xQ2(trustedDevicesFragmentViewModel3, num, str, 4);
        trustedDevicesFragmentViewModel3.setState(new AwS598S0100000_19(trustedDevicesFragmentViewModel3, 889));
        C1C7U.LIZIZ("TrustedDevicesFragmentViewModel@7377.deleteClick$1");
        return null;
    }

    public static final Object then$5(C1266160j3O c1266160j3O, C15O7 c15o7) {
        Integer num;
        C1C7U.LIZ("TwoStepVerificationActivityViewModel@3f.fetchTwoStepVerificationStatus$1");
        if (!C09UZ.LIZLLL(c15o7)) {
            TwoStepVerificationActivityViewModel.MQ2((TwoStepVerificationActivityViewModel) c1266160j3O.l0, null, null, 7);
            C1C7U.LIZIZ("TwoStepVerificationActivityViewModel@3f.fetchTwoStepVerificationStatus$1");
            return null;
        }
        AddVerificationResponse addVerificationResponse = (AddVerificationResponse) c15o7.LJIIL();
        if (u.LJIJI("success", addVerificationResponse.message, true) && addVerificationResponse.data != null) {
            ((TwoStepVerificationActivityViewModel) c1266160j3O.l0).EQ2(addVerificationResponse);
            ((TwoStepVerificationActivityViewModel) c1266160j3O.l0).OQ2(addVerificationResponse);
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("TwoStepVerificationActivityViewModel@3f.fetchTwoStepVerificationStatus$1");
            return unit;
        }
        TwoStepVerificationActivityViewModel twoStepVerificationActivityViewModel = (TwoStepVerificationActivityViewModel) c1266160j3O.l0;
        AddVerificationResponse.Data data = addVerificationResponse.data;
        if (data != null) {
            num = data.errorCode;
        } else {
            num = null;
        }
        String str = addVerificationResponse.message;
        twoStepVerificationActivityViewModel.getClass();
        twoStepVerificationActivityViewModel.setState(new AwS103S1200000_19(twoStepVerificationActivityViewModel, num, str, 14));
        C1C7U.LIZIZ("TwoStepVerificationActivityViewModel@3f.fetchTwoStepVerificationStatus$1");
        return null;
    }

    public static final Object then$6(C1266160j3O c1266160j3O, C15O7 c15o7) {
        Integer num;
        String str;
        TwoStepApiResponse.Data data;
        String string;
        C1C7U.LIZ("PasswordAuthenticator@aa20.verifyPassword$1");
        C1239720iMk c1239720iMk = null;
        if (!C09UZ.LIZLLL(c15o7)) {
            C1239810iMt c1239810iMt = (C1239810iMt) c1266160j3O.l0;
            Exception excLJIIJJI = c15o7.LJIIJJI();
            if (excLJIIJJI != null) {
                string = excLJIIJJI.toString();
            } else {
                string = null;
            }
            c1239810iMt.LJIIIIZZ(null, string);
            C1C7U.LIZIZ("PasswordAuthenticator@aa20.verifyPassword$1");
            return null;
        }
        TwoStepApiResponse twoStepApiResponse = (TwoStepApiResponse) c15o7.LJIIL();
        if (u.LJIJI("success", twoStepApiResponse.message, true) && (data = twoStepApiResponse.data) != null && !TextUtils.isEmpty(data.ticket)) {
            C1239810iMt c1239810iMt2 = (C1239810iMt) c1266160j3O.l0;
            String str2 = twoStepApiResponse.data.ticket;
            c1239810iMt2.LJ(true);
            C424320GkQ c424320GkQ = c1239810iMt2.LLJI;
            if (c424320GkQ == null) {
                c424320GkQ = null;
            }
            c424320GkQ.LIZ();
            C1239720iMk c1239720iMk2 = c1239810iMt2.LLIZLLLIL;
            if (c1239720iMk2 != null) {
                c1239720iMk = c1239720iMk2;
            }
            c1239720iMk.LIZ(true);
            InterfaceC1239890iN1 interfaceC1239890iN1 = c1239810iMt2.LLILLJJLI;
            if (interfaceC1239890iN1 != null) {
                interfaceC1239890iN1.onSuccess(str2);
            }
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("PasswordAuthenticator@aa20.verifyPassword$1");
            return unit;
        }
        TwoStepApiResponse.Data data2 = twoStepApiResponse.data;
        if (data2 != null) {
            num = data2.errorCode;
            str = data2.errorDescription;
        } else {
            num = null;
            str = null;
        }
        ((C1239810iMt) c1266160j3O.l0).LJIIIIZZ(num, str);
        C1C7U.LIZIZ("PasswordAuthenticator@aa20.verifyPassword$1");
        return null;
    }

    public static final Object then$7(C1266160j3O c1266160j3O, C15O7 c15o7) {
        String str;
        Integer num;
        C1C7U.LIZ("RecentDevicesFragmentViewModel@b789.addTrustedDevice$1");
        int size = 0;
        int iIntValue = -2;
        if (!C09UZ.LIZLLL(c15o7)) {
            C1233960iDS c1233960iDS = C1233960iDS.LIZ;
            String str2 = (String) ((RecentDevicesFragmentViewModel) c1266160j3O.l0).LLILLL.getValue();
            int size2 = ((RecentDevicesFragmentViewModel) c1266160j3O.l0).LL.size();
            c1233960iDS.getClass();
            C1233960iDS.LJIILJJIL(size2, 0, -2, str2);
            RecentDevicesFragmentViewModel recentDevicesFragmentViewModel = (RecentDevicesFragmentViewModel) c1266160j3O.l0;
            recentDevicesFragmentViewModel.setState(new AwS598S0100000_19(RecentDevicesFragmentViewModel.wQ2(recentDevicesFragmentViewModel, -2, null, 6), 892));
            C1C7U.LIZIZ("RecentDevicesFragmentViewModel@b789.addTrustedDevice$1");
            return null;
        }
        AuthDeviceResponse authDeviceResponse = (AuthDeviceResponse) c15o7.LJIIL();
        if (u.LJIJI("success", authDeviceResponse.message, true) && authDeviceResponse.data != null) {
            C1233960iDS c1233960iDS2 = C1233960iDS.LIZ;
            String str3 = (String) ((RecentDevicesFragmentViewModel) c1266160j3O.l0).LLILLL.getValue();
            List<Device> list = authDeviceResponse.data.auth_device;
            if (list != null) {
                size = list.size();
            }
            c1233960iDS2.getClass();
            C1233960iDS.LJIILJJIL(size, 1, -2, str3);
            ((RecentDevicesFragmentViewModel) c1266160j3O.l0).LLILZLL.setAuthDeviceListStatus(authDeviceResponse);
            ((RecentDevicesFragmentViewModel) c1266160j3O.l0).vQ2(true);
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("RecentDevicesFragmentViewModel@b789.addTrustedDevice$1");
            return unit;
        }
        AuthDeviceResponse.Data data = authDeviceResponse.data;
        if (data != null && (num = data.errorCode) != null) {
            iIntValue = num.intValue();
        }
        AuthDeviceResponse.Data data2 = authDeviceResponse.data;
        if (data2 != null) {
            str = data2.errorDescription;
        } else {
            str = null;
        }
        C1233960iDS c1233960iDS3 = C1233960iDS.LIZ;
        String str4 = (String) ((RecentDevicesFragmentViewModel) c1266160j3O.l0).LLILLL.getValue();
        int size3 = ((RecentDevicesFragmentViewModel) c1266160j3O.l0).LL.size();
        c1233960iDS3.getClass();
        C1233960iDS.LJIILJJIL(size3, 0, iIntValue, str4);
        RecentDevicesFragmentViewModel recentDevicesFragmentViewModel2 = (RecentDevicesFragmentViewModel) c1266160j3O.l0;
        recentDevicesFragmentViewModel2.setState(new AwS598S0100000_19(RecentDevicesFragmentViewModel.wQ2(recentDevicesFragmentViewModel2, Integer.valueOf(iIntValue), str, 4), 892));
        C1C7U.LIZIZ("RecentDevicesFragmentViewModel@b789.addTrustedDevice$1");
        return null;
    }

    public static final Object then$8(C1266160j3O c1266160j3O, C15O7 c15o7) {
        Integer num;
        String str;
        TwoStepApiResponse.Data data;
        C1C7U.LIZ("SmsCodeAuthenticator@f37f.onInputComplete$1");
        if (!C09UZ.LIZLLL(c15o7)) {
            C1239850iMx c1239850iMx = (C1239850iMx) c1266160j3O.l0;
            c1239850iMx.LLJJ = true;
            c1239850iMx.LJIIJ(null, "TwoStepAuthApi.verifySmsCode bolts Task error");
            C1C7U.LIZIZ("SmsCodeAuthenticator@f37f.onInputComplete$1");
            return null;
        }
        TwoStepApiResponse twoStepApiResponse = (TwoStepApiResponse) c15o7.LJIIL();
        if (u.LJIJI("success", twoStepApiResponse.message, true) && (data = twoStepApiResponse.data) != null && !TextUtils.isEmpty(data.ticket)) {
            C1239850iMx c1239850iMx2 = (C1239850iMx) c1266160j3O.l0;
            String str2 = twoStepApiResponse.data.ticket;
            c1239850iMx2.LJ(true);
            c1239850iMx2.LJIIIZ();
            c1239850iMx2.LJIIIIZZ();
            InterfaceC1239890iN1 interfaceC1239890iN1 = c1239850iMx2.LLILLJJLI;
            if (interfaceC1239890iN1 != null) {
                interfaceC1239890iN1.onSuccess(str2);
            }
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("SmsCodeAuthenticator@f37f.onInputComplete$1");
            return unit;
        }
        C1239850iMx c1239850iMx3 = (C1239850iMx) c1266160j3O.l0;
        c1239850iMx3.LLJJ = true;
        TwoStepApiResponse.Data data2 = twoStepApiResponse.data;
        if (data2 != null) {
            num = data2.errorCode;
            str = data2.errorDescription;
        } else {
            num = null;
            str = null;
        }
        c1239850iMx3.LJIIJ(num, str);
        C1C7U.LIZIZ("SmsCodeAuthenticator@f37f.onInputComplete$1");
        return null;
    }

    public static final Object then$9(C1266160j3O c1266160j3O, C15O7 c15o7) {
        Integer num;
        String message;
        String str;
        C1C7U.LIZ("SmsCodeAuthenticator@f37f.sendCode$1");
        C1237240iIk c1237240iIk = null;
        if (C09UZ.LIZLLL(c15o7) && !u.LJIJI("error", ((SendSmsCodeResponse) c15o7.LJIIL()).message, true)) {
            TextView textView = ((C1239850iMx) c1266160j3O.l0).LLJIJIL;
            if (textView == null) {
                textView = null;
            }
            if (TextUtils.isEmpty(textView.getText())) {
                C1239850iMx c1239850iMx = (C1239850iMx) c1266160j3O.l0;
                TextView textView2 = c1239850iMx.LLJIJIL;
                if (textView2 == null) {
                    textView2 = null;
                }
                Locale locale = Locale.US;
                String string = c1239850iMx.LIZ().getString(2131829394);
                Object[] objArr = new Object[1];
                SendSmsCodeResponse.Data data = ((SendSmsCodeResponse) c15o7.LJIIL()).data;
                if (data != null) {
                    str = data.mobile;
                } else {
                    str = null;
                }
                objArr[0] = str;
                textView2.setText(C786410Ut5.k4(locale, string, Arrays.copyOf(objArr, 1)));
            }
            C21407818qC c21407818qC = ((C1239850iMx) c1266160j3O.l0).LLJ;
            if (c21407818qC == null) {
                c21407818qC = null;
            }
            c21407818qC.setEnabled(true);
            View view = ((C1239850iMx) c1266160j3O.l0).LLJILJIL;
            if (view == null) {
                view = null;
            }
            view.setEnabled(false);
            ((C1239850iMx) c1266160j3O.l0).LJIIIZ();
            C1237240iIk c1237240iIk2 = ((C1239850iMx) c1266160j3O.l0).LLIZLLLIL;
            if (c1237240iIk2 != null) {
                c1237240iIk = c1237240iIk2;
            }
            C1237220iIi c1237220iIiLJJJJJ = c1237240iIk.LJJJJJ();
            C1C7U.LIZIZ("SmsCodeAuthenticator@f37f.sendCode$1");
            return c1237220iIiLJJJJJ;
        }
        C1239850iMx c1239850iMx2 = (C1239850iMx) c1266160j3O.l0;
        SendSmsCodeResponse.Data data2 = ((SendSmsCodeResponse) c15o7.LJIIL()).data;
        if (data2 != null) {
            num = data2.errorCode;
        } else {
            num = null;
        }
        Exception excLJIIJJI = c15o7.LJIIJJI();
        if (excLJIIJJI == null || (message = excLJIIJJI.getMessage()) == null) {
            SendSmsCodeResponse.Data data3 = ((SendSmsCodeResponse) c15o7.LJIIL()).data;
            if (data3 != null) {
                message = data3.errorDescription;
            } else {
                message = null;
            }
        }
        c1239850iMx2.LJIIJ(num, message);
        C1C7U.LIZIZ("SmsCodeAuthenticator@f37f.sendCode$1");
        return null;
    }
}
