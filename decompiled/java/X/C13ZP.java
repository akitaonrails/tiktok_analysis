package X;

import java.util.Arrays;

/* JADX INFO: renamed from: X.13ZP, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C13ZP extends C13Z9 {
    public int LIZIZ;
    public int LIZLLL;
    public int LJFF;
    public C13ZK[] LIZ = new C13ZK[16];
    public int[] LIZJ = new int[16];
    public Object[] LJ = new Object[16];

    public final void LIZ() {
        this.LIZIZ = 0;
        this.LIZLLL = 0;
        Arrays.fill(this.LJ, 0, this.LJFF, (Object) null);
        this.LJFF = 0;
    }

    @InterfaceC1294060jmO
    public final String toString() {
        return super.toString();
    }

    public final void LIZJ(C13ZK c13zk) {
        int i;
        int i2;
        int i3 = this.LIZIZ;
        C13ZK[] c13zkArr = this.LIZ;
        int i4 = 1024;
        if (i3 == c13zkArr.length) {
            if (i3 > 1024) {
                i2 = 1024;
            } else {
                i2 = i3;
            }
            C13ZK[] c13zkArr2 = new C13ZK[i2 + i3];
            System.arraycopy(c13zkArr, 0, c13zkArr2, 0, i3);
            this.LIZ = c13zkArr2;
        }
        int i5 = this.LIZLLL + c13zk.LIZ;
        int[] iArr = this.LIZJ;
        int length = iArr.length;
        if (i5 > length) {
            if (length > 1024) {
                i = 1024;
            } else {
                i = length;
            }
            int i6 = i + length;
            if (i6 >= i5) {
                i5 = i6;
            }
            int[] iArr2 = new int[i5];
            System.arraycopy(iArr, 0, iArr2, 0, length);
            this.LIZJ = iArr2;
        }
        int i7 = this.LJFF + c13zk.LIZIZ;
        Object[] objArr = this.LJ;
        int length2 = objArr.length;
        if (i7 > length2) {
            if (length2 <= 1024) {
                i4 = length2;
            }
            int i8 = i4 + length2;
            if (i8 >= i7) {
                i7 = i8;
            }
            Object[] objArr2 = new Object[i7];
            System.arraycopy(objArr, 0, objArr2, 0, length2);
            this.LJ = objArr2;
        }
        C13ZK[] c13zkArr3 = this.LIZ;
        int i9 = this.LIZIZ;
        this.LIZIZ = i9 + 1;
        c13zkArr3[i9] = c13zk;
        this.LIZLLL += c13zk.LIZ;
        this.LJFF += c13zk.LIZIZ;
    }

    public final void LIZIZ(InterfaceC20032213Zo interfaceC20032213Zo, C13ZE c13ze, C13ZG c13zg) {
        int i;
        int i2;
        if (this.LIZIZ != 0) {
            C20031413Zg c20031413Zg = new C20031413Zg(this);
            do {
                c20031413Zg.LIZLLL.LIZ[c20031413Zg.LIZ].LIZ(c20031413Zg, interfaceC20032213Zo, c13ze, c13zg);
                int i3 = c20031413Zg.LIZ;
                C13ZP c13zp = c20031413Zg.LIZLLL;
                i = c13zp.LIZIZ;
                if (i3 >= i) {
                    break;
                }
                C13ZK c13zk = c13zp.LIZ[i3];
                c20031413Zg.LIZIZ += c13zk.LIZ;
                c20031413Zg.LIZJ += c13zk.LIZIZ;
                i2 = i3 + 1;
                c20031413Zg.LIZ = i2;
            } while (i2 < i);
        }
        LIZ();
    }
}
