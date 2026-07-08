package X;

import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.Arrays;

/* JADX INFO: renamed from: X.12xr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19926512xr {
    public static int LIZJ(int i, byte[] bArr) {
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    public static long LIZLLL(int i, byte[] bArr) {
        return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
    }

    public static int LIZ(byte[] bArr, int i, C19926712xt c19926712xt) {
        int iLJIJI = LJIJI(bArr, i, c19926712xt);
        int i2 = c19926712xt.LIZ;
        if (i2 >= 0) {
            if (i2 <= bArr.length - iLJIJI) {
                if (i2 == 0) {
                    c19926712xt.LIZJ = AbstractC19922812xG.EMPTY;
                    return iLJIJI;
                }
                c19926712xt.LIZJ = AbstractC19922812xG.copyFrom(bArr, iLJIJI, i2);
                return iLJIJI + i2;
            }
            throw C19926612xs.LJII();
        }
        throw C19926612xs.LJFF();
    }

    public static int LJIILLIIL(byte[] bArr, int i, C19926712xt c19926712xt) {
        int iLJIJI = LJIJI(bArr, i, c19926712xt);
        int i2 = c19926712xt.LIZ;
        if (i2 >= 0) {
            if (i2 == 0) {
                c19926712xt.LIZJ = "";
                return iLJIJI;
            }
            c19926712xt.LIZJ = new String(bArr, iLJIJI, i2, C19922012x8.LIZ);
            return iLJIJI + i2;
        }
        throw C19926612xs.LJFF();
    }

    public static int LJIJI(byte[] bArr, int i, C19926712xt c19926712xt) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b >= 0) {
            c19926712xt.LIZ = b;
            return i2;
        }
        return LJIJ(b, bArr, i2, c19926712xt);
    }

    public static int LJIJJLI(byte[] bArr, int i, C19926712xt c19926712xt) {
        int i2 = i + 1;
        long j = bArr[i];
        if (j >= 0) {
            c19926712xt.LIZIZ = j;
            return i2;
        }
        int i3 = i2 + 1;
        byte b = bArr[i2];
        long j2 = (j & 127) | (((long) (b & 127)) << 7);
        int i4 = 7;
        while (b < 0) {
            b = bArr[i3];
            i4 += 7;
            j2 |= ((long) (b & 127)) << i4;
            i3++;
        }
        c19926712xt.LIZIZ = j2;
        return i3;
    }

    public static int LJII(byte[] bArr, int i, InterfaceC19921012wy<?> interfaceC19921012wy, C19926712xt c19926712xt) throws C19926612xs {
        boolean z;
        C19888412ri c19888412ri = (C19888412ri) interfaceC19921012wy;
        int iLJIJI = LJIJI(bArr, i, c19926712xt);
        int i2 = c19926712xt.LIZ + iLJIJI;
        while (iLJIJI < i2) {
            iLJIJI = LJIJJLI(bArr, iLJIJI, c19926712xt);
            if (c19926712xt.LIZIZ != 0) {
                z = true;
            } else {
                z = false;
            }
            c19888412ri.LJ(z);
        }
        if (iLJIJI == i2) {
            return iLJIJI;
        }
        throw C19926612xs.LJII();
    }

    public static int LJIIIIZZ(byte[] bArr, int i, InterfaceC19921012wy<?> interfaceC19921012wy, C19926712xt c19926712xt) throws C19926612xs {
        C19888612rk c19888612rk = (C19888612rk) interfaceC19921012wy;
        int iLJIJI = LJIJI(bArr, i, c19926712xt);
        int i2 = c19926712xt.LIZ;
        int i3 = iLJIJI + i2;
        if (i3 <= bArr.length) {
            int i4 = c19888612rk.LLILLL + (i2 / 8);
            double[] dArr = c19888612rk.LLILLJJLI;
            if (i4 > dArr.length) {
                if (dArr.length == 0) {
                    c19888612rk.LLILLJJLI = new double[Math.max(i4, 10)];
                } else {
                    int length = dArr.length;
                    while (length < i4) {
                        length = Math.max(((length * 3) / 2) + 1, 10);
                    }
                    c19888612rk.LLILLJJLI = Arrays.copyOf(c19888612rk.LLILLJJLI, length);
                }
            }
            while (iLJIJI < i3) {
                c19888612rk.LJ(Double.longBitsToDouble(LIZLLL(iLJIJI, bArr)));
                iLJIJI += 8;
            }
            if (iLJIJI == i3) {
                return iLJIJI;
            }
            throw C19926612xs.LJII();
        }
        throw C19926612xs.LJII();
    }

    public static int LJIIIZ(byte[] bArr, int i, InterfaceC19921012wy<?> interfaceC19921012wy, C19926712xt c19926712xt) throws C19926612xs {
        C19889012ro c19889012ro = (C19889012ro) interfaceC19921012wy;
        int iLJIJI = LJIJI(bArr, i, c19926712xt);
        int i2 = c19926712xt.LIZ;
        int i3 = iLJIJI + i2;
        if (i3 <= bArr.length) {
            int i4 = c19889012ro.LLILLL + (i2 / 4);
            int[] iArr = c19889012ro.LLILLJJLI;
            if (i4 > iArr.length) {
                if (iArr.length == 0) {
                    c19889012ro.LLILLJJLI = new int[Math.max(i4, 10)];
                } else {
                    int length = iArr.length;
                    while (length < i4) {
                        length = Math.max(((length * 3) / 2) + 1, 10);
                    }
                    c19889012ro.LLILLJJLI = Arrays.copyOf(c19889012ro.LLILLJJLI, length);
                }
            }
            while (iLJIJI < i3) {
                c19889012ro.LJJLL(LIZJ(iLJIJI, bArr));
                iLJIJI += 4;
            }
            if (iLJIJI == i3) {
                return iLJIJI;
            }
            throw C19926612xs.LJII();
        }
        throw C19926612xs.LJII();
    }

    public static int LJIIJ(byte[] bArr, int i, InterfaceC19921012wy<?> interfaceC19921012wy, C19926712xt c19926712xt) throws C19926612xs {
        C19888812rm c19888812rm = (C19888812rm) interfaceC19921012wy;
        int iLJIJI = LJIJI(bArr, i, c19926712xt);
        int i2 = c19926712xt.LIZ;
        int i3 = iLJIJI + i2;
        if (i3 <= bArr.length) {
            int i4 = c19888812rm.LLILLL + (i2 / 8);
            long[] jArr = c19888812rm.LLILLJJLI;
            if (i4 > jArr.length) {
                if (jArr.length == 0) {
                    c19888812rm.LLILLJJLI = new long[Math.max(i4, 10)];
                } else {
                    int length = jArr.length;
                    while (length < i4) {
                        length = Math.max(((length * 3) / 2) + 1, 10);
                    }
                    c19888812rm.LLILLJJLI = Arrays.copyOf(c19888812rm.LLILLJJLI, length);
                }
            }
            while (iLJIJI < i3) {
                c19888812rm.LJ(LIZLLL(iLJIJI, bArr));
                iLJIJI += 8;
            }
            if (iLJIJI == i3) {
                return iLJIJI;
            }
            throw C19926612xs.LJII();
        }
        throw C19926612xs.LJII();
    }

    public static int LJIIJJI(byte[] bArr, int i, InterfaceC19921012wy<?> interfaceC19921012wy, C19926712xt c19926712xt) throws C19926612xs {
        C19888112rf c19888112rf = (C19888112rf) interfaceC19921012wy;
        int iLJIJI = LJIJI(bArr, i, c19926712xt);
        int i2 = c19926712xt.LIZ;
        int i3 = iLJIJI + i2;
        if (i3 <= bArr.length) {
            int i4 = c19888112rf.LLILLL + (i2 / 4);
            float[] fArr = c19888112rf.LLILLJJLI;
            if (i4 > fArr.length) {
                if (fArr.length == 0) {
                    c19888112rf.LLILLJJLI = new float[Math.max(i4, 10)];
                } else {
                    int length = fArr.length;
                    while (length < i4) {
                        length = Math.max(((length * 3) / 2) + 1, 10);
                    }
                    c19888112rf.LLILLJJLI = Arrays.copyOf(c19888112rf.LLILLJJLI, length);
                }
            }
            while (iLJIJI < i3) {
                c19888112rf.LJ(Float.intBitsToFloat(LIZJ(iLJIJI, bArr)));
                iLJIJI += 4;
            }
            if (iLJIJI == i3) {
                return iLJIJI;
            }
            throw C19926612xs.LJII();
        }
        throw C19926612xs.LJII();
    }

    public static int LJIIL(byte[] bArr, int i, InterfaceC19921012wy<?> interfaceC19921012wy, C19926712xt c19926712xt) throws C19926612xs {
        C19889012ro c19889012ro = (C19889012ro) interfaceC19921012wy;
        int iLJIJI = LJIJI(bArr, i, c19926712xt);
        int i2 = c19926712xt.LIZ + iLJIJI;
        while (iLJIJI < i2) {
            iLJIJI = LJIJI(bArr, iLJIJI, c19926712xt);
            c19889012ro.LJJLL(AbstractC19927312xz.LIZLLL(c19926712xt.LIZ));
        }
        if (iLJIJI == i2) {
            return iLJIJI;
        }
        throw C19926612xs.LJII();
    }

    public static int LJIILIIL(byte[] bArr, int i, InterfaceC19921012wy<?> interfaceC19921012wy, C19926712xt c19926712xt) throws C19926612xs {
        C19888812rm c19888812rm = (C19888812rm) interfaceC19921012wy;
        int iLJIJI = LJIJI(bArr, i, c19926712xt);
        int i2 = c19926712xt.LIZ + iLJIJI;
        while (iLJIJI < i2) {
            iLJIJI = LJIJJLI(bArr, iLJIJI, c19926712xt);
            c19888812rm.LJ(AbstractC19927312xz.LJ(c19926712xt.LIZIZ));
        }
        if (iLJIJI == i2) {
            return iLJIJI;
        }
        throw C19926612xs.LJII();
    }

    public static int LJIILJJIL(byte[] bArr, int i, InterfaceC19921012wy<?> interfaceC19921012wy, C19926712xt c19926712xt) {
        C19889012ro c19889012ro = (C19889012ro) interfaceC19921012wy;
        int iLJIJI = LJIJI(bArr, i, c19926712xt);
        int i2 = c19926712xt.LIZ + iLJIJI;
        while (iLJIJI < i2) {
            iLJIJI = LJIJI(bArr, iLJIJI, c19926712xt);
            c19889012ro.LJJLL(c19926712xt.LIZ);
        }
        if (iLJIJI == i2) {
            return iLJIJI;
        }
        throw C19926612xs.LJII();
    }

    public static int LJIILL(byte[] bArr, int i, InterfaceC19921012wy<?> interfaceC19921012wy, C19926712xt c19926712xt) throws C19926612xs {
        C19888812rm c19888812rm = (C19888812rm) interfaceC19921012wy;
        int iLJIJI = LJIJI(bArr, i, c19926712xt);
        int i2 = c19926712xt.LIZ + iLJIJI;
        while (iLJIJI < i2) {
            iLJIJI = LJIJJLI(bArr, iLJIJI, c19926712xt);
            c19888812rm.LJ(c19926712xt.LIZIZ);
        }
        if (iLJIJI == i2) {
            return iLJIJI;
        }
        throw C19926612xs.LJII();
    }

    public static int LJIJ(int i, byte[] bArr, int i2, C19926712xt c19926712xt) {
        int i3 = i & 127;
        int i4 = i2 + 1;
        byte b = bArr[i2];
        if (b >= 0) {
            c19926712xt.LIZ = i3 | (b << 7);
            return i4;
        }
        int i5 = i3 | ((b & 127) << 7);
        int i6 = i4 + 1;
        byte b2 = bArr[i4];
        if (b2 >= 0) {
            c19926712xt.LIZ = i5 | (b2 << 14);
            return i6;
        }
        int i7 = i5 | ((b2 & 127) << 14);
        int i8 = i6 + 1;
        byte b3 = bArr[i6];
        if (b3 >= 0) {
            c19926712xt.LIZ = i7 | (b3 << 21);
            return i8;
        }
        int i9 = i7 | ((b3 & 127) << 21);
        int i10 = i8 + 1;
        byte b4 = bArr[i8];
        if (b4 >= 0) {
            c19926712xt.LIZ = i9 | (b4 << 28);
            return i10;
        }
        int i11 = i9 | ((b4 & 127) << 28);
        while (true) {
            int i12 = i10 + 1;
            if (bArr[i10] < 0) {
                i10 = i12;
            } else {
                c19926712xt.LIZ = i11;
                return i12;
            }
        }
    }

    public static <T> int LJFF(InterfaceC19924912xb<T> interfaceC19924912xb, byte[] bArr, int i, int i2, C19926712xt c19926712xt) {
        T tNewInstance = interfaceC19924912xb.newInstance();
        int iLJJ = LJJ(tNewInstance, interfaceC19924912xb, bArr, i, i2, c19926712xt);
        interfaceC19924912xb.LJI(tNewInstance);
        c19926712xt.LIZJ = tNewInstance;
        return iLJJ;
    }

    public static int LJJI(int i, byte[] bArr, int i2, int i3, C19926712xt c19926712xt) {
        if ((i >>> 3) != 0) {
            int i4 = i & 7;
            if (i4 != 0) {
                if (i4 != 1) {
                    if (i4 != 2) {
                        if (i4 != 3) {
                            if (i4 == 5) {
                                return i2 + 4;
                            }
                            throw C19926612xs.LIZIZ();
                        }
                        int i5 = (i & (-8)) | 4;
                        int i6 = 0;
                        while (i2 < i3) {
                            i2 = LJIJI(bArr, i2, c19926712xt);
                            i6 = c19926712xt.LIZ;
                            if (i6 == i5) {
                                break;
                            }
                            i2 = LJJI(i6, bArr, i2, i3, c19926712xt);
                        }
                        if (i2 <= i3 && i6 == i5) {
                            return i2;
                        }
                        throw C19926612xs.LJI();
                    }
                    return LJIJI(bArr, i2, c19926712xt) + c19926712xt.LIZ;
                }
                return i2 + 8;
            }
            return LJIJJLI(bArr, i2, c19926712xt);
        }
        throw C19926612xs.LIZIZ();
    }

    public static <T> int LJ(InterfaceC19924912xb<T> interfaceC19924912xb, byte[] bArr, int i, int i2, int i3, C19926712xt c19926712xt) {
        T tNewInstance = interfaceC19924912xb.newInstance();
        int iLJIL = LJIL(tNewInstance, interfaceC19924912xb, bArr, i, i2, i3, c19926712xt);
        interfaceC19924912xb.LJI(tNewInstance);
        c19926712xt.LIZJ = tNewInstance;
        return iLJIL;
    }

    public static int LJIIZILJ(int i, byte[] bArr, int i2, int i3, C19927712y3 c19927712y3, C19926712xt c19926712xt) {
        int iLJIJI = i2;
        if ((i >>> 3) != 0) {
            int i4 = i & 7;
            if (i4 != 0) {
                if (i4 != 1) {
                    if (i4 != 2) {
                        if (i4 != 3) {
                            if (i4 == 5) {
                                c19927712y3.LJFF(i, Integer.valueOf(LIZJ(iLJIJI, bArr)));
                                return iLJIJI + 4;
                            }
                            throw C19926612xs.LIZIZ();
                        }
                        C19927712y3 c19927712y32 = new C19927712y3();
                        int i5 = (i & (-8)) | 4;
                        int i6 = c19926712xt.LJ + 1;
                        c19926712xt.LJ = i6;
                        if (i6 < 100) {
                            int i7 = 0;
                            while (iLJIJI < i3) {
                                iLJIJI = LJIJI(bArr, iLJIJI, c19926712xt);
                                i7 = c19926712xt.LIZ;
                                if (i7 == i5) {
                                    break;
                                }
                                iLJIJI = LJIIZILJ(i7, bArr, iLJIJI, i3, c19927712y32, c19926712xt);
                            }
                            c19926712xt.LJ--;
                            if (iLJIJI <= i3 && i7 == i5) {
                                c19927712y3.LJFF(i, c19927712y32);
                                return iLJIJI;
                            }
                            throw C19926612xs.LJI();
                        }
                        throw new C19926612xs("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
                    }
                    int iLJIJI2 = LJIJI(bArr, iLJIJI, c19926712xt);
                    int i8 = c19926712xt.LIZ;
                    if (i8 >= 0) {
                        if (i8 <= bArr.length - iLJIJI2) {
                            if (i8 == 0) {
                                c19927712y3.LJFF(i, AbstractC19922812xG.EMPTY);
                            } else {
                                c19927712y3.LJFF(i, AbstractC19922812xG.copyFrom(bArr, iLJIJI2, i8));
                            }
                            return iLJIJI2 + i8;
                        }
                        throw C19926612xs.LJII();
                    }
                    throw C19926612xs.LJFF();
                }
                c19927712y3.LJFF(i, Long.valueOf(LIZLLL(iLJIJI, bArr)));
                return iLJIJI + 8;
            }
            int iLJIJJLI = LJIJJLI(bArr, iLJIJI, c19926712xt);
            c19927712y3.LJFF(i, Long.valueOf(c19926712xt.LIZIZ));
            return iLJIJJLI;
        }
        throw C19926612xs.LIZIZ();
    }

    public static int LJIJJ(int i, byte[] bArr, int i2, int i3, InterfaceC19921012wy<?> interfaceC19921012wy, C19926712xt c19926712xt) {
        C19889012ro c19889012ro = (C19889012ro) interfaceC19921012wy;
        int iLJIJI = LJIJI(bArr, i2, c19926712xt);
        c19889012ro.LJJLL(c19926712xt.LIZ);
        while (iLJIJI < i3) {
            int iLJIJI2 = LJIJI(bArr, iLJIJI, c19926712xt);
            if (i != c19926712xt.LIZ) {
                break;
            }
            iLJIJI = LJIJI(bArr, iLJIJI2, c19926712xt);
            c19889012ro.LJJLL(c19926712xt.LIZ);
        }
        return iLJIJI;
    }

    public static <T> int LJJ(Object obj, InterfaceC19924912xb<T> interfaceC19924912xb, byte[] bArr, int i, int i2, C19926712xt c19926712xt) {
        int iLJIJ = i + 1;
        int i3 = bArr[i];
        if (i3 < 0) {
            iLJIJ = LJIJ(i3, bArr, iLJIJ, c19926712xt);
            i3 = c19926712xt.LIZ;
        }
        if (i3 >= 0 && i3 <= i2 - iLJIJ) {
            int i4 = c19926712xt.LJ + 1;
            c19926712xt.LJ = i4;
            if (i4 < 100) {
                int i5 = i3 + iLJIJ;
                interfaceC19924912xb.LJFF(obj, bArr, iLJIJ, i5, c19926712xt);
                c19926712xt.LJ--;
                c19926712xt.LIZJ = obj;
                return i5;
            }
            throw new C19926612xs("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        throw C19926612xs.LJII();
    }

    public static int LJI(InterfaceC19924912xb<?> interfaceC19924912xb, int i, byte[] bArr, int i2, int i3, InterfaceC19921012wy<?> interfaceC19921012wy, C19926712xt c19926712xt) {
        int iLJFF = LJFF(interfaceC19924912xb, bArr, i2, i3, c19926712xt);
        interfaceC19921012wy.add(c19926712xt.LIZJ);
        while (iLJFF < i3) {
            int iLJIJI = LJIJI(bArr, iLJFF, c19926712xt);
            if (i != c19926712xt.LIZ) {
                break;
            }
            iLJFF = LJFF(interfaceC19924912xb, bArr, iLJIJI, i3, c19926712xt);
            interfaceC19921012wy.add(c19926712xt.LIZJ);
        }
        return iLJFF;
    }

    public static <T> int LJIL(Object obj, InterfaceC19924912xb<T> interfaceC19924912xb, byte[] bArr, int i, int i2, int i3, C19926712xt c19926712xt) {
        C19928312y9 c19928312y9 = (C19928312y9) interfaceC19924912xb;
        int i4 = c19926712xt.LJ + 1;
        c19926712xt.LJ = i4;
        if (i4 < 100) {
            int iLJJIJ = c19928312y9.LJJIJ(obj, bArr, i, i2, i3, c19926712xt);
            c19926712xt.LJ--;
            c19926712xt.LIZJ = obj;
            return iLJJIJ;
        }
        throw new C19926612xs("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static int LIZIZ(int i, byte[] bArr, int i2, int i3, AbstractC19925012xc<?, ?> abstractC19925012xc, C19925512xh<?, ?> c19925512xh, AbstractC19929412yK<C19927712y3, C19927712y3> abstractC19929412yK, C19926712xt c19926712xt) {
        boolean z;
        int iLJIILLIIL = i2;
        C19928612yC<C19926412xq> c19928612yC = abstractC19925012xc.LL;
        int i4 = i >>> 3;
        C19926412xq c19926412xq = c19925512xh.LIZLLL;
        if (c19926412xq.LLILZ && c19926412xq.LLILZIL) {
            switch (AnonymousClass1338.LIZ[c19926412xq.LLILLL.ordinal()]) {
                case 1:
                    C19888612rk c19888612rk = new C19888612rk();
                    int iLJIIIIZZ = LJIIIIZZ(bArr, iLJIILLIIL, c19888612rk, c19926712xt);
                    c19928612yC.LJIL(c19925512xh.LIZLLL, c19888612rk);
                    return iLJIIIIZZ;
                case 2:
                    C19888112rf c19888112rf = new C19888112rf();
                    int iLJIIJJI = LJIIJJI(bArr, iLJIILLIIL, c19888112rf, c19926712xt);
                    c19928612yC.LJIL(c19925512xh.LIZLLL, c19888112rf);
                    return iLJIIJJI;
                case 3:
                case 4:
                    C19888812rm c19888812rm = new C19888812rm();
                    int iLJIILL = LJIILL(bArr, iLJIILLIIL, c19888812rm, c19926712xt);
                    c19928612yC.LJIL(c19925512xh.LIZLLL, c19888812rm);
                    return iLJIILL;
                case 5:
                case 6:
                    C19889012ro c19889012ro = new C19889012ro();
                    int iLJIILJJIL = LJIILJJIL(bArr, iLJIILLIIL, c19889012ro, c19926712xt);
                    c19928612yC.LJIL(c19925512xh.LIZLLL, c19889012ro);
                    return iLJIILJJIL;
                case 7:
                case 8:
                    C19888812rm c19888812rm2 = new C19888812rm();
                    int iLJIIJ = LJIIJ(bArr, iLJIILLIIL, c19888812rm2, c19926712xt);
                    c19928612yC.LJIL(c19925512xh.LIZLLL, c19888812rm2);
                    return iLJIIJ;
                case BdTuring.TYPE_ECAF /* 9 */:
                case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                    C19889012ro c19889012ro2 = new C19889012ro();
                    int iLJIIIZ = LJIIIZ(bArr, iLJIILLIIL, c19889012ro2, c19926712xt);
                    c19928612yC.LJIL(c19925512xh.LIZLLL, c19889012ro2);
                    return iLJIIIZ;
                case BdTuring.TYPE_EMAIL /* 11 */:
                    C19888412ri c19888412ri = new C19888412ri();
                    int iLJII = LJII(bArr, iLJIILLIIL, c19888412ri, c19926712xt);
                    c19928612yC.LJIL(c19925512xh.LIZLLL, c19888412ri);
                    return iLJII;
                case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                    C19889012ro c19889012ro3 = new C19889012ro();
                    int iLJIIL = LJIIL(bArr, iLJIILLIIL, c19889012ro3, c19926712xt);
                    c19928612yC.LJIL(c19925512xh.LIZLLL, c19889012ro3);
                    return iLJIIL;
                case BdTuring.TYPE_SMS_VOICE /* 13 */:
                    C19888812rm c19888812rm3 = new C19888812rm();
                    int iLJIILIIL = LJIILIIL(bArr, iLJIILLIIL, c19888812rm3, c19926712xt);
                    c19928612yC.LJIL(c19925512xh.LIZLLL, c19888812rm3);
                    return iLJIILIIL;
                case 14:
                    C19889012ro c19889012ro4 = new C19889012ro();
                    int iLJIILJJIL2 = LJIILJJIL(bArr, iLJIILLIIL, c19889012ro4, c19926712xt);
                    C19928512yB.LJIIIZ(abstractC19925012xc, i4, c19889012ro4, c19925512xh.LIZLLL.LL, null, abstractC19929412yK);
                    c19928612yC.LJIL(c19925512xh.LIZLLL, c19889012ro4);
                    return iLJIILJJIL2;
                default:
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Type cannot be packed: ");
                    sbLIZ.append(c19925512xh.LIZLLL.LLILLL);
                    throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ));
            }
        }
        AnonymousClass1334 anonymousClass1334 = c19926412xq.LLILLL;
        Object objValueOf = null;
        if (anonymousClass1334 == AnonymousClass1334.ENUM) {
            iLJIILLIIL = LJIJI(bArr, iLJIILLIIL, c19926712xt);
            if (c19925512xh.LIZLLL.LL.LIZJ(c19926712xt.LIZ) == null) {
                C19928512yB.LJIILIIL(abstractC19925012xc, i4, c19926712xt.LIZ, null, abstractC19929412yK);
                return iLJIILLIIL;
            }
            objValueOf = Integer.valueOf(c19926712xt.LIZ);
        } else {
            switch (AnonymousClass1338.LIZ[anonymousClass1334.ordinal()]) {
                case 1:
                    objValueOf = Double.valueOf(Double.longBitsToDouble(LIZLLL(iLJIILLIIL, bArr)));
                    iLJIILLIIL += 8;
                    break;
                case 2:
                    objValueOf = Float.valueOf(Float.intBitsToFloat(LIZJ(iLJIILLIIL, bArr)));
                    iLJIILLIIL += 4;
                    break;
                case 3:
                case 4:
                    iLJIILLIIL = LJIJJLI(bArr, iLJIILLIIL, c19926712xt);
                    objValueOf = Long.valueOf(c19926712xt.LIZIZ);
                    break;
                case 5:
                case 6:
                    iLJIILLIIL = LJIJI(bArr, iLJIILLIIL, c19926712xt);
                    objValueOf = Integer.valueOf(c19926712xt.LIZ);
                    break;
                case 7:
                case 8:
                    objValueOf = Long.valueOf(LIZLLL(iLJIILLIIL, bArr));
                    iLJIILLIIL += 8;
                    break;
                case BdTuring.TYPE_ECAF /* 9 */:
                case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                    objValueOf = Integer.valueOf(LIZJ(iLJIILLIIL, bArr));
                    iLJIILLIIL += 4;
                    break;
                case BdTuring.TYPE_EMAIL /* 11 */:
                    iLJIILLIIL = LJIJJLI(bArr, iLJIILLIIL, c19926712xt);
                    if (c19926712xt.LIZIZ != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    objValueOf = Boolean.valueOf(z);
                    break;
                case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                    iLJIILLIIL = LJIJI(bArr, iLJIILLIIL, c19926712xt);
                    objValueOf = Integer.valueOf(AbstractC19927312xz.LIZLLL(c19926712xt.LIZ));
                    break;
                case BdTuring.TYPE_SMS_VOICE /* 13 */:
                    iLJIILLIIL = LJIJJLI(bArr, iLJIILLIIL, c19926712xt);
                    objValueOf = Long.valueOf(AbstractC19927312xz.LJ(c19926712xt.LIZIZ));
                    break;
                case 14:
                    throw new IllegalStateException("Shouldn't reach here.");
                case 15:
                    iLJIILLIIL = LIZ(bArr, iLJIILLIIL, c19926712xt);
                    objValueOf = c19926712xt.LIZJ;
                    break;
                case 16:
                    iLJIILLIIL = LJIILLIIL(bArr, iLJIILLIIL, c19926712xt);
                    objValueOf = c19926712xt.LIZJ;
                    break;
                case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                    int i5 = (i4 << 3) | 4;
                    InterfaceC19924912xb interfaceC19924912xbLIZ = C19921412x2.LIZJ.LIZ(c19925512xh.LIZJ.getClass());
                    C19926412xq c19926412xq2 = c19925512xh.LIZLLL;
                    if (c19926412xq2.LLILZ) {
                        int iLJ = LJ(interfaceC19924912xbLIZ, bArr, iLJIILLIIL, i3, i5, c19926712xt);
                        c19928612yC.LIZ(c19925512xh.LIZLLL, c19926712xt.LIZJ);
                        return iLJ;
                    }
                    Object objLJIIIIZZ = c19928612yC.LJIIIIZZ(c19926412xq2);
                    if (objLJIIIIZZ == null) {
                        objLJIIIIZZ = interfaceC19924912xbLIZ.newInstance();
                        c19928612yC.LJIL(c19925512xh.LIZLLL, objLJIIIIZZ);
                    }
                    return LJIL(objLJIIIIZZ, interfaceC19924912xbLIZ, bArr, iLJIILLIIL, i3, i5, c19926712xt);
                case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                    InterfaceC19924912xb interfaceC19924912xbLIZ2 = C19921412x2.LIZJ.LIZ(c19925512xh.LIZJ.getClass());
                    C19926412xq c19926412xq3 = c19925512xh.LIZLLL;
                    if (c19926412xq3.LLILZ) {
                        int iLJFF = LJFF(interfaceC19924912xbLIZ2, bArr, iLJIILLIIL, i3, c19926712xt);
                        c19928612yC.LIZ(c19925512xh.LIZLLL, c19926712xt.LIZJ);
                        return iLJFF;
                    }
                    Object objLJIIIIZZ2 = c19928612yC.LJIIIIZZ(c19926412xq3);
                    if (objLJIIIIZZ2 == null) {
                        objLJIIIIZZ2 = interfaceC19924912xbLIZ2.newInstance();
                        c19928612yC.LJIL(c19925512xh.LIZLLL, objLJIIIIZZ2);
                    }
                    return LJJ(objLJIIIIZZ2, interfaceC19924912xbLIZ2, bArr, iLJIILLIIL, i3, c19926712xt);
            }
        }
        C19926412xq c19926412xq4 = c19925512xh.LIZLLL;
        if (c19926412xq4.LLILZ) {
            c19928612yC.LIZ(c19926412xq4, objValueOf);
            return iLJIILLIIL;
        }
        c19928612yC.LJIL(c19926412xq4, objValueOf);
        return iLJIILLIIL;
    }
}
