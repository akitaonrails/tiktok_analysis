package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0wTe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1782160wTe implements InterfaceC1782170wTf {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1782160wTe)) {
            return false;
        }
        C1782160wTe c1782160wTe = (C1782160wTe) obj;
        return Intrinsics.LJFF(this.LIZ, c1782160wTe.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1782160wTe.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1782160wTe.LIZJ);
    }

    public final int hashCode() {
        return (((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SuggestionItem(message=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", schema=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", questionId=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1782160wTe(String str, String str2, String str3) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
    }
}
