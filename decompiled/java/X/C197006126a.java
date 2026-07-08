package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: renamed from: X.126a, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C197006126a {
    public int LIZ;
    public int LIZIZ;
    public int LIZJ;
    public int LJ;
    public boolean LJFF;
    public OutputStream LJI;
    public Bitmap LJII;
    public byte[] LJIIIIZZ;
    public byte[] LJIIIZ;
    public int LJIIJ;
    public byte[] LJIIJJI;
    public boolean LJIILLIIL;
    public int LIZLLL = -1;
    public final boolean[] LJIIL = new boolean[256];
    public int LJIILIIL = 7;
    public boolean LJIILJJIL = true;
    public int LJIILL = 10;

    public final void LIZ() {
        int i;
        int i2;
        int i3;
        byte[] bArr = this.LJIIIIZZ;
        int length = bArr.length;
        int i4 = length / 3;
        this.LJIIIZ = new byte[i4];
        C197008126c c197008126c = new C197008126c(bArr, length, this.LJIILL);
        int i5 = 1509;
        if (length < 1509) {
            c197008126c.LIZJ = 1;
        }
        int i6 = c197008126c.LIZJ;
        c197008126c.LIZ = ((i6 - 1) / 3) + 30;
        int i7 = length / (i6 * 3);
        int i8 = i7 / 100;
        for (int i9 = 0; i9 < 32; i9++) {
            c197008126c.LJII[i9] = (((1024 - (i9 * i9)) * 256) / 1024) * 1024;
        }
        int i10 = c197008126c.LIZIZ;
        if (i10 < 1509) {
            i5 = 3;
        } else if (i10 % 499 != 0) {
            i5 = 1497;
        } else if (i10 % 491 != 0) {
            i5 = 1473;
        } else if (i10 % 487 != 0) {
            i5 = 1461;
        }
        int i11 = 1024;
        int i12 = 32;
        int i13 = 0;
        int i14 = 0;
        int i15 = SpeechEngineDefines.ASR_WORK_MODE_OFFLINE;
        while (i13 < i7) {
            int i16 = (bArr[i14] & 255) << 4;
            int i17 = (bArr[i14 + 1] & 255) << 4;
            int i18 = (255 & bArr[i14 + 2]) << 4;
            int i19 = Integer.MAX_VALUE;
            int i20 = 0;
            int i21 = -1;
            int i22 = -1;
            int i23 = Integer.MAX_VALUE;
            do {
                int[] iArr = c197008126c.LIZLLL[i20];
                int i24 = iArr[0] - i16;
                if (i24 < 0) {
                    i24 = -i24;
                }
                int i25 = iArr[1] - i17;
                if (i25 < 0) {
                    i25 = -i25;
                }
                int i26 = i24 + i25;
                int i27 = iArr[2] - i18;
                if (i27 < 0) {
                    i27 = -i27;
                }
                int i28 = i26 + i27;
                if (i28 < i19) {
                    i19 = i28;
                    i21 = i20;
                }
                int[] iArr2 = c197008126c.LJFF;
                int i29 = i28 - (iArr2[i20] >> 12);
                if (i29 < i23) {
                    i23 = i29;
                    i22 = i20;
                }
                int[] iArr3 = c197008126c.LJI;
                int i30 = iArr3[i20];
                int i31 = i30 >> 10;
                iArr3[i20] = i30 - i31;
                iArr2[i20] = iArr2[i20] + (i31 << 10);
                i20++;
            } while (i20 < 256);
            int[] iArr4 = c197008126c.LJI;
            iArr4[i21] = iArr4[i21] + 64;
            int[] iArr5 = c197008126c.LJFF;
            iArr5[i21] = iArr5[i21] - 65536;
            int[] iArr6 = c197008126c.LIZLLL[i22];
            int i32 = iArr6[0];
            iArr6[0] = i32 - (((i32 - i16) * i11) / 1024);
            int i33 = iArr6[1];
            iArr6[1] = i33 - (((i33 - i17) * i11) / 1024);
            int i34 = iArr6[2];
            iArr6[2] = i34 - (((i34 - i18) * i11) / 1024);
            if (i12 != 0) {
                int i35 = i22 - i12;
                int i36 = i35 >= -1 ? i35 : -1;
                int i37 = i22 + i12;
                int i38 = i37 <= 256 ? i37 : 256;
                int i39 = i22 + 1;
                int i40 = i22 - 1;
                int i41 = 1;
                while (true) {
                    if (i39 >= i38 && i40 <= i36) {
                        break;
                    }
                    int i42 = i41 + 1;
                    int i43 = c197008126c.LJII[i41];
                    if (i39 < i38) {
                        i3 = i39 + 1;
                        int[] iArr7 = c197008126c.LIZLLL[i39];
                        try {
                            int i44 = iArr7[0];
                            iArr7[0] = i44 - (((i44 - i16) * i43) / 262144);
                            int i45 = iArr7[1];
                            iArr7[1] = i45 - (((i45 - i17) * i43) / 262144);
                            int i46 = iArr7[2];
                            iArr7[2] = i46 - (((i46 - i18) * i43) / 262144);
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                        }
                    } else {
                        i3 = i39;
                    }
                    if (i40 > i36) {
                        int i47 = i40 - 1;
                        int[] iArr8 = c197008126c.LIZLLL[i40];
                        try {
                            int i48 = iArr8[0];
                            iArr8[0] = i48 - (((i48 - i16) * i43) / 262144);
                            int i49 = iArr8[1];
                            iArr8[1] = i49 - (((i49 - i17) * i43) / 262144);
                            int i50 = iArr8[2];
                            iArr8[2] = i50 - ((i43 * (i50 - i18)) / 262144);
                        } catch (Exception e2) {
                            TryCatchGuardChecker.doCheck(e2);
                        }
                        i40 = i47;
                    }
                    i41 = i42;
                    i39 = i3;
                }
            }
            i14 += i5;
            if (i14 >= length) {
                i14 -= c197008126c.LIZIZ;
            }
            i13++;
            if (i8 == 0) {
                i8 = 1;
            }
            if (i13 % i8 == 0) {
                i11 -= i11 / c197008126c.LIZ;
                i15 -= i15 / 30;
                i12 = i15 >> 6;
                if (i12 <= 1) {
                    i12 = 0;
                } else {
                    for (int i51 = 0; i51 < i12; i51++) {
                        int i52 = i12 * i12;
                        c197008126c.LJII[i51] = (((i52 - (i51 * i51)) * 256) / i52) * i11;
                    }
                }
            }
        }
        int i53 = 0;
        do {
            int[] iArr9 = c197008126c.LIZLLL[i53];
            iArr9[0] = iArr9[0] >> 4;
            iArr9[1] = iArr9[1] >> 4;
            iArr9[2] = iArr9[2] >> 4;
            iArr9[3] = i53;
            i53++;
        } while (i53 < 256);
        int i54 = 256;
        int i55 = 0;
        int i56 = 0;
        int i57 = 0;
        do {
            int[] iArr10 = c197008126c.LIZLLL[i55];
            int i58 = iArr10[1];
            i = i55 + 1;
            int i59 = i55;
            int i60 = i;
            while (i60 < i54) {
                int i61 = c197008126c.LIZLLL[i60][1];
                if (i61 < i58) {
                    i58 = i61;
                    i59 = i60;
                }
                i60++;
                i54 = 256;
            }
            int[] iArr11 = c197008126c.LIZLLL[i59];
            if (i55 != i59) {
                int i62 = iArr11[0];
                iArr11[0] = iArr10[0];
                iArr10[0] = i62;
                int i63 = iArr11[1];
                iArr11[1] = iArr10[1];
                iArr10[1] = i63;
                int i64 = iArr11[2];
                iArr11[2] = iArr10[2];
                iArr10[2] = i64;
                int i65 = iArr11[3];
                iArr11[3] = iArr10[3];
                iArr10[3] = i65;
            }
            if (i58 != i57) {
                c197008126c.LJ[i57] = (i56 + i55) >> 1;
                while (true) {
                    i57++;
                    if (i57 >= i58) {
                        break;
                    } else {
                        c197008126c.LJ[i57] = i55;
                    }
                }
                i56 = i55;
                i57 = i58;
            }
            i55 = i;
            i54 = 256;
        } while (i < 256);
        c197008126c.LJ[i57] = (i56 + 255) >> 1;
        for (int i66 = i57 + 1; i66 < 256; i66++) {
            c197008126c.LJ[i66] = 255;
        }
        byte[] bArr2 = new byte[768];
        int[] iArr12 = new int[256];
        int i67 = 0;
        do {
            iArr12[c197008126c.LIZLLL[i67][3]] = i67;
            i67++;
        } while (i67 < 256);
        int i68 = 0;
        int i69 = 0;
        do {
            int i70 = i69 + 1;
            int[] iArr13 = c197008126c.LIZLLL[iArr12[i68]];
            bArr2[i69] = (byte) iArr13[0];
            int i71 = i70 + 1;
            bArr2[i70] = (byte) iArr13[1];
            i69 = i71 + 1;
            bArr2[i71] = (byte) iArr13[2];
            i68++;
        } while (i68 < 256);
        this.LJIIJJI = bArr2;
        int i72 = 0;
        while (true) {
            byte[] bArr3 = this.LJIIJJI;
            if (i72 >= bArr3.length) {
                break;
            }
            byte b = bArr3[i72];
            int i73 = i72 + 2;
            bArr3[i72] = bArr3[i73];
            bArr3[i73] = b;
            this.LJIIL[i72 / 3] = false;
            i72 += 3;
        }
        int i74 = 0;
        for (int i75 = 0; i75 < i4; i75++) {
            byte[] bArr4 = this.LJIIIIZZ;
            int i76 = i74 + 1;
            int i77 = bArr4[i74] & 255;
            int i78 = i76 + 1;
            int i79 = bArr4[i76] & 255;
            i74 = i78 + 1;
            int i80 = bArr4[i78] & 255;
            int i81 = c197008126c.LJ[i79];
            int i82 = i81 - 1;
            int i83 = LSPassThroughRecordSizeConfig.DEFAULT;
            int i84 = -1;
            while (true) {
                if (i81 >= 256) {
                    if (i82 < 0) {
                        break;
                    }
                } else {
                    if (i81 < 256) {
                        int[] iArr14 = c197008126c.LIZLLL[i81];
                        int i85 = iArr14[1] - i79;
                        if (i85 >= i83) {
                            i81 = 256;
                        } else {
                            i81++;
                            if (i85 < 0) {
                                i85 = -i85;
                            }
                            int i86 = iArr14[0] - i77;
                            if (i86 < 0) {
                                i86 = -i86;
                            }
                            int i87 = i85 + i86;
                            if (i87 < i83) {
                                int i88 = iArr14[2] - i80;
                                if (i88 < 0) {
                                    i88 = -i88;
                                }
                                int i89 = i87 + i88;
                                if (i89 < i83) {
                                    i84 = iArr14[3];
                                    i83 = i89;
                                }
                            }
                        }
                    }
                    if (i82 >= 0) {
                    }
                }
                int[] iArr15 = c197008126c.LIZLLL[i82];
                int i90 = i79 - iArr15[1];
                if (i90 >= i83) {
                    i82 = -1;
                } else {
                    i82--;
                    if (i90 < 0) {
                        i90 = -i90;
                    }
                    int i91 = iArr15[0] - i77;
                    if (i91 < 0) {
                        i91 = -i91;
                    }
                    int i92 = i90 + i91;
                    if (i92 < i83) {
                        int i93 = iArr15[2] - i80;
                        if (i93 < 0) {
                            i93 = -i93;
                        }
                        int i94 = i93 + i92;
                        if (i94 < i83) {
                            i84 = iArr15[3];
                            i83 = i94;
                        }
                    }
                }
            }
            this.LJIIL[i84] = true;
            this.LJIIIZ[i75] = (byte) i84;
        }
        this.LJIIIIZZ = null;
        this.LJIIJ = 8;
        this.LJIILIIL = 7;
        if (this.LJIILLIIL) {
            if (this.LJIIJJI == null) {
                i2 = -1;
            } else {
                i2 = 0;
                int iRed = Color.red(0);
                int iGreen = Color.green(0);
                int iBlue = Color.blue(0);
                int length2 = this.LJIIJJI.length;
                int i95 = 16777216;
                int i96 = 0;
                while (i96 < length2) {
                    byte[] bArr5 = this.LJIIJJI;
                    int i97 = i96 + 1;
                    int i98 = iRed - (bArr5[i96] & 255);
                    int i99 = i97 + 1;
                    int i100 = iGreen - (bArr5[i97] & 255);
                    int i101 = iBlue - (bArr5[i99] & 255);
                    int i102 = (i98 * i98) + (i100 * i100) + (i101 * i101);
                    int i103 = i99 / 3;
                    if (this.LJIIL[i103] && i102 < i95) {
                        i2 = i103;
                        i95 = i102;
                    }
                    i96 = i99 + 1;
                }
            }
            this.LIZJ = i2;
        }
    }

    public final void LIZIZ() {
        int width = this.LJII.getWidth();
        int height = this.LJII.getHeight();
        int i = this.LIZ;
        if (width != i || height != this.LIZIZ) {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i, this.LIZIZ, Bitmap.Config.RGB_565);
            new Canvas(bitmapCreateBitmap).drawBitmap(bitmapCreateBitmap, 0.0f, 0.0f, (Paint) null);
            this.LJII = bitmapCreateBitmap;
        }
        int i2 = width * height;
        int[] iArr = new int[i2];
        int i3 = 0;
        this.LJII.getPixels(iArr, 0, width, 0, 0, width, height);
        this.LJIIIIZZ = new byte[i2 * 3];
        this.LJIILLIIL = false;
        int i4 = 0;
        for (int i5 = 0; i5 < i2; i5++) {
            int i6 = iArr[i5];
            if (i6 == 0) {
                i3++;
            }
            byte[] bArr = this.LJIIIIZZ;
            int i7 = i4 + 1;
            bArr[i4] = (byte) (i6 & 255);
            int i8 = i7 + 1;
            bArr[i7] = (byte) ((i6 >> 8) & 255);
            i4 = i8 + 1;
            bArr[i8] = (byte) ((i6 >> 16) & 255);
        }
        this.LJIILLIIL = ((double) (i3 * 100)) / ((double) i2) > 4.0d;
    }

    public final void LIZJ() throws IOException {
        int i;
        int i2;
        this.LJI.write(33);
        this.LJI.write(249);
        this.LJI.write(4);
        if (this.LJIILLIIL) {
            i = 1;
            i2 = 2;
        } else {
            i = 0;
            i2 = 0;
        }
        this.LJI.write(i | (i2 << 2));
        LJFF(this.LJ);
        this.LJI.write(this.LIZJ);
        this.LJI.write(0);
    }

    public final void LIZLLL() throws IOException {
        this.LJI.write(33);
        this.LJI.write(255);
        this.LJI.write(11);
        int i = 0;
        do {
            this.LJI.write((byte) "NETSCAPE2.0".charAt(i));
            i++;
        } while (i < 11);
        this.LJI.write(3);
        this.LJI.write(1);
        LJFF(this.LIZLLL);
        this.LJI.write(0);
    }

    public final void LJ() throws IOException {
        int i;
        int i2;
        int i3 = this.LIZ;
        int i4 = this.LIZIZ;
        byte[] bArr = this.LJIIIZ;
        C197007126b c197007126b = new C197007126b(i3, bArr, i4, this.LJIIJ);
        OutputStream outputStream = this.LJI;
        outputStream.write(c197007126b.LIZIZ);
        int i5 = i3 * i4;
        c197007126b.LIZJ = i5;
        c197007126b.LIZLLL = 0;
        int i6 = c197007126b.LIZIZ + 1;
        c197007126b.LJIIJ = i6;
        c197007126b.LJIIIZ = false;
        c197007126b.LJ = i6;
        c197007126b.LJFF = (1 << i6) - 1;
        int i7 = 1 << (i6 - 1);
        c197007126b.LJIIJJI = i7;
        c197007126b.LJIIL = i7 + 1;
        c197007126b.LJIIIIZZ = i7 + 2;
        c197007126b.LJIILLIIL = 0;
        if (i5 == 0) {
            i = -1;
        } else {
            c197007126b.LIZJ = i5 - 1;
            c197007126b.LIZLLL = 1;
            i = bArr[0] & 255;
        }
        int i8 = 0;
        for (int i9 = 5003; i9 < 65536; i9 *= 2) {
            i8++;
        }
        int i10 = 8 - i8;
        int i11 = 0;
        do {
            c197007126b.LJI[i11] = -1;
            i11++;
        } while (i11 < 5003);
        c197007126b.LIZ(outputStream, c197007126b.LJIIJJI);
        while (true) {
            int i12 = c197007126b.LIZJ;
            if (i12 == 0) {
                break;
            }
            c197007126b.LIZJ = i12 - 1;
            byte[] bArr2 = c197007126b.LIZ;
            int i13 = c197007126b.LIZLLL;
            c197007126b.LIZLLL = i13 + 1;
            int i14 = bArr2[i13] & 255;
            if (i14 == -1) {
                break;
            }
            int i15 = (i14 << 12) + i;
            int i16 = (i14 << i10) ^ i;
            int i17 = c197007126b.LJI[i16];
            if (i17 == i15) {
                i = c197007126b.LJII[i16];
            } else {
                if (i17 >= 0) {
                    int i18 = 5003 - i16;
                    if (i16 == 0) {
                        i18 = 1;
                    }
                    do {
                        i16 -= i18;
                        if (i16 < 0) {
                            i16 += 5003;
                        }
                        i2 = c197007126b.LJI[i16];
                        if (i2 == i15) {
                            i = c197007126b.LJII[i16];
                            break;
                        }
                    } while (i2 >= 0);
                }
                c197007126b.LIZ(outputStream, i);
                int i19 = c197007126b.LJIIIIZZ;
                if (i19 < 4096) {
                    int[] iArr = c197007126b.LJII;
                    c197007126b.LJIIIIZZ = i19 + 1;
                    iArr[i16] = i19;
                    c197007126b.LJI[i16] = i15;
                } else {
                    int i20 = 0;
                    do {
                        c197007126b.LJI[i20] = -1;
                        i20++;
                    } while (i20 < 5003);
                    int i21 = c197007126b.LJIIJJI;
                    c197007126b.LJIIIIZZ = i21 + 2;
                    c197007126b.LJIIIZ = true;
                    c197007126b.LIZ(outputStream, i21);
                }
                i = i14;
            }
        }
        c197007126b.LIZ(outputStream, i);
        c197007126b.LIZ(outputStream, c197007126b.LJIIL);
        outputStream.write(0);
    }

    public final void LJFF(int i) throws IOException {
        this.LJI.write(i & 255);
        this.LJI.write((i >> 8) & 255);
    }
}
