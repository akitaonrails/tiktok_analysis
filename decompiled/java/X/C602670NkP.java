package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.ss.android.ugc.aweme.ecommerce.search.page.mix.IMixVSearchAbility;

/* JADX INFO: renamed from: X.0NkP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C602670NkP extends AbstractC602690NkR {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        InterfaceC602730NkV interfaceC602730NkV = (InterfaceC602730NkV) xBaseParamModel;
        IMixVSearchAbility iMixVSearchAbilityLIZ = C602660NkO.LIZ(this.IBridgeSdkContext);
        if (iMixVSearchAbilityLIZ != null) {
            C23250099c.LIZLLL(C2296808zG.LIZ(C2126308Ur.LJ), null, null, new C602680NkQ(this, iMixVSearchAbilityLIZ, interfaceC602730NkV, completionBlock, null), 3);
        }
    }
}
