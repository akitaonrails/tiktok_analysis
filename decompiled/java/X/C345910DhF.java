package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0DhF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "androidx.compose.runtime.SnapshotStateKt__ProduceStateKt$produceState$1$1", f = "ProduceState.kt", l = {77}, m = "invokeSuspend")
public final class C345910DhF extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ Function2<InterfaceC345960DhK<Object>, InterfaceC1364105Vn<? super Unit>, Object> LLILLL;
    public final /* synthetic */ C05P0<Object> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C345910DhF(Function2<? super InterfaceC345960DhK<Object>, ? super InterfaceC1364105Vn<? super Unit>, ? extends Object> function2, C05P0<Object> c05p0, InterfaceC1364105Vn<? super C345910DhF> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = function2;
        this.LLILZ = c05p0;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C345910DhF c345910DhF = new C345910DhF(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
        c345910DhF.LLILLJJLI = obj;
        return c345910DhF;
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
            InterfaceC497601wk interfaceC497601wk = (InterfaceC497601wk) this.LLILLJJLI;
            Function2<InterfaceC345960DhK<Object>, InterfaceC1364105Vn<? super Unit>, Object> function2 = this.LLILLL;
            C345950DhJ c345950DhJ = new C345950DhJ(this.LLILZ, interfaceC497601wk.getCoroutineContext());
            this.LL = 1;
            if (function2.invoke(c345950DhJ, this) == objLJFF) {
                return objLJFF;
            }
        }
        return Unit.LIZ;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
