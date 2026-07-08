package X;

import androidx.lifecycle.Lifecycle;
import com.ss.android.ugc.aweme.aigc.graph.lifecycle.android.WorkflowOwnerBinderKt$bindWorkflowOwner$observer$1;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import njp.a;

/* JADX INFO: renamed from: X.0LnV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.graph.lifecycle.android.WorkflowOwnerBinderKt$bindWorkflowOwner$3", f = "WorkflowOwnerBinder.kt", l = {80}, m = "invokeSuspend")
public final class C553630LnV extends C09AX implements Function1<InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ Lifecycle LLILLJJLI;
    public final /* synthetic */ WorkflowOwnerBinderKt$bindWorkflowOwner$observer$1 LLILLL;
    public final /* synthetic */ C259800zU<String> LLILZ;
    public final /* synthetic */ InterfaceC553510LnJ LLILZIL;
    public final /* synthetic */ String LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C553630LnV(Lifecycle lifecycle, WorkflowOwnerBinderKt$bindWorkflowOwner$observer$1 workflowOwnerBinderKt$bindWorkflowOwner$observer$1, C259800zU<String> c259800zU, InterfaceC553510LnJ interfaceC553510LnJ, String str, InterfaceC1364105Vn<? super C553630LnV> interfaceC1364105Vn) {
        super(1, interfaceC1364105Vn);
        this.LLILLJJLI = lifecycle;
        this.LLILLL = workflowOwnerBinderKt$bindWorkflowOwner$observer$1;
        this.LLILZ = c259800zU;
        this.LLILZIL = interfaceC553510LnJ;
        this.LLILZLL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C553630LnV(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("WorkflowOwnerBinderKt@4a94.bindWorkflowOwner$3");
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
            C1DFH c1dfh = C0PEM.LIZ;
            AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
            C553620LnU c553620LnU = new C553620LnU(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, null);
            this.LL = 1;
            if (C23250099c.LJI(this, abstractC2238408pq, c553620LnU) == objLJFF) {
                C1C7U.LIZIZ("WorkflowOwnerBinderKt@4a94.bindWorkflowOwner$3");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("WorkflowOwnerBinderKt@4a94.bindWorkflowOwner$3");
        return unit;
    }
}
