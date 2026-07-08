package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0LlI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C552260LlI {
    public final String LIZ;
    public final String LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C552260LlI)) {
            return false;
        }
        C552260LlI c552260LlI = (C552260LlI) obj;
        return Intrinsics.LJFF(this.LIZ, c552260LlI.LIZ) && Intrinsics.LJFF(this.LIZIZ, c552260LlI.LIZIZ);
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AIGCWorkflowQuotaInput(jobType=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", businessScene=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C552260LlI(String str, String str2) {
        this.LIZ = str;
        this.LIZIZ = str2;
    }
}
