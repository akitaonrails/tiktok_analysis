package X;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.android.live.wallet.api.ILocationPickerService;
import com.bytedance.android.live.wallet.model.LocationAddress;
import com.bytedance.android.live.wallet.model.LocationObject;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;

/* JADX INFO: renamed from: X.1ALF, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C1ALF extends C1ALH {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, final CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        Context context;
        C1ALG c1alg = (C1ALG) xBaseParamModel;
        String defaultLocation = c1alg.getDefaultLocation();
        String region = c1alg.getRegion();
        int iIntValue = c1alg.getLevel().intValue();
        final C1ALE traceData = c1alg.getTraceData();
        if (TextUtils.isEmpty(region)) {
            completionBlock.onFailure(0, "Empty Region", null);
            return;
        }
        InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
        if (interfaceC634840OvC == null || (context = interfaceC634840OvC.getContext()) == null) {
            return;
        }
        ((ILocationPickerService) C1161920gLG.LIZJ(ILocationPickerService.class)).wA(context, region, defaultLocation, iIntValue, new InterfaceC21691419uq() { // from class: X.1ALJ
            @Override // X.InterfaceC21691419uq
            public final void LJIIJ(String str) {
                this.LIZ.getClass();
                XBaseModel xBaseModelLIZ = C1549500qQO.LIZ(C1ALK.class);
                C1ALF c1alf = this.LIZ;
                C1ALK c1alk = (C1ALK) xBaseModelLIZ;
                c1alk.setStatus(2);
                c1alf.getClass();
                c1alk.setLocation((C1ALI) C1549500qQO.LIZ(C1ALI.class));
                completionBlock.onFailure(0, str, c1alk);
            }

            @Override // X.InterfaceC21691419uq
            public final void LIZ(boolean z, LocationAddress locationAddress) {
                int i;
                String str;
                String str2;
                String str3;
                String str4;
                String str5;
                String str6;
                String str7;
                String str8;
                String str9;
                String str10;
                String str11;
                String str12;
                String str13;
                String str14;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("JSB RESULT: ");
                sbLIZ.append(locationAddress);
                C20441214yg.LIZIZ("USLocation", C2188811AlT.LIZIZ(sbLIZ));
                this.LIZ.getClass();
                XBaseModel xBaseModelLIZJ = C1909107dp.LIZJ(C1ALK.class, null);
                C1ALF c1alf = this.LIZ;
                C1ALK c1alk = (C1ALK) xBaseModelLIZJ;
                if (z) {
                    i = 0;
                } else {
                    i = 1;
                }
                c1alk.setStatus(i);
                c1alf.getClass();
                C1ALI c1ali = (C1ALI) C1909107dp.LIZJ(C1ALI.class, null);
                if (z) {
                    C1ALO c1alo = (C1ALO) C1909107dp.LIZJ(C1ALO.class, null);
                    LocationObject locationObject = locationAddress.region;
                    String str15 = "";
                    if (locationObject == null || (str = locationObject.name) == null) {
                        str = "";
                    }
                    c1alo.setName(str);
                    LocationObject locationObject2 = locationAddress.region;
                    if (locationObject2 == null || (str2 = locationObject2.asciName) == null) {
                        str2 = "";
                    }
                    c1alo.setAsciName(str2);
                    c1alo.setCode(locationAddress.LIZ());
                    c1ali.setRegion(c1alo);
                    C1ALP c1alp = (C1ALP) C1909107dp.LIZJ(C1ALP.class, null);
                    LocationObject locationObject3 = locationAddress.state;
                    if (locationObject3 == null || (str3 = locationObject3.name) == null) {
                        str3 = "";
                    }
                    c1alp.setName(str3);
                    LocationObject locationObject4 = locationAddress.state;
                    if (locationObject4 == null || (str4 = locationObject4.asciName) == null) {
                        str4 = "";
                    }
                    c1alp.setAsciName(str4);
                    LocationObject locationObject5 = locationAddress.state;
                    if (locationObject5 == null || (str5 = locationObject5.code) == null) {
                        str5 = "";
                    }
                    c1alp.setCode(str5);
                    c1ali.setState(c1alp);
                    C1ALM c1alm = (C1ALM) C1909107dp.LIZJ(C1ALM.class, null);
                    LocationObject locationObject6 = locationAddress.county;
                    if (locationObject6 == null || (str6 = locationObject6.name) == null) {
                        str6 = "";
                    }
                    c1alm.setName(str6);
                    LocationObject locationObject7 = locationAddress.county;
                    if (locationObject7 == null || (str7 = locationObject7.asciName) == null) {
                        str7 = "";
                    }
                    c1alm.setAsciName(str7);
                    LocationObject locationObject8 = locationAddress.county;
                    if (locationObject8 == null || (str8 = locationObject8.code) == null) {
                        str8 = "";
                    }
                    c1alm.setCode(str8);
                    c1ali.setCounty(c1alm);
                    C1ALL c1all = (C1ALL) C1909107dp.LIZJ(C1ALL.class, null);
                    LocationObject locationObject9 = locationAddress.city;
                    if (locationObject9 == null || (str9 = locationObject9.name) == null) {
                        str9 = "";
                    }
                    c1all.setName(str9);
                    LocationObject locationObject10 = locationAddress.city;
                    if (locationObject10 == null || (str10 = locationObject10.asciName) == null) {
                        str10 = "";
                    }
                    c1all.setAsciName(str10);
                    LocationObject locationObject11 = locationAddress.city;
                    if (locationObject11 == null || (str11 = locationObject11.code) == null) {
                        str11 = "";
                    }
                    c1all.setCode(str11);
                    c1ali.setCity(c1all);
                    C1ALN c1aln = (C1ALN) C1909107dp.LIZJ(C1ALN.class, null);
                    LocationObject locationObject12 = locationAddress.province;
                    if (locationObject12 == null || (str12 = locationObject12.name) == null) {
                        str12 = "";
                    }
                    c1aln.setName(str12);
                    LocationObject locationObject13 = locationAddress.province;
                    if (locationObject13 == null || (str13 = locationObject13.asciName) == null) {
                        str13 = "";
                    }
                    c1aln.setAsciName(str13);
                    LocationObject locationObject14 = locationAddress.province;
                    if (locationObject14 != null && (str14 = locationObject14.code) != null) {
                        str15 = str14;
                    }
                    c1aln.setCode(str15);
                    c1ali.setProvince(c1aln);
                }
                c1alk.setLocation(c1ali);
                completionBlock.onSuccess(c1alk, "");
            }
        }, new InterfaceC21691519ur() { // from class: X.1ALD
            @Override // X.InterfaceC21691519ur
            public final void LJJJJ() {
            }

            @Override // X.InterfaceC21691519ur
            public final void LJJJJI(String str) {
                C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_exchange_billing_address_location_show");
                c474500IjALIZ.LJJII(traceData.getRequestPage(), "request_page");
                c474500IjALIZ.LJJII(traceData.getChargeReason(), "charge_reason");
                c474500IjALIZ.LJJII(str, "page_type");
                c474500IjALIZ.LIZ();
            }
        });
    }
}
