package X;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0DLe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.pipo.cashier.agentbridge.PIPOCashierAgentBridgeImpl$refreshInternal$1", f = "PIPOCashierAgentBridgeServiceImpl.kt", l = {463}, m = "invokeSuspend")
public final class C337560DLe extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1712870uft LLILLJJLI;
    public final /* synthetic */ Function1<Boolean, Unit> LLILLL;
    public final /* synthetic */ C1712960ug2 LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C337560DLe(C1712870uft c1712870uft, Function1<? super Boolean, Unit> function1, C1712960ug2 c1712960ug2, InterfaceC1364105Vn<? super C337560DLe> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1712870uft;
        this.LLILLL = function1;
        this.LLILZ = c1712960ug2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C337560DLe(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        View view;
        C1C7U.LIZ("PIPOCashierAgentBridgeImpl@ef2c.refreshInternal$1");
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
            C1DFB c1dfb = C0PEM.LIZJ;
            C337550DLd c337550DLd = new C337550DLd(this.LLILLJJLI, this.LLILZ, null);
            this.LL = 1;
            obj = C23250099c.LJI(this, c1dfb, c337550DLd);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("PIPOCashierAgentBridgeImpl@ef2c.refreshInternal$1");
                return objLJFF;
            }
        }
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        if (zBooleanValue) {
            C1712870uft c1712870uft = this.LLILLJJLI;
            InterfaceC1192660h8q interfaceC1192660h8q = c1712870uft.LJ;
            if (interfaceC1192660h8q == null) {
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("PIPOCashierAgentBridgeImpl@ef2c.refreshInternal$1");
                return unit;
            }
            if (c1712870uft.LJI != null && (view = c1712870uft.LJII) != null) {
                interfaceC1192660h8q.LJIILIIL(view, c1712870uft.LJIIIIZZ);
            }
        }
        Function1<Boolean, Unit> function1 = this.LLILLL;
        if (function1 != null) {
            function1.invoke(Boolean.valueOf(zBooleanValue));
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("PIPOCashierAgentBridgeImpl@ef2c.refreshInternal$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
