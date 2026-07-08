package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0H6v, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C435750H6v implements InterfaceC440090HNn {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final int LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C435750H6v)) {
            return false;
        }
        C435750H6v c435750H6v = (C435750H6v) obj;
        return Intrinsics.LJFF(this.LIZ, c435750H6v.LIZ) && Intrinsics.LJFF(this.LIZIZ, c435750H6v.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c435750H6v.LIZJ) && this.LIZLLL == c435750H6v.LIZLLL;
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

    public C435750H6v(String str, String str2, String str3, int i) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = i;
    }
}
