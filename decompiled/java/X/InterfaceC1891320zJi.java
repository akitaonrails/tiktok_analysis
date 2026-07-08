package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;

/* JADX INFO: renamed from: X.0zJi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
@C040D
public interface InterfaceC1891320zJi extends XBaseParamModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "compressHeight", required = false)
    Number getCompressHeight();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "compressImage", required = false)
    Boolean getCompressImage();

    @InterfaceC1909207dq(option = {1, 2, 3, 4})
    @InterfaceC1549470qQL(isEnum = true, isGetter = true, keyPath = "compressOption", required = false)
    Number getCompressOption();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "compressWidth", required = false)
    Number getCompressWidth();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "needBase64Data", required = false)
    Boolean getNeedBase64Data();
}
