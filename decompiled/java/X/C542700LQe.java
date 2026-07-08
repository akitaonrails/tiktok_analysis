package X;

import com.ss.android.ugc.aweme.aigc.asynctask.tasks.workflowmanager.infra.AIGCArchWorkflowManagerImpl;
import com.ss.android.ugc.aweme.aigc.asynctask.workflowbuilder.AIGCArchWorkflowInput;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0LQe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.asynctask.tasks.workflowmanager.infra.AIGCArchWorkflowManagerImpl$generateWorkflowTaskAndSubmit$2", f = "AIGCArchWorkflowManagerImpl.kt", l = {151, 161}, m = "invokeSuspend")
public final class C542700LQe extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C542800LQo<String>>, Object> {
    public InterfaceC539460LDs LL;
    public InterfaceC542770LQl LLILLJJLI;
    public int LLILLL;
    public final /* synthetic */ AIGCArchWorkflowInput LLILZ;
    public final /* synthetic */ AIGCArchWorkflowManagerImpl LLILZIL;
    public final /* synthetic */ String LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C542700LQe(AIGCArchWorkflowInput aIGCArchWorkflowInput, AIGCArchWorkflowManagerImpl aIGCArchWorkflowManagerImpl, String str, InterfaceC1364105Vn<? super C542700LQe> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZ = aIGCArchWorkflowInput;
        this.LLILZIL = aIGCArchWorkflowManagerImpl;
        this.LLILZLL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C542700LQe(this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00c8  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r51) {
        /*
            Method dump skipped, instruction units count: 575
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C542700LQe.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C542800LQo<String>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
