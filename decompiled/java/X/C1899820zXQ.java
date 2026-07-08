package X;

import com.bytedance.keva.Keva;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0zXQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1899820zXQ {
    public final Keva LIZ = Keva.getRepo("time_stamp_count_helper");

    public static long LIZ() {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(System.currentTimeMillis());
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return calendar.getTimeInMillis();
    }

    public final int LIZIZ(int i) {
        int i2;
        if (i <= 0) {
            i2 = 0;
        } else {
            i2 = i - 1;
        }
        long jLIZ = LIZ();
        List listLJLI = C13LQ.LJLI(this.LIZ.getStringArray("pendant_close_day_list", new String[0]));
        ArrayList arrayList = new ArrayList();
        long j = jLIZ - ((long) (i2 * 86400000));
        Iterator it2 = ((ArrayList) listLJLI).iterator();
        while (it2.hasNext()) {
            Long lLJIILIIL = C2095008Iq.LJIILIIL((String) it2.next());
            if (lLJIILIIL != null && lLJIILIIL.longValue() >= j) {
                arrayList.add(lLJIILIIL.toString());
            }
        }
        return arrayList.size();
    }
}
