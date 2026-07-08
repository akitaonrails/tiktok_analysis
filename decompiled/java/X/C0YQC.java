package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0YQC, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0YQC implements C0YQF {
    public C0YQD LIZ;

    public C0YQC() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0YQC) && Intrinsics.LJFF(this.LIZ, ((C0YQC) obj).LIZ);
    }

    public final int hashCode() {
        C0YQD c0yqd = this.LIZ;
        if (c0yqd == null) {
            return 0;
        }
        return c0yqd.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("IMAudioUploadParams(config=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0YQC(int i) {
        this.LIZ = null;
    }
}
