package X;

import Y.AgS194S0200000_3;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.aigc.graph.plugin.IAIGCWorkflowPlugin;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.092m, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.plugin.AIGCWorkflowEventHub$attachPlugin$1", f = "AIGCWorkflowEventHub.kt", l = {459}, m = "invokeSuspend")
public final class C23078092m extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ InterfaceC346201Wa<C2217908mX> LLILLJJLI;
    public final /* synthetic */ IAIGCWorkflowPlugin LLILLL;
    public final /* synthetic */ C556080LrS LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23078092m(InterfaceC346201Wa<C2217908mX> interfaceC346201Wa, IAIGCWorkflowPlugin iAIGCWorkflowPlugin, C556080LrS c556080LrS, InterfaceC1364105Vn<? super C23078092m> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = interfaceC346201Wa;
        this.LLILLL = iAIGCWorkflowPlugin;
        this.LLILZ = c556080LrS;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C23078092m(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AIGCWorkflowEventHub@14b7.attachPlugin$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            if (i != 0) {
                if (i == 1) {
                    C155000ia.LIZIZ(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                C155000ia.LIZIZ(obj);
                InterfaceC346201Wa<C2217908mX> interfaceC346201Wa = this.LLILLJJLI;
                AgS194S0200000_3 agS194S0200000_3 = new AgS194S0200000_3(this.LLILZ, this.LLILLL, 8);
                this.LL = 1;
                if (interfaceC346201Wa.collect(agS194S0200000_3, this) == objLJFF) {
                    C1C7U.LIZIZ("AIGCWorkflowEventHub@14b7.attachPlugin$1");
                    return objLJFF;
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C0LX3 c0lx3 = C0LX3.LIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Plugin ");
            sbLIZ.append(this.LLILLL.getClass().getSimpleName());
            sbLIZ.append(" attach loop crashed: ");
            sbLIZ.append(e);
            C201955140j.LJIIIIZZ(c0lx3, "AIGCWorkflowEventHub", C2188811AlT.LIZIZ(sbLIZ));
            C470601sO.LIZ.getClass();
            C470601sO.LIZ(e);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AIGCWorkflowEventHub@14b7.attachPlugin$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
