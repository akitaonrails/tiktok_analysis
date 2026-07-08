package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import java.util.Map;
import lth.o;

/* JADX INFO: renamed from: X.0nN5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1432130nN5 extends AbstractC755710Tkf {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        XBaseModel xBaseModelLIZJ = C1909107dp.LIZJ(InterfaceC755700Tke.class, null);
        C13DA c13da = new C13DA();
        c13da.put("effect_sdk_version", o.LIZIZ());
        Map<C0CIJ, C311200CHu> map = C311170CHr.LIZ;
        c13da.put("feature_code", C13LP.LJJLIIIJ(C13LQ.LJJLL(C0CIJ.values()), ",", null, null, 0, null, null, 62));
        c13da.put("feature_list", C13LP.LJJLIIIJ(C1432220nNE.LIZ.LIZIZ(C13BV.INSTANCE, false), ",", null, null, 0, null, null, 62));
        c13da.put("protocol_version", 2);
        ((InterfaceC755700Tke) xBaseModelLIZJ).setFeatures(c13da.build());
        completionBlock.onSuccess((XBaseResultModel) xBaseModelLIZJ, "success");
    }
}
