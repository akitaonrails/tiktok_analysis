package X;

import android.content.Intent;
import androidx.fragment.app.Fragment;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.03Hj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C817703Hj {
    public static final String LIZ(Fragment fragment) {
        C19EG activity;
        Intent intent;
        String stringExtra = null;
        if (fragment != null && (activity = fragment.getActivity()) != null && (intent = activity.getIntent()) != null) {
            try {
                stringExtra = intent.getStringExtra("source_btm_token");
                return stringExtra;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return stringExtra;
    }
}
