package X;

import Y.ALAdapterS25S0100000_31;
import android.animation.AnimatorSet;
import android.animation.PropertyValuesHolder;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import android.util.Property;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import com.bytedance.android.live.liveinteract.multimatch.matchitem.component.effectcard.Vec2;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.159G, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C159G {
    public final AnimatorSet LIZ = new AnimatorSet();
    public final Path LIZIZ = new Path();
    public C159A LIZJ;
    public C159B LIZLLL;
    public final List<C159H> LJ;

    public C159G(AnonymousClass1595 anonymousClass1595, List<C159C> list) {
        TimeInterpolator linearInterpolator;
        ArrayList arrayList = new ArrayList();
        float f = 0.0f;
        int i = 0;
        float f2 = 0.0f;
        for (Object obj : (ArrayList) list) {
            int i2 = i + 1;
            if (i >= 0) {
                C159C c159c = (C159C) obj;
                if (i == 0) {
                    Path path = this.LIZIZ;
                    PointF pointF = c159c.LIZ;
                    path.moveTo(pointF.x, pointF.y);
                    Path path2 = this.LIZIZ;
                    PointF pointF2 = c159c.LIZ;
                    path2.lineTo(pointF2.x + 1.0E-5f, pointF2.y + 1.0E-5f);
                    arrayList.add(new C159H(c159c, 0.0f));
                } else {
                    Path path3 = this.LIZIZ;
                    PointF pointF3 = c159c.LIZIZ;
                    float f3 = pointF3.x;
                    float f4 = pointF3.y;
                    PointF pointF4 = c159c.LIZ;
                    path3.quadTo(f3, f4, pointF4.x, pointF4.y);
                    float length = new PathMeasure(this.LIZIZ, false).getLength();
                    arrayList.add(new C159H(c159c, length - f2));
                    f2 = length;
                }
                i = i2;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        this.LJ = arrayList;
        ArrayList arrayList2 = new ArrayList();
        final int i3 = 0;
        float f5 = 0.0f;
        for (Object obj2 : arrayList) {
            int i4 = i3 + 1;
            if (i3 >= 0) {
                C159H c159h = (C159H) obj2;
                int i5 = C159F.LIZ[c159h.LIZ.LIZLLL.ordinal()];
                if (i5 != 1) {
                    if (i5 != 2) {
                        if (i5 != 3) {
                            if (i5 != 4) {
                                if (i5 == 5) {
                                    anonymousClass1595.getClass();
                                    linearInterpolator = new TimeInterpolator() { // from class: X.0GoC
                                        public final PathMeasure LIZ;

                                        {
                                            Path path4 = new Path();
                                            path4.moveTo(0.0f, 0.0f);
                                            path4.cubicTo(0.85f, 0.0f, 1.0f, 1.0f, 1.0f, 1.0f);
                                            this.LIZ = new PathMeasure(path4, false);
                                        }

                                        @Override // android.animation.TimeInterpolator
                                        public final float getInterpolation(float f6) {
                                            float[] fArr = new float[2];
                                            PathMeasure pathMeasure = this.LIZ;
                                            pathMeasure.getPosTan(f6 * pathMeasure.getLength(), fArr, null);
                                            return fArr[1];
                                        }
                                    };
                                } else {
                                    throw new C1954807lC();
                                }
                            } else {
                                linearInterpolator = new AccelerateDecelerateInterpolator();
                            }
                        } else {
                            linearInterpolator = new DecelerateInterpolator();
                        }
                    } else {
                        linearInterpolator = new AccelerateInterpolator();
                    }
                } else {
                    linearInterpolator = new LinearInterpolator();
                }
                ValueAnimator valueAnimator = new ValueAnimator();
                valueAnimator.setDuration(c159h.LIZ.LIZJ);
                valueAnimator.setInterpolator(linearInterpolator);
                valueAnimator.setValues(PropertyValuesHolder.ofFloat("position", f, c159h.LIZIZ + f), PropertyValuesHolder.ofFloat((Property<?, Float>) View.ROTATION, f5, c159h.LIZ.LJ));
                valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: X.159D
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                        Float f6;
                        Float f7;
                        C159G c159g = this.LL;
                        int i6 = i3;
                        c159g.getClass();
                        Object animatedValue = valueAnimator2.getAnimatedValue("position");
                        if (animatedValue instanceof Float) {
                            f6 = (Float) animatedValue;
                        } else {
                            f6 = null;
                        }
                        if (f6 != null) {
                            float fFloatValue = f6.floatValue();
                            Object animatedValue2 = valueAnimator2.getAnimatedValue("rotation");
                            if ((animatedValue2 instanceof Float) && (f7 = (Float) animatedValue2) != null) {
                                float fFloatValue2 = f7.floatValue();
                                float[] fArr = new float[2];
                                float[] fArr2 = new float[2];
                                new PathMeasure(c159g.LIZIZ, false).getPosTan(fFloatValue, fArr, fArr2);
                                PointF pointF5 = new PointF(fArr[0], fArr[1]);
                                Vec2 vec2 = new Vec2(fArr2[0], fArr2[1]);
                                C159A c159a = c159g.LIZJ;
                                if (c159a != null) {
                                    c159a.LIZ(i6, pointF5, fFloatValue2, vec2);
                                    return;
                                }
                                return;
                            }
                            "Required value was null.".toString();
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        "Required value was null.".toString();
                        throw new IllegalArgumentException("Required value was null.");
                    }
                });
                arrayList2.add(valueAnimator);
                f += c159h.LIZIZ;
                f5 = c159h.LIZ.LJ;
                i3 = i4;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        this.LIZ.removeAllListeners();
        this.LIZ.addListener(new ALAdapterS25S0100000_31(this, 8));
        this.LIZ.playSequentially(arrayList2);
    }
}
