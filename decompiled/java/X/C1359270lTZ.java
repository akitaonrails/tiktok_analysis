package X;

/* JADX INFO: renamed from: X.0lTZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1359270lTZ {
    public final boolean LIZ;
    public final boolean LIZIZ;
    public final boolean LIZJ;
    public final boolean LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1359270lTZ)) {
            return false;
        }
        C1359270lTZ c1359270lTZ = (C1359270lTZ) obj;
        return this.LIZ == c1359270lTZ.LIZ && this.LIZIZ == c1359270lTZ.LIZIZ && this.LIZJ == c1359270lTZ.LIZJ && this.LIZLLL == c1359270lTZ.LIZLLL;
    }

    public final int hashCode() {
        return (((((C786410Ut5.Z2(this.LIZ) * 31) + C786410Ut5.Z2(this.LIZIZ)) * 31) + C786410Ut5.Z2(this.LIZJ)) * 31) + C786410Ut5.Z2(this.LIZLLL);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RepostPublishPopupConfig(showFirstPublishEducation=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", showTextEncourage=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", canShowPush=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", canShowTooltip=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1359270lTZ(boolean z, boolean z2, boolean z3, boolean z4) {
        this.LIZ = z;
        this.LIZIZ = z2;
        this.LIZJ = z3;
        this.LIZLLL = z4;
    }
}
