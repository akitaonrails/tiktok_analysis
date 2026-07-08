package X;

import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0O2p, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C613010O2p {
    public static final String LIZ(Aweme aweme) {
        if (aweme == null) {
            return null;
        }
        List<AnchorCommonStruct> anchors = aweme.getAnchors();
        if (anchors != null && !anchors.isEmpty()) {
            Iterator<AnchorCommonStruct> it2 = anchors.iterator();
            while (it2.hasNext()) {
                if (it2.next().getType() == EnumC1430380nKG.ANCHOR_MOVIETOK.getTYPE()) {
                    return "pgc_ip_promotion_anchor";
                }
            }
        }
        List<AnchorCommonStruct> anchors2 = aweme.getAnchors();
        if (anchors2 == null || anchors2.isEmpty()) {
            return null;
        }
        Iterator<AnchorCommonStruct> it3 = anchors2.iterator();
        while (it3.hasNext()) {
            if (it3.next().getType() == EnumC1430380nKG.NEWS.getTYPE()) {
                return "pgc_news_anchor";
            }
        }
        return null;
    }
}
