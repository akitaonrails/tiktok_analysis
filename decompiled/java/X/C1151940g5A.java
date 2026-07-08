package X;

import Y.ACListenerS152S0100000_17;
import Y.ARunnableS117S0100000_17;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.android.live.browser.IHybridPerformanceService;
import com.bytedance.android.live.gift.GiftLimitNotificationEvent;
import com.bytedance.android.live.gift.IGiftReminderService;
import com.bytedance.android.livesdk.chatroom.viewmodule.BroadcastPreviewBannerWidget;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.guide.GiftGuideWidget;
import com.bytedance.android.livesdk.impl.revenue.goodybag.widget.GoodyBagWidget;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveQuizContainerOptSetting;
import com.bytedance.android.livesdk.quiz.ActQuizWidget;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.lynx.hybrid.webkit.WebKitView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.internal.AwS418S0200000_17;
import kotlin.jvm.internal.AwS561S0100000_17;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0g5A, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public class C1151940g5A extends AbstractC1542200qEc {
    public final int $t;
    public Object l0;

    public static final void LJLIIIL$4(C1151940g5A c1151940g5A, InterfaceC1541990qEH interfaceC1541990qEH) {
    }

    public static final void LJLIIL$3(C1151940g5A c1151940g5A, InterfaceC1541990qEH interfaceC1541990qEH, String str) {
    }

    @Override // X.AbstractC1537870q7d
    public final void LJL(InterfaceC1541990qEH interfaceC1541990qEH, String str, C1542120qEU c1542120qEU) {
        switch (this.$t) {
            case 0:
                LJL$0(this, interfaceC1541990qEH, str, c1542120qEU);
                break;
            case 4:
                LJL$1(this, interfaceC1541990qEH, str, c1542120qEU);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                LJL$2(this, interfaceC1541990qEH, str, c1542120qEU);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                LJL$3(this, interfaceC1541990qEH, str, c1542120qEU);
                break;
            default:
                super.LJL(interfaceC1541990qEH, str, c1542120qEU);
                break;
        }
    }

    @Override // X.AbstractC1537870q7d
    public final void LJLI(InterfaceC1541990qEH interfaceC1541990qEH, String str, String str2) {
        switch (this.$t) {
            case 1:
                LJLI$0(this, interfaceC1541990qEH, str, str2);
                break;
            case 2:
                LJLI$1(this, interfaceC1541990qEH, str, str2);
                break;
            case 6:
                LJLI$2(this, interfaceC1541990qEH, str, str2);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                LJLI$3(this, interfaceC1541990qEH, str, str2);
                break;
            default:
                super.LJLI(interfaceC1541990qEH, str, str2);
                break;
        }
    }

    @Override // X.AbstractC1537870q7d
    public final void LJLIIIL(InterfaceC1541990qEH interfaceC1541990qEH) throws JSONException {
        switch (this.$t) {
            case 0:
                C20441214yg.LJIIIZ("EOYQuiz", "spark container onLoadFinish");
                break;
            case 1:
                LJLIIIL$1(this, interfaceC1541990qEH);
                break;
            case 2:
                LJLIIIL$2(this, interfaceC1541990qEH);
                break;
            case 3:
                LJLIIIL$3(this, interfaceC1541990qEH);
                break;
            case 4:
                LJLIIIL$4(this, interfaceC1541990qEH);
                break;
            case 5:
                LJLIIIL$5(this, interfaceC1541990qEH);
                break;
            case 6:
                C20441214yg.LIZIZ("GiftGuideLynx", "lynx load finish");
                break;
            case 7:
            case 8:
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
            default:
                super.LJLIIIL(interfaceC1541990qEH);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                LJLIIIL$7(this, interfaceC1541990qEH);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                LJLIIIL$8(this, interfaceC1541990qEH);
                break;
        }
    }

    @Override // X.AbstractC1537870q7d
    public final void LJLIIL(InterfaceC1541990qEH interfaceC1541990qEH, String str) {
        switch (this.$t) {
            case 0:
                C20441214yg.LJIIIZ("EOYQuiz", "spark container onLoadStart");
                break;
            case 1:
                LJLIIL$1(this, interfaceC1541990qEH, str);
                break;
            case 2:
                LJLIIL$2(this, interfaceC1541990qEH, str);
                break;
            case 3:
            case 5:
            case 6:
            case 7:
            case 8:
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
            default:
                super.LJLIIL(interfaceC1541990qEH, str);
                break;
            case 4:
                LJLIIL$3(this, interfaceC1541990qEH, str);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                LJLIIL$4(this, interfaceC1541990qEH, str);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                LJLIIL$5(this, interfaceC1541990qEH, str);
                break;
        }
    }

    @Override // X.AbstractC1537870q7d
    public final void LJLJI(InterfaceC1541990qEH interfaceC1541990qEH) {
        if (3 - this.$t != 0) {
            super.LJLJI(interfaceC1541990qEH);
        } else {
            LJLJI$0(this, interfaceC1541990qEH);
        }
    }

    @Override // X.AbstractC1542100qES
    public final void LJLLJ(SparkContext sparkContext, C1548490qOl c1548490qOl) {
        if (this.$t != 0) {
            super.LJLLJ(sparkContext, c1548490qOl);
        } else {
            LJLLJ$0(this, sparkContext, c1548490qOl);
        }
    }

    @Override // X.AbstractC1537870q7d
    public final void onDestroy() {
        switch (this.$t) {
            case 7:
                onDestroy$0(this);
                break;
            case 8:
                onDestroy$1(this);
                break;
            default:
                super.onDestroy();
                break;
        }
    }

    public static final void onDestroy$0(C1151940g5A c1151940g5A) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onGoodyBagDialogDismiss,datachannel==>");
        sbLIZ.append(((GoodyBagWidget) c1151940g5A.l0).dataChannel);
        C20441214yg.LIZIZ("GoodyBagWidget", C2188811AlT.LIZIZ(sbLIZ));
        ((IGiftReminderService) C1161920gLG.LIZJ(IGiftReminderService.class)).tt2(3);
        DataChannel dataChannel = ((GoodyBagWidget) c1151940g5A.l0).dataChannel;
        if (dataChannel != null) {
            dataChannel.LC0(GiftLimitNotificationEvent.class, Boolean.valueOf(((IGiftReminderService) C1161920gLG.LIZJ(IGiftReminderService.class)).TM0()));
        }
    }

    public static final void onDestroy$1(C1151940g5A c1151940g5A) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onGoodyBagDialogDismiss,datachannel==>");
        sbLIZ.append(((GoodyBagWidget) c1151940g5A.l0).dataChannel);
        C20441214yg.LIZIZ("GoodyBagWidget", C2188811AlT.LIZIZ(sbLIZ));
        ((IGiftReminderService) C1161920gLG.LIZJ(IGiftReminderService.class)).tt2(3);
        DataChannel dataChannel = ((GoodyBagWidget) c1151940g5A.l0).dataChannel;
        if (dataChannel != null) {
            dataChannel.LC0(GiftLimitNotificationEvent.class, Boolean.valueOf(((IGiftReminderService) C1161920gLG.LIZJ(IGiftReminderService.class)).TM0()));
        }
    }

    public C1151940g5A(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void LJLIIIL$1(C1151940g5A c1151940g5A, InterfaceC1541990qEH interfaceC1541990qEH) throws JSONException {
        BroadcastPreviewBannerWidget broadcastPreviewBannerWidget = (BroadcastPreviewBannerWidget) c1151940g5A.l0;
        boolean zLJFF = Intrinsics.LJFF(broadcastPreviewBannerWidget.LLJJ.get(broadcastPreviewBannerWidget.LLILZIL), Boolean.FALSE);
        broadcastPreviewBannerWidget.LLJJ.put(broadcastPreviewBannerWidget.LLILZIL, Boolean.TRUE);
        String strLJIIIIZZ = C2348809Ig.LJIIIIZZ(broadcastPreviewBannerWidget.LLJJIII);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("data", strLJIIIIZZ);
        jSONObject.put("type", "init");
        jSONObject.put("need_report", zLJFF);
        jSONObject.put("live_type", broadcastPreviewBannerWidget.LLILZIL);
        interfaceC1541990qEH.LIZ("H5_roomStatusChange", jSONObject);
        C1097990eg9 c1097990eg9 = C1097990eg9.LIZ;
        C1097990eg9.LIZIZ().LJIIJ = System.currentTimeMillis();
        c1097990eg9.LJFF();
    }

    public static final void LJLIIIL$2(C1151940g5A c1151940g5A, InterfaceC1541990qEH interfaceC1541990qEH) {
        C1097950eg5 c1097950eg5 = (C1097950eg5) c1151940g5A.l0;
        c1097950eg5.LLIZ = false;
        try {
            String strLJIIIIZZ = C2348809Ig.LJIIIIZZ(c1097950eg5.LLILZ);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("data", strLJIIIIZZ);
            jSONObject.put("type", "init");
            jSONObject.put("need_report", c1097950eg5.LLIZ);
            jSONObject.put("live_type", LiveMode.VIDEO.logStreamingType);
            interfaceC1541990qEH.LIZ("H5_roomStatusChange", jSONObject);
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        C1097990eg9 c1097990eg9 = C1097990eg9.LIZ;
        C1097990eg9.LIZIZ().LJIIJ = System.currentTimeMillis();
        c1097990eg9.LJFF();
    }

    public static final void LJLIIIL$3(C1151940g5A c1151940g5A, InterfaceC1541990qEH interfaceC1541990qEH) {
        if ((interfaceC1541990qEH instanceof WebKitView) && ((WebKitView) interfaceC1541990qEH).canGoBack()) {
            C786410Ut5.LJLLLLLL(0, (View) c1151940g5A.l0);
        } else {
            C786410Ut5.LJLLLLLL(8, (View) c1151940g5A.l0);
        }
    }

    public static final void LJLIIIL$5(C1151940g5A c1151940g5A, InterfaceC1541990qEH interfaceC1541990qEH) {
        C1095610ecJ c1095610ecJ = (C1095610ecJ) c1151940g5A.l0;
        c1095610ecJ.LJII = interfaceC1541990qEH;
        c1095610ecJ.LJ();
    }

    public static final void LJLIIIL$7(C1151940g5A c1151940g5A, InterfaceC1541990qEH interfaceC1541990qEH) {
        C1141290fnz.LJFF(new AwS561S0100000_17((C1141170fnn) c1151940g5A.l0, 616));
    }

    public static final void LJLIIIL$8(C1151940g5A c1151940g5A, InterfaceC1541990qEH interfaceC1541990qEH) {
        C1105880ess c1105880ess;
        C1105870esr c1105870esr = (C1105870esr) c1151940g5A.l0;
        if (c1105870esr.LLILLJJLI && (c1105880ess = c1105870esr.LLJ) != null) {
            String str = c1105870esr.LLIZ;
            c1105870esr.getClass();
            if (c1105880ess.LIZIZ != 0) {
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = new JSONObject();
                JSONObject jSONObject3 = new JSONObject();
                JSONObject jSONObject4 = new JSONObject();
                long jCurrentTimeMillis = System.currentTimeMillis() - c1105880ess.LIZ;
                long jCurrentTimeMillis2 = System.currentTimeMillis() - c1105880ess.LIZIZ;
                C0K04.LJFF("event_name", "resource_load_finish", jSONObject);
                C0K04.LJ("event_duration", jCurrentTimeMillis2, jSONObject2);
                C0K04.LJ("event_duration_all", jCurrentTimeMillis, jSONObject2);
                C0K04.LJ("event_duration", jCurrentTimeMillis2, jSONObject3);
                C0K04.LJ("event_duration_all", jCurrentTimeMillis, jSONObject3);
                C0K04.LIZLLL(0, "is_precreate", jSONObject3);
                c1105880ess.LIZ(jSONObject3);
                if (!TextUtils.isEmpty(str)) {
                    C0K04.LJFF("lynx_url", str, jSONObject3);
                }
                C0K04.LJII("extra", jSONObject4, jSONObject3);
                C1CC2.LJ("ttlive_ranklist_lynx_show", jSONObject, jSONObject2, jSONObject4);
            }
        }
    }

    public static final void LJLJI$0(C1151940g5A c1151940g5A, InterfaceC1541990qEH interfaceC1541990qEH) {
        if (interfaceC1541990qEH instanceof WebKitView) {
            C786410Ut5.I7(new ACListenerS152S0100000_17(interfaceC1541990qEH, 90), (View) c1151940g5A.l0);
        }
    }

    public static final void LJLIIL$1(C1151940g5A c1151940g5A, InterfaceC1541990qEH interfaceC1541990qEH, String str) {
        C1097990eg9.LIZIZ().LJIIIZ = System.currentTimeMillis();
    }

    public static final void LJLIIL$2(C1151940g5A c1151940g5A, InterfaceC1541990qEH interfaceC1541990qEH, String str) {
        C1097990eg9.LIZIZ().LJIIIZ = System.currentTimeMillis();
    }

    public static final void LJLIIL$4(C1151940g5A c1151940g5A, InterfaceC1541990qEH interfaceC1541990qEH, String str) {
        C1141290fnz.LJFF(new AwS561S0100000_17((C1141170fnn) c1151940g5A.l0, 617));
    }

    public static final void LJLIIL$5(C1151940g5A c1151940g5A, InterfaceC1541990qEH interfaceC1541990qEH, String str) {
        C1105880ess c1105880ess;
        C1105870esr c1105870esr = (C1105870esr) c1151940g5A.l0;
        if (c1105870esr.LLILLJJLI && (c1105880ess = c1105870esr.LLJ) != null) {
            String str2 = c1105870esr.LLIZ;
            c1105870esr.getClass();
            if (c1105880ess.LIZIZ <= 0) {
                c1105880ess.LIZIZ = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = new JSONObject();
                JSONObject jSONObject3 = new JSONObject();
                JSONObject jSONObject4 = new JSONObject();
                long j = c1105880ess.LIZIZ;
                long j2 = j - c1105880ess.LIZ;
                long j3 = j - c1105880ess.LIZJ;
                C0K04.LJFF("event_name", "start_load_resource", jSONObject);
                C0K04.LJ("event_duration", j3, jSONObject2);
                C0K04.LJ("event_duration_all", j2, jSONObject2);
                C0K04.LJ("event_duration_all", j2, jSONObject3);
                C0K04.LJ("event_duration", j3, jSONObject3);
                c1105880ess.LIZ(jSONObject3);
                C0K04.LIZLLL(0, "is_precreate", jSONObject3);
                if (!TextUtils.isEmpty(str2)) {
                    C0K04.LJFF("lynx_url", str2, jSONObject3);
                }
                C0K04.LJII("extra", jSONObject4, jSONObject3);
                C1CC2.LJ("ttlive_ranklist_lynx_show", jSONObject, jSONObject2, jSONObject4);
            }
        }
    }

    public static final void LJLLJ$0(C1151940g5A c1151940g5A, SparkContext sparkContext, C1548490qOl c1548490qOl) {
        if (!LiveQuizContainerOptSetting.INSTANCE.getValue().downgrade && c1548490qOl.LIZIZ == 0) {
            ActQuizWidget actQuizWidget = (ActQuizWidget) c1151940g5A.l0;
            if (!actQuizWidget.LLIZLLLIL) {
                actQuizWidget.LLIZLLLIL = true;
                ((IHybridPerformanceService) C1161920gLG.LIZJ(IHybridPerformanceService.class)).Ha2();
                C1CC2.LJII(3, "ttlive_eoy_quiz_opt_monitor", C2097608Jq.LJIIZILJ(new LinkedHashMap()));
                C20441214yg.LJIIIZ("EOYQuiz", "quiz card preload invalid");
            }
        }
    }

    public static final void LJL$0(C1151940g5A c1151940g5A, InterfaceC1541990qEH interfaceC1541990qEH, String str, C1542120qEU c1542120qEU) {
        c1151940g5A.LJLI(interfaceC1541990qEH, str, c1542120qEU.LIZIZ);
        C20441214yg.LJIIIZ("EOYQuiz", "spark container onLoadFailed");
    }

    public static final void LJL$1(C1151940g5A c1151940g5A, InterfaceC1541990qEH interfaceC1541990qEH, String str, C1542120qEU c1542120qEU) {
        int iIntValue;
        C1091210eVD c1091210eVD = (C1091210eVD) c1151940g5A.l0;
        Integer num = c1542120qEU.LIZ;
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = -1;
        }
        String str2 = c1542120qEU.LIZIZ;
        if (str2 == null) {
            str2 = "";
        }
        c1091210eVD.getClass();
        c1091210eVD.LIZIZ(new C1091190eVB(c1091210eVD, iIntValue, str2));
    }

    public static final void LJL$2(C1151940g5A c1151940g5A, InterfaceC1541990qEH interfaceC1541990qEH, String str, C1542120qEU c1542120qEU) {
        c1151940g5A.LJLI(interfaceC1541990qEH, str, c1542120qEU.LIZIZ);
        C1141290fnz.LJFF(new AwS418S0200000_17(c1542120qEU, (C1141170fnn) c1151940g5A.l0, 124));
    }

    public static final void LJL$3(C1151940g5A c1151940g5A, InterfaceC1541990qEH interfaceC1541990qEH, String str, C1542120qEU c1542120qEU) {
        C1105870esr c1105870esr = (C1105870esr) c1151940g5A.l0;
        C1105880ess c1105880ess = c1105870esr.LLJ;
        if (c1105880ess != null) {
            String str2 = c1105870esr.LLIZ;
            String str3 = c1542120qEU.LIZIZ;
            if (str2 != null && str2.length() > 0 && 1 != 0) {
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = new JSONObject();
                JSONObject jSONObject3 = new JSONObject();
                JSONObject jSONObject4 = new JSONObject();
                long jCurrentTimeMillis = System.currentTimeMillis() - c1105880ess.LIZ;
                long jCurrentTimeMillis2 = System.currentTimeMillis() - c1105880ess.LIZIZ;
                C0K04.LJFF("event_name", "lynx_load_fail", jSONObject);
                C0K04.LJFF("lynx_url", str2, jSONObject3);
                C0K04.LJ("event_duration_all", jCurrentTimeMillis, jSONObject2);
                C0K04.LJ("event_duration", jCurrentTimeMillis2, jSONObject2);
                C0K04.LJ("event_duration_all", jCurrentTimeMillis, jSONObject3);
                C0K04.LJ("event_duration", jCurrentTimeMillis2, jSONObject3);
                if (str3 == null) {
                    str3 = "";
                }
                C0K04.LJFF("error_reason", str3, jSONObject3);
                c1105880ess.LIZ(jSONObject3);
                C0K04.LJII("extra", jSONObject4, jSONObject3);
                C1CC2.LJ("ttlive_ranklist_lynx_show", jSONObject, null, jSONObject4);
            }
        }
        C1105870esr c1105870esr2 = (C1105870esr) c1151940g5A.l0;
        AwS561S0100000_17 awS561S0100000_17 = new AwS561S0100000_17(c1105870esr2, 660);
        c1105870esr2.getClass();
        if (!Intrinsics.LJFF(Looper.getMainLooper(), Looper.myLooper())) {
            C786410Ut5.LJJZZIII(c1105870esr2.LL, new ARunnableS117S0100000_17(awS561S0100000_17, 43));
        } else {
            awS561S0100000_17.invoke();
        }
    }

    public static final void LJLI$0(C1151940g5A c1151940g5A, InterfaceC1541990qEH interfaceC1541990qEH, String str, String str2) {
        C1097990eg9 c1097990eg9 = C1097990eg9.LIZ;
        C1097990eg9.LIZIZ().LJIIJ = System.currentTimeMillis();
        c1097990eg9.LJ(str2);
    }

    public static final void LJLI$1(C1151940g5A c1151940g5A, InterfaceC1541990qEH interfaceC1541990qEH, String str, String str2) {
        C1097990eg9 c1097990eg9 = C1097990eg9.LIZ;
        C1097990eg9.LIZIZ().LJIIJ = System.currentTimeMillis();
        c1097990eg9.LJ(str2);
    }

    public static final void LJLI$2(C1151940g5A c1151940g5A, InterfaceC1541990qEH interfaceC1541990qEH, String str, String str2) {
        C1123620fLU c1123620fLU = ((GiftGuideWidget) c1151940g5A.l0).LLIZLLLIL;
        c1123620fLU.LIZJ = 2005;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("load fail, url == ");
        sbLIZ.append(str);
        sbLIZ.append(", reason == ");
        sbLIZ.append(str2);
        c1123620fLU.LIZLLL = C2188811AlT.LIZIZ(sbLIZ);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("load fail, url == ");
        sbLIZ2.append(str);
        sbLIZ2.append(", reason == ");
        sbLIZ2.append(str2);
        C20441214yg.LIZIZ("GiftGuideLynx", C2188811AlT.LIZIZ(sbLIZ2));
    }

    public static final void LJLI$3(C1151940g5A c1151940g5A, InterfaceC1541990qEH interfaceC1541990qEH, String str, String str2) {
        String idStr;
        Room room;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_game_guess_page_performance");
        DataChannel dataChannel = ((C1097040eec) c1151940g5A.l0).LL;
        if (dataChannel != null && (room = (Room) dataChannel.gg0(RoomChannel.class)) != null) {
            idStr = room.getIdStr();
        } else {
            idStr = null;
        }
        c474500IjALIZ.LJJII(idStr, "room_id");
        c474500IjALIZ.LJJII("tiktok_live_interaction_game_guessing_pages_user_guessing_pin", "page_id");
        c474500IjALIZ.LJJII("load", "action");
        c474500IjALIZ.LJJII("client_fail", FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
        c474500IjALIZ.LJJII(str2, "status_detail");
        c474500IjALIZ.LJJII("client_guess_pin_card", "source_entrance");
        c474500IjALIZ.LIZ();
    }
}
