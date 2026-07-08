package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;

/* JADX INFO: renamed from: X.0px7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
@C040E
public interface InterfaceC1531350px7 extends XBaseResultModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "mode", required = false)
    String getMode();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "result", required = false)
    Object getResult();

    @InterfaceC1909207dq(option = {0, 1, 2})
    @InterfaceC1549470qQL(isEnum = true, isGetter = true, keyPath = "state", required = true)
    Number getState();

    @InterfaceC1549470qQL(isGetter = false, keyPath = "mode", required = false)
    void setMode(String str);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "result", required = false)
    void setResult(Object obj);

    @InterfaceC1909207dq(option = {0, 1, 2})
    @InterfaceC1549470qQL(isEnum = true, isGetter = false, keyPath = "state", required = true)
    void setState(Number number);
}
