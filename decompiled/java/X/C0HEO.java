package X;

import com.ss.android.ugc.profile.business.ur.socialavatar.network.SocialAvatarCreationApi;
import com.ss.android.ugc.profile.business.ur.socialavatar.network.StickerAnimationCreateRequest;
import com.ss.android.ugc.profile.business.ur.socialavatar.network.StickerAnimationCreateResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import njp.a;

/* JADX INFO: renamed from: X.0HEO, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.profile.business.ur.socialavatar.network.SafeSocialAvatarNetworkAPIImpl$createStickerAnimationTask$2", f = "SafeSocialAvatarNetworkAPIImpl.kt", l = {152}, m = "invokeSuspend")
public final class C0HEO extends C09AX implements Function1<InterfaceC1364105Vn<? super StickerAnimationCreateResponse>, Object> {
    public int LL;
    public final /* synthetic */ long LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ int LLILZ;
    public final /* synthetic */ C0HEN LLILZIL;
    public final /* synthetic */ String LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0HEO(long j, int i, int i2, C0HEN c0hen, String str, InterfaceC1364105Vn<? super C0HEO> interfaceC1364105Vn) {
        super(1, interfaceC1364105Vn);
        this.LLILLJJLI = j;
        this.LLILLL = i;
        this.LLILZ = i2;
        this.LLILZIL = c0hen;
        this.LLILZLL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0HEO(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(InterfaceC1364105Vn<? super StickerAnimationCreateResponse> interfaceC1364105Vn) {
        return ((a) create(interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SafeSocialAvatarNetworkAPIImpl@7c9f.createStickerAnimationTask$2");
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
            SocialAvatarCreationApi socialAvatarCreationApi = this.LLILZIL.LIZ;
            StickerAnimationCreateRequest stickerAnimationCreateRequest = new StickerAnimationCreateRequest(C2286608xc.LJFF(this.LLILLJJLI), this.LLILZLL, C2286608xc.LJ(this.LLILLL), C2286608xc.LJ(this.LLILZ));
            this.LL = 1;
            obj = socialAvatarCreationApi.createStickerAnimationTask(stickerAnimationCreateRequest, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("SafeSocialAvatarNetworkAPIImpl@7c9f.createStickerAnimationTask$2");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("SafeSocialAvatarNetworkAPIImpl@7c9f.createStickerAnimationTask$2");
        return obj;
    }
}
