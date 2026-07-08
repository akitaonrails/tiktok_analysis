package X;

import Y.ARunnableS7S0301000_10;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.android.btm.api.BtmSDK;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.commerce.AwemeCommerceStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.search.GeccContentSellingPoint;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.search.ecom.data.Product;
import com.ss.android.ugc.aweme.search.ecommerce.live.ITopLiveProductViewProvider;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0PmM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C654840PmM {
    public static String LIZ(ITopLiveProductViewProvider iTopLiveProductViewProvider) {
        String anchorInfo;
        if (iTopLiveProductViewProvider == null || (anchorInfo = iTopLiveProductViewProvider.getAnchorInfo()) == null) {
            return "";
        }
        return anchorInfo;
    }

    public static String LIZIZ(View view) {
        C664030Q2v c664030Q2v;
        C650950Pg5.Companion.getClass();
        C650960Pg6 c650960Pg6LJI = C646000PVm.LJI(view);
        if (c650960Pg6LJI != null && (c664030Q2v = c650960Pg6LJI.searchVideoModel) != null) {
            return c664030Q2v.groupId;
        }
        return null;
    }

    public static void LIZJ(String str, final Aweme aweme, final C653660PkS c653660PkS, int i, final View view, final int i2, final String str2, final int i3, final String str3, String str4, Map map, Map map2, int i4) {
        String roomTitle;
        String ecSearchBoBcLabelText;
        String str5;
        Map<String, String> map3;
        ITopLiveProductViewProvider iTopLiveProductViewProviderLJJI;
        String couponType;
        String string;
        String str6;
        final Map map4 = map2;
        Map map5 = map;
        final String str7 = str4;
        int i5 = ViewOnAttachStateChangeListenerC655110Pmn.LLLLII;
        Long lValueOf = null;
        if ((i4 & 1024) != 0) {
            str7 = null;
        }
        if ((i4 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            map5 = null;
        }
        if ((i4 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            map4 = null;
        }
        if (c653660PkS != null && !c653660PkS.LIZIZ) {
            final User author = aweme.getAuthor();
            BtmSDK btmSDK = BtmSDK.INSTANCE;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("a2270.b6880.c8929.d2722_i");
            sbLIZ.append(i);
            final Map mapCreateReportParams$default = BtmSDK.createReportParams$default(btmSDK, C2188811AlT.LIZIZ(sbLIZ), PageFinder.via(view), null, 4, null);
            String str8 = "";
            if (TextUtils.equals(str, "search_result_show")) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("search_result_show build, aid=");
                sbLIZ2.append(aweme.getAid());
                sbLIZ2.append(", cardLogParams=");
                sbLIZ2.append(map4);
                sbLIZ2.append(", lastFromGroupId=");
                if (str3 != null) {
                    str8 = str3;
                }
                sbLIZ2.append(str8);
                sbLIZ2.append(", tokenType=");
                if (str7 == null) {
                    str6 = c653660PkS.LJJII;
                } else {
                    str6 = str7;
                }
                sbLIZ2.append(str6);
                C2188811AlT.LIZIZ(sbLIZ2);
                C0PPS.LIZ(view, new Runnable() { // from class: X.0PmL
                    public final void LIZ() {
                        String str9;
                        Map<String, String> map6;
                        String str10;
                        Product product;
                        String str11;
                        Product product2;
                        List<Product.PromotionLabel> list;
                        Product product3;
                        String couponType2;
                        String string2;
                        C654760PmE c654760PmELIZIZ = C645940PVg.LIZIZ(c653660PkS);
                        c654760PmELIZIZ.LJIJI("search_result_id", c653660PkS.LJIJI);
                        String str12 = str7;
                        if (str12 == null) {
                            str12 = c653660PkS.LJJII;
                        }
                        c654760PmELIZIZ.LJIIZILJ("token_type", str12);
                        User user = author;
                        String strLJJLIIIJ = null;
                        c654760PmELIZIZ.LJ("aladdin_words", user != null ? user.getRoomTitle() : null);
                        c654760PmELIZIZ.LJJIJL(Integer.valueOf(i2));
                        c654760PmELIZIZ.LJIIZILJ("list_result_type", "live");
                        AwemeCommerceStruct commerceVideoAuthInfo = aweme.getCommerceVideoAuthInfo();
                        c654760PmELIZIZ.LJIIZILJ("compliance_certification", C294600Bgg.LIZ(commerceVideoAuthInfo != null ? commerceVideoAuthInfo.getEcSearchBoBcLabelText() : null) ? "1" : CardStruct.IStatusCode.DEFAULT);
                        User user2 = author;
                        c654760PmELIZIZ.LJIIZILJ("list_item_id", String.valueOf(user2 != null ? Long.valueOf(C486180J4u.LIZ(user2)) : null));
                        View view2 = view;
                        C653660PkS c653660PkS2 = c653660PkS;
                        User user3 = author;
                        if (C0BRN.LIZ()) {
                            C645920PVe.LIZIZ(c654760PmELIZIZ, view2, c653660PkS2.LJIJI, user3 != null ? Long.valueOf(C486180J4u.LIZ(user3)).toString() : null);
                        }
                        C645930PVf.LIZ(c654760PmELIZIZ);
                        Map<String, Object> map7 = mapCreateReportParams$default;
                        String str13 = str2;
                        Aweme aweme2 = aweme;
                        Iterator<Map.Entry<String, Object>> it2 = map7.entrySet().iterator();
                        while (true) {
                            str9 = "";
                            if (!it2.hasNext()) {
                                break;
                            }
                            Map.Entry<String, Object> next = it2.next();
                            String key = next.getKey();
                            Object value = next.getValue();
                            if (value != null && (string2 = value.toString()) != null) {
                                str9 = string2;
                            }
                            c654760PmELIZIZ.LJIIZILJ(key, str9);
                        }
                        if (str13 != null) {
                            ITopLiveProductViewProvider iTopLiveProductViewProviderLJJI2 = C1202104n5.LIZ().LJJI();
                            if (iTopLiveProductViewProviderLJJI2 != null && (couponType2 = iTopLiveProductViewProviderLJJI2.getCouponType(aweme2)) != null) {
                                c654760PmELIZIZ.LJIIZILJ(iTopLiveProductViewProviderLJJI2.getCouponTypeKey(), couponType2);
                            }
                            List<Product> productsInfo = aweme2.getProductsInfo();
                            if (productsInfo == null || (product3 = (Product) C13LP.LJJJLL(productsInfo)) == null || (str10 = product3.formatPriceNumber) == null) {
                                str10 = "";
                            }
                            c654760PmELIZIZ.LJIIZILJ("sales_price", str10);
                            List<Product> productsInfo2 = aweme2.getProductsInfo();
                            if (productsInfo2 != null && (product2 = (Product) C13LP.LJJJLL(productsInfo2)) != null && (list = product2.promotionLabels) != null) {
                                ArrayList arrayList = new ArrayList();
                                Iterator<Product.PromotionLabel> it3 = list.iterator();
                                while (it3.hasNext()) {
                                    String str14 = it3.next().daInfo;
                                    if (str14 != null) {
                                        arrayList.add(str14);
                                    }
                                }
                                strLJJLIIIJ = C13LP.LJJLIIIJ(arrayList, "|||", null, null, 0, null, null, 62);
                            }
                            c654760PmELIZIZ.LJIIZILJ("product_promotion_tag", strLJJLIIIJ);
                            List<Product> productsInfo3 = aweme2.getProductsInfo();
                            if (productsInfo3 != null && (product = (Product) C13LP.LJJJLL(productsInfo3)) != null && (str11 = product.formatDiscount) != null) {
                                str9 = str11;
                            }
                            c654760PmELIZIZ.LJIIZILJ("negative_discount_rate", str9);
                        }
                        GeccContentSellingPoint geccContentSellingPoint = aweme2.getGeccContentSellingPoint();
                        if (geccContentSellingPoint != null && (map6 = geccContentSellingPoint.logExtra) != null) {
                            for (Map.Entry<String, String> entry : map6.entrySet()) {
                                c654760PmELIZIZ.LJIIZILJ(entry.getKey(), entry.getValue());
                            }
                        }
                        c654760PmELIZIZ.LJIIZILJ("anchor_info", str2);
                        c654760PmELIZIZ.LJIIZILJ("realtime_watch_user", String.valueOf(i3));
                        c654760PmELIZIZ.LJIIZILJ("last_from_group_id", str3);
                        c654760PmELIZIZ.LJJJ(aweme);
                        c654760PmELIZIZ.LJJJI(aweme);
                        Map<String, Object> map8 = map4;
                        if (map8 != null) {
                            for (Map.Entry<String, Object> entry2 : map8.entrySet()) {
                                String key2 = entry2.getKey();
                                Object value2 = entry2.getValue();
                                if (value2 != null) {
                                    c654760PmELIZIZ.LJIIZILJ(key2, value2.toString());
                                }
                            }
                        }
                        c654760PmELIZIZ.LJIILJJIL();
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean zLIZ;
                        C1C7U.LIZ("SearchLiveWithVideoItemViewHolder$Companion@73f7.mobShowOrClick$1");
                        try {
                            LIZ();
                        } finally {
                            if (!zLIZ) {
                            }
                        }
                        C1C7U.LIZIZ("SearchLiveWithVideoItemViewHolder$Companion@73f7.mobShowOrClick$1");
                    }
                });
                return;
            }
            if (TextUtils.equals(str, "search_result_click")) {
                C654740PmC c654740PmCLIZ = C645940PVg.LIZ(c653660PkS);
                c654740PmCLIZ.LJIJI("search_result_id", c653660PkS.LJIJI);
                if (str7 == null) {
                    str7 = c653660PkS.LJJII;
                }
                c654740PmCLIZ.LJIIZILJ("token_type", str7);
                if (author != null) {
                    roomTitle = author.getRoomTitle();
                } else {
                    roomTitle = null;
                }
                c654740PmCLIZ.LJ("aladdin_words", roomTitle);
                c654740PmCLIZ.LJJIJL(Integer.valueOf(i2));
                c654740PmCLIZ.LJIIZILJ("list_result_type", "live");
                AwemeCommerceStruct commerceVideoAuthInfo = aweme.getCommerceVideoAuthInfo();
                if (commerceVideoAuthInfo != null) {
                    ecSearchBoBcLabelText = commerceVideoAuthInfo.getEcSearchBoBcLabelText();
                } else {
                    ecSearchBoBcLabelText = null;
                }
                if (C294600Bgg.LIZ(ecSearchBoBcLabelText)) {
                    str5 = "1";
                } else {
                    str5 = CardStruct.IStatusCode.DEFAULT;
                }
                c654740PmCLIZ.LJIIZILJ("compliance_certification", str5);
                if (author != null) {
                    lValueOf = Long.valueOf(C486180J4u.LIZ(author));
                }
                c654740PmCLIZ.LJIIZILJ("list_item_id", String.valueOf(lValueOf));
                c654740PmCLIZ.LJIIZILJ("anchor_info", str2);
                c654740PmCLIZ.LJIIZILJ("realtime_watch_user", String.valueOf(i3));
                c654740PmCLIZ.LJIIZILJ("aladdin_button_type", "click_live");
                c654740PmCLIZ.LJJJ(aweme);
                c654740PmCLIZ.LJJJI(aweme);
                for (Map.Entry entry : mapCreateReportParams$default.entrySet()) {
                    String str9 = (String) entry.getKey();
                    Object value = entry.getValue();
                    if (value == null || (string = value.toString()) == null) {
                        string = "";
                    }
                    c654740PmCLIZ.LJIIZILJ(str9, string);
                }
                if (str2.length() > 0 && str2 != null && (iTopLiveProductViewProviderLJJI = C1202104n5.LIZ().LJJI()) != null && (couponType = iTopLiveProductViewProviderLJJI.getCouponType(aweme)) != null) {
                    c654740PmCLIZ.LJIIZILJ(iTopLiveProductViewProviderLJJI.getCouponTypeKey(), couponType);
                }
                GeccContentSellingPoint geccContentSellingPoint = aweme.getGeccContentSellingPoint();
                if (geccContentSellingPoint != null && (map3 = geccContentSellingPoint.logExtra) != null) {
                    for (Map.Entry<String, String> entry2 : map3.entrySet()) {
                        c654740PmCLIZ.LJIIZILJ(entry2.getKey(), entry2.getValue());
                    }
                }
                C645930PVf.LIZ(c654740PmCLIZ);
                if (map4 != null) {
                    for (Map.Entry entry3 : map4.entrySet()) {
                        String str10 = (String) entry3.getKey();
                        Object value2 = entry3.getValue();
                        if (value2 != null) {
                            c654740PmCLIZ.LJIIZILJ(str10, value2.toString());
                        }
                    }
                }
                c654740PmCLIZ.LJIILJJIL();
                return;
            }
            if (!TextUtils.equals(str, "livesdk_live_show")) {
                return;
            }
            C0PPS.LIZ(view, new ARunnableS7S0301000_10(c653660PkS, author, i3, map5, 1));
        }
    }
}
