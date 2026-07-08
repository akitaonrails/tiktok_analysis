package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0wNR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1778310wNR {
    public final String LIZ;
    public final String LIZIZ;
    public final boolean LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1778310wNR)) {
            return false;
        }
        C1778310wNR c1778310wNR = (C1778310wNR) obj;
        return Intrinsics.LJFF(this.LIZ, c1778310wNR.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1778310wNR.LIZIZ) && this.LIZJ == c1778310wNR.LIZJ;
    }

    public final int hashCode() {
        return (((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + C786410Ut5.Z2(this.LIZJ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("InitParams(roomId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", showEntrance=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", isPreview=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1778310wNR(String str, String str2, boolean z) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = z;
    }
}
