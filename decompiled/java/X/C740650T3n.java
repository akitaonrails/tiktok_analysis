package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0T3n, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C740650T3n {
    public final String LIZ;
    public final long LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C740650T3n)) {
            return false;
        }
        C740650T3n c740650T3n = (C740650T3n) obj;
        return Intrinsics.LJFF(this.LIZ, c740650T3n.LIZ) && this.LIZIZ == c740650T3n.LIZIZ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ArchiveConversionPreview(previewName=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", time=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C740650T3n(String str, long j) {
        this.LIZ = str;
        this.LIZIZ = j;
    }
}
