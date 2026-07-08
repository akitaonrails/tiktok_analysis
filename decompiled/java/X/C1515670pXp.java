package X;

import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.app.api.INetworkChunk;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import java.io.IOException;
import java.io.InputStream;
import java.util.LinkedList;

/* JADX INFO: renamed from: X.0pXp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1515670pXp extends InputStream {
    public InputStream LL;
    public int LLILLJJLI;
    public int LLILLL;
    public byte[] LLILZ;
    public int LLILZIL;
    public int LLILZLL;
    public boolean LLIZ;
    public byte[] LLIZLLLIL;
    public int LLJ;
    public int LLJI;
    public boolean LLJIJIL;
    public int LLJILJIL;
    public int LLJILJILJ;
    public long LLJILLL;
    public C0POE<byte[]> LLJJ;
    public final LinkedList<Runnable> LLJJI;

    @Override // java.io.InputStream
    public final synchronized int available() {
        LIZIZ();
        int i = this.LLILZLL - this.LLILZIL;
        if (i > 0) {
            return i;
        }
        int iLJI = LJI(false);
        if (iLJI < 0) {
            return 0;
        }
        return iLJI;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        if (this.LLJIJIL) {
            return;
        }
        InputStream inputStream = this.LL;
        if (inputStream == null) {
            this.LLJIJIL = true;
            return;
        }
        try {
            C1495270p0v.LJI(inputStream);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        this.LL = null;
        this.LLJIJIL = true;
        return;
    }

    @Override // java.io.InputStream
    public final synchronized int read() {
        LIZIZ();
        if (this.LLILZIL >= this.LLILZLL && LJI(true) <= 0) {
            return -1;
        }
        byte[] bArr = this.LLILZ;
        int i = this.LLILZIL;
        this.LLILZIL = i + 1;
        return bArr[i] & 255;
    }

    public final C1515820pY4<byte[]> LIZ() {
        final C0PQA c0pqa = new C0PQA();
        C1515820pY4<byte[]> c1515820pY4 = new C1515820pY4<>(new InterfaceC644200POo<byte[]>() { // from class: X.0pXq
            @Override // X.InterfaceC644200POo
            public final void LIZ(C0POE<byte[]> c0poe) throws IOException {
                this.LIZIZ.LIZIZ();
                C1515670pXp c1515670pXp = this.LIZIZ;
                if (c1515670pXp.LLJILJIL != 0) {
                    c0poe.onComplete();
                    return;
                }
                c1515670pXp.LLJILJIL = 1;
                long jCurrentTimeMillis = System.currentTimeMillis();
                try {
                    INetworkChunk iNetworkChunk = (INetworkChunk) PluggableExtentionKt.pluggableSpi(INetworkChunk.class);
                    if (iNetworkChunk != null) {
                        iNetworkChunk.LIZIZ();
                    }
                    int i = 0;
                    int i2 = -1;
                    int iCurrentTimeMillis = 0;
                    while (true) {
                        int iLJII = this.LIZIZ.LJII();
                        i2++;
                        if (iLJII < 0) {
                            break;
                        }
                        byte[] bArr = new byte[iLJII];
                        C1515670pXp c1515670pXp2 = this.LIZIZ;
                        System.arraycopy(c1515670pXp2.LLILZ, c1515670pXp2.LLILZIL, bArr, i, iLJII);
                        long jCurrentTimeMillis2 = System.currentTimeMillis();
                        C1515670pXp c1515670pXp3 = this.LIZIZ;
                        long j = jCurrentTimeMillis;
                        C644110POf c644110POf = new C644110POf(c1515670pXp3.LLJILJILJ, jCurrentTimeMillis, c1515670pXp3.LLJILLL, jCurrentTimeMillis2, iLJII);
                        c644110POf.LJIIIIZZ = i2;
                        C0PQA c0pqa2 = c0pqa;
                        synchronized (c0pqa2) {
                            c0pqa2.LIZ.add(c644110POf);
                        }
                        c0poe.onNext(bArr);
                        this.LIZIZ.LLILZIL += iLJII;
                        iCurrentTimeMillis = (int) (((long) iCurrentTimeMillis) + (System.currentTimeMillis() - jCurrentTimeMillis2));
                        c644110POf.LIZ = iCurrentTimeMillis;
                        c644110POf.LJII = System.currentTimeMillis();
                        jCurrentTimeMillis = j;
                        i = 0;
                    }
                    c0poe.onComplete();
                    INetworkChunk iNetworkChunk2 = (INetworkChunk) PluggableExtentionKt.pluggableSpi(INetworkChunk.class);
                    if (iNetworkChunk2 != null) {
                        iNetworkChunk2.LIZ();
                    }
                    try {
                        C1495270p0v.LJI(this.LIZIZ.LL);
                    } catch (Throwable th) {
                    }
                } catch (Throwable th2) {
                    try {
                        TryCatchGuardChecker.doCheck(th2);
                        c0poe.onFailed(th2);
                        INetworkChunk iNetworkChunk3 = (INetworkChunk) PluggableExtentionKt.pluggableSpi(INetworkChunk.class);
                        if (iNetworkChunk3 != null) {
                            iNetworkChunk3.LIZ();
                        }
                        try {
                            C1495270p0v.LJI(this.LIZIZ.LL);
                        } catch (Throwable th3) {
                        }
                    } catch (Throwable th32) {
                        INetworkChunk iNetworkChunk4 = (INetworkChunk) PluggableExtentionKt.pluggableSpi(INetworkChunk.class);
                        if (iNetworkChunk4 != null) {
                            iNetworkChunk4.LIZ();
                        }
                        try {
                            C1495270p0v.LJI(this.LIZIZ.LL);
                            throw th32;
                        } finally {
                            TryCatchGuardChecker.doCheck(th32);
                        }
                    }
                }
            }
        });
        c1515820pY4.LLILZIL = c0pqa;
        return c1515820pY4;
    }

    public final void LIZIZ() throws IOException {
        if (this.LLJIJIL) {
            throw new IOException("stream is closed");
        }
    }

    public final int LJII() throws IOException {
        int i;
        if (this.LLJILJIL == 5) {
            return -1;
        }
        this.LLJILLL = System.currentTimeMillis();
        if (this.LLILZIL >= this.LLILZLL) {
            this.LLILZLL = 0;
            this.LLILZIL = 0;
        }
        while (this.LLJILJIL != 5) {
            LIZLLL(32);
            try {
                if (this.LLIZ) {
                    i = this.LLJI - this.LLJ;
                } else {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    InputStream inputStream = this.LL;
                    byte[] bArr = this.LLIZLLLIL;
                    int i2 = this.LLJI;
                    i = inputStream.read(bArr, i2, bArr.length - i2);
                    this.LLJILJILJ = (int) (((long) this.LLJILJILJ) + (System.currentTimeMillis() - jCurrentTimeMillis));
                }
                if (i < 0) {
                    throw new IOException("Premature EOF");
                }
                if (!this.LLIZ) {
                    this.LLJI += i;
                }
                this.LLIZ = LJFF(true);
                int i3 = this.LLILZLL;
                if (i3 > 0 && this.LLJILJIL != 2) {
                    return i3 - this.LLILZIL;
                }
            } catch (IOException e) {
                TryCatchGuardChecker.doCheck(e);
                throw e;
            }
        }
        return -1;
    }

    public C1515670pXp(InputStream inputStream) {
        this.LLILZ = new byte[SpeechEngineDefines.TTS_WORK_MODE_BOTH];
        this.LLIZLLLIL = new byte[10240];
        this.LLJJI = new LinkedList<>();
        this.LL = inputStream;
    }

    public final void LIZLLL(int i) {
        int i2 = this.LLJI;
        int i3 = i2 + i;
        byte[] bArr = this.LLIZLLLIL;
        if (i3 > bArr.length) {
            int i4 = this.LLJ;
            int i5 = i2 - i4;
            int i6 = i + i5;
            if (i6 > bArr.length) {
                byte[] bArr2 = new byte[i6];
                if (i5 > 0) {
                    System.arraycopy(bArr, i4, bArr2, 0, i5);
                }
                this.LLIZLLLIL = bArr2;
            } else if (i5 > 0) {
                System.arraycopy(bArr, i4, bArr, 0, i5);
            }
            this.LLJI = i5;
            this.LLJ = 0;
        }
    }

    public final boolean LJFF(boolean z) throws IOException {
        int i;
        while (true) {
            int i2 = this.LLJILJIL;
            if (i2 == 5) {
                return false;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        if (i2 == 4) {
                            int i3 = this.LLJ;
                            while (true) {
                                i = this.LLJI;
                                if (i3 >= i || this.LLIZLLLIL[i3] == 10) {
                                    break;
                                }
                                i3++;
                            }
                            if (i3 >= i) {
                                return false;
                            }
                            int i4 = this.LLJ;
                            if (i3 != i4) {
                                if (this.LLIZLLLIL[i3 - 1] == 13) {
                                    if (i3 == i4 + 1) {
                                        this.LLJILJIL = 5;
                                        InputStream inputStream = this.LL;
                                        if (inputStream != null) {
                                            try {
                                                C1495270p0v.LJI(inputStream);
                                            } catch (Throwable th) {
                                                TryCatchGuardChecker.doCheck(th);
                                            }
                                            this.LL = null;
                                        }
                                        return false;
                                    }
                                    this.LLJ = i3 + 1;
                                } else {
                                    throw new IOException("LF should be proceeded by CR");
                                }
                            } else {
                                throw new IOException("LF should be proceeded by CR");
                            }
                        } else {
                            continue;
                        }
                    } else {
                        int i5 = this.LLJ;
                        int i6 = i5 + 1;
                        if (i6 >= this.LLJI) {
                            return false;
                        }
                        byte[] bArr = this.LLIZLLLIL;
                        if (bArr[i5] == 13) {
                            if (bArr[i6] == 10) {
                                this.LLJ = i5 + 2;
                                this.LLJILJIL = 1;
                                if (z) {
                                    return true;
                                }
                            } else {
                                throw new IOException("missing LF");
                            }
                        } else {
                            throw new IOException("missing CR");
                        }
                    }
                } else {
                    int i7 = this.LLJ;
                    int i8 = this.LLJI;
                    if (i7 >= i8) {
                        return false;
                    }
                    int iMin = Math.min(this.LLILLJJLI - this.LLILLL, i8 - i7);
                    byte[] bArr2 = this.LLILZ;
                    int length = bArr2.length;
                    int i9 = this.LLILZLL;
                    if (length < i9 + iMin) {
                        int i10 = this.LLILZIL;
                        int i11 = i9 - i10;
                        int i12 = i11 + iMin;
                        if (bArr2.length < i12) {
                            byte[] bArr3 = new byte[i12];
                            System.arraycopy(bArr2, i10, bArr3, 0, i11);
                            this.LLILZ = bArr3;
                        } else {
                            System.arraycopy(bArr2, i10, bArr2, 0, i11);
                        }
                        this.LLILZIL = 0;
                        this.LLILZLL = i11;
                    }
                    System.arraycopy(this.LLIZLLLIL, this.LLJ, this.LLILZ, this.LLILZLL, iMin);
                    this.LLJ += iMin;
                    this.LLILZLL += iMin;
                    int i13 = this.LLILLL + iMin;
                    this.LLILLL = i13;
                    if (this.LLILLJJLI - i13 > 0) {
                        return false;
                    }
                    this.LLJILJIL = 3;
                }
            } else {
                int i14 = this.LLJ;
                do {
                    int i15 = this.LLJI;
                    if (i14 < i15 && this.LLIZLLLIL[i14] != 10) {
                        i14++;
                    } else {
                        if (i14 >= i15) {
                            return false;
                        }
                        byte[] bArr4 = this.LLIZLLLIL;
                        int i16 = this.LLJ;
                        String str = new String(bArr4, i16, (i14 - i16) + 1, "US-ASCII");
                        int i17 = 0;
                        while (i17 < str.length() && Character.digit(str.charAt(i17), 16) != -1) {
                            i17++;
                        }
                        try {
                            int i18 = CastIntegerProtector.parseInt(str.substring(0, i17), 16);
                            this.LLILLJJLI = i18;
                            this.LLJ = i14 + 1;
                            this.LLILLL = 0;
                            if (i18 > 0) {
                                this.LLJILJIL = 2;
                                byte[] bArr5 = this.LLILZ;
                                if (bArr5.length < i18) {
                                    int i19 = this.LLILZLL;
                                    int i20 = this.LLILZIL;
                                    int i21 = i19 - i20;
                                    byte[] bArr6 = new byte[i18 + i21];
                                    if (i21 > 0) {
                                        System.arraycopy(bArr5, i20, bArr6, 0, i21);
                                    }
                                    this.LLILZ = bArr6;
                                    this.LLILZIL = 0;
                                    this.LLILZLL = i21;
                                }
                            } else {
                                this.LLJILJIL = 4;
                            }
                        } catch (NumberFormatException e) {
                            TryCatchGuardChecker.doCheck(e);
                            throw new IOException("Bogus chunk size");
                        }
                    }
                } while (i14 - this.LLJ < 2050);
                throw new IOException("Chunk header too long");
            }
        }
    }

    public final int LJI(boolean z) throws IOException {
        if (this.LLJILJIL == 5) {
            return -1;
        }
        if (this.LLILZIL >= this.LLILZLL) {
            this.LLILZLL = 0;
            this.LLILZIL = 0;
        }
        if (!z) {
            int iAvailable = this.LL.available();
            if (iAvailable > 0) {
                LIZLLL(iAvailable);
                try {
                    int i = this.LL.read(this.LLIZLLLIL, this.LLJI, iAvailable);
                    if (i < 0) {
                        return -1;
                    }
                    this.LLJI += i;
                    LJFF(false);
                } catch (IOException e) {
                    TryCatchGuardChecker.doCheck(e);
                    throw e;
                }
            }
            return this.LLILZLL - this.LLILZIL;
        }
        while (this.LLJILJIL != 5) {
            LIZLLL(32);
            try {
                InputStream inputStream = this.LL;
                byte[] bArr = this.LLIZLLLIL;
                int i2 = this.LLJI;
                int i3 = inputStream.read(bArr, i2, bArr.length - i2);
                if (i3 >= 0) {
                    this.LLJI += i3;
                    LJFF(false);
                    int i4 = this.LLILZLL;
                    if (i4 > 0) {
                        return i4 - this.LLILZIL;
                    }
                } else {
                    throw new IOException("Premature EOF");
                }
            } catch (IOException e2) {
                TryCatchGuardChecker.doCheck(e2);
                throw e2;
            }
        }
        return -1;
    }

    public C1515670pXp(InputStream inputStream, int i) {
        this.LLILZ = new byte[SpeechEngineDefines.TTS_WORK_MODE_BOTH];
        this.LLIZLLLIL = new byte[10240];
        this.LLJJI = new LinkedList<>();
        this.LL = inputStream;
        this.LLIZLLLIL = new byte[SpeechEngineDefines.ASR_WORK_MODE_OFFLINE];
    }

    @Override // java.io.InputStream
    public final synchronized int read(byte[] bArr, int i, int i2) {
        int i3;
        LIZIZ();
        if (i >= 0 && i <= bArr.length && i2 >= 0 && (i3 = i + i2) <= bArr.length && i3 >= 0) {
            int i4 = 0;
            if (i2 == 0) {
                return 0;
            }
            int iLJI = this.LLILZLL - this.LLILZIL;
            if (iLJI <= 0) {
                if (this.LLJILJIL == 2) {
                    int i5 = this.LLILLJJLI - this.LLILLL;
                    try {
                        if (i5 < i2) {
                            i2 = i5;
                            if (i5 > 0) {
                            }
                            return i4;
                        }
                        i4 = this.LL.read(bArr, i, i2);
                        if (i4 > 0) {
                            int i6 = this.LLILLL + i4;
                            this.LLILLL = i6;
                            if (i6 >= this.LLILLJJLI) {
                                this.LLJILJIL = 3;
                            }
                            return i4;
                        }
                        throw new IOException("Premature EOF");
                    } catch (IOException e) {
                        TryCatchGuardChecker.doCheck(e);
                        throw e;
                    }
                }
                iLJI = LJI(true);
                if (iLJI < 0) {
                    return -1;
                }
            }
            if (iLJI < i2) {
                i2 = iLJI;
            }
            System.arraycopy(this.LLILZ, this.LLILZIL, bArr, i, i2);
            this.LLILZIL += i2;
            return i2;
        }
        throw new IndexOutOfBoundsException();
    }
}
