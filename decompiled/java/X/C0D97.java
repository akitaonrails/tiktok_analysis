package X;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.ss.android.ugc.aweme.login.ui.LogoutDialogActivity;

/* JADX INFO: renamed from: X.0D97, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0D97 {
    public static void LIZ(Context context, Bundle bundle) {
        Intent intent = new Intent(context, (Class<?>) LogoutDialogActivity.class);
        intent.putExtras(bundle);
        RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(context, intent, "Context_startActivity_1");
        C1701330uNH.LIZ(intent, context);
        C2204961BRm.LJJJJJL(context, intent, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOanZJbAkiciO1JSZe7wk//CbeAllIylmv8rNjjy", null));
    }
}
