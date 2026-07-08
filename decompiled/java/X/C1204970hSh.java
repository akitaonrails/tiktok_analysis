package X;

/* JADX INFO: renamed from: X.0hSh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1204970hSh {
    public static final String LIZ(EnumC1204690hSF enumC1204690hSF) {
        int i = C1204780hSO.LIZ[enumC1204690hSF.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        return "explore_regions";
                    }
                    throw new C1954807lC();
                }
                return "nearby_intro";
            }
            return "gps_ineligible";
        }
        return "open_gps";
    }
}
