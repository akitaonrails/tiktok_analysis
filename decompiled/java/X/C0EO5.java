package X;

import X.AbstractC363520ENa;
import android.graphics.PointF;
import android.graphics.RectF;
import android.util.Size;
import android.util.SizeF;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import com.bytedance.ies.nle.editor_jni.NLEKeyframeType;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import zoo.b;

/* JADX INFO: renamed from: X.0EO5, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public abstract class C0EO5<T extends AbstractC363520ENa> extends AbstractC385780FAq {
    public final C363630ENl LL;
    public final C0E48 LLILLJJLI;
    public boolean LLILLL = true;
    public final C054G LLILZ;
    public AnonymousClass0956 LLILZIL;
    public final C0EO2 LLILZLL;
    public final C0ZDN LLIZ;
    public Pair<Float, Float> LLIZLLLIL;
    public final int LLJ;
    public C0EO0 LLJI;
    public Size LLJIJIL;
    public Size LLJILJIL;
    public T LLJILJILJ;
    public double LLJILLL;
    public final int LLJJ;
    public boolean LLJJI;
    public boolean LLJJIII;
    public boolean LLJJIJI;
    public boolean LLJJIJIIJIL;
    public final float LLJJIJIL;
    public float LLJJJ;

    public abstract RectF LJJIL(PointF pointF);

    public abstract RectF LJJIZ(PointF pointF);

    public abstract RectF LJJJI(PointF pointF);

    public abstract RectF LJJJIL(PointF pointF);

    public abstract void LJJJJIZL(PointF pointF, Float f, Float f2, Float f3, Float f4);

    @Override // X.C0FUM, com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
    public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        return true;
    }

    public final PointF LJJJ() {
        C0EOF c0eof = C0EOF.LIZ;
        T t = this.LLJILJILJ;
        C0ENU c0enuLIZ = t != null ? t.LIZ() : null;
        C0EO0 c0eo0 = this.LLJI;
        c0eof.getClass();
        return C0EOF.LIZ(c0enuLIZ, c0eo0);
    }

    @Override // X.AbstractC385780FAq
    public final int getPriority() {
        return this.LLJ;
    }

    @Override // X.C0FUM, com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
    public final boolean E2(C21645419nQ c21645419nQ) {
        T t;
        C0ENU c0enuLIZ;
        if (this.LLILLL && (t = this.LLJILJILJ) != null && (c0enuLIZ = t.LIZ()) != null) {
            C0EO2 c0eo2 = this.LLILZLL;
            PointF pointF = c0enuLIZ.LIZ;
            c0eo2.LIZJ(new PointF(pointF.x, pointF.y), c0enuLIZ.LIZIZ);
        }
        return true;
    }

    @Override // X.C0FUM, com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
    public boolean LIZIZ(MotionEvent motionEvent) {
        if (!this.LLILLL) {
            return true;
        }
        LJJIJLIJ(motionEvent);
        return true;
    }

    public final void LJJIJLIJ(MotionEvent motionEvent) {
        Size size;
        Size size2 = this.LLJIJIL;
        if (size2 == null || (size = this.LLJILJIL) == null) {
            return;
        }
        int width = (size2.getWidth() / 2) - (size.getWidth() / 2);
        int width2 = (size2.getWidth() / 2) + (size.getWidth() / 2);
        if (motionEvent.getX() < width || motionEvent.getX() > width2) {
            this.LL.LJIILIIL.invoke();
        }
    }

    public void LJJJJJL(b bVar) {
        RectF rectFLJJJI;
        Float fLJJIJL;
        PointF pointFLJJJ = LJJJ();
        if (pointFLJJJ != null && (rectFLJJJI = LJJJI(pointFLJJJ)) != null && (fLJJIJL = LJJIJL(new SizeF(rectFLJJJI.width(), rectFLJJJI.height()), bVar.LJIIJJI, null)) != null) {
            float fFloatValue = fLJJIJL.floatValue();
            C0EO0 c0eo0 = this.LLJI;
            if (c0eo0 != null) {
                float f = c0eo0.LIZ;
                if (f > 0.0f && c0eo0.LIZIZ > 0.0f && ((int) (f * fFloatValue)) != ((int) rectFLJJJI.width()) && ((int) (c0eo0.LIZ * fFloatValue)) == ((int) rectFLJJJI.height())) {
                    this.LLIZ.LIZ(0);
                }
            }
            LJJJJIZL(null, null, null, Float.valueOf(fFloatValue), null);
        }
    }

    @Override // X.C0FUM, com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
    public final boolean LJJLIIIJLJLI(float f) {
        Float fValueOf;
        C0ENU c0enuLIZ;
        NLETrackSlot nLETrackSlotLLLLLLIL;
        if (!this.LLILLL) {
            return true;
        }
        T t = this.LLJILJILJ;
        float f2 = 0.0f;
        if (t != null) {
            this.LLJILLL -= (double) ((float) Math.toDegrees(f));
            if (t.LIZ().LIZIZ == ((int) (((double) t.LIZ().LIZIZ) + this.LLJILLL)) % 360) {
                f2 = t.LIZ().LIZIZ;
            } else {
                float fLIZIZ = this.LLILZLL.LIZIZ(t.LIZ().LIZIZ, (float) this.LLJILLL, 45);
                C0E48 c0e48 = this.LLILLJJLI;
                if (c0e48 != null) {
                    nLETrackSlotLLLLLLIL = c0e48.LLLLLLIL();
                } else {
                    nLETrackSlotLLLLLLIL = null;
                }
                if (!C351220Dpo.LLFF(nLETrackSlotLLLLLLIL, NLEKeyframeType.Mask)) {
                    fLIZIZ = C363770ENz.LJ(fLIZIZ);
                }
                if (t.LIZ().LIZIZ != fLIZIZ && Math.abs(fLIZIZ) % 45 == 0.0f) {
                    this.LLIZ.LIZ(0);
                }
                this.LLJILLL = 0.0d;
                f2 = fLIZIZ;
            }
        }
        T t2 = this.LLJILJILJ;
        if (t2 != null && (c0enuLIZ = t2.LIZ()) != null) {
            fValueOf = Float.valueOf(c0enuLIZ.LIZIZ);
        } else {
            fValueOf = null;
        }
        if (Intrinsics.LIZLLL(fValueOf, f2)) {
            return true;
        }
        AnonymousClass0956 anonymousClass0956 = this.LLILZIL;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        Function1<Boolean, Unit> function1 = this.LL.LJFF;
        Boolean bool = Boolean.TRUE;
        function1.invoke(bool);
        this.LL.LJII.invoke(bool);
        this.LLILZIL = C23250099c.LIZLLL(this.LLILZ, null, null, new C0EOA(this, null), 3);
        LJJJJIZL(null, Float.valueOf(f2), null, null, null);
        return true;
    }

    @Override // X.C0FUM, com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
    public boolean LLLZLZ(b bVar) {
        PointF pointFLJJJ;
        RectF rectFLJJJI;
        T t;
        float fMax;
        T t2;
        T t3;
        PointF pointF;
        if (!this.LLILLL || bVar.LJIIL > 1) {
            return true;
        }
        if (this.LLJJI && (t3 = this.LLJILJILJ) != null) {
            PointF pointF2 = t3.LIZ().LIZ;
            PointF pointF3 = bVar.LJIIJJI;
            C0EO0 c0eo0 = this.LLJI;
            if (c0eo0 == null) {
                pointF = new PointF(0.0f, 0.0f);
            } else {
                C0EOF c0eof = C0EOF.LIZ;
                float f = pointF3.x;
                float f2 = pointF3.y;
                float f3 = -c0eo0.LJ;
                c0eof.getClass();
                PointF pointFLIZIZ = C0EOF.LIZIZ(f, f2, f3, 0.0f, 0.0f);
                float f4 = 2;
                PointF pointFLIZ = this.LLILZLL.LIZ(new PointF(pointF2.x, pointF2.y), new PointF((pointFLIZIZ.x / c0eo0.LIZ) * f4, (-(pointFLIZIZ.y / c0eo0.LIZIZ)) * f4));
                float fMax2 = Math.max(Math.min(pointFLIZ.x, 1.0f), -1.0f);
                float fMax3 = Math.max(Math.min(pointFLIZ.y, 1.0f), -1.0f);
                if ((LJJJJ(this, Float.valueOf(fMax2), null, 2) && !LJJJJ(this, Float.valueOf(pointF2.x), null, 2)) || (LJJJJ(this, null, Float.valueOf(fMax3), 1) && !LJJJJ(this, null, Float.valueOf(pointF2.y), 1))) {
                    this.LLIZ.LIZ(0);
                }
                pointF = new PointF(fMax2, fMax3);
            }
            LJJJJIZL(pointF, null, null, null, null);
        }
        if (this.LLJJIII) {
            PointF pointF4 = bVar.LJIIJJI;
            C0EO0 c0eo02 = this.LLJI;
            if (c0eo02 != null && (t2 = this.LLJILJILJ) != null) {
                C0EOF c0eof2 = C0EOF.LIZ;
                float f5 = pointF4.x;
                float f6 = pointF4.y;
                float f7 = (-c0eo02.LJ) - t2.LIZ().LIZIZ;
                c0eof2.getClass();
                fMax = Math.max(Math.min(t2.LIZ().LIZJ + (C0EOF.LIZIZ(f5, f6, f7, 0.0f, 0.0f).y / this.LLJJ), 1.0f), 0.0f);
            } else {
                fMax = 0.0f;
            }
            LJJJJIZL(null, null, Float.valueOf(fMax), null, null);
        }
        if (this.LLJJIJI) {
            LJJJJJL(bVar);
        }
        if (this.LLJJIJIIJIL && (pointFLJJJ = LJJJ()) != null && (rectFLJJJI = LJJJI(pointFLJJJ)) != null) {
            SizeF sizeF = new SizeF(rectFLJJJI.width(), rectFLJJJI.height());
            PointF pointF5 = bVar.LJIIJJI;
            C0EO0 c0eo03 = this.LLJI;
            if (c0eo03 != null && c0eo03.LIZIZ != 0.0f && (t = this.LLJILJILJ) != null) {
                C0EOF c0eof3 = C0EOF.LIZ;
                float f8 = pointF5.x;
                float f9 = pointF5.y;
                float f10 = (-c0eo03.LJ) - t.LIZ().LIZIZ;
                c0eof3.getClass();
                PointF pointFLIZIZ2 = C0EOF.LIZIZ(f8, f9, f10, 0.0f, 0.0f);
                C0EO2 c0eo2 = this.LLILZLL;
                float f11 = -pointFLIZIZ2.y;
                if (c0eo2.LJIIJ > 0.0f) {
                    SizeF sizeF2 = new SizeF(sizeF.getWidth(), sizeF.getHeight() + f11);
                    if (c0eo2.LIZJ) {
                        float f12 = c0eo2.LJI;
                        if (f12 < c0eo2.LJIIJ) {
                            c0eo2.LJI = f12 + Math.abs(f11);
                        } else {
                            if (Math.abs(sizeF2.getWidth() - sizeF2.getHeight()) >= c0eo2.LJIIJ) {
                                c0eo2.LIZJ = false;
                                c0eo2.LJI = 0.0f;
                            }
                            sizeF = sizeF2;
                        }
                    } else if (Math.abs(sizeF2.getWidth() - sizeF2.getHeight()) <= c0eo2.LJIIJ) {
                        c0eo2.LIZJ = true;
                        c0eo2.LJI = 0.0f;
                        sizeF = new SizeF(sizeF.getWidth(), sizeF.getWidth());
                    } else {
                        sizeF = sizeF2;
                    }
                }
                Float fValueOf = Float.valueOf(Math.max(0.0f, sizeF.getHeight() / c0eo03.LIZIZ));
                if (fValueOf != null) {
                    float fFloatValue = fValueOf.floatValue();
                    C0EO0 c0eo04 = this.LLJI;
                    if (c0eo04 != null && c0eo04.LIZ > 0.0f) {
                        float f13 = c0eo04.LIZIZ;
                        if (f13 > 0.0f && ((int) (f13 * fFloatValue)) != ((int) rectFLJJJI.height()) && ((int) (c0eo04.LIZIZ * fFloatValue)) == ((int) rectFLJJJI.width())) {
                            this.LLIZ.LIZ(0);
                        }
                    }
                    LJJJJIZL(null, null, null, null, Float.valueOf(fFloatValue));
                }
            }
        }
        return true;
    }

    @Override // X.C0FUM, com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
    public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        C0EO0 c0eo0;
        PointF pointFLJJJ;
        RectF rectFLJJJI;
        if (!this.LLILLL || (c0eo0 = this.LLJI) == null || (pointFLJJJ = LJJJ()) == null || (rectFLJJJI = LJJJI(pointFLJJJ)) == null) {
            return true;
        }
        LJJJJIZL(null, null, null, Float.valueOf((rectFLJJJI.width() / c0eo0.LIZ) * scaleGestureDetector.getScaleFactor()), Float.valueOf((rectFLJJJI.height() / c0eo0.LIZIZ) * scaleGestureDetector.getScaleFactor()));
        return true;
    }

    @Override // X.C0FUM, com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
    public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        if (!this.LLILLL) {
            return true;
        }
        LJJIJLIJ(motionEvent);
        return true;
    }

    @Override // X.C0FUM, com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
    public void onTouchEvent(MotionEvent motionEvent) {
        if (this.LLILLL && C1697810uHb.LJIIJJI(3, 1).contains(Integer.valueOf(motionEvent.getActionMasked()))) {
            AnonymousClass0956 anonymousClass0956 = this.LLILZIL;
            if (anonymousClass0956 != null) {
                anonymousClass0956.LIZIZ(null);
            }
            Function1<Boolean, Unit> function1 = this.LL.LJFF;
            Boolean bool = Boolean.FALSE;
            function1.invoke(bool);
            this.LL.LJI.invoke(bool);
            this.LL.LJII.invoke(bool);
            C0EO2 c0eo2 = this.LLILZLL;
            c0eo2.getClass();
            c0eo2.LIZ = new C0EO3(false, false);
            c0eo2.LIZIZ = false;
            c0eo2.LIZJ = false;
            c0eo2.LJI = 0.0f;
            c0eo2.LIZLLL = 0.0f;
            c0eo2.LJ = 0.0f;
            c0eo2.LJFF = 0.0f;
        }
    }

    public C0EO5(C363630ENl c363630ENl, C0E48 c0e48) {
        this.LL = c363630ENl;
        this.LLILLJJLI = c0e48;
        C1DFH c1dfh = C0PEM.LIZ;
        this.LLILZ = C2296808zG.LIZ(C2107308Nj.LIZ);
        this.LLILZLL = new C0EO2();
        this.LLIZ = new C0ZDN(C0CHQ.LIZ);
        Float fValueOf = Float.valueOf(0.0f);
        this.LLIZLLLIL = new Pair<>(fValueOf, fValueOf);
        this.LLJ = Integer.MAX_VALUE;
        this.LLJJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(48));
        this.LLJJIJIL = ((float) Math.sqrt((C1415610mwR.LIZIZ() * C1415610mwR.LIZIZ()) + (C1415610mwR.LIZ() * C1415610mwR.LIZ()))) * 2.0f;
        this.LLJJJ = 1.0f;
    }

    public final Float LJJIJL(SizeF sizeF, PointF pointF, Float f) {
        T t;
        float height;
        float height2;
        float height3;
        float height4;
        C0EO0 c0eo0 = this.LLJI;
        if (c0eo0 == null || c0eo0.LIZ == 0.0f || (t = this.LLJILJILJ) == null) {
            return null;
        }
        C0EOF c0eof = C0EOF.LIZ;
        float f2 = pointF.x;
        float f3 = pointF.y;
        float f4 = (-c0eo0.LJ) - t.LIZ().LIZIZ;
        c0eof.getClass();
        PointF pointFLIZIZ = C0EOF.LIZIZ(f2, f3, f4, 0.0f, 0.0f);
        C0EO2 c0eo2 = this.LLILZLL;
        float f5 = pointFLIZIZ.x;
        if (c0eo2.LJIIJ > 0.0f) {
            SizeF sizeF2 = new SizeF(sizeF.getWidth() + f5, sizeF.getHeight());
            if (c0eo2.LIZJ) {
                float f6 = c0eo2.LJI;
                if (f6 < c0eo2.LJIIJ) {
                    c0eo2.LJI = f6 + Math.abs(f5);
                } else {
                    float width = sizeF2.getWidth();
                    if (f != null) {
                        height4 = f.floatValue();
                    } else {
                        height4 = sizeF2.getHeight();
                    }
                    if (Math.abs(width - height4) >= c0eo2.LJIIJ) {
                        c0eo2.LIZJ = false;
                        c0eo2.LJI = 0.0f;
                    }
                    sizeF = sizeF2;
                }
            } else {
                float width2 = sizeF2.getWidth();
                if (f != null) {
                    height = f.floatValue();
                } else {
                    height = sizeF2.getHeight();
                }
                if (Math.abs(width2 - height) <= c0eo2.LJIIJ) {
                    c0eo2.LIZJ = true;
                    c0eo2.LJI = 0.0f;
                    if (f != null) {
                        height2 = f.floatValue();
                        height3 = f.floatValue();
                    } else {
                        height2 = sizeF.getHeight();
                        height3 = sizeF.getHeight();
                    }
                    sizeF = new SizeF(height2, height3);
                } else {
                    sizeF = sizeF2;
                }
            }
        }
        return Float.valueOf(Math.max(0.0f, sizeF.getWidth() / c0eo0.LIZ));
    }

    public final boolean LJJJJI(float f, float f2, RectF rectF) {
        float f3;
        C0ENU c0enuLIZ;
        if (rectF == null) {
            return false;
        }
        C0EO0 c0eo0 = this.LLJI;
        float f4 = 0.0f;
        if (c0eo0 != null) {
            f3 = c0eo0.LJ;
        } else {
            f3 = 0.0f;
        }
        T t = this.LLJILJILJ;
        if (t != null && (c0enuLIZ = t.LIZ()) != null) {
            f4 = c0enuLIZ.LIZIZ;
        }
        PointF pointFLJJJ = LJJJ();
        if (pointFLJJJ == null) {
            return false;
        }
        C0EOF c0eof = C0EOF.LIZ;
        float f5 = (-f4) - f3;
        float f6 = pointFLJJJ.x;
        float f7 = pointFLJJJ.y;
        c0eof.getClass();
        PointF pointFLIZIZ = C0EOF.LIZIZ(f, f2, f5, f6, f7);
        return rectF.contains(pointFLIZIZ.x, pointFLIZIZ.y);
    }

    @Override // X.C0FUM, com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
    public boolean LLLLLLLLL(b bVar, float f, float f2) {
        PointF pointFLJJJ;
        C0ENU c0enuLIZ;
        if (!this.LLILLL || (pointFLJJJ = LJJJ()) == null) {
            return true;
        }
        boolean z = false;
        this.LLJJI = false;
        this.LLJJIII = false;
        this.LLJJIJI = false;
        this.LLJJIJIIJIL = false;
        RectF rectFLJJJI = LJJJI(pointFLJJJ);
        if (LJJJJI(f, f2, rectFLJJJI)) {
            this.LLJJI = true;
            this.LL.LJI.invoke(Boolean.TRUE);
            T t = this.LLJILJILJ;
            if (t != null && (c0enuLIZ = t.LIZ()) != null) {
                C0EO2 c0eo2 = this.LLILZLL;
                PointF pointF = c0enuLIZ.LIZ;
                c0eo2.LIZJ(new PointF(pointF.x, pointF.y), c0enuLIZ.LIZIZ);
            }
            return true;
        }
        if (LJJJJI(f, f2, LJJIZ(pointFLJJJ))) {
            this.LLJJIJI = true;
            if (rectFLJJJI != null) {
                C0EO2 c0eo22 = this.LLILZLL;
                SizeF sizeF = new SizeF(rectFLJJJI.width(), rectFLJJJI.height());
                c0eo22.getClass();
                if (sizeF.getWidth() == sizeF.getHeight()) {
                    z = true;
                }
                c0eo22.LIZJ = z;
                c0eo22.LJI = 0.0f;
            }
            return true;
        }
        if (LJJJJI(f, f2, LJJJIL(pointFLJJJ))) {
            this.LLJJIJIIJIL = true;
            if (rectFLJJJI != null) {
                C0EO2 c0eo23 = this.LLILZLL;
                SizeF sizeF2 = new SizeF(rectFLJJJI.width(), rectFLJJJI.height());
                c0eo23.getClass();
                if (sizeF2.getWidth() == sizeF2.getHeight()) {
                    z = true;
                }
                c0eo23.LIZJ = z;
                c0eo23.LJI = 0.0f;
            }
            return true;
        }
        if (LJJJJI(f, f2, LJJIL(pointFLJJJ))) {
            this.LLJJIII = true;
        }
        return true;
    }

    public static boolean LJJJJ(C0EO5 c0eo5, Float f, Float f2, int i) {
        boolean z;
        boolean z2;
        if ((i & 1) != 0) {
            f = null;
        }
        if ((i & 2) != 0) {
            f2 = null;
        }
        c0eo5.getClass();
        if (f != null && Math.abs(f.floatValue()) <= c0eo5.LLIZLLLIL.getFirst().floatValue()) {
            z = true;
        } else {
            z = false;
        }
        if (f2 != null && Math.abs(f2.floatValue()) <= c0eo5.LLIZLLLIL.getSecond().floatValue()) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (f != null) {
            if (f2 != null) {
                if (z || z2) {
                    return true;
                }
                return false;
            }
            return z;
        }
        return z2;
    }

    public void LJJJJL(C0EO0 c0eo0, Float f, Size size, Size size2, Size size3) {
        this.LLJI = c0eo0;
        this.LLJIJIL = size;
        this.LLJILJIL = size2;
        if (size3 == null || size2 == null) {
            return;
        }
        if (!C363770ENz.LIZJ(size3, size2)) {
            this.LLJJJ = size3.getWidth() / size2.getWidth();
        }
        if (c0eo0 != null && c0eo0.LIZ > 0.0f && c0eo0.LIZIZ > 0.0f) {
            C0EO2 c0eo2 = this.LLILZLL;
            float fLIZIZ = C418440Gaw.LIZIZ(10) / c0eo0.LIZ;
            float fLIZIZ2 = C418440Gaw.LIZIZ(10) / c0eo0.LIZIZ;
            float fLIZIZ3 = C418440Gaw.LIZIZ(4);
            c0eo2.LJII = fLIZIZ;
            c0eo2.LJIIIIZZ = fLIZIZ2;
            c0eo2.LJIIIZ = 6.0f;
            c0eo2.LJIIJ = fLIZIZ3;
            this.LLIZLLLIL = new Pair<>(Float.valueOf(C418440Gaw.LIZIZ(1) / c0eo0.LIZ), Float.valueOf(C418440Gaw.LIZIZ(1) / c0eo0.LIZIZ));
        }
    }
}
