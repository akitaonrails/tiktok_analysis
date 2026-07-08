package X;

import com.ss.android.ugc.aweme.aigc.asynctask.TaskDetail;
import com.ss.android.ugc.aweme.aigc.asynctask.net.CreateAIGCTaskResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import njp.a;

/* JADX INFO: renamed from: X.0LVk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.asynctask.tasks.I2VServerTask$stepRequestServer$2", f = "I2VServerTask.kt", l = {161}, m = "invokeSuspend")
public final class C544060LVk extends C09AX implements Function1<InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C544000LVe LLILLJJLI;
    public final /* synthetic */ CreateAIGCTaskResponse LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C544060LVk(C544000LVe c544000LVe, CreateAIGCTaskResponse createAIGCTaskResponse, InterfaceC1364105Vn<? super C544060LVk> interfaceC1364105Vn) {
        super(1, interfaceC1364105Vn);
        this.LLILLJJLI = c544000LVe;
        this.LLILLL = createAIGCTaskResponse;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C544060LVk(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("I2VServerTask@7088.stepRequestServer$2");
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
            C544000LVe c544000LVe = this.LLILLJJLI;
            TaskDetail taskDetail = this.LLILLL.data;
            this.LL = 1;
            if (c544000LVe.LJJJJLL(taskDetail, this) == objLJFF) {
                C1C7U.LIZIZ("I2VServerTask@7088.stepRequestServer$2");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("I2VServerTask@7088.stepRequestServer$2");
        return unit;
    }
}
