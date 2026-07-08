package X;

import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;

/* JADX INFO: renamed from: X.0m2K, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1380820m2K {
    public static final C735400St0 LIZ(Aweme aweme) {
        if (aweme != null && aweme.getAnchors() != null) {
            if (aweme.getAnchors().size() > 0) {
                for (AnchorCommonStruct anchorCommonStruct : aweme.getAnchors()) {
                    if (anchorCommonStruct.getType() == EnumC1430380nKG.ANCHOR_PUGC_TEMPLATE.getTYPE() || anchorCommonStruct.getType() == EnumC1430380nKG.ANCHOR_UGC_TEMPLATE.getTYPE() || anchorCommonStruct.getType() == EnumC1430380nKG.ANCHOR_AUTO_CUT.getTYPE() || anchorCommonStruct.getType() == EnumC1430380nKG.MV_TEMPLATE.getTYPE() || anchorCommonStruct.getType() == EnumC1430380nKG.ANCHOR_TT_CC_TEMPLATE.getTYPE() || anchorCommonStruct.getType() == EnumC1430380nKG.ANCHOR_AIGT_TEMPLATE.getTYPE() || anchorCommonStruct.getType() == EnumC1430380nKG.ANCHOR_SGT_TEMPLATE.getTYPE()) {
                        return new C735400St0(anchorCommonStruct.subType(), anchorCommonStruct.getId());
                    }
                }
            }
            return new C735400St0(null, null);
        }
        return new C735400St0(null, null);
    }
}
