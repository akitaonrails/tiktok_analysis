package X;

import android.util.Log;
import com.bytedance.hybrid.interaction.motion.api.IHybridInteractionMotionService;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0NME, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.hybridkit.spark.PhysicsKryptonRuntimeServiceImpl$onBootstrap$1", f = "InteractionMotionPlugin.kt", l = {}, m = "invokeSuspend")
public final class C0NME extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ long LLILLJJLI;
    public final /* synthetic */ C0NMF LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0NME(long j, C0NMF c0nmf, InterfaceC1364105Vn<? super C0NME> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = j;
        this.LLILLL = c0nmf;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C0NME c0nme = new C0NME(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
        c0nme.LL = obj;
        return c0nme;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object c098200Yq;
        C1C7U.LIZ("PhysicsKryptonRuntimeServiceImpl@74fb.onBootstrap$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        long j = this.LLILLJJLI;
        C0NMF c0nmf = this.LLILLL;
        try {
            C20191713zX c20191713zX = C20191713zX.LIZ;
            c20191713zX.getClass();
            if (C20191713zX.LIZ()) {
                try {
                    c098200Yq = (IHybridInteractionMotionService) PluggableExtentionKt.pluggableSpi$default(IHybridInteractionMotionService.class, false, false, false, 14, null);
                    C189200o6.m2constructorimpl(c098200Yq);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c098200Yq = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq);
                }
                if (C189200o6.m7isFailureimpl(c098200Yq)) {
                    c098200Yq = null;
                }
                IHybridInteractionMotionService iHybridInteractionMotionService = (IHybridInteractionMotionService) c098200Yq;
                if (iHybridInteractionMotionService != null) {
                    iHybridInteractionMotionService.LIZ(j);
                    c0nmf.getClass();
                    C0NMF.LIZ(3);
                } else {
                    c0nmf.getClass();
                    C0NMF.LIZ(4);
                }
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("PhysicsKryptonRuntimeServiceImpl@74fb.onBootstrap$1");
                return unit;
            }
            c20191713zX.LIZJ();
            c0nmf.getClass();
            C0NMF.LIZ(5);
            C189200o6.m2constructorimpl(C2286608xc.LJ(Log.i("motion_sdk", "plugin no ready, will prepare")));
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            C189200o6.m2constructorimpl(new C098200Yq(th2));
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("PhysicsKryptonRuntimeServiceImpl@74fb.onBootstrap$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
