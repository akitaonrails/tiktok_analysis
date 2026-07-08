package X;

/* JADX INFO: renamed from: X.0CrE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.aivideo.detail.repo.TakoAIVideoPreloadCache", f = "TakoAIVideoPreloadCache.kt", l = {100}, m = "consume")
public final class C326620CrE extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C326630CrF LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C326620CrE(C326630CrF c326630CrF, InterfaceC1364105Vn<? super C326620CrE> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c326630CrF;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TakoAIVideoPreloadCache@2fdb.consume$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLIZIZ = this.LLILLJJLI.LIZIZ(this);
        C1C7U.LIZIZ("TakoAIVideoPreloadCache@2fdb.consume$1");
        return objLIZIZ;
    }
}
