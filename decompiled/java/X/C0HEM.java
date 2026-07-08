package X;

import com.ss.android.ugc.profile.business.ur.socialavatar.network.SocialAvatarCreationApi;
import com.ss.android.ugc.profile.business.ur.socialavatar.network.StickerAnimationTasksListResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import njp.a;

/* JADX INFO: renamed from: X.0HEM, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.profile.business.ur.socialavatar.network.SafeSocialAvatarNetworkAPIImpl$listStickerAnimationTasks$2", f = "SafeSocialAvatarNetworkAPIImpl.kt", l = {164}, m = "invokeSuspend")
public final class C0HEM extends C09AX implements Function1<InterfaceC1364105Vn<? super StickerAnimationTasksListResponse>, Object> {
    public int LL;
    public final /* synthetic */ C0HEN LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0HEM(C0HEN c0hen, InterfaceC1364105Vn<? super C0HEM> interfaceC1364105Vn) {
        super(1, interfaceC1364105Vn);
        this.LLILLJJLI = c0hen;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0HEM(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(InterfaceC1364105Vn<? super StickerAnimationTasksListResponse> interfaceC1364105Vn) {
        return ((a) create(interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SafeSocialAvatarNetworkAPIImpl@7c9f.listStickerAnimationTasks$2");
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
            this.LL = 1;
            obj = socialAvatarCreationApi.listStickerAnimationTasks(this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("SafeSocialAvatarNetworkAPIImpl@7c9f.listStickerAnimationTasks$2");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("SafeSocialAvatarNetworkAPIImpl@7c9f.listStickerAnimationTasks$2");
        return obj;
    }
}
