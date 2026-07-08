package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.08yf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.bach.BachTask$downloadAlgorithmAndCacheConfig$2", f = "BachTask.kt", l = {109}, m = "invokeSuspend")
public final class C2293108yf extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Boolean>, Object> {
    public int LL;
    public final /* synthetic */ AbstractC2293808ym<R> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2293108yf(AbstractC2293808ym<R> abstractC2293808ym, InterfaceC1364105Vn<? super C2293108yf> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = abstractC2293808ym;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2293108yf(this.LLILLJJLI, interfaceC1364105Vn);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type X.05Vn to X.08yf for r4v1 'this'  X.05Vn
        	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
        	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
        	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
        	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    @Override // njp.a
    public final java.lang.Object invokeSuspend(java.lang.Object r5) {
        /*
            r4 = this;
            java.lang.String r3 = "BachTask@4cb1.downloadAlgorithmAndCacheConfig$2"
            X.C1C7U.LIZ(r3)
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r4.LL
            r1 = 1
            if (r0 == 0) goto L1e
            if (r0 != r1) goto L37
            X.C155000ia.LIZIZ(r5)
        L13:
            if (r5 != 0) goto L2f
            r0 = 0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            X.C1C7U.LIZIZ(r3)
            return r0
        L1e:
            X.C155000ia.LIZIZ(r5)
            X.08ym<R> r0 = r4.LLILLJJLI
            r4.LL = r1
            java.lang.Object r5 = r0.LIZLLL(r4)
            if (r5 != r2) goto L13
            X.C1C7U.LIZIZ(r3)
            return r2
        L2f:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            X.C1C7U.LIZIZ(r3)
            return r0
        L37:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2293108yf.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
