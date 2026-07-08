package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0grp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
@C040D
public interface InterfaceC1182110grp extends XBaseParamModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "dataMap", required = false)
    Map<String, Object> getDataMap();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "dataType", required = true)
    Number getDataType();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "keyList", primitiveClassType = String.class, required = false)
    List<String> getKeyList();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "method", required = true)
    Number getMethod();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "pageId", required = true)
    String getPageId();
}
