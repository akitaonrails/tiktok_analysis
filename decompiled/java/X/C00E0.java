package X;

import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.00E0, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C00E0 implements InterfaceC1389490mGJ {
    @Override // com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel
    public final Map<String, Object> convert() {
        return null;
    }

    @Override // com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel
    public final JSONObject toJSON() {
        return new JSONObject();
    }

    @Override // com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel
    public final List<String> provideParamList() {
        return C13BV.INSTANCE;
    }
}
