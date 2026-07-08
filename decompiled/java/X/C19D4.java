package X;

/* JADX INFO: renamed from: X.19D4, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C19D4 implements C06W4 {
    public boolean LIZ;
    public boolean LIZIZ;
    public boolean LIZJ;
    public boolean LIZLLL;
    public boolean LJ;
    public int LJFF;
    public int LJI;

    public C19D4() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C19D4)) {
            return false;
        }
        C19D4 c19d4 = (C19D4) obj;
        return this.LIZ == c19d4.LIZ && this.LIZIZ == c19d4.LIZIZ;
    }

    public final int hashCode() {
        return (C786410Ut5.Z2(this.LIZ) * 31) + C786410Ut5.Z2(this.LIZIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ImmersiveConfigAgent(autoDarkEnable=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", disable=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C19D4(int i) {
        this.LIZ = true;
        this.LIZIZ = false;
        this.LJFF = -1;
        this.LJI = -1;
    }
}
