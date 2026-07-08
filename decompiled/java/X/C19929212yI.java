package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Locale;

/* JADX INFO: renamed from: X.12yI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public class C19929212yI extends AbstractC19928912yF {
    public final byte[] LIZLLL;
    public final int LJ;
    public int LJFF;

    public final int LJJIZ() {
        return this.LJ - this.LJFF;
    }

    @Override // X.AbstractC19928912yF
    public final void LJIILLIIL(byte b) throws C1318080kP8 {
        int i = this.LJFF;
        try {
            int i2 = i + 1;
            try {
                this.LIZLLL[i] = b;
                this.LJFF = i2;
            } catch (IndexOutOfBoundsException e) {
                e = e;
                i = i2;
                TryCatchGuardChecker.doCheck(e);
                throw new C1318080kP8(i, this.LJ, 1, e);
            }
        } catch (IndexOutOfBoundsException e2) {
            e = e2;
        }
    }

    @Override // X.AbstractC19928912yF
    public final void LJIJJ(AbstractC19922812xG abstractC19922812xG) {
        LJJIJL(abstractC19922812xG.size());
        abstractC19922812xG.LJIJ(this);
    }

    @Override // X.AbstractC19928912yF
    public final void LJIL(int i) throws C1318080kP8 {
        int i2 = this.LJFF;
        try {
            byte[] bArr = this.LIZLLL;
            bArr[i2] = (byte) i;
            bArr[i2 + 1] = (byte) (i >> 8);
            bArr[i2 + 2] = (byte) (i >> 16);
            bArr[i2 + 3] = (byte) (i >> 24);
            this.LJFF = i2 + 4;
        } catch (IndexOutOfBoundsException e) {
            TryCatchGuardChecker.doCheck(e);
            throw new C1318080kP8(i2, this.LJ, 4, e);
        }
    }

    @Override // X.AbstractC19928912yF
    public final void LJJI(long j) throws C1318080kP8 {
        int i = this.LJFF;
        try {
            byte[] bArr = this.LIZLLL;
            bArr[i] = (byte) j;
            bArr[i + 1] = (byte) (j >> 8);
            bArr[i + 2] = (byte) (j >> 16);
            bArr[i + 3] = (byte) (j >> 24);
            bArr[i + 4] = (byte) (j >> 32);
            bArr[i + 5] = (byte) (j >> 40);
            bArr[i + 6] = (byte) (j >> 48);
            bArr[i + 7] = (byte) (j >> 56);
            this.LJFF = i + 8;
        } catch (IndexOutOfBoundsException e) {
            TryCatchGuardChecker.doCheck(e);
            throw new C1318080kP8(i, this.LJ, 8, e);
        }
    }

    @Override // X.AbstractC19928912yF
    public final void LJJIII(int i) {
        if (i >= 0) {
            LJJIJL(i);
        } else {
            LJJIL(i);
        }
    }

    @Override // X.AbstractC19928912yF
    public final void LJJIIJZLJL(InterfaceC19925612xi interfaceC19925612xi) {
        LJJIJL(interfaceC19925612xi.getSerializedSize());
        interfaceC19925612xi.writeTo(this);
    }

    @Override // X.AbstractC19928912yF
    public final void LJJIJIIJI(String str) throws C1318080kP8 {
        int i = this.LJFF;
        try {
            int iLJIILIIL = AbstractC19928912yF.LJIILIIL(str.length() * 3);
            int iLJIILIIL2 = AbstractC19928912yF.LJIILIIL(str.length());
            if (iLJIILIIL2 == iLJIILIIL) {
                int i2 = i + iLJIILIIL2;
                this.LJFF = i2;
                byte[] bArr = this.LIZLLL;
                int iLIZLLL = C19920112wp.LIZ.LIZLLL(str, i2, this.LJ - i2, bArr);
                this.LJFF = i;
                LJJIJL((iLIZLLL - i) - iLJIILIIL2);
                this.LJFF = iLIZLLL;
                return;
            }
            LJJIJL(C19920112wp.LIZIZ(str));
            byte[] bArr2 = this.LIZLLL;
            int i3 = this.LJFF;
            this.LJFF = C19920112wp.LIZ.LIZLLL(str, i3, this.LJ - i3, bArr2);
        } catch (C19920312wr e) {
            TryCatchGuardChecker.doCheck(e);
            this.LJFF = i;
            LJIILL(str, e);
        } catch (IndexOutOfBoundsException e2) {
            TryCatchGuardChecker.doCheck(e2);
            throw new C1318080kP8(e2);
        }
    }

    @Override // X.AbstractC19928912yF
    public final void LJJIJL(int i) throws C1318080kP8 {
        int i2;
        int i3 = this.LJFF;
        while ((i & (-128)) != 0) {
            try {
                i2 = i3 + 1;
                try {
                    this.LIZLLL[i3] = (byte) (i | 128);
                    i >>>= 7;
                    i3 = i2;
                } catch (IndexOutOfBoundsException e) {
                    e = e;
                    i3 = i2;
                    TryCatchGuardChecker.doCheck(e);
                    throw new C1318080kP8(i3, this.LJ, 1, e);
                }
            } catch (IndexOutOfBoundsException e2) {
                e = e2;
                TryCatchGuardChecker.doCheck(e);
                throw new C1318080kP8(i3, this.LJ, 1, e);
            }
        }
        i2 = i3 + 1;
        this.LIZLLL[i3] = (byte) i;
        this.LJFF = i2;
    }

    @Override // X.AbstractC19928912yF
    public final void LJJIL(long j) throws C1318080kP8 {
        int i;
        int i2;
        int i3 = this.LJFF;
        if (AbstractC19928912yF.LIZJ && this.LJ - i3 >= 10) {
            while ((j & (-128)) != 0) {
                C19917512wP.LJIJI(this.LIZLLL, (byte) (((int) j) | 128), i3);
                j >>>= 7;
                i3++;
            }
            i = i3 + 1;
            C19917512wP.LJIJI(this.LIZLLL, (byte) j, i3);
        } else {
            while ((j & (-128)) != 0) {
                try {
                    i2 = i3 + 1;
                } catch (IndexOutOfBoundsException e) {
                    e = e;
                }
                try {
                    this.LIZLLL[i3] = (byte) (((int) j) | 128);
                    j >>>= 7;
                    i3 = i2;
                } catch (IndexOutOfBoundsException e2) {
                    e = e2;
                    i3 = i2;
                    TryCatchGuardChecker.doCheck(e);
                    throw new C1318080kP8(i3, this.LJ, 1, e);
                }
            }
            i = i3 + 1;
            try {
                this.LIZLLL[i3] = (byte) j;
            } catch (IndexOutOfBoundsException e3) {
                e = e3;
                i3 = i;
                TryCatchGuardChecker.doCheck(e);
                throw new C1318080kP8(i3, this.LJ, 1, e);
            }
        }
        this.LJFF = i;
    }

    public C19929212yI(byte[] bArr, int i) {
        if (((bArr.length - i) | i) >= 0) {
            this.LIZLLL = bArr;
            this.LJFF = 0;
            this.LJ = i;
            return;
        }
        throw new IllegalArgumentException(C786410Ut5.k4(Locale.US, "Array range is invalid. Buffer.length=%d, offset=%d, length=%d", new Object[]{Integer.valueOf(bArr.length), 0, Integer.valueOf(i)}));
    }

    @Override // X.AbstractC19928912yF
    public final void LJIIZILJ(int i, boolean z) {
        LJJIJIIJIL(i, 0);
        LJIILLIIL(z ? (byte) 1 : (byte) 0);
    }

    @Override // X.AbstractC19928912yF
    public final void LJIJ(byte[] bArr, int i) throws C1318080kP8 {
        LJJIJL(i);
        try {
            System.arraycopy(bArr, 0, this.LIZLLL, this.LJFF, i);
            this.LJFF += i;
        } catch (IndexOutOfBoundsException e) {
            TryCatchGuardChecker.doCheck(e);
            throw new C1318080kP8(this.LJFF, this.LJ, i, e);
        }
    }

    @Override // X.AbstractC19928912yF
    public final void LJIJI(int i, AbstractC19922812xG abstractC19922812xG) {
        LJJIJIIJIL(i, 2);
        LJIJJ(abstractC19922812xG);
    }

    @Override // X.AbstractC19928912yF
    public final void LJIJJLI(int i, int i2) {
        LJJIJIIJIL(i, 5);
        LJIL(i2);
    }

    @Override // X.AbstractC19928912yF
    public final void LJJ(int i, long j) {
        LJJIJIIJIL(i, 1);
        LJJI(j);
    }

    @Override // X.AbstractC19928912yF
    public final void LJJII(int i, int i2) {
        LJJIJIIJIL(i, 0);
        LJJIII(i2);
    }

    @Override // X.AbstractC19928912yF
    public final void LJJIIJ(int i, InterfaceC19925612xi interfaceC19925612xi) {
        LJJIJIIJIL(i, 2);
        LJJIIJZLJL(interfaceC19925612xi);
    }

    @Override // X.AbstractC19928912yF
    public final void LJJIIZ(int i, InterfaceC19925612xi interfaceC19925612xi) {
        LJJIJIIJIL(1, 3);
        LJJIJIL(2, i);
        LJJIIJ(3, interfaceC19925612xi);
        LJJIJIIJIL(1, 4);
    }

    @Override // X.AbstractC19928912yF
    public final void LJJIIZI(int i, AbstractC19922812xG abstractC19922812xG) {
        LJJIJIIJIL(1, 3);
        LJJIJIL(2, i);
        LJIJI(3, abstractC19922812xG);
        LJJIJIIJIL(1, 4);
    }

    @Override // X.AbstractC19928912yF
    public final void LJJIJ(int i, String str) {
        LJJIJIIJIL(i, 2);
        LJJIJIIJI(str);
    }

    @Override // X.AbstractC19928912yF
    public final void LJJIJIIJIL(int i, int i2) {
        LJJIJL((i << 3) | i2);
    }

    @Override // X.AbstractC19928912yF
    public final void LJJIJIL(int i, int i2) {
        LJJIJIIJIL(i, 0);
        LJJIJL(i2);
    }

    @Override // X.AbstractC19928912yF
    public final void LJJIJLIJ(int i, long j) {
        LJJIJIIJIL(i, 0);
        LJJIL(j);
    }

    @Override // X.AbstractC19922712xF
    public final void LIZ(int i, byte[] bArr, int i2) throws C1318080kP8 {
        try {
            System.arraycopy(bArr, i, this.LIZLLL, this.LJFF, i2);
            this.LJFF += i2;
        } catch (IndexOutOfBoundsException e) {
            TryCatchGuardChecker.doCheck(e);
            throw new C1318080kP8(this.LJFF, this.LJ, i2, e);
        }
    }
}
