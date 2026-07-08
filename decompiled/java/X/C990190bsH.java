package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0bsH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C990190bsH {
    public final C990170bsF LIZ;
    public final C990170bsF LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C990190bsH)) {
            return false;
        }
        C990190bsH c990190bsH = (C990190bsH) obj;
        return Intrinsics.LJFF(this.LIZ, c990190bsH.LIZ) && Intrinsics.LJFF(this.LIZIZ, c990190bsH.LIZIZ);
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RewardFallback(title=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", subtitle=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C990190bsH(C990170bsF c990170bsF, C990170bsF c990170bsF2) {
        this.LIZ = c990170bsF;
        this.LIZIZ = c990170bsF2;
    }
}
