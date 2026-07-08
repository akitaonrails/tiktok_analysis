package X;

/* JADX INFO: renamed from: X.0paA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.proto.hybrid.EcHybridPbResourceManager", f = "EcHybridPbResourceManager.kt", l = {65}, m = "awaitSafely")
public final class C1517120paA extends AbstractC23140094w {
    public Object LL;
    public AnonymousClass0957 LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ C1517130paB LLILZ;
    public int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1517120paA(C1517130paB c1517130paB, InterfaceC1364105Vn<? super C1517120paA> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZ = c1517130paB;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("EcHybridPbResourceManager@a9f1.awaitSafely$1");
        this.LLILLL = obj;
        this.LLILZIL |= Integer.MIN_VALUE;
        Object objLIZ = this.LLILZ.LIZ(null, this, null);
        C1C7U.LIZIZ("EcHybridPbResourceManager@a9f1.awaitSafely$1");
        return objLIZ;
    }
}
