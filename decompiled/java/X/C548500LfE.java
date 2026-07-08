package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0LfE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.theater.creation.generation.component.AITheaterGenerationLogicComponent$onGenerationSuccess$2$1", f = "AITheaterGenerationLogicComponent.kt", l = {}, m = "invokeSuspend")
public final class C548500LfE extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C548470LfB LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C548500LfE(C548470LfB c548470LfB, InterfaceC1364105Vn<? super C548500LfE> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c548470LfB;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C548500LfE(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AITheaterGenerationLogicComponent@2c00.onGenerationSuccess$2$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C548470LfB c548470LfB = this.LL;
        c548470LfB.Q3(c548470LfB.o2().DP2());
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AITheaterGenerationLogicComponent@2c00.onGenerationSuccess$2$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
