package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: renamed from: X.12yJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19929312yJ extends AbstractC19930012yQ {
    public final OutputStream LJI;

    public final void LJJJJI() {
        this.LJI.write(this.LIZLLL, 0, this.LJFF);
        this.LJFF = 0;
    }

    @Override // X.AbstractC19928912yF
    public final void LJIILLIIL(byte b) {
        if (this.LJFF == this.LJ) {
            LJJJJI();
        }
        int i = this.LJFF;
        this.LIZLLL[i] = b;
        this.LJFF = i + 1;
    }

    @Override // X.AbstractC19928912yF
    public final void LJIJJ(AbstractC19922812xG abstractC19922812xG) {
        LJJIJL(abstractC19922812xG.size());
        abstractC19922812xG.LJIJ(this);
    }

    @Override // X.AbstractC19928912yF
    public final void LJIL(int i) {
        LJJJJIZL(4);
        LJJIZ(i);
    }

    @Override // X.AbstractC19928912yF
    public final void LJJI(long j) {
        LJJJJIZL(8);
        LJJJ(j);
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
    public final void LJJIJIIJI(String str) throws IOException {
        try {
            int length = str.length() * 3;
            int iLJIILIIL = AbstractC19928912yF.LJIILIIL(length);
            int i = iLJIILIIL + length;
            int i2 = this.LJ;
            if (i > i2) {
                byte[] bArr = new byte[length];
                int iLIZLLL = C19920112wp.LIZ.LIZLLL(str, 0, length, bArr);
                LJJIJL(iLIZLLL);
                LJJJJJ(bArr, 0, iLIZLLL);
                return;
            }
            if (i > i2 - this.LJFF) {
                LJJJJI();
            }
            int iLJIILIIL2 = AbstractC19928912yF.LJIILIIL(str.length());
            int i3 = this.LJFF;
            try {
                if (iLJIILIIL2 == iLJIILIIL) {
                    int i4 = i3 + iLJIILIIL2;
                    this.LJFF = i4;
                    byte[] bArr2 = this.LIZLLL;
                    int iLIZLLL2 = C19920112wp.LIZ.LIZLLL(str, i4, this.LJ - i4, bArr2);
                    this.LJFF = i3;
                    LJJJIL((iLIZLLL2 - i3) - iLJIILIIL2);
                    this.LJFF = iLIZLLL2;
                    return;
                }
                int iLIZIZ = C19920112wp.LIZIZ(str);
                LJJJIL(iLIZIZ);
                byte[] bArr3 = this.LIZLLL;
                this.LJFF = C19920112wp.LIZ.LIZLLL(str, this.LJFF, iLIZIZ, bArr3);
            } catch (C19920312wr e) {
                TryCatchGuardChecker.doCheck(e);
                this.LJFF = i3;
                throw e;
            } catch (ArrayIndexOutOfBoundsException e2) {
                TryCatchGuardChecker.doCheck(e2);
                throw new C1318080kP8(e2);
            }
        } catch (C19920312wr e3) {
            TryCatchGuardChecker.doCheck(e3);
            LJIILL(str, e3);
        }
    }

    @Override // X.AbstractC19928912yF
    public final void LJJIJL(int i) {
        LJJJJIZL(5);
        LJJJIL(i);
    }

    @Override // X.AbstractC19928912yF
    public final void LJJIL(long j) {
        LJJJJIZL(10);
        LJJJJ(j);
    }

    public final void LJJJJIZL(int i) {
        if (this.LJ - this.LJFF < i) {
            LJJJJI();
        }
    }

    public C19929312yJ(OutputStream outputStream, int i) {
        super(i);
        if (outputStream != null) {
            this.LJI = outputStream;
            return;
        }
        throw new NullPointerException("out");
    }

    @Override // X.AbstractC19928912yF
    public final void LJIIZILJ(int i, boolean z) {
        LJJJJIZL(11);
        LJJJI(i, 0);
        byte b = z ? (byte) 1 : (byte) 0;
        int i2 = this.LJFF;
        this.LIZLLL[i2] = b;
        this.LJFF = i2 + 1;
    }

    @Override // X.AbstractC19928912yF
    public final void LJIJ(byte[] bArr, int i) throws IOException {
        LJJIJL(i);
        LJJJJJ(bArr, 0, i);
    }

    @Override // X.AbstractC19928912yF
    public final void LJIJI(int i, AbstractC19922812xG abstractC19922812xG) {
        LJJIJIIJIL(i, 2);
        LJIJJ(abstractC19922812xG);
    }

    @Override // X.AbstractC19928912yF
    public final void LJIJJLI(int i, int i2) {
        LJJJJIZL(14);
        LJJJI(i, 5);
        LJJIZ(i2);
    }

    @Override // X.AbstractC19928912yF
    public final void LJJ(int i, long j) {
        LJJJJIZL(18);
        LJJJI(i, 1);
        LJJJ(j);
    }

    @Override // X.AbstractC19928912yF
    public final void LJJII(int i, int i2) {
        LJJJJIZL(20);
        LJJJI(i, 0);
        if (i2 >= 0) {
            LJJJIL(i2);
        } else {
            LJJJJ(i2);
        }
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
        LJJJJIZL(20);
        LJJJI(i, 0);
        LJJJIL(i2);
    }

    @Override // X.AbstractC19928912yF
    public final void LJJIJLIJ(int i, long j) {
        LJJJJIZL(20);
        LJJJI(i, 0);
        LJJJJ(j);
    }

    @Override // X.AbstractC19922712xF
    public final void LIZ(int i, byte[] bArr, int i2) throws IOException {
        LJJJJJ(bArr, i, i2);
    }

    public final void LJJJJJ(byte[] bArr, int i, int i2) throws IOException {
        int i3 = this.LJ;
        int i4 = this.LJFF;
        int i5 = i3 - i4;
        if (i5 >= i2) {
            System.arraycopy(bArr, i, this.LIZLLL, i4, i2);
            this.LJFF += i2;
            return;
        }
        System.arraycopy(bArr, i, this.LIZLLL, i4, i5);
        int i6 = i + i5;
        int i7 = i2 - i5;
        this.LJFF = this.LJ;
        LJJJJI();
        if (i7 <= this.LJ) {
            System.arraycopy(bArr, i6, this.LIZLLL, 0, i7);
            this.LJFF = i7;
        } else {
            this.LJI.write(bArr, i6, i7);
        }
    }
}
