package X;

import Y.AgS193S0200000_2;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05Yf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "kotlinx.coroutines.flow.StartedLazily$command$1", f = "SharingStarted.kt", l = {155}, m = "invokeSuspend")
public final class C1371105Yf extends C09AX implements Function2<InterfaceC346701Wf<? super C05YY>, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C05YD<Integer> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1371105Yf(C05YD<Integer> c05yd, InterfaceC1364105Vn<? super C1371105Yf> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c05yd;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1371105Yf c1371105Yf = new C1371105Yf(this.LLILLL, interfaceC1364105Vn);
        c1371105Yf.LLILLJJLI = obj;
        return c1371105Yf;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            InterfaceC346701Wf interfaceC346701Wf = (InterfaceC346701Wf) this.LLILLJJLI;
            C013C c013c = new C013C();
            C05YD<Integer> c05yd = this.LLILLL;
            AgS193S0200000_2 agS193S0200000_2 = new AgS193S0200000_2(c013c, interfaceC346701Wf, 18);
            this.LL = 1;
            if (c05yd.collect(agS193S0200000_2, this) == objLJFF) {
                return objLJFF;
            }
        }
        throw new C2197108jB();
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC346701Wf<? super C05YY> interfaceC346701Wf, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC346701Wf, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
