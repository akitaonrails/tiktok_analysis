package X;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.webkit.WebView;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.09fa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2429609fa {
    public static final C2429609fa LIZ = new C2429609fa();

    public static void LIZ(Uri uri, WebView webView) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(uri);
        intent.addFlags(268435456);
        C2429209fW.LIZ().appendDataFlowId(intent, 1207965953);
        try {
            Context context = webView.getContext();
            RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(context, intent, "Context_startActivity_1");
            C1701330uNH.LIZ(intent, context);
            C2204961BRm.LJJJJJL(context, intent, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KP2tYdHMySFxIagbfKO5DnilnEWI11ZdgCe8xRYOwjBIWILb", null));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }
}
