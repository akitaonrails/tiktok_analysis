package X;

/* JADX INFO: renamed from: X.0YCs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C870440YCs {
    public final C0YEM LIZ;

    public C870440YCs(C0YEM c0yem) {
        this.LIZ = c0yem;
    }

    public final void LIZJ(String str) {
        if (this.LIZ.LJIIIZ().LJJIIZ) {
            this.LIZ.LJIIZILJ().LJFF().LIZ().LJ(null, true, -1, str);
        }
        this.LIZ.LJIIZILJ().LJFF().LIZLLL().LIZIZ();
    }

    public final void LIZ(long j, String str) {
        long jCurrentTimeMillis = 0;
        if (j > 0) {
            jCurrentTimeMillis = System.currentTimeMillis() - j;
            if (jCurrentTimeMillis > 1000) {
                C868780Y6i c868780Y6iLIZLLL = this.LIZ.LIZLLL();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(str);
                sbLIZ.append(" cost ");
                sbLIZ.append(jCurrentTimeMillis);
                sbLIZ.append("ms");
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                c868780Y6iLIZLLL.getClass();
                C868780Y6i.LJIILJJIL(c868780Y6iLIZLLL, "ReportManager ", strLIZIZ, 4);
            }
        }
        if (this.LIZ.LJIIIZ().LJJIIZ) {
            C870460YCu c870460YCuLIZ = this.LIZ.LJIIZILJ().LJFF().LIZ();
            if (c870460YCuLIZ.LIZJ.LJIIZILJ().LJFF().getEventTracker().LIZJ(0.005f)) {
                C0YJ9 c0yj9 = new C0YJ9(c870460YCuLIZ.LIZJ);
                c0yj9.LIZJ("im_sdk_db_op_cost");
                if (str == null) {
                    str = "unknown";
                }
                c0yj9.LIZ(str, "tag");
                c0yj9.LIZ(Long.valueOf(jCurrentTimeMillis), "cost_time");
                c0yj9.LIZ(Boolean.valueOf(C787080UuA.LIZ()), "is_main_thread");
                c0yj9.LIZ(Boolean.valueOf(c870460YCuLIZ.LIZJ.LJIIZILJ().LIZIZ().LIZ().LJIIJ()), "is_encrypted");
                c0yj9.LJFF();
            }
        }
    }

    public final void LIZIZ(int i, String str, Throwable th) {
        if (this.LIZ.LJIIIZ().LJJIIZ) {
            this.LIZ.LJIIZILJ().LJFF().LIZ().LJ(th, false, i, str);
        }
        this.LIZ.LJIIZILJ().LJFF().LIZLLL().LIZIZ();
    }
}
