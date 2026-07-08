package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gE4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1157460gE4 {
    public final String LIZ;
    public final boolean LIZIZ;
    public final EnumC593570NPv LIZJ;
    public final long LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1157460gE4)) {
            return false;
        }
        C1157460gE4 c1157460gE4 = (C1157460gE4) obj;
        return Intrinsics.LJFF(this.LIZ, c1157460gE4.LIZ) && this.LIZIZ == c1157460gE4.LIZIZ && this.LIZJ == c1157460gE4.LIZJ && this.LIZLLL == c1157460gE4.LIZLLL;
    }

    public final int hashCode() {
        return (((((this.LIZ.hashCode() * 31) + C786410Ut5.Z2(this.LIZIZ)) * 31) + this.LIZJ.hashCode()) * 31) + C786410Ut5.Y2(this.LIZLLL);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CleanedTabRecord(tabName=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", isTopTab=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", triggerSource=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", cleanTimestamp=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1157460gE4(String str, boolean z, EnumC593570NPv enumC593570NPv, long j) {
        this.LIZ = str;
        this.LIZIZ = z;
        this.LIZJ = enumC593570NPv;
        this.LIZLLL = j;
    }
}
