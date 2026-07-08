package X;

import android.view.View;
import androidx.lifecycle.ViewModelKt;
import com.google.gson.n;
import com.ss.android.ugc.aweme.ecommerce.api.model.Response;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Price;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.api.FavoriteApi;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.FavoriteInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.FavoriteSkuPrice;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SellerInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.vm.SeaPdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuItem;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuPrice;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS112S0110000_26;
import kotlin.jvm.internal.AwS43S0310000_26;
import kotlin.jvm.internal.AwS77S0210000_26;
import njp.a;

/* JADX INFO: renamed from: X.0vej, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.vm.SeaPdpViewModel$favoriteProduct$1", f = "SeaPdpViewModel.kt", l = {5258, 5264}, m = "invokeSuspend")
public final class C1750590vej extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ View LLILLJJLI;
    public final /* synthetic */ SeaPdpViewModel LLILLL;
    public final /* synthetic */ boolean LLILZ;
    public final /* synthetic */ Map<String, Object> LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1750590vej(View view, SeaPdpViewModel seaPdpViewModel, boolean z, Map<String, ? extends Object> map, InterfaceC1364105Vn<? super C1750590vej> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = view;
        this.LLILLL = seaPdpViewModel;
        this.LLILZ = z;
        this.LLILZIL = map;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1750590vej(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        ArrayList arrayList;
        String str;
        String string;
        SellerInfo sellerInfo;
        List<SkuItem> list;
        String priceVal;
        String currency;
        Price price;
        Price price2;
        Response response;
        Object objLIZIZ = obj;
        C1C7U.LIZ("SeaPdpViewModel@98e7.favoriteProduct$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        int i2 = 2;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(objLIZIZ);
                    response = (Response) objLIZIZ;
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                C155000ia.LIZIZ(objLIZIZ);
                response = (Response) objLIZIZ;
            }
        } else {
            C155000ia.LIZIZ(objLIZIZ);
            C1748720vbi.LIZLLL(this.LLILLJJLI, new C04AC(), new AwS112S0110000_26((Map) this.LLILZIL, (Map<String, ? extends Object>) this.LLILZ, true));
            ProductPackStruct productPackStruct = this.LLILLL.LLJIJIL;
            if (productPackStruct != null && (list = productPackStruct.skus) != null) {
                ArrayList<SkuItem> arrayList2 = new ArrayList();
                for (SkuItem skuItem : list) {
                    if (skuItem.price != null) {
                        arrayList2.add(skuItem);
                    }
                }
                arrayList = new ArrayList(C15438062q.LJIJJ(arrayList2, 10));
                for (SkuItem skuItem2 : arrayList2) {
                    SkuPrice skuPrice = skuItem2.price;
                    if (skuPrice != null && (price2 = skuPrice.realPrice) != null) {
                        priceVal = price2.getPriceVal();
                    } else {
                        priceVal = null;
                    }
                    SkuPrice skuPrice2 = skuItem2.price;
                    if (skuPrice2 != null && (price = skuPrice2.realPrice) != null) {
                        currency = price.getCurrency();
                    } else {
                        currency = null;
                    }
                    arrayList.add(new FavoriteSkuPrice(priceVal, currency));
                }
            } else {
                arrayList = null;
            }
            if (this.LLILZ) {
                C1750630ven c1750630ven = FavoriteApi.LIZ;
                String productId = this.LLILLL.getProductId();
                ProductPackStruct productPackStruct2 = this.LLILLL.LLJIJIL;
                if (productPackStruct2 != null && (sellerInfo = productPackStruct2.sellerInfo) != null) {
                    str = sellerInfo.name;
                } else {
                    str = null;
                }
                if (arrayList == null || arrayList.isEmpty()) {
                    arrayList = null;
                }
                FavoriteInfo favoriteInfo = new FavoriteInfo(productId, 2, str, arrayList, CardStruct.IStatusCode.DEFAULT, null);
                Integer numFR2 = this.LLILLL.FR2();
                if (numFR2 != null) {
                    string = numFR2.toString();
                } else {
                    string = null;
                }
                this.LL = 1;
                objLIZIZ = c1750630ven.LIZ(favoriteInfo, string, null, this);
                if (objLIZIZ == objLJFF) {
                    C1C7U.LIZIZ("SeaPdpViewModel@98e7.favoriteProduct$1");
                    return objLJFF;
                }
                response = (Response) objLIZIZ;
            } else {
                C1750630ven c1750630ven2 = FavoriteApi.LIZ;
                String productId2 = this.LLILLL.getProductId();
                this.LL = 2;
                c1750630ven2.getClass();
                i2 = 2;
                objLIZIZ = c1750630ven2.LIZIZ(new FavoriteInfo(productId2, 2, null, null, CardStruct.IStatusCode.DEFAULT, null), this);
                if (objLIZIZ == objLJFF) {
                    C1C7U.LIZIZ("SeaPdpViewModel@98e7.favoriteProduct$1");
                    return objLJFF;
                }
                response = (Response) objLIZIZ;
            }
        }
        C1748720vbi.LIZLLL(this.LLILLJJLI, new C04AB(), new AwS77S0210000_26(this.LLILZ, (boolean) response, (Response<n>) this.LLILZIL, (Map<String, ? extends Object>) 4));
        if (response != null && response.isCodeOK()) {
            SeaPdpViewModel seaPdpViewModel = this.LLILLL;
            C23250099c.LIZLLL(seaPdpViewModel.LLLIIL, C0PEM.LIZJ, null, new C961003pI(seaPdpViewModel, this.LLILZ, null), i2);
        }
        AwS43S0310000_26 awS43S0310000_26 = new AwS43S0310000_26(this.LLILLL, (SeaPdpViewModel) this.LLILLJJLI, (View) response, (Response<n>) this.LLILZ, true);
        InterfaceC497601wk viewModelScope = ViewModelKt.getViewModelScope(this.LLILLL);
        C1DFH c1dfh = C0PEM.LIZ;
        C23250099c.LIZLLL(viewModelScope, C2107308Nj.LIZ, null, new C1750610vel(awS43S0310000_26), i2);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SeaPdpViewModel@98e7.favoriteProduct$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
