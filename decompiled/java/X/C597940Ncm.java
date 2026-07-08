package X;

import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import kotlin.jvm.internal.AFwS195S0000000_9;

/* JADX INFO: renamed from: X.0Ncm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C597940Ncm {
    public static final /* synthetic */ C597940Ncm LIZ = new C597940Ncm();
    public static final C01GW<Gson> LIZIZ = C452501pT.LIZIZ(AFwS195S0000000_9.get$arr$(209));
    public static final InterfaceC2661011f LIZJ = ((IRetrofitFactory) ServiceManager.get().getService(IRetrofitFactory.class)).createBuilder("https://oec-api.tiktokv.com").build();

    /* JADX WARN: Removed duplicated region for block: B:9:0x0012 A[PHI: r1
      0x0012: PHI (r1v8 java.lang.Number) = (r1v2 java.lang.Number), (r1v9 java.lang.Number) binds: [B:32:0x006d, B:8:0x0010] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String LIZ(java.util.Map r4) {
        /*
            r3 = 0
            if (r4 != 0) goto L4
            return r3
        L4:
            java.lang.String r0 = "status_code"
            java.lang.Object r1 = r4.get(r0)
            boolean r0 = r1 instanceof java.lang.Number
            if (r0 == 0) goto L61
            java.lang.Number r1 = (java.lang.Number) r1
            if (r1 == 0) goto L61
        L12:
            int r0 = r1.intValue()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
        L1a:
            java.lang.String r0 = "success"
            java.lang.Object r1 = r4.get(r0)
            boolean r0 = r1 instanceof java.lang.Boolean
            if (r0 == 0) goto L5f
            java.lang.Boolean r1 = (java.lang.Boolean) r1
        L26:
            if (r2 == 0) goto L56
            int r0 = r2.intValue()
            if (r0 != 0) goto L5e
        L2e:
            java.lang.String r0 = "data"
            java.lang.Object r1 = r4.get(r0)
            boolean r0 = r1 instanceof java.util.Map
            if (r0 == 0) goto L45
            X.01GW<com.google.gson.Gson> r0 = X.C597940Ncm.LIZIZ
            java.lang.Object r0 = r0.getValue()
            com.google.gson.Gson r0 = (com.google.gson.Gson) r0
            java.lang.String r3 = com.bytedance.mt.protector.impl.GsonProtectorUtils.toJson(r0, r1)
        L44:
            return r3
        L45:
            boolean r0 = r1 instanceof java.util.List
            if (r0 == 0) goto L44
            X.01GW<com.google.gson.Gson> r0 = X.C597940Ncm.LIZIZ
            java.lang.Object r0 = r0.getValue()
            com.google.gson.Gson r0 = (com.google.gson.Gson) r0
            java.lang.String r3 = com.bytedance.mt.protector.impl.GsonProtectorUtils.toJson(r0, r1)
            return r3
        L56:
            if (r1 == 0) goto L2e
            boolean r0 = r1.booleanValue()
            if (r0 != 0) goto L2e
        L5e:
            return r3
        L5f:
            r1 = r3
            goto L26
        L61:
            java.lang.String r0 = "code"
            java.lang.Object r1 = r4.get(r0)
            boolean r0 = r1 instanceof java.lang.Number
            if (r0 == 0) goto L70
            java.lang.Number r1 = (java.lang.Number) r1
            if (r1 == 0) goto L70
            goto L12
        L70:
            r2 = r3
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C597940Ncm.LIZ(java.util.Map):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(int r8, java.lang.String r9, java.lang.String r10, java.util.Map r11, X.InterfaceC1364105Vn r12) {
        /*
            r7 = this;
            boolean r0 = r12 instanceof X.C597950Ncn
            if (r0 == 0) goto L20
            r5 = r12
            X.0Ncn r5 = (X.C597950Ncn) r5
            int r2 = r5.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L20
            int r2 = r2 - r1
            r5.LLILLL = r2
        L12:
            java.lang.Object r1 = r5.LL
            java.lang.Object r6 = X.C099R.LJFF()
            int r0 = r5.LLILLL
            r4 = 1
            if (r0 == 0) goto L2e
            if (r0 != r4) goto L26
            goto L79
        L20:
            X.0Ncn r5 = new X.0Ncn
            r5.<init>(r7, r12)
            goto L12
        L26:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L2e:
            X.C155000ia.LIZIZ(r1)
            java.lang.String r0 = "/aweme/v1/oec/bag/creator/assemble"
            java.lang.String r1 = X.C598410NdX.LJ(r9, r0)     // Catch: java.lang.Exception -> L83
            java.lang.String r0 = "/"
            java.lang.String r3 = kotlin.text.a0.LJJJJZ(r0, r1)     // Catch: java.lang.Exception -> L83
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap     // Catch: java.lang.Exception -> L83
            r2.<init>()     // Catch: java.lang.Exception -> L83
            java.lang.String r0 = "room_id"
            r2.put(r0, r9)     // Catch: java.lang.Exception -> L83
            java.lang.String r0 = "author_id"
            r2.put(r0, r10)     // Catch: java.lang.Exception -> L83
            java.lang.String r1 = "assemble_req_scene"
            java.lang.String r0 = java.lang.String.valueOf(r8)     // Catch: java.lang.Exception -> L83
            r2.put(r1, r0)     // Catch: java.lang.Exception -> L83
            java.lang.String r1 = "request_from"
            java.lang.String r0 = "creator"
            r2.put(r1, r0)     // Catch: java.lang.Exception -> L83
            java.lang.String r1 = "use_new_req_param"
            java.lang.String r0 = "true"
            r2.put(r1, r0)     // Catch: java.lang.Exception -> L83
            r2.putAll(r11)     // Catch: java.lang.Exception -> L83
            X.011f r1 = X.C597940Ncm.LIZJ     // Catch: java.lang.Exception -> L83
            java.lang.Class<com.ss.android.ugc.aweme.influencer.ecommercelive.common.creator.api.InfluencerBagAssembleApi> r0 = com.ss.android.ugc.aweme.influencer.ecommercelive.common.creator.api.InfluencerBagAssembleApi.class
            java.lang.Object r0 = r1.create(r0)     // Catch: java.lang.Exception -> L83
            com.ss.android.ugc.aweme.influencer.ecommercelive.common.creator.api.InfluencerBagAssembleApi r0 = (com.ss.android.ugc.aweme.influencer.ecommercelive.common.creator.api.InfluencerBagAssembleApi) r0     // Catch: java.lang.Exception -> L83
            r5.LLILLL = r4     // Catch: java.lang.Exception -> L83
            java.lang.Object r1 = r0.getAssemble(r3, r2, r5)     // Catch: java.lang.Exception -> L83
            if (r1 != r6) goto L7c
            return r6
        L79:
            X.C155000ia.LIZIZ(r1)     // Catch: java.lang.Exception -> L83
        L7c:
            java.util.Map r1 = (java.util.Map) r1     // Catch: java.lang.Exception -> L83
            java.lang.String r0 = LIZ(r1)     // Catch: java.lang.Exception -> L83
            return r0
        L83:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C597940Ncm.LIZIZ(int, java.lang.String, java.lang.String, java.util.Map, X.05Vn):java.lang.Object");
    }
}
