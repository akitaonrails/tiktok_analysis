package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.04zq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1281204zq {
    public final String LIZ;
    public final String LIZIZ;
    public final EnumC12947054v LIZJ;
    public final String LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1281204zq)) {
            return false;
        }
        C1281204zq c1281204zq = (C1281204zq) obj;
        return Intrinsics.LJFF(this.LIZ, c1281204zq.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1281204zq.LIZIZ) && this.LIZJ == c1281204zq.LIZJ && Intrinsics.LJFF(this.LIZLLL, c1281204zq.LIZLLL);
    }

    public final int hashCode() {
        return (((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Token(sessionId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", ownerId=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", reason=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", tokenId=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1281204zq(String str, String str2, EnumC12947054v enumC12947054v, String str3) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = enumC12947054v;
        this.LIZLLL = str3;
    }
}
