package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0LqH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C555350LqH {
    public final CharSequence LIZ;
    public final CharSequence LIZIZ;
    public final CharSequence LIZJ;
    public final CharSequence LIZLLL;

    public C555350LqH() {
        this(null, null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C555350LqH)) {
            return false;
        }
        C555350LqH c555350LqH = (C555350LqH) obj;
        return Intrinsics.LJFF(this.LIZ, c555350LqH.LIZ) && Intrinsics.LJFF(this.LIZIZ, c555350LqH.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c555350LqH.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c555350LqH.LIZLLL);
    }

    public final int hashCode() {
        CharSequence charSequence = this.LIZ;
        int iHashCode = (charSequence == null ? 0 : charSequence.hashCode()) * 31;
        CharSequence charSequence2 = this.LIZIZ;
        int iHashCode2 = (iHashCode + (charSequence2 == null ? 0 : charSequence2.hashCode())) * 31;
        CharSequence charSequence3 = this.LIZJ;
        int iHashCode3 = (iHashCode2 + (charSequence3 == null ? 0 : charSequence3.hashCode())) * 31;
        CharSequence charSequence4 = this.LIZLLL;
        return iHashCode3 + (charSequence4 != null ? charSequence4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TitleBarRetentionDialogTextConfig(title=");
        sbLIZ.append((Object) this.LIZ);
        sbLIZ.append(", message=");
        sbLIZ.append((Object) this.LIZIZ);
        sbLIZ.append(", primaryButtonText=");
        sbLIZ.append((Object) this.LIZJ);
        sbLIZ.append(", secondaryButtonText=");
        sbLIZ.append((Object) this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C555350LqH(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4) {
        this.LIZ = charSequence;
        this.LIZIZ = charSequence2;
        this.LIZJ = charSequence3;
        this.LIZLLL = charSequence4;
    }
}
