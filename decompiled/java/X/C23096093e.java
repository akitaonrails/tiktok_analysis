package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.093e, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2$1$2", f = "Delay.kt", l = {299}, m = "invokeSuspend")
public final class C23096093e extends C09AX implements Function2<Unit, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C259800zU<Object> LLILLJJLI;
    public final /* synthetic */ InterfaceC346701Wf<Object> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23096093e(InterfaceC1364105Vn interfaceC1364105Vn, C259800zU c259800zU, InterfaceC346701Wf interfaceC346701Wf) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c259800zU;
        this.LLILLL = interfaceC346701Wf;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C23096093e(interfaceC1364105Vn, this.LLILLJJLI, this.LLILLL);
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
            C259800zU<Object> c259800zU = this.LLILLJJLI;
            Object obj2 = c259800zU.element;
            if (obj2 == null) {
                return Unit.LIZ;
            }
            c259800zU.element = null;
            InterfaceC346701Wf<Object> interfaceC346701Wf = this.LLILLL;
            if (obj2 == C09AV.LIZ) {
                obj2 = null;
            }
            this.LL = 1;
            if (interfaceC346701Wf.emit(obj2, this) == objLJFF) {
                return objLJFF;
            }
        }
        return Unit.LIZ;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Unit unit, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(unit, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
