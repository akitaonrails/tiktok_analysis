package X;

import com.ss.android.ugc.aweme.commercialize.ucp.api.model.CheckoutIntent;
import com.ss.android.ugc.aweme.commercialize.ucp.api.model.CheckoutStoredUserAddress;
import com.ss.android.ugc.aweme.commercialize.ucp.impl.data.checkout.model.CheckoutOrder;
import com.ss.android.ugc.aweme.commercialize.ucp.impl.data.checkout.model.CheckoutSession;
import com.ss.android.ugc.aweme.commercialize.ucp.impl.data.checkout.network.ACPCheckoutData;
import com.ss.android.ugc.aweme.commercialize.ucp.impl.data.checkout.network.ACPCheckoutRequest;
import com.ss.android.ugc.aweme.commercialize.ucp.impl.data.checkout.network.ACPCheckoutRequestBody;
import com.ss.android.ugc.aweme.commercialize.ucp.impl.data.checkout.network.ACPCheckoutResponse;
import com.ss.android.ugc.aweme.commercialize.ucp.impl.data.checkout.network.ACPCheckoutSessionExtra;
import com.ss.android.ugc.aweme.commercialize.ucp.impl.data.checkout.network.ACPCheckoutSessionPayload;
import com.ss.android.ugc.aweme.commercialize.ucp.impl.data.checkout.network.ACPOrderDetails;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS190S0000000_4;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0D79, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0D79 implements C0D7Q {
    public final C0D7H LIZ = C0D7H.LJFF;
    public final Map<String, Long> LIZIZ = new LinkedHashMap();
    public final Map<String, String> LIZJ = new LinkedHashMap();
    public final C01GW LIZLLL = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(4415));

    public static Map LJI() {
        return C2097608Jq.LJIIIIZZ(new Pair("Accept", "application/json"), new Pair("Content-Type", "application/json"));
    }

    @Override // X.C0D7Q
    public final void LIZ(C0D5B c0d5b, C0D5B c0d5b2) {
    }

    public final C0D7J LJIIIIZZ(C0D7D c0d7d, ACPCheckoutRequestBody aCPCheckoutRequestBody, ACPCheckoutResponse aCPCheckoutResponse) {
        String str;
        String str2;
        ACPCheckoutRequest aCPCheckoutRequest;
        CheckoutOrder checkoutOrder;
        String str3;
        String string = null;
        if (!aCPCheckoutResponse.isSuccess()) {
            EnumC334020D7o enumC334020D7o = EnumC334020D7o.UNKNOWN;
            Integer statusCode = aCPCheckoutResponse.getStatusCode();
            if (statusCode != null) {
                string = statusCode.toString();
            }
            String message = aCPCheckoutResponse.getMessage();
            if (message == null || !(!a0.LJJJIL(message))) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(c0d7d.name());
                sbLIZ.append(" failed");
                message = C2188811AlT.LIZIZ(sbLIZ);
            }
            return new C0D7K(new C0D77(enumC334020D7o, null, string, message, null, null));
        }
        ACPCheckoutData aCPCheckoutData = aCPCheckoutResponse.data;
        if (aCPCheckoutData == null) {
            EnumC334020D7o enumC334020D7o2 = EnumC334020D7o.DECODING;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(c0d7d.name());
            sbLIZ2.append(" failed: data is null");
            return new C0D7K(new C0D77(enumC334020D7o2, null, null, C2188811AlT.LIZIZ(sbLIZ2), null, null));
        }
        ACPCheckoutSessionPayload aCPCheckoutSessionPayload = aCPCheckoutData.checkoutSession;
        if (aCPCheckoutSessionPayload == null) {
            EnumC334020D7o enumC334020D7o3 = EnumC334020D7o.DECODING;
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append(c0d7d.name());
            sbLIZ3.append(" failed: checkout_session is null");
            return new C0D7K(new C0D77(enumC334020D7o3, null, null, C2188811AlT.LIZIZ(sbLIZ3), null, null));
        }
        if (c0d7d == C0D7D.COMPLETE_CHECKOUT && ((checkoutOrder = aCPCheckoutSessionPayload.order) == null || (str3 = checkoutOrder.id) == null || a0.LJJJIL(str3))) {
            EnumC334020D7o enumC334020D7o4 = EnumC334020D7o.DECODING;
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append(c0d7d.name());
            sbLIZ4.append(" failed: order.id is missing");
            return new C0D7K(new C0D77(enumC334020D7o4, null, null, C2188811AlT.LIZIZ(sbLIZ4), null, null));
        }
        ACPOrderDetails aCPOrderDetails = (ACPOrderDetails) C051K.LIZIZ(aCPCheckoutRequestBody.orderDetails, ACPOrderDetails.class);
        if (aCPOrderDetails != null && (aCPCheckoutRequest = aCPOrderDetails.checkoutRequest) != null) {
            str = aCPCheckoutRequest.checkoutId;
        } else {
            str = null;
        }
        String str4 = "";
        if (str == null) {
            str = "";
        }
        String str5 = aCPCheckoutSessionPayload.checkoutId;
        if (str5 == null) {
            str5 = "";
        }
        if (!a0.LJJJIL(str5)) {
            str = str5;
        }
        if (!a0.LJJJIL(str)) {
            Long l = aCPCheckoutData.tiktokOrderId;
            long jLongValue = 0;
            if (l != null && l.longValue() > 0) {
                Map<String, Long> map = this.LIZIZ;
                Long l2 = aCPCheckoutData.tiktokOrderId;
                if (l2 != null) {
                    jLongValue = l2.longValue();
                }
                map.put(str, Long.valueOf(jLongValue));
            }
        }
        ACPCheckoutSessionExtra aCPCheckoutSessionExtra = aCPCheckoutData.sessionExtra;
        if (aCPCheckoutSessionExtra != null && (str2 = aCPCheckoutSessionExtra.jwtToken) != null && (!a0.LJJJIL(str2))) {
            string = str2;
        }
        if ((true ^ a0.LJJJIL(str)) && string != null) {
            this.LIZJ.put(str, string);
        }
        c0d7d.name();
        aCPCheckoutResponse.getStatusCode();
        String str6 = aCPCheckoutSessionPayload.checkoutId;
        if (str6 == null) {
            str6 = "";
        }
        a0.LJJJIL(str6);
        Long l3 = aCPCheckoutData.tiktokOrderId;
        if (l3 != null) {
            l3.longValue();
        }
        String str7 = aCPCheckoutSessionPayload.continueUrl;
        if (str7 != null) {
            str4 = str7;
        }
        a0.LJJJIL(str4);
        return new C0D7L(aCPCheckoutResponse);
    }

    @Override // X.C0D7Q
    public final Object LIZIZ(C0D5B c0d5b, CheckoutIntent checkoutIntent, CheckoutStoredUserAddress checkoutStoredUserAddress, InterfaceC1364105Vn<? super C0D7J> interfaceC1364105Vn) {
        return C23250099c.LJI(interfaceC1364105Vn, C0PEM.LIZJ, new C0D7B(this, LJII(c0d5b, checkoutIntent, LJ(c0d5b, "", c0d5b.LIZJ, 0L, checkoutIntent, checkoutStoredUserAddress, null, null, null, null, null, null, null), null, null), C0D7D.CREATE_CHECKOUT, null));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x029f A[PHI: r5
      0x029f: PHI (r5v3 java.lang.Object) = (r5v5 java.lang.Object), (r5v4 java.lang.Object) binds: [B:160:0x029a, B:162:0x029d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0083  */
    /* JADX WARN: Type inference failed for: r24v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v24 */
    /* JADX WARN: Type inference failed for: r2v37 */
    /* JADX WARN: Type inference failed for: r2v43 */
    /* JADX WARN: Type inference failed for: r2v44 */
    /* JADX WARN: Type inference failed for: r2v45 */
    /* JADX WARN: Type inference failed for: r2v46 */
    /* JADX WARN: Type inference failed for: r2v47 */
    /* JADX WARN: Type inference failed for: r2v48 */
    /* JADX WARN: Type inference failed for: r2v49 */
    /* JADX WARN: Type inference failed for: r2v50 */
    /* JADX WARN: Type inference failed for: r2v51 */
    /* JADX WARN: Type inference failed for: r2v52 */
    /* JADX WARN: Type inference failed for: r2v53 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.ss.android.ugc.aweme.commercialize.ucp.impl.data.checkout.network.ACPCheckoutRequestBody LJII(X.C0D5B r25, com.ss.android.ugc.aweme.commercialize.ucp.api.model.CheckoutIntent r26, com.ss.android.ugc.aweme.commercialize.ucp.impl.data.checkout.network.ACPCheckoutRequest r27, com.ss.android.ugc.aweme.commercialize.ucp.impl.data.checkout.model.CheckoutSession r28, java.lang.String r29) {
        /*
            Method dump skipped, instruction units count: 810
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0D79.LJII(X.0D5B, com.ss.android.ugc.aweme.commercialize.ucp.api.model.CheckoutIntent, com.ss.android.ugc.aweme.commercialize.ucp.impl.data.checkout.network.ACPCheckoutRequest, com.ss.android.ugc.aweme.commercialize.ucp.impl.data.checkout.model.CheckoutSession, java.lang.String):com.ss.android.ugc.aweme.commercialize.ucp.impl.data.checkout.network.ACPCheckoutRequestBody");
    }

    @Override // X.C0D7Q
    public final Object LIZLLL(C0D5B c0d5b, String str, CheckoutIntent checkoutIntent, CheckoutStoredUserAddress checkoutStoredUserAddress, CheckoutSession checkoutSession, InterfaceC1364105Vn<? super C0D7J> interfaceC1364105Vn) {
        boolean z;
        String str2;
        Long lLJIILIIL;
        Long lValueOf = Long.valueOf(C0D7V.LIZIZ(checkoutSession));
        long jLongValue = 0;
        if (lValueOf.longValue() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z && (lValueOf = (Long) ((LinkedHashMap) this.LIZIZ).get(str)) == null) {
            Map<String, String> map = checkoutIntent.passThrough;
            if (map != null && (str2 = map.get("order_id")) != null && (lLJIILIIL = C2095008Iq.LJIILIIL(str2)) != null) {
                jLongValue = lLJIILIIL.longValue();
            }
        } else {
            jLongValue = lValueOf.longValue();
        }
        String str3 = c0d5b.LIZJ;
        String strLIZ = C0D7V.LIZ(checkoutSession);
        if (strLIZ == null) {
            strLIZ = (String) ((LinkedHashMap) this.LIZJ).get(str);
        }
        return C23250099c.LJI(interfaceC1364105Vn, C0PEM.LIZJ, new C0D7C(this, LJII(c0d5b, checkoutIntent, LJ(c0d5b, str, str3, jLongValue, checkoutIntent, checkoutStoredUserAddress, checkoutSession, null, null, null, null, strLIZ, null), checkoutSession, null), C0D7D.UPDATE_CHECKOUT, null));
    }

    @Override // X.C0D7Q
    public final Object LIZJ(C0D5B c0d5b, String str, CheckoutIntent checkoutIntent, CheckoutStoredUserAddress checkoutStoredUserAddress, CheckoutSession checkoutSession, String str2, String str3, C0D7I c0d7i, String str4, String str5, InterfaceC1364105Vn<? super C0D7J> interfaceC1364105Vn) {
        String str6;
        Long lLJIILIIL;
        String str7 = c0d5b.LIZJ;
        Long lValueOf = Long.valueOf(C0D7V.LIZIZ(checkoutSession));
        long jLongValue = 0;
        if (lValueOf.longValue() <= 0 && (lValueOf = (Long) ((LinkedHashMap) this.LIZIZ).get(str)) == null) {
            Map<String, String> map = checkoutIntent.passThrough;
            if (map != null && (str6 = map.get("order_id")) != null && (lLJIILIIL = C2095008Iq.LJIILIIL(str6)) != null) {
                jLongValue = lLJIILIIL.longValue();
            }
        } else {
            jLongValue = lValueOf.longValue();
        }
        String strLIZ = C0D7V.LIZ(checkoutSession);
        if (strLIZ == null) {
            strLIZ = (String) ((LinkedHashMap) this.LIZJ).get(str);
        }
        return C23250099c.LJI(interfaceC1364105Vn, C0PEM.LIZJ, new C0D7A(this, LJII(c0d5b, checkoutIntent, LJ(c0d5b, str, str7, jLongValue, checkoutIntent, checkoutStoredUserAddress, checkoutSession, str3, c0d7i, str4, str5, strLIZ, str), checkoutSession, str3), C0D7D.COMPLETE_CHECKOUT, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x00dc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.ss.android.ugc.aweme.commercialize.ucp.impl.data.checkout.network.ACPCheckoutRequest LJ(X.C0D5B r33, java.lang.String r34, java.lang.String r35, long r36, com.ss.android.ugc.aweme.commercialize.ucp.api.model.CheckoutIntent r38, com.ss.android.ugc.aweme.commercialize.ucp.api.model.CheckoutStoredUserAddress r39, com.ss.android.ugc.aweme.commercialize.ucp.impl.data.checkout.model.CheckoutSession r40, java.lang.String r41, X.C0D7I r42, java.lang.String r43, java.lang.String r44, java.lang.String r45, java.lang.String r46) {
        /*
            Method dump skipped, instruction units count: 792
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0D79.LJ(X.0D5B, java.lang.String, java.lang.String, long, com.ss.android.ugc.aweme.commercialize.ucp.api.model.CheckoutIntent, com.ss.android.ugc.aweme.commercialize.ucp.api.model.CheckoutStoredUserAddress, com.ss.android.ugc.aweme.commercialize.ucp.impl.data.checkout.model.CheckoutSession, java.lang.String, X.0D7I, java.lang.String, java.lang.String, java.lang.String, java.lang.String):com.ss.android.ugc.aweme.commercialize.ucp.impl.data.checkout.network.ACPCheckoutRequest");
    }
}
