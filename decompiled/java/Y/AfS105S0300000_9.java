package Y;

import X.C09JN;
import X.C0NT8;
import X.C1C7U;
import X.C20684815ws;
import X.C2344009Gk;
import X.C596440NaM;
import X.C596450NaN;
import X.C619480ORm;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.feed.platform.cell.interact.bottom.bar.LiveTaskBarBottomBarAssem;
import com.ss.android.ugc.tiktok.pns.feedsafety.filtervideo.api.FilterKeywordResp;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes10.dex */
public class AfS105S0300000_9 implements C09JN {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // X.C09JN
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                break;
            case 1:
                accept$1(this, obj);
                break;
        }
    }

    public static final void accept$0(AfS105S0300000_9 afS105S0300000_9, Object obj) {
        String str;
        C1C7U.LIZ("FilterVideoKeywordPresenter@a6a.addKeywords$1");
        FilterKeywordResp filterKeywordResp = (FilterKeywordResp) obj;
        if (filterKeywordResp.status_code == 0) {
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("enter_from", "long_press_not_interested");
            c2344009Gk.LJ((List) afS105S0300000_9.l0, "keyword_word");
            C20684815ws.LJIILLIIL("add_video_filter_kw_success", c2344009Gk.LIZ);
            C619480ORm c619480ORm = C619480ORm.LIZ;
            int i = filterKeywordResp.counts;
            c619480ORm.getClass();
            C596450NaN c596450NaN = C596440NaM.LIZ;
            c596450NaN.LIZJ(String.valueOf(i), "tns_filter_keyword_count_self");
            int i2 = filterKeywordResp.totalCounts;
            if (i2 == -1) {
                c596450NaN.LIZJ(String.valueOf(filterKeywordResp.counts), "tns_filter_keyword_count");
            } else {
                c596450NaN.LIZJ(String.valueOf(i2), "tns_filter_keyword_count");
            }
            ((Function0) afS105S0300000_9.l1).invoke();
        } else {
            Function1 function1 = (Function1) afS105S0300000_9.l2;
            int i3 = filterKeywordResp.error_code;
            if (i3 != 3008042 && i3 != 3008043) {
                str = "";
            } else {
                str = filterKeywordResp.status_msg;
            }
            function1.invoke(str);
        }
        C1C7U.LIZIZ("FilterVideoKeywordPresenter@a6a.addKeywords$1");
    }

    public static final void accept$1(AfS105S0300000_9 afS105S0300000_9, Object obj) {
        C1C7U.LIZ("LiveTaskBarBottomBarAssem@c786.unlockTask$1");
        LiveTaskBarBottomBarAssem liveTaskBarBottomBarAssem = (LiveTaskBarBottomBarAssem) afS105S0300000_9.l0;
        liveTaskBarBottomBarAssem.LLLF++;
        liveTaskBarBottomBarAssem.Bp((Aweme) afS105S0300000_9.l1);
        if (((Aweme) afS105S0300000_9.l1) != null) {
            Aweme aweme = (Aweme) afS105S0300000_9.l2;
            C0NT8 c0nt8 = C0NT8.LIZ;
            String aid = aweme.getAid();
            c0nt8.getClass();
            ((HashSet) C0NT8.LJIIL).add(aid);
        }
        if (((Aweme) afS105S0300000_9.l1) != null) {
            Aweme aweme2 = (Aweme) afS105S0300000_9.l2;
            C0NT8 c0nt82 = C0NT8.LIZ;
            String aid2 = aweme2.getAid();
            c0nt82.getClass();
            ((HashMap) C0NT8.LJIIJ).put(aid2, 1);
        }
        C0NT8 c0nt83 = C0NT8.LIZ;
        Aweme aweme3 = (Aweme) afS105S0300000_9.l2;
        c0nt83.getClass();
        C0NT8.LIZJ(aweme3);
        C0NT8.LJIIIZ = true;
        C1C7U.LIZIZ("LiveTaskBarBottomBarAssem@c786.unlockTask$1");
    }

    public AfS105S0300000_9(Object obj, Object obj2, Object obj3, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
    }
}
