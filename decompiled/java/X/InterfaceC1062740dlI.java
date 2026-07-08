package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;

/* JADX INFO: renamed from: X.0dlI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
@C040E
public interface InterfaceC1062740dlI extends XBaseResultModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "language", required = false)
    String getLanguage();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "isTeenagersModel", required = false)
    Number isTeenagersModel();

    @InterfaceC1549470qQL(isGetter = false, keyPath = "language", required = false)
    void setLanguage(String str);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "isTeenagersModel", required = false)
    void setTeenagersModel(Number number);
}
