package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ZRt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C899830ZRt {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final boolean LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C899830ZRt)) {
            return false;
        }
        C899830ZRt c899830ZRt = (C899830ZRt) obj;
        return Intrinsics.LJFF(this.LIZ, c899830ZRt.LIZ) && Intrinsics.LJFF(this.LIZIZ, c899830ZRt.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c899830ZRt.LIZJ) && this.LIZLLL == c899830ZRt.LIZLLL;
    }

    public final int hashCode() {
        int iHashCode = this.LIZ.hashCode() * 31;
        String str = this.LIZIZ;
        return ((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.LIZJ.hashCode()) * 31) + C786410Ut5.Z2(this.LIZLLL);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AudioFile(localPath=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", remoteUrl=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", downloadFileName=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", refreshEnabled=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C899830ZRt(String str, String str2, String str3, boolean z) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = z;
    }
}
