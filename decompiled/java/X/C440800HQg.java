package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0HQg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C440800HQg extends AbstractC440840HQk {
    public final String LIZ;
    public final Double LIZIZ;

    public C440800HQg() {
        this(null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C440800HQg)) {
            return false;
        }
        C440800HQg c440800HQg = (C440800HQg) obj;
        return Intrinsics.LJFF(this.LIZ, c440800HQg.LIZ) && Intrinsics.LJFF(this.LIZIZ, c440800HQg.LIZIZ);
    }

    public final int hashCode() {
        String str = this.LIZ;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Double d = this.LIZIZ;
        return iHashCode + (d != null ? d.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("GENERATING(animeSubtaskId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", estimatedCompleteTS=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C440800HQg(String str, Double d) {
        this.LIZ = str;
        this.LIZIZ = d;
    }
}
