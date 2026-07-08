package Y;

import X.C0SR4;
import X.C0SSG;
import X.C0SZ8;
import X.C16G0;
import X.C16GX;
import X.C1C7U;
import X.C259800zU;
import X.C729510SjV;
import android.view.View;
import android.widget.OverScroller;
import com.ss.android.ugc.aweme.feed.collection.collection.component.BaseFeedCollectionViewPagerComponent;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.ui.view.AdvancedStopAtOffsetAppBarBehavior;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS590S0100000_11;

/* JADX INFO: loaded from: classes12.dex */
public class ARunnableS8S0301000_11 implements Runnable {
    public final int $t;
    public int i3;
    public Object l0;
    public Object l1;
    public Object l2;

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
        AdvancedStopAtOffsetAppBarBehavior advancedStopAtOffsetAppBarBehavior = (AdvancedStopAtOffsetAppBarBehavior) this.l0;
        OverScroller overScroller = advancedStopAtOffsetAppBarBehavior.LJJI;
        if (overScroller != null && advancedStopAtOffsetAppBarBehavior.LJJIFFI == this) {
            if (!overScroller.computeScrollOffset()) {
                AdvancedStopAtOffsetAppBarBehavior advancedStopAtOffsetAppBarBehavior2 = (AdvancedStopAtOffsetAppBarBehavior) this.l0;
                C16G0 c16g0 = (C16G0) this.l1;
                C16GX c16gx = (C16GX) this.l2;
                int i = this.i3;
                advancedStopAtOffsetAppBarBehavior2.LJJI = null;
                advancedStopAtOffsetAppBarBehavior2.LJJIFFI = null;
                advancedStopAtOffsetAppBarBehavior2.LIZ(c16g0, c16gx, i, true);
                advancedStopAtOffsetAppBarBehavior2.LJ(c16gx, i, C0SSG.FLING);
                advancedStopAtOffsetAppBarBehavior2.LJIL = false;
                advancedStopAtOffsetAppBarBehavior2.LJIIZILJ = false;
                advancedStopAtOffsetAppBarBehavior2.LJIJ = true;
                if (advancedStopAtOffsetAppBarBehavior2.LJII) {
                    advancedStopAtOffsetAppBarBehavior2.LJII(i);
                    return;
                }
                return;
            }
            int currY = overScroller.getCurrY();
            ((AdvancedStopAtOffsetAppBarBehavior) this.l0).LIZ((C16G0) this.l1, (C16GX) this.l2, currY, false);
            if (currY != this.i3) {
                ((C16GX) this.l2).postOnAnimation(this);
                return;
            }
            overScroller.abortAnimation();
            AdvancedStopAtOffsetAppBarBehavior advancedStopAtOffsetAppBarBehavior3 = (AdvancedStopAtOffsetAppBarBehavior) this.l0;
            C16G0 c16g02 = (C16G0) this.l1;
            C16GX c16gx2 = (C16GX) this.l2;
            int i2 = this.i3;
            advancedStopAtOffsetAppBarBehavior3.LJJI = null;
            advancedStopAtOffsetAppBarBehavior3.LJJIFFI = null;
            advancedStopAtOffsetAppBarBehavior3.LIZ(c16g02, c16gx2, i2, true);
            advancedStopAtOffsetAppBarBehavior3.LJ(c16gx2, i2, C0SSG.FLING);
            advancedStopAtOffsetAppBarBehavior3.LJIL = false;
            advancedStopAtOffsetAppBarBehavior3.LJIIZILJ = false;
            advancedStopAtOffsetAppBarBehavior3.LJIJ = true;
            if (advancedStopAtOffsetAppBarBehavior3.LJII) {
                advancedStopAtOffsetAppBarBehavior3.LJII(i2);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void run$0(ARunnableS8S0301000_11 aRunnableS8S0301000_11) {
        boolean zLIZ;
        C1C7U.LIZ("AbstractFeedAdapter@eb3.getView$2$1");
        try {
            ((C0SR4) aRunnableS8S0301000_11.l0).LJJJJZI((View) ((C259800zU) aRunnableS8S0301000_11.l1).element, (C0SZ8) aRunnableS8S0301000_11.l2, aRunnableS8S0301000_11.i3);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("AbstractFeedAdapter@eb3.getView$2$1");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void run$1(ARunnableS8S0301000_11 aRunnableS8S0301000_11) {
        boolean zLIZ;
        C1C7U.LIZ("AbstractFeedAdapter@eb3.getView$3");
        try {
            ((C0SR4) aRunnableS8S0301000_11.l0).LJJJJZI((View) ((C259800zU) aRunnableS8S0301000_11.l1).element, (C0SZ8) aRunnableS8S0301000_11.l2, aRunnableS8S0301000_11.i3);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("AbstractFeedAdapter@eb3.getView$3");
    }

    public static final void run$2(ARunnableS8S0301000_11 aRunnableS8S0301000_11) {
        boolean zLIZ;
        C1C7U.LIZ("BaseFeedCollectionViewPagerComponent@d8ea.notifyCurViewHolderSelected$1");
        try {
            if (((BaseFeedCollectionViewPagerComponent) aRunnableS8S0301000_11.l0).mp().getParent() != null) {
                BaseFeedCollectionViewPagerComponent baseFeedCollectionViewPagerComponent = (BaseFeedCollectionViewPagerComponent) aRunnableS8S0301000_11.l0;
                if (baseFeedCollectionViewPagerComponent.LLJLLL) {
                    C0SZ8 c0sz8LJLIL = baseFeedCollectionViewPagerComponent.LJLIL();
                    if (c0sz8LJLIL != null) {
                        Function1 function1 = (Function1) aRunnableS8S0301000_11.l2;
                        int i = aRunnableS8S0301000_11.i3;
                        if (function1 != null) {
                            function1.invoke(c0sz8LJLIL);
                        }
                        c0sz8LJLIL.LJJIJIIJIL(i);
                    }
                    BaseFeedCollectionViewPagerComponent baseFeedCollectionViewPagerComponent2 = (BaseFeedCollectionViewPagerComponent) aRunnableS8S0301000_11.l0;
                    Aweme aweme = (Aweme) aRunnableS8S0301000_11.l1;
                    baseFeedCollectionViewPagerComponent2.getClass();
                    C729510SjV.LIZLLL(aweme, new AwS590S0100000_11(baseFeedCollectionViewPagerComponent2, 365));
                }
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("BaseFeedCollectionViewPagerComponent@d8ea.notifyCurViewHolderSelected$1");
    }

    public static final void run$3(ARunnableS8S0301000_11 aRunnableS8S0301000_11) {
        boolean zLIZ;
        C1C7U.LIZ("AdvancedStopAtOffsetAppBarBehavior@52a2.startAnchorFling$runnable$1");
        try {
            aRunnableS8S0301000_11.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("AdvancedStopAtOffsetAppBarBehavior@52a2.startAnchorFling$runnable$1");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ARunnableS8S0301000_11(Object obj, C0SR4 c0sr4, C259800zU<View> c259800zU, C0SZ8 c0sz8, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = c0sr4;
        this.l2 = c259800zU;
        this.i3 = c0sz8;
    }
}
