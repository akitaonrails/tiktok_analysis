package X;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS111S1000000_27;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0qbB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1556190qbB {
    public final String LIZ;
    public final Function0<Boolean> LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1556190qbB)) {
            return false;
        }
        C1556190qbB c1556190qbB = (C1556190qbB) obj;
        return Intrinsics.LJFF(this.LIZ, c1556190qbB.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1556190qbB.LIZIZ);
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ActiveMessage(uuid=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", isReceiving=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1556190qbB(String str, AwS111S1000000_27 awS111S1000000_27) {
        this.LIZ = str;
        this.LIZIZ = awS111S1000000_27;
    }
}
