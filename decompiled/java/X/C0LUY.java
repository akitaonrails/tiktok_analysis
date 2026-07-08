package X;

import com.ss.android.ugc.aweme.aigc.asynctask.Source;
import com.ss.android.ugc.aweme.aigc.asynctask.net.CreateTaskResponse;
import com.ss.android.ugc.aweme.aigc.asynctask.net.QuotaStruct;
import com.ss.android.ugc.aweme.aikit.api.create.AIQuotaService;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import njp.a;

/* JADX INFO: renamed from: X.0LUY, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.asynctask.tasks.aicreation.childtask.AICreationServerTask$stepRequestServer$4", f = "AICreationServerTask.kt", l = {272}, m = "invokeSuspend")
public final class C0LUY extends C09AX implements Function1<InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ CreateTaskResponse LLILLJJLI;
    public final /* synthetic */ C0LUW LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0LUY(CreateTaskResponse createTaskResponse, C0LUW c0luw, InterfaceC1364105Vn<? super C0LUY> interfaceC1364105Vn) {
        super(1, interfaceC1364105Vn);
        this.LLILLJJLI = createTaskResponse;
        this.LLILLL = c0luw;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0LUY(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        QuotaStruct quotaStruct;
        C1C7U.LIZ("AICreationServerTask@593.stepRequestServer$4");
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
            List<QuotaStruct> list = this.LLILLJJLI.remainQuotas;
            if (list != null && (quotaStruct = (QuotaStruct) C13LP.LJJJLL(list)) != null) {
                C0LUW c0luw = this.LLILLL;
                C546890Lcd.LIZ.getClass();
                AIQuotaService aIQuotaServiceLIZIZ = C546890Lcd.LIZIZ();
                Source source = c0luw.LIZLLL.LJIIL;
                if (source != null) {
                    aIQuotaServiceLIZIZ.LJ(source, quotaStruct.quota, quotaStruct.quotaRemain);
                }
            }
            C0LUW c0luw2 = this.LLILLL;
            C0LSZ c0lszLIZ = C0LSZ.LIZ(c0luw2.LIZLLL, null, null, null, null, null, null, null, 10, null, null, null, 0, null, null, null, 0, null, null, null, 0L, this.LLILLJJLI.taskId, 0L, null, null, null, 0, null, 266338175);
            this.LL = 1;
            if (c0luw2.LJIIIZ(c0lszLIZ, this) == objLJFF) {
                C1C7U.LIZIZ("AICreationServerTask@593.stepRequestServer$4");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AICreationServerTask@593.stepRequestServer$4");
        return unit;
    }
}
