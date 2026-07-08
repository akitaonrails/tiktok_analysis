package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0dqQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
@C09DV(c = "com.ss.android.ugc.aweme.commercialize.ams.producer.MeasurementCoroutineScheduler$startLoopIfNeed$1", f = "MeasurementScheduler.kt", l = {117}, m = "invokeSuspend")
public final class C1065920dqQ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C238400w2 LL;
    public C238400w2 LLILLJJLI;
    public long LLILLL;
    public int LLILZ;
    public /* synthetic */ Object LLILZIL;
    public final /* synthetic */ C1065990dqX LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1065920dqQ(C1065990dqX c1065990dqX, InterfaceC1364105Vn<? super C1065920dqQ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZLL = c1065990dqX;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1065920dqQ c1065920dqQ = new C1065920dqQ(this.LLILZLL, interfaceC1364105Vn);
        c1065920dqQ.LLILZIL = obj;
        return c1065920dqQ;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0029 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x00ad -> B:6:0x0021). Please report as a decompilation issue!!! */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r27) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 230
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1065920dqQ.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
