package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;

/* JADX INFO: renamed from: X.0g35, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
@C040E
public interface InterfaceC1150650g35 extends XBaseResultModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "enigmaCustomError", required = false)
    Object getEnigmaCustomError();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "magicGiftResult", nestedClassType = InterfaceC1150640g34.class, required = false)
    InterfaceC1150640g34 getMagicGiftResult();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "statusCode", required = true)
    Number getStatusCode();

    @InterfaceC1549470qQL(isGetter = false, keyPath = "enigmaCustomError", required = false)
    void setEnigmaCustomError(Object obj);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "magicGiftResult", nestedClassType = InterfaceC1150640g34.class, required = false)
    void setMagicGiftResult(InterfaceC1150640g34 interfaceC1150640g34);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "statusCode", required = true)
    void setStatusCode(Number number);
}
