package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0KvN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C533030KvN {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C533030KvN)) {
            return false;
        }
        C533030KvN c533030KvN = (C533030KvN) obj;
        return Intrinsics.LJFF(this.LIZ, c533030KvN.LIZ) && Intrinsics.LJFF(this.LIZIZ, c533030KvN.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c533030KvN.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c533030KvN.LIZLLL);
    }

    public final int hashCode() {
        return (((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AssetQueryParams(resourceId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", assetType=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", panelKey=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", assetId=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C533030KvN(String str, String str2, String str3, String str4) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = str4;
    }
}
