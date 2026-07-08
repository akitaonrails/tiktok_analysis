package X;

import com.bytedance.android.livesdkapi.depend.event.LiveIsHavingPinCardData;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;

/* JADX INFO: renamed from: X.0wlP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1793170wlP extends AbstractC1793130wlL {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        InterfaceC1793140wlM interfaceC1793140wlM = (InterfaceC1793140wlM) C1909107dp.LIZJ(InterfaceC1793140wlM.class, null);
        interfaceC1793140wlM.setHavePinCard((Boolean) DataChannelGlobal.LLILZ.gg0(LiveIsHavingPinCardData.class));
        completionBlock.onSuccess(interfaceC1793140wlM, "");
    }
}
