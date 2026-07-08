package X;

/* JADX INFO: renamed from: X.1D7b, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.sharepanel.impl.relations.data.core.loader.Loader", f = "Loader.kt", l = {100, 101, 103, 104}, m = "process")
public final class C2250611D7b extends AbstractC23140094w {
    public AbstractC2250601D7a LL;
    public AbstractC2250601D7a LLILLJJLI;
    public AbstractC2250601D7a LLILLL;
    public AbstractC2250601D7a LLILZ;
    public /* synthetic */ Object LLILZIL;
    public final /* synthetic */ AbstractC2250601D7a<T, R> LLILZLL;
    public int LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2250611D7b(AbstractC2250601D7a<T, R> abstractC2250601D7a, InterfaceC1364105Vn<? super C2250611D7b> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZLL = abstractC2250601D7a;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type X.05Vn to X.1D7b for r3v1 'this'  X.05Vn
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
            java.lang.String r2 = "Loader@dc36.process$1"
            X.C1C7U.LIZ(r2)
            r3.LLILZIL = r4
            int r1 = r3.LLIZ
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 | r0
            r3.LLIZ = r1
            X.1D7a<T, R> r1 = r3.LLILZLL
            r0 = 0
            java.lang.Object r0 = r1.LJII(r0, r3)
            X.C1C7U.LIZIZ(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2250611D7b.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
