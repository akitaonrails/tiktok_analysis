package X;

import android.net.Uri;
import android.os.SystemClock;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.commerce.service.ICommerceService;
import com.ss.android.ugc.aweme.ecommerce.anchor.utils.AnchorBizUtils;
import com.ss.android.ugc.aweme.ecommerce.config.AnchorPanelConfig;
import com.ss.android.ugc.aweme.ecommerce.dependency.account.AccountDependencyService;
import com.ss.android.ugc.aweme.ecommerce.dependency.anchor.AnchorDependencyService;
import com.ss.android.ugc.aweme.ecommerce.dependency.commonfeed.CommonFeedDependService;
import com.ss.android.ugc.aweme.ecommerce.model.AnchorProductInfo;
import com.ss.android.ugc.aweme.ecommerce.model.AnchorProductInfoModel;
import com.ss.android.ugc.aweme.ecommerce.model.AwemePruningModel;
import com.ss.android.ugc.aweme.ecommerce.model.PanelVoucherInfo;
import com.ss.android.ugc.aweme.ecommerce.model.ProductListModel;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.account.IAccountDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.anchor.IAnchorDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.commonfeed.ICommonFeedDependService;
import com.ss.android.ugc.aweme.ecommerce.service.cartservice.cartbenefit.model.CartBenefitInfo;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.ComponentPreloadConfig;
import com.ss.android.ugc.aweme.feed.model.RealtimeComponentConfig;
import com.ss.android.ugc.aweme.feed.model.RealtimeFcpConfig;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS278S0000000_32;
import kotlin.jvm.internal.AwS25S2000000_32;
import kotlin.jvm.internal.AwS611S0100000_32;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.18Mj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21271918Mj implements InterfaceC1350220lEy {
    public static final C21271918Mj LIZ = new C21271918Mj();

    public static void LJJIJIIJI(Map map) {
        C1018703yb.LIZLLL("tiktokec_extra_info_show", new AwS611S0100000_32(map, (Map<String, ? extends Object>) 312));
    }

    public static void LJIJJ(String str, String str2) throws JSONException {
        C1421105hJ.LIZLLL("tiktokec_bubble_show", new Pair("EVENT_ORIGIN_FEATURE", "TEMAI"), new Pair("entrance_form", str), new Pair("source_page_type", "video"), new Pair("page_name", str2), new Pair("page_show_type", "half_screen"), new Pair("bubble_position", "cart_entrance_label"), new Pair("bubble_type", "benefit"), new Pair("bubble_type_info", "free_shipping"), new Pair("bubble_text_type", "cart"), new Pair("is_bubble_text_show", "1"), new Pair("is_bubble_clickable", CardStruct.IStatusCode.DEFAULT));
    }

    public static void LJIL(AnchorProductInfoModel anchorProductInfoModel, ProductListModel productListModel) throws JSONException {
        Integer num;
        AnchorProductInfo anchorProductInfo;
        AnchorProductInfo anchorProductInfo2;
        Pair[] pairArr = new Pair[12];
        String str = productListModel.eventType;
        if (str == null) {
            str = "";
        }
        pairArr[0] = new Pair("enter_from", str);
        pairArr[1] = new Pair("author_id", productListModel.authorUid);
        pairArr[2] = new Pair("group_id", productListModel.aid);
        pairArr[3] = new Pair("request_id", productListModel.requestId);
        pairArr[4] = new Pair("product_id", "product");
        pairArr[5] = new Pair("page_type", "video");
        pairArr[6] = new Pair("anchor_show_type", "video_cart_tag");
        AnchorBizUtils.LIZ.getClass();
        pairArr[7] = new Pair("follow_status", AnchorBizUtils.LJJIJIIJI(productListModel));
        pairArr[8] = new Pair("entrance_form", "video_single_anchor");
        pairArr[9] = new Pair("page_name", "video");
        String str2 = null;
        if (anchorProductInfoModel != null && (anchorProductInfo2 = anchorProductInfoModel.extraData) != null) {
            num = anchorProductInfo2.platform;
        } else {
            num = null;
        }
        pairArr[10] = new Pair("product_source", String.valueOf(num));
        if (anchorProductInfoModel != null && (anchorProductInfo = anchorProductInfoModel.extraData) != null) {
            str2 = anchorProductInfo.source;
        }
        pairArr[11] = new Pair("source", str2);
        C1421105hJ.LIZLLL("enter_product_detail", pairArr);
    }

    public static void LJJIII(String str, Exception exc) throws JSONException {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("anchor.extra : ");
        sbLIZ.append(str);
        C1421105hJ.LIZLLL("rd_tiktokec_shop_anchor_exception", new Pair("e_stack_trace", C08KI.LIZ(exc)), new Pair("extra_data", C2188811AlT.LIZIZ(sbLIZ)), new Pair("where", "ShopWindowView"));
    }

    public static void LJJIJ(String str, String str2) {
        C1018703yb.LIZLLL("tiktokec_popup_click", new AwS25S2000000_32(str, str2, 1));
    }

    @Override // X.InterfaceC1350220lEy
    public final void LIZ(Aweme aweme, String str) {
        Integer num;
        AnchorBizUtils.LIZ.getClass();
        int iIntValue = 0;
        AnchorProductInfo anchorProductInfo = (AnchorProductInfo) C13LP.LJJJLZIJ(0, AnchorBizUtils.LJJZZI(aweme));
        if (anchorProductInfo != null && (num = anchorProductInfo.reviewNum) != null) {
            iIntValue = num.intValue();
        }
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("EVENT_ORIGIN_FEATURE", "TEMAI");
        c2344009Gk.LJIIIIZZ("page_name", "comments_panel");
        c2344009Gk.LJIIIIZZ("module_name", "review_tab");
        c2344009Gk.LJIIIIZZ("previous_page", str);
        c2344009Gk.LIZJ(iIntValue, "review_count");
        C1507790pL7 c1507790pL7 = C1507790pL7.LIZ;
        LinkedHashMap linkedHashMap = new LinkedHashMap(c2344009Gk.LIZ);
        c1507790pL7.getClass();
        C1507790pL7.LJFF("tiktokec_module_show", linkedHashMap);
    }

    public static void LJFF(boolean z, Long l, Integer num) throws JSONException {
        C1421105hJ.LIZLLL("rd_ec_anchor_motion_info_request_result", new Pair("is_success", Boolean.valueOf(z)), new Pair("duration", l), new Pair(Scene.SCENE_SERVICE, num));
    }

    public static void LJIILIIL(String str, String str2, String str3) throws JSONException {
        C1421105hJ.LIZLLL("tiktokec_button_click", new Pair("entrance_info", str), new Pair("page_name", "video"), new Pair("button_name", str2), new Pair("previous_page", "video"), new Pair("product_id", str3));
    }

    public static void LJIILJJIL(String str, String str2, String str3) throws JSONException {
        C1421105hJ.LIZLLL("tiktokec_button_show", new Pair("entrance_info", str), new Pair("page_name", "video"), new Pair("button_name", str2), new Pair("previous_page", "video"), new Pair("product_id", str3));
    }

    public static void LJIIJJI(int i, ProductListModel productListModel, String str, Map map) {
        String str2;
        String str3;
        String str4;
        IECommerceHostService iECommerceHostService;
        Aweme aweme;
        String str5;
        IECommerceHostService iECommerceHostService2;
        String str6;
        String str7;
        String str8;
        String string;
        List<AnchorProductInfoModel> list;
        AwemeRawAd awemeRawAd;
        Long creativeId;
        String string2;
        AwemeRawAd awemeRawAd2;
        Long creativeId2;
        boolean z;
        String name;
        boolean z2;
        String name2;
        Pair[] pairArr = new Pair[17];
        pairArr[0] = new Pair("EVENT_ORIGIN_FEATURE", "TEMAI");
        String str9 = null;
        if (productListModel != null) {
            str2 = productListModel.authorUid;
        } else {
            str2 = null;
        }
        pairArr[1] = new Pair("author_id", str2);
        if (productListModel != null) {
            str3 = productListModel.aid;
        } else {
            str3 = null;
        }
        pairArr[2] = new Pair("group_id", str3);
        String str10 = "";
        if (productListModel == null || (str4 = productListModel.eventType) == null) {
            str4 = "";
        }
        pairArr[3] = new Pair("enter_from", str4);
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            IAnchorDependencyService iAnchorDependencyServiceCreateIAnchorDependencyServicebyMonsterPlugin = AnchorDependencyService.createIAnchorDependencyServicebyMonsterPlugin(false);
            if (iAnchorDependencyServiceCreateIAnchorDependencyServicebyMonsterPlugin != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            String name3 = IAnchorDependencyService.class.getName();
            if (iAnchorDependencyServiceCreateIAnchorDependencyServicebyMonsterPlugin != null) {
                name2 = iAnchorDependencyServiceCreateIAnchorDependencyServicebyMonsterPlugin.getClass().getName();
            } else {
                name2 = null;
            }
            C1AQS.LIZJ(jElapsedRealtime, 1, name3, name2, z2);
            iECommerceHostService = iAnchorDependencyServiceCreateIAnchorDependencyServicebyMonsterPlugin;
        } else {
            C1120604Zw.LIZ.LIZ();
            iECommerceHostService = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IAnchorDependencyService.class);
        }
        IAnchorDependencyService iAnchorDependencyService = (IAnchorDependencyService) iECommerceHostService;
        if (productListModel != null) {
            aweme = productListModel.aweme;
        } else {
            aweme = null;
        }
        pairArr[4] = new Pair("follow_status", iAnchorDependencyService.getFollowStatus(aweme));
        AnchorBizUtils.LIZ.getClass();
        pairArr[5] = new Pair("is_ad", Integer.valueOf(AnchorBizUtils.LJJJLIIL(productListModel) ? 1 : 0));
        if (productListModel != null) {
            str5 = productListModel.authorUid;
        } else {
            str5 = null;
        }
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime2 = SystemClock.elapsedRealtime();
            IAccountDependencyService iAccountDependencyServiceCreateIAccountDependencyServicebyMonsterPlugin = AccountDependencyService.createIAccountDependencyServicebyMonsterPlugin(false);
            if (iAccountDependencyServiceCreateIAccountDependencyServicebyMonsterPlugin != null) {
                z = true;
            } else {
                z = false;
            }
            String name4 = IAccountDependencyService.class.getName();
            if (iAccountDependencyServiceCreateIAccountDependencyServicebyMonsterPlugin != null) {
                name = iAccountDependencyServiceCreateIAccountDependencyServicebyMonsterPlugin.getClass().getName();
            } else {
                name = null;
            }
            C1AQS.LIZJ(jElapsedRealtime2, 1, name4, name, z);
            iECommerceHostService2 = iAccountDependencyServiceCreateIAccountDependencyServicebyMonsterPlugin;
        } else {
            C1120604Zw.LIZ.LIZ();
            iECommerceHostService2 = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IAccountDependencyService.class);
        }
        pairArr[6] = new Pair("is_self", Integer.valueOf(Intrinsics.LJFF(str5, ((IAccountDependencyService) iECommerceHostService2).getUserId()) ? 1 : 0));
        if (AnchorBizUtils.LJJJLIIL(productListModel)) {
            str6 = productListModel.awemeRawAdIdStr;
        } else {
            str6 = null;
        }
        pairArr[7] = new Pair("ad_id", str6);
        if (productListModel != null) {
            str9 = productListModel.requestId;
        }
        pairArr[8] = new Pair("request_id", str9);
        if (productListModel == null || (str7 = productListModel.pageName) == null) {
            str7 = "video";
        }
        pairArr[9] = new Pair("page_name", str7);
        pairArr[10] = new Pair("source_page_type", "video");
        pairArr[11] = new Pair("notice_number", Integer.valueOf(i));
        if (productListModel == null || (str8 = productListModel.enterListForm) == null) {
            str8 = "video_multi_anchor";
        }
        pairArr[12] = new Pair("enter_list_form", str8);
        pairArr[13] = new Pair("entrance_form", str);
        pairArr[14] = new Pair("list_name", "video_shopping_list");
        if (!AnchorBizUtils.LJJJLIIL(productListModel) || (awemeRawAd2 = productListModel.awemeRawAd) == null || (creativeId2 = awemeRawAd2.getCreativeId()) == null || (string = creativeId2.toString()) == null) {
            string = "";
        }
        pairArr[15] = new Pair("creative_id", string);
        if (productListModel != null && Intrinsics.LJFF(productListModel.isAd(), Boolean.TRUE) && (awemeRawAd = productListModel.awemeRawAd) != null && (creativeId = awemeRawAd.getCreativeId()) != null && (string2 = creativeId.toString()) != null) {
            str10 = string2;
        }
        pairArr[16] = new Pair("creative_id", str10);
        Map mapLJIIJ = C2097608Jq.LJIIJ(pairArr);
        if (productListModel != null && (list = productListModel.products) != null) {
            C21272018Mk.LIZ.getClass();
            mapLJIIJ.putAll(C21272018Mk.LJFF(list));
        }
        if (map != null) {
            mapLJIIJ.putAll(map);
        }
        C1421105hJ.LIZJ("tiktokec_cart_entrance_show", mapLJIIJ);
    }

    public static void LJIJJLI(int i, ProductListModel productListModel, int i2, String str) {
        boolean z;
        String str2;
        String str3;
        IECommerceHostService iECommerceHostService;
        Aweme aweme;
        String str4;
        String str5;
        Integer numValueOf;
        Aweme aweme2;
        List<AnchorProductInfoModel> list;
        AnchorPanelConfig anchorPanelConfig;
        AnchorPanelConfig anchorPanelConfig2;
        boolean z2;
        String name;
        int i3 = 1;
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        Pair[] pairArr = new Pair[12];
        pairArr[0] = new Pair("page_name", "video");
        if (z) {
            str2 = "more";
        } else {
            str2 = "less";
        }
        pairArr[1] = new Pair("glide_type", str2);
        if (productListModel != null) {
            str3 = productListModel.groupId;
        } else {
            str3 = null;
        }
        pairArr[2] = new Pair("list_source_content_id", str3);
        pairArr[3] = new Pair("list_name", "video_shopping_list");
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            IAnchorDependencyService iAnchorDependencyServiceCreateIAnchorDependencyServicebyMonsterPlugin = AnchorDependencyService.createIAnchorDependencyServicebyMonsterPlugin(false);
            if (iAnchorDependencyServiceCreateIAnchorDependencyServicebyMonsterPlugin != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            String name2 = IAnchorDependencyService.class.getName();
            if (iAnchorDependencyServiceCreateIAnchorDependencyServicebyMonsterPlugin != null) {
                name = iAnchorDependencyServiceCreateIAnchorDependencyServicebyMonsterPlugin.getClass().getName();
            } else {
                name = null;
            }
            C1AQS.LIZJ(jElapsedRealtime, 1, name2, name, z2);
            iECommerceHostService = iAnchorDependencyServiceCreateIAnchorDependencyServicebyMonsterPlugin;
        } else {
            C1120604Zw.LIZ.LIZ();
            iECommerceHostService = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IAnchorDependencyService.class);
        }
        IAnchorDependencyService iAnchorDependencyService = (IAnchorDependencyService) iECommerceHostService;
        if (productListModel != null) {
            aweme = productListModel.aweme;
        } else {
            aweme = null;
        }
        pairArr[4] = new Pair("follow_status", iAnchorDependencyService.getFollowStatus(aweme));
        if (productListModel != null) {
            str4 = productListModel.authorUid;
        } else {
            str4 = null;
        }
        pairArr[5] = new Pair("author_id", str4);
        if (productListModel == null || (str5 = productListModel.enterListForm) == null) {
            str5 = "video_multi_anchor";
        }
        pairArr[6] = new Pair("enter_list_form", str5);
        pairArr[7] = new Pair("entrance_form", str);
        AnchorBizUtils.LIZ.getClass();
        pairArr[8] = new Pair("pure_ecommerce", Integer.valueOf(AnchorBizUtils.LJJJZ(productListModel) ? 1 : 0));
        if (productListModel == null || (anchorPanelConfig2 = productListModel.panelConfig) == null || !anchorPanelConfig2.enableMaybeYouLike) {
            i3 = 0;
        }
        pairArr[9] = new Pair("is_add_maybe_you_like", Integer.valueOf(i3));
        if (productListModel != null && (anchorPanelConfig = productListModel.panelConfig) != null) {
            numValueOf = Integer.valueOf(anchorPanelConfig.panelStyle);
        } else {
            numValueOf = null;
        }
        pairArr[10] = new Pair("video_shopping_list_style", numValueOf);
        pairArr[11] = new Pair("product_source", Integer.valueOf(i2));
        Map mapLJIIJ = C2097608Jq.LJIIJ(pairArr);
        C21272018Mk c21272018Mk = C21272018Mk.LIZ;
        if (productListModel != null) {
            aweme2 = productListModel.aweme;
        } else {
            aweme2 = null;
        }
        mapLJIIJ.putAll(C21272018Mk.LJJIFFI(c21272018Mk, aweme2, null, 2));
        if (productListModel != null && (list = productListModel.products) != null) {
            mapLJIIJ.putAll(C21272018Mk.LJFF(list));
        }
        C1421105hJ.LIZJ("tiktokec_glide_page", mapLJIIJ);
    }

    public static void LJIIJ(int i, ProductListModel productListModel, CartBenefitInfo cartBenefitInfo, String str, Map map) {
        String str2;
        String str3;
        String str4;
        IECommerceHostService iECommerceHostService;
        Aweme aweme;
        String str5;
        IECommerceHostService iECommerceHostService2;
        String str6;
        String str7;
        String str8;
        List<AnchorProductInfoModel> list;
        String str9;
        HashMap<String, Object> mapLJIIJ;
        AwemeRawAd awemeRawAd;
        Long creativeId;
        String string;
        boolean z;
        String name;
        boolean z2;
        String name2;
        Pair[] pairArr = new Pair[16];
        pairArr[0] = new Pair("EVENT_ORIGIN_FEATURE", "TEMAI");
        String str10 = null;
        if (productListModel != null) {
            str2 = productListModel.authorUid;
        } else {
            str2 = null;
        }
        pairArr[1] = new Pair("author_id", str2);
        if (productListModel != null) {
            str3 = productListModel.aid;
        } else {
            str3 = null;
        }
        pairArr[2] = new Pair("group_id", str3);
        String str11 = "";
        if (productListModel == null || (str4 = productListModel.eventType) == null) {
            str4 = "";
        }
        pairArr[3] = new Pair("enter_from", str4);
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            IAnchorDependencyService iAnchorDependencyServiceCreateIAnchorDependencyServicebyMonsterPlugin = AnchorDependencyService.createIAnchorDependencyServicebyMonsterPlugin(false);
            if (iAnchorDependencyServiceCreateIAnchorDependencyServicebyMonsterPlugin != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            String name3 = IAnchorDependencyService.class.getName();
            if (iAnchorDependencyServiceCreateIAnchorDependencyServicebyMonsterPlugin != null) {
                name2 = iAnchorDependencyServiceCreateIAnchorDependencyServicebyMonsterPlugin.getClass().getName();
            } else {
                name2 = null;
            }
            C1AQS.LIZJ(jElapsedRealtime, 1, name3, name2, z2);
            iECommerceHostService = iAnchorDependencyServiceCreateIAnchorDependencyServicebyMonsterPlugin;
        } else {
            C1120604Zw.LIZ.LIZ();
            iECommerceHostService = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IAnchorDependencyService.class);
        }
        IAnchorDependencyService iAnchorDependencyService = (IAnchorDependencyService) iECommerceHostService;
        if (productListModel != null) {
            aweme = productListModel.aweme;
        } else {
            aweme = null;
        }
        pairArr[4] = new Pair("follow_status", iAnchorDependencyService.getFollowStatus(aweme));
        AnchorBizUtils.LIZ.getClass();
        pairArr[5] = new Pair("is_ad", Integer.valueOf(AnchorBizUtils.LJJJLIIL(productListModel) ? 1 : 0));
        if (productListModel != null) {
            str5 = productListModel.authorUid;
        } else {
            str5 = null;
        }
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime2 = SystemClock.elapsedRealtime();
            IAccountDependencyService iAccountDependencyServiceCreateIAccountDependencyServicebyMonsterPlugin = AccountDependencyService.createIAccountDependencyServicebyMonsterPlugin(false);
            if (iAccountDependencyServiceCreateIAccountDependencyServicebyMonsterPlugin != null) {
                z = true;
            } else {
                z = false;
            }
            String name4 = IAccountDependencyService.class.getName();
            if (iAccountDependencyServiceCreateIAccountDependencyServicebyMonsterPlugin != null) {
                name = iAccountDependencyServiceCreateIAccountDependencyServicebyMonsterPlugin.getClass().getName();
            } else {
                name = null;
            }
            C1AQS.LIZJ(jElapsedRealtime2, 1, name4, name, z);
            iECommerceHostService2 = iAccountDependencyServiceCreateIAccountDependencyServicebyMonsterPlugin;
        } else {
            C1120604Zw.LIZ.LIZ();
            iECommerceHostService2 = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IAccountDependencyService.class);
        }
        pairArr[6] = new Pair("is_self", Integer.valueOf(Intrinsics.LJFF(str5, ((IAccountDependencyService) iECommerceHostService2).getUserId()) ? 1 : 0));
        if (AnchorBizUtils.LJJJLIIL(productListModel) && productListModel != null) {
            str6 = productListModel.awemeRawAdIdStr;
        } else {
            str6 = null;
        }
        pairArr[7] = new Pair("ad_id", str6);
        if (productListModel != null) {
            str10 = productListModel.requestId;
        }
        pairArr[8] = new Pair("request_id", str10);
        if (productListModel == null || (str7 = productListModel.pageName) == null) {
            str7 = "video";
        }
        pairArr[9] = new Pair("page_name", str7);
        pairArr[10] = new Pair("source_page_type", "video");
        pairArr[11] = new Pair("notice_number", Integer.valueOf(i));
        if (productListModel == null || (str8 = productListModel.enterListForm) == null) {
            str8 = "video_multi_anchor";
        }
        pairArr[12] = new Pair("enter_list_form", str8);
        pairArr[13] = new Pair("entrance_form", str);
        pairArr[14] = new Pair("list_name", "video_shopping_list");
        if (AnchorBizUtils.LJJJLIIL(productListModel) && (awemeRawAd = productListModel.awemeRawAd) != null && (creativeId = awemeRawAd.getCreativeId()) != null && (string = creativeId.toString()) != null) {
            str11 = string;
        }
        pairArr[15] = new Pair("creative_id", str11);
        Map mapLJIIJ2 = C2097608Jq.LJIIJ(pairArr);
        if (cartBenefitInfo != null && (str9 = cartBenefitInfo.daInfo) != null && (mapLJIIJ = C1741890vQh.LJIIJ(str9)) != null) {
            mapLJIIJ2.putAll(mapLJIIJ);
        }
        if (productListModel != null && (list = productListModel.products) != null) {
            C21272018Mk.LIZ.getClass();
            mapLJIIJ2.putAll(C21272018Mk.LJFF(list));
        }
        if (map != null) {
            mapLJIIJ2.putAll(map);
        }
        C1421105hJ.LIZJ("tiktokec_cart_entrance_click", mapLJIIJ2);
    }

    public static void LJIJ(String str, PanelVoucherInfo panelVoucherInfo, String str2, String str3, Map map) {
        String str4;
        if (panelVoucherInfo != null) {
            str4 = panelVoucherInfo.daInfo;
        } else {
            str4 = null;
        }
        HashMap<String, Object> mapLJIIJ = C1741890vQh.LJIIJ(str4);
        C1739800vNK.LIZ.getClass();
        C1018703yb.LIZLLL(str, new C18LS(str2, str3, C1739800vNK.LIZ(panelVoucherInfo), panelVoucherInfo, mapLJIIJ, map));
    }

    public static void LJJ(String str, ProductListModel productListModel, Long l, String str2, AnchorProductInfoModel anchorProductInfoModel) throws JSONException {
        Integer num;
        String str3;
        AnonymousClass0317 anonymousClass0317CreateIAnchorDependencyServicebyMonsterPlugin;
        boolean z;
        AnchorProductInfo anchorProductInfo;
        AnchorProductInfo anchorProductInfo2;
        Pair[] pairArr = new Pair[12];
        if (str == null) {
            str = "";
        }
        pairArr[0] = new Pair("enter_from", str);
        pairArr[1] = new Pair("author_id", productListModel.authorUid);
        pairArr[2] = new Pair("group_id", productListModel.aid);
        pairArr[3] = new Pair("product_type", str2);
        pairArr[4] = new Pair("duration", String.valueOf(l));
        String name = null;
        if (anchorProductInfoModel != null && (anchorProductInfo2 = anchorProductInfoModel.extraData) != null) {
            num = anchorProductInfo2.platform;
        } else {
            num = null;
        }
        pairArr[5] = new Pair("product_source", String.valueOf(num));
        if (anchorProductInfoModel != null && (anchorProductInfo = anchorProductInfoModel.extraData) != null) {
            str3 = anchorProductInfo.source;
        } else {
            str3 = null;
        }
        pairArr[6] = new Pair("source", str3);
        pairArr[7] = new Pair("page_type", "video");
        pairArr[8] = new Pair("anchor_show_type", "video_cart_tag");
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            anonymousClass0317CreateIAnchorDependencyServicebyMonsterPlugin = AnchorDependencyService.createIAnchorDependencyServicebyMonsterPlugin(false);
            if (anonymousClass0317CreateIAnchorDependencyServicebyMonsterPlugin != null) {
                z = true;
            } else {
                z = false;
            }
            String name2 = IAnchorDependencyService.class.getName();
            if (anonymousClass0317CreateIAnchorDependencyServicebyMonsterPlugin != null) {
                name = anonymousClass0317CreateIAnchorDependencyServicebyMonsterPlugin.getClass().getName();
            }
            C1AQS.LIZJ(jElapsedRealtime, 1, name2, name, z);
        } else {
            C1120604Zw.LIZ.LIZ();
            anonymousClass0317CreateIAnchorDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IAnchorDependencyService.class);
        }
        pairArr[9] = new Pair("follow_status", ((IAnchorDependencyService) anonymousClass0317CreateIAnchorDependencyServicebyMonsterPlugin).getFollowStatus(productListModel.aweme));
        pairArr[10] = new Pair("entrance_form", "video_single_anchor");
        pairArr[11] = new Pair("page_name", "video");
        C1421105hJ.LIZLLL("product_stay_time", pairArr);
    }

    public static C2344009Gk LJJI(boolean z, String str, Aweme aweme, List list, String str2) {
        AnonymousClass0317 anonymousClass0317CreateICommonFeedDependServicebyMonsterPlugin;
        AnonymousClass0317 anonymousClass0317CreateIAnchorDependencyServicebyMonsterPlugin;
        boolean z2;
        String name;
        boolean z3;
        String name2;
        C2344009Gk c2344009GkLIZIZ = LIZIZ(z, str, aweme, null, list, str2);
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            anonymousClass0317CreateICommonFeedDependServicebyMonsterPlugin = CommonFeedDependService.createICommonFeedDependServicebyMonsterPlugin(false);
            if (anonymousClass0317CreateICommonFeedDependServicebyMonsterPlugin != null) {
                z3 = true;
            } else {
                z3 = false;
            }
            String name3 = ICommonFeedDependService.class.getName();
            if (anonymousClass0317CreateICommonFeedDependServicebyMonsterPlugin != null) {
                name2 = anonymousClass0317CreateICommonFeedDependServicebyMonsterPlugin.getClass().getName();
            } else {
                name2 = null;
            }
            C1AQS.LIZJ(jElapsedRealtime, 1, name3, name2, z3);
        } else {
            C1120604Zw.LIZ.LIZ();
            anonymousClass0317CreateICommonFeedDependServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(ICommonFeedDependService.class);
        }
        ((ICommonFeedDependService) anonymousClass0317CreateICommonFeedDependServicebyMonsterPlugin).appendCheckParams(c2344009GkLIZIZ, aweme, str, true);
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime2 = SystemClock.elapsedRealtime();
            anonymousClass0317CreateIAnchorDependencyServicebyMonsterPlugin = AnchorDependencyService.createIAnchorDependencyServicebyMonsterPlugin(false);
            if (anonymousClass0317CreateIAnchorDependencyServicebyMonsterPlugin != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            String name4 = IAnchorDependencyService.class.getName();
            if (anonymousClass0317CreateIAnchorDependencyServicebyMonsterPlugin != null) {
                name = anonymousClass0317CreateIAnchorDependencyServicebyMonsterPlugin.getClass().getName();
            } else {
                name = null;
            }
            C1AQS.LIZJ(jElapsedRealtime2, 1, name4, name, z2);
        } else {
            C1120604Zw.LIZ.LIZ();
            anonymousClass0317CreateIAnchorDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IAnchorDependencyService.class);
        }
        if (((IAnchorDependencyService) anonymousClass0317CreateIAnchorDependencyServicebyMonsterPlugin).getAnchorMobRefactorExpEnable()) {
            return c2344009GkLIZIZ;
        }
        C1507790pL7 c1507790pL7 = C1507790pL7.LIZ;
        Map<String, String> map = c2344009GkLIZIZ.LIZ;
        c1507790pL7.getClass();
        C1507790pL7.LJFF("multi_anchor_entrance_show", map);
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v11, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v9, types: [X.13BV] */
    public static C2344009Gk LIZIZ(boolean z, String str, Aweme aweme, AnchorProductInfoModel anchorProductInfoModel, List list, String str2) {
        List<AnchorCommonStruct> anchors;
        String authorUid;
        String aid;
        String requestId;
        String strLJJLIIIJ;
        String strLJJLIIIJ2;
        String strLJJLIIIJ3;
        String str3;
        String str4;
        IECommerceHostService iECommerceHostService;
        ?? arrayList;
        RealtimeFcpConfig realtimeConfig;
        RealtimeComponentConfig realtimeComponentConfig;
        List<ComponentPreloadConfig> list2;
        String componentKey;
        String componentKey2;
        String name;
        AnchorProductInfoModel anchorProductInfoModel2;
        AnchorProductInfo anchorProductInfo;
        AnchorProductInfoModel anchorProductInfoModel3;
        String componentKey3 = null;
        if (aweme != null) {
            anchors = aweme.getAnchors();
        } else {
            anchors = null;
        }
        AnchorBizUtils.LIZ.getClass();
        AnchorCommonStruct anchorCommonStructLJJIIZ = AnchorBizUtils.LJJIIZ(anchors);
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_method", str2);
        c2344009Gk.LJIIIIZZ("enter_from", str);
        if (aweme != null) {
            authorUid = AwemeExtKt.getAuthorUid(aweme);
        } else {
            authorUid = null;
        }
        c2344009Gk.LJIIIIZZ("author_id", authorUid);
        c2344009Gk.LJIIIIZZ("music_id", C586930N0h.LIZ(aweme));
        if (aweme != null) {
            aid = aweme.getAid();
        } else {
            aid = null;
        }
        c2344009Gk.LJIIIIZZ("group_id", aid);
        if (aweme != null) {
            requestId = aweme.getRequestId();
        } else {
            requestId = null;
        }
        c2344009Gk.LJIIIIZZ("request_id", requestId);
        if (anchorProductInfoModel != null) {
            strLJJLIIIJ = anchorProductInfoModel.id;
        } else if (list != null) {
            ArrayList arrayList2 = new ArrayList();
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList2.add(((AnchorProductInfoModel) it2.next()).id);
            }
            strLJJLIIIJ = C13LP.LJJLIIIJ(arrayList2, ",", null, null, 0, null, null, 62);
        } else {
            strLJJLIIIJ = null;
        }
        c2344009Gk.LJIIIIZZ("anchor_id", strLJJLIIIJ);
        if (anchorProductInfoModel != null) {
            strLJJLIIIJ2 = anchorProductInfoModel.extraData.title;
        } else if (list != null) {
            ArrayList arrayList3 = new ArrayList();
            Iterator it3 = list.iterator();
            while (it3.hasNext()) {
                arrayList3.add(((AnchorProductInfoModel) it3.next()).extraData.elasticTitle);
            }
            strLJJLIIIJ2 = C13LP.LJJLIIIJ(arrayList3, ",", null, null, 0, null, null, 62);
        } else {
            strLJJLIIIJ2 = null;
        }
        c2344009Gk.LJIIIIZZ("anchor_name", strLJJLIIIJ2);
        if (anchorProductInfoModel != null) {
            strLJJLIIIJ3 = "product";
        } else if (list != null) {
            ArrayList arrayList4 = new ArrayList();
            Iterator it4 = list.iterator();
            while (it4.hasNext()) {
                it4.next();
                arrayList4.add("product");
            }
            strLJJLIIIJ3 = C13LP.LJJLIIIJ(arrayList4, ",", null, null, 0, null, null, 62);
        } else {
            strLJJLIIIJ3 = null;
        }
        c2344009Gk.LJIIIIZZ("anchor_type", strLJJLIIIJ3);
        if (list != null && (anchorProductInfoModel3 = (AnchorProductInfoModel) C13LP.LJJJLL(list)) != null) {
            str3 = anchorProductInfoModel3.id;
        } else {
            str3 = null;
        }
        c2344009Gk.LJIIIIZZ("main_anchor_id", str3);
        if (list != null && (anchorProductInfoModel2 = (AnchorProductInfoModel) C13LP.LJJJLL(list)) != null && (anchorProductInfo = anchorProductInfoModel2.extraData) != null) {
            str4 = anchorProductInfo.elasticTitle;
        } else {
            str4 = null;
        }
        c2344009Gk.LJIIIIZZ("main_anchor_name", str4);
        c2344009Gk.LJIIIIZZ("main_anchor_type", "product");
        c2344009Gk.LIZJ(z ? 1 : 0, "multi_anchor");
        C21272018Mk.LIZ.getClass();
        c2344009Gk.LIZJ(C21272018Mk.LJJI(anchors), "anchor_number");
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            boolean z2 = false;
            IAnchorDependencyService iAnchorDependencyServiceCreateIAnchorDependencyServicebyMonsterPlugin = AnchorDependencyService.createIAnchorDependencyServicebyMonsterPlugin(false);
            if (iAnchorDependencyServiceCreateIAnchorDependencyServicebyMonsterPlugin != null) {
                z2 = true;
            }
            String name2 = IAnchorDependencyService.class.getName();
            if (iAnchorDependencyServiceCreateIAnchorDependencyServicebyMonsterPlugin != null) {
                name = iAnchorDependencyServiceCreateIAnchorDependencyServicebyMonsterPlugin.getClass().getName();
            } else {
                name = null;
            }
            C1AQS.LIZJ(jElapsedRealtime, 1, name2, name, z2);
            iECommerceHostService = iAnchorDependencyServiceCreateIAnchorDependencyServicebyMonsterPlugin;
        } else {
            C1120604Zw.LIZ.LIZ();
            iECommerceHostService = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IAnchorDependencyService.class);
        }
        if (((IAnchorDependencyService) iECommerceHostService).getAnchorMobRefactorExpEnable()) {
            if (anchorCommonStructLJJIIZ != null) {
                componentKey = anchorCommonStructLJJIIZ.getComponentKey();
            } else {
                componentKey = null;
            }
            c2344009Gk.LJIIIIZZ("component_key", componentKey);
            if (anchorCommonStructLJJIIZ != null) {
                componentKey2 = anchorCommonStructLJJIIZ.getComponentKey();
            } else {
                componentKey2 = null;
            }
            c2344009Gk.LJFF("main_component_key", componentKey2);
        }
        if (aweme != null && (realtimeConfig = aweme.getRealtimeConfig()) != null && (realtimeComponentConfig = realtimeConfig.realtimeComponentConfig) != null && (list2 = realtimeComponentConfig.componentPreloadConfig) != null) {
            ArrayList arrayList5 = new ArrayList();
            for (ComponentPreloadConfig componentPreloadConfig : list2) {
                if (Intrinsics.LJFF(componentPreloadConfig.enableLandingPagePreload, Boolean.TRUE)) {
                    arrayList5.add(componentPreloadConfig);
                }
            }
            arrayList = new ArrayList(C15438062q.LJIJJ(arrayList5, 10));
            Iterator it5 = arrayList5.iterator();
            while (it5.hasNext()) {
                arrayList.add(((ComponentPreloadConfig) it5.next()).componentKey);
            }
        } else {
            arrayList = C13BV.INSTANCE;
        }
        if (anchorCommonStructLJJIIZ != null) {
            componentKey3 = anchorCommonStructLJJIIZ.getComponentKey();
        }
        c2344009Gk.LIZJ(arrayList.contains(componentKey3) ? 1 : 0, "should_preload");
        return c2344009Gk;
    }

    public static void LJI(boolean z, Integer num, String str, String str2, String str3, boolean z2) {
        if (!z2) {
            return;
        }
        C1018703yb.LIZLLL("rd_tiktok_video_anchor_to_shop", new C21275018No(str, num, str2, z, str3));
    }

    public static void LJIILL(String str, PanelVoucherInfo panelVoucherInfo, String str2, String str3, String str4, Map map) {
        String str5;
        if (panelVoucherInfo != null) {
            str5 = panelVoucherInfo.daInfo;
        } else {
            str5 = null;
        }
        HashMap<String, Object> mapLJIIJ = C1741890vQh.LJIIJ(str5);
        C1739800vNK.LIZ.getClass();
        C1018703yb.LIZLLL("tiktokec_coupon_click", new C18LU(str3, str4, C1739800vNK.LIZ(panelVoucherInfo), panelVoucherInfo, str2, mapLJIIJ, str, map));
    }

    public static void LJJIIJZLJL(String str, ProductListModel productListModel, AnchorProductInfoModel anchorProductInfoModel, String str2, List list, Map map) {
        String str3;
        String strLIZIZ;
        AnchorProductInfo anchorProductInfo;
        String string;
        AnchorProductInfo anchorProductInfo2;
        Long l;
        String str4 = "";
        if (str2 == null) {
            str2 = "";
        }
        Uri uri = UriProtector.parse(str2);
        AnchorProductInfo anchorProductInfo3 = null;
        if (uri == null || (strLIZIZ = C1942307jB.LIZIZ(uri, "sellerId")) == null) {
            if (anchorProductInfoModel == null || (anchorProductInfo = anchorProductInfoModel.extraData) == null || (str3 = anchorProductInfo.shopLinkSchema) == null) {
                str3 = "";
            }
            Uri uri2 = UriProtector.parse(str3);
            if (uri2 == null || (strLIZIZ = C1942307jB.LIZIZ(uri2, "shopId")) == null) {
                strLIZIZ = "";
            }
        }
        Pair[] pairArr = new Pair[12];
        pairArr[0] = new Pair("EVENT_ORIGIN_FEATURE", "TEMAI");
        pairArr[1] = new Pair("shop_id", strLIZIZ);
        if (anchorProductInfoModel == null || (anchorProductInfo2 = anchorProductInfoModel.extraData) == null || (l = anchorProductInfo2.productId) == null || (string = l.toString()) == null) {
            string = "";
        }
        pairArr[2] = new Pair("product_id", string);
        String str5 = productListModel.authorUid;
        if (str5 == null) {
            str5 = "";
        }
        pairArr[3] = new Pair("author_id", str5);
        String str6 = productListModel.eventType;
        if (str6 == null) {
            str6 = "";
        }
        pairArr[4] = new Pair("enter_from", str6);
        String str7 = productListModel.requestId;
        if (str7 != null) {
            str4 = str7;
        }
        pairArr[5] = new Pair("request_id", str4);
        AnchorBizUtils.LIZ.getClass();
        pairArr[6] = new Pair("is_ad", Integer.valueOf(AnchorBizUtils.LJJJLIIL(productListModel) ? 1 : 0));
        pairArr[7] = new Pair("page_name", "video");
        pairArr[8] = new Pair("previous_page", "video");
        pairArr[9] = new Pair("source_page_type", "video");
        pairArr[10] = new Pair("entrance_type", "shop_icon");
        pairArr[11] = new Pair("group_id", productListModel.aid);
        Map mapLJIIJ = C2097608Jq.LJIIJ(pairArr);
        C21272018Mk c21272018Mk = C21272018Mk.LIZ;
        if (anchorProductInfoModel != null) {
            anchorProductInfo3 = anchorProductInfoModel.extraData;
        }
        c21272018Mk.getClass();
        mapLJIIJ.putAll(C21272018Mk.LJIJJ(anchorProductInfo3, list));
        mapLJIIJ.putAll(map);
        C1421105hJ.LIZJ(str, mapLJIIJ);
    }

    public final C2344009Gk LJ(boolean z, String str, Aweme aweme, List<AnchorProductInfoModel> list, String str2, String str3) {
        String str4;
        AnonymousClass0317 anonymousClass0317CreateICommonFeedDependServicebyMonsterPlugin;
        AnonymousClass0317 anonymousClass0317CreateIAnchorDependencyServicebyMonsterPlugin;
        String name;
        boolean z2;
        String name2;
        AnchorProductInfoModel anchorProductInfoModel;
        if (Intrinsics.LJFF(str3, "pdp")) {
            if (list != null) {
                anchorProductInfoModel = (AnchorProductInfoModel) C13LP.LJJJLL(list);
            } else {
                anchorProductInfoModel = null;
            }
            LJIJI(this, z, str, aweme, null, anchorProductInfoModel, list, str2, 8);
        }
        C2344009Gk c2344009GkLIZIZ = LIZIZ(z, str, aweme, null, list, str2);
        if (z) {
            str4 = "click_list";
        } else {
            str4 = "click_anchor";
        }
        c2344009GkLIZIZ.LJIIIIZZ("click_method", str4);
        boolean z3 = true;
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            anonymousClass0317CreateICommonFeedDependServicebyMonsterPlugin = CommonFeedDependService.createICommonFeedDependServicebyMonsterPlugin(false);
            if (anonymousClass0317CreateICommonFeedDependServicebyMonsterPlugin != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            String name3 = ICommonFeedDependService.class.getName();
            if (anonymousClass0317CreateICommonFeedDependServicebyMonsterPlugin != null) {
                name2 = anonymousClass0317CreateICommonFeedDependServicebyMonsterPlugin.getClass().getName();
            } else {
                name2 = null;
            }
            C1AQS.LIZJ(jElapsedRealtime, 1, name3, name2, z2);
        } else {
            C1120604Zw.LIZ.LIZ();
            anonymousClass0317CreateICommonFeedDependServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(ICommonFeedDependService.class);
        }
        ((ICommonFeedDependService) anonymousClass0317CreateICommonFeedDependServicebyMonsterPlugin).appendCheckParams(c2344009GkLIZIZ, aweme, str, false);
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime2 = SystemClock.elapsedRealtime();
            anonymousClass0317CreateIAnchorDependencyServicebyMonsterPlugin = AnchorDependencyService.createIAnchorDependencyServicebyMonsterPlugin(false);
            if (anonymousClass0317CreateIAnchorDependencyServicebyMonsterPlugin == null) {
                z3 = false;
            }
            String name4 = IAnchorDependencyService.class.getName();
            if (anonymousClass0317CreateIAnchorDependencyServicebyMonsterPlugin != null) {
                name = anonymousClass0317CreateIAnchorDependencyServicebyMonsterPlugin.getClass().getName();
            } else {
                name = null;
            }
            C1AQS.LIZJ(jElapsedRealtime2, 1, name4, name, z3);
        } else {
            C1120604Zw.LIZ.LIZ();
            anonymousClass0317CreateIAnchorDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IAnchorDependencyService.class);
        }
        if (((IAnchorDependencyService) anonymousClass0317CreateIAnchorDependencyServicebyMonsterPlugin).getAnchorMobRefactorExpEnable()) {
            return c2344009GkLIZIZ;
        }
        C1507790pL7 c1507790pL7 = C1507790pL7.LIZ;
        Map<String, String> map = c2344009GkLIZIZ.LIZ;
        c1507790pL7.getClass();
        C1507790pL7.LJFF("multi_anchor_entrance_click", map);
        return null;
    }

    public static void LJIIIIZZ(int i, int i2, AnchorProductInfoModel anchorProductInfoModel, ProductListModel productListModel, String str, List list, Map map) {
        C1018703yb.LIZLLL("tiktokec_button_click", new C21269418Lk(i, i2, anchorProductInfoModel, productListModel, str, list, map));
    }

    public static void LJJIIJ(C21271918Mj c21271918Mj, ProductListModel productListModel, AnchorProductInfo anchorProductInfo, String str, String str2, int i, int i2) {
        AFwS278S0000000_32 aFwS278S0000000_32;
        if ((i2 & 16) != 0) {
            i = 0;
        }
        if ((i2 & 32) != 0) {
            aFwS278S0000000_32 = AFwS278S0000000_32.get$arr$(150);
        } else {
            aFwS278S0000000_32 = null;
        }
        c21271918Mj.getClass();
        ICommerceService iCommerceServiceLIZ = C18OR.LIZ();
        C18N0 c18n0 = new C18N0();
        c18n0.LJIJI = "TEMAI";
        c18n0.LIZIZ = productListModel.eventType;
        c18n0.LJIIJJI = "video_cart_tag";
        c18n0.LJJIFFI = "video";
        Integer num = anchorProductInfo.productStatus;
        int value = EnumC19366010pe.PRODUCT_STATUS_DOWN.getValue();
        if (num != null && num.intValue() == value) {
            c18n0.LJJIZ = C188A.PRODUCT_NOT_AVAILABLE.getValue();
        } else {
            c18n0.LJJIZ = C188A.PRODUCT_AVAILABLE.getValue();
        }
        c18n0.LJIJ = "no";
        c18n0.LJJI = "video_multi_anchor";
        c18n0.LJIILJJIL = String.valueOf(anchorProductInfo.platform);
        c18n0.LJJZ = str;
        c18n0.LJJZZI = str2;
        c18n0.LIZ = C21272218Mm.LJIILL(productListModel.aweme, "rd_tiktokec_product_click", c18n0.LIZIZ, productListModel.mobParams);
        aFwS278S0000000_32.getClass();
        c18n0.LJJJJZI = Integer.valueOf(i);
        iCommerceServiceLIZ.logCommerceEvents("rd_tiktokec_product_click", c18n0);
    }

    public static void LJJIJIL(int i, ProductListModel productListModel, Integer num, String str, String str2, String str3, List list) {
        C1018703yb.LIZLLL("rd_tiktokec_video_shopping_list_request_send", new C21274018Ne(i, productListModel, num, str, str2, str3, list));
    }

    public static void LIZJ(ProductListModel productListModel, AnchorProductInfoModel anchorProductInfoModel, int i, boolean z, int i2, String str, List list, Map map) {
        C1018703yb.LIZLLL("tiktokec_button_show", new C21269718Ln(productListModel, anchorProductInfoModel, i, z, i2, str, map, list));
    }

    public static void LJIIL(boolean z, boolean z2, String str, String str2, List list, List list2, Aweme aweme, Map map) {
        AnchorProductInfoModel anchorProductInfoModel;
        if (list2 != null && (anchorProductInfoModel = (AnchorProductInfoModel) C13LP.LJJJLL(list2)) != null) {
            C23250099c.LIZLLL(C817503Hh.LL, null, null, new C21270118Lr(aweme, str2, z, anchorProductInfoModel, list2, z2, str, map, list, null), 3);
        }
    }

    public static void LJIILLIIL(String str, PanelVoucherInfo panelVoucherInfo, String str2, String str3, String str4, String str5, String str6, Map map) {
        String str7;
        if (panelVoucherInfo != null) {
            str7 = panelVoucherInfo.daInfo;
        } else {
            str7 = null;
        }
        C1018703yb.LIZLLL("tiktokec_coupon_result", new C18LQ(str2, str3, str4, str5, panelVoucherInfo, str6, C1741890vQh.LJIIJ(str7), str, map));
    }

    public static void LJIIIZ(C21271918Mj c21271918Mj, ProductListModel productListModel, AnchorProductInfoModel anchorProductInfoModel, int i, String str, int i2, String str2, List list, Map map) {
        c21271918Mj.getClass();
        C1018703yb.LIZLLL("tiktokec_button_show", new C21269618Lm(i, i2, anchorProductInfoModel, productListModel, str, null, str2, list, map));
    }

    public static C2344009Gk LJIJI(C21271918Mj c21271918Mj, boolean z, String str, Aweme aweme, AwemePruningModel awemePruningModel, AnchorProductInfoModel anchorProductInfoModel, List list, String str2, int i) {
        C2344009Gk c2344009Gk;
        String strLJJLIIIJ;
        String strLJJLIIIJ2;
        String strLJJLIIIJ3;
        String str3;
        String str4;
        String componentKey;
        String componentKey2;
        AnchorProductInfoModel anchorProductInfoModel2;
        AnchorProductInfo anchorProductInfo;
        AnchorProductInfoModel anchorProductInfoModel3;
        String str5;
        IECommerceHostService iECommerceHostService;
        AnchorProductInfoModel anchorProductInfoModel4 = anchorProductInfoModel;
        AwemePruningModel awemePruningModel2 = awemePruningModel;
        Aweme aweme2 = aweme;
        String name = null;
        if ((i & 4) != 0) {
            aweme2 = null;
        }
        if ((i & 8) != 0) {
            awemePruningModel2 = null;
        }
        if ((i & 16) != 0) {
            anchorProductInfoModel4 = null;
        }
        if (aweme2 != null) {
            c21271918Mj.getClass();
            c2344009Gk = LIZIZ(z, str, aweme2, anchorProductInfoModel4, list, str2);
        } else {
            c21271918Mj.getClass();
            if (awemePruningModel2 != null) {
                AnchorBizUtils anchorBizUtils = AnchorBizUtils.LIZ;
                List<AnchorCommonStruct> list2 = awemePruningModel2.anchors;
                anchorBizUtils.getClass();
                AnchorCommonStruct anchorCommonStructLJJIIZ = AnchorBizUtils.LJJIIZ(list2);
                c2344009Gk = new C2344009Gk();
                c2344009Gk.LJIIIIZZ("enter_method", str2);
                c2344009Gk.LJIIIIZZ("enter_from", str);
                c2344009Gk.LJIIIIZZ("author_id", awemePruningModel2.authorUid);
                c2344009Gk.LJIIIIZZ("group_id", awemePruningModel2.aid);
                c2344009Gk.LJIIIIZZ("request_id", awemePruningModel2.requestId);
                if (anchorProductInfoModel4 != null) {
                    strLJJLIIIJ = anchorProductInfoModel4.id;
                } else if (list != null) {
                    ArrayList arrayList = new ArrayList();
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        arrayList.add(((AnchorProductInfoModel) it2.next()).id);
                    }
                    strLJJLIIIJ = C13LP.LJJLIIIJ(arrayList, ",", null, null, 0, null, null, 62);
                } else {
                    strLJJLIIIJ = null;
                }
                c2344009Gk.LJIIIIZZ("anchor_id", strLJJLIIIJ);
                if (anchorProductInfoModel4 != null) {
                    strLJJLIIIJ2 = anchorProductInfoModel4.extraData.title;
                } else if (list != null) {
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it3 = list.iterator();
                    while (it3.hasNext()) {
                        arrayList2.add(((AnchorProductInfoModel) it3.next()).extraData.elasticTitle);
                    }
                    strLJJLIIIJ2 = C13LP.LJJLIIIJ(arrayList2, ",", null, null, 0, null, null, 62);
                } else {
                    strLJJLIIIJ2 = null;
                }
                c2344009Gk.LJIIIIZZ("anchor_name", strLJJLIIIJ2);
                if (anchorProductInfoModel4 != null) {
                    strLJJLIIIJ3 = "product";
                } else if (list != null) {
                    ArrayList arrayList3 = new ArrayList();
                    Iterator it4 = list.iterator();
                    while (it4.hasNext()) {
                        it4.next();
                        arrayList3.add("product");
                    }
                    strLJJLIIIJ3 = C13LP.LJJLIIIJ(arrayList3, ",", null, null, 0, null, null, 62);
                } else {
                    strLJJLIIIJ3 = null;
                }
                c2344009Gk.LJIIIIZZ("anchor_type", strLJJLIIIJ3);
                if (list != null && (anchorProductInfoModel3 = (AnchorProductInfoModel) C13LP.LJJJLL(list)) != null) {
                    str3 = anchorProductInfoModel3.id;
                } else {
                    str3 = null;
                }
                c2344009Gk.LJIIIIZZ("main_anchor_id", str3);
                if (list != null && (anchorProductInfoModel2 = (AnchorProductInfoModel) C13LP.LJJJLL(list)) != null && (anchorProductInfo = anchorProductInfoModel2.extraData) != null) {
                    str4 = anchorProductInfo.elasticTitle;
                } else {
                    str4 = null;
                }
                c2344009Gk.LJIIIIZZ("main_anchor_name", str4);
                c2344009Gk.LJIIIIZZ("main_anchor_type", "product");
                c2344009Gk.LIZJ(z ? 1 : 0, "multi_anchor");
                C21272018Mk c21272018Mk = C21272018Mk.LIZ;
                List<AnchorCommonStruct> list3 = awemePruningModel2.anchors;
                c21272018Mk.getClass();
                c2344009Gk.LIZJ(C21272018Mk.LJJI(list3), "anchor_number");
                if (anchorCommonStructLJJIIZ != null) {
                    componentKey = anchorCommonStructLJJIIZ.getComponentKey();
                } else {
                    componentKey = null;
                }
                c2344009Gk.LJIIIIZZ("component_key", componentKey);
                if (anchorCommonStructLJJIIZ != null) {
                    componentKey2 = anchorCommonStructLJJIIZ.getComponentKey();
                } else {
                    componentKey2 = null;
                }
                c2344009Gk.LJIIIIZZ("main_component_key", componentKey2);
            } else {
                c2344009Gk = new C2344009Gk();
            }
        }
        if (z) {
            str5 = "click_list";
        } else {
            str5 = "click_anchor";
        }
        c2344009Gk.LJIIIIZZ("click_method", str5);
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            boolean z2 = false;
            IAnchorDependencyService iAnchorDependencyServiceCreateIAnchorDependencyServicebyMonsterPlugin = AnchorDependencyService.createIAnchorDependencyServicebyMonsterPlugin(false);
            if (iAnchorDependencyServiceCreateIAnchorDependencyServicebyMonsterPlugin != null) {
                z2 = true;
            }
            String name2 = IAnchorDependencyService.class.getName();
            if (iAnchorDependencyServiceCreateIAnchorDependencyServicebyMonsterPlugin != null) {
                name = iAnchorDependencyServiceCreateIAnchorDependencyServicebyMonsterPlugin.getClass().getName();
            }
            C1AQS.LIZJ(jElapsedRealtime, 1, name2, name, z2);
            iECommerceHostService = iAnchorDependencyServiceCreateIAnchorDependencyServicebyMonsterPlugin;
        } else {
            C1120604Zw.LIZ.LIZ();
            iECommerceHostService = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IAnchorDependencyService.class);
        }
        JSONObject jSONObjectMobParamsParserGetJSONObject = ((IAnchorDependencyService) iECommerceHostService).mobParamsParserGetJSONObject(c2344009Gk);
        C1507790pL7.LIZ.getClass();
        C1507790pL7.LJI("enter_multi_anchor_detail", jSONObjectMobParamsParserGetJSONObject);
        return c2344009Gk;
    }

    /* JADX WARN: Removed duplicated region for block: B:176:0x0375  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x03d1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJJIIZ(X.C21271918Mj r19, com.ss.android.ugc.aweme.ecommerce.model.ProductListModel r20, java.lang.String r21, java.util.List r22, boolean r23, long r24, X.C15MV r26, int r27, java.lang.String r28) {
        /*
            Method dump skipped, instruction units count: 1006
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21271918Mj.LJJIIZ(X.18Mj, com.ss.android.ugc.aweme.ecommerce.model.ProductListModel, java.lang.String, java.util.List, boolean, long, X.15MV, int, java.lang.String):void");
    }

    public static void LJJIFFI(int i, int i2, long j, ProductListModel productListModel, Boolean bool, String str, String str2, boolean z, boolean z2, boolean z3) {
        C1018703yb.LIZLLL("rd_tiktokec_video_promotion_render", new C18NB(i2, i, j, productListModel, bool, str2, str, z, z2, z3));
    }

    /* JADX WARN: Removed duplicated region for block: B:162:0x0341  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJJIIZI(X.C21271918Mj r19, com.ss.android.ugc.aweme.ecommerce.model.ProductListModel r20, java.lang.String r21, int r22, java.util.List r23, X.C15MV r24, long r25, java.lang.String r27, int r28, int r29, java.lang.String r30) {
        /*
            Method dump skipped, instruction units count: 854
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21271918Mj.LJJIIZI(X.18Mj, com.ss.android.ugc.aweme.ecommerce.model.ProductListModel, java.lang.String, int, java.util.List, X.15MV, long, java.lang.String, int, int, java.lang.String):void");
    }

    public static void LJJIJIIJIL(int i, int i2, Integer num, Integer num2, Long l, Long l2, String str, String str2, String str3, String str4, List list) {
        C1018703yb.LIZLLL("rd_tiktokec_video_shopping_list_request_result", new C599370Nf5(i, i2, num2, num, l, l2, str2, str3, str4, str, list));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:339:0x0631  */
    /* JADX WARN: Type inference failed for: r42v1, types: [int] */
    /* JADX WARN: Type inference failed for: r42v2 */
    /* JADX WARN: Type inference failed for: r42v3 */
    /* JADX WARN: Type inference failed for: r6v17, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r6v18, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r6v19, types: [java.util.HashMap, java.util.LinkedHashMap] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r8v12, types: [java.util.HashMap, java.util.LinkedHashMap] */
    /* JADX WARN: Type inference failed for: r8v13, types: [java.util.HashMap, java.util.LinkedHashMap] */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r8v6, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r8v7, types: [java.util.Map] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZLLL(X.C21271918Mj r30, com.ss.android.ugc.aweme.ecommerce.model.ProductListModel r31, java.util.List r32, java.lang.Integer r33, java.lang.String r34, java.lang.String r35, boolean r36, java.lang.String r37, java.lang.String r38, java.lang.String r39, java.lang.String r40, java.lang.Boolean r41, boolean r42, java.util.Map r43, java.util.Map r44, com.ss.android.ugc.aweme.ecommerce.model.AnchorProductInfoModel r45, int r46, int r47, int r48) {
        /*
            Method dump skipped, instruction units count: 1620
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21271918Mj.LIZLLL(X.18Mj, com.ss.android.ugc.aweme.ecommerce.model.ProductListModel, java.util.List, java.lang.Integer, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, boolean, java.util.Map, java.util.Map, com.ss.android.ugc.aweme.ecommerce.model.AnchorProductInfoModel, int, int, int):void");
    }
}
