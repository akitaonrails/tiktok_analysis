package X;

import com.ss.android.ugc.profile.business.ur.socialavatar.SocialAvatarServiceImpl;

/* JADX INFO: renamed from: X.0HH5, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.profile.business.ur.socialavatar.SocialAvatarServiceImpl", f = "SocialAvatarServiceImpl.kt", l = {522}, m = "updateUserSelection")
public final class C0HH5 extends AbstractC23140094w {
    public C0HDY LL;
    public C437430HDh LLILLJJLI;
    public boolean LLILLL;
    public boolean LLILZ;
    public /* synthetic */ Object LLILZIL;
    public final /* synthetic */ SocialAvatarServiceImpl LLILZLL;
    public int LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0HH5(SocialAvatarServiceImpl socialAvatarServiceImpl, InterfaceC1364105Vn<? super C0HH5> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZLL = socialAvatarServiceImpl;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SocialAvatarServiceImpl@45de.updateUserSelection$1");
        this.LLILZIL = obj;
        this.LLIZ |= Integer.MIN_VALUE;
        Object objLJIJJLI = this.LLILZLL.LJIJJLI(null, null, false, false, null, null, this);
        C1C7U.LIZIZ("SocialAvatarServiceImpl@45de.updateUserSelection$1");
        return objLJIJJLI;
    }
}
