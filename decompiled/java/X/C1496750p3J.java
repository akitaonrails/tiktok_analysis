package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0p3J, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1496750p3J {
    public final byte[] LIZ;
    public int LIZIZ;
    public int LIZJ;
    public boolean LIZLLL;
    public final boolean LJ;
    public C1496750p3J LJFF;
    public C1496750p3J LJI;

    public final C1496750p3J LIZJ() {
        this.LIZLLL = true;
        return new C1496750p3J(this.LIZ, this.LIZIZ, this.LIZJ, true, false);
    }

    public final C1496750p3J LIZ() {
        C1496750p3J c1496750p3J = this.LJFF;
        if (c1496750p3J == this) {
            c1496750p3J = null;
        }
        C1496750p3J c1496750p3J2 = this.LJI;
        if (c1496750p3J2 == null) {
            Intrinsics.LJIIL();
        }
        c1496750p3J2.LJFF = this.LJFF;
        C1496750p3J c1496750p3J3 = this.LJFF;
        if (c1496750p3J3 == null) {
            Intrinsics.LJIIL();
        }
        c1496750p3J3.LJI = this.LJI;
        this.LJFF = null;
        this.LJI = null;
        return c1496750p3J;
    }

    public C1496750p3J() {
        this.LIZ = new byte[8192];
        this.LJ = true;
    }

    public final void LIZIZ(C1496750p3J c1496750p3J) {
        c1496750p3J.LJI = this;
        c1496750p3J.LJFF = this.LJFF;
        C1496750p3J c1496750p3J2 = this.LJFF;
        if (c1496750p3J2 == null) {
            Intrinsics.LJIIL();
        }
        c1496750p3J2.LJI = c1496750p3J;
        this.LJFF = c1496750p3J;
    }

    public final void LIZLLL(C1496750p3J c1496750p3J, int i) {
        if (c1496750p3J.LJ) {
            int i2 = c1496750p3J.LIZJ;
            if (i2 + i > 8192) {
                if (!c1496750p3J.LIZLLL) {
                    int i3 = c1496750p3J.LIZIZ;
                    if ((i2 + i) - i3 <= 8192) {
                        byte[] bArr = c1496750p3J.LIZ;
                        System.arraycopy(bArr, i3, bArr, 0, i2 - i3);
                        c1496750p3J.LIZJ -= c1496750p3J.LIZIZ;
                        c1496750p3J.LIZIZ = 0;
                    } else {
                        throw new IllegalArgumentException();
                    }
                } else {
                    throw new IllegalArgumentException();
                }
            }
            System.arraycopy(this.LIZ, this.LIZIZ, c1496750p3J.LIZ, c1496750p3J.LIZJ, i);
            c1496750p3J.LIZJ += i;
            this.LIZIZ += i;
            return;
        }
        "only owner can write".toString();
        throw new IllegalStateException("only owner can write");
    }

    public C1496750p3J(byte[] bArr, int i, int i2, boolean z, boolean z2) {
        this.LIZ = bArr;
        this.LIZIZ = i;
        this.LIZJ = i2;
        this.LIZLLL = z;
        this.LJ = z2;
    }
}
