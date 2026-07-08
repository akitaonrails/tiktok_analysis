package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ZZD, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0ZZD {
    public final C0I4Y<Integer> LIZ;
    public final C0I4Y<Long> LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0ZZD)) {
            return false;
        }
        C0ZZD c0zzd = (C0ZZD) obj;
        return Intrinsics.LJFF(this.LIZ, c0zzd.LIZ) && Intrinsics.LJFF(this.LIZIZ, c0zzd.LIZIZ);
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ShareCommentMetadataUIState(likeCount=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", replyCount=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0ZZD(C0I4Y<Integer> c0i4y, C0I4Y<Long> c0i4y2) {
        this.LIZ = c0i4y;
        this.LIZIZ = c0i4y2;
    }
}
