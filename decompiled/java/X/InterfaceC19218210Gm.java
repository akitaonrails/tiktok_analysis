package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;

/* JADX INFO: renamed from: X.10Gm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public interface InterfaceC19218210Gm extends XBaseModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "key", required = true)
    String getKey();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "value", required = true)
    Number getValue();

    @InterfaceC1549470qQL(isGetter = false, keyPath = "key", required = true)
    void setKey(String str);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "value", required = true)
    void setValue(Number number);
}
