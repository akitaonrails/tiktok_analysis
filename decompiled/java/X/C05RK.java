package X;

import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.05RK, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "androidx.compose.material.AnchoredDraggableState$draggableState$1$drag$2", f = "AnchoredDraggable.kt", l = {150}, m = "invokeSuspend")
public final class C05RK extends C09AX implements InterfaceC1631620sYq<C05RG, Map<Object, ? extends Float>, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1380705an LLILLJJLI;
    public final /* synthetic */ Function2<InterfaceC1380505al, InterfaceC1364105Vn<? super Unit>, Object> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C05RK(C1380705an c1380705an, Function2 function2, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(3, interfaceC1364105Vn);
        this.LLILLJJLI = c1380705an;
        this.LLILLL = function2;
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
            C1380905ap c1380905ap = this.LLILLJJLI.LIZ;
            Function2<InterfaceC1380505al, InterfaceC1364105Vn<? super Unit>, Object> function2 = this.LLILLL;
            this.LL = 1;
            if (function2.invoke(c1380905ap, this) == objLJFF) {
                return objLJFF;
            }
        }
        return Unit.LIZ;
    }

    @Override // X.InterfaceC1631620sYq
    public final Object invoke(C05RG c05rg, Map<Object, ? extends Float> map, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C05RK(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
