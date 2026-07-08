package X;

import androidx.lifecycle.Lifecycle;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.payment.PayPalProcess;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.03j4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.osp.payment.payment.PayPalProcess$clear$1$1", f = "PayPalProcess.kt", l = {}, m = "invokeSuspend")
public final class C922403j4 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C922403j4(InterfaceC1364105Vn<? super C922403j4> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C922403j4(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Lifecycle lifecycle;
        C1C7U.LIZ("PayPalProcess@cdfc.clear$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C19EG c19eg = PayPalProcess.LIZLLL;
        if (c19eg != null && (lifecycle = c19eg.getLifecycle()) != null) {
            lifecycle.removeObserver(PayPalProcess.LJ);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PayPalProcess@cdfc.clear$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C922403j4(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
