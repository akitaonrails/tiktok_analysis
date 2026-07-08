package X;

import com.ss.android.ugc.aweme.aigc.asynctask.ICreationAsyncTaskManager;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0LAt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.asynctask.AsyncTaskManagerServiceImpl$resolveAutoCutAgentParentTaskWithRetry$2$tasks$1", f = "AsyncTaskManagerServiceImpl.kt", l = {448}, m = "invokeSuspend")
public final class C538690LAt extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super List<? extends C0LSZ>>, Object> {
    public int LL;
    public final /* synthetic */ C538790LBd LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C538690LAt(C538790LBd c538790LBd, String str, InterfaceC1364105Vn<? super C538690LAt> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c538790LBd;
        this.LLILLL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C538690LAt(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AsyncTaskManagerServiceImpl@7ddd.resolveAutoCutAgentParentTaskWithRetry$2$tasks$1");
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
                String str = this.LLILLL;
                this.LL = 1;
                obj = iCreationAsyncTaskManager.LJJIJLIJ(str, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("AsyncTaskManagerServiceImpl@7ddd.resolveAutoCutAgentParentTaskWithRetry$2$tasks$1");
                    return objLJFF;
                }
            } else {
                obj = null;
            }
        }
        C1C7U.LIZIZ("AsyncTaskManagerServiceImpl@7ddd.resolveAutoCutAgentParentTaskWithRetry$2$tasks$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super List<? extends C0LSZ>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
