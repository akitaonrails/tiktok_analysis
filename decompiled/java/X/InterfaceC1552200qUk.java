package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import java.util.Map;

/* JADX INFO: renamed from: X.0qUk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
@C040E
public interface InterfaceC1552200qUk extends XBaseResultModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "accessKey", required = true)
    String getAccessKey();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "common", nestedClassType = InterfaceC1552150qUf.class, required = true)
    InterfaceC1552150qUf getCommon();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "custom", required = false)
    Map<String, Object> getCustom();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "req_meta", required = false)
    Map<String, Object> getReqMeta();

    @InterfaceC1549470qQL(isGetter = false, keyPath = "accessKey", required = true)
    void setAccessKey(String str);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "common", nestedClassType = InterfaceC1552150qUf.class, required = true)
    void setCommon(InterfaceC1552150qUf interfaceC1552150qUf);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "custom", required = false)
    void setCustom(Map<String, ? extends Object> map);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "req_meta", required = false)
    void setReqMeta(Map<String, ? extends Object> map);
}
