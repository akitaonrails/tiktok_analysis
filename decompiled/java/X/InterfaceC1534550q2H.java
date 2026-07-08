package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import java.util.List;

/* JADX INFO: renamed from: X.0q2H, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public interface InterfaceC1534550q2H extends XBaseModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "css", primitiveClassType = String.class, required = false)
    List<String> getCss();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "customUA", required = false)
    String getCustomUA();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "html", required = false)
    String getHtml();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "img", primitiveClassType = String.class, required = false)
    List<String> getImg();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "js", primitiveClassType = String.class, required = false)
    List<String> getJs();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "universal", primitiveClassType = String.class, required = false)
    List<String> getUniversal();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "webKey", required = false)
    String getWebKey();
}
