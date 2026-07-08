package Y;

import X.C1389890mGx;
import X.C19EG;
import androidx.lifecycle.Observer;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.feed.ui.FeedRecommendFragment;
import java.util.Map;

/* JADX INFO: loaded from: classes13.dex */
public class AObserverS79S1200000_12 implements Observer {
    public final int $t;
    public Object l1;
    public Object l2;
    public String s0;

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        switch (this.$t) {
            case 0:
                onChanged$0(this, obj);
                break;
            case 1:
                onChanged$1(this, obj);
                break;
        }
    }

    public static final void onChanged$0(AObserverS79S1200000_12 aObserverS79S1200000_12, Object obj) {
        FeedRecommendFragment feedRecommendFragment = (FeedRecommendFragment) aObserverS79S1200000_12.l1;
        C19EG c19eg = (C19EG) aObserverS79S1200000_12.l2;
        String str = aObserverS79S1200000_12.s0;
        feedRecommendFragment.getClass();
        Integer num = (Integer) ((Map) obj).get(0);
        if (num != null && num.intValue() >= 2 && !feedRecommendFragment.LLLFZ.booleanValue()) {
            feedRecommendFragment.LLLFZ = Boolean.TRUE;
            if (feedRecommendFragment.LLLFFI == 2) {
                feedRecommendFragment.LLLFFI = 0;
                SmartRouter.buildRoute(c19eg, FeedRecommendFragment.gS(str)).open();
            }
        }
    }

    public static final void onChanged$1(AObserverS79S1200000_12 aObserverS79S1200000_12, Object obj) {
        FeedRecommendFragment feedRecommendFragment = (FeedRecommendFragment) aObserverS79S1200000_12.l1;
        C19EG c19eg = (C19EG) aObserverS79S1200000_12.l2;
        String str = aObserverS79S1200000_12.s0;
        feedRecommendFragment.getClass();
        int iIntValue = ((Integer) obj).intValue();
        if (iIntValue != 0) {
            if (iIntValue != 1) {
                if (iIntValue != 2) {
                    if (iIntValue != 3) {
                        if (iIntValue != 4 && iIntValue != 5) {
                            return;
                        }
                    }
                }
            }
            C1389890mGx c1389890mGx = new C1389890mGx(c19eg);
            c1389890mGx.LJIIJ(c19eg.getResources().getString(2131836018));
            c1389890mGx.LJIIJJI();
            feedRecommendFragment.LLLFFI = 1;
            return;
        }
        if (feedRecommendFragment.LLLFZ.booleanValue()) {
            SmartRouter.buildRoute(c19eg, FeedRecommendFragment.gS(str)).open();
        } else {
            feedRecommendFragment.LLLFFI = 2;
        }
    }

    public AObserverS79S1200000_12(FeedRecommendFragment feedRecommendFragment, C19EG c19eg, String str, int i) {
        this.$t = i;
        this.l1 = feedRecommendFragment;
        this.l2 = c19eg;
        this.s0 = str;
    }
}
