package X;

import com.ss.android.ugc.aweme.aigc.asynctask.net.CreateTaskResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import njp.a;

/* JADX INFO: renamed from: X.0LV0, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.asynctask.tasks.EditorProR2VTask$stepRequestServer$3", f = "EditorProR2VTask.kt", l = {179, 181}, m = "invokeSuspend")
public final class C0LV0 extends C09AX implements Function1<InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ CreateTaskResponse LLILLJJLI;
    public final /* synthetic */ C543980LVc LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0LV0(CreateTaskResponse createTaskResponse, C543980LVc c543980LVc, InterfaceC1364105Vn<? super C0LV0> interfaceC1364105Vn) {
        super(1, interfaceC1364105Vn);
        this.LLILLJJLI = createTaskResponse;
        this.LLILLL = c543980LVc;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0LV0(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("EditorProR2VTask@7046.stepRequestServer$3");
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
                C543980LVc c543980LVc = this.LLILLL;
                this.LL = 1;
                if (C539400LDm.LIZ(c543980LVc, -47365, null, null, null, this, 14) == objLJFF) {
                    C1C7U.LIZIZ("EditorProR2VTask@7046.stepRequestServer$3");
                    return objLJFF;
                }
            } else {
                C543980LVc c543980LVc2 = this.LLILLL;
                C0LSZ c0lszLIZ = C0LSZ.LIZ(c543980LVc2.LIZLLL, null, null, null, null, null, null, null, 0, null, null, null, 0, null, null, null, 0, null, null, null, 0L, str, 0L, null, null, null, 0, null, 266338175);
                this.LL = 2;
                if (C0LTN.LJJJ(c543980LVc2, c0lszLIZ, this) == objLJFF) {
                    C1C7U.LIZIZ("EditorProR2VTask@7046.stepRequestServer$3");
                    return objLJFF;
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("EditorProR2VTask@7046.stepRequestServer$3");
        return unit;
    }
}
