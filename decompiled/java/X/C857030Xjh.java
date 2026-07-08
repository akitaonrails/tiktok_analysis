package X;

import java.util.Arrays;
import java.util.Objects;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.0Xjh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C857030Xjh {
    public int LIZ;
    public int LIZIZ;
    public String LIZJ;

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.LIZ), Integer.valueOf(this.LIZIZ), this.LIZJ});
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(e3.h);
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(": ");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", ");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(")");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C857030Xjh() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C857030Xjh.class != obj.getClass()) {
            return false;
        }
        C857030Xjh c857030Xjh = (C857030Xjh) obj;
        if (this.LIZ == c857030Xjh.LIZ && this.LIZIZ == c857030Xjh.LIZIZ && Objects.equals(this.LIZJ, c857030Xjh.LIZJ)) {
            return true;
        }
        return false;
    }

    public C857030Xjh(String str, int i, int i2) {
        this.LIZJ = str;
        this.LIZ = i;
        this.LIZIZ = i2;
    }
}
