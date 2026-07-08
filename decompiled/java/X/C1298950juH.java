package X;

import java.util.Arrays;

/* JADX INFO: renamed from: X.0juH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class C1298950juH {
    public final float LIZ;
    public final float LIZIZ;

    public final int hashCode() {
        return Arrays.hashCode(new float[]{this.LIZ, this.LIZIZ});
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Point{x=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", y=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1298950juH() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C1298950juH)) {
            return false;
        }
        C1298950juH c1298950juH = (C1298950juH) obj;
        if (Float.compare(c1298950juH.LIZ, this.LIZ) == 0 && Float.compare(c1298950juH.LIZIZ, this.LIZIZ) == 0) {
            return true;
        }
        return false;
    }

    public C1298950juH(float f, float f2) {
        this.LIZ = f;
        this.LIZIZ = f2;
    }
}
