package X;

import Y.ARunnableS117S0100000_17;
import Y.ARunnableS50S0300000_17;
import android.os.Handler;
import com.bytedance.android.livesdk.chatroom.ui.widgetload.setting.WidgetLoadEnableSetting;
import com.bytedance.android.livesdk.chatroom.ui.widgetload.setting.WidgetPhaseInfo;
import com.bytedance.android.livesdk.livesetting.performance.WidgetCustomLoadOptSetting;
import com.bytedance.android.widget.WidgetManager;
import com.bytedance.ies.sdk.widgets.LayeredElementManager;
import com.bytedance.ies.sdk.widgets.RecyclableWidgetManager;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.AFwS195S0000000_9;
import kotlin.jvm.internal.AwS261S0300000_17;

/* JADX INFO: renamed from: X.0e9G, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1077600e9G {
    public static InterfaceC1078810eBD LJIIL;
    public final InterfaceC1077690e9P LIZ;
    public final C1078060eA0 LIZIZ;
    public final WidgetManager LIZJ;
    public final LayeredElementManager<?> LIZLLL;
    public final InterfaceC1077810e9b LJ;
    public final InterfaceC1077860e9g LJFF;
    public C1077660e9M LJII;
    public C1077660e9M LJIIIIZZ;
    public final Map<String, C1077660e9M> LJI = new HashMap();
    public final C01GW LJIIIZ = C452501pT.LIZIZ(AFwS195S0000000_9.get$arr$(589));
    public final Object LJIIJ = new Object();
    public final C1077590e9F LJIIJJI = new InterfaceC1078780eBA() { // from class: X.0e9F
        @Override // X.InterfaceC1078780eBA
        public final void LIZ(WidgetPhaseInfo widgetPhaseInfo) {
            C1077760e9W c1077760e9W = (C1077760e9W) this.LIZ.LJ;
            c1077760e9W.getClass();
            int i = widgetPhaseInfo.index;
            WidgetLoadEnableSetting widgetLoadEnableSetting = WidgetLoadEnableSetting.INSTANCE;
            if (i == widgetLoadEnableSetting.preCreatePlayerExecutePhaseIndex()) {
                c1077760e9W.LIZ.jU();
            }
            if (widgetLoadEnableSetting.showSlideGuideExecutePhaseIndex() >= 0 && widgetPhaseInfo.index == widgetLoadEnableSetting.showSlideGuideExecutePhaseIndex()) {
                c1077760e9W.LIZ.DU();
            }
            if (widgetLoadEnableSetting.p2EndExecutePhaseIndex() == widgetPhaseInfo.index) {
                c1077760e9W.LIZ.qS();
            }
            if (widgetLoadEnableSetting.starCommentLogicExecutePhaseIndex() == widgetPhaseInfo.index) {
                c1077760e9W.LIZ.AU();
            }
            RecyclableWidgetManager recyclableWidgetManager = c1077760e9W.LIZ.LLJJI;
            if (recyclableWidgetManager != null) {
                recyclableWidgetManager.resetScatterTime();
            }
        }

        @Override // X.InterfaceC1078780eBA
        public final void LIZIZ(WidgetPhaseInfo widgetPhaseInfo) {
            C1077660e9M c1077660e9M;
            InterfaceC1077630e9J interfaceC1077630e9J;
            C1077660e9M c1077660e9M2;
            InterfaceC1077630e9J interfaceC1077630e9J2;
            C1077660e9M c1077660e9M3 = (C1077660e9M) ((HashMap) this.LIZ.LJI).get(widgetPhaseInfo.name);
            if (c1077660e9M3 != null && (c1077660e9M = c1077660e9M3.LIZIZ) != null && (interfaceC1077630e9J = c1077660e9M.LIZ) != null && interfaceC1077630e9J.LJ() && (c1077660e9M2 = c1077660e9M3.LIZIZ) != null && (interfaceC1077630e9J2 = c1077660e9M2.LIZ) != null) {
                interfaceC1077630e9J2.LIZ();
            }
        }

        @Override // X.InterfaceC1078780eBA
        public final void LIZJ(WidgetPhaseInfo widgetPhaseInfo) {
            C1077760e9W c1077760e9W = (C1077760e9W) this.LIZ.LJ;
            if (widgetPhaseInfo == null) {
                c1077760e9W.getClass();
            } else {
                c1077760e9W.LIZ.ZT(widgetPhaseInfo.index);
            }
            C1077600e9G c1077600e9G = this.LIZ;
            ((HashMap) c1077600e9G.LJI).get(widgetPhaseInfo.name);
            c1077600e9G.getClass();
        }

        @Override // X.InterfaceC1078780eBA
        public final void LIZLLL(WidgetPhaseInfo widgetPhaseInfo) {
            InterfaceC1077630e9J interfaceC1077630e9J;
            C1077660e9M c1077660e9M;
            InterfaceC1077630e9J interfaceC1077630e9J2;
            InterfaceC1077630e9J interfaceC1077630e9J3;
            C1077660e9M c1077660e9M2 = (C1077660e9M) ((HashMap) this.LIZ.LJI).get(widgetPhaseInfo.name);
            if (c1077660e9M2 != null) {
                C1077600e9G c1077600e9G = this.LIZ;
                C1077660e9M c1077660e9M3 = c1077660e9M2.LIZIZ;
                if (c1077660e9M3 != null && (interfaceC1077630e9J = c1077660e9M3.LIZ) != null && interfaceC1077630e9J.LJI() && (c1077660e9M = c1077660e9M2.LIZIZ) != null && (interfaceC1077630e9J2 = c1077660e9M.LIZ) != null && !interfaceC1077630e9J2.LIZLLL()) {
                    Handler handlerLIZ = c1077600e9G.LIZ();
                    C1077660e9M c1077660e9M4 = c1077660e9M2.LIZIZ;
                    if (c1077660e9M4 != null) {
                        interfaceC1077630e9J3 = c1077660e9M4.LIZ;
                    } else {
                        interfaceC1077630e9J3 = null;
                    }
                    handlerLIZ.removeCallbacksAndMessages(interfaceC1077630e9J3);
                    c1077600e9G.LJ(c1077660e9M2.LIZIZ);
                }
            }
        }
    };

    public final Handler LIZ() {
        return (Handler) this.LJIIIZ.getValue();
    }

    public final void LIZIZ() {
        Iterator it2 = ((HashMap) this.LJI).entrySet().iterator();
        while (it2.hasNext()) {
            InterfaceC1077630e9J interfaceC1077630e9J = ((C1077660e9M) ((Map.Entry) it2.next()).getValue()).LIZ;
            if (interfaceC1077630e9J != null) {
                interfaceC1077630e9J.release();
            }
        }
        LIZ().removeCallbacksAndMessages(this.LJIIJ);
        LIZ().removeCallbacksAndMessages(null);
        C0IK5.LIZLLL(this.LJIIJ);
        ((HashMap) this.LJI).clear();
        this.LJII = null;
        this.LJIIIIZZ = null;
    }

    public final void LIZJ(C1077660e9M c1077660e9M) {
        InterfaceC1077630e9J interfaceC1077630e9J;
        if (c1077660e9M != null && (interfaceC1077630e9J = c1077660e9M.LIZ) != null && interfaceC1077630e9J.LIZIZ()) {
            C0IK5.LIZIZ(this.LJIIJ, new ARunnableS117S0100000_17(c1077660e9M, 254));
            LIZJ(c1077660e9M.LIZIZ);
        }
    }

    public final void LIZLLL(C1077660e9M c1077660e9M) {
        InterfaceC1077630e9J interfaceC1077630e9J = c1077660e9M.LIZ;
        if (interfaceC1077630e9J != null && !interfaceC1077630e9J.LIZIZ()) {
            C786410Ut5.LJJZZIII(LIZ(), new ARunnableS50S0300000_17(interfaceC1077630e9J, c1077660e9M, this, 22));
        }
        LJ(c1077660e9M.LIZIZ);
        if (c1077660e9M.LIZIZ == null) {
            C08D5.LIZIZ(LIZ(), new ARunnableS117S0100000_17(this, 257), this.LJIIJ, 0L);
        }
    }

    public final void LJ(C1077660e9M c1077660e9M) {
        InterfaceC1077630e9J interfaceC1077630e9J;
        C1077660e9M c1077660e9M2;
        InterfaceC1077630e9J interfaceC1077630e9J2;
        if (c1077660e9M == null || (interfaceC1077630e9J = c1077660e9M.LIZ) == null) {
            return;
        }
        AwS261S0300000_17 awS261S0300000_17 = new AwS261S0300000_17(c1077660e9M, this, interfaceC1077630e9J, 20);
        if (interfaceC1077630e9J.LJI() && (c1077660e9M2 = c1077660e9M.LIZJ) != null && (interfaceC1077630e9J2 = c1077660e9M2.LIZ) != null && !interfaceC1077630e9J2.LIZJ()) {
            if (!WidgetCustomLoadOptSetting.INSTANCE.enableLoadBackup()) {
                C08D5.LIZIZ(LIZ(), new ARunnableS117S0100000_17(awS261S0300000_17, 255), interfaceC1077630e9J, WidgetLoadEnableSetting.INSTANCE.phaseLoadDelay());
                return;
            }
            return;
        }
        awS261S0300000_17.invoke();
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [X.0e9F] */
    public C1077600e9G(C1077640e9K c1077640e9K, C1078060eA0 c1078060eA0, RecyclableWidgetManager recyclableWidgetManager, LayeredElementManager layeredElementManager, C1077760e9W c1077760e9W, InterfaceC1077860e9g interfaceC1077860e9g) {
        this.LIZ = c1077640e9K;
        this.LIZIZ = c1078060eA0;
        this.LIZJ = recyclableWidgetManager;
        this.LIZLLL = layeredElementManager;
        this.LJ = c1077760e9W;
        this.LJFF = interfaceC1077860e9g;
    }
}
