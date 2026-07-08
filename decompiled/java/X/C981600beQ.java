package X;

/* JADX INFO: renamed from: X.0beQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C981600beQ {
    public static String LIZ(EnumC981560beM enumC981560beM) {
        switch (C981610beR.LIZ[enumC981560beM.ordinal()]) {
            case 1:
                return "active";
            case 2:
                if (C915980Zwa.LJI().LIZ().LJJIJLIJ()) {
                    return "live_end";
                }
                return "cohost_end";
            case 3:
                return "host_guest_changed";
            case 4:
                return "time_out";
            case 5:
                return "low_performance";
            case 6:
                return "game_not_ready";
            case 7:
                return "game_version_too_low";
            case 8:
                return "gift_arena";
            default:
                throw new C1954807lC();
        }
    }
}
