package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Arrays;

/* JADX INFO: renamed from: X.0kOi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public abstract class AbstractC1317820kOi {
    public final int LIZ = Integer.MAX_VALUE;

    public abstract AbstractC1322720kWc LIZIZ();

    public abstract int LIZJ();

    public abstract float LIZLLL();

    public abstract int LJ();

    public abstract long LJFF();

    public abstract int LJI();

    public abstract int LJII();

    public abstract long LJIIIIZZ();

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0kWa] */
    public static C1322700kWa LIZ(final byte[] bArr, final int i, final int i2, final boolean z) {
        ?? r0 = new AbstractC1317820kOi(bArr, i, i2, z) { // from class: X.0kWa
            public final byte[] LIZIZ;
            public int LIZJ;
            public int LIZLLL;
            public int LJ;
            public final int LJFF;
            public int LJI = Integer.MAX_VALUE;

            @Override // X.AbstractC1317820kOi
            public final int LJI() throws C1322750kWf {
                if (this.LJ == this.LIZJ) {
                    return 0;
                }
                int iLJIIJJI = LJIIJJI();
                if ((iLJIIJJI >>> 3) != 0) {
                    return iLJIIJJI;
                }
                throw new C1322750kWf("Protocol message contained an invalid tag (zero).");
            }

            public final int LJIIJ() throws C1322750kWf {
                int i3 = this.LJ;
                if (this.LIZJ - i3 < 4) {
                    throw C1322750kWf.LIZ();
                }
                byte[] bArr2 = this.LIZIZ;
                this.LJ = i3 + 4;
                return ((bArr2[i3 + 3] & 255) << 24) | (bArr2[i3] & 255) | ((bArr2[i3 + 1] & 255) << 8) | ((bArr2[i3 + 2] & 255) << 16);
            }

            /* JADX WARN: Code restructure failed: missing block: B:19:0x003a, code lost:
            
                if (r4[r2] < 0) goto L20;
             */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final int LJIIJJI() {
                /*
                    r5 = this;
                    int r0 = r5.LJ
                    int r1 = r5.LIZJ
                    if (r1 == r0) goto L3c
                    byte[] r4 = r5.LIZIZ
                    int r2 = r0 + 1
                    r3 = r4[r0]
                    if (r3 < 0) goto L5d
                    r5.LJ = r2
                    return r3
                L11:
                    int r2 = r1 + 1
                    r1 = r4[r1]
                    int r0 = r1 << 28
                    r3 = r3 ^ r0
                    r0 = 266354560(0xfe03f80, float:2.2112565E-29)
                    r3 = r3 ^ r0
                    if (r1 >= 0) goto L4d
                    int r1 = r2 + 1
                    r0 = r4[r2]
                    if (r0 >= 0) goto L6d
                    int r2 = r1 + 1
                    r0 = r4[r1]
                    if (r0 >= 0) goto L4d
                    int r1 = r2 + 1
                    r0 = r4[r2]
                    if (r0 >= 0) goto L6d
                    int r2 = r1 + 1
                    r0 = r4[r1]
                    if (r0 >= 0) goto L4d
                    int r1 = r2 + 1
                    r0 = r4[r2]
                    if (r0 >= 0) goto L6d
                L3c:
                    long r1 = r5.LJIILIIL()
                    int r0 = (int) r1
                    return r0
                L42:
                    int r2 = r1 + 1
                    r0 = r4[r1]
                    int r0 = r0 << 14
                    r3 = r3 ^ r0
                    if (r3 < 0) goto L4f
                    r3 = r3 ^ 16256(0x3f80, float:2.278E-41)
                L4d:
                    r1 = r2
                    goto L6d
                L4f:
                    int r1 = r2 + 1
                    r0 = r4[r2]
                    int r0 = r0 << 21
                    r3 = r3 ^ r0
                    if (r3 >= 0) goto L11
                    r0 = -2080896(0xffffffffffe03f80, float:NaN)
                    r3 = r3 ^ r0
                    goto L6d
                L5d:
                    int r1 = r1 - r2
                    r0 = 9
                    if (r1 < r0) goto L3c
                    int r1 = r2 + 1
                    r0 = r4[r2]
                    int r0 = r0 << 7
                    r3 = r3 ^ r0
                    if (r3 >= 0) goto L42
                    r3 = r3 ^ (-128(0xffffffffffffff80, float:NaN))
                L6d:
                    r5.LJ = r1
                    return r3
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C1322700kWa.LJIIJJI():int");
            }

            /* JADX WARN: Code restructure failed: missing block: B:11:0x002c, code lost:
            
                if (r6[r5] < 0) goto L12;
             */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final long LJIIL() {
                /*
                    r10 = this;
                    int r0 = r10.LJ
                    int r3 = r10.LIZJ
                    if (r3 == r0) goto L2e
                    byte[] r6 = r10.LIZIZ
                    int r1 = r0 + 1
                    r2 = r6[r0]
                    if (r2 < 0) goto L35
                    r10.LJ = r1
                    long r0 = (long) r2
                    return r0
                L12:
                    int r5 = r7 + 1
                    r0 = r6[r7]
                    long r1 = (long) r0
                    r0 = 56
                    long r1 = r1 << r0
                    long r3 = r3 ^ r1
                    r0 = 71499008037633920(0xfe03f80fe03f80, double:6.838959413692434E-304)
                    long r3 = r3 ^ r0
                    int r0 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
                    if (r0 >= 0) goto L33
                    int r7 = r5 + 1
                    r0 = r6[r5]
                    long r1 = (long) r0
                    int r0 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
                    if (r0 >= 0) goto L46
                L2e:
                    long r0 = r10.LJIILIIL()
                    return r0
                L33:
                    r7 = r5
                    goto L46
                L35:
                    int r3 = r3 - r1
                    r0 = 9
                    if (r3 < r0) goto L2e
                    int r7 = r1 + 1
                    r0 = r6[r1]
                    int r0 = r0 << 7
                    r2 = r2 ^ r0
                    if (r2 >= 0) goto L49
                    r2 = r2 ^ (-128(0xffffffffffffff80, float:NaN))
                L45:
                    long r3 = (long) r2
                L46:
                    r10.LJ = r7
                    return r3
                L49:
                    int r1 = r7 + 1
                    r0 = r6[r7]
                    int r0 = r0 << 14
                    r2 = r2 ^ r0
                    if (r2 < 0) goto L57
                    r0 = r2 ^ 16256(0x3f80, float:2.278E-41)
                    long r3 = (long) r0
                    r7 = r1
                    goto L46
                L57:
                    int r7 = r1 + 1
                    r0 = r6[r1]
                    int r0 = r0 << 21
                    r2 = r2 ^ r0
                    if (r2 >= 0) goto L65
                    r0 = -2080896(0xffffffffffe03f80, float:NaN)
                    r2 = r2 ^ r0
                    goto L45
                L65:
                    long r3 = (long) r2
                    int r5 = r7 + 1
                    r0 = r6[r7]
                    long r1 = (long) r0
                    r0 = 28
                    long r1 = r1 << r0
                    long r3 = r3 ^ r1
                    r8 = 0
                    int r0 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
                    if (r0 < 0) goto L7b
                    r0 = 266354560(0xfe03f80, double:1.315966377E-315)
                L78:
                    long r3 = r3 ^ r0
                    r7 = r5
                    goto L46
                L7b:
                    int r7 = r5 + 1
                    r0 = r6[r5]
                    long r1 = (long) r0
                    r0 = 35
                    long r1 = r1 << r0
                    long r3 = r3 ^ r1
                    int r0 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
                    if (r0 >= 0) goto L8f
                    r0 = -34093383808(0xfffffff80fe03f80, double:NaN)
                L8d:
                    long r3 = r3 ^ r0
                    goto L46
                L8f:
                    int r5 = r7 + 1
                    r0 = r6[r7]
                    long r1 = (long) r0
                    r0 = 42
                    long r1 = r1 << r0
                    long r3 = r3 ^ r1
                    int r0 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
                    if (r0 < 0) goto La2
                    r0 = 4363953127296(0x3f80fe03f80, double:2.1560793202584E-311)
                    goto L78
                La2:
                    int r7 = r5 + 1
                    r0 = r6[r5]
                    long r1 = (long) r0
                    r0 = 49
                    long r1 = r1 << r0
                    long r3 = r3 ^ r1
                    int r0 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
                    if (r0 >= 0) goto L12
                    r0 = -558586000294016(0xfffe03f80fe03f80, double:NaN)
                    goto L8d
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C1322700kWa.LJIIL():long");
            }

            public final long LJIILIIL() throws C1322750kWf {
                long j = 0;
                int i3 = 0;
                do {
                    int i4 = this.LJ;
                    if (i4 == this.LIZJ) {
                        throw C1322750kWf.LIZ();
                    }
                    byte[] bArr2 = this.LIZIZ;
                    this.LJ = i4 + 1;
                    byte b = bArr2[i4];
                    j |= ((long) (b & 127)) << i3;
                    if ((b & 128) == 0) {
                        return j;
                    }
                    i3 += 7;
                } while (i3 < 64);
                throw new C1322750kWf("CodedInputStream encountered a malformed varint.");
            }

            @Override // X.AbstractC1317820kOi
            public final AbstractC1322720kWc LIZIZ() throws C1322750kWf {
                int iLJIIJJI = LJIIJJI();
                if (iLJIIJJI > 0) {
                    int i3 = this.LIZJ;
                    int i4 = this.LJ;
                    if (iLJIIJJI <= i3 - i4) {
                        AbstractC1322720kWc abstractC1322720kWcCopyFrom = AbstractC1322720kWc.copyFrom(this.LIZIZ, i4, iLJIIJJI);
                        this.LJ += iLJIIJJI;
                        return abstractC1322720kWcCopyFrom;
                    }
                } else {
                    if (iLJIIJJI == 0) {
                        return AbstractC1322720kWc.EMPTY;
                    }
                    if (iLJIIJJI <= 0) {
                        throw new C1322750kWf("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                    }
                }
                int i5 = this.LIZJ;
                int i6 = this.LJ;
                if (iLJIIJJI > i5 - i6) {
                    throw C1322750kWf.LIZ();
                }
                int i7 = iLJIIJJI + i6;
                this.LJ = i7;
                byte[] bArrCopyOfRange = Arrays.copyOfRange(this.LIZIZ, i6, i7);
                AbstractC1322720kWc abstractC1322720kWc = AbstractC1322720kWc.EMPTY;
                return new C1322680kWY(bArrCopyOfRange);
            }

            @Override // X.AbstractC1317820kOi
            public final int LIZJ() {
                return LJIIJ();
            }

            @Override // X.AbstractC1317820kOi
            public final float LIZLLL() {
                return Float.intBitsToFloat(LJIIJ());
            }

            @Override // X.AbstractC1317820kOi
            public final int LJ() {
                return LJIIJJI();
            }

            @Override // X.AbstractC1317820kOi
            public final long LJFF() {
                return LJIIL();
            }

            @Override // X.AbstractC1317820kOi
            public final int LJII() {
                return LJIIJJI();
            }

            @Override // X.AbstractC1317820kOi
            public final long LJIIIIZZ() {
                return LJIIL();
            }

            public final void LJIIIZ(int i3) {
                if (i3 >= 0) {
                    int i4 = this.LJ;
                    int i5 = this.LJFF;
                    int i6 = i3 + (i4 - i5);
                    if (i6 >= 0) {
                        if (i6 <= this.LJI) {
                            this.LJI = i6;
                            int i7 = this.LIZJ + this.LIZLLL;
                            this.LIZJ = i7;
                            int i8 = i7 - i5;
                            if (i8 > i6) {
                                int i9 = i8 - i6;
                                this.LIZLLL = i9;
                                this.LIZJ = i7 - i9;
                                return;
                            }
                            this.LIZLLL = 0;
                            return;
                        }
                        throw C1322750kWf.LIZ();
                    }
                    throw new C1322750kWf("Failed to parse the message.");
                }
                throw new C1322750kWf("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }

            {
                this.LIZIZ = bArr;
                this.LIZJ = i2 + i;
                this.LJ = i;
                this.LJFF = i;
            }
        };
        try {
            r0.LJIIIZ(i2);
            return r0;
        } catch (C1322750kWf e) {
            TryCatchGuardChecker.doCheck(e);
            throw new IllegalArgumentException(e);
        }
    }
}
