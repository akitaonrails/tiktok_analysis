package X;

import com.bytedance.android.livesdkapi.host.IHostSetting;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;

/* JADX INFO: renamed from: X.0xth, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1836750xth extends AbstractC1836770xtj {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        InterfaceC1836760xti interfaceC1836760xti = (InterfaceC1836760xti) C1909107dp.LIZJ(InterfaceC1836760xti.class, null);
        interfaceC1836760xti.setMaxDuration(Long.valueOf(((IHostSetting) C1161920gLG.LIZJ(IHostSetting.class)).o90() / 1000));
        completionBlock.onSuccess(interfaceC1836760xti, "");
    }
}
