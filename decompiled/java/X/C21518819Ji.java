package X;

import android.graphics.Path;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.exp.DMInboxChangeRightZoneClickableSizeExp;

/* JADX INFO: renamed from: X.19Ji, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21518819Ji {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a4 A[PHI: r15
      0x00a4: PHI (r15v4 boolean) = (r15v1 boolean), (r15v1 boolean), (r15v1 boolean), (r15v3 boolean) binds: [B:38:0x00a1, B:47:0x00b3, B:48:0x00b5, B:44:0x00ac] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00e8 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00a7 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00bb A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C21518919Jj[] LIZJ(java.lang.String r16) {
        /*
            Method dump skipped, instruction units count: 280
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21518819Ji.LIZJ(java.lang.String):X.19Jj[]");
    }

    public static Path LIZLLL(String str) {
        Path path = new Path();
        try {
            LJFF(LIZJ(str), path);
            return path;
        } catch (RuntimeException e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Error in parsing ");
            sbLIZ.append(str);
            throw new RuntimeException(C2188811AlT.LIZIZ(sbLIZ), e);
        }
    }

    public static C21518919Jj[] LJ(C21518919Jj[] c21518919JjArr) {
        C21518919Jj[] c21518919JjArr2 = new C21518919Jj[c21518919JjArr.length];
        for (int i = 0; i < c21518919JjArr.length; i++) {
            c21518919JjArr2[i] = new C21518919Jj(c21518919JjArr[i]);
        }
        return c21518919JjArr2;
    }

    public static boolean LIZ(C21518919Jj[] c21518919JjArr, C21518919Jj[] c21518919JjArr2) {
        if (c21518919JjArr == null || c21518919JjArr2 == null || c21518919JjArr.length != c21518919JjArr2.length) {
            return false;
        }
        for (int i = 0; i < c21518919JjArr.length; i++) {
            C21518919Jj c21518919Jj = c21518919JjArr[i];
            char c = c21518919Jj.LIZ;
            C21518919Jj c21518919Jj2 = c21518919JjArr2[i];
            if (c != c21518919Jj2.LIZ || c21518919Jj.LIZIZ.length != c21518919Jj2.LIZIZ.length) {
                return false;
            }
        }
        return true;
    }

    public static float[] LIZIZ(int i, float[] fArr) {
        if (i >= 0) {
            float[] fArr2 = new float[i];
            System.arraycopy(fArr, 0, fArr2, 0, Math.min(i, fArr.length));
            return fArr2;
        }
        throw new IllegalArgumentException();
    }

    public static void LJFF(C21518919Jj[] c21518919JjArr, Path path) {
        int i;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float[] fArr = new float[6];
        int length = c21518919JjArr.length;
        char c = 0;
        int i2 = 0;
        char c2 = 'm';
        while (i2 < length) {
            C21518919Jj c21518919Jj = c21518919JjArr[i2];
            char c3 = c21518919Jj.LIZ;
            float[] fArr2 = c21518919Jj.LIZIZ;
            float f7 = fArr[c];
            float f8 = fArr[1];
            float f9 = fArr[2];
            float f10 = fArr[3];
            float f11 = fArr[4];
            float f12 = fArr[5];
            switch (c3) {
                case 'A':
                case 'a':
                    i = 7;
                    break;
                case 'C':
                case 'c':
                    i = 6;
                    break;
                case DMInboxChangeRightZoneClickableSizeExp.NEW_DP_SIZE /* 72 */:
                case 'V':
                case 'h':
                case 'v':
                    i = 1;
                    break;
                case 'Q':
                case 'S':
                case 'q':
                case 's':
                    i = 4;
                    break;
                case 'Z':
                case 'z':
                    path.close();
                    path.moveTo(f11, f12);
                    f7 = f11;
                    f9 = f11;
                    f8 = f12;
                    f10 = f12;
                default:
                    i = 2;
                    break;
            }
            int i3 = 0;
            while (i3 < fArr2.length) {
                if (c3 != 'A') {
                    if (c3 != 'C') {
                        if (c3 != 'H') {
                            if (c3 != 'Q') {
                                if (c3 != 'V') {
                                    if (c3 != 'a') {
                                        if (c3 != 'c') {
                                            if (c3 != 'h') {
                                                if (c3 != 'q') {
                                                    if (c3 != 'v') {
                                                        if (c3 != 'L') {
                                                            if (c3 != 'M') {
                                                                if (c3 != 'S') {
                                                                    if (c3 != 'T') {
                                                                        if (c3 != 'l') {
                                                                            if (c3 != 'm') {
                                                                                if (c3 != 's') {
                                                                                    if (c3 == 't') {
                                                                                        if (c2 != 'q' && c2 != 't' && c2 != 'Q' && c2 != 'T') {
                                                                                            f6 = 0.0f;
                                                                                            f5 = 0.0f;
                                                                                        } else {
                                                                                            f5 = f7 - f9;
                                                                                            f6 = f8 - f10;
                                                                                        }
                                                                                        int i4 = i3 + 1;
                                                                                        path.rQuadTo(f5, f6, fArr2[i3], fArr2[i4]);
                                                                                        f9 = f5 + f7;
                                                                                        f10 = f6 + f8;
                                                                                        f7 += fArr2[i3];
                                                                                        f8 += fArr2[i4];
                                                                                    }
                                                                                } else {
                                                                                    if (c2 != 'c' && c2 != 's' && c2 != 'C' && c2 != 'S') {
                                                                                        f3 = 0.0f;
                                                                                        f4 = 0.0f;
                                                                                    } else {
                                                                                        f3 = f7 - f9;
                                                                                        f4 = f8 - f10;
                                                                                    }
                                                                                    i3 = i3;
                                                                                    int i5 = i3 + 1;
                                                                                    int i6 = i3 + 2;
                                                                                    int i7 = i3 + 3;
                                                                                    c3 = 's';
                                                                                    path.rCubicTo(f3, f4, fArr2[i3], fArr2[i5], fArr2[i6], fArr2[i7]);
                                                                                    f9 = fArr2[i3] + f7;
                                                                                    f10 = fArr2[i5] + f8;
                                                                                    f7 += fArr2[i6];
                                                                                    f = fArr2[i7];
                                                                                }
                                                                            } else {
                                                                                c3 = 'm';
                                                                                float f13 = fArr2[i3];
                                                                                f7 += f13;
                                                                                float f14 = fArr2[i3 + 1];
                                                                                f8 += f14;
                                                                                if (i3 > 0) {
                                                                                    path.rLineTo(f13, f14);
                                                                                } else {
                                                                                    path.rMoveTo(f13, f14);
                                                                                    f11 = f7;
                                                                                    f12 = f8;
                                                                                }
                                                                            }
                                                                        } else {
                                                                            c3 = 'l';
                                                                            int i8 = i3 + 1;
                                                                            path.rLineTo(fArr2[i3], fArr2[i8]);
                                                                            f7 += fArr2[i3];
                                                                            f2 = fArr2[i8];
                                                                        }
                                                                    } else {
                                                                        c3 = 'T';
                                                                        if (c2 == 'q' || c2 == 't' || c2 == 'Q' || c2 == 'T') {
                                                                            f7 = (f7 * 2.0f) - f9;
                                                                            f8 = (f8 * 2.0f) - f10;
                                                                        }
                                                                        int i9 = i3 + 1;
                                                                        path.quadTo(f7, f8, fArr2[i3], fArr2[i9]);
                                                                        f9 = f7;
                                                                        f10 = f8;
                                                                        f7 = fArr2[i3];
                                                                        f8 = fArr2[i9];
                                                                    }
                                                                } else {
                                                                    c3 = 'S';
                                                                    if (c2 == 'c' || c2 == 's' || c2 == 'C' || c2 == 'S') {
                                                                        f7 = (f7 * 2.0f) - f9;
                                                                        f8 = (f8 * 2.0f) - f10;
                                                                    }
                                                                    int i10 = i3 + 1;
                                                                    int i11 = i3 + 2;
                                                                    int i12 = i3 + 3;
                                                                    path.cubicTo(f7, f8, fArr2[i3], fArr2[i10], fArr2[i11], fArr2[i12]);
                                                                    f9 = fArr2[i3];
                                                                    f10 = fArr2[i10];
                                                                    f7 = fArr2[i11];
                                                                    f8 = fArr2[i12];
                                                                }
                                                            } else {
                                                                c3 = 'M';
                                                                f7 = fArr2[i3];
                                                                f8 = fArr2[i3 + 1];
                                                                if (i3 > 0) {
                                                                    path.lineTo(f7, f8);
                                                                } else {
                                                                    path.moveTo(f7, f8);
                                                                    f11 = f7;
                                                                    f12 = f8;
                                                                }
                                                            }
                                                        } else {
                                                            c3 = 'L';
                                                            int i13 = i3 + 1;
                                                            path.lineTo(fArr2[i3], fArr2[i13]);
                                                            f7 = fArr2[i3];
                                                            f8 = fArr2[i13];
                                                        }
                                                    } else {
                                                        c3 = 'v';
                                                        path.rLineTo(0.0f, fArr2[i3]);
                                                        f2 = fArr2[i3];
                                                    }
                                                    f8 += f2;
                                                } else {
                                                    c3 = 'q';
                                                    int i14 = i3 + 1;
                                                    int i15 = i3 + 2;
                                                    int i16 = i3 + 3;
                                                    path.rQuadTo(fArr2[i3], fArr2[i14], fArr2[i15], fArr2[i16]);
                                                    f9 = fArr2[i3] + f7;
                                                    f10 = fArr2[i14] + f8;
                                                    f7 += fArr2[i15];
                                                    f = fArr2[i16];
                                                }
                                            } else {
                                                c3 = 'h';
                                                path.rLineTo(fArr2[i3], 0.0f);
                                                f7 += fArr2[i3];
                                            }
                                        } else {
                                            c3 = 'c';
                                            int i17 = i3 + 2;
                                            int i18 = i3 + 3;
                                            int i19 = i3 + 4;
                                            int i20 = i3 + 5;
                                            path.rCubicTo(fArr2[i3], fArr2[i3 + 1], fArr2[i17], fArr2[i18], fArr2[i19], fArr2[i20]);
                                            f9 = fArr2[i17] + f7;
                                            f10 = fArr2[i18] + f8;
                                            f7 += fArr2[i19];
                                            f = fArr2[i20];
                                        }
                                        f8 += f;
                                    } else {
                                        c3 = 'a';
                                        int i21 = i3 + 5;
                                        float f15 = fArr2[i21] + f7;
                                        int i22 = i3 + 6;
                                        float f16 = fArr2[i22] + f8;
                                        float f18 = fArr2[i3];
                                        float f19 = fArr2[i3 + 1];
                                        float f20 = fArr2[i3 + 2];
                                        if (fArr2[i3 + 3] != 0.0f) {
                                            z3 = true;
                                        } else {
                                            z3 = false;
                                        }
                                        if (fArr2[i3 + 4] != 0.0f) {
                                            z4 = true;
                                        } else {
                                            z4 = false;
                                        }
                                        C21518919Jj.LIZ(f7, f8, f15, f16, f18, f19, f20, path, z3, z4);
                                        f7 += fArr2[i21];
                                        f8 += fArr2[i22];
                                    }
                                } else {
                                    c3 = 'V';
                                    path.lineTo(f7, fArr2[i3]);
                                    f8 = fArr2[i3];
                                }
                            } else {
                                c3 = 'Q';
                                int i23 = i3 + 1;
                                int i24 = i3 + 2;
                                int i25 = i3 + 3;
                                path.quadTo(fArr2[i3], fArr2[i23], fArr2[i24], fArr2[i25]);
                                f9 = fArr2[i3];
                                f10 = fArr2[i23];
                                f7 = fArr2[i24];
                                f8 = fArr2[i25];
                            }
                        } else {
                            c3 = 'H';
                            path.lineTo(fArr2[i3], f8);
                            f7 = fArr2[i3];
                        }
                    } else {
                        c3 = 'C';
                        int i26 = i3 + 2;
                        int i27 = i3 + 3;
                        int i28 = i3 + 4;
                        int i29 = i3 + 5;
                        path.cubicTo(fArr2[i3], fArr2[i3 + 1], fArr2[i26], fArr2[i27], fArr2[i28], fArr2[i29]);
                        f7 = fArr2[i28];
                        f8 = fArr2[i29];
                        f9 = fArr2[i26];
                        f10 = fArr2[i27];
                    }
                    i3 += i;
                    c2 = c3;
                } else {
                    c3 = 'A';
                    int i30 = i3 + 5;
                    float f21 = fArr2[i30];
                    int i31 = i3 + 6;
                    float f22 = fArr2[i31];
                    float f23 = fArr2[i3];
                    float f24 = fArr2[i3 + 1];
                    float f25 = fArr2[i3 + 2];
                    if (fArr2[i3 + 3] != 0.0f) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (fArr2[i3 + 4] != 0.0f) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    C21518919Jj.LIZ(f7, f8, f21, f22, f23, f24, f25, path, z, z2);
                    f7 = fArr2[i30];
                    f8 = fArr2[i31];
                }
                f9 = f7;
                f10 = f8;
                i3 += i;
                c2 = c3;
            }
            fArr[0] = f7;
            fArr[1] = f8;
            fArr[2] = f9;
            fArr[3] = f10;
            fArr[4] = f11;
            fArr[5] = f12;
            c2 = c21518919Jj.LIZ;
            i2++;
            c = 0;
        }
    }
}
