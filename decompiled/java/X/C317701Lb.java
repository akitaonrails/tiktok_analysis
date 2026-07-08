package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01Lb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.inbox.bulletin.datacenter.DCStateBinder$bindWithEffect$1", f = "DCStateBinder.kt", l = {65}, m = "invokeSuspend")
public final class C317701Lb extends C09AX implements Function2<Object, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ Function2<Object, InterfaceC1364105Vn<? super Unit>, Object> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C317701Lb(Function2<Object, ? super InterfaceC1364105Vn<? super Unit>, ? extends Object> function2, InterfaceC1364105Vn<? super C317701Lb> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = function2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C317701Lb c317701Lb = new C317701Lb(this.LLILLL, interfaceC1364105Vn);
        c317701Lb.LLILLJJLI = obj;
        return c317701Lb;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("DCStateBinder@9534.bindWithEffect$1");
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
            Function2<Object, InterfaceC1364105Vn<? super Unit>, Object> function2 = this.LLILLL;
            this.LL = 1;
            if (function2.invoke(obj2, this) == objLJFF) {
                C1C7U.LIZIZ("DCStateBinder@9534.bindWithEffect$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("DCStateBinder@9534.bindWithEffect$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(obj, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
