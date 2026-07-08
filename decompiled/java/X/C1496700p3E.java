package X;

import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import kotlin.jvm.internal.Intrinsics;
import okio.ByteString;

/* JADX INFO: renamed from: X.0p3E, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1496700p3E implements InterfaceC1496780p3M {
    public static final byte[] LLILZIL = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102};
    public final C1496690p3D LL = new C1496690p3D();
    public final C0X1A LLILLJJLI;
    public final InterfaceC1495590p1R LLILLL;
    public boolean LLILZ;

    @Override // X.InterfaceC1496780p3M
    public final long LLIIJI(InterfaceC842570X3n interfaceC842570X3n) {
        return 0L;
    }

    @Override // X.InterfaceC1496780p3M
    public final InterfaceC1496780p3M LJLJLJ() {
        if (!(!this.LLILZ)) {
            "closed".toString();
            throw new IllegalStateException("closed");
        }
        long jLIZLLL = this.LL.LIZLLL();
        if (jLIZLLL > 0) {
            this.LLILLL.LLFF(this.LL, jLIZLLL);
        }
        return this;
    }

    @Override // X.InterfaceC1496780p3M
    public final InterfaceC1496780p3M LLFII() {
        if (!(!this.LLILZ)) {
            "closed".toString();
            throw new IllegalStateException("closed");
        }
        C1496690p3D c1496690p3D = this.LL;
        long j = c1496690p3D.LLILLJJLI;
        if (j > 0) {
            this.LLILLL.LLFF(c1496690p3D, j);
        }
        return this;
    }

    @Override // X.InterfaceC1496780p3M
    public final OutputStream LLIIL() {
        return new OutputStream() { // from class: X.0p3L
            @Override // java.io.OutputStream, java.io.Flushable
            public final void flush() {
                if (this.LL.LLILZ) {
                    return;
                }
                flush();
            }

            public final String toString() {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(this);
                sbLIZ.append(".outputStream()");
                return C2188811AlT.LIZIZ(sbLIZ);
            }

            @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
            public final void close() {
                close();
            }

            @Override // java.io.OutputStream
            public final void write(int i) throws IOException {
                C1496700p3E c1496700p3E = this.LL;
                if (!c1496700p3E.LLILZ) {
                    c1496700p3E.LL.LJJJZ((byte) i);
                    return;
                }
                throw new IOException("closed");
            }

            @Override // java.io.OutputStream
            public final void write(byte[] bArr, int i, int i2) throws IOException {
                C1496700p3E c1496700p3E = this.LL;
                if (!c1496700p3E.LLILZ) {
                    c1496700p3E.LL.LJJJLL(i, bArr, i2);
                    return;
                }
                throw new IOException("closed");
            }
        };
    }

    @Override // X.InterfaceC1495590p1R, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws Throwable {
        if (this.LLILZ) {
            return;
        }
        try {
            C1496690p3D c1496690p3D = this.LL;
            long j = c1496690p3D.LLILLJJLI;
            if (j > 0) {
                this.LLILLL.LLFF(c1496690p3D, j);
            }
            th = null;
        } catch (Throwable th) {
            th = th;
            TryCatchGuardChecker.doCheck(th);
        }
        try {
            this.LLILLL.close();
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            if (th == null) {
                th = th2;
            }
        }
        this.LLILZ = true;
        if (th != null) {
            throw th;
        }
    }

    @Override // X.InterfaceC1496780p3M, X.InterfaceC1495590p1R, java.io.Flushable
    public final void flush() {
        if (!(!this.LLILZ)) {
            "closed".toString();
            throw new IllegalStateException("closed");
        }
        C1496690p3D c1496690p3D = this.LL;
        long j = c1496690p3D.LLILLJJLI;
        if (j > 0) {
            this.LLILLL.LLFF(c1496690p3D, j);
        }
        this.LLILLL.flush();
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.LLILZ;
    }

    @Override // X.InterfaceC1495590p1R
    public final C1496250p2V timeout() {
        return this.LLILLL.timeout();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("buffer(");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1496780p3M
    public final C1496690p3D LJIIIZ() {
        return this.LL;
    }

    @Override // X.InterfaceC1496780p3M
    public final C1496690p3D buffer() {
        return this.LL;
    }

    public final boolean LIZ(int i) {
        if (this.LLILLJJLI.LIZIZ(1L) > 0) {
            this.LL.LJJJZ(i);
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC1496780p3M
    public final InterfaceC1496780p3M LJJIJLIJ(long j) {
        int i;
        if (!this.LLILZ) {
            if (j == 0 && LIZ(48)) {
                LJLJLJ();
                return this;
            }
            int i2 = 0;
            if (j < 0) {
                j = -j;
                if (j < 0) {
                    LJJZZIII(0, 20, "-9223372036854775808");
                    return this;
                }
                i2 = 1;
            }
            if (j < 100000000) {
                if (j < 10000) {
                    if (j < 100) {
                        if (j < 10) {
                            i = 1;
                        } else {
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
            if (i2 != 0) {
                i++;
            }
            long jLIZIZ = this.LLILLJJLI.LIZIZ(i);
            if (jLIZIZ > 0) {
                int i3 = (int) jLIZIZ;
                byte[] bArr = new byte[i3];
                int i4 = i3 - 1;
                while (j != 0 && i4 > i2) {
                    long j2 = 10;
                    i4--;
                    bArr[i4] = LLILZIL[(int) (j % j2)];
                    j /= j2;
                }
                if (i2 != 0) {
                    bArr[i4 - 1] = 45;
                }
                this.LL.m52write(bArr);
            }
            return this;
        }
        "closed".toString();
        throw new IllegalStateException("closed");
    }

    @Override // X.InterfaceC1496780p3M
    public final InterfaceC1496780p3M LJJJI(ByteString byteString) {
        write(byteString.asByteBuffer());
        return this;
    }

    @Override // X.InterfaceC1496780p3M
    public final InterfaceC1496780p3M LJJLIIIJJI(long j) {
        if (!this.LLILZ) {
            if (j == 0 && LIZ(48)) {
                LJLJLJ();
                return this;
            }
            long jLIZIZ = this.LLILLJJLI.LIZIZ((Long.numberOfTrailingZeros(Long.highestOneBit(j)) / 4) + 1);
            if (jLIZIZ > 0) {
                for (int i = (int) (jLIZIZ - 1); i >= 0; i--) {
                    this.LL.LJJJZ(LLILZIL[(int) (15 & j)]);
                    j >>>= 4;
                }
            }
            return this;
        }
        "closed".toString();
        throw new IllegalStateException("closed");
    }

    @Override // X.InterfaceC1496780p3M
    public final InterfaceC1496780p3M LJLLILLLL(String str) {
        LJJZZIII(0, str.length(), str);
        return this;
    }

    @Override // X.InterfaceC1496780p3M
    public final InterfaceC1496780p3M LJLLLLLL(long j) {
        long j2 = ((j & 255) << 56) | (((-72057594037927936L) & j) >>> 56) | ((71776119061217280L & j) >>> 40) | ((280375465082880L & j) >>> 24) | ((1095216660480L & j) >>> 8) | ((4278190080L & j) << 8) | ((16711680 & j) << 24) | ((65280 & j) << 40);
        if (!this.LLILZ) {
            long jLIZIZ = this.LLILLJJLI.LIZIZ(8L);
            if (jLIZIZ > 0) {
                for (long j3 = 0; j3 < jLIZIZ; j3++) {
                    this.LL.LJJJZ((byte) ((j2 >> ((int) ((jLIZIZ - j3) * ((long) 8)))) & 255));
                }
            }
            return this;
        }
        "closed".toString();
        throw new IllegalStateException("closed");
    }

    @Override // X.InterfaceC1496780p3M
    public final InterfaceC1496780p3M LL(int i) {
        writeInt(((i & 255) << 24) | (((-16777216) & i) >>> 24) | ((16711680 & i) >>> 8) | ((65280 & i) << 8));
        return this;
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        if (!this.LLILZ) {
            int iLIZIZ = (int) this.LLILLJJLI.LIZIZ(byteBuffer.remaining());
            if (iLIZIZ > 0) {
                int i = iLIZIZ;
                do {
                    int iMin = Math.min(i, SpeechEngineDefines.TTS_WORK_MODE_BOTH);
                    byte[] bArr = new byte[iMin];
                    byteBuffer.get(bArr, 0, iMin);
                    i -= iMin;
                    this.LL.m52write(bArr);
                } while (i > 0);
                LJLJLJ();
            }
            return iLIZIZ;
        }
        "closed".toString();
        throw new IllegalStateException("closed");
    }

    @Override // X.InterfaceC1496780p3M
    public final InterfaceC1496780p3M writeByte(int i) {
        if (!this.LLILZ) {
            LIZ(i);
            return this;
        }
        "closed".toString();
        throw new IllegalStateException("closed");
    }

    @Override // X.InterfaceC1496780p3M
    public final InterfaceC1496780p3M writeInt(int i) {
        if (!this.LLILZ) {
            long jLIZIZ = this.LLILLJJLI.LIZIZ(4L);
            if (jLIZIZ > 0) {
                for (long j = 0; j < jLIZIZ; j++) {
                    this.LL.LJJJZ((byte) ((i >> ((int) ((jLIZIZ - j) * ((long) 8)))) & 255));
                }
            }
            return this;
        }
        "closed".toString();
        throw new IllegalStateException("closed");
    }

    @Override // X.InterfaceC1496780p3M
    public final InterfaceC1496780p3M writeShort(int i) {
        if (!this.LLILZ) {
            long jLIZIZ = this.LLILLJJLI.LIZIZ(2L);
            if (jLIZIZ > 0) {
                for (long j = 0; j < jLIZIZ; j++) {
                    this.LL.LJJJZ((byte) ((i >> ((int) ((jLIZIZ - j) * ((long) 8)))) & 255));
                }
            }
            return this;
        }
        "closed".toString();
        throw new IllegalStateException("closed");
    }

    @Override // X.InterfaceC1496780p3M
    public final InterfaceC1496780p3M write(byte[] bArr) {
        LJJIII(0, bArr, bArr.length);
        return this;
    }

    public C1496700p3E(C1496650p39 c1496650p39, C0X1A c0x1a) {
        this.LLILLL = c1496650p39;
        this.LLILLJJLI = c0x1a;
    }

    @Override // X.InterfaceC1496780p3M
    public final InterfaceC1496780p3M LJJJJZI(String str, Charset charset) {
        int length = str.length();
        if (length >= 0) {
            if (length <= str.length()) {
                if (Intrinsics.LJFF(charset, C1496830p3R.LIZ)) {
                    LJJZZIII(0, length, str);
                    return this;
                }
                byte[] bytes = str.substring(0, length).getBytes(charset);
                LJJIII(0, bytes, bytes.length);
                return this;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("endIndex > string.length: ");
            sbLIZ.append(length);
            sbLIZ.append(" > ");
            sbLIZ.append(str.length());
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            strLIZIZ.toString();
            throw new IllegalArgumentException(strLIZIZ);
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("endIndex < beginIndex: ");
        sbLIZ2.append(length);
        sbLIZ2.append(" < ");
        sbLIZ2.append(0);
        String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
        strLIZIZ2.toString();
        throw new IllegalArgumentException(strLIZIZ2);
    }

    @Override // X.InterfaceC1495590p1R
    public final void LLFF(C1496690p3D c1496690p3D, long j) {
        if (!this.LLILZ) {
            long jLIZIZ = this.LLILLJJLI.LIZIZ((int) j);
            if (jLIZIZ > 0) {
                this.LL.LLFF(c1496690p3D, jLIZIZ);
                return;
            }
            return;
        }
        "closed".toString();
        throw new IllegalStateException("closed");
    }

    @Override // X.InterfaceC1496780p3M
    public final InterfaceC1496780p3M LJJIII(int i, byte[] bArr, int i2) {
        if (!this.LLILZ) {
            long jLIZIZ = this.LLILLJJLI.LIZIZ(i2);
            if (jLIZIZ > 0) {
                this.LL.LJJJLL(i, bArr, (int) jLIZIZ);
            }
            return this;
        }
        "closed".toString();
        throw new IllegalStateException("closed");
    }

    @Override // X.InterfaceC1496780p3M
    public final InterfaceC1496780p3M LJJZZIII(int i, int i2, String str) {
        char cCharAt;
        char cCharAt2;
        if (!this.LLILZ) {
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
                            int iMin = Math.min(i2, SpeechEngineDefines.TTS_WORK_MODE_BOTH);
                            byte[] bArr = new byte[iMin];
                            int i3 = -i;
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
                            long jLIZIZ = this.LLILLJJLI.LIZIZ(i3 + i4);
                            if (jLIZIZ > 0) {
                                this.LL.LJJJLL(0, bArr, (int) jLIZIZ);
                            }
                        } else {
                            if (cCharAt3 < 2048) {
                                LIZ((cCharAt3 >> 6) | 192);
                                LIZ((cCharAt3 & '?') | 128);
                            } else if (cCharAt3 >= 55296 && cCharAt3 <= 57343) {
                                int i5 = i + 1;
                                if (i5 < i2) {
                                    cCharAt2 = str.charAt(i5);
                                } else {
                                    cCharAt2 = 0;
                                }
                                if (cCharAt3 <= 56319 && cCharAt2 >= 56320 && cCharAt2 <= 57343) {
                                    int i6 = (((cCharAt3 & 10239) << 10) | (9215 & cCharAt2)) + 65536;
                                    LIZ((i6 >> 18) | 240);
                                    LIZ(((i6 >> 12) & 63) | 128);
                                    LIZ(((i6 >> 6) & 63) | 128);
                                    LIZ((i6 & 63) | 128);
                                    i += 2;
                                } else {
                                    LIZ(63);
                                    i = i5;
                                }
                            } else {
                                LIZ((cCharAt3 >> '\f') | 224);
                                LIZ(((cCharAt3 >> 6) & 63) | 128);
                                LIZ((cCharAt3 & '?') | 128);
                            }
                            i++;
                        }
                    }
                    return this;
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
        "closed".toString();
        throw new IllegalStateException("closed");
    }
}
