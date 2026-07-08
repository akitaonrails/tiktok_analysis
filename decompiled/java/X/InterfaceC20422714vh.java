package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import java.util.List;

/* JADX INFO: renamed from: X.14vh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public interface InterfaceC20422714vh extends XBaseModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "contentImagePath", required = false)
    String getContentImagePath();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "descList", primitiveClassType = String.class, required = false)
    List<String> getDescList();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "url", required = false)
    String getUrl();

    @InterfaceC1549470qQL(isGetter = false, keyPath = "contentImagePath", required = false)
    void setContentImagePath(String str);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "descList", primitiveClassType = String.class, required = false)
    void setDescList(List<String> list);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "url", required = false)
    void setUrl(String str);
}
