package X;

import com.ss.android.ugc.profile.business.ur.socialavatar.datacenter.SocialAvatarEntranceDynamicDataSource;

/* JADX INFO: renamed from: X.0H9v, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.profile.business.ur.socialavatar.datacenter.SocialAvatarEntranceDynamicDataSource", f = "SocialAvatarEntranceDynamicDataSource.kt", l = {220, 221}, m = "fetchFromServer")
public final class C436530H9v extends AbstractC23140094w {
    public boolean LL;
    public long LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ SocialAvatarEntranceDynamicDataSource LLILZ;
    public int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C436530H9v(SocialAvatarEntranceDynamicDataSource socialAvatarEntranceDynamicDataSource, InterfaceC1364105Vn<? super C436530H9v> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZ = socialAvatarEntranceDynamicDataSource;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SocialAvatarEntranceDynamicDataSource@248e.fetchFromServer$1");
        this.LLILLL = obj;
        this.LLILZIL |= Integer.MIN_VALUE;
        Object objLIZ = this.LLILZ.LIZ(false, this);
        C1C7U.LIZIZ("SocialAvatarEntranceDynamicDataSource@248e.fetchFromServer$1");
        return objLIZ;
    }
}
