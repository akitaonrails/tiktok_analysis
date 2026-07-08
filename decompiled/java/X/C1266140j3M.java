package X;

import android.os.BaseBundle;
import android.os.Bundle;
import com.ss.android.ugc.aweme.account.login.passkey.RecoveryPasskeyUpsellFragment;
import com.ss.android.ugc.aweme.account.login.twostep.TOTPCodeVerifyFragment;
import com.ss.android.ugc.aweme.account.login.twostep.TrustedDevicesFragmentViewModel;
import com.ss.android.ugc.aweme.account.login.twostep.TwoStepVerificationActivityViewModel;
import com.ss.android.ugc.aweme.account.login.v2.base.CommonFlowActivity;
import com.ss.android.ugc.aweme.account.login.v2.ui.fragments.EmailLinkVerifyFragment;

/* JADX INFO: renamed from: X.0j3M, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public class C1266140j3M implements C0XTR {
    public final int $t;
    public Object l0;

    @Override // X.C0XTR
    public final void onResult(int i, int i2, Object obj) {
        switch (this.$t) {
            case 0:
                onResult$0(this, i, i2, obj);
                break;
            case 1:
                onResult$1(this, i, i2, obj);
                break;
            case 2:
                onResult$2(this, i, i2, obj);
                break;
            case 3:
                onResult$3(this, i, i2, obj);
                break;
            case 4:
                onResult$4(this, i, i2, obj);
                break;
            case 5:
                onResult$5(this, i, i2, obj);
                break;
        }
    }

    public C1266140j3M(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onResult$0(C1266140j3M c1266140j3M, int i, int i2, Object obj) {
        if (i2 == 1) {
            TwoStepVerificationActivityViewModel.xQ2((TwoStepVerificationActivityViewModel) c1266140j3M.l0, 0, null, 6);
        }
    }

    public static final void onResult$1(C1266140j3M c1266140j3M, int i, int i2, Object obj) {
        if (i2 == 1) {
            EmailLinkVerifyFragment emailLinkVerifyFragment = (EmailLinkVerifyFragment) c1266140j3M.l0;
            Bundle arguments = emailLinkVerifyFragment.getArguments();
            if (arguments == null) {
                arguments = new Bundle();
            }
            emailLinkVerifyFragment.WR(arguments);
        }
    }

    public static final void onResult$2(C1266140j3M c1266140j3M, int i, int i2, Object obj) {
        if (i2 == 1) {
            ((RecoveryPasskeyUpsellFragment) c1266140j3M.l0).WR(new Bundle());
        }
    }

    public static final void onResult$3(C1266140j3M c1266140j3M, int i, int i2, Object obj) {
        if (i2 == 1) {
            ((RecoveryPasskeyUpsellFragment) c1266140j3M.l0).WR(new Bundle());
        }
    }

    public static final void onResult$4(C1266140j3M c1266140j3M, int i, int i2, Object obj) {
        BaseBundle baseBundle;
        int i3;
        CommonFlowActivity commonFlowActivity;
        if (i2 == 1) {
            if (obj instanceof Bundle) {
                baseBundle = (BaseBundle) obj;
            } else {
                baseBundle = null;
            }
            if (baseBundle != null) {
                i3 = baseBundle.getInt("error_code");
            } else {
                i3 = 0;
            }
            Bundle arguments = ((TOTPCodeVerifyFragment) c1266140j3M.l0).getArguments();
            if (arguments != null) {
                TOTPCodeVerifyFragment tOTPCodeVerifyFragment = (TOTPCodeVerifyFragment) c1266140j3M.l0;
                if (i3 != 0) {
                    Bundle bundle = new Bundle();
                    bundle.putInt("error_code", i3);
                    C786410Ut5.LJJIIZI(arguments, bundle, "final_data");
                }
                tOTPCodeVerifyFragment.WR(arguments);
                if (tOTPCodeVerifyFragment.GT()) {
                    C19EG activity = tOTPCodeVerifyFragment.getActivity();
                    if ((activity instanceof CommonFlowActivity) && (commonFlowActivity = (CommonFlowActivity) activity) != null) {
                        commonFlowActivity.LLILZLL = true;
                        commonFlowActivity.finish();
                    }
                }
            }
        }
    }

    public static final void onResult$5(C1266140j3M c1266140j3M, int i, int i2, Object obj) {
        ((TrustedDevicesFragmentViewModel) c1266140j3M.l0).wQ2(true);
    }
}
