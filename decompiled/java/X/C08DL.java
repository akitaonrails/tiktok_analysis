package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.08DL, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C08DL {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C08DL)) {
            return false;
        }
        C08DL c08dl = (C08DL) obj;
        return Intrinsics.LJFF(this.LIZ, c08dl.LIZ) && Intrinsics.LJFF(this.LIZIZ, c08dl.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c08dl.LIZJ);
    }

    public final int hashCode() {
        return (((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Parsed(accessKey=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", channel=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", bundle=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C08DL(String str, String str2, String str3) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
    }
}
