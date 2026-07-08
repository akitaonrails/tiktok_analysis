package X;

import com.ss.android.ugc.aweme.aigc.asynctask.CreationAsyncTaskManagerImpl;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.09J6, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.asynctask.CreationAsyncTaskManagerImpl$retryAllTask$1", f = "CreationAsyncTaskManagerImpl.kt", l = {541}, m = "invokeSuspend")
public final class C09J6 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ CreationAsyncTaskManagerImpl LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C09J6(CreationAsyncTaskManagerImpl creationAsyncTaskManagerImpl, String str, InterfaceC1364105Vn<? super C09J6> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = creationAsyncTaskManagerImpl;
        this.LLILLL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C09J6(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("CreationAsyncTaskManagerImpl@3207.retryAllTask$1");
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
            CreationAsyncTaskManagerImpl creationAsyncTaskManagerImpl = this.LLILLJJLI;
            String str = this.LLILLL;
            this.LL = 1;
            obj = creationAsyncTaskManagerImpl.LJJIJLIJ(str, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("CreationAsyncTaskManagerImpl@3207.retryAllTask$1");
                return objLJFF;
            }
        }
        Iterator it2 = ((List) obj).iterator();
        while (it2.hasNext()) {
            this.LLILLJJLI.LJJIJIL(((C0LSZ) it2.next()).LIZ);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("CreationAsyncTaskManagerImpl@3207.retryAllTask$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
