package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.05co, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "androidx.compose.animation.core.AnimateAsStateKt$animateValueAsState$3$1$1", f = "AnimateAsState.kt", l = {427}, m = "invokeSuspend")
public final class C1393205co extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ T LLILLJJLI;
    public final /* synthetic */ C1677480tko<T, V> LLILLL;
    public final /* synthetic */ C05P1<InterfaceC1677030tk5<T>> LLILZ;
    public final /* synthetic */ C05P1<Function1<T, Unit>> LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1393205co(T t, C1677480tko<T, V> c1677480tko, C05P1<? extends InterfaceC1677030tk5<T>> c05p1, C05P1<? extends Function1<? super T, Unit>> c05p12, InterfaceC1364105Vn<? super C1393205co> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = t;
        this.LLILLL = c1677480tko;
        this.LLILZ = c05p1;
        this.LLILZIL = c05p12;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1393205co(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
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
            if (!Intrinsics.LJFF(this.LLILLJJLI, ((C13FE) this.LLILLL.LJ).getValue())) {
                C1677480tko<T, V> c1677480tko = this.LLILLL;
                T t = this.LLILLJJLI;
                C05P1<InterfaceC1677030tk5<T>> c05p1 = this.LLILZ;
                C1676890tjr<Float> c1676890tjr = C1675660ths.LIZ;
                InterfaceC1677030tk5 interfaceC1677030tk5 = (InterfaceC1677030tk5) c05p1.getValue();
                this.LL = 1;
                if (C1677480tko.LIZJ(c1677480tko, t, interfaceC1677030tk5, null, null, this, 12) == objLJFF) {
                    return objLJFF;
                }
            }
            return Unit.LIZ;
        }
        C05P1<Function1<T, Unit>> c05p12 = this.LLILZIL;
        C1676890tjr<Float> c1676890tjr2 = C1675660ths.LIZ;
        Function1 function1 = (Function1) c05p12.getValue();
        if (function1 != null) {
            function1.invoke(this.LLILLL.LIZLLL());
        }
        return Unit.LIZ;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
