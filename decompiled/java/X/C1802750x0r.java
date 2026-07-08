package X;

import Y.ACListenerS91S0300000_27;
import android.content.Context;
import android.content.DialogInterface;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.live.wallet.model.recharge.RechargeRequestParams;
import com.bytedance.android.livesdk.livesetting.wallet.LiveCustomRechargeFeedbackUrlSetting;
import com.bytedance.android.livesdk.livesetting.wallet.LiveRechargePaymentTimeOutExperiment;
import com.bytedance.android.livesdk.livesetting.wallet.LiveWalletRechargeCancelRetentionConfig;
import com.bytedance.android.livesdk.wallet.Diamond;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.zhiliaoapp.musically.R;
import java.util.Locale;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0x0r, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1802750x0r extends AbstractC1802540x0W {
    @Override // X.AbstractC1802540x0W
    public final C1802630x0f LIZIZ(final Context context, final C1797250wrz c1797250wrz) {
        long jLongValue;
        boolean zLIZ;
        C753450Th1 c753450Th1;
        final boolean z;
        int i;
        if (context == null) {
            return C1802640x0g.LIZ();
        }
        if (LiveRechargePaymentTimeOutExperiment.INSTANCE.getValue() && c1797250wrz.LIZ == 206) {
            Long l = c1797250wrz.LJIIJJI;
            if (l != null) {
                jLongValue = l.longValue();
            } else {
                jLongValue = 0;
            }
            if (jLongValue > LiveWalletRechargeCancelRetentionConfig.INSTANCE.getValue().paymentCancelMaxDuration * LSPassThroughRecordSizeConfig.DEFAULT) {
                C782110Um9 c782110Um9 = new C782110Um9(context);
                try {
                    zLIZ = new C815520Vyw(context).LIZ();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    zLIZ = false;
                }
                if (!zLIZ) {
                    C753460Th2 c753460Th2 = new C753460Th2();
                    c753460Th2.LIZLLL = R.attr.ey7;
                    c753460Th2.LIZ = C497740JfY.LJIJI(2131856844);
                    c753460Th2.LIZIZ = new ACListenerS91S0300000_27(context, this, c1797250wrz, 5);
                    c753450Th1 = new C753450Th1(c753460Th2);
                } else if (!((IWalletService) C1161920gLG.LIZJ(IWalletService.class)).walletCenter().Aj1()) {
                    C753460Th2 c753460Th22 = new C753460Th2();
                    c753460Th22.LIZLLL = R.attr.ey7;
                    c753460Th22.LIZ = C497740JfY.LJIJI(2131856845);
                    c753460Th22.LIZIZ = new ACListenerS91S0300000_27(context, this, c1797250wrz, 6);
                    c753450Th1 = new C753450Th1(c753460Th22);
                } else {
                    c753450Th1 = null;
                }
                if (c753450Th1 != null) {
                    z = true;
                    i = 2131853017;
                } else {
                    z = false;
                    i = 2131853018;
                }
                c782110Um9.LJIILL = false;
                c782110Um9.LJIIZILJ(2131853019);
                c782110Um9.LJII(i);
                C494720Jag c494720Jag = new C494720Jag();
                C755620TkW c755620TkW = new C755620TkW();
                c755620TkW.LIZ = C497740JfY.LJIJI(2131853016);
                c755620TkW.LIZJ = new InterfaceC743640TFa() { // from class: X.0x0o
                    @Override // X.InterfaceC743640TFa
                    public final void LIZ(LiveDialog liveDialog) {
                        C1802750x0r c1802750x0r = this.LIZ;
                        C1797250wrz c1797250wrz2 = c1797250wrz;
                        boolean z2 = z;
                        c1802750x0r.getClass();
                        C1802750x0r.LIZJ(c1797250wrz2, "learn_more", z2);
                        C786410Ut5.LJLIIL(500L, C820670WHh.LIZ, new RunnableC514901zX(context, new C495520Jby(c1797250wrz) { // from class: X.0x0b
                            {
                                String str;
                                String roomStatus;
                                String message;
                                String str2;
                                Diamond diamond;
                                super(LiveCustomRechargeFeedbackUrlSetting.INSTANCE.getValue());
                                LIZ(c1797250wrz.LIZ, "error_Code");
                                LIZ(c1797250wrz.LIZIZ, "detail_error_Code");
                                LIZ(c1797250wrz.LJI, "internal_error_code");
                                LIZJ("fail_from", "google-apple");
                                LIZJ("fail_reason", "pay");
                                RechargeRequestParams rechargeRequestParams = c1797250wrz.LJII;
                                Integer numValueOf = null;
                                if (rechargeRequestParams != null) {
                                    str = rechargeRequestParams.chargeReason;
                                } else {
                                    str = null;
                                }
                                String str3 = "";
                                LIZJ("charge_reason", str == null ? "" : str);
                                RechargeRequestParams rechargeRequestParams2 = c1797250wrz.LJII;
                                if (rechargeRequestParams2 != null && (diamond = rechargeRequestParams2.diamond) != null) {
                                    numValueOf = Integer.valueOf(diamond.count);
                                }
                                LIZJ("package", String.valueOf(numValueOf));
                                RechargeRequestParams rechargeRequestParams3 = c1797250wrz.LJII;
                                LIZJ("request_page", (rechargeRequestParams3 == null || (str2 = rechargeRequestParams3.requestPage) == null) ? "" : str2);
                                LIZ(0, "trade_type");
                                Exception exc = c1797250wrz.LIZJ;
                                LIZJ("error_message", (exc == null || (message = exc.getMessage()) == null) ? "" : message);
                                IGiftService iGiftService = (IGiftService) C1161920gLG.LIZJ(IGiftService.class);
                                if (iGiftService != null && (roomStatus = iGiftService.getRoomStatus()) != null) {
                                    str3 = roomStatus;
                                }
                                LIZJ(Scene.SCENE_SERVICE, str3);
                            }
                        }.LIZLLL(), 8));
                        liveDialog.dismiss();
                    }
                };
                c494720Jag.LIZ(new C0TZ2(c755620TkW));
                C755630TkX c755630TkX = new C755630TkX();
                c755630TkX.LIZ = C497740JfY.LJIJI(2131853015);
                c755630TkX.LIZJ = new InterfaceC743640TFa() { // from class: X.0x0q
                    @Override // X.InterfaceC743640TFa
                    public final void LIZ(LiveDialog liveDialog) {
                        C1802750x0r c1802750x0r = this.LIZ;
                        C1797250wrz c1797250wrz2 = c1797250wrz;
                        boolean z2 = z;
                        c1802750x0r.getClass();
                        C1802750x0r.LIZJ(c1797250wrz2, "cancel", z2);
                        liveDialog.dismiss();
                    }
                };
                c494720Jag.LIZ(new C0TZ3(c755630TkX));
                c494720Jag.LIZIZ = 1;
                c782110Um9.LIZJ(new C494730Jah(c494720Jag));
                c782110Um9.LJIIZILJ = new DialogInterface.OnShowListener() { // from class: X.0x0s
                    @Override // android.content.DialogInterface.OnShowListener
                    public final void onShow(DialogInterface dialogInterface) {
                        C1802750x0r c1802750x0r = this.LL;
                        C1797250wrz c1797250wrz2 = c1797250wrz;
                        boolean z2 = z;
                        c1802750x0r.getClass();
                        C1802750x0r.LIZJ(c1797250wrz2, null, z2);
                    }
                };
                c782110Um9.LJIJJ = c753450Th1;
                C786410Ut5.E4(c782110Um9.LIZ());
                return C1802640x0g.LIZIZ();
            }
        }
        return C1802640x0g.LIZ();
    }

    public static void LIZJ(C1797250wrz c1797250wrz, String str, boolean z) {
        String str2;
        String str3;
        String lowerCase;
        Integer numValueOf;
        Diamond diamond;
        String str4;
        String lowerCase2;
        String str5;
        if (str == null) {
            str2 = "livesdk_payment_timeout_popup_show";
        } else {
            str2 = "livesdk_payment_timeout_popup_click";
        }
        Pair[] pairArr = new Pair[6];
        if (z) {
            str3 = "1";
        } else {
            str3 = CardStruct.IStatusCode.DEFAULT;
        }
        pairArr[0] = new Pair("has_push_opt_in_guide", str3);
        RechargeRequestParams rechargeRequestParams = c1797250wrz.LJII;
        Map<String, String> map = null;
        if (rechargeRequestParams != null && (str5 = rechargeRequestParams.chargeReason) != null) {
            lowerCase = str5.toLowerCase(Locale.ROOT);
        } else {
            lowerCase = null;
        }
        String str6 = "";
        if (lowerCase == null) {
            lowerCase = "";
        }
        pairArr[1] = new Pair("charge_reason", lowerCase);
        RechargeRequestParams rechargeRequestParams2 = c1797250wrz.LJII;
        if (rechargeRequestParams2 != null && (str4 = rechargeRequestParams2.requestPage) != null && (lowerCase2 = str4.toLowerCase(Locale.ROOT)) != null) {
            str6 = lowerCase2;
        }
        pairArr[2] = new Pair("request_page", str6);
        pairArr[3] = new Pair("preview_type", "click");
        RechargeRequestParams rechargeRequestParams3 = c1797250wrz.LJII;
        if (rechargeRequestParams3 != null && (diamond = rechargeRequestParams3.diamond) != null) {
            numValueOf = Integer.valueOf(diamond.count);
        } else {
            numValueOf = null;
        }
        pairArr[4] = new Pair("recharge_package", String.valueOf(numValueOf));
        pairArr[5] = new Pair("popup_show_duration", String.valueOf(c1797250wrz.LJIIJJI));
        Map mapLJIIJ = C2097608Jq.LJIIJ(pairArr);
        if (str != null) {
            mapLJIIJ.put("click_area", str);
        }
        mapLJIIJ.putAll(c1797250wrz.LJIIIZ);
        C474500IjA c474500IjALIZ = C0IJT.LIZ(str2);
        c474500IjALIZ.LJJIIZI(mapLJIIJ);
        C1802410x0J c1802410x0J = c1797250wrz.LJIIIIZZ;
        if (c1802410x0J != null) {
            map = c1802410x0J.LJII;
        }
        c474500IjALIZ.LJJIIZI(map);
        c474500IjALIZ.LIZ();
    }
}
