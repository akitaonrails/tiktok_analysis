package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0mkB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.preloader.dispatch.ECPreloadTaskDispatcherV2$batchExecute$1$2", f = "ECPreloadTaskDispatcherV2.kt", l = {}, m = "invokeSuspend")
public final class C1408010mkB extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C1507980pLQ LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1408010mkB(C1507980pLQ c1507980pLQ, InterfaceC1364105Vn<? super C1408010mkB> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1507980pLQ;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1408010mkB(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ECPreloadTaskDispatcherV2@b531.batchExecute$1$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.LIZJ();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ECPreloadTaskDispatcherV2@b531.batchExecute$1$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
