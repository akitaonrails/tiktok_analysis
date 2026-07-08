package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;

/* JADX INFO: renamed from: X.0ddH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1057770ddH extends AbstractC1057760ddG {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        InterfaceC1057780ddI interfaceC1057780ddI = (InterfaceC1057780ddI) xBaseParamModel;
        String imageUrl = interfaceC1057780ddI.getImageUrl();
        if (imageUrl != null && imageUrl.length() != 0) {
            C1326790kdB c1326790kdB = C1326790kdB.LIZ;
            String imageUrl2 = interfaceC1057780ddI.getImageUrl();
            c1326790kdB.getClass();
            C1326790kdB.LIZLLL(imageUrl2).LJJII(new C1077500e96(completionBlock, this, 2));
            return;
        }
        C2382909Vj.LIZ(completionBlock, -1, "image url is empty", null, 4);
    }
}
