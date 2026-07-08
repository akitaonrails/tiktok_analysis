package X;

import android.text.SpannableStringBuilder;
import androidx.lifecycle.ViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PromotionWaist;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.AddToCartButton;
import com.ss.android.ugc.aweme.ecommerce.base.sku.vm.SkuState;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.045v, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C10425045v extends C09AY implements Function1<SkuState, SkuState> {
    public final /* synthetic */ C259800zU<String> LL;
    public final /* synthetic */ C259800zU<SpannableStringBuilder> LLILLJJLI;
    public final /* synthetic */ C259800zU<C041I> LLILLL;
    public final /* synthetic */ C259800zU<String> LLILZ;
    public final /* synthetic */ C259800zU<String> LLILZIL;
    public final /* synthetic */ C259800zU<String> LLILZLL;
    public final /* synthetic */ C043B<ViewModel> LLIZ;
    public final /* synthetic */ C259800zU<String> LLIZLLLIL;
    public final /* synthetic */ String LLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10425045v(C259800zU<String> c259800zU, C259800zU<SpannableStringBuilder> c259800zU2, C259800zU<C041I> c259800zU3, C259800zU<String> c259800zU4, C259800zU<String> c259800zU5, C259800zU<String> c259800zU6, C043B<ViewModel> c043b, C259800zU<String> c259800zU7, String str) {
        super(1);
        this.LL = c259800zU;
        this.LLILLJJLI = c259800zU2;
        this.LLILLL = c259800zU3;
        this.LLILZ = c259800zU4;
        this.LLILZIL = c259800zU5;
        this.LLILZLL = c259800zU6;
        this.LLIZ = c043b;
        this.LLIZLLLIL = c259800zU7;
        this.LLJ = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final SkuState invoke(SkuState skuState) {
        PromotionWaist promotionWaist;
        SkuState skuState2 = skuState;
        String str = this.LL.element;
        if (str == null) {
            str = "";
        }
        SpannableStringBuilder spannableStringBuilder = this.LLILLJJLI.element;
        C041I c041i = this.LLILLL.element;
        String str2 = this.LLILZ.element;
        String str3 = this.LLILZIL.element;
        String str4 = this.LLILZLL.element;
        AddToCartButton addToCartButtonNq = this.LLIZ.nq();
        String str5 = this.LLIZLLLIL.element;
        ProductPackStruct productPackStructDh = this.LLIZ.Dh();
        if (productPackStructDh != null) {
            promotionWaist = productPackStructDh.skuPanelPromotionWaist;
        } else {
            promotionWaist = null;
        }
        return skuState2.copy(skuState2.checkedSkuArray, skuState2.showToast, skuState2.currentImage, skuState2.preOrderInfo, str, spannableStringBuilder, skuState2.quantityNoticeInfos, skuState2.promotionView, str4, c041i, str3, skuState2.taxDescription, str5, str2, skuState2.currentQuantityLimit, skuState2.currentQuantity, skuState2.contentList, skuState2.keyBoardVisibility, skuState2.skuPanelCloseEvent, skuState2.skuDataState, addToCartButtonNq, skuState2.showLoadingView, skuState2.showLoadingSpinner, skuState2.skuStockInfo, skuState2.forceRefresh, skuState2.originalProductPackStruct, skuState2.protectionProgramText, skuState2.productTitle, skuState2.promotionLabelVO, skuState2.productSellerInfo, skuState2.skuPanelReminder, skuState2.isPriceHidden, skuState2.isQuantityEditable, skuState2.scrollOffset, skuState2.scrollOrientation, skuState2.bottomAreaElem, skuState2.bizEnvChange, skuState2.focusSpecAction, skuState2.allSkuSelected, skuState2.totalPrice, skuState2.couponEvent, skuState2.carouselImages, skuState2.carouselNeedToScrollToFirst, skuState2.counterDisclaimer, skuState2.exceptionUX, skuState2.selectedPurchaseMethod, skuState2.selectedPeriodText, this.LLJ, skuState2.extraInfoData, skuState2.paymentInfo, skuState2.summaryInfo, skuState2.refreshFlag, skuState2.hidePaymentMethodView, promotionWaist);
    }
}
