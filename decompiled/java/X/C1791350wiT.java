package X;

import android.content.Context;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import java.util.List;
import kotlin.jvm.internal.AwS393S0200000_27;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0wiT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1791350wiT extends AbstractC1791470wif {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        Context context;
        InterfaceC1791370wiV interfaceC1791370wiV = (InterfaceC1791370wiV) xBaseParamModel;
        long currentUserId = UserService.getInstance().user().getCurrentUserId();
        String merchantId = interfaceC1791370wiV.getMerchantId();
        List<String> products = interfaceC1791370wiV.getProducts();
        String productType = interfaceC1791370wiV.getProductType();
        EnumC1780720wRK enumC1780720wRK = EnumC1780720wRK.INAPP;
        if (!Intrinsics.LJFF(productType, enumC1780720wRK.getValue())) {
            enumC1780720wRK = EnumC1780720wRK.SUBSCRIPTION;
        }
        C1789460wfQ c1789460wfQ = new C1789460wfQ(currentUserId, merchantId, products, enumC1780720wRK, 12);
        InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
        if (interfaceC634840OvC != null && (context = interfaceC634840OvC.getContext()) != null) {
            C352701Yn.LIZ(context, new C1789290wf9(c1789460wfQ, null), new AwS393S0200000_27(this, (C1791350wiT) completionBlock, (CompletionBlock<InterfaceC1791420wia>) 74));
        } else {
            C2382909Vj.LIZ(completionBlock, -1, "context is null", null, 4);
        }
    }
}
