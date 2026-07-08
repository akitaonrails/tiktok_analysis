package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0wNE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1778180wNE extends AbstractC1778220wNI {
    public final String LIZIZ;
    public final String LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1778180wNE)) {
            return false;
        }
        C1778180wNE c1778180wNE = (C1778180wNE) obj;
        return Intrinsics.LJFF(this.LIZIZ, c1778180wNE.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1778180wNE.LIZJ);
    }

    public final int hashCode() {
        String str = this.LIZIZ;
        return ((str == null ? 0 : str.hashCode()) * 31) + this.LIZJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RecordVideo(propID=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", result=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1778180wNE(String str, String str2) {
        super(EnumC1778330wNT.RECORD_VIDEO);
        this.LIZIZ = str;
        this.LIZJ = str2;
    }
}
