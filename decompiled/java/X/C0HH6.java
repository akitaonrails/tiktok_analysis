package X;

import com.ss.android.ugc.profile.business.ur.socialavatar.SocialAvatarServiceImpl;

/* JADX INFO: renamed from: X.0HH6, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.profile.business.ur.socialavatar.SocialAvatarServiceImpl", f = "SocialAvatarServiceImpl.kt", l = {805, 809}, m = "deleteSocialAvatarAndStickers")
public final class C0HH6 extends AbstractC23140094w {
    public Object LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ SocialAvatarServiceImpl LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0HH6(SocialAvatarServiceImpl socialAvatarServiceImpl, InterfaceC1364105Vn<? super C0HH6> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = socialAvatarServiceImpl;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SocialAvatarServiceImpl@45de.deleteSocialAvatarAndStickers$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLIZIZ = this.LLILLL.LIZIZ(this);
        C1C7U.LIZIZ("SocialAvatarServiceImpl@45de.deleteSocialAvatarAndStickers$1");
        return objLIZIZ;
    }
}
