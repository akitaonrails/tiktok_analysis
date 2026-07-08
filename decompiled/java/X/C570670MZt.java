package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0MZt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C570670MZt {
    public final String LIZ;
    public boolean LIZIZ;
    public boolean LIZJ;
    public String LIZLLL;

    public C570670MZt() {
        this(null, 15);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C570670MZt)) {
            return false;
        }
        C570670MZt c570670MZt = (C570670MZt) obj;
        return Intrinsics.LJFF(this.LIZ, c570670MZt.LIZ) && this.LIZIZ == c570670MZt.LIZIZ && this.LIZJ == c570670MZt.LIZJ && Intrinsics.LJFF(this.LIZLLL, c570670MZt.LIZLLL);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ProcessResult(musicId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", isLegal=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", isLocalFileExist=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", illegalMsg=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C570670MZt(String str, int i) {
        boolean z;
        str = (i & 1) != 0 ? "" : str;
        if ((i & 2) != 0) {
            z = true;
        } else {
            z = false;
        }
        boolean z2 = (i & 4) != 0;
        String str2 = (i & 8) == 0 ? null : "";
        this.LIZ = str;
        this.LIZIZ = z;
        this.LIZJ = z2;
        this.LIZLLL = str2;
    }
}
