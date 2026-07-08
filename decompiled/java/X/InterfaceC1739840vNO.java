package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;

/* JADX INFO: renamed from: X.0vNO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C040E
public interface InterfaceC1739840vNO extends XBaseResultModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "result", required = false)
    Object getResult();

    @InterfaceC1909207dq(option = {0, -1, -2, 1})
    @InterfaceC1549470qQL(isEnum = true, isGetter = true, keyPath = "state", required = false)
    Number getState();

    @InterfaceC1549470qQL(isGetter = false, keyPath = "result", required = false)
    void setResult(Object obj);

    @InterfaceC1909207dq(option = {0, -1, -2, 1})
    @InterfaceC1549470qQL(isEnum = true, isGetter = false, keyPath = "state", required = false)
    void setState(Number number);
}
