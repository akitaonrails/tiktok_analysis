package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0amL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C948070amL extends AbstractC948140amS {
    public final C948400ams LIZ;
    public final int LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C948070amL)) {
            return false;
        }
        C948070amL c948070amL = (C948070amL) obj;
        return Intrinsics.LJFF(this.LIZ, c948070amL.LIZ) && this.LIZIZ == c948070amL.LIZIZ;
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SwitchLayout(layoutInfo=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", index=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C948070amL(int i, C948400ams c948400ams) {
        this.LIZ = c948400ams;
        this.LIZIZ = i;
    }
}
