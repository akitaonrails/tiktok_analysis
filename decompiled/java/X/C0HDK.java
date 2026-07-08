package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.profile.business.ur.socialavatar.review.SocialAvatarEditViewModel;
import com.ss.android.ugc.profile.business.ur.socialavatar.review.SocialAvatarReviewFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS585S0100000_6;
import njp.a;

/* JADX INFO: renamed from: X.0HDK, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.profile.business.ur.socialavatar.review.SocialAvatarReviewFragment$setupPreviewLayout$1$1", f = "SocialAvatarReviewFragment.kt", l = {330}, m = "invokeSuspend")
public final class C0HDK extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ SocialAvatarReviewFragment LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0HDK(SocialAvatarReviewFragment socialAvatarReviewFragment, InterfaceC1364105Vn<? super C0HDK> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = socialAvatarReviewFragment;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0HDK(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("SocialAvatarReviewFragment@1d80.setupPreviewLayout$1$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            SocialAvatarReviewFragment socialAvatarReviewFragment = this.LLILLJJLI;
            String str = SocialAvatarReviewFragment._pnsPageId;
            socialAvatarReviewFragment.cS(false, false);
            C1389890mGx c1389890mGx = new C1389890mGx(this.LLILLJJLI);
            c1389890mGx.LJIIIZ(2131848597);
            c1389890mGx.LJIIJJI();
        }
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            C19EG activity = this.LLILLJJLI.getActivity();
            if (activity != null) {
                SocialAvatarReviewFragment socialAvatarReviewFragment2 = this.LLILLJJLI;
                SocialAvatarEditViewModel socialAvatarEditViewModelUR = socialAvatarReviewFragment2.UR();
                String enterFrom = socialAvatarReviewFragment2.getEnterFrom();
                AwS585S0100000_6 awS585S0100000_6 = new AwS585S0100000_6(socialAvatarReviewFragment2, 10);
                this.LL = 1;
                obj = C23250099c.LJI(this, C0PEM.LIZJ, new C436970HBn(socialAvatarEditViewModelUR, activity, enterFrom, awS585S0100000_6, null));
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("SocialAvatarReviewFragment@1d80.setupPreviewLayout$1$1");
                    return objLJFF;
                }
            }
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("SocialAvatarReviewFragment@1d80.setupPreviewLayout$1$1");
            return unit;
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("SocialAvatarReviewFragment@1d80.setupPreviewLayout$1$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
