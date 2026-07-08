package X;

import com.ss.android.ugc.aweme.im.sdk.chat.feature.mufquickdm.MufAffinityScoreRepository;

/* JADX INFO: renamed from: X.05OS, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.sdk.chat.feature.mufquickdm.MufAffinityScoreRepository", f = "MufAffinityScoreRepository.kt", l = {167}, m = "resetAndPopulateCache")
public final class C05OS extends AbstractC23140094w {
    public MufAffinityScoreRepository LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ MufAffinityScoreRepository LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C05OS(MufAffinityScoreRepository mufAffinityScoreRepository, InterfaceC1364105Vn<? super C05OS> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = mufAffinityScoreRepository;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MufAffinityScoreRepository@53bc.resetAndPopulateCache$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLJ = this.LLILLL.LJ(this);
        C1C7U.LIZIZ("MufAffinityScoreRepository@53bc.resetAndPopulateCache$1");
        return objLJ;
    }
}
