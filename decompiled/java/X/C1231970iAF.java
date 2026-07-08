package X;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.ss.android.ugc.aweme.account.login.v2.network.CheckNicknameResponse;
import com.ss.android.ugc.profile.business.ur.ui.ProfileEditNicknameFragment;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS257S0000000_19;
import kotlin.jvm.internal.AwS598S0100000_19;
import njp.a;

/* JADX INFO: renamed from: X.0iAF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
@C09DV(c = "com.ss.android.ugc.profile.business.ur.ui.ProfileEditNicknameFragment$showNewBlueVDialog$1$1", f = "ProfileEditNicknameFragment.kt", l = {}, m = "invokeSuspend")
public final class C1231970iAF extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ ProfileEditNicknameFragment LL;
    public final /* synthetic */ CheckNicknameResponse LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1231970iAF(ProfileEditNicknameFragment profileEditNicknameFragment, CheckNicknameResponse checkNicknameResponse, InterfaceC1364105Vn<? super C1231970iAF> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = profileEditNicknameFragment;
        this.LLILLJJLI = checkNicknameResponse;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1231970iAF(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String string;
        int iIntValue;
        C1C7U.LIZ("ProfileEditNicknameFragment@44a0.showNewBlueVDialog$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.zS();
        Integer num = this.LLILLJJLI.statusCode;
        if (num != null && num.intValue() == 0) {
            C19EG activity = this.LL.getActivity();
            if (activity == null) {
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("ProfileEditNicknameFragment@44a0.showNewBlueVDialog$1$1");
                return unit;
            }
            C0HTI c0hti = new C0HTI();
            c0hti.LIZ = R.drawable.wy;
            Drawable drawableLIZ = c0hti.LIZ(activity);
            ImageView imageView = new ImageView(activity);
            imageView.setImageDrawable(drawableLIZ);
            C1397580mTM c1397580mTM = new C1397580mTM(activity);
            C929103k9.LIZ(c1397580mTM, imageView, AFwS257S0000000_19.get$arr$(577));
            Resources resources = this.LL.getResources();
            ProfileEditNicknameFragment profileEditNicknameFragment = this.LL;
            c1397580mTM.LIZIZ(resources.getQuantityString(2131755427, profileEditNicknameFragment.LLJJJ, profileEditNicknameFragment.nS(), C2286608xc.LJ(this.LL.LLJJJ)));
            C985403tE.LIZ(c1397580mTM, new AwS598S0100000_19(this.LL, 544));
            c1397580mTM.LJII = false;
            new C1397510mTF(c1397580mTM).LIZLLL();
            C1232140iAW.LIZ.getClass();
            C20684815ws.LJIILLIIL("nickname_uniq_successful_popup_show", new C2344009Gk().LIZ);
        } else {
            C1389890mGx c1389890mGx = new C1389890mGx(this.LL);
            if (C123100dR.LIZ(this.LLILLJJLI.statusMsg)) {
                string = this.LLILLJJLI.statusMsg;
            } else {
                string = this.LL.getString(2131848597);
            }
            c1389890mGx.LJIIJ(string);
            c1389890mGx.LJIIJJI();
            C1232140iAW c1232140iAW = C1232140iAW.LIZ;
            Integer num2 = this.LLILLJJLI.statusCode;
            c1232140iAW.getClass();
            C2344009Gk c2344009Gk = new C2344009Gk();
            if (num2 != null) {
                iIntValue = num2.intValue();
            } else {
                iIntValue = -1;
            }
            c2344009Gk.LIZJ(iIntValue, "error_code");
            C20684815ws.LJIILLIIL("nickname_uniq_unsuccess_toast", c2344009Gk.LIZ);
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("ProfileEditNicknameFragment@44a0.showNewBlueVDialog$1$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
