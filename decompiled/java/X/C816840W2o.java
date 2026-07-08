package X;

/* JADX INFO: renamed from: X.0W2o, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
@C09DV(c = "com.ss.android.ugc.aweme.relation.storage.source.StorageDataSource", f = "StorageDataSource.kt", l = {197}, m = "getUserList")
public final class C816840W2o extends AbstractC23140094w {
    public EnumC816850W2p LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C816720W2c LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C816840W2o(C816720W2c c816720W2c, InterfaceC1364105Vn<? super C816840W2o> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c816720W2c;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("StorageDataSource@15ec.getUserList$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLIZIZ = this.LLILLL.LIZIZ(null, this);
        C1C7U.LIZIZ("StorageDataSource@15ec.getUserList$1");
        return objLIZIZ;
    }
}
