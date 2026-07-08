package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;

/* JADX INFO: renamed from: X.0vak, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public interface InterfaceC1748120vak extends XBaseModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "code", required = false)
    String getCode();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "districtKey", required = false)
    String getDistrictKey();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "geonameID", required = false)
    String getGeonameID();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "name", required = false)
    String getName();

    @InterfaceC1549470qQL(isGetter = false, keyPath = "code", required = false)
    void setCode(String str);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "districtKey", required = false)
    void setDistrictKey(String str);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "geonameID", required = false)
    void setGeonameID(String str);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "name", required = false)
    void setName(String str);
}
