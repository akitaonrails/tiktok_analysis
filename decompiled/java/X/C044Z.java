package X;

import androidx.lifecycle.ViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BuyButton;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PdpPaymentModule;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPrice;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PromotionLabelVO;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.starter.IPdpStarter;
import com.ss.android.ugc.aweme.ecommerce.base.sku.SkuPanelStarter;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.SkuPanelState;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.AddToCartButton;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuInfo;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuItem;
import com.ss.android.ugc.aweme.ecommerce.base.sku.sea.vm.SkuState;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.044Z, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public interface C044Z<VM extends ViewModel> extends InterfaceC1164530gPT, AnonymousClass0463 {
    void A11(String str, PdpPaymentModule pdpPaymentModule);

    int Bn();

    C10385044h De0();

    ProductPackStruct Dh();

    @Override // X.AnonymousClass0463
    void Dv(Integer num, String str);

    void Ee(String str);

    void Fk(boolean z);

    void Fl(int i, C044L c044l);

    boolean Hc0();

    void I30(String str);

    void IG(BuyButton buyButton, String str, Map<String, String> map);

    AnonymousClass0431 Jt();

    void Kp(ProductPrice productPrice);

    void LJJJZ(Function1<? super SkuState, SkuState> function1);

    @Override // X.AnonymousClass0463
    SkuPanelStarter.SkuEnterParams LLIIIJ();

    @Override // X.AnonymousClass0463
    SkuInfo LLLLZ();

    @Override // X.AnonymousClass0463
    SkuItem LLZILL();

    void Ld2(PdpPaymentModule pdpPaymentModule);

    void Lp(SkuInfo skuInfo);

    void Mm(SkuPanelState skuPanelState);

    List<Image> P6();

    void Pw1(Integer num);

    void Ql(String[] strArr);

    C2252331DDr Qv();

    void RU0(PromotionLabelVO promotionLabelVO);

    Map<String, String> Te();

    List<String> Tm();

    void U9(String str);

    void Vj(AddToCartButton addToCartButton);

    Map<String, Object> Zt();

    Image bi();

    Map<String, Integer> ci();

    void dc(boolean z, String[] strArr);

    void dispose();

    SkuPanelState dw();

    C10379044b er0();

    String fd();

    String getPageName();

    String getProductId();

    C045N gp();

    int hf();

    @Override // X.AnonymousClass0463
    Integer hh();

    List<String> jp();

    void m1(ProductPackStruct productPackStruct);

    void mg(Image image);

    void ml(Function1<? super SkuState, Unit> function1);

    AddToCartButton nq();

    String[] st();

    String t9();

    IPdpStarter.PdpEnterParam uA0();

    void ua0(EnumC10382044e enumC10382044e);

    Boolean vp();

    C987903td w0();

    void wc(Boolean bool);

    void wn(int i);

    void y7(Image image);

    void y8(EnumC1756020vnU enumC1756020vnU);

    C1025303zf ye();

    int yk();
}
