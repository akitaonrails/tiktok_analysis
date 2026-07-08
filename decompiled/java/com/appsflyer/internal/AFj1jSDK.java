package com.appsflyer.internal;

import com.bytedance.speech.speechengine.SpeechEngineDefines;
import java.io.BufferedInputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes4.dex */
public final class AFj1jSDK extends FilterInputStream {
    public static final short AFInAppEventParameterName = (short) ((Math.sqrt(5.0d) - 1.0d) * Math.pow(2.0d, 15.0d));
    public int AFInAppEventType;
    public byte[] AFKeystoreWrapper;
    public int AFLogger;
    public int afInfoLog;
    public int d;
    public int e;
    public int i;
    public int registerClient;
    public int unregisterClient;
    public int v;
    public byte[] valueOf;
    public byte[] values;

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return false;
    }

    private int AFInAppEventType() throws IOException {
        if (this.AFLogger == Integer.MAX_VALUE) {
            this.AFLogger = ((FilterInputStream) this).in.read();
        }
        if (this.AFInAppEventType == 8) {
            byte[] bArr = this.values;
            int i = this.AFLogger;
            bArr[0] = (byte) i;
            if (i < 0) {
                throw new IllegalStateException("unexpected block size");
            }
            int i2 = 1;
            do {
                int i3 = ((FilterInputStream) this).in.read(this.values, i2, 8 - i2);
                if (i3 <= 0) {
                    throw new IllegalStateException("unexpected block size");
                }
                i2 += i3;
            } while (i2 < 8);
            valueOf();
            int i4 = ((FilterInputStream) this).in.read();
            this.AFLogger = i4;
            this.AFInAppEventType = 0;
            this.e = i4 < 0 ? 8 - (this.values[7] & 255) : 8;
        }
        return this.e;
    }

    private void valueOf() {
        if (this.d == 3) {
            byte[] bArr = this.values;
            System.arraycopy(bArr, 0, this.valueOf, 0, bArr.length);
        }
        byte[] bArr2 = this.values;
        int i = ((bArr2[0] << 24) & (-16777216)) + ((bArr2[1] << 16) & 16711680) + ((bArr2[2] << 8) & 65280) + (bArr2[3] & 255);
        int i2 = ((-16777216) & (bArr2[4] << 24)) + (16711680 & (bArr2[5] << 16)) + (65280 & (bArr2[6] << 8)) + (bArr2[7] & 255);
        int i3 = 0;
        while (true) {
            int i4 = this.registerClient;
            if (i3 >= i4) {
                break;
            }
            short s = AFInAppEventParameterName;
            i2 -= ((((i4 - i3) * s) + i) ^ ((i << 4) + this.v)) ^ ((i >>> 5) + this.afInfoLog);
            i -= (((i2 << 4) + this.unregisterClient) ^ ((s * (i4 - i3)) + i2)) ^ ((i2 >>> 5) + this.i);
            i3++;
        }
        byte[] bArr3 = this.values;
        bArr3[0] = (byte) (i >> 24);
        bArr3[1] = (byte) (i >> 16);
        bArr3[2] = (byte) (i >> 8);
        bArr3[3] = (byte) i;
        bArr3[4] = (byte) (i2 >> 24);
        bArr3[5] = (byte) (i2 >> 16);
        bArr3[6] = (byte) (i2 >> 8);
        bArr3[7] = (byte) i2;
        if (this.d == 3) {
            int i5 = 0;
            do {
                byte[] bArr4 = this.values;
                bArr4[i5] = (byte) (bArr4[i5] ^ this.AFKeystoreWrapper[i5]);
                i5++;
            } while (i5 < 8);
            byte[] bArr5 = this.valueOf;
            System.arraycopy(bArr5, 0, this.AFKeystoreWrapper, 0, bArr5.length);
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() throws IOException {
        AFInAppEventType();
        return this.e - this.AFInAppEventType;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        AFInAppEventType();
        int i = this.AFInAppEventType;
        if (i >= this.e) {
            return -1;
        }
        byte[] bArr = this.values;
        this.AFInAppEventType = i + 1;
        return bArr[i] & 255;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j) {
        long j2 = 0;
        while (j2 < j && read() != -1) {
            j2++;
        }
        return j2;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = i + i2;
        for (int i4 = i; i4 < i3; i4++) {
            AFInAppEventType();
            int i5 = this.AFInAppEventType;
            if (i5 >= this.e) {
                if (i4 == i) {
                    return -1;
                }
                return i2 - (i3 - i4);
            }
            byte[] bArr2 = this.values;
            this.AFInAppEventType = i5 + 1;
            bArr[i4] = bArr2[i5];
        }
        return i2;
    }

    public AFj1jSDK(InputStream inputStream, int[] iArr, int i, byte[] bArr, int i2, int i3) {
        super(new BufferedInputStream(inputStream, SpeechEngineDefines.TTS_WORK_MODE_BOTH));
        this.AFLogger = Integer.MAX_VALUE;
        this.values = new byte[8];
        this.AFKeystoreWrapper = new byte[8];
        this.valueOf = new byte[8];
        this.AFInAppEventType = 8;
        this.e = 8;
        this.registerClient = Math.min(Math.max(i2, 5), 16);
        this.d = i3;
        if (i3 == 3) {
            System.arraycopy(bArr, 0, this.AFKeystoreWrapper, 0, 8);
        }
        long j = ((((long) iArr[0]) & 4294967295L) << 32) | (4294967295L & ((long) iArr[1]));
        if (i == 0) {
            this.unregisterClient = (int) j;
            long j2 = j >> 3;
            short s = AFInAppEventParameterName;
            this.i = (int) ((((long) s) * j2) >> 32);
            this.v = (int) (j >> 32);
            this.afInfoLog = (int) (j2 + ((long) s));
            return;
        }
        int i4 = (int) j;
        this.unregisterClient = i4;
        this.i = i4 * i;
        this.v = i4 ^ i;
        this.afInfoLog = (int) (j >> 32);
    }
}
