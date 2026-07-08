package X;

import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PDPLogisticModule;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.TabBarItemVO;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.carousel.ProductCarouselItemDataModel;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.desc.AboutThisProductVO;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.divider.UsPdpDividerDataModel;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.insurance.InsuranceInfoVO;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.productinterlink.ProductInterlinkVO;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.productrecommend.ProductRecommendVO;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.promotion.USDealsEntranceVO;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.richtext.UsPdpRichTitleDataModel;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.shop.USSESSellerModuleVO;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.shoprecommend.ShopRecommendVO;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.sku.assem.dropdown.PdpSkuPropDropdownItemDataModel;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.sku.assem.selection.SkuPropSelectionItemDataModel;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.topstoreidentity.UsPdpTopStoreIdentityBodyDataModel;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;

/* JADX INFO: renamed from: X.03vG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C998003vG {
    public static final Set<String> LIZ = C13LQ.LJLIIL(new String[]{"page", "header", "footer", "body"});
    public static final Map<String, Class<? extends InterfaceC718502rH>> LIZIZ = C2097608Jq.LJIIIIZZ(new Pair("pdp_product_interlink_style_1", ProductInterlinkVO.class), new Pair("pdp_header_tab_bar_style_1", TabBarItemVO.class), new Pair("pdp_top_store_identity_style_1", UsPdpTopStoreIdentityBodyDataModel.class), new Pair("pdp_sku_prop_selection_style_1", SkuPropSelectionItemDataModel.class), new Pair("pdp_sku_prop_dropdown_style_1", PdpSkuPropDropdownItemDataModel.class), new Pair("pdp_rich_title_style_1", UsPdpRichTitleDataModel.class), new Pair("pdp_divider_style_3", UsPdpDividerDataModel.class), new Pair("product_carousel_style_1", ProductCarouselItemDataModel.class));
    public static final Map<String, Class<?>> LIZJ = C2097608Jq.LJIIIIZZ(new Pair("pdp_shop_profile_style_2", USSESSellerModuleVO.class), new Pair("pdp_coupons_style_2", USDealsEntranceVO.class), new Pair("pdp_product_interlink_style_1", ProductInterlinkVO.class), new Pair("pdp_shop_recommend_style_2", ShopRecommendVO.class), new Pair("pdp_delivery_style_1", PDPLogisticModule.class), new Pair("pdp_insurance_style_1", InsuranceInfoVO.class), new Pair("pdp_product_recommend_algo_style_1", ProductRecommendVO.class), new Pair("pdp_about_this_product_collapsible_style_1", AboutThisProductVO.class), new Pair("pdp_return_policy_style_1", PDPLogisticModule.class));
}
