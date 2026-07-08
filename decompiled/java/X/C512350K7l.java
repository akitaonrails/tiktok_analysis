package X;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.comp.api.subscription.status.ISubscriptionStatusService;
import com.ss.android.ugc.aweme.feed.adapter.BaseFeedLiveViewHolder;
import com.ss.android.ugc.aweme.feed.adapter.FeedLiveViewHolderNewV2;
import java.util.HashMap;
import java.util.HashSet;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AwS586S0100000_7;

/* JADX INFO: renamed from: X.0K7l, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C512350K7l {
    public static final C512350K7l LIZ = new C512350K7l();
    public static final ConcurrentHashMap<String, HashSet<BaseFeedLiveViewHolder>> LIZIZ;
    public static final HashMap<String, Integer> LIZJ;

    static {
        new ConcurrentHashMap(2);
        LIZIZ = new ConcurrentHashMap<>(2);
        HashMap<String, Integer> map = new HashMap<>();
        LIZJ = map;
        map.put("pm_following_livecard_live_icon", 2131841723);
        map.put("pm_mt_live_events_live_consumer_live_events", 2131842723);
    }

    public static String LIZIZ(int i, Context context) {
        if (i == 0) {
            return "";
        }
        return context.getString(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00e2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.List LIZJ(android.content.Context r23, java.lang.String r24) {
        /*
            Method dump skipped, instruction units count: 262
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C512350K7l.LIZJ(android.content.Context, java.lang.String):java.util.List");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void LIZLLL(Activity activity, InterfaceC512380K7o interfaceC512380K7o) {
        LifecycleOwner lifecycleOwner;
        if ((activity instanceof LifecycleOwner) && (lifecycleOwner = (LifecycleOwner) activity) != null) {
            ISubscriptionStatusService.LJIIIZ.getClass();
            C0K9Q.LIZ().cp1(lifecycleOwner, activity).LIZIZ(lifecycleOwner, new AwS586S0100000_7(interfaceC512380K7o, 253));
        }
    }

    public static FeedLiveViewHolderNewV2 LIZ(View view, Fragment fragment, String str) {
        C20338414i6.LIZIZ("FeedLiveViewHolder");
        return new FeedLiveViewHolderNewV2(view, fragment, str);
    }
}
