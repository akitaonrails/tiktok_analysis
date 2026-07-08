package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;

/* JADX INFO: renamed from: X.0Nmc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C040E
public interface InterfaceC604040Nmc extends XBaseResultModel {
    @InterfaceC1909207dq(option = {0, 1})
    @InterfaceC1549470qQL(isEnum = true, isGetter = true, keyPath = "containerType", required = true)
    Number getContainerType();

    @InterfaceC1909207dq(option = {0, 1})
    @InterfaceC1549470qQL(isEnum = true, isGetter = false, keyPath = "containerType", required = true)
    void setContainerType(Number number);
}
