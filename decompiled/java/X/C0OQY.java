package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import java.util.List;

/* JADX INFO: renamed from: X.0OQY, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public interface C0OQY extends XBaseModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "height", required = false)
    Number getHeight();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "uri", required = false)
    String getUri();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "url_list", primitiveClassType = String.class, required = false)
    List<String> getUrlList();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "width", required = false)
    Number getWidth();
}
