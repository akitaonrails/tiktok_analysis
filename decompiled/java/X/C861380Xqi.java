package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Xqi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C861380Xqi implements InterfaceC1461640o8g<C1661920tLi> {
    public final boolean LIZ;
    public final String LIZIZ;
    public final boolean LIZJ;
    public final boolean LIZLLL;
    public final boolean LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C861380Xqi)) {
            return false;
        }
        C861380Xqi c861380Xqi = (C861380Xqi) obj;
        return this.LIZ == c861380Xqi.LIZ && Intrinsics.LJFF(this.LIZIZ, c861380Xqi.LIZIZ) && this.LIZJ == c861380Xqi.LIZJ && this.LIZLLL == c861380Xqi.LIZLLL && this.LJ == c861380Xqi.LJ;
    }

    public final int hashCode() {
        int iZ2 = C786410Ut5.Z2(this.LIZ) * 31;
        String str = this.LIZIZ;
        return ((((((iZ2 + (str == null ? 0 : str.hashCode())) * 31) + C786410Ut5.Z2(this.LIZJ)) * 31) + C786410Ut5.Z2(this.LIZLLL)) * 31) + C786410Ut5.Z2(this.LJ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ToolbarItemAutoCutState(showGuide=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", guideText=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", isUsingTemplate=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", isAiLiveActive=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", isAILoading=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C861380Xqi(boolean z, String str, boolean z2, boolean z3, boolean z4) {
        this.LIZ = z;
        this.LIZIZ = str;
        this.LIZJ = z2;
        this.LIZLLL = z3;
        this.LJ = z4;
    }
}
