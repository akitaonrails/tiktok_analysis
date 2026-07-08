package X;

import android.app.Activity;
import com.bytedance.bpea.cert.token.TokenCert;
import com.bytedance.i18n.location.api.Address;
import com.bytedance.i18n.location.api.AreaModel;
import com.bytedance.i18n.location.api.LocationData;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;

/* JADX INFO: renamed from: X.0hU8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1205860hU8 extends AbstractC1205890hUB {
    public static void LIZJ(final CompletionBlock completionBlock) {
        C1207450hWh c1207450hWh = C1207450hWh.LIZ;
        TokenCert.Companion companion = TokenCert.Companion;
        TokenCert tokenCertWith = companion.with("bpea-ttop_service_plugin_location_with_geo_reverse");
        tokenCertWith.auth("sgix");
        TokenCert tokenCertWith2 = companion.with("bpea-ttop_service_plugin_location_decrypt");
        tokenCertWith2.auth("mckd");
        c1207450hWh.LJIIL("ttop_business_growth", "ticketing", tokenCertWith, tokenCertWith2, new InterfaceC687820QyS() { // from class: X.0hUF
            @Override // X.InterfaceC687820QyS
            public final void LIZ(LocationData locationData) {
                String str;
                String str2;
                String str3;
                String str4;
                AreaModel areaModel;
                AreaModel areaModel2;
                AreaModel areaModel3;
                AreaModel areaModel4;
                AreaModel areaModel5;
                CompletionBlock<InterfaceC1205920hUE> completionBlock2 = completionBlock;
                String str5 = null;
                XBaseModel xBaseModelLIZJ = C1909107dp.LIZJ(InterfaceC1205920hUE.class, null);
                InterfaceC1205920hUE interfaceC1205920hUE = (InterfaceC1205920hUE) xBaseModelLIZJ;
                interfaceC1205920hUE.setLongitude(Double.valueOf(locationData.longitude));
                interfaceC1205920hUE.setLatitude(Double.valueOf(locationData.latitude));
                Address address = locationData.address;
                if (address != null && (areaModel5 = address.district) != null) {
                    str = areaModel5.name;
                } else {
                    str = null;
                }
                interfaceC1205920hUE.setDistrict(str);
                Address address2 = locationData.address;
                if (address2 != null && (areaModel4 = address2.city) != null) {
                    str2 = areaModel4.name;
                } else {
                    str2 = null;
                }
                interfaceC1205920hUE.setCity(str2);
                Address address3 = locationData.address;
                if (address3 != null && (areaModel3 = address3.adminArea) != null) {
                    str3 = areaModel3.name;
                } else {
                    str3 = null;
                }
                interfaceC1205920hUE.setAdministrativeArea(str3);
                Address address4 = locationData.address;
                if (address4 != null && (areaModel2 = address4.adminArea) != null) {
                    str4 = areaModel2.name;
                } else {
                    str4 = null;
                }
                interfaceC1205920hUE.setSubAdministrativeArea(str4);
                Address address5 = locationData.address;
                if (address5 != null && (areaModel = address5.country) != null) {
                    str5 = areaModel.name;
                }
                interfaceC1205920hUE.setCountry(str5);
                completionBlock2.onSuccess((XBaseResultModel) xBaseModelLIZJ, "");
            }

            @Override // X.InterfaceC687820QyS
            public final void onError(int i, String str) {
                C2382909Vj.LIZ(completionBlock, 0, "TtopGetLocationMethodIDL - LocationService.fetchLocation fail", null, 4);
            }
        }, -1L);
    }

    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, final CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        Activity activityLIZLLL;
        C1207450hWh c1207450hWh = C1207450hWh.LIZ;
        C844470XAv.LIZ.getClass();
        if (c1207450hWh.LJII(1, C844470XAv.LIZ())) {
            LIZJ(completionBlock);
            return;
        }
        InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
        if (interfaceC634840OvC != null) {
            activityLIZLLL = interfaceC634840OvC.LIZLLL();
        } else {
            activityLIZLLL = null;
        }
        boolean zLJI = c1207450hWh.LJI("ttop_business_growth", "ticketing");
        if (activityLIZLLL != null && zLJI) {
            c1207450hWh.LJIJJ("ttop_business_growth", "ticketing", TokenCert.Companion.with("bpea-ttop_service_plugin_location_request"), activityLIZLLL, null, new InterfaceC1207030hW1() { // from class: X.0hU9
                @Override // X.InterfaceC1207030hW1
                public final void LIZ() {
                    C1205860hU8 c1205860hU8 = this;
                    CompletionBlock<InterfaceC1205920hUE> completionBlock2 = completionBlock;
                    c1205860hU8.getClass();
                    C1205860hU8.LIZJ(completionBlock2);
                }

                @Override // X.InterfaceC1207030hW1
                public final void LIZJ(int i) {
                    C2382909Vj.LIZ(completionBlock, 0, "TtopGetLocationMethodIDL - request permission deny", null, 4);
                }

                @Override // X.InterfaceC1207030hW1
                public final void LIZIZ(int i, String str) {
                    C2382909Vj.LIZ(completionBlock, 0, "TtopGetLocationMethodIDL - request permission cancel", null, 4);
                }
            }, null);
        } else {
            C2382909Vj.LIZ(completionBlock, 0, "TtopGetLocationMethodIDL - no allow request", null, 4);
        }
    }
}
