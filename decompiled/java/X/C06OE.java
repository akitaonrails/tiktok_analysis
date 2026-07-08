package X;

/* JADX INFO: renamed from: X.06OE, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.prompts.api.chatnotice.flow.base.ChatNoticeHandler", f = "ChatNoticeHandler.kt", l = {31, 73}, m = "handle")
public final class C06OE extends AbstractC23140094w {
    public C06OA LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C06OD<T> LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C06OE(C06OD<T> c06od, InterfaceC1364105Vn<? super C06OE> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c06od;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type X.05Vn to X.06OE for r3v1 'this'  X.05Vn
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
            java.lang.String r2 = "ChatNoticeHandler@1c03.handle$1"
            X.C1C7U.LIZ(r2)
            r3.LLILLJJLI = r4
            int r1 = r3.LLILZ
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 | r0
            r3.LLILZ = r1
            X.06OD<T> r1 = r3.LLILLL
            r0 = 0
            java.lang.Object r0 = r1.LJFF(r0, r3)
            X.C1C7U.LIZIZ(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C06OE.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
