package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0yiu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1868500yiu extends AbstractC1868510yiv {
    public final int LIZ;
    public final String LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1868500yiu)) {
            return false;
        }
        C1868500yiu c1868500yiu = (C1868500yiu) obj;
        return this.LIZ == c1868500yiu.LIZ && Intrinsics.LJFF(this.LIZIZ, c1868500yiu.LIZIZ);
    }

    public final int hashCode() {
        return (this.LIZ * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Failure(monitorErrorCode=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", message=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1868500yiu(int i, String str) {
        this.LIZ = i;
        this.LIZIZ = str;
    }
}
