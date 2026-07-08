package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0FGJ, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0FGJ {
    public final String LIZ;
    public final String LIZIZ;
    public final int LIZJ = 3;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0FGJ)) {
            return false;
        }
        C0FGJ c0fgj = (C0FGJ) obj;
        return Intrinsics.LJFF(this.LIZ, c0fgj.LIZ) && Intrinsics.LJFF(this.LIZIZ, c0fgj.LIZIZ) && this.LIZJ == c0fgj.LIZJ;
    }

    public final int hashCode() {
        return (((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EPResDownloadConfig(url=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", fileName=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", retryCount=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0FGJ(String str, String str2) {
        this.LIZ = str;
        this.LIZIZ = str2;
    }
}
