package X;

import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.Calendar;
import java.util.Date;

/* JADX INFO: renamed from: X.0zWQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1899200zWQ {
    public static final C1899200zWQ LIZ = new C1899200zWQ();

    public static int LIZIZ() {
        AbstractC1896090zRP abstractC1896090zRP = (AbstractC1896090zRP) C1619720sFe.LIZ.LIZ(0);
        return abstractC1896090zRP != null ? abstractC1896090zRP.LJIL() : (int) (System.currentTimeMillis() / ((long) LSPassThroughRecordSizeConfig.DEFAULT));
    }

    public static long LIZ(C1899200zWQ c1899200zWQ) {
        c1899200zWQ.getClass();
        long jLIZIZ = (((long) LIZIZ()) * 1000) + 0;
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date(jLIZIZ));
        calendar.set(11, 0);
        calendar.set(13, 0);
        calendar.set(12, 0);
        calendar.set(14, 0);
        return calendar.getTimeInMillis() / ((long) LSPassThroughRecordSizeConfig.DEFAULT);
    }

    public final boolean LIZJ(long j) {
        if (LIZ(this) == j) {
            return true;
        }
        return false;
    }
}
