package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.bnpl.BnplMiddleActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS605S0100000_26;
import njp.a;

/* JADX INFO: renamed from: X.0vLg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.osp.payment.bnpl.BnplMiddleActivity$routeToBnpl$1$1$2", f = "BnplMiddleActivity.kt", l = {}, m = "invokeSuspend")
public final class C1738780vLg extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ BnplMiddleActivity LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1738780vLg(BnplMiddleActivity bnplMiddleActivity, InterfaceC1364105Vn<? super C1738780vLg> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = bnplMiddleActivity;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1738780vLg(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BnplMiddleActivity@70bc.routeToBnpl$1$1$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        BnplMiddleActivity bnplMiddleActivity = this.LL;
        bnplMiddleActivity.LLLZ("jump", 2131857249, new AwS605S0100000_26(bnplMiddleActivity, 522), new AwS605S0100000_26(this.LL, 523));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("BnplMiddleActivity@70bc.routeToBnpl$1$1$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
