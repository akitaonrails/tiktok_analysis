package X;

import android.content.Context;
import android.net.Uri;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.CreatorProductListLynxConfigSettings;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.settings.AnchorLiveBagListOptConfig;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS320S0000000_32;
import kotlin.jvm.internal.AwS681S0100000_32;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.17zX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21210917zX {
    public static final C21210917zX LIZ = new C21210917zX();
    public static final C054G LIZIZ = C2296808zG.LIZ(C09A1.LIZLLL(C2296908zH.LIZ(), C0PEM.LIZJ));

    public static Map LIZ(Map map) {
        String string;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("traffic_source_list", C1741890vQh.LJIIIIZZ(C1742080vR0.LIZJ(1, null)));
        Set setLJLIIL = C13LQ.LJLIIL(new String[]{"page_size", "page", "sort", "filters", "full_data", "condition_voucher_type_id", "kol_id"});
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                Object key = entry.getKey();
                Object value = entry.getValue();
                if (setLJLIIL.contains(key)) {
                    if (value == null || (string = value.toString()) == null) {
                        string = "";
                    }
                    linkedHashMap.put(key, string);
                }
            }
        }
        return linkedHashMap;
    }

    public final void LIZJ(Room room, String str) {
        String strLIZIZ = LIZIZ(room, str, null, EnumC612320Nzy.DURING_LIVE, false, true, 0L, false);
        C21211017zY.LIZ.getClass();
        AwS681S0100000_32 awS681S0100000_32 = new AwS681S0100000_32(C21211217za.LIZ(), 12);
        C1097680efe c1097680efe = new C1097680efe();
        c1097680efe.LJIIZILJ = true;
        c1097680efe.LIZ = "ec_anchor_shop_bag_biz";
        c1097680efe.LJIJ = 1;
        c1097680efe.LJIIIIZZ = AFwS320S0000000_32.get$arr$(3);
        c1097680efe.LJIJJ = awS681S0100000_32;
        C21211017zY.LIZIZ = c1097680efe;
        C1537060q6K c1537060q6K = C1529590puH.LIZ;
        C1537060q6K.LJIIL(c1097680efe, Boolean.FALSE);
        if (strLIZIZ.length() > 0) {
            C1537060q6K.LJIIJJI(c1537060q6K, strLIZIZ, "ec_anchor_shop_bag_biz", null, null, false, null, 44);
        }
    }

    public final void LIZLLL(Context context, Room room, long j, EnumC612320Nzy enumC612320Nzy, Map<String, ? extends Object> map, String str) {
        String idStr;
        boolean z;
        String strLIZ;
        boolean z2;
        String string;
        String idStr2;
        User owner;
        AnchorLiveBagListOptConfig anchorLiveBagListOptConfigLIZ = C21211217za.LIZ();
        if (room != null) {
            idStr = room.getIdStr();
        } else {
            idStr = null;
        }
        C21211017zY.LIZ.getClass();
        if (idStr != null && !C21211017zY.LJIIIIZZ.contains(idStr)) {
            z = true;
        } else {
            z = false;
        }
        if (str == null) {
            strLIZ = CreatorProductListLynxConfigSettings.LIZ();
        } else {
            strLIZ = str;
        }
        EnumC612320Nzy enumC612320Nzy2 = EnumC612320Nzy.DURING_LIVE;
        if (enumC612320Nzy == enumC612320Nzy2 && anchorLiveBagListOptConfigLIZ.crossPageReuseEnabled && C21211017zY.LIZIZ(strLIZ)) {
            z2 = true;
        } else {
            z2 = false;
        }
        String strLIZIZ = LIZIZ(room, str, map, enumC612320Nzy, true, z, j, z2);
        if (anchorLiveBagListOptConfigLIZ.preRenderEnabled && C21211017zY.LIZJ == null) {
            C1097680efe c1097680efe = C21211017zY.LIZIZ;
            if (c1097680efe != null) {
                C1537060q6K c1537060q6K = C1529590puH.LIZ;
                C1537060q6K.LJIILL(c1097680efe.LIZ);
            }
            C21211017zY.LIZIZ = null;
        }
        if (room != null && (owner = room.getOwner()) != null) {
            string = Long.valueOf(owner.getId()).toString();
        } else {
            string = null;
        }
        if (enumC612320Nzy == enumC612320Nzy2 && anchorLiveBagListOptConfigLIZ.nativePrefetchEnabled && idStr != null && idStr.length() != 0 && string != null && string.length() != 0) {
            C23250099c.LIZLLL(LIZIZ, null, null, new C597970Ncp(idStr, string, map, null), 3);
        }
        C21211017zY.LJI = j;
        SparkContext sparkContext = new SparkContext();
        sparkContext.LJJLIIJ(strLIZIZ);
        final String str2 = sparkContext.containerId;
        sparkContext.LJJJJZI(new AbstractC1542200qEc() { // from class: X.17zZ
            @Override // X.AbstractC1542100qES
            public final void LJLLJ(SparkContext sparkContext2, C1548490qOl c1548490qOl) {
                SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB;
                String str3 = null;
                if (sparkContext2 != null) {
                    str3 = sparkContext2.containerId;
                }
                if (!Intrinsics.LJFF(str3, str2)) {
                    return;
                }
                InterfaceC1541990qEH kitView = c1548490qOl.LIZJ;
                if (kitView != null || ((sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = c1548490qOl.LIZ) != null && (kitView = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.getKitView()) != null)) {
                    try {
                        C21211017zY.LIZ.getClass();
                        C21211017zY.LJ(kitView);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                    }
                }
            }
        });
        C1541950qED.LIZJ.getClass();
        new C1541950qED(context, sparkContext).LIZIZ();
        if (room != null && (idStr2 = room.getIdStr()) != null) {
            C21211017zY.LJIIIIZZ.add(idStr2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [X.01jq] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.String] */
    public final String LIZIZ(Room room, String str, Map<String, ? extends Object> map, EnumC612320Nzy enumC612320Nzy, boolean z, boolean z2, long j, boolean z3) {
        String idStr;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        String string;
        String currentUserID;
        boolean z8;
        String str2;
        boolean z9;
        List<String> list;
        boolean z10;
        String str3;
        boolean z11;
        String str4;
        String str5;
        String currentUserID2;
        boolean z12;
        String str6;
        boolean z13;
        List<String> list2;
        String strLIZ = str;
        if (strLIZ == null) {
            strLIZ = CreatorProductListLynxConfigSettings.LIZ();
        }
        C417601jq c417601jq = new C417601jq(strLIZ, new C487901vB(this));
        AnchorLiveBagListOptConfig anchorLiveBagListOptConfigLIZ = C21211217za.LIZ();
        if (room != null) {
            idStr = room.getIdStr();
        } else {
            idStr = null;
        }
        if (!anchorLiveBagListOptConfigLIZ.reuseEnabled && !anchorLiveBagListOptConfigLIZ.nativePrefetchEnabled && !anchorLiveBagListOptConfigLIZ.crossPageReuseEnabled && !anchorLiveBagListOptConfigLIZ.preloadEnabled && !anchorLiveBagListOptConfigLIZ.fcpEnabled) {
            z4 = false;
        } else {
            z4 = true;
        }
        if (z4 && enumC612320Nzy == EnumC612320Nzy.DURING_LIVE) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (anchorLiveBagListOptConfigLIZ.crossPageReuseEnabled && enumC612320Nzy == EnumC612320Nzy.BEFORE_LIVE) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (z) {
            c417601jq.LIZ("returning_from_billboard", CardStruct.IStatusCode.DEFAULT);
            if (j > 0) {
                c417601jq.LIZ("shopping_list_datas", C1741890vQh.LJIIIIZZ(C2097908Jt.LIZJ(new Pair("start_click_time", Long.valueOf(j)))));
            }
        }
        if (z5) {
            c417601jq.LIZ("target_handler", "ecom,webcast");
            c417601jq.LIZ("business_from", "ecom");
            if (idStr != null && idStr.length() != 0) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (!z10) {
                c417601jq.LIZ("room_id", idStr);
            }
            c417601jq.LIZ("spark_perf_biz", "ec_anchor_shop_bag_biz");
            if (z) {
                c417601jq.LIZ("enable_lite_mode", "1");
            }
            if (anchorLiveBagListOptConfigLIZ.reuseEnabled) {
                c417601jq.LIZ("use_mutable_context", "1");
                if (z) {
                    c417601jq.LIZ("use_reuse", "1");
                }
            }
            if (z && anchorLiveBagListOptConfigLIZ.crossPageReuseEnabled) {
                IUserService iUserService = (IUserService) PluggableExtentionKt.pluggableSpi$default(IUserService.class, false, false, false, 14, null);
                if (iUserService != null) {
                    currentUserID2 = iUserService.getCurrentUserID();
                } else {
                    currentUserID2 = null;
                }
                if (currentUserID2 != null && currentUserID2.length() != 0) {
                    z12 = false;
                } else {
                    z12 = true;
                }
                if (!z12) {
                    LinkedHashMap<String, List<String>> linkedHashMap = c417601jq.LIZLLL;
                    if (linkedHashMap != null && (list2 = linkedHashMap.get("user_id")) != null) {
                        str6 = (String) C13LP.LJJJLL(list2);
                    } else {
                        str6 = null;
                    }
                    if (str6 != null && str6.length() != 0) {
                        z13 = false;
                    } else {
                        z13 = true;
                    }
                    if (z13) {
                        c417601jq.LIZ("user_id", currentUserID2);
                    }
                }
            }
            if (z) {
                if (anchorLiveBagListOptConfigLIZ.nativePrefetchEnabled) {
                    str4 = "1";
                } else {
                    str4 = CardStruct.IStatusCode.DEFAULT;
                }
                c417601jq.LIZ("use_client_request", str4);
                if (anchorLiveBagListOptConfigLIZ.preRenderEnabled && !z3) {
                    if (z2) {
                        str5 = "1";
                    } else {
                        str5 = CardStruct.IStatusCode.DEFAULT;
                    }
                    c417601jq.LIZ("use_pre_render", str5);
                }
                if (z3) {
                    c417601jq.LIZ("is_reuse_before_live", "1");
                }
            } else {
                c417601jq.LIZ("native_preload", "1");
                if (anchorLiveBagListOptConfigLIZ.preRenderEnabled) {
                    str3 = "1";
                } else {
                    str3 = CardStruct.IStatusCode.DEFAULT;
                }
                c417601jq.LIZ("use_pre_render", str3);
            }
            if (idStr != null && idStr.length() != 0) {
                z11 = false;
            } else {
                z11 = true;
            }
            if (!z11) {
                c417601jq.LIZ("lru_cache_init", C1741890vQh.LJIIIIZZ(C1697810uHb.LJIIJJI(C2097608Jq.LJIIIIZZ(new Pair(Scene.SCENE_SERVICE, "anchor_live_bag_assemble"), new Pair("key", idStr)), C2097608Jq.LJIIIIZZ(new Pair(Scene.SCENE_SERVICE, "anchor_shop_bag"), new Pair("key", idStr)))));
            }
        }
        if (z6) {
            IUserService iUserService2 = (IUserService) PluggableExtentionKt.pluggableSpi$default(IUserService.class, false, false, false, 14, null);
            if (iUserService2 != null) {
                currentUserID = iUserService2.getCurrentUserID();
            } else {
                currentUserID = null;
            }
            if (currentUserID != null && currentUserID.length() != 0) {
                z8 = false;
            } else {
                z8 = true;
            }
            if (!z8) {
                LinkedHashMap<String, List<String>> linkedHashMap2 = c417601jq.LIZLLL;
                if (linkedHashMap2 != null && (list = linkedHashMap2.get("user_id")) != null) {
                    str2 = (String) C13LP.LJJJLL(list);
                } else {
                    str2 = null;
                }
                if (str2 != null && str2.length() != 0) {
                    z9 = false;
                } else {
                    z9 = true;
                }
                if (z9) {
                    c417601jq.LIZ("user_id", currentUserID);
                }
            }
            c417601jq.LIZ("spark_perf_biz", "ec_anchor_shop_bag_biz");
            c417601jq.LIZ("use_mutable_context", "1");
            c417601jq.LIZ("enable_lite_mode", "1");
            c417601jq.LIZ("use_pre_render", CardStruct.IStatusCode.DEFAULT);
            c417601jq.LIZ("use_client_request", CardStruct.IStatusCode.DEFAULT);
            if (anchorLiveBagListOptConfigLIZ.reuseEnabled) {
                c417601jq.LIZ("use_reuse", "1");
            }
        }
        if (map != null) {
            for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
                String key = entry.getKey();
                Object value = entry.getValue();
                if (key.length() > 0) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                if (z7) {
                    if (value == null || (string = value.toString()) == null) {
                        string = "";
                    }
                    c417601jq.LIZ(key, string);
                }
            }
        }
        Uri uri = c417601jq.LIZJ;
        if (uri == null) {
            return c417601jq.LIZIZ;
        }
        LinkedHashMap<String, List<String>> linkedHashMap3 = c417601jq.LIZLLL;
        if (linkedHashMap3 == null) {
            return c417601jq.LIZIZ;
        }
        try {
            Uri.Builder builderQuery = uri.buildUpon().query(null);
            for (Map.Entry<String, List<String>> entry2 : linkedHashMap3.entrySet()) {
                String key2 = entry2.getKey();
                Iterator<String> it2 = entry2.getValue().iterator();
                while (it2.hasNext()) {
                    builderQuery.appendQueryParameter(key2, it2.next());
                }
            }
            c417601jq = builderQuery.build().toString();
            return c417601jq;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return c417601jq.LIZIZ;
        }
    }
}
