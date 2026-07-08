package X;

/* JADX INFO: renamed from: X.0W2n, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
@C09DV(c = "com.ss.android.ugc.aweme.relation.storage.source.StorageDataSource", f = "StorageDataSource.kt", l = {279, 109}, m = "triggerFullUpdate")
public final class C816830W2n extends AbstractC23140094w {
    public boolean LL;
    public InterfaceC383701eN LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ C816720W2c LLILZ;
    public int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C816830W2n(C816720W2c c816720W2c, InterfaceC1364105Vn<? super C816830W2n> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZ = c816720W2c;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("StorageDataSource@15ec.triggerFullUpdate$1");
        this.LLILLL = obj;
        this.LLILZIL |= Integer.MIN_VALUE;
        Object objLJII = this.LLILZ.LJII(false, this);
        C1C7U.LIZIZ("StorageDataSource@15ec.triggerFullUpdate$1");
        return objLJII;
    }
}
