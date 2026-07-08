package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import java.util.List;

/* JADX INFO: renamed from: X.0yr8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public interface InterfaceC1873600yr8 extends XBaseModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "url_list", primitiveClassType = String.class, required = false)
    List<String> getUrlList();

    @InterfaceC1549470qQL(isGetter = false, keyPath = "url_list", primitiveClassType = String.class, required = false)
    void setUrlList(List<String> list);
}
