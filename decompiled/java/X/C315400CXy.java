package X;

import Y.AgS195S0200000_4;
import Y.AgS285S0100000_4;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0CXy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.utils.AdEventFlow$collectAdEvent$1", f = "AdEventFlow.kt", l = {108}, m = "invokeSuspend")
public final class C315400CXy extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ Class<?> LLILLJJLI;
    public final /* synthetic */ Function1<InterfaceC315390CXx, Unit> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C315400CXy(Class<?> cls, Function1<? super InterfaceC315390CXx, Unit> function1, InterfaceC1364105Vn<? super C315400CXy> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = cls;
        this.LLILLL = function1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C315400CXy(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AdEventFlow@f745.collectAdEvent$1");
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
            final C2252331DDr c2252331DDr = C315960Ca2.LIZ;
            final Class<?> cls = this.LLILLJJLI;
            InterfaceC346201Wa interfaceC346201WaLIZLLL = C09IC.LIZLLL(new InterfaceC346201Wa<InterfaceC315390CXx>() { // from class: X.0CXz
                @Override // X.InterfaceC346201Wa
                public final Object collect(InterfaceC346701Wf<? super InterfaceC315390CXx> interfaceC346701Wf, InterfaceC1364105Vn interfaceC1364105Vn) {
                    Object objCollect = c2252331DDr.collect(new AgS195S0200000_4(interfaceC346701Wf, cls, 5), interfaceC1364105Vn);
                    if (objCollect == C099R.LJFF()) {
                        return objCollect;
                    }
                    return Unit.LIZ;
                }
            }, 0, 3);
            AgS285S0100000_4 agS285S0100000_4 = new AgS285S0100000_4(this.LLILLL, 32);
            this.LL = 1;
            if (interfaceC346201WaLIZLLL.collect(agS285S0100000_4, this) == objLJFF) {
                C1C7U.LIZIZ("AdEventFlow@f745.collectAdEvent$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AdEventFlow@f745.collectAdEvent$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
