package X;

/* JADX INFO: renamed from: X.0VPW, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0VPW {
    public static final int LIZ;
    public static final boolean LIZIZ;

    static {
        boolean z = false;
        int iLJIJ = C0C64.LJIILLIIL().LJIJ(31744, 0, "google_cubes_videos_update_frequency_precise", true);
        LIZ = iLJIJ;
        if (C0VPX.LIZ && iLJIJ > 0) {
            z = true;
        }
        LIZIZ = z;
    }

    public static EnumC797240VPe[] LIZ() {
        int i = LIZ;
        return i != 0 ? i != 1 ? i != 2 ? new EnumC797240VPe[0] : new EnumC797240VPe[]{EnumC797240VPe.TWO2FIVE_AM, EnumC797240VPe.THREE2FOUR_PM} : new EnumC797240VPe[]{EnumC797240VPe.TWO2FIVE_AM} : new EnumC797240VPe[0];
    }
}
