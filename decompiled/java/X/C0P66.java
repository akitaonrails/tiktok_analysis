package X;

import com.ss.android.common.lib.AppLogNewUtils;
import com.ss.android.ugc.aweme.discover.mixfeed.DynamicPatch;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed;
import com.ss.android.ugc.aweme.search.performance.metrics.config.CardType;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0P66, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0P66 {
    public static final /* synthetic */ int LIZIZ = 0;
    public String LIZ;

    public static void LIZ(String str, List list) {
        Integer numValueOf;
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i >= 0) {
                SearchMixFeed searchMixFeed = (SearchMixFeed) obj;
                List<CardType> list2 = (List) C293090BeF.LIZIZ.getValue();
                if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                    for (CardType cardType : list2) {
                        if (cardType.type == searchMixFeed.feedType && Intrinsics.LJFF(cardType.docType, searchMixFeed.docType)) {
                            Integer num = cardType.originType;
                            if (num != null) {
                                DynamicPatch dynamicPatch = searchMixFeed.getDynamicPatch();
                                if (dynamicPatch != null) {
                                    numValueOf = Integer.valueOf(dynamicPatch.getOriginType());
                                } else {
                                    numValueOf = null;
                                }
                                if (Intrinsics.LJFF(num, numValueOf)) {
                                }
                            }
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("card_type", searchMixFeed.feedType);
                            jSONObject.put("doc_type", searchMixFeed.docType);
                            jSONObject.put("rank", i);
                            jSONObject.put("uni_rank", searchMixFeed.universalRank);
                            jSONObject.put("search_id", str);
                            jSONObject.put("search_result_id", searchMixFeed.getProviderDocIdStr());
                            AppLogNewUtils.onEventV3("search_result_data_monitor", jSONObject);
                            break;
                        }
                    }
                }
                i = i2;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
    }
}
