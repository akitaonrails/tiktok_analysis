package Y;

import X.C1142950fqf;
import X.C1143090fqt;
import X.C1C7U;
import X.C20441214yg;
import X.C2188811AlT;
import X.C500260Jjc;
import X.C915980Zwa;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.Scroller;
import com.bytedance.android.livesdk.chatroom.viewmodule.BroadcastPreviewBannerWidget;
import com.bytedance.android.livesdk.dataChannel.LiveModeChannel;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes18.dex */
public class ARunnableS6S0102000_17 implements Runnable {
    public final int $t;
    public int i1;
    public int i2;
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
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        try {
            ((C1142950fqf) this.l0).LIZJ(this.i1, this.i2);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("calculatePositionInternal: error = ");
            sbLIZ.append(e);
            C20441214yg.LJIIIZ("LiveMatchIndividualProgressBar", C2188811AlT.LIZIZ(sbLIZ));
        }
        ((C1142950fqf) this.l0).LJIIIIZZ(C915980Zwa.LJFF().Nt() ? 200L : 1000L, null);
    }

    public final void LIZ$1() {
        View view;
        View view2 = ((BroadcastPreviewBannerWidget) this.l0).getView();
        Integer numValueOf = view2 != null ? Integer.valueOf(view2.getWidth()) : null;
        View view3 = ((BroadcastPreviewBannerWidget) this.l0).getView();
        Object parent = view3 != null ? view3.getParent() : null;
        int height = (!(parent instanceof ViewGroup) || (view = (View) parent) == null) ? Integer.MAX_VALUE : view.getHeight();
        BroadcastPreviewBannerWidget broadcastPreviewBannerWidget = (BroadcastPreviewBannerWidget) this.l0;
        if (height < broadcastPreviewBannerWidget.LLJJIJIL) {
            broadcastPreviewBannerWidget.LLJJJ = true;
            C500260Jjc.LJIILLIIL(broadcastPreviewBannerWidget.getView());
            return;
        }
        if (numValueOf == null || numValueOf.intValue() <= 0) {
            return;
        }
        float fIntValue = numValueOf.intValue();
        int i = this.i1;
        int i2 = this.i2;
        int i3 = (int) ((fIntValue * i) / i2);
        if (i3 > height) {
            ((BroadcastPreviewBannerWidget) this.l0).O1((int) ((height * i2) / i), height);
        } else {
            ((BroadcastPreviewBannerWidget) this.l0).N1(i3);
        }
    }

    public static final void run$0(ARunnableS6S0102000_17 aRunnableS6S0102000_17) {
        boolean zLIZ;
        C1C7U.LIZ("ScrollTextView@645a.resumeScroll$1");
        try {
            C1143090fqt c1143090fqt = (C1143090fqt) aRunnableS6S0102000_17.l0;
            Scroller scroller = c1143090fqt.LLJJ;
            if (scroller != null) {
                scroller.startScroll(c1143090fqt.LLJJIII, 0, aRunnableS6S0102000_17.i1, 0, aRunnableS6S0102000_17.i2);
            }
            ((C1143090fqt) aRunnableS6S0102000_17.l0).invalidate();
            ((C1143090fqt) aRunnableS6S0102000_17.l0).LLJJIJI = false;
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ScrollTextView@645a.resumeScroll$1");
    }

    public static final void run$1(ARunnableS6S0102000_17 aRunnableS6S0102000_17) {
        boolean zLIZ;
        C1C7U.LIZ("LiveMatchProgressBar@da79.calculatePosition$1");
        try {
            aRunnableS6S0102000_17.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("LiveMatchProgressBar@da79.calculatePosition$1");
    }

    public static final void run$2(ARunnableS6S0102000_17 aRunnableS6S0102000_17) {
        boolean zLIZ;
        C1C7U.LIZ("BroadcastPreviewBannerWidget@2453.adjustSparkViewHeight$1");
        try {
            aRunnableS6S0102000_17.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("BroadcastPreviewBannerWidget@2453.adjustSparkViewHeight$1");
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [X.0eTH] */
    public static final void run$3(ARunnableS6S0102000_17 aRunnableS6S0102000_17) {
        boolean zLIZ;
        C1C7U.LIZ("BroadcastPreviewBannerWidget@2453.monitorViewHeightChange$2");
        try {
            final BroadcastPreviewBannerWidget broadcastPreviewBannerWidget = (BroadcastPreviewBannerWidget) aRunnableS6S0102000_17.l0;
            if (broadcastPreviewBannerWidget.LLJJIJI == null) {
                final int i = aRunnableS6S0102000_17.i1;
                final int i2 = aRunnableS6S0102000_17.i2;
                broadcastPreviewBannerWidget.LLJJIJI = new View.OnLayoutChangeListener() { // from class: X.0eTH
                    @Override // android.view.View.OnLayoutChangeListener
                    public final void onLayoutChange(View view, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
                        Object parent;
                        int height;
                        View view2;
                        if (C500260Jjc.LJJJI(Boolean.valueOf(!broadcastPreviewBannerWidget.LLJJIII.isEmpty())) && C781520UlC.LJIIJJI((LiveMode) broadcastPreviewBannerWidget.dataChannel.gg0(LiveModeChannel.class))) {
                            View view3 = broadcastPreviewBannerWidget.getView();
                            if (view3 != null) {
                                parent = view3.getParent();
                            } else {
                                parent = null;
                            }
                            if ((parent instanceof ViewGroup) && (view2 = (View) parent) != null) {
                                height = view2.getHeight();
                            } else {
                                height = Integer.MAX_VALUE;
                            }
                            BroadcastPreviewBannerWidget broadcastPreviewBannerWidget2 = broadcastPreviewBannerWidget;
                            if (height < broadcastPreviewBannerWidget2.LLJJIJIL) {
                                AnonymousClass0956 anonymousClass0956 = broadcastPreviewBannerWidget2.LLJJIJIIJIL;
                                if (anonymousClass0956 != null) {
                                    anonymousClass0956.LIZIZ(null);
                                }
                                BroadcastPreviewBannerWidget broadcastPreviewBannerWidget3 = broadcastPreviewBannerWidget;
                                broadcastPreviewBannerWidget3.LLJJIJIIJIL = null;
                                C500260Jjc.LJIILLIIL(broadcastPreviewBannerWidget3.getView());
                                return;
                            }
                            int i11 = i6 - i4;
                            float f = i;
                            float f2 = i2;
                            int i12 = (int) (((i5 - i3) * f) / f2);
                            if (i11 < i12) {
                                broadcastPreviewBannerWidget2.O1((int) ((i11 * f2) / f), i11);
                            } else {
                                FrameLayout frameLayout = broadcastPreviewBannerWidget2.LLJIJIL;
                                if (frameLayout == null || i12 != frameLayout.getHeight()) {
                                    broadcastPreviewBannerWidget.N1(i12);
                                }
                            }
                            AnonymousClass0956 anonymousClass09562 = broadcastPreviewBannerWidget.LLJJIJIIJIL;
                            if (anonymousClass09562 != null) {
                                anonymousClass09562.LIZIZ(null);
                            }
                            BroadcastPreviewBannerWidget broadcastPreviewBannerWidget4 = broadcastPreviewBannerWidget;
                            broadcastPreviewBannerWidget4.LLJJIJIIJIL = null;
                            View view4 = broadcastPreviewBannerWidget4.getView();
                            if (view4 == null || view4.getVisibility() != 4) {
                                return;
                            }
                            C500260Jjc.LLFFF(broadcastPreviewBannerWidget.getView());
                        }
                    }
                };
            }
            View view = broadcastPreviewBannerWidget.getView();
            if (view != null) {
                view.addOnLayoutChangeListener(((BroadcastPreviewBannerWidget) aRunnableS6S0102000_17.l0).LLJJIJI);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("BroadcastPreviewBannerWidget@2453.monitorViewHeightChange$2");
    }

    public ARunnableS6S0102000_17(Object obj, int i, int i2, int i3) {
        this.$t = i3;
        this.l0 = obj;
        this.i1 = i;
        this.i2 = i2;
    }
}
