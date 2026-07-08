package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.ss.android.account.token.TTTokenUtils;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: renamed from: X.0wuf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1798910wuf extends AbstractC1798890wud {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        List<String> apiList = ((InterfaceC1798900wue) xBaseParamModel).getApiList();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (String str : apiList) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(C0CQT.LIZJ);
            sbLIZ.append(str);
            linkedHashMap.put(str, TTTokenUtils.LIZ(C2188811AlT.LIZIZ(sbLIZ)));
        }
        XBaseModel xBaseModelLIZJ = C1909107dp.LIZJ(InterfaceC1798880wuc.class, null);
        ((InterfaceC1798880wuc) xBaseModelLIZJ).setTokenDictionary(linkedHashMap);
        completionBlock.onSuccess((XBaseResultModel) xBaseModelLIZJ, "");
    }
}
