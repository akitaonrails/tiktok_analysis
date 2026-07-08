package X;

/* JADX INFO: renamed from: X.0uDe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1695360uDe {
    public static final float LIZIZ;
    public static final float LIZJ;
    public static final float LIZLLL;
    public final float LIZ;

    static {
        LIZ(0.0f);
        LIZ(0.5f);
        LIZIZ = 0.5f;
        LIZ(-1.0f);
        LIZJ = -1.0f;
        LIZ(1.0f);
        LIZLLL = 1.0f;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.LIZ);
    }

    public final String toString() {
        return LIZIZ(this.LIZ);
    }

    public static void LIZ(float f) {
        if ((0.0f <= f && f <= 1.0f) || f == -1.0f) {
            return;
        }
        C1681000tqU.LIZJ("topRatio should be in [0..1] range or -1");
    }

    public static String LIZIZ(float f) {
        if (f == 0.0f) {
            return "LineHeightStyle.Alignment.Top";
        }
        if (f == LIZIZ) {
            return "LineHeightStyle.Alignment.Center";
        }
        if (f == LIZJ) {
            return "LineHeightStyle.Alignment.Proportional";
        }
        if (f == LIZLLL) {
            return "LineHeightStyle.Alignment.Bottom";
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LineHeightStyle.Alignment(topPercentage = ");
        sbLIZ.append(f);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final boolean equals(Object obj) {
        float f = this.LIZ;
        if (!(obj instanceof C1695360uDe) || Float.compare(f, ((C1695360uDe) obj).LIZ) != 0) {
            return false;
        }
        return true;
    }
}
