package X;

/* JADX INFO: renamed from: X.14Bj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20224114Bj {
    public static int[] LIZIZ(byte[] bArr) {
        int length = bArr.length / 4;
        int[] iArr = new int[length];
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            int i3 = i + 1;
            int i4 = bArr[i] & 255;
            int i5 = i3 + 1;
            int i6 = bArr[i3] & 255;
            int i7 = i5 + 1;
            int i8 = bArr[i5] & 255;
            i = i7 + 1;
            iArr[i2] = (i4 << 24) | (i6 << 16) | (i8 << 8) | ((bArr[i7] & 255) << 0);
        }
        return iArr;
    }

    public static byte[] LIZ(byte[] bArr, byte[] bArr2, byte[] bArr3, EnumC20223914Bh enumC20223914Bh) {
        int length;
        C20224214Bk c20224214Bk = new C20224214Bk(bArr2);
        int[] iArrLIZIZ = LIZIZ(bArr);
        int length2 = iArrLIZIZ.length;
        byte[] bArr4 = new byte[16];
        char c = 0;
        if (bArr3 != null) {
            if (bArr3.length < 16) {
                length = bArr3.length;
            } else {
                length = 16;
            }
            System.arraycopy(bArr3, 0, bArr4, 0, length);
        }
        int[] iArrLIZIZ2 = LIZIZ(bArr4);
        int i = iArrLIZIZ2[0];
        char c2 = 1;
        int i2 = iArrLIZIZ2[1];
        char c3 = 2;
        int i3 = iArrLIZIZ2[2];
        char c4 = 3;
        int i4 = iArrLIZIZ2[3];
        C1846520y9S c1846520y9SLJIILIIL = C13LZ.LJIILIIL(C13LZ.LJIILJJIL(0, length2), 4);
        int i5 = c1846520y9SLJIILIIL.LL;
        int i6 = c1846520y9SLJIILIIL.LLILLJJLI;
        int i7 = c1846520y9SLJIILIIL.LLILLL;
        if (i7 <= 0 ? !(i7 >= 0 || i6 > i5) : i5 <= i6) {
            while (true) {
                int i8 = iArrLIZIZ[i5];
                int i9 = i5 + 1;
                int i10 = iArrLIZIZ[i9];
                int i11 = i5 + 2;
                int i12 = iArrLIZIZ[i11];
                int i13 = i5 + 3;
                int i14 = iArrLIZIZ[i13];
                iArrLIZIZ[i9] = i14;
                iArrLIZIZ[i13] = i10;
                int[] iArr = c20224214Bk.LJFF;
                int[] iArr2 = C20224214Bk.LJIIL;
                int[] iArr3 = C20224214Bk.LJIILIIL;
                int[] iArr4 = C20224214Bk.LJIILJJIL;
                int[] iArr5 = C20224214Bk.LJIILL;
                int[] iArr6 = C20224214Bk.LJII;
                int i15 = iArrLIZIZ[i5] ^ iArr[c];
                int i16 = iArrLIZIZ[i9] ^ iArr[c2];
                int i17 = iArrLIZIZ[i11] ^ iArr[c3];
                int i18 = iArr[c4] ^ i10;
                int i19 = c20224214Bk.LIZJ;
                int i20 = 1;
                int i21 = 4;
                while (i20 < i19) {
                    int i22 = i21 + 1;
                    int i23 = iArr[i21] ^ (((iArr3[(i16 >>> 16) & 255] ^ iArr2[(i15 >>> 24) & 255]) ^ iArr4[(i17 >>> 8) & 255]) ^ iArr5[(i18 >>> 0) & 255]);
                    int i24 = i22 + 1;
                    int i25 = (((iArr3[(i17 >>> 16) & 255] ^ iArr2[(i16 >>> 24) & 255]) ^ iArr4[(i18 >>> 8) & 255]) ^ iArr5[(i15 >>> 0) & 255]) ^ iArr[i22];
                    int i26 = i24 + 1;
                    int i27 = (((iArr3[(i18 >>> 16) & 255] ^ iArr2[(i17 >>> 24) & 255]) ^ iArr4[(i15 >>> 8) & 255]) ^ iArr5[(i16 >>> 0) & 255]) ^ iArr[i24];
                    i21 = i26 + 1;
                    i18 = (((iArr3[(i15 >>> 16) & 255] ^ iArr2[(i18 >>> 24) & 255]) ^ iArr4[(i16 >>> 8) & 255]) ^ iArr5[(i17 >>> 0) & 255]) ^ iArr[i26];
                    i20++;
                    i16 = i25;
                    i15 = i23;
                    i17 = i27;
                }
                int i28 = i21 + 1;
                int i29 = ((((iArr6[(i15 >>> 24) & 255] << 24) | (iArr6[(i16 >>> 16) & 255] << 16)) | (iArr6[(i17 >>> 8) & 255] << 8)) | iArr6[(i18 >>> 0) & 255]) ^ iArr[i21];
                int i30 = i28 + 1;
                int i31 = iArr[i28] ^ ((((iArr6[(i16 >>> 24) & 255] << 24) | (iArr6[(i17 >>> 16) & 255] << 16)) | (iArr6[(i18 >>> 8) & 255] << 8)) | iArr6[(i15 >>> 0) & 255]);
                int i32 = ((((iArr6[(i17 >>> 24) & 255] << 24) | (iArr6[(i18 >>> 16) & 255] << 16)) | (iArr6[(i15 >>> 8) & 255] << 8)) | iArr6[(i16 >>> 0) & 255]) ^ iArr[i30];
                int i33 = ((((iArr6[(i18 >>> 24) & 255] << 24) | (iArr6[(i15 >>> 16) & 255] << 16)) | (iArr6[(i16 >>> 8) & 255] << 8)) | iArr6[(i17 >>> 0) & 255]) ^ iArr[i30 + 1];
                iArrLIZIZ[i5] = i29;
                iArrLIZIZ[i9] = i31;
                iArrLIZIZ[i11] = i32;
                iArrLIZIZ[i13] = i33;
                int i34 = iArrLIZIZ[i9];
                iArrLIZIZ[i9] = i33;
                iArrLIZIZ[i13] = i34;
                iArrLIZIZ[i5] = iArrLIZIZ[i5] ^ i;
                iArrLIZIZ[i9] = iArrLIZIZ[i9] ^ i2;
                iArrLIZIZ[i11] = iArrLIZIZ[i11] ^ i3;
                iArrLIZIZ[i13] = i4 ^ iArrLIZIZ[i13];
                if (i5 == i6) {
                    break;
                }
                i5 += i7;
                i = i8;
                i2 = i10;
                i3 = i12;
                i4 = i14;
                c = 0;
                c2 = 1;
                c3 = 2;
                c4 = 3;
            }
        }
        C20224314Bl c20224314Bl = EnumC20223914Bh.Companion;
        int length3 = iArrLIZIZ.length * 4;
        byte[] bArr5 = new byte[length3];
        int i35 = 0;
        for (int i36 : iArrLIZIZ) {
            int i37 = i35 + 1;
            bArr5[i35] = (byte) ((i36 >> 24) & 255);
            int i38 = i37 + 1;
            bArr5[i37] = (byte) ((i36 >> 16) & 255);
            int i39 = i38 + 1;
            bArr5[i38] = (byte) ((i36 >> 8) & 255);
            i35 = i39 + 1;
            bArr5[i39] = (byte) ((i36 >> 0) & 255);
        }
        c20224314Bl.getClass();
        int i40 = C20224014Bi.LIZ[enumC20223914Bh.ordinal()];
        if (i40 != 1) {
            if (i40 != 2 && i40 != 3 && i40 != 4) {
                if (i40 == 5) {
                    int i41 = 0;
                    for (int i42 = length3 - 1; -1 < i42 && bArr5[i42] == 0; i42--) {
                        i41++;
                    }
                    int i43 = length3 - i41;
                    byte[] bArr6 = new byte[i43];
                    System.arraycopy(bArr5, 0, bArr6, 0, i43);
                    return bArr6;
                }
                throw new C1954807lC();
            }
            int i44 = length3 - (bArr5[length3 - 1] & 255);
            byte[] bArr7 = new byte[i44];
            System.arraycopy(bArr5, 0, bArr7, 0, i44);
            return bArr7;
        }
        return bArr5;
    }
}
