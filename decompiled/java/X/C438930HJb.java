package X;

import com.ss.android.ugc.profile.business.ur.socialavatar.datacenter.SocialAvatarCreationStatusServiceImpl;
import com.ss.android.ugc.profile.business.ur.socialavatar.network.SocialAvatarTaskStatusResponse;

/* JADX INFO: renamed from: X.0HJb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.profile.business.ur.socialavatar.datacenter.SocialAvatarCreationStatusServiceImpl", f = "SocialAvatarCreationStatusServiceImpl.kt", l = {84, 87}, m = "fetchAndUpdateStatus")
public final class C438930HJb extends AbstractC23140094w {
    public Object LL;
    public SocialAvatarTaskStatusResponse LLILLJJLI;
    public C259800zU LLILLL;
    public /* synthetic */ Object LLILZ;
    public final /* synthetic */ SocialAvatarCreationStatusServiceImpl LLILZIL;
    public int LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C438930HJb(SocialAvatarCreationStatusServiceImpl socialAvatarCreationStatusServiceImpl, InterfaceC1364105Vn<? super C438930HJb> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZIL = socialAvatarCreationStatusServiceImpl;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SocialAvatarCreationStatusServiceImpl@9580.fetchAndUpdateStatus$1");
        this.LLILZ = obj;
        this.LLILZLL |= Integer.MIN_VALUE;
        Object objLIZIZ = this.LLILZIL.LIZIZ(null, this);
        C1C7U.LIZIZ("SocialAvatarCreationStatusServiceImpl@9580.fetchAndUpdateStatus$1");
        return objLIZIZ;
    }
}
