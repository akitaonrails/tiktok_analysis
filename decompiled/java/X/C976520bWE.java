package X;

/* JADX INFO: renamed from: X.0bWE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C976520bWE {
    public static String LIZ(EnumC976510bWD enumC976510bWD) {
        switch (C976530bWF.LIZ[enumC976510bWD.ordinal()]) {
            case 1:
                return "active";
            case 2:
                if (C915980Zwa.LJI().LIZ().LJJIJLIJ()) {
                    return "live_end";
                }
                return "cohost_end";
            case 3:
                return "mic_room_start";
            case 4:
                return "cancel_from_jsb";
            case 5:
                return "time_out";
            case 6:
                return "unknown";
            default:
                throw new C1954807lC();
        }
    }
}
