package Y;

import X.AbstractC791320V2k;
import X.C0V2P;
import X.C0V2S;
import X.C0V2U;
import X.C0WSW;
import X.C0WSX;
import X.C10LZ;
import X.C1369740lkS;
import X.C172300lN;
import X.C1961107mD;
import X.C1C7U;
import X.C20688088o;
import X.C2179971ATj;
import X.C2187451AjH;
import X.C2187701Ajg;
import X.C2188811AlT;
import X.C2214201BlK;
import X.C786410Ut5;
import X.C788300Uw8;
import X.C788320UwA;
import X.C790480Uze;
import X.C791390V2r;
import X.C814730Vxf;
import X.C814850Vxr;
import X.C825690WaF;
import X.C841410Wzb;
import X.ViewOnAttachStateChangeListenerC20631115oD;
import android.app.Activity;
import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.util.Printer;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.RecyclerView;
import androidx.work.impl.foreground.SystemForegroundService;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.common.wschannel.server.WsChannelService;
import com.bytedance.helios.network.api.config.AutoSkipApiConfig;
import com.bytedance.monitor.collector.c;
import com.bytedance.pumbaa.app2app.data.App2AppData;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.favorites.business.FavoritesFragmentV2;
import com.ss.android.ugc.aweme.poi.mapmode.assem.PoiMapModeHorizontalCardAssem;
import com.ss.android.ugc.aweme.poi.quiz.assem.PoiQuizHorizontalCardAssem;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS153S0101000_13;

/* JADX INFO: loaded from: classes14.dex */
public class ARunnableS24S0101000_13 implements Runnable {
    public final int $t;
    public int i1;
    public Object l0;

