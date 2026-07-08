package X;

/* JADX INFO: renamed from: X.0wj8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1791760wj8 {
    public static void LIZ(C518080KTm c518080KTm, C1792840wks c1792840wks) {
        C0KPI c0kpi;
        if (c1792840wks != null) {
            c518080KTm.LJFF = c1792840wks.LJ;
            c518080KTm.LIZJ = c1792840wks.LIZIZ;
            int i = c1792840wks.LIZ;
            c518080KTm.LIZIZ = i;
            c518080KTm.LIZLLL = c1792840wks.LJI;
            c518080KTm.LJ = c1792840wks.LJII;
            if (c518080KTm.LIZ == 1) {
                c0kpi = C0KPI.SUCCESS;
            } else if (i == -202) {
                c0kpi = C0KPI.PENDING;
            } else if (i == 206) {
                c0kpi = C0KPI.CANCELLED;
            } else {
                c0kpi = C0KPI.FAILED;
            }
            c518080KTm.LJII = c0kpi;
        }
    }
}
