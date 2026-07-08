package X;

import Y.AgS167S0300000_9;
import com.ss.android.ugc.aweme.minis.page.monitor.MinisFpsMonitorAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0NQ9, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.minis.page.monitor.MinisFpsMonitorAssem$startAvgReporter$1", f = "MinisFpsMonitorAssem.kt", l = {148}, m = "invokeSuspend")
public final class C0NQ9 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ MinisFpsMonitorAssem LLILLJJLI;
    public final /* synthetic */ long LLILLL;
    public final /* synthetic */ AbstractC2252651DEx LLILZ;
    public final /* synthetic */ int LLILZIL;
    public final /* synthetic */ AbstractC2252651DEx LLILZLL;
    public final /* synthetic */ boolean LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0NQ9(MinisFpsMonitorAssem minisFpsMonitorAssem, long j, AbstractC2252651DEx abstractC2252651DEx, int i, AbstractC2252651DEx abstractC2252651DEx2, boolean z, InterfaceC1364105Vn<? super C0NQ9> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = minisFpsMonitorAssem;
        this.LLILLL = j;
        this.LLILZ = abstractC2252651DEx;
        this.LLILZIL = i;
        this.LLILZLL = abstractC2252651DEx2;
        this.LLIZ = z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0NQ9(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MinisFpsMonitorAssem@393b.startAvgReporter$1");
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
            C118300cf c118300cf = new C118300cf();
            MinisFpsMonitorAssem minisFpsMonitorAssem = this.LLILLJJLI;
            long j = this.LLILLL;
            minisFpsMonitorAssem.getClass();
            final C095D c095d = new C095D(new C396701gT(j, null));
            final AbstractC2252651DEx abstractC2252651DEx = this.LLILZ;
            final MinisFpsMonitorAssem minisFpsMonitorAssem2 = this.LLILLJJLI;
            C2501109r7 c2501109r7 = new C2501109r7(new C0NQ8(null), new InterfaceC346201Wa<C0NQD>() { // from class: X.0NQA
                @Override // X.InterfaceC346201Wa
                public final Object collect(InterfaceC346701Wf<? super C0NQD> interfaceC346701Wf, InterfaceC1364105Vn interfaceC1364105Vn) {
                    Object objCollect = c095d.collect(new AgS167S0300000_9(interfaceC346701Wf, abstractC2252651DEx, minisFpsMonitorAssem2, 0), interfaceC1364105Vn);
                    if (objCollect == C099R.LJFF()) {
                        return objCollect;
                    }
                    return Unit.LIZ;
                }
            }, 0);
            C0NQ6 c0nq6 = new C0NQ6(c118300cf, this.LLILLJJLI, this.LLILZIL, this.LLILZLL, this.LLIZ);
            this.LL = 1;
            if (c2501109r7.collect(c0nq6, this) == objLJFF) {
                C1C7U.LIZIZ("MinisFpsMonitorAssem@393b.startAvgReporter$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MinisFpsMonitorAssem@393b.startAvgReporter$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
