package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import java.util.List;

/* JADX INFO: renamed from: X.1AuY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public interface InterfaceC2194441AuY extends XBaseModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "data", nestedClassType = InterfaceC2194471Aub.class, required = false)
    List<InterfaceC2194471Aub> getData();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "statusCode", required = false)
    Number getStatusCode();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "statusMsg", required = false)
    String getStatusMsg();

    @InterfaceC1549470qQL(isGetter = false, keyPath = "data", nestedClassType = InterfaceC2194471Aub.class, required = false)
    void setData(List<? extends InterfaceC2194471Aub> list);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "statusCode", required = false)
    void setStatusCode(Number number);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "statusMsg", required = false)
    void setStatusMsg(String str);
}
