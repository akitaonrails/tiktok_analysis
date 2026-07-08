package X;

import com.ss.android.ugc.aweme.im.streaming.api.StreamingResponseData;

/* JADX INFO: renamed from: X.0Zgi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.streaming.StreamRepositoryImpl$collectStream$4", f = "StreamRepositoryImpl.kt", l = {193, 197, 199}, m = "emit")
public final class C906140Zgi extends AbstractC23140094w {
    public StreamingResponseData LL;
    public Object LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ C906130Zgh<T> LLILZ;
    public int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C906140Zgi(C906130Zgh<? super T> c906130Zgh, InterfaceC1364105Vn<? super C906140Zgi> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZ = c906130Zgh;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type X.05Vn to X.0Zgi for r3v1 'this'  X.05Vn
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
            java.lang.String r2 = "StreamRepositoryImpl@ffe.collectStream$4$emit$1"
            X.C1C7U.LIZ(r2)
            r3.LLILLL = r4
            int r1 = r3.LLILZIL
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 | r0
            r3.LLILZIL = r1
            X.0Zgh<T> r1 = r3.LLILZ
            r0 = 0
            java.lang.Object r0 = r1.emit(r0, r3)
            X.C1C7U.LIZIZ(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C906140Zgi.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
