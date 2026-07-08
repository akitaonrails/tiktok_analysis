package X;

/* JADX INFO: renamed from: X.13z0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20188413z0 {
    public volatile float LIZ;
    public volatile int LIZIZ;
    public volatile float LIZJ;
    public volatile float LIZLLL = -1.0f;

    public final <T> T LIZ(EnumC20188613z2 enumC20188613z2) {
        int i = C20188513z1.LIZ[enumC20188613z2.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("Unknown Message key: ");
                        sbLIZ.append(enumC20188613z2);
                        C2484209oO.LJI("VEPerformanceChannel", C2188811AlT.LIZIZ(sbLIZ));
                        return (T) 0;
                    }
                    return (T) Float.valueOf(this.LIZLLL);
                }
                return (T) Float.valueOf(this.LIZJ);
            }
            return (T) Integer.valueOf(this.LIZIZ);
        }
        return (T) Float.valueOf(this.LIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T> void LIZIZ(EnumC20188613z2 enumC20188613z2, T t) {
        int i = C20188513z1.LIZ[enumC20188613z2.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("Unknown Message key: ");
                        sbLIZ.append(enumC20188613z2);
                        C2484209oO.LJI("VEPerformanceChannel", C2188811AlT.LIZIZ(sbLIZ));
                        return;
                    }
                    if (t instanceof Number) {
                        this.LIZLLL = ((Number) t).floatValue();
                        return;
                    } else {
                        C2484209oO.LIZJ("VEPerformanceChannel", "INSTANT_AMBIENT_LIGHT_LUX expects a Number (float).");
                        return;
                    }
                }
                if (t instanceof Number) {
                    this.LIZJ = ((Number) t).floatValue();
                    return;
                } else {
                    C2484209oO.LIZJ("VEPerformanceChannel", "INSTANT_EXPOSURE_TIME_MS expects a Number (float).");
                    return;
                }
            }
            if (t instanceof Number) {
                this.LIZIZ = ((Number) t).intValue();
                return;
            } else {
                C2484209oO.LIZJ("VEPerformanceChannel", "INSTANT_ISO expects a Number (int).");
                return;
            }
        }
        if (t instanceof Number) {
            this.LIZ = ((Number) t).floatValue();
        } else {
            C2484209oO.LIZJ("VEPerformanceChannel", "INSTANT_CAMERA_FPS expects a Number (float/double).");
        }
    }
}
