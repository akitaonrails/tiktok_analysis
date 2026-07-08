package X;

import android.os.Bundle;
import com.ss.android.ugc.profile.business.ur.socialavatar.SocialAvatarMainActivity;
import com.ss.android.ugc.profile.business.ur.socialavatar.review.SocialAvatarReviewFragment;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0HFB, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.profile.business.ur.socialavatar.SocialAvatarMainActivity$openAvatarReviewPage$2", f = "SocialAvatarMainActivity.kt", l = {}, m = "invokeSuspend")
public final class C0HFB extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ SocialAvatarMainActivity LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ Integer LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0HFB(SocialAvatarMainActivity socialAvatarMainActivity, boolean z, Integer num, InterfaceC1364105Vn<? super C0HFB> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = socialAvatarMainActivity;
        this.LLILLJJLI = z;
        this.LLILLL = num;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0HFB(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        int iIntValue;
        C1C7U.LIZ("SocialAvatarMainActivity@e4a3.openAvatarReviewPage$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        if (!this.LL.isFinishing()) {
            C1390130mHL c1390130mHL = this.LL.LL;
            if (c1390130mHL != null) {
                C786410Ut5.LLZ(c1390130mHL, 8);
            }
            int i = C2187451AjH.LIZ;
            C1720106oR.LJI("SocialAvatar", "SocialAvatarMainActivity openAvatarReviewPage");
            SocialAvatarReviewFragment socialAvatarReviewFragment = new SocialAvatarReviewFragment();
            Bundle bundle = new Bundle();
            bundle.putBoolean("is_first_entrance", this.LLILLJJLI);
            Integer num = this.LLILLL;
            if (num != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = 0;
            }
            bundle.putInt("task_status", iIntValue);
            C786410Ut5.LJJJI("enter_from", (String) this.LL.LLILLJJLI.getValue(), bundle);
            C786410Ut5.LJJJI("enter_method", (String) this.LL.LLILLL.getValue(), bundle);
            bundle.putInt("source", ((Number) this.LL.LLILZ.getValue()).intValue());
            socialAvatarReviewFragment.setArguments(bundle);
            C19EH c19ehLJIIJ = this.LL.getSupportFragmentManager().LJIIJ();
            c19ehLJIIJ.LJIJ(R.id.iiv, socialAvatarReviewFragment, null);
            c19ehLJIIJ.LJIIJ();
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SocialAvatarMainActivity@e4a3.openAvatarReviewPage$2");
        return unit;
    }
}
