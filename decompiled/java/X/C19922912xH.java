package X;

import java.io.InputStream;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.12xH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19922912xH extends AbstractC19922812xG {
    public static final int[] LLIZLLLIL = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368, 75025, 121393, 196418, 317811, 514229, 832040, 1346269, 2178309, 3524578, 5702887, 9227465, 14930352, 24157817, 39088169, 63245986, 102334155, 165580141, 267914296, 433494437, 701408733, 1134903170, 1836311903, Integer.MAX_VALUE};
    public static final long serialVersionUID = 1;
    public final int LLILLL;
    public final AbstractC19922812xG LLILZ;
    public final AbstractC19922812xG LLILZIL;
    public final int LLILZLL;
    public final int LLIZ;

    public /* synthetic */ C19922912xH() {
        throw null;
    }

    @Override // X.AbstractC19922812xG
    public final boolean LJIIL() {
        return this.LLILLL >= LJIJI(this.LLIZ);
    }

    @Override // X.AbstractC19922812xG
    public final List<ByteBuffer> asReadOnlyByteBufferList() {
        ArrayList arrayList = new ArrayList();
        C19923112xJ c19923112xJ = new C19923112xJ(this);
        while (c19923112xJ.hasNext()) {
            arrayList.add(c19923112xJ.next().asReadOnlyByteBuffer());
        }
        return arrayList;
    }

    @Override // X.AbstractC19922812xG
    public final boolean isValidUtf8() {
        int iLJIILJJIL = this.LLILZ.LJIILJJIL(0, 0, this.LLILZLL);
        AbstractC19922812xG abstractC19922812xG = this.LLILZIL;
        return abstractC19922812xG.LJIILJJIL(iLJIILJJIL, 0, abstractC19922812xG.size()) == 0;
    }

    @Override // X.AbstractC19922812xG, java.lang.Iterable
    /* JADX INFO: renamed from: iterator */
    public final Iterator<Byte> iterator2() {
        return new C19923312xL(this);
    }

    @Override // X.AbstractC19922812xG
    public final InputStream newInput() {
        return new InputStream() { // from class: X.12xK
            public C19923112xJ LL;
            public AbstractC19923712xP LLILLJJLI;
            public int LLILLL;
            public int LLILZ;
            public int LLILZIL;
            public int LLILZLL;

            @Override // java.io.InputStream
            public final boolean markSupported() {
                return true;
            }

            @Override // java.io.InputStream
            public final synchronized void reset() {
                C19923112xJ c19923112xJ = new C19923112xJ(this.LLIZ);
                this.LL = c19923112xJ;
                AbstractC19923712xP next = c19923112xJ.next();
                this.LLILLJJLI = next;
                this.LLILLL = next.size();
                this.LLILZ = 0;
                this.LLILZIL = 0;
                LIZIZ(0, null, this.LLILZLL);
            }

            public final void LIZ() {
                if (this.LLILLJJLI != null) {
                    int i = this.LLILZ;
                    int i2 = this.LLILLL;
                    if (i == i2) {
                        this.LLILZIL += i2;
                        this.LLILZ = 0;
                        if (!this.LL.hasNext()) {
                            this.LLILLJJLI = null;
                            this.LLILLL = 0;
                        } else {
                            AbstractC19923712xP next = this.LL.next();
                            this.LLILLJJLI = next;
                            this.LLILLL = next.size();
                        }
                    }
                }
            }

            @Override // java.io.InputStream
            public final int available() {
                return this.LLIZ.LLILLL - (this.LLILZIL + this.LLILZ);
            }

            @Override // java.io.InputStream
            public final int read() {
                LIZ();
                AbstractC19923712xP abstractC19923712xP = this.LLILLJJLI;
                if (abstractC19923712xP == null) {
                    return -1;
                }
                int i = this.LLILZ;
                this.LLILZ = i + 1;
                return abstractC19923712xP.byteAt(i) & 255;
            }

            {
                C19923112xJ c19923112xJ = new C19923112xJ(this.LLIZ);
                this.LL = c19923112xJ;
                AbstractC19923712xP next = c19923112xJ.next();
                this.LLILLJJLI = next;
                this.LLILLL = next.size();
                this.LLILZ = 0;
                this.LLILZIL = 0;
            }

            @Override // java.io.InputStream
            public final void mark(int i) {
                this.LLILZLL = this.LLILZIL + this.LLILZ;
            }

            @Override // java.io.InputStream
            public final long skip(long j) {
                if (j >= 0) {
                    if (j > 2147483647L) {
                        j = 2147483647L;
                    }
                    return LIZIZ(0, null, (int) j);
                }
                throw new IndexOutOfBoundsException();
            }

            public final int LIZIZ(int i, byte[] bArr, int i2) {
                int i3 = i2;
                while (i3 > 0) {
                    LIZ();
                    if (this.LLILLJJLI == null) {
                        break;
                    }
                    int iMin = Math.min(this.LLILLL - this.LLILZ, i3);
                    if (bArr != null) {
                        this.LLILLJJLI.copyTo(bArr, this.LLILZ, i, iMin);
                        i += iMin;
                    }
                    this.LLILZ += iMin;
                    i3 -= iMin;
                }
                return i2 - i3;
            }

            @Override // java.io.InputStream
            public final int read(byte[] bArr, int i, int i2) {
                bArr.getClass();
                if (i >= 0 && i2 >= 0 && i2 <= bArr.length - i) {
                    int iLIZIZ = LIZIZ(i, bArr, i2);
                    if (iLIZIZ == 0) {
                        if (i2 <= 0) {
                            if (this.LLIZ.LLILLL - (this.LLILZIL + this.LLILZ) != 0) {
                                return iLIZIZ;
                            }
                        }
                        return -1;
                    }
                    return iLIZIZ;
                }
                throw new IndexOutOfBoundsException();
            }
        };
    }

    @Override // X.AbstractC19922812xG
    public final ByteBuffer asReadOnlyByteBuffer() {
        return ByteBuffer.wrap(toByteArray()).asReadOnlyBuffer();
    }

    @Override // X.AbstractC19922812xG
    public final AbstractC19927312xz newCodedInput() {
        final List<ByteBuffer> listAsReadOnlyByteBufferList = asReadOnlyByteBufferList();
        int i = 0;
        final int iRemaining = 0;
        for (ByteBuffer byteBuffer : (ArrayList) listAsReadOnlyByteBufferList) {
            iRemaining += byteBuffer.remaining();
            i = byteBuffer.hasArray() ? i | 1 : byteBuffer.isDirect() ? i | 2 : i | 4;
        }
        return i == 2 ? new AbstractC19927312xz(listAsReadOnlyByteBufferList, iRemaining) { // from class: X.12xv
            public final Iterable<ByteBuffer> LJFF;
            public final Iterator<ByteBuffer> LJI;
            public ByteBuffer LJII;
            public int LJIIIIZZ;
            public int LJIIIZ;
            public int LJIIJJI;
            public long LJIILIIL;
            public long LJIILJJIL;
            public long LJIILL;
            public int LJIIJ = Integer.MAX_VALUE;
            public int LJIIL = 0;

            @Override // X.AbstractC19927312xz
            public final int LJFF() {
                int i2 = this.LJIIJ;
                if (i2 == Integer.MAX_VALUE) {
                    return -1;
                }
                return i2 - LJI();
            }

            @Override // X.AbstractC19927312xz
            public final int LJI() {
                return (int) ((((long) this.LJIIL) + this.LJIILIIL) - this.LJIILJJIL);
            }

            @Override // X.AbstractC19927312xz
            public final boolean LJII() {
                return (((long) this.LJIIL) + this.LJIILIIL) - this.LJIILJJIL == ((long) this.LJIIIIZZ);
            }

            /* JADX WARN: Code restructure failed: missing block: B:19:0x004d, code lost:
            
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
                    long r3 = r10.LJIILIIL
                    long r1 = r10.LJIILL
                    int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                    if (r0 == 0) goto L4f
                    r8 = 1
                    long r6 = r3 + r8
                    byte r3 = X.C19917512wP.LJII(r3)
                    if (r3 < 0) goto L74
                    long r0 = r10.LJIILIIL
                    long r0 = r0 + r8
                    r10.LJIILIIL = r0
                    return r3
                L18:
                    long r4 = r1 + r8
                    byte r1 = X.C19917512wP.LJII(r1)
                    int r0 = r1 << 28
                    r3 = r3 ^ r0
                    r0 = 266354560(0xfe03f80, float:2.2112565E-29)
                    r3 = r3 ^ r0
                    if (r1 >= 0) goto L62
                    long r1 = r4 + r8
                    byte r0 = X.C19917512wP.LJII(r4)
                    if (r0 >= 0) goto L8c
                    long r4 = r1 + r8
                    byte r0 = X.C19917512wP.LJII(r1)
                    if (r0 >= 0) goto L62
                    long r1 = r4 + r8
                    byte r0 = X.C19917512wP.LJII(r4)
                    if (r0 >= 0) goto L8c
                    long r4 = r1 + r8
                    byte r0 = X.C19917512wP.LJII(r1)
                    if (r0 >= 0) goto L62
                    long r1 = r4 + r8
                    byte r0 = X.C19917512wP.LJII(r4)
                    if (r0 >= 0) goto L8c
                L4f:
                    long r1 = r10.LJJJJJ()
                    int r0 = (int) r1
                    return r0
                L55:
                    long r4 = r1 + r8
                    byte r0 = X.C19917512wP.LJII(r1)
                    int r0 = r0 << 14
                    r3 = r3 ^ r0
                    if (r3 < 0) goto L64
                    r3 = r3 ^ 16256(0x3f80, float:2.278E-41)
                L62:
                    r1 = r4
                    goto L8c
                L64:
                    long r1 = r4 + r8
                    byte r0 = X.C19917512wP.LJII(r4)
                    int r0 = r0 << 21
                    r3 = r3 ^ r0
                    if (r3 >= 0) goto L18
                    r0 = -2080896(0xffffffffffe03f80, float:NaN)
                    r3 = r3 ^ r0
                    goto L8c
                L74:
                    long r4 = r10.LJIILL
                    long r0 = r10.LJIILIIL
                    long r4 = r4 - r0
                    r1 = 10
                    int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
                    if (r0 < 0) goto L4f
                    long r1 = r6 + r8
                    byte r0 = X.C19917512wP.LJII(r6)
                    int r0 = r0 << 7
                    r3 = r3 ^ r0
                    if (r3 >= 0) goto L55
                    r3 = r3 ^ (-128(0xffffffffffffff80, float:NaN))
                L8c:
                    r10.LJIILIIL = r1
                    return r3
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C19926912xv.LJJIII():int");
            }

            public final void LJJJ() throws C19926612xs {
                if (!this.LJI.hasNext()) {
                    throw C19926612xs.LJII();
                }
                LJJJJLI();
            }

            public final byte LJJJI() throws C19926612xs {
                if (this.LJIILL - this.LJIILIIL == 0) {
                    LJJJ();
                }
                long j = this.LJIILIIL;
                this.LJIILIIL = 1 + j;
                return C19917512wP.LJII(j);
            }

            public final int LJJJJ() throws C19926612xs {
                int iLJJJI;
                byte bLJJJI;
                long j = this.LJIILL;
                long j2 = this.LJIILIIL;
                if (j - j2 >= 4) {
                    this.LJIILIIL = 4 + j2;
                    iLJJJI = (C19917512wP.LJII(j2) & 255) | ((C19917512wP.LJII(1 + j2) & 255) << 8) | ((C19917512wP.LJII(2 + j2) & 255) << 16);
                    bLJJJI = C19917512wP.LJII(j2 + 3);
                } else {
                    iLJJJI = (LJJJI() & 255) | ((LJJJI() & 255) << 8) | ((LJJJI() & 255) << 16);
                    bLJJJI = LJJJI();
                }
                return iLJJJI | ((bLJJJI & 255) << 24);
            }

            public final long LJJJJI() {
                long j = this.LJIILL;
                long j2 = this.LJIILIIL;
                if (j - j2 < 8) {
                    return ((((long) LJJJI()) & 255) << 56) | (((long) LJJJI()) & 255) | ((((long) LJJJI()) & 255) << 8) | ((((long) LJJJI()) & 255) << 16) | ((((long) LJJJI()) & 255) << 24) | ((((long) LJJJI()) & 255) << 32) | ((((long) LJJJI()) & 255) << 40) | ((((long) LJJJI()) & 255) << 48);
                }
                this.LJIILIIL = 8 + j2;
                return ((((long) C19917512wP.LJII(j2 + 7)) & 255) << 56) | (((long) C19917512wP.LJII(j2)) & 255) | ((((long) C19917512wP.LJII(1 + j2)) & 255) << 8) | ((((long) C19917512wP.LJII(2 + j2)) & 255) << 16) | ((((long) C19917512wP.LJII(3 + j2)) & 255) << 24) | ((((long) C19917512wP.LJII(4 + j2)) & 255) << 32) | ((((long) C19917512wP.LJII(5 + j2)) & 255) << 40) | ((((long) C19917512wP.LJII(6 + j2)) & 255) << 48);
            }

            public final long LJJJJIZL() {
                long jLJII;
                long j;
                long j2;
                int i2;
                long j3 = this.LJIILIIL;
                if (this.LJIILL != j3) {
                    long j4 = j3 + 1;
                    byte bLJII = C19917512wP.LJII(j3);
                    if (bLJII >= 0) {
                        this.LJIILIIL++;
                        return bLJII;
                    }
                    if (this.LJIILL - this.LJIILIIL >= 10) {
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
                                    i2 = iLJII3 ^ (-2080896);
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
                                                    this.LJIILIIL = j5;
                                                    return jLJII;
                                                }
                                                j = -558586000294016L;
                                            }
                                        }
                                        jLJII = jLJII3 ^ j;
                                        this.LJIILIIL = j5;
                                        return jLJII;
                                    }
                                    j2 = 266354560;
                                    jLJII = jLJII2 ^ j2;
                                }
                            }
                            j5 = j6;
                            this.LJIILIIL = j5;
                            return jLJII;
                        }
                        i2 = iLJII ^ (-128);
                        jLJII = i2;
                        this.LJIILIIL = j5;
                        return jLJII;
                    }
                }
                return LJJJJJ();
            }

            public final long LJJJJJ() throws C19926612xs {
                long j = 0;
                int i2 = 0;
                do {
                    byte bLJJJI = LJJJI();
                    j |= ((long) (bLJJJI & 127)) << i2;
                    if ((bLJJJI & 128) == 0) {
                        return j;
                    }
                    i2 += 7;
                } while (i2 < 64);
                throw C19926612xs.LJ();
            }

            public final int LJJJJJL() {
                return (int) ((((long) (this.LJIIIIZZ - this.LJIIL)) - this.LJIILIIL) + this.LJIILJJIL);
            }

            public final void LJJJJLI() {
                ByteBuffer next = this.LJI.next();
                this.LJII = next;
                this.LJIIL += (int) (this.LJIILIIL - this.LJIILJJIL);
                long jPosition = next.position();
                this.LJIILIIL = jPosition;
                this.LJIILJJIL = jPosition;
                this.LJIILL = this.LJII.limit();
                long jLJIIIZ = C19917512wP.LIZJ.LJIIIZ(C19917512wP.LJI, this.LJII);
                this.LJIILIIL += jLJIIIZ;
                this.LJIILJJIL += jLJIIIZ;
                this.LJIILL += jLJIIIZ;
            }

            @Override // X.AbstractC19927312xz
            public final boolean LJIILIIL() {
                return LJJJJIZL() != 0;
            }

            @Override // X.AbstractC19927312xz
            public final AbstractC19922812xG LJIILJJIL() throws C19926612xs {
                int iLJJIII = LJJIII();
                if (iLJJIII > 0) {
                    long j = iLJJIII;
                    long j2 = this.LJIILL;
                    long j3 = this.LJIILIIL;
                    if (j <= j2 - j3) {
                        byte[] bArr = new byte[iLJJIII];
                        C19917512wP.LJ(bArr, j3, 0L, j);
                        this.LJIILIIL += j;
                        AbstractC19922812xG abstractC19922812xG = AbstractC19922812xG.EMPTY;
                        return new C19922512xD(bArr);
                    }
                    if (iLJJIII <= LJJJJJL()) {
                        byte[] bArr2 = new byte[iLJJIII];
                        LJJJIL(bArr2, iLJJIII);
                        AbstractC19922812xG abstractC19922812xG2 = AbstractC19922812xG.EMPTY;
                        return new C19922512xD(bArr2);
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
                    long j = iLJJIII;
                    long j2 = this.LJIILL;
                    long j3 = this.LJIILIIL;
                    if (j <= j2 - j3) {
                        byte[] bArr = new byte[iLJJIII];
                        C19917512wP.LJ(bArr, j3, 0L, j);
                        String str = new String(bArr, C19922012x8.LIZ);
                        this.LJIILIIL += j;
                        return str;
                    }
                    if (iLJJIII <= LJJJJJL()) {
                        byte[] bArr2 = new byte[iLJJIII];
                        LJJJIL(bArr2, iLJJIII);
                        return new String(bArr2, C19922012x8.LIZ);
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
                if (iLJJIII <= 0) {
                    if (iLJJIII >= 0) {
                    }
                    throw C19926612xs.LJFF();
                }
                long j = iLJJIII;
                long j2 = this.LJIILL;
                long j3 = this.LJIILIIL;
                if (j <= j2 - j3) {
                    String strLIZ = C19920112wp.LIZ(this.LJII, (int) (j3 - this.LJIILJJIL), iLJJIII);
                    this.LJIILIIL += j;
                    return strLIZ;
                }
                if (iLJJIII <= LJJJJJL()) {
                    byte[] bArr = new byte[iLJJIII];
                    LJJJIL(bArr, iLJJIII);
                    return C19920112wp.LIZ.LIZ(0, bArr, iLJJIII);
                }
                if (iLJJIII == 0) {
                    return "";
                }
                if (iLJJIII > 0) {
                    throw C19926612xs.LJII();
                }
                throw C19926612xs.LJFF();
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
                return LJJJJIZL();
            }

            @Override // X.AbstractC19927312xz
            public final void LIZ(int i2) throws C19926612xs {
                if (this.LJIIJJI == i2) {
                } else {
                    throw C19926612xs.LIZ();
                }
            }

            @Override // X.AbstractC19927312xz
            public final void LJIIJJI(int i2) {
                this.LJIIJ = i2;
                int i3 = this.LJIIIIZZ + this.LJIIIZ;
                this.LJIIIIZZ = i3;
                if (i3 > i2) {
                    int i4 = i3 - i2;
                    this.LJIIIZ = i4;
                    this.LJIIIIZZ = i3 - i4;
                    return;
                }
                this.LJIIIZ = 0;
            }

            @Override // X.AbstractC19927312xz
            public final int LJIIL(int i2) throws C19926612xs {
                if (i2 >= 0) {
                    int iLJI = i2 + LJI();
                    int i3 = this.LJIIJ;
                    if (iLJI <= i3) {
                        this.LJIIJ = iLJI;
                        int i4 = this.LJIIIIZZ + this.LJIIIZ;
                        this.LJIIIIZZ = i4;
                        if (i4 > iLJI) {
                            int i5 = i4 - iLJI;
                            this.LJIIIZ = i5;
                            this.LJIIIIZZ = i4 - i5;
                            return i3;
                        }
                        this.LJIIIZ = 0;
                        return i3;
                    }
                    throw C19926612xs.LJII();
                }
                throw C19926612xs.LJFF();
            }

            @Override // X.AbstractC19927312xz
            public final byte[] LJJII(int i2) throws C19926612xs {
                if (i2 >= 0) {
                    long j = i2;
                    long j2 = this.LJIILL;
                    long j3 = this.LJIILIIL;
                    if (j <= j2 - j3) {
                        byte[] bArr = new byte[i2];
                        C19917512wP.LJ(bArr, j3, 0L, j);
                        this.LJIILIIL += j;
                        return bArr;
                    }
                    if (i2 <= LJJJJJL()) {
                        byte[] bArr2 = new byte[i2];
                        LJJJIL(bArr2, i2);
                        return bArr2;
                    }
                    if (i2 <= 0) {
                        if (i2 == 0) {
                            return C19922012x8.LIZJ;
                        }
                    } else {
                        throw C19926612xs.LJII();
                    }
                }
                throw C19926612xs.LJFF();
            }

            @Override // X.AbstractC19927312xz
            public final boolean LJJIL(int i2) throws C19926612xs {
                int i3 = i2 & 7;
                int i4 = 0;
                if (i3 != 0) {
                    if (i3 != 1) {
                        if (i3 != 2) {
                            if (i3 != 3) {
                                if (i3 != 4) {
                                    if (i3 == 5) {
                                        LJJJJL(4);
                                        return true;
                                    }
                                    throw C19926612xs.LIZLLL();
                                }
                                LIZJ();
                                return false;
                            }
                            LJJIZ();
                            LIZ(((i2 >>> 3) << 3) | 4);
                            return true;
                        }
                        LJJJJL(LJJIII());
                        return true;
                    }
                    LJJJJL(8);
                    return true;
                }
                while (LJJJI() < 0) {
                    i4++;
                    if (i4 >= 10) {
                        throw C19926612xs.LJ();
                    }
                }
                return true;
            }

            public final void LJJJJL(int i2) throws C19926612xs {
                if (i2 >= 0) {
                    if (i2 > (((long) (this.LJIIIIZZ - this.LJIIL)) - this.LJIILIIL) + this.LJIILJJIL) {
                        throw C19926612xs.LJII();
                    }
                    while (i2 > 0) {
                        if (this.LJIILL - this.LJIILIIL == 0) {
                            LJJJ();
                        }
                        int iMin = Math.min(i2, (int) (this.LJIILL - this.LJIILIIL));
                        i2 -= iMin;
                        this.LJIILIIL += (long) iMin;
                    }
                    return;
                }
                throw C19926612xs.LJFF();
            }

            {
                this.LJIIIIZZ = iRemaining;
                this.LJFF = listAsReadOnlyByteBufferList;
                this.LJI = ((ArrayList) listAsReadOnlyByteBufferList).iterator();
                if (iRemaining == 0) {
                    this.LJII = C19922012x8.LIZLLL;
                    this.LJIILIIL = 0L;
                    this.LJIILJJIL = 0L;
                    this.LJIILL = 0L;
                    return;
                }
                LJJJJLI();
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

            public final void LJJJIL(byte[] bArr, int i2) throws C19926612xs {
                if (i2 >= 0) {
                    if (i2 <= LJJJJJL()) {
                        int i3 = i2;
                        while (i3 > 0) {
                            if (this.LJIILL - this.LJIILIIL == 0) {
                                LJJJ();
                            }
                            int iMin = Math.min(i3, (int) (this.LJIILL - this.LJIILIIL));
                            long j = iMin;
                            C19917512wP.LJ(bArr, this.LJIILIIL, i2 - i3, j);
                            i3 -= iMin;
                            this.LJIILIIL += j;
                        }
                        return;
                    }
                    if (i2 <= 0) {
                        if (i2 == 0) {
                            return;
                        }
                    } else {
                        throw C19926612xs.LJII();
                    }
                }
                throw C19926612xs.LJFF();
            }

            @Override // X.AbstractC19927312xz
            public final void LJIJJ(int i2, InterfaceC19928112y7 interfaceC19928112y7, C19926312xp c19926312xp) {
                LIZIZ();
                this.LIZIZ++;
                interfaceC19928112y7.mergeFrom(this, c19926312xp);
                LIZ((i2 << 3) | 4);
                this.LIZIZ--;
            }
        } : AbstractC19927312xz.LJIIIZ(new InputStream(listAsReadOnlyByteBufferList) { // from class: X.12wt
            public final Iterator<ByteBuffer> LL;
            public ByteBuffer LLILLJJLI;
            public final int LLILLL = 0;
            public int LLILZ;
            public int LLILZIL;
            public boolean LLILZLL;
            public byte[] LLIZ;
            public int LLIZLLLIL;
            public long LLJ;

            public final boolean LIZ() {
                ByteBuffer next;
                do {
                    this.LLILZ++;
                    if (!this.LL.hasNext()) {
                        return false;
                    }
                    next = this.LL.next();
                    this.LLILLJJLI = next;
                } while (!next.hasRemaining());
                this.LLILZIL = this.LLILLJJLI.position();
                if (this.LLILLJJLI.hasArray()) {
                    this.LLILZLL = true;
                    this.LLIZ = this.LLILLJJLI.array();
                    this.LLIZLLLIL = this.LLILLJJLI.arrayOffset();
                    return true;
                }
                this.LLILZLL = false;
                this.LLJ = C19917512wP.LIZJ.LJIIIZ(C19917512wP.LJI, this.LLILLJJLI);
                this.LLIZ = null;
                return true;
            }

            @Override // java.io.InputStream
            public final int read() {
                if (this.LLILZ == this.LLILLL) {
                    return -1;
                }
                if (this.LLILZLL) {
                    int i2 = this.LLIZ[this.LLILZIL + this.LLIZLLLIL] & 255;
                    LIZIZ(1);
                    return i2;
                }
                int iLJII = C19917512wP.LJII(((long) this.LLILZIL) + this.LLJ) & 255;
                LIZIZ(1);
                return iLJII;
            }

            {
                ArrayList arrayList = (ArrayList) listAsReadOnlyByteBufferList;
                this.LL = arrayList.iterator();
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    it2.next();
                    this.LLILLL++;
                }
                this.LLILZ = -1;
                if (!LIZ()) {
                    this.LLILLJJLI = C19922012x8.LIZLLL;
                    this.LLILZ = 0;
                    this.LLILZIL = 0;
                    this.LLJ = 0L;
                }
            }

            public final void LIZIZ(int i2) {
                int i3 = this.LLILZIL + i2;
                this.LLILZIL = i3;
                if (i3 == this.LLILLJJLI.limit()) {
                    LIZ();
                }
            }

            @Override // java.io.InputStream
            public final int read(byte[] bArr, int i2, int i3) {
                if (this.LLILZ == this.LLILLL) {
                    return -1;
                }
                int iLimit = this.LLILLJJLI.limit();
                int i4 = this.LLILZIL;
                int i5 = iLimit - i4;
                if (i3 > i5) {
                    i3 = i5;
                }
                if (this.LLILZLL) {
                    System.arraycopy(this.LLIZ, i4 + this.LLIZLLLIL, bArr, i2, i3);
                    LIZIZ(i3);
                    return i3;
                }
                int iPosition = this.LLILLJJLI.position();
                this.LLILLJJLI.position(this.LLILZIL);
                this.LLILLJJLI.get(bArr, i2, i3);
                this.LLILLJJLI.position(iPosition);
                LIZIZ(i3);
                return i3;
            }
        });
    }

    public Object writeReplace() {
        return new C19922512xD(toByteArray());
    }

    @Override // X.AbstractC19922812xG
    public final int LJIIJ() {
        return this.LLIZ;
    }

    @Override // X.AbstractC19922812xG
    public final int size() {
        return this.LLILLL;
    }

    @Override // X.AbstractC19922812xG, java.lang.Iterable
    /* JADX INFO: renamed from: iterator, reason: avoid collision after fix types in other method */
    public final Iterator<Byte> iterator2() {
        return new C19923312xL(this);
    }

    public static int LJIJI(int i) {
        if (i >= 47) {
            return Integer.MAX_VALUE;
        }
        return LLIZLLLIL[i];
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("RopeByteStream instances are not to be serialized directly");
    }

    @Override // X.AbstractC19922812xG
    public final byte LJIIJJI(int i) {
        int i2 = this.LLILZLL;
        if (i < i2) {
            return this.LLILZ.LJIIJJI(i);
        }
        return this.LLILZIL.LJIIJJI(i - i2);
    }

    @Override // X.AbstractC19922812xG
    public final String LJIIZILJ(Charset charset) {
        return new String(toByteArray(), charset);
    }

    @Override // X.AbstractC19922812xG
    public final void LJIJ(AbstractC19922712xF abstractC19922712xF) {
        this.LLILZ.LJIJ(abstractC19922712xF);
        this.LLILZIL.LJIJ(abstractC19922712xF);
    }

    @Override // X.AbstractC19922812xG
    public final byte byteAt(int i) {
        AbstractC19922812xG.LJ(i, this.LLILLL);
        return LJIIJJI(i);
    }

    @Override // X.AbstractC19922812xG
    public final void copyTo(ByteBuffer byteBuffer) {
        this.LLILZ.copyTo(byteBuffer);
        this.LLILZIL.copyTo(byteBuffer);
    }

    @Override // X.AbstractC19922812xG
    public final boolean equals(Object obj) {
        boolean zLJIJI;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC19922812xG)) {
            return false;
        }
        AbstractC19922812xG abstractC19922812xG = (AbstractC19922812xG) obj;
        if (this.LLILLL != abstractC19922812xG.size()) {
            return false;
        }
        if (this.LLILLL == 0) {
            return true;
        }
        int i = this.hash;
        int i2 = abstractC19922812xG.hash;
        if (i != 0 && i2 != 0 && i != i2) {
            return false;
        }
        C19923112xJ c19923112xJ = new C19923112xJ(this);
        AbstractC19923712xP abstractC19923712xPLIZ = c19923112xJ.next();
        C19923112xJ c19923112xJ2 = new C19923112xJ(abstractC19922812xG);
        AbstractC19923712xP abstractC19923712xPLIZ2 = c19923112xJ2.next();
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            int size = abstractC19923712xPLIZ.size() - i3;
            int size2 = abstractC19923712xPLIZ2.size() - i4;
            int iMin = Math.min(size, size2);
            if (i3 == 0) {
                zLJIJI = abstractC19923712xPLIZ.LJIJI(abstractC19923712xPLIZ2, i4, iMin);
            } else {
                zLJIJI = abstractC19923712xPLIZ2.LJIJI(abstractC19923712xPLIZ, i3, iMin);
            }
            if (!zLJIJI) {
                return false;
            }
            i5 += iMin;
            int i6 = this.LLILLL;
            if (i5 >= i6) {
                if (i5 == i6) {
                    return true;
                }
                throw new IllegalStateException();
            }
            if (iMin == size) {
                i3 = 0;
                abstractC19923712xPLIZ = c19923112xJ.next();
            } else {
                i3 += iMin;
                abstractC19923712xPLIZ = abstractC19923712xPLIZ;
            }
            if (iMin == size2) {
                abstractC19923712xPLIZ2 = c19923112xJ2.next();
                i4 = 0;
            } else {
                i4 += iMin;
            }
        }
    }

    @Override // X.AbstractC19922812xG
    public final void writeTo(OutputStream outputStream) {
        this.LLILZ.writeTo(outputStream);
        this.LLILZIL.writeTo(outputStream);
    }

    public C19922912xH(AbstractC19922812xG abstractC19922812xG, AbstractC19922812xG abstractC19922812xG2) {
        this.LLILZ = abstractC19922812xG;
        this.LLILZIL = abstractC19922812xG2;
        int size = abstractC19922812xG.size();
        this.LLILZLL = size;
        this.LLILLL = size + abstractC19922812xG2.size();
        this.LLIZ = Math.max(abstractC19922812xG.LJIIJ(), abstractC19922812xG2.LJIIJ()) + 1;
    }

    @Override // X.AbstractC19922812xG
    public final AbstractC19922812xG substring(int i, int i2) {
        int iLJFF = AbstractC19922812xG.LJFF(i, i2, this.LLILLL);
        if (iLJFF == 0) {
            return AbstractC19922812xG.EMPTY;
        }
        if (iLJFF == this.LLILLL) {
            return this;
        }
        int i3 = this.LLILZLL;
        if (i2 <= i3) {
            return this.LLILZ.substring(i, i2);
        }
        if (i >= i3) {
            return this.LLILZIL.substring(i - i3, i2 - i3);
        }
        return new C19922912xH(this.LLILZ.substring(i), this.LLILZIL.substring(0, i2 - this.LLILZLL));
    }

    @Override // X.AbstractC19922812xG
    public final int LJIILIIL(int i, int i2, int i3) {
        int i4 = i2 + i3;
        int i5 = this.LLILZLL;
        if (i4 <= i5) {
            return this.LLILZ.LJIILIIL(i, i2, i3);
        }
        if (i2 >= i5) {
            return this.LLILZIL.LJIILIIL(i, i2 - i5, i3);
        }
        int i6 = i5 - i2;
        return this.LLILZIL.LJIILIIL(this.LLILZ.LJIILIIL(i, i2, i6), 0, i3 - i6);
    }

    @Override // X.AbstractC19922812xG
    public final int LJIILJJIL(int i, int i2, int i3) {
        int i4 = i2 + i3;
        int i5 = this.LLILZLL;
        if (i4 <= i5) {
            return this.LLILZ.LJIILJJIL(i, i2, i3);
        }
        if (i2 >= i5) {
            return this.LLILZIL.LJIILJJIL(i, i2 - i5, i3);
        }
        int i6 = i5 - i2;
        return this.LLILZIL.LJIILJJIL(this.LLILZ.LJIILJJIL(i, i2, i6), 0, i3 - i6);
    }

    @Override // X.AbstractC19922812xG
    public final void LJIIIIZZ(int i, byte[] bArr, int i2, int i3) {
        int i4 = i + i3;
        int i5 = this.LLILZLL;
        if (i4 <= i5) {
            this.LLILZ.LJIIIIZZ(i, bArr, i2, i3);
        } else {
            if (i >= i5) {
                this.LLILZIL.LJIIIIZZ(i - i5, bArr, i2, i3);
                return;
            }
            int i6 = i5 - i;
            this.LLILZ.LJIIIIZZ(i, bArr, i2, i6);
            this.LLILZIL.LJIIIIZZ(0, bArr, i2 + i6, i3 - i6);
        }
    }
}
