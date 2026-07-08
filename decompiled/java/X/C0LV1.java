package X;

import com.ss.android.ugc.aweme.aigc.asynctask.net.CreateTaskResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import njp.a;

/* JADX INFO: renamed from: X.0LV1, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.asynctask.tasks.EditorProT2ITask$stepRequestServer$2", f = "EditorProT2ITask.kt", l = {172, 174}, m = "invokeSuspend")
public final class C0LV1 extends C09AX implements Function1<InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ CreateTaskResponse LLILLJJLI;
    public final /* synthetic */ C543990LVd LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0LV1(CreateTaskResponse createTaskResponse, C543990LVd c543990LVd, InterfaceC1364105Vn<? super C0LV1> interfaceC1364105Vn) {
        super(1, interfaceC1364105Vn);
        this.LLILLJJLI = createTaskResponse;
        this.LLILLL = c543990LVd;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0LV1(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("EditorProT2ITask@3dc4.stepRequestServer$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1 && i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            String str = this.LLILLJJLI.taskId;
            if (str == null) {
                C543990LVd c543990LVd = this.LLILLL;
                this.LL = 1;
                if (C539400LDm.LIZ(c543990LVd, -47365, null, null, null, this, 14) == objLJFF) {
                    C1C7U.LIZIZ("EditorProT2ITask@3dc4.stepRequestServer$2");
                    return objLJFF;
                }
            } else {
                C543990LVd c543990LVd2 = this.LLILLL;
                C0LSZ c0lszLIZ = C0LSZ.LIZ(c543990LVd2.LIZLLL, null, null, null, null, null, null, null, 0, null, null, null, 0, null, null, null, 0, null, null, null, 0L, str, 0L, null, null, null, 0, null, 266338175);
                this.LL = 2;
                if (C0LTN.LJJJ(c543990LVd2, c0lszLIZ, this) == objLJFF) {
                    C1C7U.LIZIZ("EditorProT2ITask@3dc4.stepRequestServer$2");
                    return objLJFF;
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("EditorProT2ITask@3dc4.stepRequestServer$2");
        return unit;
    }
}
