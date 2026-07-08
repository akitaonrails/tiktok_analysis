package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0030, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class AnonymousClass0030 {
    public final String LIZ;
    public final String LIZIZ;

    public AnonymousClass0030() {
        this(null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnonymousClass0030)) {
            return false;
        }
        AnonymousClass0030 anonymousClass0030 = (AnonymousClass0030) obj;
        return Intrinsics.LJFF(this.LIZ, anonymousClass0030.LIZ) && Intrinsics.LJFF(this.LIZIZ, anonymousClass0030.LIZIZ);
    }

    public final int hashCode() {
        String str = this.LIZ;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.LIZIZ;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AICoverCoverTabEnterMobParams(functionType=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", enterMethod=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public AnonymousClass0030(String str, String str2) {
        this.LIZ = str;
        this.LIZIZ = str2;
    }
}
