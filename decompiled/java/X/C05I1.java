package X;

/* JADX INFO: renamed from: X.05I1, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.relation.storage.sync.StorageSyncer", f = "StorageSyncer.kt", l = {46, 46}, m = "triggerFullUpdate")
public final class C05I1 extends AbstractC23140094w {
    public boolean LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C1328805Hy LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C05I1(C1328805Hy c1328805Hy, InterfaceC1364105Vn<? super C05I1> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c1328805Hy;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("StorageSyncer@f38a.triggerFullUpdate$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLIZIZ = this.LLILLL.LIZIZ(null, this);
        C1C7U.LIZIZ("StorageSyncer@f38a.triggerFullUpdate$1");
        return objLIZIZ;
    }
}
