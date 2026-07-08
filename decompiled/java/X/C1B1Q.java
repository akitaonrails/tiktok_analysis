package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import java.util.Map;

/* JADX INFO: renamed from: X.1B1Q, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public interface C1B1Q extends XBaseModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "metaInfo", required = false)
    Map<String, Object> getMetaInfo();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "uri", required = false)
    String getUri();

    @InterfaceC1549470qQL(isGetter = false, keyPath = "metaInfo", required = false)
    void setMetaInfo(Map<String, ? extends Object> map);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "uri", required = false)
    void setUri(String str);
}
