package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0czp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1033310czp extends AbstractC1033330czr {
    public final int LIZ;
    public final String LIZIZ;

    @Override // X.AbstractC1033330czr
    public final int LIZ() {
        return 2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1033310czp)) {
            return false;
        }
        C1033310czp c1033310czp = (C1033310czp) obj;
        return this.LIZ == c1033310czp.LIZ && Intrinsics.LJFF(this.LIZIZ, c1033310czp.LIZIZ);
    }

    public final int hashCode() {
        return (this.LIZ * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Server(code=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", message=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.AbstractC1033330czr
    public final String LIZIZ() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LIZ);
        sbLIZ.append('-');
        sbLIZ.append(this.LIZIZ);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1033310czp(int i, String str) {
        this.LIZ = i;
        this.LIZIZ = str;
    }
}
