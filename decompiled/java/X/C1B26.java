package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;

/* JADX INFO: renamed from: X.1B26, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public interface C1B26 extends XBaseModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "key", required = true)
    String getKey();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "value", required = true)
    String getValue();

    @InterfaceC1549470qQL(isGetter = false, keyPath = "key", required = true)
    void setKey(String str);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "value", required = true)
    void setValue(String str);
}
