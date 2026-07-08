package X;

import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0TTJ, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0TTJ extends C0TTF {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        Number number;
        Pair pair = (Pair) DataChannelGlobal.LLILZ.gg0(C930630aKD.class);
        Number number2 = null;
        C0TTI c0tti = (C0TTI) C1909107dp.LIZJ(C0TTI.class, null);
        if (pair != null) {
            number = (Number) pair.getFirst();
        } else {
            number = null;
        }
        c0tti.setWidth(number);
        if (pair != null) {
            number2 = (Number) pair.getSecond();
        }
        c0tti.setHeight(number2);
        completionBlock.onSuccess(c0tti, "");
    }
}
