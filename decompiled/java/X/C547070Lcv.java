package X;

import Y.AgS199S0200000_8;
import com.ss.android.ugc.aweme.aigc.asynctask.ICreationAsyncTaskManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Lcv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.asynctask.tasks.workflowmanager.lifecycle.resourcemanager.AsyncTaskHandle$release$2", f = "AsyncTaskHandle.kt", l = {48}, m = "invokeSuspend")
public final class C547070Lcv extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C547060Lcu LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C547070Lcv(C547060Lcu c547060Lcu, InterfaceC1364105Vn<? super C547070Lcv> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c547060Lcu;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C547070Lcv c547070Lcv = new C547070Lcv(this.LLILLL, interfaceC1364105Vn);
        c547070Lcv.LLILLJJLI = obj;
        return c547070Lcv;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC346201Wa<C0LSZ> interfaceC346201WaLJJJJL;
        C1C7U.LIZ("AsyncTaskHandle@2ba6.release$2");
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
            InterfaceC497601wk interfaceC497601wk = (InterfaceC497601wk) this.LLILLJJLI;
            ICreationAsyncTaskManager iCreationAsyncTaskManagerLIZJ = this.LLILLL.LIZJ();
            if (iCreationAsyncTaskManagerLIZJ != null && (interfaceC346201WaLJJJJL = iCreationAsyncTaskManagerLIZJ.LJJJJL(this.LLILLL.LIZ)) != null) {
                AgS199S0200000_8 agS199S0200000_8 = new AgS199S0200000_8(this.LLILLL, interfaceC497601wk, 20);
                this.LL = 1;
                if (interfaceC346201WaLJJJJL.collect(agS199S0200000_8, this) == objLJFF) {
                    C1C7U.LIZIZ("AsyncTaskHandle@2ba6.release$2");
                    return objLJFF;
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AsyncTaskHandle@2ba6.release$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
