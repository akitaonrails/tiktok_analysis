package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.15A1, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C15A1 {
    public final C15AO LIZ;
    public final C20476115Ah LIZIZ;
    public final boolean LIZJ;
    public final boolean LIZLLL;

    public final int hashCode() {
        return (((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + C786410Ut5.Z2(this.LIZJ)) * 31) + C786410Ut5.Z2(this.LIZLLL);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LottieConfig(commonLottieInfo=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", location=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", interactByAnimation=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", forceRestartAnimation=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C15A1)) {
            return false;
        }
        C15A1 c15a1 = (C15A1) obj;
        if (!Intrinsics.LJFF(this.LIZ, c15a1.LIZ) || !Intrinsics.LJFF(this.LIZIZ, c15a1.LIZIZ)) {
            return false;
        }
        return true;
    }

    public C15A1(C15AO c15ao, C20476115Ah c20476115Ah, boolean z, boolean z2, int i) {
        z = (i & 4) != 0 ? true : z;
        z2 = (i & 8) != 0 ? false : z2;
        this.LIZ = c15ao;
        this.LIZIZ = c20476115Ah;
        this.LIZJ = z;
        this.LIZLLL = z2;
    }
}
