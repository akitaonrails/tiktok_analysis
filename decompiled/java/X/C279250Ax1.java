package X;

import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.service.ISeriesETHost;
import kotlin.jvm.internal.AFwS190S0000000_4;

/* JADX INFO: renamed from: X.0Ax1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C279250Ax1 {
    public static final C279250Ax1 LIZ = new C279250Ax1();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(453));

    public static boolean LIZ() {
        ISeriesETHost iSeriesETHost = (ISeriesETHost) PluggableExtentionKt.pluggableSpi$default(ISeriesETHost.class, false, false, false, 14, null);
        if (iSeriesETHost != null) {
            iSeriesETHost.LIZ();
        }
        return ((Number) LIZIZ.getValue()).intValue() == 1;
    }
}
