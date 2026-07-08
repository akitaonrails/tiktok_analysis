package Y;

import X.AbstractC854320XfK;
import X.C013C;
import X.C09JN;
import X.C0X35;
import X.C0XGR;
import X.C0XO2;
import X.C0XO3;
import X.C0XQ5;
import X.C0XT7;
import X.C0XWH;
import X.C0XYD;
import X.C0XYO;
import X.C0XZ4;
import X.C0XZJ;
import X.C0XZP;
import X.C11JF;
import X.C1237940iJs;
import X.C1389890mGx;
import X.C1720106oR;
import X.C19EG;
import X.C1C7U;
import X.C20684815ws;
import X.C2097908Jt;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C2193741AtQ;
import X.C786410Ut5;
import X.C799900VZk;
import X.C813020Vuu;
import X.C849260XTg;
import X.C850340XXk;
import X.C851160XaE;
import X.C851170XaF;
import X.C851430Xaf;
import X.C852170Xbr;
import X.C852460XcK;
import X.C852810Xct;
import X.C853540Xe4;
import X.C853580Xe8;
import X.C853590Xe9;
import X.C853810XeV;
import X.C853840XeY;
import X.C853990Xen;
import X.C854460XfY;
import X.EnumC800210VaF;
import X.EnumC851410Xad;
import X.EnumC852660Xce;
import X.EnumC852910Xd3;
import X.EnumC854390XfR;
import X.InterfaceC473930IiF;
import X.InterfaceC853780XeS;
import X.InterfaceC853790XeT;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.bytedance.lobby.auth.AuthResult;
import com.bytedance.lobby.google.GoogleWebAuth;
import com.bytedance.lobby.google.LobbyGoogleApi;
import com.bytedance.lobby.internal.LobbyViewModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.account.eventtracking.ClientSmsVerificationResultEvent;
import com.ss.android.ugc.aweme.account.eventtracking.ClientSubmitSmsCodeEvent;
import com.ss.android.ugc.aweme.account.login.utils.PhoneNumberUtil;
import com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment;
import com.ss.android.ugc.aweme.account.login.v2.network.PassportTicketLoginQueryObj;
import com.ss.android.ugc.aweme.account.login.v2.ui.fragments.GSMAProcessHandlingFragment;
import com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputCodeFragmentV2;
import com.ss.android.ugc.aweme.account.setpwd.VerifyPasswordFragment;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.ss.android.ugc.aweme.experiment.publishtest.PublishTestSupportSetting$PublishTestSupportConfig;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.legoImp.task.publishtest.IPublishDrillService;
import com.ss.android.ugc.aweme.legoImp.task.publishtest.PublishTestSupportTCEApi;
import com.ss.android.ugc.aweme.legoImp.task.publishtest.PublishTestSupportTask;
import com.ss.android.ugc.aweme.legoImpl.task.KeepAliveBootstrapTask;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.services.interceptor.ConditionalBindLoginParam;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes14.dex */
public class AfS149S0200000_13 implements C09JN {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // X.C09JN
    public final void accept(Object obj) throws JSONException {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                break;
            case 1:
                accept$1(this, obj);
                break;
            case 2:
                accept$2(this, obj);
                break;
            case 3:
                accept$3(this, obj);
                break;
            case 4:
                accept$4(this, obj);
                break;
            case 5:
                accept$5(this, obj);
                break;
            case 6:
                accept$6(this, obj);
                break;
            case 7:
                accept$7(this, obj);
                break;
            case 8:
                accept$8(this, obj);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                accept$9(this, obj);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                accept$10(this, obj);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                accept$11(this, obj);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                accept$12(this, obj);
                break;
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                accept$13(this, obj);
                break;
            case 14:
                accept$14(this, obj);
                break;
            case 15:
                accept$15(this, obj);
                break;
            case 16:
                accept$16(this, obj);
                break;
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                accept$17(this, obj);
                break;
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                accept$18(this, obj);
                break;
            case 19:
                accept$19(this, obj);
                break;
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                accept$20(this, obj);
                break;
            case 21:
                accept$21(this, obj);
                break;
            case 22:
                accept$22(this, obj);
                break;
            case 23:
                accept$23(this, obj);
                break;
            case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                accept$24(this, obj);
                break;
            case 25:
                accept$25(this, obj);
                break;
        }
    }

    public static final void accept$0(AfS149S0200000_13 afS149S0200000_13, Object obj) {
        String string;
        String str;
        C1C7U.LIZ("AccountPassportResultHandler@2671.tryUploadSmsConsentAfterLogin$1$1$1");
        BaseResponse baseResponse = (BaseResponse) obj;
        if (baseResponse != null) {
            EnumC852910Xd3 enumC852910Xd3 = (EnumC852910Xd3) afS149S0200000_13.l0;
            Fragment fragment = (Fragment) afS149S0200000_13.l1;
            if (baseResponse.status_code == 0) {
                int i = C2187451AjH.LIZ;
            } else {
                int i2 = C2187451AjH.LIZ;
                C1720106oR.LJI("SMS_consent", "doUploadSmsConsentStatus() fail!!!");
            }
            C0XGR c0xgr = new C0XGR();
            c0xgr.LIZLLL("enter_from", "input_code_page");
            c0xgr.LIZLLL("page_name", "input_code_page");
            int i3 = C851160XaE.LIZ[enumC852910Xd3.ordinal()];
            if (i3 != 1) {
                if (i3 != 2) {
                    string = enumC852910Xd3.toString();
                } else {
                    string = "log_in";
                }
            } else {
                string = "sign_up";
            }
            c0xgr.LIZLLL("trigger", string);
            c0xgr.LIZLLL("show_type", "checkbox");
            String str2 = "1";
            c0xgr.LIZLLL("mobile", "1");
            Bundle arguments = fragment.getArguments();
            if (arguments != null && arguments.getBoolean("sms_checkbox_checked")) {
                str = "check";
            } else {
                str = "non_check";
            }
            c0xgr.LIZLLL("action_type", str);
            if (baseResponse.status_code != 0) {
                str2 = CardStruct.IStatusCode.DEFAULT;
            }
            c0xgr.LIZLLL(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, str2);
            c0xgr.LIZLLL("fail_reason", baseResponse.status_msg);
            C20684815ws.LJIILLIIL("tiktok_sms_popup_click", c0xgr.LIZ);
        }
        C1C7U.LIZIZ("AccountPassportResultHandler@2671.tryUploadSmsConsentAfterLogin$1$1$1");
    }

    public static final void accept$1(AfS149S0200000_13 afS149S0200000_13, Object obj) {
        String string;
        String str;
        C1C7U.LIZ("AccountPassportResultHandler@2671.tryUploadSmsConsentAfterLogin$1$1$2");
        Throwable th = (Throwable) obj;
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("doUploadSmsConsentStatus() - error: ");
        sbLIZ.append(th);
        C2188811AlT.LIZIZ(sbLIZ);
        C0XGR c0xgr = new C0XGR();
        c0xgr.LIZLLL("enter_from", "input_code_page");
        c0xgr.LIZLLL("page_name", "input_code_page");
        int i2 = C851170XaF.LIZ[((EnumC852910Xd3) afS149S0200000_13.l0).ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                string = ((EnumC852910Xd3) afS149S0200000_13.l0).toString();
            } else {
                string = "log_in";
            }
        } else {
            string = "sign_up";
        }
        c0xgr.LIZLLL("trigger", string);
        c0xgr.LIZLLL("show_type", "checkbox");
        c0xgr.LIZLLL("mobile", "1");
        Bundle arguments = ((Fragment) afS149S0200000_13.l1).getArguments();
        if (arguments != null && arguments.getBoolean("sms_checkbox_checked")) {
            str = "check";
        } else {
            str = "non_check";
        }
        c0xgr.LIZLLL("action_type", str);
        c0xgr.LIZLLL(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, CardStruct.IStatusCode.DEFAULT);
        c0xgr.LIZLLL("fail_reason", th.getMessage());
        C20684815ws.LJIILLIIL("tiktok_sms_popup_click", c0xgr.LIZ);
        C1C7U.LIZIZ("AccountPassportResultHandler@2671.tryUploadSmsConsentAfterLogin$1$1$2");
    }

    public static final void accept$10(AfS149S0200000_13 afS149S0200000_13, Object obj) {
        Function1 function1;
        C1C7U.LIZ("NetworkHelper@8b8f.verifyMobilePassword$3");
        if ((obj instanceof C0XZJ) && (function1 = (Function1) afS149S0200000_13.l0) != null) {
            function1.invoke(obj);
        }
        C852170Xbr c852170Xbr = C852170Xbr.LIZ;
        C0XZ4.LIZ.getClass();
        C852170Xbr.LJIILLIIL(c852170Xbr, false, ((C0XYD) afS149S0200000_13.l1).getMobParams().LJJLIIIJJI(), ((C0XYD) afS149S0200000_13.l1).getMobParams().LLIIJI());
        C1C7U.LIZIZ("NetworkHelper@8b8f.verifyMobilePassword$3");
    }

    public static final void accept$11(AfS149S0200000_13 afS149S0200000_13, Object obj) throws JSONException {
        C1C7U.LIZ("GSMAProcessHandlingFragment@171f.onViewCreated$2$1");
        C850340XXk c850340XXk = (C850340XXk) obj;
        PhoneNumberUtil.PhoneNumber phoneNumber = (PhoneNumberUtil.PhoneNumber) afS149S0200000_13.l0;
        if (phoneNumber != null) {
            C813020Vuu.LJIIL().LJIIJJI(((GSMAProcessHandlingFragment) afS149S0200000_13.l1).getContext(), "country", phoneNumber.getCountryIso());
        }
        boolean z = true;
        if (c850340XXk.LJIIIZ != null) {
            JSONObject jSONObject = new JSONObject();
            Bundle arguments = ((GSMAProcessHandlingFragment) afS149S0200000_13.l1).getArguments();
            if (arguments == null || !arguments.getBoolean("need_show_gsma_text")) {
                z = false;
            }
            jSONObject.put("need_show_gsma_toast", z);
            C0XYO c0xyo = C0XYO.LIZ;
            GSMAProcessHandlingFragment gSMAProcessHandlingFragment = (GSMAProcessHandlingFragment) afS149S0200000_13.l1;
            EnumC852660Xce enumC852660Xce = EnumC852660Xce.LOGIN;
            EnumC852910Xd3 enumC852910Xd3 = EnumC852910Xd3.PHONE_SMS_SIGN_UP;
            C0XO3 c0xo3 = c850340XXk.LJIIIZ;
            c0xyo.getClass();
            C0XYO.LIZJ(gSMAProcessHandlingFragment, gSMAProcessHandlingFragment, enumC852660Xce, enumC852910Xd3, jSONObject, c0xo3);
        }
        C1C7U.LIZIZ("GSMAProcessHandlingFragment@171f.onViewCreated$2$1");
    }

    public static final void accept$12(AfS149S0200000_13 afS149S0200000_13, Object obj) {
        String str;
        String str2;
        C1C7U.LIZ("VerifyPasswordFragment@c501.onViewCreated$9$1");
        C0XT7 c0xt7 = (C0XT7) obj;
        ((VerifyPasswordFragment) afS149S0200000_13.l0).RS(0, true);
        View rootView = ((View) afS149S0200000_13.l1).getRootView();
        if (rootView != null) {
            KeyboardUtils.LIZIZ(rootView);
        }
        String str3 = "";
        if (((VerifyPasswordFragment) afS149S0200000_13.l0).QS()) {
            int i = C853540Xe4.LIZ[((VerifyPasswordFragment) afS149S0200000_13.l0).SR().ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i == 4) {
                            C854460XfY c854460XfY = C854460XfY.LIZ;
                            VerifyPasswordFragment verifyPasswordFragment = (VerifyPasswordFragment) afS149S0200000_13.l0;
                            c854460XfY.getClass();
                            C854460XfY.LIZIZ(verifyPasswordFragment, null);
                        } else {
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("Unknown scene [");
                            sbLIZ.append(((VerifyPasswordFragment) afS149S0200000_13.l0).SR());
                            sbLIZ.append("] during password verification");
                            throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ));
                        }
                    } else {
                        C854460XfY c854460XfY2 = C854460XfY.LIZ;
                        VerifyPasswordFragment verifyPasswordFragment2 = (VerifyPasswordFragment) afS149S0200000_13.l0;
                        c854460XfY2.getClass();
                        C854460XfY.LIZJ(verifyPasswordFragment2, null);
                    }
                } else {
                    C852810Xct c852810Xct = C852810Xct.LIZ;
                    VerifyPasswordFragment verifyPasswordFragment3 = (VerifyPasswordFragment) afS149S0200000_13.l0;
                    c852810Xct.getClass();
                    C852810Xct.LJIIZILJ(verifyPasswordFragment3, "");
                    VerifyPasswordFragment verifyPasswordFragment4 = (VerifyPasswordFragment) afS149S0200000_13.l0;
                    Bundle arguments = verifyPasswordFragment4.getArguments();
                    if (arguments == null) {
                        arguments = new Bundle();
                    }
                    arguments.putInt("next_page", EnumC852910Xd3.INPUT_EMAIL_CHANGE.getValue());
                    verifyPasswordFragment4.fo(arguments);
                }
            } else {
                C852810Xct c852810Xct2 = C852810Xct.LIZ;
                VerifyPasswordFragment verifyPasswordFragment5 = (VerifyPasswordFragment) afS149S0200000_13.l0;
                c852810Xct2.getClass();
                C852810Xct.LJIJI(verifyPasswordFragment5.getArguments(), "");
                VerifyPasswordFragment verifyPasswordFragment6 = (VerifyPasswordFragment) afS149S0200000_13.l0;
                Bundle arguments2 = verifyPasswordFragment6.getArguments();
                if (arguments2 == null) {
                    arguments2 = new Bundle();
                }
                arguments2.putInt("next_page", EnumC852910Xd3.INPUT_PHONE_MODIFY.getValue());
                verifyPasswordFragment6.fo(arguments2);
            }
        } else if (((VerifyPasswordFragment) afS149S0200000_13.l0).SR() == EnumC852660Xce.MODIFY_PHONE) {
            VerifyPasswordFragment verifyPasswordFragment7 = (VerifyPasswordFragment) afS149S0200000_13.l0;
            Bundle arguments3 = verifyPasswordFragment7.getArguments();
            if (arguments3 == null) {
                arguments3 = new Bundle();
            }
            arguments3.putInt("next_page", EnumC852910Xd3.INPUT_PHONE_MODIFY.getValue());
            C0XZP c0xzp = (C0XZP) c0xt7.LJIIIZ;
            if (c0xzp != null && (str2 = c0xzp.LJIIIIZZ) != null) {
                str3 = str2;
            }
            C786410Ut5.LJJJI("ticket", str3, arguments3);
            verifyPasswordFragment7.fo(arguments3);
        } else {
            Bundle bundle = new Bundle();
            C0XZP c0xzp2 = (C0XZP) c0xt7.LJIIIZ;
            if (c0xzp2 != null && (str = c0xzp2.LJIIIIZZ) != null) {
                str3 = str;
            }
            C786410Ut5.LJJJI("ticket", str3, bundle);
            C0XQ5.LJIIJJI(17, 1, bundle);
            C19EG activity = ((VerifyPasswordFragment) afS149S0200000_13.l0).getActivity();
            if (activity != null) {
                activity.finish();
            }
        }
        C1C7U.LIZIZ("VerifyPasswordFragment@c501.onViewCreated$9$1");
    }

    public static final void accept$13(AfS149S0200000_13 afS149S0200000_13, Object obj) {
        IPublishDrillService iPublishDrillService;
        PublishTestSupportTask publishTestSupportTask = (PublishTestSupportTask) afS149S0200000_13.l0;
        Context context = (Context) afS149S0200000_13.l1;
        PublishTestSupportTCEApi.PublishTestSupportTCEResponse publishTestSupportTCEResponse = (PublishTestSupportTCEApi.PublishTestSupportTCEResponse) obj;
        publishTestSupportTask.getClass();
        C1C7U.LIZ("PublishTestSupportTask@9b60.drillPublishTestTCE$1L");
        if (publishTestSupportTCEResponse != null) {
            try {
                PublishTestSupportSetting$PublishTestSupportConfig publishTestSupportSetting$PublishTestSupportConfig = publishTestSupportTCEResponse.data;
                if (publishTestSupportSetting$PublishTestSupportConfig != null && (iPublishDrillService = publishTestSupportTask.LL) != null) {
                    iPublishDrillService.LIZ(context, publishTestSupportSetting$PublishTestSupportConfig);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        C1C7U.LIZIZ("PublishTestSupportTask@9b60.drillPublishTestTCE$1L");
    }

    public static final void accept$14(AfS149S0200000_13 afS149S0200000_13, Object obj) {
        C1C7U.LIZ("CreatePasswordFlowStep@3262.handleAction$1");
        Bundle bundle = new Bundle();
        bundle.putBoolean("ocl_checkbox_checked", ((C852460XcK) afS149S0200000_13.l0).LIZIZ);
        InterfaceC853780XeS interfaceC853780XeS = (InterfaceC853780XeS) afS149S0200000_13.l1;
        if (interfaceC853780XeS != null) {
            interfaceC853780XeS.LIZIZ(bundle, true);
        }
        C1C7U.LIZIZ("CreatePasswordFlowStep@3262.handleAction$1");
    }

    public static final void accept$15(AfS149S0200000_13 afS149S0200000_13, Object obj) {
        C1C7U.LIZ("BaseBindingFlowStep@5e4e.sendEmailCode$2");
        ((AbstractC854320XfK) afS149S0200000_13.l0).LIZ().getData().putBoolean("code_sent", true);
        InterfaceC853780XeS interfaceC853780XeS = (InterfaceC853780XeS) afS149S0200000_13.l1;
        if (interfaceC853780XeS != null) {
            interfaceC853780XeS.LIZIZ(null, true);
        }
        C1C7U.LIZIZ("BaseBindingFlowStep@5e4e.sendEmailCode$2");
    }

    public static final void accept$16(AfS149S0200000_13 afS149S0200000_13, Object obj) {
        C1C7U.LIZ("VerifyEmailCodeForChangeFlowStep@8af6.handleAction$1");
        ((InputCodeFragmentV2.VerifyCodeActions.ClickResendEmailCodeAction) ((InterfaceC853790XeT) afS149S0200000_13.l0)).getFragment().oT();
        InterfaceC853780XeS interfaceC853780XeS = (InterfaceC853780XeS) afS149S0200000_13.l1;
        if (interfaceC853780XeS != null) {
            interfaceC853780XeS.LIZIZ(null, false);
        }
        C1C7U.LIZIZ("VerifyEmailCodeForChangeFlowStep@8af6.handleAction$1");
    }

    public static final void accept$17(AfS149S0200000_13 afS149S0200000_13, Object obj) {
        String str;
        C1C7U.LIZ("VerifyPasswordForChangeFlowStep@d909.handleAction$1");
        Bundle data = ((C853990Xen) afS149S0200000_13.l0).LIZ.getData();
        ((C853990Xen) afS149S0200000_13.l0).LJIIIIZZ(true, 0, EnumC854390XfR.PASSWORD);
        C852810Xct.LIZ.getClass();
        String str2 = "";
        C852810Xct.LJIILLIIL(data, "");
        Bundle bundle = new Bundle();
        C0XZP c0xzp = (C0XZP) ((C0XT7) obj).LJIIIZ;
        if (c0xzp != null && (str = c0xzp.LJIIIIZZ) != null) {
            str2 = str;
        }
        C786410Ut5.LJJJI("ticket", str2, bundle);
        C0XQ5.LJIIJJI(17, 1, bundle);
        InterfaceC853780XeS interfaceC853780XeS = (InterfaceC853780XeS) afS149S0200000_13.l1;
        if (interfaceC853780XeS != null) {
            interfaceC853780XeS.LIZIZ(null, true);
        }
        C1C7U.LIZIZ("VerifyPasswordForChangeFlowStep@d909.handleAction$1");
    }

    public static final void accept$18(AfS149S0200000_13 afS149S0200000_13, Object obj) {
        C1C7U.LIZ("VerifyPasswordForChangeFlowStep@d909.handleAction$2");
        Throwable th = (Throwable) obj;
        ((C853990Xen) afS149S0200000_13.l0).LJIIIIZZ(false, C0XWH.LIZ(th), EnumC854390XfR.PASSWORD);
        InterfaceC853780XeS interfaceC853780XeS = (InterfaceC853780XeS) afS149S0200000_13.l1;
        if (interfaceC853780XeS != null) {
            interfaceC853780XeS.LIZ(th, false, null);
        }
        C1C7U.LIZIZ("VerifyPasswordForChangeFlowStep@d909.handleAction$2");
    }

    public static final void accept$19(AfS149S0200000_13 afS149S0200000_13, Object obj) {
        C1C7U.LIZ("InputPhoneForBindFlowStep@e270.handleAction$2");
        Throwable th = (Throwable) obj;
        InterfaceC853780XeS interfaceC853780XeS = (InterfaceC853780XeS) afS149S0200000_13.l0;
        if (interfaceC853780XeS != null) {
            interfaceC853780XeS.LIZ(th, false, null);
        }
        C853590Xe9 c853590Xe9 = C853590Xe9.LIZ;
        String string = ((C853580Xe8) afS149S0200000_13.l1).LIZ.getData().getString("enter_from");
        String strValueOf = String.valueOf(((C0XZJ) th).getErrorCode());
        c853590Xe9.getClass();
        C853590Xe9.LIZ(string, CardStruct.IStatusCode.DEFAULT, strValueOf);
        C1C7U.LIZIZ("InputPhoneForBindFlowStep@e270.handleAction$2");
    }

    public static final void accept$2(AfS149S0200000_13 afS149S0200000_13, Object obj) {
        GoogleWebAuth googleWebAuth = (GoogleWebAuth) afS149S0200000_13.l0;
        C2193741AtQ c2193741AtQ = (C2193741AtQ) afS149S0200000_13.l1;
        googleWebAuth.getClass();
        C1C7U.LIZ("GoogleWebAuth@8617.onSuccess$1L");
        c2193741AtQ.LIZLLL = ((LobbyGoogleApi.UserInfoResponse) obj).id;
        googleWebAuth.LLILZIL.xQ2(new AuthResult(c2193741AtQ));
        C1C7U.LIZIZ("GoogleWebAuth@8617.onSuccess$1L");
    }

    public static final void accept$20(AfS149S0200000_13 afS149S0200000_13, Object obj) {
        C1C7U.LIZ("VerifyPhoneForBindFlowStep@5b3a.handleAction$4");
        Throwable th = (Throwable) obj;
        C854460XfY c854460XfY = C854460XfY.LIZ;
        BaseAccountFlowFragment baseAccountFlowFragment = (BaseAccountFlowFragment) afS149S0200000_13.l0;
        String enterFrom = baseAccountFlowFragment.getEnterFrom();
        String enterMethod = ((BaseAccountFlowFragment) afS149S0200000_13.l0).getEnterMethod();
        String strValueOf = String.valueOf(C0XWH.LIZ(th));
        String strRR = ((BaseAccountFlowFragment) afS149S0200000_13.l0).RR();
        c854460XfY.getClass();
        C854460XfY.LJIILLIIL(baseAccountFlowFragment, true, enterFrom, enterMethod, strValueOf, 0, false, strRR);
        InterfaceC853780XeS interfaceC853780XeS = (InterfaceC853780XeS) afS149S0200000_13.l1;
        if (interfaceC853780XeS != null) {
            interfaceC853780XeS.LIZ(th, false, null);
        }
        C1C7U.LIZIZ("VerifyPhoneForBindFlowStep@5b3a.handleAction$4");
    }

    public static final void accept$21(AfS149S0200000_13 afS149S0200000_13, Object obj) {
        KeepAliveBootstrapTask keepAliveBootstrapTask = (KeepAliveBootstrapTask) afS149S0200000_13.l0;
        InterfaceC473930IiF interfaceC473930IiF = (InterfaceC473930IiF) afS149S0200000_13.l1;
        keepAliveBootstrapTask.getClass();
        C1C7U.LIZ("KeepAliveBootstrapTask@5703.run$1L");
        if (C0X35.LJIIL("KeepAliveBootstrapTask")) {
            C799900VZk c799900VZk = C799900VZk.LIZ;
            keepAliveBootstrapTask.LL.getClass();
            c799900VZk.getClass();
            C799900VZk.LJI("KeepAliveBootstrapTask");
            interfaceC473930IiF.LIZ(EnumC800210VaF.Suspend).LIZIZ();
            C11JF c11jf = keepAliveBootstrapTask.LLILLJJLI;
            if (c11jf != null && !c11jf.isDisposed()) {
                keepAliveBootstrapTask.LLILLJJLI.dispose();
            }
        }
        C1C7U.LIZIZ("KeepAliveBootstrapTask@5703.run$1L");
    }

    public static final void accept$22(AfS149S0200000_13 afS149S0200000_13, Object obj) {
        C0XZJ c0xzj;
        C1C7U.LIZ("PIIInputPhoneFlowStep@1a48.handleAction$2");
        Throwable th = (Throwable) obj;
        InterfaceC853780XeS interfaceC853780XeS = (InterfaceC853780XeS) afS149S0200000_13.l0;
        Integer numValueOf = null;
        if (interfaceC853780XeS != null) {
            interfaceC853780XeS.LIZ(th, false, null);
        }
        if (th instanceof C0XZJ) {
            c0xzj = (C0XZJ) th;
        } else {
            c0xzj = null;
        }
        C853590Xe9 c853590Xe9 = C853590Xe9.LIZ;
        String string = ((C1237940iJs) afS149S0200000_13.l1).LIZ().getData().getString("enter_from");
        if (c0xzj != null) {
            numValueOf = Integer.valueOf(c0xzj.getErrorCode());
        }
        String strValueOf = String.valueOf(numValueOf);
        c853590Xe9.getClass();
        C853590Xe9.LIZ(string, CardStruct.IStatusCode.DEFAULT, strValueOf);
        C1C7U.LIZIZ("PIIInputPhoneFlowStep@1a48.handleAction$2");
    }

    public static final void accept$23(AfS149S0200000_13 afS149S0200000_13, Object obj) {
        C1C7U.LIZ("VerifyPhoneForUnbindEmailFlowStep@cd65.handleAction$3");
        Throwable th = (Throwable) obj;
        ((C853840XeY) afS149S0200000_13.l0).LJIIIIZZ(false, C0XWH.LIZ(th), EnumC854390XfR.SMS);
        InterfaceC853780XeS interfaceC853780XeS = (InterfaceC853780XeS) afS149S0200000_13.l1;
        if (interfaceC853780XeS != null) {
            interfaceC853780XeS.LIZ(th, false, null);
        }
        C1C7U.LIZIZ("VerifyPhoneForUnbindEmailFlowStep@cd65.handleAction$3");
    }

    public static final void accept$24(AfS149S0200000_13 afS149S0200000_13, Object obj) {
        C1C7U.LIZ("VerifyPhoneForUnbindPhoneFlowStep@d858.handleAction$3");
        Throwable th = (Throwable) obj;
        ((C853810XeV) afS149S0200000_13.l0).LJIIIIZZ(false, C0XWH.LIZ(th), EnumC854390XfR.SMS);
        InterfaceC853780XeS interfaceC853780XeS = (InterfaceC853780XeS) afS149S0200000_13.l1;
        if (interfaceC853780XeS != null) {
            interfaceC853780XeS.LIZ(th, false, null);
        }
        C1C7U.LIZIZ("VerifyPhoneForUnbindPhoneFlowStep@d858.handleAction$3");
    }

    public static final void accept$25(AfS149S0200000_13 afS149S0200000_13, Object obj) {
        String strOptString;
        String string;
        C1C7U.LIZ("AltLoginForFailed3PHelper@b8fa.loginUsingPassportTicket$1");
        C0XT7 c0xt7 = (C0XT7) obj;
        ((Function1) afS149S0200000_13.l0).invoke(Boolean.TRUE);
        try {
            strOptString = ((PassportTicketLoginQueryObj) c0xt7.LJIIIZ).LJI.LJJIIJ.optString("username");
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            strOptString = "";
        }
        if (strOptString != null && strOptString.length() != 0) {
            string = ((Fragment) afS149S0200000_13.l1).getString(2131836821, strOptString);
        } else {
            string = ((Fragment) afS149S0200000_13.l1).getString(2131846736);
        }
        C1389890mGx c1389890mGx = new C1389890mGx((Fragment) afS149S0200000_13.l1);
        c1389890mGx.LJIIJ(string);
        c1389890mGx.LIZ(true);
        c1389890mGx.LJIIJJI();
        C1C7U.LIZIZ("AltLoginForFailed3PHelper@b8fa.loginUsingPassportTicket$1");
    }

    public static final void accept$3(AfS149S0200000_13 afS149S0200000_13, Object obj) {
        GoogleWebAuth googleWebAuth = (GoogleWebAuth) afS149S0200000_13.l0;
        C2193741AtQ c2193741AtQ = (C2193741AtQ) afS149S0200000_13.l1;
        googleWebAuth.getClass();
        C1C7U.LIZ("GoogleWebAuth@8617.onSuccess$2L");
        LobbyViewModel lobbyViewModel = googleWebAuth.LLILZIL;
        c2193741AtQ.getClass();
        lobbyViewModel.xQ2(new AuthResult(c2193741AtQ));
        C1C7U.LIZIZ("GoogleWebAuth@8617.onSuccess$2L");
    }

    public static final void accept$4(AfS149S0200000_13 afS149S0200000_13, Object obj) {
        C1C7U.LIZ("NetworkHelperKt@edab.request$1");
        ((C0XYD) afS149S0200000_13.l0).dk(0);
        ((C013C) afS149S0200000_13.l1).element = true;
        C1C7U.LIZIZ("NetworkHelperKt@edab.request$1");
    }

    public static final void accept$5(AfS149S0200000_13 afS149S0200000_13, Object obj) {
        C1C7U.LIZ("NetworkHelper@8b8f.requestValidateSMSCode$3");
        C851430Xaf.LIZ(((C0XZJ) ((Throwable) obj)).getErrorCode(), ((C0XYD) afS149S0200000_13.l0).getMobParams().LJJLIIIJJI(), "change_bind_phone_click", "phone", ((C0XYD) afS149S0200000_13.l0).Qm());
        ClientSmsVerificationResultEvent clientSmsVerificationResultEvent = new ClientSmsVerificationResultEvent();
        clientSmsVerificationResultEvent.LJI(((C0XYD) afS149S0200000_13.l0).getMobParams().LJJLIIIJJI(), "enter_from");
        clientSmsVerificationResultEvent.LJI(((C0XYD) afS149S0200000_13.l0).getMobParams().LLIIJI(), "enter_method");
        clientSmsVerificationResultEvent.LJIIJJI(EnumC851410Xad.FAILURE.getValue());
        C0XZ4 c0xz4 = C0XZ4.LIZ;
        EnumC852910Xd3 enumC852910Xd3 = (EnumC852910Xd3) afS149S0200000_13.l1;
        c0xz4.getClass();
        clientSmsVerificationResultEvent.LJIIL(C0XZ4.LJJII(enumC852910Xd3));
        clientSmsVerificationResultEvent.LJIIJ(ClientSubmitSmsCodeEvent.LJIIIIZZ);
        clientSmsVerificationResultEvent.LJIIIIZZ();
        C1C7U.LIZIZ("NetworkHelper@8b8f.requestValidateSMSCode$3");
    }

    public static final void accept$6(AfS149S0200000_13 afS149S0200000_13, Object obj) {
        C1C7U.LIZ("NetworkHelper@8b8f.conditionalBindLogin$6");
        C852170Xbr c852170Xbr = C852170Xbr.LIZ;
        boolean zIsRegister = ((ConditionalBindLoginParam) afS149S0200000_13.l0).isRegister();
        int errorCode = ((C0XZJ) ((Throwable) obj)).getErrorCode();
        BaseAccountFlowFragment mobParams = ((C0XYD) afS149S0200000_13.l1).getMobParams();
        c852170Xbr.getClass();
        C852170Xbr.LJIIIIZZ(zIsRegister, errorCode, "phone", mobParams, null);
        C1C7U.LIZIZ("NetworkHelper@8b8f.conditionalBindLogin$6");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0027 A[PHI: r1
      0x0027: PHI (r1v10 java.lang.String) = (r1v0 java.lang.String), (r1v11 java.lang.String) binds: [B:12:0x0025, B:10:0x0022] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void accept$7(Y.AfS149S0200000_13 r19, java.lang.Object r20) {
        /*
            Method dump skipped, instruction units count: 243
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AfS149S0200000_13.accept$7(Y.AfS149S0200000_13, java.lang.Object):void");
    }

    public static final void accept$8(AfS149S0200000_13 afS149S0200000_13, Object obj) {
        C1C7U.LIZ("NetworkHelper@8b8f.emailLoginWithLoginSelectionTicket$2");
        C0XT7 c0xt7 = (C0XT7) obj;
        C852170Xbr c852170Xbr = C852170Xbr.LIZ;
        BaseAccountFlowFragment mobParams = ((C0XYD) afS149S0200000_13.l0).getMobParams();
        C0XO2 c0xo2 = ((C849260XTg) c0xt7.LJIIIZ).LJIIIZ;
        Map mapLIZJ = C2097908Jt.LIZJ(new Pair("enter_type", "org_account_selection_process"));
        c852170Xbr.getClass();
        C852170Xbr.LJIIL(false, "email", mobParams, c0xo2, mapLIZJ);
        C0XYO c0xyo = C0XYO.LIZ;
        Fragment fragment = (Fragment) afS149S0200000_13.l1;
        C0XYD c0xyd = (C0XYD) afS149S0200000_13.l0;
        EnumC852660Xce enumC852660Xce = EnumC852660Xce.LOGIN;
        EnumC852910Xd3 enumC852910Xd3LLJJLIIIJLLLLLLLZ = c0xyd.LLJJLIIIJLLLLLLLZ();
        C0XO2 c0xo22 = ((C849260XTg) c0xt7.LJIIIZ).LJIIIZ;
        c0xyo.getClass();
        C0XYO.LIZJ(fragment, c0xyd, enumC852660Xce, enumC852910Xd3LLJJLIIIJLLLLLLLZ, null, c0xo22);
        C1C7U.LIZIZ("NetworkHelper@8b8f.emailLoginWithLoginSelectionTicket$2");
    }

    public static final void accept$9(AfS149S0200000_13 afS149S0200000_13, Object obj) {
        C1C7U.LIZ("NetworkHelper@8b8f.quickLoginWithSelectionTicket$2");
        C850340XXk c850340XXk = (C850340XXk) obj;
        C852170Xbr c852170Xbr = C852170Xbr.LIZ;
        BaseAccountFlowFragment mobParams = ((C0XYD) afS149S0200000_13.l0).getMobParams();
        C0XO3 c0xo3 = c850340XXk.LJIIIZ;
        Map mapLIZJ = C2097908Jt.LIZJ(new Pair("enter_type", "org_account_selection_process"));
        c852170Xbr.getClass();
        C852170Xbr.LJIIL(false, "sms_verification", mobParams, c0xo3, mapLIZJ);
        C0XYO c0xyo = C0XYO.LIZ;
        Fragment fragment = (Fragment) afS149S0200000_13.l1;
        C0XYD c0xyd = (C0XYD) afS149S0200000_13.l0;
        EnumC852660Xce enumC852660XceScene = c0xyd.scene();
        EnumC852910Xd3 enumC852910Xd3LLJJLIIIJLLLLLLLZ = ((C0XYD) afS149S0200000_13.l0).LLJJLIIIJLLLLLLLZ();
        C0XO3 c0xo32 = c850340XXk.LJIIIZ;
        c0xyo.getClass();
        C0XYO.LIZJ(fragment, c0xyd, enumC852660XceScene, enumC852910Xd3LLJJLIIIJLLLLLLLZ, null, c0xo32);
        C1C7U.LIZIZ("NetworkHelper@8b8f.quickLoginWithSelectionTicket$2");
    }

    public AfS149S0200000_13(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj2;
        this.l1 = obj;
    }
}
