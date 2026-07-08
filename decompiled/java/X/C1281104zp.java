package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.04zp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1281104zp {
    public final String LIZ;
    public final EnumC12947054v LIZIZ;
    public final String LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1281104zp)) {
            return false;
        }
        C1281104zp c1281104zp = (C1281104zp) obj;
        return Intrinsics.LJFF(this.LIZ, c1281104zp.LIZ) && this.LIZIZ == c1281104zp.LIZIZ && Intrinsics.LJFF(this.LIZJ, c1281104zp.LIZJ);
    }

    public final int hashCode() {
        return (((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BlockerKey(ownerId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", reason=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", tokenId=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1281104zp(String str, EnumC12947054v enumC12947054v, String str2) {
        this.LIZ = str;
        this.LIZIZ = enumC12947054v;
        this.LIZJ = str2;
    }
}
