package X;

import com.ss.android.ugc.aweme.trace.impl.TraceLogImpl;
import com.ss.android.ugc.aweme.trace.model.TraceItem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Vje, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
@C09DV(c = "com.ss.android.ugc.aweme.trace.impl.TraceLogImpl$log$2", f = "TraceLogImpl.kt", l = {133, 134}, m = "invokeSuspend")
public final class C806040Vje extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ TraceLogImpl LLILLJJLI;
    public final /* synthetic */ C806050Vjf LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C806040Vje(TraceLogImpl traceLogImpl, C806050Vjf c806050Vjf, InterfaceC1364105Vn<? super C806040Vje> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = traceLogImpl;
        this.LLILLL = c806050Vjf;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C806040Vje(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objLJI = obj;
        C1C7U.LIZ("TraceLogImpl@8707.log$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(objLJI);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("TraceLogImpl@8707.log$2");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(objLJI);
        } else {
            C155000ia.LIZIZ(objLJI);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(this.LLILLJJLI.LIZ);
            sbLIZ.append('_');
            TraceLogImpl traceLogImpl = this.LLILLJJLI;
            long j = traceLogImpl.LIZIZ;
            traceLogImpl.LIZIZ = 1 + j;
            sbLIZ.append(j);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            C806050Vjf c806050Vjf = this.LLILLL;
            TraceItem traceItem = new TraceItem(strLIZIZ, c806050Vjf.LIZ, c806050Vjf.LIZIZ, c806050Vjf.LIZJ, c806050Vjf.LIZLLL, c806050Vjf.LJ, c806050Vjf.LJFF, C2286608xc.LJFF(c806050Vjf.LJI), this.LLILLL.LJII);
            C806020Vjc c806020Vjc = this.LLILLJJLI.LJIIJJI;
            this.LL = 1;
            c806020Vjc.getClass();
            if (C0C64.LJIILLIIL().LJIIIZ(31744, "studio_trace_4kb_limit", true, true)) {
                objLJI = C23250099c.LJI(this, c806020Vjc.LIZ, new C805980VjY(c806020Vjc, traceItem, null));
            } else {
                objLJI = C23250099c.LJI(this, c806020Vjc.LIZ, new C805990VjZ(c806020Vjc, traceItem, null));
            }
            if (objLJI == objLJFF) {
                C1C7U.LIZIZ("TraceLogImpl@8707.log$2");
                return objLJFF;
            }
        }
        if (!((Boolean) objLJI).booleanValue()) {
            TraceLogImpl traceLogImpl2 = this.LLILLJJLI;
            this.LL = 2;
            if (traceLogImpl2.LJI(this) == objLJFF) {
                C1C7U.LIZIZ("TraceLogImpl@8707.log$2");
                return objLJFF;
            }
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("TraceLogImpl@8707.log$2");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
