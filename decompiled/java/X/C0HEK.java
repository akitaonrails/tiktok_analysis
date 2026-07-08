package X;

import com.ss.android.ugc.profile.business.ur.socialavatar.network.SocialAvatarCreationApi;
import com.ss.android.ugc.profile.business.ur.socialavatar.network.SocialAvatarTaskProgressResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import njp.a;

/* JADX INFO: renamed from: X.0HEK, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.profile.business.ur.socialavatar.network.SafeSocialAvatarNetworkAPIImpl$getSocialAvatarTaskProgress$2", f = "SafeSocialAvatarNetworkAPIImpl.kt", l = {87}, m = "invokeSuspend")
public final class C0HEK extends C09AX implements Function1<InterfaceC1364105Vn<? super SocialAvatarTaskProgressResponse>, Object> {
    public int LL;
    public final /* synthetic */ C0HEN LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0HEK(C0HEN c0hen, String str, int i, InterfaceC1364105Vn<? super C0HEK> interfaceC1364105Vn) {
        super(1, interfaceC1364105Vn);
        this.LLILLJJLI = c0hen;
        this.LLILLL = str;
        this.LLILZ = i;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0HEK(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(InterfaceC1364105Vn<? super SocialAvatarTaskProgressResponse> interfaceC1364105Vn) {
        return ((a) create(interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SafeSocialAvatarNetworkAPIImpl@7c9f.getSocialAvatarTaskProgress$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            SocialAvatarCreationApi socialAvatarCreationApi = this.LLILLJJLI.LIZ;
            String str = this.LLILLL;
            Integer numLJ = C2286608xc.LJ(this.LLILZ);
            this.LL = 1;
            obj = socialAvatarCreationApi.getSocialAvatarTaskProgress(str, numLJ, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("SafeSocialAvatarNetworkAPIImpl@7c9f.getSocialAvatarTaskProgress$2");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("SafeSocialAvatarNetworkAPIImpl@7c9f.getSocialAvatarTaskProgress$2");
        return obj;
    }
}
