package X;

import com.ss.android.ugc.aweme.aigc.asynctask.CreationAsyncTaskManagerImpl;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.09J5, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.asynctask.CreationAsyncTaskManagerImpl$cancelTaskByCreationId$1", f = "CreationAsyncTaskManagerImpl.kt", l = {364}, m = "invokeSuspend")
public final class C09J5 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ CreationAsyncTaskManagerImpl LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C09J5(CreationAsyncTaskManagerImpl creationAsyncTaskManagerImpl, String str, InterfaceC1364105Vn<? super C09J5> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = creationAsyncTaskManagerImpl;
        this.LLILLL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C09J5(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("CreationAsyncTaskManagerImpl@3207.cancelTaskByCreationId$1");
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
                C1C7U.LIZIZ("CreationAsyncTaskManagerImpl@3207.cancelTaskByCreationId$1");
                return objLJFF;
            }
        }
        Iterable iterable = (Iterable) obj;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(iterable, 10));
        Iterator it2 = iterable.iterator();
        while (it2.hasNext()) {
            arrayList.add(((C0LSZ) it2.next()).LIZ);
        }
        C385300F8u c385300F8u = C385300F8u.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("cancelTaskByCreationId : ");
        sbLIZ.append(this.LLILLL);
        C201955140j.LIZLLL(c385300F8u, "CreationAsyncTask", C2188811AlT.LIZIZ(sbLIZ));
        this.LLILLJJLI.LIZ(arrayList);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("CreationAsyncTaskManagerImpl@3207.cancelTaskByCreationId$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
