package X;

/* JADX INFO: renamed from: X.0Vn3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
@C09DV(c = "com.ss.android.ugc.feed.platform.cache.core.BaseCacheManager", f = "BaseCacheManager.kt", l = {272, 280, 288}, m = "applyCapacityAndInsert")
public final class C808150Vn3 extends AbstractC23140094w {
    public Object LL;
    public Object LLILLJJLI;
    public Object LLILLL;
    public Object LLILZ;
    public Object LLILZIL;
    public /* synthetic */ Object LLILZLL;
    public final /* synthetic */ C808140Vn2<K, V> LLIZ;
    public int LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C808150Vn3(C808140Vn2<K, V> c808140Vn2, InterfaceC1364105Vn<? super C808150Vn3> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLIZ = c808140Vn2;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type X.05Vn to X.0Vn3 for r3v1 'this'  X.05Vn
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
            java.lang.String r2 = "BaseCacheManager@1c16.applyCapacityAndInsert$1"
            X.C1C7U.LIZ(r2)
            r3.LLILZLL = r4
            int r1 = r3.LLIZLLLIL
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 | r0
            r3.LLIZLLLIL = r1
            X.0Vn2<K, V> r1 = r3.LLIZ
            r0 = 0
            java.lang.Object r0 = r1.LIZ(r0, r3)
            X.C1C7U.LIZIZ(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C808150Vn3.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
