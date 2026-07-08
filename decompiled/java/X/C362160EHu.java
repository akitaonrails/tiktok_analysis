package X;

/* JADX INFO: renamed from: X.0EHu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C362160EHu {
    public final boolean LIZ;
    public final boolean LIZIZ;
    public final boolean LIZJ;
    public final boolean LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C362160EHu)) {
            return false;
        }
        C362160EHu c362160EHu = (C362160EHu) obj;
        return this.LIZ == c362160EHu.LIZ && this.LIZIZ == c362160EHu.LIZIZ && this.LIZJ == c362160EHu.LIZJ && this.LIZLLL == c362160EHu.LIZLLL;
    }

    public final int hashCode() {
        return (((((C786410Ut5.Z2(this.LIZ) * 31) + C786410Ut5.Z2(this.LIZIZ)) * 31) + C786410Ut5.Z2(this.LIZJ)) * 31) + C786410Ut5.Z2(this.LIZLLL);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FunctionEnableSetting(isEffectEnable=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", isFilterEnable=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", isBeatEnable=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", isStickerEnable=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C362160EHu(boolean z, boolean z2, boolean z3, boolean z4) {
        this.LIZ = z;
        this.LIZIZ = z2;
        this.LIZJ = z3;
        this.LIZLLL = z4;
    }
}
