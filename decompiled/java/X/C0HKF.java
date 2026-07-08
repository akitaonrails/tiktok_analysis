package X;

import com.ss.android.ugc.aweme.socialavatar.SocialAvatarCreationServiceImpl;

/* JADX INFO: renamed from: X.0HKF, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.socialavatar.SocialAvatarCreationServiceImpl", f = "SocialAvatarCreationServiceImpl.kt", l = {428}, m = "requestCreateSocialAvatar")
public final class C0HKF extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ SocialAvatarCreationServiceImpl LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0HKF(SocialAvatarCreationServiceImpl socialAvatarCreationServiceImpl, InterfaceC1364105Vn<? super C0HKF> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = socialAvatarCreationServiceImpl;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SocialAvatarCreationServiceImpl@40e4.requestCreateSocialAvatar$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLJII = this.LLILLJJLI.LJII(null, null, 0.0f, null, false, 0, this);
        C1C7U.LIZIZ("SocialAvatarCreationServiceImpl@40e4.requestCreateSocialAvatar$1");
        return objLJII;
    }
}
