package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0YRX, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0YRX implements C0YQF {
    public final String LIZ;
    public final String LIZIZ;
    public final int LIZJ;
    public C0YQG LIZLLL;
    public final int LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0YRX)) {
            return false;
        }
        C0YRX c0yrx = (C0YRX) obj;
        return Intrinsics.LJFF(this.LIZ, c0yrx.LIZ) && Intrinsics.LJFF(this.LIZIZ, c0yrx.LIZIZ) && this.LIZJ == c0yrx.LIZJ && Intrinsics.LJFF(this.LIZLLL, c0yrx.LIZLLL) && this.LJ == c0yrx.LJ;
    }

    public final int hashCode() {
        return (((((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ) * 31) + this.LIZLLL.hashCode()) * 31) + this.LJ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("IMPhotoUploadParams(creationId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", filePath=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", encryptType=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", authConfig=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", uploadScene=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0YRX(String str, String str2, int i, C0YQG c0yqg, int i2) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = i;
        this.LIZLLL = c0yqg;
        this.LJ = i2;
    }
}
