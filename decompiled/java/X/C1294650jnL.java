package X;

import android.graphics.Path;
import android.graphics.PointF;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0jnL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1294650jnL implements InterfaceC1295830jpF, InterfaceC1294590jnF, InterfaceC1295880jpK {
    public final String LIZIZ;
    public final C1295950jpR LIZJ;
    public final EnumC1294680jnO LIZLLL;
    public final boolean LJ;
    public final boolean LJFF;
    public final C1295230joH LJI;
    public final AbstractC1295190joD<?, PointF> LJII;
    public final C1295230joH LJIIIIZZ;
    public final C1295230joH LJIIIZ;
    public final C1295230joH LJIIJ;
    public final C1295230joH LJIIJJI;
    public final C1295230joH LJIIL;
    public boolean LJIILJJIL;
    public final Path LIZ = new Path();
    public final C1294580jnE LJIILIIL = new C1294580jnE();

    @Override // X.InterfaceC1294590jnF
    public final void LIZJ() {
        this.LJIILJJIL = false;
        this.LIZJ.invalidateSelf();
    }

    @Override // X.InterfaceC1295830jpF
    public final Path getPath() {
        float fCos;
        float fSin;
        double d;
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        if (this.LJIILJJIL) {
            return this.LIZ;
        }
        this.LIZ.reset();
        if (this.LJ) {
            this.LJIILJJIL = true;
            return this.LIZ;
        }
        int i = C1294670jnN.LIZ[this.LIZLLL.ordinal()];
        if (i == 1) {
            float fFloatValue = this.LJI.LJFF().floatValue();
            double radians = Math.toRadians((this.LJIIIIZZ != null ? r0.LJFF().floatValue() : 0.0d) - 90.0d);
            double d2 = fFloatValue;
            float f6 = (float) (6.283185307179586d / d2);
            if (this.LJFF) {
                f6 *= -1.0f;
            }
            float f7 = f6 / 2.0f;
            float f8 = fFloatValue - ((int) fFloatValue);
            if (f8 != 0.0f) {
                radians += (double) ((1.0f - f8) * f7);
            }
            float fFloatValue2 = this.LJIIJ.LJFF().floatValue();
            float fFloatValue3 = this.LJIIIZ.LJFF().floatValue();
            C1295230joH c1295230joH = this.LJIIJJI;
            float fFloatValue4 = c1295230joH != null ? c1295230joH.LJFF().floatValue() / 100.0f : 0.0f;
            C1295230joH c1295230joH2 = this.LJIIL;
            float fFloatValue5 = c1295230joH2 != null ? c1295230joH2.LJFF().floatValue() / 100.0f : 0.0f;
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
            PointF pointFLJFF = this.LJII.LJFF();
            this.LIZ.offset(pointFLJFF.x, pointFLJFF.y);
            this.LIZ.close();
        } else if (i == 2) {
            int iFloor = (int) Math.floor(this.LJI.LJFF().floatValue());
            double radians2 = Math.toRadians((this.LJIIIIZZ != null ? r0.LJFF().floatValue() : 0.0d) - 90.0d);
            double d7 = iFloor;
            float fFloatValue6 = this.LJIIL.LJFF().floatValue() / 100.0f;
            float fFloatValue7 = this.LJIIJ.LJFF().floatValue();
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
                float fSin6 = (float) (d8 * Math.sin(d10));
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
            PointF pointFLJFF2 = this.LJII.LJFF();
            this.LIZ.offset(pointFLJFF2.x, pointFLJFF2.y);
            this.LIZ.close();
        }
        this.LIZ.close();
        this.LJIILIIL.LIZ(this.LIZ);
        this.LJIILJJIL = true;
        return this.LIZ;
    }

    @Override // X.InterfaceC1295810jpD
    public final String getName() {
        return this.LIZIZ;
    }

    @Override // X.InterfaceC1295810jpD
    public final void LIZLLL(List<InterfaceC1295810jpD> list, List<InterfaceC1295810jpD> list2) {
        for (int i = 0; i < ((ArrayList) list).size(); i++) {
            InterfaceC1295810jpD interfaceC1295810jpD = (InterfaceC1295810jpD) ListProtector.get(list, i);
            if (interfaceC1295810jpD instanceof C1294570jnD) {
                C1294570jnD c1294570jnD = (C1294570jnD) interfaceC1295810jpD;
                if (c1294570jnD.LIZJ == EnumC994250byp.SIMULTANEOUSLY) {
                    ((ArrayList) this.LJIILIIL.LIZ).add(c1294570jnD);
                    c1294570jnD.LIZIZ(this);
                }
            }
        }
    }

    @Override // X.InterfaceC1295760jp8
    public final void LJII(C1295400joY c1295400joY, Object obj) {
        C1295230joH c1295230joH;
        C1295230joH c1295230joH2;
        if (obj == InterfaceC1295080jo2.LJIL) {
            this.LJI.LJIIJ(c1295400joY);
            return;
        }
        if (obj == InterfaceC1295080jo2.LJJ) {
            this.LJIIIIZZ.LJIIJ(c1295400joY);
            return;
        }
        if (obj == InterfaceC1295080jo2.LJIILIIL) {
            this.LJII.LJIIJ(c1295400joY);
            return;
        }
        if (obj == InterfaceC1295080jo2.LJJI && (c1295230joH2 = this.LJIIIZ) != null) {
            c1295230joH2.LJIIJ(c1295400joY);
            return;
        }
        if (obj == InterfaceC1295080jo2.LJJIFFI) {
            this.LJIIJ.LJIIJ(c1295400joY);
            return;
        }
        if (obj == InterfaceC1295080jo2.LJJII && (c1295230joH = this.LJIIJJI) != null) {
            c1295230joH.LJIIJ(c1295400joY);
        } else {
            if (obj != InterfaceC1295080jo2.LJJIII) {
                return;
            }
            this.LJIIL.LJIIJ(c1295400joY);
        }
    }

    public C1294650jnL(C1295950jpR c1295950jpR, AbstractC1295030jnx abstractC1295030jnx, C1294660jnM c1294660jnM) {
        this.LIZJ = c1295950jpR;
        this.LIZIZ = c1294660jnM.LIZ;
        EnumC1294680jnO enumC1294680jnO = c1294660jnM.LIZIZ;
        this.LIZLLL = enumC1294680jnO;
        this.LJ = c1294660jnM.LJIIIZ;
        this.LJFF = c1294660jnM.LJIIJ;
        AbstractC1295190joD<?, ?> abstractC1295190joDLIZ = c1294660jnM.LIZJ.LIZ();
        this.LJI = (C1295230joH) abstractC1295190joDLIZ;
        AbstractC1295190joD<PointF, PointF> abstractC1295190joDLIZ2 = c1294660jnM.LIZLLL.LIZ();
        this.LJII = abstractC1295190joDLIZ2;
        AbstractC1295190joD<?, ?> abstractC1295190joDLIZ3 = c1294660jnM.LJ.LIZ();
        this.LJIIIIZZ = (C1295230joH) abstractC1295190joDLIZ3;
        AbstractC1295190joD<?, ?> abstractC1295190joDLIZ4 = c1294660jnM.LJI.LIZ();
        this.LJIIJ = (C1295230joH) abstractC1295190joDLIZ4;
        AbstractC1295190joD<?, ?> abstractC1295190joDLIZ5 = c1294660jnM.LJIIIIZZ.LIZ();
        this.LJIIL = (C1295230joH) abstractC1295190joDLIZ5;
        EnumC1294680jnO enumC1294680jnO2 = EnumC1294680jnO.STAR;
        if (enumC1294680jnO == enumC1294680jnO2) {
            this.LJIIIZ = (C1295230joH) c1294660jnM.LJFF.LIZ();
            this.LJIIJJI = (C1295230joH) c1294660jnM.LJII.LIZ();
        } else {
            this.LJIIIZ = null;
            this.LJIIJJI = null;
        }
        abstractC1295030jnx.LIZIZ(abstractC1295190joDLIZ);
        abstractC1295030jnx.LIZIZ(abstractC1295190joDLIZ2);
        abstractC1295030jnx.LIZIZ(abstractC1295190joDLIZ3);
        abstractC1295030jnx.LIZIZ(abstractC1295190joDLIZ4);
        abstractC1295030jnx.LIZIZ(abstractC1295190joDLIZ5);
        if (enumC1294680jnO == enumC1294680jnO2) {
            abstractC1295030jnx.LIZIZ(this.LJIIIZ);
            abstractC1295030jnx.LIZIZ(this.LJIIJJI);
        }
        abstractC1295190joDLIZ.LIZ(this);
        abstractC1295190joDLIZ2.LIZ(this);
        abstractC1295190joDLIZ3.LIZ(this);
        abstractC1295190joDLIZ4.LIZ(this);
        abstractC1295190joDLIZ5.LIZ(this);
        if (enumC1294680jnO == enumC1294680jnO2) {
            this.LJIIIZ.LIZ(this);
            this.LJIIJJI.LIZ(this);
        }
    }

    @Override // X.InterfaceC1295760jp8
    public final void LJ(C1295090jo3 c1295090jo3, int i, List<C1295090jo3> list, C1295090jo3 c1295090jo32) {
        C1295100jo4.LIZLLL(c1295090jo3, i, list, c1295090jo32, this);
    }
}
