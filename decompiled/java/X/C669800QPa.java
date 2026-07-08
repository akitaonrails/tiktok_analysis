package X;

import android.content.Context;
import android.content.Intent;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.ss.android.ugc.aweme.search.pages.result.livelist.core.ui.SearchLiveListActivity;

/* JADX INFO: renamed from: X.0QPa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C669800QPa {
    public static void LIZ(Context context, C654500Plo c654500Plo, C0QER c0qer) {
        Intent intent = new Intent(context, (Class<?>) SearchLiveListActivity.class);
        intent.putExtra("param_live_enter", c654500Plo);
        intent.addFlags(268435456);
        if (c0qer != null) {
            intent.putExtra("param_search_enter", c0qer);
        }
        RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(context, intent, "Context_startActivity_1");
        C1701330uNH.LIZ(intent, context);
        C2204961BRm.LJJJJJL(context, intent, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPmtYo3N1HzhDDRLpI72YnZMf+rOQb4a//tBctBc51VDCjFbKi1eLdJfHVd+79Yip4RX78nX+Rkkos4m", null));
    }
}
