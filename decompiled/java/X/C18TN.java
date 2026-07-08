package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.18TN, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C18TN implements C18TR {
    public final int LIZ;
    public final C909930Zmp LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18TN)) {
            return false;
        }
        C18TN c18tn = (C18TN) obj;
        return this.LIZ == c18tn.LIZ && Intrinsics.LJFF(this.LIZIZ, c18tn.LIZIZ);
    }

    public final int hashCode() {
        return (this.LIZ * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Generating(progress=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", generateInfo=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.C18TR
    public final C909930Zmp LIZ() {
        return C18TI.LIZ(this);
    }

    public C18TN(int i, C909930Zmp c909930Zmp) {
        this.LIZ = i;
        this.LIZIZ = c909930Zmp;
    }
}
