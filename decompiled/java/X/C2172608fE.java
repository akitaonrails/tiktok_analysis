package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.service.PublishResourceFirstPolicyServiceImpl;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.08fE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.service.PublishResourceFirstPolicyServiceImpl$recoverYieldTasks$1", f = "PublishResourceFirstPolicyServiceImpl.kt", l = {}, m = "invokeSuspend")
public final class C2172608fE extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ List<C2172708fF> LLILLJJLI;
    public final /* synthetic */ PublishResourceFirstPolicyServiceImpl LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2172608fE(List<C2172708fF> list, PublishResourceFirstPolicyServiceImpl publishResourceFirstPolicyServiceImpl, InterfaceC1364105Vn<? super C2172608fE> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = list;
        this.LLILLL = publishResourceFirstPolicyServiceImpl;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C2172608fE c2172608fE = new C2172608fE(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
        c2172608fE.LL = obj;
        return c2172608fE;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object c098200Yq;
        C1C7U.LIZ("PublishResourceFirstPolicyServiceImpl@38c.recoverYieldTasks$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        List<C2172708fF> list = this.LLILLJJLI;
        PublishResourceFirstPolicyServiceImpl publishResourceFirstPolicyServiceImpl = this.LLILLL;
        for (C2172708fF c2172708fF : list) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            int i = C2187451AjH.LIZ;
            String str = publishResourceFirstPolicyServiceImpl.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("start to run yield task with type: ");
            sbLIZ.append(c2172708fF.LIZ);
            sbLIZ.append(", yield duration: ");
            sbLIZ.append(jCurrentTimeMillis - c2172708fF.LIZJ);
            C1720106oR.LJI(str, C2188811AlT.LIZIZ(sbLIZ));
            try {
                c2172708fF.LIZIZ.run();
                c098200Yq = Unit.LIZ;
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
            if (thM5exceptionOrNullimpl != null) {
                int i2 = C2187451AjH.LIZ;
                String str2 = publishResourceFirstPolicyServiceImpl.LIZ;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("run yield action type: ");
                sbLIZ2.append(c2172708fF.LIZ);
                sbLIZ2.append(" error");
                C1720106oR.LIZIZ(str2, C2188811AlT.LIZIZ(sbLIZ2), thM5exceptionOrNullimpl);
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PublishResourceFirstPolicyServiceImpl@38c.recoverYieldTasks$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
