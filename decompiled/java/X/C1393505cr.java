package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import njp.a;

/* JADX INFO: renamed from: X.05cr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "androidx.compose.animation.core.Animatable$snapTo$2", f = "Animatable.kt", l = {}, m = "invokeSuspend")
public final class C1393505cr extends C09AX implements Function1<InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C1677480tko<T, V> LL;
    public final /* synthetic */ T LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1393505cr(C1677480tko<T, V> c1677480tko, T t, InterfaceC1364105Vn<? super C1393505cr> interfaceC1364105Vn) {
        super(1, interfaceC1364105Vn);
        this.LL = c1677480tko;
        this.LLILLJJLI = t;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1393505cr(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1677480tko.LIZIZ(this.LL);
        Object objLIZ = C1677480tko.LIZ(this.LL, this.LLILLJJLI);
        ((C13FE) this.LL.LIZJ.LLILLJJLI).setValue(objLIZ);
        ((C13FE) this.LL.LJ).setValue(objLIZ);
        return Unit.LIZ;
    }
}
