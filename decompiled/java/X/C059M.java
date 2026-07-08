package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.059M, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.texttoimage.TextImageForwardResolver$retryGeneration$1", f = "TextImageForwardResolver.kt", l = {268, 271}, m = "invokeSuspend")
public final class C059M extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C572380Mce LLILLJJLI;
    public final /* synthetic */ Function1<C572410Mch, Unit> LLILLL;
    public final /* synthetic */ Function0<Unit> LLILZ;
    public final /* synthetic */ Function1<Integer, Unit> LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C059M(C572380Mce c572380Mce, Function1<? super C572410Mch, Unit> function1, Function0<Unit> function0, Function1<? super Integer, Unit> function12, InterfaceC1364105Vn<? super C059M> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c572380Mce;
        this.LLILLL = function1;
        this.LLILZ = function0;
        this.LLILZIL = function12;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C059M(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TextImageForwardResolver@7aa9.retryGeneration$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1DFH c1dfh = C0PEM.LIZ;
            AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
            C059L c059l = new C059L(this.LLILZ, null);
            this.LL = 2;
            if (C23250099c.LJI(this, abstractC2238408pq, c059l) == objLJFF) {
                C1C7U.LIZIZ("TextImageForwardResolver@7aa9.retryGeneration$1");
                return objLJFF;
            }
        }
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("TextImageForwardResolver@7aa9.retryGeneration$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            C572350Mcb c572350Mcb = C572350Mcb.LIZ;
            C572380Mce c572380Mce = this.LLILLJJLI;
            Function1<C572410Mch, Unit> function1 = this.LLILLL;
            Function0<Unit> function0 = this.LLILZ;
            Function1<Integer, Unit> function12 = this.LLILZIL;
            this.LL = 1;
            if (c572350Mcb.LIZJ(c572380Mce, function1, function0, function12, this) == objLJFF) {
                C1C7U.LIZIZ("TextImageForwardResolver@7aa9.retryGeneration$1");
                return objLJFF;
            }
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("TextImageForwardResolver@7aa9.retryGeneration$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
