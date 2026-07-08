package Y;

import X.AbstractC826920WcE;
import X.AnonymousClass0956;
import X.C09JN;
import X.C0CPH;
import X.C0HZQ;
import X.C0V9Z;
import X.C0VQ5;
import X.C0VQD;
import X.C0VTR;
import X.C0WG5;
import X.C0X35;
import X.C0X4A;
import X.C0XGR;
import X.C0XO3;
import X.C0XO4;
import X.C0XPY;
import X.C0XQ5;
import X.C0XT7;
import X.C0XU3;
import X.C0XUE;
import X.C0XWD;
import X.C0XWH;
import X.C0XX7;
import X.C0XYD;
import X.C0XYO;
import X.C0XZ3;
import X.C0XZ4;
import X.C0XZG;
import X.C0XZJ;
import X.C11JF;
import X.C11NJ;
import X.C123100dR;
import X.C1233040iBy;
import X.C1233960iDS;
import X.C1249240ic6;
import X.C1389890mGx;
import X.C1390130mHL;
import X.C1428330nGx;
import X.C1849840yEo;
import X.C19EG;
import X.C1AGV;
import X.C1BLL;
import X.C1C7U;
import X.C20144713rx;
import X.C20684815ws;
import X.C2097908Jt;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C2272861Dxk;
import X.C2344009Gk;
import X.C385200F8k;
import X.C500260Jjc;
import X.C606810Nr5;
import X.C786410Ut5;
import X.C797970VRz;
import X.C799900VZk;
import X.C805940VjU;
import X.C807620VmC;
import X.C807630VmD;
import X.C809030VoT;
import X.C810890VrT;
import X.C813020Vuu;
import X.C813890VwJ;
import X.C813900VwK;
import X.C826810Wc3;
import X.C827000WcM;
import X.C837720Wte;
import X.C844470XAv;
import X.C846060XGy;
import X.C849550XUj;
import X.C849600XUo;
import X.C849670XUv;
import X.C850330XXj;
import X.C850340XXk;
import X.C850410XXr;
import X.C850920XZq;
import X.C851150XaD;
import X.C851430Xaf;
import X.C851630Xaz;
import X.C851860XbM;
import X.C852020Xbc;
import X.C852170Xbr;
import X.C852640Xcc;
import X.C852810Xct;
import X.C852850Xcx;
import X.C853660XeG;
import X.C853770XeR;
import X.C853820XeW;
import X.C853830XeX;
import X.C853970Xel;
import X.C853980Xem;
import X.C854410XfT;
import X.C854460XfY;
import X.EnumC1237100iIW;
import X.EnumC1483805rQ;
import X.EnumC852660Xce;
import X.EnumC852910Xd3;
import X.EnumC854390XfR;
import X.InterfaceC586170Myt;
import X.InterfaceC851540Xaq;
import X.InterfaceC853780XeS;
import X.RunnableC808760Vo2;
import X.RunnableC823120WQs;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import com.bytedance.android.live.liveinteract.multiguestv3.main.userinfo.anchor.MultiLiveAsAnchorListDialogV2;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.bytedance.push.PushBody;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.common.applog.AppLog;
import com.ss.android.ugc.aweme.account.bind.BindEmailCodeVerifyFragment;
import com.ss.android.ugc.aweme.account.bind.BindEmailFragment;
import com.ss.android.ugc.aweme.account.bind.BindPhoneCodeVerifyFragment;
import com.ss.android.ugc.aweme.account.bindings.BaseAccountBindingsFlowFragment;
import com.ss.android.ugc.aweme.account.changemail.ChangeEmailFragment;
import com.ss.android.ugc.aweme.account.changemail.ChangeEmailVerifyFragment;
import com.ss.android.ugc.aweme.account.changemail.VerifyEmailBeforeChangeFragment;
import com.ss.android.ugc.aweme.account.login.twostep.VerifyEmailForTicketFragment;
import com.ss.android.ugc.aweme.account.login.twostep.VerifyPhoneForTicketFragment;
import com.ss.android.ugc.aweme.account.login.utils.PhoneNumberUtil;
import com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment;
import com.ss.android.ugc.aweme.account.login.v2.ui.fragments.CreatePasswordFragment;
import com.ss.android.ugc.aweme.account.login.v2.ui.fragments.EmailLinkVerifyFragment;
import com.ss.android.ugc.aweme.account.login.v2.ui.fragments.ForceVerifyPhoneInputCodeFragment;
import com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputCodeFragment;
import com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputPasswordFragment;
import com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputPhoneFragment;
import com.ss.android.ugc.aweme.account.login.v2.ui.fragments.PhoneNon1pBindFragment;
import com.ss.android.ugc.aweme.account.oneclicklogin.IOneClickLoginService;
import com.ss.android.ugc.aweme.account.setpwd.BaseUpdatePasswordFragment;
import com.ss.android.ugc.aweme.account.setpwd.EmailCodeChangePwdFragment;
import com.ss.android.ugc.aweme.account.setpwd.PhoneChangePwdVerifyFragment;
import com.ss.android.ugc.aweme.account.setpwd.VerifyPasswordFragment;
import com.ss.android.ugc.aweme.account.unbind.UnbindInputCodeFragment;
import com.ss.android.ugc.aweme.account.verify.TransparentCodeVerificationActivity;
import com.ss.android.ugc.aweme.account.verify.VerifyEmailCodeFragment;
import com.ss.android.ugc.aweme.account.verify.VerifyPhoneFragment;
import com.ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.creatorcenter.InspirationSettingApi;
import com.ss.android.ugc.aweme.exp.DMInboxChangeRightZoneClickableSizeExp;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.lancet.DeviceManagerLancet;
import com.ss.android.ugc.aweme.legoImp.task.LegacyTask;
import com.ss.android.ugc.aweme.legoImp.task.kidsmode.KidsModeLegacyTask;
import com.ss.android.ugc.aweme.legoImpl.task.PushStartupTaskRejectStrategy;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.secapi.ISecApi;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.trace.impl.TraceLogImpl;
import com.ss.android.ugc.awemepushapi.IPushApi;
import com.ss.android.ugc.awemepushlib.interaction.PushSheduler;
import com.ss.android.ugc.gamora.editor.recommendeffect.net.RecommendEffectRequestApi;
import com.ss.android.ugc.localnotify.api.LocalNotifyInfoResponse;
import com.ss.android.ugc.profile.business.profile.menu.ProfilePageMenuFragment;
import com.tiktok.kmp.push.clear.IKMPPushService;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS129S1200000_13;
import kotlin.jvm.internal.AwS53S0100100_22;
import kotlin.jvm.internal.AwS592S0100000_13;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes14.dex */
public class AfS182S0100000_13 implements C09JN {
    public final int $t;
    public Object l0;

