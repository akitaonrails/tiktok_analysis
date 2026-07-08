package Y;

import X.AbstractC1123700fLc;
import X.C01C1;
import X.C0KQH;
import X.C0PEM;
import X.C1086960eOM;
import X.C1087790ePh;
import X.C1087800ePi;
import X.C1102070emj;
import X.C1102420enI;
import X.C1111930f2d;
import X.C1123440fLC;
import X.C1123690fLb;
import X.C1128710fTh;
import X.C1131940fYu;
import X.C1131950fYv;
import X.C1134400fcs;
import X.C1134410fct;
import X.C1138360fjG;
import X.C1138630fjh;
import X.C1140890fnL;
import X.C1141900foy;
import X.C1161920gLG;
import X.C1284770jXP;
import X.C13BV;
import X.C13LQ;
import X.C13SS;
import X.C1548820qPI;
import X.C158B;
import X.C19996913Lz;
import X.C1C7U;
import X.C1CC2;
import X.C1CC3;
import X.C20005513Ph;
import X.C20441214yg;
import X.C2188811AlT;
import X.C2296808zG;
import X.C23250099c;
import X.C512940K9s;
import X.C786410Ut5;
import X.C915980Zwa;
import X.EnumC1123500fLI;
import X.EnumC1131980fYy;
import X.InterfaceC1109220eyG;
import android.net.Uri;
import android.os.SystemClock;
import com.bytedance.android.live.liveinteract.multimatch.matchitem.MatchItemAssem;
import com.bytedance.android.livesdk.frequency.setting.LiveNotifyMessageFrequencySetting;
import com.bytedance.android.livesdk.gift.assets.FaceRecognitionMeta;
import com.bytedance.android.livesdk.guide.model.TaskInfo;
import com.bytedance.android.livesdk.impl.revenue.strategy.base.TaskManagerV2;
import com.bytedance.android.livesdk.interaction.custompoll.shorttouch.PollShortTouchHelper;
import com.bytedance.android.livesdk.livesetting.other.LiveMonitorSampleSetting;
import com.bytedance.android.livesdk.model.message.GiftGuideMessage;
import com.bytedance.android.livesdkapi.depend.model.live.MsgNotifyQuota;
import com.bytedance.android.livesdkapi.host.IHostCreativeTool;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes18.dex */
public class ARunnableS20S0100100_17 implements Runnable {
    public final int $t;
    public long j1;
    public Object l0;

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
        HashMap map = (HashMap) C1087790ePh.LJ;
        Object obj = map.get(Long.valueOf(this.j1));
        C1087800ePi c1087800ePi = (C1087800ePi) this.l0;
        if (obj != c1087800ePi) {
            return;
        }
        if (C1087790ePh.LJI(this.j1, c1087800ePi.LIZ, c1087800ePi.LIZIZ)) {
            map.remove(Long.valueOf(this.j1));
            return;
        }
        C1087800ePi c1087800ePi2 = (C1087800ePi) this.l0;
        int i = c1087800ePi2.LIZJ - 1;
        c1087800ePi2.LIZJ = i;
        if (i > 0) {
            ARunnableS20S0100100_17 aRunnableS20S0100100_17 = new ARunnableS20S0100100_17(this.j1, c1087800ePi2, 1);
            c1087800ePi2.LIZLLL = aRunnableS20S0100100_17;
            C786410Ut5.LJLIIL(300L, C1087790ePh.LJ(), aRunnableS20S0100100_17);
        } else {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("attachWhenWindowReady: window never ready, give up anchorId=");
            sbLIZ.append(this.j1);
            C20441214yg.LJIIL("VirtualTicketBoxGuideViewHelper", C2188811AlT.LIZIZ(sbLIZ));
            map.remove(Long.valueOf(this.j1));
        }
    }

    public final void LIZ$1() {
        boolean z = false;
        if (LiveNotifyMessageFrequencySetting.INSTANCE.enable()) {
            if (((C1123440fLC) this.l0).LLLFF.contains(Long.valueOf(this.j1))) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(((C1123440fLC) this.l0).LLJJJJ);
                sbLIZ.append(" is in allow set. Show.");
                C20441214yg.LJ("Frequency Control", C2188811AlT.LIZIZ(sbLIZ));
            } else {
                HashMap<Long, MsgNotifyQuota> map = C1102420enI.LIZ;
                C512940K9s c512940K9sLIZLLL = C1102420enI.LIZLLL(7, ((C1123440fLC) this.l0).LLJ, "watch", false, false);
                if (!c512940K9sLIZLLL.LIZ) {
                    C1123440fLC c1123440fLC = (C1123440fLC) this.l0;
                    Set<String> set = c512940K9sLIZLLL.LIZIZ;
                    c1123440fLC.getClass();
                    C1102070emj.LIZ.LJIILL(c1123440fLC.LLJ, c1123440fLC, c1123440fLC.LLLF, set);
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append(this.j1);
                    sbLIZ2.append(" has been frequency controlled. Not show.");
                    C20441214yg.LJ("Frequency Control", C2188811AlT.LIZIZ(sbLIZ2));
                    C1123440fLC c1123440fLC2 = (C1123440fLC) this.l0;
                    GiftGuideMessage giftGuideMessage = c1123440fLC2.LLJJJJ;
                    if (giftGuideMessage != null) {
                        c1123440fLC2.LJIJI(EnumC1123500fLI.NOTIFY_CONTROL, giftGuideMessage.giftId, giftGuideMessage.guideType, c1123440fLC2.LJIIIIZZ(), c1123440fLC2.LJ(), giftGuideMessage.triggerName, null);
                    }
                    ((C1123440fLC) this.l0).LLJJJJ = null;
                    return;
                }
                ((C1123440fLC) this.l0).LLLFF.add(Long.valueOf(this.j1));
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append(((C1123440fLC) this.l0).LLJJJJ);
                sbLIZ3.append(" is added to allow set. Show.");
                C20441214yg.LJ("Frequency Control", C2188811AlT.LIZIZ(sbLIZ3));
                z = true;
            }
        }
        C1123440fLC c1123440fLC3 = (C1123440fLC) this.l0;
        if (!c1123440fLC3.LLJJIJI) {
            c1123440fLC3.LLLFFI = true;
        }
        c1123440fLC3.LLJJIJI = true;
        c1123440fLC3.LLJJI = SystemClock.elapsedRealtime();
        System.currentTimeMillis();
        Function1<? super AbstractC1123700fLc, Unit> function1 = ((C1123440fLC) this.l0).LLILLJJLI;
        if (function1 != null) {
            C1123690fLb c1123690fLb = C1123690fLb.LIZIZ;
            c1123690fLb.LIZ = z;
            function1.invoke(c1123690fLb);
        }
        C1123440fLC c1123440fLC4 = (C1123440fLC) this.l0;
        c1123440fLC4.LLL = true;
        c1123440fLC4.LJIJJLI();
        ((C1123440fLC) this.l0).LJI();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LIZ$2() {
        TaskManagerV2.LJ.remove(this);
        if (C158B.LIZJ() < this.j1 + 1) {
            TaskManagerV2 taskManagerV2 = TaskManagerV2.LIZ;
            int i = ((TaskInfo) ((C1134410fct) this.l0).LIZ).taskType;
            taskManagerV2.getClass();
            TaskManagerV2.LJIILLIIL(i);
            return;
        }
        C1134410fct c1134410fct = (C1134410fct) this.l0;
        if (c1134410fct.LJIIJJI()) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[task refresh] target task ");
        sbLIZ.append(c1134410fct.LJI);
        sbLIZ.append(" need refresh");
        C20441214yg.LJIIIZ("IncentiveDebug", C2188811AlT.LIZIZ(sbLIZ));
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZ), null, null, new C1134400fcs(c1134410fct, null), 3);
    }

    public final void LIZ$3() {
        long j = this.j1;
        Object obj = this.l0;
        Map<Long, C1131940fYu> map = C1131950fYv.LIZ;
        C1131940fYu c1131940fYu = (C1131940fYu) ((LinkedHashMap) map).get(Long.valueOf(j));
        if (c1131940fYu != null && c1131940fYu.LIZJ == obj && c1131940fYu.LIZIZ == EnumC1131980fYy.LL) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("phaseA expired effectId=");
            sbLIZ.append(j);
            C20441214yg.LJIIIZ("GiftEffectDownloadTimeoutWatcher", C2188811AlT.LIZIZ(sbLIZ));
            c1131940fYu.LIZIZ = EnumC1131980fYy.LLILLL;
            map.remove(Long.valueOf(j));
        }
    }

    public final void LIZ$4() {
        List list;
        C1138360fjG c1138360fjGLIZLLL = C1140890fnL.LIZLLL();
        long j = this.j1;
        Integer num = (Integer) this.l0;
        c1138360fjGLIZLLL.getClass();
        FaceRecognitionMeta faceRecognitionMetaLJII = C1138630fjh.LJII(j, num);
        if (faceRecognitionMetaLJII == null || (list = faceRecognitionMetaLJII.requirements) == null) {
            list = C13BV.INSTANCE;
        }
        String[] strArr = (String[]) list.toArray(new String[0]);
        C1141900foy c1141900foy = C1141900foy.LIZ;
        String str = faceRecognitionMetaLJII != null ? faceRecognitionMetaLJII.modelNames : null;
        c1141900foy.getClass();
        Map mapLIZLLL = C1141900foy.LIZLLL(str);
        C20005513Ph c20005513PhLJIILJJIL = ((IHostCreativeTool) C1161920gLG.LIZJ(IHostCreativeTool.class)).LLJILJILJ().getEffectPlatform().LJIILJJIL();
        c20005513PhLJIILJJIL.getClass();
        String[] strArrLIZLLL = C19996913Lz.LIZLLL(mapLIZLLL, C1284770jXP.LIZ(strArr));
        if (strArrLIZLLL != null) {
            for (String str2 : C13LQ.LJIIZILJ(strArrLIZLLL)) {
                C13SS c13ss = C13SS.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("markModelUsed: modelName: ");
                sbLIZ.append(str2);
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                c13ss.getClass();
                C13SS.LIZ("AlgorithmRepository", strLIZIZ);
                c20005513PhLJIILJJIL.LIZLLL().markModelUsed(str2);
            }
        }
    }

    public static final void run$0(ARunnableS20S0100100_17 aRunnableS20S0100100_17) {
        boolean zLIZ;
        C1C7U.LIZ("MatchItemAssem@d26e.onViewCreated$9$1");
        try {
            if (C915980Zwa.LJFF().Nt()) {
                MatchItemAssem matchItemAssem = (MatchItemAssem) aRunnableS20S0100100_17.l0;
                MatchItemAssem.Xp(matchItemAssem, matchItemAssem.LLLFF, "shortTouchMatchEnigma", null, aRunnableS20S0100100_17.j1, 0L, 20);
                C1548820qPI.LIZLLL("ENIGMA_MATCH_SHORT_TOUCH_CLICK", ((MatchItemAssem) aRunnableS20S0100100_17.l0).LLLIIIL);
            }
            ((MatchItemAssem) aRunnableS20S0100100_17.l0).LLLII = false;
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("MatchItemAssem@d26e.onViewCreated$9$1");
    }

    public static final void run$1(ARunnableS20S0100100_17 aRunnableS20S0100100_17) {
        boolean zLIZ;
        C1C7U.LIZ("VirtualTicketBoxGuideViewHelper@a24f.scheduleAttachRetry$runnable$1");
        try {
            aRunnableS20S0100100_17.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("VirtualTicketBoxGuideViewHelper@a24f.scheduleAttachRetry$runnable$1");
    }

    public static final void run$10(ARunnableS20S0100100_17 aRunnableS20S0100100_17) {
        boolean zLIZ;
        C1C7U.LIZ("GiftPanelLeafV2@f893.setupCoordinatedLogging$1");
        try {
            ((C1128710fTh) aRunnableS20S0100100_17.l0).LLD(aRunnableS20S0100100_17.j1, false);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("GiftPanelLeafV2@f893.setupCoordinatedLogging$1");
    }

    public static final void run$11(ARunnableS20S0100100_17 aRunnableS20S0100100_17) {
        boolean zLIZ;
        C1C7U.LIZ("GiftPanelLeafV2@f893.triggerCoordinatedLogging$1");
        try {
            ((C1128710fTh) aRunnableS20S0100100_17.l0).LJLLILLLL();
            ((C1128710fTh) aRunnableS20S0100100_17.l0).LJLIL(aRunnableS20S0100100_17.j1);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("GiftPanelLeafV2@f893.triggerCoordinatedLogging$1");
    }

    public static final void run$12(ARunnableS20S0100100_17 aRunnableS20S0100100_17) {
        boolean zLIZ;
        C1C7U.LIZ("NewArchPanelRendererKt@58e8.dispatchRenderTracking$3");
        try {
            ((C1128710fTh) aRunnableS20S0100100_17.l0).LJLLILLLL();
            ((C1128710fTh) aRunnableS20S0100100_17.l0).LJLIL(aRunnableS20S0100100_17.j1);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("NewArchPanelRendererKt@58e8.dispatchRenderTracking$3");
    }

    public static final void run$13(ARunnableS20S0100100_17 aRunnableS20S0100100_17) {
        Uri uri = (Uri) aRunnableS20S0100100_17.l0;
        long j = aRunnableS20S0100100_17.j1;
        C1C7U.LIZ("ImageNetworkRequestsMonitor@f937.onRequestSuccess$1L");
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("url", uri);
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        C1CC3 c1cc3 = C1CC2.LIZ;
        if (c1cc3 != null) {
            c1cc3.LJIIJ(0, jSONObject);
        }
        if (j > 0) {
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("duration", j);
                jSONObject2.put("url", uri);
            } catch (JSONException e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
            C1CC3 c1cc32 = C1CC2.LIZ;
            if (c1cc32 != null) {
                c1cc32.monitorCommonLog("hotsoon_image_load_duration", "hotsoon_image_load", jSONObject2);
                float f = j;
                if (c1cc32 != null) {
                    c1cc32.LIZIZ(f);
                }
            }
            C20441214yg.LIZIZ("image_monitor", "no cache = " + uri + " duration = " + j);
        }
        String string = uri.toString();
        if (LiveMonitorSampleSetting.INSTANCE.isReportSlardar(C0KQH.LIZ("ttlive_image_load_status"))) {
            HashMap map = new HashMap();
            map.put("url", string);
            C1CC2.LJIILIIL(0, j, C0KQH.LIZ("ttlive_image_load_status"), map);
        }
        C1C7U.LIZIZ("ImageNetworkRequestsMonitor@f937.onRequestSuccess$1L");
    }

    public static final void run$14(ARunnableS20S0100100_17 aRunnableS20S0100100_17) {
        boolean zLIZ;
        C1C7U.LIZ("CustomPollManager@2501.enterInteractionRoom$2$1");
        try {
            long j = aRunnableS20S0100100_17.j1;
            C01C1 c01c1 = (C01C1) aRunnableS20S0100100_17.l0;
            C1086960eOM.LL.getClass();
            PollShortTouchHelper.LIZJ(j, c01c1, C1086960eOM.LLILLJJLI.get(aRunnableS20S0100100_17.j1), C1086960eOM.LLIZLLLIL, new Runnable() { // from class: X.0eLp
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ2;
                    C1C7U.LIZ("CustomPollManager@2501.enterInteractionRoom$2$1$1");
                    try {
                        C1086960eOM.LLIZLLLIL = true;
                    } finally {
                        if (!zLIZ2) {
                        }
                    }
                    C1C7U.LIZIZ("CustomPollManager@2501.enterInteractionRoom$2$1$1");
                }
            });
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("CustomPollManager@2501.enterInteractionRoom$2$1");
    }

    public static final void run$2(ARunnableS20S0100100_17 aRunnableS20S0100100_17) {
        boolean zLIZ;
        C1C7U.LIZ("GiftGuideWidgetViewModel@3b0.show$runnable$1");
        try {
            aRunnableS20S0100100_17.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("GiftGuideWidgetViewModel@3b0.show$runnable$1");
    }

    public static final void run$3(ARunnableS20S0100100_17 aRunnableS20S0100100_17) {
        boolean zLIZ;
        C1C7U.LIZ("TaskManagerV2@3e9c.createExpirationCheckRunnable$runnable$1");
        try {
            aRunnableS20S0100100_17.LIZ$2();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("TaskManagerV2@3e9c.createExpirationCheckRunnable$runnable$1");
    }

    public static final void run$4(ARunnableS20S0100100_17 aRunnableS20S0100100_17) {
        C1111930f2d c1111930f2d = (C1111930f2d) aRunnableS20S0100100_17.l0;
        long j = aRunnableS20S0100100_17.j1;
        c1111930f2d.getClass();
        C1C7U.LIZ("PublicScreenPresenter@c5a7.removeModelByToken$1L");
        if (!C1111930f2d.LJZI(j, c1111930f2d.LLJJJJLIIL) && !C1111930f2d.LJZI(j, c1111930f2d.LLJJLIIIJLLLLLLLZ)) {
            C1111930f2d.LJZI(j, c1111930f2d.LLJL);
        }
        C1C7U.LIZIZ("PublicScreenPresenter@c5a7.removeModelByToken$1L");
    }

    public static final void run$5(ARunnableS20S0100100_17 aRunnableS20S0100100_17) {
        InterfaceC1109220eyG interfaceC1109220eyG = (InterfaceC1109220eyG) aRunnableS20S0100100_17.l0;
        long j = aRunnableS20S0100100_17.j1;
        C1C7U.LIZ("PublicScreenPresenter@c5a7.insertModel$1L$1L");
        interfaceC1109220eyG.LIZ(j);
        C1C7U.LIZIZ("PublicScreenPresenter@c5a7.insertModel$1L$1L");
    }

    public static final void run$6(ARunnableS20S0100100_17 aRunnableS20S0100100_17) {
        InterfaceC1109220eyG interfaceC1109220eyG = (InterfaceC1109220eyG) aRunnableS20S0100100_17.l0;
        long j = aRunnableS20S0100100_17.j1;
        C1C7U.LIZ("PublicScreenPresenter@c5a7.insertMessage$5L$1L");
        interfaceC1109220eyG.LIZ(j);
        C1C7U.LIZIZ("PublicScreenPresenter@c5a7.insertMessage$5L$1L");
    }

    public static final void run$7(ARunnableS20S0100100_17 aRunnableS20S0100100_17) {
        boolean zLIZ;
        C1C7U.LIZ("GiftEffectDownloadTimeoutWatcher@ee78.mark$1");
        try {
            aRunnableS20S0100100_17.LIZ$3();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("GiftEffectDownloadTimeoutWatcher@ee78.mark$1");
    }

    public static final void run$8(ARunnableS20S0100100_17 aRunnableS20S0100100_17) {
        boolean zLIZ;
        C1C7U.LIZ("GiftEffectDownloadTimeoutWatcher@ee78.onDownloadStart$1");
        try {
            C1131950fYv.LIZIZ(aRunnableS20S0100100_17.j1, aRunnableS20S0100100_17.l0);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("GiftEffectDownloadTimeoutWatcher@ee78.onDownloadStart$1");
    }

    public static final void run$9(ARunnableS20S0100100_17 aRunnableS20S0100100_17) {
        boolean zLIZ;
        C1C7U.LIZ("FacialAlgorithmModelDownloadHelper@aafd.markModels$runnable$1");
        try {
            aRunnableS20S0100100_17.LIZ$4();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("FacialAlgorithmModelDownloadHelper@aafd.markModels$runnable$1");
    }

    public ARunnableS20S0100100_17(long j, Object obj, int i) {
        this.$t = i;
        this.j1 = j;
        this.l0 = obj;
    }
}
