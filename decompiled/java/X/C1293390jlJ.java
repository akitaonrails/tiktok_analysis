package X;

import android.graphics.Path;
import android.graphics.PointF;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0jlJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1293390jlJ implements InterfaceC1292610jk3, InterfaceC1293690jln, InterfaceC1291770jih {
    public final Path LIZ = new Path();
    public final String LIZIZ;
    public final C1291430ji9 LIZJ;
    public final EnumC1293560jla LIZLLL;
    public final C1293040jkk LJ;
    public final AbstractC1293310jlB<?, PointF> LJFF;
    public final C1293040jkk LJI;
    public final C1293040jkk LJII;
    public final C1293040jkk LJIIIIZZ;
    public final C1293040jkk LJIIIZ;
    public final C1293040jkk LJIIJ;
    public C1293500jlU LJIIJJI;
    public boolean LJIIL;

    @Override // X.InterfaceC1293690jln
    public final void LIZJ() {
        this.LJIIL = false;
        this.LIZJ.invalidateSelf();
    }

    @Override // X.InterfaceC1292610jk3
    public final Path getPath() {
        float fCos;
        float fSin;
        double d;
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        if (this.LJIIL) {
            return this.LIZ;
        }
        this.LIZ.reset();
        int i = C1293570jlb.LIZ[this.LIZLLL.ordinal()];
        if (i == 1) {
            float fFloatValue = this.LJ.LJ().floatValue();
            double radians = Math.toRadians((this.LJI != null ? r0.LJ().floatValue() : 0.0d) - 90.0d);
            double d2 = fFloatValue;
            float f6 = (float) (6.283185307179586d / d2);
            float f7 = f6 / 2.0f;
            float f8 = fFloatValue - ((int) fFloatValue);
            if (f8 != 0.0f) {
                radians += (double) ((1.0f - f8) * f7);
            }
            float fFloatValue2 = this.LJIIIIZZ.LJ().floatValue();
            float fFloatValue3 = this.LJII.LJ().floatValue();
            C1293040jkk c1293040jkk = this.LJIIIZ;
            float fFloatValue4 = c1293040jkk != null ? c1293040jkk.LJ().floatValue() / 100.0f : 0.0f;
            C1293040jkk c1293040jkk2 = this.LJIIJ;
            float fFloatValue5 = c1293040jkk2 != null ? c1293040jkk2.LJ().floatValue() / 100.0f : 0.0f;
            if (f8 != 0.0f) {
                f = ((fFloatValue2 - fFloatValue3) * f8) + fFloatValue3;
                double d3 = f;
                fCos = (float) (d3 * Math.cos(radians));
                fSin = (float) (d3 * Math.sin(radians));
                this.LIZ.moveTo(fCos, fSin);
                d = radians + ((double) ((f6 * f8) / 2.0f));
            } else {
                double d4 = fFloatValue2;
                fCos = (float) (Math.cos(radians) * d4);
                fSin = (float) (d4 * Math.sin(radians));
                this.LIZ.moveTo(fCos, fSin);
                d = radians + ((double) f7);
                f = 0.0f;
            }
            double dCeil = Math.ceil(d2) * 2.0d;
            boolean z = false;
            int i2 = 0;
            while (true) {
                double d5 = i2;
                if (d5 >= dCeil) {
                    break;
                }
                float f9 = z ? fFloatValue2 : fFloatValue3;
                float f10 = (f == 0.0f || d5 != dCeil - 2.0d) ? f7 : (f6 * f8) / 2.0f;
                if (f != 0.0f && d5 == dCeil - 1.0d) {
                    f9 = f;
                }
                double d6 = f9;
                float fCos2 = (float) (d6 * Math.cos(d));
                float fSin2 = (float) (d6 * Math.sin(d));
                if (fFloatValue4 == 0.0f && fFloatValue5 == 0.0f) {
                    this.LIZ.lineTo(fCos2, fSin2);
                } else {
                    double dAtan2 = (float) (Math.atan2(fSin, fCos) - 1.5707963267948966d);
                    float fCos3 = (float) Math.cos(dAtan2);
                    float fSin3 = (float) Math.sin(dAtan2);
                    double dAtan22 = (float) (Math.atan2(fSin2, fCos2) - 1.5707963267948966d);
                    float fCos4 = (float) Math.cos(dAtan22);
                    float fSin4 = (float) Math.sin(dAtan22);
                    if (z) {
                        f2 = fFloatValue4;
                        f3 = fFloatValue5;
                        f4 = fFloatValue3;
                        f5 = fFloatValue2;
                    } else {
                        f2 = fFloatValue5;
                        f3 = fFloatValue4;
                        f4 = fFloatValue2;
                        f5 = fFloatValue3;
                    }
                    float f11 = f4 * f2 * 0.47829f;
                    float f12 = fCos3 * f11;
                    float f13 = f11 * fSin3;
                    float f14 = f5 * f3 * 0.47829f;
                    float f15 = fCos4 * f14;
                    float f16 = f14 * fSin4;
                    if (f8 != 0.0f) {
                        if (i2 == 0) {
                            f12 *= f8;
                            f13 *= f8;
                        } else if (d5 == dCeil - 1.0d) {
                            f15 *= f8;
                            f16 *= f8;
                        }
                    }
                    this.LIZ.cubicTo(fCos - f12, fSin - f13, fCos2 + f15, fSin2 + f16, fCos2, fSin2);
                }
                d += (double) f10;
                z = !z;
                i2++;
                fCos = fCos2;
                fSin = fSin2;
            }
            PointF pointFLJ = this.LJFF.LJ();
            this.LIZ.offset(pointFLJ.x, pointFLJ.y);
            this.LIZ.close();
        } else if (i == 2) {
            int iFloor = (int) Math.floor(this.LJ.LJ().floatValue());
            double radians2 = Math.toRadians((this.LJI != null ? r0.LJ().floatValue() : 0.0d) - 90.0d);
            double d7 = iFloor;
            float fFloatValue6 = this.LJIIJ.LJ().floatValue() / 100.0f;
            float fFloatValue7 = this.LJIIIIZZ.LJ().floatValue();
            double d8 = fFloatValue7;
            float fCos5 = (float) (Math.cos(radians2) * d8);
            float fSin5 = (float) (Math.sin(radians2) * d8);
            this.LIZ.moveTo(fCos5, fSin5);
            double d9 = (float) (6.283185307179586d / d7);
            double d10 = radians2 + d9;
            double dCeil2 = Math.ceil(d7);
            int i3 = 0;
            while (i3 < dCeil2) {
                float fCos6 = (float) (Math.cos(d10) * d8);
                float fSin6 = (float) (Math.sin(d10) * d8);
                if (fFloatValue6 != 0.0f) {
                    double dAtan23 = (float) (Math.atan2(fSin5, fCos5) - 1.5707963267948966d);
                    float fCos7 = (float) Math.cos(dAtan23);
                    float fSin7 = (float) Math.sin(dAtan23);
                    double dAtan24 = (float) (Math.atan2(fSin6, fCos6) - 1.5707963267948966d);
                    float f18 = fFloatValue7 * fFloatValue6 * 0.25f;
                    this.LIZ.cubicTo(fCos5 - (fCos7 * f18), fSin5 - (fSin7 * f18), fCos6 + (((float) Math.cos(dAtan24)) * f18), fSin6 + (f18 * ((float) Math.sin(dAtan24))), fCos6, fSin6);
                } else {
                    this.LIZ.lineTo(fCos6, fSin6);
                }
                d10 += d9;
                i3++;
                fCos5 = fCos6;
                fSin5 = fSin6;
            }
            PointF pointFLJ2 = this.LJFF.LJ();
            this.LIZ.offset(pointFLJ2.x, pointFLJ2.y);
            this.LIZ.close();
        }
        this.LIZ.close();
        C1293420jlM.LIZIZ(this.LIZ, this.LJIIJJI);
        this.LJIIL = true;
        return this.LIZ;
    }

    @Override // X.InterfaceC1291780jii
    public final String getName() {
        return this.LIZIZ;
    }

    @Override // X.InterfaceC1291780jii
    public final void LIZLLL(List<InterfaceC1291780jii> list, List<InterfaceC1291780jii> list2) {
        for (int i = 0; i < ((ArrayList) list).size(); i++) {
            InterfaceC1291780jii interfaceC1291780jii = (InterfaceC1291780jii) ListProtector.get(list, i);
            if (interfaceC1291780jii instanceof C1293500jlU) {
                C1293500jlU c1293500jlU = (C1293500jlU) interfaceC1291780jii;
                if (c1293500jlU.LIZIZ == EnumC994260byq.Simultaneously) {
                    this.LJIIJJI = c1293500jlU;
                    c1293500jlU.LIZIZ(this);
                }
            }
        }
    }

    @Override // X.InterfaceC1291570jiN
    public final <T> void LJI(T t, C1292420jjk<T> c1292420jjk) {
        C1293040jkk c1293040jkk;
        C1293040jkk c1293040jkk2;
        if (t == InterfaceC1292740jkG.LJIILJJIL) {
            this.LJ.LJIIIIZZ(c1292420jjk);
            return;
        }
        if (t == InterfaceC1292740jkG.LJIILL) {
            this.LJI.LJIIIIZZ(c1292420jjk);
            return;
        }
        if (t == InterfaceC1292740jkG.LJII) {
            this.LJFF.LJIIIIZZ(c1292420jjk);
            return;
        }
        if (t == InterfaceC1292740jkG.LJIILLIIL && (c1293040jkk2 = this.LJII) != null) {
            c1293040jkk2.LJIIIIZZ(c1292420jjk);
            return;
        }
        if (t == InterfaceC1292740jkG.LJIIZILJ) {
            this.LJIIIIZZ.LJIIIIZZ(c1292420jjk);
            return;
        }
        if (t == InterfaceC1292740jkG.LJIJ && (c1293040jkk = this.LJIIIZ) != null) {
            c1293040jkk.LJIIIIZZ(c1292420jjk);
        } else {
            if (t != InterfaceC1292740jkG.LJIJI) {
                return;
            }
            this.LJIIJ.LJIIIIZZ(c1292420jjk);
        }
    }

    public C1293390jlJ(C1291430ji9 c1291430ji9, AbstractC1292630jk5 abstractC1292630jk5, C1293510jlV c1293510jlV) {
        this.LIZJ = c1291430ji9;
        this.LIZIZ = c1293510jlV.LIZ;
        EnumC1293560jla enumC1293560jla = c1293510jlV.LIZIZ;
        this.LIZLLL = enumC1293560jla;
        AbstractC1293310jlB<?, ?> abstractC1293310jlBLIZ = c1293510jlV.LIZJ.LIZ();
        this.LJ = (C1293040jkk) abstractC1293310jlBLIZ;
        AbstractC1293310jlB<PointF, PointF> abstractC1293310jlBLIZ2 = c1293510jlV.LIZLLL.LIZ();
        this.LJFF = abstractC1293310jlBLIZ2;
        AbstractC1293310jlB<?, ?> abstractC1293310jlBLIZ3 = c1293510jlV.LJ.LIZ();
        this.LJI = (C1293040jkk) abstractC1293310jlBLIZ3;
        AbstractC1293310jlB<?, ?> abstractC1293310jlBLIZ4 = c1293510jlV.LJI.LIZ();
        this.LJIIIIZZ = (C1293040jkk) abstractC1293310jlBLIZ4;
        AbstractC1293310jlB<?, ?> abstractC1293310jlBLIZ5 = c1293510jlV.LJIIIIZZ.LIZ();
        this.LJIIJ = (C1293040jkk) abstractC1293310jlBLIZ5;
        EnumC1293560jla enumC1293560jla2 = EnumC1293560jla.Star;
        if (enumC1293560jla == enumC1293560jla2) {
            this.LJII = (C1293040jkk) c1293510jlV.LJFF.LIZ();
            this.LJIIIZ = (C1293040jkk) c1293510jlV.LJII.LIZ();
        } else {
            this.LJII = null;
            this.LJIIIZ = null;
        }
        abstractC1292630jk5.LIZIZ(abstractC1293310jlBLIZ);
        abstractC1292630jk5.LIZIZ(abstractC1293310jlBLIZ2);
        abstractC1292630jk5.LIZIZ(abstractC1293310jlBLIZ3);
        abstractC1292630jk5.LIZIZ(abstractC1293310jlBLIZ4);
        abstractC1292630jk5.LIZIZ(abstractC1293310jlBLIZ5);
        if (enumC1293560jla == enumC1293560jla2) {
            abstractC1292630jk5.LIZIZ(this.LJII);
            abstractC1292630jk5.LIZIZ(this.LJIIIZ);
        }
        abstractC1293310jlBLIZ.LIZ(this);
        abstractC1293310jlBLIZ2.LIZ(this);
        abstractC1293310jlBLIZ3.LIZ(this);
        abstractC1293310jlBLIZ4.LIZ(this);
        abstractC1293310jlBLIZ5.LIZ(this);
        if (enumC1293560jla == enumC1293560jla2) {
            this.LJII.LIZ(this);
            this.LJIIIZ.LIZ(this);
        }
    }

    @Override // X.InterfaceC1291570jiN
    public final void LJFF(C1291740jie c1291740jie, int i, List<C1291740jie> list, C1291740jie c1291740jie2) {
        C1291750jif.LIZLLL(c1291740jie, i, list, c1291740jie2, this);
    }
}
