package X;

/* JADX INFO: renamed from: X.07fe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1920407fe {
    public final int LIZ;
    public final int LIZIZ;
    public final int LIZJ;

    public C1920407fe() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1920407fe)) {
            return false;
        }
        C1920407fe c1920407fe = (C1920407fe) obj;
        return this.LIZ == c1920407fe.LIZ && this.LIZIZ == c1920407fe.LIZIZ && this.LIZJ == c1920407fe.LIZJ;
    }

    public final int hashCode() {
        return (((this.LIZ * 31) + this.LIZIZ) * 31) + this.LIZJ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("NimbleVideoListSpacingConfig(defaultStartMarginPx=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", endItemMarginPx=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", middleItemMarginPx=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C1920407fe(int i) {
        this(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)));
    }

    public C1920407fe(int i, int i2, int i3) {
        this.LIZ = i;
        this.LIZIZ = i2;
        this.LIZJ = i3;
    }
}
