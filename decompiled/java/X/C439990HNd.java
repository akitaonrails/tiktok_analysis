package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0HNd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C439990HNd implements InterfaceC440050HNj {
    public final String LIZ;
    public final C0H7H LIZIZ;
    public final int LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C439990HNd)) {
            return false;
        }
        C439990HNd c439990HNd = (C439990HNd) obj;
        return Intrinsics.LJFF(this.LIZ, c439990HNd.LIZ) && this.LIZIZ == c439990HNd.LIZIZ && this.LIZJ == c439990HNd.LIZJ;
    }

    public final int hashCode() {
        int iHashCode = this.LIZ.hashCode() * 31;
        C0H7H c0h7h = this.LIZIZ;
        return ((iHashCode + (c0h7h == null ? 0 : c0h7h.hashCode())) * 31) + this.LIZJ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TextElement(text=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", textType=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", idType=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C439990HNd(int i, C0H7H c0h7h, String str) {
        this.LIZ = str;
        this.LIZIZ = c0h7h;
        this.LIZJ = i;
    }
}
