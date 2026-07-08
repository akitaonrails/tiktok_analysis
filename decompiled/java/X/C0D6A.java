package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.commercialize.ucp.api.model.CheckoutIntent;
import com.ss.android.ugc.aweme.commercialize.ucp.impl.data.checkout.model.CheckoutSession;
import com.ss.android.ugc.aweme.commercialize.ucp.impl.data.ordersv2.LocalOrderWrapper;
import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0D6A, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0D6A {
    public final C333640D6c LIZ;
    public final C0D6S LIZIZ;
    public final C054G LIZJ;

    public C0D6A(int i) {
        C333640D6c c333640D6c = new C333640D6c();
        C0D6S c0d6s = new C0D6S();
        this.LIZ = c333640D6c;
        this.LIZIZ = c0d6s;
        this.LIZJ = C2296808zG.LIZ(C09A1.LIZLLL(C2296908zH.LIZ(), C0PEM.LIZJ));
    }

    public static Long LIZ(CheckoutIntent checkoutIntent) {
        Map<String, String> map;
        String str;
        String string;
        if (checkoutIntent == null || (map = checkoutIntent.passThrough) == null || (str = map.get("checkout_create_time")) == null || (string = a0.LJLIIIL(str).toString()) == null || string.length() <= 0) {
            return null;
        }
        return C2095008Iq.LJIILIIL(string);
    }

    public static CheckoutIntent LIZIZ(CheckoutIntent checkoutIntent, long j) {
        if (checkoutIntent == null) {
            return null;
        }
        Map<String, String> mapLJ = checkoutIntent.passThrough;
        if (mapLJ == null) {
            mapLJ = C2097608Jq.LJ();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(mapLJ);
        linkedHashMap.put("checkout_create_time", String.valueOf(j));
        return checkoutIntent.copy(checkoutIntent.items, checkoutIntent.source, checkoutIntent.sellerProfileId, linkedHashMap);
    }

    public static CheckoutSession LIZLLL(CheckoutSession checkoutSession, CheckoutIntent checkoutIntent, LocalOrderWrapper localOrderWrapper) {
        CheckoutIntent checkoutIntent2;
        long jLongValue;
        Long l;
        if (localOrderWrapper != null) {
            CheckoutSession checkoutSession2 = localOrderWrapper.checkoutSession;
            if (checkoutSession2 != null && (l = checkoutSession2.lastCreatAtTime) != null) {
                jLongValue = l.longValue();
                return checkoutSession.copy(checkoutSession.ucp, checkoutSession.id, checkoutSession.currency, checkoutSession.buyer, checkoutSession.lineItems, checkoutSession.discounts, checkoutSession.totals, checkoutSession.fulfillment, checkoutSession.expiresAt, checkoutSession.links, checkoutSession.payment, checkoutSession.order, checkoutSession.messages, checkoutSession.status, checkoutSession.continueUrl, checkoutSession._checkoutState, Long.valueOf(jLongValue));
            }
            checkoutIntent2 = localOrderWrapper.checkoutIntent;
        } else {
            checkoutIntent2 = null;
        }
        Long lLIZ = LIZ(checkoutIntent2);
        if (lLIZ == null && (lLIZ = LIZ(checkoutIntent)) == null) {
            Long l2 = checkoutSession.lastCreatAtTime;
            if (l2 != null) {
                jLongValue = l2.longValue();
            } else {
                jLongValue = System.currentTimeMillis();
            }
        } else {
            jLongValue = lLIZ.longValue();
        }
        return checkoutSession.copy(checkoutSession.ucp, checkoutSession.id, checkoutSession.currency, checkoutSession.buyer, checkoutSession.lineItems, checkoutSession.discounts, checkoutSession.totals, checkoutSession.fulfillment, checkoutSession.expiresAt, checkoutSession.links, checkoutSession.payment, checkoutSession.order, checkoutSession.messages, checkoutSession.status, checkoutSession.continueUrl, checkoutSession._checkoutState, Long.valueOf(jLongValue));
    }

    public static void LJI(final String str, final CheckoutIntent checkoutIntent, CheckoutSession checkoutSession) {
        final String strLIZLLL;
        C01GW c01gw = C0D8O.LIZ;
        C0D6L c0d6l = (C0D6L) c01gw.getValue();
        if (c0d6l != null && c0d6l.LIZJ()) {
            if (checkoutSession == null) {
                strLIZLLL = null;
            } else {
                try {
                    strLIZLLL = C051K.LIZLLL(false, false, false, checkoutSession);
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    C0D82.LIZ("OrdersV2Center", "triggerAttributionDebugValidation failed", e);
                    return;
                }
            }
            new Serializable(str, checkoutIntent, strLIZLLL) { // from class: X.0D5w
                public static final C333590D5x Companion = new Object() { // from class: X.0D5x
                };
                public static final long serialVersionUID = 1;
                public final String checkoutCreateOriginData;
                public final CheckoutIntent checkoutIntent;
                public final String checkoutSessionJson;

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof C333580D5w)) {
                        return false;
                    }
                    C333580D5w c333580D5w = (C333580D5w) obj;
                    return Intrinsics.LJFF(this.checkoutCreateOriginData, c333580D5w.checkoutCreateOriginData) && Intrinsics.LJFF(this.checkoutIntent, c333580D5w.checkoutIntent) && Intrinsics.LJFF(this.checkoutSessionJson, c333580D5w.checkoutSessionJson);
                }

                public int hashCode() {
                    int iHashCode = this.checkoutCreateOriginData.hashCode() * 31;
                    CheckoutIntent checkoutIntent2 = this.checkoutIntent;
                    int iHashCode2 = (iHashCode + (checkoutIntent2 == null ? 0 : checkoutIntent2.hashCode())) * 31;
                    String str2 = this.checkoutSessionJson;
                    return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
                }

                public String toString() {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("OpenLoopAttributionDebugRequest(checkoutCreateOriginData=");
                    sbLIZ.append(this.checkoutCreateOriginData);
                    sbLIZ.append(", checkoutIntent=");
                    sbLIZ.append(this.checkoutIntent);
                    sbLIZ.append(", checkoutSessionJson=");
                    sbLIZ.append(this.checkoutSessionJson);
                    sbLIZ.append(')');
                    return C2188811AlT.LIZIZ(sbLIZ);
                }

                {
                    this.checkoutCreateOriginData = str;
                    this.checkoutIntent = checkoutIntent;
                    this.checkoutSessionJson = strLIZLLL;
                }
            };
            try {
                C0D6L c0d6l2 = (C0D6L) c01gw.getValue();
                if (c0d6l2 != null) {
                    c0d6l2.LJ();
                }
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0167  */
    /* JADX WARN: Type inference failed for: r0v0, types: [T, com.ss.android.ugc.aweme.commercialize.ucp.api.model.CheckoutIntent, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v10, types: [T, com.ss.android.ugc.aweme.commercialize.ucp.impl.data.checkout.model.CheckoutSession] */
    /* JADX WARN: Type inference failed for: r2v12, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v4, types: [T, com.ss.android.ugc.aweme.commercialize.ucp.api.model.CheckoutIntent] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZJ(com.ss.android.ugc.aweme.commercialize.ucp.api.model.CheckoutIntent r35, com.ss.android.ugc.aweme.commercialize.ucp.impl.data.checkout.model.CheckoutSession r36, X.InterfaceC1364105Vn<? super kotlin.Unit> r37) {
        /*
            Method dump skipped, instruction units count: 396
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0D6A.LIZJ(com.ss.android.ugc.aweme.commercialize.ucp.api.model.CheckoutIntent, com.ss.android.ugc.aweme.commercialize.ucp.impl.data.checkout.model.CheckoutSession, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01f6  */
    /* JADX WARN: Type inference failed for: r4v0, types: [T, com.ss.android.ugc.aweme.commercialize.ucp.api.model.CheckoutIntent, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v22 */
    /* JADX WARN: Type inference failed for: r5v13, types: [T, com.ss.android.ugc.aweme.commercialize.ucp.impl.data.checkout.model.CheckoutSession] */
    /* JADX WARN: Type inference failed for: r5v23, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v6, types: [T, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJ(com.ss.android.ugc.aweme.commercialize.ucp.api.model.CheckoutIntent r36, com.ss.android.ugc.aweme.commercialize.ucp.impl.data.checkout.model.CheckoutSession r37, X.InterfaceC1364105Vn<? super X.C189200o6<java.lang.Long>> r38) {
        /*
            Method dump skipped, instruction units count: 533
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0D6A.LJ(com.ss.android.ugc.aweme.commercialize.ucp.api.model.CheckoutIntent, com.ss.android.ugc.aweme.commercialize.ucp.impl.data.checkout.model.CheckoutSession, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:58:0x019a  */
    /* JADX WARN: Type inference failed for: r0v15, types: [T, com.ss.android.ugc.aweme.commercialize.ucp.impl.data.checkout.model.CheckoutSession] */
    /* JADX WARN: Type inference failed for: r12v2, types: [T, com.ss.android.ugc.aweme.commercialize.ucp.impl.data.checkout.model.CheckoutSession] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJFF(com.ss.android.ugc.aweme.commercialize.ucp.api.model.CheckoutIntent r36, com.ss.android.ugc.aweme.commercialize.ucp.impl.data.checkout.model.CheckoutSession r37, X.InterfaceC1364105Vn<? super kotlin.Unit> r38) {
        /*
            Method dump skipped, instruction units count: 428
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0D6A.LJFF(com.ss.android.ugc.aweme.commercialize.ucp.api.model.CheckoutIntent, com.ss.android.ugc.aweme.commercialize.ucp.impl.data.checkout.model.CheckoutSession, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJII(com.ss.android.ugc.aweme.commercialize.ucp.impl.data.checkout.model.CheckoutSession r15, com.ss.android.ugc.aweme.commercialize.ucp.api.model.CheckoutIntent r16, com.ss.android.ugc.aweme.commercialize.ucp.impl.data.ordersv2.OrderState r17, java.lang.Long r18, X.InterfaceC1364105Vn<? super kotlin.Pair<com.ss.android.ugc.aweme.commercialize.ucp.impl.data.checkout.model.CheckoutSession, com.ss.android.ugc.aweme.commercialize.ucp.api.model.CheckoutIntent>> r19) {
        /*
            r14 = this;
            r3 = r19
            boolean r0 = r3 instanceof X.C0D68
            r9 = r14
            if (r0 == 0) goto L6f
            r5 = r3
            X.0D68 r5 = (X.C0D68) r5
            int r2 = r5.LLILZIL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L6f
            int r2 = r2 - r1
            r5.LLILZIL = r2
        L15:
            java.lang.Object r1 = r5.LLILLL
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r5.LLILZIL
            r3 = 1
            if (r0 == 0) goto L33
            if (r0 != r3) goto L75
            X.00zU r12 = r5.LLILLJJLI
            X.00zU r8 = r5.LL
            X.C155000ia.LIZIZ(r1)
        L29:
            T r2 = r8.element
            T r1 = r12.element
            kotlin.Pair r0 = new kotlin.Pair
            r0.<init>(r2, r1)
            return r0
        L33:
            X.C155000ia.LIZIZ(r1)
            X.00zU r8 = new X.00zU
            r8.<init>()
            r10 = r15
            r8.element = r10
            X.00zU r12 = new X.00zU
            r12.<init>()
            r11 = r16
            r12.element = r11
            X.0D6c r2 = r9.LIZ
            java.lang.String r1 = X.C1024180cl6.LIZIZ()
            boolean r0 = kotlin.text.a0.LJJJIL(r1)
            r0 = r0 ^ 1
            if (r0 == 0) goto L57
            if (r1 != 0) goto L59
        L57:
            java.lang.String r1 = ""
        L59:
            X.0D6C r6 = new X.0D6C
            r7 = r18
            r13 = r17
            r6.<init>(r7, r8, r9, r10, r11, r12, r13)
            r5.LL = r8
            r5.LLILLJJLI = r12
            r5.LLILZIL = r3
            java.lang.Object r0 = r2.LJI(r1, r6, r5)
            if (r0 != r4) goto L29
            return r4
        L6f:
            X.0D68 r5 = new X.0D68
            r5.<init>(r9, r3)
            goto L15
        L75:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0D6A.LJII(com.ss.android.ugc.aweme.commercialize.ucp.impl.data.checkout.model.CheckoutSession, com.ss.android.ugc.aweme.commercialize.ucp.api.model.CheckoutIntent, com.ss.android.ugc.aweme.commercialize.ucp.impl.data.ordersv2.OrderState, java.lang.Long, X.05Vn):java.lang.Object");
    }
}
