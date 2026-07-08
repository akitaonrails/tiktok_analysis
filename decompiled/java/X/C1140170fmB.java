package X;

/* JADX INFO: renamed from: X.0fmB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1140170fmB {
    public boolean LIZ;
    public boolean LIZIZ;
    public boolean LIZJ;

    public C1140170fmB() {
        this(0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ConditionResult(isRemoveItem=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", isContinueLoop=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", isTargetItem=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1140170fmB(int i) {
        this.LIZ = false;
        this.LIZIZ = false;
        this.LIZJ = false;
    }

    public final void LIZ(boolean z, boolean z2, boolean z3) {
        this.LIZ = z;
        this.LIZIZ = z2;
        this.LIZJ = z3;
    }
}
