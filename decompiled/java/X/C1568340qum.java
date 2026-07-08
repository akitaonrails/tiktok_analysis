package X;

import com.ss.android.ugc.aweme.series.feed.ISeriesFeedService;
import kotlin.jvm.internal.AFwS190S0000000_4;

/* JADX INFO: renamed from: X.0qum, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1568340qum {
    public static final C01GW LIZ;
    public static final boolean LIZIZ;

    static {
        ISeriesFeedService iSeriesFeedServiceLIZIZ;
        InterfaceC1577520r9a interfaceC1577520r9aLIZIZ;
        C01GW c01gwLIZIZ = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(2996));
        LIZ = c01gwLIZIZ;
        boolean z = true;
        if (((Number) c01gwLIZIZ.getValue()).intValue() != 1 && ((iSeriesFeedServiceLIZIZ = C0RRR.LIZIZ()) == null || (interfaceC1577520r9aLIZIZ = iSeriesFeedServiceLIZIZ.LIZIZ()) == null || !interfaceC1577520r9aLIZIZ.getEnable())) {
            z = false;
        }
        LIZIZ = z;
    }
}
