package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Ze2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C904480Ze2 {
    public final String LIZ;
    public final EnumC904450Zdz LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C904480Ze2)) {
            return false;
        }
        C904480Ze2 c904480Ze2 = (C904480Ze2) obj;
        return Intrinsics.LJFF(this.LIZ, c904480Ze2.LIZ) && this.LIZIZ == c904480Ze2.LIZIZ;
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PerfKey(conversationId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", mediaType=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C904480Ze2(String str, EnumC904450Zdz enumC904450Zdz) {
        this.LIZ = str;
        this.LIZIZ = enumC904450Zdz;
    }
}
