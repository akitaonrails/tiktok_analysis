package X;

import android.app.Activity;
import android.content.Intent;
import com.bytedance.router.OnActivityResultCallback;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.account.login.auth.I18nSignUpActivity;
import com.ss.android.ugc.aweme.account.login.auth.ui.login.LoginSignupTabFragment;
import com.ss.android.ugc.aweme.account.login.passkey.management.PasskeyManagementViewModel;
import com.ss.android.ugc.aweme.compliance.business.fundraiser.FundraiserService;
import com.ss.android.ugc.aweme.inbox.widget.multi.MultiViewModel;
import kotlin.jvm.internal.AFwS271S0000000_28;
import kotlin.jvm.internal.AwS572S0100000_28;

/* JADX INFO: renamed from: X.10kU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public class C19334010kU implements OnActivityResultCallback {
    public final int $t;
    public Object l0;

    @Override // com.bytedance.router.OnActivityResultCallback
    public final void onActivityResult(int i, int i2, Intent intent) {
        switch (this.$t) {
            case 0:
                onActivityResult$0(this, i, i2, intent);
                break;
            case 1:
                onActivityResult$1(this, i, i2, intent);
                break;
            case 2:
                onActivityResult$2(this, i, i2, intent);
                break;
            case 3:
                onActivityResult$3(this, i, i2, intent);
                break;
            case 4:
                onActivityResult$4(this, i, i2, intent);
                break;
            case 5:
                onActivityResult$5(this, i, i2, intent);
                break;
        }
    }

    public C19334010kU(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onActivityResult$0(C19334010kU c19334010kU, int i, int i2, Intent intent) {
        ((FundraiserService) c19334010kU.l0).LJIL();
    }

    public static final void onActivityResult$1(C19334010kU c19334010kU, int i, int i2, Intent intent) {
        if (i2 == -1) {
            ((PasskeyManagementViewModel) c19334010kU.l0).setState(AFwS271S0000000_28.get$arr$(311));
        }
    }

    public static final void onActivityResult$2(C19334010kU c19334010kU, int i, int i2, Intent intent) {
        Activity activityL5;
        MultiViewModel multiViewModelN5;
        if (i == 1101) {
            if (i2 != 11) {
                if (i2 == 12 && (activityL5 = ((C1903510zdN) c19334010kU.l0).L5()) != null && (multiViewModelN5 = ((C1903510zdN) c19334010kU.l0).N5()) != null) {
                    multiViewModelN5.MQ2(EnumC1902760zcA.BACK_TO_FRONT);
                    C2252408s6.LJII(new AwS572S0100000_28(activityL5, 853));
                    return;
                }
                return;
            }
            MultiViewModel multiViewModelN52 = ((C1903510zdN) c19334010kU.l0).N5();
            if (multiViewModelN52 == null) {
                return;
            }
            multiViewModelN52.MQ2(EnumC1902760zcA.BACK_TO_FRONT);
        }
    }

    public static final void onActivityResult$3(C19334010kU c19334010kU, int i, int i2, Intent intent) {
        InterfaceC19305310fr interfaceC19305310fr;
        C19304910fn c19304910fn = (C19304910fn) c19334010kU.l0;
        c19304910fn.getClass();
        if (i == 10086) {
            if (i2 != -1) {
                if (i2 == 0 && (interfaceC19305310fr = c19304910fn.LIZ) != null) {
                    C19305010fo c19305010fo = (C19305010fo) interfaceC19305310fr;
                    c19305010fo.LIZIZ.LJLILLLLZI(0, c19305010fo.LIZ);
                    return;
                }
                return;
            }
            InterfaceC19305310fr interfaceC19305310fr2 = c19304910fn.LIZ;
            if (interfaceC19305310fr2 == null) {
                return;
            }
            C19305010fo c19305010fo2 = (C19305010fo) interfaceC19305310fr2;
            c19305010fo2.LIZIZ.LJLILLLLZI(-1, c19305010fo2.LIZ);
        }
    }

    public static final void onActivityResult$4(C19334010kU c19334010kU, int i, int i2, Intent intent) {
        I18nSignUpActivity i18nSignUpActivity;
        LoginSignupTabFragment loginSignupTabFragmentLLLLZLL;
        Activity activity = (Activity) c19334010kU.l0;
        if ((activity instanceof I18nSignUpActivity) && (i18nSignUpActivity = (I18nSignUpActivity) activity) != null) {
            String str = I18nSignUpActivity._pnsPageId;
            if (C0XGX.LIZ() && i2 == -1 && intent != null && intent.getBooleanExtra("extra_jump_to_signup", false) && (loginSignupTabFragmentLLLLZLL = i18nSignUpActivity.LLLLZLL()) != null) {
                loginSignupTabFragmentLLLLZLL.NR().LIZIZ("signup");
            }
        }
    }

    public static final void onActivityResult$5(C19334010kU c19334010kU, int i, int i2, Intent intent) {
        C19303510fZ c19303510fZ = (C19303510fZ) c19334010kU.l0;
        if (i == 998) {
            InterfaceC19304010fe interfaceC19304010fe = c19303510fZ.LIZ;
            if (interfaceC19304010fe != null) {
                String stringExtra = null;
                if (i2 == -1) {
                    try {
                        stringExtra = intent.getStringExtra("birthday");
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                    C19303810fc c19303810fc = (C19303810fc) interfaceC19304010fe;
                    InterfaceC19303910fd interfaceC19303910fd = c19303810fc.LIZIZ;
                    if (interfaceC19303910fd != null) {
                        interfaceC19303910fd.LJJJLZIJ(1, c19303810fc.LIZ, stringExtra);
                        return;
                    }
                    return;
                }
                if (i2 == 0) {
                    C19303810fc c19303810fc2 = (C19303810fc) interfaceC19304010fe;
                    InterfaceC19303910fd interfaceC19303910fd2 = c19303810fc2.LIZIZ;
                    if (interfaceC19303910fd2 != null) {
                        interfaceC19303910fd2.LJJJLZIJ(0, c19303810fc2.LIZ, null);
                        return;
                    }
                    return;
                }
                new Exception();
                C19303810fc c19303810fc3 = (C19303810fc) interfaceC19304010fe;
                InterfaceC19303910fd interfaceC19303910fd3 = c19303810fc3.LIZIZ;
                if (interfaceC19303910fd3 != null) {
                    interfaceC19303910fd3.LJJJLZIJ(-1, c19303810fc3.LIZ, null);
                    return;
                }
                return;
            }
            return;
        }
        c19303510fZ.getClass();
    }
}
