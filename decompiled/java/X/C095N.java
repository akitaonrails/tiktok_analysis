package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.095N, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.autocut.sdk.smartmovie.domain.SmartMovieNLEPipeline$execute$1$1$closerJob$1", f = "SmartMovieNLEPipeline.kt", l = {79, 80}, m = "invokeSuspend")
public final class C095N extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C09AE LLILLJJLI;
    public final /* synthetic */ C09AE LLILLL;
    public final /* synthetic */ C095E<C096H> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C095N(C09AE c09ae, C09AE c09ae2, C095E<C096H> c095e, InterfaceC1364105Vn<? super C095N> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c09ae;
        this.LLILLL = c09ae2;
        this.LLILZ = c095e;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C095N(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SmartMovieNLEPipeline@d86f.execute$1$1$closerJob$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    this.LLILZ.LJIIJJI(null);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("SmartMovieNLEPipeline@d86f.execute$1$1$closerJob$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            C09AE c09ae = this.LLILLJJLI;
            this.LL = 1;
            if (c09ae.LJJZ(this) == objLJFF) {
                C1C7U.LIZIZ("SmartMovieNLEPipeline@d86f.execute$1$1$closerJob$1");
                return objLJFF;
            }
        }
        C09AE c09ae2 = this.LLILLL;
        this.LL = 2;
        if (c09ae2.LJJZ(this) == objLJFF) {
            C1C7U.LIZIZ("SmartMovieNLEPipeline@d86f.execute$1$1$closerJob$1");
            return objLJFF;
        }
        this.LLILZ.LJIIJJI(null);
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("SmartMovieNLEPipeline@d86f.execute$1$1$closerJob$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
