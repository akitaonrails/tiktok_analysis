package X;

/* JADX INFO: renamed from: X.0qbs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1556620qbs {
    public final EnumC1562970qm7 LIZ;
    public final boolean LIZIZ;
    public final int LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1556620qbs)) {
            return false;
        }
        C1556620qbs c1556620qbs = (C1556620qbs) obj;
        return this.LIZ == c1556620qbs.LIZ && this.LIZIZ == c1556620qbs.LIZIZ && this.LIZJ == c1556620qbs.LIZJ;
    }

    public final int hashCode() {
        return (((this.LIZ.hashCode() * 31) + C786410Ut5.Z2(this.LIZIZ)) * 31) + this.LIZJ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RechargePanelTitleBarConfig(titleVariant=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", showFaq=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", titlePaddingHorizontalDp=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1556620qbs(EnumC1562970qm7 enumC1562970qm7, boolean z, int i) {
        this.LIZ = enumC1562970qm7;
        this.LIZIZ = z;
        this.LIZJ = i;
    }
}
