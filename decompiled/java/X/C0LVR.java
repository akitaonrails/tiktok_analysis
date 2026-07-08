package X;

import com.ss.android.ugc.aweme.aigc.asynctask.net.TaskDetail;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import njp.a;

/* JADX INFO: renamed from: X.0LVR, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.asynctask.tasks.EditI2VServerTask$requestProgress$3", f = "EditI2VServerTask.kt", l = {246, 249}, m = "invokeSuspend")
public final class C0LVR extends C09AX implements Function1<InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ TaskDetail LLILLJJLI;
    public final /* synthetic */ C0LVQ LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0LVR(TaskDetail taskDetail, C0LVQ c0lvq, InterfaceC1364105Vn<? super C0LVR> interfaceC1364105Vn) {
        super(1, interfaceC1364105Vn);
        this.LLILLJJLI = taskDetail;
        this.LLILLL = c0lvq;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0LVR(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("EditI2VServerTask@cf5c.requestProgress$3");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("EditI2VServerTask@cf5c.requestProgress$3");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
            C1C7U.LIZIZ("EditI2VServerTask@cf5c.requestProgress$3");
            return null;
        }
        C155000ia.LIZIZ(obj);
        TaskDetail taskDetail = this.LLILLJJLI;
        if (taskDetail == null) {
            C0LVQ c0lvq = this.LLILLL;
            this.LL = 1;
            if (C539400LDm.LIZ(c0lvq, -47367, "task detail null", null, null, this, 12) == objLJFF) {
                C1C7U.LIZIZ("EditI2VServerTask@cf5c.requestProgress$3");
                return objLJFF;
            }
            C1C7U.LIZIZ("EditI2VServerTask@cf5c.requestProgress$3");
            return null;
        }
        C0LVQ c0lvq2 = this.LLILLL;
        this.LL = 2;
        if (c0lvq2.LJJJJLL(taskDetail, this) == objLJFF) {
            C1C7U.LIZIZ("EditI2VServerTask@cf5c.requestProgress$3");
            return objLJFF;
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("EditI2VServerTask@cf5c.requestProgress$3");
        return unit2;
    }
}
