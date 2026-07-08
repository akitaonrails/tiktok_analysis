package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0VMJ, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0VMJ {
    public final String LIZ;
    public final String LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0VMJ)) {
            return false;
        }
        C0VMJ c0vmj = (C0VMJ) obj;
        return Intrinsics.LJFF(this.LIZ, c0vmj.LIZ) && Intrinsics.LJFF(this.LIZIZ, c0vmj.LIZIZ);
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PackageKeyMd5(packageName=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", md5=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0VMJ(String str, String str2) {
        this.LIZ = str;
        this.LIZIZ = str2;
    }
}
