package X;

/* JADX INFO: renamed from: X.0W2l, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
@C09DV(c = "com.ss.android.ugc.aweme.relation.storage.source.StorageDataSource", f = "StorageDataSource.kt", l = {182}, m = "onFullUpdateFinish")
public final class C816810W2l extends AbstractC23140094w {
    public C0W2U LL;
    public long LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ C816720W2c LLILZ;
    public int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C816810W2l(C816720W2c c816720W2c, InterfaceC1364105Vn<? super C816810W2l> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZ = c816720W2c;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("StorageDataSource@15ec.onFullUpdateFinish$1");
        this.LLILLL = obj;
        this.LLILZIL |= Integer.MIN_VALUE;
        Object objLIZLLL = this.LLILZ.LIZLLL(this);
        C1C7U.LIZIZ("StorageDataSource@15ec.onFullUpdateFinish$1");
        return objLIZLLL;
    }
}
