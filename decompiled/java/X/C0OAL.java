package X;

import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.List;

/* JADX INFO: renamed from: X.0OAL, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0OAL {
    public static final String LIZ(Aweme aweme) {
        List<AnchorCommonStruct> anchors;
        List<AnchorCommonStruct> anchors2;
        if (aweme != null && (anchors = aweme.getAnchors()) != null && !anchors.isEmpty() && aweme != null && (anchors2 = aweme.getAnchors()) != null) {
            for (AnchorCommonStruct anchorCommonStruct : anchors2) {
                if (anchorCommonStruct.getType() == EnumC1430380nKG.GO_LIVE_INCENTIVE_ANCHOR.getTYPE()) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("{type:");
                    sbLIZ.append(anchorCommonStruct.getType());
                    sbLIZ.append('}');
                    return C2188811AlT.LIZIZ(sbLIZ);
                }
            }
        }
        return null;
    }

    public static final String LIZIZ(Boolean bool) {
        if (bool == null || !bool.booleanValue()) {
            return CardStruct.IStatusCode.DEFAULT;
        }
        return "1";
    }
}
