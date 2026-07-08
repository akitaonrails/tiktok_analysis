package X;

import Y.AfS182S0100000_13;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.activity.ComponentActivity;
import androidx.lifecycle.ViewModelLazy;
import com.bytedance.ies.foundation.activity.BaseActivity;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.account.login.twostep.TwoStepVerifyEmailFor2046Fragment;
import com.ss.android.ugc.aweme.account.login.v2.base.AccountFlowSharedViewModel;
import com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment;
import com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment;
import com.ss.android.ugc.aweme.account.login.v2.ui.fragments.EmailLinkVerifyFragment;
import com.ss.android.ugc.aweme.account.main.AgeGateAccountWrapperFragment;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS420S0200000_19;
import kotlin.jvm.internal.AwS557S0100000_13;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0iJG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public abstract class AbstractActivityC1237560iJG extends BaseActivity {
    public BaseAccountFlowFragment LL;
    public boolean LLILLL;
    public final ViewModelLazy LLILLJJLI = new ViewModelLazy(C13LE.LIZ(AccountFlowSharedViewModel.class), new AwS563S0100000_19((ComponentActivity) this, 235), new AwS563S0100000_19((ComponentActivity) this, 234), new AwS420S0200000_19((Function0) null, this, 20));
    public final C01GW LLILZ = C452501pT.LIZIZ(new AwS563S0100000_19(this, 233));

    public abstract void LLLLZLLIL(Bundle bundle);

    public abstract void LLLLZLLLI(Bundle bundle);

    public final boolean LLLLZIL() {
        return ((Boolean) this.LLILZ.getValue()).booleanValue();
    }

    public final AccountFlowSharedViewModel LLLLZLL() {
        return (AccountFlowSharedViewModel) this.LLILLJJLI.getValue();
    }

    public final BaseAccountFlowFragment LLLLZI() {
        return (BaseAccountFlowFragment) getSupportFragmentManager().LJJJJZ(R.id.iiv);
    }

    @Override // X.ActivityC21503719Dn, androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        BaseAccountFlowFragment baseAccountFlowFragmentLLLLZI = LLLLZI();
        if (baseAccountFlowFragmentLLLLZI != null && baseAccountFlowFragmentLLLLZI.onBackPressed()) {
            AccountFlowSharedViewModel accountFlowSharedViewModelLLLLZLL = LLLLZLL();
            if (accountFlowSharedViewModelLLLLZLL.yQ2()) {
                C1237480iJ8 c1237480iJ8 = accountFlowSharedViewModelLLLLZLL.LLILZLL;
                if (c1237480iJ8 == null) {
                    c1237480iJ8 = null;
                }
                if (c1237480iJ8.LIZ() instanceof InterfaceC1237070iIT) {
                    return;
                }
            }
            LLLLZLL().xQ2();
            return;
        }
        if (LLLLZI() instanceof AgeGateAccountWrapperFragment) {
            super.onBackPressed();
            return;
        }
        LLLLZLL().xQ2();
        if (getSupportFragmentManager().LJJLIIIIJ() == 1) {
            finish();
        } else if (isActive()) {
            getSupportFragmentManager().LJLLILLLL();
        }
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        C847910XOb.LIZ.getClass();
        C0XFF.LIZ("TTPRelated", "end ttp context");
        ArrayList arrayList = (ArrayList) C847910XOb.LJIIIIZZ;
        if (!arrayList.isEmpty()) {
            C19719612Di.LJJIJIIJI(arrayList);
        }
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public void onStart() {
        super.onStart();
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x0140  */
    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, X.C19EG, androidx.activity.ComponentActivity, X.C19FO, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r24) {
        /*
            Method dump skipped, instruction units count: 431
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractActivityC1237560iJG.onCreate(android.os.Bundle):void");
    }

    @Override // X.ActivityC21503719Dn, androidx.activity.ComponentActivity, android.app.Activity
    public final void onNewIntent(Intent intent) {
        String email;
        super.onNewIntent(intent);
        C0XYD c0xydLLLLZI = LLLLZI();
        String strLLLLLZL = LLLLLZL(intent, "code");
        if (strLLLLLZL != null) {
            if (c0xydLLLLZI instanceof TwoStepVerifyEmailFor2046Fragment) {
                ((TwoStepVerifyEmailFor2046Fragment) c0xydLLLLZI).ET(strLLLLLZL, "link");
                return;
            }
            if (c0xydLLLLZI instanceof InterfaceC1237610iJL) {
                ((InterfaceC1237610iJL) c0xydLLLLZI).Tk(strLLLLLZL, "link");
                return;
            }
            if (!(c0xydLLLLZI instanceof EmailLinkVerifyFragment)) {
                return;
            }
            EmailLinkVerifyFragment emailLinkVerifyFragment = (EmailLinkVerifyFragment) c0xydLLLLZI;
            Bundle arguments = emailLinkVerifyFragment.getArguments();
            if (arguments != null) {
                C786410Ut5.LJJJI("verify_method", "link", arguments);
            }
            String str = "resend";
            if (Intrinsics.LJFF(emailLinkVerifyFragment.RR(), "popup_verify_1p_email") || (Intrinsics.LJFF(emailLinkVerifyFragment.RR(), "popup_change_1p_email") && emailLinkVerifyFragment.hT())) {
                C0XZ4 c0xz4 = C0XZ4.LIZ;
                if (!emailLinkVerifyFragment.LLLLIL) {
                    str = "user_click";
                }
                c0xz4.LJJJ(emailLinkVerifyFragment, emailLinkVerifyFragment, strLLLLLZL, 6, null, "link", str).LJIIIIZZ(new AfS182S0100000_13(emailLinkVerifyFragment, 86)).LJIILL();
                return;
            }
            if (Intrinsics.LJFF(emailLinkVerifyFragment.RR(), "popup_change_1p_email") && !emailLinkVerifyFragment.hT()) {
                C0XZ4 c0xz42 = C0XZ4.LIZ;
                String email2 = emailLinkVerifyFragment.getEmail();
                C852810Xct.LIZ.getClass();
                String strLJIIJ = C852810Xct.LJIIJ(emailLinkVerifyFragment);
                boolean z = emailLinkVerifyFragment.requireArguments().getBoolean("from_changePwd", false);
                C854460XfY.LIZ.getClass();
                Map mapLJIIJJI = C854460XfY.LJIIJJI(emailLinkVerifyFragment);
                if (!emailLinkVerifyFragment.LLLLIL) {
                    str = "user_click";
                }
                c0xz42.LJ(emailLinkVerifyFragment, emailLinkVerifyFragment, email2, strLLLLLZL, strLJIIJ, z, mapLJIIJJI, "link", str).LJIIIIZZ(new AfS182S0100000_13(emailLinkVerifyFragment, 87)).LJIILL();
                return;
            }
            if (Intrinsics.LJFF(emailLinkVerifyFragment.RR(), "signup")) {
                C851630Xaz c851630Xaz = C851630Xaz.LIZ;
                String email3 = emailLinkVerifyFragment.getEmail();
                String strUR = emailLinkVerifyFragment.UR();
                c851630Xaz.getClass();
                C851630Xaz.LIZ(emailLinkVerifyFragment, email3, strLLLLLZL, "link", strUR);
                return;
            }
            if (Intrinsics.LJFF(emailLinkVerifyFragment.RR(), "failed_3p_login")) {
                String enterFrom = emailLinkVerifyFragment.getEnterFrom();
                emailLinkVerifyFragment.getEnterMethod();
                emailLinkVerifyFragment.getEmail();
                C0XZ3.LIZIZ(enterFrom, emailLinkVerifyFragment, emailLinkVerifyFragment, strLLLLLZL, emailLinkVerifyFragment.eT(), emailLinkVerifyFragment.SR(), "link", new AwS557S0100000_13(emailLinkVerifyFragment, 143));
                return;
            }
            Map<String, String> mapNR = emailLinkVerifyFragment.NR();
            if (emailLinkVerifyFragment.iT()) {
                mapNR.put("passport_ticket", emailLinkVerifyFragment.eT());
            }
            C0XZ4 c0xz43 = C0XZ4.LIZ;
            if (emailLinkVerifyFragment.iT()) {
                email = "";
            } else {
                email = emailLinkVerifyFragment.getEmail();
            }
            String strUR2 = emailLinkVerifyFragment.UR();
            c0xz43.getClass();
            C0XZ4.LJIIIZ(emailLinkVerifyFragment, emailLinkVerifyFragment, email, strLLLLLZL, "link", strUR2, mapNR).LJIILL();
        }
    }

    public static String LLLLLZL(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void LLLZ(AbstractActivityC1237560iJG abstractActivityC1237560iJG, BaseAccountFlowFragment baseAccountFlowFragment, Bundle bundle) {
        Boolean bool = Boolean.TRUE;
        int iLJJLIIIIJ = abstractActivityC1237560iJG.getSupportFragmentManager().LJJLIIIIJ();
        if (bundle.getBoolean("finish_before_jump", false)) {
            iLJJLIIIIJ--;
            bundle.putBoolean("finish_before_jump", false);
            if (abstractActivityC1237560iJG.isActive()) {
                abstractActivityC1237560iJG.getSupportFragmentManager().LJLLILLLL();
            }
        }
        abstractActivityC1237560iJG.LL = baseAccountFlowFragment;
        baseAccountFlowFragment.setArguments(bundle);
        C19EH c19ehLJIIJ = abstractActivityC1237560iJG.getSupportFragmentManager().LJIIJ();
        if (abstractActivityC1237560iJG.LLLLZIL()) {
            c19ehLJIIJ.LJIJJLI(0, 0, 0, 0);
        } else if (iLJJLIIIIJ > 0) {
            c19ehLJIIJ.LJIJJLI(R.anim.fv, R.anim.ah, R.anim.ft, R.anim.ai);
        }
        String strZR = baseAccountFlowFragment.ZR();
        if (TextUtils.isEmpty(strZR)) {
            int i = bundle.getInt("current_page", -10);
            if (i == -10) {
                strZR = "";
            } else {
                strZR = String.valueOf(i);
            }
        }
        c19ehLJIIJ.LJIJ(R.id.iiv, baseAccountFlowFragment, strZR);
        if (Intrinsics.LJFF(bool, bool)) {
            c19ehLJIIJ.LJII(null);
        }
        c19ehLJIIJ.LJIIJ();
        if (baseAccountFlowFragment instanceof BaseI18nLoginFragment) {
            C2211631BhB.LJIIL((InterfaceC1740760vOs) baseAccountFlowFragment, abstractActivityC1237560iJG);
        }
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, X.C19EG, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        BaseAccountFlowFragment baseAccountFlowFragment = this.LL;
        if (baseAccountFlowFragment != null) {
            baseAccountFlowFragment.onActivityResult(i, i2, intent);
        }
    }
}
