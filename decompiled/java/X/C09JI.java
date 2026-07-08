package X;

import com.ss.android.ugc.aweme.aigc.asynctask.AbsTaskOutput;
import com.ss.android.ugc.aweme.aigc.asynctask.CreationAsyncTaskManagerImpl;
import java.util.Collections;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.09JI, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.asynctask.CreationAsyncTaskManagerImpl$retryTaskByTaskId$1", f = "CreationAsyncTaskManagerImpl.kt", l = {533}, m = "invokeSuspend")
public final class C09JI extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ CreationAsyncTaskManagerImpl LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C09JI(CreationAsyncTaskManagerImpl creationAsyncTaskManagerImpl, String str, InterfaceC1364105Vn<? super C09JI> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = creationAsyncTaskManagerImpl;
        this.LLILLL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C09JI(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("CreationAsyncTaskManagerImpl@3207.retryTaskByTaskId$1");
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
            InterfaceC542770LQl<C09JG, AbsTaskOutput> interfaceC542770LQl = this.LLILLJJLI.LIZIZ.get(this.LLILLL);
            if (interfaceC542770LQl == null) {
                C0LQK c0lqk = C0LQK.LIZ;
                List<String> listSingletonList = Collections.singletonList(this.LLILLL);
                this.LL = 1;
                obj = c0lqk.LIZLLL(listSingletonList, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("CreationAsyncTaskManagerImpl@3207.retryTaskByTaskId$1");
                    return objLJFF;
                }
            }
            this.LLILLJJLI.LJJJ(interfaceC542770LQl, new C09JJ(0));
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("CreationAsyncTaskManagerImpl@3207.retryTaskByTaskId$1");
            return unit;
        }
        if (!(!((List) obj).isEmpty())) {
            obj = null;
        }
        List list = (List) obj;
        if (list == null || (interfaceC542770LQl = (InterfaceC539460LDs) C13LP.LJJJJZI(list)) == null) {
            Unit unit2 = Unit.LIZ;
            C1C7U.LIZIZ("CreationAsyncTaskManagerImpl@3207.retryTaskByTaskId$1");
            return unit2;
        }
        this.LLILLJJLI.LJJJ(interfaceC542770LQl, new C09JJ(0));
        Unit unit3 = Unit.LIZ;
        C1C7U.LIZIZ("CreationAsyncTaskManagerImpl@3207.retryTaskByTaskId$1");
        return unit3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
