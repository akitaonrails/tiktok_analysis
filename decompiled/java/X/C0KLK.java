package X;

/* JADX INFO: renamed from: X.0KLK, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public abstract class C0KLK<RESPONSE_TYPE> {
    public static void LIZ(C0KLL c0kll) {
        C516000KLm c516000KLm = C516000KLm.LIZ;
        long jCurrentTimeMillis = System.currentTimeMillis() - 0;
        Integer num = c0kll.LJFF;
        String str = c0kll.LIZJ;
        String str2 = c0kll.LJ;
        String str3 = c0kll.LJI;
        c516000KLm.getClass();
        C1973307oB c1973307oB = C1973307oB.LIZ;
        C1973407oC c1973407oC = new C1973407oC("livesdk_subscription_tpl_fail");
        c1973407oC.LIZ("1", "is_from_pgc_subscription");
        c1973407oC.LIZ(str3, "show_entrance");
        c1973407oC.LIZ(str, "source");
        c1973407oC.LIZ(Float.valueOf(jCurrentTimeMillis), "duration");
        c1973407oC.LIZ(num, "error_code");
        c1973407oC.LIZ(str2, "log_id");
        c1973407oC.LIZ(Long.valueOf(System.currentTimeMillis()), "time_stamp_milli");
        c1973407oC.LIZJ();
    }

    public static void LIZIZ(C0KLL c0kll) {
        C516000KLm c516000KLm = C516000KLm.LIZ;
        long j = c0kll.LIZ;
        int i = c0kll.LIZIZ;
        String str = c0kll.LIZLLL;
        String str2 = c0kll.LIZJ;
        String str3 = c0kll.LJI;
        c516000KLm.getClass();
        C516000KLm.LJFF = str;
        C1973307oB c1973307oB = C1973307oB.LIZ;
        C1973407oC c1973407oC = new C1973407oC("livesdk_subscription_tpl_success");
        c1973407oC.LIZ("1", "is_from_pgc_subscription");
        c1973407oC.LIZ(str3, "show_entrance");
        c1973407oC.LIZ(str2, "source");
        c1973407oC.LIZ(Float.valueOf(j), "duration");
        c1973407oC.LIZ(Integer.valueOf(i), "tpl_count");
        c1973407oC.LIZ(Long.valueOf(System.currentTimeMillis()), "time_stamp_milli");
        c1973407oC.LIZJ();
    }
}
