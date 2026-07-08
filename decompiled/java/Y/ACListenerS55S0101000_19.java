package Y;

import X.AbstractC848400XPy;
import X.C0XQ7;
import X.C0XTR;
import X.C1215960hkQ;
import X.C1216070hkb;
import X.C1248150iaL;
import X.C1248170iaN;
import X.C1248190iaP;
import X.C1252550ihR;
import X.C1252570ihT;
import X.C13BV;
import X.C1440005kM;
import X.C19EG;
import X.C786410Ut5;
import X.C852810Xct;
import X.EnumC1237820iJg;
import X.InterfaceC1215870hkH;
import android.os.Bundle;
import android.view.View;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.IBindService;
import com.ss.android.ugc.aweme.account.login.twostep.TOTPCodeVerifyFragment;
import com.ss.android.ugc.aweme.account.login.twostep.TwoStepVerifyEmailFor2046Fragment;
import com.ss.android.ugc.aweme.account.login.twostep.TwoStepVerifySmsFor2046Fragment;
import com.ss.android.ugc.aweme.account.setpwd.VerifyPasswordFragment;
import com.ss.android.ugc.aweme.profile.model.SignatureExtraInfo;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.profile.business.ur.ui.ProfileEditBioFragment;
import com.ss.android.ugc.profile.business.ur.ui.ProfileEditNicknameFragment;
import java.util.List;

