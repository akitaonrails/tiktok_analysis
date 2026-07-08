package X;

/* JADX INFO: renamed from: X.0u6L, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1690830u6L {
    public static final float LIZ(AbstractC1690640u62 abstractC1690640u62) {
        if (abstractC1690640u62.LJIIL().getOrientation() == EnumC1684030tvN.Horizontal) {
            return Float.intBitsToFloat((int) (abstractC1690640u62.LJIIZILJ() >> 32));
        }
        return Float.intBitsToFloat((int) (abstractC1690640u62.LJIIZILJ() & 4294967295L));
    }

    public static final boolean LIZIZ(AbstractC1690640u62 abstractC1690640u62, float f) {
        float fLIZ;
        boolean reverseLayout = abstractC1690640u62.LJIIL().getReverseLayout();
        if (abstractC1690640u62.LJIJ()) {
            fLIZ = -f;
        } else {
            fLIZ = LIZ(abstractC1690640u62);
        }
        if (fLIZ > 0.0f) {
            if (reverseLayout) {
                return true;
            }
        } else if (!reverseLayout) {
            return true;
        }
        return false;
    }
}
