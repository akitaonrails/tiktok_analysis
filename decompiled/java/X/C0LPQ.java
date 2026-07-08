package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0LPQ, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0LPQ implements C0LPX {
    public final String LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0LPQ) && Intrinsics.LJFF(this.LIZ, ((C0LPQ) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ByWorkflowId(workflowId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0LPQ(String str) {
        this.LIZ = str;
    }
}
