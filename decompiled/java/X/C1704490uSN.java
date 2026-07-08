package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0uSN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.graph.lifecycle.WorkflowAutoLifecycleControllerImpl$WorkflowProcessor$scheduleStop$job$1", f = "WorkflowAutoLifecycleControllerImpl.kt", l = {515, 518}, m = "invokeSuspend")
public final class C1704490uSN extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C09AE LLILLL;
    public final /* synthetic */ C1704480uSM LLILZ;
    public final /* synthetic */ C1704510uSP LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1704490uSN(C09AE c09ae, C1704480uSM c1704480uSM, C1704510uSP c1704510uSP, InterfaceC1364105Vn<? super C1704490uSN> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c09ae;
        this.LLILZ = c1704480uSM;
        this.LLILZIL = c1704510uSP;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1704490uSN c1704490uSN = new C1704490uSN(this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
        c1704490uSN.LLILLJJLI = obj;
        return c1704490uSN;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00f8  */
    /* JADX WARN: Type inference failed for: r3v27 */
    /* JADX WARN: Type inference failed for: r3v28 */
    /* JADX WARN: Type inference failed for: r3v29 */
    /* JADX WARN: Type inference failed for: r3v9, types: [X.01wk] */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            Method dump skipped, instruction units count: 301
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1704490uSN.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
