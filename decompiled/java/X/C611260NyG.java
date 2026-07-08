package X;

/* JADX INFO: renamed from: X.0NyG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.base.service.StoryCollectionStoreServiceImpl", f = "StoryCollectionStoreServiceImpl.kt", l = {194}, m = "batchWrite")
public final class C611260NyG extends AbstractC23140094w {
    public Object LL;
    public C611310NyL LLILLJJLI;
    public Object LLILLL;
    public Object LLILZ;
    public long LLILZIL;
    public long LLILZLL;
    public long LLIZ;
    public /* synthetic */ Object LLIZLLLIL;
    public final /* synthetic */ C611250NyF LLJ;
    public int LLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C611260NyG(C611250NyF c611250NyF, InterfaceC1364105Vn<? super C611260NyG> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLJ = c611250NyF;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("StoryCollectionStoreServiceImpl@fdda.batchWrite$1");
        this.LLIZLLLIL = obj;
        this.LLJI |= Integer.MIN_VALUE;
        Object objLIZLLL = this.LLJ.LIZLLL(null, this);
        C1C7U.LIZIZ("StoryCollectionStoreServiceImpl@fdda.batchWrite$1");
        return objLIZLLL;
    }
}
