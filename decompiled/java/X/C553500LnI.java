package X;

import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0LnI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.graph.lifecycle.WorkflowAutoLifecycleFlowExtKt$withWorkflowAutoLifecycle$1", f = "WorkflowAutoLifecycleFlowExt.kt", l = {LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT, 22}, m = "invokeSuspend")
public final class C553500LnI extends C09AX implements Function2<InterfaceC346701Wf<? super C1346605Ou>, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ InterfaceC553510LnJ LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ C553310Lmz LLILZIL;
    public final /* synthetic */ InterfaceC346201Wa<C1346605Ou> LLILZLL;
    public final /* synthetic */ List<String> LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C553500LnI(InterfaceC553510LnJ interfaceC553510LnJ, String str, C553310Lmz c553310Lmz, InterfaceC346201Wa<C1346605Ou> interfaceC346201Wa, List<String> list, InterfaceC1364105Vn<? super C553500LnI> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = interfaceC553510LnJ;
        this.LLILZ = str;
        this.LLILZIL = c553310Lmz;
        this.LLILZLL = interfaceC346201Wa;
        this.LLIZ = list;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C553500LnI c553500LnI = new C553500LnI(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
        c553500LnI.LLILLJJLI = obj;
        return c553500LnI;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC346701Wf interfaceC346701Wf;
        C1C7U.LIZ("WorkflowAutoLifecycleFlowExtKt@789b.withWorkflowAutoLifecycle$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        C155000ia.LIZIZ(obj);
                        this.LLILLL.LIZJ(this.LLILZ, this.LLIZ);
                        Unit unit = Unit.LIZ;
                        C1C7U.LIZIZ("WorkflowAutoLifecycleFlowExtKt@789b.withWorkflowAutoLifecycle$1");
                        return unit;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                interfaceC346701Wf = (InterfaceC346701Wf) this.LLILLJJLI;
                C155000ia.LIZIZ(obj);
            } else {
                C155000ia.LIZIZ(obj);
                interfaceC346701Wf = (InterfaceC346701Wf) this.LLILLJJLI;
                C099F c099fLIZIZ = this.LLILLL.LIZIZ(this.LLILZ, this.LLILZIL);
                this.LLILLJJLI = interfaceC346701Wf;
                this.LL = 1;
                if (c099fLIZIZ.LJLIIIL(this) == objLJFF) {
                    C1C7U.LIZIZ("WorkflowAutoLifecycleFlowExtKt@789b.withWorkflowAutoLifecycle$1");
                    return objLJFF;
                }
            }
            InterfaceC346201Wa<C1346605Ou> interfaceC346201Wa = this.LLILZLL;
            this.LLILLJJLI = null;
            this.LL = 2;
            if (C09IC.LJIILLIIL(this, interfaceC346201Wa, interfaceC346701Wf) == objLJFF) {
                C1C7U.LIZIZ("WorkflowAutoLifecycleFlowExtKt@789b.withWorkflowAutoLifecycle$1");
                return objLJFF;
            }
            this.LLILLL.LIZJ(this.LLILZ, this.LLIZ);
            Unit unit2 = Unit.LIZ;
            C1C7U.LIZIZ("WorkflowAutoLifecycleFlowExtKt@789b.withWorkflowAutoLifecycle$1");
            return unit2;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LLILLL.LIZJ(this.LLILZ, this.LLIZ);
            throw th;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC346701Wf<? super C1346605Ou> interfaceC346701Wf, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC346701Wf, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
