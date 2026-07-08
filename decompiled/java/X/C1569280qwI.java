package X;

import com.ss.android.ugc.aweme.feed.landscape.service.LandscapeFeedMonitorImpl;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS213S0000000_24;
import kotlin.jvm.internal.AwS425S0200000_24;

/* JADX INFO: renamed from: X.0qwI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1569280qwI extends C09AY implements Function0<Unit> {
    public final /* synthetic */ LandscapeFeedMonitorImpl LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ Map<String, String> LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1569280qwI(LandscapeFeedMonitorImpl landscapeFeedMonitorImpl, String str, String str2, String str3, Map<String, String> map) {
        super(0);
        this.LL = landscapeFeedMonitorImpl;
        this.LLILLJJLI = str;
        this.LLILLL = str2;
        this.LLILZ = str3;
        this.LLILZIL = map;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.LL.getClass();
        List<String> list = LandscapeFeedMonitorImpl.LIZ;
        C1561780qkC.LIZ(AFwS213S0000000_24.get$arr$(144));
        LandscapeFeedMonitorImpl landscapeFeedMonitorImpl = this.LL;
        Map mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(new Pair("enter_method", this.LLILLJJLI), new Pair("enter_from", this.LLILLL));
        String str = this.LLILZ;
        landscapeFeedMonitorImpl.getClass();
        C1561780qkC.LIZ(new AwS425S0200000_24(new C1569250qwF("landscape_feed_launch_performance", LandscapeFeedMonitorImpl.LIZ, LandscapeFeedMonitorImpl.LIZIZ, mapLJIIIIZZ, true, str), (Long) 10000L, 18));
        C1569250qwF c1569250qwF = (C1569250qwF) ((LinkedHashMap) LandscapeFeedMonitorImpl.LJI).get("landscape_feed_launch_performance");
        if (c1569250qwF != null) {
            c1569250qwF.LIZ("landscape_feed_click_entrance", null, null, this.LLILZIL);
        }
        return Unit.LIZ;
    }
}
