package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.05vz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1512105vz {
    public final String LIZ;
    public final String LIZIZ;

    public C1512105vz() {
        this(null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1512105vz)) {
            return false;
        }
        C1512105vz c1512105vz = (C1512105vz) obj;
        return Intrinsics.LJFF(this.LIZ, c1512105vz.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1512105vz.LIZIZ);
    }

    public final int hashCode() {
        String str = this.LIZ;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.LIZIZ;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BotInstructionUpdate(avoidInstructions=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", checkFirstInstructions=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1512105vz(String str, String str2) {
        this.LIZ = str;
        this.LIZIZ = str2;
    }
}
