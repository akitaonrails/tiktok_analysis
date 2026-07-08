package X;

/* JADX INFO: renamed from: X.0PwV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C661130PwV {
    public final int LIZ;
    public final int LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C661130PwV)) {
            return false;
        }
        C661130PwV c661130PwV = (C661130PwV) obj;
        return this.LIZ == c661130PwV.LIZ && this.LIZIZ == c661130PwV.LIZIZ;
    }

    public final int hashCode() {
        return (this.LIZ * 31) + this.LIZIZ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CoverSize(width=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", height=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C661130PwV(int i, int i2) {
        this.LIZ = i;
        this.LIZIZ = i2;
    }
}
