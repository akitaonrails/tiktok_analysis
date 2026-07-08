package X;

import android.content.Context;
import android.net.Uri;
import com.bytedance.router.SmartRouter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.ui.anchor.ICommonFeedApiService;
import com.ss.android.ugc.aweme.ecommerce.mall.service.searchentrance.ECMiddleEntranceData;
import com.ss.android.ugc.aweme.ecommerce.ug.btm.IEcUgBtmService;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.search.ecommerce.IEcomSearchService;
import java.util.Collection;
import java.util.Collections;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.text.a0;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0QaP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C672910QaP {
    public static final void LIZIZ(Context context, ECMiddleEntranceData eCMiddleEntranceData, C1740600vOc c1740600vOc) {
        String str;
        String str2;
        Number number;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        String strOptString;
        Object c098200Yq;
        String str11;
        String str12;
        Number number2;
        String str13;
        String str14;
        String str15;
        String str16;
        String str17;
        String str18;
        String str19;
        String str20;
        String strOptString2;
        Object c098200Yq2;
        if (C7879035x.LIZLLL()) {
            if (eCMiddleEntranceData != null) {
                str11 = eCMiddleEntranceData.searchWord;
                str12 = eCMiddleEntranceData.searchWordId;
                number2 = eCMiddleEntranceData.searchWordPosition;
                str13 = eCMiddleEntranceData.searchLogId;
                str14 = eCMiddleEntranceData.ecHintVoucherInfo;
                str15 = eCMiddleEntranceData.promotionInfo;
                str16 = eCMiddleEntranceData.attachProducts;
                str17 = eCMiddleEntranceData.ecomSearchExtraInfo;
                str18 = eCMiddleEntranceData.refreshTime;
                str19 = eCMiddleEntranceData.ecomSearchWordExtraInfo;
                str20 = eCMiddleEntranceData.extraBusinessParams;
            } else {
                str11 = null;
                str12 = null;
                number2 = null;
                str13 = null;
                str14 = null;
                str15 = null;
                str16 = null;
                str17 = null;
                str18 = null;
                str19 = null;
                str20 = null;
            }
            SmartRouter.buildRoute(context, LIZ(str11, str12, number2, str13, str14, str15, str16, str17, str18, str19, c1740600vOc, str20).toString()).open();
            int[] iArr = C0QYF.LIZ;
            if (!C0QYF.LIZ(C0QXR.MALL.getValue())) {
                C2344009Gk c2344009Gk = new C2344009Gk();
                c2344009Gk.LJIIIIZZ("enter_method", "enter");
                C1767950w6j.LIZ.getClass();
                c2344009Gk.LJIIIIZZ("enter_from", C1767950w6j.LJFF());
                c2344009Gk.LJIIIIZZ("search_entrance", C1767950w6j.LJFF());
                c2344009Gk.LJIIIIZZ("enter_action", "enter");
                if (str20 != null) {
                    try {
                        strOptString2 = new JSONObject(str20).optString("mall_extra_info");
                        try {
                            c098200Yq2 = Unit.LIZ;
                            C189200o6.m2constructorimpl(c098200Yq2);
                        } catch (Throwable th) {
                            th = th;
                            TryCatchGuardChecker.doCheck(th);
                            c098200Yq2 = new C098200Yq(th);
                            C189200o6.m2constructorimpl(c098200Yq2);
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        strOptString2 = null;
                    }
                    Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq2);
                    if (thM5exceptionOrNullimpl != null) {
                        C1AF0.LJ(thM5exceptionOrNullimpl);
                    }
                    C189200o6.m1boximpl(c098200Yq2);
                } else {
                    strOptString2 = null;
                }
                IEcomSearchService iEcomSearchService = (IEcomSearchService) ServiceManager.get().getService(IEcomSearchService.class);
                C1767950w6j.LIZ.getClass();
                String strLJJJJJ = iEcomSearchService.LJJJJJ(C1767950w6j.LJFF(), strOptString2);
                if (strLJJJJJ != null) {
                    c2344009Gk.LJFF("traffic_diversion_info", strLJJJJJ);
                }
                C1018703yb.LIZIZ("enter_search_blankpage", c2344009Gk.LIZ);
            }
            C2341109Fh c2341109Fh = C2341109Fh.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("ShopTabV3 setSearchData searchWord ");
            sbLIZ.append(str11);
            sbLIZ.append(" searchWordId ");
            sbLIZ.append(str12);
            sbLIZ.append(" searchWordPosition ");
            sbLIZ.append(number2);
            sbLIZ.append(" searchLogId ");
            sbLIZ.append(str13);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            c2341109Fh.getClass();
            C2341109Fh.LIZ(strLIZIZ);
            C189200o6.m2constructorimpl(Unit.LIZ);
            return;
        }
        if (eCMiddleEntranceData == null) {
            str = null;
            str2 = null;
            number = null;
            str3 = null;
            str4 = null;
            str5 = null;
            str6 = null;
            str7 = null;
            str8 = null;
            str9 = null;
            str10 = null;
        } else {
            try {
                str = eCMiddleEntranceData.searchWord;
                str2 = eCMiddleEntranceData.searchWordId;
                number = eCMiddleEntranceData.searchWordPosition;
                str3 = eCMiddleEntranceData.searchLogId;
                str4 = eCMiddleEntranceData.ecHintVoucherInfo;
                str5 = eCMiddleEntranceData.promotionInfo;
                str6 = eCMiddleEntranceData.attachProducts;
                str7 = eCMiddleEntranceData.ecomSearchExtraInfo;
                str8 = eCMiddleEntranceData.refreshTime;
                str9 = eCMiddleEntranceData.ecomSearchWordExtraInfo;
                str10 = eCMiddleEntranceData.extraBusinessParams;
            } catch (CancellationException e) {
                TryCatchGuardChecker.doCheck(e);
                throw e;
            } catch (Throwable th3) {
                TryCatchGuardChecker.doCheck(th3);
                C1AF0.LJ(th3);
                C189200o6.m2constructorimpl(new C098200Yq(th3));
                return;
            }
        }
        SmartRouter.buildRoute(context, LIZ(str, str2, number, str3, str4, str5, str6, str7, str8, str9, c1740600vOc, str10).toString()).open();
        int[] iArr2 = C0QYF.LIZ;
        if (!C0QYF.LIZ(C0QXR.MALL.getValue())) {
            C2344009Gk c2344009Gk2 = new C2344009Gk();
            c2344009Gk2.LJIIIIZZ("enter_method", "enter");
            C1767950w6j.LIZ.getClass();
            c2344009Gk2.LJIIIIZZ("enter_from", C1767950w6j.LJFF());
            c2344009Gk2.LJIIIIZZ("search_entrance", C1767950w6j.LJFF());
            c2344009Gk2.LJIIIIZZ("enter_action", "enter");
            if (str10 != null) {
                try {
                    strOptString = new JSONObject(str10).optString("mall_extra_info");
                    try {
                        c098200Yq = Unit.LIZ;
                        C189200o6.m2constructorimpl(c098200Yq);
                    } catch (Throwable th4) {
                        th = th4;
                        TryCatchGuardChecker.doCheck(th);
                        c098200Yq = new C098200Yq(th);
                        C189200o6.m2constructorimpl(c098200Yq);
                    }
                } catch (Throwable th5) {
                    th = th5;
                    strOptString = null;
                }
                Throwable thM5exceptionOrNullimpl2 = C189200o6.m5exceptionOrNullimpl(c098200Yq);
                if (thM5exceptionOrNullimpl2 != null) {
                    C1AF0.LJ(thM5exceptionOrNullimpl2);
                }
                C189200o6.m1boximpl(c098200Yq);
            } else {
                strOptString = null;
            }
            IEcomSearchService iEcomSearchService2 = (IEcomSearchService) ServiceManager.get().getService(IEcomSearchService.class);
            C1767950w6j.LIZ.getClass();
            String strLJJJJJ2 = iEcomSearchService2.LJJJJJ(C1767950w6j.LJFF(), strOptString);
            if (strLJJJJJ2 != null) {
                c2344009Gk2.LJFF("traffic_diversion_info", strLJJJJJ2);
            }
            C1018703yb.LIZIZ("enter_search_blankpage", c2344009Gk2.LIZ);
        }
        C2341109Fh c2341109Fh2 = C2341109Fh.LIZ;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("ShopTabV3 setSearchData searchWord ");
        sbLIZ2.append(str);
        sbLIZ2.append(" searchWordId ");
        sbLIZ2.append(str2);
        sbLIZ2.append(" searchWordPosition ");
        sbLIZ2.append(number);
        sbLIZ2.append(" searchLogId ");
        sbLIZ2.append(str3);
        String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
        c2341109Fh2.getClass();
        C2341109Fh.LIZ(strLIZIZ2);
        C189200o6.m2constructorimpl(Unit.LIZ);
    }

    public static final Uri LIZ(String str, String str2, Number number, String str3, String str4, String str5, String str6, String str7, String str8, String str9, C1740600vOc c1740600vOc, String str10) {
        String strLJIJ;
        String str11;
        EnumC669620QOi enumC669620QOi;
        String string;
        IEcUgBtmService iEcUgBtmService;
        ICommonFeedApiService iCommonFeedApiService = (ICommonFeedApiService) ServiceManager.get().getService(ICommonFeedApiService.class);
        String str12 = "";
        if (iCommonFeedApiService == null || (strLJIJ = iCommonFeedApiService.LJIJ()) == null) {
            strLJIJ = "";
        }
        if (str == null) {
            str = "";
        }
        Uri.Builder builder = new Uri.Builder();
        if (C293700BfE.LIZ() != 0) {
            str11 = "//ec/search";
        } else {
            str11 = "//search";
        }
        Uri.Builder builderPath = builder.path(str11);
        C1767950w6j.LIZ.getClass();
        Uri.Builder builderAppendQueryParameter = builderPath.appendQueryParameter("enter_from", C1767950w6j.LJFF()).appendQueryParameter("group_id", strLJIJ).appendQueryParameter("in_single_stack", "true").appendQueryParameter("set_hint_by_sug_word", "false");
        if (C0C59.LJ().LJI("TTK_mall_search_land_in_shop_tab", 1, true) == 0) {
            enumC669620QOi = EnumC669620QOi.TOP;
        } else {
            enumC669620QOi = EnumC669620QOi.SHOP;
        }
        Uri.Builder builderAppendQueryParameter2 = builderAppendQueryParameter.appendQueryParameter("target_tab", enumC669620QOi.getTabName()).appendQueryParameter("keep_tab_position", "true");
        if (str2 == null) {
            str2 = "";
        }
        Uri.Builder builderAppendQueryParameter3 = builderAppendQueryParameter2.appendQueryParameter("hint_group_id", str2);
        if (str3 == null) {
            str3 = "";
        }
        Uri.Builder builderAppendQueryParameter4 = builderAppendQueryParameter3.appendQueryParameter("hint_imp_id", str3);
        if (number == null || (string = number.toString()) == null) {
            string = CardStruct.IStatusCode.DEFAULT;
        }
        Uri.Builder builderAppendQueryParameter5 = builderAppendQueryParameter4.appendQueryParameter("hint_position", string);
        String string2 = new JSONArray((Collection) Collections.singletonList(6)).toString();
        if (string2 == null) {
            string2 = "[]";
        }
        Uri.Builder builderAppendQueryParameter6 = builderAppendQueryParameter5.appendQueryParameter("traffic_source_list", string2).appendQueryParameter("blankpage_enter_from", C1767950w6j.LJFF()).appendQueryParameter("blankpage_enter_method", "enter").appendQueryParameter("search_from", C1767950w6j.LJFF());
        if (str4 == null) {
            str4 = "";
        }
        Uri.Builder builderAppendQueryParameter7 = builderAppendQueryParameter6.appendQueryParameter("ec_hint_coupon_info", str4);
        if (str5 == null) {
            str5 = "";
        }
        Uri.Builder builderAppendQueryParameter8 = builderAppendQueryParameter7.appendQueryParameter("promotion_info", str5);
        if (str6 != null) {
            str12 = str6;
        }
        Uri.Builder builderAppendQueryParameter9 = builderAppendQueryParameter8.appendQueryParameter("attach_products", str12).appendQueryParameter("ec_search_extra_info_from_mall", str7).appendQueryParameter("refresh_time", str8);
        if (!a0.LJJJIL(str)) {
            builderAppendQueryParameter9.appendQueryParameter("search_hint_word", str);
        }
        if (C123100dR.LIZ(str9) && str9 != null) {
            builderAppendQueryParameter9.appendQueryParameter("ec_search_word_extra_info", str9);
        }
        if (c1740600vOc != null && (iEcUgBtmService = (IEcUgBtmService) PluggableExtentionKt.pluggableSpi$default(IEcUgBtmService.class, false, false, false, 14, null)) != null) {
            iEcUgBtmService.LIZ(c1740600vOc, builderAppendQueryParameter9);
        }
        if (C123100dR.LIZ(str10) && str10 != null) {
            builderAppendQueryParameter9.appendQueryParameter("extra_business_params", str10);
        }
        return builderAppendQueryParameter9.build();
    }
}
