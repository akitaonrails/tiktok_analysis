package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0DD2, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0DD2 extends C0DD4 {
    public final String LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0DD2) && Intrinsics.LJFF(this.LIZ, ((C0DD2) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("NotReady(message=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0DD2(String str) {
        this.LIZ = str;
    }
}
