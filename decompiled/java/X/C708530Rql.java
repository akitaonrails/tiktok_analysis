package X;

import com.ss.android.ugc.aweme.ecommerce.service.IECommerceAnchorService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;

/* JADX INFO: renamed from: X.0Rql, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C708530Rql {
    public static boolean LIZ(Aweme aweme) {
        boolean zLJJJJZ;
        boolean z = false;
        IECommerceAnchorService iECommerceAnchorService = (IECommerceAnchorService) PluggableExtentionKt.pluggableSpi$default(IECommerceAnchorService.class, false, false, false, 14, null);
        if (iECommerceAnchorService != null) {
            zLJJJJZ = iECommerceAnchorService.LJJJJZ(aweme);
        } else {
            zLJJJJZ = false;
        }
        if (!aweme.isAd() && !AwemeExtKt.isSelfSee(aweme) && zLJJJJZ && C300590BqL.LIZ()) {
            z = true;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("isAnchorVideoGuideEnable#aid:");
        sbLIZ.append(aweme.getAid());
        sbLIZ.append(",result: ");
        sbLIZ.append(z);
        sbLIZ.append(",isAd:");
        sbLIZ.append(aweme.isAd());
        sbLIZ.append(",isSelf:");
        sbLIZ.append(AwemeExtKt.isSelfSee(aweme));
        sbLIZ.append(",hasAnchor:");
        sbLIZ.append(zLJJJJZ);
        C2188811AlT.LIZIZ(sbLIZ);
        return z;
    }
}
