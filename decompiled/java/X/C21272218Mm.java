package X;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.google.gson.s;
import com.ss.android.ugc.aweme.commerce.model.ShopAdStruct;
import com.ss.android.ugc.aweme.ecommerce.anchor.model.TrackParams;
import com.ss.android.ugc.aweme.ecommerce.anchor.utils.AnchorBizUtils;
import com.ss.android.ugc.aweme.ecommerce.config.AnchorPanelConfig;
import com.ss.android.ugc.aweme.ecommerce.dependency.account.AccountDependencyService;
import com.ss.android.ugc.aweme.ecommerce.dependency.ad.AdDependencyService;
import com.ss.android.ugc.aweme.ecommerce.dependency.business.BusinessDependencyService;
import com.ss.android.ugc.aweme.ecommerce.dependency.search.SearchDependencyService;
import com.ss.android.ugc.aweme.ecommerce.model.AnchorProductInfo;
import com.ss.android.ugc.aweme.ecommerce.model.AnchorProductInfoModel;
import com.ss.android.ugc.aweme.ecommerce.model.AwemePruningModel;
import com.ss.android.ugc.aweme.ecommerce.model.ProductListModel;
import com.ss.android.ugc.aweme.ecommerce.model.VideoProductDaInfo;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.IBusinessDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.account.IAccountDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.ad.IAdDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.ecsearch.IEcomSearchDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.search.ISearchDependencyService;
import com.ss.android.ugc.aweme.ecommerce.search.saas.EcomSearchDependencyService;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.AnchorCustomData;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.profile.model.User;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.18Mm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21272218Mm {
    public static final boolean LIZJ(String str) {
        return C7957038x.LIZ.contains(str);
    }

    public static final void LIZLLL(final JSONObject jSONObject) throws JSONException {
        Unit unit;
        AnonymousClass0317 anonymousClass0317CreateIEcomSearchDependencyServicebyMonsterPlugin;
        String strLJIJI;
        Integer numLJIIJJI;
        boolean z;
        if (jSONObject == null) {
            return;
        }
        String name = null;
        if (C293680BfC.LIZ()) {
            try {
                C1766860w4y.LIZ.getClass();
                Map mapLIZJ = C1766860w4y.LIZJ("search_id", "search_result_id", "search_entrance");
                if (mapLIZJ != null) {
                    mapLIZJ.forEach(new BiConsumer() { // from class: X.15Bf
                        @Override // java.util.function.BiConsumer
                        public final void accept(Object obj, Object obj2) throws JSONException {
                            String str = (String) obj;
                            if (!C1016703yH.LIZ(C21272218Mm.LJIJI(str, jSONObject))) {
                                jSONObject.put(str, obj2);
                            }
                        }
                    });
                    unit = Unit.LIZ;
                } else {
                    unit = null;
                }
                C189200o6.m2constructorimpl(unit);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
        }
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            anonymousClass0317CreateIEcomSearchDependencyServicebyMonsterPlugin = EcomSearchDependencyService.createIEcomSearchDependencyServicebyMonsterPlugin(false);
            if (anonymousClass0317CreateIEcomSearchDependencyServicebyMonsterPlugin != null) {
                z = true;
            } else {
                z = false;
            }
            String name2 = IEcomSearchDependencyService.class.getName();
            if (anonymousClass0317CreateIEcomSearchDependencyServicebyMonsterPlugin != null) {
                name = anonymousClass0317CreateIEcomSearchDependencyServicebyMonsterPlugin.getClass().getName();
            }
            C1AQS.LIZJ(jElapsedRealtime, 1, name2, name, z);
        } else {
            C1120604Zw.LIZ.LIZ();
            anonymousClass0317CreateIEcomSearchDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IEcomSearchDependencyService.class);
        }
        if (Intrinsics.LJFF(((IEcomSearchDependencyService) anonymousClass0317CreateIEcomSearchDependencyServicebyMonsterPlugin).getParamByName("ec_inflow_scene"), "ecom_search") && (strLJIJI = LJIJI("rank_inner", jSONObject)) != null && (numLJIIJJI = C2095008Iq.LJIIJJI(strLJIJI)) != null && numLJIIJJI.intValue() > 0 && LJIJI("list_item_id", jSONObject) != null) {
            jSONObject.put("search_result_id", LJIJI("list_item_id", jSONObject));
            jSONObject.remove("list_item_id");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String LJ(com.ss.android.ugc.aweme.feed.model.Aweme r6) throws org.json.JSONException {
        /*
            com.ss.android.ugc.aweme.ecommerce.anchor.utils.AnchorBizUtils r0 = com.ss.android.ugc.aweme.ecommerce.anchor.utils.AnchorBizUtils.LIZ
            r0.getClass()
            r5 = 0
            if (r6 == 0) goto L47
            java.lang.String r3 = r6.getAnchorsExtras()
            if (r3 == 0) goto L47
            com.google.gson.Gson r2 = X.C1741890vQh.LJFF()     // Catch: com.google.gson.s -> L49
            X.04Zw r0 = X.C1120604Zw.LIZ     // Catch: com.google.gson.s -> L49
            r0.getClass()     // Catch: com.google.gson.s -> L49
            X.04a9 r0 = X.C1120604Zw.LIZIZ()     // Catch: com.google.gson.s -> L49
            if (r0 == 0) goto L23
            boolean r1 = r0.LJII     // Catch: com.google.gson.s -> L49
            r0 = 1
            if (r1 != r0) goto L23
            goto L24
        L23:
            r0 = 0
        L24:
            if (r0 == 0) goto L27
            goto L31
        L27:
            X.18Oj r0 = new X.18Oj     // Catch: com.google.gson.s -> L49
            r0.<init>()     // Catch: com.google.gson.s -> L49
            java.lang.reflect.Type r0 = r0.getType()     // Catch: com.google.gson.s -> L49
            goto L3b
        L31:
            java.lang.Class<com.ss.android.ugc.aweme.feed.model.AnchorsExtras> r0 = com.ss.android.ugc.aweme.feed.model.AnchorsExtras.class
            X.13JW r0 = X.C13LE.LJII(r0)     // Catch: com.google.gson.s -> L49
            java.lang.reflect.Type r0 = X.C2371409Qy.LIZJ(r0)     // Catch: com.google.gson.s -> L49
        L3b:
            java.lang.Object r1 = com.bytedance.mt.protector.impl.GsonProtectorUtils.fromJson(r2, r3, r0)     // Catch: com.google.gson.s -> L49
            boolean r0 = r1 instanceof com.ss.android.ugc.aweme.feed.model.AnchorsExtras     // Catch: com.google.gson.s -> L49
            if (r0 != 0) goto L44
            r1 = r5
        L44:
            com.ss.android.ugc.aweme.feed.model.AnchorsExtras r1 = (com.ss.android.ugc.aweme.feed.model.AnchorsExtras) r1     // Catch: com.google.gson.s -> L49
            goto L4e
        L47:
            r4 = r5
            goto L5f
        L49:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            r1 = r5
        L4e:
            if (r1 == 0) goto L47
            com.ss.android.ugc.aweme.feed.model.PanelTopDisclosureLabel r1 = r1.getPanelTopDisclosureLabel()
            if (r1 == 0) goto L47
            com.ss.android.ugc.aweme.ecommerce.anchor.utils.PanelTopDisclosureViewData r0 = new com.ss.android.ugc.aweme.ecommerce.anchor.utils.PanelTopDisclosureViewData
            r0.<init>(r1)
            java.lang.String r4 = X.C1741890vQh.LJIIIIZZ(r0)
        L5f:
            if (r4 == 0) goto L99
            boolean r0 = X.C770702zh.LIZIZ(r4)
            if (r0 != 0) goto L68
            r4 = r5
        L68:
            if (r4 == 0) goto L99
            org.json.JSONArray r3 = new org.json.JSONArray
            r3.<init>()
            org.json.JSONObject r2 = new org.json.JSONObject
            r2.<init>()
            java.lang.String r1 = "view_id"
            java.lang.String r0 = "anchor_panel_top_disclosure_label"
            r2.put(r1, r0)
            java.lang.String r0 = "view_data"
            r2.put(r0, r4)
            X.0vnk r0 = X.EnumC1756180vnk.HALF_SCREEN_TOP
            java.lang.String r1 = r0.getValue()
            java.lang.String r0 = "view_position"
            r2.put(r0, r1)
            java.lang.String r1 = "view_name"
            java.lang.String r0 = "creator_commission_label"
            r2.put(r1, r0)
            r3.put(r2)
            java.lang.String r5 = r3.toString()
        L99:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21272218Mm.LJ(com.ss.android.ugc.aweme.feed.model.Aweme):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.List<com.ss.android.ugc.aweme.ecommerce.model.AnchorProductInfoModel> LJIILIIL(com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct r59) {
        /*
            Method dump skipped, instruction units count: 264
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21272218Mm.LJIILIIL(com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct):java.util.List");
    }

    public static final Integer LJIIZILJ(AwemePruningModel awemePruningModel) {
        String str;
        AnonymousClass0317 anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin;
        int followStatus;
        User user;
        String name;
        if (awemePruningModel != null) {
            str = awemePruningModel.authorUid;
        } else {
            str = null;
        }
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            boolean z = false;
            anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin = AccountDependencyService.createIAccountDependencyServicebyMonsterPlugin(false);
            if (anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin != null) {
                z = true;
            }
            String name2 = IAccountDependencyService.class.getName();
            if (anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin != null) {
                name = anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin.getClass().getName();
            } else {
                name = null;
            }
            C1AQS.LIZJ(jElapsedRealtime, 1, name2, name, z);
        } else {
            C1120604Zw.LIZ.LIZ();
            anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IAccountDependencyService.class);
        }
        if (Intrinsics.LJFF(str, ((IAccountDependencyService) anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin).getUserId())) {
            return null;
        }
        if (awemePruningModel != null && (user = awemePruningModel.author) != null) {
            followStatus = user.getFollowStatus();
        } else {
            followStatus = -1;
        }
        return Integer.valueOf(followStatus);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String LJIJ(java.lang.String r4) {
        /*
            r3 = 0
            com.google.gson.Gson r2 = X.C1741890vQh.LJFF()     // Catch: com.google.gson.s -> L3b
            X.04Zw r0 = X.C1120604Zw.LIZ     // Catch: com.google.gson.s -> L3b
            r0.getClass()     // Catch: com.google.gson.s -> L3b
            X.04a9 r0 = X.C1120604Zw.LIZIZ()     // Catch: com.google.gson.s -> L3b
            if (r0 == 0) goto L16
            boolean r1 = r0.LJII     // Catch: com.google.gson.s -> L3b
            r0 = 1
            if (r1 != r0) goto L16
            goto L17
        L16:
            r0 = 0
        L17:
            if (r0 == 0) goto L1a
            goto L24
        L1a:
            X.18OM r0 = new X.18OM     // Catch: com.google.gson.s -> L3b
            r0.<init>()     // Catch: com.google.gson.s -> L3b
            java.lang.reflect.Type r0 = r0.getType()     // Catch: com.google.gson.s -> L3b
            goto L2e
        L24:
            java.lang.Class<com.google.gson.n> r0 = com.google.gson.n.class
            X.13JW r0 = X.C13LE.LJII(r0)     // Catch: com.google.gson.s -> L3b
            java.lang.reflect.Type r0 = X.C2371409Qy.LIZJ(r0)     // Catch: com.google.gson.s -> L3b
        L2e:
            java.lang.Object r1 = com.bytedance.mt.protector.impl.GsonProtectorUtils.fromJson(r2, r4, r0)     // Catch: com.google.gson.s -> L3b
            boolean r0 = r1 instanceof com.google.gson.n     // Catch: com.google.gson.s -> L3b
            if (r0 != 0) goto L37
            r1 = r3
        L37:
            com.google.gson.k r1 = (com.google.gson.k) r1     // Catch: com.google.gson.s -> L3b
            r3 = r1
            goto L3f
        L3b:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L3f:
            if (r3 == 0) goto L66
            com.google.gson.n r1 = r3.LJIILIIL()
            java.lang.String r0 = "extra"
            com.google.gson.k r1 = r1.LJJIIZ(r0)
            if (r1 == 0) goto L66
            boolean r0 = r1 instanceof com.google.gson.n
            if (r0 == 0) goto L66
            com.google.gson.n r1 = r1.LJIILIIL()
            java.lang.String r0 = "mix_product_type"
            com.google.gson.k r1 = r1.LJJIIZ(r0)
            if (r1 == 0) goto L66
            boolean r0 = r1 instanceof com.google.gson.m
            if (r0 != 0) goto L66
            java.lang.String r0 = r1.LJIL()
            return r0
        L66:
            java.lang.String r0 = ""
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21272218Mm.LJIJ(java.lang.String):java.lang.String");
    }

    public static final boolean LJJIFFI(Aweme aweme) {
        List<AnchorCommonStruct> anchors;
        if (aweme != null && (anchors = aweme.getAnchors()) != null) {
            Iterator<AnchorCommonStruct> it2 = anchors.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                AnchorCommonStruct next = it2.next();
                AnchorCommonStruct anchorCommonStruct = next;
                if (anchorCommonStruct.getType() == 35 && anchorCommonStruct.getExtra().length() > 0) {
                    if (next != null) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static final void LIZIZ(Map<String, String> map, Map<String, String> map2) {
        AnonymousClass0317 anonymousClass0317CreateIEcomSearchDependencyServicebyMonsterPlugin;
        String paramByName;
        boolean z;
        String name;
        String str = null;
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            anonymousClass0317CreateIEcomSearchDependencyServicebyMonsterPlugin = EcomSearchDependencyService.createIEcomSearchDependencyServicebyMonsterPlugin(false);
            if (anonymousClass0317CreateIEcomSearchDependencyServicebyMonsterPlugin != null) {
                z = true;
            } else {
                z = false;
            }
            String name2 = IEcomSearchDependencyService.class.getName();
            if (anonymousClass0317CreateIEcomSearchDependencyServicebyMonsterPlugin != null) {
                name = anonymousClass0317CreateIEcomSearchDependencyServicebyMonsterPlugin.getClass().getName();
            } else {
                name = null;
            }
            C1AQS.LIZJ(jElapsedRealtime, 1, name2, name, z);
        } else {
            C1120604Zw.LIZ.LIZ();
            anonymousClass0317CreateIEcomSearchDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IEcomSearchDependencyService.class);
        }
        IEcomSearchDependencyService iEcomSearchDependencyService = (IEcomSearchDependencyService) anonymousClass0317CreateIEcomSearchDependencyServicebyMonsterPlugin;
        if (!map.containsKey("search_entrance") && (paramByName = iEcomSearchDependencyService.getParamByName("search_entrance")) != null && C770702zh.LIZIZ(paramByName)) {
            map.put("search_entrance", paramByName);
        }
        String paramByName2 = iEcomSearchDependencyService.getParamByName("search_entrance_second");
        if (paramByName2 != null && C770702zh.LIZIZ(paramByName2)) {
            map.put("search_entrance_second", paramByName2);
        }
        String paramByName3 = iEcomSearchDependencyService.getParamByName("source_module");
        if (paramByName3 != null && C770702zh.LIZIZ(paramByName3)) {
            map.put("source_module", paramByName3);
        }
        if (Intrinsics.LJFF(iEcomSearchDependencyService.getParamByName("ec_inflow_scene"), "ecom_search")) {
            if (map2 != null) {
                str = map2.get("rank_inner");
            }
            Integer numLJIIJJI = C2095008Iq.LJIIJJI(String.valueOf(str));
            if (numLJIIJJI != null && numLJIIJJI.intValue() > 0) {
                LinkedHashMap linkedHashMap = (LinkedHashMap) map;
                if (linkedHashMap.get("list_item_id") != null) {
                    map.put("search_result_id", String.valueOf(linkedHashMap.get("list_item_id")));
                    map.remove("list_item_id");
                }
            }
        }
    }

    public static final String LJIIJJI(ProductListModel productListModel, boolean z) {
        AnchorCustomData anchorCustomData;
        Map<String, String> map;
        String str;
        if (z || productListModel == null || (anchorCustomData = productListModel.anchorCustomData) == null || (map = anchorCustomData.trackingData) == null || (str = map.get("entrance_form")) == null || str.length() <= 0) {
            return null;
        }
        return str;
    }

    public static final String LJIIL(Aweme aweme, boolean z) {
        AnchorCustomData anchorCustomData;
        Map<String, String> map;
        String str;
        if (z || aweme == null || (anchorCustomData = AwemeBizExtKt.getAnchorCustomData(aweme)) == null || (map = anchorCustomData.trackingData) == null || (str = map.get("entrance_form")) == null || str.length() <= 0) {
            return null;
        }
        return str;
    }

    public static final String LJIJI(String str, JSONObject jSONObject) {
        if (jSONObject.has(str)) {
            String string = JSONObjectProtectorUtils.getString(jSONObject, str);
            if (string.length() > 0) {
                return string;
            }
        }
        return null;
    }

    public static final String LJJII(List<AnchorProductInfoModel> list, List<AnchorCommonStruct> list2) {
        if (list != null && list.size() == 1 && list2 != null && list2.size() == 1) {
            return "yes";
        }
        return "no";
    }

    public static final AwemePruningModel LJJIJIL(Aweme aweme, String str) {
        try {
            String aid = aweme.getAid();
            String groupId = aweme.getGroupId();
            String requestId = aweme.getRequestId();
            List<AnchorCommonStruct> anchors = aweme.getAnchors();
            String authorUid = AwemeExtKt.getAuthorUid(aweme);
            User author = aweme.getAuthor();
            String awemeRawAdIdStr = AwemeExtKt.getAwemeRawAdIdStr(aweme);
            AnchorCustomData anchorCustomData = AwemeBizExtKt.getAnchorCustomData(aweme);
            Map<String, String> mapLIZIZ = C666580QCq.LIZIZ(aweme, "tiktokec_enter_product_detail", str, null);
            if (!(!((HashMap) mapLIZIZ).isEmpty())) {
                mapLIZIZ = null;
            }
            boolean zIsAd = aweme.isAd();
            return new AwemePruningModel(aid, groupId, requestId, anchors, authorUid, author, awemeRawAdIdStr, anchorCustomData, mapLIZIZ, aweme.getMobParams(), Boolean.valueOf(zIsAd), aweme.getAwemeRawAd(), str, 0L, AwemeBizExtKt.getShopAdStruct(aweme), aweme.getAnchorsExtras());
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return new AwemePruningModel(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0011  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0074  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.Map<java.lang.String, java.lang.String> LJIILJJIL(com.ss.android.ugc.aweme.ecommerce.model.AwemePruningModel r11, java.lang.String r12, java.util.Map<java.lang.String, java.lang.String> r13) {
        /*
            r2 = 0
            if (r11 == 0) goto L84
            com.ss.android.ugc.aweme.feed.model.AnchorCustomData r0 = r11.anchorCustomData
            if (r0 == 0) goto L84
            java.util.Map<java.lang.String, java.lang.String> r1 = r0.trackingData
        L9:
            java.util.Map<java.lang.String, java.lang.String> r0 = r11.awemeExtraParams
        Lb:
            boolean r3 = X.C034S.LIZ()
            if (r3 == 0) goto L74
            X.04Zw r3 = X.C1120604Zw.LIZ
            r3.LIZ()
            long r5 = android.os.SystemClock.elapsedRealtime()
            r10 = 0
            com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.search.ISearchDependencyService r3 = com.ss.android.ugc.aweme.ecommerce.dependency.search.SearchDependencyService.createISearchDependencyServicebyMonsterPlugin(r10)
            if (r3 == 0) goto L22
            r10 = 1
        L22:
            java.lang.Class<com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.search.ISearchDependencyService> r4 = com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.search.ISearchDependencyService.class
            java.lang.String r8 = r4.getName()
            r7 = 1
            if (r3 == 0) goto L72
            java.lang.Class r4 = r3.getClass()
            java.lang.String r9 = r4.getName()
        L33:
            X.C1AQS.LIZJ(r5, r7, r8, r9, r10)
        L36:
            com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.search.ISearchDependencyService r3 = (com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.search.ISearchDependencyService) r3
            java.lang.String r4 = "search_result_id"
            java.lang.String r5 = "search_id"
            java.lang.String r6 = "list_item_id"
            java.lang.String r7 = "last_from_group_id"
            java.lang.String r8 = "click_recom_search_entrance"
            java.lang.String r9 = "origin_is_mall_tab"
            java.lang.String r10 = "search_pre_product_id"
            java.lang.String r11 = "search_keyword"
            java.lang.String[] r4 = new java.lang.String[]{r4, r5, r6, r7, r8, r9, r10, r11}
            java.util.Map r3 = r3.getLogParamsFromSearch(r12, r2, r4)
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            r2.<init>()
            if (r1 == 0) goto L5a
            r2.putAll(r1)
        L5a:
            if (r0 == 0) goto L5f
            r2.putAll(r0)
        L5f:
            if (r3 == 0) goto L64
            r2.putAll(r3)
        L64:
            LIZIZ(r2, r13)
            java.lang.String r0 = "enter_from_info"
            r2.remove(r0)
            java.lang.String r0 = "source_page_type"
            r2.remove(r0)
            return r2
        L72:
            r9 = r2
            goto L33
        L74:
            X.04Zw r3 = X.C1120604Zw.LIZ
            r3.LIZ()
            X.04aq r4 = X.C1120604Zw.LIZJ
            java.lang.Class<com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.search.ISearchDependencyService> r3 = com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.search.ISearchDependencyService.class
            X.0317 r3 = r4.LIZLLL(r3)
            com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService r3 = (com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService) r3
            goto L36
        L84:
            r1 = r2
            if (r11 != 0) goto L9
            r0 = r2
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21272218Mm.LJIILJJIL(com.ss.android.ugc.aweme.ecommerce.model.AwemePruningModel, java.lang.String, java.util.Map):java.util.Map");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0120 A[PHI: r4
      0x0120: PHI (r4v1 java.util.Map<java.lang.String, java.lang.String>) = (r4v0 java.util.Map<java.lang.String, java.lang.String>), (r4v4 java.util.Map<java.lang.String, java.lang.String>) binds: [B:69:0x011c, B:8:0x000e] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.Map<java.lang.String, java.lang.String> LJIILLIIL(com.ss.android.ugc.aweme.ecommerce.model.ProductListModel r14, java.lang.String r15, java.lang.String r16) {
        /*
            Method dump skipped, instruction units count: 291
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21272218Mm.LJIILLIIL(com.ss.android.ugc.aweme.ecommerce.model.ProductListModel, java.lang.String, java.lang.String):java.util.Map");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x013c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.Map<java.lang.String, java.lang.String> LJIILL(com.ss.android.ugc.aweme.feed.model.Aweme r14, java.lang.String r15, java.lang.String r16, java.util.Map<java.lang.String, java.lang.String> r17) {
        /*
            Method dump skipped, instruction units count: 353
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21272218Mm.LJIILL(com.ss.android.ugc.aweme.feed.model.Aweme, java.lang.String, java.lang.String, java.util.Map):java.util.Map");
    }

    public static final ProductListModel LJJIJL(Aweme aweme, InterfaceC1392640mLO interfaceC1392640mLO, String str, AnchorPanelConfig anchorPanelConfig, String str2) {
        String aid;
        String groupId;
        String requestId;
        List<AnchorCommonStruct> anchors;
        String authorUid;
        User author;
        String awemeRawAdIdStr;
        AnchorCustomData anchorCustomData;
        String strCf;
        Map<String, String> mapLIZIZ;
        Boolean boolValueOf;
        AwemeRawAd awemeRawAd;
        HashMap<String, String> mobParams;
        String strCf2;
        ShopAdStruct shopAdStruct;
        Boolean boolValueOf2;
        Boolean boolValueOf3;
        AnchorPanelConfig anchorPanelConfig2 = anchorPanelConfig;
        List<AnchorCommonStruct> anchors2 = null;
        if (aweme != null) {
            try {
                aid = aweme.getAid();
                groupId = aweme.getGroupId();
                requestId = aweme.getRequestId();
                anchors = aweme.getAnchors();
                authorUid = AwemeExtKt.getAuthorUid(aweme);
                author = aweme.getAuthor();
                awemeRawAdIdStr = AwemeExtKt.getAwemeRawAdIdStr(aweme);
                anchorCustomData = AwemeBizExtKt.getAnchorCustomData(aweme);
                if (interfaceC1392640mLO != null) {
                    strCf = interfaceC1392640mLO.Cf();
                } else {
                    strCf = null;
                }
                mapLIZIZ = C666580QCq.LIZIZ(aweme, "tiktokec_enter_product_detail", strCf, null);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                return new ProductListModel(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new AnchorPanelConfig(0, "video_anchor", 0, false, 0, false, false, false, false, new LinkedHashMap()), null, null, null, new LinkedHashMap());
            }
        } else {
            aid = null;
            groupId = null;
            requestId = null;
            anchors = null;
            authorUid = null;
            author = null;
            awemeRawAdIdStr = null;
            anchorCustomData = null;
            mapLIZIZ = null;
        }
        if (mapLIZIZ == null || !(!mapLIZIZ.isEmpty())) {
            mapLIZIZ = null;
        }
        if (aweme != null) {
            boolValueOf = Boolean.valueOf(aweme.isAd());
            awemeRawAd = aweme.getAwemeRawAd();
            mobParams = aweme.getMobParams();
        } else {
            boolValueOf = null;
            awemeRawAd = null;
            mobParams = null;
        }
        if (interfaceC1392640mLO == null || (strCf2 = interfaceC1392640mLO.Cf()) == null) {
            strCf2 = str;
        }
        if (aweme != null) {
            shopAdStruct = AwemeBizExtKt.getShopAdStruct(aweme);
            boolValueOf2 = Boolean.valueOf(AwemeExtKt.isPhotoMode(aweme));
        } else {
            shopAdStruct = null;
            boolValueOf2 = null;
        }
        if (interfaceC1392640mLO != null) {
            boolValueOf3 = Boolean.valueOf(interfaceC1392640mLO.LJII());
        } else {
            boolValueOf3 = null;
        }
        if (anchorPanelConfig2 == null) {
            anchorPanelConfig2 = new AnchorPanelConfig(0, "video_anchor", 0, false, 0, false, false, false, false, new LinkedHashMap());
        }
        AnchorBizUtils anchorBizUtils = AnchorBizUtils.LIZ;
        if (aweme != null) {
            anchors2 = aweme.getAnchors();
        }
        anchorBizUtils.getClass();
        return new ProductListModel(aid, groupId, requestId, anchors, AnchorBizUtils.LJJZZIII(AnchorBizUtils.LJJIIZ(anchors2), false), authorUid, author, awemeRawAdIdStr, anchorCustomData, mapLIZIZ, mobParams, boolValueOf, awemeRawAd, strCf2, 0L, shopAdStruct, aweme, boolValueOf2, boolValueOf3, anchorPanelConfig2, str, null, str2, new LinkedHashMap());
    }

    public static String LJIL(AnchorProductInfoModel anchorProductInfoModel, Aweme aweme, String str, String str2, String str3, boolean z) {
        return LJJ(anchorProductInfoModel, LJJIJL(aweme, null, str2, null, null), str, str2, str3, z, null, null);
    }

    public static final String LJJIIJ(AnchorProductInfoModel anchorProductInfoModel, AwemePruningModel awemePruningModel, String str, String str2, String str3, List list) {
        Integer num;
        boolean zBooleanValue;
        Boolean boolIsAd;
        Integer num2 = anchorProductInfoModel.extraData.platform;
        if ((num2 == null || num2.intValue() != 5) && ((num = anchorProductInfoModel.extraData.platform) == null || num.intValue() != 6)) {
            return anchorProductInfoModel.extraData.schema;
        }
        try {
            Uri uri = UriProtector.parse(anchorProductInfoModel.extraData.schema);
            Uri.Builder builder = new Uri.Builder();
            builder.scheme(uri.getScheme());
            builder.authority(uri.getHost());
            builder.path(uri.getPath());
            for (String str4 : UriProtector.getQueryParameterNames(uri)) {
                if (Intrinsics.LJFF(str4, "requestParams")) {
                    JSONObject jSONObject = new JSONObject(UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, str4));
                    if (awemePruningModel != null && (boolIsAd = awemePruningModel.isAd()) != null) {
                        zBooleanValue = boolIsAd.booleanValue();
                    } else {
                        zBooleanValue = false;
                    }
                    jSONObject.put("is_ad", zBooleanValue);
                    builder.appendQueryParameter(str4, C786410Ut5.J3(jSONObject));
                } else if (!Intrinsics.LJFF(str4, "trackParams")) {
                    if (Intrinsics.LJFF(str4, "fullScreen")) {
                        builder.appendQueryParameter(str4, String.valueOf(true));
                    } else {
                        builder.appendQueryParameter(str4, UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, str4));
                    }
                }
            }
            builder.appendQueryParameter("trackParams", LJFF(anchorProductInfoModel, UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "trackParams"), awemePruningModel, str, str2, str3, list, true, null, false, null, 1792));
            if (!UriProtector.getQueryParameterNames(uri).contains("fullScreen")) {
                builder.appendQueryParameter("fullScreen", String.valueOf(true));
            }
            return builder.build().toString();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1507790pL7 c1507790pL7 = C1507790pL7.LIZ;
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("e_stack_trace", C08KI.LIZ(e));
            c2344009Gk.LJIIIIZZ("extra_data", "ShopWindowAnchorModel : " + anchorProductInfoModel);
            c2344009Gk.LJIIIIZZ("where", "ShopWindowAnchorModel");
            Map<String, String> map = c2344009Gk.LIZ;
            c1507790pL7.getClass();
            C1507790pL7.LIZJ("rd_tiktokec_shop_anchor_exception", map);
            return anchorProductInfoModel.extraData.schema;
        }
    }

    public static final String LJJIIZI(AnchorProductInfoModel anchorProductInfoModel, ProductListModel productListModel, String str, String str2, String str3, boolean z) {
        Integer num = anchorProductInfoModel.extraData.platform;
        if (num != null && num.intValue() == 100) {
            try {
                return UriProtector.parse(anchorProductInfoModel.extraData.schema).buildUpon().appendQueryParameter("trackParams", LJIIIIZZ(anchorProductInfoModel, UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(UriProtector.parse(anchorProductInfoModel.extraData.schema), "trackParams"), productListModel, str, str2, str3, z, null, null, null, null, null)).build().toString();
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                return anchorProductInfoModel.extraData.schema;
            }
        }
        return anchorProductInfoModel.extraData.schema;
    }

    public static final void LJJIJ(Context context, AnchorProductInfoModel anchorProductInfoModel, ProductListModel productListModel, String str, String str2, String str3) {
        String adPackageBundleName;
        Bundle bundle;
        AnonymousClass0317 anonymousClass0317CreateIBusinessDependencyServicebyMonsterPlugin;
        boolean z;
        AnonymousClass0317 anonymousClass0317CreateIAdDependencyServicebyMonsterPlugin;
        String logExtra;
        Long creativeId;
        boolean z2;
        String name;
        String strLJJIIZI = LJJIIZI(anchorProductInfoModel, productListModel, str, str2, str3, true);
        if (strLJJIIZI == null) {
            strLJJIIZI = "";
        }
        AnchorBizUtils.LIZ.getClass();
        String name2 = null;
        if (AnchorBizUtils.LJJJLIIL(productListModel)) {
            strLJJIIZI = UriProtector.parse(strLJJIIZI).buildUpon().appendQueryParameter("is_ad", "1").build().toString();
            if (C034S.LIZ()) {
                C1120604Zw.LIZ.LIZ();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                anonymousClass0317CreateIAdDependencyServicebyMonsterPlugin = AdDependencyService.createIAdDependencyServicebyMonsterPlugin(false);
                if (anonymousClass0317CreateIAdDependencyServicebyMonsterPlugin != null) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                String name3 = IAdDependencyService.class.getName();
                if (anonymousClass0317CreateIAdDependencyServicebyMonsterPlugin != null) {
                    name = anonymousClass0317CreateIAdDependencyServicebyMonsterPlugin.getClass().getName();
                } else {
                    name = null;
                }
                C1AQS.LIZJ(jElapsedRealtime, 1, name3, name, z2);
            } else {
                C1120604Zw.LIZ.LIZ();
                anonymousClass0317CreateIAdDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IAdDependencyService.class);
            }
            adPackageBundleName = ((IAdDependencyService) anonymousClass0317CreateIAdDependencyServicebyMonsterPlugin).getAdPackageBundleName();
            bundle = new Bundle();
            AwemeRawAd awemeRawAd = productListModel.awemeRawAd;
            if (awemeRawAd != null && (creativeId = awemeRawAd.getCreativeId()) != null) {
                bundle.putLong("ad_id", creativeId.longValue());
            }
            AwemeRawAd awemeRawAd2 = productListModel.awemeRawAd;
            if (awemeRawAd2 != null && (logExtra = awemeRawAd2.getLogExtra()) != null) {
                C786410Ut5.LJJJI("bundle_download_app_log_extra", logExtra, bundle);
            }
        } else {
            adPackageBundleName = null;
            bundle = null;
        }
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime2 = SystemClock.elapsedRealtime();
            anonymousClass0317CreateIBusinessDependencyServicebyMonsterPlugin = BusinessDependencyService.createIBusinessDependencyServicebyMonsterPlugin(false);
            if (anonymousClass0317CreateIBusinessDependencyServicebyMonsterPlugin != null) {
                z = true;
            } else {
                z = false;
            }
            String name4 = IBusinessDependencyService.class.getName();
            if (anonymousClass0317CreateIBusinessDependencyServicebyMonsterPlugin != null) {
                name2 = anonymousClass0317CreateIBusinessDependencyServicebyMonsterPlugin.getClass().getName();
            }
            C1AQS.LIZJ(jElapsedRealtime2, 1, name4, name2, z);
        } else {
            C1120604Zw.LIZ.LIZ();
            anonymousClass0317CreateIBusinessDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IBusinessDependencyService.class);
        }
        ((IBusinessDependencyService) anonymousClass0317CreateIBusinessDependencyServicebyMonsterPlugin).bulletStart(context, strLJJIIZI, adPackageBundleName, bundle);
    }

    public static final void LIZ(Integer num, String str, String str2, AnchorProductInfoModel anchorProductInfoModel, AwemePruningModel awemePruningModel, List<AnchorProductInfoModel> list, C957403oi c957403oi) {
        IECommerceHostService iECommerceHostService;
        String str3;
        HashMap<String, String> map;
        boolean z;
        String name;
        if (awemePruningModel == null) {
            return;
        }
        c957403oi.LIZLLL("EVENT_ORIGIN_FEATURE", "TEMAI");
        String str4 = awemePruningModel.aid;
        if (str4 == null) {
            str4 = "";
        }
        c957403oi.LIZLLL("group_id", str4);
        c957403oi.LIZLLL("is_ad", Integer.valueOf(Intrinsics.LJFF(awemePruningModel.isAd(), Boolean.TRUE) ? 1 : 0));
        String str5 = awemePruningModel.authorUid;
        if (str5 == null) {
            str5 = "";
        }
        c957403oi.LIZLLL("author_id", str5);
        String str6 = awemePruningModel.requestId;
        if (str6 == null) {
            str6 = "";
        }
        c957403oi.LIZLLL("request_id", str6);
        String str7 = awemePruningModel.eventType;
        if (str7 == null) {
            str7 = "";
        }
        c957403oi.LIZLLL("enter_from", str7);
        c957403oi.LIZLLL("anchor_show_type", "video_cart_tag");
        c957403oi.LIZLLL("product_source", String.valueOf(anchorProductInfoModel.extraData.platform));
        String str8 = anchorProductInfoModel.extraData.source;
        if (str8 == null) {
            str8 = "";
        }
        c957403oi.LIZLLL("source", str8);
        c957403oi.LIZLLL("product_id", String.valueOf(anchorProductInfoModel.extraData.productId));
        C21272018Mk.LIZ.getClass();
        c957403oi.LIZLLL("biz_type", C21272018Mk.LJIIJJI(anchorProductInfoModel));
        c957403oi.LIZLLL("anchor_type_cnt", Integer.valueOf(C21272018Mk.LJIIIZ(awemePruningModel.anchors)));
        String str9 = awemePruningModel.authorUid;
        int iIntValue = 0;
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            IAccountDependencyService iAccountDependencyServiceCreateIAccountDependencyServicebyMonsterPlugin = AccountDependencyService.createIAccountDependencyServicebyMonsterPlugin(false);
            if (iAccountDependencyServiceCreateIAccountDependencyServicebyMonsterPlugin != null) {
                z = true;
            } else {
                z = false;
            }
            String name2 = IAccountDependencyService.class.getName();
            if (iAccountDependencyServiceCreateIAccountDependencyServicebyMonsterPlugin != null) {
                name = iAccountDependencyServiceCreateIAccountDependencyServicebyMonsterPlugin.getClass().getName();
            } else {
                name = null;
            }
            C1AQS.LIZJ(jElapsedRealtime, 1, name2, name, z);
            iECommerceHostService = iAccountDependencyServiceCreateIAccountDependencyServicebyMonsterPlugin;
        } else {
            C1120604Zw.LIZ.LIZ();
            iECommerceHostService = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IAccountDependencyService.class);
        }
        c957403oi.LIZLLL("is_self", Integer.valueOf(Intrinsics.LJFF(str9, ((IAccountDependencyService) iECommerceHostService).getUserId()) ? 1 : 0));
        c957403oi.LIZLLL("is_single_anchor", "no");
        if (num != null) {
            c957403oi.LIZLLL("item_order", String.valueOf(num.intValue() + 1));
        }
        Integer numLJIIZILJ = LJIIZILJ(awemePruningModel);
        if (numLJIIZILJ != null) {
            iIntValue = numLJIIZILJ.intValue();
        }
        c957403oi.LIZLLL("follow_status", Integer.valueOf(iIntValue));
        if (str != null) {
            c957403oi.LIZLLL("track_id", str);
        }
        c957403oi.LIZLLL("source_page_type", "video");
        if (str2 != null) {
            c957403oi.LIZLLL("entrance_form", str2);
        }
        c957403oi.LIZLLL("page_name", "video_comment_shopping_list");
        String str10 = awemePruningModel.eventType;
        if (str == null) {
            str3 = "";
        } else {
            str3 = str;
        }
        c957403oi.LIZLLL("entrance_info", LJIJJ(anchorProductInfoModel, awemePruningModel, str10, str2, str3, list, true, null));
        c957403oi.LIZLLL("is_mix_product", LJIJ(anchorProductInfoModel.extra));
        Integer num2 = anchorProductInfoModel.extraData.productStatus;
        if (num2 != null && num2.intValue() == 70) {
            c957403oi.LIZLLL("shopping_status", "product_not_available");
        } else {
            c957403oi.LIZLLL("shopping_status", "product_available");
        }
        c957403oi.LJ(LJIILJJIL(awemePruningModel, awemePruningModel.eventType, awemePruningModel.mMobParams));
        if (str != null && (map = awemePruningModel.mMobParams) != null) {
            map.put("track_id", str);
        }
        HashMap<String, String> map2 = awemePruningModel.mMobParams;
        if (map2 != null) {
            for (Map.Entry<String, String> entry : map2.entrySet()) {
                if (entry.getValue() != null) {
                    String key = entry.getKey();
                    String value = entry.getValue();
                    if (value == null) {
                        value = "";
                    }
                    c957403oi.LIZLLL(key, value);
                }
            }
        }
        AnchorBizUtils anchorBizUtils = AnchorBizUtils.LIZ;
        VideoProductDaInfo videoProductDaInfo = anchorProductInfoModel.extraData.commonDaInfo;
        anchorBizUtils.getClass();
        Map<String, ? extends Object> mapLJJIZ = AnchorBizUtils.LJJIZ(videoProductDaInfo);
        if (mapLJJIZ != null) {
            c957403oi.LJ(mapLJJIZ);
        }
    }

    public static String LJIIJ(String str, AnchorProductInfoModel anchorProductInfoModel, String str2, Aweme aweme, String str3, String str4, boolean z) {
        try {
            Uri uri = UriProtector.parse(str);
            Uri.Builder builder = new Uri.Builder();
            builder.scheme(uri.getScheme());
            builder.authority(uri.getHost());
            builder.path(uri.getPath());
            Iterator<String> it2 = UriProtector.getQueryParameterNames(uri).iterator();
            while (true) {
                boolean zIsAd = false;
                if (!it2.hasNext()) {
                    break;
                }
                String next = it2.next();
                if (Intrinsics.LJFF(next, "requestParams")) {
                    JSONObject jSONObject = new JSONObject(UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, next));
                    if (aweme != null) {
                        zIsAd = aweme.isAd();
                    }
                    jSONObject.put("is_ad", zIsAd);
                    builder.appendQueryParameter(next, C786410Ut5.J3(jSONObject));
                } else if (!Intrinsics.LJFF(next, "trackParams")) {
                    if (Intrinsics.LJFF(next, "fullScreen")) {
                        builder.appendQueryParameter(next, String.valueOf(false));
                    } else {
                        builder.appendQueryParameter(next, UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, next));
                    }
                }
            }
            builder.appendQueryParameter("product_id", str2);
            builder.appendQueryParameter("click_from", "2");
            builder.appendQueryParameter("enter_from", str3);
            builder.appendQueryParameter("trackParams", LJII(anchorProductInfoModel, UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "trackParams"), aweme, str3, str4, z, null, 3584));
            builder.appendQueryParameter("previous_page", "video");
            if (!UriProtector.getQueryParameterNames(uri).contains("fullScreen")) {
                builder.appendQueryParameter("fullScreen", String.valueOf(false));
            }
            return builder.build().toString();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1507790pL7 c1507790pL7 = C1507790pL7.LIZ;
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("e_stack_trace", C08KI.LIZ(e));
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("ShopWindowAnchorModel : ");
            sbLIZ.append(anchorProductInfoModel);
            c2344009Gk.LJIIIIZZ("extra_data", C2188811AlT.LIZIZ(sbLIZ));
            c2344009Gk.LJIIIIZZ("where", "ShopWindowAnchorModel");
            Map<String, String> map = c2344009Gk.LIZ;
            c1507790pL7.getClass();
            C1507790pL7.LJFF("rd_tiktokec_shop_anchor_exception", map);
            return null;
        }
    }

    public static final String LJJIIJZLJL(AnchorProductInfoModel anchorProductInfoModel, Aweme aweme, boolean z, String str, String str2, String str3, boolean z2) {
        return LJJIIZ(anchorProductInfoModel, LJJIJL(aweme, null, str2, null, null), z, str, str2, str3, z2);
    }

    public static final String LJJIIZ(AnchorProductInfoModel anchorProductInfoModel, ProductListModel productListModel, boolean z, String str, String str2, String str3, boolean z2) {
        Integer num;
        String str4;
        String str5;
        Aweme aweme;
        C1735020vFc c1735020vFc;
        String string;
        String str6;
        boolean zBooleanValue;
        Boolean boolIsAd;
        Integer num2 = anchorProductInfoModel.extraData.platform;
        if ((num2 == null || num2.intValue() != 5) && ((num = anchorProductInfoModel.extraData.platform) == null || num.intValue() != 6)) {
            C1735020vFc c1735020vFc2 = C1735020vFc.LIZ;
            AnchorProductInfo anchorProductInfo = anchorProductInfoModel.extraData;
            String str7 = anchorProductInfo.schema;
            Long l = anchorProductInfo.productId;
            if (productListModel != null) {
                str4 = productListModel.aid;
            } else {
                str4 = null;
            }
            c1735020vFc2.getClass();
            return C1735020vFc.LJIIIZ(l, str7, str4);
        }
        try {
            Uri uri = UriProtector.parse(anchorProductInfoModel.extraData.schema);
            Uri.Builder builder = new Uri.Builder();
            builder.scheme(uri.getScheme());
            builder.authority(uri.getHost());
            builder.path(uri.getPath());
            for (String str8 : UriProtector.getQueryParameterNames(uri)) {
                if (Intrinsics.LJFF(str8, "requestParams")) {
                    JSONObject jSONObject = new JSONObject(UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, str8));
                    if (productListModel != null && (boolIsAd = productListModel.isAd()) != null) {
                        zBooleanValue = boolIsAd.booleanValue();
                    } else {
                        zBooleanValue = false;
                    }
                    jSONObject.put("is_ad", zBooleanValue);
                    builder.appendQueryParameter(str8, C786410Ut5.J3(jSONObject));
                } else if (!Intrinsics.LJFF(str8, "trackParams")) {
                    if (Intrinsics.LJFF(str8, "fullScreen")) {
                        builder.appendQueryParameter(str8, String.valueOf(z));
                    } else {
                        builder.appendQueryParameter(str8, UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, str8));
                    }
                }
            }
            try {
                builder.appendQueryParameter("trackParams", LJIIIIZZ(anchorProductInfoModel, UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "trackParams"), productListModel, str, str2, str3, z2, null, null, null, null, null));
                if (productListModel != null) {
                    aweme = productListModel.aweme;
                } else {
                    aweme = null;
                }
                builder.appendQueryParameter("container_params", LJ(aweme));
                if (!UriProtector.getQueryParameterNames(uri).contains("fullScreen")) {
                    builder.appendQueryParameter("fullScreen", String.valueOf(z));
                }
                c1735020vFc = C1735020vFc.LIZ;
                string = builder.build().toString();
            } catch (Exception e) {
                e = e;
            }
            try {
                Long l2 = anchorProductInfoModel.extraData.productId;
                if (productListModel != null) {
                    str6 = productListModel.aid;
                } else {
                    str6 = null;
                }
                c1735020vFc.getClass();
                return C1735020vFc.LJIIIZ(l2, string, str6);
            } catch (Exception e2) {
                e = e2;
                TryCatchGuardChecker.doCheck(e);
                C1507790pL7 c1507790pL7 = C1507790pL7.LIZ;
                C2344009Gk c2344009Gk = new C2344009Gk();
                c2344009Gk.LJIIIIZZ("e_stack_trace", C08KI.LIZ(e));
                c2344009Gk.LJIIIIZZ("extra_data", "ShopWindowAnchorModel : " + anchorProductInfoModel);
                c2344009Gk.LJIIIIZZ("where", "ShopWindowAnchorModel");
                Map<String, String> map = c2344009Gk.LIZ;
                c1507790pL7.getClass();
                C1507790pL7.LJFF("rd_tiktokec_shop_anchor_exception", map);
                C1735020vFc c1735020vFc3 = C1735020vFc.LIZ;
                AnchorProductInfo anchorProductInfo2 = anchorProductInfoModel.extraData;
                String str9 = anchorProductInfo2.schema;
                Long l3 = anchorProductInfo2.productId;
                if (productListModel != null) {
                    str5 = productListModel.aid;
                } else {
                    str5 = null;
                }
                c1735020vFc3.getClass();
                return C1735020vFc.LJIIIZ(l3, str9, str5);
            }
        } catch (Exception e3) {
            e = e3;
        }
    }

    public static final void LJJIJIIJI(Context context, AnchorProductInfoModel anchorProductInfoModel, AwemePruningModel awemePruningModel, String str, String str2, String str3, List list) {
        String string;
        String adPackageBundleName;
        Bundle bundle;
        AnonymousClass0317 anonymousClass0317CreateIBusinessDependencyServicebyMonsterPlugin;
        AnonymousClass0317 anonymousClass0317CreateIAdDependencyServicebyMonsterPlugin;
        String logExtra;
        Long creativeId;
        boolean z;
        String name;
        Integer num = anchorProductInfoModel.extraData.platform;
        if (num != null && num.intValue() == 100) {
            try {
                string = UriProtector.parse(anchorProductInfoModel.extraData.schema).buildUpon().appendQueryParameter("trackParams", LJFF(anchorProductInfoModel, UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(UriProtector.parse(anchorProductInfoModel.extraData.schema), "trackParams"), awemePruningModel, str, str2, str3, list, true, null, false, null, 1792)).build().toString();
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                string = anchorProductInfoModel.extraData.schema;
            }
        } else {
            string = anchorProductInfoModel.extraData.schema;
        }
        if (string == null) {
            string = "";
        }
        AnchorBizUtils.LIZ.getClass();
        boolean z2 = true;
        String name2 = null;
        if (AnchorBizUtils.LJJJJZI(awemePruningModel)) {
            string = UriProtector.parse(string).buildUpon().appendQueryParameter("is_ad", "1").build().toString();
            if (C034S.LIZ()) {
                C1120604Zw.LIZ.LIZ();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                anonymousClass0317CreateIAdDependencyServicebyMonsterPlugin = AdDependencyService.createIAdDependencyServicebyMonsterPlugin(false);
                if (anonymousClass0317CreateIAdDependencyServicebyMonsterPlugin != null) {
                    z = true;
                } else {
                    z = false;
                }
                String name3 = IAdDependencyService.class.getName();
                if (anonymousClass0317CreateIAdDependencyServicebyMonsterPlugin != null) {
                    name = anonymousClass0317CreateIAdDependencyServicebyMonsterPlugin.getClass().getName();
                } else {
                    name = null;
                }
                C1AQS.LIZJ(jElapsedRealtime, 1, name3, name, z);
            } else {
                C1120604Zw.LIZ.LIZ();
                anonymousClass0317CreateIAdDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IAdDependencyService.class);
            }
            adPackageBundleName = ((IAdDependencyService) anonymousClass0317CreateIAdDependencyServicebyMonsterPlugin).getAdPackageBundleName();
            bundle = new Bundle();
            AwemeRawAd awemeRawAd = awemePruningModel.awemeRawAd;
            if (awemeRawAd != null && (creativeId = awemeRawAd.getCreativeId()) != null) {
                bundle.putLong("ad_id", creativeId.longValue());
            }
            AwemeRawAd awemeRawAd2 = awemePruningModel.awemeRawAd;
            if (awemeRawAd2 != null && (logExtra = awemeRawAd2.getLogExtra()) != null) {
                C786410Ut5.LJJJI("bundle_download_app_log_extra", logExtra, bundle);
            }
        } else {
            adPackageBundleName = null;
            bundle = null;
        }
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime2 = SystemClock.elapsedRealtime();
            anonymousClass0317CreateIBusinessDependencyServicebyMonsterPlugin = BusinessDependencyService.createIBusinessDependencyServicebyMonsterPlugin(false);
            if (anonymousClass0317CreateIBusinessDependencyServicebyMonsterPlugin == null) {
                z2 = false;
            }
            String name4 = IBusinessDependencyService.class.getName();
            if (anonymousClass0317CreateIBusinessDependencyServicebyMonsterPlugin != null) {
                name2 = anonymousClass0317CreateIBusinessDependencyServicebyMonsterPlugin.getClass().getName();
            }
            C1AQS.LIZJ(jElapsedRealtime2, 1, name4, name2, z2);
        } else {
            C1120604Zw.LIZ.LIZ();
            anonymousClass0317CreateIBusinessDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IBusinessDependencyService.class);
        }
        ((IBusinessDependencyService) anonymousClass0317CreateIBusinessDependencyServicebyMonsterPlugin).bulletStart(context, string, adPackageBundleName, bundle);
    }

    public static final void LJJIJIIJIL(Activity activity, AnchorProductInfoModel anchorProductInfoModel, ProductListModel productListModel, String str, String str2, String str3, boolean z) {
        String adPackageBundleName;
        Bundle bundle;
        AnonymousClass0317 anonymousClass0317CreateIBusinessDependencyServicebyMonsterPlugin;
        boolean z2;
        AnonymousClass0317 anonymousClass0317CreateIAdDependencyServicebyMonsterPlugin;
        String logExtra;
        Long creativeId;
        boolean z3;
        String name;
        if (activity == null) {
            return;
        }
        String strLJJIIZI = LJJIIZI(anchorProductInfoModel, productListModel, str, str2, str3, z);
        if (strLJJIIZI == null) {
            strLJJIIZI = "";
        }
        AnchorBizUtils.LIZ.getClass();
        String name2 = null;
        if (AnchorBizUtils.LJJJLIIL(productListModel)) {
            strLJJIIZI = UriProtector.parse(strLJJIIZI).buildUpon().appendQueryParameter("is_ad", "1").build().toString();
            if (C034S.LIZ()) {
                C1120604Zw.LIZ.LIZ();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                anonymousClass0317CreateIAdDependencyServicebyMonsterPlugin = AdDependencyService.createIAdDependencyServicebyMonsterPlugin(false);
                if (anonymousClass0317CreateIAdDependencyServicebyMonsterPlugin != null) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                String name3 = IAdDependencyService.class.getName();
                if (anonymousClass0317CreateIAdDependencyServicebyMonsterPlugin != null) {
                    name = anonymousClass0317CreateIAdDependencyServicebyMonsterPlugin.getClass().getName();
                } else {
                    name = null;
                }
                C1AQS.LIZJ(jElapsedRealtime, 1, name3, name, z3);
            } else {
                C1120604Zw.LIZ.LIZ();
                anonymousClass0317CreateIAdDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IAdDependencyService.class);
            }
            adPackageBundleName = ((IAdDependencyService) anonymousClass0317CreateIAdDependencyServicebyMonsterPlugin).getAdPackageBundleName();
            bundle = new Bundle();
            AwemeRawAd awemeRawAd = productListModel.awemeRawAd;
            if (awemeRawAd != null && (creativeId = awemeRawAd.getCreativeId()) != null) {
                bundle.putLong("ad_id", creativeId.longValue());
            }
            AwemeRawAd awemeRawAd2 = productListModel.awemeRawAd;
            if (awemeRawAd2 != null && (logExtra = awemeRawAd2.getLogExtra()) != null) {
                C786410Ut5.LJJJI("bundle_download_app_log_extra", logExtra, bundle);
            }
        } else {
            adPackageBundleName = null;
            bundle = null;
        }
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime2 = SystemClock.elapsedRealtime();
            anonymousClass0317CreateIBusinessDependencyServicebyMonsterPlugin = BusinessDependencyService.createIBusinessDependencyServicebyMonsterPlugin(false);
            if (anonymousClass0317CreateIBusinessDependencyServicebyMonsterPlugin != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            String name4 = IBusinessDependencyService.class.getName();
            if (anonymousClass0317CreateIBusinessDependencyServicebyMonsterPlugin != null) {
                name2 = anonymousClass0317CreateIBusinessDependencyServicebyMonsterPlugin.getClass().getName();
            }
            C1AQS.LIZJ(jElapsedRealtime2, 1, name4, name2, z2);
        } else {
            C1120604Zw.LIZ.LIZ();
            anonymousClass0317CreateIBusinessDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IBusinessDependencyService.class);
        }
        ((IBusinessDependencyService) anonymousClass0317CreateIBusinessDependencyServicebyMonsterPlugin).bulletStart(activity, strLJJIIZI, adPackageBundleName, bundle);
    }

    public static String LJII(AnchorProductInfoModel anchorProductInfoModel, String str, Aweme aweme, String str2, String str3, boolean z, Map map, int i) {
        String str4;
        Map map2 = map;
        boolean z2 = z;
        if ((i & 64) != 0) {
            z2 = true;
        }
        if ((i & 128) != 0) {
            str4 = null;
        } else {
            str4 = "video";
        }
        if ((i & 256) != 0) {
            map2 = null;
        }
        return LJIIIIZZ(anchorProductInfoModel, str, LJJIJL(aweme, null, str3, null, null), str2, str3, "", z2, str4, map2, null, null, null);
    }

    public static final String LJIJJ(AnchorProductInfoModel anchorProductInfoModel, AwemePruningModel awemePruningModel, String str, String str2, String str3, List<AnchorProductInfoModel> list, boolean z, Map<String, String> map) {
        try {
            return LJFF(anchorProductInfoModel, UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(UriProtector.parse(anchorProductInfoModel.extraData.schema), "trackParams"), awemePruningModel, str, str2, str3, list, z, null, false, map, 768);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return "";
        }
    }

    public static final String LJJ(AnchorProductInfoModel anchorProductInfoModel, ProductListModel productListModel, String str, String str2, String str3, boolean z, Map<String, String> map, String str4) {
        try {
            return LJIIIIZZ(anchorProductInfoModel, UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(UriProtector.parse(anchorProductInfoModel.extraData.schema), "trackParams"), productListModel, str, str2, str3, z, null, null, map, null, str4);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return "";
        }
    }

    public static final String LJJIII(AnchorProductInfoModel anchorProductInfoModel, ProductListModel productListModel, boolean z, String str, String str2, String str3, int i, int[] iArr) {
        Integer num;
        Boolean boolIsAd;
        Integer num2 = anchorProductInfoModel.extraData.platform;
        if ((num2 == null || num2.intValue() != 5) && ((num = anchorProductInfoModel.extraData.platform) == null || num.intValue() != 6)) {
            return anchorProductInfoModel.extraData.schema;
        }
        try {
            Uri uri = UriProtector.parse(anchorProductInfoModel.extraData.schema);
            Uri.Builder builder = new Uri.Builder();
            builder.scheme(uri.getScheme());
            builder.authority(uri.getHost());
            builder.path(uri.getPath());
            for (String str4 : UriProtector.getQueryParameterNames(uri)) {
                boolean zBooleanValue = false;
                if (Intrinsics.LJFF(str4, "requestParams")) {
                    JSONObject jSONObject = new JSONObject(UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, str4));
                    if (productListModel != null && (boolIsAd = productListModel.isAd()) != null) {
                        zBooleanValue = boolIsAd.booleanValue();
                    }
                    jSONObject.put("is_ad", zBooleanValue);
                    builder.appendQueryParameter(str4, C786410Ut5.J3(jSONObject));
                } else if (!Intrinsics.LJFF(str4, "trackParams")) {
                    if (Intrinsics.LJFF(str4, "fullScreen")) {
                        if (((Boolean) C268590Afp.LIZ.getValue()).booleanValue()) {
                            if (productListModel != null) {
                                zBooleanValue = Intrinsics.LJFF(productListModel.isAd(), Boolean.TRUE);
                            }
                            if (zBooleanValue && Intrinsics.LJFF(UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, str4), "true")) {
                                builder.appendQueryParameter(str4, UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, str4));
                            }
                        }
                        builder.appendQueryParameter(str4, String.valueOf(z));
                    } else {
                        builder.appendQueryParameter(str4, UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, str4));
                    }
                }
            }
            Aweme aweme = null;
            builder.appendQueryParameter("trackParams", LJI(anchorProductInfoModel, UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "trackParams"), productListModel, str, str2, str3, Integer.valueOf(i), iArr, null, SpeechEngineDefines.ASR_WORK_MODE_OFFLINE));
            SettingsManager.LIZLLL().getClass();
            String str5 = null;
            if (SettingsManager.LIZ("ec_sv_should_show_top_disclosure_label", true)) {
                if (productListModel != null) {
                    aweme = productListModel.aweme;
                }
                String strLJ = LJ(aweme);
                if (strLJ != null) {
                    builder.appendQueryParameter("container_params", strLJ);
                }
            }
            if (!UriProtector.getQueryParameterNames(uri).contains("fullScreen")) {
                builder.appendQueryParameter("fullScreen", String.valueOf(z));
            }
            String string = builder.build().toString();
            C1735020vFc c1735020vFc = C1735020vFc.LIZ;
            Long l = anchorProductInfoModel.extraData.productId;
            if (productListModel != null) {
                str5 = productListModel.aid;
            }
            c1735020vFc.getClass();
            String strLJIIIZ = C1735020vFc.LJIIIZ(l, string, str5);
            if (strLJIIIZ != null) {
                return strLJIIIZ;
            }
            return string;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1507790pL7 c1507790pL7 = C1507790pL7.LIZ;
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("e_stack_trace", C08KI.LIZ(e));
            c2344009Gk.LJIIIIZZ("extra_data", "ShopWindowAnchorModel : " + anchorProductInfoModel);
            c2344009Gk.LJIIIIZZ("where", "ShopWindowAnchorModel");
            Map<String, String> map = c2344009Gk.LIZ;
            c1507790pL7.getClass();
            C1507790pL7.LIZJ("rd_tiktokec_shop_anchor_exception", map);
            return anchorProductInfoModel.extraData.schema;
        }
    }

    public static String LJI(AnchorProductInfoModel anchorProductInfoModel, String str, ProductListModel productListModel, String str2, String str3, String str4, Integer num, int[] iArr, Map map, int i) throws JSONException {
        TrackParams trackParams;
        List<AnchorProductInfoModel> list;
        List<AnchorCommonStruct> list2;
        boolean z;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        Map<String, String> map2;
        Map<String, String> map3;
        AwemeRawAd awemeRawAd;
        boolean z2;
        IECommerceHostService iECommerceHostService;
        JSONObject jSONObject;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        HashMap<String, String> map4;
        boolean z12;
        boolean z13;
        String name;
        Aweme aweme;
        AnchorCustomData anchorCustomData;
        HashMap<String, String> map5;
        HashMap<String, String> map6;
        HashMap<String, String> map7;
        HashMap<String, String> map8;
        HashMap<String, String> map9;
        AwemeRawAd awemeRawAd2;
        Long creativeId;
        AwemeRawAd awemeRawAd3;
        Long adId;
        String str10;
        IECommerceHostService iECommerceHostService2;
        boolean z14;
        String name2;
        User user;
        AnchorProductInfo anchorProductInfo;
        Integer num2;
        AnchorProductInfo anchorProductInfo2;
        Long l;
        AnchorProductInfo anchorProductInfo3;
        boolean z15;
        Type type;
        Map map10 = map;
        int[] iArr2 = iArr;
        Integer num3 = num;
        HashMap<String, String> map11 = null;
        if ((i & 512) != 0) {
            num3 = null;
        }
        if ((i & 1024) != 0) {
            iArr2 = null;
        }
        if ((i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            map10 = null;
        }
        try {
            Gson gsonLJFF = C1741890vQh.LJFF();
            C1120604Zw.LIZ.getClass();
            C1121904a9 c1121904a9LIZIZ = C1120604Zw.LIZIZ();
            if (c1121904a9LIZIZ != null && c1121904a9LIZIZ.LJII) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (z15) {
                type = C2371409Qy.LIZJ(C13LE.LJ(TrackParams.class));
            } else {
                type = new TypeToken<TrackParams>() { // from class: X.18Os
                }.getType();
            }
            Object objFromJson = GsonProtectorUtils.fromJson(gsonLJFF, str, type);
            if (!(objFromJson instanceof TrackParams)) {
                objFromJson = null;
            }
            trackParams = (TrackParams) objFromJson;
        } catch (s e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("trackParams : ");
            sbLIZ.append(str);
            C1421105hJ.LIZLLL("rd_tiktokec_shop_anchor_exception", new Pair("e_stack_trace", C08KI.LIZ(e)), new Pair("extra_data", C2188811AlT.LIZIZ(sbLIZ)), new Pair("where", "ShopWindowAnchorModel"));
            trackParams = null;
        }
        if (trackParams == null) {
            trackParams = new TrackParams(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
        }
        trackParams.track_id = str4;
        String str11 = trackParams.anchor_show_type;
        if (str11 == null) {
            str11 = "video_cart_tag";
        }
        trackParams.anchor_show_type = str11;
        String str12 = trackParams.author_id;
        if (str12 == null) {
            if (productListModel != null) {
                str12 = productListModel.authorUid;
            } else {
                str12 = null;
            }
        }
        trackParams.author_id = str12;
        String str13 = trackParams.enter_from_info;
        if (str13 == null) {
            str13 = str2;
        }
        trackParams.enter_from_info = str13;
        String strValueOf = trackParams.product_id;
        if (strValueOf == null) {
            if (anchorProductInfoModel != null && (anchorProductInfo3 = anchorProductInfoModel.extraData) != null) {
                l = anchorProductInfo3.productId;
            } else {
                l = null;
            }
            strValueOf = String.valueOf(l);
        }
        trackParams.product_id = strValueOf;
        String strValueOf2 = trackParams.product_source;
        if (strValueOf2 == null) {
            if (anchorProductInfoModel != null && (anchorProductInfo2 = anchorProductInfoModel.extraData) != null) {
                num2 = anchorProductInfo2.platform;
            } else {
                num2 = null;
            }
            strValueOf2 = String.valueOf(num2);
        }
        trackParams.product_source = strValueOf2;
        String str14 = trackParams.source_content_id;
        if (str14 == null) {
            if (productListModel != null) {
                str14 = productListModel.aid;
            } else {
                str14 = null;
            }
        }
        trackParams.source_content_id = str14;
        String str15 = trackParams.source_page_type;
        if (str15 == null) {
            str15 = "video";
        }
        trackParams.source_page_type = str15;
        String str16 = trackParams.source;
        if (str16 == null) {
            if (anchorProductInfoModel != null && (anchorProductInfo = anchorProductInfoModel.extraData) != null) {
                str16 = anchorProductInfo.source;
            } else {
                str16 = null;
            }
        }
        trackParams.source = str16;
        String str17 = trackParams.entrance_form;
        if (str17 == null) {
            str17 = str3;
        }
        trackParams.entrance_form = str17;
        String string = trackParams.follow_status;
        if (string == null && (productListModel == null || (user = productListModel.author) == null || (string = Integer.valueOf(user.getFollowStatus()).toString()) == null)) {
            string = "-1";
        }
        trackParams.follow_status = string;
        String str18 = trackParams.request_id;
        if (str18 == null) {
            if (productListModel != null) {
                str18 = productListModel.requestId;
            } else {
                str18 = null;
            }
        }
        trackParams.request_id = str18;
        Integer numValueOf = trackParams.is_self;
        if (numValueOf == null) {
            if (productListModel != null) {
                str10 = productListModel.authorUid;
            } else {
                str10 = null;
            }
            if (C034S.LIZ()) {
                C1120604Zw.LIZ.LIZ();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                IAccountDependencyService iAccountDependencyServiceCreateIAccountDependencyServicebyMonsterPlugin = AccountDependencyService.createIAccountDependencyServicebyMonsterPlugin(false);
                if (iAccountDependencyServiceCreateIAccountDependencyServicebyMonsterPlugin != null) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                String name3 = IAccountDependencyService.class.getName();
                if (iAccountDependencyServiceCreateIAccountDependencyServicebyMonsterPlugin != null) {
                    name2 = iAccountDependencyServiceCreateIAccountDependencyServicebyMonsterPlugin.getClass().getName();
                } else {
                    name2 = null;
                }
                C1AQS.LIZJ(jElapsedRealtime, 1, name3, name2, z14);
                iECommerceHostService2 = iAccountDependencyServiceCreateIAccountDependencyServicebyMonsterPlugin;
            } else {
                C1120604Zw.LIZ.LIZ();
                iECommerceHostService2 = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IAccountDependencyService.class);
            }
            numValueOf = Integer.valueOf(Intrinsics.LJFF(str10, ((IAccountDependencyService) iECommerceHostService2).getUserId()) ? 1 : 0);
        }
        trackParams.is_self = numValueOf;
        if (productListModel != null) {
            list = productListModel.products;
        } else {
            list = null;
        }
        if (productListModel != null) {
            list2 = productListModel.anchors;
        } else {
            list2 = null;
        }
        trackParams.is_single_anchor = LJJII(list, list2);
        if (map10 != null && map10.containsKey("search_entrance")) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            String str19 = (String) map10.get("search_entrance");
            if (str19 == null) {
                str19 = "";
            }
            trackParams.search_entrance = str19;
        }
        Integer numValueOf2 = trackParams.is_ad;
        if (numValueOf2 == null) {
            AnchorBizUtils.LIZ.getClass();
            numValueOf2 = Integer.valueOf(AnchorBizUtils.LJJJLIIL(productListModel) ? 1 : 0);
        }
        trackParams.is_ad = numValueOf2;
        String string2 = trackParams.ad_id;
        if (string2 == null) {
            AnchorBizUtils.LIZ.getClass();
            if (AnchorBizUtils.LJJJLIIL(productListModel) && (awemeRawAd3 = productListModel.awemeRawAd) != null && (adId = awemeRawAd3.getAdId()) != null) {
                string2 = adId.toString();
            } else {
                string2 = null;
            }
        }
        trackParams.ad_id = string2;
        String string3 = trackParams.creativeId;
        if (string3 == null) {
            AnchorBizUtils.LIZ.getClass();
            if (AnchorBizUtils.LJJJLIIL(productListModel) && (awemeRawAd2 = productListModel.awemeRawAd) != null && (creativeId = awemeRawAd2.getCreativeId()) != null) {
                string3 = creativeId.toString();
            } else {
                string3 = null;
            }
        }
        trackParams.creativeId = string3;
        trackParams.previous_page = null;
        trackParams.enter_from = str2;
        String str20 = trackParams.source_content_id;
        if (str20 == null) {
            if (productListModel != null) {
                str20 = productListModel.aid;
            } else {
                str20 = null;
            }
        }
        trackParams.list_item_id = str20;
        if (productListModel != null && (map9 = productListModel.mobParams) != null) {
            str5 = map9.get("source_module");
        } else {
            str5 = null;
        }
        trackParams.sourceModule = str5;
        trackParams.traffic_source_list = iArr2;
        trackParams.anchor_anim_type = num3;
        if (productListModel != null && (map8 = productListModel.mobParams) != null) {
            str6 = map8.get("action_type");
        } else {
            str6 = null;
        }
        trackParams.action_type = str6;
        if (productListModel != null && (map7 = productListModel.mobParams) != null) {
            str7 = map7.get("is_inner");
        } else {
            str7 = null;
        }
        trackParams.is_inner = str7;
        if (productListModel != null && (map6 = productListModel.mobParams) != null) {
            str8 = map6.get("inner_search_id");
        } else {
            str8 = null;
        }
        trackParams.inner_search_id = str8;
        if (productListModel != null && (map5 = productListModel.mobParams) != null) {
            str9 = map5.get("rank_inner");
        } else {
            str9 = null;
        }
        trackParams.rank_inner = str9;
        if (productListModel == null || (anchorCustomData = productListModel.anchorCustomData) == null || (map2 = anchorCustomData.trackingData) == null || !(!map2.isEmpty())) {
            map2 = null;
        }
        if (productListModel != null) {
            map3 = productListModel.awemeExtraParams;
        } else {
            map3 = null;
        }
        C1002860cCi c1002860cCi = C1002860cCi.LIZ;
        if (productListModel != null && (aweme = productListModel.aweme) != null) {
            awemeRawAd = aweme.getAwemeRawAd();
        } else {
            awemeRawAd = null;
        }
        c1002860cCi.getClass();
        Map mapLIZ = C1002860cCi.LIZ(awemeRawAd);
        if (mapLIZ != null && (!mapLIZ.isEmpty())) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2) {
            mapLIZ = null;
        }
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime2 = SystemClock.elapsedRealtime();
            ISearchDependencyService iSearchDependencyServiceCreateISearchDependencyServicebyMonsterPlugin = SearchDependencyService.createISearchDependencyServicebyMonsterPlugin(false);
            if (iSearchDependencyServiceCreateISearchDependencyServicebyMonsterPlugin != null) {
                z13 = true;
            } else {
                z13 = false;
            }
            String name4 = ISearchDependencyService.class.getName();
            if (iSearchDependencyServiceCreateISearchDependencyServicebyMonsterPlugin != null) {
                name = iSearchDependencyServiceCreateISearchDependencyServicebyMonsterPlugin.getClass().getName();
            } else {
                name = null;
            }
            C1AQS.LIZJ(jElapsedRealtime2, 1, name4, name, z13);
            iECommerceHostService = iSearchDependencyServiceCreateISearchDependencyServicebyMonsterPlugin;
        } else {
            C1120604Zw.LIZ.LIZ();
            iECommerceHostService = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(ISearchDependencyService.class);
        }
        Map<String, String> mapFetchSearchParams = ((ISearchDependencyService) iECommerceHostService).fetchSearchParams(str2, "");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, String> entry : mapFetchSearchParams.entrySet()) {
            String key = entry.getKey();
            if (!Intrinsics.LJFF(key, "search_id") && !Intrinsics.LJFF(key, "search_result_id") && !Intrinsics.LJFF(key, "last_from_group_id") && !Intrinsics.LJFF(key, "origin_is_mall_tab") && !Intrinsics.LJFF(key, "search_pre_product_id") && !Intrinsics.LJFF(key, "search_keyword")) {
                z12 = false;
            } else {
                z12 = true;
            }
            if (z12) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        if (!(!linkedHashMap.isEmpty())) {
            linkedHashMap = null;
        }
        if (map2 == null && map3 == null && linkedHashMap == null && mapLIZ == null) {
            jSONObject = null;
        } else {
            try {
                jSONObject = new JSONObject(C1741890vQh.LJIIIIZZ(trackParams));
            } catch (JSONException e2) {
                TryCatchGuardChecker.doCheck(e2);
                jSONObject = null;
            }
            if (jSONObject != null) {
                if (map2 != null) {
                    for (Map.Entry<String, String> entry2 : map2.entrySet()) {
                        String key2 = entry2.getKey();
                        String value = entry2.getValue();
                        if (key2.length() == 0) {
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                        if (!z9) {
                            if (value.length() == 0) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (!z10) {
                                LIZJ(key2);
                                if (jSONObject.optString(key2).length() == 0) {
                                    z11 = true;
                                } else {
                                    z11 = false;
                                }
                                if (z11) {
                                    jSONObject.put(key2, value);
                                }
                            }
                        }
                    }
                }
                String strOptString = jSONObject.optString("enter_from_info");
                if (map3 != null) {
                    for (Map.Entry<String, String> entry3 : map3.entrySet()) {
                        String key3 = entry3.getKey();
                        String value2 = entry3.getValue();
                        if (key3.length() == 0) {
                            z7 = true;
                        } else {
                            z7 = false;
                        }
                        if (!z7) {
                            if (value2.length() == 0) {
                                z8 = true;
                            } else {
                                z8 = false;
                            }
                            if (!z8 && LIZJ(key3)) {
                                if (Intrinsics.LJFF(key3, "enter_from") && Intrinsics.LJFF(strOptString, "search_result")) {
                                    jSONObject.put("enter_from_info", value2);
                                } else if (Intrinsics.LJFF(key3, "enter_method")) {
                                    jSONObject.put("enter_method", value2);
                                }
                            }
                        }
                    }
                }
                if (linkedHashMap != null) {
                    for (Map.Entry entry4 : linkedHashMap.entrySet()) {
                        String str21 = (String) entry4.getKey();
                        String str22 = (String) entry4.getValue();
                        if (str21.length() == 0) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        if (!z5) {
                            if (str22.length() == 0) {
                                z6 = true;
                            } else {
                                z6 = false;
                            }
                            if (!z6) {
                                jSONObject.put(str21, str22);
                            }
                        }
                    }
                }
                if (mapLIZ != null) {
                    for (Map.Entry entry5 : mapLIZ.entrySet()) {
                        String str23 = (String) entry5.getKey();
                        String str24 = (String) entry5.getValue();
                        if (str23.length() == 0) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (!z3) {
                            if (str24.length() == 0) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            if (!z4) {
                                jSONObject.put(str23, str24);
                            }
                        }
                    }
                }
            }
        }
        LIZLLL(jSONObject);
        if (jSONObject != null) {
            if (productListModel != null) {
                map4 = productListModel.mobParams;
            } else {
                map4 = null;
            }
            String strLIZ = C1277804zI.LIZ(jSONObject, map4);
            if (strLIZ != null) {
                return strLIZ;
            }
        }
        String strLJIIIIZZ = C1741890vQh.LJIIIIZZ(trackParams);
        if (productListModel != null) {
            map11 = productListModel.mobParams;
        }
        return C1277804zI.LIZ(new JSONObject(strLJIIIIZZ), map11);
    }

    /* JADX WARN: Removed duplicated region for block: B:244:0x03d3  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x03ed  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x03e0 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String LJFF(com.ss.android.ugc.aweme.ecommerce.model.AnchorProductInfoModel r48, java.lang.String r49, com.ss.android.ugc.aweme.ecommerce.model.AwemePruningModel r50, java.lang.String r51, java.lang.String r52, java.lang.String r53, java.util.List r54, boolean r55, java.lang.String r56, boolean r57, java.util.Map r58, int r59) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 1159
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21272218Mm.LJFF(com.ss.android.ugc.aweme.ecommerce.model.AnchorProductInfoModel, java.lang.String, com.ss.android.ugc.aweme.ecommerce.model.AwemePruningModel, java.lang.String, java.lang.String, java.lang.String, java.util.List, boolean, java.lang.String, boolean, java.util.Map, int):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:314:0x04d8  */
    /* JADX WARN: Removed duplicated region for block: B:321:0x04f2  */
    /* JADX WARN: Removed duplicated region for block: B:395:0x04e5 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String LJIIIIZZ(com.ss.android.ugc.aweme.ecommerce.model.AnchorProductInfoModel r49, java.lang.String r50, com.ss.android.ugc.aweme.ecommerce.model.ProductListModel r51, java.lang.String r52, java.lang.String r53, java.lang.String r54, boolean r55, java.lang.String r56, java.util.Map<java.lang.String, ? extends java.lang.Object> r57, java.util.Map<java.lang.String, java.lang.String> r58, java.lang.Integer r59, java.lang.String r60) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 1486
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21272218Mm.LJIIIIZZ(com.ss.android.ugc.aweme.ecommerce.model.AnchorProductInfoModel, java.lang.String, com.ss.android.ugc.aweme.ecommerce.model.ProductListModel, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, java.util.Map, java.util.Map, java.lang.Integer, java.lang.String):java.lang.String");
    }
}
