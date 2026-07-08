package X;

/* JADX INFO: renamed from: X.0wXL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C09DV(c = "com.tiktok.kmp.shareprop.SharePropagationCacheManager", f = "SharePropagationCacheManager.kt", l = {293}, m = "flushToDiskInBackground")
public final class C1784450wXL extends AbstractC23140094w {
    public InterfaceC1784430wXJ LL;
    public C1DEV LLILLJJLI;
    public long LLILLL;
    public long LLILZ;
    public int LLILZIL;
    public /* synthetic */ Object LLILZLL;
    public final /* synthetic */ C1784440wXK LLIZ;
    public int LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1784450wXL(C1784440wXK c1784440wXK, InterfaceC1364105Vn<? super C1784450wXL> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLIZ = c1784440wXK;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SharePropagationCacheManager@7b32.flushToDiskInBackground$1");
        this.LLILZLL = obj;
        this.LLIZLLLIL |= Integer.MIN_VALUE;
        Object objLIZJ = this.LLIZ.LIZJ(null, 0L, 0, 0L, this);
        C1C7U.LIZIZ("SharePropagationCacheManager@7b32.flushToDiskInBackground$1");
        return objLIZJ;
    }
}
