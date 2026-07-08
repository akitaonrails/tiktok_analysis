package X;

import android.view.View;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.module.desc.SeaProductDescVideoViewHolder;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.vm.SeaPdpViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS268S0000000_26;
import kotlin.jvm.internal.AwS605S0100000_26;

/* JADX INFO: renamed from: X.0vdy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.module.desc.SeaProductDescVideoViewHolder$onBind$4", f = "SeaProductDescVideoViewHolder.kt", l = {}, m = "invokeSuspend")
public final class C1750120vdy extends C09AX implements InterfaceC1631620sYq<InterfaceC497601wk, View, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ SeaProductDescVideoViewHolder LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1750120vdy(SeaProductDescVideoViewHolder seaProductDescVideoViewHolder, InterfaceC1364105Vn<? super C1750120vdy> interfaceC1364105Vn) {
        super(3, interfaceC1364105Vn);
        this.LL = seaProductDescVideoViewHolder;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SeaProductDescVideoViewHolder@5a61.onBind$4");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        SeaPdpViewModel seaPdpViewModelE6 = this.LL.e6();
        seaPdpViewModelE6.LLLZI = true;
        seaPdpViewModelE6.setState(new AwS605S0100000_26(seaPdpViewModelE6, 651));
        C1748720vbi.LIZLLL(this.LL.itemView.findViewById(R.id.view_more), new C10516049i(), AFwS268S0000000_26.get$arr$(209));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SeaProductDescVideoViewHolder@5a61.onBind$4");
        return unit;
    }

    @Override // X.InterfaceC1631620sYq
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, View view, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C1750120vdy(this.LL, interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
