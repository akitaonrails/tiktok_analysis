package X;

import android.app.Application;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS393S0200000_27;
import njp.a;

/* JADX INFO: renamed from: X.0wdJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C09DV(c = "com.bytedance.iap.core.payment.action.ListenToActivityUpdateAction$perform$2$1", f = "ListenToActivityUpdateAction.kt", l = {70}, m = "invokeSuspend")
public final class C1788150wdJ extends C09AX implements Function2<EnumC1409040mlq, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C1787830wcn LLILLL;
    public final /* synthetic */ C1788160wdK LLILZ;
    public final /* synthetic */ Application LLILZIL;
    public final /* synthetic */ C1788170wdL LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1788150wdJ(Application application, C1788170wdL c1788170wdL, C1788160wdK c1788160wdK, C1787830wcn c1787830wcn, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c1787830wcn;
        this.LLILZ = c1788160wdK;
        this.LLILZIL = application;
        this.LLILZLL = c1788170wdL;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1787830wcn c1787830wcn = this.LLILLL;
        C1788150wdJ c1788150wdJ = new C1788150wdJ(this.LLILZIL, this.LLILZLL, this.LLILZ, c1787830wcn, interfaceC1364105Vn);
        c1788150wdJ.LLILLJJLI = obj;
        return c1788150wdJ;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ListenToActivityUpdateAction@a21c.perform$2$1");
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
            int i2 = C1409050mlr.LIZ[((EnumC1409040mlq) this.LLILLJJLI).ordinal()];
            if (i2 != 1) {
                if (i2 == 2) {
                    this.LLILLL.LJII.LIZJ = C2286608xc.LJFF(this.LLILZ.LIZIZ.currentTimeMillis());
                    InterfaceC1786480wac interfaceC1786480wacLJ = this.LLILZ.LIZIZ.LJ();
                    C1788190wdN c1788190wdN = new C1786600wao<C1788210wdP>() { // from class: X.0wdN
                        {
                            new C1788210wdP();
                        }
                    };
                    AwS393S0200000_27 awS393S0200000_27 = new AwS393S0200000_27(this.LLILZ, this.LLILLL, 158);
                    c1788190wdN.getClass();
                    interfaceC1786480wacLJ.LIZ(new C1786590wan(c1788190wdN, awS393S0200000_27));
                    this.LLILZIL.unregisterActivityLifecycleCallbacks(this.LLILZLL);
                    InterfaceC1787890wct interfaceC1787890wct = this.LLILZ.LIZJ;
                    C1411490mpn c1411490mpn = new C1411490mpn(this.LLILLL);
                    this.LL = 1;
                    if (interfaceC1787890wct.LIZ(c1411490mpn, this) == objLJFF) {
                        C1C7U.LIZIZ("ListenToActivityUpdateAction@a21c.perform$2$1");
                        return objLJFF;
                    }
                } else {
                    throw new C1954807lC();
                }
            } else {
                this.LLILLL.LJII.LIZIZ = C2286608xc.LJFF(this.LLILZ.LIZIZ.currentTimeMillis());
                InterfaceC1786480wac interfaceC1786480wacLJ2 = this.LLILZ.LIZIZ.LJ();
                C1788190wdN c1788190wdN2 = new C1786600wao<C1788210wdP>() { // from class: X.0wdN
                    {
                        new C1788210wdP();
                    }
                };
                AwS393S0200000_27 awS393S0200000_272 = new AwS393S0200000_27(this.LLILZ, this.LLILLL, 157);
                c1788190wdN2.getClass();
                interfaceC1786480wacLJ2.LIZ(new C1786590wan(c1788190wdN2, awS393S0200000_272));
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ListenToActivityUpdateAction@a21c.perform$2$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(EnumC1409040mlq enumC1409040mlq, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(enumC1409040mlq, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
