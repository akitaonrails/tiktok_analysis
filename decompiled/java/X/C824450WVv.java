package X;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.ss.android.ugc.aweme.account.otl.LoginSyncLocalServer;

/* JADX INFO: renamed from: X.0WVv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C824450WVv {
    public static void LIZ(Context context) {
        Uri uri;
        if (LoginSyncLocalServer.LJI != null && (uri = LoginSyncLocalServer.LJII) != null) {
            Intent intent = new Intent("android.intent.action.VIEW", uri);
            intent.setFlags(268435456);
            C2429209fW.LIZ().appendDataFlowId(intent, 1207967489);
            Context contextN3 = C786410Ut5.N3(context);
            RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(contextN3, intent, "Context_startActivity_1");
            C1701330uNH.LIZ(intent, contextN3);
            C2204961BRm.LJJJJJL(contextN3, intent, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOurYJDb0ibECup+5CllxapptYY4Eou9wdiZyGfZPKm8", null));
        }
    }
}
