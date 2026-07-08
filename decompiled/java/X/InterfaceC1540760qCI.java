package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import java.util.List;

/* JADX INFO: renamed from: X.0qCI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
@C040D
public interface InterfaceC1540760qCI extends XBaseParamModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "accessKey", required = false)
    String getAccessKey();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "config", nestedClassType = InterfaceC1540770qCJ.class, required = true)
    InterfaceC1540770qCJ getConfig();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "schemaList", primitiveClassType = String.class, required = true)
    List<String> getSchemaList();
}
