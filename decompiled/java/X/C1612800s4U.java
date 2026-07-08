package X;

import android.content.Context;
import android.net.Uri;
import com.bytedance.forest.model.RequestParams;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.lynx.hybrid.service.IResourceServiceX;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.SeriesCategory;
import com.ss.android.ugc.aweme.model.CollectionDetailModel;
import com.ss.android.ugc.aweme.model.PaywallInfoModel;
import com.ss.android.ugc.aweme.model.PriceInfo;
import com.ss.android.ugc.aweme.model.PurchaseOption;
import com.ss.android.ugc.aweme.model.UrlModel;
import com.ss.android.ugc.aweme.model.VipSubscriptionCycleType;
import com.ss.android.ugc.aweme.model.VipSubscriptionPrice;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.text.Regex;
import kotlin.text.a0;
import kotlin.text.u;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.0s4U, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1612800s4U {
    public static final C1612800s4U LIZ = new C1612800s4U();

    public static String LJI(String str) {
        String strLJJIFFI;
        if (str == null) {
            return "";
        }
        String strReplace = new Regex("[^\\d,.]").replace(str, "");
        if (new Regex("\\d,\\d{2}(?!\\d)").containsMatchIn(strReplace)) {
            strLJJIFFI = u.LJJIFFI(u.LJJIFFI(strReplace, e3.d, "", false), ",", e3.d, false);
        } else {
            strLJJIFFI = u.LJJIFFI(strReplace, ",", "", false);
        }
        if (strLJJIFFI.length() == 0) {
            return "";
        }
        return strLJJIFFI;
    }

    public static void LJIIIIZZ(String str) {
        if (a0.LJJJIL(str)) {
            return;
        }
        SparkContext sparkContext = new SparkContext();
        sparkContext.LJJLIIJ(str);
        sparkContext.usePreload = true;
        RequestParams requestParams = new RequestParams(EnumC1533980q1M.LYNX_TEMPLATE);
        requestParams.enableMemoryCache = Boolean.TRUE;
        requestParams.customParams.put("rl_container_uuid", sparkContext.containerId);
        JSONArray jSONArray = C1533710q0v.LIZ;
        String strLIZLLL = C1533710q0v.LIZLLL(null, requestParams, sparkContext.LJIJI());
        IResourceServiceX iResourceServiceXLIZIZ = C1533710q0v.LIZIZ(sparkContext, false);
        if (iResourceServiceXLIZIZ != null) {
            iResourceServiceXLIZIZ.preload(strLIZLLL, requestParams, null);
        }
    }

    public static JSONArray LIZLLL(List list, List list2) throws JSONException {
        long jLongValue;
        boolean zBooleanValue;
        Object next;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        JSONArray jSONArray = new JSONArray();
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            String str6 = null;
            if (i >= 0) {
                PurchaseOption purchaseOption = (PurchaseOption) obj;
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("title", purchaseOption.title);
                jSONObject.put("num_videos", purchaseOption.numVideos);
                jSONObject.put("purchase_category", purchaseOption.purchaseCategory.getValue());
                String str7 = purchaseOption.discountedString;
                if (str7 == null) {
                    str7 = "";
                }
                jSONObject.put("discount_string", str7);
                Long l = purchaseOption.discountId;
                if (l != null) {
                    jLongValue = l.longValue();
                } else {
                    jLongValue = 0;
                }
                jSONObject.put("discount_id", jLongValue);
                Boolean boolIsHot = purchaseOption.isHot();
                if (boolIsHot != null) {
                    zBooleanValue = boolIsHot.booleanValue();
                } else {
                    zBooleanValue = false;
                }
                jSONObject.put("is_hot", zBooleanValue);
                jSONObject.put("discount_percentage", purchaseOption.discountPercentage);
                jSONObject.put("is_best", purchaseOption.isBest());
                Iterator it2 = list2.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        next = it2.next();
                        if (((C1613030s4r) next).LIZ == i) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                C1613030s4r c1613030s4r = (C1613030s4r) next;
                PriceInfo priceInfo = purchaseOption.price;
                if (priceInfo != null) {
                    C1612800s4U c1612800s4U = LIZ;
                    if (c1613030s4r != null) {
                        str3 = c1613030s4r.LIZLLL;
                        str4 = c1613030s4r.LJIIIIZZ;
                        str5 = c1613030s4r.LIZJ;
                    } else {
                        str3 = null;
                        str4 = null;
                        str5 = null;
                    }
                    c1612800s4U.getClass();
                    jSONObject.put("price", LIZJ(priceInfo, str3, str4, str5));
                }
                PriceInfo priceInfo2 = purchaseOption.discountedPrice;
                if (priceInfo2 != null) {
                    C1612800s4U c1612800s4U2 = LIZ;
                    if (c1613030s4r != null) {
                        str = c1613030s4r.LJI;
                        str2 = c1613030s4r.LJIIIIZZ;
                        str6 = c1613030s4r.LJFF;
                    } else {
                        str = null;
                        str2 = null;
                    }
                    c1612800s4U2.getClass();
                    jSONObject.put("discounted_price", LIZJ(priceInfo2, str, str2, str6));
                }
                jSONArray.put(jSONObject);
                i = i2;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        return jSONArray;
    }

    public static JSONObject LJ(List list, JSONObject jSONObject) {
        JSONObject jSONObject2;
        Integer numValueOf;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        if (jSONObject != null) {
            jSONObject2 = new JSONObject(C786410Ut5.J3(jSONObject));
        } else {
            jSONObject2 = new JSONObject();
        }
        JSONObject jSONObjectOptJSONObject = jSONObject2.optJSONObject("paywall_info");
        JSONObject jSONObject3 = jSONObjectOptJSONObject;
        if (jSONObjectOptJSONObject == null) {
            JSONObject jSONObject4 = new JSONObject();
            jSONObject2.put("paywall_info", jSONObject4);
            jSONObject3 = jSONObject4;
        }
        LIZ.getClass();
        JSONArray jSONArray = new JSONArray();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            C1612820s4W c1612820s4W = (C1612820s4W) it2.next();
            VipSubscriptionPrice vipSubscriptionPrice = c1612820s4W.LIZJ;
            JSONObject jSONObject5 = new JSONObject();
            jSONObject5.put("title", c1612820s4W.LIZ);
            jSONObject5.put("desc", c1612820s4W.LIZIZ);
            jSONObject5.put("discount_percentage", c1612820s4W.LJFF);
            jSONObject5.put("is_best", c1612820s4W.LJI);
            jSONObject5.put("is_auto_renew", c1612820s4W.LJII);
            VipSubscriptionCycleType vipSubscriptionCycleType = c1612820s4W.LJIIIIZZ;
            String str12 = null;
            if (vipSubscriptionCycleType != null) {
                numValueOf = Integer.valueOf(vipSubscriptionCycleType.getValue());
            } else {
                numValueOf = null;
            }
            jSONObject5.put("cycle_type", numValueOf);
            JSONObject jSONObject6 = new JSONObject();
            if (vipSubscriptionPrice != null) {
                str = vipSubscriptionPrice.spuId;
            } else {
                str = null;
            }
            jSONObject6.put("spu_id", str);
            if (vipSubscriptionPrice != null) {
                str2 = vipSubscriptionPrice.skuId;
            } else {
                str2 = null;
            }
            jSONObject6.put("sku_id", str2);
            if (vipSubscriptionPrice != null) {
                str3 = vipSubscriptionPrice.priceInUsd;
            } else {
                str3 = null;
            }
            jSONObject6.put("price_in_usd", str3);
            C1612800s4U c1612800s4U = LIZ;
            if (vipSubscriptionPrice != null) {
                str4 = vipSubscriptionPrice.localPriceAmount;
            } else {
                str4 = null;
            }
            c1612800s4U.getClass();
            jSONObject6.put("local_price_amount", LJI(str4));
            if (vipSubscriptionPrice != null) {
                str5 = vipSubscriptionPrice.localCurrencyCode;
            } else {
                str5 = null;
            }
            jSONObject6.put("local_currency_code", str5);
            if (vipSubscriptionPrice != null) {
                str6 = vipSubscriptionPrice.discountPriceInUsd;
            } else {
                str6 = null;
            }
            jSONObject6.put("discount_price_in_usd", str6);
            if (vipSubscriptionPrice != null) {
                str7 = vipSubscriptionPrice.localDiscountPriceAmount;
            } else {
                str7 = null;
            }
            jSONObject6.put("local_discount_price_amount", LJI(str7));
            jSONObject6.put("local_price_amount_display", c1612820s4W.LIZLLL);
            jSONObject6.put("local_discount_price_amount_display", c1612820s4W.LJ);
            if (vipSubscriptionPrice != null) {
                str8 = vipSubscriptionPrice.voucherId;
            } else {
                str8 = null;
            }
            jSONObject6.put("voucher_id", str8);
            if (vipSubscriptionPrice != null) {
                str9 = vipSubscriptionPrice.mpProductId;
            } else {
                str9 = null;
            }
            jSONObject6.put("mp_product_id", str9);
            if (vipSubscriptionPrice != null) {
                str10 = vipSubscriptionPrice.mpPricePointId;
            } else {
                str10 = null;
            }
            jSONObject6.put("mp_price_point_id", str10);
            if (vipSubscriptionPrice != null) {
                str11 = vipSubscriptionPrice.promotionFlag;
            } else {
                str11 = null;
            }
            jSONObject6.put("promotion_flag", str11);
            if (vipSubscriptionPrice != null) {
                str12 = vipSubscriptionPrice.promotionOfferId;
            }
            jSONObject6.put("promotion_offer_id", str12);
            jSONObject5.put("price", jSONObject6);
            jSONArray.put(jSONObject5);
        }
        jSONObject3.put("subs_options", jSONArray);
        return jSONObject2;
    }

    public static String LJFF(EnumC1616780sAu enumC1616780sAu, String str) {
        C1616810sAx c1616810sAx = C1616810sAx.LIZIZ;
        String priceRegion = c1616810sAx.getPriceRegion();
        boolean zLJIILJJIL = c1616810sAx.LJIILJJIL();
        Uri.Builder builderAppendQueryParameter = UriProtector.parse("aweme://roma_redirect/?spark_page=short_drama_iap_paywall_dynamic").buildUpon().appendQueryParameter("business_line", String.valueOf(enumC1616780sAu.getValue())).appendQueryParameter(Scene.SCENE_SERVICE, "purchase_panel");
        if (str != null && !a0.LJJJIL(str)) {
            builderAppendQueryParameter.appendQueryParameter("spu_id", str);
        }
        if (!a0.LJJJIL(priceRegion)) {
            builderAppendQueryParameter.appendQueryParameter("price_region", priceRegion);
        }
        builderAppendQueryParameter.appendQueryParameter("enable_web_payment", String.valueOf(zLJIILJJIL));
        return builderAppendQueryParameter.build().toString();
    }

    public static SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB LJII(Context context, String str, Map map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(map);
        SparkContext sparkContext = new SparkContext();
        sparkContext.LJJLIIJ(str);
        sparkContext.usePreload = true;
        sparkContext.LJJLIIIJILLIZJL(linkedHashMap);
        C1541950qED.LIZJ.getClass();
        return new C1541950qED(context, sparkContext).LIZ(false);
    }

    public static JSONObject LIZIZ(Long l, CollectionDetailModel collectionDetailModel, C1612770s4R c1612770s4R, EnumC1612690s4J enumC1612690s4J) {
        String str;
        String uid;
        Boolean boolValueOf;
        int iOrdinal;
        String key;
        C1612570s47 c1612570s47;
        String str2;
        String str3;
        String str4;
        SeriesCategory seriesCategory;
        User user;
        if (l != null) {
            l.longValue();
            if (c1612770s4R == null) {
                return new JSONObject();
            }
            if (collectionDetailModel != null && collectionDetailModel.hasVoucher && collectionDetailModel.enableSingleVideoPurchase) {
                str = "1";
            } else {
                str = CardStruct.IStatusCode.DEFAULT;
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("enter_from", c1612770s4R.LJ);
            jSONObject.put("collection_id", l.longValue());
            Integer numValueOf = null;
            if (collectionDetailModel != null && (user = collectionDetailModel.collectionCreator) != null) {
                uid = user.getUid();
            } else {
                uid = null;
            }
            String str5 = "";
            if (uid == null) {
                uid = "";
            }
            jSONObject.put("collection_user_id", uid);
            C1611790s2r c1611790s2r = C1611790s2r.LIZ;
            if (collectionDetailModel != null) {
                boolValueOf = Boolean.valueOf(collectionDetailModel.enableSingleVideoPurchase);
            } else {
                boolValueOf = null;
            }
            c1611790s2r.getClass();
            jSONObject.put("if_can_unlock_single", String.valueOf(C1611790s2r.LJIIL(boolValueOf)));
            jSONObject.put("if_offer_bundle_discount", str);
            jSONObject.put("is_from_anchor", String.valueOf(C1611790s2r.LJIIL(Boolean.valueOf(c1612770s4R.LIZ))));
            jSONObject.put("is_from_bottom_banner", String.valueOf(C1611790s2r.LJIIL(Boolean.valueOf(c1612770s4R.LIZIZ))));
            jSONObject.put("is_from_hot_zone", String.valueOf(C1611790s2r.LJIIL(c1612770s4R.LJIIJJI)));
            if (collectionDetailModel != null) {
                numValueOf = Integer.valueOf(C1611790s2r.LJIIL(Boolean.valueOf(collectionDetailModel.hasUserPartialPurchased)));
            }
            jSONObject.put("is_partial_purchased", String.valueOf(numValueOf));
            if (collectionDetailModel != null && (seriesCategory = collectionDetailModel.category) != null) {
                iOrdinal = seriesCategory.ordinal();
            } else {
                iOrdinal = 0;
            }
            jSONObject.put("series_category", iOrdinal);
            if (enumC1612690s4J == null || (key = enumC1612690s4J.getKey()) == null) {
                key = c1612770s4R.LJFF.getKey();
            }
            jSONObject.put("source_way", key);
            jSONObject.put("group_id", c1612770s4R.LJIIIIZZ);
            jSONObject.put("source_group_id", c1612770s4R.LJIILJJIL);
            C1612600s4A c1612600s4A = c1612770s4R.LJIIIZ;
            if ((c1612600s4A == null || (str2 = c1612600s4A.anchorVideoId) == null) && ((c1612570s47 = c1612770s4R.LJIILIIL) == null || (str2 = c1612570s47.sourceVideoId) == null)) {
                str2 = "";
            }
            jSONObject.put("source_video_id", str2);
            C1612600s4A c1612600s4A2 = c1612770s4R.LJIIIZ;
            if (c1612600s4A2 != null && (str4 = c1612600s4A2.anchorAuthorId) != null) {
                str5 = str4;
            } else {
                C1612570s47 c1612570s472 = c1612770s4R.LJIILIIL;
                if (c1612570s472 != null && (str3 = c1612570s472.sourceAuthorId) != null) {
                    str5 = str3;
                }
            }
            jSONObject.put("source_author_id", str5);
            jSONObject.put("series_enter_entrance", c1612770s4R.LJIILL);
            if (C517260KQi.LIZ()) {
                jSONObject.put("is_auto_triggered_paywall", c1612770s4R.LJII ? 1 : 0);
                jSONObject.put("series_category", SeriesCategory.MINI_DRAMA.ordinal());
            }
            return jSONObject;
        }
        return new JSONObject();
    }

    public static JSONObject LIZJ(PriceInfo priceInfo, String str, String str2, String str3) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("iap_id", priceInfo.iapId);
        jSONObject.put("diamond_id", priceInfo.diamondId);
        jSONObject.put("price_in_usd", priceInfo.priceInUsd);
        jSONObject.put("local_price_amount", str);
        jSONObject.put("local_currency_code", str2);
        jSONObject.put("local_price_amount_display", str3);
        return jSONObject;
    }

    public static JSONObject LIZ(long j, CollectionDetailModel collectionDetailModel, List list, List list2, PaywallInfoModel paywallInfoModel, C1613030s4r c1613030s4r) {
        JSONObject jSONObject;
        List<String> urlList;
        Object objLJJJLL;
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("collection_id", j);
        String str = collectionDetailModel.collectionName;
        if (str == null) {
            str = "";
        }
        jSONObject3.put("name", str);
        jSONObject3.put("num_watched", collectionDetailModel.numWatched);
        jSONObject3.put("num_videos", collectionDetailModel.collectionVideoNum);
        jSONObject3.put("has_user_purchased", collectionDetailModel.hasPurchasedCollection);
        jSONObject3.put("has_user_partial_purchased", collectionDetailModel.hasUserPartialPurchased);
        jSONObject3.put("enable_single_video_purchase", collectionDetailModel.enableSingleVideoPurchase);
        UrlModel urlModel = collectionDetailModel.collectionCover;
        if (urlModel != null && (urlList = urlModel.getUrlList()) != null && (objLJJJLL = C13LP.LJJJLL(urlList)) != null) {
            jSONObject3.put("cover_url", objLJJJLL);
        }
        jSONObject2.put("collection", jSONObject3);
        if (paywallInfoModel == null) {
            jSONObject = new JSONObject();
        } else {
            jSONObject = new JSONObject();
            jSONObject.put("paywall_expr_group", paywallInfoModel.paywallExpGroup);
            if (c1613030s4r != null) {
                PriceInfo priceInfo = paywallInfoModel.panelOriPrice;
                if (priceInfo != null) {
                    C1612800s4U c1612800s4U = LIZ;
                    String str2 = c1613030s4r.LIZLLL;
                    String str3 = c1613030s4r.LJIIIIZZ;
                    String str4 = c1613030s4r.LIZJ;
                    c1612800s4U.getClass();
                    jSONObject.put("panel_ori_price", LIZJ(priceInfo, str2, str3, str4));
                }
                PriceInfo priceInfo2 = paywallInfoModel.panelShowPrice;
                if (priceInfo2 != null) {
                    C1612800s4U c1612800s4U2 = LIZ;
                    String str5 = c1613030s4r.LJI;
                    String str6 = c1613030s4r.LJIIIIZZ;
                    String str7 = c1613030s4r.LJFF;
                    c1612800s4U2.getClass();
                    jSONObject.put("panel_show_price", LIZJ(priceInfo2, str5, str6, str7));
                }
            }
            jSONObject.put("after_purchase_toast", paywallInfoModel.afterPurchaseToast);
            jSONObject.put("after_purchase_redirect_url", paywallInfoModel.afterPurchaseRedirectUrl);
            jSONObject.put("after_purchase_redirect_type", paywallInfoModel.afterPurchaseRedirectType);
            jSONObject.put("after_purchase_popup_redirect_url", paywallInfoModel.afterPurchasePopupRedirectUrl);
            jSONObject.put("subs_options", paywallInfoModel.subsOptions);
            jSONObject.put("after_subs_toast", paywallInfoModel.afterSubsToast);
            jSONObject.put("after_subs_redirect_url", paywallInfoModel.afterSubsRedirectUrl);
            jSONObject.put("after_subs_popup_redirect_url", paywallInfoModel.afterSubsPopupRedirectUrl);
        }
        jSONObject2.put("paywall_info", jSONObject);
        jSONObject2.put("purchase_options", LIZLLL(list, list2));
        return jSONObject2;
    }
}
