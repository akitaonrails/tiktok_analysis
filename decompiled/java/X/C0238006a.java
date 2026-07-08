package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.006a, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0238006a {
    public final String LIZ;
    public final String LIZIZ;
    public final Integer LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0238006a)) {
            return false;
        }
        C0238006a c0238006a = (C0238006a) obj;
        return Intrinsics.LJFF(this.LIZ, c0238006a.LIZ) && Intrinsics.LJFF(this.LIZIZ, c0238006a.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c0238006a.LIZJ);
    }

    public final int hashCode() {
        int iHashCode = this.LIZ.hashCode() * 31;
        String str = this.LIZIZ;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.LIZJ;
        return iHashCode2 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TextPair(key=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", value=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", keyColor=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0238006a(String str, String str2, Integer num) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = num;
    }
}
