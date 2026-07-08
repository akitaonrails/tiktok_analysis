package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;

/* JADX INFO: renamed from: X.0ytq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
@C040D
public interface InterfaceC1875280ytq extends XBaseParamModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "data", required = true)
    String getData();

    @InterfaceC1549470qQL(isEnum = true, isGetter = true, keyPath = "dataType", required = true)
    @InterfaceC1909307dr(option = {"arraybuffer", "base64", "string"})
    String getDataType();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "socketTaskID", required = true)
    String getSocketTaskID();
}
