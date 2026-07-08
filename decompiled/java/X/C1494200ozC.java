package X;

import java.util.Objects;

/* JADX INFO: renamed from: X.0ozC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public class C1494200ozC {
    public final int LIZ;
    public final int LIZIZ = 0;
    public final C1494270ozJ LIZJ;
    public final C08H5 LIZLLL;
    public C1490370ot1 LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1494200ozC.class != obj.getClass()) {
            return false;
        }
        C1494200ozC c1494200ozC = (C1494200ozC) obj;
        if (this.LIZ == c1494200ozC.LIZ && this.LIZIZ == c1494200ozC.LIZIZ && Objects.equals(this.LIZJ, c1494200ozC.LIZJ) && Objects.equals(this.LIZLLL, c1494200ozC.LIZLLL)) {
            return true;
        }
        return false;
    }

    public C1494200ozC(int i, C1494270ozJ c1494270ozJ, C08H5 c08h5) {
        this.LIZ = i;
        this.LIZJ = c1494270ozJ;
        this.LIZLLL = c08h5;
    }
}
