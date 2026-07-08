package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;

/* JADX INFO: renamed from: X.1AFy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
@C040D
public interface InterfaceC2176481AFy extends XBaseParamModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "certName", required = true)
    String getCertName();

    @InterfaceC1549470qQL(isEnum = true, isGetter = true, keyPath = "permissionType", required = true)
    @InterfaceC1909307dr(option = {"authorize", "convert"})
    String getPermissionType();
}
