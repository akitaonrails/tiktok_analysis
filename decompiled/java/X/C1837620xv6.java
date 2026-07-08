package X;

/* JADX INFO: renamed from: X.0xv6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C09DV(c = "com.bytedance.android.livesdk.comp.api.pcs.infra.payment.task.pay.AbsCheckOrderTask", f = "AbsCheckOrderTask.kt", l = {88, 98}, m = "startPolling")
public final class C1837620xv6 extends AbstractC23140094w {
    public int LL;
    public int LLILLJJLI;
    public int LLILLL;
    public long[] LLILZ;
    public /* synthetic */ Object LLILZIL;
    public final /* synthetic */ AbstractC1837540xuy<POLLING_RESPONSE, IM_MESSAGE, DATA_GLOBAL> LLILZLL;
    public int LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1837620xv6(AbstractC1837540xuy<POLLING_RESPONSE, IM_MESSAGE, DATA_GLOBAL> abstractC1837540xuy, InterfaceC1364105Vn<? super C1837620xv6> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZLL = abstractC1837540xuy;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type X.05Vn to X.0xv6 for r3v1 'this'  X.05Vn
        	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
        	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
        	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
        	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    @Override // njp.a
    public final java.lang.Object invokeSuspend(java.lang.Object r4) {
        /*
            r3 = this;
            java.lang.String r2 = "AbsCheckOrderTask@217b.startPolling$1"
            X.C1C7U.LIZ(r2)
            r3.LLILZIL = r4
            int r1 = r3.LLIZ
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 | r0
            r3.LLIZ = r1
            X.0xuy<POLLING_RESPONSE, IM_MESSAGE, DATA_GLOBAL> r0 = r3.LLILZLL
            java.lang.Object r0 = r0.LJIILJJIL(r3)
            X.C1C7U.LIZIZ(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1837620xv6.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
