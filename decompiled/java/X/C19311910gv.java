package X;

import android.os.Bundle;
import androidx.compose.ui.platform.ComposeView;
import com.bytedance.ies.foundation.activity.BaseActivity;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.IAccountLoginMethodsService;
import com.ss.android.ugc.aweme.ICredentialManagerService;
import com.ss.android.ugc.aweme.account.model.LoginMethodName;
import com.ss.android.ugc.aweme.account.oneclicklogin.IOneClickLoginService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.loginplatform.LoginSignupConfig;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS217S0000000_28;
import kotlin.jvm.internal.AwS460S0200000_25;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.10gv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C19311910gv extends AbstractC19311610gs {
    public final ComposeView LIZLLL;
    public final C01GW LJ;
    public final List<String> LJFF;
    public final InterfaceC1676320tiw LJI;
    public String LJII;
    public boolean LJIIIIZZ;
    public Function1<? super String, Unit> LJIIIZ;

    @Override // X.InterfaceC19312510h1
    public final void LIZLLL() {
    }

    @Override // X.InterfaceC19312510h1
    public final void LJFF(boolean z) {
    }

    @Override // X.InterfaceC19312510h1
    public final void LJIIIZ() {
        this.LJIIIIZZ = true;
    }

    @Override // X.InterfaceC19312510h1
    public final void LJ() {
        this.LJII = "";
        LJJI(false);
        LJJIIJ();
        LJJIII(LJIILIIL().FQ2());
        LJIILIIL().TQ2();
        LJIILLIIL(LJJ());
    }

    @Override // X.InterfaceC19312510h1
    public final boolean LJI() {
        return ((IOneClickLoginService) this.LJ.getValue()).LJIIJ(null) && Intrinsics.LJFF(LJJ(), "the_one");
    }

    public final String LJJ() {
        return (String) ListProtector.get(this.LJFF, ((C13FG) this.LJI).LIZLLL());
    }

    public final void LJJIIJ() {
        InterfaceC1665500tRU interfaceC1665500tRULIZ = C1687430u0r.LIZ(this.LJFF);
        C1669670tYD.LJ(this.LIZLLL, EnumC1427810nG7.Auto, new C19719212De(-1291274187, new AwS460S0200000_25(this, (C19311910gv) interfaceC1665500tRULIZ, (InterfaceC1665500tRU<String>) 33), true));
    }

    @Override // X.InterfaceC19312510h1
    public final boolean LLZLL() {
        if (((C13FG) this.LJI).LIZLLL() != 0) {
            int iLIZLLL = ((C13FG) this.LJI).LIZLLL() - 1;
            if (iLIZLLL < ((ArrayList) this.LJFF).size()) {
                LJIL((String) ListProtector.get(this.LJFF, iLIZLLL));
            }
            return true;
        }
        if (C0XGX.LIZ()) {
            return false;
        }
        if (!LJIILIIL().OQ2() || LJIILIIL().QQ2()) {
            return LJIILIIL().OQ2() && LJIILIIL().NQ2();
        }
        return true;
    }

    @Override // X.InterfaceC19312510h1
    public final C1176204iu getContent() {
        return new C1176204iu(this.LIZLLL);
    }

    @Override // X.InterfaceC19312510h1
    public final boolean LJII() {
        return Intrinsics.LJFF(LJJ(), "signup");
    }

    @Override // X.InterfaceC19312510h1
    public final void LJIIJJI() {
        LJIILLIIL(LJJ());
    }

    @Override // X.AbstractC19311610gs
    public final Bundle LJIILJJIL() {
        return LJII() ? LJIILIIL().GQ2() : LJIILIIL().zQ2();
    }

    public final void LJJII() {
        String strLJJ = LJJ();
        LJIILIIL().HQ2().LIZ.setText(Intrinsics.LJFF(strLJJ, "signup") ? this.LIZ.getString(2131829351) : Intrinsics.LJFF(strLJJ, "login") ? this.LIZ.getString(2131829310) : "");
    }

    @Override // X.InterfaceC19312510h1
    public final int LIZ(boolean z) {
        Integer num;
        if (LJIILIIL().xQ2()) {
            return 5;
        }
        boolean z2 = false;
        IAccountLoginMethodsService iAccountLoginMethodsService = (IAccountLoginMethodsService) PluggableExtentionKt.pluggableSpi$default(IAccountLoginMethodsService.class, false, false, false, 14, null);
        if (iAccountLoginMethodsService != null && iAccountLoginMethodsService.LIZJ()) {
            z2 = true;
        }
        if (z2 || !z || C19286010ck.LIZLLL()) {
            return Integer.MAX_VALUE;
        }
        int iIntValue = 4;
        if (LJIILIIL().MQ2()) {
            return 4;
        }
        C19314110hH.LIZ.getClass();
        LoginSignupConfig loginSignupConfig = C19314110hH.LIZ().signupConfig;
        if (loginSignupConfig != null && (num = loginSignupConfig.showNum) != null) {
            iIntValue = num.intValue() + 1;
        }
        return iIntValue + 1;
    }

    @Override // X.InterfaceC19312510h1
    public final void LIZIZ(String str) {
        String strLJJIFFI = LJJIFFI(str);
        LJIL(str);
        if (Intrinsics.LJFF(strLJJIFFI, "login") || Intrinsics.LJFF(strLJJIFFI, "signup")) {
            LJJIII(Intrinsics.LJFF(strLJJIFFI, "login"));
        }
    }

    @Override // X.AbstractC19311610gs, X.InterfaceC19312510h1
    public final void LJIIJ(Bundle bundle) {
        boolean z;
        LJJI(!LJIILIIL().JQ2());
        super.LJIIJ(bundle);
        LJJIIJ();
        if (bundle == null) {
            LoginMethodName loginMethodName = C0XUE.LIZ.LJFF().getLoginMethodName();
            int i = 0;
            if (!LJIILIIL().GQ2().getBoolean("force_use_default_login_method", false) && !LJIILIIL().GQ2().getBoolean("is_fullscreen_dialog")) {
                z = false;
            } else {
                z = true;
            }
            if (loginMethodName == LoginMethodName.DEFAULT || z) {
                i = 1;
            }
            LJIILIIL().GQ2().putInt("login_last_time", i ^ 1);
        }
        LJJII();
    }

    public final void LJIL(String str) {
        String strLJJIFFI = LJJIFFI(str);
        this.LJII = LJJ();
        Function1<? super String, Unit> function1 = this.LJIIIZ;
        if (function1 != null) {
            function1.invoke(strLJJIFFI);
        }
        if (Intrinsics.LJFF(strLJJIFFI, "the_one")) {
            C0XGR c0xgr = new C0XGR();
            c0xgr.LIZLLL("click_actions", "click_back");
            C20684815ws.LJIILLIIL("return_to_theone", c0xgr.LIZ);
        }
    }

    public final void LJJI(boolean z) {
        ((ArrayList) this.LJFF).clear();
        if (z && ((IOneClickLoginService) this.LJ.getValue()).LJIIJ(null)) {
            ((ArrayList) this.LJFF).add("the_one");
            ((ArrayList) this.LJFF).add("login");
            ((ArrayList) this.LJFF).add("signup");
        } else if (LJIILIIL().FQ2()) {
            ((ArrayList) this.LJFF).add("login");
            ((ArrayList) this.LJFF).add("signup");
        } else {
            ((ArrayList) this.LJFF).add("signup");
            ((ArrayList) this.LJFF).add("login");
        }
    }

    public final String LJJIFFI(String str) {
        if (Intrinsics.LJFF(str, "login") && Intrinsics.LJFF(this.LJII, "the_one") && !Intrinsics.LJFF(LJJ(), "the_one")) {
            return "the_one";
        }
        return str;
    }

    public final void LJJIII(boolean z) {
        if (LJIILIIL().IQ2()) {
            return;
        }
        if (!z) {
            if (this.LJIIIIZZ) {
                return;
            } else {
                this.LJIIIIZZ = true;
            }
        }
        ICredentialManagerService iCredentialManagerService = (ICredentialManagerService) ServiceManager.get().getService(ICredentialManagerService.class);
        if (z && iCredentialManagerService.LJIILL()) {
            LIZJ();
        } else {
            LJIIIIZZ();
        }
    }

    public C19311910gv(BaseActivity baseActivity, InterfaceC19315610hW interfaceC19315610hW) {
        super(baseActivity, interfaceC19315610hW);
        this.LIZLLL = new ComposeView(baseActivity, null, 6);
        this.LJ = C452501pT.LIZIZ(AFwS217S0000000_28.get$arr$(771));
        this.LJFF = new ArrayList();
        this.LJI = C1696870uG5.LIZ(0);
        this.LJII = "";
    }
}
