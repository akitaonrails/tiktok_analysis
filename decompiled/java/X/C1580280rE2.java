package X;

import org.json.JSONObject;

/* JADX INFO: renamed from: X.0rE2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1580280rE2 {
    public static String LIZ;
    public static String LIZIZ;
    public static String LIZJ;
    public static String LIZLLL;
    public static boolean LJ;
    public static boolean LJFF;
    public static boolean LJI;
    public static boolean LJII = true;
    public static long LJIIIIZZ;
    public static long LJIIIZ;

    public static void LIZ() {
        String str = LIZIZ;
        String str2 = LIZJ;
        String str3 = LIZ;
        LJIIIZ = System.currentTimeMillis();
        LJ = false;
        LJFF = false;
        C786410Ut5.LJJZZIII(C799570VYd.LIZIZ(), new RunnableC514401zS(str, str2, str3, 0));
    }

    public static void LIZIZ() {
        final String str = LIZ;
        final String method = LIZLLL;
        if (method == null) {
            method = EnumC1570650qyV.SLIDE_LEFT.getMethod();
        }
        final long jCurrentTimeMillis = System.currentTimeMillis() - LJIIIZ;
        C786410Ut5.LJJZZIII(C799570VYd.LIZIZ(), new Runnable() { // from class: X.00kz
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("SidebarTrackHelper@aa6a.sidebarStayTime$1");
                try {
                    JSONObject jSONObject = new JSONObject();
                    String str2 = str;
                    String str3 = method;
                    long j = jCurrentTimeMillis;
                    jSONObject.put("entrance_id", str2);
                    jSONObject.put("action_type", str3);
                    jSONObject.put("duration", j);
                    C20684815ws.LJIJ("sidebar_stay_time", jSONObject);
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("SidebarTrackHelper@aa6a.sidebarStayTime$1");
            }
        });
        LJIIIZ = System.currentTimeMillis();
        LIZLLL = null;
    }

    public static void LIZJ(EnumC1570650qyV enumC1570650qyV) {
        String str = LIZLLL;
        if (str == null || str.length() == 0) {
            LIZLLL = enumC1570650qyV.getMethod();
        }
    }
}
