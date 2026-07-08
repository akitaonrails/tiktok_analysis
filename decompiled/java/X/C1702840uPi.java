package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0uPi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.pipo.postpayment.impl.BindRetainGuideActionHandler$onPrimaryAction$1$1", f = "PostPaymentGuideActionHandlers.kt", l = {210}, m = "invokeSuspend")
public final class C1702840uPi extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ InterfaceC1702850uPj LLILLJJLI;
    public final /* synthetic */ C1265004xE LLILLL;
    public final /* synthetic */ C1707390uX3 LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1702840uPi(InterfaceC1702850uPj interfaceC1702850uPj, C1265004xE c1265004xE, C1707390uX3 c1707390uX3, InterfaceC1364105Vn<? super C1702840uPi> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = interfaceC1702850uPj;
        this.LLILLL = c1265004xE;
        this.LLILZ = c1707390uX3;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1702840uPi(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String str;
        C1C7U.LIZ("BindRetainGuideActionHandler@52f3.onPrimaryAction$1$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(obj);
            } else {
                C155000ia.LIZIZ(obj);
                if (this.LLILLJJLI.nF()) {
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("BindRetainGuideActionHandler@52f3.onPrimaryAction$1$1");
                    return unit;
                }
                if (this.LLILLJJLI.Ch()) {
                    InterfaceC1702850uPj interfaceC1702850uPj = this.LLILLJJLI;
                    boolean z = this.LLILLL.LIZ;
                    if (z) {
                        str = this.LLILZ.LJI;
                    } else {
                        str = this.LLILZ.LJII;
                    }
                    interfaceC1702850uPj.M8(str, z);
                }
                this.LL = 1;
                if (AnonymousClass0958.LIZIZ(300L, this) == objLJFF) {
                    C1C7U.LIZIZ("BindRetainGuideActionHandler@52f3.onPrimaryAction$1$1");
                    return objLJFF;
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            InterfaceC1702850uPj interfaceC1702850uPj2 = this.LLILLJJLI;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("bind retain callback ui failed: ");
            String message = e.getMessage();
            if (message == null) {
                message = "";
            }
            sbLIZ.append(message);
            interfaceC1702850uPj2.I7(C2188811AlT.LIZIZ(sbLIZ));
            InterfaceC1702850uPj interfaceC1702850uPj3 = this.LLILLJJLI;
            C1265004xE c1265004xE = this.LLILLL;
            interfaceC1702850uPj3.Ur(c1265004xE.LIZIZ, c1265004xE.LIZ);
        }
        if (this.LLILLJJLI.nF()) {
            Unit unit2 = Unit.LIZ;
            C1C7U.LIZIZ("BindRetainGuideActionHandler@52f3.onPrimaryAction$1$1");
            return unit2;
        }
        if (this.LLILLJJLI.Ch()) {
            this.LLILLJJLI.Sb(false);
        }
        InterfaceC1702850uPj interfaceC1702850uPj4 = this.LLILLJJLI;
        C1265004xE c1265004xE2 = this.LLILLL;
        interfaceC1702850uPj4.Ur(c1265004xE2.LIZIZ, c1265004xE2.LIZ);
        Unit unit3 = Unit.LIZ;
        C1C7U.LIZIZ("BindRetainGuideActionHandler@52f3.onPrimaryAction$1$1");
        return unit3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
