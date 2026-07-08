package X;

import com.ss.android.ugc.aweme.aigc.asynctask.AbsTaskOutput;
import com.ss.android.ugc.aweme.aigc.asynctask.CreationAsyncTaskManagerImpl;
import com.ss.android.ugc.aweme.aigc.asynctask.Source;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.09J9, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.asynctask.CreationAsyncTaskManagerImpl$stopFailedTasksByTaskIds$1", f = "CreationAsyncTaskManagerImpl.kt", l = {446}, m = "invokeSuspend")
public final class C09J9 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LL;
    public int LLILLJJLI;
    public final /* synthetic */ CreationAsyncTaskManagerImpl LLILLL;
    public final /* synthetic */ List<String> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C09J9(CreationAsyncTaskManagerImpl creationAsyncTaskManagerImpl, List<String> list, InterfaceC1364105Vn<? super C09J9> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = creationAsyncTaskManagerImpl;
        this.LLILZ = list;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C09J9(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Iterator it2;
        C1C7U.LIZ("CreationAsyncTaskManagerImpl@3207.stopFailedTasksByTaskIds$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        if (i != 0) {
            if (i == 1) {
                it2 = (Iterator) this.LL;
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            ConcurrentHashMap<String, InterfaceC542770LQl<C09JG, AbsTaskOutput>> concurrentHashMap = this.LLILLL.LIZIZ;
            List<String> list = this.LLILZ;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<String, InterfaceC542770LQl<C09JG, AbsTaskOutput>> entry : concurrentHashMap.entrySet()) {
                if (list.contains(entry.getKey())) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            it2 = linkedHashMap.values().iterator();
        }
        while (it2.hasNext()) {
            InterfaceC542770LQl interfaceC542770LQl = (InterfaceC542770LQl) it2.next();
            if (interfaceC542770LQl.LJIIIIZZ().LJIIL == Source.EDITOR_PRO_AIGC_T2I || interfaceC542770LQl.LJIIIIZZ().LJIIL == Source.EDITOR_PRO_AIGC_T2V) {
                if (Intrinsics.LJFF(interfaceC542770LQl.LJIIIIZZ().LJ, "FAILED")) {
                    this.LL = it2;
                    this.LLILLJJLI = 1;
                    if (interfaceC542770LQl.LJ(this) == objLJFF) {
                        C1C7U.LIZIZ("CreationAsyncTaskManagerImpl@3207.stopFailedTasksByTaskIds$1");
                        return objLJFF;
                    }
                } else {
                    continue;
                }
            }
        }
        List<String> list2 = this.LLILZ;
        CreationAsyncTaskManagerImpl creationAsyncTaskManagerImpl = this.LLILLL;
        for (String str : list2) {
            if (creationAsyncTaskManagerImpl.LIZJ.get(str) != null) {
                List<C09AE> list3 = creationAsyncTaskManagerImpl.LIZJ.get(str);
                if (list3 != null) {
                    for (C09AE c09ae : list3) {
                        if (c09ae.isActive()) {
                            C385300F8u c385300F8u = C385300F8u.LIZIZ;
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("stopTaskByTaskIds list: ");
                            sbLIZ.append(str);
                            C201955140j.LIZLLL(c385300F8u, "CreationAsyncTask", C2188811AlT.LIZIZ(sbLIZ));
                            c09ae.LIZIZ(null);
                        }
                    }
                }
                creationAsyncTaskManagerImpl.LIZJ.remove(str);
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("CreationAsyncTaskManagerImpl@3207.stopFailedTasksByTaskIds$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
