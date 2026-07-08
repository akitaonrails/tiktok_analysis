package X;

import org.json.JSONException;

/* JADX INFO: renamed from: X.0KMb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public abstract class AbstractC516150KMb<RESPONSE_TYPE> {
    public static void LIZIZ(C516160KMc c516160KMc) throws JSONException {
        int iIntValue;
        int i;
        C516000KLm c516000KLm = C516000KLm.LIZ;
        boolean zLIZ = c516160KMc.LIZ.LIZ();
        long j = c516160KMc.LIZIZ;
        Integer num = c516160KMc.LJFF;
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = -999;
        }
        C0KNY c0kny = c516160KMc.LIZ;
        String str = c0kny.LIZLLL;
        String str2 = c0kny.LIZIZ;
        c0kny.LIZJ.get();
        C516100KLw c516100KLwLIZ = C0KM8.LIZ();
        C0KNY c0kny2 = c516160KMc.LIZ;
        C516400KNa c516400KNa = c0kny2.LIZ;
        if (c516400KNa != null) {
            i = c516400KNa.LLILZ;
        } else {
            i = 0;
        }
        c516000KLm.LJIIIIZZ(zLIZ, j, iIntValue, str, str2, c516100KLwLIZ, i, c516160KMc.LJ, c516160KMc.LJI, c0kny2);
    }

    public static void LIZJ(C516160KMc c516160KMc) {
        C516000KLm c516000KLm = C516000KLm.LIZ;
        boolean zLIZ = c516160KMc.LIZ.LIZ();
        String str = c516160KMc.LIZJ;
        C0KNY c0kny = c516160KMc.LIZ;
        String str2 = c0kny.LIZLLL;
        String str3 = c0kny.LIZIZ;
        c0kny.LIZJ.get();
        c516000KLm.LJIIJ(zLIZ, str, str2, str3, C0KM8.LIZ(), c516160KMc.LIZ);
    }

    public static void LIZLLL(C516160KMc c516160KMc) throws JSONException {
        int i;
        C516000KLm c516000KLm = C516000KLm.LIZ;
        boolean zLIZ = c516160KMc.LIZ.LIZ();
        String str = c516160KMc.LIZJ;
        long j = c516160KMc.LIZIZ;
        C0KNY c0kny = c516160KMc.LIZ;
        String str2 = c0kny.LIZLLL;
        String str3 = c0kny.LIZIZ;
        c0kny.LIZJ.get();
        C516100KLw c516100KLwLIZ = C0KM8.LIZ();
        C0KNY c0kny2 = c516160KMc.LIZ;
        C516400KNa c516400KNa = c0kny2.LIZ;
        if (c516400KNa != null) {
            i = c516400KNa.LLILZ;
        } else {
            i = 0;
        }
        c516000KLm.LJIIJJI(zLIZ, str, j, str2, str3, c516100KLwLIZ, i, c0kny2);
    }

    public static C516160KMc LIZ(C0KLO c0klo, C0KFM c0kfm, long j, String str, Throwable th, String str2, int i) {
        String str3 = str2;
        Throwable th2 = th;
        String str4 = str;
        long j2 = j;
        if ((i & 2) != 0) {
            j2 = 0;
        }
        String str5 = "";
        if ((i & 4) != 0) {
            str4 = "";
        }
        Integer numValueOf = null;
        if ((i & 8) != 0) {
            th2 = null;
        }
        if ((i & 16) != 0) {
            str3 = "";
        }
        c0klo.getClass();
        String str6 = C09OK.LIZ(null, th2).LIZLLL;
        if (str6 != null) {
            str5 = str6;
        }
        if (th2 != null) {
            numValueOf = Integer.valueOf(C512310K7h.LIZIZ(th2));
        }
        return new C516160KMc(c0kfm, j2, str4, str5, str3, numValueOf, th2);
    }
}
