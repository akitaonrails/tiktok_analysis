package X;

/* JADX INFO: renamed from: X.0HJp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.socialavatar.mixstudio.datasource.UserNetworkBackedSocialAvatarFastFlowService", f = "NetworkBackedSocialAvatarFastFlowService.kt", l = {178, 187, 188, 191, 194, 195}, m = "inProgressFlow")
public final class C439070HJp extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C439030HJl LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C439070HJp(C439030HJl c439030HJl, InterfaceC1364105Vn<? super C439070HJp> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c439030HJl;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("UserNetworkBackedSocialAvatarFastFlowService@5f99.inProgressFlow$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLIZJ = this.LLILLJJLI.LIZJ(this);
        C1C7U.LIZIZ("UserNetworkBackedSocialAvatarFastFlowService@5f99.inProgressFlow$1");
        return objLIZJ;
    }
}
