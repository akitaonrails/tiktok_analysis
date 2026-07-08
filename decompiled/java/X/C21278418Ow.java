package X;

import android.content.Context;
import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ab.ECSearchFypSeptupleConfig;
import com.ss.android.ugc.aweme.ecommerce.config.AnchorPanelConfig;
import com.ss.android.ugc.aweme.ecommerce.model.AnchorProductInfo;
import com.ss.android.ugc.aweme.ecommerce.model.AnchorProductInfoModel;
import com.ss.android.ugc.aweme.ecommerce.model.PriceDaInfo;
import com.ss.android.ugc.aweme.ecommerce.model.ProductBase;
import com.ss.android.ugc.aweme.ecommerce.model.ProductListModel;
import com.ss.android.ugc.aweme.ecommerce.model.ProductPrice;
import com.ss.android.ugc.aweme.ecommerce.search.feedcard.bean.ProductCardInsert;
import com.ss.android.ugc.aweme.ecommerce.search.feedcard.bean.ProductCardItem;
import com.ss.android.ugc.aweme.ecommerce.service.IECommerceAnchorService;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import com.ss.android.ugc.aweme.ecommerce.ug.common.bean.EcUgProduct;
import com.ss.android.ugc.aweme.ecommerce.ug.vsa.repository.bean.VSACardsResponse;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.AnchorCustomData;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.EcUgVSAData;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.u;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.18Ow, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21278418Ow {
    public static final C21278418Ow LIZ = new C21278418Ow();

    public static boolean LJIIIIZZ(String str) {
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter;
        if (str == null || a0.LJJJIL(str)) {
            return false;
        }
        try {
            Uri uri = UriProtector.parse(str);
            String host = uri.getHost();
            String path = uri.getPath();
            if (Intrinsics.LJFF("ec", host) && Intrinsics.LJFF("/plp", path) && (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "plp_cache_key")) != null) {
                if (!a0.LJJJIL(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter)) {
                    return true;
                }
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        return false;
    }

    public static boolean LJIIIZ(String str) {
        if (str == null || a0.LJJJIL(str)) {
            return false;
        }
        try {
            Uri uri = UriProtector.parse(str);
            String host = uri.getHost();
            String path = uri.getPath();
            if (Intrinsics.LJFF("ec", host) && Intrinsics.LJFF("/plp", path) && a0.LJJJIL(AnonymousClass0185.LJ(uri, "plp_cache_key"))) {
                C18PM.LJI(C18PM.LIZ, EnumC21279818Pk.JUMP.getValue(), false, 0, "plp no cache", null, null, null, null, 244);
                return true;
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        return false;
    }

    public static String LIZJ(C21279318Pf c21279318Pf, String str) {
        VSACardsResponse.VSACardData vSACardData;
        List<EcUgProduct> list;
        ArrayList arrayList = new ArrayList();
        int i = 1;
        if (C123100dR.LIZ(str)) {
            arrayList.add(new ProductCardItem(str, 1, 1));
            i = 2;
        }
        if (c21279318Pf != null && (vSACardData = c21279318Pf.LJFF) != null && (list = vSACardData.productList) != null) {
            for (EcUgProduct ecUgProduct : list) {
                if (C123100dR.LIZ(ecUgProduct.productId) && !Intrinsics.LJFF(ecUgProduct.productId, str)) {
                    arrayList.add(new ProductCardItem(ecUgProduct.productId, Integer.valueOf(i), null));
                    i++;
                }
                ECSearchFypSeptupleConfig eCSearchFypSeptupleConfig = C1843507Jx.LIZIZ;
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        try {
            return C1741890vQh.LJIIIIZZ(Collections.singletonList(new ProductCardInsert("product_card", arrayList)));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
            return null;
        }
    }

    public static String LJFF(C21279318Pf c21279318Pf, String str) {
        List<EcUgProduct> list;
        boolean z;
        boolean z2 = true;
        ArrayList arrayList = null;
        if (c21279318Pf != null) {
            try {
                VSACardsResponse.VSACardData vSACardData = c21279318Pf.LJFF;
                if (vSACardData != null && (list = vSACardData.productList) != null) {
                    ArrayList arrayList2 = new ArrayList();
                    Iterator<EcUgProduct> it2 = list.iterator();
                    while (it2.hasNext()) {
                        String str2 = it2.next().productId;
                        if (str2 == null || a0.LJJJIL(str2)) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (z) {
                            str2 = null;
                        }
                        if (str2 != null) {
                            arrayList2.add(str2);
                        }
                    }
                    arrayList = new ArrayList(arrayList2);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                return "";
            }
        }
        if (arrayList != null && !arrayList.isEmpty()) {
            z2 = false;
        }
        if (z2) {
            return "";
        }
        int iIndexOf = arrayList.indexOf(str);
        if (iIndexOf > 0 && iIndexOf < arrayList.size()) {
            arrayList.add(0, (String) arrayList.remove(iIndexOf));
        }
        return C07TX.LIZ(arrayList);
    }

    public static String LJI(C21279318Pf c21279318Pf, String str) {
        VSACardsResponse.VSACardData vSACardData;
        List<EcUgProduct> list;
        if (c21279318Pf != null && (vSACardData = c21279318Pf.LJFF) != null && (list = vSACardData.productList) != null) {
            String strLIZIZ = str;
            for (EcUgProduct ecUgProduct : list) {
                if (C123100dR.LIZ(ecUgProduct.productId) && !Intrinsics.LJFF(ecUgProduct.productId, str)) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(strLIZIZ);
                    sbLIZ.append(';');
                    sbLIZ.append(ecUgProduct.productId);
                    strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                }
                ECSearchFypSeptupleConfig eCSearchFypSeptupleConfig = C1843507Jx.LIZIZ;
            }
            return strLIZIZ;
        }
        return str;
    }

    public static boolean LJIIJ(String str, EnumC1154430g9B enumC1154430g9B) {
        try {
            return Intrinsics.LJFF(enumC1154430g9B.getValue(), AnonymousClass0185.LJ(UriProtector.parse(str), "ec_ug_page"));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return false;
        }
    }

    public static void LJIIJJI(String str, List list) {
        Long lLJIILIIL;
        if (list != null && !list.isEmpty() && (lLJIILIIL = C2095008Iq.LJIILIIL(str)) != null) {
            long jLongValue = lLJIILIIL.longValue();
            try {
                Iterator it2 = list.iterator();
                int i = 0;
                while (it2.hasNext()) {
                    Long l = ((AnchorProductInfoModel) it2.next()).extraData.productId;
                    if (l == null || jLongValue != l.longValue()) {
                        i++;
                    } else {
                        if (i > 0 && i < list.size()) {
                            list.add(0, (AnchorProductInfoModel) list.remove(i));
                            return;
                        }
                        return;
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
    }

    public static String LJ(Aweme aweme, String str, String str2) {
        String str3;
        boolean z;
        JSONObject jSONObject;
        JSONObject jSONObject2;
        boolean z2;
        EcUgVSAData ecUgVSAData;
        AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
        String str4 = null;
        if (awemeRawAd != null && (ecUgVSAData = awemeRawAd.getEcUgVSAData()) != null) {
            str3 = ecUgVSAData.pdpTemplateUrl;
        } else {
            str3 = null;
        }
        if (str3 != null && !a0.LJJJIL(str3)) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            return "";
        }
        try {
            Uri uri = UriProtector.parse(str3);
            String strLJ = AnonymousClass0185.LJ(uri, "requestParams");
            if (a0.LJJJIL(strLJ)) {
                jSONObject = new JSONObject();
            } else {
                jSONObject = new JSONObject(strLJ);
            }
            JSONArray jSONArray = new JSONArray();
            jSONArray.put("__PRODUCT_ID_PLACEHOLDER__");
            jSONObject.put("product_id", jSONArray);
            String strLJ2 = AnonymousClass0185.LJ(uri, "trackParams");
            if (a0.LJJJIL(strLJ2)) {
                jSONObject2 = new JSONObject();
            } else {
                jSONObject2 = new JSONObject(strLJ2);
            }
            jSONObject2.put("product_id", "__PRODUCT_ID_PLACEHOLDER__");
            if (!a0.LJJJIL(str)) {
                jSONObject2.put("previous_page", str);
            }
            if (!a0.LJJJIL(str2)) {
                jSONObject2.put("enter_click_area", str2);
            }
            String aid = aweme.getAid();
            if (aid == null || a0.LJJJIL(aid)) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2) {
                str4 = aid;
            }
            if (str4 != null) {
                jSONObject2.put("source_content_id", str4);
            }
            Uri uriLIZJ = AnonymousClass0185.LIZJ(uri, C2097608Jq.LJIIIIZZ(new Pair("requestParams", C786410Ut5.J3(jSONObject)), new Pair("trackParams", C786410Ut5.J3(jSONObject2)), new Pair("biz_type", "__BIZ_TYPE_PLACEHOLDER__")));
            if (uriLIZJ != null) {
                String string = uriLIZJ.toString();
                if (string != null) {
                    return string;
                }
            }
            return str3;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return str3;
        }
    }

    public static String LJIIL(Context context, EcUgProduct ecUgProduct, String str) {
        String str2;
        List<String> urls;
        if (ecUgProduct != null && !a0.LJJJIL(str)) {
            String strLIZIZ = C123500dV.LIZIZ(ecUgProduct.productId);
            String strLIZIZ2 = C123500dV.LIZIZ(ecUgProduct.title);
            EcUgProduct.EcUgProductPrice ecUgProductPrice = ecUgProduct.price;
            Object objLJJJLL = null;
            if (ecUgProductPrice != null) {
                str2 = ecUgProductPrice.minSalesPrice;
            } else {
                str2 = null;
            }
            String strLIZIZ3 = C123500dV.LIZIZ(str2);
            Image image = ecUgProduct.firstImage;
            if (image != null && (urls = image.getUrls()) != null) {
                objLJJJLL = C13LP.LJJJLL(urls);
            }
            String strLIZIZ4 = C123500dV.LIZIZ(objLJJJLL);
            if (a0.LJJJIL(strLIZIZ) && a0.LJJJIL(strLIZIZ2) && a0.LJJJIL(strLIZIZ3) && a0.LJJJIL(strLIZIZ4)) {
                return str;
            }
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("title", strLIZIZ2);
                jSONObject.put("price", strLIZIZ3);
                jSONObject.put("cover", strLIZIZ4);
                jSONObject.put(FollowStatusChangeMethod.PARAM_UID, strLIZIZ);
                C1323720kYE.LIZ(context).LJIIIIZZ(C786410Ut5.J3(jSONObject), "ec_ug_vsa_pdp_cache");
                return UriProtector.parse(str).buildUpon().appendQueryParameter("pdp_cache_key", "ec_ug_vsa_pdp_cache").build().toString();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        return str;
    }

    public static String LIZLLL(Aweme aweme, EcUgProduct ecUgProduct, String str, String str2) {
        boolean z;
        JSONObject jSONObject;
        String str3 = ecUgProduct.schema;
        boolean z2 = false;
        if (str3 != null && !a0.LJJJIL(str3)) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            return "";
        }
        try {
            Uri uri = UriProtector.parse(str3);
            String strLJ = AnonymousClass0185.LJ(uri, "trackParams");
            if (a0.LJJJIL(strLJ)) {
                jSONObject = new JSONObject();
            } else {
                jSONObject = new JSONObject(strLJ);
            }
            if (!a0.LJJJIL(str)) {
                jSONObject.put("previous_page", str);
            }
            if (!a0.LJJJIL(str2)) {
                jSONObject.put("enter_click_area", str2);
            }
            String aid = aweme.getAid();
            if (aid == null || a0.LJJJIL(aid)) {
                z2 = true;
            }
            if (z2) {
                aid = null;
            }
            if (aid != null) {
                jSONObject.put("source_content_id", aid);
            }
            Uri uriLIZIZ = AnonymousClass0185.LIZIZ(uri, "trackParams", C786410Ut5.J3(jSONObject));
            if (uriLIZIZ != null) {
                String string = uriLIZIZ.toString();
                if (string != null) {
                    return string;
                }
            }
            return str3;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return str3;
        }
    }

    public static AnchorProductInfoModel LIZ(Aweme aweme, EcUgProduct ecUgProduct, String str, String str2, String str3) {
        boolean z;
        Long lLJIILIIL;
        String strLJJIFFI;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        List<String> urls;
        List<String> urls2;
        String str11 = ecUgProduct.productId;
        if (str11 != null && !a0.LJJJIL(str11)) {
            z = false;
        } else {
            z = true;
        }
        if (!z && (lLJIILIIL = C2095008Iq.LJIILIIL(str11)) != null) {
            long jLongValue = lLJIILIIL.longValue();
            try {
                Integer num = ecUgProduct.bizType;
                String str12 = ecUgProduct.schema;
                if (str12 != null && !a0.LJJJIL(str12)) {
                    strLJJIFFI = LIZLLL(aweme, ecUgProduct, str2, str3);
                } else {
                    strLJJIFFI = u.LJJIFFI(u.LJJIFFI(str, "__PRODUCT_ID_PLACEHOLDER__", str11, false), "__BIZ_TYPE_PLACEHOLDER__", String.valueOf(num), false);
                }
                if (a0.LJJJIL(strLJJIFFI)) {
                    return null;
                }
                EcUgProduct.EcUgProductPrice ecUgProductPrice = ecUgProduct.price;
                if (ecUgProductPrice != null) {
                    str4 = ecUgProductPrice.minOriginalPrice;
                    str5 = ecUgProductPrice.minSalesPrice;
                    str6 = ecUgProductPrice.currency;
                } else {
                    str4 = null;
                    str5 = null;
                    str6 = null;
                }
                PriceDaInfo priceDaInfo = new PriceDaInfo(str4, str5, str6);
                EcUgProduct.EcUgProductPrice ecUgProductPrice2 = ecUgProduct.price;
                if (ecUgProductPrice2 != null) {
                    str7 = ecUgProductPrice2.minOriginalPrice;
                    str8 = ecUgProductPrice2.minSalesPrice;
                    str9 = ecUgProductPrice2.currency;
                } else {
                    str7 = null;
                    str8 = null;
                    str9 = null;
                }
                String str13 = null;
                ProductBase productBase = new ProductBase(new ProductPrice(str7, str8, str9, null, priceDaInfo.toString()), null, null, null);
                Long lValueOf = Long.valueOf(jLongValue);
                String strLIZIZ = C123500dV.LIZIZ(ecUgProduct.title);
                Image image = ecUgProduct.firstImage;
                if (image != null && (urls2 = image.getUrls()) != null) {
                    str13 = (String) C13LP.LJJJLL(urls2);
                }
                Image image2 = ecUgProduct.firstImage;
                if (image2 != null && (urls = image2.getUrls()) != null) {
                    str10 = (String) C13LP.LJJJLL(urls);
                } else {
                    str10 = null;
                }
                AnchorProductInfo anchorProductInfo = new AnchorProductInfo(null, lValueOf, strLIZIZ, null, 0, null, str13, str10, 5, strLJJIFFI, null, null, null, Boolean.FALSE, null, productBase, ecUgProduct.status, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, num, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
                return new AnchorProductInfoModel(C1741890vQh.LJIIIIZZ(anchorProductInfo), anchorProductInfo, "", str11, Integer.valueOf(EnumC1430380nKG.ANCHOR_SHOP_WINDOW.getTYPE()), null, "", "");
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        return null;
    }

    public static String LJIILIIL(Aweme aweme, C21279318Pf c21279318Pf, String str, String str2, String str3, Uri uri) {
        ArrayList arrayList;
        boolean z;
        List<EcUgProduct> list;
        if (c21279318Pf == null) {
            return "";
        }
        try {
            String strLJ = AnonymousClass0185.LJ(uri, "previous_page");
            String strLJ2 = LJ(aweme, strLJ, str3);
            VSACardsResponse.VSACardData vSACardData = c21279318Pf.LJFF;
            if (vSACardData != null && (list = vSACardData.productList) != null) {
                ArrayList arrayList2 = new ArrayList();
                for (EcUgProduct ecUgProduct : list) {
                    LIZ.getClass();
                    AnchorProductInfoModel anchorProductInfoModelLIZ = LIZ(aweme, ecUgProduct, strLJ2, strLJ, str3);
                    if (anchorProductInfoModelLIZ != null) {
                        arrayList2.add(anchorProductInfoModelLIZ);
                    }
                }
                arrayList = new ArrayList(arrayList2);
            } else {
                arrayList = null;
            }
            if (arrayList == null || arrayList.isEmpty()) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return "";
            }
            LJIIJJI(str2, arrayList);
            ProductListModel productListModelLIZIZ = LIZIZ(str, aweme, arrayList, str3, C123500dV.LIZIZ(((LinkedHashMap) c21279318Pf.LJI).get("log_id")), AnonymousClass0185.LJ(uri, "need_overlay"), AnonymousClass0185.LJ(uri, "after_landing_draw"), strLJ);
            if (productListModelLIZIZ == null) {
                return "";
            }
            ((IECommerceAnchorService) ServiceManager.get().getService(IECommerceAnchorService.class)).LJJI(productListModelLIZIZ, "ec_ug_vsa_plp_cache");
            return UriProtector.parse(str).buildUpon().appendQueryParameter("plp_cache_key", "ec_ug_vsa_plp_cache").build().toString();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return "";
        }
    }

    public static ProductListModel LIZIZ(String str, Aweme aweme, List list, String str2, String str3, String str4, String str5, String str6) {
        LinkedHashMap linkedHashMap;
        AnchorPanelConfig anchorPanelConfig;
        String strLIZIZ;
        String value;
        String aid;
        String groupId;
        List<AnchorCommonStruct> anchors;
        String authorUid;
        User author;
        String awemeRawAdIdStr;
        AnchorCustomData anchorCustomData;
        Map<String, String> mapLIZIZ;
        EcUgVSAData ecUgVSAData;
        try {
            HashMap<String, Object> mapLIZJ = C1741890vQh.LIZJ(UriProtector.parse(str), "trackParams");
            if (mapLIZJ != null) {
                linkedHashMap = new LinkedHashMap(mapLIZJ);
            } else {
                linkedHashMap = new LinkedHashMap();
            }
            if (!a0.LJJJIL(str4)) {
                linkedHashMap.put("need_overlay", str4);
            }
            if (!a0.LJJJIL(str5)) {
                linkedHashMap.put("after_landing_draw", str5);
            }
            if (!a0.LJJJIL(str6)) {
                linkedHashMap.put("previous_page", str6);
            }
            if (!a0.LJJJIL(str2)) {
                linkedHashMap.put("enter_click_area", str2);
            }
            String strLIZIZ2 = C123500dV.LIZIZ(linkedHashMap.get("traffic_source_list"));
            if (!a0.LJJJIL(strLIZIZ2)) {
                AwemeExtKt.appendMobParam(aweme, "traffic_source_list", strLIZIZ2);
            }
            C21269318Lj c21269318Lj = new C21269318Lj();
            c21269318Lj.LIZ.setPanelOpenWay(1);
            c21269318Lj.LIZ.setPanelOpenSource("ug_mall");
            c21269318Lj.LIZ.setPanelStyle(0);
            c21269318Lj.LIZ.setEnableMaybeYouLike(false);
            c21269318Lj.LIZ.setEnableSearchEntrance(true);
            c21269318Lj.LIZ.setPanelClickMethod(4);
            c21269318Lj.LIZ.setEnablePromotionBanner(true);
            c21269318Lj.LIZ.setEnableClaimVoucher(true);
            anchorPanelConfig = c21269318Lj.LIZ;
            strLIZIZ = C123500dV.LIZIZ(linkedHashMap.get("enter_from"));
            if (a0.LJJJIL(strLIZIZ)) {
                strLIZIZ = "fyp_vsa_shoptab";
            }
            value = EnumC1780190wQT.AD_MULTI_BUBBLE.getValue();
            AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
            if (awemeRawAd != null && (ecUgVSAData = awemeRawAd.getEcUgVSAData()) != null) {
                Integer num = ecUgVSAData.adType;
                int value2 = EnumC587500N2m.COMMERCIALIZE_PRODUCT_CARD.getValue();
                if (num != null && num.intValue() == value2) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(value);
                    sbLIZ.append("_old");
                    value = C2188811AlT.LIZIZ(sbLIZ);
                }
            }
            aid = aweme.getAid();
            groupId = aweme.getGroupId();
            anchors = aweme.getAnchors();
            authorUid = AwemeExtKt.getAuthorUid(aweme);
            author = aweme.getAuthor();
            awemeRawAdIdStr = AwemeExtKt.getAwemeRawAdIdStr(aweme);
            anchorCustomData = AwemeBizExtKt.getAnchorCustomData(aweme);
            mapLIZIZ = C666580QCq.LIZIZ(aweme, "tiktokec_enter_product_detail", strLIZIZ, null);
            if (!(true ^ ((HashMap) mapLIZIZ).isEmpty())) {
                mapLIZIZ = null;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            return new ProductListModel(aid, groupId, str3, anchors, list, authorUid, author, awemeRawAdIdStr, anchorCustomData, mapLIZIZ, aweme.getMobParams(), Boolean.valueOf(aweme.isAd()), aweme.getAwemeRawAd(), strLIZIZ, Long.valueOf(System.currentTimeMillis()), AwemeBizExtKt.getShopAdStruct(aweme), aweme, Boolean.valueOf(AwemeExtKt.isPhotoMode(aweme)), Boolean.FALSE, anchorPanelConfig, value, "mask_mall", str2, linkedHashMap);
        } catch (Throwable th2) {
            th = th2;
            TryCatchGuardChecker.doCheck(th);
            return null;
        }
    }

    public static String LJIILJJIL(String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z) {
        JSONObject jSONObject;
        boolean z2;
        boolean z3;
        boolean z4;
        if (a0.LJJJIL(str)) {
            return str;
        }
        try {
            Uri uri = UriProtector.parse(str);
            String strLJ = AnonymousClass0185.LJ(uri, "trackParams");
            if (a0.LJJJIL(strLJ)) {
                jSONObject = new JSONObject();
            } else {
                jSONObject = new JSONObject(strLJ);
            }
            boolean z5 = false;
            if (!a0.LJJJIL(str2)) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (!z2) {
                jSONObject.put("need_overlay", str2);
            }
            if (!a0.LJJJIL(str3)) {
                z3 = false;
            } else {
                z3 = true;
            }
            if (!z3) {
                jSONObject.put("after_landing_draw", str3);
            }
            if (!a0.LJJJIL(str4)) {
                z4 = false;
            } else {
                z4 = true;
            }
            if (!z4) {
                jSONObject.put("previous_page", str4);
            }
            if (!a0.LJJJIL(str5)) {
                jSONObject.put("enter_click_area", str5);
            }
            if (!a0.LJJJIL(str6)) {
                jSONObject.put("source_content_id", str6);
            }
            if (!a0.LJJJIL(str7)) {
                jSONObject.put("track_id", str7);
            }
            String strOptString = jSONObject.optString("entrance_form");
            if (strOptString == null || a0.LJJJIL(strOptString)) {
                z5 = true;
            }
            if (z5) {
                strOptString = EnumC1780190wQT.AD_SINGLE_BUBBLE.getValue();
            }
            if (z) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(strOptString);
                sbLIZ.append("_old");
                strOptString = C2188811AlT.LIZIZ(sbLIZ);
            }
            jSONObject.put("entrance_form", strOptString);
            Uri uriLIZIZ = AnonymousClass0185.LIZIZ(uri, "trackParams", C786410Ut5.J3(jSONObject));
            if (uriLIZIZ != null) {
                String string = uriLIZIZ.toString();
                if (string != null) {
                    return string;
                }
            }
            return str;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return str;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:138:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01ff A[Catch: all -> 0x047e, TryCatch #14 {all -> 0x047e, blocks: (B:127:0x018d, B:129:0x019b, B:131:0x01bf, B:133:0x01c5, B:135:0x01cf, B:139:0x01da, B:141:0x01ff), top: B:335:0x018d }] */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x035e  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0417  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x0482  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x04c3 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:285:0x04d2  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x04db  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x0524  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x052f  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x057e  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x048e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:331:0x0251 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00e7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String LJII(X.C21278418Ow r26, android.content.Context r27, java.lang.String r28, com.ss.android.ugc.aweme.feed.model.Aweme r29, com.ss.android.ugc.aweme.feed.model.Aweme r30, java.lang.String r31, X.EnumC21279418Pg r32, boolean r33, X.C1740600vOc r34, int r35) {
        /*
            Method dump skipped, instruction units count: 1434
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21278418Ow.LJII(X.18Ow, android.content.Context, java.lang.String, com.ss.android.ugc.aweme.feed.model.Aweme, com.ss.android.ugc.aweme.feed.model.Aweme, java.lang.String, X.18Pg, boolean, X.0vOc, int):java.lang.String");
    }
}
