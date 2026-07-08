package X;

/* JADX INFO: renamed from: X.0Hdt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.bytedance.effectcreatormobile.infrastructure.utils.FrescoBitmapLruCache", f = "FrescoBitmapLruCache.kt", l = {40}, m = "loadAndCache")
public final class C445750Hdt extends AbstractC23140094w {
    public Object LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C445740Hds LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C445750Hdt(C445740Hds c445740Hds, InterfaceC1364105Vn<? super C445750Hdt> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c445740Hds;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("FrescoBitmapLruCache@bb84.loadAndCache$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLIZ = this.LLILLL.LIZ(null, this);
        C1C7U.LIZIZ("FrescoBitmapLruCache@bb84.loadAndCache$1");
        return objLIZ;
    }
}
