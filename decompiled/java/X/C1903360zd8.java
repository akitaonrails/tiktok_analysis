package X;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0zd8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1903360zd8 {
    public static final C1903360zd8 LIZ = new C1903360zd8();

    public static void LIZ(Fragment fragment, Intent intent) {
        String stringExtra;
        Context context;
        String str;
        String stringExtra2;
        String stringExtra3;
        if (intent == null) {
            return;
        }
        Bundle bundle = new Bundle();
        String stringExtra4 = null;
        try {
            stringExtra = intent.getStringExtra("label");
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            stringExtra = null;
        }
        if (!TextUtils.equals(stringExtra, "follow_request") || (context = fragment.getContext()) == null) {
            return;
        }
        if (intent.getIntExtra("is_from_push", 0) == 1) {
            bundle.putInt("is_from_push", 1);
            try {
                stringExtra2 = intent.getStringExtra("push_id");
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
                stringExtra2 = null;
            }
            C786410Ut5.LJJJI("push_id", stringExtra2, bundle);
            try {
                stringExtra3 = intent.getStringExtra("push_type");
            } catch (Exception e3) {
                TryCatchGuardChecker.doCheck(e3);
                stringExtra3 = null;
            }
            C786410Ut5.LJJJI("push_type", stringExtra3, bundle);
        }
        C786410Ut5.LJJJI("label", stringExtra, bundle);
        try {
            stringExtra4 = intent.getStringExtra("uid");
        } catch (Exception e4) {
            TryCatchGuardChecker.doCheck(e4);
        }
        C786410Ut5.LJJJI("uid", stringExtra4, bundle);
        if (C0ZC2.LIZ()) {
            str = "aweme://inbox/merged_activity_followers";
        } else {
            str = "aweme://inbox/followers";
        }
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(context, str);
        smartRouteBuildRoute.withParam(bundle);
        if (C0ZC2.LIZ()) {
            smartRouteBuildRoute.withParam("default_tab", 1);
        }
        smartRouteBuildRoute.open();
    }
}
