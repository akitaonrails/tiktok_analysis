package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;

/* JADX INFO: renamed from: X.0qMF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public interface InterfaceC1546930qMF extends XBaseModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "channel", required = true)
    String getChannel();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "detail", nestedClassType = InterfaceC1546910qMD.class, required = true)
    InterfaceC1546910qMD getDetail();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "keyset_version", required = true)
    String getKeysetVersion();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "page_keyset_version", required = true)
    String getPageKeysetVersion();
}
