package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0DZZ, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0DZZ {
    public final String LIZ;
    public final boolean LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0DZZ)) {
            return false;
        }
        C0DZZ c0dzz = (C0DZZ) obj;
        return Intrinsics.LJFF(this.LIZ, c0dzz.LIZ) && this.LIZIZ == c0dzz.LIZIZ;
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + C786410Ut5.Z2(this.LIZIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ResolvedThoughtPrompt(text=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", hasMobPrompt=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0DZZ(String str, boolean z) {
        this.LIZ = str;
        this.LIZIZ = z;
    }
}
