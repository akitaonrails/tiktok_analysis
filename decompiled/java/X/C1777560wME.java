package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0wME, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1777560wME {
    public final EnumC1779020wOa LIZ;
    public final boolean LIZIZ;
    public final String LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1777560wME)) {
            return false;
        }
        C1777560wME c1777560wME = (C1777560wME) obj;
        return this.LIZ == c1777560wME.LIZ && this.LIZIZ == c1777560wME.LIZIZ && Intrinsics.LJFF(this.LIZJ, c1777560wME.LIZJ);
    }

    public final int hashCode() {
        int iHashCode = ((this.LIZ.hashCode() * 31) + C786410Ut5.Z2(this.LIZIZ)) * 31;
        String str = this.LIZJ;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PlaybookStepDecorationItem(decorationState=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", isHighLightRunning=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", conditionText=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1777560wME(EnumC1779020wOa enumC1779020wOa, boolean z, String str) {
        this.LIZ = enumC1779020wOa;
        this.LIZIZ = z;
        this.LIZJ = str;
    }
}
