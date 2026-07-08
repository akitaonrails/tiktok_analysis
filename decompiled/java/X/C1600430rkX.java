package X;

/* JADX INFO: renamed from: X.0rkX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1600430rkX {
    public static final EnumC1609560rzG LIZ(EnumC1605470rsf enumC1605470rsf) {
        int i = C1605370rsV.LIZ[enumC1605470rsf.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        return EnumC1609560rzG.NONE;
                    }
                    return EnumC1609560rzG.RED_RING;
                }
                return EnumC1609560rzG.PRORGRESS;
            }
            return EnumC1609560rzG.GRAY_RING;
        }
        return EnumC1609560rzG.BRAND_RING;
    }
}
