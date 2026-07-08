package Y;

import X.C1C7U;
import X.C21285518Rp;
import X.C21397018oS;
import X.C420330Gdz;
import X.C786410Ut5;
import X.RunnableC21393518nt;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.xelement.input.LynxBaseInputView;
import com.ss.android.ugc.aweme.ecommerce.base.sku.powercells.salepropselection.SkuImageSpecPowerCell;
import com.ss.android.ugc.aweme.ecommerce.base.sku.powercells.salepropselection.SkuImageWithTextCell;
import com.ss.android.ugc.aweme.feed.adapter.widget.LivePreviewInteractionLayerWidget;

/* JADX INFO: loaded from: classes33.dex */
public class ARunnableS50S0110000_32 implements Runnable {
    public final int $t;
    public Object l0;
    public boolean z1;

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
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public static final void run$0(ARunnableS50S0110000_32 aRunnableS50S0110000_32) {
        boolean zLIZ;
        C1C7U.LIZ("LivePreviewInteractionLayerWidget@4dc8.loadWidgetWhenBindWhenPageIdle$1");
        try {
            LivePreviewInteractionLayerWidget livePreviewInteractionLayerWidget = (LivePreviewInteractionLayerWidget) aRunnableS50S0110000_32.l0;
            if (!livePreviewInteractionLayerWidget.isDestroyed && ((!aRunnableS50S0110000_32.z1 || livePreviewInteractionLayerWidget.LL) && livePreviewInteractionLayerWidget.LLLIIII.compareAndSet(false, true))) {
                ((LivePreviewInteractionLayerWidget) aRunnableS50S0110000_32.l0).X1(false);
                ((LivePreviewInteractionLayerWidget) aRunnableS50S0110000_32.l0).Y1(false);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("LivePreviewInteractionLayerWidget@4dc8.loadWidgetWhenBindWhenPageIdle$1");
    }

    public static final void run$1(ARunnableS50S0110000_32 aRunnableS50S0110000_32) {
        boolean z = aRunnableS50S0110000_32.z1;
        LynxBaseInputView lynxBaseInputView = (LynxBaseInputView) aRunnableS50S0110000_32.l0;
        C1C7U.LIZ("LynxBaseInputView@d7df.setFocus$1L");
        C21397018oS c21397018oS = null;
        if (z) {
            lynxBaseInputView.LJJIJL();
            if (lynxBaseInputView.LLJLILLLLZIIL) {
                lynxBaseInputView.LJJJ();
            } else {
                RunnableC21393518nt runnableC21393518nt = new RunnableC21393518nt(lynxBaseInputView.mContext, lynxBaseInputView);
                C21397018oS c21397018oS2 = lynxBaseInputView.LL;
                if (c21397018oS2 != null) {
                    c21397018oS = c21397018oS2;
                }
                HandlerHook.viewPost(c21397018oS, runnableC21393518nt);
            }
        } else {
            C21397018oS c21397018oS3 = lynxBaseInputView.LL;
            if (c21397018oS3 == null) {
                c21397018oS3 = null;
            }
            if (c21397018oS3.isFocused()) {
                C21397018oS c21397018oS4 = lynxBaseInputView.LL;
                if (c21397018oS4 != null) {
                    c21397018oS = c21397018oS4;
                }
                c21397018oS.clearFocus();
                if (!lynxBaseInputView.LLJLILLLLZIIL) {
                    lynxBaseInputView.LJJJ();
                }
            }
        }
        C1C7U.LIZIZ("LynxBaseInputView@d7df.setFocus$1L");
    }

    public static final void run$2(ARunnableS50S0110000_32 aRunnableS50S0110000_32) {
        boolean zLIZ;
        int i;
        C1C7U.LIZ("SkuImageSpecPowerCell@1cd8.onFirstBind$1$1$onProgressBarStateChanges$1");
        try {
            C420330Gdz c420330Gdz = (C420330Gdz) ((SkuImageSpecPowerCell) aRunnableS50S0110000_32.l0).LLJI.getValue();
            if (aRunnableS50S0110000_32.z1) {
                i = 0;
            } else {
                i = 8;
            }
            C786410Ut5.LJLLLLLL(i, c420330Gdz);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SkuImageSpecPowerCell@1cd8.onFirstBind$1$1$onProgressBarStateChanges$1");
    }

    public static final void run$3(ARunnableS50S0110000_32 aRunnableS50S0110000_32) {
        boolean zLIZ;
        int i;
        C1C7U.LIZ("SkuImageWithTextCell@b4ee.onFirstBind$1$1$onProgressBarStateChanges$1");
        try {
            C420330Gdz c420330Gdz = (C420330Gdz) ((SkuImageWithTextCell) aRunnableS50S0110000_32.l0).LLJI.getValue();
            if (aRunnableS50S0110000_32.z1) {
                i = 0;
            } else {
                i = 8;
            }
            C786410Ut5.LJLLLLLL(i, c420330Gdz);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SkuImageWithTextCell@b4ee.onFirstBind$1$1$onProgressBarStateChanges$1");
    }

    public static final void run$4(ARunnableS50S0110000_32 aRunnableS50S0110000_32) {
        boolean zLIZ;
        C1C7U.LIZ("MovieTokAnchorMaker@5959.bindData$2$updateCollectionStatus$1");
        try {
            ((C21285518Rp) aRunnableS50S0110000_32.l0).LJ(aRunnableS50S0110000_32.z1);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("MovieTokAnchorMaker@5959.bindData$2$updateCollectionStatus$1");
    }

    public static final void run$5(ARunnableS50S0110000_32 aRunnableS50S0110000_32) {
        boolean zLIZ;
        C1C7U.LIZ("BookAnchorMaker@51bd.bindData$2$updateCollectionStatus$1");
        try {
            ((C21285518Rp) aRunnableS50S0110000_32.l0).LJ(aRunnableS50S0110000_32.z1);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("BookAnchorMaker@51bd.bindData$2$updateCollectionStatus$1");
    }

    public ARunnableS50S0110000_32(Object obj, boolean z, int i) {
        this.$t = i;
        this.l0 = obj;
        this.z1 = z;
    }
}
