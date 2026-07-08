package Y;

import X.AbstractActivityC1743740vTg;
import X.AbstractC1168350gVd;
import X.AbstractC21673619ry;
import X.AbstractC484810Izn;
import X.AnonymousClass0716;
import X.AnonymousClass0810;
import X.AnonymousClass0811;
import X.AnonymousClass0816;
import X.AnonymousClass0883;
import X.C01GW;
import X.C081B;
import X.C081S;
import X.C082Q;
import X.C083E;
import X.C083F;
import X.C089D;
import X.C089E;
import X.C08D3;
import X.C08D4;
import X.C08DT;
import X.C08DU;
import X.C08DV;
import X.C08DX;
import X.C08GH;
import X.C08GI;
import X.C08I9;
import X.C08JS;
import X.C08L0;
import X.C08L1;
import X.C08MO;
import X.C08O4;
import X.C08O8;
import X.C08Q0;
import X.C08RN;
import X.C098200Yq;
import X.C09BH;
import X.C09MI;
import X.C09PZ;
import X.C09Q8;
import X.C09Q9;
import X.C09QB;
import X.C0C64;
import X.C0CD2;
import X.C0J0T;
import X.C0L7R;
import X.C0MAY;
import X.C0NET;
import X.C0PEM;
import X.C0V5Z;
import X.C0VDB;
import X.C0VSJ;
import X.C0VSP;
import X.C0VSV;
import X.C0VX9;
import X.C0WZX;
import X.C0X35;
import X.C0X9F;
import X.C0X9S;
import X.C0XQ1;
import X.C1009460cNM;
import X.C1018150cbN;
import X.C118300cf;
import X.C1270610jAZ;
import X.C1271460jBw;
import X.C12ES;
import X.C12G1;
import X.C1389890mGx;
import X.C1390380mHk;
import X.C13LP;
import X.C13LQ;
import X.C1424850nBL;
import X.C1468090oJ5;
import X.C15442062u;
import X.C1552050qUV;
import X.C1553670qX7;
import X.C1603930rqB;
import X.C1857690yRT;
import X.C189200o6;
import X.C1913507eX;
import X.C194442115k;
import X.C1961107mD;
import X.C1964607mm;
import X.C1968107nL;
import X.C1AF0;
import X.C1C7U;
import X.C201955140j;
import X.C2044207zc;
import X.C20490080y;
import X.C20491080z;
import X.C20622086a;
import X.C20633086l;
import X.C20636086o;
import X.C20639086r;
import X.C20684815ws;
import X.C20689088p;
import X.C2105608Ms;
import X.C2115008Qi;
import X.C2118008Rm;
import X.C2119708Sd;
import X.C2119908Sf;
import X.C2120008Sg;
import X.C2151808bs;
import X.C2179971ATj;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C2204961BRm;
import X.C2241008qG;
import X.C2241608qM;
import X.C2249208ra;
import X.C2281508wn;
import X.C23250099c;
import X.C2344009Gk;
import X.C2344809Gs;
import X.C2354709Kn;
import X.C2367609Pm;
import X.C2395509a5;
import X.C2408409cA;
import X.C2438909h5;
import X.C2499609qs;
import X.C2500209qy;
import X.C2500809r4;
import X.C259800zU;
import X.C418440Gaw;
import X.C426750GoL;
import X.C534190KxF;
import X.C570220MYa;
import X.C581880Mry;
import X.C786410Ut5;
import X.C786450Ut9;
import X.C786970Utz;
import X.C799570VYd;
import X.C805380Via;
import X.C810670Vr7;
import X.C814420VxA;
import X.C817503Hh;
import X.C844470XAv;
import X.InterfaceC20236714Gf;
import X.InterfaceC2029707xH;
import X.InterfaceC2108508Nv;
import X.InterfaceC2115108Qj;
import X.InterfaceC464060IHs;
import Y.ARunnableS102S0200000_33;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.util.Printer;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.Toast;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.bytedance.apm.profiler.Profiler;
import com.bytedance.common.jato.gc.GCMonitor;
import com.bytedance.common.jato.memory.ResourceMetricCollector;
import com.bytedance.common.wschannel.server.WsChannelService;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.keva.Keva;
import com.bytedance.librarian.Librarian;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.memrelief.gc.WeakRefQueueMonitorV2;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.otis.art.ArtLogVerbosity;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.push.task.SendTokenTask;
import com.bytedance.sysoptimizer.ArtMProtectOpt;
import com.bytedance.sysoptimizer.perflock.PerfLockBooster;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.lynx.animax.drawable.FirstFrameAwareSurfaceTexture;
import com.lynx.animax.util.AnimaXLog;
import com.ss.android.common.lib.AppLogNewUtils;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.IAppWidgetService;
import com.ss.android.ugc.aweme.boot.speeder.SpeederService;
import com.ss.android.ugc.aweme.comment.audio.ui.recorder.CommentAudioRecordAssem;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.exp.DMInboxChangeRightZoneClickableSizeExp;
import com.ss.android.ugc.aweme.experiment.ColdBootStartJankOptimize;
import com.ss.android.ugc.aweme.experiment.FollowFeedViewStubExperiment;
import com.ss.android.ugc.aweme.experiment.anr.FrameworkPerfLockParams;
import com.ss.android.ugc.aweme.feed.adapter.widget.survey.LiveSurveyWidgetV2;
import com.ss.android.ugc.aweme.feed.controller.PlayerController;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.legoImp.task.AnrThanosTask;
import com.ss.android.ugc.aweme.legoImp.task.JatoInitTask;
import com.ss.android.ugc.aweme.legoImp.task.PublicTestSupportTask;
import com.ss.android.ugc.aweme.lifecycle.task.KeepWarmJobService;
import com.ss.android.ugc.aweme.main.PerformanceOptAssem;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import com.ss.android.ugc.aweme.shortvideo.album.EPAICreateSelectMaterialScene;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoScene;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.story.InboxGroupChatSocialStatusViewModelImpl;
import com.ss.android.ugc.aweme.strategy.api.IStrategyApi;
import com.ss.android.ugc.aweme.tools.draft.monitor.log.DraftLogEntry;
import com.ss.android.ugc.aweme.tools.draft.monitor.log.DraftSummaryEntry;
import com.ss.android.ugc.aweme.utils.QueuedWorkHelper;
import com.ss.android.ugc.aweme.verify.BaseVerifyFragment;
import com.ss.android.ugc.aweme.verify.BaseVerifyTuxSheet;
import com.ss.android.ugc.bytex.pthread.base.convergence.hook.ThreadMethodProxy;
import com.ss.android.ugc.profile.platform.business.header.business.advancedfeature.assemble.ProfileHeaderAdvancedFeatureBaseComponent;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.FutureTask;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS231S0000000_3;
import kotlin.jvm.internal.AwS551S0100000_7;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class ARunnableS103S0100000_3 implements Runnable {
    public final int $t;
    public Object l0;

    public static final void run$22(ARunnableS103S0100000_3 aRunnableS103S0100000_3) {
        ((WeakRefQueueMonitorV2) aRunnableS103S0100000_3.l0).lambda$start$0();
    }

    public static final void run$41(ARunnableS103S0100000_3 aRunnableS103S0100000_3) {
        AnrThanosTask.LJ((AnrThanosTask) aRunnableS103S0100000_3.l0);
    }

    public static final void run$53(ARunnableS103S0100000_3 aRunnableS103S0100000_3) {
        C089D.LJFF((C089D) aRunnableS103S0100000_3.l0);
    }

    public final void LIZ$14() throws Throwable {
        try {
            C0VSJ c0vsj = new C0VSJ(C570220MYa.LJIIIZ(false), "summary.log");
            File parentFile = c0vsj.getParentFile();
            if (parentFile != null) {
                parentFile.mkdirs();
            }
            if (!c0vsj.exists()) {
                c0vsj.createNewFile();
            }
            if (c0vsj.length() > 204800) {
                C570220MYa.LJIIL(c0vsj);
            }
            String strLJIILL = C570220MYa.LJIIIIZZ().LJIILL((DraftSummaryEntry) this.l0);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(strLJIILL);
            sbLIZ.append('\n');
            C09BH.LIZJ(c0vsj, C2188811AlT.LIZIZ(sbLIZ), Charsets.UTF_8);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C201955140j.LJIIIZ(C0MAY.LIZIZ, "DraftLogService", "Append summary entry failed", e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ$8() throws java.lang.Throwable {
        /*
            r6 = this;
            r1 = 0
            android.os.Parcel r5 = android.os.Parcel.obtain()     // Catch: java.lang.Throwable -> L76 java.lang.Exception -> L79
            java.lang.Object r0 = r6.l0     // Catch: java.lang.Exception -> L74 java.lang.Throwable -> L84
            com.ss.android.ugc.aweme.detail.ui.DetailActivity r0 = (com.ss.android.ugc.aweme.detail.ui.DetailActivity) r0     // Catch: java.lang.Exception -> L74 java.lang.Throwable -> L84
            android.content.Intent r0 = r0.getIntent()     // Catch: java.lang.Exception -> L74 java.lang.Throwable -> L84
            android.os.Bundle r1 = r0.getExtras()     // Catch: java.lang.Exception -> L12 java.lang.Throwable -> L84
            goto L16
        L12:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Exception -> L74 java.lang.Throwable -> L84
        L16:
            r5.writeBundle(r1)     // Catch: java.lang.Exception -> L74 java.lang.Throwable -> L84
            int r3 = r5.dataSize()     // Catch: java.lang.Exception -> L74 java.lang.Throwable -> L84
            r0 = 500000(0x7a120, float:7.00649E-40)
            if (r3 <= r0) goto L70
            java.io.PrintStream r2 = java.lang.System.out     // Catch: java.lang.Exception -> L74 java.lang.Throwable -> L84
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()     // Catch: java.lang.Exception -> L74 java.lang.Throwable -> L84
            java.lang.String r0 = "FeedTransactionTooLargeMonitor too large size="
            r1.append(r0)     // Catch: java.lang.Exception -> L74 java.lang.Throwable -> L84
            r1.append(r3)     // Catch: java.lang.Exception -> L74 java.lang.Throwable -> L84
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)     // Catch: java.lang.Exception -> L74 java.lang.Throwable -> L84
            r2.println(r0)     // Catch: java.lang.Exception -> L74 java.lang.Throwable -> L84
            java.lang.Object r0 = r6.l0     // Catch: java.lang.Exception -> L74 java.lang.Throwable -> L84
            com.ss.android.ugc.aweme.detail.ui.DetailActivity r0 = (com.ss.android.ugc.aweme.detail.ui.DetailActivity) r0     // Catch: java.lang.Exception -> L74 java.lang.Throwable -> L84
            androidx.fragment.app.FragmentManager r0 = r0.getSupportFragmentManager()     // Catch: java.lang.Exception -> L74 java.lang.Throwable -> L84
            java.util.List r0 = r0.LJJLIIIJL()     // Catch: java.lang.Exception -> L74 java.lang.Throwable -> L84
            java.util.Iterator r4 = r0.iterator()     // Catch: java.lang.Exception -> L74 java.lang.Throwable -> L84
        L47:
            boolean r0 = r4.hasNext()     // Catch: java.lang.Exception -> L74 java.lang.Throwable -> L84
            if (r0 == 0) goto L70
            java.lang.Object r3 = r4.next()     // Catch: java.lang.Exception -> L74 java.lang.Throwable -> L84
            androidx.fragment.app.Fragment r3 = (androidx.fragment.app.Fragment) r3     // Catch: java.lang.Exception -> L74 java.lang.Throwable -> L84
            java.io.PrintStream r2 = java.lang.System.out     // Catch: java.lang.Exception -> L74 java.lang.Throwable -> L84
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()     // Catch: java.lang.Exception -> L74 java.lang.Throwable -> L84
            java.lang.String r0 = "FeedTransactionTooLargeMonitor fragments="
            r1.append(r0)     // Catch: java.lang.Exception -> L74 java.lang.Throwable -> L84
            r1.append(r3)     // Catch: java.lang.Exception -> L74 java.lang.Throwable -> L84
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)     // Catch: java.lang.Exception -> L74 java.lang.Throwable -> L84
            r2.println(r0)     // Catch: java.lang.Exception -> L74 java.lang.Throwable -> L84
            android.os.Bundle r0 = r3.getArguments()     // Catch: java.lang.Exception -> L74 java.lang.Throwable -> L84
            X.C08H8.LIZ(r0)     // Catch: java.lang.Exception -> L74 java.lang.Throwable -> L84
            goto L47
        L70:
            r5.recycle()     // Catch: java.lang.Exception -> L74 java.lang.Throwable -> L84
            goto L80
        L74:
            r0 = move-exception
            goto L7b
        L76:
            r0 = move-exception
            r5 = r1
            goto L85
        L79:
            r0 = move-exception
            r5 = r1
        L7b:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L84
            if (r5 == 0) goto L83
        L80:
            r5.recycle()
        L83:
            return
        L84:
            r0 = move-exception
        L85:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L84
            if (r5 == 0) goto L8d
            r5.recycle()
        L8d:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ARunnableS103S0100000_3.LIZ$8():void");
    }

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
            case 15:
                run$15(this);
                break;
            case 16:
                run$16(this);
                break;
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                run$17(this);
                break;
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                run$18(this);
                break;
            case 19:
                run$19(this);
                break;
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                run$20(this);
                break;
            case 21:
                run$21(this);
                break;
            case 22:
                run$22(this);
                break;
            case 23:
                run$23(this);
                break;
            case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                run$24(this);
                break;
            case 25:
                run$25(this);
                break;
            case 26:
                run$26(this);
                break;
            case 27:
                run$27(this);
                break;
            case 28:
                run$28(this);
                break;
            case 29:
                run$29(this);
                break;
            case 30:
                run$30(this);
                break;
            case 31:
                run$31(this);
                break;
            case 32:
                run$32(this);
                break;
            case LiveToolbarIconStyleSetting.GRAY_WITHOUT_TEXT /* 33 */:
                run$33(this);
                break;
            case LiveToolbarIconStyleSetting.COLORFUL_WITHOUT_TEXT /* 34 */:
                run$34(this);
                break;
            case 35:
                run$35(this);
                break;
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITHOUT_TEXT /* 36 */:
                run$36(this);
                break;
            case 37:
                run$37(this);
                break;
            case 38:
                run$38(this);
                break;
            case 39:
                run$39(this);
                break;
            case 40:
                run$40(this);
                break;
            case 41:
                run$41(this);
                break;
            case 42:
                run$42(this);
                break;
            case 43:
                run$43(this);
                break;
            case 44:
                run$44(this);
                break;
            case 45:
                run$45(this);
                break;
            case 46:
                run$46(this);
                break;
            case 47:
                run$47(this);
                break;
            case 48:
                run$48(this);
                break;
            case 49:
                run$49(this);
                break;
            case BaseNotice.RECOMMEND_LIVE /* 50 */:
                run$50(this);
                break;
            case 51:
                run$51(this);
                break;
            case 52:
                run$52(this);
                break;
            case 53:
                run$53(this);
                break;
            case 54:
                run$54(this);
                break;
            case 55:
                run$55(this);
                break;
            case 56:
                run$56(this);
                break;
            case 57:
                run$57(this);
                break;
            case 58:
                run$58(this);
                break;
            case 59:
                run$59(this);
                break;
            case 60:
                run$60(this);
                break;
            case 61:
                run$61(this);
                break;
            case BaseNotice.CREATOR /* 62 */:
                run$62(this);
                break;
            case 63:
                run$63(this);
                break;
            case 64:
                run$64(this);
                break;
            case 65:
                run$65(this);
                break;
            case 66:
                run$66(this);
                break;
            case 67:
                run$67(this);
                break;
            case 68:
                run$68(this);
                break;
            case 69:
                run$69(this);
                break;
            case 70:
                run$70(this);
                break;
            case 71:
                run$71(this);
                break;
            case DMInboxChangeRightZoneClickableSizeExp.NEW_DP_SIZE /* 72 */:
                run$72(this);
                break;
            case 73:
                run$73(this);
                break;
            case 74:
                run$74(this);
                break;
            case 75:
                run$75(this);
                break;
            case 76:
                run$76(this);
                break;
            case 77:
                run$77(this);
                break;
            case 78:
                run$78(this);
                break;
            case 79:
                run$79(this);
                break;
            case 80:
                run$80(this);
                break;
            case 81:
                run$81(this);
                break;
            case 82:
                run$82(this);
                break;
            case 83:
                run$83(this);
                break;
            case 84:
                run$84(this);
                break;
            case 85:
                run$85(this);
                break;
            case 86:
                run$86(this);
                break;
            case 87:
                run$87(this);
                break;
            case 88:
                run$88(this);
                break;
            case 89:
                run$89(this);
                break;
            case 90:
                run$90(this);
                break;
            case 91:
                run$91(this);
                break;
            case 92:
                run$92(this);
                break;
            case 93:
                run$93(this);
                break;
            case 94:
                run$94(this);
                break;
            case 95:
                run$95(this);
                break;
            case 96:
                run$96(this);
                break;
            case 97:
                run$97(this);
                break;
            case 98:
                run$98(this);
                break;
            case 99:
                run$99(this);
                break;
            case 100:
                run$100(this);
                break;
            case 101:
                run$101(this);
                break;
            case 102:
                run$102(this);
                break;
            case 103:
                run$103(this);
                break;
            case 104:
                run$104(this);
                break;
            case 105:
                run$105(this);
                break;
            case 106:
                run$106(this);
                break;
            case 107:
                run$107(this);
                break;
            case 108:
                run$108(this);
                break;
            case 109:
                run$109(this);
                break;
            case 110:
                run$110(this);
                break;
            case 111:
                run$111(this);
                break;
            case 112:
                run$112(this);
                break;
            case 113:
                run$113(this);
                break;
            case 114:
                run$114(this);
                break;
            case 115:
                run$115(this);
                break;
            case 116:
                run$116(this);
                break;
            case 117:
                run$117(this);
                break;
            case 118:
                run$118(this);
                break;
            case 119:
                run$119(this);
                break;
            case 120:
                run$120(this);
                break;
            case 121:
                run$121(this);
                break;
            case 122:
                run$122(this);
                break;
            case 123:
                run$123(this);
                break;
            case 124:
                run$124(this);
                break;
            case 125:
                run$125(this);
                break;
            case 126:
                run$126(this);
                break;
            case 127:
                run$127(this);
                break;
            case 128:
                run$128(this);
                break;
            case 129:
                run$129(this);
                break;
            case 130:
                run$130(this);
                break;
            case 131:
                run$131(this);
                break;
            case 132:
                run$132(this);
                break;
            case 133:
                run$133(this);
                break;
            case 134:
                run$134(this);
                break;
            case 135:
                run$135(this);
                break;
            case 136:
                run$136(this);
                break;
            case 137:
                run$137(this);
                break;
            case 138:
                run$138(this);
                break;
            case 139:
                run$139(this);
                break;
            case 140:
                run$140(this);
                break;
            case 141:
                run$141(this);
                break;
            case 142:
                run$142(this);
                break;
            case 143:
                run$143(this);
                break;
            case 144:
                run$144(this);
                break;
            case 145:
                run$145(this);
                break;
            case 146:
                run$146(this);
                break;
            case 147:
                run$147(this);
                break;
            case 148:
                run$148(this);
                break;
            case 149:
                run$149(this);
                break;
            case 150:
                run$150(this);
                break;
            case 151:
                run$151(this);
                break;
            case 152:
                run$152(this);
                break;
            case 153:
                run$153(this);
                break;
            case 154:
                run$154(this);
                break;
            case 155:
                run$155(this);
                break;
            case 156:
                run$156(this);
                break;
            case 157:
                run$157(this);
                break;
            case 158:
                run$158(this);
                break;
            case 159:
                run$159(this);
                break;
            case 160:
                run$160(this);
                break;
            case 161:
                run$161(this);
                break;
            case 162:
                run$162(this);
                break;
            case 163:
                run$163(this);
                break;
            case 164:
                run$164(this);
                break;
            case 165:
                run$165(this);
                break;
            case 166:
                run$166(this);
                break;
            case 167:
                run$167(this);
                break;
            case 168:
                run$168(this);
                break;
            case 169:
                run$169(this);
                break;
            case 170:
                run$170(this);
                break;
            case 171:
                run$171(this);
                break;
            case 172:
                run$172(this);
                break;
            case 173:
                run$173(this);
                break;
            case 174:
                run$174(this);
                break;
            case 175:
                run$175(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        Activity activity = (Activity) this.l0;
        Iterator<T> it2 = C20633086l.LIZ.iterator();
        while (it2.hasNext()) {
            List list = (List) it2.next();
            Iterator it3 = list.iterator();
            while (it3.hasNext()) {
                if (Intrinsics.LJFF(it3.next(), activity)) {
                    Iterator it4 = list.iterator();
                    while (it4.hasNext()) {
                        AbstractActivityC1743740vTg abstractActivityC1743740vTg = (AbstractActivityC1743740vTg) it4.next();
                        if (!Intrinsics.LJFF(abstractActivityC1743740vTg, activity)) {
                            it4.remove();
                            abstractActivityC1743740vTg.finish();
                        }
                    }
                    return;
                }
            }
        }
    }

    public final void LIZ$1() {
        Iterator it2 = ((HashMap) this.l0).entrySet().iterator();
        while (it2.hasNext()) {
            try {
                ((FutureTask) ((Map.Entry) it2.next()).getValue()).run();
                C189200o6.m2constructorimpl(Unit.LIZ);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
        }
    }

    public final void LIZ$10() {
        ViewGroup.LayoutParams layoutParams;
        View view = ((CommentAudioRecordAssem) this.l0).LLJJLIIIJLLLLLLLZ;
        if (view == null || view.getParent() == null) {
            return;
        }
        View view2 = ((CommentAudioRecordAssem) this.l0).LLJJLIIIJLLLLLLLZ;
        if ((view2 != null ? view2.getWidth() : 0) > C814420VxA.LIZIZ(C418440Gaw.LIZIZ(100))) {
            View view3 = ((CommentAudioRecordAssem) this.l0).LLJJLIIIJLLLLLLLZ;
            if (view3 != null && (layoutParams = view3.getLayoutParams()) != null) {
                layoutParams.width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(100));
            }
            View view4 = ((CommentAudioRecordAssem) this.l0).LLJJLIIIJLLLLLLLZ;
            if (view4 != null) {
                view4.requestLayout();
            }
        }
    }

    public final void LIZ$11() {
        AbstractC484810Izn abstractC484810Izn = ((LiveSurveyWidgetV2) this.l0).LLJJJ;
        if (abstractC484810Izn == null || abstractC484810Izn.getParent() == null) {
            return;
        }
        LiveSurveyWidgetV2 liveSurveyWidgetV2 = (LiveSurveyWidgetV2) this.l0;
        AwS551S0100000_7 awS551S0100000_7 = new AwS551S0100000_7(liveSurveyWidgetV2, 719);
        Rect rectLIZ = C0J0T.LIZ(liveSurveyWidgetV2.LLJJJ);
        View viewFindViewById = liveSurveyWidgetV2.LLJILJIL.findViewById(R.id.ysu);
        if (viewFindViewById != null && C0J0T.LIZ(viewFindViewById).bottom < rectLIZ.bottom) {
            awS551S0100000_7.invoke();
            return;
        }
        if (liveSurveyWidgetV2.LLJILJIL.getChildCount() < 1 || !(liveSurveyWidgetV2.LLJILJIL.getChildAt(0) instanceof InterfaceC464060IHs)) {
            awS551S0100000_7.invoke();
            return;
        }
        Rect rectLIZ2 = C0J0T.LIZ(liveSurveyWidgetV2.LLJILJIL.getChildAt(0));
        int i = rectLIZ2.bottom;
        int i2 = rectLIZ.bottom;
        if (i >= i2) {
            int i3 = rectLIZ2.right;
            int i4 = rectLIZ.right;
            if (i3 >= i4) {
                int i5 = rectLIZ.left;
                int i6 = rectLIZ2.left;
                int i7 = rectLIZ.top;
                int i8 = rectLIZ2.top;
                C23250099c.LIZLLL(C817503Hh.LL, C0PEM.LIZJ, null, new C2438909h5(liveSurveyWidgetV2, i5 - i6, i7 - i8, i4 - i6, i2 - i8, awS551S0100000_7, null), 2);
                return;
            }
        }
        awS551S0100000_7.invoke();
    }

    public final void LIZ$12() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("name", ((C2367609Pm) this.l0).LIZ);
        jSONObject.put("duration", ((C2367609Pm) this.l0).LIZIZ);
        jSONObject.put("java_alloc_avg", ((C2367609Pm) this.l0).LIZJ);
        jSONObject.put("java_diff", ((C2367609Pm) this.l0).LIZLLL);
        jSONObject.put("java_peak", ((C2367609Pm) this.l0).LJ);
        jSONObject.put("gc_cnt_avg", ((C2367609Pm) this.l0).LJFF);
        jSONObject.put("gc_tm_avg", ((C2367609Pm) this.l0).LJI);
        jSONObject.put("native_diff", ((C2367609Pm) this.l0).LJII);
        jSONObject.put("native_peak", ((C2367609Pm) this.l0).LJIIIIZZ);
        jSONObject.put("pss_diff", ((C2367609Pm) this.l0).LJIIIZ);
        jSONObject.put("pss_peak", ((C2367609Pm) this.l0).LJIIJ);
        jSONObject.put("vss_diff", ((C2367609Pm) this.l0).LJIIJJI);
        jSONObject.put("mt_minflt_avg", ((C2367609Pm) this.l0).LJIIL);
        jSONObject.put("mt_majflt_avg", ((C2367609Pm) this.l0).LJIILIIL);
        jSONObject.put("proc_minflt_avg", ((C2367609Pm) this.l0).LJIILJJIL);
        jSONObject.put("proc_majflt_avg", ((C2367609Pm) this.l0).LJIILL);
        jSONObject.put("thread_diff", ((C2367609Pm) this.l0).LJIILLIIL);
        jSONObject.put("thread_peak", ((C2367609Pm) this.l0).LJIIZILJ);
        C20684815ws.LJIJ("app_page_memory", jSONObject);
    }

    public final void LIZ$13() throws JSONException {
        ((C118300cf) this.l0).element++;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("activity", C09PZ.LIZ);
        jSONObject.put("fragment", C09PZ.LIZIZ);
        jSONObject.put("index", ((C118300cf) this.l0).element);
        C20684815ws.LJIJ("memory_homepage_destroy", jSONObject);
    }

    public final void LIZ$15() throws Throwable {
        try {
            C0VSJ c0vsj = new C0VSJ(C570220MYa.LJIIIZ(false), "global.log");
            File parentFile = c0vsj.getParentFile();
            if (parentFile != null) {
                parentFile.mkdirs();
            }
            if (!c0vsj.exists()) {
                c0vsj.createNewFile();
            }
            if (c0vsj.length() > 307200) {
                C570220MYa.LJIIL(c0vsj);
            }
            String strLJIILL = C570220MYa.LJIIIIZZ().LJIILL((DraftLogEntry) this.l0);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(strLJIILL);
            sbLIZ.append('\n');
            C09BH.LIZJ(c0vsj, C2188811AlT.LIZIZ(sbLIZ), Charsets.UTF_8);
            C0MAY c0may = C0MAY.LIZIZ;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("Logged global ");
            sbLIZ2.append(((DraftLogEntry) this.l0).type);
            C201955140j.LIZLLL(c0may, "DraftLogService", C2188811AlT.LIZIZ(sbLIZ2));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C201955140j.LJIIIZ(C0MAY.LIZIZ, "DraftLogService", "Append global log entry failed", e);
        }
    }

    public final void LIZ$16() {
        try {
            C081B c081b = (C081B) this.l0;
            C2204961BRm.a0(c081b.LJ, c081b.LIZ, new Object[0], new C0WZX("dzBzEgAjS8/YVFkiQFyHacu2SzYe4KnOjdD2gYpcsLeObzfHvfHxmHbXx39VWzZkHhUoDg==", null));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            ((C081B) this.l0).LJFF.LIZIZ("cpuboost boost fail:" + th.getMessage());
        }
    }

    public final void LIZ$18() {
        String json = GsonProtectorUtils.toJson((Gson) ((C08I9) this.l0).LJ.getValue(), ((C08I9) this.l0).LIZJ);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("persistRecords ");
        sbLIZ.append(json);
        C2188811AlT.LIZIZ(sbLIZ);
        Keva keva = (Keva) ((C08I9) this.l0).LIZLLL.getValue();
        ((C08I9) this.l0).getClass();
        keva.storeString(C08I9.LIZ(), json);
    }

    public final void LIZ$2() {
        Object c098200Yq;
        try {
            c098200Yq = ((C12G1) this.l0).mView;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        View view = (View) c098200Yq;
        if (view != null) {
            C1389890mGx c1389890mGx = new C1389890mGx(view);
            c1389890mGx.LJIIIZ(2131821394);
            c1389890mGx.LJIIJJI();
        }
    }

    public final void LIZ$20() {
        try {
            AnonymousClass0816 anonymousClass0816 = (AnonymousClass0816) this.l0;
            Method method = anonymousClass0816.LIZIZ;
            if (method != null) {
                int i = Build.VERSION.SDK_INT;
                if (i >= 29) {
                    C2204961BRm.a0(method, null, new Object[]{"UniperfClient", 4099}, new C0WZX("dzBzEgAjS8/YVFkiQFyLcpvO97ZblugMViyjFoquIVMswvceEmYyJ9ObIiXehIh5WG/mkIaqeJXM2DO0g+U=", null));
                } else if (i >= 26) {
                    if (anonymousClass0816.LIZLLL == null) {
                        anonymousClass0816.LIZLLL = new int[]{5000};
                    }
                    C2204961BRm.a0(method, anonymousClass0816.LIZ, new Object[]{4099, "", ((AnonymousClass0816) this.l0).LIZLLL}, new C0WZX("dzBzEgAjS8/YVFkiQFyLcpvO97ZblugMViyjFoquIVMswvceEmYyJ9ObIiXehIh5WG/mkIaqeJXM2DO0g+U=", null));
                }
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public final void LIZ$21() {
        try {
            C20490080y c20490080y = (C20490080y) this.l0;
            Method method = c20490080y.LIZIZ;
            if (method != null) {
                Object obj = c20490080y.LIZ;
                ((C20490080y) this.l0).getClass();
                ((C20490080y) this.l0).getClass();
                C2204961BRm.a0(method, obj, new Object[]{0, -50, null}, new C0WZX("dzBzEgAjS8/YVFkiQFyLcpvO97ZblugMViyjFoquIVMswvceEmYyJ9ObIiXehIh5WGnbqaelQpDp3Raw", null));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public final void LIZ$22() {
        try {
            C20491080z c20491080z = (C20491080z) this.l0;
            Method method = c20491080z.LIZIZ;
            if (method != null) {
                Object obj = c20491080z.LIZ;
                c20491080z.getClass();
                ((C20491080z) this.l0).getClass();
                C2204961BRm.a0(method, obj, new Object[]{-50, null}, new C0WZX("dzBzEgAjS8/YVFkiQFyLcpvO97ZblugMViyjFoquIVMswvceEmYyJ9ObIiXehIh5WHXsjYKMUYba6wWnlA==", null));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public final void LIZ$23() {
        try {
            try {
                C083F.LJ = C1968107nL.LIZLLL(C083F.LJII, new Object[0]);
                synchronized (this.l0) {
                    try {
                        this.l0.notify();
                    } finally {
                    }
                }
            } catch (Exception th) {
                synchronized (this.l0) {
                    try {
                        this.l0.notify();
                    } finally {
                    }
                }
            }
        } catch (Throwable th2) {
            synchronized (this.l0) {
                try {
                    this.l0.notify();
                    throw th2;
                } finally {
                }
            }
        }
    }

    public final void LIZ$24() {
        String savePath;
        C01GW c01gw = C2249208ra.LIZ;
        DownloadInfo downloadInfo = (DownloadInfo) this.l0;
        if (downloadInfo == null || (savePath = downloadInfo.getSavePath()) == null) {
            savePath = (String) C2249208ra.LIZLLL.getValue();
        }
        if (C2249208ra.LJ.LIZ) {
            Keva keva = C2249208ra.LIZJ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("last_clean_timestamp");
            sbLIZ.append(savePath);
            long j = keva.getLong(C2188811AlT.LIZIZ(sbLIZ), 0L);
            long jCurrentTimeMillis = System.currentTimeMillis();
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("checkAndClean for cacheDir: ");
            sbLIZ2.append(savePath);
            sbLIZ2.append(", keva lastCleanTimestamp: ");
            sbLIZ2.append(j);
            sbLIZ2.append(", now: ");
            sbLIZ2.append(jCurrentTimeMillis);
            C2188811AlT.LIZIZ(sbLIZ2);
            if (j <= 0) {
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("last_clean_timestamp");
                sbLIZ3.append(savePath);
                keva.storeLong(C2188811AlT.LIZIZ(sbLIZ3), jCurrentTimeMillis);
                return;
            }
            if (jCurrentTimeMillis - j >= 86400000) {
                try {
                    C0VSJ c0vsj = new C0VSJ(savePath);
                    if (c0vsj.exists() && c0vsj.isDirectory()) {
                        C2249208ra.LIZ().LIZ(c0vsj, C2249208ra.LJ);
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                    sbLIZ4.append("checkAndClean failed: ");
                    sbLIZ4.append(th.getMessage());
                    C2188811AlT.LIZIZ(sbLIZ4);
                }
                Keva keva2 = C2249208ra.LIZJ;
                StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                sbLIZ5.append("last_clean_timestamp");
                sbLIZ5.append(savePath);
                keva2.storeLong(C2188811AlT.LIZIZ(sbLIZ5), System.currentTimeMillis());
            }
        }
    }

    public final void LIZ$25() {
        try {
            try {
                C083E.LIZIZ = C1964607mm.LIZIZ(C083E.LIZ, "currentActivityThread", new Object[0]);
                synchronized (this.l0) {
                    try {
                        this.l0.notify();
                    } finally {
                    }
                }
            } catch (Exception th) {
                synchronized (this.l0) {
                    try {
                        this.l0.notify();
                    } finally {
                    }
                }
            }
        } catch (Throwable th2) {
            synchronized (this.l0) {
                try {
                    this.l0.notify();
                    throw th2;
                } finally {
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v34, types: [X.08DS, java.lang.Object] */
    public final void LIZ$3() {
        int i;
        if (!QueuedWorkHelper.LJFF && (i = Build.VERSION.SDK_INT) >= 26 && i <= 33) {
            try {
                Class<?> cls = Class.forName("android.app.QueuedWork");
                Field fieldLIZ = C1961107mD.LIZ(cls, "sHandler");
                QueuedWorkHelper.LIZLLL = C1961107mD.LIZ(cls, "sWork");
                Field fieldLIZ2 = C1961107mD.LIZ(cls, "sFinishers");
                Field fieldLIZ3 = C1961107mD.LIZ(cls, "sLock");
                Method methodLIZIZ = C1961107mD.LIZIZ(cls, "getHandler", new Class[0]);
                if (methodLIZIZ != null) {
                    C2204961BRm.a0(methodLIZIZ, null, new Object[0], new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KP+8apPdkgOa6YzKZtfSPy+Ew5LdZSo=", null));
                    if (fieldLIZ != null) {
                        QueuedWorkHelper.LIZ = (Handler) fieldLIZ.get(null);
                        Field field = QueuedWorkHelper.LIZLLL;
                        if (field != null && fieldLIZ3 != null) {
                            QueuedWorkHelper.LIZIZ = (LinkedList) field.get(null);
                            QueuedWorkHelper.LJ = fieldLIZ3.get(null);
                        }
                        if (QueuedWorkHelper.LIZIZ != null && QueuedWorkHelper.LJ != null) {
                            ?? r0 = new LinkedList() { // from class: X.08DS
                                @Override // java.util.LinkedList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List, java.util.Deque, java.util.Queue
                                public final boolean add(Object obj) {
                                    return true;
                                }

                                @Override // java.util.LinkedList, java.util.Deque, java.util.Queue
                                public final Object poll() {
                                    try {
                                        if (Build.VERSION.SDK_INT >= 31) {
                                            QueuedWorkHelper.LIZIZ = (LinkedList) QueuedWorkHelper.LIZLLL.get(null);
                                            return null;
                                        }
                                    } catch (Throwable th) {
                                        TryCatchGuardChecker.doCheck(th);
                                    }
                                    return null;
                                }

                                @Override // java.util.LinkedList, java.util.AbstractCollection, java.util.Collection, java.util.List, java.util.Deque
                                public final boolean remove(Object obj) {
                                    return true;
                                }
                            };
                            QueuedWorkHelper.LIZJ = r0;
                            fieldLIZ2.set(null, r0);
                            fieldLIZ.set(null, new QueuedWorkHelper.ProxyHandler(QueuedWorkHelper.LIZ.getLooper()));
                            QueuedWorkHelper.LJFF = true;
                        }
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        QueuedWorkHelper.LJI = 100;
        final Context context = (Context) this.l0;
        int i2 = C2187451AjH.LIZ;
        int i3 = C08DU.LIZ;
        if (i3 > 0) {
            PerfLockBooster.setGlobalExtendBoostLevel(i3);
        }
        if (C08DV.LIZ) {
            PerfLockBooster.setsFixQualUnTrustedAppAccessIssue(true);
        }
        AnonymousClass0811 anonymousClass0811 = AnonymousClass0810.LIZ;
        C081S c081s = new C081S();
        try {
            anonymousClass0811.LJFF = C786410Ut5.N3(context);
            anonymousClass0811.LIZ = c081s;
            int i4 = Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).getInt("perflock_data", 0);
            anonymousClass0811.LIZLLL = (i4 >> 8) & 255;
            anonymousClass0811.LIZJ = i4 & 255;
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
        }
        C786410Ut5.LJJZZIII(C799570VYd.LIZIZ(), new Runnable() { // from class: X.1AkH
            public final void LIZ() {
                FrameworkPerfLockParams frameworkPerfLockParams = (FrameworkPerfLockParams) C2188111AkL.LIZ.getValue();
                if (frameworkPerfLockParams != null && frameworkPerfLockParams.enable) {
                    long j = C0BFR.LIZ;
                    if (j != -1) {
                        C0CN5.LIZIZ(Long.valueOf(j), new ARunnableS102S0200000_33(frameworkPerfLockParams, context, 21));
                        return;
                    } else {
                        C2187451AjH.LJIJJ(frameworkPerfLockParams.type, frameworkPerfLockParams.perflockParmaString, PerfLockBooster.boostByFrameworkPerfLock(context, frameworkPerfLockParams.type, frameworkPerfLockParams.perflockParmaString, frameworkPerfLockParams.timeout));
                        return;
                    }
                }
                AnonymousClass0811 anonymousClass08112 = AnonymousClass0810.LIZ;
                int i5 = anonymousClass08112.LIZJ;
                if (i5 == 2) {
                    if (C0N7U.LIZ) {
                        anonymousClass08112.LIZ(50000, null);
                    }
                } else if (i5 == 3 && C309620CBs.LIZ) {
                    anonymousClass08112.LIZ(50000, null);
                }
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("OptimizerHelper@3f44.initPerflock$2");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("OptimizerHelper@3f44.initPerflock$2");
            }
        });
        Context context2 = (Context) this.l0;
        C08DX c08dx = new C08DX() { // from class: X.08DW
        };
        if (!C2408409cA.LJFF) {
            C2408409cA.LJIIIZ = c08dx;
            C2408409cA.LIZJ = Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).getInt("network_data", 0) == 1;
            C2408409cA.LJFF = true;
        }
        if (C2408409cA.LIZJ && C08DT.LIZ) {
            C2408409cA.LIZLLL = true;
            if (C2187451AjH.LJIIJ()) {
                C2408409cA.LJ = true;
            }
            C2408409cA.LIZIZ(context2);
        }
    }

    public final void LIZ$7() {
        try {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(((C09MI) this.l0).LJ);
            sbLIZ.append("/thumbs");
            C0VSJ c0vsj = new C0VSJ(C2188811AlT.LIZIZ(sbLIZ));
            if (!c0vsj.exists()) {
                c0vsj.mkdirs();
                return;
            }
            File[] fileArrListFiles = c0vsj.listFiles();
            if (!c0vsj.isDirectory() || fileArrListFiles == null) {
                return;
            }
            C089E c089e = new C089E(fileArrListFiles);
            while (c089e.hasNext()) {
                ((File) c089e.next()).delete();
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public final void LIZ$9() {
        ViewGroup.LayoutParams layoutParams;
        View view = ((CommentAudioRecordAssem) this.l0).LLJJL;
        if (view == null || view.getParent() == null) {
            return;
        }
        View view2 = ((CommentAudioRecordAssem) this.l0).LLJJL;
        if ((view2 != null ? view2.getWidth() : 0) > C814420VxA.LIZIZ(C418440Gaw.LIZIZ(100))) {
            View view3 = ((CommentAudioRecordAssem) this.l0).LLJJL;
            if (view3 != null && (layoutParams = view3.getLayoutParams()) != null) {
                layoutParams.width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(100));
            }
            View view4 = ((CommentAudioRecordAssem) this.l0).LLJJL;
            if (view4 != null) {
                view4.requestLayout();
            }
        }
    }

    public final void LIZIZ$5() {
        C844470XAv.LIZ.getClass();
        if (C844470XAv.LJIILL.equals("lark_inhouse") || ((IExternalService) ServiceManager.get().getService(IExternalService.class)).publishService().isPublishing()) {
            return;
        }
        if (C786410Ut5.w2((Context) this.l0) != null && C786410Ut5.w2((Context) this.l0).getParent() != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(C786410Ut5.w2((Context) this.l0).getAbsolutePath());
            sbLIZ.append("/cacheV2");
            C2354709Kn.LJIJJ(C2188811AlT.LIZIZ(sbLIZ));
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(C786410Ut5.w2((Context) this.l0).getParent());
            sbLIZ2.append("/app_assets");
            C2354709Kn.LJIJJ(C2188811AlT.LIZIZ(sbLIZ2));
            C2344809Gs.LIZLLL(6, "StorageClearTask", "clear appassets ");
        }
        if (LIZ$4((Context) this.l0) != null && LIZ$4((Context) this.l0).getAbsolutePath() != null) {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append(LIZ$4((Context) this.l0).getAbsolutePath());
            sbLIZ3.append("/offline");
            C2354709Kn.LJIJJ(C2188811AlT.LIZIZ(sbLIZ3));
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append(LIZ$4((Context) this.l0).getAbsolutePath());
            sbLIZ4.append("/offlineX");
            C2354709Kn.LJIJJ(C2188811AlT.LIZIZ(sbLIZ4));
            C2344809Gs.LIZLLL(6, "StorageClearTask", "clear offlineX ");
        }
        C2344809Gs.LIZLLL(6, "StorageClearTask", "clear data ");
    }

    public final void LIZ$17() {
        SettingsManager.LIZLLL().getClass();
        int iLJ = SettingsManager.LJ("covode_config", 2);
        try {
            DataOutputStream dataOutputStream = new DataOutputStream(new C0VSV(C08O4.LIZ((Context) this.l0)));
            dataOutputStream.writeInt(iLJ);
            dataOutputStream.close();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("covode set covode_enable: ");
            sbLIZ.append(iLJ);
            C2188811AlT.LIZIZ(sbLIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public final void LIZ$19() {
        SettingsManager.LIZLLL().getClass();
        boolean zLIZ = SettingsManager.LIZ("keva_bak_sp", false);
        C08Q0.LJFF((Context) this.l0).edit().putBoolean("keva_bak_sp", zLIZ).apply();
        try {
            DataOutputStream dataOutputStream = new DataOutputStream(new C0VSV(C08O8.LIZ((Context) this.l0)));
            dataOutputStream.writeBoolean(zLIZ);
            dataOutputStream.close();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("keva set keva_bak_sp: ");
            sbLIZ.append(zLIZ);
            Log.println(4, "Keva", C2188811AlT.LIZIZ(sbLIZ));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public final void LIZ$6() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(((C1271460jBw) this.l0).LIZIZ);
        sbLIZ.append("/");
        C1271460jBw c1271460jBw = (C1271460jBw) this.l0;
        int i = c1271460jBw.LIZJ + 1;
        c1271460jBw.LIZJ = i;
        sbLIZ.append(i);
        sbLIZ.append(".png");
        try {
            C0VSJ c0vsj = new C0VSJ(C2188811AlT.LIZIZ(sbLIZ));
            if (c0vsj.exists()) {
                c0vsj.delete();
            }
            C0VSV c0vsv = new C0VSV(c0vsj);
            synchronized (((C1271460jBw) this.l0).LJI) {
                try {
                    ((C1271460jBw) this.l0).LIZLLL.compress(Bitmap.CompressFormat.PNG, 100, c0vsv);
                } finally {
                    TryCatchGuardChecker.doCheck(th);
                }
            }
            c0vsv.flush();
            c0vsv.close();
        } catch (Exception th) {
        }
    }

    public static File LIZ$4(Context context) throws Throwable {
        File file = C786450Ut9.LIZJ;
        if (file != null && C786450Ut9.LJ) {
            return file;
        }
        try {
            C786450Ut9.LIZJ = context.getFilesDir();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            Context applicationContext = null;
            try {
                Class<?> cls = Class.forName("android.app.ActivityThread");
                Object objInvoke = cls.getDeclaredMethod("currentActivityThread", new Class[0]).invoke(null, new Object[0]);
                Field declaredField = cls.getDeclaredField("mInitialApplication");
                declaredField.setAccessible(true);
                Object obj = declaredField.get(objInvoke);
                if (obj instanceof Application) {
                    applicationContext = ((Application) obj).getApplicationContext();
                    PrintStream printStream = System.out;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Application context obtained through ActivityThread: ");
                    sbLIZ.append(applicationContext);
                    printStream.println(C2188811AlT.LIZIZ(sbLIZ));
                } else {
                    System.out.println("Error: mInitialApplication is not an instance of Application");
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                PrintStream printStream2 = System.out;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("Error: ");
                sbLIZ2.append(e.getMessage());
                printStream2.println(C2188811AlT.LIZIZ(sbLIZ2));
            }
            if (applicationContext != null) {
                C786450Ut9.LIZJ = applicationContext.getFilesDir();
                C08RN.LIZ(applicationContext);
            } else {
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append(th.getMessage());
                sbLIZ3.append(":");
                sbLIZ3.append(C08RN.LIZJ());
                sbLIZ3.append(" applicationContext is null");
                throw new Throwable(C2188811AlT.LIZIZ(sbLIZ3));
            }
        }
        return C786450Ut9.LIZJ;
    }

    public static final void run$0(ARunnableS103S0100000_3 aRunnableS103S0100000_3) {
        boolean zLIZ;
        C1C7U.LIZ("DeeplinkEventHelper@3d28.reportDeeplinkCallRouter$runnable$1");
        try {
            C20684815ws.LJIJ("deep_link_call_router", ((C2241008qG) aRunnableS103S0100000_3.l0).LJ());
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("DeeplinkEventHelper@3d28.reportDeeplinkCallRouter$runnable$1");
    }

    public static final void run$1(ARunnableS103S0100000_3 aRunnableS103S0100000_3) {
        boolean zLIZ;
        C1C7U.LIZ("DeeplinkEventHelper@3d28.reportDeeplinkJumpStart$runnable$1");
        try {
            C20684815ws.LJIJ("deep_link_jump_start", ((C2241008qG) aRunnableS103S0100000_3.l0).LJ());
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("DeeplinkEventHelper@3d28.reportDeeplinkJumpStart$runnable$1");
    }

    public static final void run$10(ARunnableS103S0100000_3 aRunnableS103S0100000_3) {
        Context context = (Context) aRunnableS103S0100000_3.l0;
        C1C7U.LIZ("SearchPreloadLancet@a104.asyncRaceView$1L");
        try {
            Class<?> cls = Class.forName("com.ss.android.ugc.gamora.recorder.splitshoot.SplitShootScenePreloader");
            cls.getDeclaredMethod("asyncRace", WeakReference.class).invoke(cls.getDeclaredField("INSTANCE").get(cls), new WeakReference(context));
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            Class<?> cls2 = Class.forName("com.ss.android.ugc.aweme.shortvideo.record.RecordBottomTabConfigurePreloader");
            cls2.getDeclaredMethod("asyncRace", WeakReference.class).invoke(cls2.getDeclaredField("INSTANCE").get(cls2), new WeakReference(context));
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        C1C7U.LIZIZ("SearchPreloadLancet@a104.asyncRaceView$1L");
    }

    public static final void run$100(ARunnableS103S0100000_3 aRunnableS103S0100000_3) {
        boolean zLIZ;
        C1C7U.LIZ("MemoryHomepageDestroyMonitor@b95c.start$action$1");
        try {
            aRunnableS103S0100000_3.LIZ$13();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("MemoryHomepageDestroyMonitor@b95c.start$action$1");
    }

    public static final void run$101(ARunnableS103S0100000_3 aRunnableS103S0100000_3) {
        InterfaceC2115108Qj interfaceC2115108Qj = (InterfaceC2115108Qj) aRunnableS103S0100000_3.l0;
        C1C7U.LIZ("PreloaderInAppInit@7d81.preloadInClassLoaderCreated$7$lambda$run$0$1L");
        ((C2115008Qi) interfaceC2115108Qj).LIZ.run();
        C1C7U.LIZIZ("PreloaderInAppInit@7d81.preloadInClassLoaderCreated$7$lambda$run$0$1L");
    }

    public static final void run$102(ARunnableS103S0100000_3 aRunnableS103S0100000_3) {
        boolean zLIZ;
        C1C7U.LIZ("OpenDetailFeedUtil@d51c.post$1");
        try {
            ((Function0) aRunnableS103S0100000_3.l0).invoke();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("OpenDetailFeedUtil@d51c.post$1");
    }

    public static final void run$103(ARunnableS103S0100000_3 aRunnableS103S0100000_3) {
        boolean zLIZ;
        C1C7U.LIZ("NLEModelChecker@f5d7.checkNLEResType$1");
        try {
            ((Function0) aRunnableS103S0100000_3.l0).invoke();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("NLEModelChecker@f5d7.checkNLEResType$1");
    }

    public static final void run$104(ARunnableS103S0100000_3 aRunnableS103S0100000_3) {
        boolean zLIZ;
        C1C7U.LIZ("NLEModelChecker@f5d7.checkNLEResType$2");
        try {
            ((Function0) aRunnableS103S0100000_3.l0).invoke();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("NLEModelChecker@f5d7.checkNLEResType$2");
    }

    public static final void run$105(ARunnableS103S0100000_3 aRunnableS103S0100000_3) {
        boolean zLIZ;
        C1C7U.LIZ("DraftLogService@b8d8.appendSummary$1");
        try {
            aRunnableS103S0100000_3.LIZ$14();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("DraftLogService@b8d8.appendSummary$1");
    }

    public static final void run$106(ARunnableS103S0100000_3 aRunnableS103S0100000_3) {
        boolean zLIZ;
        C1C7U.LIZ("DraftLogService@b8d8.appendGlobalEntry$1");
        try {
            aRunnableS103S0100000_3.LIZ$15();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("DraftLogService@b8d8.appendGlobalEntry$1");
    }

    public static final void run$107(ARunnableS103S0100000_3 aRunnableS103S0100000_3) {
        boolean zLIZ;
        C1C7U.LIZ("TemplateAdapter@713c.setScrollState$1");
        try {
            ((C534190KxF) aRunnableS103S0100000_3.l0).notifyDataSetChanged();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("TemplateAdapter@713c.setScrollState$1");
    }

    public static final void run$108(ARunnableS103S0100000_3 aRunnableS103S0100000_3) {
        boolean zLIZ;
        C1C7U.LIZ("BaseRecUserPopup@a0a6.doInit$1");
        try {
            Iterator<Function0<Unit>> it2 = ((AbstractC1168350gVd) aRunnableS103S0100000_3.l0).LLJIJIL.iterator();
            while (it2.hasNext()) {
                it2.next().invoke();
            }
            ((AbstractC1168350gVd) aRunnableS103S0100000_3.l0).LLJIJIL.clear();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("BaseRecUserPopup@a0a6.doInit$1");
    }

    public static final void run$109(ARunnableS103S0100000_3 aRunnableS103S0100000_3) {
        boolean zLIZ;
        C1C7U.LIZ("FeedCommonUtilsKt@26a4.runOnWorkerThread$1");
        try {
            ((Function0) aRunnableS103S0100000_3.l0).invoke();
        } finally {
            try {
            } finally {
                if (!zLIZ) {
                }
            }
        }
        C1C7U.LIZIZ("FeedCommonUtilsKt@26a4.runOnWorkerThread$1");
    }

    public static final void run$11(ARunnableS103S0100000_3 aRunnableS103S0100000_3) {
        boolean zLIZ;
        C1C7U.LIZ("AnrDumper@9bf0.waitMainThreadTask$1");
        try {
            ((CountDownLatch) aRunnableS103S0100000_3.l0).countDown();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("AnrDumper@9bf0.waitMainThreadTask$1");
    }

    public static final void run$110(ARunnableS103S0100000_3 aRunnableS103S0100000_3) {
        boolean zLIZ;
        C1C7U.LIZ("PortraitCenterServiceImpl@3303.onPortraitChanged$$inlined$let$lambda$1");
        try {
            Iterator it2 = ((ArrayList) aRunnableS103S0100000_3.l0).iterator();
            while (it2.hasNext()) {
                ((InterfaceC2029707xH) it2.next()).LIZIZ();
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("PortraitCenterServiceImpl@3303.onPortraitChanged$$inlined$let$lambda$1");
    }

    public static final void run$111(ARunnableS103S0100000_3 aRunnableS103S0100000_3) {
        boolean zLIZ;
        C1C7U.LIZ("SimbaExecutor$MainExecutor@d9c8.execute$$inlined$let$lambda$1");
        try {
            ((Runnable) aRunnableS103S0100000_3.l0).run();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SimbaExecutor$MainExecutor@d9c8.execute$$inlined$let$lambda$1");
    }

    public static final void run$112(ARunnableS103S0100000_3 aRunnableS103S0100000_3) {
        boolean zLIZ;
        C1C7U.LIZ("MtkCpuBoost@dd9c.invokeBoost$1");
        try {
            aRunnableS103S0100000_3.LIZ$16();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("MtkCpuBoost@dd9c.invokeBoost$1");
    }

    public static final void run$113(ARunnableS103S0100000_3 aRunnableS103S0100000_3) {
        try {
            C2151808bs.LIZLLL((InterfaceC20236714Gf) aRunnableS103S0100000_3.l0);
        } catch (Throwable th) {
            if (!C2179971ATj.LIZ(th)) {
                throw th;
            }
        }
    }

    public static final void run$114(ARunnableS103S0100000_3 aRunnableS103S0100000_3) {
        boolean zLIZ;
        C1C7U.LIZ("AdLandingPagePopUpManager@72f2.popUpAdLandingPage$1$1");
        try {
            ((Function0) aRunnableS103S0100000_3.l0).invoke();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("AdLandingPagePopUpManager@72f2.popUpAdLandingPage$1$1");
    }

    public static final void run$115(ARunnableS103S0100000_3 aRunnableS103S0100000_3) {
        boolean zLIZ;
        C1C7U.LIZ("CovodeEnableSettings@acca.store$1");
        try {
            aRunnableS103S0100000_3.LIZ$17();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("CovodeEnableSettings@acca.store$1");
    }

    public static final void run$116(ARunnableS103S0100000_3 aRunnableS103S0100000_3) {
        WeakReference weakReference = (WeakReference) aRunnableS103S0100000_3.l0;
        C1C7U.LIZ("FirstFrameAwareSurfaceTexture@2cb3.clearInternalFrameRateListenerAsync$1L");
        FirstFrameAwareSurfaceTexture firstFrameAwareSurfaceTexture = (FirstFrameAwareSurfaceTexture) weakReference.get();
        if (firstFrameAwareSurfaceTexture != null) {
            AnimaXLog.LIZIZ("AnimaXFirstFrameAwareSurfaceTexture", "clearInternalFrameRateListenerAsync: Executing cleanup");
            if (Build.VERSION.SDK_INT >= 35) {
                if (firstFrameAwareSurfaceTexture.LJFF()) {
                    AnimaXLog.LIZIZ("AnimaXFirstFrameAwareSurfaceTexture", "setNullOnSetFrameRateListener fail, handler is already null.");
                } else {
                    try {
                        Method method = SurfaceTexture.class.getMethod("setOnSetFrameRateListener", Class.forName("android.graphics.SurfaceTexture$OnSetFrameRateListener"), Handler.class);
                        method.setAccessible(true);
                        method.invoke(firstFrameAwareSurfaceTexture, null, null);
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("setNullOnSetFrameRateListener result: ");
                        sbLIZ.append(firstFrameAwareSurfaceTexture.LJFF());
                        AnimaXLog.LIZIZ("AnimaXFirstFrameAwareSurfaceTexture", C2188811AlT.LIZIZ(sbLIZ));
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("setNullOnSetFrameRateListener fail: ");
                        sbLIZ2.append(th.getMessage());
                        AnimaXLog.LIZ("AnimaXFirstFrameAwareSurfaceTexture", C2188811AlT.LIZIZ(sbLIZ2));
                    }
                }
            }
        } else {
            AnimaXLog.LIZIZ("AnimaXFirstFrameAwareSurfaceTexture", "clearInternalFrameRateListenerAsync: Skipped, reference lost");
        }
        C1C7U.LIZIZ("FirstFrameAwareSurfaceTexture@2cb3.clearInternalFrameRateListenerAsync$1L");
    }

    public static final void run$117(ARunnableS103S0100000_3 aRunnableS103S0100000_3) {
        boolean zLIZ;
        C1C7U.LIZ("BulletinVoiceTopChipFloatingPopup@33e7.dismiss$1");
        try {
            try {
                ((PopupWindow) aRunnableS103S0100000_3.l0).dismiss();
                C189200o6.m2constructorimpl(Unit.LIZ);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("BulletinVoiceTopChipFloatingPopup@33e7.dismiss$1");
    }

    public static final void run$118(ARunnableS103S0100000_3 aRunnableS103S0100000_3) {
        boolean zLIZ;
        C1C7U.LIZ("EcMixMallTriggerSignalMethod@8335.runInMainThread$1");
        try {
            ((Function0) aRunnableS103S0100000_3.l0).invoke();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("EcMixMallTriggerSignalMethod@8335.runInMainThread$1");
    }

    public static final void run$119(ARunnableS103S0100000_3 aRunnableS103S0100000_3) {
        boolean zLIZ;
        C1C7U.LIZ("PrivacyConfigurableManager@b3cb.fetchPrivacyPageConfig$1$1");
        try {
            Function0 function0 = (Function0) aRunnableS103S0100000_3.l0;
            if (function0 != null) {
                function0.invoke();
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("PrivacyConfigurableManager@b3cb.fetchPrivacyPageConfig$1$1");
    }

    public static final void run$12(ARunnableS103S0100000_3 aRunnableS103S0100000_3) {
        boolean zLIZ;
        C1C7U.LIZ("SimAppColdBootDelayUtil@417a.recordAppFirstFrameCallback$1");
        try {
            Iterator<Runnable> it2 = ((C581880Mry) aRunnableS103S0100000_3.l0).LIZJ.iterator();
            while (it2.hasNext()) {
                it2.next().run();
            }
            ((C581880Mry) aRunnableS103S0100000_3.l0).LIZJ.clear();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SimAppColdBootDelayUtil@417a.recordAppFirstFrameCallback$1");
    }

    public static final void run$120(ARunnableS103S0100000_3 aRunnableS103S0100000_3) {
        boolean zLIZ;
        C1C7U.LIZ("PrivacyConfigurableManager@b3cb.fetchPrivacyPageConfig$2$1");
        try {
            Function0 function0 = (Function0) aRunnableS103S0100000_3.l0;
            if (function0 != null) {
                function0.invoke();
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("PrivacyConfigurableManager@b3cb.fetchPrivacyPageConfig$2$1");
    }

    public static final void run$121(ARunnableS103S0100000_3 aRunnableS103S0100000_3) {
        boolean zLIZ;
        C1C7U.LIZ("WsChannelMultiProcessImpl@70c0.tryStartPushProcess$1");
        try {
            C786410Ut5.s3((Context) aRunnableS103S0100000_3.l0, new Intent((Context) aRunnableS103S0100000_3.l0, (Class<?>) WsChannelService.class));
        } finally {
            try {
            } finally {
                if (!zLIZ) {
                }
            }
        }
        C1C7U.LIZIZ("WsChannelMultiProcessImpl@70c0.tryStartPushProcess$1");
    }

    public static final void run$122(ARunnableS103S0100000_3 aRunnableS103S0100000_3) {
        boolean zLIZ;
        C1C7U.LIZ("FeedDiggCache@6d73.eraseRecords$1");
        try {
            Keva keva = (Keva) ((C08I9) aRunnableS103S0100000_3.l0).LIZLLL.getValue();
            ((C08I9) aRunnableS103S0100000_3.l0).getClass();
            keva.erase(C08I9.LIZ());
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("FeedDiggCache@6d73.eraseRecords$1");
    }

    public static final void run$123(ARunnableS103S0100000_3 aRunnableS103S0100000_3) {
        boolean zLIZ;
        C1C7U.LIZ("FeedDiggCache@6d73.persistRecords$1");
        try {
            aRunnableS103S0100000_3.LIZ$18();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("FeedDiggCache@6d73.persistRecords$1");
    }

    public static final void run$124(ARunnableS103S0100000_3 aRunnableS103S0100000_3) {
        boolean zLIZ;
        C1C7U.LIZ("SignUpVM@f28a.onCellClicked$1$1");
        try {
            if (!((Activity) aRunnableS103S0100000_3.l0).isFinishing()) {
                ((Activity) aRunnableS103S0100000_3.l0).finish();
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SignUpVM@f28a.onCellClicked$1$1");
    }

    public static final void run$125(ARunnableS103S0100000_3 aRunnableS103S0100000_3) {
        boolean zLIZ;
        C1C7U.LIZ("BackgroundHolderUtilKt@966a.sam$java_lang_Runnable$0");
        try {
            ((Function0) aRunnableS103S0100000_3.l0).invoke();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("BackgroundHolderUtilKt@966a.sam$java_lang_Runnable$0");
    }

    public static final void run$126(ARunnableS103S0100000_3 aRunnableS103S0100000_3) {
        boolean zLIZ;
        Object c098200Yq;
        C1C7U.LIZ("IdleDetectionStrategyExecutor@460a.runOnMain$3");
        try {
            try {
                ((Function0) aRunnableS103S0100000_3.l0).invoke();
                c098200Yq = Unit.LIZ;
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            C189200o6.m5exceptionOrNullimpl(c098200Yq);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("IdleDetectionStrategyExecutor@460a.runOnMain$3");
    }

    public static final void run$127(ARunnableS103S0100000_3 aRunnableS103S0100000_3) {
        boolean zLIZ;
        C1C7U.LIZ("StudioDebugGeckoUpdateManager@57da.update$2$1");
        try {
            C786410Ut5.re(Toast.makeText((Context) aRunnableS103S0100000_3.l0, "Gecko download channel zip file failed", 0));
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("StudioDebugGeckoUpdateManager@57da.update$2$1");
    }

    public static final void run$128(ARunnableS103S0100000_3 aRunnableS103S0100000_3) {
        boolean zLIZ;
        C1C7U.LIZ("RewordInitializer@20ed.initAction$nxRewordConfig$2$report$1");
        try {
            AppLogNewUtils.onEventV3("nx_reword", (JSONObject) aRunnableS103S0100000_3.l0);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("RewordInitializer@20ed.initAction$nxRewordConfig$2$report$1");
    }

    public static final void run$129(ARunnableS103S0100000_3 aRunnableS103S0100000_3) {
        Context context = (Context) aRunnableS103S0100000_3.l0;
        C1C7U.LIZ("InitKevaHookImpl@9b8d.onKevaInitCompleted$1L");
        C810670Vr7.LIZJ(context, 0, FollowFeedViewStubExperiment.REPO_NAME);
        C1C7U.LIZIZ("InitKevaHookImpl@9b8d.onKevaInitCompleted$1L");
    }

    public static final void run$13(ARunnableS103S0100000_3 aRunnableS103S0100000_3) {
        View view = (View) aRunnableS103S0100000_3.l0;
        C1C7U.LIZ("CameraCapture3@552f.initCameraCapture3$1L");
        C786410Ut5.LJLLLLLL(8, view);
        C1C7U.LIZIZ("CameraCapture3@552f.initCameraCapture3$1L");
    }

    public static final void run$130(ARunnableS103S0100000_3 aRunnableS103S0100000_3) {
        boolean zLIZ;
        C1C7U.LIZ("KevaBakSp@7732.store$1");
        try {
            aRunnableS103S0100000_3.LIZ$19();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("KevaBakSp@7732.store$1");
    }

    public static final void run$131(ARunnableS103S0100000_3 aRunnableS103S0100000_3) {
        boolean zLIZ;
        C1C7U.LIZ("ThreadFactory@b699.newThread$1");
        try {
            Process.setThreadPriority(10);
            try {
                ((Runnable) aRunnableS103S0100000_3.l0).run();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ThreadFactory@b699.newThread$1");
    }

    public static final void run$132(ARunnableS103S0100000_3 aRunnableS103S0100000_3) {
        boolean zLIZ;
        C1C7U.LIZ("ECMMKPageDataOperator@9a61.updateData$1");
        try {
            ((Function0) aRunnableS103S0100000_3.l0).invoke();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ECMMKPageDataOperator@9a61.updateData$1");
    }

    public static final void run$133(ARunnableS103S0100000_3 aRunnableS103S0100000_3) {
        boolean zLIZ;
        C1C7U.LIZ("ExploreFirstScreenCoverGate@27b1.flush$2");
        try {
            Iterator it2 = ((ArrayList) aRunnableS103S0100000_3.l0).iterator();
            while (it2.hasNext()) {
                ((Function0) it2.next()).invoke();
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ExploreFirstScreenCoverGate@27b1.flush$2");
    }

    public static final void run$134(ARunnableS103S0100000_3 aRunnableS103S0100000_3) {
        boolean zLIZ;
        C1C7U.LIZ("UserLevelViewModel@cee4.postToBackGroundThread$1");
        try {
            ((Function0) aRunnableS103S0100000_3.l0).invoke();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("UserLevelViewModel@cee4.postToBackGroundThread$1");
    }

    public static final void run$135(ARunnableS103S0100000_3 aRunnableS103S0100000_3) {
        boolean zLIZ;
        C1C7U.LIZ("ExchangeUtilKt@6570.requestExchangeForCampaign$1$onExchangeFail$2");
        try {
            Function1 function1 = (Function1) aRunnableS103S0100000_3.l0;
            if (function1 != null) {
                function1.invoke(Boolean.FALSE);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ExchangeUtilKt@6570.requestExchangeForCampaign$1$onExchangeFail$2");
    }

    public static final void run$136(ARunnableS103S0100000_3 aRunnableS103S0100000_3) {
        boolean zLIZ;
        C1C7U.LIZ("TypingStickerRecommendView@fdf2.show$1");
        try {
            ((Runnable) aRunnableS103S0100000_3.l0).run();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("TypingStickerRecommendView@fdf2.show$1");
    }

    public static final void run$137(ARunnableS103S0100000_3 aRunnableS103S0100000_3) {
        boolean zLIZ;
        C1C7U.LIZ("EditorProPlayer@144f.setDataSourceV1$1");
        try {
            ((Function0) aRunnableS103S0100000_3.l0).invoke();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("EditorProPlayer@144f.setDataSourceV1$1");
    }

    public static final void run$138(ARunnableS103S0100000_3 aRunnableS103S0100000_3) {
        boolean zLIZ;
        C1C7U.LIZ("CommandStrategy@344a.handleLink$3");
        try {
            Function0 function0 = (Function0) ((C259800zU) aRunnableS103S0100000_3.l0).element;
            if (function0 != null) {
                function0.invoke();
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("CommandStrategy@344a.handleLink$3");
    }

    public static final void run$139(ARunnableS103S0100000_3 aRunnableS103S0100000_3) {
        boolean zLIZ;
        C1C7U.LIZ("WidgetThreadExtKt@4825.sam$java_lang_Runnable$0");
        try {
            ((Function0) aRunnableS103S0100000_3.l0).invoke();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("WidgetThreadExtKt@4825.sam$java_lang_Runnable$0");
    }

    public static final void run$14(ARunnableS103S0100000_3 aRunnableS103S0100000_3) {
        boolean zLIZ;
        C1C7U.LIZ("LocationThreadKt@1ecc.sam$java_lang_Runnable$0");
        try {
            ((Function0) aRunnableS103S0100000_3.l0).invoke();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("LocationThreadKt@1ecc.sam$java_lang_Runnable$0");
    }

    public static final void run$140(ARunnableS103S0100000_3 aRunnableS103S0100000_3) {
        C1C7U.LIZ("LiveSchedulers@b96.HIGH_PRIORITY_EXECUTOR$1$1");
        try {
            try {
                Process.setThreadPriority(-4);
            } finally {
            }
            ((Runnable) aRunnableS103S0100000_3.l0).run();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            if (!C2179971ATj.LIZ(th)) {
            }
        }
        C1C7U.LIZIZ("LiveSchedulers@b96.HIGH_PRIORITY_EXECUTOR$1$1");
    }

    public static final void run$141(ARunnableS103S0100000_3 aRunnableS103S0100000_3) {
        CountDownLatch countDownLatch = (CountDownLatch) aRunnableS103S0100000_3.l0;
        C1C7U.LIZ("LiveStream@24e7.confirmAnchorNetProbeEngineReleased$1L");
        countDownLatch.countDown();
        C1C7U.LIZIZ("LiveStream@24e7.confirmAnchorNetProbeEngineReleased$1L");
    }

    public static final void run$142(ARunnableS103S0100000_3 aRunnableS103S0100000_3) {
        C08GI c08gi = (C08GI) aRunnableS103S0100000_3.l0;
        C1C7U.LIZ("VsyncManager@d0ee.install$1L");
        c08gi.LIZ();
        C1C7U.LIZIZ("VsyncManager@d0ee.install$1L");
    }

    public static final void run$143(ARunnableS103S0100000_3 aRunnableS103S0100000_3) {
        boolean zLIZ;
        C1C7U.LIZ("PipoHybridSparkPlugin@9952.handleUrlLoading$1$1");
        try {
            ((Function0) aRunnableS103S0100000_3.l0).invoke();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("PipoHybridSparkPlugin@9952.handleUrlLoading$1$1");
    }

    public static final void run$144(ARunnableS103S0100000_3 aRunnableS103S0100000_3) {
        boolean zLIZ;
        C1C7U.LIZ("ExploreStaggeredGridLayoutManager@7448.notifyDataChangeAsync$1$1");
        try {
            try {
                ((AbstractC21673619ry) aRunnableS103S0100000_3.l0).notifyDataSetChanged();
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C1AF0.LJFF(e, ((AbstractC21673619ry) aRunnableS103S0100000_3.l0).getClass().getName());
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ExploreStaggeredGridLayoutManager@7448.notifyDataChangeAsync$1$1");
    }

    public static final void run$145(ARunnableS103S0100000_3 aRunnableS103S0100000_3) {
        boolean zLIZ;
        C1C7U.LIZ("FeedItemModuleImpl@ed3f.carouselCheckIfNeedCTAShowDelayEvent$1");
        try {
            ((C1009460cNM) aRunnableS103S0100000_3.l0).LJJIIZ = true;
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("FeedItemModuleImpl@ed3f.carouselCheckIfNeedCTAShowDelayEvent$1");
    }

    public static final void run$146(ARunnableS103S0100000_3 aRunnableS103S0100000_3) {
        boolean zLIZ;
        C1C7U.LIZ("KirinHardWare@ff07.<field>$1");
        try {
            aRunnableS103S0100000_3.LIZ$20();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("KirinHardWare@ff07.<field>$1");
    }

    public static final void run$147(ARunnableS103S0100000_3 aRunnableS103S0100000_3) {
        boolean zLIZ;
        C1C7U.LIZ("MTKHardWare@66a1.<field>$1");
        try {
            aRunnableS103S0100000_3.LIZ$21();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("MTKHardWare@66a1.<field>$1");
    }

    public static final void run$148(ARunnableS103S0100000_3 aRunnableS103S0100000_3) {
        boolean zLIZ;
        C1C7U.LIZ("QcomHardWare@701a.<field>$1");
        try {
            aRunnableS103S0100000_3.LIZ$22();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("QcomHardWare@701a.<field>$1");
    }

    public static final void run$149(ARunnableS103S0100000_3 aRunnableS103S0100000_3) {
        boolean zLIZ;
        C1C7U.LIZ("RankUtil@6a86.runOnUIThread$1");
        try {
            ((Function0) aRunnableS103S0100000_3.l0).invoke();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("RankUtil@6a86.runOnUIThread$1");
    }

    public static final void run$15(ARunnableS103S0100000_3 aRunnableS103S0100000_3) {
        boolean zLIZ;
        C1C7U.LIZ("PrefetchServiceManager@3f04.setDSLs$1");
        try {
            aRunnableS103S0100000_3.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("PrefetchServiceManager@3f04.setDSLs$1");
    }

    public static final void run$150(ARunnableS103S0100000_3 aRunnableS103S0100000_3) {
        File[] fileArrListFiles;
        C1468090oJ5 c1468090oJ5 = (C1468090oJ5) aRunnableS103S0100000_3.l0;
        c1468090oJ5.getClass();
        C1C7U.LIZ("ThreadCPU@92cb.refreshStaticThreads$1L");
        try {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("/proc/");
            sbLIZ.append(Process.myPid());
            sbLIZ.append("/task/");
            C0VSJ c0vsj = new C0VSJ(C2188811AlT.LIZIZ(sbLIZ));
            if (c0vsj.isDirectory() && (fileArrListFiles = c0vsj.listFiles()) != null) {
                for (File file : fileArrListFiles) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append(file.getPath());
                    sbLIZ2.append("/stat");
                    String strLIZIZ = C1468090oJ5.LIZIZ(C2188811AlT.LIZIZ(sbLIZ2));
                    if (!strLIZIZ.isEmpty()) {
                        try {
                            String[] strArr = new String[2];
                            char[] charArray = strLIZIZ.toCharArray();
                            String str = null;
                            int i = 0;
                            int i2 = 0;
                            String str2 = null;
                            while (true) {
                                if (i >= charArray.length) {
                                    break;
                                }
                                char c = charArray[i];
                                if (c == ' ') {
                                    if (str2 == null) {
                                        str2 = new String(charArray, 0, i);
                                    }
                                } else if (c == '(') {
                                    i2 = i + 1;
                                } else if (c == ')') {
                                    str = new String(charArray, i2, i - i2);
                                    break;
                                }
                                i++;
                            }
                            strArr[0] = str2;
                            strArr[1] = str;
                            c1468090oJ5.LJ(strArr);
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                        }
                    }
                }
            }
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
        }
        C1C7U.LIZIZ("ThreadCPU@92cb.refreshStaticThreads$1L");
    }

    public static final void run$151(ARunnableS103S0100000_3 aRunnableS103S0100000_3) {
        boolean zLIZ;
        C1C7U.LIZ("FeedFpsMonitor@4e80.onFeedPageSelectedStart$1");
        try {
            C1603930rqB c1603930rqB = (C1603930rqB) aRunnableS103S0100000_3.l0;
            c1603930rqB.getClass();
            if (C20636086o.LIZ()) {
                c1603930rqB.LIZJ(false);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("FeedFpsMonitor@4e80.onFeedPageSelectedStart$1");
    }

    public static final void run$152(ARunnableS103S0100000_3 aRunnableS103S0100000_3) {
        boolean zLIZ;
        C1C7U.LIZ("FeedFpsMonitor@4e80.onFeedPageSelectedEndCall$2$1");
        try {
            C1603930rqB c1603930rqB = (C1603930rqB) ((ARunnableS103S0100000_3) aRunnableS103S0100000_3.l0).l0;
            c1603930rqB.getClass();
            if (C20636086o.LIZ()) {
                c1603930rqB.LIZJ(false);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("FeedFpsMonitor@4e80.onFeedPageSelectedEndCall$2$1");
    }

    public static final void run$153(ARunnableS103S0100000_3 aRunnableS103S0100000_3) {
        boolean zLIZ;
        C1C7U.LIZ("FeedFpsMonitor@4e80.onFeedPageSelectedEndCall$2");
        try {
            C20639086r.LJ(new ARunnableS103S0100000_3((Object) aRunnableS103S0100000_3, 152));
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("FeedFpsMonitor@4e80.onFeedPageSelectedEndCall$2");
    }

    public static final void run$154(ARunnableS103S0100000_3 aRunnableS103S0100000_3) {
        boolean zLIZ;
        C1C7U.LIZ("ParallelChunkGsonResponseBodyConverter@3768.async$1$1$dispatch$1");
        try {
            ((Function0) aRunnableS103S0100000_3.l0).invoke();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ParallelChunkGsonResponseBodyConverter@3768.async$1$1$dispatch$1");
    }

    public static final void run$155(ARunnableS103S0100000_3 aRunnableS103S0100000_3) {
        boolean zLIZ;
        C1C7U.LIZ("ParallelChunkGsonResponseBodyConverter@3768.mapAsync$1$dispatch$1");
        try {
            ((Function0) aRunnableS103S0100000_3.l0).invoke();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ParallelChunkGsonResponseBodyConverter@3768.mapAsync$1$dispatch$1");
    }

    public static final void run$156(ARunnableS103S0100000_3 aRunnableS103S0100000_3) {
        boolean zLIZ;
        C1C7U.LIZ("SparkAppRepositoryImpl@e4de.initialize$2");
        try {
            if (!((C2281508wn) aRunnableS103S0100000_3.l0).LIZ.get()) {
                ((C2281508wn) aRunnableS103S0100000_3.l0).LIZJ();
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SparkAppRepositoryImpl@e4de.initialize$2");
    }

    public static final void run$157(ARunnableS103S0100000_3 aRunnableS103S0100000_3) {
        boolean zLIZ;
        C1C7U.LIZ("Hpas2svDialog$Companion@dce1.onMainActivityCreate$1$1");
        try {
            C0XQ1.LIZ((Activity) aRunnableS103S0100000_3.l0);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("Hpas2svDialog$Companion@dce1.onMainActivityCreate$1$1");
    }

    public static final void run$158(ARunnableS103S0100000_3 aRunnableS103S0100000_3) {
        boolean zLIZ;
        C1C7U.LIZ("CameraVideoCapturer@8f5e.switchCamera$1");
        try {
            ((C1270610jAZ) aRunnableS103S0100000_3.l0).LLJLIL();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("CameraVideoCapturer@8f5e.switchCamera$1");
    }

    public static final void run$159(ARunnableS103S0100000_3 aRunnableS103S0100000_3) {
        C08GI c08gi = (C08GI) aRunnableS103S0100000_3.l0;
        C1C7U.LIZ("AbsPolicy@1dde.blockFromStatus$1L");
        c08gi.LIZ();
        C1C7U.LIZIZ("AbsPolicy@1dde.blockFromStatus$1L");
    }

    public static final void run$16(ARunnableS103S0100000_3 aRunnableS103S0100000_3) {
        Runnable runnable = (Runnable) aRunnableS103S0100000_3.l0;
        C1C7U.LIZ("ChromeThreadPoolExecutor@8441.<field>$1$newThread$1L");
        Process.setThreadPriority(10);
        runnable.run();
        C1C7U.LIZIZ("ChromeThreadPoolExecutor@8441.<field>$1$newThread$1L");
    }

    public static final void run$160(ARunnableS103S0100000_3 aRunnableS103S0100000_3) {
        C08GI c08gi = (C08GI) aRunnableS103S0100000_3.l0;
        C1C7U.LIZ("AbsPolicy@1dde.blockFromStatus$2L");
        c08gi.LIZ();
        C1C7U.LIZIZ("AbsPolicy@1dde.blockFromStatus$2L");
    }

    public static final void run$161(ARunnableS103S0100000_3 aRunnableS103S0100000_3) {
        C08GI c08gi = (C08GI) aRunnableS103S0100000_3.l0;
        C1C7U.LIZ("AbsPolicy@1dde.checkEnv$1L");
        c08gi.LIZ();
        C1C7U.LIZIZ("AbsPolicy@1dde.checkEnv$1L");
    }

    public static final void run$162(ARunnableS103S0100000_3 aRunnableS103S0100000_3) {
        C08GH c08gh = (C08GH) aRunnableS103S0100000_3.l0;
        c08gh.getClass();
        C1C7U.LIZ("AbsPolicy@1dde.notifyInstallResult$1L");
        Iterator<C08GI> it2 = c08gh.LIZJ.iterator();
        while (it2.hasNext()) {
            it2.next().LIZ();
        }
        ((LinkedList) c08gh.LIZJ).clear();
        C1C7U.LIZIZ("AbsPolicy@1dde.notifyInstallResult$1L");
    }

    public static final void run$163(ARunnableS103S0100000_3 aRunnableS103S0100000_3) {
        boolean zLIZ;
        C1C7U.LIZ("EPAICreateSelectMaterialScene@65c4.setupHeaderDragToDismiss$1$1$2$1");
        try {
            MvChoosePhotoScene.onFinish$default((EPAICreateSelectMaterialScene) aRunnableS103S0100000_3.l0, false, null, 2, null);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("EPAICreateSelectMaterialScene@65c4.setupHeaderDragToDismiss$1$1$2$1");
    }

    public static final void run$164(ARunnableS103S0100000_3 aRunnableS103S0100000_3) {
        boolean zLIZ;
        C1C7U.LIZ("ActivityThreadUtils@b3eb.currentActivityThread$1");
        try {
            aRunnableS103S0100000_3.LIZ$23();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ActivityThreadUtils@b3eb.currentActivityThread$1");
    }

    public static final void run$165(ARunnableS103S0100000_3 aRunnableS103S0100000_3) {
        boolean zLIZ;
        C1C7U.LIZ("ChunkComposePJResponseBodyConverter@8ba4.async$1$1$dispatch$1");
        try {
            ((Function0) aRunnableS103S0100000_3.l0).invoke();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ChunkComposePJResponseBodyConverter@8ba4.async$1$1$dispatch$1");
    }

    public static final void run$166(ARunnableS103S0100000_3 aRunnableS103S0100000_3) {
        boolean zLIZ;
        C1C7U.LIZ("ChunkComposePJResponseBodyConverter@8ba4.mapAsync$1$dispatch$1");
        try {
            ((Function0) aRunnableS103S0100000_3.l0).invoke();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ChunkComposePJResponseBodyConverter@8ba4.mapAsync$1$dispatch$1");
    }

    public static final void run$167(ARunnableS103S0100000_3 aRunnableS103S0100000_3) {
        boolean zLIZ;
        C1C7U.LIZ("ToastUtil@9040.runInMainThread$1");
        try {
            ((Function0) aRunnableS103S0100000_3.l0).invoke();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ToastUtil@9040.runInMainThread$1");
    }

    public static final void run$168(ARunnableS103S0100000_3 aRunnableS103S0100000_3) {
        boolean zLIZ;
        C1C7U.LIZ("AnoleVideoPreloader@8185.preloadVideo$downloadListener$1$onSuccessed$2");
        try {
            aRunnableS103S0100000_3.LIZ$24();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("AnoleVideoPreloader@8185.preloadVideo$downloadListener$1$onSuccessed$2");
    }

    public static final void run$169(ARunnableS103S0100000_3 aRunnableS103S0100000_3) {
        boolean zLIZ;
        C1C7U.LIZ("ProfileInfoCollectHelper@dae2.resetInfoForFeature$1");
        try {
            ((Runnable) aRunnableS103S0100000_3.l0).run();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ProfileInfoCollectHelper@dae2.resetInfoForFeature$1");
    }

    public static final void run$17(ARunnableS103S0100000_3 aRunnableS103S0100000_3) {
        boolean zLIZ;
        C1C7U.LIZ("SAAUtilsKt@6611.backToPreviewPageWithSingleActivity$1");
        try {
            ((Function0) aRunnableS103S0100000_3.l0).invoke();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SAAUtilsKt@6611.backToPreviewPageWithSingleActivity$1");
    }

    public static final void run$170(ARunnableS103S0100000_3 aRunnableS103S0100000_3) {
        C2395509a5 c2395509a5 = (C2395509a5) aRunnableS103S0100000_3.l0;
        C1C7U.LIZ("AsyncBodyConverter@2b6b.asyncInit$1L");
        c2395509a5.LIZIZ();
        C1C7U.LIZIZ("AsyncBodyConverter@2b6b.asyncInit$1L");
    }

    public static final void run$171(ARunnableS103S0100000_3 aRunnableS103S0100000_3) {
        boolean zLIZ;
        C1C7U.LIZ("StoreRegionChangedPopTask@ed07.relaunch$1");
        try {
            ComplianceServiceProvider.LJII().LJIILL((Activity) aRunnableS103S0100000_3.l0);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("StoreRegionChangedPopTask@ed07.relaunch$1");
    }

    public static final void run$172(ARunnableS103S0100000_3 aRunnableS103S0100000_3) {
        boolean zLIZ;
        C1C7U.LIZ("ActivityThreadHelper@818a.currentActivityThread$1");
        try {
            aRunnableS103S0100000_3.LIZ$25();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ActivityThreadHelper@818a.currentActivityThread$1");
    }

    public static final void run$173(ARunnableS103S0100000_3 aRunnableS103S0100000_3) {
        C2120008Sg c2120008Sg = (C2120008Sg) aRunnableS103S0100000_3.l0;
        c2120008Sg.getClass();
        C1C7U.LIZ("BootFinishClassPreloader@e3cf.startTrack$1L");
        C2119708Sd c2119708Sd = c2120008Sg.LIZJ;
        if (!c2119708Sd.LIZIZ.getAndSet(true)) {
            c2119708Sd.LJ.clear();
            if (C2119708Sd.LJI.incrementAndGet() == 1) {
                try {
                    ArtLogVerbosity.enableClassLinkerLog();
                    try {
                        try {
                            c2119708Sd.LIZIZ();
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                        }
                        c2119708Sd.LIZ();
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        c2119708Sd.LIZ();
                        throw th;
                    }
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                    ((C2119908Sf) c2119708Sd.LIZ).LIZ(Collections.emptyList(), false);
                }
            } else {
                c2119708Sd.LIZIZ();
                c2119708Sd.LIZ();
            }
        }
        C1C7U.LIZIZ("BootFinishClassPreloader@e3cf.startTrack$1L");
    }

    public static final void run$174(ARunnableS103S0100000_3 aRunnableS103S0100000_3) {
        boolean zLIZ;
        C1C7U.LIZ("ServiceManager@d535.initAutoServices$1");
        try {
            ((InterfaceC2108508Nv) aRunnableS103S0100000_3.l0).onCreate();
        } finally {
            try {
            } finally {
                if (!zLIZ) {
                }
            }
        }
        C1C7U.LIZIZ("ServiceManager@d535.initAutoServices$1");
    }

    public static final void run$175(ARunnableS103S0100000_3 aRunnableS103S0100000_3) {
        boolean zLIZ;
        C1C7U.LIZ("AdAutofillPipoManager@24f6.fetchResolvedPipoPrerequisites$3$5");
        try {
            ((Function1) aRunnableS103S0100000_3.l0).invoke(Boolean.FALSE);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("AdAutofillPipoManager@24f6.fetchResolvedPipoPrerequisites$3$5");
    }

    public static final void run$18(ARunnableS103S0100000_3 aRunnableS103S0100000_3) {
        C1C7U.LIZ("Profiler@a527.benchMark$2");
        while (true) {
            try {
                ((Profiler) aRunnableS103S0100000_3.l0).getStackTrace(Process.myPid());
                try {
                    Thread.sleep(300L);
                } catch (InterruptedException e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                if (C2179971ATj.LIZ(th)) {
                    C1C7U.LIZIZ("Profiler@a527.benchMark$2");
                    return;
                }
                throw th;
            }
        }
    }

    public static final void run$19(ARunnableS103S0100000_3 aRunnableS103S0100000_3) {
        C1C7U.LIZ("Profiler@a527.benchMark$3");
        while (true) {
            try {
                ((Profiler) aRunnableS103S0100000_3.l0).dumpStack(SystemClock.uptimeMillis() - 1000, SystemClock.uptimeMillis());
                try {
                    Thread.sleep(300L);
                } catch (InterruptedException e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                if (C2179971ATj.LIZ(th)) {
                    C1C7U.LIZIZ("Profiler@a527.benchMark$3");
                    return;
                }
                throw th;
            }
        }
    }

    public static final void run$2(ARunnableS103S0100000_3 aRunnableS103S0100000_3) {
        boolean zLIZ;
        C1C7U.LIZ("DeeplinkEventHelper@3d28.reportDeeplinkStart$runnable$1");
        try {
            C20684815ws.LJIJ("deep_link_start", ((C2241008qG) aRunnableS103S0100000_3.l0).LJ());
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("DeeplinkEventHelper@3d28.reportDeeplinkStart$runnable$1");
    }

    public static final void run$20(ARunnableS103S0100000_3 aRunnableS103S0100000_3) {
        boolean zLIZ;
        C1C7U.LIZ("GCMonitor@4ff8.ensureAsyncThreadInited$2");
        try {
            ((GCMonitor) aRunnableS103S0100000_3.l0).initNotificationInWorkingThread();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("GCMonitor@4ff8.ensureAsyncThreadInited$2");
    }

    public static final void run$21(ARunnableS103S0100000_3 aRunnableS103S0100000_3) {
        ((C1018150cbN) aRunnableS103S0100000_3.l0).getClass();
        C1C7U.LIZ("TopViewPreloadManager@b174.getMapInBackground$4L");
        C1018150cbN.LIZJ.LIZLLL(null);
        C1C7U.LIZIZ("TopViewPreloadManager@b174.getMapInBackground$4L");
    }

    public static final void run$23(ARunnableS103S0100000_3 aRunnableS103S0100000_3) {
        boolean zLIZ;
        C1C7U.LIZ("AsyncScheduleCenter@b5e1.handleMessage$1");
        try {
            C786410Ut5.a3((Message) aRunnableS103S0100000_3.l0);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("AsyncScheduleCenter@b5e1.handleMessage$1");
    }

    public static final void run$24(ARunnableS103S0100000_3 aRunnableS103S0100000_3) {
        boolean zLIZ;
        C1C7U.LIZ("SendTokenTask@395f.markTokenSendFail$1");
        boolean zLJI = MethodIDManager.LJI(196641);
        try {
            ((SendTokenTask) aRunnableS103S0100000_3.l0).run();
        } finally {
            if (!zLIZ) {
            }
        }
        if (zLJI) {
            MethodIDManager.LJ();
        }
        C1C7U.LIZIZ("SendTokenTask@395f.markTokenSendFail$1");
    }

    public static final void run$25(ARunnableS103S0100000_3 aRunnableS103S0100000_3) {
        Context context = (Context) aRunnableS103S0100000_3.l0;
        C1C7U.LIZ("NpthCorePreloadSo@b1dd.preloadSo$1L");
        try {
            if (C08Q0.LJ(context, "optimize_preloadnpthso", true)) {
                try {
                    System.loadLibrary("npth");
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    try {
                        Librarian.LJI(C0VX9.LJ(), "npth");
                    } catch (Throwable th2) {
                        TryCatchGuardChecker.doCheck(th2);
                    }
                }
            }
        } catch (Throwable th3) {
            TryCatchGuardChecker.doCheck(th3);
        }
        C1C7U.LIZIZ("NpthCorePreloadSo@b1dd.preloadSo$1L");
    }

    public static final void run$26(ARunnableS103S0100000_3 aRunnableS103S0100000_3) {
        boolean zLIZ;
        C1C7U.LIZ("PostModeLogUtil@6651.logEnterGraphicDetail$7");
        try {
            C20684815ws.LJIILLIIL("enter_graphic_detail", ((C2344009Gk) aRunnableS103S0100000_3.l0).LIZ);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("PostModeLogUtil@6651.logEnterGraphicDetail$7");
    }

    public static final void run$27(ARunnableS103S0100000_3 aRunnableS103S0100000_3) {
        boolean zLIZ;
        C1C7U.LIZ("PostModeLogUtil@6651.logFavorites$2");
        try {
            C20684815ws.LJIILLIIL("favourite_video", ((C2344009Gk) aRunnableS103S0100000_3.l0).LIZ);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("PostModeLogUtil@6651.logFavorites$2");
    }

    public static final void run$28(ARunnableS103S0100000_3 aRunnableS103S0100000_3) {
        boolean zLIZ;
        C1C7U.LIZ("ViewExtsKt@51fb.followedBy$1$1");
        try {
            ((Function0) aRunnableS103S0100000_3.l0).invoke();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ViewExtsKt@51fb.followedBy$1$1");
    }

    public static final void run$29(ARunnableS103S0100000_3 aRunnableS103S0100000_3) {
        boolean zLIZ;
        C1C7U.LIZ("PostModeLogUtil@6651.logGraphicDetailPlaytime$1");
        try {
            C20684815ws.LJIILLIIL("graphic_detail_playtime", ((C2344009Gk) aRunnableS103S0100000_3.l0).LIZ);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("PostModeLogUtil@6651.logGraphicDetailPlaytime$1");
    }

    public static final void run$3(ARunnableS103S0100000_3 aRunnableS103S0100000_3) {
        boolean zLIZ;
        C1C7U.LIZ("OrderCenterEntry@4b85.callbackOnUIThread$1");
        try {
            ((Function0) aRunnableS103S0100000_3.l0).invoke();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("OrderCenterEntry@4b85.callbackOnUIThread$1");
    }

    public static final void run$30(ARunnableS103S0100000_3 aRunnableS103S0100000_3) {
        boolean zLIZ;
        C1C7U.LIZ("FeedHWLayerHelper@5d50.runInMainThread$1");
        try {
            ((Function0) aRunnableS103S0100000_3.l0).invoke();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("FeedHWLayerHelper@5d50.runInMainThread$1");
    }

    public static final void run$31(ARunnableS103S0100000_3 aRunnableS103S0100000_3) {
        boolean zLIZ;
        C1C7U.LIZ("FYPAnimationDelayExperiment@e730.sam$java_lang_Runnable$0");
        try {
            ((Function0) aRunnableS103S0100000_3.l0).invoke();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("FYPAnimationDelayExperiment@e730.sam$java_lang_Runnable$0");
    }

    public static final void run$32(ARunnableS103S0100000_3 aRunnableS103S0100000_3) {
        Runnable runnable = (Runnable) aRunnableS103S0100000_3.l0;
        C1C7U.LIZ("ColdBootStartJankOptimize@acf0.postNotifyFeedTotalState$1L");
        C786410Ut5.LJL(ColdBootStartJankOptimize.LIZIZ, runnable);
        C1C7U.LIZIZ("ColdBootStartJankOptimize@acf0.postNotifyFeedTotalState$1L");
    }

    public static final void run$33(ARunnableS103S0100000_3 aRunnableS103S0100000_3) {
        PlayerController playerController = (PlayerController) aRunnableS103S0100000_3.l0;
        playerController.getClass();
        C1C7U.LIZ("PlayerController@7763.lambda$onRenderFirstFramePost$35$1L");
        if (playerController.activity != null) {
            ((IAppWidgetService) ServiceManager.get().getService(IAppWidgetService.class)).LJIIIIZZ();
        }
        C1C7U.LIZIZ("PlayerController@7763.lambda$onRenderFirstFramePost$35$1L");
    }

    public static final void run$34(ARunnableS103S0100000_3 aRunnableS103S0100000_3) {
        boolean zLIZ;
        C1C7U.LIZ("BDXBridgeInitUtils@be27.postToCoroutines$6");
        try {
            ((Function1) aRunnableS103S0100000_3.l0).invoke(Boolean.TRUE);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("BDXBridgeInitUtils@be27.postToCoroutines$6");
    }

    public static final void run$35(ARunnableS103S0100000_3 aRunnableS103S0100000_3) {
        boolean zLIZ;
        C1C7U.LIZ("BDXBridgeInitUtils@be27.postToMain$1");
        try {
            ((Function1) aRunnableS103S0100000_3.l0).invoke(Boolean.TRUE);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("BDXBridgeInitUtils@be27.postToMain$1");
    }

    public static final void run$36(ARunnableS103S0100000_3 aRunnableS103S0100000_3) {
        boolean zLIZ;
        C1C7U.LIZ("ImageEditThumbnailScene@6a71.checkAiCoverAllFailedToast$2$1");
        try {
            aRunnableS103S0100000_3.LIZ$2();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ImageEditThumbnailScene@6a71.checkAiCoverAllFailedToast$2$1");
    }

    public static final void run$37(ARunnableS103S0100000_3 aRunnableS103S0100000_3) {
        boolean zLIZ;
        C1C7U.LIZ("JatoInitTask@a25e.run$2");
        try {
            C2187451AjH.LJIJJLI();
            ((JatoInitTask) aRunnableS103S0100000_3.l0).getClass();
            JatoInitTask.LIZ();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("JatoInitTask@a25e.run$2");
    }

    public static final void run$38(ARunnableS103S0100000_3 aRunnableS103S0100000_3) {
        boolean zLIZ;
        C1C7U.LIZ("JatoInitTask@a25e.run$3");
        try {
            aRunnableS103S0100000_3.LIZ$3();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("JatoInitTask@a25e.run$3");
    }

    public static final void run$39(ARunnableS103S0100000_3 aRunnableS103S0100000_3) {
        String strLIZ;
        PublicTestSupportTask.GeckoPublishTestData geckoPublishTestData;
        ((PublicTestSupportTask) aRunnableS103S0100000_3.l0).getClass();
        C1C7U.LIZ("PublicTestSupportTask@fca8.run$1L");
        try {
            if (C0C64.LJIILLIIL().LJIIIZ(31744, "public_test_support_ab", true, false)) {
                C805380Via.LJ("LOG_TYPE_PUBLISH_FUSED_TEST", "PUBLISH_FUSED_TEST_EXCEPTION", new RuntimeException("PUBLISH_FUSED_TEST_EXCEPTION"));
                System.err.println("libra");
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        try {
            SettingsManager.LIZLLL().getClass();
            if (SettingsManager.LIZ("public_test_support_settings", false)) {
                C805380Via.LJ("LOG_TYPE_PUBLISH_FUSED_TEST", "PUBLISH_FUSED_TEST_EXCEPTION", new RuntimeException("PUBLISH_FUSED_TEST_EXCEPTION"));
                System.err.println("settings");
            }
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
        }
        try {
            String strLJ = C1552050qUV.LJ(C1553670qX7.LIZ(), "only");
            if (strLJ != null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(strLJ);
                sbLIZ.append("/");
                sbLIZ.append("gecko_publish_test.json");
                try {
                    strLIZ = C2105608Ms.LIZ(new C0VSP(new C0VSJ(C2188811AlT.LIZIZ(sbLIZ))));
                } catch (FileNotFoundException e) {
                    TryCatchGuardChecker.doCheck(e);
                    strLIZ = null;
                }
                if (!TextUtils.isEmpty(strLIZ) && (geckoPublishTestData = (PublicTestSupportTask.GeckoPublishTestData) C08JS.LIZ(strLIZ, PublicTestSupportTask.GeckoPublishTestData.class)) != null && geckoPublishTestData.publishTest) {
                    C805380Via.LJ("LOG_TYPE_PUBLISH_FUSED_TEST", "PUBLISH_FUSED_TEST_EXCEPTION", new RuntimeException("PUBLISH_FUSED_TEST_EXCEPTION"));
                }
            }
        } catch (Throwable th3) {
            TryCatchGuardChecker.doCheck(th3);
        }
        C1C7U.LIZIZ("PublicTestSupportTask@fca8.run$1L");
    }

    public static final void run$4(ARunnableS103S0100000_3 aRunnableS103S0100000_3) {
        boolean zLIZ;
        C1C7U.LIZ("WaveTaskGlobalScheduler$sam$java_lang_Runnable$0@1c2d.run");
        try {
            ((Function0) aRunnableS103S0100000_3.l0).invoke();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("WaveTaskGlobalScheduler$sam$java_lang_Runnable$0@1c2d.run");
    }

    public static final void run$40(ARunnableS103S0100000_3 aRunnableS103S0100000_3) {
        Handler handlerLIZJ;
        Application application = (Application) aRunnableS103S0100000_3.l0;
        C1C7U.LIZ("MessageControllerTask@d094.run$2L");
        C0NET.LIZ.getClass();
        if (C0NET.LJIIZILJ(true)) {
            SpeederService speederService = C20689088p.LIZ;
            if (!speederService.LIZ) {
                speederService.LIZ = true;
                application.registerActivityLifecycleCallbacks(speederService.LIZIZ);
                if ((((Boolean) C0CD2.LIZJ.getValue()).booleanValue() || C0X35.LJIILIIL()) && (handlerLIZJ = AnonymousClass0883.LIZJ()) != null) {
                    SpeederService.DelegateActivityThreadHandler delegateActivityThreadHandler = new SpeederService.DelegateActivityThreadHandler(handlerLIZJ);
                    speederService.LIZJ = delegateActivityThreadHandler;
                    SpeederService.LIZIZ(handlerLIZJ, delegateActivityThreadHandler);
                }
            }
        }
        C1C7U.LIZIZ("MessageControllerTask@d094.run$2L");
    }

    public static final void run$42(ARunnableS103S0100000_3 aRunnableS103S0100000_3) {
        boolean zLIZ;
        C1C7U.LIZ("StorageClearTask@6380.run$1$accept$1");
        try {
            aRunnableS103S0100000_3.LIZIZ$5();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("StorageClearTask@6380.run$1$accept$1");
    }

    public static final void run$43(ARunnableS103S0100000_3 aRunnableS103S0100000_3) {
        boolean zLIZ;
        C1C7U.LIZ("PerformanceOptAssem@fe29.onCreate$1");
        try {
            ((PerformanceOptAssem) aRunnableS103S0100000_3.l0).m255do();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("PerformanceOptAssem@fe29.onCreate$1");
    }

    public static final void run$44(ARunnableS103S0100000_3 aRunnableS103S0100000_3) {
        boolean zLIZ;
        C1C7U.LIZ("CutOptimizedVideoChosenHandler@f6e3.resolveMedia$4$3$1");
        try {
            C0L7R c0l7r = (C0L7R) aRunnableS103S0100000_3.l0;
            c0l7r.LJJJJIZL(c0l7r.LJIIL, false);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("CutOptimizedVideoChosenHandler@f6e3.resolveMedia$4$3$1");
    }

    public static final void run$45(ARunnableS103S0100000_3 aRunnableS103S0100000_3) {
        boolean zLIZ;
        C1C7U.LIZ("CutOptimizedVideoChosenHandler@f6e3.resolveMedia$4$7$1");
        try {
            C0L7R c0l7r = (C0L7R) aRunnableS103S0100000_3.l0;
            c0l7r.LJJJJIZL(c0l7r.LJIIL, false);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("CutOptimizedVideoChosenHandler@f6e3.resolveMedia$4$7$1");
    }

    public static final void run$46(ARunnableS103S0100000_3 aRunnableS103S0100000_3) {
        boolean zLIZ;
        C1C7U.LIZ("MvChoosePhotoScene@c985.sam$java_lang_Runnable$0");
        try {
            ((Function0) aRunnableS103S0100000_3.l0).invoke();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("MvChoosePhotoScene@c985.sam$java_lang_Runnable$0");
    }

    public static final void run$47(ARunnableS103S0100000_3 aRunnableS103S0100000_3) {
        boolean zLIZ;
        C1C7U.LIZ("MvChoosePhotoScene@c985.tryLazilyInitVideoImageMixed$11");
        try {
            Activity activity = ((MvChoosePhotoScene) aRunnableS103S0100000_3.l0).mActivity;
            if (activity != null) {
                CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
                creativeToastBuilder.messageRes(2131833394);
                C1390380mHk.LIZ(activity, 1062, creativeToastBuilder);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("MvChoosePhotoScene@c985.tryLazilyInitVideoImageMixed$11");
    }

    public static final void run$48(ARunnableS103S0100000_3 aRunnableS103S0100000_3) {
        boolean zLIZ;
        C1C7U.LIZ("MvChoosePhotoScene@c985.getProcessStrategy$1$1$1");
        try {
            ((MvChoosePhotoScene) aRunnableS103S0100000_3.l0).finishScene(false);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("MvChoosePhotoScene@c985.getProcessStrategy$1$1$1");
    }

    public static final void run$49(ARunnableS103S0100000_3 aRunnableS103S0100000_3) {
        boolean zLIZ;
        C1C7U.LIZ("InboxGroupChatSocialStatusViewModelImpl@9cd5.scheduleBatchFetchGroupStatus$1");
        try {
            ((InboxGroupChatSocialStatusViewModelImpl) aRunnableS103S0100000_3.l0).yQ2();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("InboxGroupChatSocialStatusViewModelImpl@9cd5.scheduleBatchFetchGroupStatus$1");
    }

    public static final void run$5(ARunnableS103S0100000_3 aRunnableS103S0100000_3) {
        Object obj;
        Activity activity = (Activity) aRunnableS103S0100000_3.l0;
        if (!activity.isFinishing()) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 28) {
                Class<?> cls = C08D3.LIZ;
                activity.recreate();
                return;
            }
            Class<?> cls2 = C08D3.LIZ;
            if (((i != 26 && i != 27) || C08D3.LJFF != null) && (C08D3.LJ != null || C08D3.LIZLLL != null)) {
                try {
                    Object obj2 = C08D3.LIZJ.get(activity);
                    if (obj2 != null && (obj = C08D3.LIZIZ.get(activity)) != null) {
                        Application application = activity.getApplication();
                        C08D4 c08d4 = new C08D4(activity);
                        application.registerActivityLifecycleCallbacks(c08d4);
                        Handler handler = C08D3.LJI;
                        C786410Ut5.LJJZZIII(handler, new ARunnableS72S0200000_3(c08d4, obj2, 1));
                        try {
                            if (i != 26 && i != 27) {
                                activity.recreate();
                            } else {
                                Method method = C08D3.LJFF;
                                Boolean bool = Boolean.FALSE;
                                method.invoke(obj, obj2, null, null, 0, bool, null, null, bool, bool);
                            }
                            C786410Ut5.LJJZZIII(handler, new ARunnableS72S0200000_3(application, c08d4, 2));
                            return;
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            C786410Ut5.LJJZZIII(C08D3.LJI, new ARunnableS72S0200000_3(application, c08d4, 2));
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                }
            }
            activity.recreate();
        }
    }

    public static final void run$50(ARunnableS103S0100000_3 aRunnableS103S0100000_3) {
        boolean zLIZ;
        C1C7U.LIZ("BotShareScreenShowDialogFragment@7b70.onViewCreated$3$1$1");
        try {
            C1857690yRT.LJIILJJIL((SmartImageView) aRunnableS103S0100000_3.l0, Float.valueOf(C418440Gaw.LIZIZ(16)));
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("BotShareScreenShowDialogFragment@7b70.onViewCreated$3$1$1");
    }

    public static final void run$51(ARunnableS103S0100000_3 aRunnableS103S0100000_3) {
        boolean zLIZ;
        C1C7U.LIZ("TemplateSearchResultScene@5b16.createTemplateListView$2$1");
        try {
            C426750GoL.LJIIIZ((C1424850nBL) aRunnableS103S0100000_3.l0, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(7))), null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(7))), null, false, 26);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("TemplateSearchResultScene@5b16.createTemplateListView$2$1");
    }

    public static final void run$52(ARunnableS103S0100000_3 aRunnableS103S0100000_3) {
        boolean zLIZ;
        C1C7U.LIZ("TTEPAbilityServiceImpl@9eb0.downloadEffectAndJumpShootPage$3");
        try {
            ((Function1) aRunnableS103S0100000_3.l0).invoke(Integer.valueOf(DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL));
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("TTEPAbilityServiceImpl@9eb0.downloadEffectAndJumpShootPage$3");
    }

    public static final void run$54(ARunnableS103S0100000_3 aRunnableS103S0100000_3) {
        boolean zLIZ;
        C1C7U.LIZ("OptimizerHelper@3f44.startArtMProtectOpt$1");
        try {
            ArtMProtectOpt.startPharse2((Context) aRunnableS103S0100000_3.l0);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("OptimizerHelper@3f44.startArtMProtectOpt$1");
    }

    public static final void run$55(ARunnableS103S0100000_3 aRunnableS103S0100000_3) {
        boolean zLIZ;
        C1C7U.LIZ("BaseVerifyFragment@4f77.onViewCreated$1");
        try {
            BaseVerifyFragment baseVerifyFragment = (BaseVerifyFragment) aRunnableS103S0100000_3.l0;
            try {
                C189200o6.m2constructorimpl(C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(baseVerifyFragment), C0PEM.LIZJ, null, new C2241608qM(baseVerifyFragment, null), 2));
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("BaseVerifyFragment@4f77.onViewCreated$1");
    }

    public static final void run$56(ARunnableS103S0100000_3 aRunnableS103S0100000_3) {
        boolean zLIZ;
        C1C7U.LIZ("BaseVerifyTuxSheet@5d18.onBackPress$1$2$1");
        try {
            ((BaseVerifyTuxSheet) aRunnableS103S0100000_3.l0).SR();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("BaseVerifyTuxSheet@5d18.onBackPress$1$2$1");
    }

    public static final void run$57(ARunnableS103S0100000_3 aRunnableS103S0100000_3) {
        boolean zLIZ;
        C1C7U.LIZ("PostModeLogUtil@6651.logCancelFavourite$2");
        try {
            C20684815ws.LJIILLIIL("cancel_favourite_video", ((C2344009Gk) aRunnableS103S0100000_3.l0).LIZ);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("PostModeLogUtil@6651.logCancelFavourite$2");
    }

    public static final void run$58(ARunnableS103S0100000_3 aRunnableS103S0100000_3) {
        boolean zLIZ;
        C1C7U.LIZ("RedBadgerHelp@580.asyncRegistAccountListener$1");
        try {
            ((IAccountService) ServiceManager.get().getService(IAccountService.class)).LJIILL(new C2500809r4((Context) aRunnableS103S0100000_3.l0, 1));
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("RedBadgerHelp@580.asyncRegistAccountListener$1");
    }

    public static final void run$59(ARunnableS103S0100000_3 aRunnableS103S0100000_3) {
        boolean zLIZ;
        Context context;
        C1C7U.LIZ("LighteningChooseMusicScene@9a2c.updateTopMargin$5");
        try {
            View view = (View) aRunnableS103S0100000_3.l0;
            if (view != null && (context = view.getContext()) != null) {
                ((View) aRunnableS103S0100000_3.l0).getLocationOnScreen(new int[2]);
                int i = C1913507eX.LIZ;
                C12ES.LJIIJJI(context);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("LighteningChooseMusicScene@9a2c.updateTopMargin$5");
    }

    public static final void run$6(ARunnableS103S0100000_3 aRunnableS103S0100000_3) {
        boolean zLIZ;
        C1C7U.LIZ("EcSearchActivityStack@4117.clearOthersInstanceDelay$1");
        try {
            aRunnableS103S0100000_3.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("EcSearchActivityStack@4117.clearOthersInstanceDelay$1");
    }

    public static final void run$60(ARunnableS103S0100000_3 aRunnableS103S0100000_3) {
        boolean zLIZ;
        C1C7U.LIZ("ProfileHeaderAdvancedFeatureBaseComponent@c75a.updateDataWhenUserUpdate$1");
        try {
            LinearLayout linearLayout = ((ProfileHeaderAdvancedFeatureBaseComponent) aRunnableS103S0100000_3.l0).LLJLIL;
            LinearLayout linearLayout2 = null;
            if (linearLayout == null) {
                linearLayout = null;
            }
            if (linearLayout.getChildCount() > 0) {
                LinearLayout linearLayout3 = ((ProfileHeaderAdvancedFeatureBaseComponent) aRunnableS103S0100000_3.l0).LLJLIL;
                if (linearLayout3 != null) {
                    linearLayout2 = linearLayout3;
                }
                View view = (View) C13LP.LJJLIIIJJIZ(new C2500209qy(linearLayout2, 17));
                if (view != null) {
                    view.getLayoutParams().width = ((ProfileHeaderAdvancedFeatureBaseComponent) aRunnableS103S0100000_3.l0).LLLI;
                    view.requestLayout();
                }
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ProfileHeaderAdvancedFeatureBaseComponent@c75a.updateDataWhenUserUpdate$1");
    }

    public static final void run$61(ARunnableS103S0100000_3 aRunnableS103S0100000_3) {
        boolean zLIZ;
        C1C7U.LIZ("ThreadUtils@eac9.invokeAtFrontUninterruptibly$12");
        try {
            ((CountDownLatch) aRunnableS103S0100000_3.l0).countDown();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ThreadUtils@eac9.invokeAtFrontUninterruptibly$12");
    }

    public static final void run$62(ARunnableS103S0100000_3 aRunnableS103S0100000_3) {
        KeepWarmJobService keepWarmJobService = (KeepWarmJobService) aRunnableS103S0100000_3.l0;
        WeakReference<KeepWarmJobService> weakReference = KeepWarmJobService.LLILZLL;
        C1C7U.LIZ("KeepWarmJobService@fb02.<init>$1L");
        keepWarmJobService.LIZIZ();
        C1C7U.LIZIZ("KeepWarmJobService@fb02.<init>$1L");
    }

    public static final void run$63(ARunnableS103S0100000_3 aRunnableS103S0100000_3) {
        boolean zLIZ;
        C1C7U.LIZ("LynxThreadPool@118e.postUIOperationTask$1");
        try {
            ((FutureTask) aRunnableS103S0100000_3.l0).run();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("LynxThreadPool@118e.postUIOperationTask$1");
    }

    public static final void run$64(ARunnableS103S0100000_3 aRunnableS103S0100000_3) {
        boolean zLIZ;
        C1C7U.LIZ("SparkPreViewOperation@2780.handleBlockingReuse$parked$1");
        try {
            ((CountDownLatch) aRunnableS103S0100000_3.l0).countDown();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SparkPreViewOperation@2780.handleBlockingReuse$parked$1");
    }

    public static final void run$65(ARunnableS103S0100000_3 aRunnableS103S0100000_3) {
        boolean zLIZ;
        C1C7U.LIZ("UsingLock@2e8b.cleanIfNeeded$1");
        try {
            C0X9F.LJ((File) aRunnableS103S0100000_3.l0);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("UsingLock@2e8b.cleanIfNeeded$1");
    }

    public static final void run$66(ARunnableS103S0100000_3 aRunnableS103S0100000_3) {
        boolean zLIZ;
        C1C7U.LIZ("ShopMallMixAssem@a45d.scheduleOnlineRenderedTask$1");
        try {
            ((Function0) aRunnableS103S0100000_3.l0).invoke();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ShopMallMixAssem@a45d.scheduleOnlineRenderedTask$1");
    }

    public static final void run$67(ARunnableS103S0100000_3 aRunnableS103S0100000_3) {
        boolean zLIZ;
        C1C7U.LIZ("FlashFeatureManager@297e.postConfigMontor$1");
        try {
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJ(C15442062u.LJIIIZ((Set) aRunnableS103S0100000_3.l0, C2118008Rm.LIZIZ), "feed_pb_config_list");
            C20684815ws.LJIILLIIL("flash_config", c2344009Gk.LIZ);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("FlashFeatureManager@297e.postConfigMontor$1");
    }

    public static final void run$68(ARunnableS103S0100000_3 aRunnableS103S0100000_3) {
        boolean zLIZ;
        C1C7U.LIZ("ReplayViewTreeCollector@5dc6.collectViewInfo$1");
        try {
            ((Runnable) aRunnableS103S0100000_3.l0).run();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ReplayViewTreeCollector@5dc6.collectViewInfo$1");
    }

    public static final void run$69(ARunnableS103S0100000_3 aRunnableS103S0100000_3) {
        boolean zLIZ;
        C1C7U.LIZ("VideoCatcher$PngShotter@34e4.readPixels$1");
        try {
            aRunnableS103S0100000_3.LIZ$6();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("VideoCatcher$PngShotter@34e4.readPixels$1");
    }

    public static final void run$7(ARunnableS103S0100000_3 aRunnableS103S0100000_3) {
        Function0 function0 = (Function0) aRunnableS103S0100000_3.l0;
        C1C7U.LIZ("PSIKt@5a4f.syncParallelExec$1L");
        function0.invoke();
        C1C7U.LIZIZ("PSIKt@5a4f.syncParallelExec$1L");
    }

    public static final void run$70(ARunnableS103S0100000_3 aRunnableS103S0100000_3) {
        boolean zLIZ;
        C1C7U.LIZ("NetworkBroadcastReceiver@f305.onReceive$1");
        try {
            if (C786970Utz.LIZ((Context) aRunnableS103S0100000_3.l0)) {
                C0VDB.LIZIZ().LIZ();
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("NetworkBroadcastReceiver@f305.onReceive$1");
    }

    public static final void run$71(ARunnableS103S0100000_3 aRunnableS103S0100000_3) {
        boolean zLIZ;
        C1C7U.LIZ("AvatarThreadExtKt@8be9.logicRunOnUiThread$1");
        try {
            ((Function0) aRunnableS103S0100000_3.l0).invoke();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("AvatarThreadExtKt@8be9.logicRunOnUiThread$1");
    }

    public static final void run$72(ARunnableS103S0100000_3 aRunnableS103S0100000_3) {
        boolean zLIZ;
        C1C7U.LIZ("MMKUIUtil@9183.ensureRunOnUIThread$1");
        try {
            ((Function0) aRunnableS103S0100000_3.l0).invoke();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("MMKUIUtil@9183.ensureRunOnUIThread$1");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(19:6|9|(3:58|11|(2:56|13))(2:16|(3:18|(2:19|(2:21|(2:69|67)(3:57|24|63))(2:60|(1:64)(1:61)))|62)(1:59))|27|51|28|31|(1:33)|49|34|(1:36)|37|(1:39)|(1:41)|42|(1:44)|45|65|62) */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x008d, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x008e, code lost:
    
        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void run$73(Y.ARunnableS103S0100000_3 r9) {
        /*
            Method dump skipped, instruction units count: 257
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ARunnableS103S0100000_3.run$73(Y.ARunnableS103S0100000_3):void");
    }

    public static final void run$74(ARunnableS103S0100000_3 aRunnableS103S0100000_3) {
        C20622086a c20622086a = (C20622086a) aRunnableS103S0100000_3.l0;
        c20622086a.getClass();
        C1C7U.LIZ("EndlessLooperService@81c7.quit$1L");
        if (((Boolean) AnonymousClass0716.LJJIL.getValue()).booleanValue()) {
            c20622086a.LJFF.LIZIZ(c20622086a.LIZ);
        }
        if (((Boolean) AnonymousClass0716.LJJIZ.getValue()).booleanValue()) {
            c20622086a.LJFF.LIZIZ(c20622086a.LIZIZ);
        }
        if (((Boolean) AnonymousClass0716.LJJJ.getValue()).booleanValue()) {
            c20622086a.LJFF.LIZIZ(c20622086a.LIZJ);
        }
        if (((Boolean) AnonymousClass0716.LJJJI.getValue()).booleanValue()) {
            c20622086a.LJFF.LIZIZ(c20622086a.LIZLLL);
        }
        if (((Boolean) AnonymousClass0716.LJJJIL.getValue()).booleanValue()) {
            c20622086a.LJFF.LIZIZ(c20622086a.LJ);
        }
        ((IStrategyApi) ServiceManager.get().getService(IStrategyApi.class)).LJIILL();
        C1C7U.LIZIZ("EndlessLooperService@81c7.quit$1L");
    }

    public static final void run$75(ARunnableS103S0100000_3 aRunnableS103S0100000_3) {
        C20622086a c20622086a = (C20622086a) aRunnableS103S0100000_3.l0;
        c20622086a.getClass();
        C1C7U.LIZ("EndlessLooperService@81c7.start$1L");
        c20622086a.LIZIZ();
        C1C7U.LIZIZ("EndlessLooperService@81c7.start$1L");
    }

    public static final void run$76(ARunnableS103S0100000_3 aRunnableS103S0100000_3) {
        boolean zLIZ;
        C1C7U.LIZ("VideoDescVM@4a37.trackDescExpandShow$$inlined$postMobEvent$1");
        try {
            ((Function0) aRunnableS103S0100000_3.l0).invoke();
        } finally {
            try {
            } finally {
                if (!zLIZ) {
                }
            }
        }
        C1C7U.LIZIZ("VideoDescVM@4a37.trackDescExpandShow$$inlined$postMobEvent$1");
    }

    public static final void run$77(ARunnableS103S0100000_3 aRunnableS103S0100000_3) {
        C09Q8 c09q8 = (C09Q8) aRunnableS103S0100000_3.l0;
        C1C7U.LIZ("NativeMemoryInfoMonitor@7a7f.start$1L");
        c09q8.getClass();
        C09Q9 c09q9LIZ = ResourceMetricCollector.LIZ();
        Iterator<C09QB> it2 = c09q8.LIZJ.iterator();
        while (it2.hasNext()) {
            it2.next().LIZ(c09q9LIZ);
        }
        C1C7U.LIZIZ("NativeMemoryInfoMonitor@7a7f.start$1L");
    }

    public static final void run$78(ARunnableS103S0100000_3 aRunnableS103S0100000_3) {
        boolean zLIZ;
        C1C7U.LIZ("DebugToastInterceptor@f948.runOnMainThread$1");
        try {
            ((Runnable) aRunnableS103S0100000_3.l0).run();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("DebugToastInterceptor@f948.runOnMainThread$1");
    }

    public static final void run$79(ARunnableS103S0100000_3 aRunnableS103S0100000_3) {
        boolean zLIZ;
        C1C7U.LIZ("ExtendFunctionsKt@5ab4.sam$java_lang_Runnable$0");
        try {
            ((Function0) aRunnableS103S0100000_3.l0).invoke();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ExtendFunctionsKt@5ab4.sam$java_lang_Runnable$0");
    }

    public static final void run$8(ARunnableS103S0100000_3 aRunnableS103S0100000_3) {
        WebView webView = (WebView) aRunnableS103S0100000_3.l0;
        C1C7U.LIZ("Environment@b952.checkWebView$1L");
        C786410Ut5.re(Toast.makeText(webView.getContext(), "【Security】\nThe current JSB authentication has security risks!\nPlease implement the ISafeWebView interface of JsBridge2\n", 1));
        C1C7U.LIZIZ("Environment@b952.checkWebView$1L");
    }

    public static final void run$80(ARunnableS103S0100000_3 aRunnableS103S0100000_3) {
        boolean zLIZ;
        C1C7U.LIZ("FlowableProcessor@b7d3.clearThumbs$1");
        try {
            aRunnableS103S0100000_3.LIZ$7();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("FlowableProcessor@b7d3.clearThumbs$1");
    }

    public static final void run$81(ARunnableS103S0100000_3 aRunnableS103S0100000_3) {
        boolean zLIZ;
        C1C7U.LIZ("FeedTransactionTooLargeMonitor@c978.toCheck$1");
        try {
            aRunnableS103S0100000_3.LIZ$8();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("FeedTransactionTooLargeMonitor@c978.toCheck$1");
    }

    public static final void run$82(ARunnableS103S0100000_3 aRunnableS103S0100000_3) {
        boolean zLIZ;
        C1C7U.LIZ("SlardarConfigFetcher@1ebb.registerBroadUpdateSetting$1$onReceive$1");
        try {
            ((C0V5Z) ((C2499609qs) aRunnableS103S0100000_3.l0).l0).LJIIJ();
        } finally {
            try {
            } finally {
                if (!zLIZ) {
                }
            }
        }
        C1C7U.LIZIZ("SlardarConfigFetcher@1ebb.registerBroadUpdateSetting$1$onReceive$1");
    }

    public static final void run$83(ARunnableS103S0100000_3 aRunnableS103S0100000_3) {
        ((C08MO) aRunnableS103S0100000_3.l0).getClass();
        C1C7U.LIZ("DnsMonitorThread@cb84.dispatchDnsEvent$1L");
        C1C7U.LIZIZ("DnsMonitorThread@cb84.dispatchDnsEvent$1L");
    }

    public static final void run$84(ARunnableS103S0100000_3 aRunnableS103S0100000_3) {
        C0X9S c0x9s = (C0X9S) aRunnableS103S0100000_3.l0;
        C1C7U.LIZ("SearchSugPresenter$SingleRequestTask@d240.cancelTask$1L");
        try {
            c0x9s.cancel();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        C1C7U.LIZIZ("SearchSugPresenter$SingleRequestTask@d240.cancelTask$1L");
    }

    public static final void run$85(ARunnableS103S0100000_3 aRunnableS103S0100000_3) {
        boolean zLIZ;
        C1C7U.LIZ("CommentAudioRecordAssem@2570.initViews$1");
        try {
            aRunnableS103S0100000_3.LIZ$9();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("CommentAudioRecordAssem@2570.initViews$1");
    }

    public static final void run$86(ARunnableS103S0100000_3 aRunnableS103S0100000_3) {
        boolean zLIZ;
        C1C7U.LIZ("CommentAudioRecordAssem@2570.initViews$2");
        try {
            aRunnableS103S0100000_3.LIZ$10();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("CommentAudioRecordAssem@2570.initViews$2");
    }

    public static final void run$87(ARunnableS103S0100000_3 aRunnableS103S0100000_3) {
        Function0 function0 = (Function0) aRunnableS103S0100000_3.l0;
        C1C7U.LIZ("TemplateService$TemplateSourceBinder@a813.runOnUiThread$1L");
        function0.invoke();
        C1C7U.LIZIZ("TemplateService$TemplateSourceBinder@a813.runOnUiThread$1L");
    }

    public static final void run$88(ARunnableS103S0100000_3 aRunnableS103S0100000_3) {
        boolean zLIZ;
        C1C7U.LIZ("LogicAssemExtKt@27df.bindLifecycle$1");
        try {
            ((Function0) aRunnableS103S0100000_3.l0).invoke();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("LogicAssemExtKt@27df.bindLifecycle$1");
    }

    public static final void run$89(ARunnableS103S0100000_3 aRunnableS103S0100000_3) {
        boolean zLIZ;
        C1C7U.LIZ("AlphaVideoTextureView@9a56.onAttachedToWindow$1");
        try {
            Thread threadU3 = C786410Ut5.u3();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("alpha-play-");
            sbLIZ.append(threadU3.getName());
            ThreadMethodProxy.setName(threadU3, C2188811AlT.LIZIZ(sbLIZ));
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("AlphaVideoTextureView@9a56.onAttachedToWindow$1");
    }

    public static final void run$9(ARunnableS103S0100000_3 aRunnableS103S0100000_3) {
        boolean zLIZ;
        C1C7U.LIZ("CommonUtils@7fb4.runOnMainThread$1");
        try {
            ((Runnable) aRunnableS103S0100000_3.l0).run();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("CommonUtils@7fb4.runOnMainThread$1");
    }

    public static final void run$90(ARunnableS103S0100000_3 aRunnableS103S0100000_3) {
        Looper looper = (Looper) aRunnableS103S0100000_3.l0;
        C1C7U.LIZ("LooperPrintlnOpt@7a06.checkLoggingFieldPeriodically$1L");
        try {
            Field field = C2044207zc.LIZ;
            Object obj = field.get(looper);
            if (obj != null) {
                ArrayList<Printer> arrayList = C082Q.LIZIZ;
                if (!arrayList.contains(obj)) {
                    arrayList.add((Printer) obj);
                }
                field.set(looper, null);
            }
        } catch (IllegalAccessException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        C1C7U.LIZIZ("LooperPrintlnOpt@7a06.checkLoggingFieldPeriodically$1L");
    }

    public static final void run$91(ARunnableS103S0100000_3 aRunnableS103S0100000_3) {
        boolean zLIZ;
        C1C7U.LIZ("MaterialOperationApplyDelegate@690c.addEffectRenderDoneListener$1");
        try {
            ((Function0) aRunnableS103S0100000_3.l0).invoke();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("MaterialOperationApplyDelegate@690c.addEffectRenderDoneListener$1");
    }

    public static final void run$92(ARunnableS103S0100000_3 aRunnableS103S0100000_3) {
        boolean zLIZ;
        C1C7U.LIZ("MainThreadScheduler@3950.run$1");
        try {
            ((Function0) aRunnableS103S0100000_3.l0).invoke();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("MainThreadScheduler@3950.run$1");
    }

    public static final void run$93(ARunnableS103S0100000_3 aRunnableS103S0100000_3) {
        boolean zLIZ;
        C1C7U.LIZ("LiveSurveyWidgetV2@ad00.showLightSurveyQuestion$1");
        try {
            aRunnableS103S0100000_3.LIZ$11();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("LiveSurveyWidgetV2@ad00.showLightSurveyQuestion$1");
    }

    public static final void run$94(ARunnableS103S0100000_3 aRunnableS103S0100000_3) {
        boolean zLIZ;
        C1C7U.LIZ("StackSampler@fda.start$1");
        try {
            if (C08L1.LIZ.get() == null) {
                StackTraceElement[] stackTrace = ThreadMethodProxy.getStackTrace(((C08L0) aRunnableS103S0100000_3.l0).LIZ);
                if (stackTrace.length != 0) {
                    ((C08L0) aRunnableS103S0100000_3.l0).LIZJ = C13LP.LJJLIIIJ(C13LQ.LJJLIIIJJIZ(15, stackTrace), "\n    at ", null, null, 0, null, AFwS231S0000000_3.get$arr$(184), 30);
                }
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("StackSampler@fda.start$1");
    }

    public static final void run$95(ARunnableS103S0100000_3 aRunnableS103S0100000_3) {
        boolean zLIZ;
        C1C7U.LIZ("BaseListFragmentPanel@112.reportSecurityBlock$1");
        try {
            AppLogNewUtils.onEventV3("search_lr_result", (JSONObject) aRunnableS103S0100000_3.l0);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("BaseListFragmentPanel@112.reportSecurityBlock$1");
    }

    public static final void run$96(ARunnableS103S0100000_3 aRunnableS103S0100000_3) {
        boolean zLIZ;
        C1C7U.LIZ("ShareBenefitBubbleHelper@eee3.alphaDisappear$disappearAnim$1");
        try {
            ((Function0) aRunnableS103S0100000_3.l0).invoke();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ShareBenefitBubbleHelper@eee3.alphaDisappear$disappearAnim$1");
    }

    public static final void run$97(ARunnableS103S0100000_3 aRunnableS103S0100000_3) {
        C1C7U.LIZ("MainPreloadExecutorKt@ebb1.mainPreloadExecutor$2$factory$1$1");
        try {
            try {
                C0X35.LJ();
            } finally {
            }
            Runnable runnable = (Runnable) aRunnableS103S0100000_3.l0;
            if (runnable != null) {
                runnable.run();
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            if (!C2179971ATj.LIZ(th)) {
            }
        }
        C1C7U.LIZIZ("MainPreloadExecutorKt@ebb1.mainPreloadExecutor$2$factory$1$1");
    }

    public static final void run$98(ARunnableS103S0100000_3 aRunnableS103S0100000_3) {
        boolean zLIZ;
        C1C7U.LIZ("SchoolPostLayoutManager@72a1.notifyDataChangeAsync$1$1");
        try {
            try {
                ((AbstractC21673619ry) aRunnableS103S0100000_3.l0).notifyDataSetChanged();
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C1AF0.LJFF(e, ((AbstractC21673619ry) aRunnableS103S0100000_3.l0).getClass().getName());
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SchoolPostLayoutManager@72a1.notifyDataChangeAsync$1$1");
    }

    public static final void run$99(ARunnableS103S0100000_3 aRunnableS103S0100000_3) {
        boolean zLIZ;
        C1C7U.LIZ("MemoryPageStayMonitor@5b8a.reportPageMemory$1");
        try {
            aRunnableS103S0100000_3.LIZ$12();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("MemoryPageStayMonitor@5b8a.reportPageMemory$1");
    }

    public ARunnableS103S0100000_3(Function0 function0, int i) {
        this.$t = i;
        switch (i) {
            case 7:
            case 31:
            case 46:
            case 125:
            case 139:
                this.l0 = function0;
                break;
            default:
                this.l0 = function0;
                break;
        }
    }

    public ARunnableS103S0100000_3(Context context, int i) {
        this.$t = i;
        switch (i) {
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
            case 25:
            case 129:
                this.l0 = context;
                break;
            default:
                this.l0 = context;
                break;
        }
    }

    public ARunnableS103S0100000_3(CountDownLatch countDownLatch, int i) {
        this.$t = i;
        switch (i) {
            case BdTuring.TYPE_EMAIL /* 11 */:
            case 61:
            case 64:
                this.l0 = countDownLatch;
                break;
            default:
                this.l0 = countDownLatch;
                break;
        }
    }

    public ARunnableS103S0100000_3(Activity activity, int i) {
        this.$t = i;
        if (5 - i != 0) {
            this.l0 = activity;
        } else {
            this.l0 = activity;
        }
    }

    public ARunnableS103S0100000_3(View view, int i) {
        this.$t = i;
        if (13 - i != 0) {
            this.l0 = view;
        } else {
            this.l0 = view;
        }
    }

    public ARunnableS103S0100000_3(Runnable runnable, int i) {
        this.$t = i;
        if (16 - i != 0) {
            this.l0 = runnable;
        } else {
            this.l0 = runnable;
        }
    }

    public ARunnableS103S0100000_3(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public ARunnableS103S0100000_3(C194442115k c194442115k, PopupWindow popupWindow, int i) {
        this.$t = i;
        this.l0 = popupWindow;
    }

    public ARunnableS103S0100000_3(String str, ArrayList arrayList, int i) {
        this.$t = i;
        this.l0 = arrayList;
    }

    public ARunnableS103S0100000_3(C08MO c08mo, int i, String str, int i2) {
        this.$t = i2;
        this.l0 = c08mo;
    }

    public ARunnableS103S0100000_3(C08GH c08gh, int i, int i2, boolean z, int i3) {
        this.$t = i3;
        this.l0 = c08gh;
    }
}
