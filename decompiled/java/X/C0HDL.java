package X;

import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.services.IAvatarPublishStoryService;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.profile.business.ur.socialavatar.review.SocialAvatarEditViewModel;
import com.ss.android.ugc.profile.business.ur.socialavatar.review.SocialAvatarReviewFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS192S0000000_6;
import kotlin.jvm.internal.AFwS236S0000000_6;
import njp.a;

/* JADX INFO: renamed from: X.0HDL, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.profile.business.ur.socialavatar.review.SocialAvatarReviewFragment$uploadAndSaveAvatars$2$2", f = "SocialAvatarReviewFragment.kt", l = {}, m = "invokeSuspend")
public final class C0HDL extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ SocialAvatarReviewFragment LL;
    public final /* synthetic */ C436980HBo LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0HDL(SocialAvatarReviewFragment socialAvatarReviewFragment, C436980HBo c436980HBo, InterfaceC1364105Vn<? super C0HDL> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = socialAvatarReviewFragment;
        this.LLILLJJLI = c436980HBo;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0HDL(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Unit unit;
        IAvatarPublishStoryService iAvatarPublishStoryServiceAvatarService;
        C1C7U.LIZ("SocialAvatarReviewFragment@1d80.uploadAndSaveAvatars$2$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C19EG activity = this.LL.getActivity();
        if (activity != null) {
            SocialAvatarReviewFragment socialAvatarReviewFragment = this.LL;
            C436980HBo c436980HBo = this.LLILLJJLI;
            SocialAvatarEditViewModel socialAvatarEditViewModelUR = socialAvatarReviewFragment.UR();
            IExternalService iExternalService = (IExternalService) PluggableExtentionKt.pluggableSpi$default(IExternalService.class, false, false, false, 14, null);
            if (iExternalService != null && (iAvatarPublishStoryServiceAvatarService = iExternalService.avatarService()) != null) {
                iAvatarPublishStoryServiceAvatarService.publishDirectly(activity, socialAvatarEditViewModelUR.vQ2(c436980HBo, AFwS236S0000000_6.get$arr$(2)), false, false, AFwS192S0000000_6.get$arr$(1));
            }
            unit = Unit.LIZ;
        } else {
            unit = null;
        }
        C1C7U.LIZIZ("SocialAvatarReviewFragment@1d80.uploadAndSaveAvatars$2$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
