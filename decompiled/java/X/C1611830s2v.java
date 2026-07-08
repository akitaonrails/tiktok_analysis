package X;

import android.content.Intent;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.SeriesCategory;
import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;

/* JADX INFO: renamed from: X.0s2v, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1611830s2v {
    public static SeriesCategory LIZIZ(String str) {
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

    public static String LIZ(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }
}
