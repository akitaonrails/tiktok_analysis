package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;

/* JADX INFO: renamed from: X.1ALI, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public interface C1ALI extends XBaseModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "city", nestedClassType = C1ALL.class, required = false)
    C1ALL getCity();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "county", nestedClassType = C1ALM.class, required = false)
    C1ALM getCounty();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "province", nestedClassType = C1ALN.class, required = false)
    C1ALN getProvince();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "region", nestedClassType = C1ALO.class, required = false)
    C1ALO getRegion();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "state", nestedClassType = C1ALP.class, required = false)
    C1ALP getState();

    @InterfaceC1549470qQL(isGetter = false, keyPath = "city", nestedClassType = C1ALL.class, required = false)
    void setCity(C1ALL c1all);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "county", nestedClassType = C1ALM.class, required = false)
    void setCounty(C1ALM c1alm);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "province", nestedClassType = C1ALN.class, required = false)
    void setProvince(C1ALN c1aln);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "region", nestedClassType = C1ALO.class, required = false)
    void setRegion(C1ALO c1alo);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "state", nestedClassType = C1ALP.class, required = false)
    void setState(C1ALP c1alp);
}
