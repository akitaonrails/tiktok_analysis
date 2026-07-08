package X;

import android.view.View;
import android.widget.FrameLayout;
import com.ss.android.ugc.aweme.ecommerce.base.sku.powercells.productdescription.SkuProductVideoCell;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS261S0000000_22;

/* JADX INFO: renamed from: X.0n6c, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.sku.powercells.productdescription.SkuProductVideoCell$onBindItemView$4", f = "SkuProductVideoCell.kt", l = {}, m = "invokeSuspend")
public final class C1421920n6c extends C09AX implements InterfaceC1631620sYq<InterfaceC497601wk, View, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ SkuProductVideoCell LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1421920n6c(SkuProductVideoCell skuProductVideoCell, InterfaceC1364105Vn<? super C1421920n6c> interfaceC1364105Vn) {
        super(3, interfaceC1364105Vn);
        this.LL = skuProductVideoCell;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SkuProductVideoCell@3ad6.onBindItemView$4");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        FrameLayout frameLayout = this.LL.LLIZLLLIL;
        if (frameLayout != null) {
            C1748720vbi.LIZLLL(frameLayout, new C10516049i(), AFwS261S0000000_22.get$arr$(252));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SkuProductVideoCell@3ad6.onBindItemView$4");
        return unit;
    }

    @Override // X.InterfaceC1631620sYq
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, View view, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C1421920n6c(this.LL, interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
