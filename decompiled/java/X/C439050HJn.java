package X;

/* JADX INFO: renamed from: X.0HJn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.socialavatar.mixstudio.datasource.UserNetworkBackedSocialAvatarFastFlowService", f = "NetworkBackedSocialAvatarFastFlowService.kt", l = {231}, m = "getSocialAvatarTaskStatus")
public final class C439050HJn extends AbstractC23140094w {
    public InterfaceC439080HJq LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C439030HJl LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C439050HJn(C439030HJl c439030HJl, InterfaceC1364105Vn<? super C439050HJn> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c439030HJl;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("UserNetworkBackedSocialAvatarFastFlowService@5f99.getSocialAvatarTaskStatus$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLIZIZ = this.LLILLL.LIZIZ(null, this);
        C1C7U.LIZIZ("UserNetworkBackedSocialAvatarFastFlowService@5f99.getSocialAvatarTaskStatus$1");
        return objLIZIZ;
    }
}
