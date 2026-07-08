package X;

import androidx.lifecycle.ViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.SkuPanelState;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.AddToCartButton;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.PreOrderInfo;
import com.ss.android.ugc.aweme.ecommerce.base.sku.sea.vm.SkuState;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.045g, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C10410045g extends C09AY implements Function1<SkuState, SkuState> {
    public final /* synthetic */ C259800zU<String> LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ C259800zU<String> LLILLL;
    public final /* synthetic */ C259800zU<String> LLILZ;
    public final /* synthetic */ C259800zU<Boolean> LLILZIL;
    public final /* synthetic */ C259800zU<String> LLILZLL;
    public final /* synthetic */ C259800zU<String> LLIZ;
    public final /* synthetic */ C259800zU<AddToCartButton> LLIZLLLIL;
    public final /* synthetic */ C259800zU<PreOrderInfo> LLJ;
    public final /* synthetic */ C259800zU<EnumC10360043i> LLJI;
    public final /* synthetic */ C259800zU<String> LLJIJIL;
    public final /* synthetic */ C044Z<ViewModel> LLJILJIL;
    public final /* synthetic */ String LLJILJILJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10410045g(C259800zU<String> c259800zU, String str, C259800zU<String> c259800zU2, C259800zU<String> c259800zU3, C259800zU<Boolean> c259800zU4, C259800zU<String> c259800zU5, C259800zU<String> c259800zU6, C259800zU<AddToCartButton> c259800zU7, C259800zU<PreOrderInfo> c259800zU8, C259800zU<EnumC10360043i> c259800zU9, C259800zU<String> c259800zU10, C044Z<ViewModel> c044z, String str2) {
        super(1);
        this.LL = c259800zU;
        this.LLILLJJLI = str;
        this.LLILLL = c259800zU2;
        this.LLILZ = c259800zU3;
        this.LLILZIL = c259800zU4;
        this.LLILZLL = c259800zU5;
        this.LLIZ = c259800zU6;
        this.LLIZLLLIL = c259800zU7;
        this.LLJ = c259800zU8;
        this.LLJI = c259800zU9;
        this.LLJIJIL = c259800zU10;
        this.LLJILJIL = c044z;
        this.LLJILJILJ = str2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final SkuState invoke(SkuState skuState) {
        String[] strArr;
        SkuState skuState2 = skuState;
        String str = this.LL.element;
        String str2 = this.LLILLJJLI;
        String str3 = this.LLILLL.element;
        if (str3 == null) {
            str3 = "";
        }
        C953503o5 c953503o5 = new C953503o5(str, str2, str3, this.LLILZ.element, Intrinsics.LJFF(this.LLILZIL.element, Boolean.TRUE), this.LLILZLL.element);
        String str4 = this.LLIZ.element;
        AddToCartButton addToCartButton = this.LLIZLLLIL.element;
        PreOrderInfo preOrderInfo = this.LLJ.element;
        C10366043o c10366043o = new C10366043o(this.LLJI.element, this.LLJIJIL.element);
        SkuPanelState skuPanelStateDw = this.LLJILJIL.dw();
        if (skuPanelStateDw == null || (strArr = skuPanelStateDw.checkedSkuIds) == null) {
            strArr = new String[0];
        }
        return skuState2.copy(C13LQ.LJJLL(strArr), skuState2.showToast, skuState2.currentImage, skuState2.buyButton, skuState2.buyButtonInterestId, skuState2.buttonDynamicData, preOrderInfo, c953503o5, str4, skuState2.purchaseNotice, skuState2.promotionDealVO, this.LLJILJILJ, skuState2.currentQuantityLimit, skuState2.currentQuantity, skuState2.currentImagePosition, skuState2.currentInstallmentPlan, skuState2.keyBoardVisibility, skuState2.skuFragmentClosed, skuState2.skuDataState, addToCartButton, skuState2.paymentModule, skuState2.showLoadingView, c10366043o, skuState2.forceRefresh, skuState2.originalProductPackStruct, skuState2.localSizeSalePropList, skuState2.isQuantityEditable, skuState2.slideToBnpl, skuState2.exceptionUX, skuState2.counterDescription, skuState2.topOutsideWidgetVisibleHeight, skuState2.cutPriceSkuPanel, skuState2.skuPanelWaistBanner, skuState2.skuPanelSellingPoints, skuState2.skuHeaderTopLabels);
    }
}
