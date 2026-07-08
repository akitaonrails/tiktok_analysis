package Y;

import X.C09JN;
import X.C1C7U;
import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.discover.model.suggest.SuggestWordResponse;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.entry.core.viewmodel.DetailFeedSearchHelper;
import com.ss.android.ugc.aweme.search.entry.core.viewmodel.ECDetailFeedSearchHelper;
import com.ss.android.ugc.aweme.search.pages.sug.core.model.SearchSugWordResponse;
import java.util.Map;
import org.json.JSONException;

/* JADX INFO: loaded from: classes11.dex */
public class AfS8S0600000_10 implements C09JN {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;
    public Object l5;

    @Override // X.C09JN
    public final void accept(Object obj) throws JSONException {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                break;
            case 1:
                accept$1(this, obj);
                break;
            case 2:
                accept$2(this, obj);
                break;
        }
    }

    public static final void accept$0(AfS8S0600000_10 afS8S0600000_10, Object obj) {
        C1C7U.LIZ("DetailFeedSearchHelper@a066.performTraditionalApiRequest$1");
        SearchSugWordResponse searchSugWordResponse = (SearchSugWordResponse) obj;
        if (!DetailFeedSearchHelper.LL.LJIIL((LifecycleOwner) afS8S0600000_10.l0)) {
            DetailFeedSearchHelper.LJIIIZ((View) afS8S0600000_10.l1, searchSugWordResponse, (Map) afS8S0600000_10.l2, (Map) afS8S0600000_10.l3, null, (Aweme) afS8S0600000_10.l4, (View) afS8S0600000_10.l5);
        }
        C1C7U.LIZIZ("DetailFeedSearchHelper@a066.performTraditionalApiRequest$1");
    }

    public static final void accept$1(AfS8S0600000_10 afS8S0600000_10, Object obj) {
        C1C7U.LIZ("DetailFeedSearchHelper@a066.performTraditionalApiRequest$2");
        if (!DetailFeedSearchHelper.LL.LJIIL((LifecycleOwner) afS8S0600000_10.l0)) {
            DetailFeedSearchHelper.LJIIIZ((View) afS8S0600000_10.l1, null, (Map) afS8S0600000_10.l2, (Map) afS8S0600000_10.l3, null, (Aweme) afS8S0600000_10.l4, (View) afS8S0600000_10.l5);
        }
        C1C7U.LIZIZ("DetailFeedSearchHelper@a066.performTraditionalApiRequest$2");
    }

    public static final void accept$2(AfS8S0600000_10 afS8S0600000_10, Object obj) throws JSONException {
        C1C7U.LIZ("ECDetailFeedSearchHelper@5f7b.requestAndUpdateEcInputWord$1$1");
        SuggestWordResponse suggestWordResponse = (SuggestWordResponse) obj;
        if (!ECDetailFeedSearchHelper.LL.LJI((LifecycleOwner) afS8S0600000_10.l0)) {
            if (ECDetailFeedSearchHelper.LJII((Map) afS8S0600000_10.l1)) {
                ECDetailFeedSearchHelper.LJFF((View) afS8S0600000_10.l2, suggestWordResponse, (Map) afS8S0600000_10.l1, (Map) afS8S0600000_10.l3, (Aweme) afS8S0600000_10.l4);
            } else if (ECDetailFeedSearchHelper.LJIIIIZZ((Map) afS8S0600000_10.l1)) {
                DetailFeedSearchHelper detailFeedSearchHelper = DetailFeedSearchHelper.LL;
                View view = (View) afS8S0600000_10.l2;
                Map map = (Map) afS8S0600000_10.l1;
                Map map2 = (Map) afS8S0600000_10.l3;
                Aweme aweme = (Aweme) afS8S0600000_10.l4;
                View view2 = (View) afS8S0600000_10.l5;
                detailFeedSearchHelper.getClass();
                DetailFeedSearchHelper.LJIIIZ(view, null, map, map2, suggestWordResponse, aweme, view2);
            }
        }
        C1C7U.LIZIZ("ECDetailFeedSearchHelper@5f7b.requestAndUpdateEcInputWord$1$1");
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AfS8S0600000_10(android.view.View r2, android.view.View r3, androidx.lifecycle.LifecycleOwner r4, com.ss.android.ugc.aweme.feed.model.Aweme r5, java.util.Map r6, java.util.Map r7, int r8) {
        /*
            r1 = this;
            r1.$t = r8
            switch(r8) {
                case 0: goto L16;
                case 1: goto L16;
                default: goto L5;
            }
        L5:
            r0 = r1
            r0.l0 = r4
            r0.l1 = r6
            r0.l2 = r2
            r0.l3 = r7
            r0.l4 = r5
            r0.l5 = r3
        L12:
            r0.<init>()
            return
        L16:
            r0 = r1
            r0.l0 = r4
            r0.l1 = r2
            r0.l2 = r6
            r0.l3 = r7
            r0.l4 = r5
            r0.l5 = r3
            goto L12
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AfS8S0600000_10.<init>(android.view.View, android.view.View, androidx.lifecycle.LifecycleOwner, com.ss.android.ugc.aweme.feed.model.Aweme, java.util.Map, java.util.Map, int):void");
    }
}
