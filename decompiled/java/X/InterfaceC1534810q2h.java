package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;

/* JADX INFO: renamed from: X.0q2h, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public interface InterfaceC1534810q2h extends XBaseModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "msg", required = false)
    String getMsg();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "state", required = false)
    Number getState();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "url", required = false)
    String getUrl();

    @InterfaceC1549470qQL(isGetter = false, keyPath = "msg", required = false)
    void setMsg(String str);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "state", required = false)
    void setState(Number number);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "url", required = false)
    void setUrl(String str);
}
