package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gEU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1157720gEU {
    public final String LIZ;
    public final String LIZIZ;
    public final int LIZJ;
    public final int LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1157720gEU)) {
            return false;
        }
        C1157720gEU c1157720gEU = (C1157720gEU) obj;
        return Intrinsics.LJFF(this.LIZ, c1157720gEU.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1157720gEU.LIZIZ) && this.LIZJ == c1157720gEU.LIZJ && this.LIZLLL == c1157720gEU.LIZLLL;
    }

    public final int hashCode() {
        return (((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ) * 31) + this.LIZLLL;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AlbumPreuploadPhotoResult(uri=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", secretKey=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", width=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", height=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1157720gEU(String str, String str2, int i, int i2) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = i;
        this.LIZLLL = i2;
    }
}
