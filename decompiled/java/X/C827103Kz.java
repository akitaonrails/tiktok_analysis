package X;

import android.content.Context;
import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS545S0100000_1;
import njp.a;

/* JADX INFO: renamed from: X.03Kz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.osp.checker.sea.SeaAddressChecker$checkWithExtraParams$1", f = "SeaAddressChecker.kt", l = {}, m = "invokeSuspend")
public final class C827103Kz extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C817903Hl LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C827103Kz(C817903Hl c817903Hl, InterfaceC1364105Vn<? super C827103Kz> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c817903Hl;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C827103Kz(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Context context;
        C1C7U.LIZ("SeaAddressChecker@2648.checkWithExtraParams$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C03JM c03jm = C03JM.LIZ;
        View view = this.LL.LIZIZ;
        if (view != null) {
            context = view.getContext();
        } else {
            context = null;
        }
        AwS545S0100000_1 awS545S0100000_1 = new AwS545S0100000_1(this.LL, 1742);
        c03jm.getClass();
        C03JM.LIZ(context, awS545S0100000_1);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SeaAddressChecker@2648.checkWithExtraParams$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
