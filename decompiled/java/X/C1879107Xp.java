package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.07Xp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1879107Xp {
    public final String LIZ;
    public final String LIZIZ;
    public final long LIZJ;
    public final boolean LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1879107Xp)) {
            return false;
        }
        C1879107Xp c1879107Xp = (C1879107Xp) obj;
        return Intrinsics.LJFF(this.LIZ, c1879107Xp.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1879107Xp.LIZIZ) && this.LIZJ == c1879107Xp.LIZJ && this.LIZLLL == c1879107Xp.LIZLLL;
    }

    public final int hashCode() {
        return (((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + C786410Ut5.Y2(this.LIZJ)) * 31) + C786410Ut5.Z2(this.LIZLLL);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BtmChainInfo(curPageBtm=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", preBtm=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", enterTime=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", firstShow=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1879107Xp(long j, String str, String str2, boolean z) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = j;
        this.LIZLLL = z;
    }
}
