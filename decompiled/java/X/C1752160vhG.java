package X;

import android.view.View;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS268S0000000_26;

/* JADX INFO: renamed from: X.0vhG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.desc.views.ProductDescTextView$bindData$7", f = "ProductDescTextView.kt", l = {}, m = "invokeSuspend")
public final class C1752160vhG extends C09AX implements InterfaceC1631620sYq<InterfaceC497601wk, View, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ InterfaceC1752190vhJ LL;
    public final /* synthetic */ C1752150vhF LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1752160vhG(InterfaceC1752190vhJ interfaceC1752190vhJ, C1752150vhF c1752150vhF, InterfaceC1364105Vn<? super C1752160vhG> interfaceC1364105Vn) {
        super(3, interfaceC1364105Vn);
        this.LL = interfaceC1752190vhJ;
        this.LLILLJJLI = c1752150vhF;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ProductDescTextView@e2a9.bindData$7");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.LJJLIIIJILLIZJL();
        C1748720vbi.LIZLLL(this.LLILLJJLI.LL.findViewById(R.id.view_more), new C10516049i(), AFwS268S0000000_26.get$arr$(240));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ProductDescTextView@e2a9.bindData$7");
        return unit;
    }

    @Override // X.InterfaceC1631620sYq
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, View view, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C1752160vhG(this.LL, this.LLILLJJLI, interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
