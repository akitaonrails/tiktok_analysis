package X;

import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.IExternalService;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0mLZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1392750mLZ {
    public static boolean LIZ(AnchorCommonStruct anchorCommonStruct, Aweme aweme) {
        AnchorCommonStruct next;
        if (anchorCommonStruct != null && C298890Bnb.LIZ() && C298980Bnk.LIZ() && C298980Bnk.LIZ()) {
            return C0AYL.LIZ(Integer.valueOf(anchorCommonStruct.getType()));
        }
        if (((Boolean) C298980Bnk.LIZIZ(Boolean.valueOf(!C1063450dmR.LIZ.getValue().booleanValue()), Boolean.FALSE)).booleanValue()) {
            return false;
        }
        AnchorCommonStruct anchorCommonStruct2 = null;
        if (C298980Bnk.LIZ()) {
            List<AnchorCommonStruct> anchors = aweme.getAnchors();
            if (anchors != null) {
                Iterator<AnchorCommonStruct> it2 = anchors.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        next = it2.next();
                        if (C1394440mOI.LIZIZ(C1394440mOI.LIZLLL(next))) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                AnchorCommonStruct anchorCommonStruct3 = next;
                if (anchorCommonStruct3 != null) {
                    if (anchorCommonStruct3.getType() == EnumC1430380nKG.ANCHOR_TT_CC_TEMPLATE.getTYPE() || anchorCommonStruct3.getType() == EnumC1430380nKG.ANCHOR_PUGC_TEMPLATE.getTYPE()) {
                        return C0AYL.LIZ(Integer.valueOf(anchorCommonStruct3.getType()));
                    }
                }
            }
            return false;
        }
        boolean zEnableShowMvAnchor = ((IExternalService) ServiceManager.get().getService(IExternalService.class)).configService().avsettingsConfig().enableShowMvAnchor();
        boolean zEnableShowCutsameAnchor = ((IExternalService) ServiceManager.get().getService(IExternalService.class)).configService().avsettingsConfig().enableShowCutsameAnchor();
        List<AnchorCommonStruct> anchors2 = aweme.getAnchors();
        if (anchors2 != null) {
            Iterator<AnchorCommonStruct> it3 = anchors2.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    break;
                }
                AnchorCommonStruct next2 = it3.next();
                if (next2.getType() == EnumC1430380nKG.MV_TEMPLATE.getTYPE()) {
                    anchorCommonStruct2 = next2;
                    break;
                }
            }
            AnchorCommonStruct anchorCommonStruct4 = anchorCommonStruct2;
            if (anchorCommonStruct4 != null) {
                if (Intrinsics.LJFF(anchorCommonStruct4.subType(), EnumC1394470mOL.CAPCUT.getValue())) {
                    return zEnableShowCutsameAnchor;
                }
                return zEnableShowMvAnchor;
            }
        }
        return false;
    }
}
