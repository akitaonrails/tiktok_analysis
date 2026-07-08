package com.appsflyer.internal;

/* JADX INFO: loaded from: classes31.dex */
public final class AFj1hSDK {
    public static byte[] e = new byte[256];
    public static final byte[] AFKeystoreWrapper = new byte[256];
    public static final int[] AFInAppEventType = new int[256];
    public static final int[] valueOf = new int[256];
    public static final int[] AFInAppEventParameterName = new int[256];
    public static final int[] values = new int[256];
    public static int[] unregisterClient = new int[10];

    static {
        byte[] bArr;
        int i;
        byte b = 1;
        byte b2 = 1;
        do {
            b = (byte) (((b & 128) != 0 ? 27 : 0) ^ ((b << 1) ^ b));
            byte b3 = (byte) (b2 ^ (b2 << 1));
            byte b4 = (byte) (b3 ^ (b3 << 2));
            byte b5 = (byte) (b4 ^ (b4 << 4));
            b2 = (byte) (b5 ^ ((b5 & 128) != 0 ? (byte) 9 : (byte) 0));
            bArr = e;
            i = b & 255;
            int i2 = b2 & 255;
            bArr[i] = (byte) (((((b2 ^ 99) ^ ((i2 << 1) | (i2 >> 7))) ^ ((i2 << 2) | (i2 >> 6))) ^ ((i2 << 3) | (i2 >> 5))) ^ ((i2 >> 4) | (i2 << 4)));
        } while (i != 1);
        bArr[0] = 99;
        int i3 = 0;
        do {
            int i4 = e[i3] & 255;
            AFKeystoreWrapper[i4] = (byte) i3;
            int i5 = i3 << 1;
            if (i5 >= 256) {
                i5 ^= 283;
            }
            int i6 = i5 << 1;
            if (i6 >= 256) {
                i6 ^= 283;
            }
            int i7 = i6 << 1;
            if (i7 >= 256) {
                i7 ^= 283;
            }
            int i8 = i7 ^ i3;
            int i9 = ((i5 ^ (i6 ^ i7)) << 24) | (i8 << 16) | ((i8 ^ i6) << 8) | (i8 ^ i5);
            AFInAppEventType[i4] = i9;
            valueOf[i4] = (i9 >>> 8) | (i9 << 24);
            AFInAppEventParameterName[i4] = (i9 >>> 16) | (i9 << 16);
            values[i4] = (i9 << 8) | (i9 >>> 24);
            i3++;
        } while (i3 < 256);
        unregisterClient[0] = 16777216;
        int i10 = 1;
        int i11 = 1;
        do {
            i11 <<= 1;
            if (i11 >= 256) {
                i11 ^= 283;
            }
            unregisterClient[i10] = i11 << 24;
            i10++;
        } while (i10 < 10);
    }

    public static byte[][] AFInAppEventType(int i) {
        byte[][] bArr = new byte[4][];
        int i2 = 0;
        do {
            int i3 = i >>> (i2 << 3);
            bArr[i2] = new byte[]{(byte) (i3 & 3), (byte) ((i3 >> 2) & 3), (byte) ((i3 >> 4) & 3), (byte) ((i3 >> 6) & 3)};
            i2++;
        } while (i2 < 4);
        return bArr;
    }

    public static int[] values(byte[] bArr, int i) {
        if (bArr.length == 16) {
            int i2 = 4;
            int i3 = (i + 1) * 4;
            int[] iArr = new int[i3];
            int i4 = 0;
            int i5 = 0;
            do {
                int i6 = i5 + 1;
                int i7 = bArr[i5] << 24;
                int i8 = i6 + 1;
                int i9 = i7 | ((bArr[i6] & 255) << 16);
                int i10 = i8 + 1;
                int i11 = i9 | ((bArr[i8] & 255) << 8);
                i5 = i10 + 1;
                iArr[i4] = i11 | (bArr[i10] & 255);
                i4++;
            } while (i4 < 4);
            int i12 = 4;
            int i13 = 0;
            int i14 = 0;
            while (i12 < i3) {
                int i15 = iArr[i12 - 1];
                if (i13 == 0) {
                    byte[] bArr2 = e;
                    i15 = ((bArr2[i15 >>> 24] & 255) | (((bArr2[(i15 >>> 16) & 255] << 24) | ((bArr2[(i15 >>> 8) & 255] & 255) << 16)) | ((bArr2[i15 & 255] & 255) << 8))) ^ unregisterClient[i14];
                    i13 = 4;
                    i14++;
                }
                iArr[i12] = i15 ^ iArr[i12 - 4];
                i12++;
                i13--;
            }
            if (bArr.length == 16) {
                int[] iArr2 = new int[i3];
                int i16 = i * 4;
                int i17 = i16 + 1;
                iArr2[0] = iArr[i16];
                int i18 = i17 + 1;
                int i19 = iArr[i17];
                iArr2[1] = i19;
                int i20 = i18 + 1;
                iArr2[2] = iArr[i18];
                iArr2[3] = iArr[i20];
                int i21 = i20 - 7;
                for (int i22 = 1; i22 < i; i22++) {
                    int i23 = i21 + 1;
                    int i24 = iArr[i21];
                    int i25 = i2 + 1;
                    int[] iArr3 = AFInAppEventType;
                    byte[] bArr3 = e;
                    int i26 = iArr3[bArr3[i24 >>> 24] & 255];
                    int[] iArr4 = valueOf;
                    int i27 = i26 ^ iArr4[bArr3[(i24 >>> 16) & 255] & 255];
                    int[] iArr5 = AFInAppEventParameterName;
                    int i28 = i27 ^ iArr5[bArr3[(i24 >>> 8) & 255] & 255];
                    int[] iArr6 = values;
                    iArr2[i2] = iArr6[bArr3[i24 & 255] & 255] ^ i28;
                    int i29 = i23 + 1;
                    int i30 = iArr[i23];
                    int i31 = i25 + 1;
                    iArr2[i25] = iArr6[bArr3[i30 & 255] & 255] ^ ((iArr3[bArr3[i30 >>> 24] & 255] ^ iArr4[bArr3[(i30 >>> 16) & 255] & 255]) ^ iArr5[bArr3[(i30 >>> 8) & 255] & 255]);
                    int i32 = i29 + 1;
                    int i33 = iArr[i29];
                    int i34 = i31 + 1;
                    iArr2[i31] = iArr6[bArr3[i33 & 255] & 255] ^ ((iArr3[bArr3[i33 >>> 24] & 255] ^ iArr4[bArr3[(i33 >>> 16) & 255] & 255]) ^ iArr5[bArr3[(i33 >>> 8) & 255] & 255]);
                    int i35 = iArr[i32];
                    i2 = i34 + 1;
                    iArr2[i34] = iArr6[bArr3[i35 & 255] & 255] ^ ((iArr3[bArr3[i35 >>> 24] & 255] ^ iArr4[bArr3[(i35 >>> 16) & 255] & 255]) ^ iArr5[bArr3[(i35 >>> 8) & 255] & 255]);
                    i21 = i32 - 7;
                }
                int i36 = i2 + 1;
                int i37 = i21 + 1;
                iArr2[i2] = iArr[i21];
                int i38 = i36 + 1;
                int i39 = i37 + 1;
                iArr2[i36] = iArr[i37];
                iArr2[i38] = iArr[i39];
                iArr2[i38 + 1] = iArr[i39 + 1];
                return iArr2;
            }
            throw new IllegalArgumentException();
        }
        throw new IllegalArgumentException();
    }
}
