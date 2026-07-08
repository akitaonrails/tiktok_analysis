package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;

/* JADX INFO: renamed from: X.0yxe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
@C040D
public interface InterfaceC1877640yxe extends XBaseParamModel {
    @InterfaceC1909207dq(option = {3})
    @InterfaceC1549470qQL(isEnum = true, isGetter = true, keyPath = "enterType", required = true)
    Number getEnterType();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "logInfo", required = false)
    Object getLogInfo();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "user", required = true)
    String getUser();
}
