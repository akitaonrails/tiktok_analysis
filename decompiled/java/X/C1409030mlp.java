package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0mlp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
@C09DV(c = "com.bytedance.iap.core.payment.action.ListenToActivityUpdateAction$perform$2$2", f = "ListenToActivityUpdateAction.kt", l = {}, m = "invokeSuspend")
public final class C1409030mlp extends C09AX implements Function2<EnumC1409040mlq, InterfaceC1364105Vn<? super Boolean>, Object> {
    public /* synthetic */ Object LL;

    public C1409030mlp(InterfaceC1364105Vn<? super C1409030mlp> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1409030mlp c1409030mlp = new C1409030mlp(interfaceC1364105Vn);
        c1409030mlp.LL = obj;
        return c1409030mlp;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        boolean z;
        C1C7U.LIZ("ListenToActivityUpdateAction@a21c.perform$2$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        if (this.LL == EnumC1409040mlq.DISMISSED) {
            z = true;
        } else {
            z = false;
        }
        Boolean boolValueOf = Boolean.valueOf(z);
        C1C7U.LIZIZ("ListenToActivityUpdateAction@a21c.perform$2$2");
        return boolValueOf;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(EnumC1409040mlq enumC1409040mlq, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return ((a) create(enumC1409040mlq, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
