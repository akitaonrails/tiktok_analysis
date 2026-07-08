package Y;

import android.view.View;
import com.ss.android.ugc.aweme.discover.model.suggest.SuggestWordResponse;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.entry.core.viewmodel.ECDetailFeedSearchHelper;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public class ACListenerS14S1400000_10 implements View.OnClickListener {
    public final int $t;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;
    public String s0;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.$t) {
            case 0:
                onClick$0(this, view);
                break;
            case 1:
                onClick$1(this, view);
                break;
            case 2:
                onClick$2(this, view);
                break;
        }
    }

    public static final void onClick$0(ACListenerS14S1400000_10 aCListenerS14S1400000_10, View view) {
        ECDetailFeedSearchHelper eCDetailFeedSearchHelper = ECDetailFeedSearchHelper.LL;
        View view2 = (View) aCListenerS14S1400000_10.l1;
        Map map = (Map) aCListenerS14S1400000_10.l2;
        Map map2 = (Map) aCListenerS14S1400000_10.l3;
        String str = aCListenerS14S1400000_10.s0;
        Aweme aweme = (Aweme) aCListenerS14S1400000_10.l4;
        eCDetailFeedSearchHelper.getClass();
        ECDetailFeedSearchHelper.LJIIIZ(view2, aweme, str, map, map2);
    }

    public static final void onClick$1(ACListenerS14S1400000_10 aCListenerS14S1400000_10, View view) {
        ECDetailFeedSearchHelper eCDetailFeedSearchHelper = ECDetailFeedSearchHelper.LL;
        View view2 = (View) aCListenerS14S1400000_10.l1;
        Map map = (Map) aCListenerS14S1400000_10.l2;
        Map map2 = (Map) aCListenerS14S1400000_10.l3;
        String str = aCListenerS14S1400000_10.s0;
        Aweme aweme = (Aweme) aCListenerS14S1400000_10.l4;
        eCDetailFeedSearchHelper.getClass();
        ECDetailFeedSearchHelper.LJIIIZ(view2, aweme, str, map, map2);
    }

    public static final void onClick$2(ACListenerS14S1400000_10 aCListenerS14S1400000_10, View view) {
        ECDetailFeedSearchHelper eCDetailFeedSearchHelper = ECDetailFeedSearchHelper.LL;
        View view2 = (View) aCListenerS14S1400000_10.l1;
        Map map = (Map) aCListenerS14S1400000_10.l2;
        Map map2 = (Map) aCListenerS14S1400000_10.l3;
        String str = aCListenerS14S1400000_10.s0;
        Aweme aweme = (Aweme) aCListenerS14S1400000_10.l4;
        eCDetailFeedSearchHelper.getClass();
        ECDetailFeedSearchHelper.LJIIIZ(view2, aweme, str, map, map2);
    }

    public ACListenerS14S1400000_10(View view, SuggestWordResponse suggestWordResponse, Aweme aweme, String str, Map map, Map map2, int i) {
        this.$t = i;
        this.l1 = view;
        this.l2 = map;
        this.l3 = map2;
        this.s0 = str;
        this.l4 = aweme;
    }
}
