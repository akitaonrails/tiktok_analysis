package X;

/* JADX INFO: renamed from: X.0HXr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.profile.business.ur.socialavatar.datacenter.SocialAvatarStickerAnimationStatusDataSource", f = "SocialAvatarStickerAnimationStatusDataSource.kt", l = {127}, m = "requestAnimation-BWLJW6A")
public final class C442730HXr extends AbstractC23140094w {
    public long LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C442720HXq LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C442730HXr(C442720HXq c442720HXq, InterfaceC1364105Vn<? super C442730HXr> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c442720HXq;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SocialAvatarStickerAnimationStatusDataSource@8127.requestAnimation$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLIZJ = this.LLILLL.LIZJ(0, 0L, null, this);
        if (objLIZJ == C099R.LJFF()) {
            C1C7U.LIZIZ("SocialAvatarStickerAnimationStatusDataSource@8127.requestAnimation$1");
            return objLIZJ;
        }
        C189200o6 c189200o6M1boximpl = C189200o6.m1boximpl(objLIZJ);
        C1C7U.LIZIZ("SocialAvatarStickerAnimationStatusDataSource@8127.requestAnimation$1");
        return c189200o6M1boximpl;
    }
}
