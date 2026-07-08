package X;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.09jj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2455309jj {
    public static long LIZ() {
        return TimeUnit.SECONDS.toMillis(C0C64.LJIILLIIL().LJIJ(31744, 0, "4480_lifecycle_active_duration", true));
    }

    public static int LIZIZ() {
        return C0C64.LJIILLIIL().LJIJ(31744, 0, "4480_lifecycle_active_heartbeat", true);
    }

    public static int LIZJ() {
        int iLJIJ = C0C64.LJIILLIIL().LJIJ(31744, 0, "4570_lifecycle_job_delay_next_day_utc_hour", true);
        if (iLJIJ > 0) {
            return iLJIJ - 100;
        }
        return -1;
    }

    public static boolean LIZLLL() {
        return (C0C64.LJIILLIIL().LJIJ(31744, 0, "4480_lifecycle_active_bg", true) & 2) == 2;
    }

    public static List<String> LJFF(String str) {
        if (TextUtils.isEmpty(str)) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        for (String str2 : str.split(",")) {
            String strTrim = str2.trim();
            if (!strTrim.isEmpty()) {
                arrayList.add(strTrim);
            }
        }
        return arrayList;
    }

    public static boolean LJ(String str, List list) {
        if (list.isEmpty()) {
            return true;
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            String str2 = (String) it2.next();
            if (!str.equals(str2)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(e3.d);
                sbLIZ.append(str2);
                if (str.endsWith(C2188811AlT.LIZIZ(sbLIZ))) {
                }
            }
            return true;
        }
        return false;
    }
}
