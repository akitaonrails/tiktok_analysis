package X;

import android.app.Activity;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.03RZ, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentToast$showErrorToast$1", f = "PaymentToast.kt", l = {}, m = "invokeSuspend")
public final class C03RZ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ String LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C03RZ(String str, String str2, InterfaceC1364105Vn<? super C03RZ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = str;
        this.LLILLJJLI = str2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C03RZ(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PaymentToast@27e5.showErrorToast$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        String strLIZIZ = this.LL;
        if (strLIZIZ == null) {
            C842803Ra c842803Ra = C842803Ra.LIZ;
            String str = this.LLILLJJLI;
            c842803Ra.getClass();
            strLIZIZ = C842803Ra.LIZIZ(str);
        }
        Activity activityLIZ = C036A.LIZ();
        if (activityLIZ != null) {
            C1389890mGx c1389890mGx = new C1389890mGx(activityLIZ);
            c1389890mGx.LJIIJ(strLIZIZ);
            c1389890mGx.LIZ(true);
            c1389890mGx.LJIIJJI();
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PaymentToast@27e5.showErrorToast$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
