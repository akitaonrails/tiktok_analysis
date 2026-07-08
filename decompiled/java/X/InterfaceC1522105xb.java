package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import java.util.Map;

/* JADX INFO: renamed from: X.05xb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C040D
public interface InterfaceC1522105xb extends XBaseParamModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "params", required = true)
    Map<String, Object> getParams();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "schema", required = true)
    String getSchema();
}
