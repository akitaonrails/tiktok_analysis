package X;

import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.saas.host.api.im.IMHostApi;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AFwS187S0000000_2;

/* JADX INFO: renamed from: X.053y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C12924053y {
    public static final C12924053y LIZ = new C12924053y();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(1221));
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(1220));

    public static long LIZ() {
        IMHostApi iMHostApi = (IMHostApi) PluggableExtentionKt.pluggableSpiForReal(IMHostApi.class);
        return iMHostApi != null ? iMHostApi.LIZIZ() : System.currentTimeMillis();
    }

    public static long LIZIZ(C12924053y c12924053y, long j, long j2) {
        TimeZone timeZone = TimeZone.getDefault();
        long j3 = 60;
        long j4 = j2 * j3 * j3;
        c12924053y.getClass();
        C01GW c01gw = LIZJ;
        Calendar calendar = (Calendar) ((ConcurrentHashMap) c01gw.getValue()).get(Long.valueOf(j2));
        if (calendar == null) {
            calendar = Calendar.getInstance(timeZone, Locale.ROOT);
            calendar.setTimeInMillis(((long) LSPassThroughRecordSizeConfig.DEFAULT) * j4);
        }
        ((ConcurrentHashMap) c01gw.getValue()).put(Long.valueOf(j2), calendar);
        return ((long) (calendar.get(11) * 60 * 60)) + (j - j4);
    }
}
