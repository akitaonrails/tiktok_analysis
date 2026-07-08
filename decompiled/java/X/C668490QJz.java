package X;

import android.app.Activity;
import android.view.View;
import com.ss.android.ugc.aweme.search.common.utils.SAFHelper;
import com.ss.android.ugc.aweme.search.model.SearchHistory;

/* JADX INFO: renamed from: X.0QJz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C668490QJz {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZ(SearchHistory searchHistory, View view) {
        int iIntValue;
        if (searchHistory == null) {
            return null;
        }
        if (searchHistory.musicId != null) {
            return "Sound";
        }
        SAFHelper sAFHelper = SAFHelper.LIZ;
        Activity activityLIZ = C1388190mED.LIZ(view.getContext());
        sAFHelper.getClass();
        Integer numLJJIJIIJIL = SAFHelper.LJJIJIIJIL(activityLIZ, view);
        if (numLJJIJIIJIL != null) {
            iIntValue = numLJJIJIIJIL.intValue();
        } else {
            iIntValue = 0;
        }
        return C668460QJw.LIZ(searchHistory.LIZ(Integer.valueOf(iIntValue)));
    }
}
