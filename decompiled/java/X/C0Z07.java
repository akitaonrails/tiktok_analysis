package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Z07, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tars.impl.TarsPipeLine$preloadResource$1$1$deferred$1", f = "TarsPipeLine.kt", l = {227}, m = "invokeSuspend")
public final class C0Z07 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Object>, Object> {
    public int LL;
    public final /* synthetic */ C0Z0A LLILLJJLI;
    public final /* synthetic */ C0Z03 LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0Z07(C0Z0A c0z0a, C0Z03 c0z03, InterfaceC1364105Vn<? super C0Z07> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c0z0a;
        this.LLILLL = c0z03;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0Z07(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("TarsPipeLine@e947.preloadResource$1$1$deferred$1");
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
            C0Z0A c0z0a = this.LLILLJJLI;
            C0Z03 c0z03 = this.LLILLL;
            this.LL = 1;
            obj = c0z0a.LJ(c0z03, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("TarsPipeLine@e947.preloadResource$1$1$deferred$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("TarsPipeLine@e947.preloadResource$1$1$deferred$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Object> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
