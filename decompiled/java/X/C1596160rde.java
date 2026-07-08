package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0rde, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
@C09DV(c = "com.ss.android.ugc.aweme.base.repo.FeedSkylightRepoV2", f = "FeedSkylightRepoV2.kt", l = {117}, m = "fetchSkylightData")
public final class C1596160rde extends AbstractC23140094w {
    public Function0 LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C1596060rdU LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1596160rde(C1596060rdU c1596060rdU, InterfaceC1364105Vn<? super C1596160rde> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c1596060rdU;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("FeedSkylightRepoV2@78c2.fetchSkylightData$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLIZLLL = this.LLILLL.LIZLLL(null, null, false, null, 0, 0, 0, 0, null, null, false, null, false, null, this);
        C1C7U.LIZIZ("FeedSkylightRepoV2@78c2.fetchSkylightData$1");
        return objLIZLLL;
    }
}
