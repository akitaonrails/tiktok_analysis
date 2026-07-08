package X;

import com.ss.android.ugc.aweme.feed.landscape.service.LandscapeFeedMonitorImpl;
import java.util.HashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS17S1001000_24;

/* JADX INFO: renamed from: X.0qwJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1569290qwJ extends C09AY implements Function0<Unit> {
    public final /* synthetic */ int LL;
    public final /* synthetic */ Map<String, String> LLILLJJLI;
    public final /* synthetic */ LandscapeFeedMonitorImpl LLILLL;
    public final /* synthetic */ String LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1569290qwJ(int i, Map<String, String> map, LandscapeFeedMonitorImpl landscapeFeedMonitorImpl, String str) {
        super(0);
        this.LL = i;
        this.LLILLJJLI = map;
        this.LLILLL = landscapeFeedMonitorImpl;
        this.LLILZ = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        if (C289000BUk.LIZ() && !LandscapeFeedMonitorImpl.LJIIJJI) {
            HashMap<Integer, Pair<Long, Map<String, String>>> map = LandscapeFeedMonitorImpl.LJIIIZ;
            if (!map.containsKey(Integer.valueOf(this.LL))) {
                map.put(Integer.valueOf(this.LL), new Pair<>(Long.valueOf(System.currentTimeMillis()), this.LLILLJJLI));
            }
            LandscapeFeedMonitorImpl landscapeFeedMonitorImpl = this.LLILLL;
            String str = this.LLILZ;
            int i = this.LL;
            landscapeFeedMonitorImpl.getClass();
            C1561780qkC.LIZ(new AwS17S1001000_24(str, i, 0));
        }
        return Unit.LIZ;
    }
}
