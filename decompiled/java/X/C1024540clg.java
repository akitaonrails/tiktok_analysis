package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0clg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1024540clg {
    public final String LIZ;
    public final String LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1024540clg)) {
            return false;
        }
        C1024540clg c1024540clg = (C1024540clg) obj;
        return Intrinsics.LJFF(this.LIZ, c1024540clg.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1024540clg.LIZIZ);
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MinisDramaVideoBinding(schema=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", videoUrl=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1024540clg(String str, String str2) {
        this.LIZ = str;
        this.LIZIZ = str2;
    }
}
