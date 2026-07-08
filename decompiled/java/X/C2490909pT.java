package X;

/* JADX INFO: renamed from: X.09pT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2490909pT {
    public final int LIZ;
    public final int LIZIZ;

    public C2490909pT() {
        this.LIZ = 720;
        this.LIZIZ = 1280;
    }

    public final int hashCode() {
        return (this.LIZ * 65537) + 1 + this.LIZIZ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LIZ);
        sbLIZ.append("x");
        sbLIZ.append(this.LIZIZ);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C2490909pT)) {
            return false;
        }
        C2490909pT c2490909pT = (C2490909pT) obj;
        if (this.LIZ != c2490909pT.LIZ || this.LIZIZ != c2490909pT.LIZIZ) {
            return false;
        }
        return true;
    }

    public C2490909pT(int i, int i2) {
        this.LIZ = 720;
        this.LIZIZ = 1280;
        this.LIZ = i;
        this.LIZIZ = i2;
    }
}
