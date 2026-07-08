package X;

import android.content.Context;
import java.util.Calendar;

/* JADX INFO: renamed from: X.0SQ4, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0SQ4 {
    public static String LIZ(long j, Context context) {
        String strLJI;
        if (Calendar.getInstance().getTimeInMillis() - j <= 0) {
            j = Calendar.getInstance().getTimeInMillis() - 1;
        }
        if (C1339960kyQ.LIZ()) {
            strLJI = C2215101Bmm.LJ(j);
        } else {
            strLJI = C1356610lPH.LJI(j, context);
        }
        C1360520lVa c1360520lVa = new C1360520lVa();
        c1360520lVa.LIZ.append((CharSequence) strLJI);
        return c1360520lVa.LIZ.toString();
    }
}
