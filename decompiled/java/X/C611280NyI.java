package X;

/* JADX INFO: renamed from: X.0NyI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.base.service.StoryCollectionStoreServiceImpl", f = "StoryCollectionStoreServiceImpl.kt", l = {99}, m = "batchRead")
public final class C611280NyI extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C611250NyF LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C611280NyI(C611250NyF c611250NyF, InterfaceC1364105Vn<? super C611280NyI> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c611250NyF;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("StoryCollectionStoreServiceImpl@fdda.batchRead$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLIZ = this.LLILLJJLI.LIZ(null, this);
        C1C7U.LIZIZ("StoryCollectionStoreServiceImpl@fdda.batchRead$1");
        return objLIZ;
    }
}
