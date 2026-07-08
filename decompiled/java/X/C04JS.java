package X;

import android.content.DialogInterface;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.ecommerce.base.address.list.AddressListPanelAssemFragment;
import com.ss.android.ugc.aweme.ecommerce.base.bundlepanel.BundlePanelFragment;
import com.ss.android.ugc.aweme.ecommerce.base.bundlepanel.BundlePanelVM;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.container.PaymentCheckoutFragment;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductBase;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPriceV2;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SinglePriceItem;
import com.ss.android.ugc.aweme.ecommerce.base.sku.sea.vm.SeaSkuPanelViewModel;
import com.ss.android.ugc.aweme.ecommerce.service.IEventCenter;
import com.ss.android.ugc.aweme.ecommerce.service.cartservice.model.AddToCartData;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.04JS, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public class C04JS implements DialogInterface.OnDismissListener {
    public final int $t;
    public Object l0;

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.$t) {
            case 0:
                onDismiss$0(this, dialogInterface);
                break;
            case 1:
                onDismiss$1(this, dialogInterface);
                break;
            case 2:
                onDismiss$2(this, dialogInterface);
                break;
            case 3:
                onDismiss$3(this, dialogInterface);
                break;
            case 4:
                onDismiss$4(this, dialogInterface);
                break;
            case 5:
                onDismiss$5(this, dialogInterface);
                break;
        }
    }

    public C04JS(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void onDismiss$0(C04JS c04js, DialogInterface dialogInterface) {
        T t = ((C259800zU) c04js.l0).element;
        if (t instanceof AddressListPanelAssemFragment) {
            ((AddressListPanelAssemFragment) t).onBackPressed();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void onDismiss$1(C04JS c04js, DialogInterface dialogInterface) {
        T t = ((C259800zU) c04js.l0).element;
        if (t instanceof AddressListPanelAssemFragment) {
            ((AddressListPanelAssemFragment) t).onBackPressed();
        }
    }

    public static final void onDismiss$2(C04JS c04js, DialogInterface dialogInterface) {
        boolean z;
        String str;
        String str2;
        ProductBase productBase;
        List<ProductPriceV2> list;
        ProductPriceV2 productPriceV2;
        SinglePriceItem singlePriceItem;
        ProductBase productBase2;
        List<ProductPriceV2> list2;
        ProductPriceV2 productPriceV22;
        SinglePriceItem singlePriceItem2;
        ProductBase productBase3;
        List<ProductPriceV2> list3;
        ProductPriceV2 productPriceV23;
        SinglePriceItem singlePriceItem3;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("product_id", ((BundlePanelFragment) c04js.l0).VR().LLILLJJLI);
        linkedHashMap.put("sku_descriptor", ((BundlePanelFragment) c04js.l0).VR().LLILZLL);
        BundlePanelFragment.EnterParams enterParams = ((BundlePanelFragment) c04js.l0).VR().LLILLL;
        if (enterParams != null) {
            linkedHashMap.put("close_type", Integer.valueOf(enterParams.clickFrom));
        }
        if (Intrinsics.LJFF(((BundlePanelFragment) c04js.l0).VR().LLJI, "close")) {
            linkedHashMap.put("close_type", 0);
        }
        AddToCartData addToCartData = ((BundlePanelFragment) c04js.l0).VR().LLJIJIL;
        if (addToCartData != null) {
            linkedHashMap.put("add_cart_data", addToCartData);
        }
        IEventCenter iEventCenter = (IEventCenter) PluggableExtentionKt.pluggableSpi$default(IEventCenter.class, false, false, false, 14, null);
        if (iEventCenter != null) {
            iEventCenter.LIZ("ec_bundle_selection_panel_close", C1741890vQh.LJIIIIZZ(linkedHashMap));
        }
        String str3 = TuxSheet._pnsPageId;
        C1391190mJ3.LJFF((BundlePanelFragment) c04js.l0, C343970De7.LIZ);
        BundlePanelVM bundlePanelVMVR = ((BundlePanelFragment) c04js.l0).VR();
        String str4 = ((BundlePanelFragment) c04js.l0).VR().LLJI;
        String skuId = ((BundlePanelFragment) c04js.l0).VR().LLILZLL.getSkuId();
        if (skuId != null && skuId.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        C1019303yh c1019303yh = bundlePanelVMVR.LL;
        c1019303yh.getClass();
        Map<String, Object> mapLJ = c1019303yh.LJ("a2270.b80913");
        C1019503yj c1019503yj = bundlePanelVMVR.LLJ;
        ProductPackStruct productInfoPack = bundlePanelVMVR.LLILZIL.getProductInfoPack();
        String str5 = null;
        if (productInfoPack != null && (productBase3 = productInfoPack.baseInfo) != null && (list3 = productBase3.priceInfoV2) != null && (productPriceV23 = (ProductPriceV2) ListProtector.get(list3, 0)) != null && (singlePriceItem3 = productPriceV23.minPrice) != null) {
            str = singlePriceItem3.salePriceFormat;
        } else {
            str = null;
        }
        ProductPackStruct productInfoPack2 = bundlePanelVMVR.LLILZIL.getProductInfoPack();
        if (productInfoPack2 != null && (productBase2 = productInfoPack2.baseInfo) != null && (list2 = productBase2.priceInfoV2) != null && (productPriceV22 = (ProductPriceV2) ListProtector.get(list2, 0)) != null && (singlePriceItem2 = productPriceV22.minPrice) != null) {
            str2 = singlePriceItem2.originPriceFormat;
        } else {
            str2 = null;
        }
        ProductPackStruct productInfoPack3 = bundlePanelVMVR.LLILZIL.getProductInfoPack();
        if (productInfoPack3 != null && (productBase = productInfoPack3.baseInfo) != null && (list = productBase.priceInfoV2) != null && (productPriceV2 = (ProductPriceV2) ListProtector.get(list, 0)) != null && (singlePriceItem = productPriceV2.minPrice) != null) {
            str5 = singlePriceItem.discountFormat;
        }
        c1019503yj.getClass();
        C1018703yb.LJII("tiktokec_stay_page", new C1011503xR(c1019503yj, str, str2, str5, str4, z, mapLJ));
    }

    public static final void onDismiss$3(C04JS c04js, DialogInterface dialogInterface) {
        ((Function1) c04js.l0).invoke(EnumC884003cs.CLICK_CLOSE);
    }

    public static final void onDismiss$4(C04JS c04js, DialogInterface dialogInterface) {
        ((PaymentCheckoutFragment) c04js.l0).UR();
    }

    public static final void onDismiss$5(C04JS c04js, DialogInterface dialogInterface) {
        ((SeaSkuPanelViewModel) c04js.l0).LLLI = false;
    }
}
