package X;

import Y.ARunnableS23S0201000_17;
import android.content.Context;
import android.content.DialogInterface;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.live.iap.service.IapService;
import com.bytedance.android.livesdk.comp.api.subscription.ISubscribeService;
import com.bytedance.android.livesdk.livesetting.gift.LiveUserRiskVerifySetting;
import com.bytedance.android.livesdk.livesetting.roomfunction.LiveSdkAppealWebviewSetting;
import com.bytedance.android.livesdk.livesetting.wallet.LiveCustomRechargeFeedbackUrlSetting;
import com.bytedance.android.livesdk.livesetting.wallet.LiveWalletExceptionImprovementSetting;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.android.livesdkapi.host.IHostSetting;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS641S0100000_27;

/* JADX INFO: renamed from: X.0x0a, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@InterfaceC1294060jmO
public final class C1802580x0a {
    public static final C1802580x0a LIZ = new C1802580x0a();
    public static final IapService LIZIZ = (IapService) C1161920gLG.LIZJ(IapService.class);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v10, types: [T, java.lang.CharSequence, java.lang.String] */
    @InterfaceC1294060jmO
    public static final C1149670g1V LJ(final Context context, final C1802410x0J c1802410x0J) {
        String string;
        int i;
        Function2 awS641S0100000_27;
        T string2;
        String message;
        String message2;
        C20441214yg.LIZIZ("recharge_fails", "RechargeExceptionUtils");
        boolean z = false;
        if (context == null) {
            return new C1149670g1V(false, false);
        }
        int i2 = c1802410x0J.LIZ;
        if (i2 == 3) {
            C1802580x0a c1802580x0a = LIZ;
            Exception exc = c1802410x0J.LIZLLL;
            c1802580x0a.getClass();
            LJFF(2131843725, c1802410x0J, exc);
            return new C1149670g1V(true, true);
        }
        if (i2 == -1) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("config.action = ");
            sbLIZ.append(c1802410x0J.LIZ);
            C20441214yg.LJIIIZ("RechargeExceptionUtils", C2188811AlT.LIZIZ(sbLIZ));
            return new C1149670g1V(false, false);
        }
        Exception exc2 = c1802410x0J.LIZLLL;
        int i3 = 2131844617;
        if (exc2 instanceof C501470JlZ) {
            C501470JlZ c501470JlZ = (C501470JlZ) exc2;
            String str = "";
            switch (c501470JlZ.getErrorCode()) {
                case 41155:
                    C1802580x0a c1802580x0a2 = LIZ;
                    Exception exc3 = c1802410x0J.LIZLLL;
                    c1802580x0a2.getClass();
                    LJFF(2131844529, c1802410x0J, exc3);
                    z = true;
                    break;
                case 4005189:
                case 4005272:
                    C1802580x0a c1802580x0a3 = LIZ;
                    c501470JlZ.getErrorCode();
                    c1802580x0a3.getClass();
                    final C259800zU c259800zU = new C259800zU();
                    ?? value = LiveSdkAppealWebviewSetting.INSTANCE.getValue();
                    c259800zU.element = value;
                    if (TextUtils.isEmpty(value)) {
                        if (((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).isInMusicallyRegion()) {
                            string2 = "sslocal://webcast_webview?url=https%3A%2F%2Finapp-va.tiktokv.com%2Ffalcon%2Fwebcast_mt%2Fpage%2Fappeal%2Findex.html&type=fullscreen&title=&hide_more=0&hide_nav_bar=1&hide_status_bar=0";
                        } else {
                            string2 = "sslocal://webcast_webview?url=https%3A%2F%2Finapp.tiktokv.com%2Ffalcon%2Fwebcast_mt%2Fpage%2Fappeal%2Findex.html&type=fullscreen&title=&hide_more=0&hide_nav_bar=1&hide_status_bar=0";
                        }
                    } else {
                        Uri.Builder builderBuildUpon = UriProtector.parse((String) c259800zU.element).buildUpon();
                        builderBuildUpon.appendQueryParameter("enter_from", "wallet_appeal");
                        string2 = builderBuildUpon.build().toString();
                    }
                    c259800zU.element = string2;
                    context.getString(2131841279);
                    String prompt = c501470JlZ.getPrompt();
                    C19GO c19go = new C19GO(context);
                    c19go.LJII = prompt;
                    c19go.LJ(2131851997, new DialogInterface.OnClickListener() { // from class: X.0g3v
                        public final /* synthetic */ String LLILZ = "other";
                        public final /* synthetic */ String LLILZIL = "risk";

                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i4) {
                            String message3;
                            ((IActionHandlerService) C1161920gLG.LIZJ(IActionHandlerService.class)).handle(context, c259800zU.element);
                            C1803800x2Y c1803800x2Y = C1803800x2Y.LIZ;
                            C1802410x0J c1802410x0J2 = c1802410x0J;
                            int i5 = c1802410x0J2.LJFF;
                            String str2 = this.LLILZ;
                            String str3 = this.LLILZIL;
                            String str4 = c1802410x0J2.LJ;
                            int i6 = c1802410x0J2.LIZIZ;
                            int i7 = c1802410x0J2.LIZJ;
                            int i8 = c1802410x0J2.LJIIIZ;
                            Exception exc4 = c1802410x0J2.LIZLLL;
                            if (exc4 == null || (message3 = exc4.getMessage()) == null) {
                                message3 = "";
                            }
                            C1803800x2Y.LJIIZILJ(c1803800x2Y, i5, str2, str3, str4, i6, i7, i8, message3, "contact_us", null, null, null, Boolean.FALSE, null, 24064);
                            dialogInterface.dismiss();
                        }
                    }, false);
                    c19go.LIZJ(2131851998, new DialogInterface.OnClickListener() { // from class: X.0g3w
                        public final /* synthetic */ String LLILLJJLI = "other";
                        public final /* synthetic */ String LLILLL = "risk";

                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i4) {
                            String message3;
                            C1803800x2Y c1803800x2Y = C1803800x2Y.LIZ;
                            C1802410x0J c1802410x0J2 = c1802410x0J;
                            int i5 = c1802410x0J2.LJFF;
                            String str2 = this.LLILLJJLI;
                            String str3 = this.LLILLL;
                            String str4 = c1802410x0J2.LJ;
                            int i6 = c1802410x0J2.LIZIZ;
                            int i7 = c1802410x0J2.LIZJ;
                            int i8 = c1802410x0J2.LJIIIZ;
                            Exception exc4 = c1802410x0J2.LIZLLL;
                            if (exc4 == null || (message3 = exc4.getMessage()) == null) {
                                message3 = "";
                            }
                            C1803800x2Y.LJIIZILJ(c1803800x2Y, i5, str2, str3, str4, i6, i7, i8, message3, "cancel", null, null, null, null, null, 32256);
                            dialogInterface.dismiss();
                        }
                    }, false);
                    c19go.LJJIIJ = false;
                    C786410Ut5.M4(c19go.LIZ());
                    C1803800x2Y c1803800x2Y = C1803800x2Y.LIZ;
                    Integer numValueOf = Integer.valueOf(c1802410x0J.LJFF);
                    String str2 = c1802410x0J.LJ;
                    int i4 = c1802410x0J.LIZIZ;
                    int i5 = c1802410x0J.LIZJ;
                    int i6 = c1802410x0J.LJIIIZ;
                    Exception exc4 = c1802410x0J.LIZLLL;
                    if (exc4 != null && (message = exc4.getMessage()) != null) {
                        str = message;
                    }
                    C1803800x2Y.LJIJ(c1803800x2Y, numValueOf, "other", "risk", str2, "popup", i4, i5, i6, str, null, null, null, null, null, 32256);
                    break;
                case 4005192:
                case 4005209:
                    if (c1802410x0J.LJIIIIZZ != 0) {
                        i3 = 2131841673;
                    }
                    C1802580x0a c1802580x0a4 = LIZ;
                    String string3 = context.getString(i3);
                    String prompt2 = c501470JlZ.getPrompt();
                    int errorCode = c501470JlZ.getErrorCode();
                    AnonymousClass0208 anonymousClass0208 = AnonymousClass0208.get$arr$(14);
                    c1802580x0a4.getClass();
                    LIZ(context, string3, prompt2, "underground", "other", errorCode, c1802410x0J, 2131837517, anonymousClass0208);
                    break;
                case 4005205:
                    LIZ.getClass();
                    LJFF(2131843092, c1802410x0J, exc2);
                    C1803800x2Y.LIZ.getClass();
                    C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_feature_abnormal_toast");
                    c474500IjALIZ.LJIL();
                    c474500IjALIZ.LJJII(C1803800x2Y.LJIIL(null), "strategy_task_type");
                    c474500IjALIZ.LJJII("recharge", "scenario");
                    c474500IjALIZ.LJJII(Long.valueOf(UserService.getInstance().user().getCurrentUserId()), "user_id");
                    c474500IjALIZ.LIZ();
                    z = true;
                    break;
                case 4005208:
                    if (c1802410x0J.LJIIIIZZ != 0) {
                        i3 = 2131841673;
                    }
                    C1802580x0a c1802580x0a5 = LIZ;
                    String string4 = context.getString(i3);
                    String prompt3 = c501470JlZ.getPrompt();
                    int errorCode2 = c501470JlZ.getErrorCode();
                    AnonymousClass0208 anonymousClass02082 = AnonymousClass0208.get$arr$(14);
                    c1802580x0a5.getClass();
                    LIZ(context, string4, prompt3, "refund", "other", errorCode2, c1802410x0J, 2131837517, anonymousClass02082);
                    break;
                case 4005256:
                case 4005257:
                    if (c1802410x0J.LJI) {
                        LIZ.getClass();
                        LJFF(2131843092, c1802410x0J, exc2);
                        z = true;
                    } else {
                        C1802580x0a c1802580x0a6 = LIZ;
                        final int errorCode3 = c501470JlZ.getErrorCode();
                        String prompt4 = c501470JlZ.getPrompt();
                        c1802580x0a6.getClass();
                        String string5 = context.getResources().getString(2131842179);
                        C782110Um9 c782110Um9 = new C782110Um9(context);
                        c782110Um9.LJIILLIIL = true;
                        c782110Um9.LJIIIZ(string5);
                        c782110Um9.LJIIZILJ(2131842180);
                        c782110Um9.LJIILIIL(2131842181, new InterfaceC743640TFa() { // from class: X.0eVY
                            @Override // X.InterfaceC743640TFa
                            public final void LIZ(LiveDialog liveDialog) {
                                String str3;
                                liveDialog.dismiss();
                                C1103870epd.LIZ("verify", "live_recharge");
                                if (errorCode3 == 4005257) {
                                    str3 = LiveUserRiskVerifySetting.INSTANCE.getConfig().phoneVerifyUrl;
                                } else {
                                    str3 = LiveUserRiskVerifySetting.INSTANCE.getConfig().emailVerifyUrl;
                                }
                                if (!TextUtils.isEmpty(str3)) {
                                    try {
                                        C495520Jby c495520Jby = new C495520Jby(str3);
                                        c495520Jby.LIZJ("enter_from", "recharge_live_room");
                                        ((IActionHandlerService) C1161920gLG.LIZJ(IActionHandlerService.class)).handle(context, UriProtector.parse(c495520Jby.LIZLLL()));
                                    } catch (Exception e) {
                                        TryCatchGuardChecker.doCheck(e);
                                        C20441214yg.LJII(e);
                                    }
                                }
                            }
                        });
                        c782110Um9.LJIIJ(2131842177, new InterfaceC743640TFa() { // from class: X.0eVa
                            @Override // X.InterfaceC743640TFa
                            public final void LIZ(LiveDialog liveDialog) {
                                liveDialog.dismiss();
                                C1103870epd.LIZ("cancel", "live_recharge");
                            }
                        });
                        C786410Ut5.E4(c782110Um9.LIZ());
                        HashMap map = new HashMap();
                        map.put("show_page", "live_recharge");
                        C474500IjA c474500IjALIZ2 = C0IJT.LIZ("livesdk_safety_reminder_popup_show");
                        c474500IjALIZ2.LJIL();
                        c474500IjALIZ2.LJJIIZI(map);
                        c474500IjALIZ2.LIZ();
                        C1803800x2Y c1803800x2Y2 = C1803800x2Y.LIZ;
                        Integer numValueOf2 = Integer.valueOf(c1802410x0J.LJFF);
                        String str3 = c1802410x0J.LJ;
                        int i7 = c1802410x0J.LIZIZ;
                        int i8 = c1802410x0J.LIZJ;
                        int i9 = c1802410x0J.LJIIIZ;
                        Exception exc5 = c1802410x0J.LIZLLL;
                        if (exc5 != null && (message2 = exc5.getMessage()) != null) {
                            str = message2;
                        }
                        C1803800x2Y.LJIJ(c1803800x2Y2, numValueOf2, "other", prompt4, str3, "popup", i7, i8, i9, str, null, null, null, null, null, 24064);
                    }
                    break;
                case 4005284:
                    C1151150g3t c1151150g3t = C1151150g3t.LIZ;
                    String prompt5 = c501470JlZ.getPrompt();
                    c1151150g3t.getClass();
                    C1151150g3t.LIZIZ(context, true, prompt5, c1802410x0J);
                    break;
                case 4025001:
                    C1802580x0a c1802580x0a7 = LIZ;
                    String string6 = context.getString(2131844426);
                    String prompt6 = c501470JlZ.getPrompt();
                    int errorCode4 = c501470JlZ.getErrorCode();
                    AnonymousClass0208 anonymousClass02083 = AnonymousClass0208.get$arr$(14);
                    c1802580x0a7.getClass();
                    LIZ(context, string6, prompt6, "risk", "other", errorCode4, c1802410x0J, 2131837517, anonymousClass02083);
                    break;
                case 4025002:
                    C1802580x0a c1802580x0a8 = LIZ;
                    String string7 = context.getString(2131844424);
                    String prompt7 = c501470JlZ.getPrompt();
                    int errorCode5 = c501470JlZ.getErrorCode();
                    AnonymousClass0208 anonymousClass02084 = AnonymousClass0208.get$arr$(14);
                    c1802580x0a8.getClass();
                    LIZ(context, string7, prompt7, "risk", "other", errorCode5, c1802410x0J, 2131837517, anonymousClass02084);
                    break;
                default:
                    if (C1802460x0O.LIZ(c501470JlZ.getErrorCode())) {
                        int errorCode6 = c501470JlZ.getErrorCode();
                        switch (errorCode6) {
                            case 42030:
                                C1802340x0C.LIZIZ(context, EnumC1802470x0P.NORMAL_UNSUBMIT_MUST, c501470JlZ.getPrompt(), c501470JlZ.getErrorCode(), c1802410x0J);
                                break;
                            case 42031:
                                C1802340x0C.LIZJ(context, EnumC1802470x0P.NORMAL_REVIEWING, c501470JlZ.getPrompt(), c501470JlZ.getErrorCode(), c1802410x0J);
                                break;
                            case 42032:
                                C1802340x0C.LIZJ(context, EnumC1802470x0P.NORMAL_REJECT, c501470JlZ.getPrompt(), c501470JlZ.getErrorCode(), c1802410x0J);
                                break;
                            default:
                                switch (errorCode6) {
                                    case 4005265:
                                        C1802340x0C.LIZIZ(context, EnumC1802470x0P.NORMAL_RESUBMIT_MUST, c501470JlZ.getPrompt(), c501470JlZ.getErrorCode(), c1802410x0J);
                                        break;
                                    case 4005266:
                                        C1802340x0C.LIZ(context, EnumC1802470x0P.WHITELIST_UNSUBMIT_NOTICE, c501470JlZ.getPrompt(), c501470JlZ.getErrorCode(), c1802410x0J);
                                        break;
                                    case 4005267:
                                        C1802340x0C.LIZ(context, EnumC1802470x0P.WHITELIST_RESUBMIT_NOTICE, c501470JlZ.getPrompt(), c501470JlZ.getErrorCode(), c1802410x0J);
                                        break;
                                    case 4005268:
                                        C1802340x0C.LIZIZ(context, EnumC1802470x0P.WHITELIST_RESUBMIT_MUST, c501470JlZ.getPrompt(), c501470JlZ.getErrorCode(), c1802410x0J);
                                        break;
                                    case 4005269:
                                        C1802340x0C.LIZIZ(context, EnumC1802470x0P.WHITELIST_UNSUBMIT_MUST, c501470JlZ.getPrompt(), c501470JlZ.getErrorCode(), c1802410x0J);
                                        break;
                                    case 4005270:
                                        C1802340x0C.LIZJ(context, EnumC1802470x0P.WHITELIST_REJECT, c501470JlZ.getPrompt(), c501470JlZ.getErrorCode(), c1802410x0J);
                                        break;
                                    case 4005271:
                                        C1802340x0C.LIZJ(context, EnumC1802470x0P.WHITELIST_REVIEWING, c501470JlZ.getPrompt(), c501470JlZ.getErrorCode(), c1802410x0J);
                                        break;
                                }
                                break;
                        }
                    } else {
                        LIZ.getClass();
                        LJFF(2131843092, c1802410x0J, exc2);
                        z = true;
                        break;
                    }
                    break;
            }
        } else {
            int i10 = c1802410x0J.LIZIZ;
            if (i10 == 206) {
                if (c1802410x0J.LJI && C500260Jjc.LJJIIZ(null)) {
                    ((IActionHandlerService) C1161920gLG.LIZJ(IActionHandlerService.class)).handle(context, UriProtector.parse(null));
                } else {
                    C1802580x0a c1802580x0a9 = LIZ;
                    c1802580x0a9.getClass();
                    LJFF(2131843724, c1802410x0J, null);
                    if (!C1802640x0g.LIZIZ().LIZ) {
                        c1802580x0a9.getClass();
                        LJFF(2131843724, c1802410x0J, null);
                        z = true;
                    }
                }
            } else if (i10 == 203) {
                LiveWalletExceptionImprovementSetting liveWalletExceptionImprovementSetting = LiveWalletExceptionImprovementSetting.INSTANCE;
                if (liveWalletExceptionImprovementSetting.getValue()) {
                    LIZ.getClass();
                    if (c1802410x0J.LJIIIZ == 1) {
                        string = context.getString(2131837518);
                    } else {
                        string = context.getString(2131837519);
                    }
                } else if (C1796440wqg.LIZIZ()) {
                    string = context.getString(2131844617);
                } else {
                    string = context.getString(2131844618);
                }
                String string8 = context.getString(2131851586);
                if (liveWalletExceptionImprovementSetting.getValue() && c1802410x0J.LJIIIZ == 1) {
                    i = 2131842037;
                } else {
                    i = 2131837517;
                }
                if (liveWalletExceptionImprovementSetting.getValue() && c1802410x0J.LJIIIZ == 1) {
                    awS641S0100000_27 = new AwS641S0100000_27(context, 81);
                } else {
                    awS641S0100000_27 = AnonymousClass0208.get$arr$(15);
                }
                LIZ.getClass();
                LIZ(context, string8, string, "google-apple", "pay", 203, c1802410x0J, i, awS641S0100000_27);
            } else {
                int i11 = 2131844620;
                if (i10 == 205) {
                    if (c1802410x0J.LJI) {
                        i11 = 2131843199;
                    } else if (c1802410x0J.LJIIIIZZ != 0) {
                        i11 = 2131841097;
                    }
                    LIZ.getClass();
                    LJFF(i11, c1802410x0J, null);
                } else if (i10 == 204) {
                    if (c1802410x0J.LJI) {
                        i11 = 2131843199;
                    } else if (c1802410x0J.LJIIIIZZ != 0) {
                        i11 = 2131841097;
                    }
                    LIZ.getClass();
                    LJFF(i11, c1802410x0J, null);
                } else if (i10 == 208) {
                    LIZ.getClass();
                    LJFF(2131844619, c1802410x0J, null);
                } else if (i10 == -202) {
                    if (LiveWalletExceptionImprovementSetting.INSTANCE.getValue()) {
                        AwS641S0100000_27 awS641S0100000_272 = new AwS641S0100000_27(context, 82);
                        C1802580x0a c1802580x0a10 = LIZ;
                        String string9 = context.getString(2131842039);
                        String string10 = context.getString(2131837518);
                        c1802580x0a10.getClass();
                        LIZ(context, string9, string10, "google-apple", "pay", -202, c1802410x0J, 2131842037, awS641S0100000_272);
                    } else {
                        LIZ.getClass();
                        LJFF(2131851586, c1802410x0J, null);
                    }
                } else if (LiveWalletExceptionImprovementSetting.INSTANCE.getValue()) {
                    C1802580x0a c1802580x0a11 = LIZ;
                    String string11 = context.getString(2131851586);
                    String string12 = context.getString(2131837519);
                    int i12 = c1802410x0J.LIZIZ;
                    AnonymousClass0208 anonymousClass02085 = AnonymousClass0208.get$arr$(14);
                    c1802580x0a11.getClass();
                    LIZ(context, string11, string12, "unknown", "pay", i12, c1802410x0J, 2131837517, anonymousClass02085);
                } else {
                    LIZ.getClass();
                    LJFF(2131843092, c1802410x0J, null);
                }
                z = true;
            }
        }
        return new C1149670g1V(true, z);
    }

    @InterfaceC1294060jmO
    public static void LJFF(int i, C1802410x0J c1802410x0J, Throwable th) {
        C786410Ut5.LJJZZIII(C820670WHh.LIZ, new ARunnableS23S0201000_17(i, c1802410x0J, th, 3));
    }

    public static String LIZJ(C1802410x0J c1802410x0J, int i, int i2, int i3, String str, String str2) {
        return LIZLLL(LiveCustomRechargeFeedbackUrlSetting.INSTANCE.getValue(), c1802410x0J, "google-apple", "pay", i, i2, i3, str, str2).toString();
    }

    @InterfaceC1294060jmO
    public static void LIZ(final Context context, String str, String str2, final String str3, final String str4, final int i, final C1802410x0J c1802410x0J, final int i2, final Function2 function2) {
        String value;
        String message;
        if (c1802410x0J.LJI) {
            value = ((IHostSetting) C1161920gLG.LIZJ(IHostSetting.class)).ga1();
            if (value.length() == 0) {
                ((ISubscribeService) C1161920gLG.LIZJ(ISubscribeService.class)).ei().getClass();
                value = "aweme://webview?url=https%3A%2F%2Ffeedback.tiktokv.com%2Ffeedback%2Foffline%2Fsubmit%3Ftrans_status_bar%3D1%26hide_nav_bar%3D1%26use_spark%3D1%26container_color_auto_dark%3D1%26entrance%3Dsubscription_submit%26enter_from%3Dsubscription_submit%26_pia_%3D1%26version%3D1.0.0%26bdhm_bid%3Dcsp_im_inapp_hybrid";
            }
        } else {
            value = LiveCustomRechargeFeedbackUrlSetting.INSTANCE.getValue();
        }
        final Uri uriLIZLLL = LIZLLL(value, c1802410x0J, str3, str4, i, 0, 0, "", "unknown");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("displayAlertWithTitle(): uri=");
        sbLIZ.append(uriLIZLLL);
        C20441214yg.LIZIZ("RechargeExceptionUtils", C2188811AlT.LIZIZ(sbLIZ));
        C19GO c19go = new C19GO(context);
        c19go.LIZLLL = str;
        c19go.LJII = str2;
        c19go.LJ(i2, new DialogInterface.OnClickListener() { // from class: X.0x0c
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i3) {
                String message2;
                String str5;
                function2.invoke(context, uriLIZLLL);
                C1802410x0J c1802410x0J2 = c1802410x0J;
                if (c1802410x0J2.LJI) {
                    C1803800x2Y c1803800x2Y = C1803800x2Y.LIZ;
                    String str6 = c1802410x0J2.LJ;
                    Map<String, String> map = c1802410x0J2.LJII;
                    int i4 = i;
                    c1803800x2Y.getClass();
                    C1803800x2Y.LJIILL(i4, str6, "contact_us", map);
                } else {
                    C1803800x2Y c1803800x2Y2 = C1803800x2Y.LIZ;
                    int i5 = c1802410x0J2.LJFF;
                    String str7 = str4;
                    String str8 = str3;
                    String str9 = c1802410x0J2.LJ;
                    int i6 = c1802410x0J2.LIZIZ;
                    int i7 = c1802410x0J2.LIZJ;
                    int i8 = c1802410x0J2.LJIIIZ;
                    Exception exc = c1802410x0J2.LIZLLL;
                    if (exc == null || (message2 = exc.getMessage()) == null) {
                        message2 = "";
                    }
                    if (i2 == 2131851997) {
                        str5 = "contact_us";
                    } else {
                        str5 = "cancel";
                    }
                    C1803800x2Y.LJIIZILJ(c1803800x2Y2, i5, str7, str8, str9, i6, i7, i8, message2, str5, null, null, null, Boolean.FALSE, null, 24064);
                }
                if (i == 4005209) {
                    C1103870epd.LIZIZ("contact_us", "recharge", "room_recharge");
                }
                dialogInterface.dismiss();
            }
        }, false);
        c19go.LIZJ(2131851998, new DialogInterface.OnClickListener() { // from class: X.0x0d
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i3) {
                String message2;
                C1802410x0J c1802410x0J2 = c1802410x0J;
                if (c1802410x0J2.LJI) {
                    C1803800x2Y c1803800x2Y = C1803800x2Y.LIZ;
                    String str5 = c1802410x0J2.LJ;
                    Map<String, String> map = c1802410x0J2.LJII;
                    int i4 = i;
                    c1803800x2Y.getClass();
                    C1803800x2Y.LJIILL(i4, str5, "dismiss", map);
                } else {
                    C1803800x2Y c1803800x2Y2 = C1803800x2Y.LIZ;
                    int i5 = c1802410x0J2.LJFF;
                    String str6 = str4;
                    String str7 = str3;
                    String str8 = c1802410x0J2.LJ;
                    int i6 = c1802410x0J2.LIZIZ;
                    int i7 = c1802410x0J2.LIZJ;
                    int i8 = c1802410x0J2.LJIIIZ;
                    Exception exc = c1802410x0J2.LIZLLL;
                    if (exc == null || (message2 = exc.getMessage()) == null) {
                        message2 = "";
                    }
                    C1803800x2Y.LJIIZILJ(c1803800x2Y2, i5, str6, str7, str8, i6, i7, i8, message2, "cancel", null, null, null, null, null, 32256);
                }
                if (i == 4005209) {
                    C1103870epd.LIZIZ("dismiss", "recharge", "room_recharge");
                }
                dialogInterface.dismiss();
            }
        }, false);
        c19go.LJJIIJ = false;
        C500260Jjc.LJJLIIIJLLLLLLLZ(c19go.LIZ());
        if (i == 4005209) {
            C1103870epd.LIZJ(4005209, "recharge", "room_recharge");
        }
        if (c1802410x0J.LJI) {
            C1803800x2Y c1803800x2Y = C1803800x2Y.LIZ;
            String str5 = c1802410x0J.LJ;
            Map<String, String> map = c1802410x0J.LJII;
            c1803800x2Y.getClass();
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_abnormal_subscribe_popup");
            c474500IjALIZ.LJJII(str5, "fail_reason");
            c474500IjALIZ.LJJIIZI(map);
            c474500IjALIZ.LJJII(C1803800x2Y.LJIIL(null), "strategy_task_type");
            c474500IjALIZ.LJIL();
            c474500IjALIZ.LIZ();
            return;
        }
        C1803800x2Y c1803800x2Y2 = C1803800x2Y.LIZ;
        Integer numValueOf = Integer.valueOf(c1802410x0J.LJFF);
        String str6 = c1802410x0J.LJ;
        int i3 = c1802410x0J.LIZIZ;
        int i4 = c1802410x0J.LIZJ;
        int i5 = c1802410x0J.LJIIIZ;
        Exception exc = c1802410x0J.LIZLLL;
        if (exc == null || (message = exc.getMessage()) == null) {
            message = "";
        }
        C1803800x2Y.LJIJ(c1803800x2Y2, numValueOf, str4, str3, str6, "popup", i3, i4, i5, message, null, null, null, null, null, 32256);
    }

    public static Uri LIZLLL(String str, C1802410x0J c1802410x0J, String str2, String str3, int i, int i2, int i3, String str4, String str5) {
        boolean z;
        String roomStatus;
        Integer numValueOf;
        Uri uriLIZ;
        C495520Jby c495520Jby = new C495520Jby(str);
        if (c1802410x0J != null && c1802410x0J.LJI) {
            z = true;
        } else {
            z = false;
        }
        String str6 = "";
        if (z) {
            c495520Jby.LIZ(c1802410x0J.LJIIIIZZ, "trade_type");
        } else {
            c495520Jby.LIZ(i, "error_code");
            c495520Jby.LIZ(i2, "detail_error_code");
            c495520Jby.LIZ(i3, "internal_error_code");
            c495520Jby.LIZJ("fail_from", str3);
            c495520Jby.LIZJ("fail_reason", str2);
            if (c1802410x0J != null) {
                c495520Jby.LIZJ("charge_reason", c1802410x0J.LJ);
                c495520Jby.LIZ(c1802410x0J.LJFF, "package");
                c495520Jby.LIZ(c1802410x0J.LJIIIIZZ, "trade_type");
            }
            c495520Jby.LIZJ("request_page", str5);
            c495520Jby.LIZJ("error_message", str4);
            IGiftService iGiftService = (IGiftService) C1161920gLG.LIZJ(IGiftService.class);
            if (iGiftService == null || (roomStatus = iGiftService.getRoomStatus()) == null) {
                roomStatus = "";
            }
            c495520Jby.LIZJ(Scene.SCENE_SERVICE, roomStatus);
        }
        Uri uri = UriProtector.parse(c495520Jby.LIZLLL());
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "url");
        if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter != null) {
            str6 = strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter;
        }
        Uri uri2 = UriProtector.parse(str6);
        if (c1802410x0J != null && c1802410x0J.LJI) {
            uriLIZ = C500260Jjc.LJJJZ(C500260Jjc.LJJJZ(uri2, "trade_type", String.valueOf(c1802410x0J.LJIIIIZZ)), "faq_id", "7359100774900636165");
        } else {
            if (c1802410x0J != null) {
                numValueOf = Integer.valueOf(c1802410x0J.LJIIIIZZ);
            } else {
                numValueOf = null;
            }
            uriLIZ = C011H.LIZ(uri2, "trade_type", String.valueOf(numValueOf));
        }
        return C011H.LIZ(uri, "url", uriLIZ.toString());
    }
}
