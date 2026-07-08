package X;

import android.os.Bundle;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import com.ss.android.ugc.aweme.search.pages.middlepage.core.utils.IntermediatePreload;
import com.ss.android.ugc.aweme.search.performance.metrics.SearchMiddleMonitor;

/* JADX INFO: renamed from: X.0QIP, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0QIP {
    public static void LIZ(SearchResultParam searchResultParam, C0PS4 c0ps4) {
        SearchMiddleMonitor.INSTANCE.triggerRequestStart();
        Bundle bundle = new Bundle();
        C786410Ut5.LJJIZ(bundle, "search_enter_param", searchResultParam);
        C786410Ut5.LJJIZ(bundle, "search_global_param", c0ps4);
        C1524605y0.LIZ().LIZ(bundle, IntermediatePreload.class, new InterfaceC1726310v1Z() { // from class: X.0QIO
            @Override // X.InterfaceC1726310v1Z
            public final void LIZ(Exception exc) {
            }

            @Override // X.InterfaceC1726310v1Z
            public final void onSuccess(Object obj) {
                C0QIP c0qip = IntermediatePreload.Companion;
                c0qip.getClass();
                if (IntermediatePreload.startTime != 0) {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    c0qip.getClass();
                    SearchMiddleMonitor.INSTANCE.setRequestTotalCost(jCurrentTimeMillis - IntermediatePreload.startTime);
                    c0qip.getClass();
                    IntermediatePreload.startTime = 0L;
                }
            }
        }, Boolean.FALSE);
    }
}
