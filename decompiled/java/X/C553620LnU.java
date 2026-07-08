package X;

import androidx.lifecycle.Lifecycle;
import com.ss.android.ugc.aweme.aigc.graph.lifecycle.android.WorkflowOwnerBinderKt$bindWorkflowOwner$observer$1;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0LnU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.graph.lifecycle.android.WorkflowOwnerBinderKt$bindWorkflowOwner$3$1", f = "WorkflowOwnerBinder.kt", l = {}, m = "invokeSuspend")
public final class C553620LnU extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ Lifecycle LL;
    public final /* synthetic */ WorkflowOwnerBinderKt$bindWorkflowOwner$observer$1 LLILLJJLI;
    public final /* synthetic */ C259800zU<String> LLILLL;
    public final /* synthetic */ InterfaceC553510LnJ LLILZ;
    public final /* synthetic */ String LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C553620LnU(Lifecycle lifecycle, WorkflowOwnerBinderKt$bindWorkflowOwner$observer$1 workflowOwnerBinderKt$bindWorkflowOwner$observer$1, C259800zU<String> c259800zU, InterfaceC553510LnJ interfaceC553510LnJ, String str, InterfaceC1364105Vn<? super C553620LnU> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = lifecycle;
        this.LLILLJJLI = workflowOwnerBinderKt$bindWorkflowOwner$observer$1;
        this.LLILLL = c259800zU;
        this.LLILZ = interfaceC553510LnJ;
        this.LLILZIL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C553620LnU(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("WorkflowOwnerBinderKt@4a94.bindWorkflowOwner$3$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.removeObserver(this.LLILLJJLI);
        C259800zU<String> c259800zU = this.LLILLL;
        String str = c259800zU.element;
        if (str != null) {
            c259800zU.element = null;
            this.LLILZ.LIZ(this.LLILZIL, str);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("WorkflowOwnerBinderKt@4a94.bindWorkflowOwner$3$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
