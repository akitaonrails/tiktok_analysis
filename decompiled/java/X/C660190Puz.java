package X;

import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.List;

/* JADX INFO: renamed from: X.0Puz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C660190Puz {
    public static final boolean LIZ(Aweme aweme) {
        if (aweme == null) {
            return false;
        }
        C10IT.LIZ.getClass();
        if (C10IT.LJIIL(aweme) || C0PI4.LJ(aweme)) {
            return false;
        }
        C660800Pvy.LIZ.getClass();
        if (C660800Pvy.LIZ(aweme) != null) {
            List<AnchorCommonStruct> anchors = aweme.getAnchors();
            if (anchors != null && !anchors.isEmpty()) {
                for (AnchorCommonStruct anchorCommonStruct : anchors) {
                    if (anchorCommonStruct.getType() != EnumC1430380nKG.ANCHOR_SHOP_MIX.getTYPE() || !anchorCommonStruct.getShowInSearchResult()) {
                    }
                }
                return true;
            }
            return true;
        }
        return false;
    }
}
