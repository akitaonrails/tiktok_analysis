package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0NGD, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0NGD {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0NGD)) {
            return false;
        }
        C0NGD c0ngd = (C0NGD) obj;
        return Intrinsics.LJFF(this.LIZ, c0ngd.LIZ) && Intrinsics.LJFF(this.LIZIZ, c0ngd.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c0ngd.LIZJ);
    }

    public final int hashCode() {
        return (((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SortResultItem(aid=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", score=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", snapshot=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0NGD(String str, String str2, String str3) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
    }
}
