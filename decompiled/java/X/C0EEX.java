package X;

import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0EEX, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0EEX {
    public final int LIZ;
    public final Pair<Integer, Integer> LIZIZ;
    public final Pair<Integer, Integer> LIZJ;
    public final Pair<Integer, Integer> LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0EEX)) {
            return false;
        }
        C0EEX c0eex = (C0EEX) obj;
        return this.LIZ == c0eex.LIZ && Intrinsics.LJFF(this.LIZIZ, c0eex.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c0eex.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c0eex.LIZLLL);
    }

    public final int hashCode() {
        return (((((this.LIZ * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("HSLColorData(color=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", hColorPair=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", sColorPair=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", lColorPair=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0EEX(int i, Pair<Integer, Integer> pair, Pair<Integer, Integer> pair2, Pair<Integer, Integer> pair3) {
        this.LIZ = i;
        this.LIZIZ = pair;
        this.LIZJ = pair2;
        this.LIZLLL = pair3;
    }
}
