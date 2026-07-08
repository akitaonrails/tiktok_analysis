package X;

/* JADX INFO: renamed from: X.14Jm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public class C20245214Jm {
    public C20244814Ji[] LIZ;

    public C20244614Jg LIZIZ() {
        throw null;
    }

    public void LIZLLL(C20244814Ji c20244814Ji) {
    }

    public void LJ(C20244814Ji c20244814Ji) {
    }

    public void LJFF(C20244814Ji c20244814Ji) {
        throw null;
    }

    public void LJI(C20244814Ji c20244814Ji) {
    }

    public C20245214Jm() {
        this(new C20244614Jg());
    }

    public final void LIZ() {
        C20244814Ji[] c20244814JiArr = this.LIZ;
        if (c20244814JiArr != null) {
            C20244814Ji c20244814Ji = c20244814JiArr[C1777000wLK.LIZ(1)];
            C20244814Ji c20244814Ji2 = this.LIZ[C1777000wLK.LIZ(2)];
            if (c20244814Ji != null) {
                if (c20244814Ji2 != null) {
                    LJFF(C20244814Ji.LIZ(c20244814Ji, c20244814Ji2));
                } else {
                    LJFF(c20244814Ji);
                }
            } else if (c20244814Ji2 != null) {
                LJFF(c20244814Ji2);
            }
            C20244814Ji c20244814Ji3 = this.LIZ[C1777000wLK.LIZ(16)];
            if (c20244814Ji3 != null) {
                LJ(c20244814Ji3);
            }
            C20244814Ji c20244814Ji4 = this.LIZ[C1777000wLK.LIZ(32)];
            if (c20244814Ji4 != null) {
                LIZLLL(c20244814Ji4);
            }
            C20244814Ji c20244814Ji5 = this.LIZ[C1777000wLK.LIZ(64)];
            if (c20244814Ji5 != null) {
                LJI(c20244814Ji5);
            }
        }
    }

    public C20245214Jm(C20244614Jg c20244614Jg) {
    }

    public void LIZJ(int i, C20244814Ji c20244814Ji) {
        if (this.LIZ == null) {
            this.LIZ = new C20244814Ji[9];
        }
        int i2 = 1;
        do {
            if ((i & i2) != 0) {
                this.LIZ[C1777000wLK.LIZ(i2)] = c20244814Ji;
            }
            i2 <<= 1;
        } while (i2 <= 256);
    }
}
