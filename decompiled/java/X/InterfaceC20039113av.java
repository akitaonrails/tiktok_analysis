package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import java.util.List;

/* JADX INFO: renamed from: X.13av, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
@C040E
public interface InterfaceC20039113av extends XBaseResultModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "authorID", required = true)
    String getAuthorID();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "itemId", required = true)
    String getItemId();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "productId", primitiveClassType = String.class, required = true)
    List<String> getProductId();

    @InterfaceC1549470qQL(isGetter = false, keyPath = "authorID", required = true)
    void setAuthorID(String str);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "itemId", required = true)
    void setItemId(String str);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "productId", primitiveClassType = String.class, required = true)
    void setProductId(List<String> list);
}
