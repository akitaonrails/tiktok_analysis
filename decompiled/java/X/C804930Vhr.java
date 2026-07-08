package X;

/* JADX INFO: renamed from: X.0Vhr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
@C09DV(c = "com.ss.android.ugc.aweme.feed.suggestfollowing.FollowingFrequentUserService", f = "FollowingFrequentUserService.kt", l = {83}, m = "requestFrequentUserFromServer")
public final class C804930Vhr extends AbstractC23140094w {
    public C804900Vho LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C804900Vho LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C804930Vhr(C804900Vho c804900Vho, InterfaceC1364105Vn<? super C804930Vhr> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c804900Vho;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("FollowingFrequentUserService@51da.requestFrequentUserFromServer$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLJFF = this.LLILLL.LJFF(this);
        C1C7U.LIZIZ("FollowingFrequentUserService@51da.requestFrequentUserFromServer$1");
        return objLJFF;
    }
}
