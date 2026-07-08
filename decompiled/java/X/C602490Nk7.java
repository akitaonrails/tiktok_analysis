package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.ss.android.ugc.aweme.ecommerce.search.page.mix.IMixVSearchAbility;

/* JADX INFO: renamed from: X.0Nk7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C602490Nk7 extends AbstractC602500Nk8 {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        InterfaceC602810Nkd interfaceC602810Nkd = (InterfaceC602810Nkd) xBaseParamModel;
        IMixVSearchAbility iMixVSearchAbilityLIZ = C602660NkO.LIZ(this.IBridgeSdkContext);
        if (iMixVSearchAbilityLIZ != null) {
            C23250099c.LIZLLL(C2296808zG.LIZ(C2126308Ur.LJ), null, null, new C602480Nk6(iMixVSearchAbilityLIZ, interfaceC602810Nkd, this, completionBlock, null), 3);
        }
    }
}
