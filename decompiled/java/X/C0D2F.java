package X;

/* JADX INFO: renamed from: X.0D2F, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.bytedance.im.core.client.DefaultSendMessageQueue", f = "DefaultSendMessageQueue.kt", l = {147, 156}, m = "handleNetworkRequest")
public final class C0D2F extends AbstractC23140094w {
    public C0D2H LL;
    public Object LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ C0D2I<T> LLILZ;
    public int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0D2F(C0D2I<T> c0d2i, InterfaceC1364105Vn<? super C0D2F> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZ = c0d2i;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type X.05Vn to X.0D2F for r3v1 'this'  X.05Vn
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
            java.lang.String r2 = "DefaultSendMessageQueue@501f.handleNetworkRequest$1"
            X.C1C7U.LIZ(r2)
            r3.LLILLL = r4
            int r1 = r3.LLILZIL
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 | r0
            r3.LLILZIL = r1
            X.0D2I<T> r1 = r3.LLILZ
            r0 = 0
            java.lang.Object r0 = r1.LJI(r0, r3)
            X.C1C7U.LIZIZ(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0D2F.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
