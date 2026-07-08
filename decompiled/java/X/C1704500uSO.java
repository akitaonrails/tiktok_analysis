package X;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0uSO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.graph.lifecycle.WorkflowAutoLifecycleControllerImpl$WorkflowProcessor$startDrain$job$1", f = "WorkflowAutoLifecycleControllerImpl.kt", l = {424, 427, 427}, m = "invokeSuspend")
public final class C1704500uSO extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C1704480uSM LLILLL;
    public final /* synthetic */ List<String> LLILZ;
    public final /* synthetic */ C1704510uSP LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1704500uSO(C1704480uSM c1704480uSM, List<String> list, C1704510uSP c1704510uSP, InterfaceC1364105Vn<? super C1704500uSO> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c1704480uSM;
        this.LLILZ = list;
        this.LLILZIL = c1704510uSP;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1704500uSO c1704500uSO = new C1704500uSO(this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
        c1704500uSO.LLILLJJLI = obj;
        return c1704500uSO;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0085 A[Catch: all -> 0x00dc, CancellationException -> 0x00de, TRY_LEAVE, TryCatch #5 {CancellationException -> 0x00de, all -> 0x00dc, blocks: (B:35:0x00bd, B:36:0x00c0, B:22:0x007a, B:23:0x007d, B:25:0x0085, B:31:0x00a7), top: B:67:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a7 A[Catch: all -> 0x00dc, CancellationException -> 0x00de, TRY_ENTER, TryCatch #5 {CancellationException -> 0x00de, all -> 0x00dc, blocks: (B:35:0x00bd, B:36:0x00c0, B:22:0x007a, B:23:0x007d, B:25:0x0085, B:31:0x00a7), top: B:67:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x014b  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            Method dump skipped, instruction units count: 384
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1704500uSO.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
