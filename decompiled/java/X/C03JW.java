package X;

/* JADX INFO: renamed from: X.03JW, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C03JW {
    public final boolean LIZ;
    public final boolean LIZIZ;

    public C03JW() {
        this(false, false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C03JW)) {
            return false;
        }
        C03JW c03jw = (C03JW) obj;
        return this.LIZ == c03jw.LIZ && this.LIZIZ == c03jw.LIZIZ;
    }

    public final int hashCode() {
        return (C786410Ut5.Z2(this.LIZ) * 31) + C786410Ut5.Z2(this.LIZIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AgeConfirmState(isChecked=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", isHighlight=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C03JW(int i) {
        this(false, false);
    }

    public C03JW(boolean z, boolean z2) {
        this.LIZ = z;
        this.LIZIZ = z2;
    }
}
