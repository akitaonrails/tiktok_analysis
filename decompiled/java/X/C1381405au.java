package X;

import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import njp.a;

/* JADX INFO: renamed from: X.05au, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "androidx.compose.material.AnchoredDraggableState$doAnchoredDrag$2$1", f = "AnchoredDraggable.kt", l = {443}, m = "invokeSuspend")
public final class C1381405au extends C09AX implements Function1<InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C1381605aw<Object> LLILLL;
    public final /* synthetic */ InterfaceC1631620sYq<C05RG, Map<Object, Float>, InterfaceC1364105Vn<? super Unit>, Object> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1381405au(Object obj, C1381605aw<Object> c1381605aw, InterfaceC1631620sYq<? super C05RG, ? super Map<Object, Float>, ? super InterfaceC1364105Vn<? super Unit>, ? extends Object> interfaceC1631620sYq, InterfaceC1364105Vn<? super C1381405au> interfaceC1364105Vn) {
        super(1, interfaceC1364105Vn);
        this.LLILLJJLI = obj;
        this.LLILLL = c1381605aw;
        this.LLILZ = interfaceC1631620sYq;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1381405au(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
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
            Object obj2 = this.LLILLJJLI;
            if (obj2 != null) {
                ((C13FE) this.LLILLL.LJIILIIL).setValue(obj2);
            }
            InterfaceC1631620sYq<C05RG, Map<Object, Float>, InterfaceC1364105Vn<? super Unit>, Object> interfaceC1631620sYq = this.LLILZ;
            C1381605aw<Object> c1381605aw = this.LLILLL;
            C1381305at c1381305at = c1381605aw.LJIILL;
            Map<Object, Float> mapLIZIZ = c1381605aw.LIZIZ();
            this.LL = 1;
            if (interfaceC1631620sYq.invoke(c1381305at, mapLIZIZ, this) == objLJFF) {
                return objLJFF;
            }
        }
        return Unit.LIZ;
    }
}
