package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0DD1, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0DD1 extends C0DD4 {
    public final String LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0DD1) && Intrinsics.LJFF(this.LIZ, ((C0DD1) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Failure(message=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0DD1(String str) {
        this.LIZ = str;
    }
}
