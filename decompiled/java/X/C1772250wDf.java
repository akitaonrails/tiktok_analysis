package X;

import android.content.Context;
import com.ss.android.ugc.aweme.ecommerce.mall.ShopBottomTabProtocol;
import com.ss.android.ugc.aweme.ecommerce.mixmall.settings.ECMixMallBlockRunnableOptModel;
import com.ss.android.ugc.aweme.ecommerce.mixmall.settings.ECMixMallJatoConfigModel;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0wDf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1772250wDf extends C09AY implements Function0<C1767880w6c> {
    public final /* synthetic */ ShopBottomTabProtocol LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1772250wDf(ShopBottomTabProtocol shopBottomTabProtocol) {
        super(0);
        this.LL = shopBottomTabProtocol;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [X.0w6c] */
    @Override // kotlin.jvm.functions.Function0
    public final C1767880w6c invoke() {
        C0VWW.LJI("ec_mix_mall_open");
        C2184271Ae9.LIZ.getClass();
        if (((ECMixMallBlockRunnableOptModel) C2184271Ae9.LIZJ.getValue()).enable) {
            C1BCA.LIZ((C2184901AfA) C2184271Ae9.LIZLLL.getValue());
        }
        C1772310wDl.LIZ.getClass();
        C2183971Adf.LIZIZ((ECMixMallJatoConfigModel) C1772310wDl.LIZJ.getValue());
        C1772750wET c1772750wETLJIJI = C1770900wBU.LIZ.LJIJI();
        if (c1772750wETLJIJI != null) {
            c1772750wETLJIJI.LIZLLL = System.currentTimeMillis();
        }
        Context context = this.LL.LLILLL;
        C19EG c19egLIZIZ = context != null ? C1388190mED.LIZIZ(context) : null;
        this.LL.getClass();
        C1768430w7V.LIZIZ(c19egLIZIZ, null, this.LL.LLJ, EnumC1771290wC7.TAB_CLICK);
        final Context context2 = this.LL.LLILLL;
        if (context2 != null) {
            final String str = this.LL.LLJ;
            return new AbstractC1767850w6Z(context2, str) { // from class: X.0w6c
                @Override // X.AbstractC1767850w6Z
                public final boolean LIZ() {
                    return Intrinsics.LJFF("SHOP_MALL", C343710Ddh.LIZ(this.LIZJ).CQ2());
                }
            };
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }
}
