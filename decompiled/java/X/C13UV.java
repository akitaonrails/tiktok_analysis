package X;

import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.13UV, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C13UV {
    public int LIZ;
    public int LIZIZ;
    public Object LIZJ;
    public int LIZLLL;

    public final int hashCode() {
        return (((this.LIZ * 31) + this.LIZIZ) * 31) + this.LIZLLL;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(Integer.toHexString(System.identityHashCode(this)));
        sbLIZ.append(e3.e);
        int i = this.LIZ;
        sbLIZ.append(i != 1 ? i != 2 ? i != 4 ? i != 8 ? "??" : "mv" : "up" : "rm" : "add");
        sbLIZ.append(",s:");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append("c:");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(",p:");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(e3.f);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C13UV)) {
            return false;
        }
        C13UV c13uv = (C13UV) obj;
        int i = this.LIZ;
        if (i != c13uv.LIZ) {
            return false;
        }
        if (i == 8 && Math.abs(this.LIZLLL - this.LIZIZ) == 1 && this.LIZLLL == c13uv.LIZIZ && this.LIZIZ == c13uv.LIZLLL) {
            return true;
        }
        if (this.LIZLLL != c13uv.LIZLLL || this.LIZIZ != c13uv.LIZIZ) {
            return false;
        }
        Object obj2 = this.LIZJ;
        if (obj2 != null) {
            if (!obj2.equals(c13uv.LIZJ)) {
                return false;
            }
        } else if (c13uv.LIZJ != null) {
            return false;
        }
        return true;
    }

    public C13UV(int i, int i2, int i3, Object obj) {
        this.LIZ = i;
        this.LIZIZ = i2;
        this.LIZLLL = i3;
        this.LIZJ = obj;
    }
}
