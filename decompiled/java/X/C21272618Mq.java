package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.ecommerce.anchor.manager.ECShortVideoPermissionManager;
import com.ss.android.ugc.aweme.ecommerce.anchor.settings.EcStickerCategoryFuncSetting;
import com.ss.android.ugc.aweme.ecommerce.anchor.utils.AnchorBizUtils;
import com.ss.android.ugc.aweme.ecommerce.model.AnchorProductInfo;
import com.ss.android.ugc.aweme.ecommerce.model.AnchorProductInfoModel;
import com.ss.android.ugc.aweme.ecommerce.model.AnchorPublishPermission;
import com.ss.android.ugc.aweme.ecommerce.model.ProductListModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.ad.ShopAnchorSellingPointData;
import com.zhiliaoapp.musically.R;
import defpackage.t1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.18Mq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21272618Mq {
    public static final C21272618Mq LIZ = new C21272618Mq();

    public static int LJIILL(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i == 4 ? R.raw.icon_anchor_shopping_cart : R.raw.icon_anchor_product : R.raw.icon_anchor_deal : R.raw.icon_anchor_product_alt_1 : R.raw.icon_anchor_product_alt_2 : R.raw.icon_anchor_product;
    }

    public static boolean LJI() {
        return ((Boolean) C268600Afq.LIZ.getValue()).booleanValue();
    }

    public static List LJIJI() {
        EcStickerCategoryFuncSetting.LIZ.getClass();
        List<String> list = EcStickerCategoryFuncSetting.LIZ().categoryKeyList;
        if (list != null) {
            return list;
        }
        List<String> list2 = EcStickerCategoryFuncSetting.LIZIZ.categoryKeyList;
        return list2 == null ? C13BV.INSTANCE : list2;
    }

    public static boolean LJIILJJIL() {
        return C0C64.LJIILLIIL().LJIIIZ(31744, "ec_anchor_creator_recommend_products", true, false);
    }

    public static int LIZ(Aweme aweme) {
        if (LJIILIIL(aweme)) {
            return t1.LIZIZ().ecSvShouldPhotoModeShowSecondLine.delayCallSec;
        }
        AnchorBizUtils.LIZ.getClass();
        if (AnchorBizUtils.LJJJLL(aweme)) {
            return C21276218Oa.LIZ().delayCallSec;
        }
        return C21276318Ob.LIZ().delayCallSec;
    }

    public static boolean LIZIZ(Aweme aweme) {
        AnchorBizUtils.LIZ.getClass();
        if (AnchorBizUtils.LJJJLL(aweme)) {
            SettingsManager.LIZLLL().getClass();
            if (SettingsManager.LIZ("ec_use_custom_anchor_ads", false) || C18NF.LIZ(aweme.getAwemeRawAd())) {
                return true;
            }
            return false;
        }
        SettingsManager.LIZLLL().getClass();
        if (SettingsManager.LIZ("ec_use_custom_anchor", false)) {
            return true;
        }
        return false;
    }

    public static boolean LIZJ(ProductListModel productListModel) {
        AnchorBizUtils.LIZ.getClass();
        if (AnchorBizUtils.LJJJLIIL(productListModel)) {
            if (C0C64.LJIILLIIL().LJIJ(31744, 0, "ec_anchor_pdp_full_page_from_anchor_ads", true) == 1) {
                return true;
            }
            return false;
        }
        if (C0C64.LJIILLIIL().LJIJ(31744, 0, "ec_anchor_pdp_full_page_from_anchor", true) == 1) {
            return true;
        }
        return false;
    }

    public static boolean LIZLLL(Aweme aweme) {
        ShopAnchorSellingPointData shopAnchorSellingPoints;
        AnchorBizUtils.LIZ.getClass();
        if (AnchorBizUtils.LJJJLL(aweme)) {
            if (C18NF.LIZ(aweme.getAwemeRawAd())) {
                AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
                if (awemeRawAd != null && (shopAnchorSellingPoints = awemeRawAd.getShopAnchorSellingPoints()) != null && shopAnchorSellingPoints.getType() == 3) {
                    return true;
                }
                return false;
            }
            SettingsManager.LIZLLL().getClass();
            if (SettingsManager.LIZ("ec_anchor_show_request_enable_ads", false)) {
                return true;
            }
            return false;
        }
        SettingsManager.LIZLLL().getClass();
        if (SettingsManager.LIZ("ec_anchor_show_request_enable", false)) {
            return true;
        }
        return false;
    }

    public static boolean LJ(Aweme aweme) {
        AnchorBizUtils.LIZ.getClass();
        if (AnchorBizUtils.LJJJLL(aweme)) {
            if (C18NF.LIZ(aweme.getAwemeRawAd()) || (C21276218Oa.LIZ().enable && C21276218Oa.LIZ().delayShowSubtitle > 0)) {
                return true;
            }
            return false;
        }
        if (C21276318Ob.LIZ().enable && C21276318Ob.LIZ().delayShowSubtitle > 0) {
            return true;
        }
        return false;
    }

    public static boolean LJII(boolean z) {
        if (z) {
            AnchorPublishPermission anchorPublishPermissionLIZ = ECShortVideoPermissionManager.LIZ.LIZ();
            if (anchorPublishPermissionLIZ == null) {
                return false;
            }
            return anchorPublishPermissionLIZ.enableShopAnchor;
        }
        AnchorPublishPermission anchorPublishPermissionLIZ2 = ECShortVideoPermissionManager.LIZ.LIZ();
        if (anchorPublishPermissionLIZ2 != null) {
            return anchorPublishPermissionLIZ2.enableAnchor;
        }
        if (!C0C64.LJIILLIIL().LJIIIZ(31744, "ec_anchor_creator_photo_mode_enable", true, false)) {
            return false;
        }
        return true;
    }

    public static boolean LJIIIIZZ(List list) {
        SettingsManager.LIZLLL().getClass();
        if (SettingsManager.LIZ("ec_custom_anchor_panel", true)) {
            AnchorBizUtils.LIZ.getClass();
            if (AnchorBizUtils.LJJJLZIJ(list)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static boolean LJIIJ(Aweme aweme) {
        AnchorBizUtils.LIZ.getClass();
        if (AnchorBizUtils.LJJJLL(aweme)) {
            return false;
        }
        SettingsManager.LIZLLL().getClass();
        if (!SettingsManager.LIZ("ec_sv_should_enable_one_img_one_product", false) || !AnchorBizUtils.LJJLIIIJJI(aweme) || aweme == null || !AwemeExtKt.isPhotoMode(aweme)) {
            return false;
        }
        return true;
    }

    public static boolean LJIIJJI(ProductListModel productListModel) {
        AnchorBizUtils.LIZ.getClass();
        if (AnchorBizUtils.LJJJLIIL(productListModel)) {
            if (C0C64.LJIILLIIL().LJIJ(31744, 0, "ec_anchor_panel_full_page_ads", true) == 1) {
                return true;
            }
            return false;
        }
        if (C0C64.LJIILLIIL().LJIJ(31744, 0, "ec_anchor_panel_full_page", true) == 1) {
            return true;
        }
        return false;
    }

    public static boolean LJIIL(Aweme aweme) {
        AnchorBizUtils.LIZ.getClass();
        if (AnchorBizUtils.LJJJLL(aweme) || aweme == null || !AwemeExtKt.isPhotoMode(aweme) || !t1.LIZ()) {
            return false;
        }
        return true;
    }

    public static boolean LJIILIIL(Aweme aweme) {
        AnchorBizUtils.LIZ.getClass();
        if (AnchorBizUtils.LJJJLL(aweme) || aweme == null || !AwemeExtKt.isPhotoMode(aweme) || !t1.LIZIZ().ecSvShouldPhotoModeShowSecondLine.enable || t1.LIZIZ().ecSvShouldPhotoModeShowSecondLine.delayShowSubtitle <= 0) {
            return false;
        }
        return true;
    }

    public static int LJIILLIIL(Aweme aweme) {
        String anchorsExtras;
        AnchorBizUtils.LIZ.getClass();
        int i = 0;
        if (AnchorBizUtils.LJJJLL(aweme)) {
            C1735020vFc c1735020vFc = C1735020vFc.LIZ;
            String anchorsExtras2 = aweme.getAnchorsExtras();
            if (C18OZ.LIZ().enable) {
                i = C18OZ.LIZ().anchorIconStyle;
            }
            c1735020vFc.getClass();
            return C1735020vFc.LJFF(i, anchorsExtras2);
        }
        C1735020vFc c1735020vFc2 = C1735020vFc.LIZ;
        if (aweme != null) {
            anchorsExtras = aweme.getAnchorsExtras();
        } else {
            anchorsExtras = null;
        }
        if (C18OY.LIZ().enable) {
            i = C18OY.LIZ().anchorIconStyle;
        }
        c1735020vFc2.getClass();
        return C1735020vFc.LJFF(i, anchorsExtras);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LJIJ(com.ss.android.ugc.aweme.feed.model.Aweme r3) {
        /*
            com.ss.android.ugc.aweme.ecommerce.anchor.utils.AnchorBizUtils r0 = com.ss.android.ugc.aweme.ecommerce.anchor.utils.AnchorBizUtils.LIZ
            r0.getClass()
            boolean r0 = com.ss.android.ugc.aweme.ecommerce.anchor.utils.AnchorBizUtils.LJJJLL(r3)
            r2 = 1
            r1 = 0
            if (r0 == 0) goto L26
            com.bytedance.ies.abmock.SettingsManager r0 = com.bytedance.ies.abmock.SettingsManager.LIZLLL()
            r0.getClass()
            java.lang.String r0 = "ec_use_custom_anchor_ads"
            boolean r0 = com.bytedance.ies.abmock.SettingsManager.LIZ(r0, r1)
            if (r0 != r2) goto L36
        L1c:
            r1 = 1
        L1d:
            boolean r0 = com.ss.android.ugc.aweme.ecommerce.anchor.utils.AnchorBizUtils.LJJL(r3)
            if (r0 == 0) goto L38
            if (r1 == 0) goto L38
            return r2
        L26:
            com.bytedance.ies.abmock.SettingsManager r0 = com.bytedance.ies.abmock.SettingsManager.LIZLLL()
            r0.getClass()
            java.lang.String r0 = "ec_use_custom_anchor"
            boolean r0 = com.bytedance.ies.abmock.SettingsManager.LIZ(r0, r1)
            if (r0 != r2) goto L36
            goto L1c
        L36:
            r1 = 0
            goto L1d
        L38:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21272618Mq.LJIJ(com.ss.android.ugc.aweme.feed.model.Aweme):boolean");
    }

    public static int LJIJJ(ProductListModel productListModel) {
        AnchorBizUtils.LIZ.getClass();
        if (AnchorBizUtils.LJJJLIIL(productListModel)) {
            return 0;
        }
        return C18OX.LIZ().anchorPanelStyle;
    }

    public static boolean LJIJJLI(Aweme aweme) {
        AnchorBizUtils.LIZ.getClass();
        if (AnchorBizUtils.LJJJLL(aweme)) {
            if (C0C64.LJIILLIIL().LJIJ(31744, 0, "ec_anchor_comment_single_anchor_style_ads", true) == 1) {
                return true;
            }
            return false;
        }
        if (C0C64.LJIILLIIL().LJIJ(31744, 0, "ec_anchor_comment_single_anchor_style", true) == 1) {
            return true;
        }
        return false;
    }

    public static boolean LJFF(Aweme aweme, List list) {
        AnchorBizUtils.LIZ.getClass();
        if (!AnchorBizUtils.LJJJLZIJ(list)) {
            return false;
        }
        if (AnchorBizUtils.LJJJLL(aweme)) {
            if (!C18OZ.LIZ().enable || !C18OZ.LIZ().primaryStyle) {
                return false;
            }
        } else if (!C18OY.LIZ().enable || !C18OY.LIZ().primaryStyle) {
            return false;
        }
        return true;
    }

    public static Map LJIIZILJ(List list, List list2) {
        Object next;
        AnchorProductInfo anchorProductInfo;
        String str;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (list2 != null) {
                Iterator it2 = list2.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        next = it2.next();
                        if (Intrinsics.LJFF(String.valueOf(((AnchorProductInfoModel) next).extraData.productId), obj)) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                AnchorProductInfoModel anchorProductInfoModel = (AnchorProductInfoModel) next;
                if (anchorProductInfoModel != null && (anchorProductInfo = anchorProductInfoModel.extraData) != null && (str = anchorProductInfo.clientPayloadMap) != null && C123100dR.LIZ(str)) {
                    arrayList.add(new Pair(obj, str));
                }
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C2097608Jq.LJIILJJIL(arrayList, linkedHashMap);
        return linkedHashMap;
    }

    public static boolean LJIIIZ(Aweme aweme, List list, boolean z) {
        AnchorBizUtils.LIZ.getClass();
        if (!AnchorBizUtils.LJJJLZIJ(list) || z) {
            return false;
        }
        if (AnchorBizUtils.LJJJLL(aweme)) {
            if (C0C64.LJIILLIIL().LJIJ(31744, 0, "ec_multi_anchor_maybe_you_like_ads", true) != 1) {
                return false;
            }
        } else if (C0C64.LJIILLIIL().LJIJ(31744, 0, "ec_multi_anchor_maybe_you_like", true) != 1) {
            return false;
        }
        return true;
    }
}
