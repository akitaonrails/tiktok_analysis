package X;

/* JADX INFO: renamed from: X.0D2E, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.commercialize.ucp.impl.data.network.fetcher.UcpAsyncFetcher", f = "UcpAsyncFetcher.kt", l = {106, 112}, m = "fetchWithRetryBeforeError-IoAF18A")
public final class C0D2E extends AbstractC23140094w {
    public C259800zU LL;
    public int LLILLJJLI;
    public int LLILLL;
    public int LLILZ;
    public /* synthetic */ Object LLILZIL;
    public final /* synthetic */ C0D27<T> LLILZLL;
    public int LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0D2E(C0D27<T> c0d27, InterfaceC1364105Vn<? super C0D2E> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZLL = c0d27;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type X.05Vn to X.0D2E for r3v1 'this'  X.05Vn
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
            java.lang.String r2 = "UcpAsyncFetcher@b048.fetchWithRetryBeforeError$1"
            X.C1C7U.LIZ(r2)
            r3.LLILZIL = r4
            int r1 = r3.LLIZ
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 | r0
            r3.LLIZ = r1
            X.0D27<T> r0 = r3.LLILZLL
            java.lang.Object r1 = r0.LIZJ(r3)
            java.lang.Object r0 = X.C099R.LJFF()
            if (r1 != r0) goto L1e
            X.C1C7U.LIZIZ(r2)
            return r1
        L1e:
            X.00o6 r0 = X.C189200o6.m1boximpl(r1)
            X.C1C7U.LIZIZ(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0D2E.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
