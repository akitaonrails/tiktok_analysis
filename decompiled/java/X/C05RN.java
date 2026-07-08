package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05RN, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.bytedance.applog.priority.original.CommonKt$runOnIOThread$1$1", f = "Common.kt", l = {329}, m = "invokeSuspend")
public final class C05RN extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ Function1<InterfaceC1364105Vn<? super Unit>, Object> LLILLJJLI;
    public final /* synthetic */ InterfaceC497601wk LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C05RN(Function1<? super InterfaceC1364105Vn<? super Unit>, ? extends Object> function1, InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C05RN> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = function1;
        this.LLILLL = interfaceC497601wk;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C05RN(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("CommonKt@bc8b.runOnIOThread$1$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            if (i != 0) {
                if (i == 1) {
                    C155000ia.LIZIZ(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                C155000ia.LIZIZ(obj);
                Function1<InterfaceC1364105Vn<? super Unit>, Object> function1 = this.LLILLJJLI;
                this.LL = 1;
                if (function1.invoke(this) == objLJFF) {
                    C1C7U.LIZIZ("CommonKt@bc8b.runOnIOThread$1$1");
                    return objLJFF;
                }
            }
        } finally {
            try {
            } catch (Throwable th) {
            }
        }
        C2296808zG.LIZJ(this.LLILLL, null);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("CommonKt@bc8b.runOnIOThread$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
