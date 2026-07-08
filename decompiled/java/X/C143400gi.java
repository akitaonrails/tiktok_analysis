package X;

import com.ss.android.ugc.aweme.search.pages.result.topsearch.reviewaggregation.model.SearchReviewAggregationProduct;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.00gi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C143400gi implements InterfaceC0148002o {
    public final Map<String, Object> LL;
    public final List<SearchReviewAggregationProduct> LLILLJJLI;

    public C143400gi() {
        this(null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C143400gi)) {
            return false;
        }
        C143400gi c143400gi = (C143400gi) obj;
        return Intrinsics.LJFF(this.LL, c143400gi.LL) && Intrinsics.LJFF(this.LLILLJJLI, c143400gi.LLILLJJLI);
    }

    public final int hashCode() {
        Map<String, Object> map = this.LL;
        int iHashCode = (map == null ? 0 : map.hashCode()) * 31;
        List<SearchReviewAggregationProduct> list = this.LLILLJJLI;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SearchReviewAggregationCardState(reviewAggregation=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", reviewAggregationProductList=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C143400gi(Map<String, ? extends Object> map, List<SearchReviewAggregationProduct> list) {
        this.LL = map;
        this.LLILLJJLI = list;
    }
}
