package X;

/* JADX INFO: renamed from: X.0TbV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C750030TbV {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZIZ(long j, long j2, boolean z) {
        C760160Trq c760160TrqLIZJ;
        if (z) {
            c760160TrqLIZJ = C759970TrX.LIZJ("ttlive_add_ban");
        } else {
            c760160TrqLIZJ = C759970TrX.LIZJ("ttlive_delete_ban");
        }
        c760160TrqLIZJ.LIZJ(Long.valueOf(j), "room_id");
        c760160TrqLIZJ.LIZJ(Long.valueOf(j2), "user_id");
        c760160TrqLIZJ.LJIIIZ();
    }

    public static void LIZ(boolean z, long j, long j2, Throwable th) {
        C760160Trq c760160TrqLIZ;
        if (z) {
            c760160TrqLIZ = C752620Tfg.LIZ("ttlive_add_ban", th);
        } else {
            c760160TrqLIZ = C752620Tfg.LIZ("ttlive_delete_ban", th);
        }
        c760160TrqLIZ.LIZJ(Long.valueOf(j), "room_id");
        c760160TrqLIZ.LIZJ(Long.valueOf(j2), "user_id");
        c760160TrqLIZ.LJIIIZ();
    }
}
