package X;

/* JADX INFO: renamed from: X.0Qd5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C674570Qd5 {
    public final boolean LIZ;
    public final int LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C674570Qd5)) {
            return false;
        }
        C674570Qd5 c674570Qd5 = (C674570Qd5) obj;
        return this.LIZ == c674570Qd5.LIZ && this.LIZIZ == c674570Qd5.LIZIZ;
    }

    public final int hashCode() {
        return (C786410Ut5.Z2(this.LIZ) * 31) + this.LIZIZ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("KeyboardState(visible=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", imeHeight=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C674570Qd5(boolean z, int i) {
        this.LIZ = z;
        this.LIZIZ = i;
    }
}
