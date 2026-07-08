package X;

/* JADX INFO: renamed from: X.09sI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C2508409sI {
    public static final /* synthetic */ int LIZ = 0;

    public static int LIZ() {
        boolean z = C0C64.LJIILLIIL().LJIJ(31744, 0, "poi_add_location_show_distance", true) == 1;
        int iLJIJ = C0C64.LJIILLIIL().LJIJ(31744, 0, "poi_add_location_distance_ui_style", false);
        if (!z) {
            return 1;
        }
        if (iLJIJ == 1) {
            return 3;
        }
        return iLJIJ == 2 ? 5 : 1;
    }
}
