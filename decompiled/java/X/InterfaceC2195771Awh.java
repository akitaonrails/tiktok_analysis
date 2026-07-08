package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;

/* JADX INFO: renamed from: X.1Awh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
@C040E
public interface InterfaceC2195771Awh extends XBaseResultModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "data", nestedClassType = InterfaceC2195891Awt.class, required = false)
    InterfaceC2195891Awt getData();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "error_code", required = false)
    Number getErrorCode();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "error_msg", required = false)
    String getErrorMsg();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "sub_error_code", required = false)
    Number getSubErrorCode();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "is_success", required = true)
    Boolean isSuccess();

    @InterfaceC1549470qQL(isGetter = false, keyPath = "data", nestedClassType = InterfaceC2195891Awt.class, required = false)
    void setData(InterfaceC2195891Awt interfaceC2195891Awt);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "error_code", required = false)
    void setErrorCode(Number number);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "error_msg", required = false)
    void setErrorMsg(String str);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "sub_error_code", required = false)
    void setSubErrorCode(Number number);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "is_success", required = true)
    void setSuccess(Boolean bool);
}
