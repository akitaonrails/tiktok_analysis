package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.094A, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$timeoutInternal$1$1$1", f = "Delay.kt", l = {404}, m = "invokeSuspend")
public final class C094A extends C09AX implements Function2<C094N<Object>, InterfaceC1364105Vn<? super Boolean>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ InterfaceC346701Wf<Object> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C094A(InterfaceC346701Wf<Object> interfaceC346701Wf, InterfaceC1364105Vn<? super C094A> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = interfaceC346701Wf;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C094A c094a = new C094A(this.LLILLL, interfaceC1364105Vn);
        c094a.LLILLJJLI = obj;
        return c094a;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                obj2 = this.LLILLJJLI;
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            obj2 = ((C094N) this.LLILLJJLI).LIZ;
            InterfaceC346701Wf<Object> interfaceC346701Wf = this.LLILLL;
            if (!(obj2 instanceof C094O)) {
                this.LLILLJJLI = obj2;
                this.LL = 1;
                if (interfaceC346701Wf.emit(obj2, this) == objLJFF) {
                    return objLJFF;
                }
            }
        }
        if (obj2 instanceof C094M) {
            C094N.LIZ(obj2);
            return false;
        }
        return true;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(C094N<Object> c094n, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return ((a) create(new C094N(c094n.LIZ), interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
