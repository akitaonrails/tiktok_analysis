package X;

import Y.AfS14S1201000_26;
import Y.AfS47S1200000_26;
import Y.AfS5S0211000_26;
import Y.AkS87S0201000_26;
import android.os.SystemClock;
import com.bytedance.goda.model.dto.GodaProtocol;
import com.bytedance.goda.v2.model.dto.GodaV2Protocol;
import com.bytedance.goda.v2.model.vo.GodaV2RequestParams;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.api.PdpApi;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PDPResponseData;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductInfoPackData;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.starter.IPdpStarter;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0vrB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1758310vrB extends C11SY implements InterfaceC1758450vrP {
    public static final C1758310vrB LIZJ = new C1758310vrB();
    public static long LIZLLL = -1;
    public static final HashMap<String, C1758370vrH> LJ = new HashMap<>();
    public static final HashMap<String, C1758370vrH> LJFF = new HashMap<>();

    /* JADX WARN: Removed duplicated region for block: B:47:0x00bf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String LJJIJL(com.ss.android.ugc.aweme.ecommerce.base.pdp.starter.IPdpStarter.PdpEnterParam r14) {
        /*
            Method dump skipped, instruction units count: 275
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1758310vrB.LJJIJL(com.ss.android.ugc.aweme.ecommerce.base.pdp.starter.IPdpStarter$PdpEnterParam):java.lang.String");
    }

    public static String LJJIJLIJ(IPdpStarter.PdpEnterParam pdpEnterParam) {
        String strLJJIJL = LJJIJL(pdpEnterParam);
        if (strLJJIJL == null) {
            return C1741890vQh.LJIIIIZZ(pdpEnterParam.requestParams);
        }
        String[] strArr = new String[3];
        strArr[0] = C1741890vQh.LJIIIIZZ(pdpEnterParam.requestParams);
        Integer num = pdpEnterParam.pageExpressionType;
        String string = null;
        if (num != null && num.intValue() != 0) {
            string = num.toString();
        }
        strArr[1] = string;
        strArr[2] = strLJJIJL;
        return C13LP.LJJLIIIJ(C13LQ.LJIJI(strArr), "_", null, null, 0, null, null, 62);
    }

    public static final void LJJIL(String str) {
        LJ.remove(str);
        LJFF.remove(str);
    }

    public static int LJJJJJL(Object obj) {
        if (obj instanceof Integer) {
            return ((Number) obj).intValue();
        }
        if (obj instanceof Short) {
            return ((Number) obj).shortValue();
        }
        if (obj instanceof Long) {
            return (int) ((Number) obj).longValue();
        }
        if (obj instanceof Number) {
            return ((Number) obj).intValue();
        }
        return 0;
    }

    public static void LJJJJI(String str, Map map) {
        String str2;
        try {
            boolean zContainsKey = map.containsKey("isPrefetchScene");
            String str3 = CardStruct.IStatusCode.DEFAULT;
            if (!zContainsKey) {
                str2 = CardStruct.IStatusCode.DEFAULT;
            } else {
                str2 = (String) map.get("isPrefetchScene");
            }
            if (map.containsKey("autoSchema")) {
                str3 = (String) map.get("autoSchema");
            }
            if (Intrinsics.LJFF(str2, "1") && !Intrinsics.LJFF(str3, "1")) {
                LJFF.remove(str);
            } else {
                LJ.remove(str);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public static void LJJIJIL(Map map, String str, C1758370vrH c1758370vrH) {
        Object obj;
        if (map.containsKey("isPrefetchScene")) {
            obj = map.get("isPrefetchScene");
        } else {
            obj = CardStruct.IStatusCode.DEFAULT;
        }
        if (Intrinsics.LJFF(obj, "1")) {
            LJFF.put(str, c1758370vrH);
        } else {
            LJ.put(str, c1758370vrH);
        }
    }

    public static C1758370vrH LJJJI(IPdpStarter.PdpEnterParam pdpEnterParam, String str, boolean z) {
        String str2;
        HashMap<String, C1758370vrH> map;
        ProductPackStruct productPackStruct;
        try {
            Map<String, String> map2 = pdpEnterParam.pdpPreParam;
            boolean zContainsKey = map2.containsKey("isPrefetchScene");
            String str3 = CardStruct.IStatusCode.DEFAULT;
            if (!zContainsKey) {
                str2 = CardStruct.IStatusCode.DEFAULT;
            } else {
                str2 = map2.get("isPrefetchScene");
            }
            if (Intrinsics.LJFF(str2, "1")) {
                map = LJFF;
            } else {
                map = LJ;
            }
            C1758370vrH c1758370vrH = map.get(str);
            if (Intrinsics.LJFF(str2, "1")) {
                if (c1758370vrH != null) {
                    if (z) {
                        LJFF.remove(str);
                    }
                    return c1758370vrH;
                }
                if (map2.containsKey("autoSchema")) {
                    str3 = map2.get("autoSchema");
                }
                if (Intrinsics.LJFF(str3, "1")) {
                    C054G c054g = C1758140vqu.LIZ;
                    String strLIZ = C1758140vqu.LIZ(pdpEnterParam.pageExpressionType, pdpEnterParam.getProductId(), LJJIJL(pdpEnterParam));
                    if (strLIZ == null) {
                        strLIZ = pdpEnterParam.getProductId();
                    }
                    Pair pairLIZJ = C1758140vqu.LIZJ(strLIZ);
                    if (pairLIZJ != null) {
                        productPackStruct = (ProductPackStruct) pairLIZJ.getFirst();
                    } else {
                        productPackStruct = null;
                    }
                    return new C1758370vrH(str, 4, new C11NZ<ProductPackStruct>() { // from class: X.0vrF
                        @Override // X.C11NZ
                        public final void LJJZZIII(InterfaceC626120Oh8<? super ProductPackStruct> interfaceC626120Oh8) {
                        }
                    }, productPackStruct);
                }
            } else if (c1758370vrH != null) {
                if (z) {
                    LJ.remove(str);
                }
                return c1758370vrH;
            }
            return null;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public static void LJJJ(int i, Map map, Map map2, boolean z) {
        C04CK c04ck = new C04CK() { // from class: X.048Y
            @Override // X.AbstractC1748790vbp
            public final C1748850vbv LIZ() {
                return new C1748850vbv(new C1748840vbu("start_click_to_now", new C1747940vaS[0]), new C1748840vbu("is_retry", new C1747940vaS[0]), new C1748840vbu("preload_type", new C1747940vaS[0]), new C1748840vbu("api_path", new C1747940vaS[0]), new C1748840vbu("page_name", new C1747940vaS[0]));
            }
        };
        c04ck.LJIIIIZZ(new C856803Wk(map2, z, i));
        c04ck.LIZJ(false);
        C04CK c04ck2 = new C04CK() { // from class: X.0vaP
            @Override // X.AbstractC1748790vbp
            public final C1748850vbv LIZ() {
                return new C1748850vbv(new C1748840vbu("is_v2", new C1747940vaS(new C1748000vaY("", ""))), new C1748840vbu("product_type", new C1747940vaS(new C1748000vaY("", ""))), new C1748840vbu("mall_list_name", new C1747940vaS[0]), new C1748840vbu("api_path", new C1747940vaS(new C1748000vaY("", ""))), new C1748840vbu("entrance_info", new C1747940vaS[0]), new C1748840vbu("ask_enter_from", new C1747940vaS(new C1748000vaY("", ""))), new C1748840vbu("enter_method", new C1747940vaS(new C1748000vaY("", ""))), new C1748840vbu("enter_from_merge", new C1747940vaS(new C1748000vaY("", ""))), new C1748840vbu("enter_from_info", new C1747940vaS(new C1748000vaY("", ""))), new C1748840vbu("follow_status", new C1747940vaS(new C1748000vaY("", ""))), new C1748840vbu("is_ad", new C1747940vaS(new C1748000vaY("", ""))), new C1748840vbu("author_id", new C1747940vaS(new C1748000vaY("", ""))), new C1748840vbu("source", new C1747940vaS[0]), new C1748840vbu("source_from", new C1747940vaS[0]), new C1748840vbu("product_source", new C1747940vaS[0]), new C1748840vbu("entrance_form", new C1747940vaS[0]), new C1748840vbu("start_click_to_now", new C1747940vaS[0]), new C1748840vbu("preload_type", new C1747940vaS[0]), new C1748840vbu("is_retry", new C1747940vaS[0]), new C1748840vbu("source_content_id", new C1747940vaS(new C1748000vaY("", ""))), new C1748840vbu("page_name", new C1747940vaS(new C1748000vaY("", ""))));
            }
        };
        c04ck2.LJIIIIZZ(new C1025403zg(i, map, map2, z));
        c04ck2.LIZJ(false);
    }

    public static final C1758370vrH LJJJIL(IPdpStarter.PdpEnterParam pdpEnterParam, Boolean bool, String str, Integer num, C04J0 c04j0) {
        String string;
        C1758040vqk c1758040vqkLIZ;
        C1758040vqk c1758040vqkLIZ2;
        C1758340vrE c1758340vrE = new C1758340vrE(pdpEnterParam.getProductId());
        c1758340vrE.LIZJ(EnumC1758320vrC.START);
        c1758340vrE.LIZIZ();
        String strLJJIJLIJ = LJJIJLIJ(pdpEnterParam);
        C1758370vrH c1758370vrHLJJJI = LJJJI(pdpEnterParam, strLJJIJLIJ, true);
        if (c1758370vrHLJJJI != null) {
            return c1758370vrHLJJJI;
        }
        String str2 = pdpEnterParam.trackId;
        if (str2 != null && (c1758040vqkLIZ2 = C10287040n.LIZ(str2)) != null) {
            c1758040vqkLIZ2.LJFF("t_fetch_data_start", false);
            c1758040vqkLIZ2.LJFF("t_build_params_start", false);
        }
        c04j0.LIZ.put("template", "tt_pdp_full");
        Map<String, Object> mapLIZ = c04j0.LIZ(pdpEnterParam, 0, bool, str, num);
        String str3 = pdpEnterParam.trackId;
        if (str3 != null && (c1758040vqkLIZ = C10287040n.LIZ(str3)) != null) {
            c1758040vqkLIZ.LJFF("t_build_params_end", false);
        }
        Integer num2 = pdpEnterParam.bizType;
        final String productId = pdpEnterParam.getProductId();
        final String str4 = pdpEnterParam.trackId;
        PdpApi.LIZ.getClass();
        String strLJI = C1758570vrb.LJI(mapLIZ);
        PdpApi pdpApi = (PdpApi) C1758570vrb.LIZIZ.create(PdpApi.class);
        C1054204Ai.LIZ.getClass();
        Map<String, Object> mapLIZ2 = C1054204Ai.LIZ(mapLIZ, null);
        if (num2 != null) {
            string = num2.toString();
        } else {
            string = null;
        }
        C11O8 c11o8LJJJLZIJ = C11RS.LJLZ(pdpApi.getSDUIPdpInfoRaw(mapLIZ2, C1758570vrb.LJIIIIZZ(string, strLJI, C1758570vrb.LIZJ(mapLIZ))).LJJJJZI(new InterfaceC1487280oo2() { // from class: X.00Xw
            @Override // X.InterfaceC1487280oo2
            public final Object apply(Object obj) {
                return obj;
            }
        }).LJL(C11S5.LIZ()).LJJLIIIJJIZ(1L).LJJJJZI(new InterfaceC1487280oo2() { // from class: X.0vqr
            @Override // X.InterfaceC1487280oo2
            public final Object apply(Object obj) {
                GodaProtocol godaProtocol;
                C1758040vqk c1758040vqkLIZ3;
                List<ProductPackStruct> list;
                ProductPackStruct productPackStruct;
                C1758040vqk c1758040vqkLIZ4;
                C0X52<T> c0x52 = (C0X52) obj;
                C1758700vro c1758700vro = (C1758700vro) c0x52.LIZIZ;
                String str5 = str4;
                if (str5 != null && (c1758040vqkLIZ4 = C10287040n.LIZ(str5)) != null) {
                    c1758040vqkLIZ4.LJFF("t_request_end", false);
                    c1758040vqkLIZ4.LJFF("t_decode_data_start", false);
                    c1758040vqkLIZ4.LJI(c0x52);
                    c1758040vqkLIZ4.LJ(c0x52);
                }
                C1054204Ai c1054204Ai = C1054204Ai.LIZ;
                PDPResponseData pDPResponseData = (PDPResponseData) c1758700vro.data;
                if (pDPResponseData != null) {
                    godaProtocol = pDPResponseData.godaProtocol;
                } else {
                    godaProtocol = null;
                }
                c1054204Ai.getClass();
                C1758290vr9 c1758290vr9 = new C1758290vr9(c1758700vro.code, c1758700vro.message, C1054204Ai.LJFF(godaProtocol), 24);
                C1758310vrB c1758310vrB = C1758310vrB.LIZJ;
                String str6 = productId;
                c1758310vrB.getClass();
                ProductInfoPackData productInfoPackData = (ProductInfoPackData) c1758290vr9.data;
                if (productInfoPackData != null && (list = productInfoPackData.productionInfoPack) != null && (productPackStruct = (ProductPackStruct) C13LP.LJJJLL(list)) != null) {
                    C054G c054g = C1758140vqu.LIZ;
                    C1758140vqu.LJFF(str6, productPackStruct, EnumC1756020vnU.LAST_USED_CACHE, null);
                }
                c1758290vr9.LLILLJJLI = c1758700vro.LL;
                String str7 = str4;
                if (str7 != null && (c1758040vqkLIZ3 = C10287040n.LIZ(str7)) != null) {
                    c1758040vqkLIZ3.LJFF("t_decode_data_end", false);
                }
                return c1758290vr9;
            }
        }).LJJJJZI(new AkS87S0201000_26(mapLIZ, pdpEnterParam, 1)).LJJIJIIJI(new AfS14S1201000_26(pdpEnterParam, mapLIZ, strLJJIJLIJ, 1)).LJJIJIL(new AfS5S0211000_26(pdpEnterParam, mapLIZ, 1))).LJLLLL().LJJJLZIJ(C1701940uOG.LIZIZ());
        C1758370vrH c1758370vrH = new C1758370vrH(strLJJIJLIJ, 0, c11o8LJJJLZIJ, null);
        c11o8LJJJLZIJ.LJJLL(new AfS47S1200000_26(c1758370vrH, pdpEnterParam, strLJJIJLIJ, 2), new C09JN() { // from class: X.00Q5
            @Override // X.C09JN
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
                C1C7U.LIZ("PdpRepositoryOptimized@68d5.fetchProductInfo$4");
                C1C7U.LIZIZ("PdpRepositoryOptimized@68d5.fetchProductInfo$4");
            }
        });
        SystemClock.elapsedRealtime();
        return c1758370vrH;
    }

    public static final Object LJJJJIZL(IPdpStarter.PdpEnterParam pdpEnterParam, Boolean bool, String str, Integer num, C04J0 c04j0, InterfaceC1364105Vn interfaceC1364105Vn) {
        c04j0.LIZ.put("template", "tt_pdp_refresh");
        return PdpApi.LIZ.LJIIJ(c04j0.LIZ(pdpEnterParam, 0, bool, str, num), pdpEnterParam.bizType, interfaceC1364105Vn);
    }

    public static final Object LJJJJJ(IPdpStarter.PdpEnterParam pdpEnterParam, Boolean bool, String str, Integer num, C04J0 c04j0, GodaV2RequestParams godaV2RequestParams, InterfaceC1364105Vn interfaceC1364105Vn) {
        c04j0.LIZ.put("template", "tt_pdp_refresh");
        return PdpApi.LIZ.LJIIJJI(c04j0.LIZ(pdpEnterParam, 0, bool, str, num), pdpEnterParam.bizType, godaV2RequestParams, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00cc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJJIZ(java.util.Map r10, java.util.Map r11, com.ss.android.ugc.aweme.ecommerce.base.oneclickpay.OneClickPayContext r12, java.lang.String r13, com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct r14, X.C1758290vr9 r15, int r16, long r17) {
        /*
            Method dump skipped, instruction units count: 303
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1758310vrB.LJJIZ(java.util.Map, java.util.Map, com.ss.android.ugc.aweme.ecommerce.base.oneclickpay.OneClickPayContext, java.lang.String, com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct, X.0vr9, int, long):void");
    }

    public static final C1758370vrH LJJJJ(IPdpStarter.PdpEnterParam pdpEnterParam, boolean z, int i, boolean z2, Boolean bool, String str, Integer num, C04J0 c04j0, GodaV2RequestParams godaV2RequestParams) {
        String string;
        C1756090vnb c1756090vnbLIZIZ;
        C1756090vnb c1756090vnbLIZIZ2;
        C1758040vqk c1758040vqkLIZ;
        C1758340vrE c1758340vrE = new C1758340vrE(pdpEnterParam.getProductId());
        c1758340vrE.LIZJ(EnumC1758320vrC.START);
        c1758340vrE.LIZIZ();
        String strLJJIJLIJ = LJJIJLIJ(pdpEnterParam);
        C1758370vrH c1758370vrHLJJJI = LJJJI(pdpEnterParam, strLJJIJLIJ, z2);
        if (c1758370vrHLJJJI != null) {
            return c1758370vrHLJJJI;
        }
        String str2 = pdpEnterParam.trackId;
        if (str2 != null) {
            C1758040vqk c1758040vqkLIZ2 = C10287040n.LIZ(str2);
            if (c1758040vqkLIZ2 != null) {
                c1758040vqkLIZ2.LJFF("t_fetch_data_start", false);
                c1758040vqkLIZ2.LJFF("t_build_params_start", false);
            }
            C1756090vnb c1756090vnbLIZIZ3 = C1756110vnd.LIZIZ(str2);
            if (c1756090vnbLIZIZ3 != null) {
                c1756090vnbLIZIZ3.LJII("t_fetch_data_start", false);
                c1756090vnbLIZIZ3.LJII("t_build_request_params_start", false);
            }
        }
        c04j0.LIZ.put("template", "tt_pdp_full");
        final Map<String, Object> mapLIZ = c04j0.LIZ(pdpEnterParam, i, bool, str, num);
        String str3 = pdpEnterParam.trackId;
        if (str3 != null && (c1758040vqkLIZ = C10287040n.LIZ(str3)) != null) {
            c1758040vqkLIZ.LJFF("t_build_params_end", false);
        }
        String str4 = pdpEnterParam.trackId;
        if (str4 != null && (c1756090vnbLIZIZ2 = C1756110vnd.LIZIZ(str4)) != null) {
            c1756090vnbLIZIZ2.LJII("t_build_request_params_end", false);
        }
        Integer num2 = pdpEnterParam.bizType;
        final String productId = pdpEnterParam.getProductId();
        final String str5 = pdpEnterParam.trackId;
        PdpApi.LIZ.getClass();
        String strLJI = C1758570vrb.LJI(mapLIZ);
        PdpApi pdpApi = (PdpApi) C1758570vrb.LIZIZ.create(PdpApi.class);
        C1054204Ai.LIZ.getClass();
        Map<String, Object> mapLIZ2 = C1054204Ai.LIZ(mapLIZ, godaV2RequestParams);
        if (num2 != null) {
            string = num2.toString();
        } else {
            string = null;
        }
        C11O8 c11o8LJJJLZIJ = C11RS.LJLZ(pdpApi.getGodaV2PdpInfoRaw(mapLIZ2, C1758570vrb.LJIIIIZZ(string, strLJI, C1758570vrb.LIZJ(mapLIZ))).LJJJJZI(new InterfaceC1487280oo2() { // from class: X.00Xv
            @Override // X.InterfaceC1487280oo2
            public final Object apply(Object obj) {
                return obj;
            }
        }).LJL(C11S5.LIZ()).LJJLIIIJJIZ(1L).LJJJJZI(new InterfaceC1487280oo2() { // from class: X.0vqq
            @Override // X.InterfaceC1487280oo2
            public final Object apply(Object obj) {
                C080U next;
                String str6;
                GodaV2Protocol<ProductInfoPackData> godaV2Protocol;
                Integer num3;
                C1756090vnb c1756090vnbLIZIZ4;
                C1758040vqk c1758040vqkLIZ3;
                List<ProductPackStruct> list;
                ProductPackStruct productPackStruct;
                GodaV2Protocol<ProductInfoPackData> godaV2Protocol2;
                String str7;
                C080U next2;
                String str8;
                Long l;
                Long l2;
                C0X52<T> c0x52 = (C0X52) obj;
                String str9 = str5;
                if (str9 != null) {
                    C1758040vqk c1758040vqkLIZ4 = C10287040n.LIZ(str9);
                    if (c1758040vqkLIZ4 != null) {
                        c1758040vqkLIZ4.LJFF("t_request_end", false);
                        c1758040vqkLIZ4.LJFF("t_decode_data_start", false);
                        c1758040vqkLIZ4.LJI(c0x52);
                        c1758040vqkLIZ4.LJ(c0x52);
                    }
                    C1756090vnb c1756090vnbLIZIZ5 = C1756110vnd.LIZIZ(str9);
                    if (c1756090vnbLIZIZ5 != null) {
                        c1756090vnbLIZIZ5.LJII("t_request_end", false);
                        c1756090vnbLIZIZ5.LJII("t_decode_data_start", false);
                        if (!c1756090vnbLIZIZ5.LIZLLL.get()) {
                            try {
                                Iterator<C080U> it2 = c0x52.LIZ.LIZLLL.iterator();
                                while (true) {
                                    if (it2.hasNext()) {
                                        next2 = it2.next();
                                        if (Intrinsics.LJFF(next2.LIZ, "tts-server-timing")) {
                                            break;
                                        }
                                    } else {
                                        next2 = null;
                                        break;
                                    }
                                }
                                C080U c080u = next2;
                                if (c080u != null && (str8 = c080u.LIZIZ) != null) {
                                    Iterator it3 = a0.LJJLIIIJILLIZJL(str8, new String[]{","}, 0, 6).iterator();
                                    while (it3.hasNext()) {
                                        List listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL((String) it3.next(), new String[]{"="}, 0, 6);
                                        if (listLJJLIIIJILLIZJL.size() == 2) {
                                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                                            sbLIZ.append("tts_server_");
                                            sbLIZ.append((String) listLJJLIIIJILLIZJL.get(0));
                                            c1756090vnbLIZIZ5.LJ(C2095008Iq.LJIILIIL((String) listLJJLIIIJILLIZJL.get(1)), C2188811AlT.LIZIZ(sbLIZ), false);
                                        }
                                    }
                                }
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                C1019103yf.LIZ(EnumC1014603xw.UNKNOWN_ERR, th, null);
                            }
                        }
                        C1495280p0w c1495280p0w = C1495280p0w.LIZ;
                        C2175508fh c2175508fh = c0x52.LIZ;
                        Object obj2 = c2175508fh.LJFF;
                        List<C080U> list2 = c2175508fh.LIZLLL;
                        Object obj3 = c1756090vnbLIZIZ5.LIZ().get("t_request_start");
                        if (obj3 instanceof Long) {
                            l = (Long) obj3;
                        } else {
                            l = null;
                        }
                        Object obj4 = c1756090vnbLIZIZ5.LIZ().get("t_request_end");
                        if (obj4 instanceof Long) {
                            l2 = (Long) obj4;
                        } else {
                            l2 = null;
                        }
                        c1495280p0w.getClass();
                        for (Map.Entry entry : ((LinkedHashMap) C1495280p0w.LIZIZ(obj2, list2, l, l2, false)).entrySet()) {
                            c1756090vnbLIZIZ5.LJ(entry.getValue(), (String) entry.getKey(), false);
                        }
                        c1756090vnbLIZIZ5.LJ(C2381909Uz.LIZIZ(c0x52), "log_id", false);
                        try {
                            c1756090vnbLIZIZ5.LJ(UriProtector.parse(c0x52.LIZ.LIZ).getPath(), "path", false);
                        } catch (Throwable th2) {
                            TryCatchGuardChecker.doCheck(th2);
                            C1019103yf.LIZ(EnumC1014603xw.UNKNOWN_ERR, th2, null);
                        }
                    }
                }
                C1758700vro c1758700vro = (C1758700vro) c0x52.LIZIZ;
                Iterator<C080U> it4 = c0x52.LIZ.LIZLLL.iterator();
                while (true) {
                    if (it4.hasNext()) {
                        next = it4.next();
                        if (Intrinsics.LJFF(next.LIZ, "x-tt-logid")) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                C080U c080u2 = next;
                if (c080u2 != null) {
                    str6 = c080u2.LIZIZ;
                } else {
                    str6 = null;
                }
                PDPResponseData pDPResponseData = (PDPResponseData) c1758700vro.data;
                if (pDPResponseData != null && (godaV2Protocol2 = pDPResponseData.godaV2Protocol) != null) {
                    Object obj5 = mapLIZ.get("selected_sku_id");
                    if (obj5 instanceof String) {
                        str7 = (String) obj5;
                    } else {
                        str7 = null;
                    }
                    godaV2Protocol2.localExtra = new C04EU(str6, str7);
                }
                C1054204Ai c1054204Ai = C1054204Ai.LIZ;
                PDPResponseData pDPResponseData2 = (PDPResponseData) c1758700vro.data;
                if (pDPResponseData2 != null) {
                    godaV2Protocol = pDPResponseData2.godaV2Protocol;
                } else {
                    godaV2Protocol = null;
                }
                Object obj6 = mapLIZ.get("partial_refresh_scenario");
                if (obj6 instanceof Integer) {
                    num3 = (Integer) obj6;
                } else {
                    num3 = null;
                }
                Boolean bool2 = Boolean.FALSE;
                c1054204Ai.getClass();
                C1758290vr9 c1758290vr9 = new C1758290vr9(c1758700vro.code, c1758700vro.message, C1054204Ai.LJI(godaV2Protocol, num3, bool2), 24);
                C1758310vrB c1758310vrB = C1758310vrB.LIZJ;
                String str10 = productId;
                c1758310vrB.getClass();
                ProductInfoPackData productInfoPackData = (ProductInfoPackData) c1758290vr9.data;
                if (productInfoPackData != null && (list = productInfoPackData.productionInfoPack) != null && (productPackStruct = (ProductPackStruct) C13LP.LJJJLL(list)) != null) {
                    C054G c054g = C1758140vqu.LIZ;
                    C1758140vqu.LJFF(str10, productPackStruct, EnumC1756020vnU.LAST_USED_CACHE, null);
                }
                c1758290vr9.LLILLJJLI = c1758700vro.LL;
                String str11 = str5;
                if (str11 != null && (c1758040vqkLIZ3 = C10287040n.LIZ(str11)) != null) {
                    c1758040vqkLIZ3.LJFF("t_decode_data_end", false);
                }
                String str12 = str5;
                if (str12 != null && (c1756090vnbLIZIZ4 = C1756110vnd.LIZIZ(str12)) != null) {
                    c1756090vnbLIZIZ4.LJII("t_decode_data_end", false);
                }
                return c1758290vr9;
            }
        }).LJJJJZI(new AkS87S0201000_26(mapLIZ, pdpEnterParam, i, 0)).LJJIJIIJI(new AfS14S1201000_26(pdpEnterParam, mapLIZ, i, strLJJIJLIJ, 0)).LJJIJIL(new AfS5S0211000_26(pdpEnterParam, mapLIZ, z, i, 0))).LJLLLL().LJJJLZIJ(C1701940uOG.LIZIZ());
        String str6 = pdpEnterParam.trackId;
        if (str6 != null && (c1756090vnbLIZIZ = C1756110vnd.LIZIZ(str6)) != null) {
            c1756090vnbLIZIZ.LJII("t_request_start", false);
        }
        C1758370vrH c1758370vrH = new C1758370vrH(strLJJIJLIJ, i, c11o8LJJJLZIJ, null);
        c11o8LJJJLZIJ.LJJLL(new AfS47S1200000_26(c1758370vrH, pdpEnterParam, strLJJIJLIJ, 1), new C09JN() { // from class: X.00Q1
            @Override // X.C09JN
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
                C1C7U.LIZ("PdpRepositoryOptimized@68d5.fetchProductInfoV2$6");
                C1C7U.LIZIZ("PdpRepositoryOptimized@68d5.fetchProductInfoV2$6");
            }
        });
        SystemClock.elapsedRealtime();
        if (!z && !z2) {
            LJJIJIL(pdpEnterParam.pdpPreParam, strLJJIJLIJ, c1758370vrH);
        }
        return c1758370vrH;
    }
}
