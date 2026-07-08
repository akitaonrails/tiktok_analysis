package X;

import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.starter.IPdpStarter;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0vqP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1757830vqP {
    /* JADX WARN: Removed duplicated region for block: B:37:0x0092  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String LIZ(com.ss.android.ugc.aweme.ecommerce.base.pdp.starter.IPdpStarter.PdpEnterParam r13) {
        /*
            X.054G r0 = X.C1758140vqu.LIZ
            r7 = 0
            if (r13 == 0) goto L39
            java.lang.String r4 = r13.getProductId()
            java.lang.Integer r3 = r13.pageExpressionType
        Lb:
            boolean r0 = LIZLLL(r13)
            if (r0 == 0) goto L89
            if (r13 == 0) goto L89
            java.util.List<java.lang.String> r0 = r13.checkedSkuIds
            if (r0 == 0) goto L92
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r2 = r0.iterator()
        L20:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L3c
            java.lang.Object r1 = r2.next()
            r0 = r1
            java.lang.String r0 = (java.lang.String) r0
            boolean r0 = kotlin.text.a0.LJJJIL(r0)
            r0 = r0 ^ 1
            if (r0 == 0) goto L20
            r5.add(r1)
            goto L20
        L39:
            r4 = r7
            r3 = r7
            goto Lb
        L3c:
            java.util.List r5 = X.C13LP.LJLLJ(r5)
            if (r5 == 0) goto L92
            java.lang.String r6 = "-"
            r9 = 0
            r12 = 62
            r8 = r7
            r10 = r7
            r11 = r7
            java.lang.String r5 = X.C13LP.LJJLIIIJ(r5, r6, r7, r8, r9, r10, r11, r12)
            if (r5 == 0) goto L92
            boolean r0 = kotlin.text.a0.LJJJIL(r5)
            r0 = r0 ^ 1
            if (r0 == 0) goto L92
        L58:
            java.util.Map r1 = LIZIZ(r13)
            if (r1 == 0) goto L8e
            java.lang.String r0 = "auction_id"
            java.lang.Object r0 = r1.get(r0)
            if (r0 == 0) goto L8e
            java.lang.String r2 = r0.toString()
            if (r2 == 0) goto L8e
            boolean r0 = kotlin.text.a0.LJJJIL(r2)
            r0 = r0 ^ 1
            if (r0 == 0) goto L8e
            if (r5 == 0) goto L89
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            r1.append(r5)
            r0 = 95
            r1.append(r0)
            r1.append(r2)
            java.lang.String r7 = X.C2188811AlT.LIZIZ(r1)
        L89:
            java.lang.String r0 = X.C1758140vqu.LIZ(r3, r4, r7)
            return r0
        L8e:
            if (r5 == 0) goto L89
            r7 = r5
            goto L89
        L92:
            r5 = r7
            goto L58
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1757830vqP.LIZ(com.ss.android.ugc.aweme.ecommerce.base.pdp.starter.IPdpStarter$PdpEnterParam):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.Map LIZIZ(com.ss.android.ugc.aweme.ecommerce.base.pdp.starter.IPdpStarter.PdpEnterParam r5) {
        /*
            r3 = 0
            if (r5 == 0) goto L2e
            java.util.Map<java.lang.String, java.lang.Object> r1 = r5.requestParams
            if (r1 == 0) goto L2e
            java.lang.String r0 = "schema_custom_fields"
            java.lang.Object r1 = r1.get(r0)
        Ld:
            boolean r0 = r1 instanceof java.util.Map
            if (r0 == 0) goto L2c
            java.util.Map r1 = (java.util.Map) r1
        L13:
            if (r1 == 0) goto L2a
            java.lang.String r0 = "live_auction_info"
            java.lang.Object r5 = r1.get(r0)
        L1b:
            boolean r0 = r5 instanceof java.util.Map
            if (r0 == 0) goto L23
            r3 = r5
            java.util.Map r3 = (java.util.Map) r3
        L22:
            return r3
        L23:
            boolean r0 = r5 instanceof java.lang.String
            if (r0 == 0) goto L22
            java.lang.String r5 = (java.lang.String) r5
            goto L30
        L2a:
            r5 = r3
            goto L1b
        L2c:
            r1 = r3
            goto L13
        L2e:
            r1 = r3
            goto Ld
        L30:
            com.google.gson.Gson r4 = X.C1741890vQh.LJFF()     // Catch: com.google.gson.s -> L82
            X.04Zw r0 = X.C1120604Zw.LIZ     // Catch: com.google.gson.s -> L82
            r0.getClass()     // Catch: com.google.gson.s -> L82
            X.04a9 r0 = X.C1120604Zw.LIZIZ()     // Catch: com.google.gson.s -> L82
            if (r0 == 0) goto L45
            boolean r1 = r0.LJII     // Catch: com.google.gson.s -> L82
            r0 = 1
            if (r1 != r0) goto L45
            goto L46
        L45:
            r0 = 0
        L46:
            if (r0 == 0) goto L49
            goto L53
        L49:
            X.0vqQ r0 = new X.0vqQ     // Catch: com.google.gson.s -> L82
            r0.<init>()     // Catch: com.google.gson.s -> L82
            java.lang.reflect.Type r0 = r0.getType()     // Catch: com.google.gson.s -> L82
            goto L76
        L53:
            java.lang.Class<java.util.HashMap> r2 = java.util.HashMap.class
            X.13JX r1 = kotlin.reflect.KTypeProjection.LIZJ     // Catch: com.google.gson.s -> L82
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            X.13JW r0 = X.C13LE.LJII(r0)     // Catch: com.google.gson.s -> L82
            r1.getClass()     // Catch: com.google.gson.s -> L82
            kotlin.reflect.KTypeProjection r1 = X.C13JX.LIZ(r0)     // Catch: com.google.gson.s -> L82
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            X.13JW r0 = X.C13LE.LJII(r0)     // Catch: com.google.gson.s -> L82
            kotlin.reflect.KTypeProjection r0 = X.C13JX.LIZ(r0)     // Catch: com.google.gson.s -> L82
            X.13JW r0 = X.C13LE.LJIIIZ(r2, r1, r0)     // Catch: com.google.gson.s -> L82
            java.lang.reflect.Type r0 = X.C2371409Qy.LIZJ(r0)     // Catch: com.google.gson.s -> L82
        L76:
            java.lang.Object r1 = com.bytedance.mt.protector.impl.GsonProtectorUtils.fromJson(r4, r5, r0)     // Catch: com.google.gson.s -> L82
            boolean r0 = r1 instanceof java.util.HashMap     // Catch: com.google.gson.s -> L82
            if (r0 != 0) goto L7f
            r1 = r3
        L7f:
            java.util.HashMap r1 = (java.util.HashMap) r1     // Catch: com.google.gson.s -> L82
            return r1
        L82:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1757830vqP.LIZIZ(com.ss.android.ugc.aweme.ecommerce.base.pdp.starter.IPdpStarter$PdpEnterParam):java.util.Map");
    }

    public static ProductPackStruct LIZJ(IPdpStarter.PdpEnterParam pdpEnterParam) {
        String strLIZ = LIZ(pdpEnterParam);
        if (strLIZ == null) {
            return null;
        }
        C054G c054g = C1758140vqu.LIZ;
        return C1758140vqu.LIZLLL(strLIZ);
    }

    public static boolean LIZLLL(IPdpStarter.PdpEnterParam pdpEnterParam) {
        if (pdpEnterParam == null) {
            return false;
        }
        if (!Intrinsics.LJFF(pdpEnterParam.pdpPreParam.get("live_anchor"), "true") && LIZIZ(pdpEnterParam) == null) {
            return false;
        }
        return true;
    }
}
