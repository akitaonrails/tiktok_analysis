package X;

import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.List;

/* JADX INFO: renamed from: X.0OaB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C621810OaB {
    public static final int LIZ;
    public static final boolean LIZIZ;
    public static final boolean LIZJ;
    public static final boolean LIZLLL;

    static {
        int iLJIJ = C0C64.LJIILLIIL().LJIJ(31744, 0, "panel_dislike_button_behavior", true);
        LIZ = iLJIJ;
        LIZIZ = iLJIJ > 0;
        LIZJ = iLJIJ == 1;
        LIZLLL = iLJIJ == 2;
    }

    public static boolean LIZ(Aweme aweme) {
        List<AnchorCommonStruct> anchors;
        if (LIZ == 0 || LIZJ || !LIZLLL) {
            return false;
        }
        if (((Boolean) C0ABK.LIZ.getValue()).booleanValue()) {
            if (aweme == null || (anchors = aweme.getAnchors()) == null) {
                return false;
            }
            for (AnchorCommonStruct anchorCommonStruct : anchors) {
                AnchorCommonStruct anchorCommonStruct2 = anchorCommonStruct;
                if (anchorCommonStruct2.getType() == EnumC1430380nKG.ANCHOR_SHOP_WINDOW.getTYPE() || anchorCommonStruct2.getType() == EnumC1430380nKG.ANCHOR_SHOP_MIX.getTYPE()) {
                    if (anchorCommonStruct == null) {
                        return false;
                    }
                }
            }
            return false;
        }
        return true;
    }
}
