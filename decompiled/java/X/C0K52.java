package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.ss.android.ugc.aweme.subscription.pgc.commonui.fragmentcontainer.SubContentFragmentContainerActivity;

/* JADX INFO: renamed from: X.0K52, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0K52 {
    public static void LIZ(Context context, String str, Bundle bundle) {
        Intent intent = new Intent(context, (Class<?>) SubContentFragmentContainerActivity.class);
        intent.putExtras(new Bundle(bundle));
        intent.putExtra("fragment_id", str);
        if (!(context instanceof Activity)) {
            intent.addFlags(268435456);
        }
        RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(context, intent, "Context_startActivity_1");
        C1701330uNH.LIZ(intent, context);
        C2204961BRm.LJJJJJL(context, intent, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPm9YYzNzjswHj2F3VAulxUa0fo0CFVh3tms6iJHmE5ZE6v7jFitNrzGOISzLSUov9OsYddD2uAH3URhucQple1WplCDi/VhtxTlRdf+YzY=", null));
    }
}
