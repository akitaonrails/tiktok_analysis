package X;

import android.view.View;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuItem;
import com.ss.android.ugc.aweme.ecommerce.base.sku.sea.vm.SeaSkuPanelViewModel;
import kotlin.jvm.internal.AwS210S0300000_1;
import kotlin.text.u;

/* JADX INFO: renamed from: X.045w, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC10426045w {
    public final View LIZ;
    public final AnonymousClass0463 LIZIZ;

    public abstract int LIZ();

    public final void LIZIZ(String str) {
        Integer num;
        Integer num2;
        if (str == null) {
            return;
        }
        C259800zU c259800zU = new C259800zU();
        c259800zU.element = "";
        C118300cf c118300cf = new C118300cf();
        int iLIZ = LIZ();
        if (iLIZ != 1) {
            if (iLIZ == 2) {
                c259800zU.element = "discount_quantity_limitation";
                SkuItem skuItemLLZILL = this.LIZIZ.LLZILL();
                if (skuItemLLZILL != null && (num2 = skuItemLLZILL.promotionLimitQuantity) != null) {
                    c118300cf.element = num2.intValue();
                }
            }
        } else {
            c259800zU.element = "min_quantity_limitation";
            SkuItem skuItemLLZILL2 = this.LIZIZ.LLZILL();
            if (skuItemLLZILL2 != null && (num = skuItemLLZILL2.minBuyQuantity) != null) {
                c118300cf.element = num.intValue();
            }
        }
        C1389880mGw c1389880mGw = new C1389880mGw(this.LIZ);
        c1389880mGw.LJIIIZ(str);
        c1389880mGw.LJIIJ();
        C1018703yb.LIZLLL("tiktokec_toast_show", new AwS210S0300000_1(this, (AbstractC10426045w) c259800zU, (C259800zU<String>) c118300cf, (C118300cf) 64));
    }

    public AbstractC10426045w(View view, SeaSkuPanelViewModel seaSkuPanelViewModel) {
        this.LIZ = view;
        this.LIZIZ = seaSkuPanelViewModel;
    }

    public static String LIZJ(int i, String str) {
        return u.LJJIFFI(str, "{$quantity}", String.valueOf(i), false);
    }
}
