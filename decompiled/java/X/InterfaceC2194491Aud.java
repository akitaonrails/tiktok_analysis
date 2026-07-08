package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;

/* JADX INFO: renamed from: X.1Aud, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public interface InterfaceC2194491Aud extends XBaseModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "clientKey", required = true)
    String getClientKey();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "minisCategory", required = true)
    String getMinisCategory();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "schema", required = true)
    String getSchema();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "techType", required = false)
    Number getTechType();
}
