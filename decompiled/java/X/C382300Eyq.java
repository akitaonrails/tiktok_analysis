package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Eyq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C382300Eyq {
    public final String LIZ;
    public final C381540Exc LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C382300Eyq)) {
            return false;
        }
        C382300Eyq c382300Eyq = (C382300Eyq) obj;
        return Intrinsics.LJFF(this.LIZ, c382300Eyq.LIZ) && Intrinsics.LJFF(this.LIZIZ, c382300Eyq.LIZIZ);
    }

    public final int hashCode() {
        int iHashCode = this.LIZ.hashCode() * 31;
        C381540Exc c381540Exc = this.LIZIZ;
        return iHashCode + (c381540Exc == null ? 0 : c381540Exc.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("GenAITaskSubmissionResult(taskId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", taskInfo=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C382300Eyq(String str, C381540Exc c381540Exc) {
        this.LIZ = str;
        this.LIZIZ = c381540Exc;
    }
}
