package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0LqO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.wave.graph.AIGCWorkflowManagementApiImpl$retryWorkflow$2$updateResult$1", f = "AIGCWorkflowManagementApiImpl.kt", l = {267, 305}, m = "invokeSuspend")
public final class C555420LqO extends C09AX implements Function2<C1346605Ou, InterfaceC1364105Vn<? super C1346605Ou>, Object> {
    public Object LL;
    public Object LLILLJJLI;
    public int LLILLL;
    public /* synthetic */ Object LLILZ;
    public final /* synthetic */ C552940LmO LLILZIL;
    public final /* synthetic */ InterfaceC545310La5 LLILZLL;
    public final /* synthetic */ String LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C555420LqO(C552940LmO c552940LmO, InterfaceC545310La5 interfaceC545310La5, String str, InterfaceC1364105Vn<? super C555420LqO> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZIL = c552940LmO;
        this.LLILZLL = interfaceC545310La5;
        this.LLIZ = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C555420LqO c555420LqO = new C555420LqO(this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
        c555420LqO.LLILZ = obj;
        return c555420LqO;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:110:0x02a8 A[LOOP:1: B:108:0x02a2->B:110:0x02a8, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003b  */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r10v3, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r10v7, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r16) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 722
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C555420LqO.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(C1346605Ou c1346605Ou, InterfaceC1364105Vn<? super C1346605Ou> interfaceC1364105Vn) {
        return ((a) create(c1346605Ou, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
