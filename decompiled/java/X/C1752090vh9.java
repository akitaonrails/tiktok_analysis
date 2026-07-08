package X;

import android.view.View;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.desc.ProductDescVideoViewHolder;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.vm.PdpViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS268S0000000_26;
import kotlin.jvm.internal.AwS605S0100000_26;

/* JADX INFO: renamed from: X.0vh9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.desc.ProductDescVideoViewHolder$onBind$4", f = "ProductDescVideoViewHolder.kt", l = {}, m = "invokeSuspend")
public final class C1752090vh9 extends C09AX implements InterfaceC1631620sYq<InterfaceC497601wk, View, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ ProductDescVideoViewHolder LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1752090vh9(ProductDescVideoViewHolder productDescVideoViewHolder, InterfaceC1364105Vn<? super C1752090vh9> interfaceC1364105Vn) {
        super(3, interfaceC1364105Vn);
        this.LL = productDescVideoViewHolder;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ProductDescVideoViewHolder@494b.onBind$4");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        PdpViewModel pdpViewModelD6 = this.LL.d6();
        pdpViewModelD6.LLZ = true;
        pdpViewModelD6.setState(new AwS605S0100000_26(pdpViewModelD6, 917));
        C1748720vbi.LIZLLL(this.LL.itemView.findViewById(R.id.view_more), new C10516049i(), AFwS268S0000000_26.get$arr$(235));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ProductDescVideoViewHolder@494b.onBind$4");
        return unit;
    }

    @Override // X.InterfaceC1631620sYq
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, View view, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C1752090vh9(this.LL, interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
