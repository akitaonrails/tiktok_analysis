package X;

import com.bytedance.android.livesdk.comp.api.pcs.IPcsService;
import com.bytedance.android.livesdk.comp.api.subscription.ISubscribeService;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import kotlin.jvm.internal.AFwS219S0000000_30;

/* JADX INFO: renamed from: X.13us, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20162813us extends AbstractC20162513up {
    public final C01GW LLILLL = C452501pT.LIZIZ(AFwS219S0000000_30.get$arr$(211));
    public final C01GW LLILZ = C452501pT.LIZIZ(AFwS219S0000000_30.get$arr$(210));

    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        InterfaceC20162413uo interfaceC20162413uo = (InterfaceC20162413uo) xBaseParamModel;
        ((ISubscribeService) this.LLILLL.getValue()).ei();
        C517110KPt.LIZ(interfaceC20162413uo.getRequestParams());
        ((IPcsService) this.LLILZ.getValue()).ei().LJII(interfaceC20162413uo.getRequestParams());
        completionBlock.onSuccess((XBaseResultModel) C1909107dp.LIZJ(InterfaceC20162613uq.class, null), "");
    }
}
