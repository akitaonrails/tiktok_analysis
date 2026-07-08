package X;

import android.content.Context;
import com.ss.android.ugc.profile.business.ur.socialavatar.review.SocialAvatarReviewFragment;
import com.ss.android.ugc.ur.socialavatar.ISocialAvatarService;
import com.ss.android.ugc.ur.socialavatar.SocialAvatarQuotaResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0HDJ, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.profile.business.ur.socialavatar.review.SocialAvatarReviewFragment$triggerRegenerate$1$1", f = "SocialAvatarReviewFragment.kt", l = {}, m = "invokeSuspend")
public final class C0HDJ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ SocialAvatarQuotaResponse LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ SocialAvatarReviewFragment LLILLL;
    public final /* synthetic */ Context LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0HDJ(SocialAvatarQuotaResponse socialAvatarQuotaResponse, boolean z, SocialAvatarReviewFragment socialAvatarReviewFragment, Context context, InterfaceC1364105Vn<? super C0HDJ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = socialAvatarQuotaResponse;
        this.LLILLJJLI = z;
        this.LLILLL = socialAvatarReviewFragment;
        this.LLILZ = context;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0HDJ(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String string;
        String str;
        String str2;
        C1C7U.LIZ("SocialAvatarReviewFragment@1d80.triggerRegenerate$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        if (Intrinsics.LJFF(this.LL.isAllowed(), true)) {
            if (this.LLILLJJLI) {
                str2 = "regenerate_pop_up_edit_page";
            } else if (this.LLILLL.VR()) {
                str2 = "more_info_pop_up_edit_page";
            } else {
                str2 = "more_info_pop_up_edit_detail_page";
            }
            ((ISocialAvatarService) this.LLILLL.LLJJLIIIJLLLLLLLZ.getValue()).LJIILLIIL(new C0HHA(this.LLILZ, "enlarged_profile_regenerate", str2, null, null, ((Number) this.LLILLL.LLJJL.getValue()).intValue(), false, true, C0HZ2.REVIEW_PAGE_REGENERATE, false, null, 3232), EnumC437540HDs.START_REGENERATE, null);
        } else {
            if (C2277121EBa.LIZ()) {
                string = this.LLILZ.getString(2131838912, C2286608xc.LJ(C2277121EBa.LIZIZ()));
            } else {
                string = this.LLILZ.getString(2131827074);
            }
            C1389890mGx c1389890mGx = new C1389890mGx(this.LLILLL);
            c1389890mGx.LJIIJ(string);
            c1389890mGx.LJIIJJI();
            C2344009Gk c2344009Gk = new C2344009Gk();
            if (this.LLILLL.VR()) {
                str = "edit_sa_page";
            } else {
                str = "edit_sa_detail_page";
            }
            c2344009Gk.LJIIIIZZ("page", str);
            c2344009Gk.LJIIIIZZ("enter_from", this.LLILLL.getEnterFrom());
            C20684815ws.LJIILLIIL("ttsocial_avatar_show_generation_limit_toast", c2344009Gk.LIZ);
        }
        SocialAvatarReviewFragment socialAvatarReviewFragment = this.LLILLL;
        String str3 = SocialAvatarReviewFragment._pnsPageId;
        socialAvatarReviewFragment.cS(false, false);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SocialAvatarReviewFragment@1d80.triggerRegenerate$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
