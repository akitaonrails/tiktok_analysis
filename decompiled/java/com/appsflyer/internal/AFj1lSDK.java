package com.appsflyer.internal;

import com.bytedance.speech.speechengine.SpeechEngineDefines;
import java.io.BufferedInputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes4.dex */
public final class AFj1lSDK extends FilterInputStream {
    public byte[] AFInAppEventParameterName;
    public byte[] AFInAppEventType;
    public final int AFKeystoreWrapper;
    public int AFLogger;
    public int d;
    public int e;
    public int registerClient;
    public int[] unregisterClient;
    public AFj1nSDK valueOf;
    public byte[] values;

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return false;
    }

    private int AFInAppEventParameterName() throws IOException {
        if (this.d == Integer.MAX_VALUE) {
            this.d = ((FilterInputStream) this).in.read();
        }
        if (this.AFLogger == 8) {
            byte[] bArr = this.values;
            int i = this.d;
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
            values();
            int i4 = ((FilterInputStream) this).in.read();
            this.d = i4;
            this.AFLogger = 0;
            this.e = i4 < 0 ? 8 - (this.values[7] & 255) : 8;
        }
        return this.e;
    }

    private void values() {
        if (this.registerClient == 2) {
            byte[] bArr = this.values;
            System.arraycopy(bArr, 0, this.AFInAppEventParameterName, 0, bArr.length);
        }
        byte[] bArr2 = this.values;
        int i = ((bArr2[0] << 24) & (-16777216)) + ((bArr2[1] << 16) & 16711680) + ((bArr2[2] << 8) & 65280) + (bArr2[3] & 255);
        int i2 = ((-16777216) & (bArr2[4] << 24)) + (16711680 & (bArr2[5] << 16)) + (65280 & (bArr2[6] << 8)) + (bArr2[7] & 255);
        int i3 = this.AFKeystoreWrapper;
        AFj1nSDK aFj1nSDK = this.valueOf;
        AFj1oSDK.values(i, i2, false, i3, aFj1nSDK.values, aFj1nSDK.valueOf, this.unregisterClient);
        int[] iArr = this.unregisterClient;
        int i4 = iArr[0];
        int i5 = iArr[1];
        byte[] bArr3 = this.values;
        bArr3[0] = (byte) (i4 >> 24);
        bArr3[1] = (byte) (i4 >> 16);
        bArr3[2] = (byte) (i4 >> 8);
        bArr3[3] = (byte) i4;
        bArr3[4] = (byte) (i5 >> 24);
        bArr3[5] = (byte) (i5 >> 16);
        bArr3[6] = (byte) (i5 >> 8);
        bArr3[7] = (byte) i5;
        if (this.registerClient == 2) {
            int i6 = 0;
            do {
                byte[] bArr4 = this.values;
                bArr4[i6] = (byte) (bArr4[i6] ^ this.AFInAppEventType[i6]);
                i6++;
            } while (i6 < 8);
            byte[] bArr5 = this.AFInAppEventParameterName;
            System.arraycopy(bArr5, 0, this.AFInAppEventType, 0, bArr5.length);
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() throws IOException {
        AFInAppEventParameterName();
        return this.e - this.AFLogger;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        AFInAppEventParameterName();
        int i = this.AFLogger;
        if (i >= this.e) {
            return -1;
        }
        byte[] bArr = this.values;
        this.AFLogger = i + 1;
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
            AFInAppEventParameterName();
            int i5 = this.AFLogger;
            if (i5 >= this.e) {
                if (i4 == i) {
                    return -1;
                }
                return i2 - (i3 - i4);
            }
            byte[] bArr2 = this.values;
            this.AFLogger = i5 + 1;
            bArr[i4] = bArr2[i5];
        }
        return i2;
    }

    public AFj1lSDK(InputStream inputStream, int[] iArr, byte[] bArr, int i, boolean z, int i2) {
        super(new BufferedInputStream(inputStream, SpeechEngineDefines.TTS_WORK_MODE_BOTH));
        this.d = Integer.MAX_VALUE;
        int iMin = Math.min(Math.max(i, 3), 16);
        this.AFKeystoreWrapper = iMin;
        this.values = new byte[8];
        byte[] bArr2 = new byte[8];
        this.AFInAppEventType = bArr2;
        this.AFInAppEventParameterName = new byte[8];
        this.unregisterClient = new int[2];
        this.AFLogger = 8;
        this.e = 8;
        this.registerClient = i2;
        if (i2 == 2) {
            System.arraycopy(bArr, 0, bArr2, 0, 8);
        }
        this.valueOf = new AFj1nSDK(iArr, iMin, true, false);
    }
}
