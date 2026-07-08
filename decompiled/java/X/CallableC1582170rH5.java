package X;

import java.util.HashMap;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: X.0rH5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class CallableC1582170rH5<V> implements Callable {
    public final /* synthetic */ String LL;

    public CallableC1582170rH5(String str) {
        this.LL = str;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        C1C7U.LIZ("FriendsTabTechMonitor@425.reportFeedLandingError$1");
        C1587740rQ4 c1587740rQ4 = C1587740rQ4.LIZ;
        c1587740rQ4.getClass();
        HashMap<String, String> map = C1587740rQ4.LIZIZ;
        map.put("landing_result", "1");
        map.put("landing_error_reason", this.LL);
        c1587740rQ4.getClass();
        map.put("friends_type", C1587740rQ4.LJJIFFI);
        C20684815ws.LJIILLIIL("friends_tab_landing", map);
        C1C7U.LIZIZ("FriendsTabTechMonitor@425.reportFeedLandingError$1");
        return null;
    }
}
