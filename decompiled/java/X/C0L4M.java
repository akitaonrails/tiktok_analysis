package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0L4M, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0L4M {
    public final String LIZ;
    public final String LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0L4M)) {
            return false;
        }
        C0L4M c0l4m = (C0L4M) obj;
        return Intrinsics.LJFF(this.LIZ, c0l4m.LIZ) && Intrinsics.LJFF(this.LIZIZ, c0l4m.LIZIZ);
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MockDraftResult(creationId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", templateUrl=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0L4M(String str, String str2) {
        this.LIZ = str;
        this.LIZIZ = str2;
    }
}
