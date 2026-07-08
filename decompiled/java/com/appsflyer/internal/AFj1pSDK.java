package com.appsflyer.internal;

import com.bytedance.speech.speechengine.SpeechEngineDefines;
import java.io.BufferedInputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes31.dex */
public final class AFj1pSDK extends FilterInputStream {
    public final int AFLogger;
    public int afInfoLog;
    public final int[] d;
    public final byte[][] e;
    public final byte[] force;
    public int i;
    public final int[] registerClient;
    public final byte[] unregisterClient;
    public int v;
    public static final byte[] AFInAppEventParameterName = AFj1hSDK.AFKeystoreWrapper;
    public static final int[] valueOf = AFj1hSDK.AFInAppEventType;
    public static final int[] AFInAppEventType = AFj1hSDK.valueOf;
    public static final int[] AFKeystoreWrapper = AFj1hSDK.AFInAppEventParameterName;
    public static final int[] values = AFj1hSDK.values;

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void reset() {
    }

    private int AFKeystoreWrapper() throws IOException {
        if (this.afInfoLog == Integer.MAX_VALUE) {
            this.afInfoLog = ((FilterInputStream) this).in.read();
        }
        if (this.v == 16) {
            byte[] bArr = this.unregisterClient;
            int i = this.afInfoLog;
            bArr[0] = (byte) i;
            if (i < 0) {
                throw new IllegalStateException("unexpected block size");
            }
            int i2 = 1;
            do {
                int i3 = ((FilterInputStream) this).in.read(this.unregisterClient, i2, 16 - i2);
                if (i3 <= 0) {
                    throw new IllegalStateException("unexpected block size");
                }
                i2 += i3;
            } while (i2 < 16);
            AFInAppEventParameterName(this.unregisterClient, this.force);
            int i4 = ((FilterInputStream) this).in.read();
            this.afInfoLog = i4;
            this.v = 0;
            this.i = i4 < 0 ? 16 - (this.force[15] & 255) : 16;
        }
        return this.i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() throws IOException {
        AFKeystoreWrapper();
        return this.i - this.v;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        AFKeystoreWrapper();
        int i = this.v;
        if (i >= this.i) {
            return -1;
        }
        byte[] bArr = this.force;
        this.v = i + 1;
        return bArr[i] & 255;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        super.close();
    }

    public static byte[][] valueOf(byte[][] bArr) {
        byte[][] bArr2 = new byte[bArr.length][];
        for (int i = 0; i < bArr.length; i++) {
            bArr2[i] = new byte[bArr[i].length];
            int i2 = 0;
            while (true) {
                byte[] bArr3 = bArr[i];
                if (i2 < bArr3.length) {
                    bArr2[i][bArr3[i2]] = (byte) i2;
                    i2++;
                }
            }
        }
        return bArr2;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void mark(int i) {
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j) {
        long j2 = 0;
        while (j2 < j && read() != -1) {
            j2++;
        }
        return j2;
    }

    private void AFInAppEventParameterName(byte[] bArr, byte[] bArr2) {
        int[] iArr = this.registerClient;
        char c = 1;
        int i = (bArr[0] << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255);
        int[] iArr2 = this.d;
        iArr[0] = i ^ iArr2[0];
        iArr[1] = ((((bArr[4] << 24) | ((bArr[5] & 255) << 16)) | ((bArr[6] & 255) << 8)) | (bArr[7] & 255)) ^ iArr2[1];
        iArr[2] = ((((bArr[8] << 24) | ((bArr[9] & 255) << 16)) | ((bArr[10] & 255) << 8)) | (bArr[11] & 255)) ^ iArr2[2];
        iArr[3] = iArr2[3] ^ (((((bArr[13] & 255) << 16) | (bArr[12] << 24)) | ((bArr[14] & 255) << 8)) | (bArr[15] & 255));
        int i2 = 4;
        int i3 = 1;
        while (i3 < this.AFLogger) {
            int[] iArr3 = valueOf;
            int[] iArr4 = this.registerClient;
            byte[][] bArr3 = this.e;
            byte[] bArr4 = bArr3[0];
            int i4 = iArr3[iArr4[bArr4[0]] >>> 24];
            int[] iArr5 = AFInAppEventType;
            byte[] bArr5 = bArr3[c];
            int i5 = i4 ^ iArr5[(iArr4[bArr5[0]] >>> 16) & 255];
            int[] iArr6 = AFKeystoreWrapper;
            byte[] bArr6 = bArr3[2];
            int i6 = iArr6[(iArr4[bArr6[0]] >>> 8) & 255] ^ i5;
            int[] iArr7 = values;
            byte[] bArr7 = bArr3[3];
            int i7 = iArr7[iArr4[bArr7[0]] & 255] ^ i6;
            int[] iArr8 = this.d;
            int i8 = i7 ^ iArr8[i2];
            int i9 = ((iArr6[(iArr4[bArr6[c]] >>> 8) & 255] ^ (iArr3[iArr4[bArr4[c]] >>> 24] ^ iArr5[(iArr4[bArr5[c]] >>> 16) & 255])) ^ iArr7[iArr4[bArr7[c]] & 255]) ^ iArr8[i2 + 1];
            int i10 = (((iArr5[(iArr4[bArr5[2]] >>> 16) & 255] ^ iArr3[iArr4[bArr4[2]] >>> 24]) ^ iArr6[(iArr4[bArr6[2]] >>> 8) & 255]) ^ iArr7[iArr4[bArr7[2]] & 255]) ^ iArr8[i2 + 2];
            int i11 = (((iArr3[iArr4[bArr4[3]] >>> 24] ^ iArr5[(iArr4[bArr5[3]] >>> 16) & 255]) ^ iArr6[(iArr4[bArr6[3]] >>> 8) & 255]) ^ iArr7[iArr4[bArr7[3]] & 255]) ^ iArr8[i2 + 3];
            iArr4[0] = i8;
            iArr4[1] = i9;
            iArr4[2] = i10;
            iArr4[3] = i11;
            i3++;
            i2 += 4;
            c = 1;
        }
        int[] iArr9 = this.d;
        int i12 = iArr9[i2];
        byte[] bArr8 = AFInAppEventParameterName;
        int[] iArr10 = this.registerClient;
        byte[][] bArr9 = this.e;
        byte[] bArr10 = bArr9[0];
        bArr2[0] = (byte) (bArr8[iArr10[bArr10[0]] >>> 24] ^ (i12 >>> 24));
        byte[] bArr11 = bArr9[1];
        bArr2[1] = (byte) (bArr8[(iArr10[bArr11[0]] >>> 16) & 255] ^ (i12 >>> 16));
        byte[] bArr12 = bArr9[2];
        bArr2[2] = (byte) (bArr8[(iArr10[bArr12[0]] >>> 8) & 255] ^ (i12 >>> 8));
        byte[] bArr13 = bArr9[3];
        bArr2[3] = (byte) (bArr8[iArr10[bArr13[0]] & 255] ^ i12);
        int i13 = iArr9[i2 + 1];
        bArr2[4] = (byte) (bArr8[iArr10[bArr10[1]] >>> 24] ^ (i13 >>> 24));
        bArr2[5] = (byte) (bArr8[(iArr10[bArr11[1]] >>> 16) & 255] ^ (i13 >>> 16));
        bArr2[6] = (byte) (bArr8[(iArr10[bArr12[1]] >>> 8) & 255] ^ (i13 >>> 8));
        bArr2[7] = (byte) (i13 ^ bArr8[iArr10[bArr13[1]] & 255]);
        int i14 = iArr9[i2 + 2];
        bArr2[8] = (byte) (bArr8[iArr10[bArr10[2]] >>> 24] ^ (i14 >>> 24));
        bArr2[9] = (byte) (bArr8[(iArr10[bArr11[2]] >>> 16) & 255] ^ (i14 >>> 16));
        bArr2[10] = (byte) (bArr8[(iArr10[bArr12[2]] >>> 8) & 255] ^ (i14 >>> 8));
        bArr2[11] = (byte) (i14 ^ bArr8[iArr10[bArr13[2]] & 255]);
        int i15 = iArr9[i2 + 3];
        bArr2[12] = (byte) (bArr8[iArr10[bArr10[3]] >>> 24] ^ (i15 >>> 24));
        bArr2[13] = (byte) (bArr8[(iArr10[bArr11[3]] >>> 16) & 255] ^ (i15 >>> 16));
        bArr2[14] = (byte) (bArr8[(iArr10[bArr12[3]] >>> 8) & 255] ^ (i15 >>> 8));
        bArr2[15] = (byte) (i15 ^ bArr8[iArr10[bArr13[3]] & 255]);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = i + i2;
        for (int i4 = i; i4 < i3; i4++) {
            AFKeystoreWrapper();
            int i5 = this.v;
            if (i5 >= this.i) {
                if (i4 == i) {
                    return -1;
                }
                return i2 - (i3 - i4);
            }
            byte[] bArr2 = this.force;
            this.v = i5 + 1;
            bArr[i4] = bArr2[i5];
        }
        return i2;
    }

    public AFj1pSDK(InputStream inputStream, int i, byte[] bArr, byte[][] bArr2) {
        super(new BufferedInputStream(inputStream, SpeechEngineDefines.TTS_WORK_MODE_BOTH));
        this.registerClient = new int[4];
        this.unregisterClient = new byte[16];
        this.force = new byte[16];
        this.afInfoLog = Integer.MAX_VALUE;
        this.v = 16;
        this.i = 16;
        this.AFLogger = i;
        this.d = AFj1hSDK.values(bArr, i);
        this.e = valueOf(bArr2);
    }
}
