package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0f5L, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1113610f5L {
    public final String LIZ;
    public final int LIZIZ;
    public final String LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1113610f5L)) {
            return false;
        }
        C1113610f5L c1113610f5L = (C1113610f5L) obj;
        return Intrinsics.LJFF(this.LIZ, c1113610f5L.LIZ) && this.LIZIZ == c1113610f5L.LIZIZ && Intrinsics.LJFF(this.LIZJ, c1113610f5L.LIZJ);
    }

    public final int hashCode() {
        return (((this.LIZ.hashCode() * 31) + this.LIZIZ) * 31) + this.LIZJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("InlineTagSnapshot(tagText=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", tagType=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", tagId=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1113610f5L(String str, int i, String str2) {
        this.LIZ = str;
        this.LIZIZ = i;
        this.LIZJ = str2;
    }
}
