package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0HWs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C442480HWs implements InterfaceC0148002o {
    public final C291001Au<C446370Het> LL;
    public final C291001Au<C1342780l2y> LLILLJJLI;

    public C442480HWs() {
        this(null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C442480HWs)) {
            return false;
        }
        C442480HWs c442480HWs = (C442480HWs) obj;
        return Intrinsics.LJFF(this.LL, c442480HWs.LL) && Intrinsics.LJFF(this.LLILLJJLI, c442480HWs.LLILLJJLI);
    }

    public final int hashCode() {
        C291001Au<C446370Het> c291001Au = this.LL;
        int iHashCode = (c291001Au == null ? 0 : c291001Au.hashCode()) * 31;
        C291001Au<C1342780l2y> c291001Au2 = this.LLILLJJLI;
        return iHashCode + (c291001Au2 != null ? c291001Au2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CommentSyncState(commentCountSyncState=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", syncCommentPublishState=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C442480HWs(C291001Au<C446370Het> c291001Au, C291001Au<C1342780l2y> c291001Au2) {
        this.LL = c291001Au;
        this.LLILLJJLI = c291001Au2;
    }

    public static C442480HWs LIZ(C442480HWs c442480HWs, C291001Au c291001Au, C291001Au c291001Au2, int i) {
        if ((i & 1) != 0) {
            c291001Au = c442480HWs.LL;
        }
        if ((i & 2) != 0) {
            c291001Au2 = c442480HWs.LLILLJJLI;
        }
        c442480HWs.getClass();
        return new C442480HWs(c291001Au, c291001Au2);
    }
}
