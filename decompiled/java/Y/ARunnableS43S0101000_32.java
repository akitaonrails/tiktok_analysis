package Y;

import X.C13BV;
import X.C13LP;
import X.C1638280sja;
import X.C18MZ;
import X.C18ZE;
import X.C19EG;
import X.C1AH6;
import X.C1C7U;
import X.C21285918Rt;
import X.C21359318iN;
import X.C21365418jM;
import X.C21366318jV;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import X.ViewTreeObserverOnPreDrawListenerC337150DJp;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.ecommerce.anchor.adapter.AnchorPanelProductManager;
import com.ss.android.ugc.aweme.ecommerce.model.AnchorProductInfoModel;
import com.ss.android.ugc.aweme.shortvideo.image.ExpandedTitleModule;
import com.tts.oecverify.BdTuring;

/* JADX INFO: loaded from: classes33.dex */
public class ARunnableS43S0101000_32 implements Runnable {
    public final int $t;
    public int i1;
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
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        ((C21285918Rt) this.l0).LLLLZIL(this.i1);
        ((C21285918Rt) this.l0).LLLLZLL(false);
        ((C21285918Rt) this.l0).LLLLIL().LIZIZ.invoke(C13LP.LLIIII(((C21285918Rt) this.l0).LLLLLLLLL().LL.LJFF), Integer.valueOf(this.i1), C13BV.INSTANCE);
    }

    public final void LIZ$1() {
        C21365418jM c21365418jM = (C21365418jM) this.l0;
        c21365418jM.LIZLLL.getClass();
        c21365418jM.LJII = 0;
        C21365418jM c21365418jM2 = (C21365418jM) this.l0;
        int i = c21365418jM2.LJII;
        if (i <= 0 && this.i1 == 1) {
            C1638280sja c1638280sja = C21366318jV.LIZLLL;
            C19EG c19eg = c21365418jM2.LJFF;
            C1638280sja.LIZLLL(c1638280sja, c19eg, c19eg.getResources().getString(2131845840)).LIZ();
        } else {
            C21359318iN c21359318iN = c21365418jM2.LIZ;
            if (c21359318iN != null) {
                c21359318iN.setMaxTextCount(i);
            }
        }
    }

    public static final void run$0(ARunnableS43S0101000_32 aRunnableS43S0101000_32) {
        boolean zLIZ;
        C1C7U.LIZ("LiveCenterMainView@9a36.dispatchUpdatesToMainRecyclerView$3");
        try {
            ((C1AH6) aRunnableS43S0101000_32.l0).getRecyclerViewFromXml().smoothScrollToPosition(aRunnableS43S0101000_32.i1);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("LiveCenterMainView@9a36.dispatchUpdatesToMainRecyclerView$3");
    }

    public static final void run$1(ARunnableS43S0101000_32 aRunnableS43S0101000_32) {
        boolean zLIZ;
        C1C7U.LIZ("ExpandedTitleModule@8152.animChangeSize$animWatcher$1$onUpdate$1");
        try {
            ((ExpandedTitleModule) aRunnableS43S0101000_32.l0).LLJJJJLIIL.LIZ(aRunnableS43S0101000_32.i1);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ExpandedTitleModule@8152.animChangeSize$animWatcher$1$onUpdate$1");
    }

    public static final void run$2(ARunnableS43S0101000_32 aRunnableS43S0101000_32) {
        boolean zLIZ;
        C1C7U.LIZ("ExpandedTitleModule@8152.animChangeSize$animator$1$1$1");
        try {
            ((ExpandedTitleModule) aRunnableS43S0101000_32.l0).LLJJJJLIIL.LIZ(aRunnableS43S0101000_32.i1);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ExpandedTitleModule@8152.animChangeSize$animator$1$1$1");
    }

    public static final void run$3(ARunnableS43S0101000_32 aRunnableS43S0101000_32) {
        boolean zLIZ;
        C1C7U.LIZ("AnchorPanelAdapter@4c56.updateMarketPriceAndPromote$1$1");
        try {
            AnchorPanelProductManager anchorPanelProductManagerLLLIIIIL = ((C18MZ) aRunnableS43S0101000_32.l0).LLLIIIIL();
            int i = aRunnableS43S0101000_32.i1;
            anchorPanelProductManagerLLLIIIIL.LJ(i, ((C18MZ) aRunnableS43S0101000_32.l0).LLLFZ(aRunnableS43S0101000_32.i1), (AnchorProductInfoModel) ListProtector.get(((C18MZ) aRunnableS43S0101000_32.l0).LLJI, i));
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("AnchorPanelAdapter@4c56.updateMarketPriceAndPromote$1$1");
    }

    public static final void run$4(ARunnableS43S0101000_32 aRunnableS43S0101000_32) {
        boolean zLIZ;
        LinearLayoutManager linearLayoutManager;
        View viewFindViewByPosition;
        C1C7U.LIZ("AiChatMessageFeatureScene@61e1.onViewCreated$1$onItemRangeInserted$1");
        try {
            C18ZE c18ze = (C18ZE) aRunnableS43S0101000_32.l0;
            int i = aRunnableS43S0101000_32.i1;
            ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jvLLLLLJIL = c18ze.LLLLLJIL();
            RecyclerView.LayoutManager layoutManager = viewOnAttachStateChangeListenerC20604515jvLLLLLJIL.getLayoutManager();
            if ((layoutManager instanceof LinearLayoutManager) && (linearLayoutManager = (LinearLayoutManager) layoutManager) != null && (viewFindViewByPosition = linearLayoutManager.findViewByPosition(i)) != null) {
                int decoratedBottom = linearLayoutManager.getDecoratedBottom(viewFindViewByPosition);
                int height = viewOnAttachStateChangeListenerC20604515jvLLLLLJIL.getHeight() - viewOnAttachStateChangeListenerC20604515jvLLLLLJIL.getPaddingBottom();
                if (linearLayoutManager.getDecoratedTop(viewFindViewByPosition) < height && decoratedBottom > height) {
                    viewOnAttachStateChangeListenerC20604515jvLLLLLJIL.smoothScrollBy(0, decoratedBottom - height);
                }
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("AiChatMessageFeatureScene@61e1.onViewCreated$1$onItemRangeInserted$1");
    }

    public static final void run$5(ARunnableS43S0101000_32 aRunnableS43S0101000_32) {
        boolean zLIZ;
        C1C7U.LIZ("AIPlaygroundPromptScene@573b.loadAdapterSelection$1");
        try {
            ((C21285918Rt) aRunnableS43S0101000_32.l0).LLLLLLLZIL().smoothScrollToPosition(aRunnableS43S0101000_32.i1);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("AIPlaygroundPromptScene@573b.loadAdapterSelection$1");
    }

    public static final void run$6(ARunnableS43S0101000_32 aRunnableS43S0101000_32) {
        boolean zLIZ;
        C1C7U.LIZ("AIPlaygroundPromptScene@573b.loadInspirationImage$1");
        try {
            aRunnableS43S0101000_32.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("AIPlaygroundPromptScene@573b.loadInspirationImage$1");
    }

    public static final void run$7(ARunnableS43S0101000_32 aRunnableS43S0101000_32) {
        boolean zLIZ;
        C1C7U.LIZ("AIPlaygroundPromptScene@573b.loadInspirationText$1");
        try {
            RecyclerView recyclerViewLLLLLLZ = ((C21285918Rt) aRunnableS43S0101000_32.l0).LLLLLLZ();
            ViewTreeObserverOnPreDrawListenerC337150DJp.LIZ(recyclerViewLLLLLLZ, new ARunnableS36S0201000_32(recyclerViewLLLLLLZ, aRunnableS43S0101000_32.i1, (C21285918Rt) aRunnableS43S0101000_32.l0, 2));
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("AIPlaygroundPromptScene@573b.loadInspirationText$1");
    }

    public static final void run$8(ARunnableS43S0101000_32 aRunnableS43S0101000_32) {
        boolean zLIZ;
        C1C7U.LIZ("AIPlaygroundPromptScene@573b.refreshTextInspiration$1");
        try {
            ((C21285918Rt) aRunnableS43S0101000_32.l0).LLLLZIL(aRunnableS43S0101000_32.i1);
            RecyclerView recyclerViewLLLLLLZ = ((C21285918Rt) aRunnableS43S0101000_32.l0).LLLLLLZ();
            ViewTreeObserverOnPreDrawListenerC337150DJp.LIZ(recyclerViewLLLLLLZ, new ARunnableS36S0201000_32(recyclerViewLLLLLLZ, aRunnableS43S0101000_32.i1, (C21285918Rt) aRunnableS43S0101000_32.l0, 3));
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("AIPlaygroundPromptScene@573b.refreshTextInspiration$1");
    }

    public static final void run$9(ARunnableS43S0101000_32 aRunnableS43S0101000_32) {
        boolean zLIZ;
        C1C7U.LIZ("DiyTextModule@7b9e.showText$1");
        try {
            aRunnableS43S0101000_32.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("DiyTextModule@7b9e.showText$1");
    }

    public ARunnableS43S0101000_32(int i, Object obj, int i2) {
        this.$t = i2;
        this.l0 = obj;
        this.i1 = i;
    }
}
