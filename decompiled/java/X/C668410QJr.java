package X;

import android.app.Activity;
import android.view.View;
import com.ss.android.ugc.aweme.search.common.utils.SAFHelper;
import com.ss.android.ugc.aweme.search.model.RichHisInfo;
import com.ss.android.ugc.aweme.search.model.SearchHistory;

/* JADX INFO: renamed from: X.0QJr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C668410QJr {
    public static final boolean LIZIZ(Integer num) {
        if (num != null) {
            if (!C301310BrV.LIZ() || num.intValue() < EnumC644330PPb.USER.getValue() || num.intValue() > EnumC644330PPb.ECOM.getValue()) {
                if (C07IT.LIZ()) {
                    if (num.intValue() == EnumC644330PPb.LIVE.getValue()) {
                        return true;
                    }
                    return false;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    public static final boolean LIZ(SearchHistory searchHistory, View view) throws Throwable {
        int iIntValue;
        String str;
        if (!C301310BrV.LIZ() && !C07IV.LIZ) {
            return false;
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
        if (!LIZIZ(searchHistory.LIZ(Integer.valueOf(iIntValue)))) {
            RichHisInfo richHisInfo = searchHistory.LIZJ.get(Integer.valueOf(iIntValue));
            if (richHisInfo == null || !C668120QIo.LIZ(searchHistory.keyword) || (str = richHisInfo.subTitle) == null || !C1533950q1J.LJ(str)) {
                return false;
            }
        }
        return true;
    }
}
