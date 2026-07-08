package X;

/* JADX INFO: renamed from: X.0WBG, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0WBG {
    public final C0WBF<?> LIZ;
    public final int LIZIZ;
    public final int LIZJ;

    public C0WBG() {
        throw null;
    }

    public final int hashCode() {
        return ((((this.LIZ.hashCode() ^ 1000003) * 1000003) ^ this.LIZIZ) * 1000003) ^ this.LIZJ;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("Dependency{anInterface=");
        sb.append(this.LIZ);
        sb.append(", type=");
        int i = this.LIZIZ;
        sb.append(i == 1 ? "required" : i == 0 ? "optional" : "set");
        sb.append(", injection=");
        int i2 = this.LIZJ;
        if (i2 == 0) {
            str = "direct";
        } else if (i2 == 1) {
            str = "provider";
        } else {
            if (i2 != 2) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Unsupported injection: ");
                sbLIZ.append(i2);
                throw new AssertionError(C2188811AlT.LIZIZ(sbLIZ));
            }
            str = "deferred";
        }
        sb.append(str);
        sb.append("}");
        return sb.toString();
    }

    public static C0WBG LIZ(Class<?> cls) {
        return new C0WBG(1, 0, cls);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0WBG)) {
            return false;
        }
        C0WBG c0wbg = (C0WBG) obj;
        if (!this.LIZ.equals(c0wbg.LIZ) || this.LIZIZ != c0wbg.LIZIZ || this.LIZJ != c0wbg.LIZJ) {
            return false;
        }
        return true;
    }

    public C0WBG(int i, int i2, Class cls) {
        this.LIZ = C0WBF.LIZ(cls);
        this.LIZIZ = i;
        this.LIZJ = i2;
    }
}
