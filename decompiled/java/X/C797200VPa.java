package X;

import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.awemepushapi.IPushApi;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/* JADX INFO: renamed from: X.0VPa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C797200VPa {
    public static final C797200VPa LIZ = new C797200VPa();
    public static final String LIZIZ = ((IPushApi) ServiceManager.get().getService(IPushApi.class)).getAppScheme();

    public static List LIZ(int i) {
        long jLIZ;
        long j;
        boolean z;
        ArrayList arrayList = new ArrayList();
        if (C0VPS.LIZ) {
            C0VPZ.LIZ.getClass();
            long jLIZIZ = C0VPZ.LIZIZ(0);
            arrayList.add(new C0VPR(C797260VPg.LIZ(4, 999, jLIZIZ), 4, 999, System.currentTimeMillis() + C0VPS.LIZIZ, 1410));
        }
        for (int i2 = 0; i2 < i; i2++) {
            C0VPZ.LIZ.getClass();
            Calendar calendar = Calendar.getInstance();
            if (i2 == 0) {
                jLIZ = C1514430pVp.LIZ();
                j = 7200000;
            } else {
                jLIZ = C1514430pVp.LIZ();
                j = ((long) i2) * 86400000;
            }
            calendar.setTimeInMillis(jLIZ + j);
            int i3 = calendar.get(11);
            if (i3 >= 0 && i3 < 8) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                if (i2 == 0) {
                    calendar.set(11, 8);
                } else {
                    calendar.set(11, 18);
                }
                calendar.set(13, 0);
                calendar.set(12, 0);
                calendar.set(14, 0);
            }
            long timeInMillis = calendar.getTimeInMillis();
            Calendar calendar2 = Calendar.getInstance();
            calendar2.setTimeInMillis(timeInMillis);
            calendar2.set(11, 0);
            calendar2.set(12, 0);
            calendar2.set(13, 0);
            calendar2.set(14, 0);
            arrayList.add(new C0VPR(C797260VPg.LIZ(4, i2, calendar2.getTimeInMillis()), 4, i2, timeInMillis, 1410));
        }
        return arrayList;
    }
}
