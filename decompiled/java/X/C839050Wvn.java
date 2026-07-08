package X;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.bytedance.pumbaa.utility.dfid.AutoDFIDManager;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0Wvn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C839050Wvn {
    public static final C839050Wvn LIZ = new C839050Wvn();

    public static void LIZ(Context context, Intent intent) {
        RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(context, intent, "Context_startActivity_1");
        C1701330uNH.LIZ(intent, context);
        C2204961BRm.LJJJJJL(context, intent, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOurYJDb0ibEEOp7pktI0KxwlZokJLO7v7M=", null));
    }

    public static final boolean LIZIZ(Context context, String str) {
        boolean z = true;
        AutoDFIDManager.LIZJ(new C839020Wvk[]{new C839020Wvk(1207967489, new int[]{11098, 11097, 11094, 11093, 11092, 11091, 11090, 11089, 11088, 11087, 11086, 11085})});
        try {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
            C2429209fW.LIZ().appendDataFlowId(intent, 1207967489);
            try {
                LIZ(context, intent);
            } catch (ActivityNotFoundException e) {
                TryCatchGuardChecker.doCheck(e);
                z = false;
            }
            AutoDFIDManager.LIZIZ();
            return z;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            AutoDFIDManager.LIZIZ();
            throw th;
        }
    }
}
