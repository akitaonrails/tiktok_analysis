package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.ss.android.ugc.governance.eventbus.IEvent;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0vQk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1741920vQk extends AbstractC1741900vQi {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        InterfaceC1741910vQj interfaceC1741910vQj = (InterfaceC1741910vQj) xBaseParamModel;
        interfaceC1741910vQj.getEnterMethod();
        interfaceC1741910vQj.getAttachProducts();
        final Map<String, Object> extraRequestParams = interfaceC1741910vQj.getExtraRequestParams();
        C1440005kM.LIZ(new IEvent(extraRequestParams) { // from class: X.034b
            public final Map<String, Object> LIZ;

            @Override // com.ss.android.ugc.governance.eventbus.IEvent
            public final /* synthetic */ IEvent post() {
                C1440005kM.LIZ(this);
                return this;
            }

            @Override // com.ss.android.ugc.governance.eventbus.IEvent
            public final /* synthetic */ IEvent postSticky() {
                C1440005kM.LIZIZ(this);
                return this;
            }

            {
                this.LIZ = extraRequestParams;
            }
        });
        completionBlock.onSuccess(new XBaseResultModel() { // from class: X.00p6
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
