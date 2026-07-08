package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0ugu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.bytedance.pipo.verify.base.PIPOVerifyContext$verify$1", f = "PIPOVerifyContext.kt", l = {183}, m = "invokeSuspend")
public final class C1713500ugu extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C1713750uhJ LL;
    public boolean LLILLJJLI;
    public int LLILLL;
    public final /* synthetic */ C1713570uh1 LLILZ;
    public final /* synthetic */ C19EG LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1713500ugu(C1713570uh1 c1713570uh1, C19EG c19eg, InterfaceC1364105Vn<? super C1713500ugu> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZ = c1713570uh1;
        this.LLILZIL = c19eg;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1713500ugu(this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a4 A[Catch: Exception -> 0x00e0, all -> 0x0210, TryCatch #1 {Exception -> 0x00e0, blocks: (B:19:0x004f, B:21:0x0057, B:27:0x0076, B:29:0x0086, B:30:0x0089, B:32:0x0093, B:41:0x00a4, B:43:0x00d8), top: B:124:0x004f, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00fc A[Catch: all -> 0x0103, TryCatch #2 {all -> 0x0103, blocks: (B:54:0x00f8, B:56:0x00fc), top: B:126:0x00f8 }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x010f  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 538
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1713500ugu.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
