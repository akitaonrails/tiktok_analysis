package X;

import android.content.Context;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.live.wallet.model.recharge.RechargeRequestParams;
import com.bytedance.android.livesdk.livesetting.wallet.LiveRechargeCancelRetentionExperiment;
import com.bytedance.android.livesdk.livesetting.wallet.LiveWalletFESchema;
import com.bytedance.android.livesdk.livesetting.wallet.LiveWalletRechargeCancelRetentionConfig;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;
import webcast.data.RechargeRetentionPopupConfig;

/* JADX INFO: renamed from: X.0x0t, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1802770x0t implements InterfaceC1797320ws6 {
    public static final C1802770x0t LIZ = new C1802770x0t();

    public static boolean LIZIZ(Context context, final C1803370x1r c1803370x1r) {
        if (!LIZJ(c1803370x1r.LIZ, c1803370x1r.LJIIJJI)) {
            return false;
        }
        final boolean zLIZ = C1804000x2s.LIZ(context);
        ((IActionHandlerService) C1161920gLG.LIZJ(IActionHandlerService.class)).handle(context, UriProtector.parse(new C495520Jby(c1803370x1r, zLIZ) { // from class: X.0x1p
            public final C1803370x1r LIZLLL;
            public final String LJ;
            public final String LJFF;
            public final String LJI;
            public final String LJII;
            public final String LJIIIIZZ;
            public final String LJIIIZ;
            public final String LJIIJ;
            public final String LJIIJJI;
            public final String LJIIL;
            public final String LJIILIIL;

            public final void LJFF() throws JSONException {
                JSONObject jSONObject = new JSONObject(this.LIZLLL.LJIILIIL);
                RechargeRequestParams rechargeRequestParams = this.LIZLLL.LJIIL;
                if (rechargeRequestParams != null) {
                    LJ(jSONObject, this.LJI, rechargeRequestParams.chargeReason);
                    LJ(jSONObject, this.LJII, rechargeRequestParams.requestPage);
                }
                LJ(jSONObject, this.LJFF, 1);
                LJ(jSONObject, this.LJIIIIZZ, Integer.valueOf(this.LIZLLL.LJ));
                LJ(jSONObject, this.LJIIIZ, this.LIZLLL.LJI ? "click" : "call");
                LJ(jSONObject, this.LJIIJ, (Intrinsics.LJFF(this.LIZLLL.LIZIZ, "FirstRechargePanel_Native") ? "FIRST_CHARGE" : "NORMAL").toLowerCase(Locale.ROOT));
                String str = this.LJIIJJI;
                int i = C1802780x0u.LIZ[this.LIZLLL.LIZ.ordinal()];
                LJ(jSONObject, str, i != 1 ? i != 2 ? "" : "recharge_cancel_retention" : "payment_cancel_retention");
                C1126800fQc.LIZ.M92();
                LJ(jSONObject, this.LJIILIIL, C1133940fc8.LJIIJJI() ? "1" : CardStruct.IStatusCode.DEFAULT);
                Integer num = this.LIZLLL.LJII;
                if (num != null) {
                    LJ(jSONObject, this.LJIIL, Integer.valueOf(num.intValue()));
                }
                LIZJ(this.LJ, C786410Ut5.J3(jSONObject));
            }

            {
                super(LiveWalletFESchema.INSTANCE.getCancelRetentionPopUpSchema());
                this.LIZLLL = c1803370x1r;
                this.LJ = "et_params";
                this.LJFF = "from_cancel_popup";
                this.LJI = "charge_reason";
                this.LJII = "request_page";
                this.LJIIIIZZ = "recharge_package";
                this.LJIIIZ = "preview_type";
                this.LJIIJ = "panel_type";
                this.LJIIJJI = "popup_trigger_point";
                this.LJIIL = "gift_id";
                this.LJIILIIL = "is_first_recharge";
                LIZJ("dialog_type", c1803370x1r.LIZJ);
                LIZ(c1803370x1r.LIZ.getValue(), "cancel_entrance");
                LIZJ("recharge_entrance", c1803370x1r.LIZIZ);
                LIZ(c1803370x1r.LJ, "package_coins");
                LIZIZ(c1803370x1r.LIZLLL, "show_duration_start_anchor");
                LIZJ("payment_amount", c1803370x1r.LJFF);
                if (C500260Jjc.LJJIIZ(c1803370x1r.LJIIIIZZ) && c1803370x1r.LJIIIZ != null) {
                    LIZJ("gift_name", c1803370x1r.LJIIIIZZ);
                    LIZ(C01CL.LIZLLL(c1803370x1r.LJIIIZ), "short_coins");
                }
                if (C500260Jjc.LJJIIZ(c1803370x1r.LJIIJ)) {
                    LIZJ("customized_content", c1803370x1r.LJIIJ);
                }
                RechargeRequestParams rechargeRequestParams = c1803370x1r.LJIIL;
                if (rechargeRequestParams != null) {
                    LIZJ("retry_create_order_params", C1516000pYM.LIZJ(rechargeRequestParams));
                }
                if (zLIZ) {
                    LIZJ("landscape_width", "100%");
                }
                LJFF();
                LJFF();
            }

            public static void LJ(JSONObject jSONObject, String str, Object obj) throws JSONException {
                if (jSONObject.has(str)) {
                    return;
                }
                jSONObject.put(str, obj);
            }
        }.LIZLLL()));
        return true;
    }

    public static boolean LIZJ(EnumC1802790x0v enumC1802790x0v, long j) {
        boolean zBooleanValue;
        RechargeRetentionPopupConfig.EventInfo eventInfo;
        boolean z;
        boolean z2;
        Map<String, RechargeRetentionPopupConfig.EventInfo> mapLIZ;
        Boolean boolLIZ = C0U53.Rd.LIZ();
        if (boolLIZ != null) {
            zBooleanValue = boolLIZ.booleanValue();
        } else {
            zBooleanValue = true;
        }
        RechargeRetentionPopupConfig.EventInfo eventInfo2 = null;
        try {
            mapLIZ = C0U53.Sd.LIZ();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        if (mapLIZ != null) {
            eventInfo = mapLIZ.get("show");
        } else {
            eventInfo = null;
        }
        try {
            Map<String, RechargeRetentionPopupConfig.EventInfo> mapLIZ2 = C0U53.Sd.LIZ();
            if (mapLIZ2 != null) {
                eventInfo2 = mapLIZ2.get("cancel");
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (eventInfo != null) {
            if (eventInfo.currentCount <= eventInfo.maxCount && jCurrentTimeMillis - eventInfo.latestTimestamp > eventInfo.windowDurationDays * 86400000) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (zBooleanValue && z2) {
                zBooleanValue = true;
            } else {
                zBooleanValue = false;
            }
        }
        if (eventInfo2 != null && eventInfo2.currentCount >= eventInfo2.maxCount) {
            if (jCurrentTimeMillis - eventInfo2.latestTimestamp > eventInfo2.windowDurationDays * 86400000) {
                z = true;
            } else {
                z = false;
            }
            if (zBooleanValue && z) {
                zBooleanValue = true;
            } else {
                zBooleanValue = false;
            }
        }
        if (enumC1802790x0v == EnumC1802790x0v.CANCEL_PAYMENT) {
            if (zBooleanValue && LiveRechargeCancelRetentionExperiment.INSTANCE.enableCancelRetentionForPaymentCancel() && j < LiveWalletRechargeCancelRetentionConfig.INSTANCE.getValue().paymentCancelMaxDuration * LSPassThroughRecordSizeConfig.DEFAULT) {
                zBooleanValue = true;
            } else {
                zBooleanValue = false;
            }
        }
        if (enumC1802790x0v == EnumC1802790x0v.EXIT_RECHARGE_PANEL) {
            if (zBooleanValue && LiveRechargeCancelRetentionExperiment.INSTANCE.enableCancelRetentionForExitRechargePage()) {
                return true;
            }
            return false;
        }
        return zBooleanValue;
    }

    @Override // X.InterfaceC1797320ws6
    public final InterfaceC1797280ws2 LIZ(Context context, InterfaceC1151090g3n interfaceC1151090g3n, String str) {
        C1803370x1r c1803370x1r;
        Integer numValueOf;
        String str2;
        if (context == null) {
            return C1802640x0g.LIZ();
        }
        if (interfaceC1151090g3n instanceof C1797250wrz) {
            C1797250wrz c1797250wrz = (C1797250wrz) interfaceC1151090g3n;
            if (c1797250wrz.LIZ == 206 && (c1803370x1r = c1797250wrz.LJIIJ) != null) {
                if (!LIZIZ(context, c1803370x1r)) {
                    C786410Ut5.LJJZZIII(C820670WHh.LIZ, new Runnable() { // from class: X.00kO
                        @Override // java.lang.Runnable
                        public final void run() {
                            boolean zLIZ;
                            C1C7U.LIZ("RechargeCancelHandler@96f6.handleCancelToast$1");
                            try {
                                C766270U4b.LJIIJJI(C497740JfY.LJIJI(2131843724));
                            } finally {
                                if (!zLIZ) {
                                }
                            }
                            C1C7U.LIZIZ("RechargeCancelHandler@96f6.handleCancelToast$1");
                        }
                    });
                    C1803800x2Y c1803800x2Y = C1803800x2Y.LIZ;
                    RechargeRequestParams rechargeRequestParams = c1803370x1r.LJIIL;
                    if (rechargeRequestParams != null) {
                        numValueOf = Integer.valueOf(rechargeRequestParams.diamondCount);
                    } else {
                        numValueOf = null;
                    }
                    RechargeRequestParams rechargeRequestParams2 = c1803370x1r.LJIIL;
                    if (rechargeRequestParams2 != null) {
                        str2 = rechargeRequestParams2.chargeReason;
                    } else {
                        str2 = null;
                    }
                    C1803800x2Y.LJIJ(c1803800x2Y, numValueOf, null, null, str2, "toast", 206, 0, 0, "", null, null, null, null, null, 24070);
                }
                return C1802640x0g.LIZIZ();
            }
        }
        return C1802640x0g.LIZ();
    }
}
