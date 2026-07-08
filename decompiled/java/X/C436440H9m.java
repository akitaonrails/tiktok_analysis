package X;

/* JADX INFO: renamed from: X.0H9m, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C436440H9m {
    public final boolean LIZ;
    public final int LIZIZ;
    public final int LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C436440H9m)) {
            return false;
        }
        C436440H9m c436440H9m = (C436440H9m) obj;
        return this.LIZ == c436440H9m.LIZ && this.LIZIZ == c436440H9m.LIZIZ && this.LIZJ == c436440H9m.LIZJ;
    }

    public final int hashCode() {
        return (((C786410Ut5.Z2(this.LIZ) * 31) + this.LIZIZ) * 31) + this.LIZJ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FullPagePreviewImageNumberIndicatorState(visible=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", currentNumber=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", totalNumber=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C436440H9m(boolean z, int i, int i2) {
        this.LIZ = z;
        this.LIZIZ = i;
        this.LIZJ = i2;
    }

    public static C436440H9m LIZ(C436440H9m c436440H9m, boolean z, int i, int i2) {
        int i3;
        if ((i2 & 1) != 0) {
            z = c436440H9m.LIZ;
        }
        if ((i2 & 2) != 0) {
            i = c436440H9m.LIZIZ;
        }
        if ((i2 & 4) != 0) {
            i3 = c436440H9m.LIZJ;
        } else {
            i3 = 0;
        }
        c436440H9m.getClass();
        return new C436440H9m(z, i, i3);
    }
}
