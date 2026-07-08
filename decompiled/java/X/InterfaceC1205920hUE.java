package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;

/* JADX INFO: renamed from: X.0hUE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
@C040E
public interface InterfaceC1205920hUE extends XBaseResultModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "administrativeArea", required = false)
    String getAdministrativeArea();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "city", required = false)
    String getCity();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "country", required = false)
    String getCountry();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "county", required = false)
    String getCounty();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "district", required = false)
    String getDistrict();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "latitude", required = true)
    Number getLatitude();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "longitude", required = true)
    Number getLongitude();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "subAdministrativeArea", required = false)
    String getSubAdministrativeArea();

    @InterfaceC1549470qQL(isGetter = false, keyPath = "administrativeArea", required = false)
    void setAdministrativeArea(String str);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "city", required = false)
    void setCity(String str);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "country", required = false)
    void setCountry(String str);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "county", required = false)
    void setCounty(String str);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "district", required = false)
    void setDistrict(String str);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "latitude", required = true)
    void setLatitude(Number number);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "longitude", required = true)
    void setLongitude(Number number);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "subAdministrativeArea", required = false)
    void setSubAdministrativeArea(String str);
}
