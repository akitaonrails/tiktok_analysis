package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0RHH, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0RHH implements InterfaceC693060RGm {
    public final String LIZ;
    public final long LIZIZ;
    public final long LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0RHH)) {
            return false;
        }
        C0RHH c0rhh = (C0RHH) obj;
        return Intrinsics.LJFF(this.LIZ, c0rhh.LIZ) && this.LIZIZ == c0rhh.LIZIZ && this.LIZJ == c0rhh.LIZJ;
    }

    public final int hashCode() {
        String str = this.LIZ;
        return ((((str == null ? 0 : str.hashCode()) * 31) + C786410Ut5.Y2(this.LIZIZ)) * 31) + C786410Ut5.Y2(this.LIZJ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StoryPlayProgressParam(sourceId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", position=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", duration=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0RHH(String str, long j, long j2) {
        this.LIZ = str;
        this.LIZIZ = j;
        this.LIZJ = j2;
    }
}
