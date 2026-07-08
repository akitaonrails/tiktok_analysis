package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0UwQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C788480UwQ {
    public final int LIZ;
    public final String LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C788480UwQ)) {
            return false;
        }
        C788480UwQ c788480UwQ = (C788480UwQ) obj;
        return this.LIZ == c788480UwQ.LIZ && Intrinsics.LJFF(this.LIZIZ, c788480UwQ.LIZIZ);
    }

    public final int hashCode() {
        return (this.LIZ * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TabSelectionResult(tabType=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", ruleName=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C788480UwQ(int i, String str) {
        this.LIZ = i;
        this.LIZIZ = str;
    }
}
