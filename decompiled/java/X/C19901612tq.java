package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.logging.Level;

/* JADX INFO: renamed from: X.12tq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public class C19901612tq extends AbstractC19901712tr {
    public final byte[] LIZLLL;
    public final int LJ;
    public int LJFF;

    public final int LJJII() {
        return this.LJ - this.LJFF;
    }

    @Override // X.AbstractC19901712tr
    public final void LJ(byte b) throws C1318110kPB {
        try {
            byte[] bArr = this.LIZLLL;
            int i = this.LJFF;
            this.LJFF = i + 1;
            bArr[i] = b;
        } catch (IndexOutOfBoundsException e) {
            TryCatchGuardChecker.doCheck(e);
            throw new C1318110kPB(C786410Ut5.j4("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.LJFF), Integer.valueOf(this.LJ), 1}), e);
        }
    }

    @Override // X.AbstractC19901712tr
    public final void LJIILL(long j) throws C1318110kPB {
        try {
            byte[] bArr = this.LIZLLL;
            int i = this.LJFF;
            int i2 = i + 1;
            bArr[i] = (byte) j;
            int i3 = i2 + 1;
            bArr[i2] = (byte) (j >> 8);
            int i4 = i3 + 1;
            bArr[i3] = (byte) (j >> 16);
            int i5 = i4 + 1;
            bArr[i4] = (byte) (j >> 24);
            int i6 = i5 + 1;
            bArr[i5] = (byte) (j >> 32);
            int i7 = i6 + 1;
            bArr[i6] = (byte) (j >> 40);
            int i8 = i7 + 1;
            bArr[i7] = (byte) (j >> 48);
            this.LJFF = i8 + 1;
            bArr[i8] = (byte) (j >> 56);
        } catch (IndexOutOfBoundsException e) {
            TryCatchGuardChecker.doCheck(e);
            throw new C1318110kPB(C786410Ut5.j4("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.LJFF), Integer.valueOf(this.LJ), 1}), e);
        }
    }

    @Override // X.AbstractC19901712tr
    public final void LJIJ(int i) throws C1318110kPB {
        try {
            byte[] bArr = this.LIZLLL;
            int i2 = this.LJFF;
            int i3 = i2 + 1;
            bArr[i2] = (byte) i;
            int i4 = i3 + 1;
            bArr[i3] = (byte) (i >> 8);
            int i5 = i4 + 1;
            bArr[i4] = (byte) (i >> 16);
            this.LJFF = i5 + 1;
            bArr[i5] = (byte) (i >>> 24);
        } catch (IndexOutOfBoundsException e) {
            TryCatchGuardChecker.doCheck(e);
            throw new C1318110kPB(C786410Ut5.j4("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.LJFF), Integer.valueOf(this.LJ), 1}), e);
        }
    }

    @Override // X.AbstractC19901712tr
    public final void LJIJJLI(long j) throws C1318110kPB {
        if (AbstractC19901712tr.LIZJ && this.LJ - this.LJFF >= 10) {
            while ((j & (-128)) != 0) {
                byte[] bArr = this.LIZLLL;
                int i = this.LJFF;
                this.LJFF = i + 1;
                C19906212ua.LIZJ.LJ(bArr, C19906212ua.LJ + ((long) i), (byte) (((int) j) | 128));
                j >>>= 7;
            }
            byte[] bArr2 = this.LIZLLL;
            int i2 = this.LJFF;
            this.LJFF = i2 + 1;
            C19906212ua.LIZJ.LJ(bArr2, C19906212ua.LJ + ((long) i2), (byte) j);
            return;
        }
        while ((j & (-128)) != 0) {
            try {
                byte[] bArr3 = this.LIZLLL;
                int i3 = this.LJFF;
                this.LJFF = i3 + 1;
                bArr3[i3] = (byte) (((int) j) | 128);
                j >>>= 7;
            } catch (IndexOutOfBoundsException e) {
                TryCatchGuardChecker.doCheck(e);
                throw new C1318110kPB(C786410Ut5.j4("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.LJFF), Integer.valueOf(this.LJ), 1}), e);
            }
        }
        byte[] bArr4 = this.LIZLLL;
        int i4 = this.LJFF;
        this.LJFF = i4 + 1;
        bArr4[i4] = (byte) j;
    }

    @Override // X.AbstractC19901712tr
    public final void LJIL(int i) {
        if (i >= 0) {
            LJJI(i);
        } else {
            LJIJJLI(i);
        }
    }

    @Override // X.AbstractC19901712tr
    public final void LJJI(int i) throws C1318110kPB {
        while ((i & (-128)) != 0) {
            try {
                byte[] bArr = this.LIZLLL;
                int i2 = this.LJFF;
                this.LJFF = i2 + 1;
                bArr[i2] = (byte) (i | 128);
                i >>>= 7;
            } catch (IndexOutOfBoundsException e) {
                TryCatchGuardChecker.doCheck(e);
                throw new C1318110kPB(C786410Ut5.j4("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.LJFF), Integer.valueOf(this.LJ), 1}), e);
            }
        }
        byte[] bArr2 = this.LIZLLL;
        int i3 = this.LJFF;
        this.LJFF = i3 + 1;
        bArr2[i3] = (byte) i;
    }

    public final void LJJIII(AbstractC19854812mI abstractC19854812mI) {
        LJJI(abstractC19854812mI.zzb());
        abstractC19854812mI.LJ(this);
    }

    public final void LJJIIJ(String str) throws C1318110kPB {
        int i = this.LJFF;
        try {
            int iLJIILLIIL = AbstractC19901712tr.LJIILLIIL(str.length() * 3);
            int iLJIILLIIL2 = AbstractC19901712tr.LJIILLIIL(str.length());
            if (iLJIILLIIL2 == iLJIILLIIL) {
                int i2 = i + iLJIILLIIL2;
                this.LJFF = i2;
                int iLIZJ = C1322810kWl.LIZJ(str, i2, this.LJ - i2, this.LIZLLL);
                this.LJFF = i;
                LJJI((iLIZJ - i) - iLJIILLIIL2);
                this.LJFF = iLIZJ;
                return;
            }
            LJJI(C1322810kWl.LIZIZ(str));
            byte[] bArr = this.LIZLLL;
            int i3 = this.LJFF;
            this.LJFF = C1322810kWl.LIZJ(str, i3, this.LJ - i3, bArr);
        } catch (C1318010kP1 e) {
            TryCatchGuardChecker.doCheck(e);
            this.LJFF = i;
            AbstractC19901712tr.LIZIZ.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e);
            byte[] bytes = str.getBytes(C19856912md.LIZ);
            try {
                LJJI(bytes.length);
                LIZ(0, bytes, bytes.length);
            } catch (IndexOutOfBoundsException e2) {
                TryCatchGuardChecker.doCheck(e2);
                throw new C1318110kPB(e2);
            }
        } catch (IndexOutOfBoundsException e3) {
            TryCatchGuardChecker.doCheck(e3);
            throw new C1318110kPB(e3);
        }
    }

    public final void LJJIIZ(InterfaceC19901112tl interfaceC19901112tl) {
        LJJI(interfaceC19901112tl.LIZIZ());
        interfaceC19901112tl.LJ(this);
    }

    public C19901612tq(byte[] bArr, int i) {
        if (((bArr.length - i) | i) >= 0) {
            this.LIZLLL = bArr;
            this.LJFF = 0;
            this.LJ = i;
            return;
        }
        throw new IllegalArgumentException(C786410Ut5.j4("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", new Object[]{Integer.valueOf(bArr.length), 0, Integer.valueOf(i)}));
    }

    @Override // X.AbstractC19901712tr
    public final void LJFF(int i, InterfaceC19901112tl interfaceC19901112tl) {
        LJJ(1, 3);
        LJJIFFI(2, i);
        LJJ(3, 2);
        LJJIIZ(interfaceC19901112tl);
        LJJ(1, 4);
    }

    @Override // X.AbstractC19901712tr
    public final void LJI(int i, String str) throws C1318110kPB {
        LJJ(i, 2);
        LJJIIJ(str);
    }

    @Override // X.AbstractC19901712tr
    public final void LJII(int i, boolean z) {
        LJJ(i, 0);
        LJ(z ? (byte) 1 : (byte) 0);
    }

    @Override // X.AbstractC19901712tr
    public final void LJIIIIZZ(int i, AbstractC19854812mI abstractC19854812mI) {
        LJJ(i, 2);
        LJJIII(abstractC19854812mI);
    }

    @Override // X.AbstractC19901712tr
    public final void LJIIJ(int i, AbstractC19854812mI abstractC19854812mI) {
        LJJ(1, 3);
        LJJIFFI(2, i);
        LJIIIIZZ(3, abstractC19854812mI);
        LJJ(1, 4);
    }

    @Override // X.AbstractC19901712tr
    public final void LJIILJJIL(int i, long j) {
        LJJ(i, 1);
        LJIILL(j);
    }

    @Override // X.AbstractC19901712tr
    public final void LJIIZILJ(int i, int i2) {
        LJJ(i, 5);
        LJIJ(i2);
    }

    @Override // X.AbstractC19901712tr
    public final void LJIJI(int i, int i2) {
        LJJ(i, 0);
        LJIL(i2);
    }

    @Override // X.AbstractC19901712tr
    public final void LJIJJ(int i, long j) {
        LJJ(i, 0);
        LJIJJLI(j);
    }

    @Override // X.AbstractC19901712tr
    public final void LJJ(int i, int i2) {
        LJJI((i << 3) | i2);
    }

    @Override // X.AbstractC19901712tr
    public final void LJJIFFI(int i, int i2) {
        LJJ(i, 0);
        LJJI(i2);
    }

    @Override // X.AbstractC19855412mO
    public final void LIZ(int i, byte[] bArr, int i2) throws C1318110kPB {
        LJJIIJZLJL(i, bArr, i2);
    }

    @Override // X.AbstractC19901712tr
    public final void LJIIIZ(int i, InterfaceC19901112tl interfaceC19901112tl, InterfaceC19900112tb interfaceC19900112tb) {
        LJJ(i, 2);
        LJJI(((AbstractC19899312tT) interfaceC19901112tl).LJFF(interfaceC19900112tb));
        interfaceC19900112tb.LIZLLL(interfaceC19901112tl, this.LIZ);
    }

    public final void LJJIIJZLJL(int i, byte[] bArr, int i2) throws C1318110kPB {
        try {
            System.arraycopy(bArr, i, this.LIZLLL, this.LJFF, i2);
            this.LJFF += i2;
        } catch (IndexOutOfBoundsException e) {
            TryCatchGuardChecker.doCheck(e);
            throw new C1318110kPB(C786410Ut5.j4("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.LJFF), Integer.valueOf(this.LJ), Integer.valueOf(i2)}), e);
        }
    }
}
