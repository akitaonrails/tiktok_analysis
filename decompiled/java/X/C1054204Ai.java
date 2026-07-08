package X;

import com.bytedance.goda.model.dto.GodaCardData;
import com.bytedance.goda.model.dto.GodaCardDataFeature;
import com.bytedance.goda.model.dto.GodaContainer;
import com.bytedance.goda.model.dto.GodaProtocol;
import com.bytedance.goda.v2.model.dto.GlobalStruct;
import com.bytedance.goda.v2.model.dto.GodaV2Container;
import com.bytedance.goda.v2.model.dto.GodaV2Data;
import com.bytedance.goda.v2.model.dto.GodaV2Feature;
import com.bytedance.goda.v2.model.dto.GodaV2Protocol;
import com.bytedance.goda.v2.model.vo.GodaV2RequestParams;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.k;
import com.google.gson.n;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BrickInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.DynamicPage;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductInfoPackData;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.Tab;
import com.ss.android.ugc.aweme.ecommerce.core.ab.PdpPaapFieldConfig;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.04Ai, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1054204Ai {
    public static final C1054204Ai LIZ = new C1054204Ai();
    public static Map<String, ? extends Class<?>> LIZIZ;

    public static Integer LIZIZ(String str) {
        if (Intrinsics.LJFF(str, "Lynx")) {
            return Integer.valueOf(EnumC1057904Bt.LYNX_AIR.getValue());
        }
        return Integer.valueOf(EnumC1057904Bt.NATIVE.getValue());
    }

    public static ProductInfoPackData LJFF(GodaProtocol godaProtocol) {
        Object obj;
        ProductInfoPackData productInfoPackData;
        List<BrickInfo> list;
        List<Tab> list2;
        GodaProtocol godaProtocol2;
        Map map;
        Map<String, Object> map2;
        if (godaProtocol != null && (map2 = godaProtocol.global) != null) {
            obj = map2.get("product_info_resp");
        } else {
            obj = null;
        }
        if ((obj instanceof Map) && (map = (Map) obj) != null) {
            Gson gson = C051O.LIZ;
            productInfoPackData = (ProductInfoPackData) C051O.LIZLLL(ProductInfoPackData.class, map);
        } else {
            productInfoPackData = null;
        }
        C1758310vrB.LIZJ.getClass();
        if (productInfoPackData != null && productInfoPackData.productionInfoPack != null && !productInfoPackData.productionInfoPack.isEmpty()) {
            for (ProductPackStruct productPackStruct : productInfoPackData.productionInfoPack) {
                productPackStruct.cartEntry = productInfoPackData.cartEntry;
                productPackStruct.hasPayMethod = productInfoPackData.hasPayMethod;
                productPackStruct.hasShippingAddress = productInfoPackData.hasShippingAddress;
                productPackStruct.schemaInfo = productInfoPackData.schemaInfo;
                productPackStruct.productUnavailableInfo = productInfoPackData.productUnavailableInfo;
                DynamicPage dynamicPage = productInfoPackData.dynamicPage;
                if (dynamicPage != null) {
                    list = dynamicPage.bricks;
                } else {
                    list = null;
                }
                productPackStruct.bricks = list;
                if (dynamicPage != null) {
                    list2 = dynamicPage.tabs;
                } else {
                    list2 = null;
                }
                productPackStruct.tabs = list2;
                productPackStruct.favorite = productInfoPackData.favorite;
                productPackStruct.aiAssistant = productInfoPackData.aiAssistant;
                productPackStruct.helpCenterSchemaUrl = productInfoPackData.helpCenterSchemaUrl;
                productPackStruct.productRecommendContext = productInfoPackData.recommendationContext;
                C0C64 c0c64LJIILLIIL = C0C64.LJIILLIIL();
                PdpPaapFieldConfig pdpPaapFieldConfig = C1061504Dd.LIZ;
                PdpPaapFieldConfig pdpPaapFieldConfig2 = (PdpPaapFieldConfig) c0c64LJIILLIIL.LJJII(PdpPaapFieldConfig.class, pdpPaapFieldConfig, "pdp_paap_field_opt_settings", true);
                if (pdpPaapFieldConfig2 != null) {
                    pdpPaapFieldConfig = pdpPaapFieldConfig2;
                }
                if (!pdpPaapFieldConfig.godaProtocolGlobalRemove) {
                    productPackStruct.godaProtocol = godaProtocol;
                } else {
                    if (godaProtocol != null) {
                        godaProtocol2 = new GodaProtocol((Map<String, ? extends Object>) null);
                    } else {
                        godaProtocol2 = null;
                    }
                    productPackStruct.godaProtocol = godaProtocol2;
                }
            }
        }
        return productInfoPackData;
    }

    public static Map LIZ(Map map, GodaV2RequestParams godaV2RequestParams) {
        int value;
        List list;
        Object objLJJJLL;
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        Object obj = linkedHashMap.get("product_id");
        if ((obj instanceof List) && (list = (List) obj) != null && (objLJJJLL = C13LP.LJJJLL(list)) != null) {
            linkedHashMap.put("product_id", objLJJJLL);
        }
        Object objRemove = linkedHashMap.remove("template");
        if (objRemove != null) {
            if (Intrinsics.LJFF(objRemove, "tt_pdp_refresh")) {
                value = EnumC1058104Bv.SEA_SKU_INFO_REFRESH.getValue();
            } else {
                value = EnumC1058104Bv.FULL.getValue();
            }
            linkedHashMap.put("partial_refresh_scenario", Integer.valueOf(value));
        }
        if (godaV2RequestParams != null) {
            linkedHashMap.put("goda_v2_params", godaV2RequestParams);
        }
        return linkedHashMap;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0067 A[Catch: Exception -> 0x006b, TryCatch #1 {Exception -> 0x006b, blocks: (B:16:0x0032, B:18:0x0040, B:21:0x0046, B:28:0x0067, B:25:0x005e, B:23:0x0052), top: B:36:0x0032, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C04CW LIZJ(com.google.gson.n r7, java.lang.String r8) {
        /*
            r6 = 0
            if (r7 == 0) goto L21
            java.lang.String r0 = "container"
            com.google.gson.k r2 = r7.LJJIIZ(r0)
            if (r2 == 0) goto L21
            com.google.gson.Gson r1 = X.C1280004ze.LIZJ()     // Catch: java.lang.Exception -> L18
            java.lang.Class<com.bytedance.goda.model.dto.GodaContainer> r0 = com.bytedance.goda.model.dto.GodaContainer.class
            java.lang.Object r5 = r1.LIZJ(r2, r0)     // Catch: java.lang.Exception -> L18
            com.bytedance.goda.model.dto.GodaContainer r5 = (com.bytedance.goda.model.dto.GodaContainer) r5     // Catch: java.lang.Exception -> L18
            goto L22
        L18:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
            X.03xw r0 = X.EnumC1014603xw.ERR_PDP_JSON_PARSE
            X.C1019103yf.LIZ(r0, r1, r6)
        L21:
            r5 = r6
        L22:
            if (r7 == 0) goto L74
            java.lang.String r0 = "data"
            com.google.gson.k r3 = r7.LJJIIZ(r0)
            if (r3 == 0) goto L74
            if (r5 == 0) goto L31
            java.lang.String r2 = r5.name
            goto L32
        L31:
            r2 = r6
        L32:
            com.google.gson.Gson r1 = X.C1280004ze.LIZJ()     // Catch: java.lang.Exception -> L6b
            java.lang.Class<com.bytedance.goda.model.dto.GodaCardData> r0 = com.bytedance.goda.model.dto.GodaCardData.class
            java.lang.Object r4 = r1.LIZJ(r3, r0)     // Catch: java.lang.Exception -> L6b
            com.bytedance.goda.model.dto.GodaCardData r4 = (com.bytedance.goda.model.dto.GodaCardData) r4     // Catch: java.lang.Exception -> L6b
            if (r4 == 0) goto L69
            java.util.Map<java.lang.String, java.lang.Object> r3 = r4.fields     // Catch: java.lang.Exception -> L6b
            if (r3 == 0) goto L64
            if (r2 == 0) goto L64
            java.util.Map<java.lang.String, java.lang.Class<?>> r0 = X.C1058604Ca.LIZ     // Catch: java.lang.Exception -> L6b
            java.util.LinkedHashMap r0 = (java.util.LinkedHashMap) r0     // Catch: java.lang.Exception -> L6b
            java.lang.Object r2 = r0.get(r2)     // Catch: java.lang.Exception -> L6b
            java.lang.Class r2 = (java.lang.Class) r2     // Catch: java.lang.Exception -> L6b
            if (r2 == 0) goto L64
            com.google.gson.Gson r1 = X.C04DJ.LIZ     // Catch: java.lang.Exception -> L5d
            java.lang.String r0 = com.bytedance.mt.protector.impl.GsonProtectorUtils.toJson(r1, r3)     // Catch: java.lang.Exception -> L5d
            java.lang.Object r0 = com.bytedance.mt.protector.impl.GsonProtectorUtils.fromJson(r1, r0, r2)     // Catch: java.lang.Exception -> L5d
            goto L65
        L5d:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Exception -> L6b
            X.C04D2.LIZ(r0)     // Catch: java.lang.Exception -> L6b
        L64:
            r0 = r6
        L65:
            if (r4 == 0) goto L69
            r4.LIZ = r0     // Catch: java.lang.Exception -> L6b
        L69:
            r6 = r4
            goto L74
        L6b:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
            X.03xw r0 = X.EnumC1014603xw.ERR_PDP_JSON_PARSE
            X.C1019103yf.LIZ(r0, r1, r6)
        L74:
            X.04CW r0 = new X.04CW
            r0.<init>(r8, r6, r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1054204Ai.LIZJ(com.google.gson.n, java.lang.String):X.04CW");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static ProductInfoPackData LJI(GodaV2Protocol godaV2Protocol, Integer num, Boolean bool) {
        ProductInfoPackData productInfoPackData;
        ProductPackStruct productPackStruct;
        List<BrickInfo> list;
        List<Tab> list2;
        GlobalStruct<T> globalStruct;
        String str;
        String str2;
        String str3;
        Map<String, ? extends Class<?>> map;
        Class<?> cls;
        GodaV2Container godaV2Container;
        GodaV2Container godaV2Container2;
        GodaV2Container godaV2Container3;
        final String str4;
        final String str5;
        String str6;
        Object obj;
        Map<String, Object> map2;
        Map<String, ? extends Class<?>> map3;
        Class<?> cls2;
        List<ProductPackStruct> list3;
        ProductPackStruct productPackStruct2;
        List<ProductPackStruct> list4;
        ProductPackStruct productPackStruct3;
        ProductPackStruct productPackStruct4;
        GlobalStruct<T> globalStruct2;
        if (godaV2Protocol != null && (globalStruct2 = godaV2Protocol.global) != 0) {
            productInfoPackData = (ProductInfoPackData) globalStruct2.productInfo;
        } else {
            productInfoPackData = null;
        }
        int value = EnumC1058104Bv.SEA_SKU_INFO_REFRESH.getValue();
        if (num != null && num.intValue() == value) {
            if (productInfoPackData != null) {
                List<ProductPackStruct> list5 = productInfoPackData.productionInfoPack;
                if (list5 != null && (productPackStruct4 = (ProductPackStruct) C13LP.LJJJLL(list5)) != null) {
                    productPackStruct4.fullResponse = Boolean.FALSE;
                }
                list4 = productInfoPackData.productionInfoPack;
                if (list4 != null) {
                    productPackStruct3.isBatchDataForGodaV2 = bool;
                }
            }
        } else if (productInfoPackData != null) {
            List<ProductPackStruct> list6 = productInfoPackData.productionInfoPack;
            if (list6 != null && (productPackStruct = (ProductPackStruct) C13LP.LJJJLL(list6)) != null) {
                productPackStruct.fullResponse = Boolean.TRUE;
            }
            list4 = productInfoPackData.productionInfoPack;
            if (list4 != null && (productPackStruct3 = (ProductPackStruct) C13LP.LJJJLL(list4)) != null) {
                productPackStruct3.isBatchDataForGodaV2 = bool;
            }
        }
        boolean zLIZIZ = AnonymousClass0405.LIZIZ();
        if (godaV2Protocol != null) {
            Map<String, GodaV2Container> map4 = godaV2Protocol.container;
            Map<String, GodaV2Data> map5 = godaV2Protocol.data;
            if (map5 != null) {
                for (Map.Entry<String, GodaV2Data> entry : map5.entrySet()) {
                    final String key = entry.getKey();
                    GodaV2Feature godaV2Feature = entry.getValue().features;
                    if (godaV2Feature != null) {
                        str = godaV2Feature.type;
                    } else {
                        str = null;
                    }
                    if (zLIZIZ) {
                        if (map4 != null && (godaV2Container2 = map4.get(str)) != null) {
                            str2 = godaV2Container2.containerType;
                        } else {
                            str2 = null;
                        }
                        if (Intrinsics.LJFF(str2, "GodaV1")) {
                            GodaV2Data value2 = entry.getValue();
                            C1054204Ai c1054204Ai = LIZ;
                            String key2 = entry.getKey();
                            n nVar = entry.getValue().itemData;
                            c1054204Ai.getClass();
                            value2.LIZ = LIZJ(nVar, key2);
                        } else {
                            if (map4 != null && (godaV2Container = map4.get(str)) != null) {
                                str3 = godaV2Container.containerType;
                            } else {
                                str3 = null;
                            }
                            if (Intrinsics.LJFF(str3, "Myna")) {
                                entry.getValue().LIZ = new AbstractC1066304Ez() { // from class: X.04DH
                                };
                            } else {
                                n nVar2 = entry.getValue().itemData;
                                if (nVar2 != null && (map = LIZIZ) != null && (cls = map.get(str)) != null) {
                                    entry.getValue().LIZ = GsonProtectorUtils.fromJson(C1280004ze.LIZJ(), (k) nVar2, (Class) cls);
                                }
                            }
                        }
                    } else if (!C998003vG.LIZ.contains(key)) {
                        if (map4 != null) {
                            godaV2Container3 = map4.get(str);
                        } else {
                            godaV2Container3 = null;
                        }
                        if (productInfoPackData != null && (list3 = productInfoPackData.productionInfoPack) != null && (productPackStruct2 = (ProductPackStruct) C13LP.LJJJLL(list3)) != null) {
                            str4 = productPackStruct2.productId;
                        } else {
                            str4 = null;
                        }
                        if (godaV2Container3 != null && (str6 = godaV2Container3.containerType) != null) {
                            int iHashCode = str6.hashCode();
                            if (iHashCode != -1808614770) {
                                if (iHashCode != 2383927) {
                                    if (iHashCode == 2138255584 && str6.equals("GodaV1")) {
                                        GodaV2Data value3 = entry.getValue();
                                        C1054204Ai c1054204Ai2 = LIZ;
                                        String key3 = entry.getKey();
                                        n nVar3 = entry.getValue().itemData;
                                        String str7 = godaV2Container3.containerType;
                                        String str8 = godaV2Container3.template;
                                        c1054204Ai2.getClass();
                                        value3.LIZ = LIZLLL(key3, str, nVar3, str7, str8);
                                    }
                                } else if (str6.equals("Lynx")) {
                                    GodaV2Feature godaV2Feature2 = entry.getValue().features;
                                    if (godaV2Feature2 != null && (map2 = godaV2Feature2.customConfig) != null) {
                                        obj = map2.get("dynamic_container_identifier");
                                    } else {
                                        obj = null;
                                    }
                                    String str9 = (String) obj;
                                    Integer num2 = godaV2Container3.version;
                                    if (num2 != null && num2.intValue() == 2) {
                                        n nVar4 = entry.getValue().itemData;
                                        if (nVar4 != null) {
                                            entry.getValue().LIZ = nVar4;
                                        }
                                    } else {
                                        n nVar5 = entry.getValue().itemData;
                                        GodaV2Data value4 = entry.getValue();
                                        C1054204Ai c1054204Ai3 = LIZ;
                                        String key4 = entry.getKey();
                                        String str10 = godaV2Container3.containerType;
                                        String str11 = godaV2Container3.template;
                                        c1054204Ai3.getClass();
                                        value4.LIZ = LJ(key4, str, nVar5, str9, str10, str11);
                                    }
                                }
                            } else if (str6.equals("Static")) {
                                n nVar6 = entry.getValue().itemData;
                                if (nVar6 != null && (map3 = LIZIZ) != null && (cls2 = map3.get(str)) != null) {
                                    entry.getValue().LIZ = GsonProtectorUtils.fromJson(C1280004ze.LIZJ(), (k) nVar6, (Class) cls2);
                                }
                            }
                        }
                        entry.getValue().LIZ = null;
                        EnumC1014603xw enumC1014603xw = EnumC1014603xw.ERR_GODA_30001;
                        if (godaV2Container3 != null) {
                            str5 = godaV2Container3.containerType;
                        } else {
                            str5 = null;
                        }
                        C1019103yf.LIZ(enumC1014603xw, new RuntimeException(str4, key, str5) { // from class: X.04CL
                            /* JADX WARN: Illegal instructions before constructor call */
                            {
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append("productId=");
                                sbLIZ.append(str4);
                                sbLIZ.append(", nodeId=");
                                sbLIZ.append(key);
                                sbLIZ.append(", containerType=");
                                sbLIZ.append(str5);
                                super(C2188811AlT.LIZIZ(sbLIZ));
                            }
                        }, null);
                    }
                }
            }
        }
        C1758310vrB.LIZJ.getClass();
        if (productInfoPackData != null && productInfoPackData.productionInfoPack != null && !productInfoPackData.productionInfoPack.isEmpty()) {
            for (ProductPackStruct productPackStruct5 : productInfoPackData.productionInfoPack) {
                productPackStruct5.cartEntry = productInfoPackData.cartEntry;
                productPackStruct5.hasPayMethod = productInfoPackData.hasPayMethod;
                productPackStruct5.hasShippingAddress = productInfoPackData.hasShippingAddress;
                productPackStruct5.schemaInfo = productInfoPackData.schemaInfo;
                productPackStruct5.productUnavailableInfo = productInfoPackData.productUnavailableInfo;
                DynamicPage dynamicPage = productInfoPackData.dynamicPage;
                if (dynamicPage != null) {
                    list = dynamicPage.bricks;
                } else {
                    list = null;
                }
                productPackStruct5.bricks = list;
                if (dynamicPage != null) {
                    list2 = dynamicPage.tabs;
                } else {
                    list2 = null;
                }
                productPackStruct5.tabs = list2;
                productPackStruct5.favorite = productInfoPackData.favorite;
                productPackStruct5.aiAssistant = productInfoPackData.aiAssistant;
                productPackStruct5.helpCenterSchemaUrl = productInfoPackData.helpCenterSchemaUrl;
                productPackStruct5.productRecommendContext = productInfoPackData.recommendationContext;
                if (zLIZIZ) {
                    if (godaV2Protocol != null && (globalStruct = godaV2Protocol.global) != 0) {
                        globalStruct.productInfo = null;
                    }
                    productPackStruct5.godaV2Protocol = godaV2Protocol;
                } else {
                    productPackStruct5.godaV2Protocol = godaV2Protocol;
                }
            }
        }
        return productInfoPackData;
    }

    public static C04CW LIZLLL(String str, String str2, n nVar, String str3, String str4) {
        Object objFromJson;
        GodaContainer godaContainer = new GodaContainer(LIZIZ(str3), str2, str4);
        GodaCardData godaCardData = null;
        if (nVar != null && str2 != null) {
            try {
                Map mapLIZJ = C051O.LIZJ(nVar);
                Class<?> cls = C998003vG.LIZJ.get(str2);
                if (cls != null) {
                    try {
                        Gson gson = C04DJ.LIZ;
                        objFromJson = GsonProtectorUtils.fromJson(gson, GsonProtectorUtils.toJson(gson, mapLIZJ), (Class<Object>) cls);
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("createGodaV1DataModel error: ");
                        sbLIZ.append(e.getMessage());
                        C1AF0.LIZJ(C2188811AlT.LIZIZ(sbLIZ));
                        objFromJson = null;
                    }
                    godaCardData = new GodaCardData(mapLIZJ, objFromJson, null);
                } else {
                    objFromJson = null;
                    godaCardData = new GodaCardData(mapLIZJ, objFromJson, null);
                }
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
                C1019103yf.LIZ(EnumC1014603xw.ERR_PDP_JSON_PARSE, e2, null);
            }
        }
        return new C04CW(str, godaCardData, godaContainer);
    }

    public static C04CW LJ(String str, String str2, n nVar, String str3, String str4, String str5) {
        Map mapLIZJ;
        GodaContainer godaContainer = new GodaContainer(LIZIZ(str4), str2, str5);
        if (nVar != null) {
            mapLIZJ = C051O.LIZJ(nVar);
        } else {
            mapLIZJ = null;
        }
        return new C04CW(str, new GodaCardData(mapLIZJ, null, new GodaCardDataFeature(str3)), godaContainer);
    }
}
