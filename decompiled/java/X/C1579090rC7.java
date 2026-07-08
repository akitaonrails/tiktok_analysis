package X;

import com.bytedance.bddatefmt.BDDateFormat;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import kotlin.jvm.internal.AFwS213S0000000_24;

/* JADX INFO: renamed from: X.0rC7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1579090rC7 {
    public static final C1579090rC7 LIZ = new C1579090rC7();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(508));
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(507));

    public static String LIZ(long j) {
        Object c098200Yq;
        try {
            c098200Yq = ((BDDateFormat) LIZIZ.getValue()).LIZIZ(LIZIZ(j) * ((long) LSPassThroughRecordSizeConfig.DEFAULT), Locale.getDefault());
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        String str = (String) c098200Yq;
        if (str == null) {
            return "";
        }
        return str;
    }

    public static long LIZIZ(long j) {
        long j2 = LSPassThroughRecordSizeConfig.DEFAULT;
        Calendar calendar = Calendar.getInstance();
        Calendar calendar2 = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        calendar2.setTime(new Date(j * j2));
        calendar.set(calendar2.get(1), calendar2.get(2), calendar2.get(5));
        return calendar.getTimeInMillis() / j2;
    }
}
