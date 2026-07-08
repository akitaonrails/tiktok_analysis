package X;

import com.ss.android.ugc.aweme.aigc.asynctask.workflowbuilder.AIGCArchWorkflowETData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0LUC, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0LUC extends C0LU9 {
    public final C322480CkY LIZ;
    public final AIGCArchWorkflowETData LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0LUC)) {
            return false;
        }
        C0LUC c0luc = (C0LUC) obj;
        return Intrinsics.LJFF(this.LIZ, c0luc.LIZ) && Intrinsics.LJFF(this.LIZIZ, c0luc.LIZIZ);
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AIGCArchWorkflowFinished(result=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", etData=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0LUC(C322480CkY c322480CkY, AIGCArchWorkflowETData aIGCArchWorkflowETData) {
        this.LIZ = c322480CkY;
        this.LIZIZ = aIGCArchWorkflowETData;
    }
}
