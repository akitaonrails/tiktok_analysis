package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05hG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "androidx.compose.foundation.gestures.MouseWheelScrollingLogic$untilNull$1", f = "MouseWheelScrollable.kt", l = {179}, m = "invokeSuspend")
public final class C1420805hG extends C09AW implements Function2<AbstractC1421005hI<Object>, InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LLILLJJLI;
    public int LLILLL;
    public /* synthetic */ Object LLILZ;
    public final /* synthetic */ Function0<Object> LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1420805hG(Function0<Object> function0, InterfaceC1364105Vn<? super C1420805hG> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZIL = function0;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1420805hG c1420805hG = new C1420805hG(this.LLILZIL, interfaceC1364105Vn);
        c1420805hG.LLILZ = obj;
        return c1420805hG;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        AbstractC1421005hI abstractC1421005hI;
        Object objInvoke;
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLL;
        if (i != 0) {
            if (i == 1) {
                Object obj2 = this.LLILLJJLI;
                abstractC1421005hI = (AbstractC1421005hI) this.LLILZ;
                C155000ia.LIZIZ(obj);
                if (obj2 != null) {
                }
                return Unit.LIZ;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C155000ia.LIZIZ(obj);
        abstractC1421005hI = (AbstractC1421005hI) this.LLILZ;
        do {
            objInvoke = this.LLILZIL.invoke();
            if (objInvoke == null) {
                return Unit.LIZ;
            }
            this.LLILZ = abstractC1421005hI;
            this.LLILLJJLI = objInvoke;
            this.LLILLL = 1;
        } while (abstractC1421005hI.LIZ(objInvoke, this) != objLJFF);
        return objLJFF;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(AbstractC1421005hI<Object> abstractC1421005hI, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(abstractC1421005hI, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
