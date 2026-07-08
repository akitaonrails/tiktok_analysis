package X;

import android.graphics.PointF;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0jnZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1294790jnZ {
    public static final Interpolator LIZ = new LinearInterpolator();
    public static final C1296750jqj LIZIZ = C1296750jqj.LIZ("t", "s", "e", "o", "i", "h", "to", "ti");
    public static final C1296750jqj LIZJ = C1296750jqj.LIZ("x", "y");

    public static Interpolator LIZ(PointF pointF, PointF pointF2) {
        pointF.x = C1295100jo4.LIZIZ(pointF.x, -1.0f, 1.0f);
        pointF.y = C1295100jo4.LIZIZ(pointF.y, -100.0f, 100.0f);
        pointF2.x = C1295100jo4.LIZIZ(pointF2.x, -1.0f, 1.0f);
        float fLIZIZ = C1295100jo4.LIZIZ(pointF2.y, -100.0f, 100.0f);
        pointF2.y = fLIZIZ;
        try {
            return C0GY9.LIZIZ(pointF.x, pointF.y, pointF2.x, fLIZIZ);
        } catch (IllegalArgumentException e) {
            TryCatchGuardChecker.doCheck(e);
            if ("The Path cannot loop back on itself.".equals(e.getMessage())) {
                return C0GY9.LIZIZ(Math.min(pointF.x, 1.0f), pointF.y, Math.max(pointF2.x, 0.0f), pointF2.y);
            }
            return new LinearInterpolator();
        }
    }

    public static <T> C1294810jnb<T> LIZIZ(AbstractC1295900jpM abstractC1295900jpM, C1294720jnS c1294720jnS, float f, InterfaceC1295730jp5<T> interfaceC1295730jp5, boolean z, boolean z2) {
        Interpolator interpolatorLIZ;
        Interpolator interpolatorLIZ2;
        C1294810jnb<T> c1294810jnb;
        int i = 1;
        if (z) {
            if (z2) {
                abstractC1295900jpM.LIZIZ();
                PointF pointF = null;
                PointF pointF2 = null;
                PointF pointFLIZIZ = null;
                boolean z3 = false;
                PointF pointFLIZIZ2 = null;
                T tLIZ = null;
                PointF pointFLIZIZ3 = null;
                PointF pointF3 = null;
                PointF pointF4 = null;
                float fLJIILLIIL = 0.0f;
                PointF pointFLIZIZ4 = null;
                T tLIZ2 = null;
                while (abstractC1295900jpM.LJII()) {
                    switch (abstractC1295900jpM.LJJIL(LIZIZ)) {
                        case 0:
                            fLJIILLIIL = (float) abstractC1295900jpM.LJIILLIIL();
                            break;
                        case 1:
                            tLIZ = interfaceC1295730jp5.LIZ(abstractC1295900jpM, f);
                            break;
                        case 2:
                            tLIZ2 = interfaceC1295730jp5.LIZ(abstractC1295900jpM, f);
                            break;
                        case 3:
                            if (abstractC1295900jpM.LJIJJLI() == EnumC1295540jom.BEGIN_OBJECT) {
                                abstractC1295900jpM.LIZIZ();
                                float fLJIILLIIL2 = 0.0f;
                                float fLJIILLIIL3 = 0.0f;
                                float fLJIILLIIL4 = 0.0f;
                                float fLJIILLIIL5 = 0.0f;
                                while (abstractC1295900jpM.LJII()) {
                                    int iLJJIL = abstractC1295900jpM.LJJIL(LIZJ);
                                    if (iLJJIL != 0) {
                                        if (iLJJIL != 1) {
                                            abstractC1295900jpM.LJJJ();
                                        } else {
                                            EnumC1295540jom enumC1295540jomLJIJJLI = abstractC1295900jpM.LJIJJLI();
                                            EnumC1295540jom enumC1295540jom = EnumC1295540jom.NUMBER;
                                            if (enumC1295540jomLJIJJLI == enumC1295540jom) {
                                                fLJIILLIIL5 = (float) abstractC1295900jpM.LJIILLIIL();
                                                fLJIILLIIL3 = fLJIILLIIL5;
                                            } else {
                                                abstractC1295900jpM.LIZ();
                                                fLJIILLIIL3 = (float) abstractC1295900jpM.LJIILLIIL();
                                                if (abstractC1295900jpM.LJIJJLI() == enumC1295540jom) {
                                                    fLJIILLIIL5 = (float) abstractC1295900jpM.LJIILLIIL();
                                                } else {
                                                    fLJIILLIIL5 = fLJIILLIIL3;
                                                }
                                                abstractC1295900jpM.LIZLLL();
                                            }
                                        }
                                    } else {
                                        EnumC1295540jom enumC1295540jomLJIJJLI2 = abstractC1295900jpM.LJIJJLI();
                                        EnumC1295540jom enumC1295540jom2 = EnumC1295540jom.NUMBER;
                                        if (enumC1295540jomLJIJJLI2 == enumC1295540jom2) {
                                            fLJIILLIIL4 = (float) abstractC1295900jpM.LJIILLIIL();
                                            fLJIILLIIL2 = fLJIILLIIL4;
                                        } else {
                                            abstractC1295900jpM.LIZ();
                                            fLJIILLIIL2 = (float) abstractC1295900jpM.LJIILLIIL();
                                            if (abstractC1295900jpM.LJIJJLI() == enumC1295540jom2) {
                                                fLJIILLIIL4 = (float) abstractC1295900jpM.LJIILLIIL();
                                            } else {
                                                fLJIILLIIL4 = fLJIILLIIL2;
                                            }
                                            abstractC1295900jpM.LIZLLL();
                                        }
                                    }
                                }
                                pointF3 = new PointF(fLJIILLIIL2, fLJIILLIIL3);
                                pointF4 = new PointF(fLJIILLIIL4, fLJIILLIIL5);
                                abstractC1295900jpM.LJFF();
                            } else {
                                pointFLIZIZ2 = C1294770jnX.LIZIZ(abstractC1295900jpM, f);
                            }
                            break;
                        case 4:
                            if (abstractC1295900jpM.LJIJJLI() == EnumC1295540jom.BEGIN_OBJECT) {
                                abstractC1295900jpM.LIZIZ();
                                float fLJIILLIIL6 = 0.0f;
                                float fLJIILLIIL7 = 0.0f;
                                float fLJIILLIIL8 = 0.0f;
                                float fLJIILLIIL9 = 0.0f;
                                while (abstractC1295900jpM.LJII()) {
                                    int iLJJIL2 = abstractC1295900jpM.LJJIL(LIZJ);
                                    if (iLJJIL2 != 0) {
                                        if (iLJJIL2 != 1) {
                                            abstractC1295900jpM.LJJJ();
                                        } else {
                                            EnumC1295540jom enumC1295540jomLJIJJLI3 = abstractC1295900jpM.LJIJJLI();
                                            EnumC1295540jom enumC1295540jom3 = EnumC1295540jom.NUMBER;
                                            if (enumC1295540jomLJIJJLI3 == enumC1295540jom3) {
                                                fLJIILLIIL7 = (float) abstractC1295900jpM.LJIILLIIL();
                                                fLJIILLIIL9 = fLJIILLIIL7;
                                            } else {
                                                abstractC1295900jpM.LIZ();
                                                fLJIILLIIL7 = (float) abstractC1295900jpM.LJIILLIIL();
                                                if (abstractC1295900jpM.LJIJJLI() == enumC1295540jom3) {
                                                    fLJIILLIIL9 = (float) abstractC1295900jpM.LJIILLIIL();
                                                } else {
                                                    fLJIILLIIL9 = fLJIILLIIL7;
                                                }
                                                abstractC1295900jpM.LIZLLL();
                                            }
                                        }
                                    } else {
                                        EnumC1295540jom enumC1295540jomLJIJJLI4 = abstractC1295900jpM.LJIJJLI();
                                        EnumC1295540jom enumC1295540jom4 = EnumC1295540jom.NUMBER;
                                        if (enumC1295540jomLJIJJLI4 == enumC1295540jom4) {
                                            fLJIILLIIL6 = (float) abstractC1295900jpM.LJIILLIIL();
                                            fLJIILLIIL8 = fLJIILLIIL6;
                                        } else {
                                            abstractC1295900jpM.LIZ();
                                            fLJIILLIIL6 = (float) abstractC1295900jpM.LJIILLIIL();
                                            if (abstractC1295900jpM.LJIJJLI() == enumC1295540jom4) {
                                                fLJIILLIIL8 = (float) abstractC1295900jpM.LJIILLIIL();
                                            } else {
                                                fLJIILLIIL8 = fLJIILLIIL6;
                                            }
                                            abstractC1295900jpM.LIZLLL();
                                        }
                                    }
                                }
                                pointF = new PointF(fLJIILLIIL6, fLJIILLIIL7);
                                pointF2 = new PointF(fLJIILLIIL8, fLJIILLIIL9);
                                abstractC1295900jpM.LJFF();
                            } else {
                                pointFLIZIZ3 = C1294770jnX.LIZIZ(abstractC1295900jpM, f);
                            }
                            break;
                        case 5:
                            if (abstractC1295900jpM.LJIIZILJ() == i) {
                                z3 = true;
                            } else {
                                z3 = false;
                                continue;
                            }
                            break;
                        case 6:
                            pointFLIZIZ4 = C1294770jnX.LIZIZ(abstractC1295900jpM, f);
                            continue;
                        case 7:
                            pointFLIZIZ = C1294770jnX.LIZIZ(abstractC1295900jpM, f);
                            continue;
                        default:
                            abstractC1295900jpM.LJJJ();
                            break;
                    }
                    i = 1;
                }
                abstractC1295900jpM.LJFF();
                if (z3) {
                    interpolatorLIZ2 = LIZ;
                    tLIZ2 = tLIZ;
                } else if (pointFLIZIZ2 != null && pointFLIZIZ3 != null) {
                    interpolatorLIZ2 = LIZ(pointFLIZIZ2, pointFLIZIZ3);
                } else {
                    if (pointF3 != null && pointF4 != null && pointF != null && pointF2 != null) {
                        Interpolator interpolatorLIZ3 = LIZ(pointF3, pointF);
                        Interpolator interpolatorLIZ4 = LIZ(pointF4, pointF2);
                        interpolatorLIZ2 = null;
                        if (interpolatorLIZ3 != null && interpolatorLIZ4 != null) {
                            c1294810jnb = new C1294810jnb<>(c1294720jnS, tLIZ, tLIZ2, interpolatorLIZ3, interpolatorLIZ4, fLJIILLIIL);
                        }
                        c1294810jnb.LJIILJJIL = pointFLIZIZ4;
                        c1294810jnb.LJIILL = pointFLIZIZ;
                        return c1294810jnb;
                    }
                    interpolatorLIZ2 = LIZ;
                }
                c1294810jnb = new C1294810jnb<>(c1294720jnS, tLIZ, tLIZ2, interpolatorLIZ2, fLJIILLIIL, (Float) null);
                c1294810jnb.LJIILJJIL = pointFLIZIZ4;
                c1294810jnb.LJIILL = pointFLIZIZ;
                return c1294810jnb;
            }
            abstractC1295900jpM.LIZIZ();
            PointF pointFLIZIZ5 = null;
            PointF pointFLIZIZ6 = null;
            PointF pointFLIZIZ7 = null;
            PointF pointFLIZIZ8 = null;
            T tLIZ3 = null;
            float fLJIILLIIL10 = 0.0f;
            boolean z4 = false;
            T tLIZ4 = null;
            while (abstractC1295900jpM.LJII()) {
                switch (abstractC1295900jpM.LJJIL(LIZIZ)) {
                    case 0:
                        fLJIILLIIL10 = (float) abstractC1295900jpM.LJIILLIIL();
                        break;
                    case 1:
                        tLIZ3 = interfaceC1295730jp5.LIZ(abstractC1295900jpM, f);
                        break;
                    case 2:
                        tLIZ4 = interfaceC1295730jp5.LIZ(abstractC1295900jpM, f);
                        break;
                    case 3:
                        pointFLIZIZ8 = C1294770jnX.LIZIZ(abstractC1295900jpM, 1.0f);
                        break;
                    case 4:
                        pointFLIZIZ5 = C1294770jnX.LIZIZ(abstractC1295900jpM, 1.0f);
                        break;
                    case 5:
                        if (abstractC1295900jpM.LJIIZILJ() == 1) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        break;
                    case 6:
                        pointFLIZIZ6 = C1294770jnX.LIZIZ(abstractC1295900jpM, f);
                        break;
                    case 7:
                        pointFLIZIZ7 = C1294770jnX.LIZIZ(abstractC1295900jpM, f);
                        break;
                    default:
                        abstractC1295900jpM.LJJJ();
                        break;
                }
            }
            abstractC1295900jpM.LJFF();
            if (z4) {
                interpolatorLIZ = LIZ;
                tLIZ4 = tLIZ3;
            } else if (pointFLIZIZ8 != null && pointFLIZIZ5 != null) {
                interpolatorLIZ = LIZ(pointFLIZIZ8, pointFLIZIZ5);
            } else {
                interpolatorLIZ = LIZ;
            }
            C1294810jnb<T> c1294810jnb2 = new C1294810jnb<>(c1294720jnS, tLIZ3, tLIZ4, interpolatorLIZ, fLJIILLIIL10, (Float) null);
            c1294810jnb2.LJIILJJIL = pointFLIZIZ6;
            c1294810jnb2.LJIILL = pointFLIZIZ7;
            return c1294810jnb2;
        }
        return new C1294810jnb<>(interfaceC1295730jp5.LIZ(abstractC1295900jpM, f));
    }
}
