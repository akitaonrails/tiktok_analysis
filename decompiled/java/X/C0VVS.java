package X;

import android.os.SystemClock;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.LinkedList;
import kotlin.jvm.internal.AFwS200S0000000_13;

/* JADX INFO: renamed from: X.0VVS, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0VVS {
    public final C01GW LIZ = C452501pT.LIZIZ(AFwS200S0000000_13.get$arr$(322));

    public final LinkedList<Long> LIZIZ() {
        return (LinkedList) this.LIZ.getValue();
    }

    public final float LIZ() {
        long jUptimeMillis = SystemClock.uptimeMillis();
        Long l = (Long) C13LP.LJJLIIIJL(LIZIZ());
        if (l != null && jUptimeMillis - l.longValue() > 100) {
            l.longValue();
            LIZIZ().clear();
        }
        LIZIZ().addLast(Long.valueOf(jUptimeMillis));
        Long lPeekFirst = LIZIZ().peekFirst();
        if (lPeekFirst == null) {
            return 0.0f;
        }
        float fLongValue = jUptimeMillis - lPeekFirst.longValue();
        if (LIZIZ().size() > 50) {
            LIZIZ().removeFirst();
        }
        if (fLongValue > 0) {
            return (LIZIZ().size() * LSPassThroughRecordSizeConfig.DEFAULT) / fLongValue;
        }
        return 0.0f;
    }
}
