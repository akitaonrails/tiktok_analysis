package X;

/* JADX INFO: renamed from: X.14Jt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public class C20245914Jt {
    public final C20246014Ju LIZ;
    public C20244914Jj[] LIZIZ;

    public C20246014Ju LIZIZ() {
        throw null;
    }

    public void LIZLLL(C20244914Jj c20244914Jj) {
    }

    public void LJ(C20244914Jj c20244914Jj) {
        throw null;
    }

    public void LJFF(C20244914Jj c20244914Jj) {
    }

    public void LJI(C20244914Jj c20244914Jj) {
        throw null;
    }

    public void LJII(C20244914Jj c20244914Jj) {
    }

    public C20245914Jt() {
        this(new C20246014Ju((C20246014Ju) null));
    }

    public final void LIZ() {
        C20244914Jj[] c20244914JjArr = this.LIZIZ;
        if (c20244914JjArr != null) {
            C20244914Jj c20244914JjLIZ = c20244914JjArr[C1776990wLJ.LIZ(1)];
            C20244914Jj c20244914JjLIZ2 = this.LIZIZ[C1776990wLJ.LIZ(2)];
            if (c20244914JjLIZ2 == null) {
                c20244914JjLIZ2 = this.LIZ.LIZ(2);
            }
            if (c20244914JjLIZ == null) {
                c20244914JjLIZ = this.LIZ.LIZ(1);
            }
            LJI(C20244914Jj.LIZ(c20244914JjLIZ, c20244914JjLIZ2));
            C20244914Jj c20244914Jj = this.LIZIZ[C1776990wLJ.LIZ(16)];
            if (c20244914Jj != null) {
                LJFF(c20244914Jj);
            }
            C20244914Jj c20244914Jj2 = this.LIZIZ[C1776990wLJ.LIZ(32)];
            if (c20244914Jj2 != null) {
                LIZLLL(c20244914Jj2);
            }
            C20244914Jj c20244914Jj3 = this.LIZIZ[C1776990wLJ.LIZ(64)];
            if (c20244914Jj3 != null) {
                LJII(c20244914Jj3);
            }
        }
    }

    public C20245914Jt(C20246014Ju c20246014Ju) {
        this.LIZ = c20246014Ju;
    }

    public void LIZJ(int i, C20244914Jj c20244914Jj) {
        if (this.LIZIZ == null) {
            this.LIZIZ = new C20244914Jj[9];
        }
        int i2 = 1;
        do {
            if ((i & i2) != 0) {
                this.LIZIZ[C1776990wLJ.LIZ(i2)] = c20244914Jj;
            }
            i2 <<= 1;
        } while (i2 <= 256);
    }
}
