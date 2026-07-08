package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Locale;

/* JADX INFO: renamed from: X.12vE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19910212vE extends AbstractC19910412vG {
    public final byte[] LIZJ;
    public final int LIZLLL;
    public int LJ;

    @Override // X.AbstractC19910412vG
    public final int LIZIZ() {
        return this.LIZLLL - this.LJ;
    }

    @Override // X.AbstractC19910412vG
    public final void LIZJ(byte b) throws C1317960kOw {
        int i = this.LJ;
        try {
            int i2 = i + 1;
            try {
                this.LIZJ[i] = b;
                this.LJ = i2;
            } catch (IndexOutOfBoundsException e) {
                e = e;
                TryCatchGuardChecker.doCheck(e);
                i = i2;
                throw new C1317960kOw(1, i, this.LIZLLL, e);
            }
        } catch (IndexOutOfBoundsException e2) {
            e = e2;
            TryCatchGuardChecker.doCheck(e);
        }
    }

    @Override // X.AbstractC19910412vG
    public final void LJI(AbstractC19855612mQ abstractC19855612mQ) {
        LJIJJ(abstractC19855612mQ.zze());
        abstractC19855612mQ.LJFF(this);
    }

    @Override // X.AbstractC19910412vG
    public final void LJIIIIZZ(int i) throws C1317960kOw {
        int i2 = this.LJ;
        try {
            byte[] bArr = this.LIZJ;
            bArr[i2] = (byte) i;
            bArr[i2 + 1] = (byte) (i >> 8);
            bArr[i2 + 2] = (byte) (i >> 16);
            bArr[i2 + 3] = (byte) (i >> 24);
            this.LJ = i2 + 4;
        } catch (IndexOutOfBoundsException e) {
            TryCatchGuardChecker.doCheck(e);
            throw new C1317960kOw(4, i2, this.LIZLLL, e);
        }
    }

    @Override // X.AbstractC19910412vG
    public final void LJIIJ(long j) throws C1317960kOw {
        int i = this.LJ;
        try {
            byte[] bArr = this.LIZJ;
            bArr[i] = (byte) j;
            bArr[i + 1] = (byte) (j >> 8);
            bArr[i + 2] = (byte) (j >> 16);
            bArr[i + 3] = (byte) (j >> 24);
            bArr[i + 4] = (byte) (j >> 32);
            bArr[i + 5] = (byte) (j >> 40);
            bArr[i + 6] = (byte) (j >> 48);
            bArr[i + 7] = (byte) (j >> 56);
            this.LJ = i + 8;
        } catch (IndexOutOfBoundsException e) {
            TryCatchGuardChecker.doCheck(e);
            throw new C1317960kOw(8, i, this.LIZLLL, e);
        }
    }

    @Override // X.AbstractC19910412vG
    public final void LJIIL(int i) {
        if (i >= 0) {
            LJIJJ(i);
        } else {
            LJIL(i);
        }
    }

    @Override // X.AbstractC19910412vG
    public final void LJIILIIL(InterfaceC19911612vS interfaceC19911612vS) {
        LJIJJ(interfaceC19911612vS.LJIILL());
        interfaceC19911612vS.LIZ(this);
    }

    @Override // X.AbstractC19910412vG
    public final void LJIIZILJ(String str) throws C1317960kOw {
        int i = this.LJ;
        try {
            int iLJJ = AbstractC19910412vG.LJJ(str.length() * 3);
            int iLJJ2 = AbstractC19910412vG.LJJ(str.length());
            if (iLJJ2 == iLJJ) {
                int i2 = i + iLJJ2;
                this.LJ = i2;
                int iLIZ = C19910612vI.LIZ(str, i2, this.LIZLLL - i2, this.LIZJ);
                this.LJ = i;
                LJIJJ((iLIZ - i) - iLJJ2);
                this.LJ = iLIZ;
                return;
            }
            LJIJJ(C19910612vI.LIZIZ(str));
            byte[] bArr = this.LIZJ;
            int i3 = this.LJ;
            this.LJ = C19910612vI.LIZ(str, i3, this.LIZLLL - i3, bArr);
        } catch (IndexOutOfBoundsException e) {
            TryCatchGuardChecker.doCheck(e);
            throw new C1317960kOw(e);
        }
    }

    @Override // X.AbstractC19910412vG
    public final void LJIJJ(int i) throws C1317960kOw {
        int i2;
        int i3 = this.LJ;
        while ((i & (-128)) != 0) {
            try {
                i2 = i3 + 1;
                try {
                    this.LIZJ[i3] = (byte) (i | 128);
                    i >>>= 7;
                    i3 = i2;
                } catch (IndexOutOfBoundsException e) {
                    e = e;
                    TryCatchGuardChecker.doCheck(e);
                    i3 = i2;
                    throw new C1317960kOw(1, i3, this.LIZLLL, e);
                }
            } catch (IndexOutOfBoundsException e2) {
                e = e2;
                TryCatchGuardChecker.doCheck(e);
                throw new C1317960kOw(1, i3, this.LIZLLL, e);
            }
        }
        i2 = i3 + 1;
        this.LIZJ[i3] = (byte) i;
        this.LJ = i2;
    }

    @Override // X.AbstractC19910412vG
    public final void LJIL(long j) throws C1317960kOw {
        int i;
        int i2 = this.LJ;
        if (AbstractC19910412vG.LIZIZ && this.LIZLLL - i2 >= 10) {
            while ((j & (-128)) != 0) {
                C19907112uj.LIZJ.LIZLLL(this.LIZJ, C19907112uj.LJ + i2, (byte) (((int) j) | 128));
                j >>>= 7;
                i2++;
            }
            i = i2 + 1;
            C19907112uj.LIZJ.LIZLLL(this.LIZJ, C19907112uj.LJ + ((long) i2), (byte) j);
        } else {
            while ((j & (-128)) != 0) {
                try {
                    int i3 = i2 + 1;
                    try {
                        this.LIZJ[i2] = (byte) (((int) j) | 128);
                        j >>>= 7;
                        i2 = i3;
                    } catch (IndexOutOfBoundsException e) {
                        e = e;
                        TryCatchGuardChecker.doCheck(e);
                        i2 = i3;
                        i = i2;
                        throw new C1317960kOw(1, i, this.LIZLLL, e);
                    }
                } catch (IndexOutOfBoundsException e2) {
                    e = e2;
                    TryCatchGuardChecker.doCheck(e);
                }
            }
            i = i2 + 1;
            try {
                this.LIZJ[i2] = (byte) j;
            } catch (IndexOutOfBoundsException e3) {
                e = e3;
                TryCatchGuardChecker.doCheck(e);
                throw new C1317960kOw(1, i, this.LIZLLL, e);
            }
        }
        this.LJ = i;
    }

    public C19910212vE(byte[] bArr, int i) {
        super(0);
        int length = bArr.length;
        if (((length - i) | i) >= 0) {
            this.LIZJ = bArr;
            this.LJ = 0;
            this.LIZLLL = i;
            return;
        }
        throw new IllegalArgumentException(C786410Ut5.k4(Locale.US, "Array range is invalid. Buffer.length=%d, offset=%d, length=%d", new Object[]{Integer.valueOf(length), 0, Integer.valueOf(i)}));
    }

    @Override // X.AbstractC19910412vG
    public final void LIZLLL(int i, boolean z) {
        LJIJJ(i << 3);
        LIZJ(z ? (byte) 1 : (byte) 0);
    }

    @Override // X.AbstractC19910412vG
    public final void LJ(byte[] bArr, int i) {
        LJIJJ(i);
        LJJIFFI(0, bArr, i);
    }

    @Override // X.AbstractC19910412vG
    public final void LJFF(int i, AbstractC19855612mQ abstractC19855612mQ) {
        LJIJJ((i << 3) | 2);
        LJI(abstractC19855612mQ);
    }

    @Override // X.AbstractC19910412vG
    public final void LJII(int i, int i2) {
        LJIJJ((i << 3) | 5);
        LJIIIIZZ(i2);
    }

    @Override // X.AbstractC19910412vG
    public final void LJIIIZ(int i, long j) {
        LJIJJ((i << 3) | 1);
        LJIIJ(j);
    }

    @Override // X.AbstractC19910412vG
    public final void LJIIJJI(int i, int i2) {
        LJIJJ(i << 3);
        LJIIL(i2);
    }

    @Override // X.AbstractC19910412vG
    public final void LJIILJJIL(int i, InterfaceC19911612vS interfaceC19911612vS) {
        LJIJJ(11);
        LJIJI(2, i);
        LJIJJ(26);
        LJIILIIL(interfaceC19911612vS);
        LJIJJ(12);
    }

    @Override // X.AbstractC19910412vG
    public final void LJIILL(int i, AbstractC19855612mQ abstractC19855612mQ) {
        LJIJJ(11);
        LJIJI(2, i);
        LJFF(3, abstractC19855612mQ);
        LJIJJ(12);
    }

    @Override // X.AbstractC19910412vG
    public final void LJIILLIIL(int i, String str) {
        LJIJJ((i << 3) | 2);
        LJIIZILJ(str);
    }

    @Override // X.AbstractC19910412vG
    public final void LJIJ(int i, int i2) {
        LJIJJ((i << 3) | i2);
    }

    @Override // X.AbstractC19910412vG
    public final void LJIJI(int i, int i2) {
        LJIJJ(i << 3);
        LJIJJ(i2);
    }

    @Override // X.AbstractC19910412vG
    public final void LJIJJLI(int i, long j) {
        LJIJJ(i << 3);
        LJIL(j);
    }

    public final void LJJIFFI(int i, byte[] bArr, int i2) {
        try {
            System.arraycopy(bArr, i, this.LIZJ, this.LJ, i2);
            this.LJ += i2;
        } catch (IndexOutOfBoundsException e) {
            TryCatchGuardChecker.doCheck(e);
            throw new C1317960kOw(i2, this.LJ, this.LIZLLL, e);
        }
    }
}
