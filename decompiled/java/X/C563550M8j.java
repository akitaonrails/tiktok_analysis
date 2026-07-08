package X;

/* JADX INFO: renamed from: X.0M8j, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C563550M8j extends C0M8P {
    public final int LIZIZ;
    public final int LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C563550M8j)) {
            return false;
        }
        C563550M8j c563550M8j = (C563550M8j) obj;
        return this.LIZIZ == c563550M8j.LIZIZ && this.LIZJ == c563550M8j.LIZJ;
    }

    public final int hashCode() {
        return (this.LIZIZ * 31) + this.LIZJ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SelectedItemPositionSwapped(targetIndex=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", originalIndex=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C563550M8j(int i, int i2) {
        super(false);
        this.LIZIZ = i;
        this.LIZJ = i2;
    }
}
