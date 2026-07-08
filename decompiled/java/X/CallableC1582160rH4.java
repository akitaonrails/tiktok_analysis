package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.HashMap;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: X.0rH4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class CallableC1582160rH4<V> implements Callable {
    public static final CallableC1582160rH4<V> LL = new CallableC1582160rH4<>();

    @Override // java.util.concurrent.Callable
    public final Object call() {
        C1C7U.LIZ("FriendsTabTechMonitor@425.onExitFriendsFeed$1");
        C1587740rQ4 c1587740rQ4 = C1587740rQ4.LIZ;
        c1587740rQ4.getClass();
        HashMap<String, String> map = C1587740rQ4.LIZIZ;
        map.put("landing_result", CardStruct.IStatusCode.DEFAULT);
        map.put("landing_success_reason", "FriendsExit");
        c1587740rQ4.getClass();
        map.put("friends_type", C1587740rQ4.LJJIFFI);
        C20684815ws.LJIILLIIL("friends_tab_landing", map);
        C1C7U.LIZIZ("FriendsTabTechMonitor@425.onExitFriendsFeed$1");
        return null;
    }
}
