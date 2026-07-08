package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0O7S, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.bytedance.mota.queue.PQSupervisor$PendingQueue$enqueueOp$1", f = "PQSupervisor.kt", l = {228, 128, 153, 158}, m = "invokeSuspend")
public final class C0O7S extends C09AX implements Function2<InterfaceC346701Wf<? super C0O7A<Object>>, InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LL;
    public int LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ C613970O6h<Object> LLILZ;
    public final /* synthetic */ C0O7T LLILZIL;
    public final /* synthetic */ C613980O6i LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0O7S(C613970O6h<Object> c613970O6h, C0O7T c0o7t, C613980O6i c613980O6i, InterfaceC1364105Vn<? super C0O7S> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZ = c613970O6h;
        this.LLILZIL = c0o7t;
        this.LLILZLL = c613980O6i;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C0O7S c0o7s = new C0O7S(this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
        c0o7s.LLILLL = obj;
        return c0o7s;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC346701Wf<? super C0O7A<Object>> interfaceC346701Wf, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC346701Wf, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0070  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r21) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 287
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0O7S.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
