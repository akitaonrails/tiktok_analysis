package Y;

import X.C0HPU;
import X.C1640100smW;
import X.C1640110smX;
import X.C1C7U;
import X.C786410Ut5;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.ugc.aweme.commercialize.splash.topview.mask.TopViewSkipButton;
import kotlin.Pair;

/* JADX INFO: loaded from: classes7.dex */
public class ARunnableS2S0102000_6 implements Runnable {
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
            case 4:
                run$4(this);
                break;
            case 5:
                run$5(this);
                break;
            case 6:
                run$6(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        ((View) this.l0).scrollBy(0, this.i1);
        new Pair("scrollAmount", Integer.valueOf(this.i1));
        new Pair("targetViewTop", Integer.valueOf(this.i2));
    }

    public final void LIZ$1() {
        ViewGroup.LayoutParams layoutParams = ((TopViewSkipButton) this.l0).getButtonHot().getLayoutParams();
        layoutParams.width = ((TopViewSkipButton) this.l0).getButtonHot().getWidth() + (this.i1 * 2);
        layoutParams.height = ((TopViewSkipButton) this.l0).getButtonHot().getHeight() + (this.i2 * 2);
        C786410Ut5.W5(((TopViewSkipButton) this.l0).getButtonHot(), layoutParams);
    }

    public static final void run$0(ARunnableS2S0102000_6 aRunnableS2S0102000_6) {
        boolean zLIZ;
        View view;
        int i;
        int i2;
        ViewGroup.LayoutParams layoutParams;
        C1C7U.LIZ("ExploreTopicGeneralFeedListComponent@bc19.bindBannerData$1$1$onComplete$1");
        try {
            view = (View) aRunnableS2S0102000_6.l0;
            i = aRunnableS2S0102000_6.i1;
            i2 = aRunnableS2S0102000_6.i2;
            layoutParams = view.getLayoutParams();
        } finally {
            if (!zLIZ) {
            }
        }
        if (layoutParams != null) {
            layoutParams.width = i;
            layoutParams.height = i2;
            C786410Ut5.W5(view, layoutParams);
            C1C7U.LIZIZ("ExploreTopicGeneralFeedListComponent@bc19.bindBannerData$1$1$onComplete$1");
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
    }

    public static final void run$1(ARunnableS2S0102000_6 aRunnableS2S0102000_6) {
        boolean zLIZ;
        C1C7U.LIZ("KeyBoardScrollUtilKt@3ba.adjustLynxViewForKeyboard$1");
        try {
            aRunnableS2S0102000_6.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("KeyBoardScrollUtilKt@3ba.adjustLynxViewForKeyboard$1");
    }

    public static final void run$2(ARunnableS2S0102000_6 aRunnableS2S0102000_6) {
        boolean zLIZ;
        C1C7U.LIZ("TopViewSkipButton@ed4c.expandHot$1");
        try {
            aRunnableS2S0102000_6.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("TopViewSkipButton@ed4c.expandHot$1");
    }

    public static final void run$3(ARunnableS2S0102000_6 aRunnableS2S0102000_6) {
        boolean zLIZ;
        C1C7U.LIZ("MixStudioHomeRowsContainer@ed73.onIdChanged$2");
        try {
            if (((C0HPU) aRunnableS2S0102000_6.l0).isAttachedToWindow()) {
                ((C0HPU) aRunnableS2S0102000_6.l0).LLIZ = Integer.valueOf(aRunnableS2S0102000_6.i1);
                ((C0HPU) aRunnableS2S0102000_6.l0).stopScroll();
                ((C0HPU) aRunnableS2S0102000_6.l0).scrollToPosition(aRunnableS2S0102000_6.i2);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("MixStudioHomeRowsContainer@ed73.onIdChanged$2");
    }

    public static final void run$4(ARunnableS2S0102000_6 aRunnableS2S0102000_6) {
        boolean zLIZ;
        C1C7U.LIZ("FilterListView@ad8a.scrollRecyclerViewToPosition$1");
        try {
            C1640100smW c1640100smW = (C1640100smW) aRunnableS2S0102000_6.l0;
            int i = aRunnableS2S0102000_6.i1;
            int i2 = aRunnableS2S0102000_6.i2 + 1;
            if (c1640100smW.LIZ.getWidth() == 0 && i2 < 3) {
                HandlerHook.viewPost(c1640100smW.LIZ, new ARunnableS2S0102000_6(c1640100smW, i, i2, 4));
            } else {
                c1640100smW.LIZ.scrollToPosition(i);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("FilterListView@ad8a.scrollRecyclerViewToPosition$1");
    }

    public static final void run$5(ARunnableS2S0102000_6 aRunnableS2S0102000_6) {
        boolean zLIZ;
        C1C7U.LIZ("StoryFilterListView@8c61.scrollRecyclerViewToPosition$1");
        try {
            C1640110smX c1640110smX = (C1640110smX) aRunnableS2S0102000_6.l0;
            int i = aRunnableS2S0102000_6.i1;
            int i2 = aRunnableS2S0102000_6.i2 + 1;
            if (c1640110smX.LIZ.getWidth() == 0 && i2 < 3) {
                HandlerHook.viewPost(c1640110smX.LIZ, new ARunnableS2S0102000_6(c1640110smX, i, i2, 5));
            } else {
                c1640110smX.LIZ.scrollToPosition(i);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("StoryFilterListView@8c61.scrollRecyclerViewToPosition$1");
    }

    public static final void run$6(ARunnableS2S0102000_6 aRunnableS2S0102000_6) {
        boolean zLIZ;
        C1C7U.LIZ("StoryV2AnimController@1246.animateReaction$1$1");
        try {
            C786410Ut5.T4((View) aRunnableS2S0102000_6.l0, 0.0f);
            C786410Ut5.Ob((View) aRunnableS2S0102000_6.l0, 0.4f);
            C786410Ut5.pc((View) aRunnableS2S0102000_6.l0, 0.4f);
            C786410Ut5.Jc((View) aRunnableS2S0102000_6.l0, aRunnableS2S0102000_6.i1);
            C786410Ut5.ed((View) aRunnableS2S0102000_6.l0, aRunnableS2S0102000_6.i2);
            C786410Ut5.LJLLLLLL(0, (View) aRunnableS2S0102000_6.l0);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("StoryV2AnimController@1246.animateReaction$1$1");
    }

    public ARunnableS2S0102000_6(Object obj, int i, int i2, int i3) {
        this.$t = i3;
        this.l0 = obj;
        this.i1 = i;
        this.i2 = i2;
    }
}
