package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Ktj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.pipeline.framework.FlowGraphKt$launchIn$1", f = "FlowGraph.kt", l = {284}, m = "invokeSuspend")
public final class C532010Ktj extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C532540Kua<Object> LLILLL;
    public final /* synthetic */ Object LLILZ;
    public final /* synthetic */ InterfaceC532530KuZ LLILZIL;
    public final /* synthetic */ C532520KuY LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C532010Ktj(C532540Kua<Object> c532540Kua, Object obj, InterfaceC532530KuZ interfaceC532530KuZ, C532520KuY c532520KuY, InterfaceC1364105Vn<? super C532010Ktj> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c532540Kua;
        this.LLILZ = obj;
        this.LLILZIL = interfaceC532530KuZ;
        this.LLILZLL = c532520KuY;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C532010Ktj c532010Ktj = new C532010Ktj(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
        c532010Ktj.LLILLJJLI = obj;
        return c532010Ktj;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("FlowGraphKt@f0ba.launchIn$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(obj);
            } else {
                C155000ia.LIZIZ(obj);
                C532540Kua<Object> c532540Kua = this.LLILLL;
                Object obj2 = this.LLILZ;
                InterfaceC532530KuZ interfaceC532530KuZ = this.LLILZIL;
                C532520KuY c532520KuY = this.LLILZLL;
                this.LL = 1;
                obj = c532540Kua.LIZJ(obj2, interfaceC532530KuZ, c532520KuY, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("FlowGraphKt@f0ba.launchIn$1");
                    return objLJFF;
                }
            }
            C189200o6.m2constructorimpl((C532260Ku8) obj);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("FlowGraphKt@f0ba.launchIn$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
