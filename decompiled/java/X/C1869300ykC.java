package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ykC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1869300ykC {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1869300ykC)) {
            return false;
        }
        C1869300ykC c1869300ykC = (C1869300ykC) obj;
        return Intrinsics.LJFF(this.LIZ, c1869300ykC.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1869300ykC.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1869300ykC.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c1869300ykC.LIZLLL);
    }

    public final int hashCode() {
        return (((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CampaignTask(taskId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", taskName=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", pspStrategyKey=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", campaignId=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1869300ykC(String str, String str2, String str3, String str4) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = str4;
    }
}
