package X;

import android.app.Activity;
import android.content.Intent;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.ss.android.ugc.aweme.passkey.AdActTransitionActivity;

/* JADX INFO: renamed from: X.0XQy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C848660XQy {
    public static void LIZ(Activity activity, String str, boolean z, C1DXV c1dxv) {
        AdActTransitionActivity.LL = c1dxv;
        Intent intent = new Intent(activity, (Class<?>) AdActTransitionActivity.class);
        intent.putExtra("url", str);
        intent.putExtra("supportCustomTabs", z);
        RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(activity, intent, "Context_startActivity_1");
        C1701330uNH.LIZ(intent, activity);
        C2204961BRm.LJIILLIIL(activity, intent, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPqpcIzF2StQLi5owmSjNCY05wWHR/Ra3ULzvYEyiNU=", null));
        C786410Ut5.ae(0, activity, 0);
    }
}
