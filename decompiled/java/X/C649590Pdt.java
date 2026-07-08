package X;

/* JADX INFO: renamed from: X.0Pdt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C649590Pdt {
    public static final long LIZ(C1537810q7X c1537810q7X) {
        long jLongValue;
        long jLongValue2;
        long jLongValue3;
        long jLongValue4;
        long jLongValue5;
        Long l = c1537810q7X.LJJ;
        long jLongValue6 = 0;
        if (l != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = 0;
        }
        Long l2 = c1537810q7X.LIZ;
        if (l2 != null) {
            jLongValue2 = l2.longValue();
        } else {
            jLongValue2 = 0;
        }
        long j = jLongValue - jLongValue2;
        Long l3 = c1537810q7X.LIZJ;
        if (l3 != null) {
            jLongValue3 = l3.longValue();
        } else {
            jLongValue3 = 0;
        }
        Long l4 = c1537810q7X.LIZIZ;
        if (l4 != null) {
            jLongValue4 = l4.longValue();
        } else {
            jLongValue4 = 0;
        }
        long j2 = j - (jLongValue3 - jLongValue4);
        Long l5 = c1537810q7X.LJJ;
        if (l5 != null) {
            jLongValue5 = l5.longValue();
        } else {
            jLongValue5 = 0;
        }
        Long l6 = c1537810q7X.LJIL;
        if (l6 != null) {
            jLongValue6 = l6.longValue();
        }
        return j2 - (jLongValue5 - jLongValue6);
    }

    public static final long LIZIZ(C1538200q8A c1538200q8A) {
        long jLongValue;
        Long l = c1538200q8A.LJFF;
        long jLongValue2 = 0;
        if (l != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = 0;
        }
        Long l2 = c1538200q8A.LJ;
        if (l2 != null) {
            jLongValue2 = l2.longValue();
        }
        return jLongValue - jLongValue2;
    }

    public static final void LIZJ(boolean z, long j, long j2, long j3, long j4, long j5, String str) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJ(Boolean.valueOf(z), "is_quick_lynx_container");
        c2344009Gk.LIZLLL(j, "first_frame_cost");
        c2344009Gk.LIZLLL(j2, "search_lynx_load_cost");
        c2344009Gk.LIZLLL(j3, "container_cost_in_search");
        c2344009Gk.LIZLLL(j4, "container_cost");
        c2344009Gk.LIZLLL(j5, "lynx_cost");
        c2344009Gk.LJIIIIZZ("card_type", str);
        C20684815ws.LJIILLIIL("search_quick_container_measurement", c2344009Gk.LIZ);
    }
}
