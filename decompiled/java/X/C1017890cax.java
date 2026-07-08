package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0cax, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1017890cax extends AbstractC1017850cat {
    public final int LIZ;
    public final String LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1017890cax)) {
            return false;
        }
        C1017890cax c1017890cax = (C1017890cax) obj;
        return this.LIZ == c1017890cax.LIZ && Intrinsics.LJFF(this.LIZIZ, c1017890cax.LIZIZ);
    }

    public final int hashCode() {
        return (this.LIZ * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Error(code=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", packageName=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1017890cax(int i, String str) {
        this.LIZ = i;
        this.LIZIZ = str;
    }
}
