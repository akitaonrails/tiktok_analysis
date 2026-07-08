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
import com.ss.android.ugc.aweme.ecommerce.base.pdp.starter.IPdpStarter;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuItem;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuPrice;
import com.ss.android.ugc.aweme.ecommercebase.pagesource.PageSourceInfo;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS16S1210000_26;
import kotlin.jvm.internal.AwS39S1110000_26;
import kotlin.jvm.internal.AwS43S0310000_26;
import njp.a;

/* JADX INFO: renamed from: X.0vei, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.favorites.PdpSaveProductMgr$favoriteProduct$1", f = "PdpSaveProductMgr.kt", l = {95, 102}, m = "invokeSuspend")
public final class C1750580vei extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LL;
    public int LLILLJJLI;
    public final /* synthetic */ View LLILLL;
    public final /* synthetic */ C1750810vf5 LLILZ;
    public final /* synthetic */ boolean LLILZIL;
    public final /* synthetic */ Map<String, Object> LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1750580vei(View view, C1750810vf5 c1750810vf5, boolean z, Map<String, ? extends Object> map, InterfaceC1364105Vn<? super C1750580vei> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = view;
        this.LLILZ = c1750810vf5;
        this.LLILZIL = z;
        this.LLILZLL = map;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1750580vei(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String str;
        ArrayList arrayList;
        String str2;
        boolean z;
        String string;
        SellerInfo sellerInfo;
        Map<String, Object> map;
        String strLJIIIIZZ;
        List<SkuItem> list;
        String priceVal;
        String currency;
        Price price;
        Price price2;
        boolean z2;
        Response response;
        boolean z3;
        Object objLIZIZ = obj;
        C1C7U.LIZ("PdpSaveProductMgr@bdf2.favoriteProduct$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    str = (String) this.LL;
                    C155000ia.LIZIZ(objLIZIZ);
                    response = (Response) objLIZIZ;
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                str = (String) this.LL;
                C155000ia.LIZIZ(objLIZIZ);
                response = (Response) objLIZIZ;
            }
        } else {
            C155000ia.LIZIZ(objLIZIZ);
            C1750520vec c1750520vec = C1750520vec.LIZ;
            synchronized (c1750520vec) {
                if (!c1750520vec.LIZ()) {
                    C1257480ipO.LIZ.storeInt("ecom_ever_favorite_product", 1);
                }
            }
            if (c1750520vec.LIZIZ()) {
                str = "bubble";
            } else {
                str = "toast";
            }
            C1748720vbi.LIZLLL(this.LLILLL, new C04AC(), new AwS39S1110000_26(str, this.LLILZLL, this.LLILZIL, 5));
            ProductPackStruct productPackStruct = this.LLILZ.LIZ.LLJILLL;
            if (productPackStruct != null && (list = productPackStruct.skus) != null) {
                ArrayList<SkuItem> arrayList2 = new ArrayList();
                for (SkuItem skuItem : list) {
                    if (skuItem.price != null) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z2) {
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
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            IPdpStarter.PdpEnterParam pdpEnterParam = this.LLILZ.LIZ.LLJI;
            if (pdpEnterParam != null && (map = pdpEnterParam.trackParams) != null) {
                Object obj2 = map.get("entrance_info");
                if (obj2 != null) {
                    linkedHashMap.put("entrance_info", obj2);
                }
                Object obj3 = map.get("author_id");
                if (obj3 != null) {
                    linkedHashMap.put("kol_id", obj3);
                }
                PageSourceInfo pageSourceInfoLJ = C1766860w4y.LJ(C1766860w4y.LIZ, null, 3);
                if (pageSourceInfoLJ != null && (strLJIIIIZZ = C1741890vQh.LJIIIIZZ(pageSourceInfoLJ)) != null) {
                    linkedHashMap.put("page_source_info", strLJIIIIZZ);
                }
            }
            String strDR2 = this.LLILZ.LIZ.DR2();
            if (strDR2 != null) {
                linkedHashMap.put("chain_key", strDR2);
            }
            if (this.LLILZIL) {
                C1750630ven c1750630ven = FavoriteApi.LIZ;
                String productId = this.LLILZ.LIZ.getProductId();
                ProductPackStruct productPackStruct2 = this.LLILZ.LIZ.LLJILLL;
                if (productPackStruct2 != null && (sellerInfo = productPackStruct2.sellerInfo) != null) {
                    str2 = sellerInfo.name;
                } else {
                    str2 = null;
                }
                if (arrayList != null && !arrayList.isEmpty()) {
                    z = false;
                } else {
                    z = true;
                }
                if (z) {
                    arrayList = null;
                }
                FavoriteInfo favoriteInfo = new FavoriteInfo(productId, 2, str2, arrayList, CardStruct.IStatusCode.DEFAULT, linkedHashMap);
                Integer numAR2 = this.LLILZ.LIZ.AR2();
                if (numAR2 != null) {
                    string = numAR2.toString();
                } else {
                    string = null;
                }
                Integer numLJ = C2286608xc.LJ(1);
                this.LL = str;
                this.LLILLJJLI = 1;
                objLIZIZ = c1750630ven.LIZ(favoriteInfo, string, numLJ, this);
                if (objLIZIZ == objLJFF) {
                    C1C7U.LIZIZ("PdpSaveProductMgr@bdf2.favoriteProduct$1");
                    return objLJFF;
                }
                response = (Response) objLIZIZ;
            } else {
                C1750630ven c1750630ven2 = FavoriteApi.LIZ;
                String productId2 = this.LLILZ.LIZ.getProductId();
                this.LL = str;
                this.LLILLJJLI = 2;
                c1750630ven2.getClass();
                objLIZIZ = c1750630ven2.LIZIZ(new FavoriteInfo(productId2, 2, null, null, CardStruct.IStatusCode.DEFAULT, null), this);
                if (objLIZIZ == objLJFF) {
                    C1C7U.LIZIZ("PdpSaveProductMgr@bdf2.favoriteProduct$1");
                    return objLJFF;
                }
                response = (Response) objLIZIZ;
            }
        }
        C1748720vbi.LIZLLL(this.LLILLL, new C04AB(), new AwS16S1210000_26(this.LLILZIL, (boolean) response, (Response<n>) str, (String) this.LLILZLL, (Map<String, ? extends Object>) 2));
        if (response != null && response.isCodeOK()) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3) {
            C1750810vf5 c1750810vf5 = this.LLILZ;
            C23250099c.LIZLLL(ViewModelKt.getViewModelScope(c1750810vf5.LIZ), C0PEM.LIZJ, null, new C04G2(c1750810vf5, this.LLILZIL, null), 2);
        }
        AwS43S0310000_26 awS43S0310000_26 = new AwS43S0310000_26(this.LLILZ, (C1750810vf5) this.LLILLL, (View) response, (Response<n>) this.LLILZIL, true);
        InterfaceC497601wk viewModelScope = ViewModelKt.getViewModelScope(this.LLILZ.LIZ);
        C1DFH c1dfh = C0PEM.LIZ;
        C23250099c.LIZLLL(viewModelScope, C2107308Nj.LIZ, null, new C1750600vek(awS43S0310000_26), 2);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PdpSaveProductMgr@bdf2.favoriteProduct$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
