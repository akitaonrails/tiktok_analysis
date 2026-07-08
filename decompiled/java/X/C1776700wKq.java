package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;

/* JADX INFO: renamed from: X.0wKq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1776700wKq {
    public static final void LIZIZ(List list, InterfaceC1680960tqQ interfaceC1680960tqQ) {
        AbstractC1776680wKo abstractC1776680wKo;
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        int iLIZIZ = interfaceC1680960tqQ.LIZIZ();
        interfaceC1680960tqQ.LJJJJLL();
        interfaceC1680960tqQ.LJFF(iLIZIZ);
        if (list.isEmpty()) {
            abstractC1776680wKo = C1776690wKp.LIZJ;
        } else {
            abstractC1776680wKo = (AbstractC1776680wKo) ListProtector.get(list, 0);
        }
        int size = list.size();
        float f8 = 0.0f;
        int i = 0;
        float f9 = 0.0f;
        float f10 = 0.0f;
        float f11 = 0.0f;
        float f12 = 0.0f;
        float f13 = 0.0f;
        float f14 = 0.0f;
        while (i < size) {
            AbstractC1776680wKo abstractC1776680wKo2 = (AbstractC1776680wKo) ListProtector.get(list, i);
            if (abstractC1776680wKo2 instanceof C1776690wKp) {
                interfaceC1680960tqQ.close();
                f9 = f13;
                f11 = f13;
                f10 = f14;
                f12 = f14;
            } else if (abstractC1776680wKo2 instanceof C1776660wKm) {
                C1776660wKm c1776660wKm = (C1776660wKm) abstractC1776680wKo2;
                float f15 = c1776660wKm.LIZJ;
                f13 = f11 + f15;
                float f16 = c1776660wKm.LIZLLL;
                f14 = f12 + f16;
                interfaceC1680960tqQ.LJIIIIZZ(f15, f16);
                f11 = f13;
                f12 = f14;
            } else if (abstractC1776680wKo2 instanceof C1776630wKj) {
                C1776630wKj c1776630wKj = (C1776630wKj) abstractC1776680wKo2;
                f11 = c1776630wKj.LIZJ;
                f12 = c1776630wKj.LIZLLL;
                interfaceC1680960tqQ.LIZJ(f11, f12);
                f14 = f12;
                f13 = f11;
            } else {
                if (abstractC1776680wKo2 instanceof C1776650wKl) {
                    C1776650wKl c1776650wKl = (C1776650wKl) abstractC1776680wKo2;
                    interfaceC1680960tqQ.LJII(c1776650wKl.LIZJ, c1776650wKl.LIZLLL);
                    f11 += c1776650wKl.LIZJ;
                    f4 = c1776650wKl.LIZLLL;
                } else if (abstractC1776680wKo2 instanceof C1776620wKi) {
                    C1776620wKi c1776620wKi = (C1776620wKi) abstractC1776680wKo2;
                    interfaceC1680960tqQ.LJIIL(c1776620wKi.LIZJ, c1776620wKi.LIZLLL);
                    f11 = c1776620wKi.LIZJ;
                    f12 = c1776620wKi.LIZLLL;
                } else if (abstractC1776680wKo2 instanceof C1776590wKf) {
                    C1776590wKf c1776590wKf = (C1776590wKf) abstractC1776680wKo2;
                    interfaceC1680960tqQ.LJII(c1776590wKf.LIZJ, f8);
                    f11 += c1776590wKf.LIZJ;
                } else if (abstractC1776680wKo2 instanceof C1776580wKe) {
                    C1776580wKe c1776580wKe = (C1776580wKe) abstractC1776680wKo2;
                    interfaceC1680960tqQ.LJIIL(c1776580wKe.LIZJ, f12);
                    f11 = c1776580wKe.LIZJ;
                } else if (abstractC1776680wKo2 instanceof C1776600wKg) {
                    C1776600wKg c1776600wKg = (C1776600wKg) abstractC1776680wKo2;
                    interfaceC1680960tqQ.LJII(f8, c1776600wKg.LIZJ);
                    f4 = c1776600wKg.LIZJ;
                } else if (abstractC1776680wKo2 instanceof C1776610wKh) {
                    C1776610wKh c1776610wKh = (C1776610wKh) abstractC1776680wKo2;
                    interfaceC1680960tqQ.LJIIL(f11, c1776610wKh.LIZJ);
                    f12 = c1776610wKh.LIZJ;
                } else {
                    if (abstractC1776680wKo2 instanceof C1776770wKx) {
                        C1776770wKx c1776770wKx = (C1776770wKx) abstractC1776680wKo2;
                        interfaceC1680960tqQ.LJIIIZ(c1776770wKx.LIZJ, c1776770wKx.LIZLLL, c1776770wKx.LJ, c1776770wKx.LJFF, c1776770wKx.LJI, c1776770wKx.LJII);
                        f9 = c1776770wKx.LJ + f11;
                        f10 = c1776770wKx.LJFF + f12;
                        f11 += c1776770wKx.LJI;
                        f3 = c1776770wKx.LJII;
                    } else if (abstractC1776680wKo2 instanceof C1776740wKu) {
                        C1776740wKu c1776740wKu = (C1776740wKu) abstractC1776680wKo2;
                        interfaceC1680960tqQ.LJI(c1776740wKu.LIZJ, c1776740wKu.LIZLLL, c1776740wKu.LJ, c1776740wKu.LJFF, c1776740wKu.LJI, c1776740wKu.LJII);
                        f9 = c1776740wKu.LJ;
                        f10 = c1776740wKu.LJFF;
                        f11 = c1776740wKu.LJI;
                        f12 = c1776740wKu.LJII;
                    } else if (abstractC1776680wKo2 instanceof C1776790wKz) {
                        if (abstractC1776680wKo.LIZ) {
                            f6 = f11 - f9;
                            f7 = f12 - f10;
                        } else {
                            f6 = 0.0f;
                            f7 = 0.0f;
                        }
                        C1776790wKz c1776790wKz = (C1776790wKz) abstractC1776680wKo2;
                        interfaceC1680960tqQ.LJIIIZ(f6, f7, c1776790wKz.LIZJ, c1776790wKz.LIZLLL, c1776790wKz.LJ, c1776790wKz.LJFF);
                        f9 = c1776790wKz.LIZJ + f11;
                        f10 = c1776790wKz.LIZLLL + f12;
                        f11 += c1776790wKz.LJ;
                        f3 = c1776790wKz.LJFF;
                    } else if (abstractC1776680wKo2 instanceof C1776760wKw) {
                        if (abstractC1776680wKo.LIZ) {
                            float f18 = 2;
                            f11 = (f11 * f18) - f9;
                            f5 = (f18 * f12) - f10;
                        } else {
                            f5 = f12;
                        }
                        C1776760wKw c1776760wKw = (C1776760wKw) abstractC1776680wKo2;
                        interfaceC1680960tqQ.LJI(f11, f5, c1776760wKw.LIZJ, c1776760wKw.LIZLLL, c1776760wKw.LJ, c1776760wKw.LJFF);
                        f9 = c1776760wKw.LIZJ;
                        f10 = c1776760wKw.LIZLLL;
                        f11 = c1776760wKw.LJ;
                        f12 = c1776760wKw.LJFF;
                    } else if (abstractC1776680wKo2 instanceof C1776780wKy) {
                        C1776780wKy c1776780wKy = (C1776780wKy) abstractC1776680wKo2;
                        interfaceC1680960tqQ.LIZ(c1776780wKy.LIZJ, c1776780wKy.LIZLLL, c1776780wKy.LJ, c1776780wKy.LJFF);
                        f9 = c1776780wKy.LIZJ + f11;
                        f10 = c1776780wKy.LIZLLL + f12;
                        f11 += c1776780wKy.LJ;
                        f4 = c1776780wKy.LJFF;
                    } else if (abstractC1776680wKo2 instanceof C1776750wKv) {
                        C1776750wKv c1776750wKv = (C1776750wKv) abstractC1776680wKo2;
                        interfaceC1680960tqQ.LJ(c1776750wKv.LIZJ, c1776750wKv.LIZLLL, c1776750wKv.LJ, c1776750wKv.LJFF);
                        f9 = c1776750wKv.LIZJ;
                        f10 = c1776750wKv.LIZLLL;
                        f11 = c1776750wKv.LJ;
                        f12 = c1776750wKv.LJFF;
                    } else if (abstractC1776680wKo2 instanceof C1776670wKn) {
                        if (abstractC1776680wKo.LIZIZ) {
                            f = f11 - f9;
                            f2 = f12 - f10;
                        } else {
                            f = 0.0f;
                            f2 = 0.0f;
                        }
                        C1776670wKn c1776670wKn = (C1776670wKn) abstractC1776680wKo2;
                        interfaceC1680960tqQ.LIZ(f, f2, c1776670wKn.LIZJ, c1776670wKn.LIZLLL);
                        f9 = f + f11;
                        f10 = f2 + f12;
                        f11 += c1776670wKn.LIZJ;
                        f3 = c1776670wKn.LIZLLL;
                    } else if (abstractC1776680wKo2 instanceof C1776640wKk) {
                        if (abstractC1776680wKo.LIZIZ) {
                            float f19 = 2;
                            f11 = (f11 * f19) - f9;
                            f12 = (f19 * f12) - f10;
                        }
                        C1776640wKk c1776640wKk = (C1776640wKk) abstractC1776680wKo2;
                        interfaceC1680960tqQ.LJ(f11, f12, c1776640wKk.LIZJ, c1776640wKk.LIZLLL);
                        float f20 = c1776640wKk.LIZJ;
                        f10 = f12;
                        f12 = c1776640wKk.LIZLLL;
                        f9 = f11;
                        f11 = f20;
                    } else {
                        if (abstractC1776680wKo2 instanceof C1776720wKs) {
                            C1776720wKs c1776720wKs = (C1776720wKs) abstractC1776680wKo2;
                            f9 = c1776720wKs.LJII + f11;
                            f10 = c1776720wKs.LJIIIIZZ + f12;
                            LIZ(interfaceC1680960tqQ, f11, f12, f9, f10, c1776720wKs.LIZJ, c1776720wKs.LIZLLL, c1776720wKs.LJ, c1776720wKs.LJFF, c1776720wKs.LJI);
                        } else if (abstractC1776680wKo2 instanceof C1776710wKr) {
                            C1776710wKr c1776710wKr = (C1776710wKr) abstractC1776680wKo2;
                            LIZ(interfaceC1680960tqQ, f11, f12, c1776710wKr.LJII, c1776710wKr.LJIIIIZZ, c1776710wKr.LIZJ, c1776710wKr.LIZLLL, c1776710wKr.LJ, c1776710wKr.LJFF, c1776710wKr.LJI);
                            f9 = c1776710wKr.LJII;
                            f10 = c1776710wKr.LJIIIIZZ;
                        }
                        f12 = f10;
                        f11 = f9;
                    }
                    f12 += f3;
                }
                f12 += f4;
            }
            i++;
            f8 = 0.0f;
            abstractC1776680wKo = abstractC1776680wKo2;
        }
    }

    public static final void LIZ(InterfaceC1680960tqQ interfaceC1680960tqQ, double d, double d2, double d3, double d4, double d5, double d6, double d7, boolean z, boolean z2) {
        double d8;
        double d9;
        boolean z3;
        double d10 = d2;
        double d11 = d;
        double d12 = (d7 / ((double) 180)) * 3.141592653589793d;
        double dCos = Math.cos(d12);
        double dSin = Math.sin(d12);
        double d13 = ((d11 * dCos) + (d10 * dSin)) / d5;
        double d14 = (((-d11) * dSin) + (d10 * dCos)) / d6;
        double d15 = ((d3 * dCos) + (d4 * dSin)) / d5;
        double d16 = (((-d3) * dSin) + (d4 * dCos)) / d6;
        double d17 = d13 - d15;
        double d18 = d14 - d16;
        double d19 = 2;
        double d20 = (d13 + d15) / d19;
        double d21 = (d14 + d16) / d19;
        double d22 = (d17 * d17) + (d18 * d18);
        if (d22 == 0.0d) {
            return;
        }
        double d23 = (1.0d / d22) - 0.25d;
        if (d23 < 0.0d) {
            double dSqrt = (float) (Math.sqrt(d22) / 1.99999d);
            LIZ(interfaceC1680960tqQ, d11, d10, d3, d4, d5 * dSqrt, d6 * dSqrt, d7, z, z2);
            return;
        }
        double dSqrt2 = Math.sqrt(d23);
        double d24 = d17 * dSqrt2;
        double d25 = dSqrt2 * d18;
        if (z == z2) {
            d8 = d20 - d25;
            d9 = d21 + d24;
        } else {
            d8 = d20 + d25;
            d9 = d21 - d24;
        }
        double dAtan2 = Math.atan2(d14 - d9, d13 - d8);
        double dAtan22 = Math.atan2(d16 - d9, d15 - d8) - dAtan2;
        if (dAtan22 >= 0.0d) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z2 != z3) {
            if (dAtan22 > 0.0d) {
                dAtan22 -= 6.283185307179586d;
            } else {
                dAtan22 += 6.283185307179586d;
            }
        }
        double d26 = d8 * d5;
        double d27 = d9 * d6;
        double d28 = (d26 * dCos) - (d27 * dSin);
        double d29 = (d26 * dSin) + (d27 * dCos);
        double d30 = 4;
        int iCeil = (int) Math.ceil(Math.abs((dAtan22 * d30) / 3.141592653589793d));
        double dCos2 = Math.cos(d12);
        double dSin2 = Math.sin(d12);
        double dCos3 = Math.cos(dAtan2);
        double dSin3 = Math.sin(dAtan2);
        double d31 = -d5;
        double d32 = d31 * dCos2;
        double d33 = d6 * dSin2;
        double d34 = (d32 * dSin3) - (d33 * dCos3);
        double d35 = d31 * dSin2;
        double d36 = d6 * dCos2;
        double d37 = (dSin3 * d35) + (dCos3 * d36);
        double d38 = dAtan22 / ((double) iCeil);
        int i = 0;
        while (i < iCeil) {
            double d39 = dAtan2 + d38;
            double dSin4 = Math.sin(d39);
            double dCos4 = Math.cos(d39);
            double d40 = (d28 + ((d5 * dCos2) * dCos4)) - (d33 * dSin4);
            double d41 = d29 + (d5 * dSin2 * dCos4) + (d36 * dSin4);
            double d42 = (d32 * dSin4) - (d33 * dCos4);
            double d43 = (dSin4 * d35) + (dCos4 * d36);
            double d44 = d39 - dAtan2;
            double dTan = Math.tan(d44 / d19);
            double dSin5 = (Math.sin(d44) * (Math.sqrt(d30 + ((3.0d * dTan) * dTan)) - ((double) 1))) / ((double) 3);
            interfaceC1680960tqQ.LJI((float) (d11 + (d34 * dSin5)), (float) (d10 + (d37 * dSin5)), (float) (d40 - (dSin5 * d42)), (float) (d41 - (dSin5 * d43)), (float) d40, (float) d41);
            i++;
            d11 = d40;
            dAtan2 = d39;
            d37 = d43;
            d34 = d42;
            d10 = d41;
        }
    }
}
