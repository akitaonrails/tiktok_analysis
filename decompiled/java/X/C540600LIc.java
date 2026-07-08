package X;

import com.ss.android.ugc.aweme.aigc.asynctask.net.AutoCutAgentCreateTaskResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import njp.a;

/* JADX INFO: renamed from: X.0LIc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.asynctask.tasks.AutoCut2MAETask$stepRequestServer$2", f = "AutoCut2MAETask.kt", l = {226, 234}, m = "invokeSuspend")
public final class C540600LIc extends C09AX implements Function1<InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ AutoCutAgentCreateTaskResponse LLILLJJLI;
    public final /* synthetic */ C541110LKb LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C540600LIc(AutoCutAgentCreateTaskResponse autoCutAgentCreateTaskResponse, C541110LKb c541110LKb, InterfaceC1364105Vn<? super C540600LIc> interfaceC1364105Vn) {
        super(1, interfaceC1364105Vn);
        this.LLILLJJLI = autoCutAgentCreateTaskResponse;
        this.LLILLL = c541110LKb;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C540600LIc(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String str;
        C1C7U.LIZ("AutoCut2MAETask@5514.stepRequestServer$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1 && i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            AutoCutAgentCreateTaskResponse.Res res = this.LLILLJJLI.res;
            if (res != null && (str = res.taskId) != null) {
                C541110LKb c541110LKb = this.LLILLL;
                C0LSZ c0lszLIZ = C0LSZ.LIZ(c541110LKb.LIZLLL, null, null, null, null, null, null, null, 10, null, null, null, 0, null, null, null, 0, null, null, null, 0L, str, 0L, null, null, null, 0, null, 266338175);
                this.LL = 2;
                if (C0LTN.LJJJ(c541110LKb, c0lszLIZ, this) == objLJFF) {
                    C1C7U.LIZIZ("AutoCut2MAETask@5514.stepRequestServer$2");
                    return objLJFF;
                }
            } else {
                C541110LKb c541110LKb2 = this.LLILLL;
                C0LSZ c0lszLIZ2 = C0LSZ.LIZ(c541110LKb2.LIZLLL, null, null, null, null, null, null, null, 10, null, null, null, 0, null, null, null, 0, null, null, null, 0L, this.LLILLL.LIZLLL.LIZ, 0L, null, null, null, 0, null, 266338175);
                this.LL = 1;
                if (C0LTN.LJJJ(c541110LKb2, c0lszLIZ2, this) == objLJFF) {
                    C1C7U.LIZIZ("AutoCut2MAETask@5514.stepRequestServer$2");
                    return objLJFF;
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AutoCut2MAETask@5514.stepRequestServer$2");
        return unit;
    }
}
