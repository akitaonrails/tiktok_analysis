package X;

import android.view.View;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS268S0000000_26;

/* JADX INFO: renamed from: X.0vdx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.module.desc.views.SeaProductDescTextView$bindData$6", f = "SeaProductDescTextView.kt", l = {}, m = "invokeSuspend")
public final class C1750110vdx extends C09AX implements InterfaceC1631620sYq<InterfaceC497601wk, View, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ InterfaceC1750090vdv LL;
    public final /* synthetic */ C297101Dd LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1750110vdx(InterfaceC1750090vdv interfaceC1750090vdv, C297101Dd c297101Dd, InterfaceC1364105Vn<? super C1750110vdx> interfaceC1364105Vn) {
        super(3, interfaceC1364105Vn);
        this.LL = interfaceC1750090vdv;
        this.LLILLJJLI = c297101Dd;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SeaProductDescTextView@2d46.bindData$6");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.LJJLIIIJILLIZJL();
        C1748720vbi.LIZLLL(this.LLILLJJLI.LL.findViewById(R.id.view_more), new C10516049i(), AFwS268S0000000_26.get$arr$(694));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SeaProductDescTextView@2d46.bindData$6");
        return unit;
    }

    @Override // X.InterfaceC1631620sYq
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, View view, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C1750110vdx(this.LL, this.LLILLJJLI, interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