    @Override // X.C09JN
    public final void accept(Object obj) throws Throwable {
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
            case 26:
                accept$26(this, obj);
                break;
            case 27:
                accept$27(this, obj);
                break;
            case 28:
                accept$28(this, obj);
                break;
            case 29:
                accept$29(this, obj);
                break;
            case 30:
                accept$30(this, obj);
                break;
            case 31:
                accept$31(this, obj);
                break;
            case 32:
                accept$32(this, obj);
                break;
            case LiveToolbarIconStyleSetting.GRAY_WITHOUT_TEXT /* 33 */:
                accept$33(this, obj);
                break;
            case LiveToolbarIconStyleSetting.COLORFUL_WITHOUT_TEXT /* 34 */:
                accept$34(this, obj);
                break;
            case 35:
                accept$35(this, obj);
                break;
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITHOUT_TEXT /* 36 */:
                accept$36(this, obj);
                break;
            case 37:
                accept$37(this, obj);
                break;
            case 38:
                accept$38(this, obj);
                break;
            case 39:
                accept$39(this, obj);
                break;
            case 40:
                accept$40(this, obj);
                break;
            case 41:
                accept$41(this, obj);
                break;
            case 42:
                accept$42(this, obj);
                break;
            case 43:
                accept$43(this, obj);
                break;
            case 44:
                accept$44(this, obj);
                break;
            case 45:
                accept$45(this, obj);
                break;
            case 46:
                accept$46(this, obj);
                break;
            case 47:
                accept$47(this, obj);
                break;
            case 48:
                accept$48(this, obj);
                break;
            case 49:
                accept$49(this, obj);
                break;
            case BaseNotice.RECOMMEND_LIVE /* 50 */:
                accept$50(this, obj);
                break;
            case 51:
                accept$51(this, obj);
                break;
            case 52:
                accept$52(this, obj);
                break;
            case 53:
                accept$53(this, obj);
                break;
            case 54:
                accept$54(this, obj);
                break;
            case 55:
                accept$55(this, obj);
                break;
            case 56:
                accept$56(this, obj);
                break;
            case 57:
                accept$57(this, obj);
                break;
            case 58:
                accept$58(this, obj);
                break;
            case 59:
                accept$59(this, obj);
                break;
            case 60:
                accept$60(this, obj);
                break;
            case 61:
                accept$61(this, obj);
                break;
            case BaseNotice.CREATOR /* 62 */:
                accept$62(this, obj);
                break;
            case 63:
                accept$63(this, obj);
                break;
            case 64:
                accept$64(this, obj);
                break;
            case 65:
                accept$65(this, obj);
                break;
            case 66:
                accept$66(this, obj);
                break;
            case 67:
                accept$67(this, obj);
                break;
            case 68:
                accept$68(this, obj);
                break;
            case 69:
                accept$69(this, obj);
                break;
            case 70:
                accept$70(this, obj);
                break;
            case 71:
                accept$71(this, obj);
                break;
            case DMInboxChangeRightZoneClickableSizeExp.NEW_DP_SIZE /* 72 */:
                accept$72(this, obj);
                break;
            case 73:
                accept$73(this, obj);
                break;
            case 74:
                accept$74(this, obj);
                break;
            case 75:
                accept$75(this, obj);
                break;
            case 76:
                accept$76(this, obj);
                break;
            case 77:
                accept$77(this, obj);
                break;
            case 78:
                accept$78(this, obj);
                break;
            case 79:
                accept$79(this, obj);
                break;
            case 80:
                accept$80(this, obj);
                break;
            case 81:
                accept$81(this, obj);
                break;
            case 82:
                accept$82(this, obj);
                break;
            case 83:
                accept$83(this, obj);
                break;
            case 84:
                accept$84(this, obj);
                break;
            case 85:
                accept$85(this, obj);
                break;
            case 86:
                accept$86(this, obj);
                break;
            case 87:
                accept$87(this, obj);
                break;
            case 88:
                accept$88(this, obj);
                break;
            case 89:
                accept$89(this, obj);
                break;
            case 90:
                accept$90(this, obj);
                break;
            case 91:
                accept$91(this, obj);
                break;
            case 92:
                accept$92(this, obj);
                break;
            case 93:
                accept$93(this, obj);
                break;
            case 94:
                accept$94(this, obj);
                break;
            case 95:
                accept$95(this, obj);
                break;
            case 96:
                accept$96(this, obj);
                break;
            case 97:
                accept$97(this, obj);
                break;
            case 98:
                accept$98(this, obj);
                break;
            case 99:
                accept$99(this, obj);
                break;
            case 100:
                accept$100(this, obj);
                break;
            case 101:
                accept$101(this, obj);
                break;
            case 102:
                accept$102(this, obj);
                break;
            case 103:
                accept$103(this, obj);
                break;
            case 104:
                accept$104(this, obj);
                break;
            case 105:
                accept$105(this, obj);
                break;
            case 106:
                accept$106(this, obj);
                break;
            case 107:
                accept$107(this, obj);
                break;
            case 108:
                accept$108(this, obj);
                break;
            case 109:
                accept$109(this, obj);
                break;
            case 110:
                accept$110(this, obj);
                break;
            case 111:
                accept$111(this, obj);
                break;
            case 112:
                accept$112(this, obj);
                break;
            case 113:
                accept$113(this, obj);
                break;
            case 114:
                accept$114(this, obj);
                break;
            case 115:
                accept$115(this, obj);
                break;
            case 116:
                accept$116(this, obj);
                break;
            case 117:
                accept$117(this, obj);
                break;
            case 118:
                accept$118(this, obj);
                break;
            case 119:
                accept$119(this, obj);
                break;
            case 120:
                accept$120(this, obj);
                break;
            case 121:
                accept$121(this, obj);
                break;
            case 122:
                accept$122(this, obj);
                break;
        }
    }

    public AfS182S0100000_13(Context context, int i) {
        this.$t = i;
        switch (i) {
            case 69:
            case 70:
            case 74:
            case 105:
                this.l0 = context;
                break;
            default:
                this.l0 = context;
                break;
        }
    }

    public static final void accept$0(AfS182S0100000_13 afS182S0100000_13, Object obj) {
        C1C7U.LIZ("AgeGateQuickLoginEntryPoint@27bb.onAgeGateSuccessForLogin$1$3");
        InterfaceC851540Xaq interfaceC851540Xaq = (InterfaceC851540Xaq) afS182S0100000_13.l0;
        String message = ((Throwable) obj).getMessage();
        if (message == null) {
            BaseAccountFlowFragment currentFragment = ((InterfaceC851540Xaq) afS182S0100000_13.l0).getCurrentFragment();
            if (currentFragment != null) {
                message = currentFragment.getString(2131834217);
            } else {
                message = null;
            }
        }
        interfaceC851540Xaq.LIZIZ(0, message);
        C1C7U.LIZIZ("AgeGateQuickLoginEntryPoint@27bb.onAgeGateSuccessForLogin$1$3");
    }

    public static final void accept$1(AfS182S0100000_13 afS182S0100000_13, Object obj) {
        C1C7U.LIZ("ProfilePageMenuFragment@3122.subscribeBackground$1");
        Boolean bool = (Boolean) obj;
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("subscribeBackground inBackground: ");
        sbLIZ.append(bool);
        sbLIZ.append(". isMenuVisible:");
        sbLIZ.append(((ProfilePageMenuFragment) afS182S0100000_13.l0).getUserVisibleHint());
        sbLIZ.append(' ');
        C2188811AlT.LIZIZ(sbLIZ);
        if (((ProfilePageMenuFragment) afS182S0100000_13.l0).getUserVisibleHint()) {
            if (bool.booleanValue()) {
                C1249240ic6.LIZ.getClass();
                C1249240ic6.LIZLLL("exit_background");
            } else {
                C1249240ic6 c1249240ic6 = C1249240ic6.LIZ;
                long jCurrentTimeMillis = System.currentTimeMillis();
                c1249240ic6.getClass();
                C1249240ic6.LJ = jCurrentTimeMillis;
            }
        }
        C1C7U.LIZIZ("ProfilePageMenuFragment@3122.subscribeBackground$1");
    }

    public static final void accept$10(AfS182S0100000_13 afS182S0100000_13, Object obj) {
        C1C7U.LIZ("BindEmailFragment@4a55.sendCode$1");
        BindEmailFragment bindEmailFragment = (BindEmailFragment) afS182S0100000_13.l0;
        bindEmailFragment.getClass();
        C852810Xct.LIZ.getClass();
        C852810Xct.LJIILJJIL(bindEmailFragment, true);
        Bundle arguments = bindEmailFragment.getArguments();
        arguments.putInt("next_page", EnumC852910Xd3.EMAIL_SMS_BIND.getValue());
        bindEmailFragment.fo(arguments);
        C1C7U.LIZIZ("BindEmailFragment@4a55.sendCode$1");
    }

    public static final void accept$100(AfS182S0100000_13 afS182S0100000_13, Object obj) {
        C1C7U.LIZ("VerifyEmailForUnbindPhoneFlowStep@b2c7.handleAction$3");
        ((C853830XeX) afS182S0100000_13.l0).LJIIIIZZ(false, C0XWH.LIZ((Throwable) obj), EnumC854390XfR.EMAIL);
        C1C7U.LIZIZ("VerifyEmailForUnbindPhoneFlowStep@b2c7.handleAction$3");
    }

    public static final void accept$101(AfS182S0100000_13 afS182S0100000_13, Object obj) {
        C1C7U.LIZ("VerifyPasswordForUnbindEmailFlowStep@fc56.handleAction$2");
        ((C853970Xel) afS182S0100000_13.l0).LJIIIIZZ(false, C0XWH.LIZ((Throwable) obj), EnumC854390XfR.PASSWORD);
        C1C7U.LIZIZ("VerifyPasswordForUnbindEmailFlowStep@fc56.handleAction$2");
    }

    public static final void accept$102(AfS182S0100000_13 afS182S0100000_13, Object obj) {
        C1C7U.LIZ("VerifyPasswordForUnbindPhoneFlowStep@f163.handleAction$2");
        ((C853980Xem) afS182S0100000_13.l0).LJIIIIZZ(false, C0XWH.LIZ((Throwable) obj), EnumC854390XfR.PASSWORD);
        C1C7U.LIZIZ("VerifyPasswordForUnbindPhoneFlowStep@f163.handleAction$2");
    }

    public static final void accept$103(AfS182S0100000_13 afS182S0100000_13, Object obj) {
        ((C1BLL) afS182S0100000_13.l0).getClass();
        C1C7U.LIZ("DFDownloader@b801.registerNetWorkReceiver$1L");
        synchronized (C1BLL.class) {
            try {
                if (C1BLL.LLJ && C1BLL.LLJIJIL != null) {
                    C844470XAv.LIZ.getClass();
                    C786410Ut5.LJJIFFI(C844470XAv.LIZ(), C1BLL.LLJIJIL);
                    C1BLL.LLJ = false;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        C1C7U.LIZIZ("DFDownloader@b801.registerNetWorkReceiver$1L");
    }

    public static final void accept$104(AfS182S0100000_13 afS182S0100000_13, Object obj) {
        C1BLL c1bll = (C1BLL) afS182S0100000_13.l0;
        c1bll.getClass();
        C1C7U.LIZ("DFDownloader@b801.registerAppEnterBackgroundListener$1L");
        if (!((Boolean) obj).booleanValue()) {
            c1bll.LJIILJJIL();
            synchronized (C1BLL.class) {
                try {
                    if (C1BLL.LLJI && C1BLL.LLJILJIL != null && !C1BLL.LLJILJIL.isDisposed()) {
                        C1BLL.LLJILJIL.dispose();
                        C1BLL.LLJI = false;
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        C1C7U.LIZIZ("DFDownloader@b801.registerAppEnterBackgroundListener$1L");
    }

    public static final void accept$105(AfS182S0100000_13 afS182S0100000_13, Object obj) {
        C813900VwK c813900VwKLIZ;
        Boolean boolValueOf;
        String str;
        IPushApi iPushApi;
        C1C7U.LIZ("PushForegroundClearController@23b4.setup$1");
        if (!((C606810Nr5) obj).LIZIZ) {
            C813890VwJ c813890VwJ = C813890VwJ.LIZ;
            Context context = (Context) afS182S0100000_13.l0;
            c813890VwJ.getClass();
            IKMPPushService iKMPPushService = (IKMPPushService) PluggableExtentionKt.pluggableSpi$default(IKMPPushService.class, false, false, false, 14, null);
            String str2 = null;
            if (iKMPPushService != null) {
                c813900VwKLIZ = iKMPPushService.LIZ(System.currentTimeMillis());
            } else {
                c813900VwKLIZ = null;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onEnterForeground | shouldClear=");
            if (c813900VwKLIZ != null) {
                boolValueOf = Boolean.valueOf(c813900VwKLIZ.LIZ);
            } else {
                boolValueOf = null;
            }
            sbLIZ.append(boolValueOf);
            sbLIZ.append(" strategy=");
            if (c813900VwKLIZ != null) {
                str = c813900VwKLIZ.LIZIZ;
            } else {
                str = null;
            }
            sbLIZ.append(str);
            sbLIZ.append(" reason=");
            if (c813900VwKLIZ != null) {
                str2 = c813900VwKLIZ.LIZJ;
            }
            sbLIZ.append(str2);
            C2188811AlT.LIZIZ(sbLIZ);
            if (c813900VwKLIZ != null && c813900VwKLIZ.LIZ && (iPushApi = (IPushApi) PluggableExtentionKt.pluggableSpi$default(IPushApi.class, false, false, false, 14, null)) != null) {
                iPushApi.clearAll(context);
            }
        }
        C1C7U.LIZIZ("PushForegroundClearController@23b4.setup$1");
    }

    public static final void accept$106(AfS182S0100000_13 afS182S0100000_13, Object obj) {
        C1C7U.LIZ("EmptyRetryManager@4752.loadMoreListByEmptyRetry$d$3");
        Throwable th = (Throwable) obj;
        Message messageObtainMessage = ((Handler) afS182S0100000_13.l0).obtainMessage(0);
        if (th instanceof C805940VjU) {
            messageObtainMessage.obj = ((C805940VjU) th).getResponse();
        } else {
            messageObtainMessage.obj = new Exception(th.getMessage());
        }
        C786410Ut5.LJLJJLL((Handler) afS182S0100000_13.l0, messageObtainMessage);
        C1C7U.LIZIZ("EmptyRetryManager@4752.loadMoreListByEmptyRetry$d$3");
    }

    public static final void accept$107(AfS182S0100000_13 afS182S0100000_13, Object obj) {
        C1C7U.LIZ("TraceLogImpl@8707.log$1");
        if (((Boolean) obj).booleanValue()) {
            TraceLogImpl traceLogImpl = (TraceLogImpl) afS182S0100000_13.l0;
            synchronized (traceLogImpl) {
                AnonymousClass0956 anonymousClass0956 = traceLogImpl.LJFF;
                if (anonymousClass0956 != null && anonymousClass0956.isActive()) {
                    traceLogImpl.LJ = false;
                    AnonymousClass0956 anonymousClass09562 = traceLogImpl.LJFF;
                    if (anonymousClass09562 != null) {
                        anonymousClass09562.LIZIZ(null);
                    }
                    traceLogImpl.LJFF = null;
                }
            }
        } else {
            ((TraceLogImpl) afS182S0100000_13.l0).LJFF();
        }
        C1C7U.LIZIZ("TraceLogImpl@8707.log$1");
    }

    public static final void accept$108(AfS182S0100000_13 afS182S0100000_13, Object obj) throws Throwable {
        PushBody pushBody;
        RunnableC808760Vo2 runnableC808760Vo2;
        C1C7U.LIZ("DoNotifyWork@70db.doRequestNotifications$1");
        LocalNotifyInfoResponse localNotifyInfoResponse = (LocalNotifyInfoResponse) obj;
        ((JSONObject) afS182S0100000_13.l0).put("status_code", localNotifyInfoResponse.status_code);
        if (localNotifyInfoResponse.status_code != 0) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("getLocalNotifyInfo() - error! status_code = ");
            sbLIZ.append(localNotifyInfoResponse.status_code);
            C2188811AlT.LIZIZ(sbLIZ);
            C0VQ5 c0vq5 = C0VQ5.LIZ;
            JSONObject jSONObject = (JSONObject) afS182S0100000_13.l0;
            c0vq5.getClass();
            C0VQ5.LIZJ(jSONObject);
        } else {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("getLocalNotifyInfo() - Received msg: ");
            sbLIZ2.append(localNotifyInfoResponse.pushMsg);
            C2188811AlT.LIZIZ(sbLIZ2);
            if (TextUtils.isEmpty(localNotifyInfoResponse.pushMsg)) {
                ((JSONObject) afS182S0100000_13.l0).put("has_message", false);
                C0VQ5 c0vq52 = C0VQ5.LIZ;
                JSONObject jSONObject2 = (JSONObject) afS182S0100000_13.l0;
                c0vq52.getClass();
                C0VQ5.LIZJ(jSONObject2);
            } else {
                PushBody pushBody2 = null;
                try {
                    try {
                        pushBody = new PushBody(new JSONObject(localNotifyInfoResponse.pushMsg));
                    } catch (JSONException e) {
                        e = e;
                    }
                    try {
                        try {
                            ((JSONObject) afS182S0100000_13.l0).put("has_message", true);
                            try {
                                ((JSONObject) afS182S0100000_13.l0).put("rule_id", String.valueOf(pushBody.id));
                                ((JSONObject) afS182S0100000_13.l0).put("rule_id64", String.valueOf(pushBody.rid64));
                            } catch (Exception e2) {
                                TryCatchGuardChecker.doCheck(e2);
                            }
                            C797970VRz.LIZ.getClass();
                        } catch (JSONException e3) {
                            e = e3;
                            pushBody2 = pushBody;
                            TryCatchGuardChecker.doCheck(e);
                            JSONObject jSONObject3 = (JSONObject) afS182S0100000_13.l0;
                            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                            sbLIZ3.append("json_exception: ");
                            sbLIZ3.append(e.getMessage());
                            jSONObject3.put("message_invalid_reason", C2188811AlT.LIZIZ(sbLIZ3));
                            if (pushBody2 != null) {
                                if (!TextUtils.isEmpty(pushBody2.targetSecUid) && !TextUtils.equals(pushBody2.targetSecUid, C809030VoT.LJIIJ.LIZIZ.LJIJJ.getSecUid())) {
                                    RunnableC823120WQs.LIZIZ(new RunnableC808760Vo2(10000, pushBody2));
                                }
                                pushBody = pushBody2;
                                if (pushBody2 != null) {
                                }
                            }
                            C0VQ5 c0vq53 = C0VQ5.LIZ;
                            JSONObject jSONObject4 = (JSONObject) afS182S0100000_13.l0;
                            c0vq53.getClass();
                            C0VQ5.LIZJ(jSONObject4);
                            C1C7U.LIZIZ("DoNotifyWork@70db.doRequestNotifications$1");
                        }
                        if (C797970VRz.LIZ(pushBody)) {
                            ((JSONObject) afS182S0100000_13.l0).put("message_invalid_reason", "duplicate");
                            C0VQ5 c0vq54 = C0VQ5.LIZ;
                            JSONObject jSONObject5 = (JSONObject) afS182S0100000_13.l0;
                            c0vq54.getClass();
                            C0VQ5.LIZJ(jSONObject5);
                            if (!TextUtils.isEmpty(pushBody.targetSecUid) && !TextUtils.equals(pushBody.targetSecUid, C809030VoT.LJIIJ.LIZIZ.LJIJJ.getSecUid())) {
                                runnableC808760Vo2 = new RunnableC808760Vo2(10000, pushBody);
                                RunnableC823120WQs.LIZIZ(runnableC808760Vo2);
                            }
                        } else if (!C797970VRz.LIZIZ(pushBody, (JSONObject) afS182S0100000_13.l0)) {
                            C0VQ5 c0vq55 = C0VQ5.LIZ;
                            JSONObject jSONObject6 = (JSONObject) afS182S0100000_13.l0;
                            c0vq55.getClass();
                            C0VQ5.LIZJ(jSONObject6);
                            if (!TextUtils.isEmpty(pushBody.targetSecUid) && !TextUtils.equals(pushBody.targetSecUid, C809030VoT.LJIIJ.LIZIZ.LJIJJ.getSecUid())) {
                                runnableC808760Vo2 = new RunnableC808760Vo2(10000, pushBody);
                                RunnableC823120WQs.LIZIZ(runnableC808760Vo2);
                            }
                        } else {
                            if (!TextUtils.isEmpty(pushBody.targetSecUid) && !TextUtils.equals(pushBody.targetSecUid, C809030VoT.LJIIJ.LIZIZ.LJIJJ.getSecUid())) {
                                RunnableC823120WQs.LIZIZ(new RunnableC808760Vo2(10000, pushBody));
                            }
                            JSONObject jSONObject7 = (JSONObject) afS182S0100000_13.l0;
                            C797970VRz.LIZLLL(C797970VRz.LIZ, pushBody);
                            String strLIZ = pushBody.LIZ();
                            if (TextUtils.isEmpty(strLIZ)) {
                                if (jSONObject7 != null) {
                                    jSONObject7.put("message_invalid_reason", "empty_body");
                                }
                            } else {
                                IPushApi iPushApi = (IPushApi) ServiceManager.get().getService(IPushApi.class);
                                C844470XAv.LIZ.getClass();
                                iPushApi.handleLocalMessage(C844470XAv.LIZ(), strLIZ, jSONObject7);
                            }
                            C0VQ5 c0vq532 = C0VQ5.LIZ;
                            JSONObject jSONObject42 = (JSONObject) afS182S0100000_13.l0;
                            c0vq532.getClass();
                            C0VQ5.LIZJ(jSONObject42);
                        }
                    } catch (Throwable th) {
                        th = th;
                        pushBody2 = pushBody;
                        TryCatchGuardChecker.doCheck(th);
                        if (pushBody2 != null && !TextUtils.isEmpty(pushBody2.targetSecUid) && !TextUtils.equals(pushBody2.targetSecUid, C809030VoT.LJIIJ.LIZIZ.LJIJJ.getSecUid())) {
                            RunnableC823120WQs.LIZIZ(new RunnableC808760Vo2(10000, pushBody2));
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            }
        }
        C1C7U.LIZIZ("DoNotifyWork@70db.doRequestNotifications$1");
    }

    public static final void accept$109(AfS182S0100000_13 afS182S0100000_13, Object obj) {
        C1C7U.LIZ("StrategyParamsUploader@5f8c.uploadParams$1");
        Function1 function1 = (Function1) afS182S0100000_13.l0;
        if (function1 != null) {
            function1.invoke(obj);
        }
        C1C7U.LIZIZ("StrategyParamsUploader@5f8c.uploadParams$1");
    }

    public static final void accept$11(AfS182S0100000_13 afS182S0100000_13, Object obj) {
        IOneClickLoginService iOneClickLoginService;
        String str;
        C1C7U.LIZ("BindPhoneCodeVerifyFragment@ebd9.onValidateCode$1");
        C853660XeG c853660XeG = C853660XeG.LIZ;
        BindPhoneCodeVerifyFragment bindPhoneCodeVerifyFragment = (BindPhoneCodeVerifyFragment) afS182S0100000_13.l0;
        EnumC1237100iIW enumC1237100iIW = bindPhoneCodeVerifyFragment.LLLLLIL;
        boolean z = bindPhoneCodeVerifyFragment.LLLLL;
        c853660XeG.getClass();
        C853660XeG.LJFF(enumC1237100iIW, z);
        BindPhoneCodeVerifyFragment bindPhoneCodeVerifyFragment2 = (BindPhoneCodeVerifyFragment) afS182S0100000_13.l0;
        C0XZG c0xzg = (C0XZG) ((C0XT7) obj).LJIIIZ;
        bindPhoneCodeVerifyFragment2.getClass();
        User userLIZJ = C0XQ5.LIZJ();
        if (c0xzg != null) {
            C0XO4 c0xo4 = (C0XO4) ((HashMap) c0xzg.LJIIJ.LIZLLL).get("mobile");
            if (c0xo4 != null) {
                str = c0xo4.LLILLL;
            } else {
                str = "";
            }
            userLIZJ.setPhoneBinded(true);
            userLIZJ.setBindPhone(str);
            if (c0xzg.LJIIJ.LIZ > 0) {
                C0XQ5.LIZ().LJJLL(c0xzg.LJIIJ, null, false);
            }
            if (str != null) {
                C0XQ5.LJIIJJI(7, 1, new C851860XbM(str, C786410Ut5.J3(c0xzg.LJIIJ.LJJII)));
            }
        }
        C0HZQ c0hzq = ((BindPhoneCodeVerifyFragment) afS182S0100000_13.l0).LLLF;
        if (c0hzq != null && c0hzq.isChecked() && (iOneClickLoginService = (IOneClickLoginService) PluggableExtentionKt.pluggableSpi$default(IOneClickLoginService.class, false, false, false, 14, null)) != null) {
            iOneClickLoginService.LJIIL(C0XWD.SIGN_UP, ((BindPhoneCodeVerifyFragment) afS182S0100000_13.l0).getEnterFrom(), ((BindPhoneCodeVerifyFragment) afS182S0100000_13.l0).getEnterMethod(), null, null);
        }
        Bundle arguments = ((BindPhoneCodeVerifyFragment) afS182S0100000_13.l0).getArguments();
        if (arguments == null) {
            arguments = new Bundle();
        }
        arguments.putInt("next_page", EnumC852910Xd3.OPTIONAL_SIGNUP_PAGES.getValue());
        arguments.putInt("previous_page", ((BindPhoneCodeVerifyFragment) afS182S0100000_13.l0).VR().getValue());
        ((BindPhoneCodeVerifyFragment) afS182S0100000_13.l0).fo(arguments);
        C1C7U.LIZIZ("BindPhoneCodeVerifyFragment@ebd9.onValidateCode$1");
    }

    public static final void accept$110(AfS182S0100000_13 afS182S0100000_13, Object obj) {
        C1C7U.LIZ("OneClickLoginService@601d.cloudTokenLogin$disposable$1");
        ((Function1) afS182S0100000_13.l0).invoke(obj);
        C1C7U.LIZIZ("OneClickLoginService@601d.cloudTokenLogin$disposable$1");
    }

    public static final void accept$111(AfS182S0100000_13 afS182S0100000_13, Object obj) {
        C1C7U.LIZ("UnbindInputCodeFragment@7203.validateEmailCode$1");
        C853660XeG c853660XeG = C853660XeG.LIZ;
        UnbindInputCodeFragment unbindInputCodeFragment = (UnbindInputCodeFragment) afS182S0100000_13.l0;
        EnumC1237100iIW enumC1237100iIW = unbindInputCodeFragment.LLLLLIL;
        boolean z = unbindInputCodeFragment.LLLLL;
        c853660XeG.getClass();
        C853660XeG.LJFF(enumC1237100iIW, z);
        ((UnbindInputCodeFragment) afS182S0100000_13.l0).RS(0, true);
        C853770XeR c853770XeR = C853770XeR.LIZ;
        UnbindInputCodeFragment unbindInputCodeFragment2 = (UnbindInputCodeFragment) afS182S0100000_13.l0;
        c853770XeR.getClass();
        if (C853770XeR.LIZ(unbindInputCodeFragment2)) {
            C854460XfY c854460XfY = C854460XfY.LIZ;
            UnbindInputCodeFragment unbindInputCodeFragment3 = (UnbindInputCodeFragment) afS182S0100000_13.l0;
            c854460XfY.getClass();
            C854460XfY.LIZJ(unbindInputCodeFragment3, null);
        } else {
            C854460XfY c854460XfY2 = C854460XfY.LIZ;
            UnbindInputCodeFragment unbindInputCodeFragment4 = (UnbindInputCodeFragment) afS182S0100000_13.l0;
            c854460XfY2.getClass();
            C854460XfY.LIZIZ(unbindInputCodeFragment4, null);
        }
        C1C7U.LIZIZ("UnbindInputCodeFragment@7203.validateEmailCode$1");
    }

    public static final void accept$112(AfS182S0100000_13 afS182S0100000_13, Object obj) {
        C1C7U.LIZ("UnbindInputCodeFragment@7203.validateEmailCode$2");
        ((UnbindInputCodeFragment) afS182S0100000_13.l0).RS(C0XWH.LIZ((Throwable) obj), false);
        C1C7U.LIZIZ("UnbindInputCodeFragment@7203.validateEmailCode$2");
    }

    public static final void accept$113(AfS182S0100000_13 afS182S0100000_13, Object obj) {
        C1C7U.LIZ("UnbindInputCodeFragment@7203.validatePhoneCode$1");
        C853660XeG c853660XeG = C853660XeG.LIZ;
        UnbindInputCodeFragment unbindInputCodeFragment = (UnbindInputCodeFragment) afS182S0100000_13.l0;
        EnumC1237100iIW enumC1237100iIW = unbindInputCodeFragment.LLLLLIL;
        boolean z = unbindInputCodeFragment.LLLLL;
        c853660XeG.getClass();
        C853660XeG.LJFF(enumC1237100iIW, z);
        ((UnbindInputCodeFragment) afS182S0100000_13.l0).RS(0, true);
        C853770XeR c853770XeR = C853770XeR.LIZ;
        UnbindInputCodeFragment unbindInputCodeFragment2 = (UnbindInputCodeFragment) afS182S0100000_13.l0;
        c853770XeR.getClass();
        if (C853770XeR.LIZ(unbindInputCodeFragment2)) {
            C854460XfY c854460XfY = C854460XfY.LIZ;
            UnbindInputCodeFragment unbindInputCodeFragment3 = (UnbindInputCodeFragment) afS182S0100000_13.l0;
            c854460XfY.getClass();
            C854460XfY.LIZJ(unbindInputCodeFragment3, null);
        } else {
            C854460XfY c854460XfY2 = C854460XfY.LIZ;
            UnbindInputCodeFragment unbindInputCodeFragment4 = (UnbindInputCodeFragment) afS182S0100000_13.l0;
            c854460XfY2.getClass();
            C854460XfY.LIZIZ(unbindInputCodeFragment4, null);
        }
        C1C7U.LIZIZ("UnbindInputCodeFragment@7203.validatePhoneCode$1");
    }

    public static final void accept$114(AfS182S0100000_13 afS182S0100000_13, Object obj) {
        C1C7U.LIZ("UnbindInputCodeFragment@7203.validatePhoneCode$2");
        ((UnbindInputCodeFragment) afS182S0100000_13.l0).RS(C0XWH.LIZ((Throwable) obj), false);
        C1C7U.LIZIZ("UnbindInputCodeFragment@7203.validatePhoneCode$2");
    }

    public static final void accept$115(AfS182S0100000_13 afS182S0100000_13, Object obj) {
        C1C7U.LIZ("UnbindUtils@e995.sendEmailCode$1");
        ((Function0) afS182S0100000_13.l0).invoke();
        C1C7U.LIZIZ("UnbindUtils@e995.sendEmailCode$1");
    }

    public static final void accept$116(AfS182S0100000_13 afS182S0100000_13, Object obj) {
        C1C7U.LIZ("LiveHostAppContext@2bce.registerLifeCycleCallback$3L");
        ((C1AGV) afS182S0100000_13.l0).onActivityResumed((Activity) obj);
        C1C7U.LIZIZ("LiveHostAppContext@2bce.registerLifeCycleCallback$3L");
    }

    public static final void accept$117(AfS182S0100000_13 afS182S0100000_13, Object obj) {
        C1C7U.LIZ("LiveHostAppContext@2bce.registerLifeCycleCallback$4L");
        ((C1AGV) afS182S0100000_13.l0).onActivityPaused((Activity) obj);
        C1C7U.LIZIZ("LiveHostAppContext@2bce.registerLifeCycleCallback$4L");
    }

    public static final void accept$118(AfS182S0100000_13 afS182S0100000_13, Object obj) {
        C1C7U.LIZ("LiveHostAppContext@2bce.registerLifeCycleCallback$5L");
        ((C1AGV) afS182S0100000_13.l0).onActivityStopped((Activity) obj);
        C1C7U.LIZIZ("LiveHostAppContext@2bce.registerLifeCycleCallback$5L");
    }

    public static final void accept$119(AfS182S0100000_13 afS182S0100000_13, Object obj) {
        C1C7U.LIZ("LiveHostAppContext@2bce.registerLifeCycleCallback$6L");
        ((C1AGV) afS182S0100000_13.l0).onActivityDestroyed((Activity) obj);
        C1C7U.LIZIZ("LiveHostAppContext@2bce.registerLifeCycleCallback$6L");
    }

    public static final void accept$12(AfS182S0100000_13 afS182S0100000_13, Object obj) {
        C1C7U.LIZ("BaseAccountBindingsFlowFragment@1903.getEmailAction$1$1");
        C852810Xct c852810Xct = C852810Xct.LIZ;
        BaseAccountBindingsFlowFragment baseAccountBindingsFlowFragment = (BaseAccountBindingsFlowFragment) afS182S0100000_13.l0;
        c852810Xct.getClass();
        C852810Xct.LJIILJJIL(baseAccountBindingsFlowFragment, true);
        int i = C2272861Dxk.LIZ[((BaseAccountBindingsFlowFragment) afS182S0100000_13.l0).SR().ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        BaseAccountBindingsFlowFragment baseAccountBindingsFlowFragment2 = (BaseAccountBindingsFlowFragment) afS182S0100000_13.l0;
                        Bundle arguments = baseAccountBindingsFlowFragment2.getArguments();
                        if (arguments != null) {
                            arguments.putInt("next_page", EnumC852910Xd3.VERIFY_EMAIL_BEFORE_CHANGE.getValue());
                            C852810Xct.LJIILLIIL(arguments, baseAccountBindingsFlowFragment2.LLLIILIL.getEmail());
                        } else {
                            arguments = new Bundle();
                        }
                        baseAccountBindingsFlowFragment2.fo(arguments);
                    } else {
                        ((BaseAccountBindingsFlowFragment) afS182S0100000_13.l0).getClass();
                        throw new IllegalStateException("This option should not be available in this scene");
                    }
                } else {
                    BaseAccountBindingsFlowFragment baseAccountBindingsFlowFragment3 = (BaseAccountBindingsFlowFragment) afS182S0100000_13.l0;
                    Bundle arguments2 = baseAccountBindingsFlowFragment3.getArguments();
                    if (arguments2 != null) {
                        arguments2.putInt("next_page", EnumC852910Xd3.VERIFY_EMAIL_BEFORE_CHANGE.getValue());
                        C852810Xct.LJIILLIIL(arguments2, baseAccountBindingsFlowFragment3.LLLIILIL.getEmail());
                    } else {
                        arguments2 = new Bundle();
                    }
                    baseAccountBindingsFlowFragment3.fo(arguments2);
                }
            } else {
                BaseAccountBindingsFlowFragment baseAccountBindingsFlowFragment4 = (BaseAccountBindingsFlowFragment) afS182S0100000_13.l0;
                Bundle arguments3 = baseAccountBindingsFlowFragment4.getArguments();
                if (arguments3 != null) {
                    arguments3.putInt("next_page", EnumC852910Xd3.UNBIND_EMAIL_VERIFY_USING_EMAIL.getValue());
                    C852810Xct.LJIILLIIL(arguments3, C0XQ5.LIZJ().getEmail());
                } else {
                    arguments3 = new Bundle();
                }
                baseAccountBindingsFlowFragment4.fo(arguments3);
            }
        } else {
            BaseAccountBindingsFlowFragment baseAccountBindingsFlowFragment5 = (BaseAccountBindingsFlowFragment) afS182S0100000_13.l0;
            Bundle arguments4 = baseAccountBindingsFlowFragment5.getArguments();
            if (arguments4 != null) {
                arguments4.putInt("next_page", EnumC852910Xd3.UNBIND_PHONE_VERIFY_USING_EMAIL.getValue());
                C852810Xct.LJIILLIIL(arguments4, baseAccountBindingsFlowFragment5.LLLIILIL.getEmail());
            } else {
                arguments4 = new Bundle();
            }
            baseAccountBindingsFlowFragment5.fo(arguments4);
        }
        C1C7U.LIZIZ("BaseAccountBindingsFlowFragment@1903.getEmailAction$1$1");
    }

    public static final void accept$120(AfS182S0100000_13 afS182S0100000_13, Object obj) {
        C1AGV c1agv = (C1AGV) afS182S0100000_13.l0;
        C0X4A c0x4a = (C0X4A) obj;
        C1C7U.LIZ("LiveHostAppContext@2bce.registerLifeCycleCallback$1L");
        if (c0x4a != null) {
            c1agv.onActivityCreated(c0x4a.LIZ, c0x4a.LIZIZ);
        }
        C1C7U.LIZIZ("LiveHostAppContext@2bce.registerLifeCycleCallback$1L");
    }

    public static final void accept$121(AfS182S0100000_13 afS182S0100000_13, Object obj) {
        C1C7U.LIZ("LiveHostAppContext@2bce.registerLifeCycleCallback$2L");
        ((C1AGV) afS182S0100000_13.l0).onActivityStarted((Activity) obj);
        C1C7U.LIZIZ("LiveHostAppContext@2bce.registerLifeCycleCallback$2L");
    }

    public static final void accept$122(AfS182S0100000_13 afS182S0100000_13, Object obj) {
        C1C7U.LIZ("ForePowerLogger@aeec.init$1");
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        C0VTR.LJFF = zBooleanValue;
        if (zBooleanValue) {
            if (C0VTR.LIZIZ > 0 && System.currentTimeMillis() - C0VTR.LIZIZ > 300000) {
                try {
                    C0VTR c0vtr = C0VTR.LIZ;
                    C0V9Z c0v9z = (C0V9Z) afS182S0100000_13.l0;
                    c0vtr.getClass();
                    C0VTR.LIZ(c0v9z);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                }
            }
        } else {
            C0VTR.LIZ.getClass();
            C0VTR.LIZIZ();
        }
        C1C7U.LIZIZ("ForePowerLogger@aeec.init$1");
    }

    public static final void accept$13(AfS182S0100000_13 afS182S0100000_13, Object obj) {
        C1C7U.LIZ("ChangeEmailFragment@fff4.sendCode$1");
        ((ChangeEmailFragment) afS182S0100000_13.l0).kT(true);
        C1C7U.LIZIZ("ChangeEmailFragment@fff4.sendCode$1");
    }

    public static final void accept$14(AfS182S0100000_13 afS182S0100000_13, Object obj) {
        String strOptString;
        String strOptString2;
        String string;
        String string2;
        JSONObject jSONObjectOptJSONObject;
        JSONObject jSONObjectOptJSONObject2;
        C1C7U.LIZ("ChangeEmailVerifyFragment@4532.onValidateCode$1");
        C0XT7 c0xt7 = (C0XT7) obj;
        C853660XeG c853660XeG = C853660XeG.LIZ;
        ChangeEmailVerifyFragment changeEmailVerifyFragment = (ChangeEmailVerifyFragment) afS182S0100000_13.l0;
        EnumC1237100iIW enumC1237100iIW = changeEmailVerifyFragment.LLLLLIL;
        boolean z = changeEmailVerifyFragment.LLLLL;
        c853660XeG.getClass();
        C853660XeG.LJFF(enumC1237100iIW, z);
        C852810Xct c852810Xct = C852810Xct.LIZ;
        ChangeEmailVerifyFragment changeEmailVerifyFragment2 = (ChangeEmailVerifyFragment) afS182S0100000_13.l0;
        c852810Xct.getClass();
        C852810Xct.LJIJJ(changeEmailVerifyFragment2.getArguments(), "");
        User userLIZJ = C0XQ5.LIZJ();
        C0XUE.LIZ.LJIIIZ(userLIZJ.getUid(), ((ChangeEmailVerifyFragment) afS182S0100000_13.l0).getEmail());
        JSONObject jSONObject = c0xt7.LJIIIZ.LJ;
        if (jSONObject == null || (jSONObjectOptJSONObject2 = jSONObject.optJSONObject("data")) == null || (strOptString = jSONObjectOptJSONObject2.optString("email")) == null) {
            strOptString = "";
        }
        userLIZJ.setEmail(strOptString);
        userLIZJ.setEmailVerified(true);
        userLIZJ.setHasEmail(true);
        Bundle bundle = new Bundle();
        ChangeEmailVerifyFragment changeEmailVerifyFragment3 = (ChangeEmailVerifyFragment) afS182S0100000_13.l0;
        C786410Ut5.LJJJI("platform", "email", bundle);
        JSONObject jSONObject2 = c0xt7.LJIIIZ.LJ;
        if (jSONObject2 == null || (jSONObjectOptJSONObject = jSONObject2.optJSONObject("data")) == null || (strOptString2 = jSONObjectOptJSONObject.optString("ticket")) == null) {
            strOptString2 = "";
        }
        C852810Xct.LJIJJ(bundle, strOptString2);
        changeEmailVerifyFragment3.JS(bundle);
        Bundle arguments = changeEmailVerifyFragment3.getArguments();
        if (arguments != null) {
            C786410Ut5.LJJIIZI(arguments, bundle, "final_data");
        }
        Bundle arguments2 = ((ChangeEmailVerifyFragment) afS182S0100000_13.l0).getArguments();
        if (arguments2 != null && arguments2.getBoolean("show_3p_change_email_success_toast", false)) {
            C19EG activity = ((ChangeEmailVerifyFragment) afS182S0100000_13.l0).getActivity();
            if (activity != null) {
                C1389890mGx c1389890mGx = new C1389890mGx(activity);
                c1389890mGx.LJIIIZ(2131850225);
                c1389890mGx.LJFF(R.raw.icon_tick_circle_fill);
                c1389890mGx.LJII(R.attr.zi);
                c1389890mGx.LIZ(true);
                c1389890mGx.LIZLLL(Mp4ScreenVideoLoadTimeout.CONTROL);
                c1389890mGx.LJIIJJI();
            }
        } else {
            Bundle arguments3 = ((ChangeEmailVerifyFragment) afS182S0100000_13.l0).getArguments();
            if (arguments3 != null && arguments3.getBoolean("show_modify_email_success_toast", false)) {
                C1233040iBy c1233040iBy = new C1233040iBy(C0XPY.LIZIZ);
                c1233040iBy.LIZJ(((ChangeEmailVerifyFragment) afS182S0100000_13.l0).getString(2131827398));
                c1233040iBy.LIZLLL();
            } else {
                Bundle arguments4 = ((ChangeEmailVerifyFragment) afS182S0100000_13.l0).getArguments();
                if (arguments4 != null && arguments4.getBoolean("show_success_toast", true)) {
                    C1233040iBy c1233040iBy2 = new C1233040iBy(C0XPY.LIZIZ);
                    c1233040iBy2.LIZJ(((ChangeEmailVerifyFragment) afS182S0100000_13.l0).getString(2131833860));
                    c1233040iBy2.LIZLLL();
                }
            }
        }
        Bundle arguments5 = ((ChangeEmailVerifyFragment) afS182S0100000_13.l0).getArguments();
        if (arguments5 != null && arguments5.getBoolean("is_from_prompt", false)) {
            C2344009Gk c2344009Gk = new C2344009Gk();
            Bundle arguments6 = ((ChangeEmailVerifyFragment) afS182S0100000_13.l0).getArguments();
            String string3 = null;
            if (arguments6 != null) {
                string = arguments6.getString("enter_from", "");
            } else {
                string = null;
            }
            c2344009Gk.LJIIIIZZ("enter_from", string);
            Bundle arguments7 = ((ChangeEmailVerifyFragment) afS182S0100000_13.l0).getArguments();
            if (arguments7 != null) {
                string2 = arguments7.getString("enter_method", "");
            } else {
                string2 = null;
            }
            c2344009Gk.LJIIIIZZ("enter_method", string2);
            Bundle arguments8 = ((ChangeEmailVerifyFragment) afS182S0100000_13.l0).getArguments();
            if (arguments8 != null) {
                string3 = arguments8.getString("page", "");
            }
            c2344009Gk.LJIIIIZZ("page", string3);
            c2344009Gk.LJIIIIZZ("bind_status", "changed_to_new_email");
            C20684815ws.LJIILLIIL("email_bind_status", c2344009Gk.LIZ);
        }
        C2344009Gk c2344009Gk2 = new C2344009Gk();
        c2344009Gk2.LIZJ(2, "type");
        C20684815ws.LJIILLIIL("email_bundling_success", c2344009Gk2.LIZ);
        C854460XfY c854460XfY = C854460XfY.LIZ;
        ChangeEmailVerifyFragment changeEmailVerifyFragment4 = (ChangeEmailVerifyFragment) afS182S0100000_13.l0;
        String enterFrom = changeEmailVerifyFragment4.getEnterFrom();
        String enterMethod = ((ChangeEmailVerifyFragment) afS182S0100000_13.l0).getEnterMethod();
        String strValueOf = String.valueOf(c0xt7.LJIIIZ.LIZIZ);
        String strRR = ((ChangeEmailVerifyFragment) afS182S0100000_13.l0).RR();
        c854460XfY.getClass();
        C854460XfY.LJIILLIIL(changeEmailVerifyFragment4, false, enterFrom, enterMethod, strValueOf, 1, false, strRR);
        Bundle arguments9 = ((ChangeEmailVerifyFragment) afS182S0100000_13.l0).getArguments();
        if (arguments9 != null) {
            ((ChangeEmailVerifyFragment) afS182S0100000_13.l0).WR(arguments9);
        }
        C1C7U.LIZIZ("ChangeEmailVerifyFragment@4532.onValidateCode$1");
    }

    public static final void accept$15(AfS182S0100000_13 afS182S0100000_13, Object obj) {
        C1C7U.LIZ("ChangeEmailVerifyFragment@4532.resendCode$1");
        ((ChangeEmailVerifyFragment) afS182S0100000_13.l0).oT();
        C1C7U.LIZIZ("ChangeEmailVerifyFragment@4532.resendCode$1");
    }

    public static final void accept$16(AfS182S0100000_13 afS182S0100000_13, Object obj) {
        C1C7U.LIZ("VerifyEmailBeforeChangeFragment@1b24.onValidateCode$1");
        C853660XeG c853660XeG = C853660XeG.LIZ;
        VerifyEmailBeforeChangeFragment verifyEmailBeforeChangeFragment = (VerifyEmailBeforeChangeFragment) afS182S0100000_13.l0;
        EnumC1237100iIW enumC1237100iIW = verifyEmailBeforeChangeFragment.LLLLLIL;
        boolean z = verifyEmailBeforeChangeFragment.LLLLL;
        c853660XeG.getClass();
        C853660XeG.LJFF(enumC1237100iIW, z);
        ((VerifyEmailBeforeChangeFragment) afS182S0100000_13.l0).RS(0, true);
        VerifyEmailBeforeChangeFragment verifyEmailBeforeChangeFragment2 = (VerifyEmailBeforeChangeFragment) afS182S0100000_13.l0;
        Bundle bundle = new Bundle(((VerifyEmailBeforeChangeFragment) afS182S0100000_13.l0).getArguments());
        VerifyEmailBeforeChangeFragment verifyEmailBeforeChangeFragment3 = (VerifyEmailBeforeChangeFragment) afS182S0100000_13.l0;
        C852810Xct.LIZ.getClass();
        C852810Xct.LJIILLIIL(bundle, "");
        C852810Xct.LJIJJ(bundle, ((C849670XUv) obj).LJIIIZ);
        C852810Xct.LJIIZILJ(verifyEmailBeforeChangeFragment3, "");
        C852810Xct.LJIJI(verifyEmailBeforeChangeFragment3.getArguments(), "");
        int i = C852850Xcx.LIZ[verifyEmailBeforeChangeFragment3.SR().ordinal()];
        if (i != 1) {
            if (i == 2) {
                bundle.putInt("next_page", EnumC852910Xd3.INPUT_EMAIL_CHANGE.getValue());
            } else {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Unknown scene ");
                sbLIZ.append(verifyEmailBeforeChangeFragment3.SR());
                sbLIZ.append(" while validating email code");
                throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ));
            }
        } else {
            bundle.putInt("next_page", EnumC852910Xd3.INPUT_PHONE_MODIFY.getValue());
        }
        verifyEmailBeforeChangeFragment2.fo(bundle);
        C1C7U.LIZIZ("VerifyEmailBeforeChangeFragment@1b24.onValidateCode$1");
    }

    public static final void accept$17(AfS182S0100000_13 afS182S0100000_13, Object obj) {
        C1C7U.LIZ("VerifyEmailBeforeChangeFragment@1b24.onValidateCode$2");
        ((VerifyEmailBeforeChangeFragment) afS182S0100000_13.l0).RS(C0XWH.LIZ((Throwable) obj), false);
        C1C7U.LIZIZ("VerifyEmailBeforeChangeFragment@1b24.onValidateCode$2");
    }

    public static final void accept$18(AfS182S0100000_13 afS182S0100000_13, Object obj) {
        View rootView;
        C1C7U.LIZ("VerifyEmailForTicketFragment@66a0.onValidateCode$1");
        C853660XeG c853660XeG = C853660XeG.LIZ;
        VerifyEmailForTicketFragment verifyEmailForTicketFragment = (VerifyEmailForTicketFragment) afS182S0100000_13.l0;
        EnumC1237100iIW enumC1237100iIW = verifyEmailForTicketFragment.LLLLLIL;
        boolean z = verifyEmailForTicketFragment.LLLLL;
        c853660XeG.getClass();
        C853660XeG.LJFF(enumC1237100iIW, z);
        C0XQ5.LIZJ().setEmailVerified(true);
        Bundle bundle = new Bundle();
        C786410Ut5.LJJJI("platform", "email", bundle);
        C852810Xct c852810Xct = C852810Xct.LIZ;
        String str = ((C849670XUv) obj).LJIIIZ;
        c852810Xct.getClass();
        C852810Xct.LJIJJ(bundle, str);
        C786410Ut5.LJJIIZI(((VerifyEmailForTicketFragment) afS182S0100000_13.l0).getArguments(), bundle, "final_data");
        View view = ((VerifyEmailForTicketFragment) afS182S0100000_13.l0).getView();
        if (view != null && (rootView = view.getRootView()) != null) {
            KeyboardUtils.LIZIZ(rootView);
        }
        VerifyEmailForTicketFragment verifyEmailForTicketFragment2 = (VerifyEmailForTicketFragment) afS182S0100000_13.l0;
        verifyEmailForTicketFragment2.WR(verifyEmailForTicketFragment2.getArguments());
        C1C7U.LIZIZ("VerifyEmailForTicketFragment@66a0.onValidateCode$1");
    }

    public static final void accept$19(AfS182S0100000_13 afS182S0100000_13, Object obj) {
        C1C7U.LIZ("VerifyEmailForTicketFragment@66a0.resendCode$1");
        ((VerifyEmailForTicketFragment) afS182S0100000_13.l0).oT();
        C1C7U.LIZIZ("VerifyEmailForTicketFragment@66a0.resendCode$1");
    }

    public static final void accept$2(AfS182S0100000_13 afS182S0100000_13, Object obj) {
        C1C7U.LIZ("ChangeEmailConflictHandler@22be.handle$1");
        ((C852020Xbc) afS182S0100000_13.l0).LIZIZ(true);
        C1C7U.LIZIZ("ChangeEmailConflictHandler@22be.handle$1");
    }

    public static final void accept$20(AfS182S0100000_13 afS182S0100000_13, Object obj) {
        View rootView;
        C1C7U.LIZ("VerifyPhoneForTicketFragment@e23f.onValidateCode$1");
        C853660XeG c853660XeG = C853660XeG.LIZ;
        VerifyPhoneForTicketFragment verifyPhoneForTicketFragment = (VerifyPhoneForTicketFragment) afS182S0100000_13.l0;
        EnumC1237100iIW enumC1237100iIW = verifyPhoneForTicketFragment.LLLLLIL;
        boolean z = verifyPhoneForTicketFragment.LLLLL;
        c853660XeG.getClass();
        C853660XeG.LJFF(enumC1237100iIW, z);
        Bundle bundle = new Bundle();
        C786410Ut5.LJJJI("platform", "phone", bundle);
        C852810Xct c852810Xct = C852810Xct.LIZ;
        String str = ((C850410XXr) obj).LJIIIZ;
        c852810Xct.getClass();
        C852810Xct.LJIJJ(bundle, str);
        C786410Ut5.LJJIIZI(((VerifyPhoneForTicketFragment) afS182S0100000_13.l0).getArguments(), bundle, "final_data");
        View view = ((VerifyPhoneForTicketFragment) afS182S0100000_13.l0).getView();
        if (view != null && (rootView = view.getRootView()) != null) {
            KeyboardUtils.LIZIZ(rootView);
        }
        VerifyPhoneForTicketFragment verifyPhoneForTicketFragment2 = (VerifyPhoneForTicketFragment) afS182S0100000_13.l0;
        verifyPhoneForTicketFragment2.WR(verifyPhoneForTicketFragment2.getArguments());
        C1C7U.LIZIZ("VerifyPhoneForTicketFragment@e23f.onValidateCode$1");
    }

    public static final void accept$21(AfS182S0100000_13 afS182S0100000_13, Object obj) {
        C1C7U.LIZ("NetworkHelper@8b8f.quickLoginWithSelectionTicket$3");
        C852170Xbr c852170Xbr = C852170Xbr.LIZ;
        int errorCode = ((C0XZJ) ((Throwable) obj)).getErrorCode();
        BaseAccountFlowFragment mobParams = ((C0XYD) afS182S0100000_13.l0).getMobParams();
        Map mapLIZJ = C2097908Jt.LIZJ(new Pair("enter_type", "org_account_selection_process"));
        c852170Xbr.getClass();
        C852170Xbr.LJIIIIZZ(false, errorCode, "sms_verification", mobParams, mapLIZJ);
        C1C7U.LIZIZ("NetworkHelper@8b8f.quickLoginWithSelectionTicket$3");
    }

    public static final void accept$22(AfS182S0100000_13 afS182S0100000_13, Object obj) {
        C1C7U.LIZ("NetworkHelper@8b8f.bindEmail$2");
        C851430Xaf.LJI(0, ((C0XYD) afS182S0100000_13.l0).getMobParams().LJJLIIIJJI(), null, ((C0XYD) afS182S0100000_13.l0).getMobParams().LLIIJI(), null);
        C851430Xaf.LIZ(0, ((C0XYD) afS182S0100000_13.l0).getMobParams().LJJLIIIJJI(), ((C0XYD) afS182S0100000_13.l0).getMobParams().LLIIJI(), "email", null);
        C1C7U.LIZIZ("NetworkHelper@8b8f.bindEmail$2");
    }

    public static final void accept$23(AfS182S0100000_13 afS182S0100000_13, Object obj) {
        C1C7U.LIZ("NetworkHelper@8b8f.checkEmailRegister$2");
        BaseAccountFlowFragment mobParams = ((C0XYD) afS182S0100000_13.l0).getMobParams();
        C853660XeG c853660XeG = C853660XeG.LIZ;
        Integer numValueOf = Integer.valueOf(((C0XZJ) ((Throwable) obj)).getErrorCode());
        String strLLIIJI = mobParams.LLIIJI();
        String strLJJLIIIJJI = mobParams.LJJLIIIJJI();
        String strPR = mobParams.PR();
        c853660XeG.getClass();
        C853660XeG.LJII(strLLIIJI, numValueOf, strLJJLIIIJJI, "email", null, strPR, null);
        C1C7U.LIZIZ("NetworkHelper@8b8f.checkEmailRegister$2");
    }

    public static final void accept$24(AfS182S0100000_13 afS182S0100000_13, Object obj) {
        C1C7U.LIZ("NetworkHelper@8b8f.bindEmail$3");
        C0XZJ c0xzj = (C0XZJ) ((Throwable) obj);
        C851430Xaf.LJI(c0xzj.getErrorCode(), ((C0XYD) afS182S0100000_13.l0).getMobParams().LJJLIIIJJI(), c0xzj.getErrorMsg(), ((C0XYD) afS182S0100000_13.l0).getMobParams().LLIIJI(), null);
        C851430Xaf.LIZ(c0xzj.getErrorCode(), ((C0XYD) afS182S0100000_13.l0).getMobParams().LJJLIIIJJI(), ((C0XYD) afS182S0100000_13.l0).getMobParams().LLIIJI(), "email", null);
        C1C7U.LIZIZ("NetworkHelper@8b8f.bindEmail$3");
    }

    public static final void accept$25(AfS182S0100000_13 afS182S0100000_13, Object obj) {
        C1C7U.LIZ("NetworkHelperKt@edab.request$4");
        ((C0XYD) afS182S0100000_13.l0).dk(1);
        C1C7U.LIZIZ("NetworkHelperKt@edab.request$4");
    }

    public static final void accept$26(AfS182S0100000_13 afS182S0100000_13, Object obj) {
        C0XZJ c0xzj;
        Integer numValueOf;
        C1C7U.LIZ("NetworkHelper@8b8f.preCheckOrg$3");
        Throwable th = (Throwable) obj;
        if (!(th instanceof C0XZJ) || (c0xzj = (C0XZJ) th) == null || (numValueOf = Integer.valueOf(c0xzj.getErrorCode())) == null || numValueOf.intValue() != 8039) {
            ((C0XYD) afS182S0100000_13.l0).dk(2);
            C853660XeG c853660XeG = C853660XeG.LIZ;
            String strLLIIJI = ((C0XYD) afS182S0100000_13.l0).getMobParams().LLIIJI();
            String strLJJLIIIJJI = ((C0XYD) afS182S0100000_13.l0).getMobParams().LJJLIIIJJI();
            String strPR = ((C0XYD) afS182S0100000_13.l0).getMobParams().PR();
            c853660XeG.getClass();
            C853660XeG.LIZLLL(false, strLLIIJI, "email", 0, strLJJLIIIJJI, strPR, null, null, null, null);
        }
        C1C7U.LIZIZ("NetworkHelper@8b8f.preCheckOrg$3");
    }

    public static final void accept$27(AfS182S0100000_13 afS182S0100000_13, Object obj) {
        C1C7U.LIZ("NetworkHelper@8b8f.verifyAccountPassword$2");
        C852170Xbr c852170Xbr = C852170Xbr.LIZ;
        C0XZ4.LIZ.getClass();
        C852170Xbr.LJIILLIIL(c852170Xbr, true, ((C0XYD) afS182S0100000_13.l0).getMobParams().LJJLIIIJJI(), ((C0XYD) afS182S0100000_13.l0).getMobParams().LLIIJI());
        C1C7U.LIZIZ("NetworkHelper@8b8f.verifyAccountPassword$2");
    }

    public static final void accept$28(AfS182S0100000_13 afS182S0100000_13, Object obj) {
        C1C7U.LIZ("NetworkHelper@8b8f.verifyAccountPassword$3");
        C852170Xbr c852170Xbr = C852170Xbr.LIZ;
        C0XZ4.LIZ.getClass();
        C852170Xbr.LJIILLIIL(c852170Xbr, false, ((C0XYD) afS182S0100000_13.l0).getMobParams().LJJLIIIJJI(), ((C0XYD) afS182S0100000_13.l0).getMobParams().LLIIJI());
        C1C7U.LIZIZ("NetworkHelper@8b8f.verifyAccountPassword$3");
    }

    public static final void accept$29(AfS182S0100000_13 afS182S0100000_13, Object obj) {
        C1C7U.LIZ("NetworkHelper@8b8f.verifyMobilePassword$2");
        C852170Xbr c852170Xbr = C852170Xbr.LIZ;
        C0XZ4.LIZ.getClass();
        C852170Xbr.LJIILLIIL(c852170Xbr, true, ((C0XYD) afS182S0100000_13.l0).getMobParams().LJJLIIIJJI(), ((C0XYD) afS182S0100000_13.l0).getMobParams().LLIIJI());
        C1C7U.LIZIZ("NetworkHelper@8b8f.verifyMobilePassword$2");
    }

    public static final void accept$3(AfS182S0100000_13 afS182S0100000_13, Object obj) {
        C1C7U.LIZ("VerifyDeviceHandler@c5b9.handle$2");
        C851150XaD c851150XaD = (C851150XaD) afS182S0100000_13.l0;
        C0XYD c0xyd = c851150XaD.LIZIZ;
        Bundle arguments = c851150XaD.LIZ.getArguments();
        if (arguments == null) {
            arguments = new Bundle();
        }
        arguments.putInt("next_page", EnumC852910Xd3.PHONE_SMS_LOGIN.getValue());
        arguments.putBoolean("code_sent", true);
        arguments.putBoolean("bind_secure", true);
        c0xyd.fo(arguments);
        C1C7U.LIZIZ("VerifyDeviceHandler@c5b9.handle$2");
    }

    public static final void accept$30(AfS182S0100000_13 afS182S0100000_13, Object obj) {
        C1C7U.LIZ("NetworkHelper@8b8f.emailLoginWithLoginSelectionTicket$3");
        C852170Xbr c852170Xbr = C852170Xbr.LIZ;
        int errorCode = ((C0XZJ) ((Throwable) obj)).getErrorCode();
        BaseAccountFlowFragment mobParams = ((C0XYD) afS182S0100000_13.l0).getMobParams();
        Map mapLIZJ = C2097908Jt.LIZJ(new Pair("enter_type", "org_account_selection_process"));
        c852170Xbr.getClass();
        C852170Xbr.LJIIIIZZ(false, errorCode, "email", mobParams, mapLIZJ);
        C1C7U.LIZIZ("NetworkHelper@8b8f.emailLoginWithLoginSelectionTicket$3");
    }

    public static final void accept$31(AfS182S0100000_13 afS182S0100000_13, Object obj) {
        C1C7U.LIZ("ForceVerifyPhoneInputCodeFragment@468e.onValidateCode$1");
        C853660XeG c853660XeG = C853660XeG.LIZ;
        ForceVerifyPhoneInputCodeFragment forceVerifyPhoneInputCodeFragment = (ForceVerifyPhoneInputCodeFragment) afS182S0100000_13.l0;
        EnumC1237100iIW enumC1237100iIW = forceVerifyPhoneInputCodeFragment.LLLLLIL;
        boolean z = forceVerifyPhoneInputCodeFragment.LLLLL;
        c853660XeG.getClass();
        C853660XeG.LJFF(enumC1237100iIW, z);
        C1C7U.LIZIZ("ForceVerifyPhoneInputCodeFragment@468e.onValidateCode$1");
    }

    public static final void accept$32(AfS182S0100000_13 afS182S0100000_13, Object obj) {
        C1C7U.LIZ("ForceVerifyPhoneInputCodeFragment@468e.resendCode$1");
        ((ForceVerifyPhoneInputCodeFragment) afS182S0100000_13.l0).oT();
        C1C7U.LIZIZ("ForceVerifyPhoneInputCodeFragment@468e.resendCode$1");
    }

    public static final void accept$33(AfS182S0100000_13 afS182S0100000_13, Object obj) {
        C1C7U.LIZ("InputCodeFragment@cfdb.onInputComplete$9$1");
        C0XT7 c0xt7 = (C0XT7) obj;
        C853660XeG c853660XeG = C853660XeG.LIZ;
        EnumC1237100iIW enumC1237100iIWLT = ((InputCodeFragment) afS182S0100000_13.l0).lT();
        boolean z = ((InputCodeFragment) afS182S0100000_13.l0).LLLLLZIL;
        c853660XeG.getClass();
        C853660XeG.LJFF(enumC1237100iIWLT, z);
        C854460XfY c854460XfY = C854460XfY.LIZ;
        InputCodeFragment inputCodeFragment = (InputCodeFragment) afS182S0100000_13.l0;
        String enterFrom = inputCodeFragment.getEnterFrom();
        String enterMethod = ((InputCodeFragment) afS182S0100000_13.l0).getEnterMethod();
        String strValueOf = String.valueOf(c0xt7.LJIIIZ.LIZIZ);
        String strRR = ((InputCodeFragment) afS182S0100000_13.l0).RR();
        c854460XfY.getClass();
        C854460XfY.LJIILLIIL(inputCodeFragment, true, enterFrom, enterMethod, strValueOf, 1, false, strRR);
        C0XYO c0xyo = C0XYO.LIZ;
        C852810Xct c852810Xct = C852810Xct.LIZ;
        InputCodeFragment inputCodeFragment2 = (InputCodeFragment) afS182S0100000_13.l0;
        c852810Xct.getClass();
        PhoneNumberUtil.PhoneNumber phoneNumberLJI = C852810Xct.LJI(inputCodeFragment2);
        InputCodeFragment inputCodeFragment3 = (InputCodeFragment) afS182S0100000_13.l0;
        C850330XXj c850330XXj = (C850330XXj) c0xt7.LJIIIZ;
        c0xyo.getClass();
        C0XYO.LJ(phoneNumberLJI, inputCodeFragment3, c850330XXj);
        C1C7U.LIZIZ("InputCodeFragment@cfdb.onInputComplete$9$1");
    }

    public static final void accept$34(AfS182S0100000_13 afS182S0100000_13, Object obj) {
        C1C7U.LIZ("InputCodeFragment@cfdb.onInputComplete$9$2");
        C854460XfY c854460XfY = C854460XfY.LIZ;
        InputCodeFragment inputCodeFragment = (InputCodeFragment) afS182S0100000_13.l0;
        String enterFrom = inputCodeFragment.getEnterFrom();
        String enterMethod = ((InputCodeFragment) afS182S0100000_13.l0).getEnterMethod();
        String strValueOf = String.valueOf(C0XWH.LIZ((Throwable) obj));
        String strRR = ((InputCodeFragment) afS182S0100000_13.l0).RR();
        c854460XfY.getClass();
        C854460XfY.LJIILLIIL(inputCodeFragment, true, enterFrom, enterMethod, strValueOf, 0, false, strRR);
        C1C7U.LIZIZ("InputCodeFragment@cfdb.onInputComplete$9$2");
    }

    public static final void accept$35(AfS182S0100000_13 afS182S0100000_13, Object obj) {
        String str;
        C1C7U.LIZ("InputCodeFragment@cfdb.onInputComplete$10$1");
        C853660XeG c853660XeG = C853660XeG.LIZ;
        EnumC1237100iIW enumC1237100iIWLT = ((InputCodeFragment) afS182S0100000_13.l0).lT();
        boolean z = ((InputCodeFragment) afS182S0100000_13.l0).LLLLLZIL;
        c853660XeG.getClass();
        C853660XeG.LJFF(enumC1237100iIWLT, z);
        InputCodeFragment inputCodeFragment = (InputCodeFragment) afS182S0100000_13.l0;
        C0XZG c0xzg = (C0XZG) ((C0XT7) obj).LJIIIZ;
        inputCodeFragment.getClass();
        User userLIZJ = C0XQ5.LIZJ();
        if (c0xzg != null) {
            C0XO4 c0xo4 = (C0XO4) ((HashMap) c0xzg.LJIIJ.LIZLLL).get("mobile");
            if (c0xo4 != null) {
                str = c0xo4.LLILLL;
            } else {
                str = "";
            }
            Bundle arguments = inputCodeFragment.getArguments();
            if (arguments == null || !arguments.getBoolean("is_mandatory_two_sv", false)) {
                userLIZJ.setPhoneBinded(true);
                userLIZJ.setBindPhone(str);
                if (c0xzg.LJIIJ.LIZ > 0) {
                    C0XQ5.LIZ().LJJLL(c0xzg.LJIIJ, null, false);
                }
            }
            if (str != null) {
                C0XQ5.LJIIJJI(7, 1, new C851860XbM(str, C786410Ut5.J3(c0xzg.LJIIJ.LJJII)));
            }
        }
        if (((InputCodeFragment) afS182S0100000_13.l0).rS() || Intrinsics.LJFF(((InputCodeFragment) afS182S0100000_13.l0).getEnterMethod(), "click_change")) {
            Bundle arguments2 = ((InputCodeFragment) afS182S0100000_13.l0).getArguments();
            if (arguments2 != null) {
                arguments2.putBoolean("show_3p_bind_phone_success_toast", true);
            }
            Bundle bundle = new Bundle();
            InputCodeFragment inputCodeFragment2 = (InputCodeFragment) afS182S0100000_13.l0;
            inputCodeFragment2.JS(bundle);
            Bundle arguments3 = inputCodeFragment2.getArguments();
            if (arguments3 != null) {
                C786410Ut5.LJJIIZI(arguments3, bundle, "final_data");
            }
        }
        C0XYO c0xyo = C0XYO.LIZ;
        InputCodeFragment inputCodeFragment3 = (InputCodeFragment) afS182S0100000_13.l0;
        c0xyo.getClass();
        Bundle arguments4 = inputCodeFragment3.getArguments();
        if (arguments4 == null) {
            arguments4 = new Bundle();
        }
        inputCodeFragment3.WR(arguments4);
        C1C7U.LIZIZ("InputCodeFragment@cfdb.onInputComplete$10$1");
    }

    public static final void accept$36(AfS182S0100000_13 afS182S0100000_13, Object obj) {
        C1C7U.LIZ("InputCodeFragment@cfdb.onInputComplete$11");
        C850410XXr c850410XXr = (C850410XXr) obj;
        C853660XeG c853660XeG = C853660XeG.LIZ;
        EnumC1237100iIW enumC1237100iIWLT = ((InputCodeFragment) afS182S0100000_13.l0).lT();
        boolean z = ((InputCodeFragment) afS182S0100000_13.l0).LLLLLZIL;
        c853660XeG.getClass();
        C853660XeG.LJFF(enumC1237100iIWLT, z);
        ((InputCodeFragment) afS182S0100000_13.l0).RS(0, true);
        InputCodeFragment inputCodeFragment = (InputCodeFragment) afS182S0100000_13.l0;
        Bundle arguments = inputCodeFragment.getArguments();
        if (arguments == null) {
            arguments = new Bundle();
        }
        InputCodeFragment inputCodeFragment2 = (InputCodeFragment) afS182S0100000_13.l0;
        C854460XfY.LIZ.getClass();
        if (C123100dR.LIZ(C854460XfY.LJIIJ(inputCodeFragment2))) {
            C852810Xct.LIZ.getClass();
            C852810Xct.LJIIZILJ(inputCodeFragment2, "");
            C852810Xct.LJIJI(inputCodeFragment2.getArguments(), "");
            int i = C852640Xcc.LIZ[inputCodeFragment2.SR().ordinal()];
            if (i != 1) {
                if (i == 2) {
                    arguments.putInt("next_page", EnumC852910Xd3.INPUT_EMAIL_CHANGE.getValue());
                } else {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Unknown scene [");
                    sbLIZ.append(inputCodeFragment2.SR());
                    sbLIZ.append("] while validating code");
                    throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ));
                }
            } else {
                arguments.putInt("next_page", EnumC852910Xd3.INPUT_PHONE_MODIFY.getValue());
            }
        } else {
            arguments.putInt("next_page", EnumC852910Xd3.INPUT_PHONE_MODIFY.getValue());
            C786410Ut5.LJJJI("ticket", c850410XXr.LJIIIZ, arguments);
        }
        inputCodeFragment.fo(arguments);
        C1C7U.LIZIZ("InputCodeFragment@cfdb.onInputComplete$11");
    }

    public static final void accept$37(AfS182S0100000_13 afS182S0100000_13, Object obj) {
        C1C7U.LIZ("InputCodeFragment@cfdb.onInputComplete$12");
        ((InputCodeFragment) afS182S0100000_13.l0).RS(C0XWH.LIZ((Throwable) obj), false);
        C1C7U.LIZIZ("InputCodeFragment@cfdb.onInputComplete$12");
    }

    public static final void accept$38(AfS182S0100000_13 afS182S0100000_13, Object obj) {
        C1C7U.LIZ("InputCodeFragment@cfdb.onInputComplete$13");
        C0XT7 c0xt7 = (C0XT7) obj;
        C853660XeG c853660XeG = C853660XeG.LIZ;
        EnumC1237100iIW enumC1237100iIWLT = ((InputCodeFragment) afS182S0100000_13.l0).lT();
        boolean z = ((InputCodeFragment) afS182S0100000_13.l0).LLLLLZIL;
        c853660XeG.getClass();
        C853660XeG.LJFF(enumC1237100iIWLT, z);
        C854460XfY c854460XfY = C854460XfY.LIZ;
        InputCodeFragment inputCodeFragment = (InputCodeFragment) afS182S0100000_13.l0;
        String enterFrom = inputCodeFragment.getEnterFrom();
        String enterMethod = ((InputCodeFragment) afS182S0100000_13.l0).getEnterMethod();
        String strValueOf = String.valueOf(c0xt7.LJIIIZ.LIZIZ);
        String strRR = ((InputCodeFragment) afS182S0100000_13.l0).RR();
        c854460XfY.getClass();
        C854460XfY.LJIILLIIL(inputCodeFragment, true, enterFrom, enterMethod, strValueOf, 1, false, strRR);
        C0XYO c0xyo = C0XYO.LIZ;
        C852810Xct c852810Xct = C852810Xct.LIZ;
        InputCodeFragment inputCodeFragment2 = (InputCodeFragment) afS182S0100000_13.l0;
        c852810Xct.getClass();
        PhoneNumberUtil.PhoneNumber phoneNumberLJI = C852810Xct.LJI(inputCodeFragment2);
        InputCodeFragment inputCodeFragment3 = (InputCodeFragment) afS182S0100000_13.l0;
        C850330XXj c850330XXj = (C850330XXj) c0xt7.LJIIIZ;
        c0xyo.getClass();
        C0XYO.LJ(phoneNumberLJI, inputCodeFragment3, c850330XXj);
        C1C7U.LIZIZ("InputCodeFragment@cfdb.onInputComplete$13");
    }

    public static final void accept$39(AfS182S0100000_13 afS182S0100000_13, Object obj) {
        C1C7U.LIZ("InputCodeFragment@cfdb.onInputComplete$14");
        C854460XfY c854460XfY = C854460XfY.LIZ;
        InputCodeFragment inputCodeFragment = (InputCodeFragment) afS182S0100000_13.l0;
        String enterFrom = inputCodeFragment.getEnterFrom();
        String enterMethod = ((InputCodeFragment) afS182S0100000_13.l0).getEnterMethod();
        String strValueOf = String.valueOf(C0XWH.LIZ((Throwable) obj));
        String strRR = ((InputCodeFragment) afS182S0100000_13.l0).RR();
        c854460XfY.getClass();
        C854460XfY.LJIILLIIL(inputCodeFragment, true, enterFrom, enterMethod, strValueOf, 0, false, strRR);
        C1C7U.LIZIZ("InputCodeFragment@cfdb.onInputComplete$14");
    }

    public static final void accept$4(AfS182S0100000_13 afS182S0100000_13, Object obj) {
        C1C7U.LIZ("MultiLiveAsAnchorListDialogV2@77b0.onCreate$3");
        C500260Jjc.LJJLIIIJL((MultiLiveAsAnchorListDialogV2) afS182S0100000_13.l0);
        C1C7U.LIZIZ("MultiLiveAsAnchorListDialogV2@77b0.onCreate$3");
    }

    public static final void accept$40(AfS182S0100000_13 afS182S0100000_13, Object obj) {
        C1C7U.LIZ("InputCodeFragment@cfdb.onInputComplete$1");
        C850920XZq c850920XZq = (C850920XZq) obj;
        if (c850920XZq.LJIIIZ != null) {
            C853660XeG c853660XeG = C853660XeG.LIZ;
            EnumC1237100iIW enumC1237100iIWLT = ((InputCodeFragment) afS182S0100000_13.l0).lT();
            boolean z = ((InputCodeFragment) afS182S0100000_13.l0).LLLLLZIL;
            c853660XeG.getClass();
            C853660XeG.LJFF(enumC1237100iIWLT, z);
            C0XYO c0xyo = C0XYO.LIZ;
            InputCodeFragment inputCodeFragment = (InputCodeFragment) afS182S0100000_13.l0;
            EnumC852660Xce enumC852660XceSR = inputCodeFragment.SR();
            EnumC852910Xd3 enumC852910Xd3VR = ((InputCodeFragment) afS182S0100000_13.l0).VR();
            C0XO3 c0xo3 = c850920XZq.LJIIIZ;
            c0xyo.getClass();
            C0XYO.LIZJ(inputCodeFragment, inputCodeFragment, enumC852660XceSR, enumC852910Xd3VR, null, c0xo3);
        }
        C1C7U.LIZIZ("InputCodeFragment@cfdb.onInputComplete$1");
    }

    public static final void accept$41(AfS182S0100000_13 afS182S0100000_13, Object obj) {
        Boolean boolValueOf;
        C1C7U.LIZ("InputCodeFragment@cfdb.onInputComplete$3");
        C850340XXk c850340XXk = (C850340XXk) obj;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("InputCodeFragment.quickLoginOnly(check: ");
        C0HZQ c0hzq = ((InputCodeFragment) afS182S0100000_13.l0).LLLLLL;
        if (c0hzq != null) {
            boolValueOf = Boolean.valueOf(c0hzq.isChecked());
        } else {
            boolValueOf = null;
        }
        sbLIZ.append(boolValueOf);
        sbLIZ.append(") success!");
        C2188811AlT.LIZIZ(sbLIZ);
        InputCodeFragment inputCodeFragment = (InputCodeFragment) afS182S0100000_13.l0;
        if (inputCodeFragment.LLLLIILLL) {
            ((C854410XfT) inputCodeFragment.LLLLLZL.getValue()).LIZ(true);
        }
        C852810Xct c852810Xct = C852810Xct.LIZ;
        InputCodeFragment inputCodeFragment2 = (InputCodeFragment) afS182S0100000_13.l0;
        c852810Xct.getClass();
        PhoneNumberUtil.PhoneNumber phoneNumberLJI = C852810Xct.LJI(inputCodeFragment2);
        if (phoneNumberLJI != null) {
            C813020Vuu.LJIIL().LJIIJJI(((InputCodeFragment) afS182S0100000_13.l0).getContext(), "country", phoneNumberLJI.getCountryIso());
        }
        if (c850340XXk.LJIIIZ != null) {
            C853660XeG c853660XeG = C853660XeG.LIZ;
            EnumC1237100iIW enumC1237100iIWLT = ((InputCodeFragment) afS182S0100000_13.l0).lT();
            boolean z = ((InputCodeFragment) afS182S0100000_13.l0).LLLLLZIL;
            c853660XeG.getClass();
            C853660XeG.LJFF(enumC1237100iIWLT, z);
            EnumC852660Xce enumC852660Xce = EnumC852660Xce.LOGIN;
            C0XYO c0xyo = C0XYO.LIZ;
            InputCodeFragment inputCodeFragment3 = (InputCodeFragment) afS182S0100000_13.l0;
            EnumC852910Xd3 enumC852910Xd3VR = inputCodeFragment3.VR();
            C0XO3 c0xo3 = c850340XXk.LJIIIZ;
            c0xyo.getClass();
            C0XYO.LIZJ(inputCodeFragment3, inputCodeFragment3, enumC852660Xce, enumC852910Xd3VR, null, c0xo3);
        }
        C0XGR c0xgr = new C0XGR();
        c0xgr.LIZIZ(System.currentTimeMillis() - ((InputCodeFragment) afS182S0100000_13.l0).LLLLIILL, "stay_time");
        C20684815ws.LJIILLIIL("input_code_page", c0xgr.LIZ);
        C1C7U.LIZIZ("InputCodeFragment@cfdb.onInputComplete$3");
    }

    public static final void accept$42(AfS182S0100000_13 afS182S0100000_13, Object obj) {
        C1C7U.LIZ("InputCodeFragment@cfdb.onInputComplete$4");
        C849550XUj c849550XUj = (C849550XUj) obj;
        if (c849550XUj.LJIIJ != null) {
            C853660XeG c853660XeG = C853660XeG.LIZ;
            EnumC1237100iIW enumC1237100iIWLT = ((InputCodeFragment) afS182S0100000_13.l0).lT();
            boolean z = ((InputCodeFragment) afS182S0100000_13.l0).LLLLLZIL;
            c853660XeG.getClass();
            C853660XeG.LJFF(enumC1237100iIWLT, z);
            Bundle arguments = ((InputCodeFragment) afS182S0100000_13.l0).getArguments();
            if (arguments != null) {
                arguments.putBoolean("req_verification_email_signup", true);
            }
            C0XYO c0xyo = C0XYO.LIZ;
            InputCodeFragment inputCodeFragment = (InputCodeFragment) afS182S0100000_13.l0;
            EnumC852660Xce enumC852660XceSR = inputCodeFragment.SR();
            EnumC852910Xd3 enumC852910Xd3VR = ((InputCodeFragment) afS182S0100000_13.l0).VR();
            C0XO3 c0xo3 = c849550XUj.LJIIJ;
            c0xyo.getClass();
            C0XYO.LIZJ(inputCodeFragment, inputCodeFragment, enumC852660XceSR, enumC852910Xd3VR, null, c0xo3);
        }
        C1C7U.LIZIZ("InputCodeFragment@cfdb.onInputComplete$4");
    }

    public static final void accept$43(AfS182S0100000_13 afS182S0100000_13, Object obj) {
        C1C7U.LIZ("InputCodeFragment@cfdb.onInputComplete$6");
        C849600XUo c849600XUo = (C849600XUo) obj;
        InputCodeFragment inputCodeFragment = (InputCodeFragment) afS182S0100000_13.l0;
        inputCodeFragment.qT(c849600XUo.LIZLLL, (String) inputCodeFragment.LLLLLLLLLL.getValue(), true);
        C853660XeG c853660XeG = C853660XeG.LIZ;
        EnumC1237100iIW enumC1237100iIWLT = ((InputCodeFragment) afS182S0100000_13.l0).lT();
        boolean z = ((InputCodeFragment) afS182S0100000_13.l0).LLLLLZIL;
        c853660XeG.getClass();
        C853660XeG.LJFF(enumC1237100iIWLT, z);
        InputCodeFragment inputCodeFragment2 = (InputCodeFragment) afS182S0100000_13.l0;
        Bundle arguments = inputCodeFragment2.getArguments();
        if (arguments == null) {
            arguments = new Bundle();
        }
        arguments.putInt("next_page", EnumC852910Xd3.RESET_PASSWORD_FOR_PHONE.getValue());
        C786410Ut5.LJJJI("ticket", c849600XUo.LJIIIZ, arguments);
        inputCodeFragment2.fo(arguments);
        C1C7U.LIZIZ("InputCodeFragment@cfdb.onInputComplete$6");
    }

    public static final void accept$44(AfS182S0100000_13 afS182S0100000_13, Object obj) {
        C1C7U.LIZ("InputCodeFragment@cfdb.onInputComplete$8");
        C849600XUo c849600XUo = (C849600XUo) obj;
        InputCodeFragment inputCodeFragment = (InputCodeFragment) afS182S0100000_13.l0;
        inputCodeFragment.qT(c849600XUo.LIZLLL, (String) inputCodeFragment.LLLLLLLLLL.getValue(), true);
        C853660XeG c853660XeG = C853660XeG.LIZ;
        EnumC1237100iIW enumC1237100iIWLT = ((InputCodeFragment) afS182S0100000_13.l0).lT();
        boolean z = ((InputCodeFragment) afS182S0100000_13.l0).LLLLLZIL;
        c853660XeG.getClass();
        C853660XeG.LJFF(enumC1237100iIWLT, z);
        InputCodeFragment inputCodeFragment2 = (InputCodeFragment) afS182S0100000_13.l0;
        Bundle arguments = inputCodeFragment2.getArguments();
        if (arguments == null) {
            arguments = new Bundle();
        }
        arguments.putInt("next_page", EnumC852910Xd3.RESET_PASSWORD_FOR_EMAIL.getValue());
        C786410Ut5.LJJJI("ticket", c849600XUo.LJIIIZ, arguments);
        inputCodeFragment2.fo(arguments);
        C1C7U.LIZIZ("InputCodeFragment@cfdb.onInputComplete$8");
    }

    public static final void accept$45(AfS182S0100000_13 afS182S0100000_13, Object obj) {
        String strOptString;
        C1C7U.LIZ("InputPasswordFragment@305b.onViewCreated$3$1");
        JSONObject jSONObjectOptJSONObject = ((C0XT7) obj).LJIIIZ.LJ.optJSONObject("data");
        if (jSONObjectOptJSONObject != null) {
            strOptString = jSONObjectOptJSONObject.optString("passport_ticket");
        } else {
            strOptString = null;
        }
        Bundle arguments = ((InputPasswordFragment) afS182S0100000_13.l0).getArguments();
        if (arguments != null) {
            InputPasswordFragment inputPasswordFragment = (InputPasswordFragment) afS182S0100000_13.l0;
            arguments.putBoolean("is_handling_login_after_failed_3p", true);
            inputPasswordFragment.JS(arguments);
        }
        InputPasswordFragment inputPasswordFragment2 = (InputPasswordFragment) afS182S0100000_13.l0;
        if (strOptString == null) {
            strOptString = "";
        }
        C0XZ3.LIZ(inputPasswordFragment2, inputPasswordFragment2, strOptString, "handle", new AwS592S0100000_13(inputPasswordFragment2, 30));
        C1C7U.LIZIZ("InputPasswordFragment@305b.onViewCreated$3$1");
    }

    public static final void accept$46(AfS182S0100000_13 afS182S0100000_13, Object obj) {
        C1C7U.LIZ("PhoneNon1pBindFragment@bc3a.onValidateCode$1");
        C853660XeG c853660XeG = C853660XeG.LIZ;
        PhoneNon1pBindFragment phoneNon1pBindFragment = (PhoneNon1pBindFragment) afS182S0100000_13.l0;
        EnumC1237100iIW enumC1237100iIW = phoneNon1pBindFragment.LLLLLIL;
        boolean z = phoneNon1pBindFragment.LLLLL;
        c853660XeG.getClass();
        C853660XeG.LJFF(enumC1237100iIW, z);
        List<InterfaceC586170Myt> list = C0XQ5.LIZ;
        C1233040iBy c1233040iBy = new C1233040iBy(C0XPY.LIZIZ);
        c1233040iBy.LIZJ(((PhoneNon1pBindFragment) afS182S0100000_13.l0).getString(2131829533));
        c1233040iBy.LIZLLL();
        Bundle bundle = new Bundle();
        PhoneNon1pBindFragment phoneNon1pBindFragment2 = (PhoneNon1pBindFragment) afS182S0100000_13.l0;
        phoneNon1pBindFragment2.JS(bundle);
        Bundle arguments = phoneNon1pBindFragment2.getArguments();
        if (arguments != null) {
            C786410Ut5.LJJIIZI(arguments, bundle, "final_data");
        }
        PhoneNon1pBindFragment phoneNon1pBindFragment3 = (PhoneNon1pBindFragment) afS182S0100000_13.l0;
        Bundle arguments2 = phoneNon1pBindFragment3.getArguments();
        if (arguments2 == null) {
            arguments2 = new Bundle();
        }
        phoneNon1pBindFragment3.WR(arguments2);
        C1C7U.LIZIZ("PhoneNon1pBindFragment@bc3a.onValidateCode$1");
    }

    public static final void accept$47(AfS182S0100000_13 afS182S0100000_13, Object obj) {
        C1C7U.LIZ("EmailOTPCodeValidationHelper@1f81.handleSignupCodeValidation$3");
        C849550XUj c849550XUj = (C849550XUj) obj;
        C851630Xaz c851630Xaz = C851630Xaz.LIZ;
        BaseAccountFlowFragment baseAccountFlowFragment = (BaseAccountFlowFragment) afS182S0100000_13.l0;
        c851630Xaz.getClass();
        if (c849550XUj.LJIIJ != null) {
            Bundle arguments = baseAccountFlowFragment.getArguments();
            if (arguments != null) {
                arguments.putBoolean("email_otp_signup", true);
            }
            C0XYO c0xyo = C0XYO.LIZ;
            EnumC852660Xce enumC852660XceSR = baseAccountFlowFragment.SR();
            EnumC852910Xd3 enumC852910Xd3LLJJLIIIJLLLLLLLZ = baseAccountFlowFragment.LLJJLIIIJLLLLLLLZ();
            C0XO3 c0xo3 = c849550XUj.LJIIJ;
            c0xyo.getClass();
            C0XYO.LIZJ(baseAccountFlowFragment, baseAccountFlowFragment, enumC852660XceSR, enumC852910Xd3LLJJLIIIJLLLLLLLZ, null, c0xo3);
            if (C0XX7.LIZ()) {
                C0XX7.LIZ = null;
            }
        }
        C1C7U.LIZIZ("EmailOTPCodeValidationHelper@1f81.handleSignupCodeValidation$3");
    }

    public static final void accept$48(AfS182S0100000_13 afS182S0100000_13, Object obj) {
        C1C7U.LIZ("OneClickLoginService@601d.enableCloudToken$disposable$1");
        String strOptString = ((C846060XGy) obj).LJIILJJIL.optString("cloud_token");
        if (C123100dR.LIZ(strOptString)) {
            ((Function1) afS182S0100000_13.l0).invoke(strOptString);
        }
        C1C7U.LIZIZ("OneClickLoginService@601d.enableCloudToken$disposable$1");
    }

    public static final void accept$49(AfS182S0100000_13 afS182S0100000_13, Object obj) {
        C1C7U.LIZ("OneClickLoginService@601d.enableCloudToken$disposable$2");
        ((Function1) afS182S0100000_13.l0).invoke(Integer.valueOf(((C0XZJ) ((Throwable) obj)).getErrorCode()));
        C1C7U.LIZIZ("OneClickLoginService@601d.enableCloudToken$disposable$2");
    }

    public static final void accept$5(AfS182S0100000_13 afS182S0100000_13, Object obj) {
        C1C7U.LIZ("UpdateAttributionHook@fb30.run$2");
        ((C11NJ) afS182S0100000_13.l0).LJ();
        C1C7U.LIZIZ("UpdateAttributionHook@fb30.run$2");
    }

    public static final void accept$50(AfS182S0100000_13 afS182S0100000_13, Object obj) {
        C1C7U.LIZ("BaseUpdatePasswordFragment@1cae.onSubmit$4");
        if (((BaseUpdatePasswordFragment) afS182S0100000_13.l0).VR() == EnumC852910Xd3.CREATE_PASSWORD_FOR_1P) {
            Bundle arguments = ((BaseUpdatePasswordFragment) afS182S0100000_13.l0).getArguments();
            if (arguments == null) {
                arguments = new Bundle();
            }
            Bundle bundle = new Bundle();
            ((BaseUpdatePasswordFragment) afS182S0100000_13.l0).JS(bundle);
            C786410Ut5.LJJIIZI(arguments, bundle, "final_data");
            ((BaseUpdatePasswordFragment) afS182S0100000_13.l0).WR(arguments);
        } else {
            List<InterfaceC586170Myt> list = C0XQ5.LIZ;
            C1233040iBy c1233040iBy = new C1233040iBy(C0XPY.LIZIZ);
            c1233040iBy.LIZJ(((BaseUpdatePasswordFragment) afS182S0100000_13.l0).getString(2131828506));
            c1233040iBy.LIZLLL();
            ((BaseUpdatePasswordFragment) afS182S0100000_13.l0).requireActivity().finish();
        }
        C1C7U.LIZIZ("BaseUpdatePasswordFragment@1cae.onSubmit$4");
    }

    public static final void accept$51(AfS182S0100000_13 afS182S0100000_13, Object obj) {
        C1C7U.LIZ("EmailCodeChangePwdFragment@f746.onValidateCode$2");
        C853660XeG c853660XeG = C853660XeG.LIZ;
        EmailCodeChangePwdFragment emailCodeChangePwdFragment = (EmailCodeChangePwdFragment) afS182S0100000_13.l0;
        EnumC1237100iIW enumC1237100iIW = emailCodeChangePwdFragment.LLLLLIL;
        boolean z = emailCodeChangePwdFragment.LLLLL;
        c853660XeG.getClass();
        C853660XeG.LJFF(enumC1237100iIW, z);
        C852810Xct c852810Xct = C852810Xct.LIZ;
        EmailCodeChangePwdFragment emailCodeChangePwdFragment2 = (EmailCodeChangePwdFragment) afS182S0100000_13.l0;
        String str = ((C849670XUv) obj).LJIIIZ;
        c852810Xct.getClass();
        C852810Xct.LJIJJ(emailCodeChangePwdFragment2.getArguments(), str);
        EmailCodeChangePwdFragment emailCodeChangePwdFragment3 = (EmailCodeChangePwdFragment) afS182S0100000_13.l0;
        Bundle arguments = emailCodeChangePwdFragment3.getArguments();
        arguments.putInt("next_page", EnumC852910Xd3.CHANGE_PASSWORD.getValue());
        C786410Ut5.LJJJI("platform", "email", arguments);
        emailCodeChangePwdFragment3.fo(arguments);
        C1C7U.LIZIZ("EmailCodeChangePwdFragment@f746.onValidateCode$2");
    }

    public static final void accept$52(AfS182S0100000_13 afS182S0100000_13, Object obj) {
        C1C7U.LIZ("PhoneChangePwdVerifyFragment@9f70.onValidateCode$2");
        C853660XeG c853660XeG = C853660XeG.LIZ;
        PhoneChangePwdVerifyFragment phoneChangePwdVerifyFragment = (PhoneChangePwdVerifyFragment) afS182S0100000_13.l0;
        EnumC1237100iIW enumC1237100iIW = phoneChangePwdVerifyFragment.LLLLLIL;
        boolean z = phoneChangePwdVerifyFragment.LLLLL;
        c853660XeG.getClass();
        C853660XeG.LJFF(enumC1237100iIW, z);
        C852810Xct c852810Xct = C852810Xct.LIZ;
        PhoneChangePwdVerifyFragment phoneChangePwdVerifyFragment2 = (PhoneChangePwdVerifyFragment) afS182S0100000_13.l0;
        String str = ((C850410XXr) obj).LJIIIZ;
        c852810Xct.getClass();
        C852810Xct.LJIJJ(phoneChangePwdVerifyFragment2.getArguments(), str);
        PhoneChangePwdVerifyFragment phoneChangePwdVerifyFragment3 = (PhoneChangePwdVerifyFragment) afS182S0100000_13.l0;
        Bundle arguments = phoneChangePwdVerifyFragment3.getArguments();
        arguments.putInt("next_page", EnumC852910Xd3.CHANGE_PASSWORD.getValue());
        C786410Ut5.LJJJI("platform", "phone", arguments);
        phoneChangePwdVerifyFragment3.fo(arguments);
        C1C7U.LIZIZ("PhoneChangePwdVerifyFragment@9f70.onValidateCode$2");
    }

    public static final void accept$53(AfS182S0100000_13 afS182S0100000_13, Object obj) {
        C1C7U.LIZ("VerifyPasswordFragment@c501.onViewCreated$7$3");
        C0XU3 c0xu3 = (C0XU3) obj;
        VerifyPasswordFragment verifyPasswordFragment = (VerifyPasswordFragment) afS182S0100000_13.l0;
        verifyPasswordFragment.getClass();
        C1233960iDS c1233960iDS = C1233960iDS.LIZ;
        String strGT = verifyPasswordFragment.gT();
        c1233960iDS.getClass();
        C1233960iDS.LJIIL(strGT, "password", true);
        String enterFrom = verifyPasswordFragment.getEnterFrom();
        String enterMethod = verifyPasswordFragment.getEnterMethod();
        String strGT2 = verifyPasswordFragment.gT();
        boolean zIsChecked = verifyPasswordFragment.ZS().isChecked();
        c1233960iDS.getClass();
        C1233960iDS.LJIIIZ(1, null, enterFrom, enterMethod, strGT2, "password", zIsChecked);
        Bundle arguments = ((VerifyPasswordFragment) afS182S0100000_13.l0).getArguments();
        if (arguments != null) {
            Bundle bundle = new Bundle();
            C852810Xct c852810Xct = C852810Xct.LIZ;
            String str = c0xu3.LJIIIZ;
            c852810Xct.getClass();
            C852810Xct.LJIJJ(bundle, str);
            C786410Ut5.LJJIIZI(arguments, bundle, "final_data");
        }
        Bundle arguments2 = ((VerifyPasswordFragment) afS182S0100000_13.l0).getArguments();
        if (arguments2 != null) {
            ((VerifyPasswordFragment) afS182S0100000_13.l0).WR(arguments2);
        }
        C1C7U.LIZIZ("VerifyPasswordFragment@c501.onViewCreated$7$3");
    }

    public static final void accept$54(AfS182S0100000_13 afS182S0100000_13, Object obj) {
        C1C7U.LIZ("VerifyPasswordFragment@c501.onViewCreated$9$2");
        ((VerifyPasswordFragment) afS182S0100000_13.l0).RS(C0XWH.LIZ((Throwable) obj), false);
        C1C7U.LIZIZ("VerifyPasswordFragment@c501.onViewCreated$9$2");
    }

    public static final void accept$55(AfS182S0100000_13 afS182S0100000_13, Object obj) {
        C1C7U.LIZ("TransparentCodeVerificationActivity@cd8d.onCreate$1");
        TransparentCodeVerificationActivity transparentCodeVerificationActivity = (TransparentCodeVerificationActivity) afS182S0100000_13.l0;
        KeyEvent.Callback callbackFindViewById = transparentCodeVerificationActivity.LL;
        if (callbackFindViewById == null) {
            callbackFindViewById = transparentCodeVerificationActivity.findViewById(R.id.nl1);
            transparentCodeVerificationActivity.LL = (C1390130mHL) callbackFindViewById;
        }
        C786410Ut5.LLZ((C1390130mHL) callbackFindViewById, 8);
        List<InterfaceC586170Myt> list = C0XQ5.LIZ;
        C1233040iBy c1233040iBy = new C1233040iBy(C0XPY.LIZIZ);
        c1233040iBy.LIZJ(((TransparentCodeVerificationActivity) afS182S0100000_13.l0).getString(2131850225));
        c1233040iBy.LIZLLL();
        ((TransparentCodeVerificationActivity) afS182S0100000_13.l0).finish();
        C1C7U.LIZIZ("TransparentCodeVerificationActivity@cd8d.onCreate$1");
    }

    public static final void accept$56(AfS182S0100000_13 afS182S0100000_13, Object obj) {
        C1C7U.LIZ("TransparentCodeVerificationActivity@cd8d.onCreate$2");
        ((TransparentCodeVerificationActivity) afS182S0100000_13.l0).LLLLZI();
        C1C7U.LIZIZ("TransparentCodeVerificationActivity@cd8d.onCreate$2");
    }

    public static final void accept$57(AfS182S0100000_13 afS182S0100000_13, Object obj) {
        C1C7U.LIZ("TransparentCodeVerificationActivity@cd8d.onCreate$3");
        List<InterfaceC586170Myt> list = C0XQ5.LIZ;
        C1233040iBy c1233040iBy = new C1233040iBy(C0XPY.LIZIZ);
        c1233040iBy.LIZJ(((TransparentCodeVerificationActivity) afS182S0100000_13.l0).getString(2131850225));
        c1233040iBy.LIZLLL();
        ((TransparentCodeVerificationActivity) afS182S0100000_13.l0).finish();
        C1C7U.LIZIZ("TransparentCodeVerificationActivity@cd8d.onCreate$3");
    }

    public static final void accept$58(AfS182S0100000_13 afS182S0100000_13, Object obj) {
        C1C7U.LIZ("TransparentCodeVerificationActivity@cd8d.onCreate$4");
        ((TransparentCodeVerificationActivity) afS182S0100000_13.l0).LLLLZI();
        C1C7U.LIZIZ("TransparentCodeVerificationActivity@cd8d.onCreate$4");
    }

    public static final void accept$59(AfS182S0100000_13 afS182S0100000_13, Object obj) {
        C1C7U.LIZ("VerifyEmailCodeFragment@e86e.onCreate$2");
        ((VerifyEmailCodeFragment) afS182S0100000_13.l0).oT();
        C1C7U.LIZIZ("VerifyEmailCodeFragment@e86e.onCreate$2");
    }

    public static final void accept$6(AfS182S0100000_13 afS182S0100000_13, Object obj) {
        C1C7U.LIZ("UpdateAttributionHook@fb30.run$3");
        ((C11NJ) afS182S0100000_13.l0).LJ();
        C1C7U.LIZIZ("UpdateAttributionHook@fb30.run$3");
    }

    public static final void accept$60(AfS182S0100000_13 afS182S0100000_13, Object obj) {
        String string;
        String string2;
        String string3;
        String string4;
        String string5;
        String string6;
        C1C7U.LIZ("VerifyEmailCodeFragment@e86e.onValidateCode$1");
        C849670XUv c849670XUv = (C849670XUv) obj;
        C853660XeG c853660XeG = C853660XeG.LIZ;
        VerifyEmailCodeFragment verifyEmailCodeFragment = (VerifyEmailCodeFragment) afS182S0100000_13.l0;
        EnumC1237100iIW enumC1237100iIW = verifyEmailCodeFragment.LLLLLIL;
        boolean z = verifyEmailCodeFragment.LLLLL;
        c853660XeG.getClass();
        C853660XeG.LJFF(enumC1237100iIW, z);
        if (((VerifyEmailCodeFragment) afS182S0100000_13.l0).SR() == EnumC852660Xce.MODIFY_PHONE) {
            VerifyEmailCodeFragment verifyEmailCodeFragment2 = (VerifyEmailCodeFragment) afS182S0100000_13.l0;
            Bundle arguments = verifyEmailCodeFragment2.getArguments();
            if (arguments == null) {
                arguments = new Bundle();
            }
            arguments.putInt("next_page", EnumC852910Xd3.INPUT_PHONE_MODIFY.getValue());
            C786410Ut5.LJJJI("ticket", c849670XUv.LJIIIZ, arguments);
            verifyEmailCodeFragment2.fo(arguments);
        } else {
            C0XQ5.LIZJ().setEmailVerified(true);
            if (((VerifyEmailCodeFragment) afS182S0100000_13.l0).getArguments().getBoolean("show_success_toast", true)) {
                if (((VerifyEmailCodeFragment) afS182S0100000_13.l0).rS()) {
                    string = ((VerifyEmailCodeFragment) afS182S0100000_13.l0).getString(2131850225);
                } else {
                    string = ((VerifyEmailCodeFragment) afS182S0100000_13.l0).getString(2131833860);
                }
                C1233040iBy c1233040iBy = new C1233040iBy(C0XPY.LIZIZ);
                c1233040iBy.LIZJ(string);
                c1233040iBy.LIZLLL();
                Bundle arguments2 = ((VerifyEmailCodeFragment) afS182S0100000_13.l0).getArguments();
                String string7 = null;
                if (arguments2 != null) {
                    string2 = arguments2.getString("enter_from", "");
                } else {
                    string2 = null;
                }
                Bundle arguments3 = ((VerifyEmailCodeFragment) afS182S0100000_13.l0).getArguments();
                if (arguments3 != null) {
                    string3 = arguments3.getString("enter_method", "");
                } else {
                    string3 = null;
                }
                Bundle arguments4 = ((VerifyEmailCodeFragment) afS182S0100000_13.l0).getArguments();
                if (arguments4 != null) {
                    string4 = arguments4.getString("page", "");
                } else {
                    string4 = null;
                }
                C851430Xaf.LIZIZ("email_bind_status", string2, string3, string4, "verified_old_email");
                Bundle arguments5 = ((VerifyEmailCodeFragment) afS182S0100000_13.l0).getArguments();
                if (arguments5 != null) {
                    string5 = arguments5.getString("enter_from", "");
                } else {
                    string5 = null;
                }
                Bundle arguments6 = ((VerifyEmailCodeFragment) afS182S0100000_13.l0).getArguments();
                if (arguments6 != null) {
                    string6 = arguments6.getString("enter_method", "");
                } else {
                    string6 = null;
                }
                Bundle arguments7 = ((VerifyEmailCodeFragment) afS182S0100000_13.l0).getArguments();
                if (arguments7 != null) {
                    string7 = arguments7.getString("page", "");
                }
                C851430Xaf.LIZIZ("email_bind_status", string5, string6, string7, "changed_to_new_email");
            }
            C20684815ws.LJIILLIIL("email_verify_success", new HashMap());
            Bundle bundle = new Bundle();
            C786410Ut5.LJJJI("platform", "email", bundle);
            C852810Xct c852810Xct = C852810Xct.LIZ;
            String str = c849670XUv.LJIIIZ;
            c852810Xct.getClass();
            C852810Xct.LJIJJ(bundle, str);
            ((VerifyEmailCodeFragment) afS182S0100000_13.l0).JS(bundle);
            C786410Ut5.LJJIIZI(((VerifyEmailCodeFragment) afS182S0100000_13.l0).getArguments(), bundle, "final_data");
            VerifyEmailCodeFragment verifyEmailCodeFragment3 = (VerifyEmailCodeFragment) afS182S0100000_13.l0;
            verifyEmailCodeFragment3.WR(verifyEmailCodeFragment3.getArguments());
        }
        C1C7U.LIZIZ("VerifyEmailCodeFragment@e86e.onValidateCode$1");
    }

    public static final void accept$61(AfS182S0100000_13 afS182S0100000_13, Object obj) {
        C1C7U.LIZ("VerifyEmailCodeFragment@e86e.resendCode$1");
        ((VerifyEmailCodeFragment) afS182S0100000_13.l0).oT();
        C1C7U.LIZIZ("VerifyEmailCodeFragment@e86e.resendCode$1");
    }

    public static final void accept$62(AfS182S0100000_13 afS182S0100000_13, Object obj) {
        C1C7U.LIZ("VerifyPhoneFragment@a04b.onValidateCode$1");
        C853660XeG c853660XeG = C853660XeG.LIZ;
        VerifyPhoneFragment verifyPhoneFragment = (VerifyPhoneFragment) afS182S0100000_13.l0;
        EnumC1237100iIW enumC1237100iIW = verifyPhoneFragment.LLLLLIL;
        boolean z = verifyPhoneFragment.LLLLL;
        c853660XeG.getClass();
        C853660XeG.LJFF(enumC1237100iIW, z);
        C852810Xct c852810Xct = C852810Xct.LIZ;
        VerifyPhoneFragment verifyPhoneFragment2 = (VerifyPhoneFragment) afS182S0100000_13.l0;
        String str = ((C850410XXr) obj).LJIIIZ;
        c852810Xct.getClass();
        C852810Xct.LJIJJ(verifyPhoneFragment2.getArguments(), str);
        Bundle arguments = ((VerifyPhoneFragment) afS182S0100000_13.l0).getArguments();
        if (arguments != null) {
            ((VerifyPhoneFragment) afS182S0100000_13.l0).fo(arguments);
        }
        C1C7U.LIZIZ("VerifyPhoneFragment@a04b.onValidateCode$1");
    }

    public static final void accept$63(AfS182S0100000_13 afS182S0100000_13, Object obj) {
        C1C7U.LIZ("InspirationSetting@a510.isCheck$1");
        ((Function1) afS182S0100000_13.l0).invoke(Boolean.valueOf(((InspirationSettingApi.InspirationSetting) obj).isEnabled));
        C1C7U.LIZIZ("InspirationSetting@a510.isCheck$1");
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00be A[PHI: r2
      0x00be: PHI (r2v4 java.lang.String) = (r2v2 java.lang.String), (r2v5 java.lang.String) binds: [B:37:0x00bc, B:35:0x00b9] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void accept$64(Y.AfS182S0100000_13 r7, java.lang.Object r8) {
        /*
            Method dump skipped, instruction units count: 212
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AfS182S0100000_13.accept$64(Y.AfS182S0100000_13, java.lang.Object):void");
    }

    public static final void accept$65(AfS182S0100000_13 afS182S0100000_13, Object obj) {
        C1C7U.LIZ("GoogleCubesService@1ca4.doRequestAndUpdateVideosInfo$2");
        Throwable th = (Throwable) obj;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getVideosInfo() - error: ");
        sbLIZ.append(th.getMessage());
        C2188811AlT.LIZIZ(sbLIZ);
        C0VQD c0vqd = C0VQD.LIZ;
        String message = th.getMessage();
        if (message == null) {
            message = "";
        }
        EnumC1483805rQ enumC1483805rQ = (EnumC1483805rQ) afS182S0100000_13.l0;
        c0vqd.getClass();
        C0VQD.LIZLLL("throwable", message, -1, enumC1483805rQ);
        C1C7U.LIZIZ("GoogleCubesService@1ca4.doRequestAndUpdateVideosInfo$2");
    }

    public static final void accept$66(AfS182S0100000_13 afS182S0100000_13, Object obj) {
        C1C7U.LIZ("PhotoTemplateScene@59f2.showPanel$3");
        String str = (String) obj;
        ((C1428330nGx) afS182S0100000_13.l0).LLLF = str;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("upload pic result: ");
        sbLIZ.append(str);
        C385200F8k.LIZ("PhotoTemplateScene", C2188811AlT.LIZIZ(sbLIZ));
        C1C7U.LIZIZ("PhotoTemplateScene@59f2.showPanel$3");
    }

    public static final void accept$67(AfS182S0100000_13 afS182S0100000_13, Object obj) {
        final LegacyTask legacyTask = (LegacyTask) afS182S0100000_13.l0;
        String str = (String) obj;
        C1C7U.LIZ("LegacyTask@e2e.initAppData$1L");
        if (!TextUtils.equals(legacyTask.LLILLL, str)) {
            legacyTask.LLILLL = str;
            if (!TextUtils.isEmpty(str)) {
                final String strCom_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getServerDeviceId = AppLog.com_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getServerDeviceId();
                if (legacyTask.LLILLJJLI) {
                    if (ComplianceServiceProvider.LJIILJJIL().LJII(null)) {
                        C0WG5 c0wg5LIZ = C0WG5.LIZIZ.LIZ(legacyTask.LL);
                        if (!TextUtils.isEmpty(strCom_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getServerDeviceId)) {
                            C20144713rx c20144713rx = new C20144713rx(939524359);
                            C837720Wte.LIZ("Firebase", "setUserId", c20144713rx, new AwS129S1200000_13(strCom_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getServerDeviceId, c20144713rx, c0wg5LIZ, 3));
                        }
                    } else {
                        ComplianceServiceProvider.LJIILJJIL().LJIIJJI(new AbstractC826920WcE() { // from class: X.0Wc1
                            @Override // X.InterfaceC1915870zxJ
                            public final void LIZ(EnumC1876780ywG enumC1876780ywG) {
                                if (EnumC1876780ywG.APPROVE == enumC1876780ywG) {
                                    LegacyTask legacyTask2 = legacyTask;
                                    String str2 = strCom_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getServerDeviceId;
                                    C0WG5 c0wg5LIZ2 = C0WG5.LIZIZ.LIZ(legacyTask2.LL);
                                    if (!TextUtils.isEmpty(str2)) {
                                        C20144713rx c20144713rx2 = new C20144713rx(939524359);
                                        C837720Wte.LIZ("Firebase", "setUserId", c20144713rx2, new AwS129S1200000_13(str2, c20144713rx2, c0wg5LIZ2, 3));
                                    }
                                    ComplianceServiceProvider.LJIILJJIL().LJIIIZ(this);
                                }
                            }
                        });
                    }
                }
                C807620VmC c807620VmC = C807630VmD.LIZ;
                C827000WcM c827000WcM = c807620VmC.LJII;
                if (c827000WcM != null) {
                    c807620VmC.LIZ(c827000WcM);
                }
                String str2 = legacyTask.LLILLL;
                String strCom_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getInstallId = AppLog.com_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getInstallId();
                if (strCom_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getInstallId == null) {
                    strCom_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getInstallId = "";
                }
                ((ISecApi) ServiceManager.get().getService(ISecApi.class)).updateDeviceIdAndInstallId(str2, strCom_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getInstallId);
                int iLIZ = C826810Wc3.LIZ();
                C844470XAv.LIZ.getClass();
                if (iLIZ != ((int) C844470XAv.LIZIZ())) {
                    ((ISecApi) ServiceManager.get().getService(ISecApi.class)).reportData("install");
                }
                C799900VZk.LIZ.getClass();
                C0CPH c0cph = new C0CPH();
                c0cph.LIZ(new LegacyTask.DeviceIdChangeTask());
                c0cph.LIZIZ();
            }
        }
        C1C7U.LIZIZ("LegacyTask@e2e.initAppData$1L");
    }

    public static final void accept$68(AfS182S0100000_13 afS182S0100000_13, Object obj) {
        KidsModeLegacyTask kidsModeLegacyTask = (KidsModeLegacyTask) afS182S0100000_13.l0;
        String str = (String) obj;
        C1C7U.LIZ("KidsModeLegacyTask@ef0.initAppData$1L");
        if (!TextUtils.equals(kidsModeLegacyTask.LLILLL, str)) {
            kidsModeLegacyTask.LLILLL = str;
            if (!TextUtils.isEmpty(str)) {
                C807620VmC c807620VmC = C807630VmD.LIZ;
                C827000WcM c827000WcM = c807620VmC.LJII;
                if (c827000WcM != null) {
                    c807620VmC.LIZ(c827000WcM);
                }
                String str2 = kidsModeLegacyTask.LLILLL;
                String strCom_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getInstallId = AppLog.com_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getInstallId();
                if (strCom_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getInstallId == null) {
                    strCom_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getInstallId = "";
                }
                ((ISecApi) ServiceManager.get().getService(ISecApi.class)).updateDeviceIdAndInstallId(str2, strCom_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getInstallId);
                int iLIZ = C826810Wc3.LIZ();
                C844470XAv.LIZ.getClass();
                if (iLIZ != ((int) C844470XAv.LIZIZ())) {
                    ((ISecApi) ServiceManager.get().getService(ISecApi.class)).reportData("install");
                }
                C799900VZk.LIZ.getClass();
                C0CPH c0cph = new C0CPH();
                c0cph.LIZ(new KidsModeLegacyTask.DeviceIdChangeTask());
                c0cph.LIZIZ();
            }
        }
        C1C7U.LIZIZ("KidsModeLegacyTask@ef0.initAppData$1L");
    }

    public static final void accept$69(AfS182S0100000_13 afS182S0100000_13, Object obj) {
        C1C7U.LIZ("PumbaaTask@7275.run$3$1");
        if (!((Boolean) obj).booleanValue()) {
            DeviceManagerLancet.LIZLLL((Context) afS182S0100000_13.l0, "foreground");
        }
        C1C7U.LIZIZ("PumbaaTask@7275.run$3$1");
    }

    public static final void accept$7(AfS182S0100000_13 afS182S0100000_13, Object obj) {
        C1C7U.LIZ("BindEmailCodeVerifyFragment@e424.onCreate$1");
        ((BindEmailCodeVerifyFragment) afS182S0100000_13.l0).oT();
        C1C7U.LIZIZ("BindEmailCodeVerifyFragment@e424.onCreate$1");
    }

    public static final void accept$70(AfS182S0100000_13 afS182S0100000_13, Object obj) {
        C1C7U.LIZ("PumbaaTask@7275.run$3$2");
        DeviceManagerLancet.LIZLLL((Context) afS182S0100000_13.l0, "activity_resume");
        C1C7U.LIZIZ("PumbaaTask@7275.run$3$2");
    }

    public static final /* bridge */ /* synthetic */ void accept$71(AfS182S0100000_13 afS182S0100000_13, Object obj) {
        C1C7U.LIZ("FriendsUnreadGidsService@ce29.insertEntities$dis$2");
        C1C7U.LIZIZ("FriendsUnreadGidsService@ce29.insertEntities$dis$2");
    }

    public static final void accept$72(AfS182S0100000_13 afS182S0100000_13, Object obj) {
        Context context = (Context) afS182S0100000_13.l0;
        C1C7U.LIZ("PushInitializer@b651.pushCoreInitWhenConfigUpdate$1L");
        C810890VrT c810890VrT = C810890VrT.LIZIZ;
        c810890VrT.LJFF("pushCoreInitWhenConfigUpdate_run_or_pending");
        c810890VrT.LJIIL("pushCoreInitWhenConfigUpdate_run_or_pending");
        PushSheduler.LIZJ(new ARunnableS113S0100000_13(context, 129));
        C1C7U.LIZIZ("PushInitializer@b651.pushCoreInitWhenConfigUpdate$1L");
    }

    public static final void accept$73(AfS182S0100000_13 afS182S0100000_13, Object obj) {
        C1C7U.LIZ("CreatePasswordFlowStep@3262.handleAction$2");
        Throwable th = (Throwable) obj;
        InterfaceC853780XeS interfaceC853780XeS = (InterfaceC853780XeS) afS182S0100000_13.l0;
        if (interfaceC853780XeS != null) {
            interfaceC853780XeS.LIZ(th, false, null);
        }
        C1C7U.LIZIZ("CreatePasswordFlowStep@3262.handleAction$2");
    }

    public static final void accept$74(AfS182S0100000_13 afS182S0100000_13, Object obj) {
        C1C7U.LIZ("ReferralWidgetFacade@6a43.init$1");
        if (((Boolean) obj).booleanValue()) {
            C1849840yEo.LIZJ((Context) afS182S0100000_13.l0);
        }
        C1C7U.LIZIZ("ReferralWidgetFacade@6a43.init$1");
    }

    public static final void accept$75(AfS182S0100000_13 afS182S0100000_13, Object obj) {
        C1C7U.LIZ("InputEmailForBindFlowStep@dc9b.handleAction$2");
        Throwable th = (Throwable) obj;
        InterfaceC853780XeS interfaceC853780XeS = (InterfaceC853780XeS) afS182S0100000_13.l0;
        if (interfaceC853780XeS != null) {
            interfaceC853780XeS.LIZ(th, false, null);
        }
        C1C7U.LIZIZ("InputEmailForBindFlowStep@dc9b.handleAction$2");
    }

    public static final void accept$76(AfS182S0100000_13 afS182S0100000_13, Object obj) {
        C1C7U.LIZ("InputEmailForChangeFlowStep@e0.sendCode$2");
        Throwable th = (Throwable) obj;
        InterfaceC853780XeS interfaceC853780XeS = (InterfaceC853780XeS) afS182S0100000_13.l0;
        if (interfaceC853780XeS != null) {
            interfaceC853780XeS.LIZ(th, false, null);
        }
        C1C7U.LIZIZ("InputEmailForChangeFlowStep@e0.sendCode$2");
    }

    public static final void accept$77(AfS182S0100000_13 afS182S0100000_13, Object obj) {
        C1C7U.LIZ("VerifyEmailBeforeChangeFlowStep@123.handleAction$2");
        Throwable th = (Throwable) obj;
        InterfaceC853780XeS interfaceC853780XeS = (InterfaceC853780XeS) afS182S0100000_13.l0;
        if (interfaceC853780XeS != null) {
            interfaceC853780XeS.LIZ(th, false, null);
        }
        C1C7U.LIZIZ("VerifyEmailBeforeChangeFlowStep@123.handleAction$2");
    }

    public static final void accept$78(AfS182S0100000_13 afS182S0100000_13, Object obj) {
        C1C7U.LIZ("VerifyEmailBeforeChangeFlowStep@123.handleAction$3");
        InterfaceC853780XeS interfaceC853780XeS = (InterfaceC853780XeS) afS182S0100000_13.l0;
        if (interfaceC853780XeS != null) {
            interfaceC853780XeS.LIZIZ(null, false);
        }
        C1C7U.LIZIZ("VerifyEmailBeforeChangeFlowStep@123.handleAction$3");
    }

    public static final void accept$79(AfS182S0100000_13 afS182S0100000_13, Object obj) {
        C1C7U.LIZ("VerifyEmailBeforeChangeFlowStep@123.handleAction$4");
        Throwable th = (Throwable) obj;
        InterfaceC853780XeS interfaceC853780XeS = (InterfaceC853780XeS) afS182S0100000_13.l0;
        if (interfaceC853780XeS != null) {
            interfaceC853780XeS.LIZ(th, false, null);
        }
        C1C7U.LIZIZ("VerifyEmailBeforeChangeFlowStep@123.handleAction$4");
    }

    public static final void accept$8(AfS182S0100000_13 afS182S0100000_13, Object obj) {
        String strOptString;
        boolean z;
        IOneClickLoginService iOneClickLoginService;
        JSONObject jSONObjectOptJSONObject;
        String strOptString2;
        int i;
        JSONObject jSONObjectOptJSONObject2;
        C1C7U.LIZ("BindEmailCodeVerifyFragment@e424.onValidateCode$1");
        C0XT7 c0xt7 = (C0XT7) obj;
        C853660XeG c853660XeG = C853660XeG.LIZ;
        BindEmailCodeVerifyFragment bindEmailCodeVerifyFragment = (BindEmailCodeVerifyFragment) afS182S0100000_13.l0;
        EnumC1237100iIW enumC1237100iIW = bindEmailCodeVerifyFragment.LLLLLIL;
        boolean z2 = bindEmailCodeVerifyFragment.LLLLL;
        c853660XeG.getClass();
        C853660XeG.LJFF(enumC1237100iIW, z2);
        User userLIZJ = C0XQ5.LIZJ();
        JSONObject jSONObject = c0xt7.LJIIIZ.LJ;
        String str = "";
        if (jSONObject == null || (jSONObjectOptJSONObject2 = jSONObject.optJSONObject("data")) == null || (strOptString = jSONObjectOptJSONObject2.optString("email")) == null) {
            strOptString = "";
        }
        Bundle arguments = ((BindEmailCodeVerifyFragment) afS182S0100000_13.l0).getArguments();
        if (arguments != null) {
            z = arguments.getBoolean("is_mandatory_two_sv", false);
        } else {
            z = false;
        }
        if (!z) {
            userLIZJ.setEmail(strOptString);
            userLIZJ.setEmailVerified(true);
            userLIZJ.setHasEmail(true);
        }
        Bundle arguments2 = ((BindEmailCodeVerifyFragment) afS182S0100000_13.l0).getArguments();
        if (arguments2 != null && arguments2.getBoolean("show_success_toast", true)) {
            if (((Boolean) ((BindEmailCodeVerifyFragment) afS182S0100000_13.l0).LLLLLL.getValue()).booleanValue()) {
                i = 2131850156;
            } else if (((Boolean) ((BindEmailCodeVerifyFragment) afS182S0100000_13.l0).LLLLLLIL.getValue()).booleanValue()) {
                i = 2131850225;
            } else {
                i = 2131833852;
            }
            C19EG activity = ((BindEmailCodeVerifyFragment) afS182S0100000_13.l0).getActivity();
            if (activity != null) {
                C1389890mGx c1389890mGx = new C1389890mGx(activity);
                c1389890mGx.LJIIIZ(i);
                c1389890mGx.LJFF(R.raw.icon_tick_circle_fill);
                c1389890mGx.LJII(R.attr.zi);
                c1389890mGx.LIZ(true);
                c1389890mGx.LIZLLL(Mp4ScreenVideoLoadTimeout.CONTROL);
                c1389890mGx.LJIIJJI();
            }
        }
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LIZJ(1, "type");
        C20684815ws.LJIILLIIL("email_bundling_success", c2344009Gk.LIZ);
        Bundle arguments3 = ((BindEmailCodeVerifyFragment) afS182S0100000_13.l0).getArguments();
        if (arguments3 != null) {
            Bundle bundle = new Bundle();
            BindEmailCodeVerifyFragment bindEmailCodeVerifyFragment2 = (BindEmailCodeVerifyFragment) afS182S0100000_13.l0;
            C786410Ut5.LJJJI("platform", "email", bundle);
            C786410Ut5.LJJJI("bound_email", strOptString, bundle);
            C852810Xct c852810Xct = C852810Xct.LIZ;
            JSONObject jSONObject2 = c0xt7.LJIIIZ.LJ;
            if (jSONObject2 != null && (jSONObjectOptJSONObject = jSONObject2.optJSONObject("data")) != null && (strOptString2 = jSONObjectOptJSONObject.optString("ticket")) != null) {
                str = strOptString2;
            }
            c852810Xct.getClass();
            C852810Xct.LJIJJ(bundle, str);
            bindEmailCodeVerifyFragment2.JS(bundle);
            C786410Ut5.LJJIIZI(arguments3, bundle, "final_data");
        }
        if (((BindEmailCodeVerifyFragment) afS182S0100000_13.l0).zS()) {
            C0HZQ c0hzq = ((BindEmailCodeVerifyFragment) afS182S0100000_13.l0).LLLF;
            if (c0hzq != null && c0hzq.isChecked() && (iOneClickLoginService = (IOneClickLoginService) PluggableExtentionKt.pluggableSpi$default(IOneClickLoginService.class, false, false, false, 14, null)) != null) {
                iOneClickLoginService.LJIIL(C0XWD.SIGN_UP, ((BindEmailCodeVerifyFragment) afS182S0100000_13.l0).getEnterFrom(), ((BindEmailCodeVerifyFragment) afS182S0100000_13.l0).getEnterMethod(), null, null);
            }
            Bundle arguments4 = ((BindEmailCodeVerifyFragment) afS182S0100000_13.l0).getArguments();
            if (arguments4 == null) {
                arguments4 = new Bundle();
            }
            arguments4.putInt("next_page", EnumC852910Xd3.OPTIONAL_SIGNUP_PAGES.getValue());
            arguments4.putInt("previous_page", ((BindEmailCodeVerifyFragment) afS182S0100000_13.l0).VR().getValue());
            ((BindEmailCodeVerifyFragment) afS182S0100000_13.l0).fo(arguments4);
        } else {
            BindEmailCodeVerifyFragment bindEmailCodeVerifyFragment3 = (BindEmailCodeVerifyFragment) afS182S0100000_13.l0;
            Bundle arguments5 = bindEmailCodeVerifyFragment3.getArguments();
            if (arguments5 == null) {
                arguments5 = new Bundle();
            }
            bindEmailCodeVerifyFragment3.WR(arguments5);
        }
        C1C7U.LIZIZ("BindEmailCodeVerifyFragment@e424.onValidateCode$1");
    }

    public static final void accept$80(AfS182S0100000_13 afS182S0100000_13, Object obj) {
        C1C7U.LIZ("VerifyEmailCodeForBindFlowStep@1a06.handleAction$2");
        Throwable th = (Throwable) obj;
        InterfaceC853780XeS interfaceC853780XeS = (InterfaceC853780XeS) afS182S0100000_13.l0;
        if (interfaceC853780XeS != null) {
            interfaceC853780XeS.LIZ(th, false, null);
        }
        C1C7U.LIZIZ("VerifyEmailCodeForBindFlowStep@1a06.handleAction$2");
    }

    public static final void accept$81(AfS182S0100000_13 afS182S0100000_13, Object obj) {
        C1C7U.LIZ("VerifyEmailCodeForBindFlowStep@1a06.handleAction$4");
        Throwable th = (Throwable) obj;
        InterfaceC853780XeS interfaceC853780XeS = (InterfaceC853780XeS) afS182S0100000_13.l0;
        if (interfaceC853780XeS != null) {
            interfaceC853780XeS.LIZ(th, false, null);
        }
        C1C7U.LIZIZ("VerifyEmailCodeForBindFlowStep@1a06.handleAction$4");
    }

    public static final void accept$82(AfS182S0100000_13 afS182S0100000_13, Object obj) {
        C1C7U.LIZ("VerifyEmailCodeForChangeFlowStep@8af6.handleAction$2");
        Throwable th = (Throwable) obj;
        InterfaceC853780XeS interfaceC853780XeS = (InterfaceC853780XeS) afS182S0100000_13.l0;
        if (interfaceC853780XeS != null) {
            interfaceC853780XeS.LIZ(th, false, null);
        }
        C1C7U.LIZIZ("VerifyEmailCodeForChangeFlowStep@8af6.handleAction$2");
    }

    public static final void accept$83(AfS182S0100000_13 afS182S0100000_13, Object obj) {
        C1C7U.LIZ("VerifyEmailCodeForChangeFlowStep@8af6.handleAction$6");
        Throwable th = (Throwable) obj;
        InterfaceC853780XeS interfaceC853780XeS = (InterfaceC853780XeS) afS182S0100000_13.l0;
        if (interfaceC853780XeS != null) {
            interfaceC853780XeS.LIZ(th, false, null);
        }
        C1C7U.LIZIZ("VerifyEmailCodeForChangeFlowStep@8af6.handleAction$6");
    }

    public static final void accept$84(AfS182S0100000_13 afS182S0100000_13, Object obj) {
        C1C7U.LIZ("CreatePasswordFragment@cbc7.navigateToNextStepForEmailSignUp$1");
        ((CreatePasswordFragment) afS182S0100000_13.l0).LLLLLLJ = true;
        C0XQ5.LJIIJJI(13, 1, null);
        ((CreatePasswordFragment) afS182S0100000_13.l0).mT();
        CreatePasswordFragment createPasswordFragment = (CreatePasswordFragment) afS182S0100000_13.l0;
        Bundle arguments = createPasswordFragment.getArguments();
        if (arguments == null) {
            arguments = new Bundle();
        }
        arguments.putBoolean("email_signup", true);
        arguments.putBoolean("is_success", true);
        arguments.putInt("next_page", EnumC852910Xd3.OPTIONAL_SIGNUP_PAGES.getValue());
        arguments.putInt("previous_page", EnumC852910Xd3.CREATE_PASSWORD_FOR_EMAIL.getValue());
        createPasswordFragment.fo(arguments);
        C1C7U.LIZIZ("CreatePasswordFragment@cbc7.navigateToNextStepForEmailSignUp$1");
    }

    public static final void accept$85(AfS182S0100000_13 afS182S0100000_13, Object obj) {
        C1C7U.LIZ("CreatePasswordFragment@cbc7.setPasswordForPhone$1");
        CreatePasswordFragment createPasswordFragment = (CreatePasswordFragment) afS182S0100000_13.l0;
        createPasswordFragment.LLLLLLJ = true;
        Bundle arguments = createPasswordFragment.getArguments();
        if (arguments != null) {
            arguments.putBoolean("is_success", true);
        }
        if (((CreatePasswordFragment) afS182S0100000_13.l0).getArguments().getBoolean("phone_signup")) {
            ((CreatePasswordFragment) afS182S0100000_13.l0).getArguments().putInt("next_page", EnumC852910Xd3.OPTIONAL_SIGNUP_PAGES.getValue());
            ((CreatePasswordFragment) afS182S0100000_13.l0).getArguments().putInt("previous_page", EnumC852910Xd3.CREATE_PASSWORD_FOR_PHONE.getValue());
            CreatePasswordFragment createPasswordFragment2 = (CreatePasswordFragment) afS182S0100000_13.l0;
            createPasswordFragment2.fo(createPasswordFragment2.getArguments());
        } else {
            ((CreatePasswordFragment) afS182S0100000_13.l0).getArguments().putInt("next_page", EnumC852910Xd3.FINISH.getValue());
            CreatePasswordFragment createPasswordFragment3 = (CreatePasswordFragment) afS182S0100000_13.l0;
            createPasswordFragment3.fo(createPasswordFragment3.getArguments());
        }
        C1C7U.LIZIZ("CreatePasswordFragment@cbc7.setPasswordForPhone$1");
    }

    public static final void accept$86(AfS182S0100000_13 afS182S0100000_13, Object obj) {
        C1C7U.LIZ("EmailLinkVerifyFragment@2352.validateCode$2");
        List<InterfaceC586170Myt> list = C0XQ5.LIZ;
        C1233040iBy c1233040iBy = new C1233040iBy(C0XPY.LIZIZ);
        c1233040iBy.LIZJ(((EmailLinkVerifyFragment) afS182S0100000_13.l0).getString(2131850225));
        c1233040iBy.LIZLLL();
        EmailLinkVerifyFragment emailLinkVerifyFragment = (EmailLinkVerifyFragment) afS182S0100000_13.l0;
        Bundle arguments = emailLinkVerifyFragment.getArguments();
        if (arguments == null) {
            arguments = new Bundle();
        }
        emailLinkVerifyFragment.WR(arguments);
        C1C7U.LIZIZ("EmailLinkVerifyFragment@2352.validateCode$2");
    }

    public static final void accept$87(AfS182S0100000_13 afS182S0100000_13, Object obj) {
        C1C7U.LIZ("EmailLinkVerifyFragment@2352.validateCode$3");
        List<InterfaceC586170Myt> list = C0XQ5.LIZ;
        C1233040iBy c1233040iBy = new C1233040iBy(C0XPY.LIZIZ);
        c1233040iBy.LIZJ(((EmailLinkVerifyFragment) afS182S0100000_13.l0).getString(2131850225));
        c1233040iBy.LIZLLL();
        EmailLinkVerifyFragment emailLinkVerifyFragment = (EmailLinkVerifyFragment) afS182S0100000_13.l0;
        Bundle arguments = emailLinkVerifyFragment.getArguments();
        if (arguments == null) {
            arguments = new Bundle();
        }
        emailLinkVerifyFragment.WR(arguments);
        C1C7U.LIZIZ("EmailLinkVerifyFragment@2352.validateCode$3");
    }

    public static final void accept$88(AfS182S0100000_13 afS182S0100000_13, Object obj) {
        C1C7U.LIZ("InputPhoneFragment@5d47.startSendCode$1");
        ((InputPhoneFragment) afS182S0100000_13.l0).RS(true);
        C1C7U.LIZIZ("InputPhoneFragment@5d47.startSendCode$1");
    }

    public static final void accept$89(AfS182S0100000_13 afS182S0100000_13, Object obj) {
        C1C7U.LIZ("InputPhoneFragment@5d47.startSendCode$2");
        ((InputPhoneFragment) afS182S0100000_13.l0).RS(true);
        C1C7U.LIZIZ("InputPhoneFragment@5d47.startSendCode$2");
    }

    public static final void accept$9(AfS182S0100000_13 afS182S0100000_13, Object obj) {
        C1C7U.LIZ("BindEmailCodeVerifyFragment@e424.resendCode$1");
        ((BindEmailCodeVerifyFragment) afS182S0100000_13.l0).oT();
        C1C7U.LIZIZ("BindEmailCodeVerifyFragment@e424.resendCode$1");
    }

    public static final void accept$90(AfS182S0100000_13 afS182S0100000_13, Object obj) {
        C1C7U.LIZ("InputPhoneFragment@5d47.startSendCode$3");
        ((InputPhoneFragment) afS182S0100000_13.l0).RS(true);
        C1C7U.LIZIZ("InputPhoneFragment@5d47.startSendCode$3");
    }

    public static final void accept$91(AfS182S0100000_13 afS182S0100000_13, Object obj) {
        C1C7U.LIZ("InputPhoneFragment@5d47.startSendCode$4");
        ((InputPhoneFragment) afS182S0100000_13.l0).RS(true);
        C1C7U.LIZIZ("InputPhoneFragment@5d47.startSendCode$4");
    }

    public static final void accept$92(AfS182S0100000_13 afS182S0100000_13, Object obj) {
        C1C7U.LIZ("LinkSubject@4a4e.subscribe$1");
        ((Function1) afS182S0100000_13.l0).invoke(obj);
        C1C7U.LIZIZ("LinkSubject@4a4e.subscribe$1");
    }

    public static final void accept$93(AfS182S0100000_13 afS182S0100000_13, Object obj) {
        C1C7U.LIZ("RecommendEffectRequestApi@b399.getRecommendEffectsFromServer$2");
        ((Function1) afS182S0100000_13.l0).invoke("-1");
        C1C7U.LIZIZ("RecommendEffectRequestApi@b399.getRecommendEffectsFromServer$2");
    }

    public static final void accept$94(AfS182S0100000_13 afS182S0100000_13, Object obj) {
        C1C7U.LIZ("VerifyPhoneForBindFlowStep@5b3a.handleAction$2");
        Throwable th = (Throwable) obj;
        InterfaceC853780XeS interfaceC853780XeS = (InterfaceC853780XeS) afS182S0100000_13.l0;
        if (interfaceC853780XeS != null) {
            interfaceC853780XeS.LIZ(th, false, null);
        }
        C1C7U.LIZIZ("VerifyPhoneForBindFlowStep@5b3a.handleAction$2");
    }

    public static final void accept$95(AfS182S0100000_13 afS182S0100000_13, Object obj) {
        C1C7U.LIZ("VerifyPhoneForBindFlowStep@5b3a.handleAction$6");
        Throwable th = (Throwable) obj;
        InterfaceC853780XeS interfaceC853780XeS = (InterfaceC853780XeS) afS182S0100000_13.l0;
        if (interfaceC853780XeS != null) {
            interfaceC853780XeS.LIZ(th, false, null);
        }
        C1C7U.LIZIZ("VerifyPhoneForBindFlowStep@5b3a.handleAction$6");
    }

    public static final void accept$96(AfS182S0100000_13 afS182S0100000_13, Object obj) {
        PushStartupTaskRejectStrategy pushStartupTaskRejectStrategy = (PushStartupTaskRejectStrategy) afS182S0100000_13.l0;
        pushStartupTaskRejectStrategy.getClass();
        C1C7U.LIZ("PushStartupTaskRejectStrategy@309f.run$1L$1L");
        if (C0X35.LJIIL("PushStartupTaskRejectStrategy")) {
            C799900VZk c799900VZk = C799900VZk.LIZ;
            pushStartupTaskRejectStrategy.LL.getClass();
            c799900VZk.getClass();
            C799900VZk.LJI("PushStartup");
        }
        C11JF c11jf = pushStartupTaskRejectStrategy.LLILLJJLI;
        if (c11jf != null && !c11jf.isDisposed()) {
            pushStartupTaskRejectStrategy.LLILLJJLI.dispose();
        }
        C1C7U.LIZIZ("PushStartupTaskRejectStrategy@309f.run$1L$1L");
    }

    public static final void accept$97(AfS182S0100000_13 afS182S0100000_13, Object obj) {
        C1C7U.LIZ("VerifyPIIEmailForBindFlowStep@cca5.handleAction$2");
        Throwable th = (Throwable) obj;
        InterfaceC853780XeS interfaceC853780XeS = (InterfaceC853780XeS) afS182S0100000_13.l0;
        if (interfaceC853780XeS != null) {
            interfaceC853780XeS.LIZ(th, false, null);
        }
        C1C7U.LIZIZ("VerifyPIIEmailForBindFlowStep@cca5.handleAction$2");
    }

    public static final void accept$98(AfS182S0100000_13 afS182S0100000_13, Object obj) {
        C1C7U.LIZ("VerifyPIIEmailForBindFlowStep@cca5.handleAction$4");
        Throwable th = (Throwable) obj;
        InterfaceC853780XeS interfaceC853780XeS = (InterfaceC853780XeS) afS182S0100000_13.l0;
        if (interfaceC853780XeS != null) {
            interfaceC853780XeS.LIZ(th, false, null);
        }
        C1C7U.LIZIZ("VerifyPIIEmailForBindFlowStep@cca5.handleAction$4");
    }

    public static final void accept$99(AfS182S0100000_13 afS182S0100000_13, Object obj) {
        C1C7U.LIZ("VerifyEmailForUnbindEmailFlowStep@bdba.handleAction$3");
        ((C853820XeW) afS182S0100000_13.l0).LJIIIIZZ(false, C0XWH.LIZ((Throwable) obj), EnumC854390XfR.EMAIL);
        C1C7U.LIZIZ("VerifyEmailForUnbindEmailFlowStep@bdba.handleAction$3");
    }

    public AfS182S0100000_13(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public AfS182S0100000_13(RecommendEffectRequestApi recommendEffectRequestApi, AwS53S0100100_22 awS53S0100100_22, int i) {
        this.$t = i;
        this.l0 = awS53S0100100_22;
    }
}
