package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ZO1, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0ZO1 extends C0ZO4 {
    public final String LIZ;
    public final String LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0ZO1)) {
            return false;
        }
        C0ZO1 c0zo1 = (C0ZO1) obj;
        return Intrinsics.LJFF(this.LIZ, c0zo1.LIZ) && Intrinsics.LJFF(this.LIZIZ, c0zo1.LIZIZ);
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AlreadyOpen(fortune=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", imagePath=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0ZO1(String str, String str2) {
        this.LIZ = str;
        this.LIZIZ = str2;
    }
}
