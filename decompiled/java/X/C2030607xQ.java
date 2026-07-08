package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.07xQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2030607xQ extends AbstractC2030507xP {
    public final String LIZ;
    public final long LIZIZ;
    public final String LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2030607xQ)) {
            return false;
        }
        C2030607xQ c2030607xQ = (C2030607xQ) obj;
        return Intrinsics.LJFF(this.LIZ, c2030607xQ.LIZ) && this.LIZIZ == c2030607xQ.LIZIZ && Intrinsics.LJFF(this.LIZJ, c2030607xQ.LIZJ);
    }

    public final int hashCode() {
        return (((this.LIZ.hashCode() * 31) + C786410Ut5.Y2(this.LIZIZ)) * 31) + this.LIZJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Success(url=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", conversationId=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", groupName=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C2030607xQ(String str, long j, String str2) {
        this.LIZ = str;
        this.LIZIZ = j;
        this.LIZJ = str2;
    }
}
