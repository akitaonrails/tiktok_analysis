package X;

/* JADX INFO: renamed from: X.0gEV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1157730gEV implements InterfaceC1156820gD2 {
    public final EnumC1778900wOO LIZ;
    public final boolean LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1157730gEV)) {
            return false;
        }
        C1157730gEV c1157730gEV = (C1157730gEV) obj;
        return this.LIZ == c1157730gEV.LIZ && this.LIZIZ == c1157730gEV.LIZIZ;
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + C786410Ut5.Z2(this.LIZIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BigCardNegativeFeedbackContext(negativeScene=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", isNegative=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1157730gEV(EnumC1778900wOO enumC1778900wOO, boolean z) {
        this.LIZ = enumC1778900wOO;
        this.LIZIZ = z;
    }
}
