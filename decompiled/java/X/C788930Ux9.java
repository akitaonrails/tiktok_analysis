package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Ux9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C788930Ux9 {
    public final C869590Y9l LIZ;
    public final boolean LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C788930Ux9)) {
            return false;
        }
        C788930Ux9 c788930Ux9 = (C788930Ux9) obj;
        return Intrinsics.LJFF(this.LIZ, c788930Ux9.LIZ) && this.LIZIZ == c788930Ux9.LIZIZ;
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + C786410Ut5.Z2(this.LIZIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RunEdge(oldest=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", hasOlderGap=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C788930Ux9(C869590Y9l c869590Y9l, boolean z) {
        this.LIZ = c869590Y9l;
        this.LIZIZ = z;
    }
}
