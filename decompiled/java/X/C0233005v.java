package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.005v, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0233005v {
    public final String LIZ;
    public final long LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0233005v)) {
            return false;
        }
        C0233005v c0233005v = (C0233005v) obj;
        return Intrinsics.LJFF(this.LIZ, c0233005v.LIZ) && this.LIZIZ == c0233005v.LIZIZ;
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + C786410Ut5.Y2(this.LIZIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AIConsumedEvent(templateId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", aiDuration=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0233005v(String str, long j) {
        this.LIZ = str;
        this.LIZIZ = j;
    }
}
