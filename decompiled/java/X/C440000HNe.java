package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0HNe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C440000HNe implements InterfaceC440050HNj {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final int LIZLLL = 1;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C440000HNe)) {
            return false;
        }
        C440000HNe c440000HNe = (C440000HNe) obj;
        return Intrinsics.LJFF(this.LIZ, c440000HNe.LIZ) && Intrinsics.LJFF(this.LIZIZ, c440000HNe.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c440000HNe.LIZJ) && this.LIZLLL == c440000HNe.LIZLLL;
    }

    public final int hashCode() {
        return (((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MemeElement(imageUri=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", imageUrl=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", id=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", idType=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C440000HNe(String str, String str2, String str3) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
    }
}
