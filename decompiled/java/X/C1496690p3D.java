package X;

import com.bytedance.speech.speechengine.SpeechEngineDefines;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import okio.ByteString;

/* JADX INFO: renamed from: X.0p3D, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1496690p3D implements InterfaceC1496620p36, InterfaceC1496780p3M, Cloneable, ByteChannel {
    public static final byte[] LLILLL = "0123456789abcdef".getBytes(Charsets.UTF_8);
    public C1496750p3J LL;
    public long LLILLJJLI;

    @Override // X.InterfaceC1496620p36
    public final C1496690p3D LJIIIZ() {
        return this;
    }

    @Override // X.InterfaceC1496780p3M
    public final InterfaceC1496780p3M LJLJLJ() {
        return this;
    }

    @Override // X.InterfaceC1496780p3M
    public final InterfaceC1496780p3M LLFII() {
        return this;
    }

    @Override // X.InterfaceC1496620p36
    public final C1496690p3D buffer() {
        return this;
    }

    @Override // X.InterfaceC842570X3n, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // X.InterfaceC1496780p3M, X.InterfaceC1495590p1R, java.io.Flushable
    public final void flush() {
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return true;
    }

    public final void LIZ() {
        skip(this.LLILLJJLI);
    }

    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C1496690p3D clone() {
        C1496690p3D c1496690p3D = new C1496690p3D();
        if (this.LLILLJJLI == 0) {
            return c1496690p3D;
        }
        C1496750p3J c1496750p3J = this.LL;
        if (c1496750p3J == null) {
            Intrinsics.LJIIL();
        }
        C1496750p3J c1496750p3JLIZJ = c1496750p3J.LIZJ();
        c1496690p3D.LL = c1496750p3JLIZJ;
        c1496750p3JLIZJ.LJI = c1496750p3JLIZJ;
        C1496750p3J c1496750p3J2 = c1496690p3D.LL;
        if (c1496750p3J2 == null) {
            Intrinsics.LJIIL();
        }
        c1496750p3JLIZJ.LJFF = c1496750p3J2.LJI;
        C1496750p3J c1496750p3J3 = this.LL;
        if (c1496750p3J3 == null) {
            Intrinsics.LJIIL();
        }
        for (C1496750p3J c1496750p3J4 = c1496750p3J3.LJFF; c1496750p3J4 != this.LL; c1496750p3J4 = c1496750p3J4.LJFF) {
            C1496750p3J c1496750p3J5 = c1496690p3D.LL;
            if (c1496750p3J5 == null) {
                Intrinsics.LJIIL();
            }
            C1496750p3J c1496750p3J6 = c1496750p3J5.LJI;
            if (c1496750p3J6 == null) {
                Intrinsics.LJIIL();
            }
            if (c1496750p3J4 == null) {
                Intrinsics.LJIIL();
            }
            c1496750p3J6.LIZIZ(c1496750p3J4.LIZJ());
        }
        c1496690p3D.LLILLJJLI = this.LLILLJJLI;
        return c1496690p3D;
    }

    public final long LIZLLL() {
        long j = this.LLILLJJLI;
        if (j == 0) {
            return 0L;
        }
        C1496750p3J c1496750p3J = this.LL;
        if (c1496750p3J == null) {
            Intrinsics.LJIIL();
        }
        C1496750p3J c1496750p3J2 = c1496750p3J.LJI;
        if (c1496750p3J2 == null) {
            Intrinsics.LJIIL();
        }
        int i = c1496750p3J2.LIZJ;
        return (i >= 8192 || !c1496750p3J2.LJ) ? j : j - ((long) (i - c1496750p3J2.LIZIZ));
    }

    public final ByteString LJIJJ() {
        return new ByteString(LJZL());
    }

    @Override // X.InterfaceC1496620p36
    public final InputStream LJJIJIIJIL() {
        return new C842000X1i(this);
    }

    public final String LJJIZ() {
        return LJIJJLI(this.LLILLJJLI, Charsets.UTF_8);
    }

    public final int LJJJ() throws EOFException {
        int i;
        int i2;
        int i3;
        if (this.LLILLJJLI == 0) {
            throw new EOFException();
        }
        byte bLJI = LJI(0L);
        if ((bLJI & 128) == 0) {
            i = bLJI & 127;
            i3 = 0;
            i2 = 1;
        } else if ((bLJI & 224) == 192) {
            i = bLJI & 31;
            i2 = 2;
            i3 = 128;
        } else if ((bLJI & 240) == 224) {
            i = bLJI & 15;
            i2 = 3;
            i3 = SpeechEngineDefines.ASR_WORK_MODE_OFFLINE;
        } else {
            if ((bLJI & 248) != 240) {
                skip(1L);
                return 65533;
            }
            i = bLJI & 7;
            i2 = 4;
            i3 = 65536;
        }
        long j = i2;
        if (this.LLILLJJLI < j) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("size < ");
            sbLIZ.append(i2);
            sbLIZ.append(": ");
            sbLIZ.append(this.LLILLJJLI);
            sbLIZ.append(" (to read code point prefixed 0x");
            sbLIZ.append(Integer.toHexString(bLJI));
            sbLIZ.append(")");
            throw new EOFException(C2188811AlT.LIZIZ(sbLIZ));
        }
        for (int i4 = 1; i4 < i2; i4++) {
            long j2 = i4;
            byte bLJI2 = LJI(j2);
            if ((bLJI2 & 192) != 128) {
                skip(j2);
                return 65533;
            }
            i = (i << 6) | (bLJI2 & 63);
        }
        skip(j);
        if (i > 1114111 || ((55296 <= i && 57343 >= i) || i < i3)) {
            return 65533;
        }
        return i;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0067 A[EDGE_INSN: B:46:0x0067->B:35:0x0067 BREAK  A[LOOP:0: B:5:0x000c->B:48:?], SYNTHETIC] */
    @Override // X.InterfaceC1496620p36
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long LJJJIL() throws java.io.EOFException {
        /*
            r15 = this;
            long r1 = r15.LLILLJJLI
            r13 = 0
            int r0 = (r1 > r13 ? 1 : (r1 == r13 ? 0 : -1))
            if (r0 == 0) goto Lb0
            r7 = 0
            r12 = 0
            r4 = 0
        Lc:
            X.0p3J r8 = r15.LL
            if (r8 != 0) goto L13
            kotlin.jvm.internal.Intrinsics.LJIIL()
        L13:
            byte[] r9 = r8.LIZ
            int r3 = r8.LIZIZ
            int r2 = r8.LIZJ
        L19:
            if (r3 >= r2) goto L56
            r6 = r9[r3]
            r0 = 48
            byte r1 = (byte) r0
            if (r6 < r1) goto L39
            r0 = 57
            byte r0 = (byte) r0
            if (r6 > r0) goto L39
            int r1 = r6 - r1
        L29:
            r10 = -1152921504606846976(0xf000000000000000, double:-3.105036184601418E231)
            long r10 = r10 & r4
            int r0 = (r10 > r13 ? 1 : (r10 == r13 ? 0 : -1))
            if (r0 != 0) goto L71
            r0 = 4
            long r4 = r4 << r0
            long r0 = (long) r1
            long r4 = r4 | r0
            int r3 = r3 + 1
            int r7 = r7 + 1
            goto L19
        L39:
            r0 = 97
            byte r1 = (byte) r0
            if (r6 < r1) goto L48
            r0 = 102(0x66, float:1.43E-43)
            byte r0 = (byte) r0
            if (r6 > r0) goto L48
        L43:
            int r0 = r6 - r1
            int r1 = r0 + 10
            goto L29
        L48:
            r0 = 65
            byte r1 = (byte) r0
            if (r6 < r1) goto L53
            r0 = 70
            byte r0 = (byte) r0
            if (r6 > r0) goto L53
            goto L43
        L53:
            if (r7 == 0) goto L96
            r12 = 1
        L56:
            if (r3 != r2) goto L6e
            X.0p3J r0 = r8.LIZ()
            r15.LL = r0
            X.C1496800p3O.LIZ(r8)
        L61:
            if (r12 != 0) goto L67
            X.0p3J r0 = r15.LL
            if (r0 != 0) goto Lc
        L67:
            long r2 = r15.LLILLJJLI
            long r0 = (long) r7
            long r2 = r2 - r0
            r15.LLILLJJLI = r2
            return r4
        L6e:
            r8.LIZIZ = r3
            goto L61
        L71:
            X.0p3D r3 = new X.0p3D
            r3.<init>()
            r3.LJJLIIJ(r4)
            r3.LJJJZ(r6)
            java.lang.NumberFormatException r2 = new java.lang.NumberFormatException
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "Number too large: "
            r1.append(r0)
            java.lang.String r0 = r3.LJJIZ()
            r1.append(r0)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            r2.<init>(r0)
            throw r2
        L96:
            java.lang.NumberFormatException r2 = new java.lang.NumberFormatException
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "Expected leading [0-9a-fA-F] character but was 0x"
            r1.append(r0)
            java.lang.String r0 = java.lang.Integer.toHexString(r6)
            r1.append(r0)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            r2.<init>(r0)
            throw r2
        Lb0:
            java.io.EOFException r0 = new java.io.EOFException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1496690p3D.LJJJIL():long");
    }

    @Override // X.InterfaceC1496620p36
    public final boolean LJJJJLL() {
        return this.LLILLJJLI == 0;
    }

    @Override // X.InterfaceC1496620p36
    public final String LJZ() {
        long jLJII = LJII(0L, Long.MAX_VALUE, (byte) 10);
        if (jLJII != -1) {
            return LJJJJ(jLJII);
        }
        long j = this.LLILLJJLI;
        if (j != 0) {
            return LJJIIJ(j);
        }
        return null;
    }

    @Override // X.InterfaceC1496620p36
    public final byte[] LJZL() {
        return LJJIJ(this.LLILLJJLI);
    }

    @Override // X.InterfaceC1496780p3M
    public final OutputStream LLIIL() {
        return new C1496790p3N(this);
    }

    public final int hashCode() {
        C1496750p3J c1496750p3J = this.LL;
        if (c1496750p3J == null) {
            return 0;
        }
        int i = 1;
        do {
            int i2 = c1496750p3J.LIZJ;
            for (int i3 = c1496750p3J.LIZIZ; i3 < i2; i3++) {
                i = (i * 31) + c1496750p3J.LIZ[i3];
            }
            c1496750p3J = c1496750p3J.LJFF;
            if (c1496750p3J == null) {
                Intrinsics.LJIIL();
            }
        } while (c1496750p3J != this.LL);
        return i;
    }

    @Override // X.InterfaceC1496620p36
    public final byte readByte() {
        if (this.LLILLJJLI == 0) {
            throw new EOFException();
        }
        C1496750p3J c1496750p3J = this.LL;
        if (c1496750p3J == null) {
            Intrinsics.LJIIL();
        }
        int i = c1496750p3J.LIZIZ;
        int i2 = c1496750p3J.LIZJ;
        int i3 = i + 1;
        byte b = c1496750p3J.LIZ[i];
        this.LLILLJJLI--;
        if (i3 != i2) {
            c1496750p3J.LIZIZ = i3;
            return b;
        }
        this.LL = c1496750p3J.LIZ();
        C1496800p3O.LIZ(c1496750p3J);
        return b;
    }

    @Override // X.InterfaceC1496620p36
    public final int readInt() throws EOFException {
        if (this.LLILLJJLI < 4) {
            throw new EOFException();
        }
        C1496750p3J c1496750p3J = this.LL;
        if (c1496750p3J == null) {
            Intrinsics.LJIIL();
        }
        int i = c1496750p3J.LIZIZ;
        int i2 = c1496750p3J.LIZJ;
        if (i2 - i < 4) {
            return ((readByte() & 255) << 24) | ((readByte() & 255) << 16) | ((readByte() & 255) << 8) | (readByte() & 255);
        }
        byte[] bArr = c1496750p3J.LIZ;
        int i3 = i + 1;
        int i4 = i3 + 1;
        int i5 = ((bArr[i] & 255) << 24) | ((bArr[i3] & 255) << 16);
        int i6 = i4 + 1;
        int i7 = i5 | ((bArr[i4] & 255) << 8);
        int i8 = i6 + 1;
        int i9 = i7 | (bArr[i6] & 255);
        this.LLILLJJLI -= 4;
        if (i8 != i2) {
            c1496750p3J.LIZIZ = i8;
            return i9;
        }
        this.LL = c1496750p3J.LIZ();
        C1496800p3O.LIZ(c1496750p3J);
        return i9;
    }

    @Override // X.InterfaceC1496620p36
    public final long readLong() throws EOFException {
        if (this.LLILLJJLI < 8) {
            throw new EOFException();
        }
        C1496750p3J c1496750p3J = this.LL;
        if (c1496750p3J == null) {
            Intrinsics.LJIIL();
        }
        int i = c1496750p3J.LIZIZ;
        int i2 = c1496750p3J.LIZJ;
        if (i2 - i < 8) {
            return ((((long) readInt()) & 4294967295L) << 32) | (4294967295L & ((long) readInt()));
        }
        byte[] bArr = c1496750p3J.LIZ;
        int i3 = i + 1;
        int i4 = i3 + 1;
        int i5 = i4 + 1;
        int i6 = i5 + 1;
        long j = ((((long) bArr[i]) & 255) << 56) | ((((long) bArr[i3]) & 255) << 48) | ((((long) bArr[i4]) & 255) << 40) | ((((long) bArr[i5]) & 255) << 32);
        int i7 = i6 + 1;
        int i8 = i7 + 1;
        int i9 = i8 + 1;
        long j2 = j | ((((long) bArr[i6]) & 255) << 24) | ((((long) bArr[i7]) & 255) << 16) | ((((long) bArr[i8]) & 255) << 8);
        int i10 = i9 + 1;
        long j3 = j2 | (((long) bArr[i9]) & 255);
        this.LLILLJJLI -= 8;
        if (i10 != i2) {
            c1496750p3J.LIZIZ = i10;
            return j3;
        }
        this.LL = c1496750p3J.LIZ();
        C1496800p3O.LIZ(c1496750p3J);
        return j3;
    }

    @Override // X.InterfaceC1496620p36
    public final short readShort() throws EOFException {
        if (this.LLILLJJLI < 2) {
            throw new EOFException();
        }
        C1496750p3J c1496750p3J = this.LL;
        if (c1496750p3J == null) {
            Intrinsics.LJIIL();
        }
        int i = c1496750p3J.LIZIZ;
        int i2 = c1496750p3J.LIZJ;
        if (i2 - i < 2) {
            return (short) (((readByte() & 255) << 8) | (readByte() & 255));
        }
        byte[] bArr = c1496750p3J.LIZ;
        int i3 = i + 1;
        int i4 = (bArr[i] & 255) << 8;
        int i5 = i3 + 1;
        int i6 = i4 | (bArr[i3] & 255);
        this.LLILLJJLI -= 2;
        if (i5 == i2) {
            this.LL = c1496750p3J.LIZ();
            C1496800p3O.LIZ(c1496750p3J);
        } else {
            c1496750p3J.LIZIZ = i5;
        }
        return (short) i6;
    }

    public final String toString() {
        long j = this.LLILLJJLI;
        if (j <= Integer.MAX_VALUE) {
            final int i = (int) j;
            return (i == 0 ? ByteString.EMPTY : new ByteString(this, i) { // from class: X.0p3P
                public final transient byte[][] LL;
                public final transient int[] LLILLJJLI;

                public final ByteString LJFF() {
                    return new ByteString(toByteArray());
                }

                @Override // okio.ByteString
                public int getSize$jvm() {
                    return this.LLILLJJLI[this.LL.length - 1];
                }

                @Override // okio.ByteString
                public byte[] toByteArray() {
                    int[] iArr = this.LLILLJJLI;
                    byte[][] bArr = this.LL;
                    byte[] bArr2 = new byte[iArr[bArr.length - 1]];
                    int length = bArr.length;
                    int i2 = 0;
                    int i3 = 0;
                    while (i2 < length) {
                        int[] iArr2 = this.LLILLJJLI;
                        int i4 = iArr2[length + i2];
                        int i5 = iArr2[i2];
                        System.arraycopy(this.LL[i2], i4, bArr2, i3, i5 - i3);
                        i2++;
                        i3 = i5;
                    }
                    return bArr2;
                }

                private final Object writeReplace() {
                    return LJFF();
                }

                @Override // okio.ByteString
                public ByteBuffer asByteBuffer() {
                    return ByteBuffer.wrap(toByteArray()).asReadOnlyBuffer();
                }

                @Override // okio.ByteString
                public String base64() {
                    return LJFF().base64();
                }

                @Override // okio.ByteString
                public String base64Url() {
                    return LJFF().base64Url();
                }

                @Override // okio.ByteString
                public int hashCode() {
                    int hashCode$jvm = getHashCode$jvm();
                    if (hashCode$jvm != 0) {
                        return hashCode$jvm;
                    }
                    int length = this.LL.length;
                    int i2 = 0;
                    int i3 = 1;
                    int i4 = 0;
                    while (i2 < length) {
                        byte[] bArr = this.LL[i2];
                        int[] iArr = this.LLILLJJLI;
                        int i5 = iArr[length + i2];
                        int i6 = iArr[i2];
                        int i7 = (i6 - i4) + i5;
                        while (i5 < i7) {
                            i3 = (i3 * 31) + bArr[i5];
                            i5++;
                        }
                        i2++;
                        i4 = i6;
                    }
                    setHashCode$jvm(i3);
                    return i3;
                }

                @Override // okio.ByteString
                public String hex() {
                    return LJFF().hex();
                }

                @Override // okio.ByteString
                public byte[] internalArray$jvm() {
                    return toByteArray();
                }

                @Override // okio.ByteString
                public ByteString md5() {
                    return LJFF().md5();
                }

                @Override // okio.ByteString
                public ByteString sha1() {
                    return LJFF().sha1();
                }

                @Override // okio.ByteString
                public ByteString sha256() {
                    return LJFF().sha256();
                }

                @Override // okio.ByteString
                public ByteString sha512() {
                    return LJFF().sha512();
                }

                @Override // okio.ByteString
                public ByteString toAsciiLowercase() {
                    return LJFF().toAsciiLowercase();
                }

                @Override // okio.ByteString
                public ByteString toAsciiUppercase() {
                    return LJFF().toAsciiUppercase();
                }

                @Override // okio.ByteString
                public String toString() {
                    return LJFF().toString();
                }

                @Override // okio.ByteString
                public String utf8() {
                    return LJFF().utf8();
                }

                public final int[] getDirectory() {
                    return this.LLILLJJLI;
                }

                public final byte[][] getSegments() {
                    return this.LL;
                }

                public final int LIZJ(int i2) {
                    int iBinarySearch = Arrays.binarySearch(this.LLILLJJLI, 0, this.LL.length, i2 + 1);
                    if (iBinarySearch < 0) {
                        return ~iBinarySearch;
                    }
                    return iBinarySearch;
                }

                @Override // okio.ByteString
                public boolean equals(Object obj) {
                    if (obj != this) {
                        if (obj instanceof ByteString) {
                            ByteString byteString = (ByteString) obj;
                            if (byteString.size() != size() || !rangeEquals(0, byteString, 0, size())) {
                                return false;
                            }
                        } else {
                            return false;
                        }
                    }
                    return true;
                }

                @Override // okio.ByteString
                public ByteString hmacSha1(ByteString byteString) {
                    return LJFF().hmacSha1(byteString);
                }

                @Override // okio.ByteString
                public ByteString hmacSha256(ByteString byteString) {
                    return LJFF().hmacSha256(byteString);
                }

                @Override // okio.ByteString
                public ByteString hmacSha512(ByteString byteString) {
                    return LJFF().hmacSha512(byteString);
                }

                @Override // okio.ByteString
                public byte internalGet$jvm(int i2) {
                    int i3;
                    C1496820p3Q.LIZIZ(this.LLILLJJLI[this.LL.length - 1], i2, 1L);
                    int iLIZJ = LIZJ(i2);
                    if (iLIZJ == 0) {
                        i3 = 0;
                    } else {
                        i3 = this.LLILLJJLI[iLIZJ - 1];
                    }
                    int[] iArr = this.LLILLJJLI;
                    byte[][] bArr = this.LL;
                    return bArr[iLIZJ][(i2 - i3) + iArr[bArr.length + iLIZJ]];
                }

                @Override // okio.ByteString
                public String string(Charset charset) {
                    return LJFF().string(charset);
                }

                @Override // okio.ByteString
                public void write(OutputStream outputStream) throws IOException {
                    int length = this.LL.length;
                    int i2 = 0;
                    int i3 = 0;
                    while (i2 < length) {
                        int[] iArr = this.LLILLJJLI;
                        int i4 = iArr[length + i2];
                        int i5 = iArr[i2];
                        outputStream.write(this.LL[i2], i4, i5 - i3);
                        i2++;
                        i3 = i5;
                    }
                }

                @Override // okio.ByteString
                public void write$jvm(C1496690p3D c1496690p3D) {
                    int length = this.LL.length;
                    int i2 = 0;
                    int i3 = 0;
                    while (i2 < length) {
                        int[] iArr = this.LLILLJJLI;
                        int i4 = iArr[length + i2];
                        int i5 = iArr[i2];
                        C1496750p3J c1496750p3J = new C1496750p3J(this.LL[i2], i4, (i4 + i5) - i3, true, false);
                        C1496750p3J c1496750p3J2 = c1496690p3D.LL;
                        if (c1496750p3J2 == null) {
                            c1496750p3J.LJI = c1496750p3J;
                            c1496750p3J.LJFF = c1496750p3J;
                            c1496690p3D.LL = c1496750p3J;
                        } else {
                            C1496750p3J c1496750p3J3 = c1496750p3J2.LJI;
                            if (c1496750p3J3 == null) {
                                Intrinsics.LJIIL();
                            }
                            c1496750p3J3.LIZIZ(c1496750p3J);
                        }
                        i2++;
                        i3 = i5;
                    }
                    c1496690p3D.LLILLJJLI += (long) i3;
                }

                {
                    super(ByteString.EMPTY.getData$jvm());
                    C1496820p3Q.LIZIZ(this.LLILLJJLI, 0L, i);
                    C1496750p3J c1496750p3J = this.LL;
                    int i2 = 0;
                    int i3 = 0;
                    int i4 = 0;
                    while (i3 < i) {
                        if (c1496750p3J == null) {
                            Intrinsics.LJIIL();
                        }
                        int i5 = c1496750p3J.LIZJ;
                        int i6 = c1496750p3J.LIZIZ;
                        if (i5 != i6) {
                            i3 += i5 - i6;
                            i4++;
                            c1496750p3J = c1496750p3J.LJFF;
                        } else {
                            throw new AssertionError("s.limit == s.pos");
                        }
                    }
                    byte[][] bArr = new byte[i4][];
                    this.LLILLJJLI = new int[i4 * 2];
                    C1496750p3J c1496750p3J2 = this.LL;
                    int i7 = 0;
                    while (i2 < i) {
                        if (c1496750p3J2 == null) {
                            Intrinsics.LJIIL();
                        }
                        bArr[i7] = c1496750p3J2.LIZ;
                        int i8 = c1496750p3J2.LIZJ;
                        int i9 = c1496750p3J2.LIZIZ;
                        i2 += i8 - i9;
                        if (i2 > i) {
                            i2 = i;
                        }
                        int[] iArr = this.LLILLJJLI;
                        iArr[i7] = i2;
                        iArr[i7 + i4] = i9;
                        c1496750p3J2.LIZLLL = true;
                        i7++;
                        c1496750p3J2 = c1496750p3J2.LJFF;
                    }
                    this.LL = bArr;
                }

                @Override // okio.ByteString
                public int indexOf(byte[] bArr, int i2) {
                    return LJFF().indexOf(bArr, i2);
                }

                @Override // okio.ByteString
                public int lastIndexOf(byte[] bArr, int i2) {
                    return LJFF().lastIndexOf(bArr, i2);
                }

                @Override // okio.ByteString
                public ByteString substring(int i2, int i3) {
                    return LJFF().substring(i2, i3);
                }

                @Override // okio.ByteString
                public boolean rangeEquals(int i2, byte[] bArr, int i3, int i4) {
                    int i5;
                    if (i2 < 0 || i2 > size() - i4 || i3 < 0 || i3 > bArr.length - i4) {
                        return false;
                    }
                    int iLIZJ = LIZJ(i2);
                    while (i4 > 0) {
                        if (iLIZJ == 0) {
                            i5 = 0;
                        } else {
                            i5 = this.LLILLJJLI[iLIZJ - 1];
                        }
                        int iMin = Math.min(i4, ((this.LLILLJJLI[iLIZJ] - i5) + i5) - i2);
                        int[] iArr = this.LLILLJJLI;
                        byte[][] bArr2 = this.LL;
                        if (!C1496820p3Q.LIZ(bArr2[iLIZJ], (i2 - i5) + iArr[bArr2.length + iLIZJ], i3, bArr, iMin)) {
                            return false;
                        }
                        i2 += iMin;
                        i3 += iMin;
                        i4 -= iMin;
                        iLIZJ++;
                    }
                    return true;
                }

                @Override // okio.ByteString
                public boolean rangeEquals(int i2, ByteString byteString, int i3, int i4) {
                    int i5;
                    if (i2 < 0 || i2 > size() - i4) {
                        return false;
                    }
                    int iLIZJ = LIZJ(i2);
                    while (i4 > 0) {
                        if (iLIZJ == 0) {
                            i5 = 0;
                        } else {
                            i5 = this.LLILLJJLI[iLIZJ - 1];
                        }
                        int iMin = Math.min(i4, ((this.LLILLJJLI[iLIZJ] - i5) + i5) - i2);
                        int[] iArr = this.LLILLJJLI;
                        byte[][] bArr = this.LL;
                        if (!byteString.rangeEquals(i3, bArr[iLIZJ], (i2 - i5) + iArr[bArr.length + iLIZJ], iMin)) {
                            return false;
                        }
                        i2 += iMin;
                        i3 += iMin;
                        i4 -= iMin;
                        iLIZJ++;
                    }
                    return true;
                }
            }).toString();
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("size > Integer.MAX_VALUE: ");
        sbLIZ.append(this.LLILLJJLI);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        strLIZIZ.toString();
        throw new IllegalStateException(strLIZIZ);
    }

    @Override // X.InterfaceC1496620p36
    public final long LJIIJ() {
        return C1496820p3Q.LIZJ(readLong());
    }

    @Override // X.InterfaceC1496620p36
    public final int LJJIFFI() throws EOFException {
        int i = readInt();
        return ((i & 255) << 24) | (((-16777216) & i) >>> 24) | ((16711680 & i) >>> 8) | ((65280 & i) << 8);
    }

    @Override // X.InterfaceC1496620p36
    public final String LJLLJ() {
        return LJLJLLL(Long.MAX_VALUE);
    }

    @Override // X.InterfaceC842570X3n
    public final C1496250p2V timeout() {
        return C1496250p2V.LIZLLL;
    }

    public final byte LJI(long j) {
        C1496820p3Q.LIZIZ(this.LLILLJJLI, j, 1L);
        C1496750p3J c1496750p3J = this.LL;
        if (c1496750p3J != null) {
            long j2 = this.LLILLJJLI;
            if (j2 - j >= j) {
                long j3 = 0;
                while (true) {
                    int i = c1496750p3J.LIZJ;
                    int i2 = c1496750p3J.LIZIZ;
                    long j4 = ((long) (i - i2)) + j3;
                    if (j4 > j) {
                        return c1496750p3J.LIZ[(int) ((((long) i2) + j) - j3)];
                    }
                    c1496750p3J = c1496750p3J.LJFF;
                    if (c1496750p3J == null) {
                        Intrinsics.LJIIL();
                    }
                    j3 = j4;
                }
            } else {
                while (j2 > j) {
                    c1496750p3J = c1496750p3J.LJI;
                    if (c1496750p3J == null) {
                        Intrinsics.LJIIL();
                    }
                    j2 -= (long) (c1496750p3J.LIZJ - c1496750p3J.LIZIZ);
                }
                return c1496750p3J.LIZ[(int) ((((long) c1496750p3J.LIZIZ) + j) - j2)];
            }
        } else {
            Intrinsics.LJIIL();
            throw null;
        }
    }

    public final void LJIILLIIL(C1496760p3K c1496760p3K) {
        if (c1496760p3K.LL == null) {
            c1496760p3K.LL = this;
            c1496760p3K.LLILLJJLI = true;
        } else {
            "already attached to a buffer".toString();
            throw new IllegalStateException("already attached to a buffer");
        }
    }

    @Override // X.InterfaceC1496620p36
    public final String LJJIIJ(long j) {
        return LJIJJLI(j, Charsets.UTF_8);
    }

    @Override // X.InterfaceC1496620p36
    public final byte[] LJJIJ(long j) throws EOFException {
        if (j >= 0 && j <= Integer.MAX_VALUE) {
            if (this.LLILLJJLI >= j) {
                byte[] bArr = new byte[(int) j];
                readFully(bArr);
                return bArr;
            }
            throw new EOFException();
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("byteCount: ");
        sbLIZ.append(j);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        strLIZIZ.toString();
        throw new IllegalArgumentException(strLIZIZ);
    }

    @Override // X.InterfaceC1496780p3M
    public final /* bridge */ /* synthetic */ InterfaceC1496780p3M LJJIJLIJ(long j) {
        LJJLIIIJL(j);
        return this;
    }

    @Override // X.InterfaceC1496780p3M
    public final InterfaceC1496780p3M LJJJI(ByteString byteString) {
        byteString.write$jvm(this);
        return this;
    }

    public final String LJJJJ(long j) throws EOFException {
        if (j > 0) {
            long j2 = j - 1;
            if (LJI(j2) == ((byte) 13)) {
                String strLJJIIJ = LJJIIJ(j2);
                skip(2L);
                return strLJJIIJ;
            }
        }
        String strLJJIIJ2 = LJJIIJ(j);
        skip(1L);
        return strLJJIIJ2;
    }

    public final C1496750p3J LJJJJJL(int i) {
        if (i >= 1 && i <= 8192) {
            C1496750p3J c1496750p3J = this.LL;
            if (c1496750p3J == null) {
                C1496750p3J c1496750p3JLIZIZ = C1496800p3O.LIZIZ();
                this.LL = c1496750p3JLIZIZ;
                c1496750p3JLIZIZ.LJI = c1496750p3JLIZIZ;
                c1496750p3JLIZIZ.LJFF = c1496750p3JLIZIZ;
                return c1496750p3JLIZIZ;
            }
            C1496750p3J c1496750p3J2 = c1496750p3J.LJI;
            if (c1496750p3J2 == null) {
                Intrinsics.LJIIL();
            }
            if (c1496750p3J2.LIZJ + i > 8192 || !c1496750p3J2.LJ) {
                C1496750p3J c1496750p3JLIZIZ2 = C1496800p3O.LIZIZ();
                c1496750p3J2.LIZIZ(c1496750p3JLIZIZ2);
                return c1496750p3JLIZIZ2;
            }
            return c1496750p3J2;
        }
        "unexpected capacity".toString();
        throw new IllegalArgumentException("unexpected capacity");
    }

    @Override // X.InterfaceC1496620p36
    public final long LJJJJL(InterfaceC1495590p1R interfaceC1495590p1R) {
        long j = this.LLILLJJLI;
        if (j > 0) {
            ((C1496690p3D) interfaceC1495590p1R).LLFF(this, j);
        }
        return j;
    }

    @Override // X.InterfaceC1496620p36
    public final int LJJJJZ(C1496870p3V c1496870p3V) throws EOFException {
        int iLJJJJJ = LJJJJJ(c1496870p3V, false);
        if (iLJJJJJ == -1) {
            return -1;
        }
        skip(c1496870p3V.LL[iLJJJJJ].size());
        return iLJJJJJ;
    }

    public final void LJJJZ(int i) {
        C1496750p3J c1496750p3JLJJJJJL = LJJJJJL(1);
        byte[] bArr = c1496750p3JLJJJJJL.LIZ;
        int i2 = c1496750p3JLJJJJJL.LIZJ;
        c1496750p3JLJJJJJL.LIZJ = i2 + 1;
        bArr[i2] = (byte) i;
        this.LLILLJJLI++;
    }

    @Override // X.InterfaceC1496620p36
    public final String LJJLIIIJILLIZJL(Charset charset) {
        return LJIJJLI(this.LLILLJJLI, charset);
    }

    @Override // X.InterfaceC1496780p3M
    public final /* bridge */ /* synthetic */ InterfaceC1496780p3M LJJLIIIJJI(long j) {
        LJJLIIJ(j);
        return this;
    }

    public final C1496690p3D LJJLIIIJL(long j) {
        boolean z;
        if (j == 0) {
            LJJJZ(48);
            return this;
        }
        int i = 1;
        if (j < 0) {
            j = -j;
            if (j < 0) {
                LJLJJLL("-9223372036854775808");
                return this;
            }
            z = true;
        } else {
            z = false;
        }
        if (j < 100000000) {
            if (j < 10000) {
                if (j < 100) {
                    if (j >= 10) {
                        i = 2;
                    }
                } else if (j < 1000) {
                    i = 3;
                } else {
                    i = 4;
                }
            } else if (j < 1000000) {
                if (j < 100000) {
                    i = 5;
                } else {
                    i = 6;
                }
            } else if (j < 10000000) {
                i = 7;
            } else {
                i = 8;
            }
        } else if (j < 1000000000000L) {
            if (j < 10000000000L) {
                if (j < 1000000000) {
                    i = 9;
                } else {
                    i = 10;
                }
            } else if (j < 100000000000L) {
                i = 11;
            } else {
                i = 12;
            }
        } else if (j < 1000000000000000L) {
            if (j < 10000000000000L) {
                i = 13;
            } else if (j < 100000000000000L) {
                i = 14;
            } else {
                i = 15;
            }
        } else if (j < 100000000000000000L) {
            if (j < 10000000000000000L) {
                i = 16;
            } else {
                i = 17;
            }
        } else if (j < 1000000000000000000L) {
            i = 18;
        } else {
            i = 19;
        }
        if (z) {
            i++;
        }
        C1496750p3J c1496750p3JLJJJJJL = LJJJJJL(i);
        byte[] bArr = c1496750p3JLJJJJJL.LIZ;
        int i2 = c1496750p3JLJJJJJL.LIZJ + i;
        while (j != 0) {
            long j2 = 10;
            i2--;
            bArr[i2] = LLILLL[(int) (j % j2)];
            j /= j2;
        }
        if (z) {
            bArr[i2 - 1] = (byte) 45;
        }
        c1496750p3JLJJJJJL.LIZJ += i;
        this.LLILLJJLI += (long) i;
        return this;
    }

    public final C1496690p3D LJJLIIJ(long j) {
        if (j == 0) {
            LJJJZ(48);
            return this;
        }
        int iNumberOfTrailingZeros = (Long.numberOfTrailingZeros(Long.highestOneBit(j)) / 4) + 1;
        C1496750p3J c1496750p3JLJJJJJL = LJJJJJL(iNumberOfTrailingZeros);
        byte[] bArr = c1496750p3JLJJJJJL.LIZ;
        int i = c1496750p3JLJJJJJL.LIZJ;
        int i2 = i + iNumberOfTrailingZeros;
        while (true) {
            i2--;
            if (i2 >= i) {
                bArr[i2] = LLILLL[(int) (15 & j)];
                j >>>= 4;
            } else {
                c1496750p3JLJJJJJL.LIZJ += iNumberOfTrailingZeros;
                this.LLILLJJLI += (long) iNumberOfTrailingZeros;
                return this;
            }
        }
    }

    public final void LJJLIL(int i) {
        C1496750p3J c1496750p3JLJJJJJL = LJJJJJL(4);
        byte[] bArr = c1496750p3JLJJJJJL.LIZ;
        int i2 = c1496750p3JLJJJJJL.LIZJ;
        int i3 = i2 + 1;
        bArr[i2] = (byte) ((i >>> 24) & 255);
        int i4 = i3 + 1;
        bArr[i3] = (byte) ((i >>> 16) & 255);
        int i5 = i4 + 1;
        bArr[i4] = (byte) ((i >>> 8) & 255);
        bArr[i5] = (byte) (i & 255);
        c1496750p3JLJJJJJL.LIZJ = i5 + 1;
        this.LLILLJJLI += 4;
    }

    public final void LJJLL(long j) {
        C1496750p3J c1496750p3JLJJJJJL = LJJJJJL(8);
        byte[] bArr = c1496750p3JLJJJJJL.LIZ;
        int i = c1496750p3JLJJJJJL.LIZJ;
        int i2 = i + 1;
        bArr[i] = (byte) ((j >>> 56) & 255);
        int i3 = i2 + 1;
        bArr[i2] = (byte) ((j >>> 48) & 255);
        int i4 = i3 + 1;
        bArr[i3] = (byte) ((j >>> 40) & 255);
        int i5 = i4 + 1;
        bArr[i4] = (byte) ((j >>> 32) & 255);
        int i6 = i5 + 1;
        bArr[i5] = (byte) ((j >>> 24) & 255);
        int i7 = i6 + 1;
        bArr[i6] = (byte) ((j >>> 16) & 255);
        int i8 = i7 + 1;
        bArr[i7] = (byte) ((j >>> 8) & 255);
        bArr[i8] = (byte) (j & 255);
        c1496750p3JLJJJJJL.LIZJ = i8 + 1;
        this.LLILLJJLI += 8;
    }

    public final void LJL(int i) {
        C1496750p3J c1496750p3JLJJJJJL = LJJJJJL(2);
        byte[] bArr = c1496750p3JLJJJJJL.LIZ;
        int i2 = c1496750p3JLJJJJJL.LIZJ;
        int i3 = i2 + 1;
        bArr[i2] = (byte) ((i >>> 8) & 255);
        bArr[i3] = (byte) (i & 255);
        c1496750p3JLJJJJJL.LIZJ = i3 + 1;
        this.LLILLJJLI += 2;
    }

    @Override // X.InterfaceC1496620p36
    public final long LJLIIL(ByteString byteString) {
        return LJIILL(0L, byteString);
    }

    @Override // X.InterfaceC1496620p36
    public final ByteString LJLILLLLZI(long j) {
        return new ByteString(LJJIJ(j));
    }

    public final void LJLJJLL(String str) {
        LJLJI(0, str.length(), str);
    }

    public final void LJLJL(int i) {
        if (i < 128) {
            LJJJZ(i);
            return;
        }
        if (i < 2048) {
            C1496750p3J c1496750p3JLJJJJJL = LJJJJJL(2);
            byte[] bArr = c1496750p3JLJJJJJL.LIZ;
            int i2 = c1496750p3JLJJJJJL.LIZJ;
            bArr[i2] = (byte) ((i >> 6) | 192);
            bArr[i2 + 1] = (byte) ((i & 63) | 128);
            c1496750p3JLJJJJJL.LIZJ = i2 + 2;
            this.LLILLJJLI += 2;
            return;
        }
        if (55296 <= i) {
            if (57343 >= i) {
                LJJJZ(63);
                return;
            }
            if (i >= 65536) {
                if (i <= 1114111) {
                    C1496750p3J c1496750p3JLJJJJJL2 = LJJJJJL(4);
                    byte[] bArr2 = c1496750p3JLJJJJJL2.LIZ;
                    int i3 = c1496750p3JLJJJJJL2.LIZJ;
                    bArr2[i3] = (byte) ((i >> 18) | 240);
                    bArr2[i3 + 1] = (byte) (((i >> 12) & 63) | 128);
                    bArr2[i3 + 2] = (byte) (((i >> 6) & 63) | 128);
                    bArr2[i3 + 3] = (byte) ((i & 63) | 128);
                    c1496750p3JLJJJJJL2.LIZJ = i3 + 4;
                    this.LLILLJJLI += 4;
                    return;
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Unexpected code point: ");
                sbLIZ.append(Integer.toHexString(i));
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
        }
        C1496750p3J c1496750p3JLJJJJJL3 = LJJJJJL(3);
        byte[] bArr3 = c1496750p3JLJJJJJL3.LIZ;
        int i4 = c1496750p3JLJJJJJL3.LIZJ;
        bArr3[i4] = (byte) ((i >> 12) | 224);
        bArr3[i4 + 1] = (byte) (((i >> 6) & 63) | 128);
        bArr3[i4 + 2] = (byte) ((i & 63) | 128);
        c1496750p3JLJJJJJL3.LIZJ = i4 + 3;
        this.LLILLJJLI += 3;
    }

    @Override // X.InterfaceC1496620p36
    public final String LJLJLLL(long j) throws EOFException {
        if (j >= 0) {
            long j2 = Long.MAX_VALUE;
            if (j != Long.MAX_VALUE) {
                j2 = j + 1;
            }
            byte b = (byte) 10;
            long jLJII = LJII(0L, j2, b);
            if (jLJII != -1) {
                return LJJJJ(jLJII);
            }
            if (j2 < this.LLILLJJLI && LJI(j2 - 1) == ((byte) 13) && LJI(j2) == b) {
                return LJJJJ(j2);
            }
            C1496690p3D c1496690p3D = new C1496690p3D();
            LJFF(c1496690p3D, 0L, Math.min(32, this.LLILLJJLI));
            throw new EOFException("\\n not found: limit=" + Math.min(this.LLILLJJLI, j) + " content=" + c1496690p3D.LJIJJ().hex() + (char) 8230);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("limit < 0: ");
        sbLIZ.append(j);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        strLIZIZ.toString();
        throw new IllegalArgumentException(strLIZIZ);
    }

    @Override // X.InterfaceC1496780p3M
    public final /* bridge */ /* synthetic */ InterfaceC1496780p3M LJLLILLLL(String str) {
        LJLJJLL(str);
        return this;
    }

    @Override // X.InterfaceC1496780p3M
    public final InterfaceC1496780p3M LJLLLLLL(long j) {
        LJJLL(C1496820p3Q.LIZJ(j));
        return this;
    }

    @Override // X.InterfaceC1496780p3M
    public final InterfaceC1496780p3M LL(int i) {
        LJJLIL(((i & 255) << 24) | (((-16777216) & i) >>> 24) | ((16711680 & i) >>> 8) | ((65280 & i) << 8));
        return this;
    }

    @Override // X.InterfaceC1496620p36
    public final boolean LLF(ByteString byteString) {
        int size = byteString.size();
        if (size < 0 || this.LLILLJJLI - 0 < size || byteString.size() < size) {
            return false;
        }
        for (int i = 0; i < size; i++) {
            if (LJI(((long) i) + 0) != byteString.getByte(i)) {
                return false;
            }
        }
        return true;
    }

    @Override // X.InterfaceC1496620p36
    public final void LLIIII(long j) throws EOFException {
        if (this.LLILLJJLI >= j) {
        } else {
            throw new EOFException();
        }
    }

    @Override // X.InterfaceC1496780p3M
    public final long LLIIJI(InterfaceC842570X3n interfaceC842570X3n) {
        long j = 0;
        while (true) {
            long j2 = interfaceC842570X3n.read(this, 8192);
            if (j2 == -1) {
                return j;
            }
            j += j2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1496690p3D)) {
            return false;
        }
        long j = this.LLILLJJLI;
        C1496690p3D c1496690p3D = (C1496690p3D) obj;
        if (j != c1496690p3D.LLILLJJLI) {
            return false;
        }
        if (j == 0) {
            return true;
        }
        C1496750p3J c1496750p3J = this.LL;
        if (c1496750p3J == null) {
            Intrinsics.LJIIL();
        }
        C1496750p3J c1496750p3J2 = c1496690p3D.LL;
        if (c1496750p3J2 == null) {
            Intrinsics.LJIIL();
        }
        int i = c1496750p3J.LIZIZ;
        int i2 = c1496750p3J2.LIZIZ;
        long j2 = 0;
        while (j2 < this.LLILLJJLI) {
            long jMin = Math.min(c1496750p3J.LIZJ - i, c1496750p3J2.LIZJ - i2);
            long j3 = 0;
            while (j3 < jMin) {
                int i3 = i + 1;
                int i4 = i2 + 1;
                if (c1496750p3J.LIZ[i] != c1496750p3J2.LIZ[i2]) {
                    return false;
                }
                j3++;
                i = i3;
                i2 = i4;
            }
            if (i == c1496750p3J.LIZJ) {
                c1496750p3J = c1496750p3J.LJFF;
                if (c1496750p3J == null) {
                    Intrinsics.LJIIL();
                }
                i = c1496750p3J.LIZIZ;
            }
            if (i2 == c1496750p3J2.LIZJ) {
                c1496750p3J2 = c1496750p3J2.LJFF;
                if (c1496750p3J2 == null) {
                    Intrinsics.LJIIL();
                }
                i2 = c1496750p3J2.LIZIZ;
            }
            j2 += jMin;
        }
        return true;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        C1496750p3J c1496750p3J = this.LL;
        if (c1496750p3J != null) {
            int iMin = Math.min(byteBuffer.remaining(), c1496750p3J.LIZJ - c1496750p3J.LIZIZ);
            byteBuffer.put(c1496750p3J.LIZ, c1496750p3J.LIZIZ, iMin);
            int i = c1496750p3J.LIZIZ + iMin;
            c1496750p3J.LIZIZ = i;
            this.LLILLJJLI -= (long) iMin;
            if (i == c1496750p3J.LIZJ) {
                this.LL = c1496750p3J.LIZ();
                C1496800p3O.LIZ(c1496750p3J);
            }
            return iMin;
        }
        return -1;
    }

    @Override // X.InterfaceC1496620p36
    public final void readFully(byte[] bArr) throws EOFException {
        int i = 0;
        while (i < bArr.length) {
            int i2 = read(bArr, i, bArr.length - i);
            if (i2 != -1) {
                i += i2;
            } else {
                throw new EOFException();
            }
        }
    }

    @Override // X.InterfaceC1496620p36
    public final boolean request(long j) {
        if (this.LLILLJJLI >= j) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC1496620p36
    public final void skip(long j) throws EOFException {
        while (j > 0) {
            C1496750p3J c1496750p3J = this.LL;
            if (c1496750p3J != null) {
                int iMin = (int) Math.min(j, c1496750p3J.LIZJ - c1496750p3J.LIZIZ);
                long j2 = iMin;
                this.LLILLJJLI -= j2;
                j -= j2;
                int i = c1496750p3J.LIZIZ + iMin;
                c1496750p3J.LIZIZ = i;
                if (i == c1496750p3J.LIZJ) {
                    this.LL = c1496750p3J.LIZ();
                    C1496800p3O.LIZ(c1496750p3J);
                }
            } else {
                throw new EOFException();
            }
        }
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        int iRemaining = byteBuffer.remaining();
        int i = iRemaining;
        while (i > 0) {
            C1496750p3J c1496750p3JLJJJJJL = LJJJJJL(1);
            int iMin = Math.min(i, 8192 - c1496750p3JLJJJJJL.LIZJ);
            byteBuffer.get(c1496750p3JLJJJJJL.LIZ, c1496750p3JLJJJJJL.LIZJ, iMin);
            i -= iMin;
            c1496750p3JLJJJJJL.LIZJ += iMin;
        }
        this.LLILLJJLI += (long) iRemaining;
        return iRemaining;
    }

    @Override // X.InterfaceC1496780p3M
    public final /* bridge */ /* synthetic */ InterfaceC1496780p3M writeByte(int i) {
        LJJJZ(i);
        return this;
    }

    @Override // X.InterfaceC1496780p3M
    public final /* bridge */ /* synthetic */ InterfaceC1496780p3M writeInt(int i) {
        LJJLIL(i);
        return this;
    }

    @Override // X.InterfaceC1496780p3M
    public final /* bridge */ /* synthetic */ InterfaceC1496780p3M writeShort(int i) {
        LJL(i);
        return this;
    }

    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // X.InterfaceC1496780p3M
    public final InterfaceC1496780p3M write(byte[] bArr) {
        LJJJLL(0, bArr, bArr.length);
        return this;
    }

    /* JADX INFO: renamed from: write, reason: collision with other method in class */
    public final void m52write(byte[] bArr) {
        LJJJLL(0, bArr, bArr.length);
    }

    public final long LJIILL(long j, ByteString byteString) {
        long j2 = j;
        long j3 = 0;
        if (j2 >= 0) {
            C1496750p3J c1496750p3J = this.LL;
            if (c1496750p3J == null) {
                return -1L;
            }
            long j4 = this.LLILLJJLI;
            if (j4 - j2 < j2) {
                while (j4 > j2) {
                    c1496750p3J = c1496750p3J.LJI;
                    if (c1496750p3J == null) {
                        Intrinsics.LJIIL();
                    }
                    j4 -= (long) (c1496750p3J.LIZJ - c1496750p3J.LIZIZ);
                }
                if (byteString.size() == 2) {
                    byte b = byteString.getByte(0);
                    byte b2 = byteString.getByte(1);
                    while (j4 < this.LLILLJJLI) {
                        byte[] bArr = c1496750p3J.LIZ;
                        int i = c1496750p3J.LIZJ;
                        for (int i2 = (int) ((((long) c1496750p3J.LIZIZ) + j2) - j4); i2 < i; i2++) {
                            byte b3 = bArr[i2];
                            if (b3 == b || b3 == b2) {
                                return ((long) (i2 - c1496750p3J.LIZIZ)) + j4;
                            }
                        }
                        j4 += (long) (c1496750p3J.LIZJ - c1496750p3J.LIZIZ);
                        c1496750p3J = c1496750p3J.LJFF;
                        if (c1496750p3J == null) {
                            Intrinsics.LJIIL();
                        }
                        j2 = j4;
                    }
                } else {
                    byte[] bArrInternalArray$jvm = byteString.internalArray$jvm();
                    while (j4 < this.LLILLJJLI) {
                        byte[] bArr2 = c1496750p3J.LIZ;
                        int i3 = c1496750p3J.LIZJ;
                        for (int i4 = (int) ((((long) c1496750p3J.LIZIZ) + j2) - j4); i4 < i3; i4++) {
                            byte b4 = bArr2[i4];
                            for (byte b5 : bArrInternalArray$jvm) {
                                if (b4 == b5) {
                                    return ((long) (i4 - c1496750p3J.LIZIZ)) + j4;
                                }
                            }
                        }
                        j4 += (long) (c1496750p3J.LIZJ - c1496750p3J.LIZIZ);
                        c1496750p3J = c1496750p3J.LJFF;
                        if (c1496750p3J == null) {
                            Intrinsics.LJIIL();
                        }
                        j2 = j4;
                    }
                }
                return -1L;
            }
            while (true) {
                long j5 = ((long) (c1496750p3J.LIZJ - c1496750p3J.LIZIZ)) + j3;
                if (j5 > j2) {
                    break;
                }
                c1496750p3J = c1496750p3J.LJFF;
                if (c1496750p3J == null) {
                    Intrinsics.LJIIL();
                }
                j3 = j5;
            }
            if (byteString.size() == 2) {
                byte b6 = byteString.getByte(0);
                byte b7 = byteString.getByte(1);
                while (j3 < this.LLILLJJLI) {
                    byte[] bArr3 = c1496750p3J.LIZ;
                    int i5 = c1496750p3J.LIZJ;
                    for (int i6 = (int) ((((long) c1496750p3J.LIZIZ) + j2) - j3); i6 < i5; i6++) {
                        byte b8 = bArr3[i6];
                        if (b8 == b6 || b8 == b7) {
                            return ((long) (i6 - c1496750p3J.LIZIZ)) + j3;
                        }
                    }
                    j3 += (long) (c1496750p3J.LIZJ - c1496750p3J.LIZIZ);
                    c1496750p3J = c1496750p3J.LJFF;
                    if (c1496750p3J == null) {
                        Intrinsics.LJIIL();
                    }
                    j2 = j3;
                }
            } else {
                byte[] bArrInternalArray$jvm2 = byteString.internalArray$jvm();
                while (j3 < this.LLILLJJLI) {
                    byte[] bArr4 = c1496750p3J.LIZ;
                    int i7 = c1496750p3J.LIZJ;
                    for (int i8 = (int) ((((long) c1496750p3J.LIZIZ) + j2) - j3); i8 < i7; i8++) {
                        byte b9 = bArr4[i8];
                        for (byte b10 : bArrInternalArray$jvm2) {
                            if (b9 == b10) {
                                return ((long) (i8 - c1496750p3J.LIZIZ)) + j3;
                            }
                        }
                    }
                    j3 += (long) (c1496750p3J.LIZJ - c1496750p3J.LIZIZ);
                    c1496750p3J = c1496750p3J.LJFF;
                    if (c1496750p3J == null) {
                        Intrinsics.LJIIL();
                    }
                    j2 = j3;
                }
            }
            return -1L;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("fromIndex < 0: ");
        sbLIZ.append(j2);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        strLIZIZ.toString();
        throw new IllegalArgumentException(strLIZIZ);
    }

    public final String LJIJJLI(long j, Charset charset) throws EOFException {
        if (j >= 0 && j <= Integer.MAX_VALUE) {
            if (this.LLILLJJLI >= j) {
                if (j == 0) {
                    return "";
                }
                C1496750p3J c1496750p3J = this.LL;
                if (c1496750p3J == null) {
                    Intrinsics.LJIIL();
                }
                int i = c1496750p3J.LIZIZ;
                if (((long) i) + j > c1496750p3J.LIZJ) {
                    return new String(LJJIJ(j), charset);
                }
                int i2 = (int) j;
                String str = new String(c1496750p3J.LIZ, i, i2, charset);
                int i3 = c1496750p3J.LIZIZ + i2;
                c1496750p3J.LIZIZ = i3;
                this.LLILLJJLI -= j;
                if (i3 == c1496750p3J.LIZJ) {
                    this.LL = c1496750p3J.LIZ();
                    C1496800p3O.LIZ(c1496750p3J);
                }
                return str;
            }
            throw new EOFException();
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("byteCount: ");
        sbLIZ.append(j);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        strLIZIZ.toString();
        throw new IllegalArgumentException(strLIZIZ);
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x0087, code lost:
    
        if (r17 == false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0089, code lost:
    
        return r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x008a, code lost:
    
        return r13;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0052 A[PHI: r3 r4 r5 r7
      0x0052: PHI (r3v5 byte[]) = (r3v4 byte[]), (r3v7 byte[]) binds: [B:17:0x0036, B:24:0x004a] A[DONT_GENERATE, DONT_INLINE]
      0x0052: PHI (r4v4 int) = (r4v3 int), (r4v6 int) binds: [B:17:0x0036, B:24:0x004a] A[DONT_GENERATE, DONT_INLINE]
      0x0052: PHI (r5v6 X.0p3J) = (r5v5 X.0p3J), (r5v8 X.0p3J) binds: [B:17:0x0036, B:24:0x004a] A[DONT_GENERATE, DONT_INLINE]
      0x0052: PHI (r7v5 int) = (r7v4 int), (r7v7 int) binds: [B:17:0x0036, B:24:0x004a] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int LJJJJJ(X.C1496870p3V r16, boolean r17) {
        /*
            r15 = this;
            X.0p3J r9 = r15.LL
            r14 = -2
            r8 = -1
            if (r9 == 0) goto L8b
            byte[] r3 = r9.LIZ
            int r2 = r9.LIZIZ
            int r7 = r9.LIZJ
            r0 = r16
            int[] r6 = r0.LLILLJJLI
            r5 = r9
            r13 = -1
            r1 = 0
        L13:
            int r0 = r1 + 1
            r11 = r6[r1]
            int r10 = r0 + 1
            r0 = r6[r0]
            if (r0 == r8) goto L1e
            r13 = r0
        L1e:
            if (r5 == 0) goto L87
            r12 = 0
            if (r11 >= 0) goto L59
            int r0 = -r11
            int r11 = r10 + r0
        L26:
            int r4 = r2 + 1
            r0 = r3[r2]
            r2 = r0 & 255(0xff, float:3.57E-43)
            int r1 = r10 + 1
            r0 = r6[r10]
            if (r2 == r0) goto L33
            return r13
        L33:
            if (r1 != r11) goto L57
            r0 = 1
        L36:
            if (r4 != r7) goto L52
            if (r5 != 0) goto L3d
            kotlin.jvm.internal.Intrinsics.LJIIL()
        L3d:
            X.0p3J r5 = r5.LJFF
            if (r5 != 0) goto L44
            kotlin.jvm.internal.Intrinsics.LJIIL()
        L44:
            int r4 = r5.LIZIZ
            byte[] r3 = r5.LIZ
            int r7 = r5.LIZJ
            if (r5 != r9) goto L52
            if (r0 == 0) goto L87
            r5 = r12
        L4f:
            r0 = r6[r1]
            goto L7d
        L52:
            if (r0 != 0) goto L4f
            r2 = r4
            r10 = r1
            goto L26
        L57:
            r0 = 0
            goto L36
        L59:
            int r4 = r2 + 1
            r0 = r3[r2]
            r2 = r0 & 255(0xff, float:3.57E-43)
            int r1 = r10 + r11
        L61:
            if (r10 != r1) goto L64
            return r13
        L64:
            r0 = r6[r10]
            if (r2 != r0) goto L80
            int r10 = r10 + r11
            r0 = r6[r10]
            if (r4 != r7) goto L7d
            X.0p3J r5 = r5.LJFF
            if (r5 != 0) goto L74
            kotlin.jvm.internal.Intrinsics.LJIIL()
        L74:
            int r4 = r5.LIZIZ
            byte[] r3 = r5.LIZ
            int r7 = r5.LIZJ
            if (r5 != r9) goto L7d
            r5 = r12
        L7d:
            if (r0 < 0) goto L83
            return r0
        L80:
            int r10 = r10 + 1
            goto L61
        L83:
            int r1 = -r0
            r2 = r4
            r14 = -2
            goto L13
        L87:
            if (r17 == 0) goto L8a
            return r14
        L8a:
            return r13
        L8b:
            if (r17 != 0) goto L8e
            r14 = -1
        L8e:
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1496690p3D.LJJJJJ(X.0p3V, boolean):int");
    }

    @Override // X.InterfaceC1496620p36
    public final void LJJJJLI(C1496690p3D c1496690p3D, long j) throws EOFException {
        long j2 = this.LLILLJJLI;
        if (j2 >= j) {
            c1496690p3D.LLFF(this, j);
        } else {
            c1496690p3D.LLFF(this, j2);
            throw new EOFException();
        }
    }

    @Override // X.InterfaceC1496780p3M
    public final InterfaceC1496780p3M LJJJJZI(String str, Charset charset) {
        LJLIIIL(0, str.length(), str, charset);
        return this;
    }

    @Override // X.InterfaceC1495590p1R
    public final void LLFF(C1496690p3D c1496690p3D, long j) {
        int i;
        C1496750p3J c1496750p3JLIZIZ;
        C1496750p3J c1496750p3J;
        int i2;
        long j2 = j;
        if (c1496690p3D != this) {
            C1496820p3Q.LIZIZ(c1496690p3D.LLILLJJLI, 0L, j2);
            while (j2 > 0) {
                C1496750p3J c1496750p3J2 = c1496690p3D.LL;
                if (c1496750p3J2 == null) {
                    Intrinsics.LJIIL();
                }
                int i3 = c1496750p3J2.LIZJ;
                if (c1496690p3D.LL == null) {
                    Intrinsics.LJIIL();
                }
                if (j2 < i3 - r0.LIZIZ) {
                    C1496750p3J c1496750p3J3 = this.LL;
                    if (c1496750p3J3 != null && (c1496750p3J = c1496750p3J3.LJI) != null && c1496750p3J.LJ) {
                        long j3 = ((long) c1496750p3J.LIZJ) + j2;
                        if (c1496750p3J.LIZLLL) {
                            i2 = 0;
                        } else {
                            i2 = c1496750p3J.LIZIZ;
                        }
                        if (j3 - ((long) i2) <= 8192) {
                            C1496750p3J c1496750p3J4 = c1496690p3D.LL;
                            if (c1496750p3J4 == null) {
                                Intrinsics.LJIIL();
                            }
                            c1496750p3J4.LIZLLL(c1496750p3J, (int) j2);
                            c1496690p3D.LLILLJJLI -= j2;
                            this.LLILLJJLI += j2;
                            return;
                        }
                    }
                    C1496750p3J c1496750p3J5 = c1496690p3D.LL;
                    if (c1496750p3J5 == null) {
                        Intrinsics.LJIIL();
                    }
                    int i4 = (int) j2;
                    c1496750p3J5.getClass();
                    if (i4 > 0 && i4 <= c1496750p3J5.LIZJ - c1496750p3J5.LIZIZ) {
                        if (i4 >= 1024) {
                            c1496750p3JLIZIZ = c1496750p3J5.LIZJ();
                        } else {
                            c1496750p3JLIZIZ = C1496800p3O.LIZIZ();
                            System.arraycopy(c1496750p3J5.LIZ, c1496750p3J5.LIZIZ, c1496750p3JLIZIZ.LIZ, 0, i4);
                        }
                        c1496750p3JLIZIZ.LIZJ = c1496750p3JLIZIZ.LIZIZ + i4;
                        c1496750p3J5.LIZIZ += i4;
                        C1496750p3J c1496750p3J6 = c1496750p3J5.LJI;
                        if (c1496750p3J6 == null) {
                            Intrinsics.LJIIL();
                        }
                        c1496750p3J6.LIZIZ(c1496750p3JLIZIZ);
                        c1496690p3D.LL = c1496750p3JLIZIZ;
                    } else {
                        "byteCount out of range".toString();
                        throw new IllegalArgumentException("byteCount out of range");
                    }
                }
                C1496750p3J c1496750p3J7 = c1496690p3D.LL;
                if (c1496750p3J7 == null) {
                    Intrinsics.LJIIL();
                }
                long j4 = c1496750p3J7.LIZJ - c1496750p3J7.LIZIZ;
                c1496690p3D.LL = c1496750p3J7.LIZ();
                C1496750p3J c1496750p3J8 = this.LL;
                if (c1496750p3J8 == null) {
                    this.LL = c1496750p3J7;
                    c1496750p3J7.LJI = c1496750p3J7;
                    c1496750p3J7.LJFF = c1496750p3J7;
                } else {
                    C1496750p3J c1496750p3J9 = c1496750p3J8.LJI;
                    if (c1496750p3J9 == null) {
                        Intrinsics.LJIIL();
                    }
                    c1496750p3J9.LIZIZ(c1496750p3J7);
                    C1496750p3J c1496750p3J10 = c1496750p3J7.LJI;
                    if (c1496750p3J10 != c1496750p3J7) {
                        if (c1496750p3J10 == null) {
                            Intrinsics.LJIIL();
                        }
                        if (c1496750p3J10.LJ) {
                            int i5 = c1496750p3J7.LIZJ - c1496750p3J7.LIZIZ;
                            C1496750p3J c1496750p3J11 = c1496750p3J7.LJI;
                            if (c1496750p3J11 == null) {
                                Intrinsics.LJIIL();
                            }
                            int i6 = 8192 - c1496750p3J11.LIZJ;
                            C1496750p3J c1496750p3J12 = c1496750p3J7.LJI;
                            if (c1496750p3J12 == null) {
                                Intrinsics.LJIIL();
                            }
                            if (c1496750p3J12.LIZLLL) {
                                i = 0;
                            } else {
                                C1496750p3J c1496750p3J13 = c1496750p3J7.LJI;
                                if (c1496750p3J13 == null) {
                                    Intrinsics.LJIIL();
                                }
                                i = c1496750p3J13.LIZIZ;
                            }
                            if (i5 <= i6 + i) {
                                C1496750p3J c1496750p3J14 = c1496750p3J7.LJI;
                                if (c1496750p3J14 == null) {
                                    Intrinsics.LJIIL();
                                }
                                c1496750p3J7.LIZLLL(c1496750p3J14, i5);
                                c1496750p3J7.LIZ();
                                C1496800p3O.LIZ(c1496750p3J7);
                            }
                        }
                    } else {
                        "cannot compact".toString();
                        throw new IllegalStateException("cannot compact");
                    }
                }
                c1496690p3D.LLILLJJLI -= j4;
                this.LLILLJJLI += j4;
                j2 -= j4;
            }
            return;
        }
        "source == this".toString();
        throw new IllegalArgumentException("source == this");
    }

    @Override // X.InterfaceC842570X3n
    public final long read(C1496690p3D c1496690p3D, long j) {
        if (j >= 0) {
            long j2 = this.LLILLJJLI;
            if (j2 == 0) {
                return -1L;
            }
            if (j > j2) {
                j = j2;
            }
            c1496690p3D.LLFF(this, j);
            return j;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("byteCount < 0: ");
        sbLIZ.append(j);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        strLIZIZ.toString();
        throw new IllegalArgumentException(strLIZIZ);
    }

    public final void LJFF(C1496690p3D c1496690p3D, long j, long j2) {
        long j3 = j2;
        long j4 = j;
        C1496820p3Q.LIZIZ(this.LLILLJJLI, j4, j3);
        if (j3 == 0) {
            return;
        }
        c1496690p3D.LLILLJJLI += j3;
        C1496750p3J c1496750p3J = this.LL;
        while (true) {
            if (c1496750p3J == null) {
                Intrinsics.LJIIL();
            }
            long j5 = c1496750p3J.LIZJ - c1496750p3J.LIZIZ;
            if (j4 < j5) {
                break;
            }
            j4 -= j5;
            c1496750p3J = c1496750p3J.LJFF;
        }
        while (j3 > 0) {
            if (c1496750p3J == null) {
                Intrinsics.LJIIL();
            }
            C1496750p3J c1496750p3JLIZJ = c1496750p3J.LIZJ();
            int i = c1496750p3JLIZJ.LIZIZ + ((int) j4);
            c1496750p3JLIZJ.LIZIZ = i;
            c1496750p3JLIZJ.LIZJ = Math.min(i + ((int) j3), c1496750p3JLIZJ.LIZJ);
            C1496750p3J c1496750p3J2 = c1496690p3D.LL;
            if (c1496750p3J2 == null) {
                c1496750p3JLIZJ.LJI = c1496750p3JLIZJ;
                c1496750p3JLIZJ.LJFF = c1496750p3JLIZJ;
                c1496690p3D.LL = c1496750p3JLIZJ;
            } else {
                C1496750p3J c1496750p3J3 = c1496750p3J2.LJI;
                if (c1496750p3J3 == null) {
                    Intrinsics.LJIIL();
                }
                c1496750p3J3.LIZIZ(c1496750p3JLIZJ);
            }
            j3 -= (long) (c1496750p3JLIZJ.LIZJ - c1496750p3JLIZJ.LIZIZ);
            c1496750p3J = c1496750p3J.LJFF;
            j4 = 0;
        }
    }

    public final long LJII(long j, long j2, byte b) {
        C1496750p3J c1496750p3J;
        long j3 = 0;
        if (0 <= j && j2 >= j) {
            long j4 = this.LLILLJJLI;
            if (j2 > j4) {
                j2 = j4;
            }
            if (j == j2 || (c1496750p3J = this.LL) == null) {
                return -1L;
            }
            if (j4 - j < j) {
                while (j4 > j) {
                    c1496750p3J = c1496750p3J.LJI;
                    if (c1496750p3J == null) {
                        Intrinsics.LJIIL();
                    }
                    j4 -= (long) (c1496750p3J.LIZJ - c1496750p3J.LIZIZ);
                }
                while (j4 < j2) {
                    byte[] bArr = c1496750p3J.LIZ;
                    int iMin = (int) Math.min(c1496750p3J.LIZJ, (((long) c1496750p3J.LIZIZ) + j2) - j4);
                    for (int i = (int) ((((long) c1496750p3J.LIZIZ) + j) - j4); i < iMin; i++) {
                        if (bArr[i] == b) {
                            return ((long) (i - c1496750p3J.LIZIZ)) + j4;
                        }
                    }
                    j4 += (long) (c1496750p3J.LIZJ - c1496750p3J.LIZIZ);
                    c1496750p3J = c1496750p3J.LJFF;
                    if (c1496750p3J == null) {
                        Intrinsics.LJIIL();
                    }
                    j = j4;
                }
                return -1L;
            }
            while (true) {
                long j5 = ((long) (c1496750p3J.LIZJ - c1496750p3J.LIZIZ)) + j3;
                if (j5 > j) {
                    break;
                }
                c1496750p3J = c1496750p3J.LJFF;
                if (c1496750p3J == null) {
                    Intrinsics.LJIIL();
                }
                j3 = j5;
            }
            while (j3 < j2) {
                byte[] bArr2 = c1496750p3J.LIZ;
                int iMin2 = (int) Math.min(c1496750p3J.LIZJ, (((long) c1496750p3J.LIZIZ) + j2) - j3);
                for (int i2 = (int) ((((long) c1496750p3J.LIZIZ) + j) - j3); i2 < iMin2; i2++) {
                    if (bArr2[i2] == b) {
                        return ((long) (i2 - c1496750p3J.LIZIZ)) + j3;
                    }
                }
                j3 += (long) (c1496750p3J.LIZJ - c1496750p3J.LIZIZ);
                c1496750p3J = c1496750p3J.LJFF;
                if (c1496750p3J == null) {
                    Intrinsics.LJIIL();
                }
                j = j3;
            }
            return -1L;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("size=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(" fromIndex=");
        sbLIZ.append(j);
        sbLIZ.append(" toIndex=");
        sbLIZ.append(j2);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        strLIZIZ.toString();
        throw new IllegalArgumentException(strLIZIZ);
    }

    @Override // X.InterfaceC1496780p3M
    public final /* bridge */ /* synthetic */ InterfaceC1496780p3M LJJIII(int i, byte[] bArr, int i2) {
        LJJJLL(i, bArr, i2);
        return this;
    }

    public final void LJJJLL(int i, byte[] bArr, int i2) {
        long j = i2;
        C1496820p3Q.LIZIZ(bArr.length, i, j);
        int i3 = i2 + i;
        while (i < i3) {
            C1496750p3J c1496750p3JLJJJJJL = LJJJJJL(1);
            int iMin = Math.min(i3 - i, 8192 - c1496750p3JLJJJJJL.LIZJ);
            System.arraycopy(bArr, i, c1496750p3JLJJJJJL.LIZ, c1496750p3JLJJJJJL.LIZJ, iMin);
            i += iMin;
            c1496750p3JLJJJJJL.LIZJ += iMin;
        }
        this.LLILLJJLI += j;
    }

    @Override // X.InterfaceC1496780p3M
    public final /* bridge */ /* synthetic */ InterfaceC1496780p3M LJJZZIII(int i, int i2, String str) {
        LJLJI(i, i2, str);
        return this;
    }

    public final void LJLJI(int i, int i2, String str) {
        char cCharAt;
        char cCharAt2;
        if (i >= 0) {
            if (i2 >= i) {
                if (i2 > str.length()) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("endIndex > string.length: ");
                    sbLIZ.append(i2);
                    sbLIZ.append(" > ");
                    sbLIZ.append(str.length());
                    String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                    strLIZIZ.toString();
                    throw new IllegalArgumentException(strLIZIZ);
                }
                while (i < i2) {
                    char cCharAt3 = str.charAt(i);
                    if (cCharAt3 < 128) {
                        C1496750p3J c1496750p3JLJJJJJL = LJJJJJL(1);
                        byte[] bArr = c1496750p3JLJJJJJL.LIZ;
                        int i3 = c1496750p3JLJJJJJL.LIZJ - i;
                        int iMin = Math.min(i2, 8192 - i3);
                        int i4 = i + 1;
                        bArr[i + i3] = (byte) cCharAt3;
                        while (true) {
                            i = i4;
                            if (i4 >= iMin || (cCharAt = str.charAt(i4)) >= 128) {
                                break;
                            }
                            i4++;
                            bArr[i + i3] = (byte) cCharAt;
                        }
                        int i5 = c1496750p3JLJJJJJL.LIZJ;
                        int i6 = (i3 + i4) - i5;
                        c1496750p3JLJJJJJL.LIZJ = i5 + i6;
                        this.LLILLJJLI += (long) i6;
                    } else {
                        if (cCharAt3 < 2048) {
                            C1496750p3J c1496750p3JLJJJJJL2 = LJJJJJL(2);
                            byte[] bArr2 = c1496750p3JLJJJJJL2.LIZ;
                            int i7 = c1496750p3JLJJJJJL2.LIZJ;
                            bArr2[i7] = (byte) ((cCharAt3 >> 6) | 192);
                            bArr2[i7 + 1] = (byte) ((cCharAt3 & '?') | 128);
                            c1496750p3JLJJJJJL2.LIZJ = i7 + 2;
                            this.LLILLJJLI += 2;
                        } else if (cCharAt3 >= 55296 && cCharAt3 <= 57343) {
                            int i8 = i + 1;
                            if (i8 < i2) {
                                cCharAt2 = str.charAt(i8);
                            } else {
                                cCharAt2 = 0;
                            }
                            if (cCharAt3 <= 56319 && 56320 <= cCharAt2 && 57343 >= cCharAt2) {
                                int i9 = (((cCharAt3 & 1023) << 10) | (cCharAt2 & 1023)) + 65536;
                                C1496750p3J c1496750p3JLJJJJJL3 = LJJJJJL(4);
                                byte[] bArr3 = c1496750p3JLJJJJJL3.LIZ;
                                int i10 = c1496750p3JLJJJJJL3.LIZJ;
                                bArr3[i10] = (byte) ((i9 >> 18) | 240);
                                bArr3[i10 + 1] = (byte) (((i9 >> 12) & 63) | 128);
                                bArr3[i10 + 2] = (byte) (((i9 >> 6) & 63) | 128);
                                bArr3[i10 + 3] = (byte) ((i9 & 63) | 128);
                                c1496750p3JLJJJJJL3.LIZJ = i10 + 4;
                                this.LLILLJJLI += 4;
                                i += 2;
                            } else {
                                LJJJZ(63);
                                i = i8;
                            }
                        } else {
                            C1496750p3J c1496750p3JLJJJJJL4 = LJJJJJL(3);
                            byte[] bArr4 = c1496750p3JLJJJJJL4.LIZ;
                            int i11 = c1496750p3JLJJJJJL4.LIZJ;
                            bArr4[i11] = (byte) ((cCharAt3 >> '\f') | 224);
                            bArr4[i11 + 1] = (byte) ((63 & (cCharAt3 >> 6)) | 128);
                            bArr4[i11 + 2] = (byte) ((cCharAt3 & '?') | 128);
                            c1496750p3JLJJJJJL4.LIZJ = i11 + 3;
                            this.LLILLJJLI += 3;
                        }
                        i++;
                    }
                }
                return;
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("endIndex < beginIndex: ");
            sbLIZ2.append(i2);
            sbLIZ2.append(" < ");
            sbLIZ2.append(i);
            String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
            strLIZIZ2.toString();
            throw new IllegalArgumentException(strLIZIZ2);
        }
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("beginIndex < 0: ");
        sbLIZ3.append(i);
        String strLIZIZ3 = C2188811AlT.LIZIZ(sbLIZ3);
        strLIZIZ3.toString();
        throw new IllegalArgumentException(strLIZIZ3);
    }

    public final int read(byte[] bArr, int i, int i2) {
        C1496820p3Q.LIZIZ(bArr.length, i, i2);
        C1496750p3J c1496750p3J = this.LL;
        if (c1496750p3J != null) {
            int iMin = Math.min(i2, c1496750p3J.LIZJ - c1496750p3J.LIZIZ);
            System.arraycopy(c1496750p3J.LIZ, c1496750p3J.LIZIZ, bArr, i, iMin);
            int i3 = c1496750p3J.LIZIZ + iMin;
            c1496750p3J.LIZIZ = i3;
            this.LLILLJJLI -= (long) iMin;
            if (i3 == c1496750p3J.LIZJ) {
                this.LL = c1496750p3J.LIZ();
                C1496800p3O.LIZ(c1496750p3J);
            }
            return iMin;
        }
        return -1;
    }

    public final C1496690p3D LJLIIIL(int i, int i2, String str, Charset charset) {
        if (i >= 0) {
            if (i2 >= i) {
                if (i2 <= str.length()) {
                    if (Intrinsics.LJFF(charset, Charsets.UTF_8)) {
                        LJLJI(i, i2, str);
                        return this;
                    }
                    byte[] bytes = str.substring(i, i2).getBytes(charset);
                    LJJJLL(0, bytes, bytes.length);
                    return this;
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("endIndex > string.length: ");
                sbLIZ.append(i2);
                sbLIZ.append(" > ");
                sbLIZ.append(str.length());
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                strLIZIZ.toString();
                throw new IllegalArgumentException(strLIZIZ);
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("endIndex < beginIndex: ");
            sbLIZ2.append(i2);
            sbLIZ2.append(" < ");
            sbLIZ2.append(i);
            String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
            strLIZIZ2.toString();
            throw new IllegalArgumentException(strLIZIZ2);
        }
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("beginIndex < 0: ");
        sbLIZ3.append(i);
        String strLIZIZ3 = C2188811AlT.LIZIZ(sbLIZ3);
        strLIZIZ3.toString();
        throw new IllegalArgumentException(strLIZIZ3);
    }
}
