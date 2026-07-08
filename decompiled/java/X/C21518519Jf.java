package X;

import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.InflateException;
import android.view.animation.AnimationUtils;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: renamed from: X.19Jf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21518519Jf {
    public static boolean LIZLLL(int i) {
        return i >= 28 && i <= 31;
    }

    public static Keyframe LIZIZ(Keyframe keyframe, float f) {
        if (keyframe.getType() == Float.TYPE) {
            return Keyframe.ofFloat(f);
        }
        if (keyframe.getType() == Integer.TYPE) {
            return Keyframe.ofInt(f);
        }
        return Keyframe.ofObject(f);
    }

    public static PropertyValuesHolder LIZJ(TypedArray typedArray, int i, int i2, int i3, String str) {
        boolean z;
        int i4;
        boolean z2;
        int i5;
        boolean z3;
        C1593200rYs c1593200rYs;
        int color;
        PropertyValuesHolder propertyValuesHolderOfInt;
        int color2;
        int color3;
        float dimension;
        float dimension2;
        float dimension3;
        int i6 = i;
        TypedValue typedValuePeekValue = typedArray.peekValue(i2);
        if (typedValuePeekValue != null) {
            z = true;
            i4 = typedValuePeekValue.type;
        } else {
            z = false;
            i4 = 0;
        }
        TypedValue typedValuePeekValue2 = typedArray.peekValue(i3);
        if (typedValuePeekValue2 != null) {
            z2 = true;
            i5 = typedValuePeekValue2.type;
        } else {
            z2 = false;
            i5 = 0;
        }
        if (i6 == 4) {
            if ((z && LIZLLL(i4)) || (z2 && LIZLLL(i5))) {
                i6 = 3;
                z3 = false;
            } else {
                i6 = 0;
                z3 = true;
            }
        } else if (i6 != 0) {
            z3 = false;
        } else {
            z3 = true;
        }
        if (i6 == 2) {
            String strXd = C786410Ut5.Xd(typedArray, i2);
            String strXd2 = C786410Ut5.Xd(typedArray, i3);
            C21518919Jj[] c21518919JjArrLIZJ = C21518819Ji.LIZJ(strXd);
            C21518919Jj[] c21518919JjArrLIZJ2 = C21518819Ji.LIZJ(strXd2);
            if (c21518919JjArrLIZJ == null) {
                if (c21518919JjArrLIZJ2 == null) {
                    return null;
                }
                return PropertyValuesHolder.ofObject(str, new TypeEvaluator<C21518919Jj[]>() { // from class: X.19Jg
                    public C21518919Jj[] LIZ;

                    @Override // android.animation.TypeEvaluator
                    public final C21518919Jj[] evaluate(float f, C21518919Jj[] c21518919JjArr, C21518919Jj[] c21518919JjArr2) {
                        C21518919Jj[] c21518919JjArr3 = c21518919JjArr;
                        C21518919Jj[] c21518919JjArr4 = c21518919JjArr2;
                        if (C21518819Ji.LIZ(c21518919JjArr3, c21518919JjArr4)) {
                            C21518919Jj[] c21518919JjArr5 = this.LIZ;
                            if (c21518919JjArr5 == null || !C21518819Ji.LIZ(c21518919JjArr5, c21518919JjArr3)) {
                                this.LIZ = C21518819Ji.LJ(c21518919JjArr3);
                            }
                            for (int i7 = 0; i7 < c21518919JjArr3.length; i7++) {
                                C21518919Jj c21518919Jj = this.LIZ[i7];
                                C21518919Jj c21518919Jj2 = c21518919JjArr3[i7];
                                C21518919Jj c21518919Jj3 = c21518919JjArr4[i7];
                                c21518919Jj.getClass();
                                c21518919Jj.LIZ = c21518919Jj2.LIZ;
                                int i8 = 0;
                                while (true) {
                                    float[] fArr = c21518919Jj2.LIZIZ;
                                    if (i8 < fArr.length) {
                                        c21518919Jj.LIZIZ[i8] = (fArr[i8] * (1.0f - f)) + (c21518919Jj3.LIZIZ[i8] * f);
                                        i8++;
                                    }
                                }
                            }
                            return this.LIZ;
                        }
                        throw new IllegalArgumentException("Can't interpolate between two incompatible pathData");
                    }
                }, c21518919JjArrLIZJ2);
            }
            TypeEvaluator<C21518919Jj[]> typeEvaluator = new TypeEvaluator<C21518919Jj[]>() { // from class: X.19Jg
                public C21518919Jj[] LIZ;

                @Override // android.animation.TypeEvaluator
                public final C21518919Jj[] evaluate(float f, C21518919Jj[] c21518919JjArr, C21518919Jj[] c21518919JjArr2) {
                    C21518919Jj[] c21518919JjArr3 = c21518919JjArr;
                    C21518919Jj[] c21518919JjArr4 = c21518919JjArr2;
                    if (C21518819Ji.LIZ(c21518919JjArr3, c21518919JjArr4)) {
                        C21518919Jj[] c21518919JjArr5 = this.LIZ;
                        if (c21518919JjArr5 == null || !C21518819Ji.LIZ(c21518919JjArr5, c21518919JjArr3)) {
                            this.LIZ = C21518819Ji.LJ(c21518919JjArr3);
                        }
                        for (int i7 = 0; i7 < c21518919JjArr3.length; i7++) {
                            C21518919Jj c21518919Jj = this.LIZ[i7];
                            C21518919Jj c21518919Jj2 = c21518919JjArr3[i7];
                            C21518919Jj c21518919Jj3 = c21518919JjArr4[i7];
                            c21518919Jj.getClass();
                            c21518919Jj.LIZ = c21518919Jj2.LIZ;
                            int i8 = 0;
                            while (true) {
                                float[] fArr = c21518919Jj2.LIZIZ;
                                if (i8 < fArr.length) {
                                    c21518919Jj.LIZIZ[i8] = (fArr[i8] * (1.0f - f)) + (c21518919Jj3.LIZIZ[i8] * f);
                                    i8++;
                                }
                            }
                        }
                        return this.LIZ;
                    }
                    throw new IllegalArgumentException("Can't interpolate between two incompatible pathData");
                }
            };
            if (c21518919JjArrLIZJ2 != null) {
                if (C21518819Ji.LIZ(c21518919JjArrLIZJ, c21518919JjArrLIZJ2)) {
                    return PropertyValuesHolder.ofObject(str, typeEvaluator, c21518919JjArrLIZJ, c21518919JjArrLIZJ2);
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(" Can't morph from ");
                sbLIZ.append(strXd);
                sbLIZ.append(" to ");
                sbLIZ.append(strXd2);
                throw new InflateException(C2188811AlT.LIZIZ(sbLIZ));
            }
            return PropertyValuesHolder.ofObject(str, typeEvaluator, c21518919JjArrLIZJ);
        }
        if (i6 == 3) {
            c1593200rYs = C1593200rYs.LIZ;
        } else {
            c1593200rYs = null;
        }
        if (z3) {
            if (z) {
                if (i4 == 5) {
                    dimension2 = typedArray.getDimension(i2, 0.0f);
                } else {
                    dimension2 = typedArray.getFloat(i2, 0.0f);
                }
                if (z2) {
                    if (i5 == 5) {
                        dimension3 = typedArray.getDimension(i3, 0.0f);
                    } else {
                        dimension3 = typedArray.getFloat(i3, 0.0f);
                    }
                    propertyValuesHolderOfInt = PropertyValuesHolder.ofFloat(str, dimension2, dimension3);
                } else {
                    propertyValuesHolderOfInt = PropertyValuesHolder.ofFloat(str, dimension2);
                }
            } else {
                if (i5 == 5) {
                    dimension = typedArray.getDimension(i3, 0.0f);
                } else {
                    dimension = typedArray.getFloat(i3, 0.0f);
                }
                propertyValuesHolderOfInt = PropertyValuesHolder.ofFloat(str, dimension);
            }
        } else if (z) {
            if (i4 == 5) {
                color2 = (int) typedArray.getDimension(i2, 0.0f);
            } else if (LIZLLL(i4)) {
                color2 = typedArray.getColor(i2, 0);
            } else {
                color2 = typedArray.getInt(i2, 0);
            }
            if (z2) {
                if (i5 == 5) {
                    color3 = (int) typedArray.getDimension(i3, 0.0f);
                } else if (LIZLLL(i5)) {
                    color3 = typedArray.getColor(i3, 0);
                } else {
                    color3 = typedArray.getInt(i3, 0);
                }
                propertyValuesHolderOfInt = PropertyValuesHolder.ofInt(str, color2, color3);
            } else {
                propertyValuesHolderOfInt = PropertyValuesHolder.ofInt(str, color2);
            }
        } else {
            if (!z2) {
                return null;
            }
            if (i5 == 5) {
                color = (int) typedArray.getDimension(i3, 0.0f);
            } else if (LIZLLL(i5)) {
                color = typedArray.getColor(i3, 0);
            } else {
                color = typedArray.getInt(i3, 0);
            }
            propertyValuesHolderOfInt = PropertyValuesHolder.ofInt(str, color);
        }
        if (propertyValuesHolderOfInt == null || c1593200rYs == null) {
            return propertyValuesHolderOfInt;
        }
        propertyValuesHolderOfInt.setEvaluator(c1593200rYs);
        return propertyValuesHolderOfInt;
    }

    public static ValueAnimator LJ(Context context, Resources resources, Resources.Theme theme, AttributeSet attributeSet, ValueAnimator valueAnimator, XmlPullParser xmlPullParser) {
        int resourceId;
        PropertyValuesHolder propertyValuesHolderOfFloat;
        PropertyValuesHolder propertyValuesHolderOfFloat2;
        boolean z;
        int i;
        boolean z2;
        int i2;
        ValueAnimator valueAnimator2 = valueAnimator;
        TypedArray typedArrayLJI = C19KG.LJI(resources, theme, attributeSet, C21518719Jh.LJI);
        TypedArray typedArrayLJI2 = C19KG.LJI(resources, theme, attributeSet, C21518719Jh.LJIIJ);
        if (valueAnimator2 == null) {
            valueAnimator2 = new ValueAnimator();
        }
        long jLIZLLL = C19KG.LIZLLL(typedArrayLJI, xmlPullParser, "duration", 1, DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL);
        int i3 = 0;
        long jLIZLLL2 = C19KG.LIZLLL(typedArrayLJI, xmlPullParser, "startOffset", 2, 0);
        int iLIZLLL = C19KG.LIZLLL(typedArrayLJI, xmlPullParser, "valueType", 7, 4);
        if (C19KG.LJFF(xmlPullParser, "valueFrom") && C19KG.LJFF(xmlPullParser, "valueTo")) {
            if (iLIZLLL == 4) {
                TypedValue typedValuePeekValue = typedArrayLJI.peekValue(5);
                if (typedValuePeekValue != null) {
                    z = true;
                    i = typedValuePeekValue.type;
                } else {
                    z = false;
                    i = 0;
                }
                TypedValue typedValuePeekValue2 = typedArrayLJI.peekValue(6);
                if (typedValuePeekValue2 != null) {
                    z2 = true;
                    i2 = typedValuePeekValue2.type;
                } else {
                    z2 = false;
                    i2 = 0;
                }
                if ((z && LIZLLL(i)) || (z2 && LIZLLL(i2))) {
                    iLIZLLL = 3;
                } else {
                    iLIZLLL = 0;
                }
            }
            PropertyValuesHolder propertyValuesHolderLIZJ = LIZJ(typedArrayLJI, iLIZLLL, 5, 6, "");
            if (propertyValuesHolderLIZJ != null) {
                valueAnimator2.setValues(propertyValuesHolderLIZJ);
            }
        }
        valueAnimator2.setDuration(jLIZLLL);
        valueAnimator2.setStartDelay(jLIZLLL2);
        valueAnimator2.setRepeatCount(C19KG.LIZLLL(typedArrayLJI, xmlPullParser, "repeatCount", 3, 0));
        valueAnimator2.setRepeatMode(C19KG.LIZLLL(typedArrayLJI, xmlPullParser, "repeatMode", 4, 1));
        if (typedArrayLJI2 != null) {
            ObjectAnimator objectAnimator = (ObjectAnimator) valueAnimator2;
            String strLJ = C19KG.LJ(typedArrayLJI2, xmlPullParser, "pathData", 1);
            if (strLJ != null) {
                String strLJ2 = C19KG.LJ(typedArrayLJI2, xmlPullParser, "propertyXName", 2);
                String strLJ3 = C19KG.LJ(typedArrayLJI2, xmlPullParser, "propertyYName", 3);
                if (strLJ2 == null && strLJ3 == null) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(typedArrayLJI2.getPositionDescription());
                    sbLIZ.append(" propertyXName or propertyYName is needed for PathData");
                    throw new InflateException(C2188811AlT.LIZIZ(sbLIZ));
                }
                Path pathLIZLLL = C21518819Ji.LIZLLL(strLJ);
                PathMeasure pathMeasure = new PathMeasure(pathLIZLLL, false);
                ArrayList arrayList = new ArrayList();
                arrayList.add(Float.valueOf(0.0f));
                float length = 0.0f;
                do {
                    length += pathMeasure.getLength();
                    arrayList.add(Float.valueOf(length));
                } while (pathMeasure.nextContour());
                PathMeasure pathMeasure2 = new PathMeasure(pathLIZLLL, false);
                int iMin = Math.min(100, ((int) (length / 0.5f)) + 1);
                float[] fArr = new float[iMin];
                float[] fArr2 = new float[iMin];
                float[] fArr3 = new float[2];
                float f = length / (iMin - 1);
                int i4 = 0;
                float f2 = 0.0f;
                while (true) {
                    propertyValuesHolderOfFloat = null;
                    if (i3 >= iMin) {
                        break;
                    }
                    pathMeasure2.getPosTan(f2 - ((Float) ListProtector.get(arrayList, i4)).floatValue(), fArr3, null);
                    fArr[i3] = fArr3[0];
                    fArr2[i3] = fArr3[1];
                    f2 += f;
                    int i5 = i4 + 1;
                    if (i5 < arrayList.size() && f2 > ((Float) ListProtector.get(arrayList, i5)).floatValue()) {
                        pathMeasure2.nextContour();
                        i4 = i5;
                    }
                    i3++;
                }
                if (strLJ2 != null) {
                    propertyValuesHolderOfFloat2 = PropertyValuesHolder.ofFloat(strLJ2, fArr);
                } else {
                    propertyValuesHolderOfFloat2 = null;
                }
                if (strLJ3 != null) {
                    propertyValuesHolderOfFloat = PropertyValuesHolder.ofFloat(strLJ3, fArr2);
                }
                if (propertyValuesHolderOfFloat2 == null) {
                    i3 = 0;
                    objectAnimator.setValues(propertyValuesHolderOfFloat);
                } else {
                    i3 = 0;
                    if (propertyValuesHolderOfFloat == null) {
                        objectAnimator.setValues(propertyValuesHolderOfFloat2);
                    } else {
                        objectAnimator.setValues(propertyValuesHolderOfFloat2, propertyValuesHolderOfFloat);
                    }
                }
            } else {
                objectAnimator.setPropertyName(C19KG.LJ(typedArrayLJI2, xmlPullParser, "propertyName", 0));
            }
        }
        if (C19KG.LJFF(xmlPullParser, "interpolator") && (resourceId = typedArrayLJI.getResourceId(i3, i3)) > 0) {
            valueAnimator2.setInterpolator(AnimationUtils.loadInterpolator(context, resourceId));
        }
        typedArrayLJI.recycle();
        if (typedArrayLJI2 != null) {
            typedArrayLJI2.recycle();
        }
        return valueAnimator2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:148:0x02ce, code lost:
    
        if (r27 == null) goto L156;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x02d0, code lost:
    
        if (r8 == null) goto L156;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x02d2, code lost:
    
        r3 = new android.animation.Animator[r8.size()];
        r2 = r8.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x02e0, code lost:
    
        if (r2.hasNext() == false) goto L192;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x02e2, code lost:
    
        r3[r4] = r2.next();
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x02ec, code lost:
    
        if (r28 != 0) goto L157;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x02ee, code lost:
    
        r27.playTogether(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x02f1, code lost:
    
        return r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x02f2, code lost:
    
        r27.playSequentially(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x02f5, code lost:
    
        return r13;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:127:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0180  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.animation.Animator LIZ(android.content.Context r22, android.content.res.Resources r23, android.content.res.Resources.Theme r24, org.xmlpull.v1.XmlPullParser r25, android.util.AttributeSet r26, android.animation.AnimatorSet r27, int r28) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            Method dump skipped, instruction units count: 758
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21518519Jf.LIZ(android.content.Context, android.content.res.Resources, android.content.res.Resources$Theme, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.animation.AnimatorSet, int):android.animation.Animator");
    }
}
