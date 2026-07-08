package X;

import com.ss.android.ugc.aweme.aigc.asynctask.TaskDetail;
import com.ss.android.ugc.aweme.aigc.asynctask.net.UpdateAIGCTaskStatusResponse;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.05C9, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.asynctask.tasks.I2VServerTask$requestProgress$2", f = "I2VServerTask.kt", l = {204}, m = "invokeSuspend")
public final class C05C9 extends C09AX implements Function1<InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ UpdateAIGCTaskStatusResponse LLILLJJLI;
    public final /* synthetic */ C544000LVe LLILLL;
    public final /* synthetic */ String LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C05C9(UpdateAIGCTaskStatusResponse updateAIGCTaskStatusResponse, C544000LVe c544000LVe, String str, InterfaceC1364105Vn<? super C05C9> interfaceC1364105Vn) {
        super(1, interfaceC1364105Vn);
        this.LLILLJJLI = updateAIGCTaskStatusResponse;
        this.LLILLL = c544000LVe;
        this.LLILZ = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C05C9(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        TaskDetail next;
        C1C7U.LIZ("I2VServerTask@7088.requestProgress$2");
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
            List<TaskDetail> list = this.LLILLJJLI.data.taskDetailList;
            String str = this.LLILZ;
            Iterator<TaskDetail> it2 = list.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    if (Intrinsics.LJFF(next.taskId, str)) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            TaskDetail taskDetail = next;
            if (taskDetail == null) {
                C1C7U.LIZIZ("I2VServerTask@7088.requestProgress$2");
                return null;
            }
            C544000LVe c544000LVe = this.LLILLL;
            this.LL = 1;
            if (c544000LVe.LJJJJLL(taskDetail, this) == objLJFF) {
                C1C7U.LIZIZ("I2VServerTask@7088.requestProgress$2");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("I2VServerTask@7088.requestProgress$2");
        return unit;
    }
}
