package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.ss.android.ugc.aweme.ecommerce.search.page.mix.IMixVSearchAbility;

/* JADX INFO: renamed from: X.0NkW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C602740NkW extends AbstractC602760NkY {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        boolean z;
        InterfaceC602770NkZ interfaceC602770NkZ = (InterfaceC602770NkZ) xBaseParamModel;
        IMixVSearchAbility iMixVSearchAbilityLIZ = C602660NkO.LIZ(this.IBridgeSdkContext);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("handle: mixVSearchAbility = ");
        if (iMixVSearchAbilityLIZ != null) {
            z = true;
        } else {
            z = false;
        }
        sbLIZ.append(z);
        C2188811AlT.LIZIZ(sbLIZ);
        if (iMixVSearchAbilityLIZ != null) {
            C23250099c.LIZLLL(C2296808zG.LIZ(C2126308Ur.LIZIZ), null, null, new C602750NkX(iMixVSearchAbilityLIZ, interfaceC602770NkZ, this, completionBlock, null), 3);
        } else {
            C2382909Vj.LIZ(completionBlock, 0, "IMixVSearchAbility not found!", null, 4);
        }
    }
}
