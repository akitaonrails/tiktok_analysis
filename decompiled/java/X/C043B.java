package X;

import androidx.lifecycle.ViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.oneclickpay.OneClickPayContext;
import com.ss.android.ugc.aweme.ecommerce.base.osp.dto.InsuranceInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PdpBottomAreaElem;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PdpProductMeasurementModule;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPrice;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPriceV2;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SellingPointGroup;
import com.ss.android.ugc.aweme.ecommerce.base.sku.SkuPanelStarter;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.SkuPanelState;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.AddToCartButton;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.QuantityNoticeInfo;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuInfo;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuItem;
import com.ss.android.ugc.aweme.ecommerce.base.sku.vm.SkuState;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.043B, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public interface C043B<VM extends ViewModel> extends InterfaceC1164530gPT, InterfaceC10356043e, InterfaceC836103Ol {
    public static final C996403v0 LJJ = C996403v0.LIZ;

    void A22(OneClickPayContext oneClickPayContext);

    C10399044v Az2();

    void BX(boolean z);

    int Bn();

    void C01(PaymentInfo paymentInfo);

    void Cn(Function1<? super SkuState, Unit> function1);

    ProductPackStruct Dh();

    C1055604Aw Dr0();

    String EE();

    void ER1(SkuPanelStarter.SkuEnterParams skuEnterParams);

    void Ee(String str);

    void Fk(boolean z);

    void Fl(int i, C044L c044l);

    void Gr2(C987903td c987903td);

    PdpBottomAreaElem Gt2();

    AnonymousClass0431 Jt();

    void Kp(ProductPrice productPrice);

    InsuranceInfo LD1();

    void LJJJZ(Function1<? super SkuState, SkuState> function1);

    @Override // X.InterfaceC10356043e
    SkuPanelStarter.SkuEnterParams LLIIIJ();

    @Override // X.InterfaceC10356043e
    SkuInfo LLLLZ();

    @Override // X.InterfaceC10356043e
    SkuItem LLZILL();

    String LN();

    void Lp(SkuInfo skuInfo);

    void Mm(SkuPanelState skuPanelState);

    void OG(boolean z);

    void Oy();

    List<Image> P6();

    boolean Pp(Map<String, String> map);

    void Q3(C1748770vbn c1748770vbn);

    OneClickPayContext QI();

    void Ql(String[] strArr);

    C2252331DDr Qv();

    String RH2();

    void SG2(SellingPointGroup sellingPointGroup);

    void TE0(Map<Integer, QuantityNoticeInfo> map);

    Map<String, String> Te();

    List<String> Tm();

    Long Tz2();

    void U50(JSONObject jSONObject);

    void U9(String str);

    void Vj(AddToCartButton addToCartButton);

    void W6(CoroutineContext coroutineContext, Function2<? super InterfaceC497601wk, ? super InterfaceC1364105Vn<? super Unit>, ? extends Object> function2);

    C996103ux Xo1();

    void ZH2(List<ProductPriceV2> list);

    C046T Zf2();

    Map<String, Object> Zt();

    PaymentInfo aY1();

    Image bi();

    void bo0(AnonymousClass0431 anonymousClass0431);

    int bw1();

    Map<String, Integer> ci();

    void cx(PdpProductMeasurementModule pdpProductMeasurementModule);

    void dc(boolean z, String[] strArr);

    void dispose();

    SkuPanelState dw();

    String fd();

    void g12(String str, InsuranceInfo insuranceInfo);

    C10462047g getExtraInfo();

    String getSkuId();

    C045N gp();

    int hf();

    int jR1();

    List<String> jp();

    boolean kW();

    void lH2(C996103ux c996103ux, SkuItem skuItem);

    void m1(ProductPackStruct productPackStruct);

    void mg(Image image);

    @Override // X.InterfaceC836103Ol
    PaymentInfo np();

    AddToCartButton nq();

    <A> void s60(InterfaceC2217241BqE<SkuState, ? extends A> interfaceC2217241BqE, Function1<? super A, Unit> function1);

    C03QL sA0();

    String[] st();

    String t9();

    @Override // X.InterfaceC836103Ol
    void ts(PaymentInfo paymentInfo, boolean z);

    List<ProductPriceV2> v00();

    boolean v30();

    Boolean vp();

    C987903td w0();

    C044Q wE0();

    void wc(Boolean bool);

    void wn(int i);

    C043D xO1();

    void y7(Image image);

    void y8(EnumC1756020vnU enumC1756020vnU);

    C1019703yl ye();

    int yk();

    String zE0();
}
