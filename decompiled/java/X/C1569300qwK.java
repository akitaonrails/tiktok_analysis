package X;

import com.ss.android.ugc.aweme.feed.landscape.service.LandscapeFeedMonitorImpl;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS17S1001000_24;

/* JADX INFO: renamed from: X.0qwK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1569300qwK extends C09AY implements Function0<Unit> {
    public final /* synthetic */ LandscapeFeedMonitorImpl LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1569300qwK(LandscapeFeedMonitorImpl landscapeFeedMonitorImpl, String str, int i) {
        super(0);
        this.LL = landscapeFeedMonitorImpl;
        this.LLILLJJLI = str;
        this.LLILLL = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        if (C289000BUk.LIZ() && !LandscapeFeedMonitorImpl.LJIIJJI) {
            LandscapeFeedMonitorImpl landscapeFeedMonitorImpl = this.LL;
            String str = this.LLILLJJLI;
            int i = this.LLILLL;
            landscapeFeedMonitorImpl.getClass();
            C1561780qkC.LIZ(new AwS17S1001000_24(str, i, 0));
        }
        return Unit.LIZ;
    }
}
