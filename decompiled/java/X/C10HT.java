package X;

import android.app.Activity;
import android.content.Intent;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.ss.android.ugc.aweme.geofencing.ui.GeoFencingStatusActivity;
import java.util.List;

/* JADX INFO: renamed from: X.10HT, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public final class C10HT {
    public static void LIZ(Activity activity, List list, boolean z) {
        if (activity == null) {
            return;
        }
        Intent intent = new Intent(activity, (Class<?>) GeoFencingStatusActivity.class);
        intent.putExtra("extra.read_only", z);
        C10HU.LIZIZ(intent, list);
        RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(activity, intent, "Activity_startActivityForResult_3");
        C1701330uNH.LIZ(intent, activity);
        C2204961BRm.LJIJ(activity, intent, 1988, null, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KO2tbJnL0jHc9RgiN+0lxqpwsQsAXrx7aX5X/kJO5WlAK3IhSKAC", null));
    }
}
