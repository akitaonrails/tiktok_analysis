package X;

/* JADX INFO: renamed from: X.0CrC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.aivideo.detail.repo.TakoAIVideoRepository$operator$1", f = "TakoAIVideoRepository.kt", l = {30, 32}, m = "loadMoreVideoList")
public final class C326600CrC extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C326590CrB LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C326600CrC(C326590CrB c326590CrB, InterfaceC1364105Vn<? super C326600CrC> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c326590CrB;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TakoAIVideoRepository@601e.operator$1$loadMoreVideoList$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objZ = this.LLILLJJLI.z(this);
        C1C7U.LIZIZ("TakoAIVideoRepository@601e.operator$1$loadMoreVideoList$1");
        return objZ;
    }
}
