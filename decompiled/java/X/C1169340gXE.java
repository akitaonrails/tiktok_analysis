package X;

import android.content.Context;
import android.content.Intent;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.ss.android.ugc.aweme.commercialize.shoppingtask.ui.ShoppingTaskActivity;

/* JADX INFO: renamed from: X.0gXE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1169340gXE {
    public static void LIZ(Context context, C1152790g6X c1152790g6X) {
        Intent intentPutExtra = new Intent(context, (Class<?>) ShoppingTaskActivity.class).putExtra("shopping_task_schema", c1152790g6X.LIZIZ).putExtra("shopping_task_global_props", c1152790g6X.LIZ);
        if (C1388190mED.LIZ(context) == null) {
            intentPutExtra.addFlags(268435456);
        }
        RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(context, intentPutExtra, "Context_startActivity_1");
        C1701330uNH.LIZ(intentPutExtra, context);
        C2204961BRm.LJJJJJL(context, intentPutExtra, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOmnbpLLzjHP2aI3/COMq2n3gCeJH8IqgbHdmi0bUAndkaO39kxNZY7p/6C1kEmNJw==", null));
    }
}
