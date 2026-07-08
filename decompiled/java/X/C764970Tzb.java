package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Tzb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C764970Tzb extends AbstractC764660Tz6 {
    public final int LIZ;
    public final String LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C764970Tzb)) {
            return false;
        }
        C764970Tzb c764970Tzb = (C764970Tzb) obj;
        return this.LIZ == c764970Tzb.LIZ && Intrinsics.LJFF(this.LIZIZ, c764970Tzb.LIZIZ);
    }

    public final int hashCode() {
        return (this.LIZ * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ShowSearchListError(categoryId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", keyword=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C764970Tzb(int i, String str) {
        this.LIZ = i;
        this.LIZIZ = str;
    }
}
