package X;

import android.os.Bundle;
import android.view.inputmethod.InputMethodManager;
import com.bytedance.ies.foundation.activity.BaseActivity;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.compliance.protection.timelock.ui.fragment.TimeUnlockFragment;

/* JADX INFO: renamed from: X.0vVP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public abstract class AbstractActivityC1744810vVP extends BaseActivity {
    public TimeUnlockFragment LL;

    public abstract int LLLLLZL();

    public abstract void init();

    @Override // X.ActivityC21503719Dn, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (getCurrentFocus() != null) {
            ((InputMethodManager) C786410Ut5.F2(this, "input_method")).hideSoftInputFromWindow(getCurrentFocus().getWindowToken(), 0);
        }
        try {
            getSupportFragmentManager().LJLLILLLL();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, X.C19EG, androidx.activity.ComponentActivity, X.C19FO, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(LLLLLZL());
        init();
    }
}