/* JADX INFO: loaded from: classes20.dex */
public class ACListenerS55S0101000_19 implements View.OnClickListener {
    public final int $t;
    public int i1;
    public Object l0;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        switch (this.$t) {
            case 0:
                onClick$0(this, view);
                break;
            case 1:
                onClick$1(this, view);
                break;
            case 2:
                onClick$2(this, view);
                break;
            case 3:
                onClick$3(this, view);
                break;
            case 4:
                onClick$4(this, view);
                break;
            case 5:
                onClick$5(this, view);
                break;
            case 6:
                onClick$6(this, view);
                break;
            case 7:
                onClick$7(this, view);
                break;
        }
    }

    public static final void onClick$0(ACListenerS55S0101000_19 aCListenerS55S0101000_19, View view) {
        VerifyPasswordFragment verifyPasswordFragment = (VerifyPasswordFragment) aCListenerS55S0101000_19.l0;
        Bundle arguments = verifyPasswordFragment.getArguments();
        if (arguments != null) {
            arguments.putInt("next_page", aCListenerS55S0101000_19.i1);
        } else {
            arguments = new Bundle();
        }
        verifyPasswordFragment.fo(arguments);
    }

    public static final void onClick$1(ACListenerS55S0101000_19 aCListenerS55S0101000_19, View view) {
        C1252570ihT c1252570ihT = C1252570ihT.LIZ;
        boolean z = ((C1248170iaN) ListProtector.get(((C1248150iaL) aCListenerS55S0101000_19.l0).LL, aCListenerS55S0101000_19.i1)).LJ;
        c1252570ihT.getClass();
        C1252570ihT.LIZLLL("photo", z);
        ((C1248150iaL) aCListenerS55S0101000_19.l0).getClass();
        C1440005kM.LIZ(new C1248190iaP(1, ""));
    }

    public static final void onClick$2(ACListenerS55S0101000_19 aCListenerS55S0101000_19, View view) throws Throwable {
        String nickname;
        C1252570ihT c1252570ihT = C1252570ihT.LIZ;
        boolean z = ((C1248170iaN) ListProtector.get(((C1248150iaL) aCListenerS55S0101000_19.l0).LL, aCListenerS55S0101000_19.i1)).LJ;
        c1252570ihT.getClass();
        C1252570ihT.LIZLLL("name", z);
        C1248150iaL c1248150iaL = (C1248150iaL) aCListenerS55S0101000_19.l0;
        c1248150iaL.getClass();
        IAccountUserService iAccountUserServiceLJFF = C0XQ7.LJFF();
        User curUser = null;
        if (iAccountUserServiceLJFF != null) {
            curUser = ((AbstractC848400XPy) iAccountUserServiceLJFF).getCurUser();
        }
        if (curUser == null || (nickname = curUser.getNickname()) == null) {
            nickname = "";
        }
        C1252550ihR.LIZ.getClass();
        ProfileEditNicknameFragment profileEditNicknameFragmentLIZ = C1215960hkQ.LIZ(C1252550ihR.LJI(curUser, "click_card", "nickname"), nickname);
        profileEditNicknameFragmentLIZ.setUserVisibleHint(true);
        profileEditNicknameFragmentLIZ.show(c1248150iaL.LLILLJJLI.getSupportFragmentManager(), "EditNicknameDialog");
    }

    public static final void onClick$3(ACListenerS55S0101000_19 aCListenerS55S0101000_19, View view) {
        C1252570ihT c1252570ihT = C1252570ihT.LIZ;
        boolean z = ((C1248170iaN) ListProtector.get(((C1248150iaL) aCListenerS55S0101000_19.l0).LL, aCListenerS55S0101000_19.i1)).LJ;
        c1252570ihT.getClass();
        C1252570ihT.LIZLLL("phone_num", z);
        final C1248150iaL c1248150iaL = (C1248150iaL) aCListenerS55S0101000_19.l0;
        c1248150iaL.getClass();
        IBindService iBindServiceLIZ = C0XQ7.LIZ();
        C19EG c19eg = c1248150iaL.LLILLJJLI;
        Bundle bundle = new Bundle();
        C786410Ut5.LJJJI("profile_bind_from", "click_mission_card", bundle);
        bundle.putInt("phone_number_source", EnumC1237820iJg.DYA_BIND_PHONE_NUMBER_SOURCE_TYPE_PROFILE_MISSION_CARD.getValue());
        iBindServiceLIZ.bindMobile(c19eg, "personal_homepage", bundle, new C0XTR() { // from class: X.0TnZ
            @Override // X.C0XTR
            public final void onResult(int i, int i2, Object obj) {
                if (i == 7 && i2 == 1) {
                    C1389890mGx c1389890mGx = new C1389890mGx(c1248150iaL.LLILLJJLI);
                    c1389890mGx.LJIIIZ(2131827391);
                    c1389890mGx.LJIIJJI();
                    C19EG c19eg2 = c1248150iaL.LLILLJJLI;
                    C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(c19eg2), C0PEM.LIZJ, null, new C757500TnY(c19eg2, null), 2);
                }
            }
        });
    }

    public static final void onClick$4(ACListenerS55S0101000_19 aCListenerS55S0101000_19, View view) throws Throwable {
        User curUser;
        String str;
        C1252570ihT c1252570ihT = C1252570ihT.LIZ;
        boolean z = ((C1248170iaN) ListProtector.get(((C1248150iaL) aCListenerS55S0101000_19.l0).LL, aCListenerS55S0101000_19.i1)).LJ;
        c1252570ihT.getClass();
        C1252570ihT.LIZLLL("bio", z);
        C1248150iaL c1248150iaL = (C1248150iaL) aCListenerS55S0101000_19.l0;
        c1248150iaL.getClass();
        IAccountUserService iAccountUserServiceLJFF = C0XQ7.LJFF();
        if (iAccountUserServiceLJFF != null) {
            curUser = ((AbstractC848400XPy) iAccountUserServiceLJFF).getCurUser();
        } else {
            curUser = null;
        }
        String str2 = ProfileEditBioFragment._pnsPageId;
        if (curUser == null || (str = curUser.signature) == null) {
            str = "";
        }
        C1252550ihR.LIZ.getClass();
        ProfileEditBioFragment profileEditBioFragmentLIZ = C1216070hkb.LIZ(C1252550ihR.LJI(curUser, "click_card", "bio"), str, C13BV.INSTANCE);
        profileEditBioFragmentLIZ.setUserVisibleHint(true);
        profileEditBioFragmentLIZ.LLJILJIL = new InterfaceC1215870hkH() { // from class: X.0iaK
            @Override // X.InterfaceC1215870hkH
            public final void LIZ(String str3, List<SignatureExtraInfo> list) {
                C1440005kM.LIZ(new C1248190iaP(3, str3));
            }
        };
        profileEditBioFragmentLIZ.show(c1248150iaL.LLILLJJLI.getSupportFragmentManager(), "EditNicknameDialog");
    }

    public static final void onClick$5(ACListenerS55S0101000_19 aCListenerS55S0101000_19, View view) {
        TwoStepVerifyEmailFor2046Fragment twoStepVerifyEmailFor2046Fragment = (TwoStepVerifyEmailFor2046Fragment) aCListenerS55S0101000_19.l0;
        Bundle arguments = twoStepVerifyEmailFor2046Fragment.getArguments();
        if (arguments != null) {
            int i = aCListenerS55S0101000_19.i1;
            TwoStepVerifyEmailFor2046Fragment twoStepVerifyEmailFor2046Fragment2 = (TwoStepVerifyEmailFor2046Fragment) aCListenerS55S0101000_19.l0;
            arguments.putInt("next_page", i);
            C852810Xct c852810Xct = C852810Xct.LIZ;
            String email = twoStepVerifyEmailFor2046Fragment2.getEmail();
            c852810Xct.getClass();
            C852810Xct.LJIILLIIL(arguments, email);
        } else {
            arguments = new Bundle();
        }
        twoStepVerifyEmailFor2046Fragment.fo(arguments);
    }

    public static final void onClick$6(ACListenerS55S0101000_19 aCListenerS55S0101000_19, View view) {
        TwoStepVerifySmsFor2046Fragment twoStepVerifySmsFor2046Fragment = (TwoStepVerifySmsFor2046Fragment) aCListenerS55S0101000_19.l0;
        Bundle arguments = twoStepVerifySmsFor2046Fragment.getArguments();
        if (arguments != null) {
            arguments.putInt("next_page", aCListenerS55S0101000_19.i1);
        } else {
            arguments = new Bundle();
        }
        twoStepVerifySmsFor2046Fragment.fo(arguments);
    }

    public static final void onClick$7(ACListenerS55S0101000_19 aCListenerS55S0101000_19, View view) {
        TOTPCodeVerifyFragment tOTPCodeVerifyFragment = (TOTPCodeVerifyFragment) aCListenerS55S0101000_19.l0;
        Bundle arguments = tOTPCodeVerifyFragment.getArguments();
        if (arguments != null) {
            arguments.putInt("next_page", aCListenerS55S0101000_19.i1);
        } else {
            arguments = new Bundle();
        }
        tOTPCodeVerifyFragment.fo(arguments);
    }

    public ACListenerS55S0101000_19(Object obj, int i, int i2) {
        this.$t = i2;
        this.l0 = obj;
        this.i1 = i;
    }
}
