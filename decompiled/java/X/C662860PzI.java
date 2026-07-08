package X;

import android.text.TextUtils;
import com.bytedance.android.btm.api.model.PageFinder;
import com.ss.android.ugc.aweme.ecommerce.model.AddressCardProducts;
import com.ss.android.ugc.aweme.ecommerce.model.EComShopCardStruct;
import com.ss.android.ugc.aweme.ecommerce.model.EComShopLabel;
import com.ss.android.ugc.aweme.ecommerce.model.ShopCardCategory;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.model.SearchMixFeedBase;
import com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$CardCommonAbility;
import com.ss.android.ugc.aweme.search.ecom.data.BcmStandardTrackEvent;
import com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0PzI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C662860PzI {
    public static final String LIZJ(List<EComShopLabel> list) {
        if (list == null) {
            return "empty";
        }
        Iterator<EComShopLabel> it2 = list.iterator();
        while (it2.hasNext()) {
            Integer num = it2.next().type;
            int type = EnumC662900PzM.OFFICIAL_VERIFIED.getType();
            if (num != null && num.intValue() == type) {
                return "official_brand";
            }
            int type2 = EnumC662900PzM.MALL.getType();
            if (num != null && num.intValue() == type2) {
                return "mall";
            }
        }
        return "empty";
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x011c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.Map<java.lang.String, java.lang.String> LIZLLL(X.C661010PwJ r11) {
        /*
            Method dump skipped, instruction units count: 344
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C662860PzI.LIZLLL(X.0PwJ):java.util.Map");
    }

    public static final void LIZIZ(JSONObject jSONObject, C661010PwJ c661010PwJ) {
        for (Map.Entry entry : ((LinkedHashMap) LIZLLL(c661010PwJ)).entrySet()) {
            jSONObject.put((String) entry.getKey(), entry.getValue());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00d8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LJIIIIZZ(X.C661010PwJ r7, X.InterfaceC665370Q7z r8) {
        /*
            Method dump skipped, instruction units count: 221
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C662860PzI.LJIIIIZZ(X.0PwJ, X.0Q7z):void");
    }

    public static final void LJIILIIL(InterfaceC665370Q7z interfaceC665370Q7z, String str) {
        C1507790pL7 c1507790pL7 = C1507790pL7.LIZ;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("enter_from", "general_search");
        jSONObject.put("search_type", "general");
        jSONObject.put("search_id", ((C0PRC) ((ISearchContextAbility) C1558520qew.LIZJ(interfaceC665370Q7z, ISearchContextAbility.class)).Ph1().LIZJ()).LLILLL);
        c1507790pL7.getClass();
        C1507790pL7.LIZLLL(str, jSONObject);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v15, types: [int] */
    /* JADX WARN: Type inference failed for: r10v25 */
    /* JADX WARN: Type inference failed for: r11v7, types: [org.json.JSONObject] */
    /* JADX WARN: Type inference failed for: r1v25 */
    /* JADX WARN: Type inference failed for: r1v26, types: [int] */
    /* JADX WARN: Type inference failed for: r1v39 */
    /* JADX WARN: Type inference failed for: r2v4, types: [org.json.JSONObject] */
    public static final void LJ(InterfaceC665370Q7z interfaceC665370Q7z, Function0<C661010PwJ> function0, PageFinder pageFinder) {
        boolean z;
        String str;
        String str2;
        String str3;
        String str4;
        int followStatus;
        List<EComShopLabel> list;
        boolean z2;
        SearchMixFeedBase searchMixFeedBase;
        EComShopCardStruct eComShopCardStruct;
        List<AddressCardProducts> list2;
        boolean z3;
        String imprId;
        String imprId2;
        String str5;
        ?? LJFF;
        EComShopCardStruct eComShopCardStruct2;
        EComShopCardStruct eComShopCardStruct3;
        List<EComShopLabel> list3;
        Map<String, String> map;
        EComShopCardStruct eComShopCardStruct4;
        String strLIZ;
        String str6;
        String str7;
        String str8;
        ?? LJFF2;
        SearchMixFeedBase searchMixFeedBase2;
        EComShopCardStruct eComShopCardStruct5;
        SearchMixFeedBase searchMixFeedBase3;
        EComShopCardStruct eComShopCardStruct6;
        List<EComShopLabel> list4;
        SearchMixFeedBase searchMixFeedBase4;
        EComShopCardStruct eComShopCardStruct7;
        SearchMixFeedBase searchMixFeedBase5;
        EComShopCardStruct eComShopCardStruct8;
        SearchMixFeedBase searchMixFeedBase6;
        EComShopCardStruct eComShopCardStruct9;
        SearchMixFeedBase searchMixFeedBase7;
        EComShopCardStruct eComShopCardStruct10;
        SearchMixFeedBase searchMixFeedBase8;
        EComShopCardStruct eComShopCardStruct11;
        User user;
        SearchMixFeedBase searchMixFeedBase9;
        EComShopCardStruct eComShopCardStruct12;
        SearchMixFeedBase searchMixFeedBase10;
        EComShopCardStruct eComShopCardStruct13;
        SearchMixFeedBase searchMixFeedBase11;
        EComShopCardStruct eComShopCardStruct14;
        SearchMixFeedBase searchMixFeedBase12;
        EComShopCardStruct eComShopCardStruct15;
        SearchMixFeedBase searchMixFeedBase13;
        EComShopCardStruct eComShopCardStruct16;
        SearchMixFeedBase searchMixFeedBase14;
        EComShopCardStruct eComShopCardStruct17;
        C661010PwJ c661010PwJInvoke = function0.invoke();
        if (c661010PwJInvoke != null && (searchMixFeedBase14 = c661010PwJInvoke.LL) != null && (eComShopCardStruct17 = searchMixFeedBase14.shopCard) != null && eComShopCardStruct17.liveEntity != null) {
            z = true;
        } else {
            z = false;
        }
        C661010PwJ c661010PwJInvoke2 = function0.invoke();
        C1507790pL7 c1507790pL7 = C1507790pL7.LIZ;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("EVENT_ORIGIN_FEATURE", "TEMAI");
        jSONObject.put("enter_from", "general_search");
        jSONObject.put("page_name", "general_search");
        if (c661010PwJInvoke2 != null && (searchMixFeedBase13 = c661010PwJInvoke2.LL) != null && (eComShopCardStruct16 = searchMixFeedBase13.shopCard) != null && Intrinsics.LJFF(eComShopCardStruct16.isOfficial, Boolean.TRUE)) {
            jSONObject.put("logo_type", "official_brand");
        }
        jSONObject.put("entrance_type", "shop_card");
        jSONObject.put("enter_method", "shop_card");
        if (c661010PwJInvoke2 == null || (searchMixFeedBase12 = c661010PwJInvoke2.LL) == null || (eComShopCardStruct15 = searchMixFeedBase12.shopCard) == null || (str = eComShopCardStruct15.shopId) == null) {
            str = "";
        }
        jSONObject.put("shop_id", str);
        if (c661010PwJInvoke2 == null || (searchMixFeedBase11 = c661010PwJInvoke2.LL) == null || (eComShopCardStruct14 = searchMixFeedBase11.shopCard) == null || (str2 = eComShopCardStruct14.userId) == null) {
            str2 = "";
        }
        jSONObject.put("author_id", str2);
        if (c661010PwJInvoke2 != null && (searchMixFeedBase10 = c661010PwJInvoke2.LL) != null && (eComShopCardStruct13 = searchMixFeedBase10.shopCard) != null) {
            str3 = eComShopCardStruct13.userId;
        } else {
            str3 = null;
        }
        jSONObject.put("is_self", TextUtils.equals(str3, ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId()) ? 1 : 0);
        jSONObject.put("search_id", ((C0PRC) ((ISearchContextAbility) C1558520qew.LIZJ(interfaceC665370Q7z, ISearchContextAbility.class)).Ph1().LIZJ()).LLILLL);
        if (c661010PwJInvoke2 == null || (searchMixFeedBase9 = c661010PwJInvoke2.LL) == null || (eComShopCardStruct12 = searchMixFeedBase9.shopCard) == null || (str4 = eComShopCardStruct12.docId) == null) {
            str4 = "";
        }
        jSONObject.put("search_result_id", str4);
        jSONObject.put("search_entrance", ((C663990Q2r) ((ISearchContextAbility) C1558520qew.LIZJ(interfaceC665370Q7z, ISearchContextAbility.class)).Ww1().LIZJ()).LL);
        if (c661010PwJInvoke2 != null && (searchMixFeedBase8 = c661010PwJInvoke2.LL) != null && (eComShopCardStruct11 = searchMixFeedBase8.shopCard) != null && (user = eComShopCardStruct11.userInfo) != null) {
            followStatus = user.getFollowStatus();
        } else {
            followStatus = -1;
        }
        jSONObject.put("follow_status", followStatus);
        if (c661010PwJInvoke2 != null && (searchMixFeedBase7 = c661010PwJInvoke2.LL) != null && (eComShopCardStruct10 = searchMixFeedBase7.shopCard) != null) {
            list = eComShopCardStruct10.shopLabels;
        } else {
            list = null;
        }
        jSONObject.put("seller_logo_type", LIZJ(list));
        jSONObject.put("source_previous_page", "general_search");
        c1507790pL7.getClass();
        C1507790pL7.LJ("tiktokec_shop_entrance_show", jSONObject, "a2270.b6880.c3812.d3621", pageFinder);
        if (z) {
            z2 = true;
            ?? jSONObject2 = new JSONObject();
            jSONObject2.put("search_id", ((C0PRC) ((ISearchContextAbility) C1558520qew.LIZJ(interfaceC665370Q7z, ISearchContextAbility.class)).Ph1().LIZJ()).LLILLL);
            if (c661010PwJInvoke2 != null) {
                strLIZ = c661010PwJInvoke2.LIZ();
            } else {
                strLIZ = null;
            }
            jSONObject2.put("anchor_info", strLIZ);
            jSONObject2.put("enter_from", "general_search");
            if (c661010PwJInvoke2 == null || (searchMixFeedBase6 = c661010PwJInvoke2.LL) == null || (eComShopCardStruct9 = searchMixFeedBase6.shopCard) == null || (str6 = eComShopCardStruct9.docId) == null) {
                str6 = "";
            }
            jSONObject2.put("search_result_id", str6);
            jSONObject2.put("list_result_type", "live");
            if (c661010PwJInvoke2 == null || (searchMixFeedBase5 = c661010PwJInvoke2.LL) == null || (eComShopCardStruct8 = searchMixFeedBase5.shopCard) == null || (str7 = eComShopCardStruct8.roomId) == null) {
                str7 = "";
            }
            jSONObject2.put("list_item_id", str7);
            jSONObject2.put("search_keyword", ((C0PRC) ((ISearchContextAbility) C1558520qew.LIZJ(interfaceC665370Q7z, ISearchContextAbility.class)).Ph1().LIZJ()).LLIZLLLIL);
            jSONObject2.put("token_type", "shop");
            jSONObject2.put("rank", ((SearchServiceCenter$CardCommonAbility) C1558520qew.LIZJ(interfaceC665370Q7z, SearchServiceCenter$CardCommonAbility.class)).k4().getLayoutPosition());
            jSONObject2.put("aladdin_rank", 0);
            jSONObject2.put("is_live", 1);
            if (c661010PwJInvoke2 == null || (searchMixFeedBase4 = c661010PwJInvoke2.LL) == null || (eComShopCardStruct7 = searchMixFeedBase4.shopCard) == null || (str8 = eComShopCardStruct7.userId) == null) {
                str8 = "";
            }
            jSONObject2.put("author_id", str8);
            jSONObject2.put("page_name", "general_search");
            JSONArray jSONArray = new JSONArray();
            if (c661010PwJInvoke2 != null && (searchMixFeedBase3 = c661010PwJInvoke2.LL) != null && (eComShopCardStruct6 = searchMixFeedBase3.shopCard) != null && (list4 = eComShopCardStruct6.shopLabels) != null) {
                int i = 0;
                for (EComShopLabel eComShopLabel : list4) {
                    int i2 = i + 1;
                    if (i >= 0) {
                        JSONObject jSONObject3 = new JSONObject();
                        jSONObject3.put("position", i);
                        jSONObject3.put("tag", eComShopLabel.type);
                        jSONArray.put(jSONObject3);
                        i = i2;
                    } else {
                        C1697810uHb.LJIJI();
                        throw null;
                    }
                }
            }
            jSONObject2.put("shop_label", jSONArray);
            jSONObject2.put("end_to_end_search_session_id", C0QES.LIZ(C0QES.LIZ, null, false, 7));
            if (c661010PwJInvoke2 != null && (searchMixFeedBase2 = c661010PwJInvoke2.LL) != null && (eComShopCardStruct5 = searchMixFeedBase2.shopCard) != null) {
                LJFF2 = Intrinsics.LJFF(eComShopCardStruct5.isPrecisionSearch, Boolean.TRUE);
            } else {
                LJFF2 = 0;
            }
            jSONObject2.put("if_accurate_search", LJFF2);
            C1507790pL7.LIZLLL("search_result_show", jSONObject2);
        } else {
            z2 = false;
        }
        if (c661010PwJInvoke2 != null && (searchMixFeedBase = c661010PwJInvoke2.LL) != null && (eComShopCardStruct = searchMixFeedBase.shopCard) != null && (list2 = eComShopCardStruct.addressCardProduct) != null) {
            int i3 = 0;
            for (AddressCardProducts addressCardProducts : list2) {
                int i4 = i3 + 1;
                if (i3 >= 0) {
                    AddressCardProducts addressCardProducts2 = addressCardProducts;
                    if (!z2) {
                        String str9 = addressCardProducts2.productId;
                        if (str9 == null) {
                            str9 = "";
                        }
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("a2270.b6880.c3812.d0127_i");
                        sbLIZ.append(i3);
                        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                        C1507790pL7 c1507790pL72 = C1507790pL7.LIZ;
                        ?? jSONObject4 = new JSONObject();
                        jSONObject4.put("search_id", ((C0PRC) ((ISearchContextAbility) C1558520qew.LIZJ(interfaceC665370Q7z, ISearchContextAbility.class)).Ph1().LIZJ()).LLILLL);
                        SearchMixFeedBase searchMixFeedBase15 = c661010PwJInvoke2.LL;
                        if (searchMixFeedBase15 != null) {
                            imprId = searchMixFeedBase15.getImprId();
                        } else {
                            imprId = null;
                        }
                        jSONObject4.put("impr_id", imprId);
                        SearchMixFeedBase searchMixFeedBase16 = c661010PwJInvoke2.LL;
                        if (searchMixFeedBase16 != null) {
                            imprId2 = searchMixFeedBase16.getImprId();
                        } else {
                            imprId2 = null;
                        }
                        jSONObject4.put("request_id", imprId2);
                        jSONObject4.put("enter_from", "general_search");
                        SearchMixFeedBase searchMixFeedBase17 = c661010PwJInvoke2.LL;
                        if (searchMixFeedBase17 == null || (eComShopCardStruct4 = searchMixFeedBase17.shopCard) == null || (str5 = eComShopCardStruct4.docId) == null) {
                            str5 = "";
                        }
                        jSONObject4.put("search_result_id", str5);
                        jSONObject4.put("list_result_type", "mt_goods");
                        jSONObject4.put("list_item_id", str9);
                        jSONObject4.put("discount_rate", addressCardProducts2.discountRate);
                        jSONObject4.put("product_id", str9);
                        BcmStandardTrackEvent bcmStandardTrackEvent = addressCardProducts2.bcmStandardTrackEvent;
                        if (bcmStandardTrackEvent != null && (map = bcmStandardTrackEvent.trackParamMap) != null) {
                            for (Map.Entry<String, String> entry : map.entrySet()) {
                                jSONObject4.put(entry.getKey(), entry.getValue());
                            }
                        }
                        jSONObject4.put("search_keyword", ((C0PRC) ((ISearchContextAbility) C1558520qew.LIZJ(interfaceC665370Q7z, ISearchContextAbility.class)).Ph1().LIZJ()).LLIZLLLIL);
                        jSONObject4.put("token_type", "shop");
                        jSONObject4.put("rank", ((SearchServiceCenter$CardCommonAbility) C1558520qew.LIZJ(interfaceC665370Q7z, SearchServiceCenter$CardCommonAbility.class)).k4().getLayoutPosition());
                        jSONObject4.put("aladdin_rank", i3);
                        jSONObject4.put("is_live", 0);
                        jSONObject4.put("page_name", "general_search");
                        JSONArray jSONArray2 = new JSONArray();
                        SearchMixFeedBase searchMixFeedBase18 = c661010PwJInvoke2.LL;
                        if (searchMixFeedBase18 != null && (eComShopCardStruct3 = searchMixFeedBase18.shopCard) != null && (list3 = eComShopCardStruct3.shopLabels) != null) {
                            int i5 = 0;
                            for (EComShopLabel eComShopLabel2 : list3) {
                                int i6 = i5 + 1;
                                if (i5 >= 0) {
                                    JSONObject jSONObject5 = new JSONObject();
                                    jSONObject5.put("position", i5);
                                    jSONObject5.put("tag", eComShopLabel2.type);
                                    jSONArray2.put(jSONObject5);
                                    i5 = i6;
                                } else {
                                    C1697810uHb.LJIJI();
                                    throw null;
                                }
                            }
                        }
                        jSONObject4.put("shop_label", jSONArray2);
                        LIZIZ(jSONObject4, c661010PwJInvoke2);
                        jSONObject4.put("end_to_end_search_session_id", C0QES.LIZ(C0QES.LIZ, null, false, 7));
                        SearchMixFeedBase searchMixFeedBase19 = c661010PwJInvoke2.LL;
                        if (searchMixFeedBase19 != null && (eComShopCardStruct2 = searchMixFeedBase19.shopCard) != null) {
                            LJFF = Intrinsics.LJFF(eComShopCardStruct2.isPrecisionSearch, Boolean.TRUE);
                        } else {
                            LJFF = 0;
                        }
                        jSONObject4.put("if_accurate_search", LJFF);
                        c1507790pL72.getClass();
                        C1507790pL7.LJ("search_result_show", jSONObject4, strLIZIZ, pageFinder);
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("a2270.b6880.c3812.d0127_i");
                        sbLIZ2.append(i3);
                        LJIIJ(c661010PwJInvoke2, addressCardProducts2, i3, interfaceC665370Q7z, C2188811AlT.LIZIZ(sbLIZ2), pageFinder, false);
                    } else {
                        EnumC662880PzK enumC662880PzKLIZIZ = c661010PwJInvoke2.LIZIZ();
                        if (enumC662880PzKLIZIZ != null && (enumC662880PzKLIZIZ == EnumC662880PzK.SINGLE_ANCHOR_SMALL || enumC662880PzKLIZIZ == EnumC662880PzK.SINGLE_ANCHOR_MEDIUM || enumC662880PzKLIZIZ == EnumC662880PzK.SINGLE_ANCHOR_LARGE)) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (!z3 && c661010PwJInvoke2.LIZIZ() != EnumC662880PzK.CARD_ANCHOR) {
                            EnumC662880PzK enumC662880PzKLIZIZ2 = c661010PwJInvoke2.LIZIZ();
                            if (enumC662880PzKLIZIZ2 != null && (enumC662880PzKLIZIZ2 == EnumC662880PzK.MULTI_ANCHOR_SMALL || enumC662880PzKLIZIZ2 == EnumC662880PzK.MULTI_ANCHOR_MEDIUM || enumC662880PzKLIZIZ2 == EnumC662880PzK.MULTI_ANCHOR_LARGE)) {
                                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                                sbLIZ3.append("a2270.b6880.c3812.d4738_w6322_i");
                                sbLIZ3.append(i3);
                                LJIIJJI(pageFinder, interfaceC665370Q7z, addressCardProducts2, c661010PwJInvoke2, C2188811AlT.LIZIZ(sbLIZ3));
                            } else {
                                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                                sbLIZ4.append("a2270.b6880.c3812.d4738_w6322_i");
                                sbLIZ4.append(i3);
                                LJIIJJI(pageFinder, interfaceC665370Q7z, addressCardProducts2, c661010PwJInvoke2, C2188811AlT.LIZIZ(sbLIZ4));
                                StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                                sbLIZ5.append("a2270.b6880.c3812.d4738_w6322_i");
                                sbLIZ5.append(i3);
                                LJIIL(c661010PwJInvoke2, addressCardProducts2, i3, interfaceC665370Q7z, C2188811AlT.LIZIZ(sbLIZ5), pageFinder);
                            }
                        } else {
                            StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                            sbLIZ6.append("a2270.b6880.c3812.d4738_w6322_i");
                            sbLIZ6.append(i3);
                            LJIIJJI(pageFinder, interfaceC665370Q7z, addressCardProducts2, c661010PwJInvoke2, C2188811AlT.LIZIZ(sbLIZ6));
                            StringBuilder sbLIZ7 = C2188811AlT.LIZ();
                            sbLIZ7.append("a2270.b6880.c3812.d4738_w6322_i");
                            sbLIZ7.append(i3);
                            LJIIJ(c661010PwJInvoke2, addressCardProducts2, i3, interfaceC665370Q7z, C2188811AlT.LIZIZ(sbLIZ7), pageFinder, true);
                            StringBuilder sbLIZ8 = C2188811AlT.LIZ();
                            sbLIZ8.append("a2270.b6880.c3812.d4738_w6322_i");
                            sbLIZ8.append(i3);
                            LJIIL(c661010PwJInvoke2, addressCardProducts2, i3, interfaceC665370Q7z, C2188811AlT.LIZIZ(sbLIZ8), pageFinder);
                        }
                    }
                    i3 = i4;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
        }
    }

    public static final void LJFF(C661010PwJ c661010PwJ, InterfaceC665370Q7z interfaceC665370Q7z, PageFinder pageFinder) {
        String str;
        String str2;
        String str3;
        SearchMixFeedBase searchMixFeedBase;
        EComShopCardStruct eComShopCardStruct;
        SearchMixFeedBase searchMixFeedBase2;
        EComShopCardStruct eComShopCardStruct2;
        String str4;
        SearchMixFeedBase searchMixFeedBase3;
        EComShopCardStruct eComShopCardStruct3;
        SearchMixFeedBase searchMixFeedBase4;
        EComShopCardStruct eComShopCardStruct4;
        SearchMixFeedBase searchMixFeedBase5;
        EComShopCardStruct eComShopCardStruct5;
        SearchMixFeedBase searchMixFeedBase6;
        EComShopCardStruct eComShopCardStruct6;
        C1507790pL7 c1507790pL7 = C1507790pL7.LIZ;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("EVENT_ORIGIN_FEATURE", "TEMAI");
        jSONObject.put("enter_from", "general_search");
        jSONObject.put("page_name", "general_search");
        if (c661010PwJ != null && (searchMixFeedBase6 = c661010PwJ.LL) != null && (eComShopCardStruct6 = searchMixFeedBase6.shopCard) != null && Intrinsics.LJFF(eComShopCardStruct6.isOfficial, Boolean.TRUE)) {
            jSONObject.put("logo_type", "official_brand");
        }
        jSONObject.put("entrance_type", "shop_card");
        String str5 = "";
        if (c661010PwJ == null || (searchMixFeedBase5 = c661010PwJ.LL) == null || (eComShopCardStruct5 = searchMixFeedBase5.shopCard) == null || (str = eComShopCardStruct5.shopId) == null) {
            str = "";
        }
        jSONObject.put("shop_id", str);
        if (c661010PwJ == null || (searchMixFeedBase4 = c661010PwJ.LL) == null || (eComShopCardStruct4 = searchMixFeedBase4.shopCard) == null || (str2 = eComShopCardStruct4.userId) == null) {
            str2 = "";
        }
        jSONObject.put("author_id", str2);
        List<EComShopLabel> list = null;
        if (c661010PwJ != null && (searchMixFeedBase3 = c661010PwJ.LL) != null && (eComShopCardStruct3 = searchMixFeedBase3.shopCard) != null) {
            str3 = eComShopCardStruct3.userId;
        } else {
            str3 = null;
        }
        jSONObject.put("is_self", TextUtils.equals(str3, ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId()) ? 1 : 0);
        jSONObject.put("search_id", ((C0PRC) ((ISearchContextAbility) C1558520qew.LIZJ(interfaceC665370Q7z, ISearchContextAbility.class)).Ph1().LIZJ()).LLILLL);
        if (c661010PwJ != null && (searchMixFeedBase2 = c661010PwJ.LL) != null && (eComShopCardStruct2 = searchMixFeedBase2.shopCard) != null && (str4 = eComShopCardStruct2.docId) != null) {
            str5 = str4;
        }
        jSONObject.put("search_result_id", str5);
        jSONObject.put("search_entrance", ((C663990Q2r) ((ISearchContextAbility) C1558520qew.LIZJ(interfaceC665370Q7z, ISearchContextAbility.class)).Ww1().LIZJ()).LL);
        if (c661010PwJ != null && (searchMixFeedBase = c661010PwJ.LL) != null && (eComShopCardStruct = searchMixFeedBase.shopCard) != null) {
            list = eComShopCardStruct.shopLabels;
        }
        jSONObject.put("seller_logo_type", LIZJ(list));
        c1507790pL7.getClass();
        C1507790pL7.LJ("tiktokec_shop_entrance_click", jSONObject, "a2270.b6880.c3812.d0", pageFinder);
    }

    public static final void LJIILL(C661010PwJ c661010PwJ, InterfaceC665370Q7z interfaceC665370Q7z, PageFinder pageFinder) {
        User user;
        String str;
        String str2;
        String str3;
        Integer numValueOf;
        SearchMixFeedBase searchMixFeedBase;
        EComShopCardStruct eComShopCardStruct;
        SearchMixFeedBase searchMixFeedBase2;
        EComShopCardStruct eComShopCardStruct2;
        String str4;
        SearchMixFeedBase searchMixFeedBase3;
        EComShopCardStruct eComShopCardStruct3;
        SearchMixFeedBase searchMixFeedBase4;
        EComShopCardStruct eComShopCardStruct4;
        SearchMixFeedBase searchMixFeedBase5;
        EComShopCardStruct eComShopCardStruct5;
        SearchMixFeedBase searchMixFeedBase6;
        EComShopCardStruct eComShopCardStruct6;
        SearchMixFeedBase searchMixFeedBase7;
        EComShopCardStruct eComShopCardStruct7;
        List<EComShopLabel> list = null;
        if (c661010PwJ != null && (searchMixFeedBase7 = c661010PwJ.LL) != null && (eComShopCardStruct7 = searchMixFeedBase7.shopCard) != null) {
            user = eComShopCardStruct7.userInfo;
        } else {
            user = null;
        }
        C1507790pL7 c1507790pL7 = C1507790pL7.LIZ;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("EVENT_ORIGIN_FEATURE", "TEMAI");
        jSONObject.put("enter_from", "general_search");
        jSONObject.put("page_name", "general_search");
        if (c661010PwJ != null && (searchMixFeedBase6 = c661010PwJ.LL) != null && (eComShopCardStruct6 = searchMixFeedBase6.shopCard) != null && Intrinsics.LJFF(eComShopCardStruct6.isOfficial, Boolean.TRUE)) {
            jSONObject.put("logo_type", "official_brand");
        }
        jSONObject.put("entrance_type", "shop_card");
        String str5 = "";
        if (c661010PwJ == null || (searchMixFeedBase5 = c661010PwJ.LL) == null || (eComShopCardStruct5 = searchMixFeedBase5.shopCard) == null || (str = eComShopCardStruct5.shopId) == null) {
            str = "";
        }
        jSONObject.put("shop_id", str);
        if (c661010PwJ == null || (searchMixFeedBase4 = c661010PwJ.LL) == null || (eComShopCardStruct4 = searchMixFeedBase4.shopCard) == null || (str2 = eComShopCardStruct4.userId) == null) {
            str2 = "";
        }
        jSONObject.put("author_id", str2);
        if (c661010PwJ != null && (searchMixFeedBase3 = c661010PwJ.LL) != null && (eComShopCardStruct3 = searchMixFeedBase3.shopCard) != null) {
            str3 = eComShopCardStruct3.userId;
        } else {
            str3 = null;
        }
        jSONObject.put("is_self", TextUtils.equals(str3, ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId()) ? 1 : 0);
        jSONObject.put("search_id", ((C0PRC) ((ISearchContextAbility) C1558520qew.LIZJ(interfaceC665370Q7z, ISearchContextAbility.class)).Ph1().LIZJ()).LLILLL);
        if (c661010PwJ != null && (searchMixFeedBase2 = c661010PwJ.LL) != null && (eComShopCardStruct2 = searchMixFeedBase2.shopCard) != null && (str4 = eComShopCardStruct2.docId) != null) {
            str5 = str4;
        }
        jSONObject.put("search_result_id", str5);
        jSONObject.put("search_entrance", ((C663990Q2r) ((ISearchContextAbility) C1558520qew.LIZJ(interfaceC665370Q7z, ISearchContextAbility.class)).Ww1().LIZJ()).LL);
        if (user != null) {
            numValueOf = Integer.valueOf(user.getFollowerStatus());
        } else {
            numValueOf = null;
        }
        jSONObject.put("follow_status", numValueOf);
        if (c661010PwJ != null && (searchMixFeedBase = c661010PwJ.LL) != null && (eComShopCardStruct = searchMixFeedBase.shopCard) != null) {
            list = eComShopCardStruct.shopLabels;
        }
        jSONObject.put("seller_logo_type", LIZJ(list));
        jSONObject.put("source_previous_page", "general_search");
        c1507790pL7.getClass();
        C1507790pL7.LJ("tiktokec_shop_entrance_click", jSONObject, "a2270.b6880.c3812.d3621", pageFinder);
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:117:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00f2 A[PHI: r3
      0x00f2: PHI (r3v1 com.ss.android.ugc.aweme.profile.model.User) = (r3v0 com.ss.android.ugc.aweme.profile.model.User), (r3v3 com.ss.android.ugc.aweme.profile.model.User) binds: [B:74:0x00ee, B:19:0x0025] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0117 A[LOOP:1: B:87:0x0111->B:89:0x0117, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZ(com.ss.android.ugc.aweme.ecommerce.model.AddressCardProducts r9, X.C661010PwJ r10, X.InterfaceC665370Q7z r11, org.json.JSONObject r12) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 401
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C662860PzI.LIZ(com.ss.android.ugc.aweme.ecommerce.model.AddressCardProducts, X.0PwJ, X.0Q7z, org.json.JSONObject):void");
    }

    public static final void LJI(PageFinder pageFinder, InterfaceC665370Q7z interfaceC665370Q7z, AddressCardProducts addressCardProducts, C661010PwJ c661010PwJ, String str) {
        String str2;
        SearchMixFeedBase searchMixFeedBase;
        EComShopCardStruct eComShopCardStruct;
        String str3;
        SearchMixFeedBase searchMixFeedBase2;
        EComShopCardStruct eComShopCardStruct2;
        C1507790pL7 c1507790pL7 = C1507790pL7.LIZ;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("page_name", "general_search");
        jSONObject.put("enter_from_merge", "general_search");
        String strLIZ = null;
        if (c661010PwJ != null) {
            strLIZ = c661010PwJ.LIZ();
        }
        if (!C123100dR.LIZ(strLIZ) || strLIZ == null) {
            strLIZ = "search_live_card_anchor";
        }
        jSONObject.put("entrance_form", strLIZ);
        String str4 = "";
        if (c661010PwJ == null || (searchMixFeedBase2 = c661010PwJ.LL) == null || (eComShopCardStruct2 = searchMixFeedBase2.shopCard) == null || (str2 = eComShopCardStruct2.roomId) == null) {
            str2 = "";
        }
        jSONObject.put("list_item_id", str2);
        jSONObject.put("search_id", ((C0PRC) ((ISearchContextAbility) C1558520qew.LIZJ(interfaceC665370Q7z, ISearchContextAbility.class)).Ph1().LIZJ()).LLILLL);
        if (c661010PwJ != null && (searchMixFeedBase = c661010PwJ.LL) != null && (eComShopCardStruct = searchMixFeedBase.shopCard) != null && (str3 = eComShopCardStruct.docId) != null) {
            str4 = str3;
        }
        jSONObject.put("search_result_id", str4);
        jSONObject.put("list_result_type", "live");
        LIZ(addressCardProducts, c661010PwJ, interfaceC665370Q7z, jSONObject);
        c1507790pL7.getClass();
        C1507790pL7.LJ("livesdk_tiktokec_product_entrance_click", jSONObject, str, pageFinder);
    }

    public static final void LJIIJJI(PageFinder pageFinder, InterfaceC665370Q7z interfaceC665370Q7z, AddressCardProducts addressCardProducts, C661010PwJ c661010PwJ, String str) throws JSONException {
        String str2;
        EComShopCardStruct eComShopCardStruct;
        String str3;
        EComShopCardStruct eComShopCardStruct2;
        C1507790pL7 c1507790pL7 = C1507790pL7.LIZ;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("page_name", "general_search");
        jSONObject.put("enter_from_merge", "general_search");
        String strLIZ = c661010PwJ.LIZ();
        if (!C123100dR.LIZ(strLIZ) || strLIZ == null) {
            strLIZ = "search_live_card_anchor";
        }
        jSONObject.put("entrance_form", strLIZ);
        SearchMixFeedBase searchMixFeedBase = c661010PwJ.LL;
        String str4 = "";
        if (searchMixFeedBase == null || (eComShopCardStruct2 = searchMixFeedBase.shopCard) == null || (str2 = eComShopCardStruct2.roomId) == null) {
            str2 = "";
        }
        jSONObject.put("list_item_id", str2);
        jSONObject.put("search_id", ((C0PRC) ((ISearchContextAbility) C1558520qew.LIZJ(interfaceC665370Q7z, ISearchContextAbility.class)).Ph1().LIZJ()).LLILLL);
        SearchMixFeedBase searchMixFeedBase2 = c661010PwJ.LL;
        if (searchMixFeedBase2 != null && (eComShopCardStruct = searchMixFeedBase2.shopCard) != null && (str3 = eComShopCardStruct.docId) != null) {
            str4 = str3;
        }
        jSONObject.put("search_result_id", str4);
        jSONObject.put("list_result_type", "live");
        LIZ(addressCardProducts, c661010PwJ, interfaceC665370Q7z, jSONObject);
        c1507790pL7.getClass();
        C1507790pL7.LJ("livesdk_tiktokec_product_entrance_show", jSONObject, str, pageFinder);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [org.json.JSONObject] */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [int] */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    public static final void LJIILLIIL(String str, C661010PwJ c661010PwJ, InterfaceC665370Q7z interfaceC665370Q7z, String str2, PageFinder pageFinder) {
        String imprId;
        String imprId2;
        String str3;
        Aweme aweme;
        int i;
        String str4;
        SearchMixFeedBase searchMixFeedBase;
        EComShopCardStruct eComShopCardStruct;
        SearchMixFeedBase searchMixFeedBase2;
        EComShopCardStruct eComShopCardStruct2;
        List<EComShopLabel> list;
        SearchMixFeedBase searchMixFeedBase3;
        EComShopCardStruct eComShopCardStruct3;
        SearchMixFeedBase searchMixFeedBase4;
        EComShopCardStruct eComShopCardStruct4;
        String str5;
        SearchMixFeedBase searchMixFeedBase5;
        EComShopCardStruct eComShopCardStruct5;
        SearchMixFeedBase searchMixFeedBase6;
        EComShopCardStruct eComShopCardStruct6;
        SearchMixFeedBase searchMixFeedBase7;
        SearchMixFeedBase searchMixFeedBase8;
        C1507790pL7 c1507790pL7 = C1507790pL7.LIZ;
        ?? jSONObject = new JSONObject();
        jSONObject.put("search_id", ((C0PRC) ((ISearchContextAbility) C1558520qew.LIZJ(interfaceC665370Q7z, ISearchContextAbility.class)).Ph1().LIZJ()).LLILLL);
        jSONObject.put("enter_from", "general_search");
        if (c661010PwJ != null && (searchMixFeedBase8 = c661010PwJ.LL) != null) {
            imprId = searchMixFeedBase8.getImprId();
        } else {
            imprId = null;
        }
        jSONObject.put("impr_id", imprId);
        if (c661010PwJ != null && (searchMixFeedBase7 = c661010PwJ.LL) != null) {
            imprId2 = searchMixFeedBase7.getImprId();
        } else {
            imprId2 = null;
        }
        jSONObject.put("request_id", imprId2);
        String str6 = "";
        if (c661010PwJ == null || (searchMixFeedBase6 = c661010PwJ.LL) == null || (eComShopCardStruct6 = searchMixFeedBase6.shopCard) == null || (str3 = eComShopCardStruct6.docId) == null) {
            str3 = "";
        }
        jSONObject.put("search_result_id", str3);
        jSONObject.put("search_keyword", ((C0PRC) ((ISearchContextAbility) C1558520qew.LIZJ(interfaceC665370Q7z, ISearchContextAbility.class)).Ph1().LIZJ()).LLIZLLLIL);
        jSONObject.put("token_type", "shop");
        jSONObject.put("rank", ((SearchServiceCenter$CardCommonAbility) C1558520qew.LIZJ(interfaceC665370Q7z, SearchServiceCenter$CardCommonAbility.class)).k4().getLayoutPosition());
        if (c661010PwJ != null && (searchMixFeedBase5 = c661010PwJ.LL) != null && (eComShopCardStruct5 = searchMixFeedBase5.shopCard) != null) {
            aweme = eComShopCardStruct5.liveEntity;
        } else {
            aweme = null;
        }
        ?? LJFF = 0;
        LJFF = 0;
        LJFF = 0;
        if (aweme != null) {
            i = 1;
        } else {
            i = 0;
        }
        jSONObject.put("is_live", i);
        if (c661010PwJ != null && (searchMixFeedBase4 = c661010PwJ.LL) != null && (eComShopCardStruct4 = searchMixFeedBase4.shopCard) != null && (str5 = eComShopCardStruct4.roomId) != null) {
            str6 = str5;
        }
        jSONObject.put("list_item_id", str6);
        if (c661010PwJ != null && (searchMixFeedBase3 = c661010PwJ.LL) != null && (eComShopCardStruct3 = searchMixFeedBase3.shopCard) != null && eComShopCardStruct3.liveEntity != null) {
            str4 = "live";
        } else {
            str4 = "mt_goods";
        }
        jSONObject.put("list_result_type", str4);
        jSONObject.put("aladdin_button_type", str);
        jSONObject.put("page_name", "general_search");
        JSONArray jSONArray = new JSONArray();
        if (c661010PwJ != null && (searchMixFeedBase2 = c661010PwJ.LL) != null && (eComShopCardStruct2 = searchMixFeedBase2.shopCard) != null && (list = eComShopCardStruct2.shopLabels) != null) {
            int i2 = 0;
            for (EComShopLabel eComShopLabel : list) {
                int i3 = i2 + 1;
                if (i2 >= 0) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("position", i2);
                    jSONObject2.put("tag", eComShopLabel.type);
                    jSONArray.put(jSONObject2);
                    i2 = i3;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
        }
        jSONObject.put("shop_label", jSONArray);
        if (c661010PwJ != null) {
            LIZIZ(jSONObject, c661010PwJ);
        }
        jSONObject.put("end_to_end_search_session_id", C0QES.LIZ(C0QES.LIZ, null, false, 7));
        if (c661010PwJ != null && (searchMixFeedBase = c661010PwJ.LL) != null && (eComShopCardStruct = searchMixFeedBase.shopCard) != null) {
            LJFF = Intrinsics.LJFF(eComShopCardStruct.isPrecisionSearch, Boolean.TRUE);
        }
        jSONObject.put("if_accurate_search", LJFF);
        c1507790pL7.getClass();
        C1507790pL7.LJ("search_result_click", jSONObject, str2, pageFinder);
    }

    public static final void LJII(C661010PwJ c661010PwJ, AddressCardProducts addressCardProducts, int i, InterfaceC665370Q7z interfaceC665370Q7z, String str, PageFinder pageFinder) throws JSONException {
        String str2;
        SearchMixFeedBase searchMixFeedBase;
        EComShopCardStruct eComShopCardStruct;
        String str3;
        SearchMixFeedBase searchMixFeedBase2;
        EComShopCardStruct eComShopCardStruct2;
        C1507790pL7 c1507790pL7 = C1507790pL7.LIZ;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("page_name", "general_search");
        jSONObject.put("enter_from", "general_search");
        jSONObject.put("enter_from_merge", "general_search");
        jSONObject.put("entrance_form", "search_live_card_anchor");
        String str4 = "";
        if (c661010PwJ == null || (searchMixFeedBase2 = c661010PwJ.LL) == null || (eComShopCardStruct2 = searchMixFeedBase2.shopCard) == null || (str2 = eComShopCardStruct2.roomId) == null) {
            str2 = "";
        }
        jSONObject.put("list_item_id", str2);
        jSONObject.put("search_id", ((C0PRC) ((ISearchContextAbility) C1558520qew.LIZJ(interfaceC665370Q7z, ISearchContextAbility.class)).Ph1().LIZJ()).LLILLL);
        if (c661010PwJ != null && (searchMixFeedBase = c661010PwJ.LL) != null && (eComShopCardStruct = searchMixFeedBase.shopCard) != null && (str3 = eComShopCardStruct.docId) != null) {
            str4 = str3;
        }
        jSONObject.put("search_result_id", str4);
        jSONObject.put("list_result_type", "live");
        jSONObject.put("item_order", i + 1);
        LIZ(addressCardProducts, c661010PwJ, interfaceC665370Q7z, jSONObject);
        c1507790pL7.getClass();
        C1507790pL7.LJ("livesdk_tiktokec_product_click", jSONObject, str, pageFinder);
    }

    public static final void LJIIL(C661010PwJ c661010PwJ, AddressCardProducts addressCardProducts, int i, InterfaceC665370Q7z interfaceC665370Q7z, String str, PageFinder pageFinder) throws JSONException {
        String str2;
        EComShopCardStruct eComShopCardStruct;
        C1507790pL7 c1507790pL7 = C1507790pL7.LIZ;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("page_name", "general_search");
        jSONObject.put("enter_from", "general_search");
        jSONObject.put("enter_from_merge", "general_search");
        String strLIZ = c661010PwJ.LIZ();
        if (!C123100dR.LIZ(strLIZ) || strLIZ == null) {
            strLIZ = "search_live_card_anchor";
        }
        jSONObject.put("entrance_form", strLIZ);
        jSONObject.put("list_item_id", addressCardProducts.productId);
        jSONObject.put("search_id", ((C0PRC) ((ISearchContextAbility) C1558520qew.LIZJ(interfaceC665370Q7z, ISearchContextAbility.class)).Ph1().LIZJ()).LLILLL);
        SearchMixFeedBase searchMixFeedBase = c661010PwJ.LL;
        if (searchMixFeedBase == null || (eComShopCardStruct = searchMixFeedBase.shopCard) == null || (str2 = eComShopCardStruct.docId) == null) {
            str2 = "";
        }
        jSONObject.put("search_result_id", str2);
        jSONObject.put("list_result_type", "live");
        jSONObject.put("item_order", i + 1);
        LIZ(addressCardProducts, c661010PwJ, interfaceC665370Q7z, jSONObject);
        c1507790pL7.getClass();
        C1507790pL7.LJ("livesdk_tiktokec_product_show", jSONObject, str, pageFinder);
    }

    public static final void LJIILJJIL(C661010PwJ c661010PwJ, InterfaceC665370Q7z interfaceC665370Q7z, ShopCardCategory shopCardCategory, String str, PageFinder pageFinder, int i) {
        String str2;
        SearchMixFeedBase searchMixFeedBase;
        EComShopCardStruct eComShopCardStruct;
        String str3;
        SearchMixFeedBase searchMixFeedBase2;
        EComShopCardStruct eComShopCardStruct2;
        C1507790pL7 c1507790pL7 = C1507790pL7.LIZ;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("search_id", ((C0PRC) ((ISearchContextAbility) C1558520qew.LIZJ(interfaceC665370Q7z, ISearchContextAbility.class)).Ph1().LIZJ()).LLILLL);
        String str4 = "";
        if (c661010PwJ == null || (searchMixFeedBase2 = c661010PwJ.LL) == null || (eComShopCardStruct2 = searchMixFeedBase2.shopCard) == null || (str2 = eComShopCardStruct2.docId) == null) {
            str2 = "";
        }
        jSONObject.put("search_result_id", str2);
        jSONObject.put("search_keyword", ((C0PRC) ((ISearchContextAbility) C1558520qew.LIZJ(interfaceC665370Q7z, ISearchContextAbility.class)).Ph1().LIZJ()).LLIZLLLIL);
        if (c661010PwJ != null && (searchMixFeedBase = c661010PwJ.LL) != null && (eComShopCardStruct = searchMixFeedBase.shopCard) != null && (str3 = eComShopCardStruct.shopId) != null) {
            str4 = str3;
        }
        jSONObject.put("shop_id", str4);
        jSONObject.put("tab_name", shopCardCategory.name);
        jSONObject.put("tab_rank", i);
        c1507790pL7.getClass();
        C1507790pL7.LJ("search_shop_card_tab_show", jSONObject, str, pageFinder);
    }

    public static final void LJIIIZ(C661010PwJ c661010PwJ, AddressCardProducts addressCardProducts, int i, InterfaceC665370Q7z interfaceC665370Q7z, String str, PageFinder pageFinder, boolean z) throws JSONException {
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        SearchMixFeedBase searchMixFeedBase;
        EComShopCardStruct eComShopCardStruct;
        String str7;
        SearchMixFeedBase searchMixFeedBase2;
        EComShopCardStruct eComShopCardStruct2;
        SearchMixFeedBase searchMixFeedBase3;
        EComShopCardStruct eComShopCardStruct3;
        User user;
        SearchMixFeedBase searchMixFeedBase4;
        EComShopCardStruct eComShopCardStruct4;
        Map<String, String> map;
        SearchMixFeedBase searchMixFeedBase5;
        EComShopCardStruct eComShopCardStruct5;
        List<AddressCardProducts> list;
        AddressCardProducts addressCardProducts2;
        SearchMixFeedBase searchMixFeedBase6;
        EComShopCardStruct eComShopCardStruct6;
        C1507790pL7 c1507790pL7 = C1507790pL7.LIZ;
        JSONObject jSONObject = new JSONObject();
        String str8 = "";
        if (c661010PwJ == null || (searchMixFeedBase6 = c661010PwJ.LL) == null || (eComShopCardStruct6 = searchMixFeedBase6.shopCard) == null || (str2 = eComShopCardStruct6.shopId) == null) {
            str2 = "";
        }
        jSONObject.put("shop_id", str2);
        int followStatus = 0;
        if (c661010PwJ == null || (searchMixFeedBase5 = c661010PwJ.LL) == null || (eComShopCardStruct5 = searchMixFeedBase5.shopCard) == null || (list = eComShopCardStruct5.addressCardProduct) == null || (addressCardProducts2 = (AddressCardProducts) C13LP.LJJJLZIJ(0, list)) == null || (str3 = addressCardProducts2.platform) == null) {
            str3 = CardStruct.IStatusCode.DEFAULT;
        }
        jSONObject.put("product_source", str3);
        Map<String, String> map2 = addressCardProducts.trackExtra;
        if (map2 != null) {
            for (Map.Entry<String, String> entry : map2.entrySet()) {
                if (Intrinsics.LJFF(entry.getKey(), "source_from")) {
                    jSONObject.put("source_from", entry.getValue());
                }
                if (Intrinsics.LJFF(entry.getKey(), "source")) {
                    jSONObject.put("source", entry.getValue());
                }
            }
        }
        String str9 = addressCardProducts.productId;
        if (str9 == null) {
            str9 = "";
        }
        jSONObject.put("product_id", str9);
        BcmStandardTrackEvent bcmStandardTrackEvent = addressCardProducts.bcmStandardTrackEvent;
        if (bcmStandardTrackEvent != null && (map = bcmStandardTrackEvent.trackParamMap) != null) {
            for (Map.Entry<String, String> entry2 : map.entrySet()) {
                jSONObject.put(entry2.getKey(), entry2.getValue());
            }
        }
        String strLIZ = null;
        if (c661010PwJ != null && (searchMixFeedBase4 = c661010PwJ.LL) != null && (eComShopCardStruct4 = searchMixFeedBase4.shopCard) != null) {
            str4 = eComShopCardStruct4.userId;
        } else {
            str4 = null;
        }
        jSONObject.put("is_self", TextUtils.equals(str4, ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId()) ? 1 : 0);
        jSONObject.put("item_order", i + 1);
        jSONObject.put("page_name", "general_search");
        if (!z) {
            str5 = "general_search";
        } else {
            str5 = "live";
        }
        jSONObject.put("source_page_type", str5);
        if (c661010PwJ != null && (searchMixFeedBase3 = c661010PwJ.LL) != null && (eComShopCardStruct3 = searchMixFeedBase3.shopCard) != null && (user = eComShopCardStruct3.userInfo) != null) {
            followStatus = user.getFollowStatus();
        }
        jSONObject.put("follow_status", followStatus);
        if (c661010PwJ != null) {
            strLIZ = c661010PwJ.LIZ();
        }
        if (!C123100dR.LIZ(strLIZ) || strLIZ == null) {
            strLIZ = "shop_card";
        }
        jSONObject.put("entrance_form", strLIZ);
        jSONObject.put("search_id", ((C0PRC) ((ISearchContextAbility) C1558520qew.LIZJ(interfaceC665370Q7z, ISearchContextAbility.class)).Ph1().LIZJ()).LLILLL);
        if (c661010PwJ == null || (searchMixFeedBase2 = c661010PwJ.LL) == null || (eComShopCardStruct2 = searchMixFeedBase2.shopCard) == null || (str6 = eComShopCardStruct2.docId) == null) {
            str6 = "";
        }
        jSONObject.put("search_result_id", str6);
        if (c661010PwJ != null && (searchMixFeedBase = c661010PwJ.LL) != null && (eComShopCardStruct = searchMixFeedBase.shopCard) != null && (str7 = eComShopCardStruct.roomId) != null) {
            str8 = str7;
        }
        jSONObject.put("list_item_id", str8);
        jSONObject.put("search_entrance", ((C663990Q2r) ((ISearchContextAbility) C1558520qew.LIZJ(interfaceC665370Q7z, ISearchContextAbility.class)).Ww1().LIZJ()).LL);
        jSONObject.put("enter_from", "general_search");
        jSONObject.put("token_type", "shop");
        c1507790pL7.getClass();
        C1507790pL7.LJ("tiktokec_product_click", jSONObject, str, pageFinder);
    }

    public static final void LJIIJ(C661010PwJ c661010PwJ, AddressCardProducts addressCardProducts, int i, InterfaceC665370Q7z interfaceC665370Q7z, String str, PageFinder pageFinder, boolean z) throws JSONException {
        String str2;
        String str3;
        String str4;
        String str5;
        EComShopCardStruct eComShopCardStruct;
        String str6;
        EComShopCardStruct eComShopCardStruct2;
        EComShopCardStruct eComShopCardStruct3;
        User user;
        EComShopCardStruct eComShopCardStruct4;
        Map<String, String> map;
        EComShopCardStruct eComShopCardStruct5;
        List<AddressCardProducts> list;
        AddressCardProducts addressCardProducts2;
        EComShopCardStruct eComShopCardStruct6;
        C1507790pL7 c1507790pL7 = C1507790pL7.LIZ;
        JSONObject jSONObject = new JSONObject();
        SearchMixFeedBase searchMixFeedBase = c661010PwJ.LL;
        String str7 = "";
        if (searchMixFeedBase == null || (eComShopCardStruct6 = searchMixFeedBase.shopCard) == null || (str2 = eComShopCardStruct6.shopId) == null) {
            str2 = "";
        }
        jSONObject.put("shop_id", str2);
        SearchMixFeedBase searchMixFeedBase2 = c661010PwJ.LL;
        int followStatus = 0;
        if (searchMixFeedBase2 == null || (eComShopCardStruct5 = searchMixFeedBase2.shopCard) == null || (list = eComShopCardStruct5.addressCardProduct) == null || (addressCardProducts2 = (AddressCardProducts) C13LP.LJJJLZIJ(0, list)) == null || (str3 = addressCardProducts2.platform) == null) {
            str3 = CardStruct.IStatusCode.DEFAULT;
        }
        jSONObject.put("product_source", str3);
        Map<String, String> map2 = addressCardProducts.trackExtra;
        if (map2 != null) {
            for (Map.Entry<String, String> entry : map2.entrySet()) {
                if (Intrinsics.LJFF(entry.getKey(), "source_from")) {
                    jSONObject.put("source_from", entry.getValue());
                }
                if (Intrinsics.LJFF(entry.getKey(), "source")) {
                    jSONObject.put("source", entry.getValue());
                }
            }
        }
        String str8 = addressCardProducts.productId;
        if (str8 == null) {
            str8 = "";
        }
        jSONObject.put("product_id", str8);
        BcmStandardTrackEvent bcmStandardTrackEvent = addressCardProducts.bcmStandardTrackEvent;
        if (bcmStandardTrackEvent != null && (map = bcmStandardTrackEvent.trackParamMap) != null) {
            for (Map.Entry<String, String> entry2 : map.entrySet()) {
                jSONObject.put(entry2.getKey(), entry2.getValue());
            }
        }
        SearchMixFeedBase searchMixFeedBase3 = c661010PwJ.LL;
        String str9 = null;
        if (searchMixFeedBase3 != null && (eComShopCardStruct4 = searchMixFeedBase3.shopCard) != null) {
            str9 = eComShopCardStruct4.userId;
        }
        jSONObject.put("is_self", TextUtils.equals(str9, ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId()) ? 1 : 0);
        jSONObject.put("item_order", i + 1);
        jSONObject.put("page_name", "general_search");
        if (!z) {
            str4 = "general_search";
        } else {
            str4 = "live";
        }
        jSONObject.put("source_page_type", str4);
        SearchMixFeedBase searchMixFeedBase4 = c661010PwJ.LL;
        if (searchMixFeedBase4 != null && (eComShopCardStruct3 = searchMixFeedBase4.shopCard) != null && (user = eComShopCardStruct3.userInfo) != null) {
            followStatus = user.getFollowStatus();
        }
        jSONObject.put("follow_status", followStatus);
        String strLIZ = c661010PwJ.LIZ();
        if (!C123100dR.LIZ(strLIZ) || strLIZ == null) {
            strLIZ = "shop_card";
        }
        jSONObject.put("entrance_form", strLIZ);
        jSONObject.put("search_id", ((C0PRC) ((ISearchContextAbility) C1558520qew.LIZJ(interfaceC665370Q7z, ISearchContextAbility.class)).Ph1().LIZJ()).LLILLL);
        SearchMixFeedBase searchMixFeedBase5 = c661010PwJ.LL;
        if (searchMixFeedBase5 == null || (eComShopCardStruct2 = searchMixFeedBase5.shopCard) == null || (str5 = eComShopCardStruct2.docId) == null) {
            str5 = "";
        }
        jSONObject.put("search_result_id", str5);
        SearchMixFeedBase searchMixFeedBase6 = c661010PwJ.LL;
        if (searchMixFeedBase6 != null && (eComShopCardStruct = searchMixFeedBase6.shopCard) != null && (str6 = eComShopCardStruct.roomId) != null) {
            str7 = str6;
        }
        jSONObject.put("list_item_id", str7);
        jSONObject.put("search_entrance", ((C663990Q2r) ((ISearchContextAbility) C1558520qew.LIZJ(interfaceC665370Q7z, ISearchContextAbility.class)).Ww1().LIZJ()).LL);
        jSONObject.put("enter_from", "general_search");
        jSONObject.put("token_type", "shop");
        c1507790pL7.getClass();
        C1507790pL7.LJ("tiktokec_product_show", jSONObject, str, pageFinder);
    }
}
