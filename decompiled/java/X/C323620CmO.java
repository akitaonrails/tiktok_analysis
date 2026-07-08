package X;

/* JADX INFO: renamed from: X.0CmO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.relation.repo.MaFVideoRepository", f = "MaFVideoRepository.kt", l = {21}, m = "load")
public final class C323620CmO extends AbstractC23140094w {
    public C323370Clz LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C323610CmN LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C323620CmO(C323610CmN c323610CmN, InterfaceC1364105Vn<? super C323620CmO> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c323610CmN;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MaFVideoRepository@cf8e.load$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLJFF = this.LLILLL.LIZLLL(null, this);
        C1C7U.LIZIZ("MaFVideoRepository@cf8e.load$1");
        return objLJFF;
    }
}
