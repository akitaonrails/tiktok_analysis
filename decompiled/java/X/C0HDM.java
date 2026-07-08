package X;

import com.ss.android.ugc.profile.business.ur.socialavatar.review.SocialAvatarReviewFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0HDM, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.profile.business.ur.socialavatar.review.SocialAvatarReviewFragment$uploadAndSaveAvatars$2$1", f = "SocialAvatarReviewFragment.kt", l = {}, m = "invokeSuspend")
public final class C0HDM extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ SocialAvatarReviewFragment LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0HDM(SocialAvatarReviewFragment socialAvatarReviewFragment, InterfaceC1364105Vn<? super C0HDM> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = socialAvatarReviewFragment;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0HDM(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Unit unit;
        C1C7U.LIZ("SocialAvatarReviewFragment@1d80.uploadAndSaveAvatars$2$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C19EG activity = this.LL.getActivity();
        if (activity != null) {
            activity.finish();
            unit = Unit.LIZ;
        } else {
            unit = null;
        }
        C1C7U.LIZIZ("SocialAvatarReviewFragment@1d80.uploadAndSaveAvatars$2$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
