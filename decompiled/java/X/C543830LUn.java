package X;

import com.ss.android.ugc.aweme.aigc.asynctask.Source;
import com.ss.android.ugc.aweme.aigc.asynctask.experiment.AigcArchSeparatePollingTaskFromServerTaskExperiment;
import com.ss.android.ugc.aweme.aigc.asynctask.net.CreateTaskResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import njp.a;

/* JADX INFO: renamed from: X.0LUn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.asynctask.tasks.GeneralI2VServerTask$stepRequestServer$5", f = "GeneralI2VServerTask.kt", l = {220}, m = "invokeSuspend")
public final class C543830LUn extends C09AX implements Function1<InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C543820LUm LLILLJJLI;
    public final /* synthetic */ CreateTaskResponse LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C543830LUn(C543820LUm c543820LUm, CreateTaskResponse createTaskResponse, InterfaceC1364105Vn<? super C543830LUn> interfaceC1364105Vn) {
        super(1, interfaceC1364105Vn);
        this.LLILLJJLI = c543820LUm;
        this.LLILLL = createTaskResponse;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C543830LUn(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("GeneralI2VServerTask@4e5.stepRequestServer$5");
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
            C543820LUm c543820LUm = this.LLILLJJLI;
            C0LSZ c0lsz = c543820LUm.LIZLLL;
            String str = this.LLILLL.taskId;
            if (str == null) {
                str = "";
            }
            C0LSZ c0lszLIZ = C0LSZ.LIZ(c0lsz, null, null, null, null, null, null, null, 10, null, null, null, 0, null, null, null, 0, null, null, null, 0L, str, 0L, null, null, null, 0, null, 266338175);
            this.LL = 1;
            if (C0LTN.LJJJ(c543820LUm, c0lszLIZ, this) == objLJFF) {
                C1C7U.LIZIZ("GeneralI2VServerTask@4e5.stepRequestServer$5");
                return objLJFF;
            }
        }
        if (this.LLILLJJLI.LIZLLL.LJIIL == Source.EFFECT_AIGC && AigcArchSeparatePollingTaskFromServerTaskExperiment.isEnabled()) {
            this.LLILLJJLI.LJJIJIIJIL(true);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("GeneralI2VServerTask@4e5.stepRequestServer$5");
        return unit;
    }
}
