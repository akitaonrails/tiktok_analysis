package X;

import com.bytedance.android.livesdk.guide.model.TaskInfoResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01Mw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.bytedance.android.livesdk.impl.revenue.strategy.util.TaskApiUtilsKt$requestTaskInfoInternal$2$1", f = "TaskApiUtils.kt", l = {197}, m = "invokeSuspend")
public final class C322401Mw extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ InterfaceC1631620sYq<Integer, C470590Icr<TaskInfoResponse.Data>, InterfaceC1364105Vn<? super Unit>, Object> LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ C470590Icr<TaskInfoResponse.Data> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C322401Mw(InterfaceC1631620sYq<? super Integer, ? super C470590Icr<TaskInfoResponse.Data>, ? super InterfaceC1364105Vn<? super Unit>, ? extends Object> interfaceC1631620sYq, int i, C470590Icr<TaskInfoResponse.Data> c470590Icr, InterfaceC1364105Vn<? super C322401Mw> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = interfaceC1631620sYq;
        this.LLILLL = i;
        this.LLILZ = c470590Icr;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C322401Mw(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TaskApiUtilsKt@ac6a.requestTaskInfoInternal$2$1");
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
            InterfaceC1631620sYq<Integer, C470590Icr<TaskInfoResponse.Data>, InterfaceC1364105Vn<? super Unit>, Object> interfaceC1631620sYq = this.LLILLJJLI;
            Integer numLJ = C2286608xc.LJ(this.LLILLL - 1);
            C470590Icr<TaskInfoResponse.Data> c470590Icr = this.LLILZ;
            this.LL = 1;
            if (interfaceC1631620sYq.invoke(numLJ, c470590Icr, this) == objLJFF) {
                C1C7U.LIZIZ("TaskApiUtilsKt@ac6a.requestTaskInfoInternal$2$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TaskApiUtilsKt@ac6a.requestTaskInfoInternal$2$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
