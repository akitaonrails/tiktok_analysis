package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;

/* JADX INFO: renamed from: X.1508, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
@C040D
public interface AnonymousClass1508 extends XBaseParamModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "formattedAddress", required = true)
    String getFormattedAddress();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "latitude", required = true)
    Number getLatitude();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "longitude", required = true)
    Number getLongitude();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "maptype", required = true)
    String getMaptype();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "poiName", required = true)
    String getPoiName();
}
