package X;

import android.content.Context;
import android.content.Intent;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0W0P, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0W0P implements C0W0Q {
    public static boolean LIZ(Context context, String str) {
        boolean z = false;
        if (str == null) {
            return false;
        }
        Intent intent = new Intent("android.intent.action.VIEW", UriProtector.parse(str));
        intent.addFlags(268435456);
        intent.addCategory("android.intent.category.BROWSABLE");
        try {
            RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(context, intent, "Context_startActivity_1");
            C1701330uNH.LIZ(intent, context);
            C2204961BRm.LJJJJJL(context, intent, new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yeeYC5pn5y+bJr4WF5nj7WUzCiZft5xpexhknUFEHJugFMeXnI2SXVsHDrnHly/dD9z4", null));
            z = true;
            return true;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return z;
        }
    }
}
