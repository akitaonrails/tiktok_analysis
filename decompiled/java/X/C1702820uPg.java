package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0uPg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.pipo.postpayment.impl.PaymentSignalGuideActionHandler$onSkip$1", f = "PostPaymentGuideActionHandlers.kt", l = {142, 150}, m = "invokeSuspend")
public final class C1702820uPg extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C1707390uX3 LLILLL;
    public final /* synthetic */ InterfaceC1702850uPj LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1702820uPg(C1707390uX3 c1707390uX3, InterfaceC1702850uPj interfaceC1702850uPj, InterfaceC1364105Vn<? super C1702820uPg> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c1707390uX3;
        this.LLILZ = interfaceC1702850uPj;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1702820uPg c1702820uPg = new C1702820uPg(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
        c1702820uPg.LLILLJJLI = obj;
        return c1702820uPg;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object c098200Yq;
        C1C7U.LIZ("PaymentSignalGuideActionHandler@a4ad.onSkip$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("PaymentSignalGuideActionHandler@a4ad.onSkip$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            C1707390uX3 c1707390uX3 = this.LLILLL;
            this.LL = 1;
            if (C1706720uVy.LIZIZ(c1707390uX3, "skip", "VISA_PAYMENT_SIGNAL", this) == objLJFF) {
                C1C7U.LIZIZ("PaymentSignalGuideActionHandler@a4ad.onSkip$1");
                return objLJFF;
            }
        }
        c098200Yq = Unit.LIZ;
        C189200o6.m2constructorimpl(c098200Yq);
        InterfaceC1702850uPj interfaceC1702850uPj = this.LLILZ;
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("payment signal report skip failed: ");
            String message = thM5exceptionOrNullimpl.getMessage();
            if (message == null) {
                message = "";
            }
            sbLIZ.append(message);
            interfaceC1702850uPj.I7(C2188811AlT.LIZIZ(sbLIZ));
        }
        C1DFH c1dfh = C0PEM.LIZ;
        AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
        C1702800uPe c1702800uPe = new C1702800uPe(this.LLILZ, null);
        this.LL = 2;
        if (C23250099c.LJI(this, abstractC2238408pq, c1702800uPe) == objLJFF) {
            C1C7U.LIZIZ("PaymentSignalGuideActionHandler@a4ad.onSkip$1");
            return objLJFF;
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("PaymentSignalGuideActionHandler@a4ad.onSkip$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
