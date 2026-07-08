package X;

/* JADX INFO: renamed from: X.0W2Y, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
@C09DV(c = "com.ss.android.ugc.aweme.relation.storage.source.StorageDataSource$Companion", f = "StorageDataSource.kt", l = {66}, m = "getInstance")
public final class C0W2Y extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C0W2X LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0W2Y(C0W2X c0w2x, InterfaceC1364105Vn<? super C0W2Y> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c0w2x;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("StorageDataSource$Companion@a5ce.getInstance$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLIZ = this.LLILLJJLI.LIZ(null, this);
        C1C7U.LIZIZ("StorageDataSource$Companion@a5ce.getInstance$1");
        return objLIZ;
    }
}
