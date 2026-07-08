package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01dx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.bytedance.android.livesdk.performance.metrics.autoadaptive.TaskExecutor$joinExecute$runTask$1$1$1", f = "TaskExecutor.kt", l = {73}, m = "invokeSuspend")
public final class C381101dx extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<Object>, Object> {
    public int LL;
    public final /* synthetic */ long LLILLJJLI;
    public final /* synthetic */ InterfaceC381401e0<Object, Object> LLILLL;
    public final /* synthetic */ Object LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C381101dx(long j, InterfaceC381401e0<Object, Object> interfaceC381401e0, Object obj, InterfaceC1364105Vn<? super C381101dx> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = j;
        this.LLILLL = interfaceC381401e0;
        this.LLILZ = obj;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C381101dx(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TaskExecutor@d14b.joinExecute$runTask$1$1$1");
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
            long j = this.LLILLJJLI;
            C381301dz c381301dz = new C381301dz(this.LLILLL, this.LLILZ, null);
            this.LL = 1;
            obj = C099A.LIZIZ(j, c381301dz, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("TaskExecutor@d14b.joinExecute$runTask$1$1$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("TaskExecutor@d14b.joinExecute$runTask$1$1$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<Object> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
