package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.07fc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1920207fc {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final String LJ;

    public C1920207fc() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1920207fc)) {
            return false;
        }
        C1920207fc c1920207fc = (C1920207fc) obj;
        return Intrinsics.LJFF(this.LIZ, c1920207fc.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1920207fc.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1920207fc.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c1920207fc.LIZLLL) && Intrinsics.LJFF(this.LJ, c1920207fc.LJ);
    }

    public final int hashCode() {
        return (((((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode()) * 31) + this.LJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PollingTaskStatusMessage(inputModerationStatus=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", inputViolationReasons=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", outputViolationReasons=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", outputModerationStatus=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", outputModeration=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C1920207fc(int i) {
        this("", "", "", "", "");
    }

    public C1920207fc(String str, String str2, String str3, String str4, String str5) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = str4;
        this.LJ = str5;
    }
}
