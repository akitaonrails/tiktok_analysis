package X;

/* JADX INFO: renamed from: X.0hSb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1204910hSb {
    public static final C1204910hSb LIZ = new C1204910hSb();
    public static Long LIZIZ;
    public static String LIZJ;

    public static void LIZ() {
        Long l;
        if (((Boolean) C0B97.LIZ.getValue()).booleanValue() && (l = LIZIZ) != null) {
            long jCurrentTimeMillis = System.currentTimeMillis() - l.longValue();
            LIZIZ = null;
            C2344009Gk c2344009Gk = new C2344009Gk();
            C1189060h32.LJIJJLI(c2344009Gk, "duration", String.valueOf(jCurrentTimeMillis));
            C1189060h32.LJIJJLI(c2344009Gk, "enable_location", C1204880hSY.LIZ());
            C1189060h32.LJIJJLI(c2344009Gk, "nearby_tab_city_id", C1204880hSY.LIZIZ());
            C1189060h32.LJIJJLI(c2344009Gk, "nearby_tab_enter_method", LIZJ);
            C1189060h32.LJIJJLI(c2344009Gk, "nearby_tab_position", C1204880hSY.LIZLLL(null));
            C20684815ws.LJIILLIIL("ttls_nearby_stay_time", c2344009Gk.LIZ);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("reported duration=");
            sbLIZ.append(jCurrentTimeMillis);
            sbLIZ.append(" ms");
            C2188811AlT.LIZIZ(sbLIZ);
        }
    }

    public static void LIZIZ() {
        if (((Boolean) C0B97.LIZ.getValue()).booleanValue() && LIZIZ == null) {
            LIZIZ = Long.valueOf(System.currentTimeMillis());
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("startTiming enterMethod: ");
            sbLIZ.append(LIZJ);
            C2188811AlT.LIZIZ(sbLIZ);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("startTiming at ");
            sbLIZ2.append(LIZIZ);
            C2188811AlT.LIZIZ(sbLIZ2);
        }
    }
}
