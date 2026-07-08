package X;

/* JADX INFO: renamed from: X.0CmP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.relation.repo.MaFVideoRepository", f = "MaFVideoRepository.kt", l = {54}, m = "loadMaFVideoList")
public final class C323630CmP extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C323610CmN LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C323630CmP(C323610CmN c323610CmN, InterfaceC1364105Vn<? super C323630CmP> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c323610CmN;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MaFVideoRepository@cf8e.loadMaFVideoList$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLJI = this.LLILLJJLI.LJI(null, this);
        C1C7U.LIZIZ("MaFVideoRepository@cf8e.loadMaFVideoList$1");
        return objLJI;
    }
}
