package X;

import android.view.View;
import android.view.accessibility.AccessibilityManager;
import androidx.compose.ui.platform.z;
import com.ss.android.ugc.aweme.commercialize.quickconversion.api.shopify.model.ShopifySkuCheckoutProductDetailData;
import com.ss.android.ugc.aweme.commercialize.quickconversion.api.shopify.model.ShopifySkuCheckoutProductOption;
import com.ss.android.ugc.aweme.commercialize.quickconversion.api.shopify.model.ShopifySkuCheckoutProductVariant;
import com.ss.android.ugc.aweme.commercialize.quickconversion.shopify.ui.sheet.ShopifySkuCheckoutBottomSheet;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.tako.ui.TakoChatFragment;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.greenrobot.eventbus.EventBus;

/* JADX INFO: renamed from: X.14d1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public class ViewOnAttachStateChangeListenerC20306914d1 implements View.OnAttachStateChangeListener {
    public final int $t;
    public Object l0;

    public static final void onViewAttachedToWindow$0(ViewOnAttachStateChangeListenerC20306914d1 viewOnAttachStateChangeListenerC20306914d1, View view) {
    }

    public static final void onViewAttachedToWindow$1(ViewOnAttachStateChangeListenerC20306914d1 viewOnAttachStateChangeListenerC20306914d1, View view) {
    }

    public static final void onViewDetachedFromWindow$6(ViewOnAttachStateChangeListenerC20306914d1 viewOnAttachStateChangeListenerC20306914d1, View view) {
    }

    public static final void onViewDetachedFromWindow$7(ViewOnAttachStateChangeListenerC20306914d1 viewOnAttachStateChangeListenerC20306914d1, View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        switch (this.$t) {
            case 0:
                onViewAttachedToWindow$0(this, view);
                break;
            case 1:
                onViewAttachedToWindow$1(this, view);
                break;
            case 2:
                onViewAttachedToWindow$2(this, view);
                break;
            case 3:
                onViewAttachedToWindow$3(this, view);
                break;
            case 4:
                onViewAttachedToWindow$4(this, view);
                break;
            case 5:
                onViewAttachedToWindow$5(this, view);
                break;
            case 6:
                onViewAttachedToWindow$6(this, view);
                break;
            case 7:
                onViewAttachedToWindow$7(this, view);
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        switch (this.$t) {
            case 0:
                onViewDetachedFromWindow$0(this, view);
                break;
            case 1:
                onViewDetachedFromWindow$1(this, view);
                break;
            case 2:
                onViewDetachedFromWindow$2(this, view);
                break;
            case 3:
                onViewDetachedFromWindow$3(this, view);
                break;
            case 4:
                onViewDetachedFromWindow$4(this, view);
                break;
            case 5:
                onViewDetachedFromWindow$5(this, view);
                break;
            case 6:
                onViewDetachedFromWindow$6(this, view);
                break;
            case 7:
                onViewDetachedFromWindow$7(this, view);
                break;
        }
    }

    public ViewOnAttachStateChangeListenerC20306914d1(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onViewAttachedToWindow$2(ViewOnAttachStateChangeListenerC20306914d1 viewOnAttachStateChangeListenerC20306914d1, View view) {
        z zVar = (z) viewOnAttachStateChangeListenerC20306914d1.l0;
        AccessibilityManager accessibilityManager = zVar.LIZLLL;
        accessibilityManager.addAccessibilityStateChangeListener(zVar.LJFF);
        accessibilityManager.addTouchExplorationStateChangeListener(zVar.LJI);
    }

    public static final void onViewAttachedToWindow$3(ViewOnAttachStateChangeListenerC20306914d1 viewOnAttachStateChangeListenerC20306914d1, View view) {
        ((C20254414Na) viewOnAttachStateChangeListenerC20306914d1.l0).LJJIJ();
    }

    public static final void onViewAttachedToWindow$4(ViewOnAttachStateChangeListenerC20306914d1 viewOnAttachStateChangeListenerC20306914d1, View view) {
        ((C20254514Nb) viewOnAttachStateChangeListenerC20306914d1.l0).LJJIJ();
    }

    public static final void onViewAttachedToWindow$5(ViewOnAttachStateChangeListenerC20306914d1 viewOnAttachStateChangeListenerC20306914d1, View view) {
        TakoChatFragment takoChatFragment = (TakoChatFragment) viewOnAttachStateChangeListenerC20306914d1.l0;
        takoChatFragment.getClass();
        if (!EventBus.LIZLLL().LJIIJ(takoChatFragment)) {
            EventBus.LIZLLL().LJIJJ(takoChatFragment);
        }
    }

    public static final void onViewAttachedToWindow$6(ViewOnAttachStateChangeListenerC20306914d1 viewOnAttachStateChangeListenerC20306914d1, View view) {
        ((View) viewOnAttachStateChangeListenerC20306914d1.l0).removeOnAttachStateChangeListener(viewOnAttachStateChangeListenerC20306914d1);
        C1858350ySX.LIZ = 1;
    }

    public static final void onViewAttachedToWindow$7(ViewOnAttachStateChangeListenerC20306914d1 viewOnAttachStateChangeListenerC20306914d1, View view) {
        ShopifySkuCheckoutProductDetailData shopifySkuCheckoutProductDetailData;
        String variantId;
        ShopifySkuCheckoutProductVariant shopifySkuCheckoutProductVariant;
        C14CQ c14cq = ((ShopifySkuCheckoutBottomSheet) viewOnAttachStateChangeListenerC20306914d1.l0).LIZIZ;
        String str = c14cq.cacheKey;
        AwemeRawAd awemeRawAd = c14cq.awemeRawAd;
        LinkedHashMap<String, Map<String, Object>> linkedHashMap = C14CR.LIZIZ;
        Map<String, Object> mapLJ = linkedHashMap.get(str);
        if (mapLJ == null) {
            mapLJ = C2097608Jq.LJ();
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(mapLJ);
        if (awemeRawAd == null) {
            linkedHashMap2.remove("awemeRawAd");
        } else {
            linkedHashMap2.put("awemeRawAd", awemeRawAd);
        }
        linkedHashMap.put(str, linkedHashMap2);
        ShopifySkuCheckoutBottomSheet shopifySkuCheckoutBottomSheet = (ShopifySkuCheckoutBottomSheet) viewOnAttachStateChangeListenerC20306914d1.l0;
        C14CR.LJ(shopifySkuCheckoutBottomSheet.LIZIZ.cacheKey, shopifySkuCheckoutBottomSheet.LIZLLL);
        ShopifySkuCheckoutBottomSheet shopifySkuCheckoutBottomSheet2 = (ShopifySkuCheckoutBottomSheet) viewOnAttachStateChangeListenerC20306914d1.l0;
        shopifySkuCheckoutBottomSheet2.getClass();
        C14CQ c14cq2 = shopifySkuCheckoutBottomSheet2.LIZIZ;
        C1022820ciu c1022820ciuLIZLLL = C2184171Adz.LIZLLL("draw_ad", "sku_checkout_page_show", c14cq2.awemeRawAd);
        c1022820ciuLIZLLL.LIZIZ(c14cq2.from, "sku_enter_from");
        c1022820ciuLIZLLL.LJII();
        ShopifySkuCheckoutBottomSheet shopifySkuCheckoutBottomSheet3 = (ShopifySkuCheckoutBottomSheet) viewOnAttachStateChangeListenerC20306914d1.l0;
        if (shopifySkuCheckoutBottomSheet3.LJII && (shopifySkuCheckoutProductDetailData = shopifySkuCheckoutBottomSheet3.LIZLLL) != null) {
            List<ShopifySkuCheckoutProductOption> list = shopifySkuCheckoutProductDetailData.options;
            ArrayList arrayList = new ArrayList();
            for (ShopifySkuCheckoutProductOption shopifySkuCheckoutProductOption : list) {
                if (C123100dR.LIZ(shopifySkuCheckoutProductOption.getName())) {
                    arrayList.add(shopifySkuCheckoutProductOption);
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                String name = ((ShopifySkuCheckoutProductOption) it2.next()).getName();
                if (name != null) {
                    C14CQ c14cq3 = shopifySkuCheckoutBottomSheet3.LIZIZ;
                    String str2 = shopifySkuCheckoutBottomSheet3.LJIIJJI;
                    ShopifySkuCheckoutProductDetailData shopifySkuCheckoutProductDetailData2 = shopifySkuCheckoutBottomSheet3.LIZLLL;
                    C1022820ciu c1022820ciuLIZLLL2 = C2184171Adz.LIZLLL("draw_ad", "sku_checkout_option_show", c14cq3.awemeRawAd);
                    c1022820ciuLIZLLL2.LIZIZ(c14cq3.from, "sku_enter_from");
                    c1022820ciuLIZLLL2.LIZIZ(str2, "product_id");
                    c1022820ciuLIZLLL2.LIZIZ(c14cq3.pdpUrl, "pdp_url");
                    String str3 = null;
                    if (shopifySkuCheckoutProductDetailData2 != null && (shopifySkuCheckoutProductVariant = shopifySkuCheckoutProductDetailData2.selectedOrFirstAvailableVariant) != null) {
                        variantId = shopifySkuCheckoutProductVariant.getVariantId();
                    } else {
                        variantId = null;
                    }
                    c1022820ciuLIZLLL2.LIZIZ(variantId, "variant_id");
                    if (shopifySkuCheckoutProductDetailData2 != null) {
                        str3 = shopifySkuCheckoutProductDetailData2.title;
                    }
                    c1022820ciuLIZLLL2.LIZIZ(str3, "product_name");
                    c1022820ciuLIZLLL2.LIZIZ(name, "option_name");
                    c1022820ciuLIZLLL2.LJII();
                }
            }
        }
        if (((ShopifySkuCheckoutBottomSheet) viewOnAttachStateChangeListenerC20306914d1.l0).LJIIIIZZ.isCancelled()) {
            ((ShopifySkuCheckoutBottomSheet) viewOnAttachStateChangeListenerC20306914d1.l0).LJIIIIZZ = C2296908zH.LIZ();
            ShopifySkuCheckoutBottomSheet shopifySkuCheckoutBottomSheet4 = (ShopifySkuCheckoutBottomSheet) viewOnAttachStateChangeListenerC20306914d1.l0;
            C1DFH c1dfh = C0PEM.LIZ;
            shopifySkuCheckoutBottomSheet4.LJIIIZ = C2296808zG.LIZ(C2107308Nj.LIZ.plus(shopifySkuCheckoutBottomSheet4.LJIIIIZZ));
        }
    }

    public static final void onViewDetachedFromWindow$0(ViewOnAttachStateChangeListenerC20306914d1 viewOnAttachStateChangeListenerC20306914d1, View view) {
        ((AbstractC20085213iM) viewOnAttachStateChangeListenerC20306914d1.l0).LIZLLL();
    }

    public static final void onViewDetachedFromWindow$1(ViewOnAttachStateChangeListenerC20306914d1 viewOnAttachStateChangeListenerC20306914d1, View view) {
        Boolean bool;
        for (Object obj : C09R4.LJ(C1464780oDk.LL, ((AbstractC20085213iM) viewOnAttachStateChangeListenerC20306914d1.l0).getParent())) {
            if (obj instanceof View) {
                Object tag = ((View) obj).getTag(R.id.l0i);
                if ((tag instanceof Boolean) && (bool = (Boolean) tag) != null && bool.booleanValue()) {
                    return;
                }
            }
        }
        ((AbstractC20085213iM) viewOnAttachStateChangeListenerC20306914d1.l0).LIZLLL();
    }

    public static final void onViewDetachedFromWindow$2(ViewOnAttachStateChangeListenerC20306914d1 viewOnAttachStateChangeListenerC20306914d1, View view) {
        z zVar = (z) viewOnAttachStateChangeListenerC20306914d1.l0;
        zVar.LJIIIIZZ.removeCallbacks(zVar.LJJIJIL);
        z zVar2 = (z) viewOnAttachStateChangeListenerC20306914d1.l0;
        AccessibilityManager accessibilityManager = zVar2.LIZLLL;
        accessibilityManager.removeAccessibilityStateChangeListener(zVar2.LJFF);
        accessibilityManager.removeTouchExplorationStateChangeListener(zVar2.LJI);
    }

    public static final void onViewDetachedFromWindow$3(ViewOnAttachStateChangeListenerC20306914d1 viewOnAttachStateChangeListenerC20306914d1, View view) {
        C1701410uNP c1701410uNP = C1701410uNP.LIZ;
        int i = ((C20254414Na) viewOnAttachStateChangeListenerC20306914d1.l0).LJIIL;
        c1701410uNP.getClass();
        C1701410uNP.LIZIZ(i);
    }

    public static final void onViewDetachedFromWindow$4(ViewOnAttachStateChangeListenerC20306914d1 viewOnAttachStateChangeListenerC20306914d1, View view) {
        C1701410uNP c1701410uNP = C1701410uNP.LIZ;
        int i = ((C20254514Nb) viewOnAttachStateChangeListenerC20306914d1.l0).LJIIL;
        c1701410uNP.getClass();
        C1701410uNP.LIZIZ(i);
    }

    public static final void onViewDetachedFromWindow$5(ViewOnAttachStateChangeListenerC20306914d1 viewOnAttachStateChangeListenerC20306914d1, View view) {
        TakoChatFragment takoChatFragment = (TakoChatFragment) viewOnAttachStateChangeListenerC20306914d1.l0;
        takoChatFragment.getClass();
        if (EventBus.LIZLLL().LJIIJ(takoChatFragment)) {
            EventBus.LIZLLL().LJJI(takoChatFragment);
        }
    }
}
