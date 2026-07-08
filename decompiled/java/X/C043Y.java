package X;

import android.view.View;
import com.ss.android.ugc.aweme.ecommerce.service.cartservice.AddToCartRequestParam;
import com.ss.android.ugc.aweme.ecommerce.service.cartservice.AddToCartUiConfig;
import com.ss.android.ugc.aweme.ecommerce.service.cartservice.SkuPanelParam;

/* JADX INFO: renamed from: X.043Y, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C043Y {
    public final AddToCartRequestParam LIZ;
    public final C10355043d LIZIZ;
    public final boolean LIZJ;
    public final SkuPanelParam LIZLLL;
    public final AddToCartUiConfig LJ;
    public final View LJFF;

    public /* synthetic */ C043Y(AddToCartRequestParam addToCartRequestParam, C10355043d c10355043d, boolean z, SkuPanelParam skuPanelParam, AddToCartUiConfig addToCartUiConfig) {
        this(addToCartRequestParam, c10355043d, z, skuPanelParam, addToCartUiConfig, null);
    }

    public C043Y(AddToCartRequestParam addToCartRequestParam, C10355043d c10355043d, boolean z, SkuPanelParam skuPanelParam, AddToCartUiConfig addToCartUiConfig, View view) {
        this.LIZ = addToCartRequestParam;
        this.LIZIZ = c10355043d;
        this.LIZJ = z;
        this.LIZLLL = skuPanelParam;
        this.LJ = addToCartUiConfig;
        this.LJFF = view;
    }
}
