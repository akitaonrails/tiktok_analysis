package X;

import com.ss.android.ugc.aweme.feed.adapter.widget.TimeConfig;
import kotlin.jvm.internal.AFwS226S0000000_35;

/* JADX INFO: renamed from: X.1ECM, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1ECM {
    public static final TimeConfig LIZ = new TimeConfig(0, -1, -1, false);
    public static final C01GW LIZIZ;
    public static final boolean LIZJ;
    public static final int LIZLLL;
    public static final int LJ;
    public static final boolean LJFF;

    static {
        C01GW c01gwLIZ = C292401Bi.LIZ(AFwS226S0000000_35.get$arr$(400));
        LIZIZ = c01gwLIZ;
        LIZJ = ((TimeConfig) c01gwLIZ.getValue()).enable == 1;
        LIZLLL = ((TimeConfig) c01gwLIZ.getValue()).firstInterval;
        LJ = ((TimeConfig) c01gwLIZ.getValue()).interval;
        LJFF = ((TimeConfig) c01gwLIZ.getValue()).preInitWsChannel;
    }
}
