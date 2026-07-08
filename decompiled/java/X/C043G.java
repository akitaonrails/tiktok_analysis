package X;

import android.view.View;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuItem;
import com.ss.android.ugc.aweme.ecommerce.base.sku.vm.SkuPanelAssemVM;
import kotlin.jvm.internal.AwS210S0300000_1;
import kotlin.text.u;

/* JADX INFO: renamed from: X.043G, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public abstract class C043G {
    public final InterfaceC10356043e LIZ;

    public abstract int LIZ();

    public C043G(SkuPanelAssemVM skuPanelAssemVM) {
        this.LIZ = skuPanelAssemVM;
    }

    public static String LIZJ(int i, String str) {
        return u.LJJIFFI(str, "{$quantity}", String.valueOf(i), false);
    }

    public final void LIZIZ(View view, String str) {
        Integer num;
        Integer num2;
        if (view == null || str == null) {
            return;
        }
        C259800zU c259800zU = new C259800zU();
        c259800zU.element = "";
        C118300cf c118300cf = new C118300cf();
        int iLIZ = LIZ();
        if (iLIZ != 1) {
            if (iLIZ == 2) {
                c259800zU.element = "discount_quantity_limitation";
                SkuItem skuItemLLZILL = this.LIZ.LLZILL();
                if (skuItemLLZILL != null && (num2 = skuItemLLZILL.promotionLimitQuantity) != null) {
                    c118300cf.element = num2.intValue();
                }
            }
        } else {
            c259800zU.element = "min_quantity_limitation";
            SkuItem skuItemLLZILL2 = this.LIZ.LLZILL();
            if (skuItemLLZILL2 != null && (num = skuItemLLZILL2.minBuyQuantity) != null) {
                c118300cf.element = num.intValue();
            }
        }
        C1389880mGw c1389880mGw = new C1389880mGw(view);
        c1389880mGw.LJIIIZ(str);
        c1389880mGw.LJIIJ();
        C1018703yb.LIZLLL("tiktokec_toast_show", new AwS210S0300000_1(this, (C043G) c259800zU, (C259800zU<String>) c118300cf, (C118300cf) 50));
    }
}
