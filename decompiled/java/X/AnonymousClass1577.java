package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;

/* JADX INFO: renamed from: X.1577, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class AnonymousClass1577 extends AnonymousClass1575 {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        AnonymousClass1576 anonymousClass1576 = (AnonymousClass1576) xBaseParamModel;
        String imageUrl = anonymousClass1576.getImageUrl();
        if (imageUrl != null && imageUrl.length() != 0) {
            C1326790kdB c1326790kdB = C1326790kdB.LIZ;
            String imageUrl2 = anonymousClass1576.getImageUrl();
            c1326790kdB.getClass();
            C1326790kdB.LIZLLL(imageUrl2).LJJII(new C20750016Hq(completionBlock, this, anonymousClass1576, 0));
            return;
        }
        C2382909Vj.LIZ(completionBlock, 0, "image url is empty", null, 4);
    }
}
