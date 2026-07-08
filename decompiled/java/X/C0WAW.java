package X;

import java.util.Objects;

/* JADX INFO: renamed from: X.0WAW, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0WAW {
    public final String LIZ;
    public final int LIZIZ;
    public final C0WAR LIZJ;

    public final int hashCode() {
        return Objects.hash(this.LIZ, Integer.valueOf(this.LIZIZ), this.LIZJ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BlockingWaitStackSample[category=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", timesObserved=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", stackTrace.length=");
        sbLIZ.append(this.LIZ.length());
        sbLIZ.append(']');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0WAW.class != obj.getClass()) {
            return false;
        }
        C0WAW c0waw = (C0WAW) obj;
        if (this.LIZIZ == c0waw.LIZIZ && this.LIZ.equals(c0waw.LIZ) && this.LIZJ == c0waw.LIZJ) {
            return true;
        }
        return false;
    }

    public C0WAW(String str, int i, C0WAR c0war) {
        Objects.requireNonNull(str, "stackTrace");
        this.LIZ = str;
        if (i >= 1) {
            this.LIZIZ = i;
            Objects.requireNonNull(c0war, "category");
            this.LIZJ = c0war;
            return;
        }
        throw new IllegalArgumentException("timesObserved must be >= 1");
    }
}
