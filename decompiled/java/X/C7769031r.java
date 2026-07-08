package X;

import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Address;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.BillingAddressData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.ElementDTO;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentElement;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.031r, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C7769031r {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final BillingAddressData LIZ(List<PaymentElement> list) {
        BillingAddressData billingAddressData = new BillingAddressData(null, null, null, null, null, null, null);
        if (list != null) {
            for (PaymentElement paymentElement : list) {
                String str = paymentElement.element;
                if (str != null) {
                    switch (str.hashCode()) {
                        case -1675358935:
                            if (str.equals("eg_ccdc_global_billing_address_state")) {
                                billingAddressData = BillingAddressData.LIZ(billingAddressData, null, null, null, null, paymentElement.paramValue, 95);
                            }
                            break;
                        case -437890200:
                            if (str.equals("eg_ccdc_global_billing_address_country_regin")) {
                                billingAddressData = BillingAddressData.LIZ(billingAddressData, null, null, paymentElement.paramValue, null, null, 119);
                            }
                            break;
                        case -396027285:
                            if (str.equals("eg_ccdc_global_billing_address_street")) {
                                billingAddressData = BillingAddressData.LIZ(billingAddressData, paymentElement.paramValue, null, null, null, null, 126);
                            }
                            break;
                        case -304863367:
                            if (str.equals("eg_ccdc_global_billing_address_postal_code")) {
                                billingAddressData = BillingAddressData.LIZ(billingAddressData, null, null, null, paymentElement.paramValue, null, 111);
                            }
                            break;
                        case -193077805:
                            if (str.equals("eg_ccdc_global_billing_address_city")) {
                                billingAddressData = BillingAddressData.LIZ(billingAddressData, null, paymentElement.paramValue, null, null, null, 125);
                            }
                            break;
                    }
                }
            }
        }
        return billingAddressData;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0099 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0038 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.Map LIZJ(com.ss.android.ugc.aweme.ecommerce.base.address.dto.Address r13) {
        /*
            r0 = 846(0x34e, float:1.185E-42)
            kotlin.jvm.internal.AFwS228S0000000_1 r12 = kotlin.jvm.internal.AFwS228S0000000_1.get$arr$(r0)
            r11 = 0
            if (r13 == 0) goto La4
            java.util.List<com.ss.android.ugc.aweme.ecommerce.base.address.dto.Region> r0 = r13.districts
            if (r0 == 0) goto La0
            java.lang.Object r9 = X.C13LP.LJJLIIIJL(r0)
            com.ss.android.ugc.aweme.ecommerce.base.address.dto.Region r9 = (com.ss.android.ugc.aweme.ecommerce.base.address.dto.Region) r9
        L13:
            java.util.List<com.ss.android.ugc.aweme.ecommerce.base.address.dto.Region> r0 = r13.districts
            if (r0 == 0) goto L9d
            java.lang.Object r8 = X.C13LP.LJJJLL(r0)
            com.ss.android.ugc.aweme.ecommerce.base.address.dto.Region r8 = (com.ss.android.ugc.aweme.ecommerce.base.address.dto.Region) r8
        L1d:
            java.util.LinkedHashMap r7 = new java.util.LinkedHashMap
            r7.<init>()
            java.lang.String r6 = "eg_ccdc_global_billing_address_city"
            java.lang.String r5 = "eg_ccdc_global_billing_address_state"
            java.lang.String r4 = "eg_ccdc_global_billing_address_postal_code"
            java.lang.String r3 = "eg_ccdc_global_billing_address_street"
            java.lang.String r2 = "eg_ccdc_global_billing_address_country_regin"
            java.lang.String[] r0 = new java.lang.String[]{r6, r5, r4, r3, r2}
            java.util.List r0 = X.C1697810uHb.LJIIJJI(r0)
            java.util.Iterator r10 = r0.iterator()
        L38:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto La3
            java.lang.Object r1 = r10.next()
            java.lang.String r1 = (java.lang.String) r1
            r12.getClass()
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L38
            int r0 = r1.hashCode()
            switch(r0) {
                case -1675358935: goto L8d;
                case -437890200: goto L7a;
                case -396027285: goto L6f;
                case -304863367: goto L62;
                case -193077805: goto L57;
                default: goto L56;
            }
        L56:
            goto L38
        L57:
            boolean r0 = r1.equals(r6)
            if (r0 == 0) goto L38
            if (r9 == 0) goto L38
            java.lang.String r0 = r9.name
            goto L97
        L62:
            boolean r0 = r1.equals(r4)
            if (r0 == 0) goto L38
            java.lang.String r0 = "zipcode"
            java.lang.String r0 = r13.LJI(r0)
            goto L97
        L6f:
            boolean r0 = r1.equals(r3)
            if (r0 == 0) goto L38
            java.lang.String r0 = r13.LIZJ()
            goto L97
        L7a:
            boolean r0 = r1.equals(r2)
            if (r0 == 0) goto L38
            com.ss.android.ugc.aweme.ecommerce.base.address.dto.Region r0 = r13.region
            if (r0 == 0) goto L8b
            java.lang.String r0 = r0.geoNameId
        L86:
            java.lang.String r0 = X.C749702wJ.LIZ(r0)
            goto L97
        L8b:
            r0 = r11
            goto L86
        L8d:
            boolean r0 = r1.equals(r5)
            if (r0 == 0) goto L38
            if (r8 == 0) goto L38
            java.lang.String r0 = r8.name
        L97:
            if (r0 == 0) goto L38
            r7.put(r1, r0)
            goto L38
        L9d:
            r8 = r11
            goto L1d
        La0:
            r9 = r11
            goto L13
        La3:
            return r7
        La4:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C7769031r.LIZJ(com.ss.android.ugc.aweme.ecommerce.base.address.dto.Address):java.util.Map");
    }

    public static final List<PaymentElement> LIZIZ(Address address, List<ElementDTO> list) {
        String str;
        if (address == null || list == null || list.isEmpty()) {
            return null;
        }
        Map mapLIZJ = LIZJ(address);
        ArrayList arrayList = new ArrayList();
        for (ElementDTO elementDTO : list) {
            PaymentElement paymentElementLIZ = elementDTO.LIZ();
            if (mapLIZJ != null) {
                str = (String) mapLIZJ.get(elementDTO.id);
            } else {
                str = null;
            }
            paymentElementLIZ.setParamValue(str);
            arrayList.add(paymentElementLIZ);
        }
        return arrayList;
    }
}
