package X;

import android.text.TextUtils;
import com.ss.android.ugc.aweme.discover.mixfeed.DynamicPatch;
import com.ss.android.ugc.aweme.search.lynx.core.model.DynamicData;
import java.util.List;

/* JADX INFO: renamed from: X.0PZg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C646980PZg {
    public static final List<DynamicData> LIZ;

    static {
        DynamicPatch dynamicPatch = new DynamicPatch();
        dynamicPatch.schema = "aweme://lynxview/?channel=fe_tiktok_lynx_search_transfer&bundle=template.js&group=fe_tiktok_lynx_search_transfer&ab_params=show_most_visited_account,show_suggest_search_words,intermediate_show_trending_billboard,is_lynx_request_suggest";
        LIZ = C1697810uHb.LJIILJJIL(new DynamicData(1, dynamicPatch));
    }

    public static List LIZ() {
        System.currentTimeMillis();
        String strLIZ = C0BRT.LIZ();
        C0BRT.LIZ = strLIZ;
        if (TextUtils.isEmpty(strLIZ)) {
            C0BRT.LIZ = "aweme://lynxview/?channel=fe_tiktok_lynx_search_transfer&bundle=template.js&group=fe_tiktok_lynx_search_transfer&ab_params=show_most_visited_account,show_suggest_search_words,intermediate_show_trending_billboard,is_lynx_request_suggest";
        }
        System.currentTimeMillis();
        DynamicPatch dynamicPatch = new DynamicPatch();
        dynamicPatch.schema = C0BRT.LIZ;
        return C1697810uHb.LJIILJJIL(new DynamicData(1, dynamicPatch));
    }
}
