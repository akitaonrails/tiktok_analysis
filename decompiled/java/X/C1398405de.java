package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05de, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.search.page.mix.container.repo.BaseMixLoadMoreRepo$doLoadMoreChunkRequest$1$2$1$onNext$1$1$2", f = "BaseMixLoadMoreRepo.kt", l = {420}, m = "invokeSuspend")
public final class C1398405de extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C675270QeD LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1398405de(C675270QeD c675270QeD, InterfaceC1364105Vn<? super C1398405de> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c675270QeD;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1398405de(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BaseMixLoadMoreRepo@9cb2.doLoadMoreChunkRequest$1$2$1$onNext$1$1$2");
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
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(1000L, this) == objLJFF) {
                C1C7U.LIZIZ("BaseMixLoadMoreRepo@9cb2.doLoadMoreChunkRequest$1$2$1$onNext$1$1$2");
                return objLJFF;
            }
        }
        C675280QeE.LIZ(this.LLILLJJLI.hashCode(), false);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("BaseMixLoadMoreRepo@9cb2.doLoadMoreChunkRequest$1$2$1$onNext$1$1$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
