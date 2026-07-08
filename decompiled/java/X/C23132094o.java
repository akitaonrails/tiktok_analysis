package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: renamed from: X.094o, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "kotlinx.coroutines.flow.internal.ChannelFlow$collectToFun$1", f = "ChannelFlow.kt", l = {60}, m = "invokeSuspend")
public final class C23132094o<T> extends C09AX implements Function2<C094D<? super T>, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ AbstractC23133094p<T> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23132094o(AbstractC23133094p<T> abstractC23133094p, InterfaceC1364105Vn<? super C23132094o> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = abstractC23133094p;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C23132094o c23132094o = new C23132094o(this.LLILLL, interfaceC1364105Vn);
        c23132094o.LLILLJJLI = obj;
        return c23132094o;
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
            C094D<? super T> c094d = (C094D) this.LLILLJJLI;
            AbstractC23133094p<T> abstractC23133094p = this.LLILLL;
            this.LL = 1;
            if (abstractC23133094p.collectTo(c094d, this) == objLJFF) {
                return objLJFF;
            }
        }
        return Unit.LIZ;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(obj, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
