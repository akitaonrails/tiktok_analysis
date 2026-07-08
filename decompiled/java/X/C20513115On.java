package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.15On, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20513115On {
    public final String LIZ;
    public final String LIZIZ;
    public final C20513015Om LIZJ;
    public final C20513015Om LIZLLL;
    public final boolean LJ;
    public final C20513515Or LJFF;
    public final boolean LJI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C20513115On)) {
            return false;
        }
        C20513115On c20513115On = (C20513115On) obj;
        return Intrinsics.LJFF(this.LIZ, c20513115On.LIZ) && Intrinsics.LJFF(this.LIZIZ, c20513115On.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c20513115On.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c20513115On.LIZLLL) && this.LJ == c20513115On.LJ && Intrinsics.LJFF(this.LJFF, c20513115On.LJFF) && this.LJI == c20513115On.LJI;
    }

    public final int hashCode() {
        return (((((((((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode()) * 31) + C786410Ut5.Z2(this.LJ)) * 31) + this.LJFF.hashCode()) * 31) + C786410Ut5.Z2(this.LJI);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DialogState(title=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", subtitle=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", weeklyCard=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", monthlyCard=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", showBubbleInfo=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", layoutSize=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", isEnigma=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C20513115On(String str, String str2, C20513015Om c20513015Om, C20513015Om c20513015Om2, boolean z, C20513515Or c20513515Or, boolean z2) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = c20513015Om;
        this.LIZLLL = c20513015Om2;
        this.LJ = z;
        this.LJFF = c20513515Or;
        this.LJI = z2;
    }
}
