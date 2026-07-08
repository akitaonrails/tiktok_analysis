package X;

import java.util.Arrays;

/* JADX INFO: renamed from: X.0juC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class C1298900juC {
    public float LIZ;
    public float LIZIZ;

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

    public C1298900juC() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1298900juC)) {
            return false;
        }
        C1298900juC c1298900juC = (C1298900juC) obj;
        if (Float.compare(c1298900juC.LIZ, this.LIZ) == 0 && Float.compare(c1298900juC.LIZIZ, this.LIZIZ) == 0) {
            return true;
        }
        return false;
    }

    public C1298900juC(float f, float f2) {
        this.LIZ = f;
        this.LIZIZ = f2;
    }
}
