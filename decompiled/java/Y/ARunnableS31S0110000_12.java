package Y;

import X.C0TL6;
import X.C14Z7;
import X.C1C7U;
import X.C20286614Zk;
import android.view.View;
import com.bytedance.ies.sdk.widgets.RecyclableWidgetManager;
import com.ss.android.ugc.aweme.avatar.ui.AvatarDelegate;
import com.ss.android.ugc.aweme.comment.detailpage.bottombarv2.ui.BottomBarFragment;
import com.ss.android.ugc.aweme.common.widget.VerticalViewPager;
import com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel;
import com.ss.android.ugc.aweme.feed.adapter.widget.LivePreviewInteractionLayerWidget;
import com.ss.android.ugc.aweme.feed.adapter.widget.aisummary.LiveAiSummaryWidget;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.zhiliaoapp.musically.R;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes13.dex */
public class ARunnableS31S0110000_12 implements Runnable {
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

    public final void LIZ$0() {
        if (C0TL6.LIZ().style == 0) {
            LivePreviewInteractionLayerWidget livePreviewInteractionLayerWidget = (LivePreviewInteractionLayerWidget) this.l0;
            RecyclableWidgetManager recyclableWidgetManager = livePreviewInteractionLayerWidget.subWidgetManager;
            livePreviewInteractionLayerWidget.LLJJIJIIJIL = recyclableWidgetManager != null ? (LiveAiSummaryWidget) recyclableWidgetManager.load(R.id.aru, LiveAiSummaryWidget.class, this.z1) : null;
        } else if (C0TL6.LIZ().style == 1) {
            LivePreviewInteractionLayerWidget livePreviewInteractionLayerWidget2 = (LivePreviewInteractionLayerWidget) this.l0;
            RecyclableWidgetManager recyclableWidgetManager2 = livePreviewInteractionLayerWidget2.subWidgetManager;
            livePreviewInteractionLayerWidget2.LLJJIJIIJIL = recyclableWidgetManager2 != null ? (LiveAiSummaryWidget) recyclableWidgetManager2.load(R.id.arv, LiveAiSummaryWidget.class, this.z1) : null;
        }
    }

    public static final void run$0(ARunnableS31S0110000_12 aRunnableS31S0110000_12) {
        boolean zLIZ;
        C1C7U.LIZ("BottomBarFragment@2179.setVideoCoverMaskMode$1");
        try {
            View view = ((BottomBarFragment) aRunnableS31S0110000_12.l0).LLILLL;
            if (view != null && view.getParent() != null) {
                ((BottomBarFragment) aRunnableS31S0110000_12.l0).p5(!aRunnableS31S0110000_12.z1);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("BottomBarFragment@2179.setVideoCoverMaskMode$1");
    }

    public static final void run$1(ARunnableS31S0110000_12 aRunnableS31S0110000_12) {
        DetailFragmentPanel detailFragmentPanel = (DetailFragmentPanel) aRunnableS31S0110000_12.l0;
        boolean z = aRunnableS31S0110000_12.z1;
        detailFragmentPanel.getClass();
        C1C7U.LIZ("DetailFragmentPanel@5b0b.checkFeedItemLayoutCacheAndLoadFeedAutomaticWithLoadPageOnDemandExperiment$1L");
        VerticalViewPager verticalViewPager = detailFragmentPanel.LLJJIJI;
        if (verticalViewPager == null) {
            C1C7U.LIZIZ("DetailFragmentPanel@5b0b.checkFeedItemLayoutCacheAndLoadFeedAutomaticWithLoadPageOnDemandExperiment$1L");
            return;
        }
        if (verticalViewPager.getScrollState() == 0) {
            if (z) {
                if (verticalViewPager.LJJIIJ()) {
                    detailFragmentPanel.LLZZLLIL(false);
                }
            } else {
                verticalViewPager.LJJIIZI();
            }
        }
        C1C7U.LIZIZ("DetailFragmentPanel@5b0b.checkFeedItemLayoutCacheAndLoadFeedAutomaticWithLoadPageOnDemandExperiment$1L");
    }

    public static final void run$2(ARunnableS31S0110000_12 aRunnableS31S0110000_12) {
        boolean zLIZ;
        C1C7U.LIZ("FeedSurveyHelper@6267.doRetime$1");
        try {
            if (C20286614Zk.LJ && !aRunnableS31S0110000_12.z1) {
                C20286614Zk c20286614Zk = C20286614Zk.LIZ;
                Aweme aweme = (Aweme) aRunnableS31S0110000_12.l0;
                String str = C20286614Zk.LIZJ;
                c20286614Zk.getClass();
                C20286614Zk.LJ(aweme, "background", str);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("FeedSurveyHelper@6267.doRetime$1");
    }

    public static final void run$3(ARunnableS31S0110000_12 aRunnableS31S0110000_12) {
        boolean zLIZ;
        C1C7U.LIZ("LivePreviewInteractionLayerWidget@4dc8.loadAiSummaryWidgetWhenSelect$1");
        try {
            aRunnableS31S0110000_12.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("LivePreviewInteractionLayerWidget@4dc8.loadAiSummaryWidgetWhenSelect$1");
    }

    public static final void run$4(ARunnableS31S0110000_12 aRunnableS31S0110000_12) {
        boolean zLIZ;
        C1C7U.LIZ("MultiSurveyHelper@5b2c.doRetime$1");
        try {
            if (C14Z7.LJFF) {
                if (aRunnableS31S0110000_12.z1) {
                    System.currentTimeMillis();
                } else {
                    C14Z7 c14z7 = C14Z7.LIZ;
                    Aweme aweme = (Aweme) aRunnableS31S0110000_12.l0;
                    String str = C14Z7.LJ;
                    c14z7.getClass();
                    C14Z7.LIZLLL(aweme, "background", str);
                }
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("MultiSurveyHelper@5b2c.doRetime$1");
    }

    public static final void run$5(ARunnableS31S0110000_12 aRunnableS31S0110000_12) {
        boolean zLIZ;
        C1C7U.LIZ("AvatarDelegate@92fb.initDelegate$1$1");
        try {
            ((AvatarDelegate) aRunnableS31S0110000_12.l0).LJJ(new AtomicBoolean(aRunnableS31S0110000_12.z1));
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("AvatarDelegate@92fb.initDelegate$1$1");
    }

    public ARunnableS31S0110000_12(LivePreviewInteractionLayerWidget livePreviewInteractionLayerWidget, int i) {
        this.$t = i;
        this.l0 = livePreviewInteractionLayerWidget;
        this.z1 = true;
    }

    public ARunnableS31S0110000_12(Object obj, boolean z, int i) {
        this.$t = i;
        this.l0 = obj;
        this.z1 = z;
    }
}
