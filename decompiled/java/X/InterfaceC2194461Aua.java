package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;

/* JADX INFO: renamed from: X.1Aua, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public interface InterfaceC2194461Aua extends XBaseModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "statusCode", required = false)
    Number getStatusCode();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "statusMsg", required = false)
    String getStatusMsg();

    @InterfaceC1549470qQL(isGetter = false, keyPath = "statusCode", required = false)
    void setStatusCode(Number number);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "statusMsg", required = false)
    void setStatusMsg(String str);
}
