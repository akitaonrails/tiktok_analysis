package X;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0hAl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1193850hAl {
    public static boolean LIZ(Context context, Intent intent, String str, String str2, String str3, PageFinder pageFinder) {
        boolean z = false;
        if (context == null) {
            return false;
        }
        try {
            RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(context, intent, "Context_startActivity_1");
            C1701330uNH.LIZ(intent, context);
            C2204961BRm.LJJJJJL(context, intent, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPqnatHbyDu7CNQAY9c6R1vckSLaPcMcIwE9y1a9", null));
            z = true;
            return true;
        } catch (ActivityNotFoundException e) {
            TryCatchGuardChecker.doCheck(e);
            C1185430gxB.LIZ.getClass();
            C1185430gxB.LJJJIL(pageFinder, str2, str3, str);
            return z;
        }
    }
}
