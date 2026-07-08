package X;

import com.ss.android.ugc.profile.business.ur.socialavatar.datacenter.SocialAvatarStickerAnimationStatusServiceImpl;

/* JADX INFO: renamed from: X.05ED, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.profile.business.ur.socialavatar.datacenter.SocialAvatarStickerAnimationStatusServiceImpl", f = "SocialAvatarStickerAnimationStatusServiceImpl.kt", l = {76}, m = "requestAnimation-yxL6bBk")
public final class C05ED extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ SocialAvatarStickerAnimationStatusServiceImpl LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C05ED(SocialAvatarStickerAnimationStatusServiceImpl socialAvatarStickerAnimationStatusServiceImpl, InterfaceC1364105Vn<? super C05ED> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = socialAvatarStickerAnimationStatusServiceImpl;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SocialAvatarStickerAnimationStatusServiceImpl@bd0.requestAnimation$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLJ = this.LLILLJJLI.LJ(0L, 0, null, null, this);
        if (objLJ == C099R.LJFF()) {
            C1C7U.LIZIZ("SocialAvatarStickerAnimationStatusServiceImpl@bd0.requestAnimation$1");
            return objLJ;
        }
        C189200o6 c189200o6M1boximpl = C189200o6.m1boximpl(objLJ);
        C1C7U.LIZIZ("SocialAvatarStickerAnimationStatusServiceImpl@bd0.requestAnimation$1");
        return c189200o6M1boximpl;
    }
}
