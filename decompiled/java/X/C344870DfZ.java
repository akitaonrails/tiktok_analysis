package X;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment;

/* JADX INFO: renamed from: X.0DfZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C344870DfZ {
    public static void LIZ(Activity activity, AmeBaseFragment ameBaseFragment) {
        Intent intent;
        if (activity == null || ameBaseFragment == null || (intent = activity.getIntent()) == null) {
            return;
        }
        try {
            String stringExtra = intent.getStringExtra("trigger_by");
            if (stringExtra != null) {
                Bundle arguments = ameBaseFragment.getArguments();
                if (arguments == null) {
                    arguments = new Bundle();
                    ameBaseFragment.setArguments(arguments);
                }
                C786410Ut5.LJJJI("trigger_by", stringExtra, arguments);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }
}
