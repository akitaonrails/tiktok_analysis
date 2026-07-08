package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05RL, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "androidx.compose.foundation.gestures.AnchoredDraggableKt$restartable$2$1$2", f = "AnchoredDraggable.kt", l = {1552}, m = "invokeSuspend")
public final class C05RL extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ Function2<Object, InterfaceC1364105Vn<? super Unit>, Object> LLILLJJLI;
    public final /* synthetic */ Object LLILLL;
    public final /* synthetic */ InterfaceC497601wk LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C05RL(Function2<Object, ? super InterfaceC1364105Vn<? super Unit>, ? extends Object> function2, Object obj, InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C05RL> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = function2;
        this.LLILLL = obj;
        this.LLILZ = interfaceC497601wk;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C05RL(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
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
            Function2<Object, InterfaceC1364105Vn<? super Unit>, Object> function2 = this.LLILLJJLI;
            Object obj2 = this.LLILLL;
            this.LL = 1;
            if (function2.invoke(obj2, this) == objLJFF) {
                return objLJFF;
            }
        }
        C2296808zG.LIZJ(this.LLILZ, new C1383805bI());
        return Unit.LIZ;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
