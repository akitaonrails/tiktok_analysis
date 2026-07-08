package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.04jW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1180004jW {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1180004jW)) {
            return false;
        }
        C1180004jW c1180004jW = (C1180004jW) obj;
        return Intrinsics.LJFF(this.LIZ, c1180004jW.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1180004jW.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1180004jW.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c1180004jW.LIZLLL);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("OfficialItem(coverId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", coverUrl=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", templateUrl=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", templateScenes=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1180004jW(String str, String str2, String str3, String str4) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = str4;
    }
}
