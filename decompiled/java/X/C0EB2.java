package X;

/* JADX INFO: renamed from: X.0EB2, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0EB2 {
    public final int LIZ;
    public final int LIZIZ;
    public final int LIZJ;

    public C0EB2() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0EB2)) {
            return false;
        }
        C0EB2 c0eb2 = (C0EB2) obj;
        return this.LIZ == c0eb2.LIZ && this.LIZIZ == c0eb2.LIZIZ && this.LIZJ == c0eb2.LIZJ;
    }

    public final int hashCode() {
        return (((this.LIZ * 31) + this.LIZIZ) * 31) + this.LIZJ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BeautyParamSeekBarConfig(beautyValue=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", min=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", max=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C0EB2(int i) {
        this(0, 0, 100);
    }

    public C0EB2(int i, int i2, int i3) {
        this.LIZ = i;
        this.LIZIZ = i2;
        this.LIZJ = i3;
    }
}
