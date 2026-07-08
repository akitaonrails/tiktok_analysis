package X;

/* JADX INFO: renamed from: X.0nSU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1435480nSU {
    public static final C1435480nSU LIZ = new C1435480nSU();

    public static void LIZ(EnumC1434950nRd enumC1434950nRd, EnumC995380c0e enumC995380c0e, Float f, Float f2, Float f3, int i) {
        Integer numValueOf;
        C0LAB c0lab = new C0LAB();
        c0lab.LIZ(enumC1434950nRd.getStageLogVal(), "stage");
        LIZ.getClass();
        EnumC1434950nRd enumC1434950nRd2 = EnumC1434950nRd.ADDED_TO_QUEUE;
        if (enumC1434950nRd != enumC1434950nRd2 && enumC1434950nRd != EnumC1434950nRd.START_PUBLISH) {
            if (enumC995380c0e != null) {
                numValueOf = Integer.valueOf(enumC995380c0e.getResultLogVal());
            } else {
                numValueOf = null;
            }
            c0lab.LIZLLL(numValueOf, "result");
        }
        if (enumC1434950nRd != enumC1434950nRd2 && enumC1434950nRd != EnumC1434950nRd.START_PUBLISH) {
            c0lab.LIZJ(f3, "time_cost");
        }
        c0lab.LIZJ(f, "size");
        c0lab.LIZJ(f2, "duration");
        c0lab.LIZ(i, "count_in_queue");
        C20684815ws.LJIILLIIL("livesdk_service_course_video_status", c0lab.LIZ);
    }
}
