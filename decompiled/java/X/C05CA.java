package X;

import androidx.lifecycle.LifecycleOwner;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05CA, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tools.draft.draftbox.utils.aigc.AIGCArchNewFrameworkDraftTools$restoreWorkflowsByCreationIds$overallResult$1$1", f = "AIGCArchNewFrameworkDraftTools.kt", l = {}, m = "invokeSuspend")
public final class C05CA extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ Map<String, List<C552940LmO>> LLILLJJLI;
    public final /* synthetic */ LifecycleOwner LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C05CA(Map<String, ? extends List<C552940LmO>> map, LifecycleOwner lifecycleOwner, InterfaceC1364105Vn<? super C05CA> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = map;
        this.LLILLL = lifecycleOwner;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C05CA c05ca = new C05CA(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
        c05ca.LL = obj;
        return c05ca;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AIGCArchNewFrameworkDraftTools@d6e0.restoreWorkflowsByCreationIds$overallResult$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        InterfaceC497601wk interfaceC497601wk = (InterfaceC497601wk) this.LL;
        for (Map.Entry<String, List<C552940LmO>> entry : this.LLILLJJLI.entrySet()) {
            C23250099c.LIZLLL(interfaceC497601wk, C0PEM.LIZJ, null, new C05CC(entry.getKey(), entry.getValue(), this.LLILLL, null), 2);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AIGCArchNewFrameworkDraftTools@d6e0.restoreWorkflowsByCreationIds$overallResult$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
