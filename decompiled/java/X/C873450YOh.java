package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0YOh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C873450YOh {
    public final String LIZ;
    public final List<AbstractC873650YPb> LIZIZ;
    public final C0Y3I LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C873450YOh)) {
            return false;
        }
        C873450YOh c873450YOh = (C873450YOh) obj;
        return Intrinsics.LJFF(this.LIZ, c873450YOh.LIZ) && Intrinsics.LJFF(this.LIZIZ, c873450YOh.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c873450YOh.LIZJ);
    }

    public final int hashCode() {
        int iHashCode = this.LIZ.hashCode() * 31;
        List<AbstractC873650YPb> list = this.LIZIZ;
        return ((iHashCode + (list == null ? 0 : list.hashCode())) * 31) + this.LIZJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MediaRetryParams(msgUuid=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", extraStepsBeforeSending=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", tracer=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C873450YOh(String str, List<? extends AbstractC873650YPb> list, C0Y3I c0y3i) {
        this.LIZ = str;
        this.LIZIZ = list;
        this.LIZJ = c0y3i;
    }
}
