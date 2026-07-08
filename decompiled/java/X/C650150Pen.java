package X;

import com.ss.android.ugc.aweme.search.model.SearchResultParam;

/* JADX INFO: renamed from: X.0Pen, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C650150Pen {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZ(SearchResultParam searchResultParam) {
        Integer numValueOf;
        C0QER searchEnterParam;
        if (searchResultParam != null && (searchEnterParam = searchResultParam.getSearchEnterParam()) != null) {
            numValueOf = Integer.valueOf(C650500PfM.LIZIZ(searchEnterParam));
        } else {
            numValueOf = null;
        }
        int value = C0QXR.MALL.getValue();
        if (numValueOf == null || numValueOf.intValue() != value) {
            int value2 = C0QXR.HOMEPAGE_MALL.getValue();
            if (numValueOf != null && numValueOf.intValue() == value2) {
                return true;
            }
            return false;
        }
        return true;
    }
}
