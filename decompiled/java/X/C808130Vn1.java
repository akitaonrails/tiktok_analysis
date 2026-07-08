package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Vn1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
@C09DV(c = "com.ss.android.ugc.feed.platform.cache.core.BaseCacheManager$enqueueInsert$throttleRunnable$1$1", f = "BaseCacheManager.kt", l = {216, 217}, m = "invokeSuspend")
public final class C808130Vn1 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C808140Vn2<K, V> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C808130Vn1(C808140Vn2<K, V> c808140Vn2, InterfaceC1364105Vn<? super C808130Vn1> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c808140Vn2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C808130Vn1(this.LLILLJJLI, interfaceC1364105Vn);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type X.05Vn to X.0Vn1 for r6v1 'this'  X.05Vn
        	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
        	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
        	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
        	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    @Override // njp.a
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.String r5 = "BaseCacheManager@1c16.enqueueInsert$throttleRunnable$1$1"
            X.C1C7U.LIZ(r5)
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r6.LL
            r3 = 2
            r2 = 1
            if (r0 == 0) goto L21
            if (r0 == r2) goto L36
            if (r0 != r3) goto L47
            X.C155000ia.LIZIZ(r7)
        L16:
            X.0Vn2<K, V> r1 = r6.LLILLJJLI
            r0 = 0
            r1.LJII = r0
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r5)
            return r0
        L21:
            X.C155000ia.LIZIZ(r7)
            X.0Vn2<K, V> r0 = r6.LLILLJJLI
            X.0Vn5 r0 = r0.LIZIZ
            long r0 = r0.LIZIZ
            r6.LL = r2
            java.lang.Object r0 = X.AnonymousClass0958.LIZIZ(r0, r6)
            if (r0 != r4) goto L39
            X.C1C7U.LIZIZ(r5)
            return r4
        L36:
            X.C155000ia.LIZIZ(r7)
        L39:
            X.0Vn2<K, V> r0 = r6.LLILLJJLI
            r6.LL = r3
            java.lang.Object r0 = r0.LIZJ(r6)
            if (r0 != r4) goto L16
            X.C1C7U.LIZIZ(r5)
            return r4
        L47:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C808130Vn1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
