package X;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01mk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.osp.payment.generalpostpayment.GeneralPostPaymentAssem$handleEnableClick$1$4$1$1", f = "GeneralPostPaymentAssem.kt", l = {}, m = "invokeSuspend")
public final class C435601mk extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ View LL;
    public final /* synthetic */ String LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C435601mk(View view, String str, InterfaceC1364105Vn<? super C435601mk> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = view;
        this.LLILLJJLI = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C435601mk(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("GeneralPostPaymentAssem@9dc0.handleEnableClick$1$4$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1389890mGx c1389890mGx = new C1389890mGx(this.LL);
        c1389890mGx.LJIIJ(this.LLILLJJLI);
        c1389890mGx.LIZ(true);
        c1389890mGx.LJIIJJI();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("GeneralPostPaymentAssem@9dc0.handleEnableClick$1$4$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
