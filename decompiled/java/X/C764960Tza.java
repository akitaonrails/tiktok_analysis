package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Tza, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C764960Tza extends AbstractC764660Tz6 {
    public final int LIZ;
    public final String LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C764960Tza)) {
            return false;
        }
        C764960Tza c764960Tza = (C764960Tza) obj;
        return this.LIZ == c764960Tza.LIZ && Intrinsics.LJFF(this.LIZIZ, c764960Tza.LIZIZ);
    }

    public final int hashCode() {
        return (this.LIZ * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ShowSearchListEmpty(categoryId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", keyword=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C764960Tza(int i, String str) {
        this.LIZ = i;
        this.LIZIZ = str;
    }
}
