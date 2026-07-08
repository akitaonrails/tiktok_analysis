package X;

import com.ss.android.ugc.aweme.aigc.asynctask.AbsTaskOutput;
import com.ss.android.ugc.aweme.aigc.asynctask.CreationAsyncTaskManagerImpl;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.09JD, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.asynctask.CreationAsyncTaskManagerImpl$submitTask$job$1", f = "CreationAsyncTaskManagerImpl.kt", l = {245, 248}, m = "invokeSuspend")
public final class C09JD extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ InterfaceC542770LQl<C09JG, AbsTaskOutput> LLILLJJLI;
    public final /* synthetic */ CreationAsyncTaskManagerImpl LLILLL;
    public final /* synthetic */ InterfaceC542770LQl<C09JG, AbsTaskOutput> LLILZ;
    public final /* synthetic */ C09JG LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C09JD(InterfaceC542770LQl<? super C09JG, ? extends AbsTaskOutput> interfaceC542770LQl, CreationAsyncTaskManagerImpl creationAsyncTaskManagerImpl, InterfaceC542770LQl<? super C09JG, ? extends AbsTaskOutput> interfaceC542770LQl2, C09JG c09jg, InterfaceC1364105Vn<? super C09JD> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = interfaceC542770LQl;
        this.LLILLL = creationAsyncTaskManagerImpl;
        this.LLILZ = interfaceC542770LQl2;
        this.LLILZIL = c09jg;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C09JD(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("CreationAsyncTaskManagerImpl@3207.submitTask$job$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1 || i == 2) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            if (this.LLILLJJLI == null) {
                C09JK.LIZ("submitTask, putTaskToMap");
                CreationAsyncTaskManagerImpl creationAsyncTaskManagerImpl = this.LLILLL;
                InterfaceC542770LQl<C09JG, AbsTaskOutput> interfaceC542770LQl = this.LLILZ;
                creationAsyncTaskManagerImpl.getClass();
                creationAsyncTaskManagerImpl.LIZIZ.put(interfaceC542770LQl.LJIIIIZZ().LIZ, interfaceC542770LQl);
                InterfaceC542770LQl<C09JG, AbsTaskOutput> interfaceC542770LQl2 = this.LLILZ;
                C09JG c09jg = this.LLILZIL;
                this.LL = 1;
                if (interfaceC542770LQl2.LJFF(c09jg, this) == objLJFF) {
                    C1C7U.LIZIZ("CreationAsyncTaskManagerImpl@3207.submitTask$job$1");
                    return objLJFF;
                }
            } else {
                C09JK.LIZ("submitTask, cache hit");
                InterfaceC542770LQl<C09JG, AbsTaskOutput> interfaceC542770LQl3 = this.LLILLJJLI;
                C09JG c09jg2 = this.LLILZIL;
                this.LL = 2;
                if (interfaceC542770LQl3.LJFF(c09jg2, this) == objLJFF) {
                    C1C7U.LIZIZ("CreationAsyncTaskManagerImpl@3207.submitTask$job$1");
                    return objLJFF;
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("CreationAsyncTaskManagerImpl@3207.submitTask$job$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
