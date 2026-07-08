package com.bytedance.android.live.liveinteract.linkroom.widget;

import X.C09JN;
import X.C1078480eAg;
import X.C1161920gLG;
import X.C1295960jpS;
import X.C19ME;
import X.C20441214yg;
import X.C2188811AlT;
import X.C497740JfY;
import X.C784440Upu;
import X.C786410Ut5;
import X.C948560an8;
import X.EnumC962960bAM;
import Y.AAListenerS326S0100000_15;
import Y.ARunnableS115S0100000_15;
import Y.ARunnableS84S0200000_15;
import Y.AfS184S0100000_15;
import android.os.Build;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.liveinteract.api.event.MatchCutShortAniEndEvent;
import com.bytedance.android.live.liveinteract.api.event.MatchCutShortEvent;
import com.bytedance.android.live.liveinteract.api.event.TwoMatchCutShortEvent;
import com.bytedance.android.live.liveinteract.linkroom.widget.InteractCutShortWidget;
import com.bytedance.android.livesdk.livesetting.performance.LiveWidgetMinLoadSetting;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS594S0100000_15;

/* JADX INFO: loaded from: classes16.dex */
public final class InteractCutShortWidget extends LiveWidget {
    public C1295960jpS LL;
    public BPEAHandler LLILLJJLI;

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.h2i;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onCreate() {
        Object[] objArr;
        C948560an8 c948560an8;
        super.onCreate();
        View view = getView();
        this.LL = view != null ? (C1295960jpS) view.findViewById(R.id.fed) : null;
        this.LLILLJJLI = new BPEAHandler(Looper.getMainLooper());
        C20441214yg.LIZIZ("InteractCutShortWidget", "onCreate Cutshort");
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.CQ2(MatchCutShortEvent.class, this, new AwS594S0100000_15(this, 124));
        }
        DataChannel dataChannel2 = this.dataChannel;
        if (dataChannel2 != null) {
            dataChannel2.CQ2(TwoMatchCutShortEvent.class, this, new AwS594S0100000_15(this, 125));
        }
        DataChannel dataChannel3 = this.dataChannel;
        if (dataChannel3 != null) {
            dataChannel3.CQ2(MatchCutShortAniEndEvent.class, this, new AwS594S0100000_15(this, 126));
        }
        C784440Upu.LIZ().LIZJ(this, C948560an8.class).LIZ(new AfS184S0100000_15(this, 19), new C09JN() { // from class: X.0Zy3
            @Override // X.C09JN
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
                C1C7U.LIZ("InteractCutShortWidget@d722.onCreate$5");
                C1C7U.LIZIZ("InteractCutShortWidget@d722.onCreate$5");
            }
        });
        if (!LiveWidgetMinLoadSetting.INSTANCE.enableInteractCut() || (objArr = this.args) == null) {
            return;
        }
        for (Object obj : objArr) {
            if (obj instanceof C1078480eAg) {
                Object obj2 = ((C1078480eAg) obj).LIZ;
                if (obj2 instanceof TwoMatchCutShortEvent) {
                    C948560an8 c948560an82 = (C948560an8) ((LiveData) obj2).getValue();
                    if (c948560an82 != null) {
                        y1(c948560an82);
                    }
                } else if ((obj2 instanceof MatchCutShortEvent) && (c948560an8 = (C948560an8) ((LiveData) obj2).getValue()) != null) {
                    x1(c948560an8);
                }
            }
        }
    }

    public final void x1(C948560an8 c948560an8) {
        if (!isShowing()) {
            show();
            if (c948560an8.LIZLLL == EnumC962960bAM.CATCH_BEANS.getType()) {
                A1(c948560an8, false);
                return;
            }
            if (c948560an8.LIZJ < 0) {
                A1(c948560an8, true);
                return;
            }
            BPEAHandler bPEAHandler = null;
            if (c948560an8.LIZIZ) {
                BPEAHandler bPEAHandler2 = this.LLILLJJLI;
                if (bPEAHandler2 != null) {
                    bPEAHandler = bPEAHandler2;
                }
                C786410Ut5.LJLIIL(700L, bPEAHandler, new ARunnableS84S0200000_15(this, c948560an8, 1));
                return;
            }
            BPEAHandler bPEAHandler3 = this.LLILLJJLI;
            if (bPEAHandler3 != null) {
                bPEAHandler = bPEAHandler3;
            }
            C786410Ut5.LJLIIL(700L, bPEAHandler, new ARunnableS115S0100000_15(this, 8));
        }
    }

    public final void y1(C948560an8 c948560an8) {
        C20441214yg.LJ("InteractCutShortWidget", "onReceiveTwoMatchCutShortEvent");
        if (!isShowing()) {
            show();
            A1(c948560an8, false);
        }
    }

    public final void A1(final C948560an8 c948560an8, final boolean z) {
        final boolean z2 = c948560an8.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("showLottie isPositiveLeave = ");
        sbLIZ.append(z2);
        sbLIZ.append(", matchType = ");
        sbLIZ.append(c948560an8.LIZLLL);
        C20441214yg.LIZIZ("InteractCutShortWidget", C2188811AlT.LIZIZ(sbLIZ));
        BPEAHandler bPEAHandler = this.LLILLJJLI;
        if (bPEAHandler == null) {
            bPEAHandler = null;
        }
        C786410Ut5.LJLIIL(700L, bPEAHandler, new Runnable() { // from class: X.0an9
            public final void LIZ() {
                C1295960jpS c1295960jpS = this.LL.LL;
                if (c1295960jpS != null) {
                    C500260Jjc.LJLL(C439101nJ.LIZ(375), C439101nJ.LIZ(200), c1295960jpS);
                }
                InteractCutShortWidget interactCutShortWidget = this.LL;
                interactCutShortWidget.z1(c948560an8.LIZ, interactCutShortWidget.LL, z);
                C1295960jpS c1295960jpS2 = this.LL.LL;
                if (c1295960jpS2 != null) {
                    C786410Ut5.LLD(0, c1295960jpS2);
                }
                C1143680frq.LJIILL(this.LL.LL, "tiktok_live_match_redesign_resource_2", z2 ? "ttlive_match_result_ani_lose_without_bg_opt.zip" : "ttlive_match_result_ani_win_without_bg_opt.zip", true, new InterfaceC1143790fs1() { // from class: X.0anA
                    @Override // X.InterfaceC1143790fs1
                    public final void onFinish(boolean z3) {
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("showLottie load success:");
                        sbLIZ2.append(z3);
                        C20441214yg.LIZIZ("InteractCutShortWidget", C2188811AlT.LIZIZ(sbLIZ2));
                    }
                });
                C1295960jpS c1295960jpS3 = this.LL.LL;
                if (Build.VERSION.SDK_INT > 26 && c1295960jpS3 != null) {
                    c1295960jpS3.setRenderMode(EnumC1295970jpT.HARDWARE);
                }
                InteractCutShortWidget interactCutShortWidget2 = this.LL;
                C1295960jpS c1295960jpS4 = interactCutShortWidget2.LL;
                if (c1295960jpS4 != null) {
                    c1295960jpS4.addAnimatorListener(new AAListenerS326S0100000_15(interactCutShortWidget2, 5));
                }
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("InteractCutShortWidget@d722.showLottie$1");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("InteractCutShortWidget@d722.showLottie$1");
            }
        });
    }

    public final void z1(int i, View view, boolean z) {
        Object parent;
        View view2;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        float fLIZIZ;
        View view3 = getView();
        ViewGroup.LayoutParams layoutParams = null;
        if (view3 != null) {
            parent = view3.getParent();
        } else {
            parent = null;
        }
        if ((parent instanceof ViewGroup) && (view2 = (View) parent) != null) {
            int height = view2.getHeight();
            if (view != null) {
                layoutParams = view.getLayoutParams();
            }
            if ((layoutParams instanceof C19ME) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                boolean zW9 = ((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).w9();
                if (zW9 && i != -1) {
                    if (z) {
                        fLIZIZ = C497740JfY.LIZIZ(95.0f);
                    } else {
                        fLIZIZ = C497740JfY.LIZIZ(200.0f);
                    }
                    marginLayoutParams.topMargin = i - ((int) fLIZIZ);
                } else {
                    marginLayoutParams.topMargin = (height / 3) - ((int) C497740JfY.LIZIZ(100.0f));
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(" params.topMargin =  ");
                sbLIZ.append(marginLayoutParams.topMargin);
                sbLIZ.append(", isInCoHost() = ");
                sbLIZ.append(zW9);
                sbLIZ.append(" dis = ");
                sbLIZ.append(i);
                sbLIZ.append(", isMulti = ");
                sbLIZ.append(z);
                C20441214yg.LIZIZ("InteractCutShortWidget", C2188811AlT.LIZIZ(sbLIZ));
                C786410Ut5.W5(view, marginLayoutParams);
            }
        }
    }
}
