package X;

/* JADX INFO: renamed from: X.0W2i, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
@C09DV(c = "com.ss.android.ugc.aweme.relation.storage.source.StorageDataSource", f = "StorageDataSource.kt", l = {138}, m = "performFullUpdate")
public final class C816780W2i extends AbstractC23140094w {
    public C013C LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C816720W2c LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C816780W2i(C816720W2c c816720W2c, InterfaceC1364105Vn<? super C816780W2i> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c816720W2c;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("StorageDataSource@15ec.performFullUpdate$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLJ = this.LLILLL.LJ(null, null, 0, this);
        C1C7U.LIZIZ("StorageDataSource@15ec.performFullUpdate$1");
        return objLJ;
    }
}
