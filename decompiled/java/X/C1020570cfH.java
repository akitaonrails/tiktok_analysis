package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0cfH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1020570cfH extends AbstractC1020580cfI {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        boolean z;
        InterfaceC1020590cfJ interfaceC1020590cfJ = (InterfaceC1020590cfJ) xBaseParamModel;
        String itemId = interfaceC1020590cfJ.getItemId();
        String underWaterStatus = interfaceC1020590cfJ.getUnderWaterStatus();
        if (itemId != null && itemId.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (!z && underWaterStatus != null && underWaterStatus.length() != 0) {
            C1440005kM.LIZ(new C584900Mwq(itemId, underWaterStatus));
            completionBlock.onSuccess(new XBaseResultModel() { // from class: X.00p4
                @Override // com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel
                public final Map<String, Object> convert() {
                    return null;
                }

                @Override // com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel
                public final JSONObject toJSON() {
                    return new JSONObject();
                }

                @Override // com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel
                public final List<String> provideResultList() {
                    return C13BV.INSTANCE;
                }
            }, "");
        } else {
            completionBlock.onSuccess(new XBaseResultModel() { // from class: X.00p4
                @Override // com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel
                public final Map<String, Object> convert() {
                    return null;
                }

                @Override // com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel
                public final JSONObject toJSON() {
                    return new JSONObject();
                }

                @Override // com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel
                public final List<String> provideResultList() {
                    return C13BV.INSTANCE;
                }
            }, "");
        }
    }
}
