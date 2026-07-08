package Y;

import X.AnonymousClass1480;
import X.AnonymousClass1482;
import X.AnonymousClass1487;
import X.C067B;
import X.C0T1R;
import X.C13LP;
import X.C148A;
import X.C14AH;
import X.C14AL;
import X.C14Z7;
import X.C14ZO;
import X.C14ZQ;
import X.C14ZW;
import X.C1C7U;
import X.C20101913l3;
import X.C20102013l4;
import X.C20102113l5;
import X.C20286514Zj;
import X.C20287314Zr;
import X.C20289014a8;
import X.C20293414aq;
import X.C20684815ws;
import X.C2188811AlT;
import X.C2344009Gk;
import X.C300680BqU;
import android.content.Context;
import android.webkit.WebView;
import com.bytedance.bdturing.methods.JsBridgeModule;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.survey.Option;
import com.ss.android.ugc.aweme.feed.model.survey.Question;
import com.ss.android.ugc.aweme.feed.model.survey.ReplaceInfo;
import com.ss.android.ugc.aweme.feed.model.survey.SurveyInfo;
import com.ss.android.ugc.aweme.feed.panel.IBaseListFragmentPanel;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.setting.serverpush.compose.unlogin.PushSettingsUnLoginVM;
import com.ss.android.ugc.aweme.shortvideo.util.j;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import com.tts.oecverify.methods.JsBridgeModule;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AFwS274S0000000_30;
import kotlin.jvm.internal.AwS574S0100000_30;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes31.dex */
public class ARunnableS34S1100000_30 implements Runnable {
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
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        WebView webView = (WebView) this.l1;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("javascript:window.Native2JSBridge._handleMessageFromApp(");
        sbLIZ.append(this.s0);
        sbLIZ.append(")");
        webView.evaluateJavascript(C2188811AlT.LIZIZ(sbLIZ), null);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("callJsCode ====== ");
        sbLIZ2.append(this.s0);
        C2188811AlT.LIZIZ(sbLIZ2);
    }

    public final void LIZ$1() {
        AnonymousClass1480 anonymousClass1480 = AnonymousClass1480.LIZ;
        C148A c148aLIZ = AnonymousClass1480.LIZ(this.s0);
        if (c148aLIZ.LIZJ) {
            AnonymousClass1487 anonymousClass1487 = c148aLIZ.LIZIZ;
            if (anonymousClass1487 != null) {
                AnonymousClass1480.LIZIZ(anonymousClass1487.LIZ, "observer_coalesced", this.s0);
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("coalesce, drop superseded business=");
            sbLIZ.append(this.s0);
            C2188811AlT.LIZIZ(sbLIZ);
            c148aLIZ.LIZIZ = (AnonymousClass1487) this.l1;
            return;
        }
        c148aLIZ.LIZJ = true;
        if (c148aLIZ.LIZ.LIZLLL) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("leading-edge send business=");
            sbLIZ2.append(this.s0);
            sbLIZ2.append(" txId=");
            sbLIZ2.append(((AnonymousClass1487) this.l1).LIZ.LJFF);
            sbLIZ2.append(" entrance=");
            sbLIZ2.append(((AnonymousClass1487) this.l1).LIZ.LIZ);
            sbLIZ2.append(" intervalSec=");
            sbLIZ2.append(c148aLIZ.LIZ.LIZJ);
            C2188811AlT.LIZIZ(sbLIZ2);
            AnonymousClass1480.LIZIZ(((AnonymousClass1487) this.l1).LIZ, "observer_leading_sent", this.s0);
            C067B.LIZ((AnonymousClass1487) this.l1);
        } else {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("leading-edge deferred business=");
            sbLIZ3.append(this.s0);
            sbLIZ3.append(" txId=");
            sbLIZ3.append(((AnonymousClass1487) this.l1).LIZ.LJFF);
            sbLIZ3.append(" entrance=");
            sbLIZ3.append(((AnonymousClass1487) this.l1).LIZ.LIZ);
            sbLIZ3.append(" intervalSec=");
            sbLIZ3.append(c148aLIZ.LIZ.LIZJ);
            C2188811AlT.LIZIZ(sbLIZ3);
            AnonymousClass1480.LIZIZ(((AnonymousClass1487) this.l1).LIZ, "observer_deferred", this.s0);
            c148aLIZ.LIZIZ = (AnonymousClass1487) this.l1;
        }
        String str = this.s0;
        AnonymousClass1480.LIZIZ.schedule(new AnonymousClass1482(str), (long) (AnonymousClass1480.LIZ(str).LIZ.LIZJ * ((double) LSPassThroughRecordSizeConfig.DEFAULT)), TimeUnit.MILLISECONDS);
    }

    public final void LIZ$2() {
        WebView webView = (WebView) this.l1;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("javascript:window.Native2JSBridge._handleMessageFromApp(");
        sbLIZ.append(this.s0);
        sbLIZ.append(")");
        webView.evaluateJavascript(C2188811AlT.LIZIZ(sbLIZ), null);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("callJsCode ====== ");
        sbLIZ2.append(this.s0);
        C2188811AlT.LIZIZ(sbLIZ2);
    }

    public final void LIZ$3() {
        SurveyInfo surveyInfo;
        ReplaceInfo replaceInfo;
        Question question;
        Option[] optionArr;
        WeakReference<IBaseListFragmentPanel> weakReference;
        IBaseListFragmentPanel iBaseListFragmentPanel;
        C20287314Zr c20287314Zr = C20287314Zr.LIZ;
        Aweme aweme = (Aweme) this.l1;
        int i = C20287314Zr.LJ;
        String str = this.s0;
        c20287314Zr.getClass();
        if (aweme != null && C0T1R.LJI(C20287314Zr.LIZLLL) && C14Z7.LIZIZ(aweme)) {
            C20293414aq c20293414aq = C20289014a8.LIZ;
            List<SurveyInfo> surveyInfos = aweme.getSurveyInfos();
            SurveyInfo surveyInfo2 = null;
            if (surveyInfos != null) {
                Iterator<SurveyInfo> it2 = surveyInfos.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    SurveyInfo next = it2.next();
                    if (Intrinsics.LJFF(next.surveyKey, str)) {
                        surveyInfo2 = next;
                        break;
                    }
                }
                surveyInfo2 = surveyInfo2;
            }
            aweme.setSurveyInfo(surveyInfo2);
            C20289014a8.LIZ.LJIIJJI(new AwS574S0100000_30(aweme, 301));
            if (!C300680BqU.LIZ() || !C14ZO.LIZ(aweme, C14ZQ.INSERT, C20287314Zr.LIZLLL) || (surveyInfo = aweme.getSurveyInfo()) == null || (replaceInfo = surveyInfo.replacement) == null || (question = replaceInfo.question) == null || (optionArr = question.options) == null || optionArr.length < 6 || (weakReference = C20287314Zr.LJFF) == null || (iBaseListFragmentPanel = weakReference.get()) == null) {
                return;
            }
            iBaseListFragmentPanel.Jl1(i + 1, C20286514Zj.LIZIZ(aweme));
        }
    }

    public final void LIZ$4() {
        C2344009Gk c2344009Gk = new C2344009Gk();
        List<SurveyInfo> surveyInfos = ((Aweme) this.l1).getSurveyInfos();
        c2344009Gk.LJIIIIZZ("surveyIds", surveyInfos != null ? C13LP.LJJLIIIJ(surveyInfos, null, null, null, 0, null, AFwS274S0000000_30.get$arr$(244), 31) : null);
        c2344009Gk.LIZJ(C14ZW.LIZLLL((Aweme) this.l1), "style_group");
        C14ZW c14zw = C14ZW.LIZ;
        Aweme aweme = (Aweme) this.l1;
        c14zw.getClass();
        c2344009Gk.LJIIIIZZ("content_scopes", C14ZW.LIZ(aweme));
        c2344009Gk.LJIIIIZZ("reason", this.s0);
        C20684815ws.LJIILLIIL("survey_block_reason", c2344009Gk.LIZ);
    }

    public static final void run$0(ARunnableS34S1100000_30 aRunnableS34S1100000_30) {
        boolean zLIZ;
        C1C7U.LIZ("JsBridgeModule$AndroidJsInterface@a998.callMethodParams$1");
        try {
            ((JsBridgeModule.AndroidJsInterface) aRunnableS34S1100000_30.l1).LIZ.LIZ(new C14AH(JsBridgeModule.this, aRunnableS34S1100000_30.s0));
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("JsBridgeModule$AndroidJsInterface@a998.callMethodParams$1");
    }

    public static final void run$1(ARunnableS34S1100000_30 aRunnableS34S1100000_30) {
        boolean zLIZ;
        C1C7U.LIZ("JsBridgeModule$JS2NativeInterface@64ff._invokeMethod$1");
        try {
            ((JsBridgeModule.JS2NativeInterface) aRunnableS34S1100000_30.l1).LIZ.LIZ(new C14AH(JsBridgeModule.this, aRunnableS34S1100000_30.s0));
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("JsBridgeModule$JS2NativeInterface@64ff._invokeMethod$1");
    }

    public static final void run$10(ARunnableS34S1100000_30 aRunnableS34S1100000_30) {
        boolean zLIZ;
        C1C7U.LIZ("SurveyConsumeManager@a60c.checkInsert$1");
        try {
            aRunnableS34S1100000_30.LIZ$3();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SurveyConsumeManager@a60c.checkInsert$1");
    }

    public static final void run$11(ARunnableS34S1100000_30 aRunnableS34S1100000_30) {
        boolean zLIZ;
        C1C7U.LIZ("FeedSurveyMonitor@44e3.blockReason$runnable$1");
        try {
            aRunnableS34S1100000_30.LIZ$4();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("FeedSurveyMonitor@44e3.blockReason$runnable$1");
    }

    public static final void run$12(ARunnableS34S1100000_30 aRunnableS34S1100000_30) {
        boolean zLIZ;
        C1C7U.LIZ("PushSettingsUnLoginVM@2a0b.onPageResumed$2$changeItem$1");
        try {
            PushSettingsUnLoginVM pushSettingsUnLoginVM = (PushSettingsUnLoginVM) aRunnableS34S1100000_30.l1;
            pushSettingsUnLoginVM.LLILZIL = true;
            pushSettingsUnLoginVM.wQ2(aRunnableS34S1100000_30.s0, true);
            ((Keva) ((PushSettingsUnLoginVM) aRunnableS34S1100000_30.l1).LL.getValue()).storeString("need_sync_channel_push_logout", "");
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("PushSettingsUnLoginVM@2a0b.onPageResumed$2$changeItem$1");
    }

    public static final void run$2(ARunnableS34S1100000_30 aRunnableS34S1100000_30) {
        boolean zLIZ;
        C1C7U.LIZ("JsBridgeModule@bce5.callJsCode$1");
        try {
            aRunnableS34S1100000_30.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("JsBridgeModule@bce5.callJsCode$1");
    }

    public static final void run$3(ARunnableS34S1100000_30 aRunnableS34S1100000_30) {
        boolean zLIZ;
        C1C7U.LIZ("ProbeObserverThrottler@f29b.enqueue$1");
        try {
            aRunnableS34S1100000_30.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ProbeObserverThrottler@f29b.enqueue$1");
    }

    public static final void run$4(ARunnableS34S1100000_30 aRunnableS34S1100000_30) {
        Context context = (Context) aRunnableS34S1100000_30.l1;
        String str = aRunnableS34S1100000_30.s0;
        C1C7U.LIZ("AVPerformance@9056.leave$1L");
        C20101913l3 c20101913l3LIZ = C20101913l3.LIZ(context, str);
        HashMap<String, C20101913l3> map = C20101913l3.LJFF;
        if (map.get(c20101913l3LIZ.LIZIZ) != null) {
            map.remove(c20101913l3LIZ.LIZIZ);
        }
        C1C7U.LIZIZ("AVPerformance@9056.leave$1L");
    }

    public static final void run$5(ARunnableS34S1100000_30 aRunnableS34S1100000_30) {
        Context context = (Context) aRunnableS34S1100000_30.l1;
        String str = aRunnableS34S1100000_30.s0;
        C1C7U.LIZ("AVPerformance@9056.enter$1L");
        C20101913l3 c20101913l3LIZ = C20101913l3.LIZ(context, str);
        c20101913l3LIZ.LIZLLL++;
        if (!c20101913l3LIZ.LJ) {
            c20101913l3LIZ.LJ = true;
            c20101913l3LIZ.LIZJ = c20101913l3LIZ.LIZIZ(c20101913l3LIZ.LIZ, "entering");
        }
        C1C7U.LIZIZ("AVPerformance@9056.enter$1L");
    }

    public static final void run$6(ARunnableS34S1100000_30 aRunnableS34S1100000_30) {
        C20102113l5 c20102113l5;
        Context context = (Context) aRunnableS34S1100000_30.l1;
        String str = aRunnableS34S1100000_30.s0;
        C1C7U.LIZ("AVPerformance@9056.pause$1L");
        C20101913l3 c20101913l3LIZ = C20101913l3.LIZ(context, str);
        C20102113l5 c20102113l5LIZIZ = c20101913l3LIZ.LIZIZ(c20101913l3LIZ.LIZ, "leaving");
        if (c20102113l5LIZIZ != null && (c20102113l5 = c20101913l3LIZ.LIZJ) != null) {
            C20102013l4.LIZ(c20101913l3LIZ.LIZIZ, c20102113l5, c20102113l5LIZIZ);
        }
        C1C7U.LIZIZ("AVPerformance@9056.pause$1L");
    }

    public static final void run$7(ARunnableS34S1100000_30 aRunnableS34S1100000_30) {
        j jVar = (j) aRunnableS34S1100000_30.l1;
        String str = aRunnableS34S1100000_30.s0;
        jVar.getClass();
        C1C7U.LIZ("AVPerformance@9056.printlnPerformanceLog$1L");
        jVar.LJII(str);
        C1C7U.LIZIZ("AVPerformance@9056.printlnPerformanceLog$1L");
    }

    public static final void run$8(ARunnableS34S1100000_30 aRunnableS34S1100000_30) {
        boolean zLIZ;
        C1C7U.LIZ("JsBridgeModule$AndroidJsInterface@ff63.callMethodParams$1");
        try {
            ((JsBridgeModule.AndroidJsInterface) aRunnableS34S1100000_30.l1).LIZ.LIZ(new C14AL(com.tts.oecverify.methods.JsBridgeModule.this, aRunnableS34S1100000_30.s0));
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("JsBridgeModule$AndroidJsInterface@ff63.callMethodParams$1");
    }

    public static final void run$9(ARunnableS34S1100000_30 aRunnableS34S1100000_30) {
        boolean zLIZ;
        C1C7U.LIZ("JsBridgeModule@d3a5.callJsCode$1");
        try {
            aRunnableS34S1100000_30.LIZ$2();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("JsBridgeModule@d3a5.callJsCode$1");
    }

    public ARunnableS34S1100000_30(com.bytedance.bdturing.methods.JsBridgeModule jsBridgeModule, String str, int i) {
        this.$t = i;
        this.s0 = str;
        this.l1 = jsBridgeModule.LIZ;
    }

    public ARunnableS34S1100000_30(com.tts.oecverify.methods.JsBridgeModule jsBridgeModule, String str, int i) {
        this.$t = i;
        this.s0 = str;
        this.l1 = jsBridgeModule.LIZ;
    }

    public ARunnableS34S1100000_30(Object obj, String str, int i) {
        this.$t = i;
        this.l1 = obj;
        this.s0 = str;
    }

    public ARunnableS34S1100000_30(Context context, String str, String str2, String str3, int i) {
        this.$t = i;
        this.l1 = context;
        this.s0 = str;
    }
}
