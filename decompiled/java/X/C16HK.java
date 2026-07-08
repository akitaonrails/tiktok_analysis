package X;

import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import com.bytedance.android.livesdk.broadcast.end.EndIncentiveSettlementFragment;
import com.bytedance.android.livesdk.broadcast.end.EndIncentiveSettlementFragmentV2;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.explore.monitor.lcp.ExploreLCPTracker;
import com.ss.android.ugc.aweme.explore.topic.ExploreTopicGeneralFeedFragment;

/* JADX INFO: renamed from: X.16HK, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public class C16HK implements ViewTreeObserver.OnPreDrawListener {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        switch (this.$t) {
            case 0:
                return onPreDraw$0(this);
            case 1:
                return onPreDraw$1(this);
            case 2:
                return onPreDraw$2(this);
            case 3:
                return onPreDraw$3(this);
            default:
                return false;
        }
    }

    public static final boolean onPreDraw$0(C16HK c16hk) {
        if (((C16F5) c16hk.l0).getLineCount() > 2) {
            EndIncentiveSettlementFragment endIncentiveSettlementFragment = (EndIncentiveSettlementFragment) c16hk.l1;
            C16F5 c16f5 = (C16F5) c16hk.l0;
            float f = endIncentiveSettlementFragment.LLJZIJLIL - 1.0f;
            endIncentiveSettlementFragment.LLJZIJLIL = f;
            if (c16f5 != null) {
                c16f5.setTextSize(1, f);
                return false;
            }
            return false;
        }
        C786410Ut5.D3(((C16F5) c16hk.l0).getViewTreeObserver(), c16hk);
        return true;
    }

    public static final boolean onPreDraw$1(C16HK c16hk) {
        if (((C16F5) c16hk.l0).getLineCount() > 2) {
            EndIncentiveSettlementFragmentV2 endIncentiveSettlementFragmentV2 = (EndIncentiveSettlementFragmentV2) c16hk.l1;
            C16F5 c16f5 = (C16F5) c16hk.l0;
            float f = endIncentiveSettlementFragmentV2.LLJJL - 1.0f;
            endIncentiveSettlementFragmentV2.LLJJL = f;
            if (c16f5 != null) {
                c16f5.setTextSize(1, f);
                return false;
            }
            return false;
        }
        C786410Ut5.D3(((C16F5) c16hk.l0).getViewTreeObserver(), c16hk);
        return true;
    }

    public static final boolean onPreDraw$2(C16HK c16hk) {
        ExploreLCPTracker.INSTANCE.recordStage$explore_release(((ExploreTopicGeneralFeedFragment) c16hk.l0).LLIZLLLIL, C15V4.PAGE_APPEAR);
        ViewTreeObserver viewTreeObserver = ((View) c16hk.l1).getViewTreeObserver();
        if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener(c16hk);
            C2187701Ajg.LIZIZ(viewTreeObserver, c16hk, ViewTreeObserver.OnPreDrawListener.class);
            return true;
        }
        return true;
    }

    public static final boolean onPreDraw$3(C16HK c16hk) {
        C786410Ut5.D3(((FrameLayout) c16hk.l0).getViewTreeObserver(), c16hk);
        C786410Ut5.LLFF(8, (SmartImageView) c16hk.l1);
        return true;
    }

    public C16HK(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
