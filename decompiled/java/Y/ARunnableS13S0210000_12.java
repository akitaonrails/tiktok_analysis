package Y;

import X.C1484690ojr;
import X.C1616650sAh;
import X.C1C7U;
import X.C786410Ut5;
import android.view.View;
import com.ss.android.ugc.aweme.explore.assem.ExploreFeedCell;
import com.ss.android.ugc.aweme.feed.panel.FullFeedFragmentPanel;
import com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes13.dex */
public class ARunnableS13S0210000_12 implements Runnable {
    public final int $t;
    public Object l0;
    public Object l1;
    public boolean z2;

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
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public static final void run$0(ARunnableS13S0210000_12 aRunnableS13S0210000_12) {
        boolean zLIZ;
        C1C7U.LIZ("ExploreFeedCell@544c.onImpressionReport$1$1");
        try {
            ExploreFeedCell exploreFeedCell = (ExploreFeedCell) aRunnableS13S0210000_12.l0;
            exploreFeedCell.l7(exploreFeedCell.T6().getLayout(), (Map) aRunnableS13S0210000_12.l1, aRunnableS13S0210000_12.z2);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ExploreFeedCell@544c.onImpressionReport$1$1");
    }

    public static final void run$1(ARunnableS13S0210000_12 aRunnableS13S0210000_12) {
        FullFeedFragmentPanel fullFeedFragmentPanel = (FullFeedFragmentPanel) aRunnableS13S0210000_12.l0;
        List list = (List) aRunnableS13S0210000_12.l1;
        boolean z = aRunnableS13S0210000_12.z2;
        fullFeedFragmentPanel.getClass();
        C1C7U.LIZ("FullFeedFragmentPanel@9b2e.resetPreloadMedia$1L");
        C1484690ojr c1484690ojr = C1484690ojr.LIZ;
        boolean z2 = !z;
        String strZc = fullFeedFragmentPanel.Zc();
        String eventType = fullFeedFragmentPanel.getEventType();
        c1484690ojr.getClass();
        C1484690ojr.LIZIZ(list, z2, z2, strZc, eventType, true);
        C1C7U.LIZIZ("FullFeedFragmentPanel@9b2e.resetPreloadMedia$1L");
    }

    public static final void run$2(ARunnableS13S0210000_12 aRunnableS13S0210000_12) {
        boolean zLIZ;
        C1C7U.LIZ("FastFowardRewindUtilsKt@a1f8.hideButton$1");
        try {
            C786410Ut5.LJLLLLLL(8, (View) aRunnableS13S0210000_12.l0);
            C1616650sAh.LJFF((IViewPagerComponentAbility) aRunnableS13S0210000_12.l1, aRunnableS13S0210000_12.z2);
            C1616650sAh.LJ((IViewPagerComponentAbility) aRunnableS13S0210000_12.l1, aRunnableS13S0210000_12.z2);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("FastFowardRewindUtilsKt@a1f8.hideButton$1");
    }

    public ARunnableS13S0210000_12(Object obj, boolean z, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.z2 = z;
        this.l1 = obj2;
    }
}
