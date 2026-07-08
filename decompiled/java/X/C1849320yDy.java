package X;

/* JADX INFO: renamed from: X.0yDy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C09DV(c = "com.bytedance.amg.minigameruntime.common.platform_misc.StorageKevaService", f = "StorageKevaService.kt", l = {637}, m = "getStorageAsyncDirect")
public final class C1849320yDy extends AbstractC23140094w {
    public C1849210yDn LL;
    public Object LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ C1849210yDn LLILZ;
    public int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1849320yDy(C1849210yDn c1849210yDn, InterfaceC1364105Vn<? super C1849320yDy> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZ = c1849210yDn;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("StorageKevaService@753b.getStorageAsyncDirect$1");
        this.LLILLL = obj;
        this.LLILZIL |= Integer.MIN_VALUE;
        Object objLJI = this.LLILZ.LJI(null, this);
        C1C7U.LIZIZ("StorageKevaService@753b.getStorageAsyncDirect$1");
        return objLJI;
    }
}
