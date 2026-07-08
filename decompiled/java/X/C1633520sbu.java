package X;

/* JADX INFO: renamed from: X.0sbu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
@C09DV(c = "com.ss.android.ugc.aweme.sticker.repository.StreamFetchOrchestrator$collectStreamWithRetry$2$1", f = "StreamFetchOrchestrator.kt", l = {141, 143, 155, 157, 166, 170}, m = "emit")
public final class C1633520sbu extends AbstractC23140094w {
    public InterfaceC1633610sc3 LL;
    public Object LLILLJJLI;
    public boolean LLILLL;
    public /* synthetic */ Object LLILZ;
    public final /* synthetic */ C1633460sbo<T> LLILZIL;
    public int LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1633520sbu(C1633460sbo<? super T> c1633460sbo, InterfaceC1364105Vn<? super C1633520sbu> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZIL = c1633460sbo;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type X.05Vn to X.0sbu for r3v1 'this'  X.05Vn
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
            java.lang.String r2 = "StreamFetchOrchestrator@9130.collectStreamWithRetry$2$1$emit$1"
            X.C1C7U.LIZ(r2)
            r3.LLILZ = r4
            int r1 = r3.LLILZLL
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 | r0
            r3.LLILZLL = r1
            X.0sbo<T> r1 = r3.LLILZIL
            r0 = 0
            java.lang.Object r0 = r1.emit(r0, r3)
            X.C1C7U.LIZIZ(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1633520sbu.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
