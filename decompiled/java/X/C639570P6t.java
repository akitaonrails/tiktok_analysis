package X;

import android.content.Context;
import androidx.fragment.app.Fragment;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.discover.mixfeed.DynamicPatch;
import com.ss.android.ugc.aweme.search.common.utils.SAFHelper;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.reviewaggregation.model.SearchReviewAggregationProduct;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0P6t, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C639570P6t {
    public static final C639570P6t LIZ = new C639570P6t();

    public static int LIZIZ(Fragment fragment) {
        C19EG c19egLIZIZ;
        SAFHelper sAFHelper = SAFHelper.LIZ;
        Context context = fragment.getContext();
        if (context != null) {
            c19egLIZIZ = C1388190mED.LIZIZ(context);
        } else {
            c19egLIZIZ = null;
        }
        sAFHelper.getClass();
        return SAFHelper.LJIILL(fragment, c19egLIZIZ);
    }

    public static String LIZJ(Integer num) {
        if (num != null) {
            if (num.intValue() == 50) {
                return "review_aggregation_products";
            }
            if (num.intValue() == 51) {
                return "aggregation_pros_cons_products";
            }
            return null;
        }
        return null;
    }

    public static boolean LIZLLL(SearchMixFeed searchMixFeed) {
        DynamicPatch dynamicPatch = searchMixFeed.getDynamicPatch();
        if (dynamicPatch != null && dynamicPatch.getOriginType() == 51 && searchMixFeed.getAggregationProsCons() != null) {
            return true;
        }
        return false;
    }

    public static boolean LJ(SearchMixFeed searchMixFeed) {
        DynamicPatch dynamicPatch = searchMixFeed.getDynamicPatch();
        if (dynamicPatch != null && dynamicPatch.getOriginType() == 50 && searchMixFeed.getReviewAggregation() != null) {
            return true;
        }
        return false;
    }

    public static String LIZ(String str, C19719912Dl c19719912Dl) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(c19719912Dl.LJI());
        sbLIZ.append('_');
        sbLIZ.append(str);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static List LJFF(String str, Map map) {
        Object obj;
        List<Map> list;
        List list2;
        String str2;
        Number number;
        Integer numValueOf;
        if (map == null) {
            obj = null;
        } else {
            try {
                obj = map.get(str);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                return null;
            }
        }
        if (obj instanceof List) {
            list = (List) obj;
        } else {
            list = null;
        }
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        for (Map map2 : list) {
            Object obj2 = map2.get("cover_video_list");
            if (obj2 instanceof List) {
                list2 = (List) obj2;
            } else {
                list2 = null;
            }
            Object obj3 = map2.get("unique_id");
            if (obj3 instanceof String) {
                str2 = (String) obj3;
            } else {
                str2 = null;
            }
            Object obj4 = map2.get("video_cursor");
            if (obj4 instanceof Number) {
                number = (Number) obj4;
            } else {
                number = null;
            }
            if (number == null) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(number.intValue());
            }
            arrayList.add(new SearchReviewAggregationProduct(list2, str2, numValueOf));
        }
        return arrayList;
    }
}
