package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.095j, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.autocut.sdk.smartmovie.domain.SmartMovieNLEPipeline$launchNetworkJob$1", f = "SmartMovieNLEPipeline.kt", l = {174}, m = "invokeSuspend")
public final class C23153095j extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C095X LLILLL;
    public final /* synthetic */ C23186096q LLILZ;
    public final /* synthetic */ C095E<C096H> LLILZIL;
    public final /* synthetic */ C05XL<Boolean> LLILZLL;
    public final /* synthetic */ C05XL<Boolean> LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23153095j(C095X c095x, C23186096q c23186096q, C095E<C096H> c095e, C05XL<Boolean> c05xl, C05XL<Boolean> c05xl2, InterfaceC1364105Vn<? super C23153095j> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c095x;
        this.LLILZ = c23186096q;
        this.LLILZIL = c095e;
        this.LLILZLL = c05xl;
        this.LLIZ = c05xl2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C23153095j c23153095j = new C23153095j(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
        c23153095j.LLILLJJLI = obj;
        return c23153095j;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SmartMovieNLEPipeline@d86f.launchNetworkJob$1");
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
            InterfaceC497601wk interfaceC497601wk = (InterfaceC497601wk) this.LLILLJJLI;
            C09AE c09ae = (C09AE) interfaceC497601wk.getCoroutineContext().get(C09AE.LJJLJ);
            C23155095l c23155095l = this.LLILLL.LIZ.LIZ;
            C23186096q c23186096q = this.LLILZ;
            c23155095l.getClass();
            C1419410n2Z c1419410n2Z = C1419410n2Z.LIZ;
            InterfaceC1419480n2g interfaceC1419480n2g = c23155095l.LIZ;
            c1419410n2Z.getClass();
            InterfaceC346201Wa interfaceC346201WaLJIL = C09IC.LJIL(new C2501109r7(new C1419350n2T(interfaceC1419480n2g, c23186096q, null), new C095D(new C1419300n2O(interfaceC1419480n2g, c23186096q, null)), 0), C0PEM.LIZJ);
            C23150095g c23150095g = new C23150095g(interfaceC497601wk, this.LLILZIL, this.LLILZLL, c09ae, this.LLIZ, this.LLILLL, this.LLILZ);
            this.LL = 1;
            if (interfaceC346201WaLJIL.collect(c23150095g, this) == objLJFF) {
                C1C7U.LIZIZ("SmartMovieNLEPipeline@d86f.launchNetworkJob$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SmartMovieNLEPipeline@d86f.launchNetworkJob$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
