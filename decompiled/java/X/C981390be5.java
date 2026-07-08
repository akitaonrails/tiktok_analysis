package X;

/* JADX INFO: renamed from: X.0be5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C981390be5 {
    public static String LIZ(EnumC981380be4 enumC981380be4) {
        int i = C981400be6.LIZ[enumC981380be4.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        return "time_out";
                    }
                    throw new C1954807lC();
                }
                return "mic_room_start";
            }
            if (C915980Zwa.LJI().LIZ().LJJLIIIJJIZ()) {
                return "live_end";
            }
            return "cohost_end";
        }
        return "active";
    }
}
