package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Q44, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0Q44 implements InterfaceC663910Q2j {
    public final String LIZ;
    public final String LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0Q44)) {
            return false;
        }
        C0Q44 c0q44 = (C0Q44) obj;
        return Intrinsics.LJFF(this.LIZ, c0q44.LIZ) && Intrinsics.LJFF(this.LIZIZ, c0q44.LIZIZ);
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SearchEnterAction(enterMethod=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", searchKeyWord=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0Q44(String str, String str2) {
        this.LIZ = str;
        this.LIZIZ = str2;
    }
}
