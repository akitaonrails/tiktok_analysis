package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0dtp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
@C040D
public interface InterfaceC1068030dtp extends XBaseParamModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "autofillField", required = false)
    String getAutofillField();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "autofillFields", primitiveClassType = String.class, required = false)
    List<String> getAutofillFields();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "autofillInfo", required = false)
    Map<String, Object> getAutofillInfo();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "contactInfo", required = false)
    Map<String, Object> getContactInfo();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "contactInfoFields", primitiveClassType = String.class, required = false)
    List<String> getContactInfoFields();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "extraInfo", required = false)
    String getExtraInfo();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "firstPage", required = false)
    Number getFirstPage();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "infoType", required = false)
    Number getInfoType();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "paymentInfo", required = false)
    Map<String, Object> getPaymentInfo();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "popupJsbStartTime", required = false)
    Number getPopupJsbStartTime();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "popupType", required = true)
    Number getPopupType();
}
