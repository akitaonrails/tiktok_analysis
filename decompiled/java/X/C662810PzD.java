package X;

import Y.ATListenerS444S0100000_10;
import android.content.Context;
import android.net.Uri;
import android.os.SystemClock;
import android.view.View;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.ecommerce.model.AddressCardProducts;
import com.ss.android.ugc.aweme.ecommerce.model.EComImage;
import com.ss.android.ugc.aweme.ecommerce.model.EComShopCardStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.model.SearchMixFeedBase;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0PzD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C662810PzD {
    public static final void LIZIZ(View view, String str) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("search_result_id", str);
        C1766860w4y.LIZ.getClass();
        C1766860w4y.LJI(view, "c3978", "d0", linkedHashMap, null);
    }

    public static final void LIZJ(View view, String str) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("search_result_id", str);
        C1766860w4y.LIZ.getClass();
        C1766860w4y.LJI(view, "c3978", "d0", linkedHashMap, null);
    }

    public static final void LIZ(EnterRoomConfig enterRoomConfig, C661010PwJ c661010PwJ, String str) {
        String str2;
        SearchMixFeedBase searchMixFeedBase;
        String requestId;
        SearchMixFeedBase searchMixFeedBase2;
        EComShopCardStruct eComShopCardStruct;
        EnterRoomConfig.LogData logData = enterRoomConfig.mLogData;
        if (logData != null) {
            String str3 = "";
            if (c661010PwJ == null || (searchMixFeedBase2 = c661010PwJ.LL) == null || (eComShopCardStruct = searchMixFeedBase2.shopCard) == null || (str2 = eComShopCardStruct.docId) == null) {
                str2 = "";
            }
            logData.search_result_id = str2;
            logData.search_id = str;
            if (c661010PwJ != null && (searchMixFeedBase = c661010PwJ.LL) != null && (requestId = searchMixFeedBase.getRequestId()) != null) {
                str3 = requestId;
            }
            logData.requestId = str3;
        }
    }

    public static final void LIZLLL(final View view, final Integer num, final Integer num2, Function0<Unit> function0) {
        if (view != null) {
            final Context context = view.getContext();
            C0PVJ c0pvj = new C0PVJ(context) { // from class: X.0PzE
                @Override // X.C0PVJ
                public final void LIZ(boolean z) {
                    if (z) {
                        if (num2 != null) {
                            View view2 = view;
                            view2.setForeground(view2.getContext().getDrawable(num2.intValue()));
                            return;
                        } else {
                            view.setForeground(null);
                            return;
                        }
                    }
                    if (num != null) {
                        View view3 = view;
                        view3.setForeground(view3.getContext().getDrawable(num.intValue()));
                    } else {
                        view.setForeground(null);
                    }
                }
            };
            c0pvj.LLIZ = new ATListenerS444S0100000_10(function0, 24);
            view.setOnTouchListener(c0pvj);
        }
    }

    public static final String LJII(InterfaceC665370Q7z interfaceC665370Q7z, C661010PwJ c661010PwJ, String str, String str2) {
        Uri.Builder builderBuildUpon;
        SearchMixFeedBase searchMixFeedBase;
        EComShopCardStruct eComShopCardStruct;
        String str3;
        HashMap<String, Object> mapLJ = LJ(null, "", null, false, c661010PwJ, interfaceC665370Q7z, false);
        mapLJ.put("enter_method", str);
        mapLJ.put("source_previous_page", "general_search");
        if (c661010PwJ != null && (searchMixFeedBase = c661010PwJ.LL) != null && (eComShopCardStruct = searchMixFeedBase.shopCard) != null && (str3 = eComShopCardStruct.shopSchema) != null) {
            builderBuildUpon = UriProtector.parse(str3).buildUpon();
            builderBuildUpon.appendQueryParameter("trackParams", C1741890vQh.LJIIIIZZ(mapLJ));
            if (str2 != null) {
                builderBuildUpon.appendQueryParameter("source_btm_token", str2);
            }
        } else {
            builderBuildUpon = null;
        }
        return String.valueOf(builderBuildUpon);
    }

    public static final HashMap<String, Object> LJ(Map<String, ? extends Object> map, String str, String str2, boolean z, C661010PwJ c661010PwJ, InterfaceC665370Q7z interfaceC665370Q7z, boolean z2) {
        String str3;
        String str4;
        Aweme aweme;
        String str5;
        SearchMixFeedBase searchMixFeedBase;
        EComShopCardStruct eComShopCardStruct;
        String strLIZ;
        SearchMixFeedBase searchMixFeedBase2;
        EComShopCardStruct eComShopCardStruct2;
        String str6;
        SearchMixFeedBase searchMixFeedBase3;
        EComShopCardStruct eComShopCardStruct3;
        C0PCY<C663990Q2r> c0pcyWw1;
        C663990Q2r c663990Q2r;
        C0PCY<C0PRC> c0pcyPh1;
        C0PRC c0prc;
        HashMap<String, Object> map2 = new HashMap<>();
        if (map != null) {
            for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
                map2.put(entry.getKey(), entry.getValue());
            }
        }
        String str7 = null;
        ISearchContextAbility iSearchContextAbility = (ISearchContextAbility) C1558520qew.LIZ(interfaceC665370Q7z, ISearchContextAbility.class, null);
        String str8 = "";
        if (iSearchContextAbility == null || (c0pcyPh1 = iSearchContextAbility.Ph1()) == null || (c0prc = (C0PRC) c0pcyPh1.LIZJ()) == null || (str3 = c0prc.LLILLL) == null) {
            str3 = "";
        }
        ISearchContextAbility iSearchContextAbility2 = (ISearchContextAbility) C1558520qew.LIZ(interfaceC665370Q7z, ISearchContextAbility.class, null);
        if (iSearchContextAbility2 == null || (c0pcyWw1 = iSearchContextAbility2.Ww1()) == null || (c663990Q2r = (C663990Q2r) c0pcyWw1.LIZJ()) == null || (str4 = c663990Q2r.LL) == null) {
            str4 = "";
        }
        map2.put("search_entrance", str4);
        map2.put("search_id", str3);
        if (c661010PwJ != null && (searchMixFeedBase3 = c661010PwJ.LL) != null && (eComShopCardStruct3 = searchMixFeedBase3.shopCard) != null) {
            aweme = eComShopCardStruct3.liveEntity;
        } else {
            aweme = null;
        }
        if (aweme == null) {
            str5 = "general_search";
        } else {
            str5 = "live";
        }
        map2.put("source_page_type", str5);
        if (c661010PwJ != null && (searchMixFeedBase2 = c661010PwJ.LL) != null && (eComShopCardStruct2 = searchMixFeedBase2.shopCard) != null && (str6 = eComShopCardStruct2.docId) != null) {
            str8 = str6;
        }
        map2.put("search_result_id", str8);
        map2.put("list_item_id", str);
        if (z2) {
            if (c661010PwJ != null) {
                strLIZ = c661010PwJ.LIZ();
            } else {
                strLIZ = null;
            }
            if (!C123100dR.LIZ(strLIZ) || strLIZ == null) {
                strLIZ = "shop_card";
            }
            map2.put("entrance_form", strLIZ);
        }
        map2.put("enter_from_info", "general_search");
        map2.put("enter_from", "general_search");
        map2.put("enter_from_merge", "general_search");
        map2.put("page_name", "general_search");
        int[] iArr = new int[1];
        if (z) {
            iArr[0] = 7;
            map2.put("traffic_source_list", iArr);
        }
        if (c661010PwJ != null && (searchMixFeedBase = c661010PwJ.LL) != null && (eComShopCardStruct = searchMixFeedBase.shopCard) != null) {
            str7 = eComShopCardStruct.userId;
        }
        map2.put("author_id", str7);
        map2.put("previous_page", "general_search");
        if (str2 != null) {
            map2.put("room_id", str2);
        }
        if (!C1205904nh.LIZ()) {
            map2.put("search_token_type", "shop");
        }
        return map2;
    }

    public static final String LJI(AddressCardProducts addressCardProducts, boolean z, C661010PwJ c661010PwJ, String str, InterfaceC665370Q7z interfaceC665370Q7z, Context context, EnumC657940PrM enumC657940PrM) throws JSONException {
        String str2;
        String str3;
        List<String> list;
        SearchMixFeedBase searchMixFeedBase;
        EComShopCardStruct eComShopCardStruct;
        String str4;
        Map<String, String> map = addressCardProducts.trackExtra;
        String str5 = addressCardProducts.productId;
        String str6 = "";
        if (str5 == null) {
            str5 = "";
        }
        if (c661010PwJ != null && (searchMixFeedBase = c661010PwJ.LL) != null && (eComShopCardStruct = searchMixFeedBase.shopCard) != null && (str4 = eComShopCardStruct.roomId) != null) {
            str6 = str4;
        }
        HashMap<String, Object> mapLJ = LJ(map, str5, str6, z, c661010PwJ, interfaceC665370Q7z, true);
        Uri.Builder builderBuildUpon = null;
        if (C657950PrN.LIZ(enumC657940PrM) && context != null) {
            JSONObject jSONObject = new JSONObject();
            String str7 = addressCardProducts.title;
            if (C123100dR.LIZ(str7) && str7 != null) {
                jSONObject.put("title", str7);
            }
            String str8 = addressCardProducts.price;
            if (C123100dR.LIZ(str8) && str8 != null) {
                jSONObject.put("price", str8);
            }
            EComImage eComImage = addressCardProducts.img;
            if (eComImage != null && (list = eComImage.urlList) != null) {
                str3 = (String) C13LP.LJJJLZIJ(0, list);
            } else {
                str3 = null;
            }
            if (C123100dR.LIZ(str3) && str3 != null) {
                jSONObject.put("cover", str3);
            }
            String str9 = addressCardProducts.productId;
            if (C123100dR.LIZ(str9) && str9 != null) {
                jSONObject.put(FollowStatusChangeMethod.PARAM_UID, str9);
            }
            String strJ3 = C786410Ut5.J3(jSONObject);
            str2 = "ec_general_search_store_card_product";
            C1323690kYB.LIZ(context).LJIIIIZZ(strJ3, "ec_general_search_store_card_product");
        } else {
            str2 = null;
        }
        String str10 = addressCardProducts.detailUrl;
        if (str10 != null) {
            builderBuildUpon = UriProtector.parse(str10).buildUpon();
            builderBuildUpon.appendQueryParameter("trackParams", C1741890vQh.LJIIIIZZ(mapLJ));
            builderBuildUpon.appendQueryParameter("click_scene_start_time", String.valueOf(SystemClock.elapsedRealtime()));
            if (str != null) {
                builderBuildUpon.appendQueryParameter("source_btm_token", str);
            }
            if (C123100dR.LIZ(str2) && str2 != null) {
                builderBuildUpon.appendQueryParameter("pdp_cache_key", str2);
            }
        }
        return String.valueOf(builderBuildUpon);
    }
}
