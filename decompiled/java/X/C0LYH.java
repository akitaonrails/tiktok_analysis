package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0LYH, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0LYH extends C0LYS {
    public final String LIZ;
    public final String LIZIZ;

    public C0LYH() {
        this(null, "");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0LYH)) {
            return false;
        }
        C0LYH c0lyh = (C0LYH) obj;
        return Intrinsics.LJFF(this.LIZ, c0lyh.LIZ) && Intrinsics.LJFF(this.LIZIZ, c0lyh.LIZIZ);
    }

    public final int hashCode() {
        String str = this.LIZ;
        return ((str == null ? 0 : str.hashCode()) * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("NavigateToEditPage(videoOutputUrl=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", serverTaskId=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0LYH(String str, String str2) {
        this.LIZ = str;
        this.LIZIZ = str2;
    }
}
