package X;

import com.bytedance.goda.v2.model.vo.GodaV2RequestParams;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.api.interceptor.GecNetInterceptor;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.api.PdpApi;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.starter.IPdpStarter;
import com.ss.android.ugc.aweme.ecommerce.network.IECRetrofitFactory;
import com.ss.android.ugc.aweme.ecommerce.resource.EcomApiLifecycleManager;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0vrb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1758570vrb {
    public static final /* synthetic */ C1758570vrb LIZ = new C1758570vrb();
    public static final C01K1 LIZIZ;

    static {
        InterfaceC859903Xp interfaceC859903XpCreateBuilder = ((IECRetrofitFactory) ServiceManager.get().getService(IECRetrofitFactory.class)).createBuilder("https://oec-api.tiktokv.com/");
        interfaceC859903XpCreateBuilder.LIZ(new GecNetInterceptor());
        LIZIZ = interfaceC859903XpCreateBuilder.build();
    }

    public static String LIZJ(Map map) {
        Object objLJJJLL;
        List list;
        EcomApiLifecycleManager.LIZ.getClass();
        if (!EcomApiLifecycleManager.LJFF) {
            return null;
        }
        Object obj = ((LinkedHashMap) map).get("product_id");
        if ((obj instanceof List) && (list = (List) obj) != null) {
            objLJJJLL = C13LP.LJJJLL(list);
        } else {
            objLJJJLL = null;
        }
        if (!(objLJJJLL instanceof String)) {
            return null;
        }
        return (String) objLJJJLL;
    }

    public static String LJI(Map map) {
        Object obj = ((LinkedHashMap) map).get("template");
        if (obj instanceof String) {
            return (String) obj;
        }
        return null;
    }

    public static void LJIILJJIL(Map map) {
        map.put("click_time_millis", Long.valueOf(System.currentTimeMillis()));
        map.put("request_time_millis", Long.valueOf(System.currentTimeMillis()));
        ((PdpApi) LIZIZ.create(PdpApi.class)).LIZ(map).LJL(C11S5.LIZ()).LJJZZI(new C09JN() { // from class: X.0vrl
            @Override // X.C09JN
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
                C1C7U.LIZ("PdpApi$Companion@3fbe.reportEnterPdp$1");
                C1C7U.LIZIZ("PdpApi$Companion@3fbe.reportEnterPdp$1");
            }
        }, new C09JN() { // from class: X.0vrm
            @Override // X.C09JN
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
                C1C7U.LIZ("PdpApi$Companion@3fbe.reportEnterPdp$2");
                C1C7U.LIZIZ("PdpApi$Companion@3fbe.reportEnterPdp$2");
            }
        }, new InterfaceC781210Ukh() { // from class: X.0vrs
            @Override // X.InterfaceC781210Ukh
            public final void run() {
            }
        }, new C09JN() { // from class: X.0vrn
            @Override // X.C09JN
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
                C1C7U.LIZ("PdpApi$Companion@3fbe.reportEnterPdp$4");
                C1C7U.LIZIZ("PdpApi$Companion@3fbe.reportEnterPdp$4");
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.CheckPopUpRequest r7, X.InterfaceC1364105Vn<? super com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.CheckPopUpResponse> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof X.C1758630vrh
            if (r0 == 0) goto L20
            r5 = r8
            X.0vrh r5 = (X.C1758630vrh) r5
            int r2 = r5.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L20
            int r2 = r2 - r1
            r5.LLILLL = r2
        L12:
            java.lang.Object r4 = r5.LL
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r5.LLILLL
            r2 = 1
            if (r0 == 0) goto L2e
            if (r0 != r2) goto L26
            goto L44
        L20:
            X.0vrh r5 = new X.0vrh
            r5.<init>(r6, r8)
            goto L12
        L26:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L2e:
            X.C155000ia.LIZIZ(r4)
            X.01K1 r1 = X.C1758570vrb.LIZIZ     // Catch: java.lang.Exception -> L59
            java.lang.Class<com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.api.PdpApi> r0 = com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.api.PdpApi.class
            java.lang.Object r0 = r1.create(r0)     // Catch: java.lang.Exception -> L59
            com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.api.PdpApi r0 = (com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.api.PdpApi) r0     // Catch: java.lang.Exception -> L59
            r5.LLILLL = r2     // Catch: java.lang.Exception -> L59
            java.lang.Object r4 = r0.LIZJ(r7, r5)     // Catch: java.lang.Exception -> L59
            if (r4 != r3) goto L47
            return r3
        L44:
            X.C155000ia.LIZIZ(r4)     // Catch: java.lang.Exception -> L59
        L47:
            com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.CheckPopUpResponse r4 = (com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.CheckPopUpResponse) r4     // Catch: java.lang.Exception -> L59
            if (r4 != 0) goto L6c
            java.lang.String r2 = ""
            com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.CheckPopUpResponse r4 = new com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.CheckPopUpResponse     // Catch: java.lang.Exception -> L59
            r1 = 0
            r0 = -1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Exception -> L59
            r4.<init>(r0, r2, r1)     // Catch: java.lang.Exception -> L59
            return r4
        L59:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            java.lang.String r2 = r0.toString()
            com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.CheckPopUpResponse r4 = new com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.CheckPopUpResponse
            r1 = 0
            r0 = -1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r4.<init>(r0, r2, r1)
        L6c:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1758570vrb.LIZ(com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.CheckPopUpRequest, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BundleDealRequest r7, X.InterfaceC1364105Vn<? super com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BundleInfoResponse> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof X.C1758640vri
            if (r0 == 0) goto L20
            r5 = r8
            X.0vri r5 = (X.C1758640vri) r5
            int r2 = r5.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L20
            int r2 = r2 - r1
            r5.LLILLL = r2
        L12:
            java.lang.Object r4 = r5.LL
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r5.LLILLL
            r2 = 1
            if (r0 == 0) goto L2e
            if (r0 != r2) goto L26
            goto L44
        L20:
            X.0vri r5 = new X.0vri
            r5.<init>(r6, r8)
            goto L12
        L26:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L2e:
            X.C155000ia.LIZIZ(r4)
            X.01K1 r1 = X.C1758570vrb.LIZIZ     // Catch: java.lang.Exception -> L4a
            java.lang.Class<com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.api.PdpApi> r0 = com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.api.PdpApi.class
            java.lang.Object r0 = r1.create(r0)     // Catch: java.lang.Exception -> L4a
            com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.api.PdpApi r0 = (com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.api.PdpApi) r0     // Catch: java.lang.Exception -> L4a
            r5.LLILLL = r2     // Catch: java.lang.Exception -> L4a
            java.lang.Object r4 = r0.LIZLLL(r7, r5)     // Catch: java.lang.Exception -> L4a
            if (r4 != r3) goto L47
            return r3
        L44:
            X.C155000ia.LIZIZ(r4)     // Catch: java.lang.Exception -> L4a
        L47:
            com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BundleInfoResponse r4 = (com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BundleInfoResponse) r4     // Catch: java.lang.Exception -> L4a
            return r4
        L4a:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            java.lang.String r2 = r0.toString()
            com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BundleInfoResponse r4 = new com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BundleInfoResponse
            r1 = 0
            r0 = -1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r4.<init>(r0, r2, r1)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1758570vrb.LIZIZ(com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BundleDealRequest, X.05Vn):java.lang.Object");
    }

    public final C11NZ<C1758520vrW> LJFF(IPdpStarter.PdpEnterParam pdpEnterParam, GodaV2RequestParams godaV2RequestParams) {
        String string;
        PdpApi pdpApi = (PdpApi) LIZIZ.create(PdpApi.class);
        C1054204Ai c1054204Ai = C1054204Ai.LIZ;
        Map<String, Object> map = pdpEnterParam.requestParams;
        c1054204Ai.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        Object objRemove = linkedHashMap.remove("product_id");
        if ((objRemove instanceof List) && objRemove != null) {
            linkedHashMap.put("product_ids", objRemove);
        }
        if (godaV2RequestParams != null) {
            linkedHashMap.put("goda_v2_params", godaV2RequestParams);
        }
        Integer num = pdpEnterParam.bizType;
        if (num != null) {
            string = num.toString();
        } else {
            string = null;
        }
        getClass();
        return pdpApi.getSDUIPdpBatchV2(linkedHashMap, LJIIIIZZ(string, null, null));
    }

    public static HashMap LJIIIIZZ(String str, String str2, String str3) {
        HashMap map = new HashMap();
        if (str == null) {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        map.put("biz_type", str);
        if (str2 != null) {
            map.put("partial_scenario", str2);
        }
        if (str3 != null && (!a0.LJJJIL(str3))) {
            map.put("pdp_product_id", str3);
        }
        return map;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJ(int r20, java.util.List<java.lang.String> r21, X.InterfaceC1364105Vn<? super X.C1758730vrr> r22) {
        /*
            r19 = this;
            r3 = r22
            boolean r0 = r3 instanceof X.C1758650vrj
            if (r0 == 0) goto L22
            r4 = r3
            X.0vrj r4 = (X.C1758650vrj) r4
            int r2 = r4.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L22
            int r2 = r2 - r1
            r4.LLILLL = r2
        L14:
            java.lang.Object r1 = r4.LL
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r4.LLILLL
            r2 = 1
            if (r0 == 0) goto L32
            if (r0 != r2) goto L2a
            goto L6f
        L22:
            X.0vrj r4 = new X.0vrj
            r0 = r19
            r4.<init>(r0, r3)
            goto L14
        L2a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L32:
            X.C155000ia.LIZIZ(r1)
            r7 = r21
            boolean r0 = r7.isEmpty()
            if (r0 == 0) goto L45
            X.0vrr r1 = new X.0vrr
            java.lang.String r0 = "product_id is empty."
            r1.<init>(r0)
            return r1
        L45:
            X.01K1 r1 = X.C1758570vrb.LIZIZ     // Catch: java.lang.Exception -> L75
            java.lang.Class<com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.api.PdpApi> r0 = com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.api.PdpApi.class
            java.lang.Object r0 = r1.create(r0)     // Catch: java.lang.Exception -> L75
            com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.api.PdpApi r0 = (com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.api.PdpApi) r0     // Catch: java.lang.Exception -> L75
            com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PromotionInfoRequest r5 = new com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PromotionInfoRequest     // Catch: java.lang.Exception -> L75
            java.lang.Integer r6 = X.C2286608xc.LJ(r20)     // Catch: java.lang.Exception -> L75
            r8 = 0
            r9 = r8
            r10 = r8
            r11 = r8
            r12 = r8
            r13 = r8
            r14 = r8
            r15 = r8
            r16 = r8
            r17 = r8
            r18 = r8
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)     // Catch: java.lang.Exception -> L75
            r4.LLILLL = r2     // Catch: java.lang.Exception -> L75
            java.lang.Object r1 = r0.LIZIZ(r5, r4)     // Catch: java.lang.Exception -> L75
            if (r1 != r3) goto L72
            return r3
        L6f:
            X.C155000ia.LIZIZ(r1)     // Catch: java.lang.Exception -> L75
        L72:
            X.0vrr r1 = (X.C1758730vrr) r1     // Catch: java.lang.Exception -> L75
            return r1
        L75:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            java.lang.String r0 = r0.toString()
            X.0vrr r1 = new X.0vrr
            r1.<init>(r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1758570vrb.LJ(int, java.util.List, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIIJ(java.util.Map<java.lang.String, ? extends java.lang.Object> r10, java.lang.Integer r11, X.InterfaceC1364105Vn<? super com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct> r12) {
        /*
            r9 = this;
            r0 = 138001(0x21b11, float:1.9338E-40)
            boolean r8 = com.bytedance.pumbaa.utility.method_id.MethodIDManager.LJI(r0)
            boolean r0 = r12 instanceof X.C1758610vrf
            if (r0 == 0) goto L34
            r6 = r12
            X.0vrf r6 = (X.C1758610vrf) r6
            int r2 = r6.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L34
            int r2 = r2 - r1
            r6.LLILLL = r2
        L19:
            java.lang.Object r3 = r6.LL
            java.lang.Object r7 = X.C099R.LJFF()
            int r0 = r6.LLILLL
            r5 = 1
            r2 = 0
            if (r0 == 0) goto L3a
            if (r0 == r5) goto L72
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            if (r8 == 0) goto L33
            com.bytedance.pumbaa.utility.method_id.MethodIDManager.LJ()
        L33:
            throw r1
        L34:
            X.0vrf r6 = new X.0vrf
            r6.<init>(r9, r12)
            goto L19
        L3a:
            X.C155000ia.LIZIZ(r3)
            java.lang.String r4 = LJI(r10)     // Catch: java.lang.Exception -> L9f
            X.01K1 r1 = X.C1758570vrb.LIZIZ     // Catch: java.lang.Exception -> L9f
            java.lang.Class<com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.api.PdpApi> r0 = com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.api.PdpApi.class
            java.lang.Object r3 = r1.create(r0)     // Catch: java.lang.Exception -> L9f
            com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.api.PdpApi r3 = (com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.api.PdpApi) r3     // Catch: java.lang.Exception -> L9f
            X.04Ai r0 = X.C1054204Ai.LIZ     // Catch: java.lang.Exception -> L9f
            r0.getClass()     // Catch: java.lang.Exception -> L9f
            java.util.Map r1 = X.C1054204Ai.LIZ(r10, r2)     // Catch: java.lang.Exception -> L9f
            if (r11 == 0) goto L6a
            java.lang.String r0 = r11.toString()     // Catch: java.lang.Exception -> L9f
        L5a:
            r9.getClass()     // Catch: java.lang.Exception -> L9f
            java.util.HashMap r0 = LJIIIIZZ(r0, r4, r2)     // Catch: java.lang.Exception -> L9f
            r6.LLILLL = r5     // Catch: java.lang.Exception -> L9f
            java.lang.Object r3 = r3.refreshPdpSDUI(r1, r0, r6)     // Catch: java.lang.Exception -> L9f
            if (r3 != r7) goto L75
            goto L6c
        L6a:
            r0 = r2
            goto L5a
        L6c:
            if (r8 == 0) goto L71
            com.bytedance.pumbaa.utility.method_id.MethodIDManager.LJ()
        L71:
            return r7
        L72:
            X.C155000ia.LIZIZ(r3)     // Catch: java.lang.Exception -> L9f
        L75:
            X.0vro r3 = (X.C1758700vro) r3     // Catch: java.lang.Exception -> L9f
            X.04Ai r1 = X.C1054204Ai.LIZ     // Catch: java.lang.Exception -> L9f
            T r0 = r3.data     // Catch: java.lang.Exception -> L9f
            com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PDPResponseData r0 = (com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PDPResponseData) r0     // Catch: java.lang.Exception -> L9f
            if (r0 == 0) goto L96
            com.bytedance.goda.model.dto.GodaProtocol r0 = r0.godaProtocol     // Catch: java.lang.Exception -> L9f
        L81:
            r1.getClass()     // Catch: java.lang.Exception -> L9f
            com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductInfoPackData r0 = X.C1054204Ai.LJFF(r0)     // Catch: java.lang.Exception -> L9f
            if (r0 == 0) goto L98
            java.util.List<com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct> r1 = r0.productionInfoPack     // Catch: java.lang.Exception -> L9f
            if (r1 == 0) goto L98
            r0 = 0
            java.lang.Object r0 = X.C13LP.LJJJLZIJ(r0, r1)     // Catch: java.lang.Exception -> L9f
            com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct r0 = (com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct) r0     // Catch: java.lang.Exception -> L9f
            goto L99
        L96:
            r0 = r2
            goto L81
        L98:
            r0 = r2
        L99:
            if (r8 == 0) goto L9e
            com.bytedance.pumbaa.utility.method_id.MethodIDManager.LJ()     // Catch: java.lang.Exception -> L9f
        L9e:
            return r0
        L9f:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            if (r8 == 0) goto La8
            com.bytedance.pumbaa.utility.method_id.MethodIDManager.LJ()
        La8:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1758570vrb.LJIIJ(java.util.Map, java.lang.Integer, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIIL(java.util.Map<java.lang.String, ? extends java.lang.Object> r8, java.lang.Integer r9, X.InterfaceC1364105Vn<? super X.C1758700vro> r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof X.C1758620vrg
            if (r0 == 0) goto L20
            r6 = r10
            X.0vrg r6 = (X.C1758620vrg) r6
            int r2 = r6.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L20
            int r2 = r2 - r1
            r6.LLILLL = r2
        L12:
            java.lang.Object r5 = r6.LL
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r6.LLILLL
            r3 = 1
            if (r0 == 0) goto L2e
            if (r0 != r3) goto L26
            goto L55
        L20:
            X.0vrg r6 = new X.0vrg
            r6.<init>(r7, r10)
            goto L12
        L26:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L2e:
            X.C155000ia.LIZIZ(r5)
            X.01K1 r1 = X.C1758570vrb.LIZIZ     // Catch: java.lang.Exception -> L5b
            java.lang.Class<com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.api.PdpApi> r0 = com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.api.PdpApi.class
            java.lang.Object r2 = r1.create(r0)     // Catch: java.lang.Exception -> L5b
            com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.api.PdpApi r2 = (com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.api.PdpApi) r2     // Catch: java.lang.Exception -> L5b
            r1 = 0
            if (r9 == 0) goto L52
            java.lang.String r0 = r9.toString()     // Catch: java.lang.Exception -> L5b
        L42:
            r7.getClass()     // Catch: java.lang.Exception -> L5b
            java.util.HashMap r0 = LJIIIIZZ(r0, r1, r1)     // Catch: java.lang.Exception -> L5b
            r6.LLILLL = r3     // Catch: java.lang.Exception -> L5b
            java.lang.Object r5 = r2.refreshSDUIPdpInfo(r8, r0, r6)     // Catch: java.lang.Exception -> L5b
            if (r5 != r4) goto L58
            goto L54
        L52:
            r0 = r1
            goto L42
        L54:
            return r4
        L55:
            X.C155000ia.LIZIZ(r5)     // Catch: java.lang.Exception -> L5b
        L58:
            X.0vro r5 = (X.C1758700vro) r5     // Catch: java.lang.Exception -> L5b
            return r5
        L5b:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            java.lang.String r2 = r0.toString()
            X.0vro r5 = new X.0vro
            r1 = -1
            r0 = 8
            r5.<init>(r1, r2, r0)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1758570vrb.LJIIL(java.util.Map, java.lang.Integer, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIILIIL(java.util.Map<java.lang.String, ? extends java.lang.Object> r8, java.lang.Integer r9, X.InterfaceC1364105Vn<? super X.C1758700vro> r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof X.C1758590vrd
            if (r0 == 0) goto L25
            r5 = r10
            X.0vrd r5 = (X.C1758590vrd) r5
            int r2 = r5.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L25
            int r2 = r2 - r1
            r5.LLILZ = r2
        L12:
            java.lang.Object r1 = r5.LLILLJJLI
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r5.LLILZ
            r6 = 0
            r3 = 1
            if (r0 == 0) goto L33
            if (r0 != r3) goto L2b
            java.lang.Object r8 = r5.LL
            java.util.Map r8 = (java.util.Map) r8
            goto L5c
        L25:
            X.0vrd r5 = new X.0vrd
            r5.<init>(r7, r10)
            goto L12
        L2b:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L33:
            X.C155000ia.LIZIZ(r1)
            X.01K1 r1 = X.C1758570vrb.LIZIZ     // Catch: java.lang.Exception -> Lb0
            java.lang.Class<com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.api.PdpApi> r0 = com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.api.PdpApi.class
            java.lang.Object r2 = r1.create(r0)     // Catch: java.lang.Exception -> Lb0
            com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.api.PdpApi r2 = (com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.api.PdpApi) r2     // Catch: java.lang.Exception -> Lb0
            if (r9 == 0) goto L59
            java.lang.String r1 = r9.toString()     // Catch: java.lang.Exception -> Lb0
        L46:
            r0 = 0
            r7.getClass()     // Catch: java.lang.Exception -> Lb0
            java.util.HashMap r0 = LJIIIIZZ(r1, r0, r0)     // Catch: java.lang.Exception -> Lb0
            r5.LL = r8     // Catch: java.lang.Exception -> Lb0
            r5.LLILZ = r3     // Catch: java.lang.Exception -> Lb0
            java.lang.Object r1 = r2.refreshSDUIV2PdpInfo(r8, r0, r5)     // Catch: java.lang.Exception -> Lb0
            if (r1 != r4) goto L5f
            goto L5b
        L59:
            r1 = r6
            goto L46
        L5b:
            return r4
        L5c:
            X.C155000ia.LIZIZ(r1)     // Catch: java.lang.Exception -> Lb0
        L5f:
            X.0X52 r1 = (X.C0X52) r1     // Catch: java.lang.Exception -> Lb0
            T r5 = r1.LIZIZ     // Catch: java.lang.Exception -> Lb0
            X.0vro r5 = (X.C1758700vro) r5     // Catch: java.lang.Exception -> Lb0
            X.08fh r0 = r1.LIZ     // Catch: java.lang.Exception -> Lb0
            java.util.List<X.080U> r0 = r0.LIZLLL     // Catch: java.lang.Exception -> Lb0
            java.util.Iterator r3 = r0.iterator()     // Catch: java.lang.Exception -> Lb0
        L6d:
            boolean r0 = r3.hasNext()     // Catch: java.lang.Exception -> Lb0
            if (r0 == 0) goto Lac
            java.lang.Object r2 = r3.next()     // Catch: java.lang.Exception -> Lb0
            r0 = r2
            X.080U r0 = (X.C080U) r0     // Catch: java.lang.Exception -> Lb0
            java.lang.String r1 = r0.LIZ     // Catch: java.lang.Exception -> Lb0
            java.lang.String r0 = "x-tt-logid"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)     // Catch: java.lang.Exception -> Lb0
            if (r0 == 0) goto L6d
        L84:
            X.080U r2 = (X.C080U) r2     // Catch: java.lang.Exception -> Lb0
            if (r2 == 0) goto Laa
            java.lang.String r4 = r2.LIZIZ     // Catch: java.lang.Exception -> Lb0
        L8a:
            T r0 = r5.data     // Catch: java.lang.Exception -> Lb0
            com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PDPResponseData r0 = (com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PDPResponseData) r0     // Catch: java.lang.Exception -> Lb0
            if (r0 == 0) goto Laf
            com.bytedance.goda.v2.model.dto.GodaV2Protocol<com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductInfoPackData> r3 = r0.godaV2Protocol     // Catch: java.lang.Exception -> Lb0
            if (r3 == 0) goto Laf
            X.04EU r2 = new X.04EU     // Catch: java.lang.Exception -> Lb0
            java.lang.String r0 = "selected_sku_id"
            java.lang.Object r1 = r8.get(r0)     // Catch: java.lang.Exception -> Lb0
            boolean r0 = r1 instanceof java.lang.String     // Catch: java.lang.Exception -> Lb0
            if (r0 == 0) goto La8
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Exception -> Lb0
        La2:
            r2.<init>(r4, r1)     // Catch: java.lang.Exception -> Lb0
            r3.localExtra = r2     // Catch: java.lang.Exception -> Lb0
            goto Lae
        La8:
            r1 = r6
            goto La2
        Laa:
            r4 = r6
            goto L8a
        Lac:
            r2 = r6
            goto L84
        Lae:
            return r5
        Laf:
            return r5
        Lb0:
            r2 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r2)
            X.03xw r1 = X.EnumC1014603xw.ERR_GODA_30002
            r0 = 0
            X.C1019103yf.LIZ(r1, r2, r0)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1758570vrb.LJIILIIL(java.util.Map, java.lang.Integer, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIIJJI(java.util.Map<java.lang.String, ? extends java.lang.Object> r10, java.lang.Integer r11, com.bytedance.goda.v2.model.vo.GodaV2RequestParams r12, X.InterfaceC1364105Vn<? super com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct> r13) {
        /*
            Method dump skipped, instruction units count: 253
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1758570vrb.LJIIJJI(java.util.Map, java.lang.Integer, com.bytedance.goda.v2.model.vo.GodaV2RequestParams, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZLLL(java.lang.String r24, java.lang.String r25, java.lang.String r26, java.lang.String r27, java.lang.Integer r28, java.util.List<java.lang.Integer> r29, java.util.Map<java.lang.String, ? extends java.lang.Object> r30, java.lang.String r31, X.InterfaceC1364105Vn<? super com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PdpRecommendPreloadResponse> r32) {
        /*
            Method dump skipped, instruction units count: 204
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1758570vrb.LIZLLL(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.util.List, java.util.Map, java.lang.String, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJII(java.lang.String r28, java.lang.String r29, java.lang.String r30, java.lang.String r31, java.lang.String r32, java.lang.String r33, int r34, java.util.List<java.lang.Integer> r35, java.lang.String r36, boolean r37, X.InterfaceC1364105Vn<? super com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ShopRecommendResponse> r38) {
        /*
            Method dump skipped, instruction units count: 289
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1758570vrb.LJII(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, java.util.List, java.lang.String, boolean, X.05Vn):java.lang.Object");
    }
}
