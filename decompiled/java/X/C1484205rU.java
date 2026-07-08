package X;

import com.ss.android.ugc.aweme.ad.feed.shopping.FeedAdShoppingService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import java.util.HashSet;

/* JADX INFO: renamed from: X.05rU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1484205rU {
    public static void LIZ(Aweme aweme, boolean z) {
        if (aweme == null) {
            return;
        }
        Long creativeId = null;
        if (z) {
            HashSet<String> value = FeedAdShoppingService.LJ.getValue();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(aweme.getRequestId());
            sbLIZ.append('-');
            AwemeRawAd awemeRawAdLJJIJLIJ = C1017070cZd.LJJIJLIJ(aweme);
            if (awemeRawAdLJJIJLIJ != null) {
                creativeId = awemeRawAdLJJIJLIJ.getCreativeId();
            }
            sbLIZ.append(creativeId);
            value.add(C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        HashSet<String> value2 = FeedAdShoppingService.LJFF.getValue();
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(aweme.getRequestId());
        sbLIZ2.append('-');
        AwemeRawAd awemeRawAdLJJIJLIJ2 = C1017070cZd.LJJIJLIJ(aweme);
        if (awemeRawAdLJJIJLIJ2 != null) {
            creativeId = awemeRawAdLJJIJLIJ2.getCreativeId();
        }
        sbLIZ2.append(creativeId);
        value2.add(C2188811AlT.LIZIZ(sbLIZ2));
    }
}
