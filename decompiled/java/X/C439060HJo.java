package X;

/* JADX INFO: renamed from: X.0HJo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.socialavatar.mixstudio.datasource.UserNetworkBackedSocialAvatarFastFlowService", f = "NetworkBackedSocialAvatarFastFlowService.kt", l = {243}, m = "getSocialAvatarTaskProgressOrError")
public final class C439060HJo extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C439030HJl LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C439060HJo(C439030HJl c439030HJl, InterfaceC1364105Vn<? super C439060HJo> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c439030HJl;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("UserNetworkBackedSocialAvatarFastFlowService@5f99.getSocialAvatarTaskProgressOrError$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLIZ = this.LLILLJJLI.LIZ(this);
        C1C7U.LIZIZ("UserNetworkBackedSocialAvatarFastFlowService@5f99.getSocialAvatarTaskProgressOrError$1");
        return objLIZ;
    }
}
