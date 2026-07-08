package X;

import com.ss.android.ugc.aweme.poi.reviews.landing.viewmodel.PoiReviewsListViewModel;
import java.util.HashMap;

/* JADX INFO: renamed from: X.07ko, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1952407ko {
    public static boolean LIZ(String str) {
        HashMap<String, Boolean> map = PoiReviewsListViewModel.LLJLLIL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId());
        sbLIZ.append('_');
        sbLIZ.append(str);
        Boolean bool = map.get(C2188811AlT.LIZIZ(sbLIZ));
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }
}
