package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.05Yp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1372105Yp implements InterfaceC439080HJq {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1372105Yp)) {
            return false;
        }
        C1372105Yp c1372105Yp = (C1372105Yp) obj;
        return Intrinsics.LJFF(this.LIZ, c1372105Yp.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1372105Yp.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1372105Yp.LIZJ);
    }

    public final int hashCode() {
        return (((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Created(expressionUrl=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", taskId=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", generationUri=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1372105Yp(String str, String str2, String str3) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
    }
}
