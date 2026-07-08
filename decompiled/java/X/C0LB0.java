package X;

import com.ss.android.ugc.aweme.aigc.asynctask.ICreationAsyncTaskManager;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0LB0, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.asynctask.AsyncTaskManagerServiceImpl$restoreFinishedTaskAtAppForeground$1$1$onStart$1$autoCutTasks$1", f = "AsyncTaskManagerServiceImpl.kt", l = {585}, m = "invokeSuspend")
public final class C0LB0 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super List<? extends C0LSZ>>, Object> {
    public int LL;
    public final /* synthetic */ C538790LBd LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0LB0(C538790LBd c538790LBd, InterfaceC1364105Vn<? super C0LB0> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c538790LBd;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0LB0(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AsyncTaskManagerServiceImpl@7ddd.restoreFinishedTaskAtAppForeground$1$1$onStart$1$autoCutTasks$1");
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
            ICreationAsyncTaskManager iCreationAsyncTaskManager = this.LLILLJJLI.LLILZ;
            if (iCreationAsyncTaskManager != null) {
                C0LQP c0lqp = C0LQP.AUTO_CUT_AGENT;
                this.LL = 1;
                obj = iCreationAsyncTaskManager.LJIILL(c0lqp, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("AsyncTaskManagerServiceImpl@7ddd.restoreFinishedTaskAtAppForeground$1$1$onStart$1$autoCutTasks$1");
                    return objLJFF;
                }
            } else {
                obj = null;
            }
        }
        C1C7U.LIZIZ("AsyncTaskManagerServiceImpl@7ddd.restoreFinishedTaskAtAppForeground$1$1$onStart$1$autoCutTasks$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super List<? extends C0LSZ>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
