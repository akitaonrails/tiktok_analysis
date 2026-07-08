package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Q2U, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0Q2U implements InterfaceC663970Q2p {
    public final String LIZ;
    public final String LIZIZ;

    public C0Q2U() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0Q2U)) {
            return false;
        }
        C0Q2U c0q2u = (C0Q2U) obj;
        return Intrinsics.LJFF(this.LIZ, c0q2u.LIZ) && Intrinsics.LJFF(this.LIZIZ, c0q2u.LIZIZ);
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SearchImplSignalState(preClickImprId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", preDefaultShowId=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C0Q2U(int i) {
        this("", "");
    }

    public C0Q2U(String str, String str2) {
        this.LIZ = str;
        this.LIZIZ = str2;
    }
}
