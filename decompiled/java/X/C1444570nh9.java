package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0nh9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1444570nh9 {
    public final String LIZ;
    public final String LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1444570nh9)) {
            return false;
        }
        C1444570nh9 c1444570nh9 = (C1444570nh9) obj;
        return Intrinsics.LJFF(this.LIZ, c1444570nh9.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1444570nh9.LIZIZ);
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EffectHandlerLabels(potential=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", active=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1444570nh9(String str, String str2) {
        this.LIZ = str;
        this.LIZIZ = str2;
    }
}
