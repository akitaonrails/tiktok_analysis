package X;

import com.ss.android.ugc.aweme.ecommerce.model.AnchorProductInfo;
import com.ss.android.ugc.aweme.ecommerce.model.AnchorProductInfoModel;
import com.ss.android.ugc.aweme.ecommerce.service.IECommerceAnchorService;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0cQC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1011220cQC implements InterfaceC1002070cBR {
    public Pair<String, ? extends List<AnchorProductInfoModel>> LIZ;

    public final String LIZ(int i, Aweme aweme) {
        String aid;
        List<AnchorCommonStruct> anchors;
        AnchorCommonStruct next;
        AnchorProductInfo anchorProductInfo;
        Long l;
        List<AnchorProductInfoModel> second;
        AnchorProductInfo anchorProductInfo2;
        Long l2;
        if (aweme == null || !C1017070cZd.LLIIL(aweme) || (aid = aweme.getAid()) == null || (anchors = aweme.getAnchors()) == null) {
            return null;
        }
        Iterator<AnchorCommonStruct> it2 = anchors.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (next.getType() == EnumC1430380nKG.AD_PHOTO_CAROUSEL_ANCHOR.getTYPE()) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        AnchorCommonStruct anchorCommonStruct = next;
        if (anchorCommonStruct == null) {
            return null;
        }
        Pair<String, ? extends List<AnchorProductInfoModel>> pair = this.LIZ;
        if (pair != null && Intrinsics.LJFF(pair.getFirst(), aid) && (second = pair.getSecond()) != null) {
            AnchorProductInfoModel anchorProductInfoModel = (AnchorProductInfoModel) C13LP.LJJJLZIJ(i, second);
            if (anchorProductInfoModel == null || (anchorProductInfo2 = anchorProductInfoModel.extraData) == null || (l2 = anchorProductInfo2.productId) == null) {
                return null;
            }
            return l2.toString();
        }
        List<AnchorProductInfoModel> listLJJLIIIJL = ((IECommerceAnchorService) ServiceManager.get().getService(IECommerceAnchorService.class)).LJJLIIIJL(anchorCommonStruct);
        this.LIZ = new Pair<>(aid, listLJJLIIIJL);
        AnchorProductInfoModel anchorProductInfoModel2 = (AnchorProductInfoModel) C13LP.LJJJLZIJ(i, listLJJLIIIJL);
        if (anchorProductInfoModel2 == null || (anchorProductInfo = anchorProductInfoModel2.extraData) == null || (l = anchorProductInfo.productId) == null) {
            return null;
        }
        return l.toString();
    }
}
