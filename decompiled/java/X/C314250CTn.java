package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0CTn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.bytedance.android.livesdk.impl.revenue.goodybag.presenter.GoodyBagPresenter$anchorOpenWinnerPage$1$1", f = "GoodyBagPresenter.kt", l = {}, m = "invokeSuspend")
public final class C314250CTn extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C1104590eqn LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C314250CTn(C1104590eqn c1104590eqn, InterfaceC1364105Vn<? super C314250CTn> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1104590eqn;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C314250CTn(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("GoodyBagPresenter@6f83.anchorOpenWinnerPage$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        InterfaceC1104610eqp interfaceC1104610eqp = this.LL.LIZIZ;
        if (interfaceC1104610eqp != null) {
            interfaceC1104610eqp.D0(null);
        }
        this.LL.LJIIZILJ();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("GoodyBagPresenter@6f83.anchorOpenWinnerPage$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
