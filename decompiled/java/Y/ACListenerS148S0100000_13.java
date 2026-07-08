package Y;

import X.AbstractC19483511Kn;
import X.AbstractC845670XFl;
import X.ActivityC845760XFu;
import X.C0FNV;
import X.C0I7D;
import X.C0JAD;
import X.C0JAF;
import X.C0WZX;
import X.C0XG3;
import X.C0XGR;
import X.C0XQ5;
import X.C0XQ7;
import X.C0XR7;
import X.C0XTR;
import X.C0XZ4;
import X.C1161920gLG;
import X.C1220404q2;
import X.C1233960iDS;
import X.C1236890iIB;
import X.C1237220iIi;
import X.C1238240iKM;
import X.C1239130iLn;
import X.C1239250iLz;
import X.C1247510iZJ;
import X.C1389890mGx;
import X.C1390850mIV;
import X.C1397510mTF;
import X.C1397580mTM;
import X.C1701330uNH;
import X.C19286010ck;
import X.C19EG;
import X.C19F0;
import X.C20345214jC;
import X.C20345314jD;
import X.C20684815ws;
import X.C2097608Jq;
import X.C2204961BRm;
import X.C2272871Dxl;
import X.C2344009Gk;
import X.C2451909jB;
import X.C785410UrT;
import X.C786410Ut5;
import X.C818380W8m;
import X.C818390W8n;
import X.C820670WHh;
import X.C824390WVp;
import X.C845580XFc;
import X.C845590XFd;
import X.C845650XFj;
import X.C845680XFm;
import X.C845720XFq;
import X.C845730XFr;
import X.C849850XVn;
import X.C851360XaY;
import X.C851370XaZ;
import X.C852470XcL;
import X.C852510XcP;
import X.C852810Xct;
import X.C852960Xd8;
import X.C853570Xe7;
import X.C853660XeG;
import X.C853770XeR;
import X.C854460XfY;
import X.C854720Xfy;
import X.C978720bZm;
import X.C985403tE;
import X.DialogC1389620mGW;
import X.DialogC1802700x0m;
import X.DialogC19307510gD;
import X.DialogC20224814Bq;
import X.DialogC848780XRk;
import X.EnumC852660Xce;
import X.EnumC852910Xd3;
import X.InterfaceC1254030ijp;
import X.InterfaceC1589330rSd;
import X.InterfaceC20345414jE;
import X.InterfaceC853190XdV;
import X.InterfaceC853610XeB;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.text.Editable;
import android.text.TextUtils;
import android.util.Patterns;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.LinearLayout;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.bytedance.android.livesdk.sheet.SheetDemoFragment;
import com.bytedance.android.livesdkapi.host.IHostAction;
import com.bytedance.bpea.transmit.delegate.BPEAThread;
import com.bytedance.ies.safemode.SmartProtected.fastboot.FastBootBlankActivity;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.account.agegate.ftc.FtcCreatePasswordFragment;
import com.ss.android.ugc.aweme.account.bind.BindEmailCodeVerifyFragment;
import com.ss.android.ugc.aweme.account.bind.BindEmailFragment;
import com.ss.android.ugc.aweme.account.bindings.BaseAccountBindingsFlowFragment;
import com.ss.android.ugc.aweme.account.changemail.ChangeEmailVerifyFragment;
import com.ss.android.ugc.aweme.account.changemail.VerifyEmailBeforeChangeFragment;
import com.ss.android.ugc.aweme.account.eventtracking.LocalPhoneCheckInputEvent;
import com.ss.android.ugc.aweme.account.eventtracking.SendSMSFlowEvent;
import com.ss.android.ugc.aweme.account.login.auth.ui.login.SOTLFragment;
import com.ss.android.ugc.aweme.account.login.auth.ui.login.SOTLViewModel;
import com.ss.android.ugc.aweme.account.login.utils.PhoneNumberUtil;
import com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment;
import com.ss.android.ugc.aweme.account.login.v2.base.CommonFlowActivity;
import com.ss.android.ugc.aweme.account.login.v2.ui.fragments.CommonInputEmailFragment;
import com.ss.android.ugc.aweme.account.login.v2.ui.fragments.EmailSignUpFragment;
import com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputEmailFragment;
import com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputPasswordFragment;
import com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputPhoneCodeFragment;
import com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputPhoneFragment;
import com.ss.android.ugc.aweme.account.otl.BaseOTLIntentHandlerActivity;
import com.ss.android.ugc.aweme.account.setpwd.BaseUpdatePasswordFragment;
import com.ss.android.ugc.aweme.account.setpwd.VerifyPasswordFragment;
import com.ss.android.ugc.aweme.account.ui.BindOrModifyPhoneActivity;
import com.ss.android.ugc.aweme.account.unbind.UnbindInputCodeFragment;
import com.ss.android.ugc.aweme.account.verify.ConfirmEmailFragment;
import com.ss.android.ugc.aweme.account.verify.VerifyEmailCodeFragment;
import com.ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.ss.android.ugc.aweme.changeregionapi.api.IPNSChangeRegionService;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ss.android.ugc.aweme.services.BindService;
import com.ss.android.ugc.aweme.shortvideo.sticker.livecountdown.FeedCountStickerDialogFragment;
import com.ss.android.ugc.aweme.sticker.data.CountDownStickerStruct;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS557S0100000_13;
import kotlin.jvm.internal.AwS592S0100000_13;
import kotlin.jvm.internal.AwS627S0100000_13;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes14.dex */
public class ACListenerS148S0100000_13 implements View.OnClickListener {
    public final int $t;
    public Object l0;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        switch (this.$t) {
            case 0:
                onClick$0(this, view);
                break;
            case 1:
                onClick$1(this, view);
                break;
            case 2:
                onClick$2(this, view);
                break;
            case 3:
                onClick$3(this, view);
                break;
            case 4:
                onClick$4(this, view);
                break;
            case 5:
                onClick$5(this, view);
                break;
            case 6:
                onClick$6(this, view);
                break;
            case 7:
                onClick$7(this, view);
                break;
            case 8:
                onClick$8(this, view);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                onClick$9(this, view);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                onClick$10(this, view);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                onClick$11(this, view);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                onClick$12(this, view);
                break;
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                onClick$13(this, view);
                break;
            case 14:
                onClick$14(this, view);
                break;
            case 15:
                onClick$15(this, view);
                break;
            case 16:
                onClick$16(this, view);
                break;
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                onClick$17(this, view);
                break;
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                onClick$18(this, view);
                break;
            case 19:
                onClick$19(this, view);
                break;
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                onClick$20(this, view);
                break;
            case 21:
                onClick$21(this, view);
                break;
            case 22:
                onClick$22(this, view);
                break;
            case 23:
                onClick$23(this, view);
                break;
            case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                onClick$24(this, view);
                break;
            case 25:
                onClick$25(this, view);
                break;
            case 26:
                onClick$26(this, view);
                break;
            case 27:
                onClick$27(this, view);
                break;
            case 28:
                onClick$28(this, view);
                break;
            case 29:
                onClick$29(this, view);
                break;
            case 30:
                onClick$30(this, view);
                break;
            case 31:
                onClick$31(this, view);
                break;
            case 32:
                onClick$32(this, view);
                break;
            case LiveToolbarIconStyleSetting.GRAY_WITHOUT_TEXT /* 33 */:
                onClick$33(this, view);
                break;
            case LiveToolbarIconStyleSetting.COLORFUL_WITHOUT_TEXT /* 34 */:
                onClick$34(this, view);
                break;
            case 35:
                onClick$35(this, view);
                break;
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITHOUT_TEXT /* 36 */:
                onClick$36(this, view);
                break;
            case 37:
                onClick$37(this, view);
                break;
            case 38:
                onClick$38(this, view);
                break;
            case 39:
                onClick$39(this, view);
                break;
            case 40:
                onClick$40(this, view);
                break;
            case 41:
                onClick$41(this, view);
                break;
            case 42:
                onClick$42(this, view);
                break;
            case 43:
                onClick$43(this, view);
                break;
            case 44:
                onClick$44(this, view);
                break;
            case 45:
                onClick$45(this, view);
                break;
            case 46:
                onClick$46(this, view);
                break;
            case 47:
                onClick$47(this, view);
                break;
            case 48:
                onClick$48(this, view);
                break;
            case 49:
                onClick$49(this, view);
                break;
            case BaseNotice.RECOMMEND_LIVE /* 50 */:
                onClick$50(this, view);
                break;
            case 51:
                onClick$51(this, view);
                break;
        }
    }

    public ACListenerS148S0100000_13(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onClick$0(ACListenerS148S0100000_13 aCListenerS148S0100000_13, View view) {
        String aid;
        FeedCountStickerDialogFragment feedCountStickerDialogFragment = (FeedCountStickerDialogFragment) aCListenerS148S0100000_13.l0;
        Long lValueOf = null;
        if (!C824390WVp.LIZJ(feedCountStickerDialogFragment.getContext())) {
            Context context = feedCountStickerDialogFragment.getContext();
            if (context != null) {
                C1397580mTM c1397580mTM = new C1397580mTM(context);
                c1397580mTM.LJFF(2131847796);
                c1397580mTM.LIZ(2131847799);
                C985403tE.LIZ(c1397580mTM, new AwS592S0100000_13(feedCountStickerDialogFragment, 2));
                new C1397510mTF(c1397580mTM).LIZLLL();
                C2344009Gk c2344009Gk = new C2344009Gk();
                String str = feedCountStickerDialogFragment.LLJILJILJ;
                if (str == null) {
                    str = null;
                }
                c2344009Gk.LJIIIIZZ("enter_from", str);
                c2344009Gk.LJIIIIZZ("enter_method", "live_cd_sticker");
                c2344009Gk.LJIIIIZZ("enter_reason", "general");
                C20684815ws.LJIILLIIL("push_pre_permission_show", c2344009Gk.LIZ);
                return;
            }
            return;
        }
        FeedCountStickerDialogFragment feedCountStickerDialogFragment2 = (FeedCountStickerDialogFragment) aCListenerS148S0100000_13.l0;
        Aweme aweme = feedCountStickerDialogFragment2.LLILLJJLI;
        if (aweme != null) {
            aid = aweme.getAid();
        } else {
            aid = null;
        }
        CountDownStickerStruct countDownStickerStruct = ((FeedCountStickerDialogFragment) aCListenerS148S0100000_13.l0).LL;
        if (countDownStickerStruct != null) {
            lValueOf = Long.valueOf(countDownStickerStruct.getMillSecond());
        }
        feedCountStickerDialogFragment2.VR(lValueOf, aid);
    }

    public static final void onClick$1(ACListenerS148S0100000_13 aCListenerS148S0100000_13, View view) {
        String aid;
        FeedCountStickerDialogFragment feedCountStickerDialogFragment = (FeedCountStickerDialogFragment) aCListenerS148S0100000_13.l0;
        Aweme aweme = feedCountStickerDialogFragment.LLILLJJLI;
        Long lValueOf = null;
        if (aweme != null) {
            aid = aweme.getAid();
        } else {
            aid = null;
        }
        CountDownStickerStruct countDownStickerStruct = ((FeedCountStickerDialogFragment) aCListenerS148S0100000_13.l0).LL;
        if (countDownStickerStruct != null) {
            lValueOf = Long.valueOf(countDownStickerStruct.getMillSecond());
        }
        feedCountStickerDialogFragment.VR(lValueOf, aid);
    }

    public static final void onClick$10(ACListenerS148S0100000_13 aCListenerS148S0100000_13, View view) {
        if (((BaseAccountBindingsFlowFragment) aCListenerS148S0100000_13.l0).OR().yQ2()) {
            BaseAccountBindingsFlowFragment baseAccountBindingsFlowFragment = (BaseAccountBindingsFlowFragment) aCListenerS148S0100000_13.l0;
            baseAccountBindingsFlowFragment.OR().wQ2(new BaseAccountBindingsFlowFragment.BindingActions.ClickMobileAction(new C20345214jC(((BaseAccountBindingsFlowFragment) aCListenerS148S0100000_13.l0).SR()), baseAccountBindingsFlowFragment));
        } else {
            C853770XeR c853770XeR = C853770XeR.LIZ;
            BaseAccountBindingsFlowFragment baseAccountBindingsFlowFragment2 = (BaseAccountBindingsFlowFragment) aCListenerS148S0100000_13.l0;
            C854460XfY.LIZ.getClass();
            C853770XeR.LJ(c853770XeR, baseAccountBindingsFlowFragment2, "auto_system", null, C854460XfY.LJIIJJI(baseAccountBindingsFlowFragment2), null, new AwS557S0100000_13((BaseAccountBindingsFlowFragment) aCListenerS148S0100000_13.l0, 35), 20);
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [X.0XdS] */
    public static final void onClick$11(ACListenerS148S0100000_13 aCListenerS148S0100000_13, View view) {
        ((ChangeEmailVerifyFragment) aCListenerS148S0100000_13.l0).OR().wQ2(new CommonInputEmailFragment.InputEmailActions.ClickChangeEmailAction(new InterfaceC853190XdV() { // from class: X.0XdS
        }, (ChangeEmailVerifyFragment) aCListenerS148S0100000_13.l0));
    }

    public static final void onClick$12(ACListenerS148S0100000_13 aCListenerS148S0100000_13, View view) {
        if (((ChangeEmailVerifyFragment) aCListenerS148S0100000_13.l0).OR().yQ2()) {
            ((ChangeEmailVerifyFragment) aCListenerS148S0100000_13.l0).OR().wQ2(new BaseUpdatePasswordFragment.CreatePasswordActions.ChangeToCreatePasswordAction(new C852470XcL(), (ChangeEmailVerifyFragment) aCListenerS148S0100000_13.l0));
            return;
        }
        ChangeEmailVerifyFragment changeEmailVerifyFragment = (ChangeEmailVerifyFragment) aCListenerS148S0100000_13.l0;
        Bundle bundle = new Bundle(((ChangeEmailVerifyFragment) aCListenerS148S0100000_13.l0).getArguments());
        bundle.putInt("next_page", EnumC852910Xd3.CREATE_PASSWORD_FOR_1P.getValue());
        changeEmailVerifyFragment.fo(bundle);
    }

    public static final void onClick$13(ACListenerS148S0100000_13 aCListenerS148S0100000_13, View view) {
        ((VerifyEmailBeforeChangeFragment) aCListenerS148S0100000_13.l0).YS();
    }

    public static final void onClick$14(ACListenerS148S0100000_13 aCListenerS148S0100000_13, View view) throws Throwable {
        Editable editableLLJILLL;
        final String string;
        Editable editableLLJILLL2;
        boolean zIsChecked;
        String str;
        CompoundButton compoundButton;
        C0XGR c0xgr = new C0XGR();
        EmailSignUpFragment emailSignUpFragment = (EmailSignUpFragment) aCListenerS148S0100000_13.l0;
        if (emailSignUpFragment.LLLL) {
            C1239130iLn c1239130iLn = C1239130iLn.LIZ;
            View view2 = emailSignUpFragment.LLLLIIL;
            if (view2 != null && (compoundButton = (CompoundButton) view2.findViewById(R.id.gyi)) != null) {
                zIsChecked = compoundButton.isChecked();
            } else {
                zIsChecked = false;
            }
            c1239130iLn.getClass();
            if (zIsChecked) {
                str = "checked";
            } else {
                str = "unchecked";
            }
            c0xgr.LIZJ("email_checkbox_status", str);
            c0xgr.LIZJ("text_type", "long_version");
        }
        c0xgr.LIZLLL("platform", "email");
        c0xgr.LIZLLL("enter_method", ((EmailSignUpFragment) aCListenerS148S0100000_13.l0).getEnterMethod());
        c0xgr.LIZLLL("enter_from", ((EmailSignUpFragment) aCListenerS148S0100000_13.l0).getEnterFrom());
        c0xgr.LIZLLL("login_panel_type", ((EmailSignUpFragment) aCListenerS148S0100000_13.l0).PR());
        c0xgr.LIZIZ(System.currentTimeMillis() - ((EmailSignUpFragment) aCListenerS148S0100000_13.l0).LLLJIL, "stay_time");
        C20684815ws.LJIILLIIL("phone_email_click_next", c0xgr.LIZ);
        C0I7D c0i7d = ((EmailSignUpFragment) aCListenerS148S0100000_13.l0).LLLLIIIILLL;
        if (c0i7d != null) {
            editableLLJILLL = C2204961BRm.LLJILLL(c0i7d, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOurYJDb0ibECfF1owsk1PEpk5Z4F7WzzjzzRSEqAB37ynHWIjuyQuGOdqJEX/IM2lI=", null));
        } else {
            editableLLJILLL = null;
        }
        if (!TextUtils.isEmpty(editableLLJILLL) && Patterns.EMAIL_ADDRESS.matcher(editableLLJILLL).matches()) {
            ((EmailSignUpFragment) aCListenerS148S0100000_13.l0).NS().LIZ();
            final EmailSignUpFragment emailSignUpFragment2 = (EmailSignUpFragment) aCListenerS148S0100000_13.l0;
            C0I7D c0i7d2 = emailSignUpFragment2.LLLLIIIILLL;
            if (c0i7d2 == null || (editableLLJILLL2 = C2204961BRm.LLJILLL(c0i7d2, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOurYJDb0ibECfF1owsk1PEpk5Z4F7WzzjzzRSEqAB37ynHWIjuyQuGOdqJEX/IM2lI=", null))) == null || (string = editableLLJILLL2.toString()) == null) {
                string = "";
            }
            C0XZ4 c0xz4 = C0XZ4.LIZ;
            final EnumC852660Xce enumC852660Xce = EnumC852660Xce.SIGN_UP;
            final EnumC852910Xd3 enumC852910Xd3VR = emailSignUpFragment2.VR();
            final Map mapLJ = C2097608Jq.LJ();
            c0xz4.getClass();
            C1239250iLz.LIZIZ(emailSignUpFragment2, emailSignUpFragment2, AbstractC19483511Kn.LJ(new InterfaceC1254030ijp() { // from class: X.0XWn
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r3v0, types: [X.0XGw, X.0XWm] */
                @Override // X.InterfaceC1254030ijp
                public final void LIZ(final C11KY c11ky) {
                    final EnumC852660Xce enumC852660Xce2 = enumC852660Xce;
                    final EnumC852910Xd3 enumC852910Xd3 = enumC852910Xd3VR;
                    ?? r3 = new AbstractC850120XWo() { // from class: X.0XWm
                        @Override // X.C0XH7
                        public final void LJFF(C0XGA c0xga) {
                            ((C11KY) c11ky).onError(new C0XZJ(c0xga.LIZLLL, c0xga.LJFF, enumC852660Xce2, enumC852910Xd3, null, ""));
                        }

                        @Override // X.C0XH7
                        /* JADX INFO: renamed from: LJIIIIZZ, reason: merged with bridge method [inline-methods] */
                        public final void LJI(C0XT7<C849580XUm> c0xt7) {
                            ((C11KY) c11ky).onSuccess(c0xt7.LJIIIZ);
                        }

                        @Override // X.C0XH7
                        /* JADX INFO: renamed from: LJII, reason: merged with bridge method [inline-methods] */
                        public final void LJ(C0XT7<C849580XUm> c0xt7, int i) {
                            int i2;
                            String str2;
                            C0XWW<C849580XUm> c0xww = c11ky;
                            if (c0xt7 != null) {
                                i2 = c0xt7.LIZLLL;
                            } else {
                                i2 = -10000;
                            }
                            if (c0xt7 != null) {
                                str2 = c0xt7.LJFF;
                            } else {
                                str2 = null;
                            }
                            ((C11KY) c0xww).onError(new C0XZJ(i2, str2, enumC852660Xce2, enumC852910Xd3, null, ""));
                        }
                    };
                    emailSignUpFragment2.gk(r3);
                    emailSignUpFragment2.Fb().LIZLLL(string, mapLJ, r3);
                }
            }).LJII(new AfS182S0100000_13(emailSignUpFragment2, 23))).LJIIIIZZ(new AfS46S1100000_13(emailSignUpFragment2, string, 6)).LJIILL();
            return;
        }
        EmailSignUpFragment emailSignUpFragment3 = (EmailSignUpFragment) aCListenerS148S0100000_13.l0;
        emailSignUpFragment3.pn(0, emailSignUpFragment3.getString(2131829338));
        C853660XeG c853660XeG = C853660XeG.LIZ;
        String enterMethod = ((EmailSignUpFragment) aCListenerS148S0100000_13.l0).getEnterMethod();
        String enterFrom = ((EmailSignUpFragment) aCListenerS148S0100000_13.l0).getEnterFrom();
        String strPR = ((EmailSignUpFragment) aCListenerS148S0100000_13.l0).PR();
        c853660XeG.getClass();
        C853660XeG.LJII(enterMethod, null, enterFrom, "email", null, strPR, null);
    }

    public static final void onClick$15(ACListenerS148S0100000_13 aCListenerS148S0100000_13, View view) {
        boolean zIsChecked;
        String str;
        CompoundButton compoundButton;
        C1239130iLn c1239130iLn = C1239130iLn.LIZ;
        View view2 = ((EmailSignUpFragment) aCListenerS148S0100000_13.l0).LLLLIIL;
        if (view2 != null && (compoundButton = (CompoundButton) view2.findViewById(R.id.gyi)) != null) {
            zIsChecked = compoundButton.isChecked();
        } else {
            zIsChecked = false;
        }
        c1239130iLn.getClass();
        C0XGR c0xgr = new C0XGR();
        if (zIsChecked) {
            str = "checked";
        } else {
            str = "unchecked";
        }
        c0xgr.LIZJ("email_checkbox_status", str);
        c0xgr.LIZJ("text_type", "long_version");
        c0xgr.LIZLLL("page_name", "email_signup_page");
        c0xgr.LIZLLL("exp_name", "onboarding_collect_email_consent");
        C20684815ws.LJIILLIIL("click_button_consent_check_box", c0xgr.LIZ);
    }

    public static final void onClick$16(ACListenerS148S0100000_13 aCListenerS148S0100000_13, View view) {
        C0FNV.LIZJ(DialogC20224814Bq.LJJLIIIJLLLLLLLZ(((EmailSignUpFragment) aCListenerS148S0100000_13.l0).getActivity()));
    }

    public static final void onClick$17(ACListenerS148S0100000_13 aCListenerS148S0100000_13, View view) {
        C1237220iIi c1237220iIi;
        InputEmailFragment inputEmailFragment = (InputEmailFragment) aCListenerS148S0100000_13.l0;
        C0I7D c0i7d = inputEmailFragment.LLLILZJ;
        if (c0i7d == null) {
            c0i7d = null;
        }
        String string = C2204961BRm.LLJILLL(c0i7d, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOurYJDb0ibECfF1owsk1PEpk5Z4F7WzzjzzRSEqABH4223OND+0RUCFjYVoLbGSwA==", null)).toString();
        C851370XaZ c851370XaZLIZ = C851360XaY.LIZ(inputEmailFragment.getActivity(), string, inputEmailFragment.SR());
        if (c851370XaZLIZ != null && (c1237220iIi = c851370XaZLIZ.LIZ) != null && c1237220iIi.LIZIZ()) {
            inputEmailFragment.PS(string, false);
        } else {
            if (!C2451909jB.LIZ(string)) {
                inputEmailFragment.pn(0, inputEmailFragment.getString(2131829338));
                return;
            }
            C0XZ4 c0xz4 = C0XZ4.LIZ;
            C854460XfY.LIZ.getClass();
            C0XZ4.LJJIII(c0xz4, inputEmailFragment, inputEmailFragment, string, 4, "user_click", C854460XfY.LJIIJJI(inputEmailFragment), null, null, null, null, 960).LJIIIIZZ(new AfS46S1100000_13(inputEmailFragment, string, 13)).LJIILL();
        }
    }

    public static final void onClick$18(ACListenerS148S0100000_13 aCListenerS148S0100000_13, View view) {
        boolean z;
        String str;
        final String str2 = null;
        if (((InputPasswordFragment) aCListenerS148S0100000_13.l0).SR() == EnumC852660Xce.RECOVER_ACCOUNT) {
            C0XZ4 c0xz4 = C0XZ4.LIZ;
            final InputPasswordFragment inputPasswordFragment = (InputPasswordFragment) aCListenerS148S0100000_13.l0;
            C0I7D c0i7d = inputPasswordFragment.LLLILZJ;
            if (c0i7d == null) {
                c0i7d = null;
            }
            final String string = C2204961BRm.LLJILLL(c0i7d, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOurYJDb0ibECfF1owsk1PEpk5Z4F7WzzjzzRSEqABH4223OITOmX7PNaJJC4UUcMH+Xqw==", null)).toString();
            C852510XcP c852510XcP = ((InputPasswordFragment) aCListenerS148S0100000_13.l0).LLLILZLLLI;
            if (c852510XcP != null) {
                str2 = c852510XcP.ticket;
            }
            c0xz4.getClass();
            C1239250iLz.LIZIZ(inputPasswordFragment, inputPasswordFragment, AbstractC19483511Kn.LJ(new InterfaceC1254030ijp() { // from class: X.0XX3
                public final /* synthetic */ String LIZ = "phone";
                public final /* synthetic */ String LJFF = "";

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r3v1, types: [X.0XGw, X.0XWx] */
                @Override // X.InterfaceC1254030ijp
                public final void LIZ(final C11KY c11ky) {
                    C852170Xbr c852170Xbr = C852170Xbr.LIZ;
                    Boolean bool = Boolean.FALSE;
                    String str3 = this.LIZ;
                    BaseAccountFlowFragment mobParams = inputPasswordFragment.getMobParams();
                    c852170Xbr.getClass();
                    C852170Xbr.LJIIJ(bool, str3, mobParams, false, null);
                    final C0XYD c0xyd = inputPasswordFragment;
                    final String str4 = this.LIZ;
                    final String str5 = string;
                    final String str6 = this.LJFF;
                    ?? r3 = new AbstractC850220XWy() { // from class: X.0XWx
                        @Override // X.C0XH7
                        public final void LJFF(C0XGA c0xga) {
                            ((C11KY) c11ky).onError(new C0XZJ(c0xga.LIZLLL, c0xga.LJFF, EnumC852660Xce.LOGIN, c0xyd.LLJJLIIIJLLLLLLLZ(), null, c0xga.LJFF));
                        }

                        @Override // X.C0XH7
                        /* JADX INFO: renamed from: LJIIIIZZ, reason: merged with bridge method [inline-methods] */
                        public final void LJI(C0XT7<C0XX6> c0xt7) {
                            T t = c0xt7.LJIIIZ;
                            if (t != 0 && ((C0XX6) t).LJIILJJIL != null) {
                                ((C11KY) c11ky).onSuccess(c0xt7);
                                return;
                            }
                            ((C11KY) c11ky).onError(new C0XZJ(-1, "no data", EnumC852660Xce.LOGIN, EnumC852910Xd3.INPUT_PHONE_FIND_PASSWORD, null, "no data"));
                        }

                        @Override // X.C0XH7
                        /* JADX INFO: renamed from: LJII, reason: merged with bridge method [inline-methods] */
                        public final void LJ(C0XT7<C0XX6> c0xt7, int i) throws JSONException {
                            int i2;
                            String str7;
                            String str8;
                            C0XWW<C0XT7<C0XX6>> c0xww = c11ky;
                            if (c0xt7 != null) {
                                i2 = c0xt7.LIZLLL;
                            } else {
                                i2 = -10000;
                            }
                            String str9 = null;
                            if (c0xt7 != null) {
                                str7 = c0xt7.LJFF;
                            } else {
                                str7 = null;
                            }
                            EnumC852660Xce enumC852660Xce = EnumC852660Xce.LOGIN;
                            EnumC852910Xd3 enumC852910Xd3LLJJLIIIJLLLLLLLZ = c0xyd.LLJJLIIIJLLLLLLLZ();
                            C0XZ4.LIZ.getClass();
                            JSONObject jSONObjectLJIIJJI = C0XZ4.LJIIJJI(c0xt7);
                            if (jSONObjectLJIIJJI != null) {
                                String str10 = str4;
                                String str11 = str5;
                                String str12 = str6;
                                jSONObjectLJIIJJI.put("loginType", str10);
                                jSONObjectLJIIJJI.put("pwd", str11);
                                jSONObjectLJIIJJI.put("handle", str12);
                            } else {
                                jSONObjectLJIIJJI = null;
                            }
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            if (c0xt7 != null) {
                                str8 = c0xt7.LJFF;
                            } else {
                                str8 = null;
                            }
                            sbLIZ.append(str8);
                            sbLIZ.append('|');
                            if (c0xt7 != null) {
                                str9 = c0xt7.LJI;
                            }
                            sbLIZ.append(str9);
                            ((C11KY) c0xww).onError(new C0XZJ(i2, str7, enumC852660Xce, enumC852910Xd3LLJJLIIIJLLLLLLLZ, jSONObjectLJIIJJI, C2188811AlT.LIZIZ(sbLIZ)));
                        }
                    };
                    inputPasswordFragment.gk(r3);
                    String str7 = this.LIZ;
                    if (Intrinsics.LJFF(str7, "phone")) {
                        C0XX5.LIZ(inputPasswordFragment.requireContext(), str2, string, EnumC852660Xce.LOGIN.getValue(), 3, r3).LJIIIZ();
                    } else if (Intrinsics.LJFF(str7, "email")) {
                        C0XX5.LIZ(inputPasswordFragment.requireContext(), str2, string, EnumC852660Xce.LOGIN.getValue(), 2, r3).LJIIIZ();
                    } else {
                        inputPasswordFragment.m8().LJIIJJI(this.LJFF, string, r3);
                    }
                }
            }).LJIIIIZZ(new AfS40S1200000_13(inputPasswordFragment, inputPasswordFragment, 4)).LJII(new AfS46S1100000_13(inputPasswordFragment, 4))).LJIILL();
            return;
        }
        if (((InputPasswordFragment) aCListenerS148S0100000_13.l0).VR() == EnumC852910Xd3.FAILED_3P_PASSWORD_LOGIN) {
            C0XZ4 c0xz42 = C0XZ4.LIZ;
            InputPasswordFragment inputPasswordFragment2 = (InputPasswordFragment) aCListenerS148S0100000_13.l0;
            C0I7D c0i7d2 = inputPasswordFragment2.LLLILZJ;
            if (c0i7d2 == null) {
                c0i7d2 = null;
            }
            String string2 = C2204961BRm.LLJILLL(c0i7d2, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOurYJDb0ibECfF1owsk1PEpk5Z4F7WzzjzzRSEqABH4223OITOmX7PNaJJC4UUcMH+Xqw==", null)).toString();
            C854460XfY c854460XfY = C854460XfY.LIZ;
            InputPasswordFragment inputPasswordFragment3 = (InputPasswordFragment) aCListenerS148S0100000_13.l0;
            c854460XfY.getClass();
            Map mapLJIIJJI = C854460XfY.LJIIJJI(inputPasswordFragment3);
            c0xz42.getClass();
            C0XZ4.LJJIZ(inputPasswordFragment2, inputPasswordFragment2, string2, mapLJIIJJI).LJIIIIZZ(new AfS182S0100000_13((InputPasswordFragment) aCListenerS148S0100000_13.l0, 45)).LJIILL();
            return;
        }
        if (((InputPasswordFragment) aCListenerS148S0100000_13.l0).SR() == EnumC852660Xce.HISTORY_LOGIN_WITH_PASSPORT_TICKET) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            Bundle arguments = ((InputPasswordFragment) aCListenerS148S0100000_13.l0).getArguments();
            if (arguments != null) {
                C786410Ut5.LJJJI("verify_method", "", arguments);
            }
            C0XZ4 c0xz43 = C0XZ4.LIZ;
            InputPasswordFragment inputPasswordFragment4 = (InputPasswordFragment) aCListenerS148S0100000_13.l0;
            C0I7D c0i7d3 = inputPasswordFragment4.LLLILZJ;
            if (c0i7d3 == null) {
                c0i7d3 = null;
            }
            String string3 = C2204961BRm.LLJILLL(c0i7d3, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOurYJDb0ibECfF1owsk1PEpk5Z4F7WzzjzzRSEqABH4223OITOmX7PNaJJC4UUcMH+Xqw==", null)).toString();
            C854460XfY c854460XfY2 = C854460XfY.LIZ;
            InputPasswordFragment inputPasswordFragment5 = (InputPasswordFragment) aCListenerS148S0100000_13.l0;
            c854460XfY2.getClass();
            C0XZ4.LJIJ(c0xz43, inputPasswordFragment4, inputPasswordFragment4, "", string3, "handle", C854460XfY.LJIIJ(inputPasswordFragment5), 64).LJIILL();
            return;
        }
        if (((InputPasswordFragment) aCListenerS148S0100000_13.l0).VR() == EnumC852910Xd3.EMAIL_OTP_LOGIN_SWITCH_TO_PASSWORD) {
            Bundle arguments2 = ((InputPasswordFragment) aCListenerS148S0100000_13.l0).getArguments();
            if (arguments2 != null) {
                C786410Ut5.LJJJI("verify_method", "", arguments2);
            }
            C852810Xct c852810Xct = C852810Xct.LIZ;
            InputPasswordFragment inputPasswordFragment6 = (InputPasswordFragment) aCListenerS148S0100000_13.l0;
            c852810Xct.getClass();
            String strLIZLLL = C852810Xct.LIZLLL(inputPasswordFragment6);
            C0XZ4 c0xz44 = C0XZ4.LIZ;
            InputPasswordFragment inputPasswordFragment7 = (InputPasswordFragment) aCListenerS148S0100000_13.l0;
            C0I7D c0i7d4 = inputPasswordFragment7.LLLILZJ;
            if (c0i7d4 == null) {
                c0i7d4 = null;
            }
            String string4 = C2204961BRm.LLJILLL(c0i7d4, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOurYJDb0ibECfF1owsk1PEpk5Z4F7WzzjzzRSEqABH4223OITOmX7PNaJJC4UUcMH+Xqw==", null)).toString();
            if (C2451909jB.LIZ(strLIZLLL)) {
                str = "email";
            } else {
                str = "handle";
            }
            C0XZ4.LJIJ(c0xz44, inputPasswordFragment7, inputPasswordFragment7, strLIZLLL, string4, str, null, 96).LJIILL();
            return;
        }
        C0XZ4 c0xz45 = C0XZ4.LIZ;
        InputPasswordFragment inputPasswordFragment8 = (InputPasswordFragment) aCListenerS148S0100000_13.l0;
        C852810Xct.LIZ.getClass();
        String strLIZ = PhoneNumberUtil.LIZ(C852810Xct.LJI(inputPasswordFragment8));
        C0I7D c0i7d5 = ((InputPasswordFragment) aCListenerS148S0100000_13.l0).LLLILZJ;
        if (c0i7d5 == null) {
            c0i7d5 = null;
        }
        C0XZ4.LJIJ(c0xz45, inputPasswordFragment8, inputPasswordFragment8, strLIZ, C2204961BRm.LLJILLL(c0i7d5, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOurYJDb0ibECfF1owsk1PEpk5Z4F7WzzjzzRSEqABH4223OITOmX7PNaJJC4UUcMH+Xqw==", null)).toString(), "phone", null, 96).LJIILL();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [X.0Xe6] */
    public static final void onClick$19(ACListenerS148S0100000_13 aCListenerS148S0100000_13, View view) {
        ((InputPhoneCodeFragment) aCListenerS148S0100000_13.l0).OR().wQ2(new InputPhoneFragment.InputPhoneActions.ClickChangePhoneAction(new InterfaceC853610XeB() { // from class: X.0Xe6
        }, (InputPhoneCodeFragment) aCListenerS148S0100000_13.l0));
    }

    public static final void onClick$2(ACListenerS148S0100000_13 aCListenerS148S0100000_13, View view) {
        C786410Ut5.LJLLLLLL(8, ((C818380W8m) aCListenerS148S0100000_13.l0).LIZJ);
    }

    public static final void onClick$20(ACListenerS148S0100000_13 aCListenerS148S0100000_13, View view) {
        String string;
        C1237220iIi c1237220iIi;
        InputPhoneFragment inputPhoneFragment = (InputPhoneFragment) aCListenerS148S0100000_13.l0;
        C1238240iKM c1238240iKMQS = inputPhoneFragment.QS();
        if (!PhoneNumberUtil.LJFF(c1238240iKMQS.getCountryCodeString(), c1238240iKMQS.getPhoneNumberString())) {
            LocalPhoneCheckInputEvent localPhoneCheckInputEvent = new LocalPhoneCheckInputEvent();
            localPhoneCheckInputEvent.LJI(inputPhoneFragment.getEnterFrom(), "enter_from");
            localPhoneCheckInputEvent.LJI(inputPhoneFragment.getEnterMethod(), "enter_method");
            localPhoneCheckInputEvent.LJI(0, "result");
            localPhoneCheckInputEvent.LJIIIIZZ();
            inputPhoneFragment.pn(0, inputPhoneFragment.getString(2131829357));
            return;
        }
        LocalPhoneCheckInputEvent localPhoneCheckInputEvent2 = new LocalPhoneCheckInputEvent();
        localPhoneCheckInputEvent2.LJI(inputPhoneFragment.getEnterFrom(), "enter_from");
        localPhoneCheckInputEvent2.LJI(inputPhoneFragment.getEnterMethod(), "enter_method");
        localPhoneCheckInputEvent2.LJI(1, "result");
        localPhoneCheckInputEvent2.LJIIIIZZ();
        PhoneNumberUtil.PhoneNumber phoneNumberObject = c1238240iKMQS.getPhoneNumberObject();
        inputPhoneFragment.LLLJ = true;
        if (inputPhoneFragment.OR().yQ2()) {
            SendSMSFlowEvent sendSMSFlowEvent = new SendSMSFlowEvent();
            sendSMSFlowEvent.LJI(inputPhoneFragment.getEnterFrom(), "enter_from");
            sendSMSFlowEvent.LJI(inputPhoneFragment.getEnterMethod(), "enter_method");
            sendSMSFlowEvent.LJI(1, "refactor_flow");
            sendSMSFlowEvent.LJIIIIZZ();
            inputPhoneFragment.OR().wQ2(new InputPhoneFragment.InputPhoneActions.ClickSendCodeAction(new C853570Xe7(PhoneNumberUtil.LIZ(phoneNumberObject), inputPhoneFragment.SR(), inputPhoneFragment.RR()), inputPhoneFragment));
            return;
        }
        SendSMSFlowEvent sendSMSFlowEvent2 = new SendSMSFlowEvent();
        sendSMSFlowEvent2.LJI(inputPhoneFragment.getEnterFrom(), "enter_from");
        sendSMSFlowEvent2.LJI(inputPhoneFragment.getEnterMethod(), "enter_method");
        sendSMSFlowEvent2.LJI(0, "refactor_flow");
        sendSMSFlowEvent2.LJIIIIZZ();
        C851370XaZ c851370XaZLIZ = C851360XaY.LIZ(inputPhoneFragment.getActivity(), c1238240iKMQS.getFullPhoneNumber(), inputPhoneFragment.SR());
        if (c851370XaZLIZ != null && (c1237220iIi = c851370XaZLIZ.LIZ) != null && c1237220iIi.LIZIZ()) {
            inputPhoneFragment.RS(false);
            return;
        }
        String strLIZ = PhoneNumberUtil.LIZ(phoneNumberObject);
        int i = C852960Xd8.LIZ[inputPhoneFragment.VR().ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        return;
                    }
                    C0XZ4 c0xz4 = C0XZ4.LIZ;
                    EnumC852910Xd3 enumC852910Xd3VR = inputPhoneFragment.VR();
                    c0xz4.getClass();
                    C0XZ4.LJJIIJ(inputPhoneFragment, inputPhoneFragment, strLIZ, enumC852910Xd3VR, "user_click", null, null).LJIIIIZZ(new AfS182S0100000_13(inputPhoneFragment, 91)).LJIILL();
                    return;
                }
                C0XZ4 c0xz42 = C0XZ4.LIZ;
                String strLIZ2 = PhoneNumberUtil.LIZ(phoneNumberObject);
                EnumC852660Xce enumC852660XceSR = inputPhoneFragment.SR();
                EnumC852910Xd3 enumC852910Xd3VR2 = inputPhoneFragment.VR();
                String str = inputPhoneFragment.LLLILZJ;
                String str2 = inputPhoneFragment.LLLILZLLLI;
                C854460XfY.LIZ.getClass();
                C0XZ4.LJJ(c0xz42, inputPhoneFragment, inputPhoneFragment, strLIZ2, enumC852660XceSR, enumC852910Xd3VR2, str, str2, "user_click", null, null, null, C854460XfY.LJIIJJI(inputPhoneFragment), 3840).LJIIIIZZ(new AfS182S0100000_13(inputPhoneFragment, 90)).LJIILL();
                return;
            }
            C0XZ4 c0xz43 = C0XZ4.LIZ;
            String strLIZ3 = PhoneNumberUtil.LIZ(phoneNumberObject);
            EnumC852660Xce enumC852660XceSR2 = inputPhoneFragment.SR();
            EnumC852910Xd3 enumC852910Xd3VR3 = inputPhoneFragment.VR();
            Bundle arguments = inputPhoneFragment.getArguments();
            if (arguments != null) {
                string = arguments.getString("page", "");
            } else {
                string = null;
            }
            C854460XfY.LIZ.getClass();
            C0XZ4.LJJ(c0xz43, inputPhoneFragment, inputPhoneFragment, strLIZ3, enumC852660XceSR2, enumC852910Xd3VR3, "", "", "user_click", "phone", string, null, C854460XfY.LJIIJJI(inputPhoneFragment), 2304).LJIIIIZZ(new AfS182S0100000_13(inputPhoneFragment, 89)).LJIILL();
            return;
        }
        C0XZ4 c0xz44 = C0XZ4.LIZ;
        EnumC852910Xd3 enumC852910Xd3VR4 = inputPhoneFragment.VR();
        c0xz44.getClass();
        C0XZ4.LJJIIJ(inputPhoneFragment, inputPhoneFragment, strLIZ, enumC852910Xd3VR4, "user_click", null, null).LJIIIIZZ(new AfS182S0100000_13(inputPhoneFragment, 88)).LJIILL();
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [X.0XeA] */
    public static final void onClick$21(ACListenerS148S0100000_13 aCListenerS148S0100000_13, View view) {
        String enterMethod;
        if (((InputPhoneFragment) aCListenerS148S0100000_13.l0).zS()) {
            Bundle arguments = ((InputPhoneFragment) aCListenerS148S0100000_13.l0).getArguments();
            if (arguments == null) {
                arguments = new Bundle();
            }
            arguments.putInt("next_page", EnumC852910Xd3.INPUT_EMAIL_BIND.getValue());
            ((InputPhoneFragment) aCListenerS148S0100000_13.l0).fo(arguments);
            return;
        }
        if (((InputPhoneFragment) aCListenerS148S0100000_13.l0).OR().yQ2()) {
            ((InputPhoneFragment) aCListenerS148S0100000_13.l0).OR().wQ2(new InputPhoneFragment.InputPhoneActions.ClickChangeToEmailAction(new InterfaceC853610XeB() { // from class: X.0XeA
            }, (InputPhoneFragment) aCListenerS148S0100000_13.l0));
            return;
        }
        Bundle arguments2 = ((InputPhoneFragment) aCListenerS148S0100000_13.l0).getArguments();
        if (arguments2 != null && arguments2.getInt("last_scene", -1) == -1) {
            BindService bindServiceLIZIZ = C0XQ5.LIZIZ();
            C19EG activity = ((InputPhoneFragment) aCListenerS148S0100000_13.l0).getActivity();
            String enterFrom = ((InputPhoneFragment) aCListenerS148S0100000_13.l0).getEnterFrom();
            if (Intrinsics.LJFF(((InputPhoneFragment) aCListenerS148S0100000_13.l0).getEnterMethod(), "click_change")) {
                enterMethod = "click_try_email";
            } else {
                enterMethod = ((InputPhoneFragment) aCListenerS148S0100000_13.l0).getEnterMethod();
            }
            Bundle bundle = (Bundle) ((BindOrModifyPhoneActivity) ((InputPhoneFragment) aCListenerS148S0100000_13.l0).getActivity()).LLJ.getValue();
            bundle.putInt("current_scene", ((InputPhoneFragment) aCListenerS148S0100000_13.l0).SR().getValue());
            bindServiceLIZIZ.bindEmail(activity, enterFrom, enterMethod, bundle, false, new C854720Xfy((InputPhoneFragment) aCListenerS148S0100000_13.l0, 1));
            return;
        }
        C19EG activity2 = ((InputPhoneFragment) aCListenerS148S0100000_13.l0).getActivity();
        if (activity2 != null) {
            activity2.finish();
        }
    }

    public static final void onClick$22(ACListenerS148S0100000_13 aCListenerS148S0100000_13, View view) {
        ((BaseOTLIntentHandlerActivity) aCListenerS148S0100000_13.l0).LLLZIL(false);
    }

    public static final void onClick$23(ACListenerS148S0100000_13 aCListenerS148S0100000_13, View view) {
        ((BaseOTLIntentHandlerActivity) aCListenerS148S0100000_13.l0).LLLZIL(false);
    }

    public static final void onClick$24(ACListenerS148S0100000_13 aCListenerS148S0100000_13, View view) {
        ((BaseUpdatePasswordFragment) aCListenerS148S0100000_13.l0).hT();
    }

    public static final void onClick$25(ACListenerS148S0100000_13 aCListenerS148S0100000_13, View view) {
        KeyboardUtils.LIZIZ((View) aCListenerS148S0100000_13.l0);
    }

    public static final void onClick$26(ACListenerS148S0100000_13 aCListenerS148S0100000_13, View view) {
        ((VerifyPasswordFragment) aCListenerS148S0100000_13.l0).ZS().performClick();
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0119  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void onClick$27(Y.ACListenerS148S0100000_13 r13, android.view.View r14) {
        /*
            Method dump skipped, instruction units count: 355
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ACListenerS148S0100000_13.onClick$27(Y.ACListenerS148S0100000_13, android.view.View):void");
    }

    public static final void onClick$28(ACListenerS148S0100000_13 aCListenerS148S0100000_13, View view) {
        C1233960iDS c1233960iDS = C1233960iDS.LIZ;
        String enterFrom = ((VerifyPasswordFragment) aCListenerS148S0100000_13.l0).getEnterFrom();
        String enterMethod = ((VerifyPasswordFragment) aCListenerS148S0100000_13.l0).getEnterMethod();
        String strGT = ((VerifyPasswordFragment) aCListenerS148S0100000_13.l0).gT();
        boolean zIsChecked = ((VerifyPasswordFragment) aCListenerS148S0100000_13.l0).ZS().isChecked();
        c1233960iDS.getClass();
        C1233960iDS.LJIIJJI(enterFrom, enterMethod, strGT, "password", zIsChecked);
        final HashMap map = new HashMap();
        C852810Xct c852810Xct = C852810Xct.LIZ;
        VerifyPasswordFragment verifyPasswordFragment = (VerifyPasswordFragment) aCListenerS148S0100000_13.l0;
        c852810Xct.getClass();
        map.put("not_login_ticket", verifyPasswordFragment.getArguments().getString("not_login_ticket", ""));
        final String strLJIIJJI = C852810Xct.LJIIJJI((VerifyPasswordFragment) aCListenerS148S0100000_13.l0);
        if (strLJIIJJI.length() == 0) {
            C854460XfY c854460XfY = C854460XfY.LIZ;
            VerifyPasswordFragment verifyPasswordFragment2 = (VerifyPasswordFragment) aCListenerS148S0100000_13.l0;
            c854460XfY.getClass();
            String strLJIIJ = C854460XfY.LJIIJ(verifyPasswordFragment2);
            if (strLJIIJ != null) {
                map.put("passport_ticket", strLJIIJ);
            }
        }
        C0XZ4 c0xz4 = C0XZ4.LIZ;
        final VerifyPasswordFragment verifyPasswordFragment3 = (VerifyPasswordFragment) aCListenerS148S0100000_13.l0;
        C0I7D c0i7d = verifyPasswordFragment3.LLLJ;
        if (c0i7d == null) {
            c0i7d = null;
        }
        final String string = C2204961BRm.LLJILLL(c0i7d, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOurYJDb0ibEFvtmuhJujJVilJYwCJezeKMxLp6UyLKDWlTWS64=", null)).toString();
        AwS592S0100000_13 awS592S0100000_13 = new AwS592S0100000_13((VerifyPasswordFragment) aCListenerS148S0100000_13.l0, 34);
        c0xz4.getClass();
        C1239250iLz.LIZIZ(verifyPasswordFragment3, verifyPasswordFragment3, AbstractC19483511Kn.LJ(new InterfaceC1254030ijp() { // from class: X.0XWr
            public final /* synthetic */ String LIZIZ = "";

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r5v0, types: [X.0XGw, X.0XWq] */
            @Override // X.InterfaceC1254030ijp
            public final void LIZ(final C11KY c11ky) {
                final C0XYD c0xyd = verifyPasswordFragment3;
                ?? r5 = new AbstractC850160XWs() { // from class: X.0XWq
                    @Override // X.C0XH7
                    public final void LJI(C0XGA c0xga) {
                        ((C11KY) c11ky).onSuccess(c0xga);
                    }

                    @Override // X.C0XH7
                    public final void LJ(C0XGA c0xga, int i) {
                        ((C11KY) c11ky).onError(new C0XZJ(i, c0xga.LJFF, c0xyd.scene(), c0xyd.LLJJLIIIJLLLLLLLZ(), c0xga.LJII, ""));
                    }
                };
                verifyPasswordFragment3.gk(r5);
                verifyPasswordFragment3.dD().LIZ(this.LIZIZ, string, strLJIIJJI, map, r5);
            }
        }).LJIIIIZZ(new AfS182S0100000_13(verifyPasswordFragment3, 29)).LJII(new AfS149S0200000_13(verifyPasswordFragment3, awS592S0100000_13, 10))).LJIIIIZZ(new AfS182S0100000_13((VerifyPasswordFragment) aCListenerS148S0100000_13.l0, 53)).LJIILL();
    }

    public static final void onClick$29(ACListenerS148S0100000_13 aCListenerS148S0100000_13, View view) {
        ((VerifyPasswordFragment) aCListenerS148S0100000_13.l0).YS();
    }

    public static final void onClick$3(ACListenerS148S0100000_13 aCListenerS148S0100000_13, View view) {
        ((C978720bZm) aCListenerS148S0100000_13.l0).getOnClick().invoke();
    }

    public static final void onClick$30(ACListenerS148S0100000_13 aCListenerS148S0100000_13, View view) {
        ((UnbindInputCodeFragment) aCListenerS148S0100000_13.l0).YS();
    }

    public static final void onClick$31(ACListenerS148S0100000_13 aCListenerS148S0100000_13, View view) {
        VerifyEmailCodeFragment verifyEmailCodeFragment = (VerifyEmailCodeFragment) aCListenerS148S0100000_13.l0;
        verifyEmailCodeFragment.getClass();
        ArrayList arrayList = new ArrayList();
        if (!C0XQ5.LIZJ().isPhoneBinded()) {
            C1247510iZJ c1247510iZJ = new C1247510iZJ();
            c1247510iZJ.LIZIZ(2131823027);
            c1247510iZJ.LJ = new ACListenerS148S0100000_13(verifyEmailCodeFragment, 47);
            arrayList.add(c1247510iZJ);
        }
        C1247510iZJ c1247510iZJ2 = new C1247510iZJ();
        c1247510iZJ2.LIZIZ(2131829354);
        c1247510iZJ2.LJ = new ACListenerS148S0100000_13(verifyEmailCodeFragment, 48);
        arrayList.add(c1247510iZJ2);
        C1390850mIV c1390850mIV = new C1390850mIV();
        C1247510iZJ[] c1247510iZJArr = (C1247510iZJ[]) arrayList.toArray(new C1247510iZJ[0]);
        c1390850mIV.LIZIZ((C1247510iZJ[]) Arrays.copyOf(c1247510iZJArr, c1247510iZJArr.length));
        c1390850mIV.LIZJ().show(verifyEmailCodeFragment.getChildFragmentManager(), "MethodsSheet");
    }

    public static final void onClick$32(ACListenerS148S0100000_13 aCListenerS148S0100000_13, View view) {
        ((VerifyEmailCodeFragment) aCListenerS148S0100000_13.l0).zT();
    }

    public static final void onClick$33(ACListenerS148S0100000_13 aCListenerS148S0100000_13, View view) {
        DialogC19307510gD dialogC19307510gD = (DialogC19307510gD) aCListenerS148S0100000_13.l0;
        Activity activity = dialogC19307510gD.LLJI;
        String str = dialogC19307510gD.LLILZ;
        if (activity != null) {
            Intent intent = new Intent(activity, (Class<?>) CrossPlatformActivity.class);
            Bundle bundle = new Bundle();
            if (TextUtils.isEmpty(str)) {
                str = "https://www.tiktok.com/aweme/inapp/v2/ad_agreement?hide_nav_bar=1";
            }
            intent.setData(UriProtector.parse(str));
            intent.putExtra("hide_nav_bar", true);
            String string = "";
            if (TextUtils.isEmpty("")) {
                string = activity.getResources().getString(2131845539);
            }
            intent.putExtra("title", string);
            intent.putExtra("aweme_model", bundle);
            RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(activity, intent, "Context_startActivity_1");
            C1701330uNH.LIZ(intent, activity);
            C2204961BRm.LJJJJJL(activity, intent, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPq6bJLByDdrbA/Iwmex70Zu9nh+g943nJGD", null));
        }
        DialogC19307510gD dialogC19307510gD2 = (DialogC19307510gD) aCListenerS148S0100000_13.l0;
        dialogC19307510gD2.dismiss();
        C785410UrT.LIZ(dialogC19307510gD2);
    }

    public static final void onClick$34(ACListenerS148S0100000_13 aCListenerS148S0100000_13, View view) {
        C1389890mGx c1389890mGx = new C1389890mGx(((DialogC19307510gD) aCListenerS148S0100000_13.l0).LLJI);
        c1389890mGx.LJIIJ(((DialogC19307510gD) aCListenerS148S0100000_13.l0).LLILZIL);
        c1389890mGx.LJIIJJI();
        DialogC19307510gD dialogC19307510gD = (DialogC19307510gD) aCListenerS148S0100000_13.l0;
        dialogC19307510gD.dismiss();
        C785410UrT.LIZ(dialogC19307510gD);
    }

    public static final void onClick$35(ACListenerS148S0100000_13 aCListenerS148S0100000_13, View view) {
        BaseAccountFlowFragment baseAccountFlowFragment = (BaseAccountFlowFragment) aCListenerS148S0100000_13.l0;
        Bundle arguments = ((BaseAccountFlowFragment) aCListenerS148S0100000_13.l0).getArguments();
        if (arguments == null) {
            arguments = new Bundle();
        }
        Bundle bundle = new Bundle(arguments);
        bundle.putInt("next_page", EnumC852910Xd3.INPUT_EMAIL_BIND.getValue());
        baseAccountFlowFragment.fo(bundle);
    }

    public static final void onClick$36(ACListenerS148S0100000_13 aCListenerS148S0100000_13, View view) {
        C1236890iIB c1236890iIB = C1236890iIB.LIZ;
        BaseAccountFlowFragment baseAccountFlowFragment = (BaseAccountFlowFragment) aCListenerS148S0100000_13.l0;
        c1236890iIB.getClass();
        C0XGR c0xgr = new C0XGR();
        c0xgr.LIZLLL("enter_from", "signup");
        c0xgr.LIZLLL("enter_method", "normal");
        C20684815ws.LJIILLIIL("click_signup_by_email", c0xgr.LIZ);
        Bundle arguments = baseAccountFlowFragment.getArguments();
        if (arguments == null) {
            arguments = new Bundle();
        }
        Bundle bundle = new Bundle(arguments);
        C786410Ut5.LJJJI("enter_from", "signup", bundle);
        C786410Ut5.LJJJI("enter_method", "click_signup_by_email", bundle);
        C786410Ut5.LJJJI("login_panel_type", "signup", bundle);
        bundle.putInt("current_scene", EnumC852660Xce.SIGN_UP.getValue());
        if (C19286010ck.LIZJ()) {
            bundle.putInt("next_page", EnumC852910Xd3.EMAIL_SIGNUP.getValue());
        } else {
            bundle.putInt("next_page", EnumC852910Xd3.PHONE_EMAIL_SIGN_UP.getValue());
            bundle.putInt("child_page", EnumC852910Xd3.INPUT_EMAIL_SIGN_UP.getValue());
        }
        baseAccountFlowFragment.fo(bundle);
    }

    public static final void onClick$37(ACListenerS148S0100000_13 aCListenerS148S0100000_13, View view) {
        DialogC1802700x0m dialogC1802700x0m = (DialogC1802700x0m) aCListenerS148S0100000_13.l0;
        Function1<Dialog, Unit> function1 = dialogC1802700x0m.LLJILJILJ;
        if (function1 != null) {
            function1.invoke(dialogC1802700x0m);
        }
        DialogC1802700x0m dialogC1802700x0m2 = (DialogC1802700x0m) aCListenerS148S0100000_13.l0;
        dialogC1802700x0m2.getClass();
        try {
            ((IHostAction) C1161920gLG.LIZJ(IHostAction.class)).tryOpenSystemNotificationSetting(dialogC1802700x0m2.getContext());
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            Context context = dialogC1802700x0m2.getContext();
            Intent intent = new Intent("android.settings.SETTINGS");
            RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(context, intent, "Context_startActivity_1");
            C1701330uNH.LIZ(intent, context);
            C2204961BRm.LJJJJJL(context, intent, new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yeeYC5pn5y+ba6EWBIGk/nJ4HDtSpo1pwj7iY6oWcZ+IHD2+lo/4PoyhLbbKrhocaJt63WC0hYEhBUEhUupkwCUu", null));
        }
        DialogC1802700x0m dialogC1802700x0m3 = (DialogC1802700x0m) aCListenerS148S0100000_13.l0;
        dialogC1802700x0m3.getClass();
        C786410Ut5.LJLIIL(500L, C820670WHh.LIZ, new ARunnableS113S0100000_13(dialogC1802700x0m3, 178));
        ((DialogC1802700x0m) aCListenerS148S0100000_13.l0).LJLI("push_opt_in");
    }

    public static final void onClick$38(ACListenerS148S0100000_13 aCListenerS148S0100000_13, View view) {
        DialogC1802700x0m dialogC1802700x0m = (DialogC1802700x0m) aCListenerS148S0100000_13.l0;
        Function1<Dialog, Unit> function1 = dialogC1802700x0m.LLJILJILJ;
        if (function1 != null) {
            function1.invoke(dialogC1802700x0m);
        }
        ((IActionHandlerService) C1161920gLG.LIZJ(IActionHandlerService.class)).handle(((DialogC1802700x0m) aCListenerS148S0100000_13.l0).getContext(), "aweme://push_setting_notification_choice");
        ((DialogC1802700x0m) aCListenerS148S0100000_13.l0).LJLI("push_opt_in");
        DialogC1802700x0m dialogC1802700x0m2 = (DialogC1802700x0m) aCListenerS148S0100000_13.l0;
        dialogC1802700x0m2.getClass();
        C786410Ut5.LJLIIL(500L, C820670WHh.LIZ, new ARunnableS113S0100000_13(dialogC1802700x0m2, 178));
    }

    public static final void onClick$39(ACListenerS148S0100000_13 aCListenerS148S0100000_13, View view) {
        DialogC1802700x0m dialogC1802700x0m = (DialogC1802700x0m) aCListenerS148S0100000_13.l0;
        Function1<Dialog, Unit> function1 = dialogC1802700x0m.LLJILJILJ;
        if (function1 != null) {
            function1.invoke(dialogC1802700x0m);
        }
        ((DialogC1802700x0m) aCListenerS148S0100000_13.l0).LJLI("cancel");
        C786410Ut5.LJIIL((DialogC1802700x0m) aCListenerS148S0100000_13.l0);
    }

    public static final void onClick$4(ACListenerS148S0100000_13 aCListenerS148S0100000_13, View view) {
        FastBootBlankActivity fastBootBlankActivity = (FastBootBlankActivity) aCListenerS148S0100000_13.l0;
        C0XR7 c0xr7 = fastBootBlankActivity.LL;
        if (c0xr7 != null) {
            c0xr7.dismiss();
            C785410UrT.LIZ(c0xr7);
        }
        new BPEAThread(new ARunnableS113S0100000_13((Object) fastBootBlankActivity, 71)).start();
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [X.0XdU] */
    public static final void onClick$40(ACListenerS148S0100000_13 aCListenerS148S0100000_13, View view) {
        CommonFlowActivity commonFlowActivity;
        if (((BindEmailFragment) aCListenerS148S0100000_13.l0).zS()) {
            Bundle arguments = ((BindEmailFragment) aCListenerS148S0100000_13.l0).getArguments();
            if (arguments == null) {
                arguments = new Bundle();
            }
            arguments.putInt("next_page", EnumC852910Xd3.INPUT_PHONE_BIND.getValue());
            ((BindEmailFragment) aCListenerS148S0100000_13.l0).fo(arguments);
            return;
        }
        if (((BindEmailFragment) aCListenerS148S0100000_13.l0).OR().yQ2()) {
            ((BindEmailFragment) aCListenerS148S0100000_13.l0).OR().wQ2(new CommonInputEmailFragment.InputEmailActions.ClickChangeToPhoneAction(new InterfaceC853190XdV() { // from class: X.0XdU
            }, (BindEmailFragment) aCListenerS148S0100000_13.l0));
            return;
        }
        Bundle arguments2 = ((BindEmailFragment) aCListenerS148S0100000_13.l0).getArguments();
        if (arguments2 != null && arguments2.getInt("last_scene", -1) == -1) {
            BindService bindServiceLIZIZ = C0XQ5.LIZIZ();
            C19EG activity = ((BindEmailFragment) aCListenerS148S0100000_13.l0).getActivity();
            String enterFrom = ((BindEmailFragment) aCListenerS148S0100000_13.l0).getEnterFrom();
            C19EG activity2 = ((BindEmailFragment) aCListenerS148S0100000_13.l0).getActivity();
            Bundle bundleLLLZZIL = null;
            if ((activity2 instanceof CommonFlowActivity) && (commonFlowActivity = (CommonFlowActivity) activity2) != null) {
                bundleLLLZZIL = commonFlowActivity.LLLZZIL();
            }
            bindServiceLIZIZ.bindMobile((Activity) activity, enterFrom, bundleLLLZZIL, false, (C0XTR) new C854720Xfy((BindEmailFragment) aCListenerS148S0100000_13.l0, 9));
            return;
        }
        C19EG activity3 = ((BindEmailFragment) aCListenerS148S0100000_13.l0).getActivity();
        if (activity3 != null) {
            activity3.finish();
        }
    }

    public static final void onClick$41(ACListenerS148S0100000_13 aCListenerS148S0100000_13, View view) {
        ((EditText) aCListenerS148S0100000_13.l0).setText((CharSequence) null);
    }

    public static final void onClick$42(ACListenerS148S0100000_13 aCListenerS148S0100000_13, View view) {
        SheetDemoFragment sheetDemoFragment = (SheetDemoFragment) aCListenerS148S0100000_13.l0;
        sheetDemoFragment.zS(new AwS627S0100000_13(sheetDemoFragment, 4));
    }

    public static final void onClick$43(ACListenerS148S0100000_13 aCListenerS148S0100000_13, View view) {
        SheetDemoFragment sheetDemoFragment = (SheetDemoFragment) aCListenerS148S0100000_13.l0;
        sheetDemoFragment.zS(new AwS627S0100000_13(sheetDemoFragment, 7));
    }

    public static final void onClick$44(ACListenerS148S0100000_13 aCListenerS148S0100000_13, View view) {
        C786410Ut5.LJLLLLLL(8, ((C818390W8n) aCListenerS148S0100000_13.l0).LIZJ);
    }

    public static final void onClick$45(ACListenerS148S0100000_13 aCListenerS148S0100000_13, View view) {
        if (((ConfirmEmailFragment) aCListenerS148S0100000_13.l0).getArguments().getInt("last_scene", -1) == EnumC852660Xce.BIND_PHONE.getValue()) {
            ((ConfirmEmailFragment) aCListenerS148S0100000_13.l0).getActivity().finish();
        } else {
            C0XQ5.LIZIZ().bindMobile((Activity) ((ConfirmEmailFragment) aCListenerS148S0100000_13.l0).getActivity(), ((ConfirmEmailFragment) aCListenerS148S0100000_13.l0).getEnterFrom(), ((CommonFlowActivity) ((ConfirmEmailFragment) aCListenerS148S0100000_13.l0).getActivity()).LLLZZIL(), true, (C0XTR) new C854720Xfy((ConfirmEmailFragment) aCListenerS148S0100000_13.l0, 11));
        }
    }

    public static final void onClick$46(ACListenerS148S0100000_13 aCListenerS148S0100000_13, View view) {
        ((VerifyEmailCodeFragment) aCListenerS148S0100000_13.l0).zT();
        ((VerifyEmailCodeFragment) aCListenerS148S0100000_13.l0).AT("email_verify_safe_phone_click");
    }

    public static final void onClick$47(ACListenerS148S0100000_13 aCListenerS148S0100000_13, View view) {
        ((VerifyEmailCodeFragment) aCListenerS148S0100000_13.l0).zT();
    }

    public static final void onClick$48(ACListenerS148S0100000_13 aCListenerS148S0100000_13, View view) {
        VerifyEmailCodeFragment verifyEmailCodeFragment = (VerifyEmailCodeFragment) aCListenerS148S0100000_13.l0;
        Bundle bundle = new Bundle(((VerifyEmailCodeFragment) aCListenerS148S0100000_13.l0).getArguments());
        bundle.putInt("next_page", EnumC852910Xd3.CREATE_PASSWORD_FOR_1P.getValue());
        verifyEmailCodeFragment.fo(bundle);
    }

    public static final void onClick$49(ACListenerS148S0100000_13 aCListenerS148S0100000_13, View view) {
        C0XGR c0xgr = new C0XGR();
        c0xgr.LIZJ("result", "turn_on");
        if (((DialogC848780XRk) aCListenerS148S0100000_13.l0).LLIZLLLIL) {
            C20684815ws.LJIILLIIL("close_twosv_mandatory_popup", c0xgr.LIZ);
            C0XQ5.LIZIZ.LJFF().openTwoStepVerificationManageActivity(((DialogC848780XRk) aCListenerS148S0100000_13.l0).LLIZ, "mandatory_popup");
        } else {
            C20684815ws.LJIILLIIL("close_twosv_nudge_popup", c0xgr.LIZ);
            C0XQ5.LIZIZ.LJFF().openTwoStepVerificationManageActivity(((DialogC848780XRk) aCListenerS148S0100000_13.l0).LLIZ, "nudge_popup");
        }
        DialogC848780XRk dialogC848780XRk = (DialogC848780XRk) aCListenerS148S0100000_13.l0;
        if (!dialogC848780XRk.LLIZLLLIL) {
            dialogC848780XRk.dismiss();
            C785410UrT.LIZ(dialogC848780XRk);
        }
        C849850XVn.LIZIZ.LIZJ().LJIJI("92", "hpas_mandatory2sv_modal_btn", true);
    }

    public static final void onClick$5(ACListenerS148S0100000_13 aCListenerS148S0100000_13, View view) {
        View viewFindViewById;
        FastBootBlankActivity fastBootBlankActivity = (FastBootBlankActivity) aCListenerS148S0100000_13.l0;
        C0XR7 c0xr7 = fastBootBlankActivity.LL;
        if (c0xr7 != null) {
            c0xr7.dismiss();
            C785410UrT.LIZ(c0xr7);
        }
        new BPEAThread(new ARunnableS113S0100000_13((Object) fastBootBlankActivity, 72)).start();
        if (C1220404q2.LIZ()) {
            if (Looper.getMainLooper() != Looper.myLooper()) {
                synchronized (C0JAD.LLIZ) {
                    try {
                        viewFindViewById = C0JAF.LIZIZ(fastBootBlankActivity.findViewById(R.id.nf2), fastBootBlankActivity.getWindow().getDecorView(), R.id.nf2);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                }
            } else {
                viewFindViewById = C0JAF.LIZIZ(fastBootBlankActivity.findViewById(R.id.nf2), fastBootBlankActivity.getWindow().getDecorView(), R.id.nf2);
            }
        } else {
            viewFindViewById = fastBootBlankActivity.findViewById(R.id.nf2);
        }
        C786410Ut5.LJZL(0, (LinearLayout) viewFindViewById);
    }

    public static final void onClick$50(ACListenerS148S0100000_13 aCListenerS148S0100000_13, View view) {
        String str;
        C0XGR c0xgr = new C0XGR();
        DialogC848780XRk dialogC848780XRk = (DialogC848780XRk) aCListenerS148S0100000_13.l0;
        if (dialogC848780XRk.LLIZLLLIL) {
            c0xgr.LIZJ("result", "logout");
            C20684815ws.LJIILLIIL("close_twosv_mandatory_popup", c0xgr.LIZ);
            C786410Ut5.J4(new DialogC1389620mGW(((DialogC848780XRk) aCListenerS148S0100000_13.l0).LLIZ));
            C0XQ7.LIZJ().logout("user_logout", "user_logout");
        } else {
            dialogC848780XRk.dismiss();
            C785410UrT.LIZ(dialogC848780XRk);
            c0xgr.LIZJ("result", "not_now");
            C20684815ws.LJIILLIIL("close_twosv_nudge_popup", c0xgr.LIZ);
        }
        InterfaceC1589330rSd interfaceC1589330rSdLIZJ = C849850XVn.LIZIZ.LIZJ();
        if (((DialogC848780XRk) aCListenerS148S0100000_13.l0).LLIZLLLIL) {
            str = "hpas_mandatory2sv_modal_logout_btn";
        } else {
            str = "hpas_mandatory2sv_modal_notnow_btn";
        }
        interfaceC1589330rSdLIZJ.LJIJI("92", str, false);
    }

    public static final void onClick$51(ACListenerS148S0100000_13 aCListenerS148S0100000_13, View view) {
        boolean z;
        C0XG3 c0xg3LIZ;
        ((SOTLFragment) aCListenerS148S0100000_13.l0).RR("continue");
        SOTLViewModel sOTLViewModelZR = ((SOTLFragment) aCListenerS148S0100000_13.l0).ZR();
        if (!((Boolean) sOTLViewModelZR.LLILZLL.getValue()).booleanValue()) {
            AbstractC845670XFl abstractC845670XFl = (AbstractC845670XFl) sOTLViewModelZR.LLILZ.getValue();
            long jCurrentTimeMillis = System.currentTimeMillis();
            boolean z2 = abstractC845670XFl instanceof C845650XFj;
            if (z2 && C845580XFc.LIZLLL(((C845650XFj) abstractC845670XFl).LIZ)) {
                z = true;
            } else {
                z = false;
            }
            sOTLViewModelZR.LLJIJIL = new C0XG3(jCurrentTimeMillis, z, 478);
            if (z2) {
                C845650XFj c845650XFj = (C845650XFj) abstractC845670XFl;
                if (C845580XFc.LIZLLL(c845650XFj.LIZ)) {
                    sOTLViewModelZR.LL = "SOTL_in_app";
                    sOTLViewModelZR.vQ2(c845650XFj.LIZ);
                    return;
                }
            }
            C0XG3 c0xg3LIZ2 = null;
            if (z2) {
                C845590XFd.LIZ.getClass();
                C845590XFd.LIZIZ.setValue(C845680XFm.LIZ);
                C845590XFd.LIZLLL.set(false);
                C845590XFd.LJ.set(false);
                C845590XFd.LJFF = null;
                C845590XFd.LJI = null;
            }
            sOTLViewModelZR.LL = "SOTL";
            C845720XFq c845720XFq = sOTLViewModelZR.LLJI;
            if (c845720XFq == null) {
                C0XG3 c0xg3 = sOTLViewModelZR.LLJIJIL;
                if (c0xg3 != null) {
                    c0xg3LIZ2 = C0XG3.LIZ(c0xg3, 0L, 0L, 0L, 0L, "precheck", "api_null", "OneTapLoginTokenApi is null", 63);
                }
                sOTLViewModelZR.LLJIJIL = c0xg3LIZ2;
                sOTLViewModelZR.LLIZLLLIL.LJIIIIZZ(new C845730XFr());
                sOTLViewModelZR.wQ2(false);
                return;
            }
            C0XG3 c0xg32 = sOTLViewModelZR.LLJIJIL;
            if (c0xg32 != null) {
                c0xg3LIZ = C0XG3.LIZ(c0xg32, System.currentTimeMillis(), 0L, 0L, 0L, null, null, null, 509);
            } else {
                c0xg3LIZ = null;
            }
            sOTLViewModelZR.LLJIJIL = c0xg3LIZ;
            sOTLViewModelZR.LLILZLL.setValue(Boolean.TRUE);
            c845720XFq.LJ = new AwS592S0100000_13(sOTLViewModelZR, 23);
            c845720XFq.LJFF = false;
            C19F0<Intent> c19f0 = c845720XFq.LJI;
            Intent intent = new Intent(c845720XFq.LIZ, (Class<?>) ActivityC845760XFu.class);
            intent.putExtra("client_id", c845720XFq.LIZJ);
            intent.putExtra("redirect_uri", c845720XFq.LIZIZ);
            intent.putExtra("app_id", c845720XFq.LIZLLL);
            intent.putExtra("extra_et_params", (Bundle) null);
            intent.putExtra("show_loading", true);
            intent.putExtra("skip_refresh_token", false);
            c19f0.LIZ(intent);
        }
    }

    public static final void onClick$6(ACListenerS148S0100000_13 aCListenerS148S0100000_13, View view) {
        String upperCase;
        String storeRegion;
        FtcCreatePasswordFragment ftcCreatePasswordFragment = (FtcCreatePasswordFragment) aCListenerS148S0100000_13.l0;
        ftcCreatePasswordFragment.getClass();
        IPNSChangeRegionService iPNSChangeRegionService = (IPNSChangeRegionService) PluggableExtentionKt.pluggableSpi$default(IPNSChangeRegionService.class, false, false, false, 14, null);
        if (iPNSChangeRegionService != null && (storeRegion = iPNSChangeRegionService.getStoreRegion()) != null) {
            upperCase = storeRegion.toUpperCase(Locale.ROOT);
        } else {
            upperCase = null;
        }
        if (Intrinsics.LJFF(upperCase, "BR")) {
            ComplianceServiceProvider.LJII().LJIJ(new AwS557S0100000_13(ftcCreatePasswordFragment, 135));
        } else {
            ftcCreatePasswordFragment.XS();
        }
    }

    public static final void onClick$7(ACListenerS148S0100000_13 aCListenerS148S0100000_13, View view) {
        if (((BindEmailCodeVerifyFragment) aCListenerS148S0100000_13.l0).OR().yQ2()) {
            ((BindEmailCodeVerifyFragment) aCListenerS148S0100000_13.l0).OR().wQ2(new BaseUpdatePasswordFragment.CreatePasswordActions.ChangeToCreatePasswordAction(new C852470XcL(), (BindEmailCodeVerifyFragment) aCListenerS148S0100000_13.l0));
            return;
        }
        BindEmailCodeVerifyFragment bindEmailCodeVerifyFragment = (BindEmailCodeVerifyFragment) aCListenerS148S0100000_13.l0;
        Bundle bundle = new Bundle(((BindEmailCodeVerifyFragment) aCListenerS148S0100000_13.l0).getArguments());
        bundle.putInt("next_page", EnumC852910Xd3.CREATE_PASSWORD_FOR_1P.getValue());
        bindEmailCodeVerifyFragment.fo(bundle);
    }

    public static final void onClick$8(ACListenerS148S0100000_13 aCListenerS148S0100000_13, View view) {
        if (((BaseAccountBindingsFlowFragment) aCListenerS148S0100000_13.l0).OR().yQ2()) {
            BaseAccountBindingsFlowFragment baseAccountBindingsFlowFragment = (BaseAccountBindingsFlowFragment) aCListenerS148S0100000_13.l0;
            baseAccountBindingsFlowFragment.OR().wQ2(new BaseAccountBindingsFlowFragment.BindingActions.ClickEmailAction(new C20345314jD(((BaseAccountBindingsFlowFragment) aCListenerS148S0100000_13.l0).SR()), baseAccountBindingsFlowFragment));
            return;
        }
        int iPS = ((BaseAccountBindingsFlowFragment) aCListenerS148S0100000_13.l0).PS();
        C0XZ4 c0xz4 = C0XZ4.LIZ;
        BaseAccountBindingsFlowFragment baseAccountBindingsFlowFragment2 = (BaseAccountBindingsFlowFragment) aCListenerS148S0100000_13.l0;
        C854460XfY.LIZ.getClass();
        C0XZ4.LJJIII(c0xz4, baseAccountBindingsFlowFragment2, baseAccountBindingsFlowFragment2, "", iPS, "auto_system", C854460XfY.LJIIJJI(baseAccountBindingsFlowFragment2), null, null, null, null, 960).LJIIIIZZ(new AfS182S0100000_13((BaseAccountBindingsFlowFragment) aCListenerS148S0100000_13.l0, 12)).LJIILL();
    }

    /* JADX WARN: Type inference failed for: r0v27, types: [X.14jB] */
    public static final void onClick$9(ACListenerS148S0100000_13 aCListenerS148S0100000_13, View view) {
        if (((BaseAccountBindingsFlowFragment) aCListenerS148S0100000_13.l0).OR().yQ2()) {
            BaseAccountBindingsFlowFragment baseAccountBindingsFlowFragment = (BaseAccountBindingsFlowFragment) aCListenerS148S0100000_13.l0;
            baseAccountBindingsFlowFragment.OR().wQ2(new BaseAccountBindingsFlowFragment.BindingActions.ClickPasswordAction(new InterfaceC20345414jE() { // from class: X.14jB
            }, baseAccountBindingsFlowFragment));
            return;
        }
        int i = C2272871Dxl.LIZ[((BaseAccountBindingsFlowFragment) aCListenerS148S0100000_13.l0).SR().ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        BaseAccountBindingsFlowFragment baseAccountBindingsFlowFragment2 = (BaseAccountBindingsFlowFragment) aCListenerS148S0100000_13.l0;
                        Bundle arguments = baseAccountBindingsFlowFragment2.getArguments();
                        if (arguments != null) {
                            arguments.putInt("next_page", EnumC852910Xd3.VERIFY_PASSWORD.getValue());
                        } else {
                            arguments = new Bundle();
                        }
                        baseAccountBindingsFlowFragment2.fo(arguments);
                        return;
                    }
                    ((BaseAccountBindingsFlowFragment) aCListenerS148S0100000_13.l0).getClass();
                    throw new IllegalStateException("This option should not be available in this scene");
                }
                BaseAccountBindingsFlowFragment baseAccountBindingsFlowFragment3 = (BaseAccountBindingsFlowFragment) aCListenerS148S0100000_13.l0;
                Bundle arguments2 = baseAccountBindingsFlowFragment3.getArguments();
                if (arguments2 != null) {
                    arguments2.putInt("next_page", EnumC852910Xd3.VERIFY_PASSWORD.getValue());
                } else {
                    arguments2 = new Bundle();
                }
                baseAccountBindingsFlowFragment3.fo(arguments2);
                return;
            }
            BaseAccountBindingsFlowFragment baseAccountBindingsFlowFragment4 = (BaseAccountBindingsFlowFragment) aCListenerS148S0100000_13.l0;
            Bundle arguments3 = baseAccountBindingsFlowFragment4.getArguments();
            if (arguments3 != null) {
                arguments3.putInt("next_page", EnumC852910Xd3.UNBIND_EMAIL_VERIFY_USING_PASSWORD.getValue());
                C852810Xct c852810Xct = C852810Xct.LIZ;
                String email = baseAccountBindingsFlowFragment4.LLLIILIL.getEmail();
                c852810Xct.getClass();
                C852810Xct.LJIILLIIL(arguments3, email);
            } else {
                arguments3 = new Bundle();
            }
            baseAccountBindingsFlowFragment4.fo(arguments3);
            return;
        }
        BaseAccountBindingsFlowFragment baseAccountBindingsFlowFragment5 = (BaseAccountBindingsFlowFragment) aCListenerS148S0100000_13.l0;
        Bundle arguments4 = baseAccountBindingsFlowFragment5.getArguments();
        if (arguments4 != null) {
            arguments4.putInt("next_page", EnumC852910Xd3.UNBIND_PHONE_VERIFY_USING_PASSWORD.getValue());
            C852810Xct c852810Xct2 = C852810Xct.LIZ;
            String bindPhone = baseAccountBindingsFlowFragment5.LLLIILIL.getBindPhone();
            c852810Xct2.getClass();
            C852810Xct.LJIJI(arguments4, bindPhone);
        } else {
            arguments4 = new Bundle();
        }
        baseAccountBindingsFlowFragment5.fo(arguments4);
    }
}
