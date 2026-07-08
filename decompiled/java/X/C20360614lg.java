package X;

import java.util.List;

/* JADX INFO: renamed from: X.14lg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20360614lg {
    public final long LIZ;
    public final List<C20359414lU> LIZIZ;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PlaybookFlow(flowId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", stepList=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C20360614lg(long j, List<C20359414lU> list) {
        this.LIZ = j;
        this.LIZIZ = list;
    }
}
