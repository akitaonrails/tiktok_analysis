package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import java.util.Map;

/* JADX INFO: renamed from: X.0vTY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C040D
public interface InterfaceC1743660vTY extends XBaseParamModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "params", required = false)
    Map<String, Object> getParams();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "schema", required = true)
    String getSchema();
}
