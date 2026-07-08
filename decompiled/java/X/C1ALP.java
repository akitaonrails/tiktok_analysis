package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;

/* JADX INFO: renamed from: X.1ALP, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public interface C1ALP extends XBaseModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "asciName", required = true)
    String getAsciName();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "code", required = true)
    String getCode();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "name", required = true)
    String getName();

    @InterfaceC1549470qQL(isGetter = false, keyPath = "asciName", required = true)
    void setAsciName(String str);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "code", required = true)
    void setCode(String str);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "name", required = true)
    void setName(String str);
}
