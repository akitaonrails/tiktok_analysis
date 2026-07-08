package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.ss.android.ugc.aweme.ecommerce.search.page.mix.IMixVSearchAbility;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0NkB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C602530NkB extends AbstractC602540NkC {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        InterfaceC602550NkD interfaceC602550NkD = (InterfaceC602550NkD) xBaseParamModel;
        IMixVSearchAbility iMixVSearchAbilityLIZ = C602660NkO.LIZ(this.IBridgeSdkContext);
        if (iMixVSearchAbilityLIZ != null) {
            Map<String, Object> requestExtraParams = interfaceC602550NkD.getRequestExtraParams();
            LinkedHashMap linkedHashMap = new LinkedHashMap(C2097908Jt.LIZIZ(requestExtraParams.size()));
            Iterator<T> it2 = requestExtraParams.entrySet().iterator();
            while (it2.hasNext()) {
                Map.Entry entry = (Map.Entry) it2.next();
                linkedHashMap.put(entry.getKey(), entry.getValue().toString());
            }
            iMixVSearchAbilityLIZ.Se(interfaceC602550NkD.getType().intValue(), linkedHashMap);
            Unit unit = Unit.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("ability is not null : ");
            sbLIZ.append(unit);
            C2188811AlT.LIZIZ(sbLIZ);
        }
    }
}
