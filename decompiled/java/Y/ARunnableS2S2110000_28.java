package Y;

import X.AbstractC848400XPy;
import X.C1904950zfh;
import X.C19334810kc;
import X.C19EG;
import X.C1C7U;
import X.C757860To8;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.ILoginServiceAppDiff;
import com.ss.android.ugc.aweme.IMandatoryLoginService;
import com.ss.android.ugc.aweme.account.main.LoginAndConsentAssem;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes29.dex */
public class ARunnableS2S2110000_28 implements Runnable {
    public final int $t;
    public Object l2;
    public String s0;
    public String s1;
    public boolean z3;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        IAccountService iAccountServiceHo = ((LoginAndConsentAssem) this.l2).ho();
        String strLJJIIZ = (iAccountServiceHo == null || iAccountServiceHo.LJIIJ() == null) ? null : AbstractC848400XPy.LJJIIZ();
        ILoginServiceAppDiff iLoginServiceAppDiff = (ILoginServiceAppDiff) PluggableExtentionKt.pluggableSpi$default(ILoginServiceAppDiff.class, false, false, false, 14, null);
        if (Intrinsics.LJFF(this.s0, "m2_login_silently") && (strLJJIIZ == null || strLJJIIZ.length() == 0)) {
            if (iLoginServiceAppDiff != null) {
                iLoginServiceAppDiff.startM2LoginActivity(((LoginAndConsentAssem) this.l2).getActivity());
            }
        } else {
            IMandatoryLoginService iMandatoryLoginService = (IMandatoryLoginService) ((LoginAndConsentAssem) this.l2).LLILZLL.getValue();
            if (iMandatoryLoginService != null) {
                iMandatoryLoginService.tryShowMandatoryLoginPage(((LoginAndConsentAssem) this.l2).getActivity(), this.z3, this.s0, this.s1, null, new C19334810kc((LoginAndConsentAssem) this.l2, 2));
            }
        }
    }

    public static final void run$0(ARunnableS2S2110000_28 aRunnableS2S2110000_28) {
        boolean zLIZ;
        C1C7U.LIZ("AccountMainActivityAssem@7d4.handleSwitchAccount$2$3");
        try {
            C757860To8.LIZ.getClass();
            C757860To8.LIZLLL = false;
            if (!((C19EG) aRunnableS2S2110000_28.l2).isFinishing() && !((C19EG) aRunnableS2S2110000_28.l2).isDestroyed() && aRunnableS2S2110000_28.z3) {
                C1904950zfh c1904950zfh = C1904950zfh.LIZ;
                C19EG c19eg = (C19EG) aRunnableS2S2110000_28.l2;
                String str = aRunnableS2S2110000_28.s0;
                String str2 = aRunnableS2S2110000_28.s1;
                c1904950zfh.getClass();
                C1904950zfh.LIZ(c19eg, str, str2);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("AccountMainActivityAssem@7d4.handleSwitchAccount$2$3");
    }

    public static final void run$1(ARunnableS2S2110000_28 aRunnableS2S2110000_28) {
        boolean zLIZ;
        C1C7U.LIZ("LoginAndConsentAssem@d9ba.gotoLoginPage$1");
        try {
            aRunnableS2S2110000_28.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("LoginAndConsentAssem@d9ba.gotoLoginPage$1");
    }

    public ARunnableS2S2110000_28(Object obj, boolean z, String str, String str2, int i) {
        this.$t = i;
        this.l2 = obj;
        this.z3 = z;
        this.s0 = str;
        this.s1 = str2;
    }
}
