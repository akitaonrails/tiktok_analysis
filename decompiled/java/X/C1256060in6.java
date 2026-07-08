package X;

/* JADX INFO: renamed from: X.0in6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
@C09DV(c = "com.ss.android.ugc.profile.business.profile.background.ProfileBgRepository", f = "ProfileBgRepository.kt", l = {60}, m = "fetchPublicVideos")
public final class C1256060in6 extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C1256030in3 LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1256060in6(C1256030in3 c1256030in3, InterfaceC1364105Vn<? super C1256060in6> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c1256030in3;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ProfileBgRepository@b8fe.fetchPublicVideos$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLIZJ = this.LLILLJJLI.LIZJ(null, 0L, null, this);
        C1C7U.LIZIZ("ProfileBgRepository@b8fe.fetchPublicVideos$1");
        return objLIZJ;
    }
}
