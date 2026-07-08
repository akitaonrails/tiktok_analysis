package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.SeriesCategory;
import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;

/* JADX INFO: renamed from: X.0SGg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C718480SGg {
    public static final /* synthetic */ int LIZ = 0;

    public static SeriesCategory LIZ(String str) {
        if (str != null) {
            int iHashCode = str.hashCode();
            if (iHashCode != -2032180703) {
                if (iHashCode != 601760863) {
                    if (iHashCode != 48) {
                        if (iHashCode == 49 && str.equals("1")) {
                            return SeriesCategory.MINI_DRAMA;
                        }
                        return null;
                    }
                    if (str.equals(CardStruct.IStatusCode.DEFAULT)) {
                        return SeriesCategory.DEFAULT;
                    }
                    return null;
                }
                if (str.equals("MINI_DRAMA")) {
                    return SeriesCategory.MINI_DRAMA;
                }
                return null;
            }
            if (str.equals(LivePreviewCTASmartDisplayManager.DEFAULT)) {
                return SeriesCategory.DEFAULT;
            }
            return null;
        }
        return null;
    }
}
