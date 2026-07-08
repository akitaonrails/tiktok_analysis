package X;

import android.app.Application;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0mpk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
@C09DV(c = "com.bytedance.iap.core.payment.action.ListenToActivityUpdateAction$perform$2", f = "ListenToActivityUpdateAction.kt", l = {75}, m = "invokeSuspend")
public final class C1411460mpk extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1788160wdK LLILLJJLI;
    public final /* synthetic */ C1787830wcn LLILLL;
    public final /* synthetic */ Application LLILZ;
    public final /* synthetic */ C1788170wdL LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1411460mpk(Application application, C1788170wdL c1788170wdL, C1788160wdK c1788160wdK, C1787830wcn c1787830wcn, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1788160wdK;
        this.LLILLL = c1787830wcn;
        this.LLILZ = application;
        this.LLILZIL = c1788170wdL;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1411460mpk(this.LLILZ, this.LLILZIL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ListenToActivityUpdateAction@a21c.perform$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            InterfaceC346201Wa<EnumC1409040mlq> cashierUpdate = this.LLILLJJLI.LIZ.getCashierUpdate();
            C1787830wcn c1787830wcn = this.LLILLL;
            C861640Xr8 c861640Xr8 = new C861640Xr8(new C1788150wdJ(this.LLILZ, this.LLILZIL, this.LLILLJJLI, c1787830wcn, null), cashierUpdate);
            C1409030mlp c1409030mlp = new C1409030mlp(null);
            this.LL = 1;
            if (C09IC.LJIJJ(c861640Xr8, this, c1409030mlp) == objLJFF) {
                C1C7U.LIZIZ("ListenToActivityUpdateAction@a21c.perform$2");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ListenToActivityUpdateAction@a21c.perform$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
