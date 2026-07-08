package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0rdf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
@C09DV(c = "com.ss.android.ugc.aweme.base.repo.FollowingFeedSkylightRepo", f = "FollowingFeedSkylightRepo.kt", l = {95}, m = "fetchSkylightData")
public final class C1596170rdf extends AbstractC23140094w {
    public Function0 LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C1596050rdT LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1596170rdf(C1596050rdT c1596050rdT, InterfaceC1364105Vn<? super C1596170rdf> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c1596050rdT;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("FollowingFeedSkylightRepo@df9b.fetchSkylightData$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLIZLLL = this.LLILLL.LIZLLL(null, null, false, null, 0, 0, 0, 0, null, null, false, null, false, null, this);
        C1C7U.LIZIZ("FollowingFeedSkylightRepo@df9b.fetchSkylightData$1");
        return objLIZLLL;
    }
}
