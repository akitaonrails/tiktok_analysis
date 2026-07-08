package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.095Q, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.autocut.sdk.smartmovie.domain.SmartMovieNLEPipeline$execute$1", f = "SmartMovieNLEPipeline.kt", l = {43}, m = "invokeSuspend")
public final class C095Q extends C09AX implements Function2<InterfaceC346701Wf<? super C096H>, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C23186096q LLILLL;
    public final /* synthetic */ C095X LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C095Q(C23186096q c23186096q, C095X c095x, InterfaceC1364105Vn<? super C095Q> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c23186096q;
        this.LLILZ = c095x;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C095Q c095q = new C095Q(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
        c095q.LLILLJJLI = obj;
        return c095q;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SmartMovieNLEPipeline@d86f.execute$1");
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
            C095P c095p = new C095P(this.LLILLL, (InterfaceC346701Wf) this.LLILLJJLI, this.LLILZ, null);
            this.LL = 1;
            if (C2296808zG.LJ(c095p, this) == objLJFF) {
                C1C7U.LIZIZ("SmartMovieNLEPipeline@d86f.execute$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SmartMovieNLEPipeline@d86f.execute$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC346701Wf<? super C096H> interfaceC346701Wf, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC346701Wf, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
