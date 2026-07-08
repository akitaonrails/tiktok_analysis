package X;

import android.view.View;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS268S0000000_26;

/* JADX INFO: renamed from: X.0vhI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.desc.views.ProductDescImageView$bindData$4", f = "ProductDescImageView.kt", l = {}, m = "invokeSuspend")
public final class C1752180vhI extends C09AX implements InterfaceC1631620sYq<InterfaceC497601wk, View, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ InterfaceC1752190vhJ LL;
    public final /* synthetic */ C1752170vhH LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1752180vhI(InterfaceC1752190vhJ interfaceC1752190vhJ, C1752170vhH c1752170vhH, InterfaceC1364105Vn<? super C1752180vhI> interfaceC1364105Vn) {
        super(3, interfaceC1364105Vn);
        this.LL = interfaceC1752190vhJ;
        this.LLILLJJLI = c1752170vhH;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ProductDescImageView@b151.bindData$4");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.LJJLIIIJILLIZJL();
        C1748720vbi.LIZLLL(this.LLILLJJLI.LL.findViewById(R.id.view_more), new C10516049i(), AFwS268S0000000_26.get$arr$(237));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ProductDescImageView@b151.bindData$4");
        return unit;
    }

    @Override // X.InterfaceC1631620sYq
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, View view, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C1752180vhI(this.LL, this.LLILLJJLI, interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
