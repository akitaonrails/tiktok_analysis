package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0CXs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.amazon.AmazonLoginHandler$collectLoginEvent$$inlined$collect$1", f = "AmazonLoginHandler.kt", l = {82}, m = "invokeSuspend")
public final class C315340CXs extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ InterfaceC497601wk LLILLJJLI;
    public final /* synthetic */ C0DHD LLILLL;
    public final /* synthetic */ long LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ int LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C315340CXs(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn interfaceC1364105Vn, C0DHD c0dhd, long j, String str, String str2, int i) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = interfaceC497601wk;
        this.LLILLL = c0dhd;
        this.LLILZ = j;
        this.LLILZIL = str;
        this.LLILZLL = str2;
        this.LLIZ = i;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C315340CXs(this.LLILLJJLI, interfaceC1364105Vn, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AmazonLoginHandler@ccef.collectLoginEvent$$inlined$collect$1");
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
            InterfaceC346201Wa interfaceC346201WaLIZLLL = C09IC.LIZLLL(new C346450Di7(C315960Ca2.LIZ, 8), 0, 3);
            final InterfaceC497601wk interfaceC497601wk = this.LLILLJJLI;
            final C0DHD c0dhd = this.LLILLL;
            final long j = this.LLILZ;
            final String str = this.LLILZIL;
            final String str2 = this.LLILZLL;
            final int i2 = this.LLIZ;
            InterfaceC346701Wf interfaceC346701Wf = new InterfaceC346701Wf() { // from class: X.0CXq
                @Override // X.InterfaceC346701Wf
                public final Object emit(T t, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) throws Throwable {
                    Object objLJI = C23250099c.LJI(interfaceC1364105Vn, interfaceC497601wk.getCoroutineContext(), new C315250CXj(t, null, c0dhd, j, str, str2, i2));
                    if (objLJI == C099R.LJFF()) {
                        return objLJI;
                    }
                    return Unit.LIZ;
                }
            };
            this.LL = 1;
            if (interfaceC346201WaLIZLLL.collect(interfaceC346701Wf, this) == objLJFF) {
                C1C7U.LIZIZ("AmazonLoginHandler@ccef.collectLoginEvent$$inlined$collect$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AmazonLoginHandler@ccef.collectLoginEvent$$inlined$collect$1");
        return unit;
    }
}
