package X;

import com.ss.android.ugc.profile.business.ur.socialavatar.review.SocialAvatarReviewFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0HDI, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.profile.business.ur.socialavatar.review.SocialAvatarReviewFragment$saveUserSelection$1$1", f = "SocialAvatarReviewFragment.kt", l = {}, m = "invokeSuspend")
public final class C0HDI extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C0HDR LL;
    public final /* synthetic */ SocialAvatarReviewFragment LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0HDI(C0HDR c0hdr, SocialAvatarReviewFragment socialAvatarReviewFragment, InterfaceC1364105Vn<? super C0HDI> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c0hdr;
        this.LLILLJJLI = socialAvatarReviewFragment;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0HDI(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SocialAvatarReviewFragment@1d80.saveUserSelection$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1389890mGx c1389890mGx = new C1389890mGx(this.LLILLJJLI);
        c1389890mGx.LJIIIZ(2131848597);
        c1389890mGx.LJIIJJI();
        SocialAvatarReviewFragment socialAvatarReviewFragment = this.LLILLJJLI;
        String str = SocialAvatarReviewFragment._pnsPageId;
        socialAvatarReviewFragment.cS(false, false);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SocialAvatarReviewFragment@1d80.saveUserSelection$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
