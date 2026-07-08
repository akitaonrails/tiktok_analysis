package X;

import android.content.Context;
import java.util.Map;
import kotlin.jvm.internal.AFwS193S0000000_7;

/* JADX INFO: renamed from: X.0KMZ, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0KMZ {
    public String LIZ = "";
    public String LIZIZ = "";
    public final C515950KLh LIZJ = C0KLU.LIZ;
    public final C01GW LIZLLL = C452501pT.LIZIZ(AFwS193S0000000_7.get$arr$(237));

    public static void LIZ(C0KMZ c0kmz, Map map, Context context, int i, int i2, int i3, Exception exc) {
        String strLIZ;
        Context contextLJIIJ;
        int iIntValue;
        c0kmz.getClass();
        if (i != 0 && i != 1 && i != 2 && i != 3) {
            return;
        }
        C0K6E c0k6eLIZ = C09OK.LIZ(null, exc);
        if (c0k6eLIZ.LJ) {
            Integer num = c0k6eLIZ.LIZ;
            if (num != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = 0;
            }
            strLIZ = C516570KNr.LIZ(iIntValue);
        } else if (i == 3) {
            strLIZ = "precheck";
        } else if (i3 == C0KPI.PENDING.getValue()) {
            strLIZ = "pending";
        } else if (i3 == C0KPI.CANCELLED.getValue()) {
            strLIZ = "cancel";
        } else if (i3 == C0KPI.FAILED.getValue()) {
            strLIZ = "google-apple";
        } else {
            strLIZ = "unknown";
        }
        if (context != null) {
            contextLJIIJ = C0K51.LJIIJ(context, true);
        } else {
            contextLJIIJ = null;
        }
        C0KNO c0kno = new C0KNO(contextLJIIJ, i, i2, Integer.valueOf(i3), strLIZ, exc, map, null, c0kmz.LIZ);
        c0kno.LJIIJ = null;
        c0kno.LJIIIZ = ((C516140KMa) c0kmz.LIZLLL.getValue()).LIZ(i2, context);
        C0KNJ.LIZIZ(c0kno);
        C0KMW.LIZ.getClass();
        C0KMW.LIZIZ(i2, strLIZ, map);
        C0KMW.LIZ(i2, strLIZ, map);
    }
}
