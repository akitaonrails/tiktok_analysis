package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeStatistics;
import kotlin.jvm.internal.AFwS187S0000000_2;

/* JADX INFO: renamed from: X.04jT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1179704jT {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(1082));

    public static final boolean LIZ(Aweme aweme, boolean z) {
        long commentCount;
        boolean z2;
        if (aweme == null) {
            return false;
        }
        AwemeStatistics statistics = aweme.getStatistics();
        if (statistics != null) {
            commentCount = statistics.getCommentCount();
        } else {
            commentCount = 0;
        }
        if (commentCount == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        int iIntValue = ((Number) LIZ.getValue()).intValue();
        if (iIntValue != 1) {
            if (iIntValue == 2) {
                return true;
            }
            if (iIntValue != 3) {
                return false;
            }
            return !z;
        }
        return z2;
    }
}
