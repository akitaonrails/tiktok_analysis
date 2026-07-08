package X;

import com.ss.android.ugc.profile.business.ur.socialavatar.SocialAvatarServiceImpl;

/* JADX INFO: renamed from: X.0HH8, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.profile.business.ur.socialavatar.SocialAvatarServiceImpl", f = "SocialAvatarServiceImpl.kt", l = {319}, m = "fetchImageResourceUrl")
public final class C0HH8 extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ SocialAvatarServiceImpl LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0HH8(SocialAvatarServiceImpl socialAvatarServiceImpl, InterfaceC1364105Vn<? super C0HH8> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = socialAvatarServiceImpl;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SocialAvatarServiceImpl@45de.fetchImageResourceUrl$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLIZJ = this.LLILLJJLI.LIZJ(null, this);
        C1C7U.LIZIZ("SocialAvatarServiceImpl@45de.fetchImageResourceUrl$1");
        return objLIZJ;
    }
}
