package X;

/* JADX INFO: renamed from: X.10uH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19394710uH {
    public static final /* synthetic */ int LIZJ = 0;
    public final int LIZ;
    public final float LIZIZ;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("op = ");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", duration = ");
        sbLIZ.append(this.LIZIZ);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C19394710uH)) {
            return false;
        }
        C19394710uH c19394710uH = (C19394710uH) obj;
        if (this.LIZ != c19394710uH.LIZ || this.LIZIZ != c19394710uH.LIZIZ) {
            return false;
        }
        return true;
    }

    public C19394710uH(float f, int i) {
        this.LIZ = i;
        this.LIZIZ = f;
    }
}
