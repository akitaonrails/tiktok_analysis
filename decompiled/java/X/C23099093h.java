package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import njp.a;

/* JADX INFO: renamed from: X.093h, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$3$1", f = "Delay.kt", l = {232}, m = "invokeSuspend")
public final class C23099093h extends C09AX implements Function1<InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ InterfaceC346701Wf<Object> LLILLJJLI;
    public final /* synthetic */ C259800zU<Object> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23099093h(InterfaceC1364105Vn interfaceC1364105Vn, C259800zU c259800zU, InterfaceC346701Wf interfaceC346701Wf) {
        super(1, interfaceC1364105Vn);
        this.LLILLJJLI = interfaceC346701Wf;
        this.LLILLL = c259800zU;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C23099093h(interfaceC1364105Vn, this.LLILLL, this.LLILLJJLI);
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
            InterfaceC346701Wf<Object> interfaceC346701Wf = this.LLILLJJLI;
            C09AU c09au = C09AV.LIZ;
            Object obj2 = this.LLILLL.element;
            if (obj2 == c09au) {
                obj2 = null;
            }
            this.LL = 1;
            if (interfaceC346701Wf.emit(obj2, this) == objLJFF) {
                return objLJFF;
            }
        }
        this.LLILLL.element = null;
        return Unit.LIZ;
    }
}
