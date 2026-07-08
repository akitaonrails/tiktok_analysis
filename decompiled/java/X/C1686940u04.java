package X;

/* JADX INFO: renamed from: X.0u04, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
@C09DV(c = "com.ss.android.ugc.aweme.portrait.repository.AIPortraitCustomizeRepository", f = "AIPortraitCustomizeRepository.kt", l = {68}, m = "fetchRecommendStyles")
public final class C1686940u04 extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C1686950u05 LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1686940u04(C1686950u05 c1686950u05, InterfaceC1364105Vn<? super C1686940u04> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c1686950u05;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AIPortraitCustomizeRepository@3901.fetchRecommendStyles$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLIZ = this.LLILLJJLI.LIZ(0, 0, this);
        C1C7U.LIZIZ("AIPortraitCustomizeRepository@3901.fetchRecommendStyles$1");
        return objLIZ;
    }
}
