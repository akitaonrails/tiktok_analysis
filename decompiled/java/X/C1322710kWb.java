package X;

import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.0kWb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1322710kWb extends AbstractC1317820kOi {
    public final InputStream LIZIZ;
    public final byte[] LIZJ;
    public int LIZLLL;
    public int LJ;
    public int LJFF;
    public int LJI;

    @Override // X.AbstractC1317820kOi
    public final int LJI() throws C1322750kWf {
        if (this.LJFF == this.LIZLLL && !LJIILLIIL(1)) {
            return 0;
        }
        int iLJIIJ = LJIIJ();
        if ((iLJIIJ >>> 3) != 0) {
            return iLJIIJ;
        }
        throw new C1322750kWf("Protocol message contained an invalid tag (zero).");
    }

    public final int LJIIIZ() throws C1322750kWf {
        int i = this.LJFF;
        if (this.LIZLLL - i < 4) {
            LJIILJJIL(4);
            i = this.LJFF;
        }
        byte[] bArr = this.LIZJ;
        this.LJFF = i + 4;
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x003a, code lost:
    
        if (r4[r2] < 0) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int LJIIJ() {
        /*
            r5 = this;
            int r0 = r5.LJFF
            int r1 = r5.LIZLLL
            if (r1 == r0) goto L3c
            byte[] r4 = r5.LIZJ
            int r2 = r0 + 1
            r3 = r4[r0]
            if (r3 < 0) goto L5d
            r5.LJFF = r2
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
            long r1 = r5.LJIIL()
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
            r5.LJFF = r1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1322710kWb.LJIIJ():int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002c, code lost:
    
        if (r6[r5] < 0) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long LJIIJJI() {
        /*
            r10 = this;
            int r0 = r10.LJFF
            int r3 = r10.LIZLLL
            if (r3 == r0) goto L2e
            byte[] r6 = r10.LIZJ
            int r1 = r0 + 1
            r2 = r6[r0]
            if (r2 < 0) goto L35
            r10.LJFF = r1
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
            long r0 = r10.LJIIL()
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
            r10.LJFF = r7
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
        throw new UnsupportedOperationException("Method not decompiled: X.C1322710kWb.LJIIJJI():long");
    }

    public final long LJIIL() throws C1322750kWf {
        long j = 0;
        int i = 0;
        do {
            if (this.LJFF == this.LIZLLL) {
                LJIILJJIL(1);
            }
            byte[] bArr = this.LIZJ;
            int i2 = this.LJFF;
            this.LJFF = i2 + 1;
            byte b = bArr[i2];
            j |= ((long) (b & 127)) << i;
            if ((b & 128) == 0) {
                return j;
            }
            i += 7;
        } while (i < 64);
        throw new C1322750kWf("CodedInputStream encountered a malformed varint.");
    }

    public final void LJIILIIL() {
        int i = this.LIZLLL + this.LJ;
        this.LIZLLL = i;
        int i2 = this.LJI + i;
        if (i2 <= Integer.MAX_VALUE) {
            this.LJ = 0;
            return;
        }
        int i3 = i2 - Integer.MAX_VALUE;
        this.LJ = i3;
        this.LIZLLL = i - i3;
    }

    @Override // X.AbstractC1317820kOi
    public final AbstractC1322720kWc LIZIZ() throws IOException {
        int iLJIIJ = LJIIJ();
        int i = this.LIZLLL;
        int i2 = this.LJFF;
        int i3 = i - i2;
        if (iLJIIJ <= i3 && iLJIIJ > 0) {
            AbstractC1322720kWc abstractC1322720kWcCopyFrom = AbstractC1322720kWc.copyFrom(this.LIZJ, i2, iLJIIJ);
            this.LJFF += iLJIIJ;
            return abstractC1322720kWcCopyFrom;
        }
        if (iLJIIJ == 0) {
            return AbstractC1322720kWc.EMPTY;
        }
        if (iLJIIJ < 0) {
            throw new C1322750kWf("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int i4 = this.LJI;
        int i5 = i4 + i2 + iLJIIJ;
        if (i5 - this.LIZ > 0) {
            throw new C1322750kWf("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
        }
        if (i5 > Integer.MAX_VALUE) {
            LJIILL((Integer.MAX_VALUE - i4) - i2);
            throw C1322750kWf.LIZ();
        }
        int i6 = iLJIIJ - i3;
        if (i6 >= 4096) {
            try {
                if (i6 > this.LIZIZ.available()) {
                    int i7 = this.LJFF;
                    int i8 = this.LIZLLL;
                    int length = i8 - i7;
                    this.LJI += i8;
                    this.LJFF = 0;
                    this.LIZLLL = 0;
                    int i9 = iLJIIJ - length;
                    ArrayList<byte[]> arrayList = new ArrayList();
                    while (i9 > 0) {
                        int iMin = Math.min(i9, SpeechEngineDefines.TTS_WORK_MODE_BOTH);
                        byte[] bArr = new byte[iMin];
                        int i10 = 0;
                        while (i10 < iMin) {
                            int i11 = this.LIZIZ.read(bArr, i10, iMin - i10);
                            if (i11 == -1) {
                                throw C1322750kWf.LIZ();
                            }
                            this.LJI += i11;
                            i10 += i11;
                        }
                        i9 -= iMin;
                        arrayList.add(bArr);
                    }
                    byte[] bArr2 = new byte[iLJIIJ];
                    System.arraycopy(this.LIZJ, i7, bArr2, 0, length);
                    for (byte[] bArr3 : arrayList) {
                        System.arraycopy(bArr3, 0, bArr2, length, bArr3.length);
                        length += bArr3.length;
                    }
                    AbstractC1322720kWc abstractC1322720kWc = AbstractC1322720kWc.EMPTY;
                    return new C1322680kWY(bArr2);
                }
            } catch (C1322750kWf e) {
                TryCatchGuardChecker.doCheck(e);
                e.wasThrownFromInputStream = true;
                throw e;
            }
        }
        byte[] bArr4 = new byte[iLJIIJ];
        System.arraycopy(this.LIZJ, this.LJFF, bArr4, 0, i3);
        this.LJI += this.LIZLLL;
        this.LJFF = 0;
        this.LIZLLL = 0;
        while (i3 < iLJIIJ) {
            try {
                int i12 = this.LIZIZ.read(bArr4, i3, iLJIIJ - i3);
                if (i12 == -1) {
                    throw C1322750kWf.LIZ();
                }
                this.LJI += i12;
                i3 += i12;
            } catch (C1322750kWf e2) {
                TryCatchGuardChecker.doCheck(e2);
                e2.wasThrownFromInputStream = true;
                throw e2;
            }
        }
        return AbstractC1322720kWc.copyFrom(bArr4);
    }

    @Override // X.AbstractC1317820kOi
    public final int LIZJ() {
        return LJIIIZ();
    }

    @Override // X.AbstractC1317820kOi
    public final float LIZLLL() {
        return Float.intBitsToFloat(LJIIIZ());
    }

    @Override // X.AbstractC1317820kOi
    public final int LJ() {
        return LJIIJ();
    }

    @Override // X.AbstractC1317820kOi
    public final long LJFF() {
        return LJIIJJI();
    }

    @Override // X.AbstractC1317820kOi
    public final int LJII() {
        return LJIIJ();
    }

    @Override // X.AbstractC1317820kOi
    public final long LJIIIIZZ() {
        return LJIIJJI();
    }

    public C1322710kWb(InputStream inputStream) {
        Charset charset = C1317930kOt.LIZ;
        this.LIZIZ = inputStream;
        this.LIZJ = new byte[SpeechEngineDefines.TTS_WORK_MODE_BOTH];
        this.LIZLLL = 0;
        this.LJFF = 0;
        this.LJI = 0;
    }

    public final void LJIILJJIL(int i) throws C1322750kWf {
        if (!LJIILLIIL(i)) {
            if (i > (this.LIZ - this.LJI) - this.LJFF) {
                throw new C1322750kWf("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
            }
            throw C1322750kWf.LIZ();
        }
    }

    public final void LJIILL(int i) throws C1322750kWf {
        int i2 = this.LIZLLL;
        int i3 = this.LJFF;
        int i4 = i2 - i3;
        if (i <= i4) {
            if (i >= 0) {
                this.LJFF = i3 + i;
                return;
            }
        } else if (i >= 0) {
            int i5 = this.LJI;
            int i6 = i5 + i3;
            if (i6 + i <= Integer.MAX_VALUE) {
                this.LJI = i6;
                this.LIZLLL = 0;
                this.LJFF = 0;
                while (i4 < i) {
                    try {
                        long j = i - i4;
                        try {
                            long jSkip = this.LIZIZ.skip(j);
                            if (jSkip >= 0 && jSkip <= j) {
                                if (jSkip == 0) {
                                    break;
                                } else {
                                    i4 += (int) jSkip;
                                }
                            } else {
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append(this.LIZIZ.getClass());
                                sbLIZ.append("#skip returned invalid result: ");
                                sbLIZ.append(jSkip);
                                sbLIZ.append("\nThe InputStream implementation is buggy.");
                                throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ));
                            }
                        } catch (C1322750kWf e) {
                            TryCatchGuardChecker.doCheck(e);
                            e.wasThrownFromInputStream = true;
                            throw e;
                        }
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        this.LJI += i4;
                        LJIILIIL();
                        throw th;
                    }
                }
                this.LJI += i4;
                LJIILIIL();
                if (i4 >= i) {
                    return;
                }
                int i7 = this.LIZLLL;
                int i8 = i7 - this.LJFF;
                this.LJFF = i7;
                LJIILJJIL(1);
                while (true) {
                    int i9 = i - i8;
                    int i10 = this.LIZLLL;
                    if (i9 > i10) {
                        i8 += i10;
                        this.LJFF = i10;
                        LJIILJJIL(1);
                    } else {
                        this.LJFF = i9;
                        return;
                    }
                }
            } else {
                LJIILL((Integer.MAX_VALUE - i5) - i3);
                throw C1322750kWf.LIZ();
            }
        }
        throw new C1322750kWf("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    public final boolean LJIILLIIL(int i) throws IOException {
        int i2 = this.LJFF;
        int i3 = i2 + i;
        int i4 = this.LIZLLL;
        if (i3 > i4) {
            int i5 = this.LIZ;
            int i6 = this.LJI;
            if (i > (i5 - i6) - i2 || i6 + i2 + i > Integer.MAX_VALUE) {
                return false;
            }
            if (i2 > 0) {
                if (i4 > i2) {
                    byte[] bArr = this.LIZJ;
                    System.arraycopy(bArr, i2, bArr, 0, i4 - i2);
                }
                this.LJI += i2;
                this.LIZLLL -= i2;
                this.LJFF = 0;
            }
            InputStream inputStream = this.LIZIZ;
            byte[] bArr2 = this.LIZJ;
            int i7 = this.LIZLLL;
            try {
                int i8 = inputStream.read(bArr2, i7, Math.min(bArr2.length - i7, (this.LIZ - this.LJI) - i7));
                if (i8 != 0 && i8 >= -1 && i8 <= this.LIZJ.length) {
                    if (i8 <= 0) {
                        return false;
                    }
                    this.LIZLLL += i8;
                    LJIILIIL();
                    if (this.LIZLLL >= i) {
                        return true;
                    }
                    return LJIILLIIL(i);
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(this.LIZIZ.getClass());
                sbLIZ.append("#read(byte[]) returned invalid result: ");
                sbLIZ.append(i8);
                sbLIZ.append("\nThe InputStream implementation is buggy.");
                throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ));
            } catch (C1322750kWf e) {
                TryCatchGuardChecker.doCheck(e);
                e.wasThrownFromInputStream = true;
                throw e;
            }
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("refillBuffer() called when ");
        sbLIZ2.append(i);
        sbLIZ2.append(" bytes were already available in buffer");
        throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ2));
    }
}
