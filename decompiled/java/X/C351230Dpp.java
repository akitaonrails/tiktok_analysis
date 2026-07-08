package X;

/* JADX INFO: renamed from: X.0Dpp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C351230Dpp {
    public static final boolean LIZ() {
        return ((Boolean) C0E5G.LIZIZ(EnumC357850E1f.ENABLE_VOLUME_ADJUST_OPTIMIZATION, Boolean.FALSE)).booleanValue() && ((Number) C0E5G.LIZIZ(EnumC357850E1f.VOLUME_DB_RANGE, Double.valueOf(0.0d))).doubleValue() > 0.0d;
    }

    public static final boolean LIZIZ() {
        return ((Boolean) C0E5G.LIZIZ(EnumC357850E1f.ENABLE_KEY_FRAME, Boolean.FALSE)).booleanValue();
    }

    public static final boolean LIZJ(Boolean bool) {
        int iIntValue = ((Number) C0E5G.LIZIZ(EnumC357850E1f.ENABLE_MASK, 0)).intValue();
        if (bool == null) {
            if ((iIntValue & 1) == 0 && ((iIntValue & 2) >> 1) == 0) {
                return false;
            }
            return true;
        }
        if (bool.booleanValue()) {
            if ((iIntValue & 1) == 0) {
                return false;
            }
            return true;
        }
        if (((iIntValue & 2) >> 1) == 0) {
            return false;
        }
        return true;
    }

    public static final boolean LIZLLL(Boolean bool) {
        int iIntValue = ((Number) C0E5G.LIZIZ(EnumC357850E1f.ENABLE_SWING_PROPERTY_KEYFRAME, 0)).intValue();
        if (bool == null) {
            if ((iIntValue & 1) == 0 && ((iIntValue & 2) >> 1) == 0) {
                return false;
            }
            return true;
        }
        if (bool.booleanValue()) {
            if ((iIntValue & 1) == 0) {
                return false;
            }
            return true;
        }
        if (((iIntValue & 2) >> 1) == 0) {
            return false;
        }
        return true;
    }

    public static final boolean LJ(Boolean bool) {
        int iIntValue = ((Number) C0E5G.LIZIZ(EnumC357850E1f.ENABLE_PIP_VIDEO_ANIMATION_CONFIG, 0)).intValue();
        if (bool == null) {
            if ((iIntValue & 1) == 0 && ((iIntValue & 4) >> 2) == 0) {
                return false;
            }
            return true;
        }
        if (bool.booleanValue()) {
            if ((iIntValue & 1) == 0) {
                return false;
            }
            return true;
        }
        if (((iIntValue & 4) >> 2) == 0) {
            return false;
        }
        return true;
    }
}
