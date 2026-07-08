package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0hG6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1197160hG6 {
    public final String LIZ;
    public final String LIZIZ = "video";
    public final String LIZJ = "videos";
    public final String LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1197160hG6)) {
            return false;
        }
        C1197160hG6 c1197160hG6 = (C1197160hG6) obj;
        return Intrinsics.LJFF(this.LIZ, c1197160hG6.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1197160hG6.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1197160hG6.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c1197160hG6.LIZLLL);
    }

    public final int hashCode() {
        return (((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FavoriteVideoTabMetadata(pageTitle=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", mobKey=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", tabCountKey=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", standalonePageTitle=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1197160hG6(String str, String str2) {
        this.LIZ = str;
        this.LIZLLL = str2;
    }
}