    public final void LIZ$0() {
        try {
            int i = this.i1;
            C790480Uze c790480Uze = (C790480Uze) this.l0;
            if (i != c790480Uze.LJI) {
                return;
            }
            c790480Uze.LJFF = false;
            Integer num = c790480Uze.LJ;
            c790480Uze.LJ = null;
            if (num != null) {
                Function1<String, Unit> function1 = c790480Uze.LIZJ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("retry latest headerInset=");
                sbLIZ.append(num);
                function1.invoke(C2188811AlT.LIZIZ(sbLIZ));
                ((C790480Uze) this.l0).LIZIZ.invoke(num);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C790480Uze c790480Uze2 = (C790480Uze) this.l0;
            c790480Uze2.LJFF = false;
            Function1<String, Unit> function12 = c790480Uze2.LIZJ;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("retry error=");
            sbLIZ2.append(th.getMessage());
            function12.invoke(C2188811AlT.LIZIZ(sbLIZ2));
        }
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
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$1() {
        Printer printer;
        if ((this.i1 & 8) > 0) {
            final Looper mainLooper = Looper.getMainLooper();
            try {
                printer = (Printer) C1961107mD.LIZJ(mainLooper, "mLogging");
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                printer = null;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("start name:");
            sbLIZ.append("main");
            sbLIZ.append(" origin:");
            sbLIZ.append(printer != null ? printer.getClass().getName() : null);
            C2188811AlT.LIZIZ(sbLIZ);
            final C172300lN c172300lN = new C172300lN(printer);
            C786410Ut5.LJIIZILJ(mainLooper, c172300lN);
            C786410Ut5.LJLIIL(60000L, new BPEAHandler(mainLooper), new Runnable() { // from class: X.00lJ
                public final void LIZ() {
                    C172300lN c172300lN2 = c172300lN;
                    List<Map.Entry> listLJLLLL = C13LP.LJLLLL(new C512401z8(21), ((LinkedHashMap) c172300lN2.LLILLJJLI).entrySet());
                    int iLIZIZ = C2097908Jt.LIZIZ(C15438062q.LJIJJ(listLJLLLL, 10));
                    if (iLIZIZ < 16) {
                        iLIZIZ = 16;
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap(iLIZIZ);
                    for (Map.Entry entry : listLJLLLL) {
                        linkedHashMap.put(entry.getKey(), Integer.valueOf(((Number) entry.getValue()).intValue()));
                    }
                    Iterator it2 = linkedHashMap.entrySet().iterator();
                    while (it2.hasNext()) {
                        ((Number) ((Map.Entry) it2.next()).getValue()).intValue();
                    }
                    ((LinkedHashMap) c172300lN2.LLILLJJLI).clear();
                    C786410Ut5.LJLIIL(60000L, new BPEAHandler(mainLooper), this);
                }

                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("LooperMsgMonitor@2bca.start$task$1");
                    try {
                        LIZ();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("LooperMsgMonitor@2bca.start$task$1");
                }
            });
        }
        if ((this.i1 & 4) > 0) {
            C0V2S c0v2s = new C0V2S(-1);
            c0v2s.LLILLJJLI = true;
            C786410Ut5.v2().postFrameCallback(c0v2s);
        }
        if ((this.i1 & 2) > 0) {
            try {
                C788300Uw8.LIZ = C1961107mD.LIZJ(C786410Ut5.v2(), "mLock");
                Object[] objArr = (Object[]) C1961107mD.LIZJ(C786410Ut5.v2(), "mCallbackQueues");
                C788300Uw8.LIZIZ = objArr;
                Object obj = objArr[0];
                C788300Uw8.LIZJ = obj;
                if (obj != null) {
                    C788300Uw8.LIZLLL = C1961107mD.LIZIZ(obj.getClass(), "addCallbackLocked", Long.TYPE, Object.class, Object.class);
                    C788300Uw8.LJ = C1961107mD.LIZIZ(obj.getClass(), "removeCallbacksLocked", Object.class, Object.class);
                    C788300Uw8.LIZ();
                    C791390V2r.LJJIII.LJ(new AbstractC791320V2k() { // from class: X.0V2H
                        @Override // X.AbstractC791320V2k
                        public final void LJIILL(long j, long j2, long j3, long j4, boolean z) {
                            this.LL = false;
                            C788300Uw8.LIZ();
                        }
                    });
                }
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
        }
        if ((this.i1 & 1) > 0) {
            Activity activityLJFF = C2214201BlK.LJFF();
            if (activityLJFF != null && C0V2U.LIZ.contains(activityLJFF.getClass().getSimpleName())) {
                ViewTreeObserver viewTreeObserver = activityLJFF.getWindow().getDecorView().getViewTreeObserver();
                C786410Ut5.y3(viewTreeObserver, new C0V2P(true));
                C0V2P c0v2p = new C0V2P(false);
                viewTreeObserver.addOnDrawListener(c0v2p);
                C2187701Ajg.LIZ(viewTreeObserver, c0v2p, ViewTreeObserver.OnDrawListener.class);
            }
            ((Application) ((Context) this.l0)).registerActivityLifecycleCallbacks(new C20688088o() { // from class: X.0V2O
                @Override // X.C20688088o, android.app.Application.ActivityLifecycleCallbacks
                public final void onActivityCreated(Activity activity, Bundle bundle) {
                    try {
                        if (C0V2U.LIZ.contains(activity.getClass().getSimpleName())) {
                            ViewTreeObserver viewTreeObserver2 = activity.getWindow().getDecorView().getViewTreeObserver();
                            C786410Ut5.y3(viewTreeObserver2, new C0V2P(true));
                            C0V2P c0v2p2 = new C0V2P(false);
                            viewTreeObserver2.addOnDrawListener(c0v2p2);
                            C2187701Ajg.LIZ(viewTreeObserver2, c0v2p2, ViewTreeObserver.OnDrawListener.class);
                        }
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                    }
                }
            });
        }
    }

    public final void LIZ$2() {
        try {
            ComponentName componentName = new ComponentName((Context) this.l0, (Class<?>) WsChannelService.class);
            Intent intent = new Intent("com.bytedance.article.wschannel.appstate");
            intent.setComponent(componentName);
            intent.putExtra("app_state", this.i1);
            C786410Ut5.s3((Context) this.l0, intent);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public static final void run$0(ARunnableS24S0101000_13 aRunnableS24S0101000_13) {
        boolean zLIZ;
        C1C7U.LIZ("AbsMonitor@3deb.refreshConfig$1");
        try {
            c cVar = (c) aRunnableS24S0101000_13.l0;
            int i = cVar.LIZIZ;
            if (i > -1 && i == 2) {
                int i2 = cVar.LIZJ;
                int i3 = aRunnableS24S0101000_13.i1;
                if (i2 != i3) {
                    cVar.LIZJ = i3;
                    cVar.LJ(i3);
                }
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("AbsMonitor@3deb.refreshConfig$1");
    }

    public static final void run$1(ARunnableS24S0101000_13 aRunnableS24S0101000_13) {
        boolean zLIZ;
        C1C7U.LIZ("MixStickyInsetThrottleHelper@74a4.schedule$1");
        try {
            aRunnableS24S0101000_13.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("MixStickyInsetThrottleHelper@74a4.schedule$1");
    }

    public static final void run$10(ARunnableS24S0101000_13 aRunnableS24S0101000_13) {
        try {
            ((SystemForegroundService) aRunnableS24S0101000_13.l0).LLILZ.cancel(aRunnableS24S0101000_13.i1);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            if (!C2179971ATj.LIZ(th)) {
                throw th;
            }
        }
    }

    public static final void run$11(ARunnableS24S0101000_13 aRunnableS24S0101000_13) {
        boolean zLIZ;
        C1C7U.LIZ("WsChannelMultiProcessImpl@70c0.sendAppState$1");
        try {
            aRunnableS24S0101000_13.LIZ$2();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("WsChannelMultiProcessImpl@70c0.sendAppState$1");
    }

    public static final void run$12(ARunnableS24S0101000_13 aRunnableS24S0101000_13) {
        int i = aRunnableS24S0101000_13.i1;
        App2AppData app2AppData = (App2AppData) aRunnableS24S0101000_13.l0;
        C1C7U.LIZ("FactEventInterceptor@4ecf.intercept$1L");
        C825690WaF c825690WaF = C825690WaF.LIZ;
        C825690WaF.LIZIZ(i, app2AppData);
        C1C7U.LIZIZ("FactEventInterceptor@4ecf.intercept$1L");
    }

    public static final void run$13(ARunnableS24S0101000_13 aRunnableS24S0101000_13) {
        boolean zLIZ;
        C1C7U.LIZ("RecommendSuperUserView@fd7b.onFollowedAdvance$1");
        try {
            ((C10LZ) aRunnableS24S0101000_13.l0).getList().smoothScrollToPosition(aRunnableS24S0101000_13.i1);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("RecommendSuperUserView@fd7b.onFollowedAdvance$1");
    }

    public static final void run$14(ARunnableS24S0101000_13 aRunnableS24S0101000_13) {
        boolean zLIZ;
        C1C7U.LIZ("RecordStickerPanelScene@1c8.changeEffectPanelViewVisibility$1$1$1");
        try {
            C786410Ut5.LJLZ(aRunnableS24S0101000_13.i1, (ViewGroup) aRunnableS24S0101000_13.l0);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("RecordStickerPanelScene@1c8.changeEffectPanelViewVisibility$1$1$1");
    }

    public static final void run$2(ARunnableS24S0101000_13 aRunnableS24S0101000_13) {
        boolean zLIZ;
        C1C7U.LIZ("FpsDebugMonitor@fa24.init$1");
        try {
            aRunnableS24S0101000_13.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("FpsDebugMonitor@fa24.init$1");
    }

    public static final void run$3(ARunnableS24S0101000_13 aRunnableS24S0101000_13) {
        C814730Vxf c814730Vxf = (C814730Vxf) aRunnableS24S0101000_13.l0;
        int i = aRunnableS24S0101000_13.i1;
        C1C7U.LIZ("MessageShowHandler@5daa.tryRequestPushPermissionPopup$2L");
        int i2 = C2187451AjH.LIZ;
        C814850Vxr.LJIIJ(c814730Vxf, i, "no_permission");
        C1C7U.LIZIZ("MessageShowHandler@5daa.tryRequestPushPermissionPopup$2L");
    }

    public static final void run$4(ARunnableS24S0101000_13 aRunnableS24S0101000_13) {
        int i = aRunnableS24S0101000_13.i1;
        AutoSkipApiConfig autoSkipApiConfig = (AutoSkipApiConfig) aRunnableS24S0101000_13.l0;
        C1C7U.LIZ("AutoSkipApiManager@a225.statisticsApiCost$1L");
        C841410Wzb.LIZIZ.put(Integer.valueOf(i), Boolean.FALSE);
        CopyOnWriteArrayList<C0WSX> copyOnWriteArrayList = C0WSW.LIZ;
        C0WSW.LIZ("Helios:Network-Invoke", new AwS153S0101000_13(i, autoSkipApiConfig, 3), 3, null);
        C1C7U.LIZIZ("AutoSkipApiManager@a225.statisticsApiCost$1L");
    }

    public static final void run$5(ARunnableS24S0101000_13 aRunnableS24S0101000_13) {
        boolean zLIZ;
        C1C7U.LIZ("ShareActionBar@7d5f.scrollToAction$1");
        try {
            RecyclerView recyclerView = ((C1369740lkS) aRunnableS24S0101000_13.l0).LLJ;
            if (recyclerView != null) {
                recyclerView.smoothScrollToPosition(aRunnableS24S0101000_13.i1);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ShareActionBar@7d5f.scrollToAction$1");
    }

    public static final void run$6(ARunnableS24S0101000_13 aRunnableS24S0101000_13) {
        boolean zLIZ;
        C1C7U.LIZ("FpsDowngradeHelper@9826.downgradeFps$1");
        try {
            ((C788320UwA) aRunnableS24S0101000_13.l0).LIZ(aRunnableS24S0101000_13.i1);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("FpsDowngradeHelper@9826.downgradeFps$1");
    }

    public static final void run$7(ARunnableS24S0101000_13 aRunnableS24S0101000_13) {
        boolean zLIZ;
        C1C7U.LIZ("PoiQuizHorizontalCardAssem@9ecf.selectTargetPoi$1$1");
        try {
            ViewOnAttachStateChangeListenerC20631115oD viewOnAttachStateChangeListenerC20631115oD = ((PoiQuizHorizontalCardAssem) aRunnableS24S0101000_13.l0).LLJJIII;
            if (viewOnAttachStateChangeListenerC20631115oD != null) {
                viewOnAttachStateChangeListenerC20631115oD.setCurrentItem(aRunnableS24S0101000_13.i1);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("PoiQuizHorizontalCardAssem@9ecf.selectTargetPoi$1$1");
    }

    public static final void run$8(ARunnableS24S0101000_13 aRunnableS24S0101000_13) {
        boolean zLIZ;
        C1C7U.LIZ("FavoritesFragmentV2@3256.initTabLiveData$3$1");
        try {
            FavoritesFragmentV2 favoritesFragmentV2 = (FavoritesFragmentV2) aRunnableS24S0101000_13.l0;
            favoritesFragmentV2.LLJJIJI = false;
            ViewOnAttachStateChangeListenerC20631115oD viewOnAttachStateChangeListenerC20631115oD = favoritesFragmentV2.LLJJJ;
            if (viewOnAttachStateChangeListenerC20631115oD == null) {
                viewOnAttachStateChangeListenerC20631115oD = null;
            }
            viewOnAttachStateChangeListenerC20631115oD.setCurrentItem(aRunnableS24S0101000_13.i1 - 1);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("FavoritesFragmentV2@3256.initTabLiveData$3$1");
    }

    public static final void run$9(ARunnableS24S0101000_13 aRunnableS24S0101000_13) {
        boolean zLIZ;
        C1C7U.LIZ("PoiMapModeHorizontalCardAssem@4d0e.subscribe$4$1$1");
        try {
            ViewOnAttachStateChangeListenerC20631115oD viewOnAttachStateChangeListenerC20631115oD = ((PoiMapModeHorizontalCardAssem) aRunnableS24S0101000_13.l0).LLJJIJI;
            if (viewOnAttachStateChangeListenerC20631115oD != null) {
                viewOnAttachStateChangeListenerC20631115oD.setCurrentItem(aRunnableS24S0101000_13.i1);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("PoiMapModeHorizontalCardAssem@4d0e.subscribe$4$1$1");
    }

    public ARunnableS24S0101000_13(int i, Object obj, int i2) {
        this.$t = i2;
        this.i1 = i;
        this.l0 = obj;
    }
}
