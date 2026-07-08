package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0NNu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.api.component.idlepreload.CommerceIDLEPreloadModule$processNextTask$2$1$1", f = "CommerceIDLEPreloadModule.kt", l = {}, m = "invokeSuspend")
public final class C593040NNu extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C1001510cAX LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C593040NNu(C1001510cAX c1001510cAX, InterfaceC1364105Vn<? super C593040NNu> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1001510cAX;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C593040NNu(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("CommerceIDLEPreloadModule@18dd.processNextTask$2$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.LJFF(false);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("CommerceIDLEPreloadModule@18dd.processNextTask$2$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
