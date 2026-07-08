package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.04wM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1259604wM implements InterfaceC1264504x9 {
    public final int LIZ;
    public final String LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1259604wM)) {
            return false;
        }
        C1259604wM c1259604wM = (C1259604wM) obj;
        return this.LIZ == c1259604wM.LIZ && Intrinsics.LJFF(this.LIZIZ, c1259604wM.LIZIZ);
    }

    public final int hashCode() {
        return (this.LIZ * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Failed(errorCode=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", errorMessage=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1259604wM(int i, String str) {
        this.LIZ = i;
        this.LIZIZ = str;
    }
}
