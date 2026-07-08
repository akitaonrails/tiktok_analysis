package X;

import android.content.Context;
import android.view.View;
import com.ss.android.ugc.aweme.commercialize.quickconversion.api.shopify.model.ShopifySkuCheckoutProductDetailData;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import java.io.Serializable;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.14CQ, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C14CQ implements Serializable {
    public final transient AwemeRawAd awemeRawAd;
    public final String cacheKey;
    public final transient Context context;
    public final String from;
    public final EnumC1783180wVI fromType;
    public final Boolean isLightTheme;
    public final transient Function2<String, View, Unit> onCheckout;
    public final transient Function1<String, Unit> onCheckoutUrlGenerate;
    public final transient Function1<View, Unit> onCloseIconClickAction;
    public final transient Function0<Unit> onDialogCloseAction;
    public final transient Function0<Unit> onFallBackAction;
    public final String pdpUrl;
    public final ShopifySkuCheckoutProductDetailData productDetailData;
    public final String productId;

    public final Boolean isLightTheme() {
        return this.isLightTheme;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C14CQ(Context context, String str, String str2, String str3, EnumC1783180wVI enumC1783180wVI, Boolean bool, String str4, ShopifySkuCheckoutProductDetailData shopifySkuCheckoutProductDetailData, AwemeRawAd awemeRawAd, Function2<? super String, ? super View, Unit> function2, Function1<? super View, Unit> function1, Function0<Unit> function0, Function1<? super String, Unit> function12, Function0<Unit> function02) {
        this.context = context;
        this.cacheKey = str;
        this.pdpUrl = str2;
        this.from = str3;
        this.fromType = enumC1783180wVI;
        this.isLightTheme = bool;
        this.productId = str4;
        this.productDetailData = shopifySkuCheckoutProductDetailData;
        this.awemeRawAd = awemeRawAd;
        this.onCheckout = function2;
        this.onCloseIconClickAction = function1;
        this.onDialogCloseAction = function0;
        this.onCheckoutUrlGenerate = function12;
        this.onFallBackAction = function02;
    }
}
