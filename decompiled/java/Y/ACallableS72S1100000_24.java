package Y;

import X.C00GD;
import X.C1150504el;
import X.C1588560rRO;
import X.C1590820rV2;
import X.C19EG;
import X.C1C7U;
import X.C1D0F;
import X.C20684815ws;
import X.C2344009Gk;
import X.EnumC046900Ex;
import android.content.Intent;
import android.os.SystemClock;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.feed.panel.FollowFeedFragmentPanelMT;
import com.ss.android.ugc.aweme.feed.ui.FeedFollowFragment;
import java.util.concurrent.Callable;
import kotlin.Unit;

/* JADX INFO: loaded from: classes25.dex */
public class ACallableS72S1100000_24 implements Callable {
    public final int $t;
    public Object l1;
    public String s0;

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.$t) {
            case 0:
                return call$0(this);
            case 1:
                return call$1(this);
            default:
                return null;
        }
    }

    public static final Object call$0(ACallableS72S1100000_24 aCallableS72S1100000_24) {
        C1C7U.LIZ("FollowingFeedPerfMonitor@e9b1.reportLandingEvent$1");
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LIZLLL(C1588560rRO.LIZ - C1150504el.LIZ().LJJIII, "time_from_launch_to_following_feed");
        c2344009Gk.LIZLLL(C1588560rRO.LIZIZ - C1588560rRO.LIZ, EnumC046900Ex.PAGE_CREATION_TO_VIEW_VISIBLE.getValue());
        c2344009Gk.LIZLLL(SystemClock.elapsedRealtime() - C1588560rRO.LIZ, EnumC046900Ex.PAGE_CREATION_TO_FIRST_FRAME_RENDER.getValue());
        c2344009Gk.LJIIIIZZ("cache_invalidation", C1588560rRO.LIZLLL);
        c2344009Gk.LIZJ(C1588560rRO.LIZJ, "is_use_preload_data");
        c2344009Gk.LIZJ(((C00GD) aCallableS72S1100000_24.l1).getValue(), "result");
        c2344009Gk.LJIIIIZZ("to_page", aCallableS72S1100000_24.s0);
        C20684815ws.LJIILLIIL("follow_feed_landing", c2344009Gk.LIZ);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("FollowingFeedPerfMonitor@e9b1.reportLandingEvent$1");
        return unit;
    }

    public static final Object call$1(ACallableS72S1100000_24 aCallableS72S1100000_24) {
        boolean zIsConnected;
        String strLIZJ;
        Intent intent;
        FeedFollowFragment feedFollowFragment = (FeedFollowFragment) aCallableS72S1100000_24.l1;
        String str = aCallableS72S1100000_24.s0;
        feedFollowFragment.getClass();
        C1C7U.LIZ("FeedFollowFragment@1d3d.com_ss_android_ugc_aweme_feed_ui_FeedFollowFragment__onResume$___twin___$1L");
        C1D0F c1d0f = C1D0F.LIZ;
        if (c1d0f != null) {
            zIsConnected = c1d0f.isConnected();
            strLIZJ = c1d0f.LIZJ();
        } else {
            zIsConnected = false;
            strLIZJ = "";
        }
        C1590820rV2 c1590820rV2 = new C1590820rV2("enter_homepage_follow");
        c1590820rV2.LIZLLL = "open_app";
        c1590820rV2.LJJIII = zIsConnected;
        c1590820rV2.LJJIIJ = strLIZJ;
        c1590820rV2.LJIJ = "open_app";
        if (!TextUtils.isEmpty(str)) {
            c1590820rV2.LJIJJLI = str;
        }
        FollowFeedFragmentPanelMT followFeedFragmentPanelMT = feedFollowFragment.LLJJJ;
        if (followFeedFragmentPanelMT != null && followFeedFragmentPanelMT.LJIIIIZZ() != null) {
            c1590820rV2.LJIILLIIL(feedFollowFragment.LLJJJ.LJIIIIZZ());
        }
        c1590820rV2.LJIILJJIL();
        C19EG activity = feedFollowFragment.getActivity();
        if (activity != null && (intent = activity.getIntent()) != null) {
            intent.removeExtra("story_publish_landing_tab");
        }
        C1C7U.LIZIZ("FeedFollowFragment@1d3d.com_ss_android_ugc_aweme_feed_ui_FeedFollowFragment__onResume$___twin___$1L");
        return null;
    }

    public ACallableS72S1100000_24(Object obj, String str, int i) {
        this.$t = i;
        this.l1 = obj;
        this.s0 = str;
    }
}
