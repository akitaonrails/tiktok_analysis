package X;

import com.ss.android.ugc.aweme.search.appdiff.ISearchMobAppDiff;
import com.ss.android.ugc.aweme.search.model.SearchSugEntity;
import com.ss.android.ugc.aweme.search.model.SugExtraInfo;

/* JADX INFO: renamed from: X.0QJx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C668470QJx {
    public static final /* synthetic */ int LIZ = 0;

    public static C0QK1 LIZ(SearchSugEntity searchSugEntity) {
        boolean z;
        boolean z2;
        boolean zLIZLLL = searchSugEntity.LIZLLL();
        boolean z3 = false;
        if (searchSugEntity.LIZIZ() && ((Boolean) C285860BIi.LIZ.getValue()).booleanValue()) {
            z = true;
        } else {
            z = false;
        }
        SugExtraInfo sugExtraInfo = searchSugEntity.sugExtraInfo;
        if (sugExtraInfo != null && sugExtraInfo.isLiveQuery()) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (C284470BCz.LIZ() && searchSugEntity.LJ()) {
            z3 = true;
        }
        boolean zLIZJ = C0QNF.LIZJ(searchSugEntity);
        if (z2 && C1828607Ee.LIZ()) {
            return C0QK1.LIVE;
        }
        if (zLIZLLL) {
            return C0QK1.HOT;
        }
        if (z3 && C284470BCz.LIZ()) {
            return C0QK1.POI;
        }
        if (z) {
            return C0QK1.ECOMMERCE;
        }
        if (zLIZJ) {
            return C0QK1.PERSON;
        }
        return C0QK1.NOTHING;
    }

    public static String LIZIZ(C0QK1 c0qk1) {
        if (c0qk1 == null) {
            return null;
        }
        switch (C0QK0.LIZ[c0qk1.ordinal()]) {
            case 1:
                ISearchMobAppDiff.LIZ.getClass();
                C0QKA.LIZIZ.getValue().LIZIZ();
                return null;
            case 2:
                return "Time_sensitive";
            case 3:
                return "Live";
            case 4:
                return "Ecom";
            case 5:
                return "Local_service";
            case 6:
                return "Person";
            default:
                throw new C1954807lC();
        }
    }
}
