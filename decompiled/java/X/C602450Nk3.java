package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.ss.android.ugc.aweme.ecommerce.search.page.mix.IMixVSearchAbility;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0Nk3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C602450Nk3 extends AbstractC602440Nk2 {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        InterfaceC602460Nk4 interfaceC602460Nk4 = (InterfaceC602460Nk4) xBaseParamModel;
        IMixVSearchAbility iMixVSearchAbilityLIZ = C602660NkO.LIZ(this.IBridgeSdkContext);
        if (iMixVSearchAbilityLIZ != null) {
            Map<String, Object> req = interfaceC602460Nk4.getReq();
            LinkedHashMap linkedHashMap = new LinkedHashMap(C2097908Jt.LIZIZ(req.size()));
            Iterator<T> it2 = req.entrySet().iterator();
            while (it2.hasNext()) {
                Map.Entry entry = (Map.Entry) it2.next();
                linkedHashMap.put(entry.getKey(), entry.getValue().toString());
            }
            C23250099c.LIZLLL(C2296808zG.LIZ(C2126308Ur.LIZIZ), null, null, new C602430Nk1(iMixVSearchAbilityLIZ, linkedHashMap, this, completionBlock, null), 3);
        }
    }
}
