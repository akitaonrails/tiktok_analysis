package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.ss.android.ugc.aweme.ecommerce.search.page.mix.IMixVSearchAbility;

/* JADX INFO: renamed from: X.0NkJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C602610NkJ extends AbstractC602620NkK {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        InterfaceC602630NkL interfaceC602630NkL = (InterfaceC602630NkL) xBaseParamModel;
        IMixVSearchAbility iMixVSearchAbilityLIZ = C602660NkO.LIZ(this.IBridgeSdkContext);
        if (iMixVSearchAbilityLIZ != null) {
            boolean zUY1 = iMixVSearchAbilityLIZ.uY1(interfaceC602630NkL.isSingleCol());
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("ability is not null : ");
            sbLIZ.append(zUY1);
            C2188811AlT.LIZIZ(sbLIZ);
        }
    }
}
