package X;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.lynx.base.log.LynxLog;
import com.lynx.react.bridge.ReadableArray;

/* JADX INFO: renamed from: X.0kIP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1313910kIP {
    public static Matrix LJIIIIZZ;
    public static final double LJIIIZ = Math.sqrt(2.0d);
    public Path LIZ;
    public final int LIZIZ;
    public int LIZJ;
    public int LIZLLL;
    public C1314450kJH[] LJ;
    public double[] LJFF;
    public C1313900kIO LJI;
    public int LJII;

    public C1313910kIP(int i) {
        this.LIZIZ = i;
    }

    public C1313910kIP(String str, float f) {
        this.LIZIZ = 3;
        try {
            this.LIZ = C21518819Ji.LIZLLL(str);
        } catch (RuntimeException e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Create path from data string failed. Check the path string. \n");
            sbLIZ.append(str);
            LynxLog.e("LynxBasicShape", C2188811AlT.LIZIZ(sbLIZ));
        }
        if (this.LIZ == null) {
            LynxLog.e("LynxBasicShape", "Invalid path data string: " + str);
        } else {
            if (LJIIIIZZ == null) {
                LJIIIIZZ = new Matrix();
            }
            LJIIIIZZ.setScale(f, f);
            this.LIZ.transform(LJIIIIZZ);
        }
    }

    public static C1313910kIP LIZ(ReadableArray readableArray, float f) {
        if (readableArray != null && readableArray.size() > 1) {
            int size = readableArray.size();
            int i = 0;
            long j = readableArray.getLong(0);
            if (j == 3) {
                if (size != 2) {
                    return null;
                }
                return new C1313910kIP(readableArray.getString(1), f);
            }
            int i2 = 11;
            if (j == 4) {
                if (size != 11) {
                    return null;
                }
                C1313910kIP c1313910kIP = new C1313910kIP(4);
                C1314450kJH[] c1314450kJHArr = new C1314450kJH[4];
                c1313910kIP.LJ = c1314450kJHArr;
                c1314450kJHArr[0] = new C1314450kJH(readableArray.getDouble(1), readableArray.getInt(2));
                c1313910kIP.LJ[1] = new C1314450kJH(readableArray.getDouble(3), readableArray.getInt(4));
                c1313910kIP.LJ[2] = new C1314450kJH(readableArray.getDouble(7), readableArray.getInt(8));
                c1313910kIP.LJ[3] = new C1314450kJH(readableArray.getDouble(9), readableArray.getInt(10));
                c1313910kIP.LJFF = new double[]{readableArray.getDouble(5), 0.0d};
                c1313910kIP.LJFF[1] = readableArray.getDouble(6);
                return c1313910kIP;
            }
            if (j == 1) {
                if (size != 7) {
                    return null;
                }
                C1313910kIP c1313910kIP2 = new C1313910kIP(1);
                C1314450kJH[] c1314450kJHArr2 = new C1314450kJH[3];
                c1313910kIP2.LJ = c1314450kJHArr2;
                c1314450kJHArr2[0] = new C1314450kJH(readableArray.getDouble(1), readableArray.getInt(2));
                c1313910kIP2.LJ[1] = new C1314450kJH(readableArray.getDouble(3), readableArray.getInt(4));
                c1313910kIP2.LJ[2] = new C1314450kJH(readableArray.getDouble(5), readableArray.getInt(6));
                return c1313910kIP2;
            }
            if (j == 2) {
                if (size != 9) {
                    return null;
                }
                C1313910kIP c1313910kIP3 = new C1313910kIP(2);
                C1314450kJH[] c1314450kJHArr3 = new C1314450kJH[4];
                c1313910kIP3.LJ = c1314450kJHArr3;
                c1314450kJHArr3[0] = new C1314450kJH(readableArray.getDouble(1), readableArray.getInt(2));
                c1313910kIP3.LJ[1] = new C1314450kJH(readableArray.getDouble(3), readableArray.getInt(4));
                c1313910kIP3.LJ[2] = new C1314450kJH(readableArray.getDouble(5), readableArray.getInt(6));
                c1313910kIP3.LJ[3] = new C1314450kJH(readableArray.getDouble(7), readableArray.getInt(8));
                return c1313910kIP3;
            }
            if (j == 5) {
                C1313910kIP c1313910kIP4 = new C1313910kIP(5);
                c1313910kIP4.LJ = new C1314450kJH[4];
                if (readableArray.size() == 9) {
                    c1313910kIP4.LJII = 1;
                } else if (readableArray.size() == 25) {
                    c1313910kIP4.LJII = 2;
                } else if (readableArray.size() == 27) {
                    c1313910kIP4.LJII = 3;
                }
                int i3 = 0;
                do {
                    int i4 = i3 * 2;
                    c1313910kIP4.LJ[i3] = new C1314450kJH(readableArray.getDouble(i4 + 1), readableArray.getInt(i4 + 2));
                    i3++;
                } while (i3 < 4);
                int i5 = c1313910kIP4.LJII;
                if (i5 != 2) {
                    if (i5 == 3) {
                        c1313910kIP4.LJFF = new double[]{readableArray.getDouble(9), 0.0d};
                        c1313910kIP4.LJFF[1] = readableArray.getDouble(10);
                    }
                    return c1313910kIP4;
                }
                i2 = 9;
                c1313910kIP4.LJI = new C1313900kIO();
                do {
                    c1313910kIP4.LJI.LIZJ(i, C1314110kIj.LIZ((i * 4) + i2, readableArray));
                    i++;
                } while (i < 4);
                return c1313910kIP4;
            }
        }
        return null;
    }

    public static double LIZLLL(C1314450kJH c1314450kJH, double d) {
        if (c1314450kJH == null) {
            return 0.0d;
        }
        if (c1314450kJH.LIZIZ == 1) {
            return c1314450kJH.LIZ * d;
        }
        return c1314450kJH.LIZ;
    }

    public final Path LIZJ(int i, int i2) {
        double[] dArr;
        C1314450kJH[] c1314450kJHArr;
        Path path;
        int i3 = this.LIZIZ;
        if (i3 == 3) {
            return this.LIZ;
        }
        if (i3 == 0) {
            return null;
        }
        if (i == this.LIZJ && i2 == this.LIZLLL && (path = this.LIZ) != null) {
            return path;
        }
        this.LIZJ = i;
        this.LIZLLL = i2;
        Path path2 = this.LIZ;
        if (path2 == null) {
            this.LIZ = new Path();
        } else {
            path2.reset();
        }
        int i4 = this.LIZIZ;
        int i5 = 1;
        if (i4 != 1) {
            if (i4 != 2) {
                if (i4 != 4) {
                    if (i4 == 5 && (c1314450kJHArr = this.LJ) != null && c1314450kJHArr.length == 4) {
                        double d = i2;
                        double dLIZLLL = LIZLLL(c1314450kJHArr[0], d);
                        double d2 = i;
                        double dLIZLLL2 = LIZLLL(this.LJ[1], d2);
                        double dLIZLLL3 = LIZLLL(this.LJ[2], d);
                        double dLIZLLL4 = LIZLLL(this.LJ[3], d2);
                        double d3 = dLIZLLL + dLIZLLL3;
                        double d4 = dLIZLLL4 + dLIZLLL2;
                        if (d3 != 0.0d && d3 > d) {
                            double d5 = d / d3;
                            dLIZLLL *= d5;
                            dLIZLLL3 *= d5;
                        }
                        if (d4 != 0.0d && d4 > d2) {
                            double d6 = d2 / d4;
                            dLIZLLL4 *= d6;
                            dLIZLLL2 *= d6;
                        }
                        RectF rectF = new RectF((float) dLIZLLL4, (float) dLIZLLL, (float) (d2 - dLIZLLL2), (float) (d - dLIZLLL3));
                        int i6 = this.LJII;
                        if (i6 != 1) {
                            if (i6 != 2) {
                                if (i6 == 3) {
                                    this.LJI.LIZLLL(rectF.width(), rectF.height());
                                    float[] fArrLIZ = this.LJI.LIZ();
                                    if (fArrLIZ.length >= 8) {
                                        float f = fArrLIZ[4];
                                        float f2 = fArrLIZ[5];
                                        float f3 = rectF.right - f;
                                        float f4 = rectF.bottom - f2;
                                        double[] dArr2 = this.LJFF;
                                        float f5 = (float) dArr2[0];
                                        float f6 = (float) dArr2[1];
                                        LIZIZ(this.LIZ, f, f2, f3, f4, f5, f6, 1);
                                        float f7 = fArrLIZ[6];
                                        float f8 = fArrLIZ[7];
                                        LIZIZ(this.LIZ, f7, f8, rectF.left + f7, rectF.bottom - f8, f5, f6, 2);
                                        float f9 = fArrLIZ[0];
                                        float f10 = fArrLIZ[1];
                                        LIZIZ(this.LIZ, f9, f10, rectF.left + f9, rectF.top + f10, f5, f6, 3);
                                        float f11 = fArrLIZ[2];
                                        float f12 = fArrLIZ[3];
                                        LIZIZ(this.LIZ, f11, f12, rectF.right - f11, rectF.top + f12, f5, f6, 4);
                                        this.LIZ.close();
                                    }
                                }
                            } else {
                                this.LJI.LIZLLL(rectF.width(), rectF.height());
                                this.LIZ.addRoundRect(rectF, this.LJI.LIZ(), Path.Direction.CW);
                            }
                        } else {
                            this.LIZ.addRect(rectF, Path.Direction.CW);
                        }
                    }
                } else {
                    C1314450kJH[] c1314450kJHArr2 = this.LJ;
                    if (c1314450kJHArr2 != null && c1314450kJHArr2.length == 4 && (dArr = this.LJFF) != null && dArr.length == 2) {
                        double d7 = i;
                        float fLIZLLL = (float) LIZLLL(c1314450kJHArr2[0], d7);
                        float fLIZLLL2 = (float) LIZLLL(this.LJ[1], d7);
                        float fLIZLLL3 = (float) LIZLLL(this.LJ[2], d7);
                        float fLIZLLL4 = (float) LIZLLL(this.LJ[3], i2);
                        double[] dArr3 = this.LJFF;
                        float f13 = (float) dArr3[0];
                        float f14 = (float) dArr3[1];
                        if (fLIZLLL != 0.0f || fLIZLLL2 != 0.0f) {
                            do {
                                LIZIZ(this.LIZ, fLIZLLL, fLIZLLL2, fLIZLLL3, fLIZLLL4, f13, f14, i5);
                                i5++;
                            } while (i5 <= 4);
                            this.LIZ.close();
                        }
                    }
                }
            } else {
                C1314450kJH[] c1314450kJHArr3 = this.LJ;
                if (c1314450kJHArr3 != null && c1314450kJHArr3.length == 4) {
                    double d8 = i;
                    float fLIZLLL5 = (float) LIZLLL(c1314450kJHArr3[0], d8);
                    float fLIZLLL6 = (float) LIZLLL(this.LJ[1], d8);
                    float fLIZLLL7 = (float) LIZLLL(this.LJ[2], d8);
                    float fLIZLLL8 = (float) LIZLLL(this.LJ[3], i2);
                    if (fLIZLLL5 != 0.0f || fLIZLLL6 != 0.0f) {
                        this.LIZ.addOval(fLIZLLL7 - fLIZLLL5, fLIZLLL8 - fLIZLLL6, fLIZLLL7 + fLIZLLL5, fLIZLLL8 + fLIZLLL6, Path.Direction.CW);
                    }
                }
            }
        } else {
            C1314450kJH[] c1314450kJHArr4 = this.LJ;
            if (c1314450kJHArr4 != null && c1314450kJHArr4.length == 3) {
                this.LIZ.addCircle((float) LIZLLL(this.LJ[1], i), (float) LIZLLL(this.LJ[2], i2), (float) LIZLLL(c1314450kJHArr4[0], Math.sqrt((i * i) + (i2 * i2)) / LJIIIZ), Path.Direction.CW);
            }
        }
        return this.LIZ;
    }

    public static void LIZIZ(Path path, float f, float f2, float f3, float f4, float f5, float f6, int i) {
        float f7;
        float f8 = -1.0f;
        if (i != 1 && i != 4) {
            f7 = -1.0f;
        } else {
            f7 = 1.0f;
        }
        if (i == 1 || i == 2) {
            f8 = 1.0f;
        }
        double d = 1.5707963267948966d;
        float f9 = (float) (((double) (i - 1)) * 1.5707963267948966d);
        while (true) {
            double d2 = f9;
            if (d2 < ((double) i) * d) {
                double dCos = ((double) f7) * Math.cos(d2);
                double dSin = ((double) f8) * Math.sin(d2);
                double dPow = (((double) (f7 * f)) * Math.pow(dCos, 2.0f / f5)) + ((double) f3);
                double dPow2 = (((double) (f8 * f2)) * Math.pow(dSin, 2.0f / f6)) + ((double) f4);
                if (f9 == 0.0f) {
                    path.moveTo((float) dPow, (float) dPow2);
                } else {
                    path.lineTo((float) dPow, (float) dPow2);
                }
                f9 = (float) (d2 + 0.01d);
                d = 1.5707963267948966d;
            } else {
                return;
            }
        }
    }
}
