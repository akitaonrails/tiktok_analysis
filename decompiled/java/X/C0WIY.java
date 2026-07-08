package X;

import java.util.Objects;

/* JADX INFO: renamed from: X.0WIY, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0WIY<F, S> {
    public final F LIZ;
    public final S LIZIZ;

    public final int hashCode() {
        F f = this.LIZ;
        int iHashCode = f == null ? 0 : f.hashCode();
        S s = this.LIZIZ;
        return iHashCode ^ (s != null ? s.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Pair{");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(" ");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append("}");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0WIY)) {
            return false;
        }
        C0WIY c0wiy = (C0WIY) obj;
        if (!Objects.equals(c0wiy.LIZ, this.LIZ) || !Objects.equals(c0wiy.LIZIZ, this.LIZIZ)) {
            return false;
        }
        return true;
    }

    public C0WIY(F f, S s) {
        this.LIZ = f;
        this.LIZIZ = s;
    }
}
