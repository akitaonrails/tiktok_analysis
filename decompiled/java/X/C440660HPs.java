package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0HPs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C440660HPs implements InterfaceC440090HNn {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final int LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C440660HPs)) {
            return false;
        }
        C440660HPs c440660HPs = (C440660HPs) obj;
        return Intrinsics.LJFF(this.LIZ, c440660HPs.LIZ) && Intrinsics.LJFF(this.LIZIZ, c440660HPs.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c440660HPs.LIZJ) && this.LIZLLL == c440660HPs.LIZLLL;
    }

    public final int hashCode() {
        return (((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StickerElement(imageUri=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", imageUrl=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", id=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", stickerType=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C440660HPs(String str, String str2, String str3, int i) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = i;
    }
}
