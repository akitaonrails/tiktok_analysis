package X;

import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: X.12xz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public abstract class AbstractC19927312xz {
    public int LIZ;
    public int LIZIZ;
    public final int LIZJ = 100;
    public final int LIZLLL = Integer.MAX_VALUE;
    public C19927412y0 LJ;

    public static int LIZLLL(int i) {
        return (-(i & 1)) ^ (i >>> 1);
    }

    public static long LJ(long j) {
        return (-(j & 1)) ^ (j >>> 1);
    }

    public abstract void LIZ(int i);

    public abstract int LJFF();

    public abstract int LJI();

    public abstract boolean LJII();

    public abstract void LJIIJJI(int i);

    public abstract int LJIIL(int i);

    public abstract boolean LJIILIIL();

    public abstract AbstractC19922812xG LJIILJJIL();

    public abstract double LJIILL();

    public abstract int LJIILLIIL();

    public abstract int LJIIZILJ();

    public abstract long LJIJ();

    public abstract float LJIJI();

    public abstract void LJIJJ(int i, InterfaceC19928112y7 interfaceC19928112y7, C19926312xp c19926312xp);

    public abstract int LJIJJLI();

    public abstract long LJIL();

    public abstract <T extends InterfaceC19925612xi> T LJJ(InterfaceC19925712xj<T> interfaceC19925712xj, C19926312xp c19926312xp);

    public abstract void LJJI(InterfaceC19928112y7 interfaceC19928112y7, C19926312xp c19926312xp);

    public abstract byte[] LJJII(int i);

    public abstract int LJJIII();

    public abstract int LJJIIJZLJL();

    public abstract long LJJIIZ();

    public abstract int LJJIIZI();

    public abstract long LJJIJ();

    public abstract String LJJIJIIJI();

    public abstract String LJJIJIIJIL();

    public abstract int LJJIJIL();

    public abstract int LJJIJL();

    public abstract long LJJIJLIJ();

    public abstract boolean LJJIL(int i);

    public final void LIZIZ() {
        if (this.LIZ + this.LIZIZ >= this.LIZJ) {
            throw new C19926612xs("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
    }

    public final void LIZJ() {
        if (this.LIZIZ == 0) {
            LIZ(0);
        }
    }

    public final void LJJIZ() {
        int iLJJIJIL;
        do {
            iLJJIJIL = LJJIJIL();
            if (iLJJIJIL == 0) {
                return;
            }
            LIZIZ();
            this.LIZIZ++;
            this.LIZIZ--;
        } while (LJJIL(iLJJIJIL));
    }

    public static AbstractC19927312xz LJIIIZ(final InputStream inputStream) {
        if (inputStream == null) {
            byte[] bArr = C19922012x8.LIZJ;
            return LJIIIIZZ(bArr, 0, bArr.length, false);
        }
        return new AbstractC19927312xz(inputStream) { // from class: X.12xw
            public final InputStream LJFF;
            public final byte[] LJI;
            public int LJII;
            public int LJIIIIZZ;
            public int LJIIIZ;
            public int LJIIJ;
            public int LJIIJJI;
            public int LJIIL = Integer.MAX_VALUE;

            @Override // X.AbstractC19927312xz
            public final int LJFF() {
                int i = this.LJIIL;
                if (i == Integer.MAX_VALUE) {
                    return -1;
                }
                return i - (this.LJIIJJI + this.LJIIIZ);
            }

            @Override // X.AbstractC19927312xz
            public final int LJI() {
                return this.LJIIJJI + this.LJIIIZ;
            }

            @Override // X.AbstractC19927312xz
            public final boolean LJII() {
                return this.LJIIIZ == this.LJII && !LJJJJLL(1);
            }

            /* JADX WARN: Code restructure failed: missing block: B:19:0x003a, code lost:
            
                if (r4[r2] < 0) goto L20;
             */
            @Override // X.AbstractC19927312xz
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final int LJJIII() {
                /*
                    r5 = this;
                    int r0 = r5.LJIIIZ
                    int r1 = r5.LJII
                    if (r1 == r0) goto L3c
                    byte[] r4 = r5.LJI
                    int r2 = r0 + 1
                    r3 = r4[r0]
                    if (r3 < 0) goto L5d
                    r5.LJIIIZ = r2
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
                    long r1 = r5.LJJJJJ()
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
                    r5.LJIIIZ = r1
                    return r3
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C19927012xw.LJJIII():int");
            }

            public final int LJJJJ() throws C19926612xs {
                int i = this.LJIIIZ;
                if (this.LJII - i < 4) {
                    LJJJJL(4);
                    i = this.LJIIIZ;
                }
                byte[] bArr2 = this.LJI;
                this.LJIIIZ = i + 4;
                return ((bArr2[i + 3] & 255) << 24) | (bArr2[i] & 255) | ((bArr2[i + 1] & 255) << 8) | ((bArr2[i + 2] & 255) << 16);
            }

            public final long LJJJJI() throws C19926612xs {
                int i = this.LJIIIZ;
                if (this.LJII - i < 8) {
                    LJJJJL(8);
                    i = this.LJIIIZ;
                }
                byte[] bArr2 = this.LJI;
                this.LJIIIZ = i + 8;
                return ((((long) bArr2[i + 7]) & 255) << 56) | (((long) bArr2[i]) & 255) | ((((long) bArr2[i + 1]) & 255) << 8) | ((((long) bArr2[i + 2]) & 255) << 16) | ((((long) bArr2[i + 3]) & 255) << 24) | ((((long) bArr2[i + 4]) & 255) << 32) | ((((long) bArr2[i + 5]) & 255) << 40) | ((((long) bArr2[i + 6]) & 255) << 48);
            }

            /* JADX WARN: Code restructure failed: missing block: B:11:0x002c, code lost:
            
                if (r6[r5] < 0) goto L12;
             */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final long LJJJJIZL() {
                /*
                    r10 = this;
                    int r0 = r10.LJIIIZ
                    int r3 = r10.LJII
                    if (r3 == r0) goto L2e
                    byte[] r6 = r10.LJI
                    int r1 = r0 + 1
                    r2 = r6[r0]
                    if (r2 < 0) goto L35
                    r10.LJIIIZ = r1
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
                    long r0 = r10.LJJJJJ()
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
                    r10.LJIIIZ = r7
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
                throw new UnsupportedOperationException("Method not decompiled: X.C19927012xw.LJJJJIZL():long");
            }

            public final long LJJJJJ() throws C19926612xs {
                long j = 0;
                int i = 0;
                do {
                    if (this.LJIIIZ == this.LJII) {
                        LJJJJL(1);
                    }
                    byte[] bArr2 = this.LJI;
                    int i2 = this.LJIIIZ;
                    this.LJIIIZ = i2 + 1;
                    byte b = bArr2[i2];
                    j |= ((long) (b & 127)) << i;
                    if ((b & 128) == 0) {
                        return j;
                    }
                    i += 7;
                } while (i < 64);
                throw C19926612xs.LJ();
            }

            public final void LJJJJJL() {
                int i = this.LJII + this.LJIIIIZZ;
                this.LJII = i;
                int i2 = this.LJIIJJI + i;
                int i3 = this.LJIIL;
                if (i2 <= i3) {
                    this.LJIIIIZZ = 0;
                    return;
                }
                int i4 = i2 - i3;
                this.LJIIIIZZ = i4;
                this.LJII = i - i4;
            }

            @Override // X.AbstractC19927312xz
            public final boolean LJIILIIL() {
                return LJJJJIZL() != 0;
            }

            @Override // X.AbstractC19927312xz
            public final AbstractC19922812xG LJIILJJIL() throws IOException {
                int iLJJIII = LJJIII();
                int i = this.LJII;
                int i2 = this.LJIIIZ;
                if (iLJJIII <= i - i2 && iLJJIII > 0) {
                    AbstractC19922812xG abstractC19922812xGCopyFrom = AbstractC19922812xG.copyFrom(this.LJI, i2, iLJJIII);
                    this.LJIIIZ += iLJJIII;
                    return abstractC19922812xGCopyFrom;
                }
                if (iLJJIII == 0) {
                    return AbstractC19922812xG.EMPTY;
                }
                if (iLJJIII < 0) {
                    throw C19926612xs.LJFF();
                }
                byte[] bArrLJJJI = LJJJI(iLJJIII);
                if (bArrLJJJI != null) {
                    return AbstractC19922812xG.copyFrom(bArrLJJJI);
                }
                int i3 = this.LJIIIZ;
                int i4 = this.LJII;
                int length = i4 - i3;
                this.LJIIJJI += i4;
                this.LJIIIZ = 0;
                this.LJII = 0;
                List<byte[]> listLJJJIL = LJJJIL(iLJJIII - length);
                byte[] bArr2 = new byte[iLJJIII];
                System.arraycopy(this.LJI, i3, bArr2, 0, length);
                for (byte[] bArr3 : (ArrayList) listLJJJIL) {
                    System.arraycopy(bArr3, 0, bArr2, length, bArr3.length);
                    length += bArr3.length;
                }
                AbstractC19922812xG abstractC19922812xG = AbstractC19922812xG.EMPTY;
                return new C19922512xD(bArr2);
            }

            @Override // X.AbstractC19927312xz
            public final double LJIILL() {
                return Double.longBitsToDouble(LJJJJI());
            }

            @Override // X.AbstractC19927312xz
            public final int LJIILLIIL() {
                return LJJIII();
            }

            @Override // X.AbstractC19927312xz
            public final int LJIIZILJ() {
                return LJJJJ();
            }

            @Override // X.AbstractC19927312xz
            public final long LJIJ() {
                return LJJJJI();
            }

            @Override // X.AbstractC19927312xz
            public final float LJIJI() {
                return Float.intBitsToFloat(LJJJJ());
            }

            @Override // X.AbstractC19927312xz
            public final int LJIJJLI() {
                return LJJIII();
            }

            @Override // X.AbstractC19927312xz
            public final long LJIL() {
                return LJJJJIZL();
            }

            @Override // X.AbstractC19927312xz
            public final int LJJIIJZLJL() {
                return LJJJJ();
            }

            @Override // X.AbstractC19927312xz
            public final long LJJIIZ() {
                return LJJJJI();
            }

            @Override // X.AbstractC19927312xz
            public final int LJJIIZI() {
                return AbstractC19927312xz.LIZLLL(LJJIII());
            }

            @Override // X.AbstractC19927312xz
            public final long LJJIJ() {
                return AbstractC19927312xz.LJ(LJJJJIZL());
            }

            @Override // X.AbstractC19927312xz
            public final String LJJIJIIJI() throws C19926612xs {
                int iLJJIII = LJJIII();
                if (iLJJIII > 0) {
                    int i = this.LJII;
                    int i2 = this.LJIIIZ;
                    if (iLJJIII <= i - i2) {
                        String str = new String(this.LJI, i2, iLJJIII, C19922012x8.LIZ);
                        this.LJIIIZ += iLJJIII;
                        return str;
                    }
                } else {
                    if (iLJJIII == 0) {
                        return "";
                    }
                    if (iLJJIII < 0) {
                        throw C19926612xs.LJFF();
                    }
                }
                if (iLJJIII > this.LJII) {
                    return new String(LJJJ(iLJJIII), C19922012x8.LIZ);
                }
                LJJJJL(iLJJIII);
                String str2 = new String(this.LJI, this.LJIIIZ, iLJJIII, C19922012x8.LIZ);
                this.LJIIIZ += iLJJIII;
                return str2;
            }

            @Override // X.AbstractC19927312xz
            public final String LJJIJIIJIL() throws IOException {
                byte[] bArrLJJJ;
                int iLJJIII = LJJIII();
                int i = this.LJIIIZ;
                int i2 = this.LJII;
                if (iLJJIII <= i2 - i && iLJJIII > 0) {
                    bArrLJJJ = this.LJI;
                    this.LJIIIZ = i + iLJJIII;
                } else {
                    if (iLJJIII == 0) {
                        return "";
                    }
                    if (iLJJIII < 0) {
                        throw C19926612xs.LJFF();
                    }
                    i = 0;
                    if (iLJJIII <= i2) {
                        LJJJJL(iLJJIII);
                        bArrLJJJ = this.LJI;
                        this.LJIIIZ = iLJJIII;
                    } else {
                        bArrLJJJ = LJJJ(iLJJIII);
                    }
                }
                return C19920112wp.LIZ.LIZ(i, bArrLJJJ, iLJJIII);
            }

            @Override // X.AbstractC19927312xz
            public final int LJJIJIL() throws C19926612xs {
                if (LJII()) {
                    this.LJIIJ = 0;
                    return 0;
                }
                int iLJJIII = LJJIII();
                this.LJIIJ = iLJJIII;
                if ((iLJJIII >>> 3) != 0) {
                    return iLJJIII;
                }
                throw C19926612xs.LIZIZ();
            }

            @Override // X.AbstractC19927312xz
            public final int LJJIJL() {
                return LJJIII();
            }

            @Override // X.AbstractC19927312xz
            public final long LJJIJLIJ() {
                return LJJJJIZL();
            }

            {
                C19922012x8.LIZ(inputStream, "input");
                this.LJFF = inputStream;
                this.LJI = new byte[SpeechEngineDefines.TTS_WORK_MODE_BOTH];
                this.LJII = 0;
                this.LJIIIZ = 0;
                this.LJIIJJI = 0;
            }

            @Override // X.AbstractC19927312xz
            public final void LIZ(int i) throws C19926612xs {
                if (this.LJIIJ == i) {
                } else {
                    throw C19926612xs.LIZ();
                }
            }

            @Override // X.AbstractC19927312xz
            public final void LJIIJJI(int i) {
                this.LJIIL = i;
                LJJJJJL();
            }

            @Override // X.AbstractC19927312xz
            public final int LJIIL(int i) throws C19926612xs {
                if (i >= 0) {
                    int i2 = i + this.LJIIJJI + this.LJIIIZ;
                    if (i2 >= 0) {
                        int i3 = this.LJIIL;
                        if (i2 <= i3) {
                            this.LJIIL = i2;
                            LJJJJJL();
                            return i3;
                        }
                        throw C19926612xs.LJII();
                    }
                    throw new C19926612xs("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
                }
                throw C19926612xs.LJFF();
            }

            @Override // X.AbstractC19927312xz
            public final byte[] LJJII(int i) {
                int i2 = this.LJIIIZ;
                if (i <= this.LJII - i2 && i > 0) {
                    int i3 = i + i2;
                    this.LJIIIZ = i3;
                    return Arrays.copyOfRange(this.LJI, i2, i3);
                }
                return LJJJ(i);
            }

            @Override // X.AbstractC19927312xz
            public final boolean LJJIL(int i) throws C19926612xs {
                int i2 = i & 7;
                int i3 = 0;
                if (i2 != 0) {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            if (i2 != 3) {
                                if (i2 != 4) {
                                    if (i2 == 5) {
                                        LJJJJLI(4);
                                        return true;
                                    }
                                    throw C19926612xs.LIZLLL();
                                }
                                LIZJ();
                                return false;
                            }
                            LJJIZ();
                            LIZ(((i >>> 3) << 3) | 4);
                            return true;
                        }
                        LJJJJLI(LJJIII());
                        return true;
                    }
                    LJJJJLI(8);
                    return true;
                }
                if (this.LJII - this.LJIIIZ >= 10) {
                    do {
                        byte[] bArr2 = this.LJI;
                        int i4 = this.LJIIIZ;
                        this.LJIIIZ = i4 + 1;
                        if (bArr2[i4] < 0) {
                            i3++;
                        }
                    } while (i3 < 10);
                    throw C19926612xs.LJ();
                }
                do {
                    if (this.LJIIIZ == this.LJII) {
                        LJJJJL(1);
                    }
                    byte[] bArr3 = this.LJI;
                    int i5 = this.LJIIIZ;
                    this.LJIIIZ = i5 + 1;
                    if (bArr3[i5] < 0) {
                        i3++;
                    }
                } while (i3 < 10);
                throw C19926612xs.LJ();
                return true;
            }

            public final byte[] LJJJ(int i) throws IOException {
                byte[] bArrLJJJI = LJJJI(i);
                if (bArrLJJJI != null) {
                    return bArrLJJJI;
                }
                int i2 = this.LJIIIZ;
                int i3 = this.LJII;
                int length = i3 - i2;
                this.LJIIJJI += i3;
                this.LJIIIZ = 0;
                this.LJII = 0;
                List<byte[]> listLJJJIL = LJJJIL(i - length);
                byte[] bArr2 = new byte[i];
                System.arraycopy(this.LJI, i2, bArr2, 0, length);
                for (byte[] bArr3 : (ArrayList) listLJJJIL) {
                    System.arraycopy(bArr3, 0, bArr2, length, bArr3.length);
                    length += bArr3.length;
                }
                return bArr2;
            }

            public final byte[] LJJJI(int i) throws IOException {
                if (i == 0) {
                    return C19922012x8.LIZJ;
                }
                if (i >= 0) {
                    int i2 = this.LJIIJJI;
                    int i3 = this.LJIIIZ;
                    int i4 = i2 + i3 + i;
                    if (i4 - this.LIZLLL <= 0) {
                        int i5 = this.LJIIL;
                        if (i4 <= i5) {
                            int i6 = this.LJII - i3;
                            int i7 = i - i6;
                            if (i7 >= 4096) {
                                try {
                                    if (i7 > this.LJFF.available()) {
                                        return null;
                                    }
                                } catch (C19926612xs e) {
                                    TryCatchGuardChecker.doCheck(e);
                                    e.wasThrownFromInputStream = true;
                                    throw e;
                                }
                            }
                            byte[] bArr2 = new byte[i];
                            System.arraycopy(this.LJI, this.LJIIIZ, bArr2, 0, i6);
                            this.LJIIJJI += this.LJII;
                            this.LJIIIZ = 0;
                            this.LJII = 0;
                            while (i6 < i) {
                                try {
                                    int i8 = this.LJFF.read(bArr2, i6, i - i6);
                                    if (i8 != -1) {
                                        this.LJIIJJI += i8;
                                        i6 += i8;
                                    } else {
                                        throw C19926612xs.LJII();
                                    }
                                } catch (C19926612xs e2) {
                                    TryCatchGuardChecker.doCheck(e2);
                                    e2.wasThrownFromInputStream = true;
                                    throw e2;
                                }
                            }
                            return bArr2;
                        }
                        LJJJJLI((i5 - i2) - i3);
                        throw C19926612xs.LJII();
                    }
                    throw new C19926612xs("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
                }
                throw C19926612xs.LJFF();
            }

            public final List<byte[]> LJJJIL(int i) throws IOException {
                ArrayList arrayList = new ArrayList();
                while (i > 0) {
                    int iMin = Math.min(i, SpeechEngineDefines.TTS_WORK_MODE_BOTH);
                    byte[] bArr2 = new byte[iMin];
                    int i2 = 0;
                    while (i2 < iMin) {
                        int i3 = this.LJFF.read(bArr2, i2, iMin - i2);
                        if (i3 != -1) {
                            this.LJIIJJI += i3;
                            i2 += i3;
                        } else {
                            throw C19926612xs.LJII();
                        }
                    }
                    i -= iMin;
                    arrayList.add(bArr2);
                }
                return arrayList;
            }

            public final void LJJJJL(int i) throws C19926612xs {
                if (!LJJJJLL(i)) {
                    if (i > (this.LIZLLL - this.LJIIJJI) - this.LJIIIZ) {
                        throw new C19926612xs("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
                    }
                    throw C19926612xs.LJII();
                }
            }

            public final void LJJJJLI(int i) throws C19926612xs {
                int i2 = this.LJII;
                int i3 = this.LJIIIZ;
                if (i <= i2 - i3) {
                    if (i >= 0) {
                        this.LJIIIZ = i3 + i;
                        return;
                    }
                } else if (i >= 0) {
                    int i4 = this.LJIIJJI;
                    int i5 = i4 + i3;
                    int i6 = i5 + i;
                    int i7 = this.LJIIL;
                    if (i6 <= i7) {
                        this.LJIIJJI = i5;
                        int i8 = i2 - i3;
                        this.LJII = 0;
                        this.LJIIIZ = 0;
                        while (i8 < i) {
                            try {
                                long j = i - i8;
                                try {
                                    long jSkip = this.LJFF.skip(j);
                                    if (jSkip >= 0 && jSkip <= j) {
                                        if (jSkip == 0) {
                                            break;
                                        } else {
                                            i8 += (int) jSkip;
                                        }
                                    } else {
                                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                                        sbLIZ.append(this.LJFF.getClass());
                                        sbLIZ.append("#skip returned invalid result: ");
                                        sbLIZ.append(jSkip);
                                        sbLIZ.append("\nThe InputStream implementation is buggy.");
                                        throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ));
                                    }
                                } catch (C19926612xs e) {
                                    TryCatchGuardChecker.doCheck(e);
                                    e.wasThrownFromInputStream = true;
                                    throw e;
                                }
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                this.LJIIJJI += i8;
                                LJJJJJL();
                                throw th;
                            }
                        }
                        this.LJIIJJI += i8;
                        LJJJJJL();
                        if (i8 >= i) {
                            return;
                        }
                        int i9 = this.LJII;
                        int i10 = i9 - this.LJIIIZ;
                        this.LJIIIZ = i9;
                        LJJJJL(1);
                        while (true) {
                            int i11 = i - i10;
                            int i12 = this.LJII;
                            if (i11 > i12) {
                                i10 += i12;
                                this.LJIIIZ = i12;
                                LJJJJL(1);
                            } else {
                                this.LJIIIZ = i11;
                                return;
                            }
                        }
                    } else {
                        LJJJJLI((i7 - i4) - i3);
                        throw C19926612xs.LJII();
                    }
                }
                throw C19926612xs.LJFF();
            }

            public final boolean LJJJJLL(int i) throws IOException {
                int i2 = this.LJIIIZ;
                int i3 = i2 + i;
                int i4 = this.LJII;
                if (i3 > i4) {
                    int i5 = this.LIZLLL;
                    int i6 = this.LJIIJJI;
                    if (i > (i5 - i6) - i2 || i6 + i2 + i > this.LJIIL) {
                        return false;
                    }
                    if (i2 > 0) {
                        if (i4 > i2) {
                            byte[] bArr2 = this.LJI;
                            System.arraycopy(bArr2, i2, bArr2, 0, i4 - i2);
                        }
                        this.LJIIJJI += i2;
                        this.LJII -= i2;
                        this.LJIIIZ = 0;
                    }
                    InputStream inputStream2 = this.LJFF;
                    byte[] bArr3 = this.LJI;
                    int i7 = this.LJII;
                    try {
                        int i8 = inputStream2.read(bArr3, i7, Math.min(bArr3.length - i7, (this.LIZLLL - this.LJIIJJI) - i7));
                        if (i8 != 0 && i8 >= -1 && i8 <= this.LJI.length) {
                            if (i8 <= 0) {
                                return false;
                            }
                            this.LJII += i8;
                            LJJJJJL();
                            if (this.LJII < i && !LJJJJLL(i)) {
                                return false;
                            }
                            return true;
                        }
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append(this.LJFF.getClass());
                        sbLIZ.append("#read(byte[]) returned invalid result: ");
                        sbLIZ.append(i8);
                        sbLIZ.append("\nThe InputStream implementation is buggy.");
                        throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ));
                    } catch (C19926612xs e) {
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

            @Override // X.AbstractC19927312xz
            public final <T extends InterfaceC19925612xi> T LJJ(InterfaceC19925712xj<T> interfaceC19925712xj, C19926312xp c19926312xp) throws C19926612xs {
                int iLJJIII = LJJIII();
                LIZIZ();
                int iLJIIL = LJIIL(iLJJIII);
                this.LIZ++;
                T tLIZIZ = interfaceC19925712xj.LIZIZ(this, c19926312xp);
                LIZ(0);
                this.LIZ--;
                if (LJFF() == 0) {
                    LJIIJJI(iLJIIL);
                    return tLIZIZ;
                }
                throw C19926612xs.LJII();
            }

            @Override // X.AbstractC19927312xz
            public final void LJJI(InterfaceC19928112y7 interfaceC19928112y7, C19926312xp c19926312xp) throws C19926612xs {
                int iLJJIII = LJJIII();
                LIZIZ();
                int iLJIIL = LJIIL(iLJJIII);
                this.LIZ++;
                interfaceC19928112y7.mergeFrom(this, c19926312xp);
                LIZ(0);
                this.LIZ--;
                if (LJFF() == 0) {
                    LJIIJJI(iLJIIL);
                    return;
                }
                throw C19926612xs.LJII();
            }

            @Override // X.AbstractC19927312xz
            public final void LJIJJ(int i, InterfaceC19928112y7 interfaceC19928112y7, C19926312xp c19926312xp) {
                LIZIZ();
                this.LIZIZ++;
                interfaceC19928112y7.mergeFrom(this, c19926312xp);
                LIZ((i << 3) | 4);
                this.LIZIZ--;
            }
        };
    }

    public static AbstractC19927312xz LJIIJ(final ByteBuffer byteBuffer, final boolean z) {
        if (byteBuffer.hasArray()) {
            return LJIIIIZZ(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining(), z);
        }
        if (byteBuffer.isDirect() && C19917512wP.LIZLLL) {
            return new AbstractC19927312xz(byteBuffer, z) { // from class: X.12xx
                public final ByteBuffer LJFF;
                public final boolean LJI;
                public final long LJII;
                public long LJIIIIZZ;
                public long LJIIIZ;
                public final long LJIIJ;
                public int LJIIJJI;
                public int LJIIL;
                public int LJIILIIL = Integer.MAX_VALUE;

                @Override // X.AbstractC19927312xz
                public final int LJFF() {
                    int i = this.LJIILIIL;
                    if (i == Integer.MAX_VALUE) {
                        return -1;
                    }
                    return i - LJI();
                }

                @Override // X.AbstractC19927312xz
                public final int LJI() {
                    return (int) (this.LJIIIZ - this.LJIIJ);
                }

                @Override // X.AbstractC19927312xz
                public final boolean LJII() {
                    return this.LJIIIZ == this.LJIIIIZZ;
                }

                /* JADX WARN: Code restructure failed: missing block: B:19:0x004a, code lost:
                
                    if (X.C19917512wP.LJII(r4) < 0) goto L20;
                 */
                @Override // X.AbstractC19927312xz
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final int LJJIII() {
                    /*
                        r10 = this;
                        long r6 = r10.LJIIIZ
                        long r1 = r10.LJIIIIZZ
                        int r0 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
                        if (r0 == 0) goto L4c
                        r8 = 1
                        long r4 = r6 + r8
                        byte r3 = X.C19917512wP.LJII(r6)
                        if (r3 < 0) goto L71
                        r10.LJIIIZ = r4
                        return r3
                    L15:
                        long r4 = r1 + r8
                        byte r1 = X.C19917512wP.LJII(r1)
                        int r0 = r1 << 28
                        r3 = r3 ^ r0
                        r0 = 266354560(0xfe03f80, float:2.2112565E-29)
                        r3 = r3 ^ r0
                        if (r1 >= 0) goto L5f
                        long r1 = r4 + r8
                        byte r0 = X.C19917512wP.LJII(r4)
                        if (r0 >= 0) goto L87
                        long r4 = r1 + r8
                        byte r0 = X.C19917512wP.LJII(r1)
                        if (r0 >= 0) goto L5f
                        long r1 = r4 + r8
                        byte r0 = X.C19917512wP.LJII(r4)
                        if (r0 >= 0) goto L87
                        long r4 = r1 + r8
                        byte r0 = X.C19917512wP.LJII(r1)
                        if (r0 >= 0) goto L5f
                        long r1 = r4 + r8
                        byte r0 = X.C19917512wP.LJII(r4)
                        if (r0 >= 0) goto L87
                    L4c:
                        long r1 = r10.LJJJJ()
                        int r0 = (int) r1
                        return r0
                    L52:
                        long r4 = r1 + r8
                        byte r0 = X.C19917512wP.LJII(r1)
                        int r0 = r0 << 14
                        r3 = r3 ^ r0
                        if (r3 < 0) goto L61
                        r3 = r3 ^ 16256(0x3f80, float:2.278E-41)
                    L5f:
                        r1 = r4
                        goto L87
                    L61:
                        long r1 = r4 + r8
                        byte r0 = X.C19917512wP.LJII(r4)
                        int r0 = r0 << 21
                        r3 = r3 ^ r0
                        if (r3 >= 0) goto L15
                        r0 = -2080896(0xffffffffffe03f80, float:NaN)
                        r3 = r3 ^ r0
                        goto L87
                    L71:
                        long r6 = r10.LJIIIIZZ
                        long r6 = r6 - r4
                        r1 = 9
                        int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
                        if (r0 < 0) goto L4c
                        long r1 = r4 + r8
                        byte r0 = X.C19917512wP.LJII(r4)
                        int r0 = r0 << 7
                        r3 = r3 ^ r0
                        if (r3 >= 0) goto L52
                        r3 = r3 ^ (-128(0xffffffffffffff80, float:NaN))
                    L87:
                        r10.LJIIIZ = r1
                        return r3
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C19927112xx.LJJIII():int");
                }

                public final int LJJJ() throws C19926612xs {
                    long j = this.LJIIIZ;
                    if (this.LJIIIIZZ - j < 4) {
                        throw C19926612xs.LJII();
                    }
                    this.LJIIIZ = 4 + j;
                    return ((C19917512wP.LJII(j + 3) & 255) << 24) | (C19917512wP.LJII(j) & 255) | ((C19917512wP.LJII(1 + j) & 255) << 8) | ((C19917512wP.LJII(2 + j) & 255) << 16);
                }

                public final long LJJJI() throws C19926612xs {
                    long j = this.LJIIIZ;
                    if (this.LJIIIIZZ - j < 8) {
                        throw C19926612xs.LJII();
                    }
                    this.LJIIIZ = 8 + j;
                    return ((((long) C19917512wP.LJII(j + 7)) & 255) << 56) | (((long) C19917512wP.LJII(j)) & 255) | ((((long) C19917512wP.LJII(1 + j)) & 255) << 8) | ((((long) C19917512wP.LJII(2 + j)) & 255) << 16) | ((((long) C19917512wP.LJII(3 + j)) & 255) << 24) | ((((long) C19917512wP.LJII(4 + j)) & 255) << 32) | ((((long) C19917512wP.LJII(5 + j)) & 255) << 40) | ((((long) C19917512wP.LJII(6 + j)) & 255) << 48);
                }

                public final long LJJJIL() {
                    long jLJII;
                    long j;
                    long j2;
                    int i;
                    long j3 = this.LJIIIZ;
                    if (this.LJIIIIZZ != j3) {
                        long j4 = j3 + 1;
                        byte bLJII = C19917512wP.LJII(j3);
                        if (bLJII >= 0) {
                            this.LJIIIZ = j4;
                            return bLJII;
                        }
                        if (this.LJIIIIZZ - j4 >= 9) {
                            long j5 = j4 + 1;
                            int iLJII = bLJII ^ (C19917512wP.LJII(j4) << 7);
                            if (iLJII >= 0) {
                                long j6 = j5 + 1;
                                int iLJII2 = iLJII ^ (C19917512wP.LJII(j5) << 14);
                                if (iLJII2 >= 0) {
                                    jLJII = iLJII2 ^ 16256;
                                } else {
                                    j5 = j6 + 1;
                                    int iLJII3 = iLJII2 ^ (C19917512wP.LJII(j6) << 21);
                                    if (iLJII3 < 0) {
                                        i = iLJII3 ^ (-2080896);
                                    } else {
                                        j6 = j5 + 1;
                                        long jLJII2 = ((long) iLJII3) ^ (((long) C19917512wP.LJII(j5)) << 28);
                                        if (jLJII2 < 0) {
                                            j5 = j6 + 1;
                                            long jLJII3 = jLJII2 ^ (((long) C19917512wP.LJII(j6)) << 35);
                                            if (jLJII3 < 0) {
                                                j = -34093383808L;
                                            } else {
                                                j6 = j5 + 1;
                                                jLJII2 = jLJII3 ^ (((long) C19917512wP.LJII(j5)) << 42);
                                                if (jLJII2 >= 0) {
                                                    j2 = 4363953127296L;
                                                } else {
                                                    j5 = j6 + 1;
                                                    jLJII3 = jLJII2 ^ (((long) C19917512wP.LJII(j6)) << 49);
                                                    if (jLJII3 >= 0) {
                                                        j6 = j5 + 1;
                                                        jLJII = (jLJII3 ^ (((long) C19917512wP.LJII(j5)) << 56)) ^ 71499008037633920L;
                                                        if (jLJII < 0) {
                                                            long j7 = 1 + j6;
                                                            if (C19917512wP.LJII(j6) >= 0) {
                                                                j5 = j7;
                                                            }
                                                        }
                                                        this.LJIIIZ = j5;
                                                        return jLJII;
                                                    }
                                                    j = -558586000294016L;
                                                }
                                            }
                                            jLJII = jLJII3 ^ j;
                                            this.LJIIIZ = j5;
                                            return jLJII;
                                        }
                                        j2 = 266354560;
                                        jLJII = jLJII2 ^ j2;
                                    }
                                }
                                j5 = j6;
                                this.LJIIIZ = j5;
                                return jLJII;
                            }
                            i = iLJII ^ (-128);
                            jLJII = i;
                            this.LJIIIZ = j5;
                            return jLJII;
                        }
                    }
                    return LJJJJ();
                }

                public final long LJJJJ() throws C19926612xs {
                    long j = 0;
                    int i = 0;
                    do {
                        long j2 = this.LJIIIZ;
                        if (j2 == this.LJIIIIZZ) {
                            throw C19926612xs.LJII();
                        }
                        this.LJIIIZ = 1 + j2;
                        byte bLJII = C19917512wP.LJII(j2);
                        j |= ((long) (bLJII & 127)) << i;
                        if ((bLJII & 128) == 0) {
                            return j;
                        }
                        i += 7;
                    } while (i < 64);
                    throw C19926612xs.LJ();
                }

                public final void LJJJJI() {
                    long j = this.LJIIIIZZ + ((long) this.LJIIJJI);
                    this.LJIIIIZZ = j;
                    int i = (int) (j - this.LJIIJ);
                    int i2 = this.LJIILIIL;
                    if (i <= i2) {
                        this.LJIIJJI = 0;
                        return;
                    }
                    int i3 = i - i2;
                    this.LJIIJJI = i3;
                    this.LJIIIIZZ = j - ((long) i3);
                }

                public final int LJJJJIZL() {
                    return (int) (this.LJIIIIZZ - this.LJIIIZ);
                }

                @Override // X.AbstractC19927312xz
                public final boolean LJIILIIL() {
                    return LJJJIL() != 0;
                }

                @Override // X.AbstractC19927312xz
                public final AbstractC19922812xG LJIILJJIL() throws C19926612xs {
                    int iLJJIII = LJJIII();
                    if (iLJJIII > 0) {
                        if (iLJJIII <= LJJJJIZL()) {
                            byte[] bArr = new byte[iLJJIII];
                            long j = iLJJIII;
                            C19917512wP.LJ(bArr, this.LJIIIZ, 0L, j);
                            this.LJIIIZ += j;
                            AbstractC19922812xG abstractC19922812xG = AbstractC19922812xG.EMPTY;
                            return new C19922512xD(bArr);
                        }
                    } else {
                        if (iLJJIII == 0) {
                            return AbstractC19922812xG.EMPTY;
                        }
                        if (iLJJIII < 0) {
                            throw C19926612xs.LJFF();
                        }
                    }
                    throw C19926612xs.LJII();
                }

                @Override // X.AbstractC19927312xz
                public final double LJIILL() {
                    return Double.longBitsToDouble(LJJJI());
                }

                @Override // X.AbstractC19927312xz
                public final int LJIILLIIL() {
                    return LJJIII();
                }

                @Override // X.AbstractC19927312xz
                public final int LJIIZILJ() {
                    return LJJJ();
                }

                @Override // X.AbstractC19927312xz
                public final long LJIJ() {
                    return LJJJI();
                }

                @Override // X.AbstractC19927312xz
                public final float LJIJI() {
                    return Float.intBitsToFloat(LJJJ());
                }

                @Override // X.AbstractC19927312xz
                public final int LJIJJLI() {
                    return LJJIII();
                }

                @Override // X.AbstractC19927312xz
                public final long LJIL() {
                    return LJJJIL();
                }

                @Override // X.AbstractC19927312xz
                public final int LJJIIJZLJL() {
                    return LJJJ();
                }

                @Override // X.AbstractC19927312xz
                public final long LJJIIZ() {
                    return LJJJI();
                }

                @Override // X.AbstractC19927312xz
                public final int LJJIIZI() {
                    return AbstractC19927312xz.LIZLLL(LJJIII());
                }

                @Override // X.AbstractC19927312xz
                public final long LJJIJ() {
                    return AbstractC19927312xz.LJ(LJJJIL());
                }

                @Override // X.AbstractC19927312xz
                public final String LJJIJIIJI() throws C19926612xs {
                    int iLJJIII = LJJIII();
                    if (iLJJIII > 0) {
                        if (iLJJIII <= LJJJJIZL()) {
                            byte[] bArr = new byte[iLJJIII];
                            long j = iLJJIII;
                            C19917512wP.LJ(bArr, this.LJIIIZ, 0L, j);
                            String str = new String(bArr, C19922012x8.LIZ);
                            this.LJIIIZ += j;
                            return str;
                        }
                    } else {
                        if (iLJJIII == 0) {
                            return "";
                        }
                        if (iLJJIII < 0) {
                            throw C19926612xs.LJFF();
                        }
                    }
                    throw C19926612xs.LJII();
                }

                @Override // X.AbstractC19927312xz
                public final String LJJIJIIJIL() throws C19926612xs {
                    int iLJJIII = LJJIII();
                    if (iLJJIII > 0) {
                        if (iLJJIII <= LJJJJIZL()) {
                            String strLIZ = C19920112wp.LIZ(this.LJFF, (int) (this.LJIIIZ - this.LJII), iLJJIII);
                            this.LJIIIZ += (long) iLJJIII;
                            return strLIZ;
                        }
                    } else {
                        if (iLJJIII == 0) {
                            return "";
                        }
                        if (iLJJIII <= 0) {
                            throw C19926612xs.LJFF();
                        }
                    }
                    throw C19926612xs.LJII();
                }

                @Override // X.AbstractC19927312xz
                public final int LJJIJIL() throws C19926612xs {
                    if (LJII()) {
                        this.LJIIL = 0;
                        return 0;
                    }
                    int iLJJIII = LJJIII();
                    this.LJIIL = iLJJIII;
                    if ((iLJJIII >>> 3) != 0) {
                        return iLJJIII;
                    }
                    throw C19926612xs.LIZIZ();
                }

                @Override // X.AbstractC19927312xz
                public final int LJJIJL() {
                    return LJJIII();
                }

                @Override // X.AbstractC19927312xz
                public final long LJJIJLIJ() {
                    return LJJJIL();
                }

                @Override // X.AbstractC19927312xz
                public final void LIZ(int i) throws C19926612xs {
                    if (this.LJIIL == i) {
                    } else {
                        throw C19926612xs.LIZ();
                    }
                }

                @Override // X.AbstractC19927312xz
                public final void LJIIJJI(int i) {
                    this.LJIILIIL = i;
                    LJJJJI();
                }

                @Override // X.AbstractC19927312xz
                public final int LJIIL(int i) throws C19926612xs {
                    if (i >= 0) {
                        int iLJI = i + LJI();
                        int i2 = this.LJIILIIL;
                        if (iLJI <= i2) {
                            this.LJIILIIL = iLJI;
                            LJJJJI();
                            return i2;
                        }
                        throw C19926612xs.LJII();
                    }
                    throw C19926612xs.LJFF();
                }

                @Override // X.AbstractC19927312xz
                public final byte[] LJJII(int i) throws C19926612xs {
                    if (i >= 0 && i <= LJJJJIZL()) {
                        byte[] bArr = new byte[i];
                        long j = this.LJIIIZ;
                        long j2 = i;
                        long j3 = j + j2;
                        int iPosition = this.LJFF.position();
                        int iLimit = this.LJFF.limit();
                        ByteBuffer byteBuffer2 = this.LJFF;
                        try {
                            try {
                                byteBuffer2.position((int) (j - this.LJII));
                                byteBuffer2.limit((int) (j3 - this.LJII));
                                ByteBuffer byteBufferSlice = this.LJFF.slice();
                                byteBuffer2.position(iPosition);
                                byteBuffer2.limit(iLimit);
                                byteBufferSlice.get(bArr);
                                this.LJIIIZ += j2;
                                return bArr;
                            } catch (IllegalArgumentException e) {
                                TryCatchGuardChecker.doCheck(e);
                                C19926612xs c19926612xsLJII = C19926612xs.LJII();
                                c19926612xsLJII.initCause(e);
                                throw c19926612xsLJII;
                            }
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            byteBuffer2.position(iPosition);
                            byteBuffer2.limit(iLimit);
                            throw th;
                        }
                    }
                    if (i <= 0) {
                        if (i == 0) {
                            return C19922012x8.LIZJ;
                        }
                        throw C19926612xs.LJFF();
                    }
                    throw C19926612xs.LJII();
                }

                @Override // X.AbstractC19927312xz
                public final boolean LJJIL(int i) throws C19926612xs {
                    int i2 = i & 7;
                    int i3 = 0;
                    if (i2 != 0) {
                        if (i2 != 1) {
                            if (i2 != 2) {
                                if (i2 != 3) {
                                    if (i2 != 4) {
                                        if (i2 == 5) {
                                            LJJJJJ(4);
                                            return true;
                                        }
                                        throw C19926612xs.LIZLLL();
                                    }
                                    LIZJ();
                                    return false;
                                }
                                LJJIZ();
                                LIZ(((i >>> 3) << 3) | 4);
                                return true;
                            }
                            LJJJJJ(LJJIII());
                            return true;
                        }
                        LJJJJJ(8);
                        return true;
                    }
                    if (LJJJJIZL() >= 10) {
                        do {
                            long j = this.LJIIIZ;
                            this.LJIIIZ = j + 1;
                            if (C19917512wP.LJII(j) < 0) {
                                i3++;
                            }
                        } while (i3 < 10);
                        throw C19926612xs.LJ();
                    }
                    do {
                        long j2 = this.LJIIIZ;
                        if (j2 != this.LJIIIIZZ) {
                            this.LJIIIZ = j2 + 1;
                            if (C19917512wP.LJII(j2) < 0) {
                                i3++;
                            }
                        } else {
                            throw C19926612xs.LJII();
                        }
                    } while (i3 < 10);
                    throw C19926612xs.LJ();
                    return true;
                }

                public final void LJJJJJ(int i) throws C19926612xs {
                    if (i >= 0) {
                        if (i <= LJJJJIZL()) {
                            this.LJIIIZ += (long) i;
                            return;
                        }
                        throw C19926612xs.LJII();
                    }
                    throw C19926612xs.LJFF();
                }

                {
                    this.LJFF = byteBuffer.duplicate();
                    long jLJIIIZ = C19917512wP.LIZJ.LJIIIZ(C19917512wP.LJI, byteBuffer);
                    this.LJII = jLJIIIZ;
                    this.LJIIIIZZ = ((long) byteBuffer.limit()) + jLJIIIZ;
                    long jPosition = jLJIIIZ + ((long) byteBuffer.position());
                    this.LJIIIZ = jPosition;
                    this.LJIIJ = jPosition;
                    this.LJI = z;
                }

                @Override // X.AbstractC19927312xz
                public final <T extends InterfaceC19925612xi> T LJJ(InterfaceC19925712xj<T> interfaceC19925712xj, C19926312xp c19926312xp) throws C19926612xs {
                    int iLJJIII = LJJIII();
                    LIZIZ();
                    int iLJIIL = LJIIL(iLJJIII);
                    this.LIZ++;
                    T tLIZIZ = interfaceC19925712xj.LIZIZ(this, c19926312xp);
                    LIZ(0);
                    this.LIZ--;
                    if (LJFF() == 0) {
                        LJIIJJI(iLJIIL);
                        return tLIZIZ;
                    }
                    throw C19926612xs.LJII();
                }

                @Override // X.AbstractC19927312xz
                public final void LJJI(InterfaceC19928112y7 interfaceC19928112y7, C19926312xp c19926312xp) throws C19926612xs {
                    int iLJJIII = LJJIII();
                    LIZIZ();
                    int iLJIIL = LJIIL(iLJJIII);
                    this.LIZ++;
                    interfaceC19928112y7.mergeFrom(this, c19926312xp);
                    LIZ(0);
                    this.LIZ--;
                    if (LJFF() == 0) {
                        LJIIJJI(iLJIIL);
                        return;
                    }
                    throw C19926612xs.LJII();
                }

                @Override // X.AbstractC19927312xz
                public final void LJIJJ(int i, InterfaceC19928112y7 interfaceC19928112y7, C19926312xp c19926312xp) {
                    LIZIZ();
                    this.LIZIZ++;
                    interfaceC19928112y7.mergeFrom(this, c19926312xp);
                    LIZ((i << 3) | 4);
                    this.LIZIZ--;
                }
            };
        }
        int iRemaining = byteBuffer.remaining();
        byte[] bArr = new byte[iRemaining];
        byteBuffer.duplicate().get(bArr);
        return LJIIIIZZ(bArr, 0, iRemaining, true);
    }

    public static int LJJIIJ(InputStream inputStream, int i) throws IOException {
        if ((i & 128) == 0) {
            return i;
        }
        int i2 = i & 127;
        int i3 = 7;
        while (i3 < 32) {
            int i4 = inputStream.read();
            if (i4 != -1) {
                i2 |= (i4 & 127) << i3;
                if ((i4 & 128) == 0) {
                    return i2;
                }
                i3 += 7;
            } else {
                throw C19926612xs.LJII();
            }
        }
        while (i3 < 64) {
            int i5 = inputStream.read();
            if (i5 != -1) {
                if ((i5 & 128) == 0) {
                    return i2;
                }
                i3 += 7;
            } else {
                throw C19926612xs.LJII();
            }
        }
        throw C19926612xs.LJ();
    }

    public final Object LJJIFFI(AnonymousClass1334 anonymousClass1334, EnumC19934712zB enumC19934712zB) {
        switch (AnonymousClass1335.LIZIZ[anonymousClass1334.ordinal()]) {
            case 1:
                return Double.valueOf(LJIILL());
            case 2:
                return Float.valueOf(LJIJI());
            case 3:
                return Long.valueOf(LJIL());
            case 4:
                return Long.valueOf(LJJIJLIJ());
            case 5:
                return Integer.valueOf(LJIJJLI());
            case 6:
                return Long.valueOf(LJIJ());
            case 7:
                return Integer.valueOf(LJIIZILJ());
            case 8:
                return Boolean.valueOf(LJIILIIL());
            case BdTuring.TYPE_ECAF /* 9 */:
                return LJIILJJIL();
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return Integer.valueOf(LJJIJL());
            case BdTuring.TYPE_EMAIL /* 11 */:
                return Integer.valueOf(LJJIIJZLJL());
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return Long.valueOf(LJJIIZ());
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                return Integer.valueOf(LJJIIZI());
            case 14:
                return Long.valueOf(LJJIJ());
            case 15:
                int iOrdinal = enumC19934712zB.ordinal();
                if (iOrdinal != 0) {
                    if (iOrdinal != 1) {
                        if (iOrdinal == 2) {
                            return LJIILJJIL();
                        }
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("Unknown UTF8 validation: ");
                        sbLIZ.append(enumC19934712zB);
                        throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ));
                    }
                    return LJJIJIIJIL();
                }
                return LJJIJIIJI();
            case 16:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle nested groups.");
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle embedded messages.");
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle enums.");
            default:
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("Unknown field type: ");
                sbLIZ2.append(anonymousClass1334);
                throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ2));
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.12xy, X.12xz] */
    public static C19927212xy LJIIIIZZ(byte[] bArr, int i, int i2, boolean z) {
        ?? r0 = new AbstractC19927312xz(bArr, i, i2, z) { // from class: X.12xy
            public final byte[] LJFF;
            public final boolean LJI;
            public int LJII;
            public int LJIIIIZZ;
            public int LJIIIZ;
            public final int LJIIJ;
            public int LJIIJJI;
            public int LJIIL = Integer.MAX_VALUE;

            @Override // X.AbstractC19927312xz
            public final int LJFF() {
                int i3 = this.LJIIL;
                if (i3 == Integer.MAX_VALUE) {
                    return -1;
                }
                return i3 - (this.LJIIIZ - this.LJIIJ);
            }

            @Override // X.AbstractC19927312xz
            public final int LJI() {
                return this.LJIIIZ - this.LJIIJ;
            }

            @Override // X.AbstractC19927312xz
            public final boolean LJII() {
                return this.LJIIIZ == this.LJII;
            }

            /* JADX WARN: Code restructure failed: missing block: B:19:0x003a, code lost:
            
                if (r4[r2] < 0) goto L20;
             */
            @Override // X.AbstractC19927312xz
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final int LJJIII() {
                /*
                    r5 = this;
                    int r0 = r5.LJIIIZ
                    int r1 = r5.LJII
                    if (r1 == r0) goto L3c
                    byte[] r4 = r5.LJFF
                    int r2 = r0 + 1
                    r3 = r4[r0]
                    if (r3 < 0) goto L5d
                    r5.LJIIIZ = r2
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
                    long r1 = r5.LJJJJ()
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
                    r5.LJIIIZ = r1
                    return r3
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C19927212xy.LJJIII():int");
            }

            public final int LJJJ() throws C19926612xs {
                int i3 = this.LJIIIZ;
                if (this.LJII - i3 < 4) {
                    throw C19926612xs.LJII();
                }
                byte[] bArr2 = this.LJFF;
                this.LJIIIZ = i3 + 4;
                return ((bArr2[i3 + 3] & 255) << 24) | (bArr2[i3] & 255) | ((bArr2[i3 + 1] & 255) << 8) | ((bArr2[i3 + 2] & 255) << 16);
            }

            public final long LJJJI() throws C19926612xs {
                int i3 = this.LJIIIZ;
                if (this.LJII - i3 < 8) {
                    throw C19926612xs.LJII();
                }
                byte[] bArr2 = this.LJFF;
                this.LJIIIZ = i3 + 8;
                return ((((long) bArr2[i3 + 7]) & 255) << 56) | (((long) bArr2[i3]) & 255) | ((((long) bArr2[i3 + 1]) & 255) << 8) | ((((long) bArr2[i3 + 2]) & 255) << 16) | ((((long) bArr2[i3 + 3]) & 255) << 24) | ((((long) bArr2[i3 + 4]) & 255) << 32) | ((((long) bArr2[i3 + 5]) & 255) << 40) | ((((long) bArr2[i3 + 6]) & 255) << 48);
            }

            /* JADX WARN: Code restructure failed: missing block: B:11:0x002c, code lost:
            
                if (r6[r5] < 0) goto L12;
             */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final long LJJJIL() {
                /*
                    r10 = this;
                    int r0 = r10.LJIIIZ
                    int r3 = r10.LJII
                    if (r3 == r0) goto L2e
                    byte[] r6 = r10.LJFF
                    int r1 = r0 + 1
                    r2 = r6[r0]
                    if (r2 < 0) goto L35
                    r10.LJIIIZ = r1
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
                    long r0 = r10.LJJJJ()
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
                    r10.LJIIIZ = r7
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
                throw new UnsupportedOperationException("Method not decompiled: X.C19927212xy.LJJJIL():long");
            }

            public final long LJJJJ() throws C19926612xs {
                long j = 0;
                int i3 = 0;
                do {
                    int i4 = this.LJIIIZ;
                    if (i4 == this.LJII) {
                        throw C19926612xs.LJII();
                    }
                    byte[] bArr2 = this.LJFF;
                    this.LJIIIZ = i4 + 1;
                    byte b = bArr2[i4];
                    j |= ((long) (b & 127)) << i3;
                    if ((b & 128) == 0) {
                        return j;
                    }
                    i3 += 7;
                } while (i3 < 64);
                throw C19926612xs.LJ();
            }

            @Override // X.AbstractC19927312xz
            public final boolean LJIILIIL() {
                return LJJJIL() != 0;
            }

            @Override // X.AbstractC19927312xz
            public final AbstractC19922812xG LJIILJJIL() {
                int iLJJIII = LJJIII();
                if (iLJJIII > 0) {
                    int i3 = this.LJII;
                    int i4 = this.LJIIIZ;
                    if (iLJJIII <= i3 - i4) {
                        AbstractC19922812xG abstractC19922812xGCopyFrom = AbstractC19922812xG.copyFrom(this.LJFF, i4, iLJJIII);
                        this.LJIIIZ += iLJJIII;
                        return abstractC19922812xGCopyFrom;
                    }
                } else if (iLJJIII == 0) {
                    return AbstractC19922812xG.EMPTY;
                }
                byte[] bArrLJJII = LJJII(iLJJIII);
                AbstractC19922812xG abstractC19922812xG = AbstractC19922812xG.EMPTY;
                return new C19922512xD(bArrLJJII);
            }

            @Override // X.AbstractC19927312xz
            public final double LJIILL() {
                return Double.longBitsToDouble(LJJJI());
            }

            @Override // X.AbstractC19927312xz
            public final int LJIILLIIL() {
                return LJJIII();
            }

            @Override // X.AbstractC19927312xz
            public final int LJIIZILJ() {
                return LJJJ();
            }

            @Override // X.AbstractC19927312xz
            public final long LJIJ() {
                return LJJJI();
            }

            @Override // X.AbstractC19927312xz
            public final float LJIJI() {
                return Float.intBitsToFloat(LJJJ());
            }

            @Override // X.AbstractC19927312xz
            public final int LJIJJLI() {
                return LJJIII();
            }

            @Override // X.AbstractC19927312xz
            public final long LJIL() {
                return LJJJIL();
            }

            @Override // X.AbstractC19927312xz
            public final int LJJIIJZLJL() {
                return LJJJ();
            }

            @Override // X.AbstractC19927312xz
            public final long LJJIIZ() {
                return LJJJI();
            }

            @Override // X.AbstractC19927312xz
            public final int LJJIIZI() {
                return AbstractC19927312xz.LIZLLL(LJJIII());
            }

            @Override // X.AbstractC19927312xz
            public final long LJJIJ() {
                return AbstractC19927312xz.LJ(LJJJIL());
            }

            @Override // X.AbstractC19927312xz
            public final String LJJIJIIJI() throws C19926612xs {
                int iLJJIII = LJJIII();
                if (iLJJIII > 0) {
                    int i3 = this.LJII;
                    int i4 = this.LJIIIZ;
                    if (iLJJIII <= i3 - i4) {
                        String str = new String(this.LJFF, i4, iLJJIII, C19922012x8.LIZ);
                        this.LJIIIZ += iLJJIII;
                        return str;
                    }
                } else {
                    if (iLJJIII == 0) {
                        return "";
                    }
                    if (iLJJIII < 0) {
                        throw C19926612xs.LJFF();
                    }
                }
                throw C19926612xs.LJII();
            }

            @Override // X.AbstractC19927312xz
            public final String LJJIJIIJIL() throws C19926612xs {
                int iLJJIII = LJJIII();
                if (iLJJIII > 0) {
                    int i3 = this.LJII;
                    int i4 = this.LJIIIZ;
                    if (iLJJIII <= i3 - i4) {
                        String strLIZ = C19920112wp.LIZ.LIZ(i4, this.LJFF, iLJJIII);
                        this.LJIIIZ += iLJJIII;
                        return strLIZ;
                    }
                } else {
                    if (iLJJIII == 0) {
                        return "";
                    }
                    if (iLJJIII <= 0) {
                        throw C19926612xs.LJFF();
                    }
                }
                throw C19926612xs.LJII();
            }

            @Override // X.AbstractC19927312xz
            public final int LJJIJIL() throws C19926612xs {
                if (LJII()) {
                    this.LJIIJJI = 0;
                    return 0;
                }
                int iLJJIII = LJJIII();
                this.LJIIJJI = iLJJIII;
                if ((iLJJIII >>> 3) != 0) {
                    return iLJJIII;
                }
                throw C19926612xs.LIZIZ();
            }

            @Override // X.AbstractC19927312xz
            public final int LJJIJL() {
                return LJJIII();
            }

            @Override // X.AbstractC19927312xz
            public final long LJJIJLIJ() {
                return LJJJIL();
            }

            @Override // X.AbstractC19927312xz
            public final void LIZ(int i3) throws C19926612xs {
                if (this.LJIIJJI == i3) {
                } else {
                    throw C19926612xs.LIZ();
                }
            }

            @Override // X.AbstractC19927312xz
            public final void LJIIJJI(int i3) {
                this.LJIIL = i3;
                int i4 = this.LJII + this.LJIIIIZZ;
                this.LJII = i4;
                int i5 = i4 - this.LJIIJ;
                if (i5 > i3) {
                    int i6 = i5 - i3;
                    this.LJIIIIZZ = i6;
                    this.LJII = i4 - i6;
                    return;
                }
                this.LJIIIIZZ = 0;
            }

            @Override // X.AbstractC19927312xz
            public final int LJIIL(int i3) throws C19926612xs {
                if (i3 >= 0) {
                    int i4 = this.LJIIIZ;
                    int i5 = this.LJIIJ;
                    int i6 = i3 + (i4 - i5);
                    if (i6 >= 0) {
                        int i7 = this.LJIIL;
                        if (i6 <= i7) {
                            this.LJIIL = i6;
                            int i8 = this.LJII + this.LJIIIIZZ;
                            this.LJII = i8;
                            int i9 = i8 - i5;
                            if (i9 > i6) {
                                int i10 = i9 - i6;
                                this.LJIIIIZZ = i10;
                                this.LJII = i8 - i10;
                                return i7;
                            }
                            this.LJIIIIZZ = 0;
                            return i7;
                        }
                        throw C19926612xs.LJII();
                    }
                    throw new C19926612xs("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
                }
                throw C19926612xs.LJFF();
            }

            @Override // X.AbstractC19927312xz
            public final byte[] LJJII(int i3) throws C19926612xs {
                if (i3 > 0) {
                    int i4 = this.LJII;
                    int i5 = this.LJIIIZ;
                    if (i3 <= i4 - i5) {
                        int i6 = i3 + i5;
                        this.LJIIIZ = i6;
                        return Arrays.copyOfRange(this.LJFF, i5, i6);
                    }
                    throw C19926612xs.LJII();
                }
                if (i3 == 0) {
                    return C19922012x8.LIZJ;
                }
                throw C19926612xs.LJFF();
            }

            @Override // X.AbstractC19927312xz
            public final boolean LJJIL(int i3) throws C19926612xs {
                int i4 = i3 & 7;
                int i5 = 0;
                if (i4 != 0) {
                    if (i4 != 1) {
                        if (i4 != 2) {
                            if (i4 != 3) {
                                if (i4 != 4) {
                                    if (i4 == 5) {
                                        LJJJJI(4);
                                        return true;
                                    }
                                    throw C19926612xs.LIZLLL();
                                }
                                LIZJ();
                                return false;
                            }
                            LJJIZ();
                            LIZ(((i3 >>> 3) << 3) | 4);
                            return true;
                        }
                        LJJJJI(LJJIII());
                        return true;
                    }
                    LJJJJI(8);
                    return true;
                }
                if (this.LJII - this.LJIIIZ >= 10) {
                    do {
                        byte[] bArr2 = this.LJFF;
                        int i6 = this.LJIIIZ;
                        this.LJIIIZ = i6 + 1;
                        if (bArr2[i6] < 0) {
                            i5++;
                        }
                    } while (i5 < 10);
                    throw C19926612xs.LJ();
                }
                do {
                    int i7 = this.LJIIIZ;
                    if (i7 != this.LJII) {
                        byte[] bArr3 = this.LJFF;
                        this.LJIIIZ = i7 + 1;
                        if (bArr3[i7] < 0) {
                            i5++;
                        }
                    } else {
                        throw C19926612xs.LJII();
                    }
                } while (i5 < 10);
                throw C19926612xs.LJ();
                return true;
            }

            public final void LJJJJI(int i3) throws C19926612xs {
                if (i3 >= 0) {
                    int i4 = this.LJII;
                    int i5 = this.LJIIIZ;
                    if (i3 <= i4 - i5) {
                        this.LJIIIZ = i5 + i3;
                        return;
                    }
                    throw C19926612xs.LJII();
                }
                throw C19926612xs.LJFF();
            }

            @Override // X.AbstractC19927312xz
            public final <T extends InterfaceC19925612xi> T LJJ(InterfaceC19925712xj<T> interfaceC19925712xj, C19926312xp c19926312xp) throws C19926612xs {
                int iLJJIII = LJJIII();
                LIZIZ();
                int iLJIIL = LJIIL(iLJJIII);
                this.LIZ++;
                T tLIZIZ = interfaceC19925712xj.LIZIZ(this, c19926312xp);
                LIZ(0);
                this.LIZ--;
                if (LJFF() == 0) {
                    LJIIJJI(iLJIIL);
                    return tLIZIZ;
                }
                throw C19926612xs.LJII();
            }

            @Override // X.AbstractC19927312xz
            public final void LJJI(InterfaceC19928112y7 interfaceC19928112y7, C19926312xp c19926312xp) throws C19926612xs {
                int iLJJIII = LJJIII();
                LIZIZ();
                int iLJIIL = LJIIL(iLJJIII);
                this.LIZ++;
                interfaceC19928112y7.mergeFrom(this, c19926312xp);
                LIZ(0);
                this.LIZ--;
                if (LJFF() == 0) {
                    LJIIJJI(iLJIIL);
                    return;
                }
                throw C19926612xs.LJII();
            }

            @Override // X.AbstractC19927312xz
            public final void LJIJJ(int i3, InterfaceC19928112y7 interfaceC19928112y7, C19926312xp c19926312xp) {
                LIZIZ();
                this.LIZIZ++;
                interfaceC19928112y7.mergeFrom(this, c19926312xp);
                LIZ((i3 << 3) | 4);
                this.LIZIZ--;
            }

            {
                this.LJFF = bArr;
                this.LJII = i2 + i;
                this.LJIIIZ = i;
                this.LJIIJ = i;
                this.LJI = z;
            }
        };
        try {
            r0.LJIIL(i2);
            return r0;
        } catch (C19926612xs e) {
            TryCatchGuardChecker.doCheck(e);
            throw new IllegalArgumentException(e);
        }
    }
}
