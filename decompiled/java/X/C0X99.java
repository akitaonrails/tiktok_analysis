package X;

import android.app.Activity;
import android.content.Intent;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.ss.android.ugc.aweme.app.PushLoginActivity;

/* JADX INFO: renamed from: X.0X99, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0X99 {
    public static Intent LIZ(Activity activity, Intent intent, String str) {
        if (!C2214201BlK.LJIIL) {
            Intent intent2 = new Intent();
            C844470XAv.LIZ.getClass();
            if (C844470XAv.LJIIIZ == 5) {
                intent2.setClassName(activity, "com.bytedance.android.aweme.lite.home.HomeActivity");
            } else {
                intent2.setClassName(activity, "com.ss.android.ugc.aweme.splash.SplashActivity");
            }
            RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(activity, intent2, "Context_startActivity_1");
            C1701330uNH.LIZ(intent2, activity);
            C2204961BRm.LJIILLIIL(activity, intent2, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOu4c9H+zjevy1XlVmKYBeRBLExYJvzacOijWw==", null));
        }
        Intent intent3 = new Intent(activity, (Class<?>) PushLoginActivity.class);
        if (intent != null) {
            intent3.putExtra("next_step", intent);
        }
        intent3.putExtra("multi_account_push_uid", str);
        return intent3;
    }
}
