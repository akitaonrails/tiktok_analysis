package X;

import android.graphics.PointF;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import android.view.animation.OvershootInterpolator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.15BA, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C15BA {
    public final ViewGroup LIZ;
    public final List<C20475515Ab> LIZIZ = new ArrayList();

    public C15BA(ViewGroup viewGroup) {
        this.LIZ = viewGroup;
    }

    public static void LIZIZ(String str) {
        C20441214yg.LIZIZ("ChainCollisionAnimator", str);
    }

    public final PointF LIZJ(C15BV c15bv) {
        int measuredWidth;
        float f = c15bv.LIZ;
        ViewGroup viewGroup = this.LIZ;
        int measuredHeight = 0;
        if (viewGroup != null) {
            measuredWidth = viewGroup.getMeasuredWidth();
        } else {
            measuredWidth = 0;
        }
        float f2 = 100;
        float f3 = (f * measuredWidth) / f2;
        float f4 = c15bv.LIZIZ;
        ViewGroup viewGroup2 = this.LIZ;
        if (viewGroup2 != null) {
            measuredHeight = viewGroup2.getMeasuredHeight();
        }
        return new PointF(f3, (f4 * measuredHeight) / f2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v8, types: [android.view.animation.LinearInterpolator] */
    /* JADX WARN: Type inference failed for: r2v14, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v17, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v20, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v23, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v24, types: [java.lang.Iterable, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v26, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v1, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v27, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v28, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.util.ArrayList] */
    public final void LIZ(C20475515Ab c20475515Ab, Map<String, C15AK<?>> map, int i, long j) {
        PointF pointF;
        PointF pointF2;
        ?? arrayList;
        ?? arrayList2;
        List listLJIIJJI;
        List listLJLLJ;
        C15A0 c15a0LJI;
        PointF pointF3;
        PointF pointF4;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("collectCollisionAnimatorsForLength :");
        sbLIZ.append(i);
        sbLIZ.append(" startDelayBeforeAnimation:");
        sbLIZ.append(j);
        LIZIZ(C2188811AlT.LIZIZ(sbLIZ));
        if (i >= ((ArrayList) this.LIZIZ).size()) {
            LIZIZ("collectCollisionAnimatorsForLength return as length >= size");
            return;
        }
        List<C20475515Ab> list = this.LIZIZ;
        ArrayList<C20475515Ab> arrayList3 = new ArrayList();
        for (Object obj : (ArrayList) list) {
            C20475515Ab c20475515Ab2 = (C20475515Ab) obj;
            if (!Intrinsics.LJFF(c20475515Ab2, c20475515Ab) && (c15a0LJI = c20475515Ab2.LJI()) != null && !c15a0LJI.LJ) {
                C15A0 c15a0LJI2 = c20475515Ab.LJI();
                if (c15a0LJI2 != null) {
                    pointF3 = c15a0LJI2.LJI;
                } else {
                    pointF3 = null;
                }
                C15A0 c15a0LJI3 = c20475515Ab2.LJI();
                if (c15a0LJI3 != null) {
                    pointF4 = c15a0LJI3.LJFF;
                } else {
                    pointF4 = null;
                }
                int i2 = C15B8.LJIJI;
                if (pointF3 != null && pointF4 != null) {
                    float f = pointF3.x;
                    float f2 = i2;
                    float f3 = f + f2;
                    float f4 = pointF4.x;
                    if (f3 >= f4 && f <= f4 + f2) {
                        float f5 = pointF3.y;
                        float f6 = f5 + f2;
                        float f7 = pointF4.y;
                        if (f6 >= f7 && f5 <= f7 + f2) {
                            arrayList3.add(obj);
                        }
                    }
                }
            }
        }
        for (C20475515Ab c20475515Ab3 : arrayList3) {
            C15A0 c15a0LJI4 = c20475515Ab3.LJI();
            if (c15a0LJI4 != null && c20475515Ab3.LJI() != null) {
                C15A0 c15a0LJI5 = c20475515Ab.LJI();
                C15A0 c15a0LJI6 = c20475515Ab3.LJI();
                long jLongValue = 0;
                if (c15a0LJI5 != null && c15a0LJI6 != null) {
                    float f8 = c15a0LJI5.LJFF.x - c15a0LJI6.LJFF.x;
                    int i3 = C15B8.LJIJI;
                    float f9 = 1000L;
                    float fAbs = Math.abs(f8 - (i3 / 2)) / Math.abs((c15a0LJI5.LJI.x - c15a0LJI5.LJFF.x) / f9);
                    PointF pointF5 = c15a0LJI6.LJFF;
                    float f10 = new PointF(pointF5.x - i3, pointF5.y).x;
                    float f11 = c15a0LJI6.LJFF.x;
                    float f12 = c15a0LJI6.LJI.x;
                    ?? linearInterpolator = new LinearInterpolator();
                    if (f10 >= Math.min(f11, f12) && f10 <= Math.max(f11, f12)) {
                        if (f10 == f11) {
                            arrayList = Collections.singletonList(0L);
                        } else if (f10 == f12) {
                            arrayList = Collections.singletonList(1000L);
                        } else {
                            float f13 = (f10 - f11) / (f12 - f11);
                            if (linearInterpolator instanceof OvershootInterpolator) {
                                float f14 = 1 + 2.0f;
                                float f15 = -f13;
                                if (Math.abs(f14) < 1.0E-7f) {
                                    if (Math.abs(-2.0f) < 1.0E-7f) {
                                        if (Math.abs(0.0f) < 1.0E-7f) {
                                            listLJLLJ = C13BV.INSTANCE;
                                        } else {
                                            listLJLLJ = Collections.singletonList(Double.valueOf((-f15) / ((double) 0.0f)));
                                        }
                                    } else {
                                        double d = 2;
                                        double dPow = Math.pow(0.0f, d) - ((double) ((4 * (-2.0f)) * f15));
                                        if (dPow < -1.0E-6d) {
                                            listLJLLJ = C13BV.INSTANCE;
                                        } else if (dPow < 1.0E-6d) {
                                            listLJLLJ = Collections.singletonList(Double.valueOf(((double) (-0.0f)) / (d * ((double) (-2.0f)))));
                                        } else {
                                            double d2 = -0.0f;
                                            double d3 = 2 * (-2.0f);
                                            listLJLLJ = C1697810uHb.LJIIJJI(Double.valueOf((d2 - Math.sqrt(dPow)) / d3), Double.valueOf((d2 + Math.sqrt(dPow)) / d3));
                                        }
                                    }
                                } else {
                                    float f16 = (-2.0f) / f14;
                                    float f18 = 0.0f / f14;
                                    double d4 = ((double) ((3 * f18) - (f16 * f16))) / 9.0d;
                                    double d5 = ((double) (((((2 * f16) * f16) * f16) - ((9 * f16) * f18)) + (27 * (f15 / f14)))) / 54.0d;
                                    double d6 = (d5 * d5) - ((d4 * d4) * d4);
                                    if (d6 > 0.0d) {
                                        double dSqrt = Math.sqrt(d6);
                                        listLJIIJJI = Collections.singletonList(Double.valueOf((Math.cbrt(d5 + dSqrt) + Math.cbrt(d5 - dSqrt)) - (((double) f16) / 3.0d)));
                                    } else if (d6 == 0.0d) {
                                        double dCbrt = Math.cbrt(-d5);
                                        double d7 = ((double) 2) * dCbrt;
                                        double d8 = -dCbrt;
                                        if (Math.abs(d7 - d8) < 1.0E-6d) {
                                            listLJIIJJI = Collections.singletonList(Double.valueOf(d8));
                                        } else {
                                            listLJIIJJI = C1697810uHb.LJIIJJI(Double.valueOf(d7), Double.valueOf(d8));
                                        }
                                    } else {
                                        double d9 = -d4;
                                        double dLIZJ = C13LZ.LIZJ(Math.acos(d5 / (d4 * Math.sqrt(d9))), 0.0d, 3.141592653589793d);
                                        double dSqrt2 = ((double) 2) * Math.sqrt(d9);
                                        double d10 = 3;
                                        double d11 = ((double) f16) / 3.0d;
                                        listLJIIJJI = C1697810uHb.LJIIJJI(Double.valueOf((Math.cos(dLIZJ / d10) * dSqrt2) - d11), Double.valueOf((Math.cos((dLIZJ + 6.283185307179586d) / d10) * dSqrt2) - d11), Double.valueOf((dSqrt2 * Math.cos((dLIZJ - 6.283185307179586d) / d10)) - d11));
                                    }
                                    listLJLLJ = C13LP.LJLLJ(listLJIIJJI);
                                }
                                ArrayList arrayList4 = new ArrayList();
                                for (Object obj2 : listLJLLJ) {
                                    double dDoubleValue = ((Number) obj2).doubleValue();
                                    if (0.0d <= dDoubleValue && dDoubleValue <= 1.0d) {
                                        arrayList4.add(obj2);
                                    }
                                }
                                arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList4, 10));
                                Iterator it2 = arrayList4.iterator();
                                while (it2.hasNext()) {
                                    arrayList2.add(Float.valueOf((float) ((Number) it2.next()).doubleValue()));
                                }
                            } else {
                                float f19 = 1.0f;
                                if (linearInterpolator instanceof AccelerateDecelerateInterpolator) {
                                    arrayList2 = Collections.singletonList(Float.valueOf(C13LZ.LIZLLL(1 - ((float) (Math.acos((2 * f13) - r2) / 3.141592653589793d)), 0.0f, 1.0f)));
                                } else if (linearInterpolator instanceof AccelerateInterpolator) {
                                    float interpolation = ((AccelerateInterpolator) linearInterpolator).getInterpolation(f13);
                                    float f20 = 2;
                                    if (interpolation == 1.0f) {
                                        interpolation = 1.0f;
                                    }
                                    arrayList2 = Collections.singletonList(Float.valueOf(C13LZ.LIZLLL((float) Math.pow(f13, 1.0d / ((double) (f20 * interpolation))), 0.0f, 1.0f)));
                                } else if (linearInterpolator instanceof DecelerateInterpolator) {
                                    float interpolation2 = ((DecelerateInterpolator) linearInterpolator).getInterpolation(f13);
                                    float f21 = 2;
                                    if (interpolation2 == 1.0f) {
                                        interpolation2 = 1.0f;
                                    }
                                    arrayList2 = Collections.singletonList(Float.valueOf(C13LZ.LIZLLL(1 - ((float) Math.pow(((double) 1) - ((double) f13), 1.0d / ((double) (f21 * interpolation2)))), 0.0f, 1.0f)));
                                } else {
                                    arrayList2 = new ArrayList();
                                    float f22 = 0.0f;
                                    int i4 = 0;
                                    while (true) {
                                        float f23 = (f22 + f19) / 2;
                                        float interpolation3 = linearInterpolator.getInterpolation(f23);
                                        if (Math.abs(interpolation3 - f13) < 0.001f) {
                                            arrayList2.add(Float.valueOf(f23));
                                            break;
                                        }
                                        if (interpolation3 < f13) {
                                            f22 = f23;
                                        } else {
                                            f19 = f23;
                                        }
                                        i4++;
                                        if (i4 >= 20) {
                                            break;
                                        }
                                    }
                                }
                            }
                            ArrayList arrayList5 = new ArrayList(C15438062q.LJIJJ(arrayList2, 10));
                            Iterator it3 = arrayList2.iterator();
                            while (it3.hasNext()) {
                                arrayList5.add(Long.valueOf((long) (((Number) it3.next()).floatValue() * f9)));
                            }
                            arrayList = new ArrayList();
                            for (Object obj3 : arrayList5) {
                                long jLongValue2 = ((Number) obj3).longValue();
                                if (0 <= jLongValue2 && jLongValue2 <= 1000) {
                                    arrayList.add(obj3);
                                }
                            }
                        }
                    } else {
                        arrayList = C13BV.INSTANCE;
                    }
                    Long l = (Long) C13LP.LJJJLL(arrayList);
                    if (l != null) {
                        jLongValue = l.longValue();
                    }
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("calculateCollisionDuration translateX:");
                    sbLIZ2.append(f8);
                    sbLIZ2.append(" trigger:");
                    sbLIZ2.append(c15a0LJI5);
                    sbLIZ2.append(" translateElement:");
                    sbLIZ2.append(c15a0LJI6);
                    sbLIZ2.append(" duration:");
                    sbLIZ2.append(fAbs);
                    sbLIZ2.append(" translateElementTranslateDuration:");
                    sbLIZ2.append(jLongValue);
                    sbLIZ2.append(" size:");
                    sbLIZ2.append(C15B8.LJIJI);
                    LIZIZ(C2188811AlT.LIZIZ(sbLIZ2));
                    jLongValue = (long) (fAbs - jLongValue);
                }
                PointF pointF6 = null;
                C15AG c15ag = C15AG.TRANSLATE;
                PointF pointF7 = c15a0LJI4.LJI;
                C15AK<?> c15ak = new C15AK<>(j + jLongValue, 1000L, null, c15ag, new C1782410wU3(pointF7.x, pointF7.y, null, null), 4);
                c15a0LJI4.LJ = true;
                map.put(c20475515Ab3.LIZIZ, c15ak);
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("Collisions geniusId:");
                sbLIZ3.append(c20475515Ab3.LIZIZ);
                sbLIZ3.append(" config.currentPos:");
                C15A0 c15a0LJI7 = c20475515Ab3.LJI();
                if (c15a0LJI7 != null) {
                    pointF2 = c15a0LJI7.LJFF;
                } else {
                    pointF2 = null;
                }
                sbLIZ3.append(pointF2);
                sbLIZ3.append(" targetPos:");
                C15A0 c15a0LJI8 = c20475515Ab3.LJI();
                if (c15a0LJI8 != null) {
                    pointF6 = c15a0LJI8.LJI;
                }
                sbLIZ3.append(pointF6);
                sbLIZ3.append(" delay:");
                sbLIZ3.append(c15ak.LIZ);
                sbLIZ3.append(" duration:");
                sbLIZ3.append(c15ak.LIZIZ);
                LIZIZ(C2188811AlT.LIZIZ(sbLIZ3));
                LIZ(c20475515Ab3, map, i + 1, c15ak.LIZ);
                PointF pointF8 = c15a0LJI4.LJI;
                c15a0LJI4.LJFF = pointF8;
                C20476115Ah c20476115Ah = c20475515Ab3.LIZ;
                c20476115Ah.LIZ = (int) pointF8.x;
                c20476115Ah.LIZIZ = (int) pointF8.y;
            }
        }
        C15A0 c15a0LJI9 = c20475515Ab.LJI();
        if (c15a0LJI9 != null && (pointF = c15a0LJI9.LJI) != null) {
            C15A0 c15a0LJI10 = c20475515Ab.LJI();
            if (c15a0LJI10 != null) {
                c15a0LJI10.LJFF = pointF;
            }
            C20476115Ah c20476115Ah2 = c20475515Ab.LIZ;
            c20476115Ah2.LIZ = (int) pointF.x;
            c20476115Ah2.LIZIZ = (int) pointF.y;
        }
    }
}
