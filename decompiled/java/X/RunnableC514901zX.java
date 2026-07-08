package X;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.livesdk.chatroom.ui.LivePlayFragment;
import com.bytedance.common.utility.Logger;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.01zX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class RunnableC514901zX implements Runnable {
    public final int $t;
    public Object l1;
    public String s0;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
            case 2:
                run$2(this);
                break;
            case 3:
                run$3(this);
                break;
            case 4:
                run$4(this);
                break;
            case 5:
                run$5(this);
                break;
            case 6:
                run$6(this);
                break;
            case 7:
                run$7(this);
                break;
            case 8:
                run$8(this);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                run$9(this);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                run$10(this);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                run$11(this);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                run$12(this);
                break;
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                run$13(this);
                break;
            case 14:
                run$14(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        String message;
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("p_s:");
        sbLIZ.append(this.s0);
        sbLIZ.append(": ");
        Function0 function0 = (Function0) this.l1;
        if (function0 != null) {
            try {
                message = (String) function0.invoke();
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                message = e.getMessage();
            }
        } else {
            message = null;
        }
        sbLIZ.append(message);
        C1720106oR.LJI("FCP_Component", C2188811AlT.LIZIZ(sbLIZ));
    }

    public final void LIZ$1() {
        String strSubstring = this.s0.substring(16);
        if (TextUtils.isEmpty(strSubstring)) {
            return;
        }
        if (!strSubstring.contains("show_entrance")) {
            C495520Jby c495520Jby = new C495520Jby(strSubstring);
            c495520Jby.LIZJ("show_entrance", "personal_profile_badge");
            strSubstring = c495520Jby.LIZLLL();
        }
        ((IActionHandlerService) C1161920gLG.LIZJ(IActionHandlerService.class)).handle(((LivePlayFragment) this.l1).getContext(), strSubstring);
    }

    public final void LIZ$2() {
        if (Intrinsics.LJFF(((C170300l3) this.l1).LIZIZ.get(this.s0), Boolean.TRUE)) {
            ((C170300l3) this.l1).LIZIZ.remove(this.s0);
            HashMap<String, String> map = ((C170300l3) this.l1).LIZ.get(this.s0);
            ((C170300l3) this.l1).LIZ.remove(this.s0);
            if (map != null) {
                String str = map.get(C170300l3.LIZLLL.get(this.s0));
                long j = str != null ? CastLongProtector.parseLong(str) : 0L;
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    map.put(entry.getKey(), String.valueOf(CastLongProtector.parseLong(entry.getValue()) - j));
                }
                C474500IjA c474500IjALIZ = C0IJT.LIZ(this.s0);
                c474500IjALIZ.LJJIIZI(map);
                c474500IjALIZ.LIZ();
            }
        }
    }

    public static final void run$0(RunnableC514901zX runnableC514901zX) {
        boolean zLIZ;
        C1C7U.LIZ("FeedComponentALog@504a.start$1");
        try {
            runnableC514901zX.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("FeedComponentALog@504a.start$1");
    }

    public static final void run$1(RunnableC514901zX runnableC514901zX) {
        boolean zLIZ;
        C1C7U.LIZ("ToastUtil@8bf.showToastInternal$1");
        try {
            C1389890mGx c1389890mGx = new C1389890mGx((C19EG) runnableC514901zX.l1);
            c1389890mGx.LJIIJ(runnableC514901zX.s0);
            c1389890mGx.LJIIJJI();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ToastUtil@8bf.showToastInternal$1");
    }

    public static final void run$10(RunnableC514901zX runnableC514901zX) {
        boolean zLIZ;
        C1C7U.LIZ("PromptFeedbackMonitor@81fa.sendMobOnEventV3Wrapper$1");
        try {
            C20684815ws.LJIILLIIL(runnableC514901zX.s0, (Map) ((Function0) runnableC514901zX.l1).invoke());
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("PromptFeedbackMonitor@81fa.sendMobOnEventV3Wrapper$1");
    }

    public static final void run$11(RunnableC514901zX runnableC514901zX) {
        boolean zLIZ;
        C1C7U.LIZ("MusicChartSearchBannerLifecycleProvider@eb14.reportEvent$1");
        try {
            C20684815ws.LJIILLIIL(runnableC514901zX.s0, (Map) runnableC514901zX.l1);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("MusicChartSearchBannerLifecycleProvider@eb14.reportEvent$1");
    }

    public static final void run$12(RunnableC514901zX runnableC514901zX) {
        boolean zLIZ;
        C1C7U.LIZ("MusicChartSearchBannerViewProvider@a02.reportEvent$1");
        try {
            C20684815ws.LJIILLIIL(runnableC514901zX.s0, (Map) runnableC514901zX.l1);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("MusicChartSearchBannerViewProvider@a02.reportEvent$1");
    }

    public static final void run$13(RunnableC514901zX runnableC514901zX) {
        boolean zLIZ;
        C1C7U.LIZ("RecommendInstantFeedMob@4c31.asyncReportEvent$1");
        try {
            C20684815ws.LJIJ(runnableC514901zX.s0, (JSONObject) runnableC514901zX.l1);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("RecommendInstantFeedMob@4c31.asyncReportEvent$1");
    }

    public static final void run$14(RunnableC514901zX runnableC514901zX) {
        boolean zLIZ;
        C1C7U.LIZ("BulletinCommentExceptionUtils@c669.displayToast$1");
        try {
            try {
                Activity activityLIZ = C1388190mED.LIZ((Context) runnableC514901zX.l1);
                if (activityLIZ != null) {
                    String str = runnableC514901zX.s0;
                    C1389890mGx c1389890mGx = new C1389890mGx(activityLIZ);
                    c1389890mGx.LJIIJ(str);
                    c1389890mGx.LJIIJJI();
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                Logger.throwException(e);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("BulletinCommentExceptionUtils@c669.displayToast$1");
    }

    public static final void run$2(RunnableC514901zX runnableC514901zX) {
        boolean zLIZ;
        C1C7U.LIZ("LiveCenterContainerView@7876.dataChannel$4$1");
        try {
            ((IActionHandlerService) C1161920gLG.LIZJ(IActionHandlerService.class)).handle(((C782390Umb) runnableC514901zX.l1).getContext(), runnableC514901zX.s0);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("LiveCenterContainerView@7876.dataChannel$4$1");
    }

    public static final void run$3(RunnableC514901zX runnableC514901zX) {
        boolean zLIZ;
        C1C7U.LIZ("LivePlayFragment@afba.handleFansClubBadgeClickAction$1");
        try {
            runnableC514901zX.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("LivePlayFragment@afba.handleFansClubBadgeClickAction$1");
    }

    public static final void run$4(RunnableC514901zX runnableC514901zX) {
        boolean zLIZ;
        C1C7U.LIZ("LiveTimeRecordEventTrack@d6dc.reportRecord$1");
        try {
            runnableC514901zX.LIZ$2();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("LiveTimeRecordEventTrack@d6dc.reportRecord$1");
    }

    public static final void run$5(RunnableC514901zX runnableC514901zX) {
        boolean zLIZ;
        C1C7U.LIZ("PerformanceActivityAssem@39b8.updateScrollTrackInfo$1$onEventTrack$1");
        try {
            C20684815ws.LJIJ(runnableC514901zX.s0, (JSONObject) runnableC514901zX.l1);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("PerformanceActivityAssem@39b8.updateScrollTrackInfo$1$onEventTrack$1");
    }

    public static final void run$6(RunnableC514901zX runnableC514901zX) {
        boolean zLIZ;
        C1C7U.LIZ("PostModeLogUtil@6651.log$1");
        try {
            C20684815ws.LJIILLIIL(runnableC514901zX.s0, ((C2344009Gk) runnableC514901zX.l1).LIZ);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("PostModeLogUtil@6651.log$1");
    }

    public static final void run$7(RunnableC514901zX runnableC514901zX) {
        boolean zLIZ;
        C1C7U.LIZ("IAPGoogleUnavailableHandler@5cf2.getGoogleUnavailableDialog$content$1$onReplaceItemClick$2");
        try {
            ((IActionHandlerService) C1161920gLG.LIZJ(IActionHandlerService.class)).handle((Context) runnableC514901zX.l1, runnableC514901zX.s0);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("IAPGoogleUnavailableHandler@5cf2.getGoogleUnavailableDialog$content$1$onReplaceItemClick$2");
    }

    public static final void run$8(RunnableC514901zX runnableC514901zX) {
        boolean zLIZ;
        C1C7U.LIZ("IAPPaymentTimeOutHandler@7f15.getButtonActionGroup$1$1");
        try {
            try {
                ((IActionHandlerService) C1161920gLG.LIZJ(IActionHandlerService.class)).handle((Context) runnableC514901zX.l1, runnableC514901zX.s0);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("IAPPaymentTimeOutHandler@7f15.getButtonActionGroup$1$1");
    }

    public static final void run$9(RunnableC514901zX runnableC514901zX) {
        boolean zLIZ;
        C1C7U.LIZ("IAPPendingOrderHandler@e4a3.getPendingPurchaseDialog$replaceListener$1$onReplaceItemClick$2");
        try {
            ((IActionHandlerService) C1161920gLG.LIZJ(IActionHandlerService.class)).handle((Context) runnableC514901zX.l1, runnableC514901zX.s0);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("IAPPendingOrderHandler@e4a3.getPendingPurchaseDialog$replaceListener$1$onReplaceItemClick$2");
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public RunnableC514901zX(java.util.Map r3, int r4) {
        /*
            r2 = this;
            r2.$t = r4
            int r4 = 11 - r4
            if (r4 == 0) goto L11
            r1 = r2
            java.lang.String r0 = "trending_words_click"
            r1.s0 = r0
            r1.l1 = r3
        Ld:
            r1.<init>()
            return
        L11:
            r1 = r2
            java.lang.String r0 = "trending_words_show"
            r1.s0 = r0
            r1.l1 = r3
            goto Ld
        */
        throw new UnsupportedOperationException("Method not decompiled: X.RunnableC514901zX.<init>(java.util.Map, int):void");
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public RunnableC514901zX(org.json.JSONObject r3, int r4) {
        /*
            r2 = this;
            r2.$t = r4
            int r4 = 5 - r4
            if (r4 == 0) goto L11
            r1 = r2
            java.lang.String r0 = "auto_refresh_homepage"
            r1.s0 = r0
            r1.l1 = r3
        Ld:
            r1.<init>()
            return
        L11:
            r1 = r2
            java.lang.String r0 = "scroll_tracker"
            r1.s0 = r0
            r1.l1 = r3
            goto Ld
        */
        throw new UnsupportedOperationException("Method not decompiled: X.RunnableC514901zX.<init>(org.json.JSONObject, int):void");
    }

    public RunnableC514901zX(C170300l3 c170300l3, int i) {
        this.$t = i;
        this.l1 = c170300l3;
        this.s0 = "push_cold_start";
    }

    public RunnableC514901zX(Object obj, String str, int i) {
        this.$t = i;
        this.l1 = obj;
        this.s0 = str;
    }
}
