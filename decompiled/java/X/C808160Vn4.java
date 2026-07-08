package X;

/* JADX INFO: renamed from: X.0Vn4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
@C09DV(c = "com.ss.android.ugc.feed.platform.cache.core.BaseCacheManager", f = "BaseCacheManager.kt", l = {297, 252}, m = "flushPendingInserts")
public final class C808160Vn4 extends AbstractC23140094w {
    public InterfaceC383701eN LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C808140Vn2<K, V> LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C808160Vn4(C808140Vn2<K, V> c808140Vn2, InterfaceC1364105Vn<? super C808160Vn4> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c808140Vn2;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type X.05Vn to X.0Vn4 for r3v1 'this'  X.05Vn
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
            java.lang.String r2 = "BaseCacheManager@1c16.flushPendingInserts$1"
            X.C1C7U.LIZ(r2)
            r3.LLILLJJLI = r4
            int r1 = r3.LLILZ
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 | r0
            r3.LLILZ = r1
            X.0Vn2<K, V> r0 = r3.LLILLL
            java.lang.Object r0 = r0.LIZJ(r3)
            X.C1C7U.LIZIZ(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C808160Vn4.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
