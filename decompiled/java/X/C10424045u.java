package X;

import android.text.SpannableStringBuilder;
import androidx.lifecycle.ViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PdpBottomAreaElem;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.SkuPanelState;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.AddToCartButton;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.PreOrderInfo;
import com.ss.android.ugc.aweme.ecommerce.base.sku.vm.SkuState;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.045u, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C10424045u extends C09AY implements Function1<SkuState, SkuState> {
    public final /* synthetic */ C259800zU<String> LL;
    public final /* synthetic */ C259800zU<String> LLILLJJLI;
    public final /* synthetic */ C259800zU<String> LLILLL;
    public final /* synthetic */ C259800zU<SpannableStringBuilder> LLILZ;
    public final /* synthetic */ C259800zU<C041I> LLILZIL;
    public final /* synthetic */ C259800zU<String> LLILZLL;
    public final /* synthetic */ C259800zU<AddToCartButton> LLIZ;
    public final /* synthetic */ C259800zU<PreOrderInfo> LLIZLLLIL;
    public final /* synthetic */ C259800zU<EnumC10360043i> LLJ;
    public final /* synthetic */ C259800zU<String> LLJI;
    public final /* synthetic */ C043B<ViewModel> LLJIJIL;
    public final /* synthetic */ C259800zU<String> LLJILJIL;
    public final /* synthetic */ C259800zU<String> LLJILJILJ;
    public final /* synthetic */ String LLJILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10424045u(C259800zU<String> c259800zU, C259800zU<String> c259800zU2, C259800zU<String> c259800zU3, C259800zU<SpannableStringBuilder> c259800zU4, C259800zU<C041I> c259800zU5, C259800zU<String> c259800zU6, C259800zU<AddToCartButton> c259800zU7, C259800zU<PreOrderInfo> c259800zU8, C259800zU<EnumC10360043i> c259800zU9, C259800zU<String> c259800zU10, C043B<ViewModel> c043b, C259800zU<String> c259800zU11, C259800zU<String> c259800zU12, String str) {
        super(1);
        this.LL = c259800zU;
        this.LLILLJJLI = c259800zU2;
        this.LLILLL = c259800zU3;
        this.LLILZ = c259800zU4;
        this.LLILZIL = c259800zU5;
        this.LLILZLL = c259800zU6;
        this.LLIZ = c259800zU7;
        this.LLIZLLLIL = c259800zU8;
        this.LLJ = c259800zU9;
        this.LLJI = c259800zU10;
        this.LLJIJIL = c043b;
        this.LLJILJIL = c259800zU11;
        this.LLJILJILJ = c259800zU12;
        this.LLJILLL = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final SkuState invoke(SkuState skuState) {
        String[] strArr;
        Integer num;
        SkuState skuState2 = skuState;
        String str = this.LL.element;
        String str2 = this.LLILLJJLI.element;
        String str3 = this.LLILLL.element;
        if (str3 == null) {
            str3 = "";
        }
        SpannableStringBuilder spannableStringBuilder = this.LLILZ.element;
        C041I c041i = this.LLILZIL.element;
        String str4 = this.LLILZLL.element;
        AddToCartButton addToCartButton = this.LLIZ.element;
        PreOrderInfo preOrderInfo = this.LLIZLLLIL.element;
        C10366043o c10366043o = new C10366043o(this.LLJ.element, this.LLJI.element);
        PdpBottomAreaElem pdpBottomAreaElemGt2 = this.LLJIJIL.Gt2();
        SkuPanelState skuPanelStateDw = this.LLJIJIL.dw();
        if (skuPanelStateDw == null || (strArr = skuPanelStateDw.checkedSkuIds) == null) {
            strArr = new String[0];
        }
        List<String> listLJJLL = C13LQ.LJJLL(strArr);
        String str5 = this.LLJILJIL.element;
        SkuPanelState skuPanelStateDw2 = this.LLJIJIL.dw();
        if (skuPanelStateDw2 != null) {
            num = skuPanelStateDw2.purchaseMethod;
        } else {
            num = null;
        }
        return skuState2.copy(listLJJLL, skuState2.showToast, skuState2.currentImage, preOrderInfo, str3, spannableStringBuilder, skuState2.quantityNoticeInfos, skuState2.promotionView, str, c041i, str2, skuState2.taxDescription, this.LLJILJILJ.element, str4, skuState2.currentQuantityLimit, skuState2.currentQuantity, skuState2.contentList, skuState2.keyBoardVisibility, skuState2.skuPanelCloseEvent, skuState2.skuDataState, addToCartButton, skuState2.showLoadingView, skuState2.showLoadingSpinner, c10366043o, skuState2.forceRefresh, skuState2.originalProductPackStruct, skuState2.protectionProgramText, skuState2.productTitle, skuState2.promotionLabelVO, skuState2.productSellerInfo, skuState2.skuPanelReminder, skuState2.isPriceHidden, skuState2.isQuantityEditable, skuState2.scrollOffset, skuState2.scrollOrientation, pdpBottomAreaElemGt2, skuState2.bizEnvChange, skuState2.focusSpecAction, skuState2.allSkuSelected, skuState2.totalPrice, skuState2.couponEvent, skuState2.carouselImages, skuState2.carouselNeedToScrollToFirst, str5, skuState2.exceptionUX, num, skuState2.selectedPeriodText, this.LLJILLL, skuState2.extraInfoData, skuState2.paymentInfo, skuState2.summaryInfo, skuState2.refreshFlag, skuState2.hidePaymentMethodView, skuState2.promotionWaist);
    }
}
