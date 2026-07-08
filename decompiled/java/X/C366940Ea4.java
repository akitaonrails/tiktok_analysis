package X;

import Y.AComparatorS24S0000000_5;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.IndexedValue;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS549S0100000_5;

/* JADX INFO: renamed from: X.0Ea4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C366940Ea4 extends View {
    public final List<PointF> LL;
    public final List<PointF> LLILLJJLI;
    public float LLILLL;
    public final PointF LLILZ;
    public final C01GW LLILZIL;
    public int LLILZLL;
    public int LLIZ;
    public boolean LLIZLLLIL;
    public Pair<Float, Float> LLJ;
    public Function1<? super Integer, Unit> LLJI;
    public InterfaceC1631630sYr<? super Float, ? super List<? extends PointF>, ? super Boolean, ? super Boolean, Unit> LLJIJIL;
    public InterfaceC1631620sYq<? super Float, ? super Integer, ? super Boolean, Unit> LLJILJIL;
    public Function1<? super Boolean, Unit> LLJILJILJ;
    public final Path LLJILLL;
    public final int LLJJ;
    public final int LLJJI;
    public final RectF LLJJIII;
    public final Paint LLJJIJI;
    public final Paint LLJJIJIIJIL;
    public final Rect LLJJIJIL;
    public final Rect LLJJJ;
    public final Paint LLJJJIL;
    public PointF LLJJJJ;
    public PointF LLJJJJJIL;
    public final PointF LLJJJJLIIL;
    public final PointF LLJJL;
    public final Paint LLJJLIIIJLLLLLLLZ;
    public int LLJL;
    public final RectF LLJLIL;
    public final float LLJLILLLLZIIL;
    public final Paint LLJLL;
    public final Paint LLJLLIL;

    /* JADX WARN: Multi-variable type inference failed */
    private final void getSelectedIndexByCurrentX() {
        Object next;
        C717620SCy c717620SCyLLIIL = C13LP.LLIIL(this.LLILLJJLI);
        ArrayList arrayList = new ArrayList();
        Iterator it2 = c717620SCyLLIIL.iterator();
        while (true) {
            C717610SCx c717610SCx = (C717610SCx) it2;
            if (!c717610SCx.hasNext()) {
                break;
            }
            Object next2 = c717610SCx.next();
            float f = ((PointF) ((IndexedValue) next2).LIZIZ).x;
            float f2 = this.LLJLILLLLZIIL;
            float f3 = f - f2;
            float f4 = f + f2;
            float f5 = this.LLILLL;
            if (f3 <= f5 && f5 <= f4) {
                arrayList.add(next2);
            }
        }
        Iterator it3 = arrayList.iterator();
        if (it3.hasNext()) {
            next = it3.next();
            if (it3.hasNext()) {
                float fAbs = Math.abs(this.LLILLL - ((PointF) ((IndexedValue) next).LIZIZ).x);
                do {
                    Object next3 = it3.next();
                    float fAbs2 = Math.abs(this.LLILLL - ((PointF) ((IndexedValue) next3).LIZIZ).x);
                    if (Float.compare(fAbs, fAbs2) > 0) {
                        next = next3;
                        fAbs = fAbs2;
                    }
                } while (it3.hasNext());
            }
        } else {
            next = null;
        }
        IndexedValue indexedValue = (IndexedValue) next;
        setSelectPointIndex(indexedValue != null ? indexedValue.LIZ : -1);
    }

    public final void LIZ() {
        ((ArrayList) this.LLILLJJLI).clear();
        for (PointF pointF : this.LL) {
            PointF pointF2 = new PointF();
            float fWidth = pointF.x * this.LLJJIII.width();
            pointF2.set(LIZLLL() ? this.LLJJIII.right - fWidth : this.LLJJ + fWidth, (float) (pointF.y >= 1.0f ? (((double) this.LLJJI) + (((double) this.LLJJIII.height()) / 2.0d)) - (((((double) (pointF.y - 1)) / 9.0d) * ((double) this.LLJJIII.height())) / 2.0d) : ((double) this.LLJJI) + (((double) this.LLJJIII.height()) / 2.0d) + (((((double) (1 - pointF.y)) / 0.9d) * ((double) this.LLJJIII.height())) / 2.0d)));
            ((ArrayList) this.LLILLJJLI).add(pointF2);
        }
    }

    public final void LIZIZ() {
        int i = this.LLILZLL;
        if (i <= 0 || i >= ((ArrayList) this.LLILLJJLI).size()) {
            return;
        }
        ListProtector.remove(this.LLILLJJLI, this.LLILZLL);
        getSelectedIndexByCurrentX();
        LJFF(true, false);
        invalidate();
    }

    public final boolean LIZLLL() {
        return ((Boolean) this.LLILZIL.getValue()).booleanValue();
    }

    public final Function1<Boolean, Unit> getDraggingChange() {
        return this.LLJILJILJ;
    }

    public final Function1<Integer, Unit> getEditModeChange() {
        return this.LLJI;
    }

    public final int getEditPointMode() {
        return this.LLIZ;
    }

    public final InterfaceC1631630sYr<Float, List<? extends PointF>, Boolean, Boolean, Unit> getPointListChange() {
        return this.LLJIJIL;
    }

    public final InterfaceC1631620sYq<Float, Integer, Boolean, Unit> getProgressChange() {
        return this.LLJILJIL;
    }

    public final int getSelectPointIndex() {
        return this.LLILZLL;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float fWidth;
        float fWidth2;
        float fLIZ;
        super.onDraw(canvas);
        canvas.drawRect(this.LLJJIII, this.LLJJIJI);
        RectF rectF = this.LLJJIII;
        float f = rectF.left;
        float fHeight = this.LLJJI + (rectF.height() / 4.0f);
        RectF rectF2 = this.LLJJIII;
        LIZJ(canvas, f, fHeight, rectF2.right, this.LLJJI + (rectF2.height() / 4.0f), (int) (this.LLJJIII.width() / C390810FTz.LIZ(6.0f)), C390810FTz.LIZ(3.0f), this.LLJILLL, this.LLJJIJIIJIL);
        if (LIZLLL()) {
            fWidth = this.LLJJIII.left;
        } else {
            fWidth = this.LLJJIII.left + this.LLJJJ.width() + C390810FTz.LIZ(12.0f);
        }
        if (LIZLLL()) {
            fWidth2 = (this.LLJJIII.right - this.LLJJJ.width()) - C390810FTz.LIZ(12.0f);
        } else {
            fWidth2 = this.LLJJIII.right;
        }
        canvas.drawLine(fWidth, this.LLJJI + (this.LLJJIII.height() / 2.0f), fWidth2, this.LLJJI + (this.LLJJIII.height() / 2.0f), this.LLJJIJI);
        RectF rectF3 = this.LLJJIII;
        float f2 = rectF3.left;
        float f3 = 3;
        float fHeight2 = this.LLJJI + ((rectF3.height() / 4.0f) * f3);
        RectF rectF4 = this.LLJJIII;
        LIZJ(canvas, f2, fHeight2, rectF4.right, this.LLJJI + ((rectF4.height() / 4.0f) * f3), (int) (this.LLJJIII.width() / C390810FTz.LIZ(6.0f)), C390810FTz.LIZ(3.0f), this.LLJILLL, this.LLJJIJIIJIL);
        if (LIZLLL()) {
            fLIZ = (this.LLJJIII.right - this.LLJJIJIL.width()) - C390810FTz.LIZ(6.0f);
        } else {
            fLIZ = this.LLJJIII.left + C390810FTz.LIZ(6.0f);
        }
        canvas.drawText("10x", fLIZ, this.LLJJIII.top + C390810FTz.LIZ(9.0f) + this.LLJJIJIL.height(), this.LLJJJIL);
        canvas.drawText("1x", fLIZ, this.LLJJI + (this.LLJJIII.height() / 2.0f) + (this.LLJJJ.height() / 2), this.LLJJJIL);
        canvas.drawText("0.1x", fLIZ, (this.LLJJI + this.LLJJIII.height()) - C390810FTz.LIZ(9.0f), this.LLJJJIL);
        this.LLJILLL.reset();
        int i = 0;
        int i2 = 0;
        for (Object obj : (ArrayList) this.LLILLJJLI) {
            int i3 = i2 + 1;
            if (i2 >= 0) {
                PointF pointF = (PointF) obj;
                if (i3 < ((ArrayList) this.LLILLJJLI).size()) {
                    PointF pointF2 = (PointF) ListProtector.get(this.LLILLJJLI, i3);
                    if (pointF.y > pointF2.y) {
                        this.LLJJJJ = pointF;
                        this.LLJJJJJIL = pointF2;
                    } else {
                        this.LLJJJJ = pointF2;
                        this.LLJJJJJIL = pointF;
                    }
                    PointF pointF3 = this.LLJJJJLIIL;
                    PointF pointF4 = this.LLJJJJ;
                    float f4 = 2;
                    pointF3.set((pointF4.x + this.LLJJJJJIL.x) / f4, pointF4.y);
                    PointF pointF5 = this.LLJJL;
                    float f5 = this.LLJJJJ.x;
                    PointF pointF6 = this.LLJJJJJIL;
                    pointF5.set((f5 + pointF6.x) / f4, pointF6.y);
                    Path path = this.LLJILLL;
                    PointF pointF7 = this.LLJJJJ;
                    path.moveTo(pointF7.x, pointF7.y);
                    Path path2 = this.LLJILLL;
                    PointF pointF8 = this.LLJJJJLIIL;
                    float f6 = pointF8.x;
                    float f7 = pointF8.y;
                    PointF pointF9 = this.LLJJL;
                    float f8 = pointF9.x;
                    float f9 = pointF9.y;
                    PointF pointF10 = this.LLJJJJJIL;
                    path2.cubicTo(f6, f7, f8, f9, pointF10.x, pointF10.y);
                }
                i2 = i3;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        canvas.drawPath(this.LLJILLL, this.LLJJLIIIJLLLLLLLZ);
        Iterator it2 = ((ArrayList) this.LLILLJJLI).iterator();
        PointF pointF11 = null;
        while (true) {
            int iIntValue = -1;
            if (it2.hasNext()) {
                Object next = it2.next();
                int i4 = i + 1;
                if (i >= 0) {
                    PointF pointF12 = (PointF) next;
                    if (i != this.LLJL && i != this.LLILZLL) {
                        Paint paint = this.LLJLL;
                        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a00, getContext());
                        if (numLIZJ != null) {
                            iIntValue = numLIZJ.intValue();
                        }
                        paint.setColor(iIntValue);
                        canvas.drawCircle(pointF12.x, pointF12.y, this.LLJLILLLLZIIL, this.LLJLL);
                        this.LLJLL.setColor(-16777216);
                        canvas.drawCircle(pointF12.x, pointF12.y, this.LLJLILLLLZIIL - C390810FTz.LIZ(1.5f), this.LLJLL);
                    } else {
                        pointF11 = pointF12;
                    }
                    i = i4;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            } else {
                if (pointF11 != null) {
                    Paint paint2 = this.LLJLL;
                    Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.a00, getContext());
                    if (numLIZJ2 != null) {
                        iIntValue = numLIZJ2.intValue();
                    }
                    paint2.setColor(iIntValue);
                    canvas.drawCircle(pointF11.x, pointF11.y, this.LLJLILLLLZIIL, this.LLJLL);
                }
                float f10 = this.LLILLL;
                RectF rectF5 = this.LLJJIII;
                canvas.drawLine(f10, rectF5.top, f10, rectF5.bottom, this.LLJLLIL);
                return;
            }
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        float fWidth;
        float fWidth2;
        float fLIZ;
        float f;
        float f2;
        boolean z;
        int i = 0;
        if (motionEvent == null) {
            return false;
        }
        int action = motionEvent.getAction();
        int i2 = -1;
        if (action != 0) {
            if (action != 1) {
                if (action != 2) {
                    if (action != 3) {
                        return true;
                    }
                } else {
                    if (!this.LLIZLLLIL) {
                        double d = 2;
                        if (((float) Math.pow(motionEvent.getX() - this.LLJ.getFirst().floatValue(), d)) + ((float) Math.pow(motionEvent.getY() - this.LLJ.getSecond().floatValue(), d)) > 50.0f) {
                            z = true;
                        } else {
                            z = false;
                        }
                        this.LLIZLLLIL = z;
                        if (!z) {
                            return true;
                        }
                        Function1<? super Boolean, Unit> function1 = this.LLJILJILJ;
                        if (function1 != null) {
                            function1.invoke(Boolean.TRUE);
                        }
                    }
                    float x = motionEvent.getX();
                    RectF rectF = this.LLJJIII;
                    float fLIZ2 = C419990GdR.LIZ(x, rectF.left, rectF.right);
                    int i3 = this.LLJL;
                    if (i3 >= 0 && i3 < ((ArrayList) this.LLILLJJLI).size()) {
                        PointF pointF = (PointF) ListProtector.get(this.LLILLJJLI, this.LLJL);
                        float x2 = motionEvent.getX();
                        float y = motionEvent.getY();
                        pointF.x = Math.min(Math.max(x2, this.LLJJIII.left), this.LLJJIII.right);
                        pointF.y = Math.min(Math.max(y, this.LLJJIII.top), this.LLJJIII.bottom);
                        int i4 = this.LLJL;
                        if (i4 == 0) {
                            if (LIZLLL()) {
                                f2 = this.LLJJIII.right;
                            } else {
                                f2 = this.LLJJIII.left;
                            }
                            pointF.x = f2;
                        } else if (i4 == ((ArrayList) this.LLILLJJLI).size() - 1) {
                            if (LIZLLL()) {
                                f = this.LLJJIII.left;
                            } else {
                                f = this.LLJJIII.right;
                            }
                            pointF.x = f;
                        } else {
                            PointF pointF2 = (PointF) ListProtector.get(this.LLILLJJLI, this.LLJL - 1);
                            PointF pointF3 = (PointF) ListProtector.get(this.LLILLJJLI, this.LLJL + 1);
                            if (LIZLLL()) {
                                float f3 = pointF3.x;
                                float f4 = this.LLJLILLLLZIIL;
                                float f5 = 1;
                                fLIZ = C419990GdR.LIZ(x2, f3 + f4 + f5, (pointF2.x - f4) - f5);
                            } else {
                                float f6 = pointF2.x;
                                float f7 = this.LLJLILLLLZIIL;
                                float f8 = 1;
                                fLIZ = C419990GdR.LIZ(x2, f6 + f7 + f8, (pointF3.x - f7) - f8);
                            }
                            pointF.x = fLIZ;
                        }
                        fLIZ2 = pointF.x;
                        LJFF(false, true);
                    } else {
                        getSelectedIndexByCurrentX();
                    }
                    this.LLILLL = fLIZ2;
                    if (LIZLLL()) {
                        RectF rectF2 = this.LLJJIII;
                        fWidth2 = (rectF2.right - fLIZ2) / rectF2.width();
                    } else {
                        fWidth2 = (fLIZ2 - this.LLJJ) / this.LLJJIII.width();
                    }
                    InterfaceC1631620sYq<? super Float, ? super Integer, ? super Boolean, Unit> interfaceC1631620sYq = this.LLJILJIL;
                    if (interfaceC1631620sYq != null) {
                        interfaceC1631620sYq.invoke(Float.valueOf(fWidth2), Integer.valueOf(this.LLJL), Boolean.TRUE);
                    }
                    invalidate();
                    return true;
                }
            }
            if (this.LLJL >= 0 && this.LLIZLLLIL) {
                LJFF(true, true);
            }
            this.LLJL = -1;
            getSelectedIndexByCurrentX();
            invalidate();
            getParent().requestDisallowInterceptTouchEvent(false);
            return true;
        }
        this.LLIZLLLIL = false;
        this.LLJ = new Pair<>(Float.valueOf(motionEvent.getX()), Float.valueOf(motionEvent.getY()));
        float x3 = motionEvent.getX();
        float y2 = motionEvent.getY();
        Iterator it2 = ((ArrayList) this.LLILLJJLI).iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            int i5 = i + 1;
            if (i >= 0) {
                PointF pointF4 = (PointF) next;
                RectF rectF3 = this.LLJLIL;
                float f9 = pointF4.x;
                float f10 = this.LLJLILLLLZIIL * 1.5f;
                float f11 = pointF4.y;
                rectF3.set(f9 - f10, f11 - f10, f9 + f10, f11 + f10);
                if (this.LLJLIL.contains(x3, y2)) {
                    i2 = i;
                    break;
                }
                i = i5;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        this.LLJL = i2;
        float x4 = motionEvent.getX();
        RectF rectF4 = this.LLJJIII;
        float fLIZ3 = C419990GdR.LIZ(x4, rectF4.left, rectF4.right);
        int i6 = this.LLJL;
        if (i6 >= 0) {
            setSelectPointIndex(i6);
            fLIZ3 = ((PointF) ListProtector.get(this.LLILLJJLI, this.LLJL)).x;
        }
        this.LLILLL = fLIZ3;
        if (LIZLLL()) {
            RectF rectF5 = this.LLJJIII;
            fWidth = (rectF5.right - fLIZ3) / rectF5.width();
        } else {
            fWidth = (fLIZ3 - this.LLJJ) / this.LLJJIII.width();
        }
        InterfaceC1631620sYq<? super Float, ? super Integer, ? super Boolean, Unit> interfaceC1631620sYq2 = this.LLJILJIL;
        if (interfaceC1631620sYq2 != null) {
            interfaceC1631620sYq2.invoke(Float.valueOf(fWidth), Integer.valueOf(this.LLJL), Boolean.FALSE);
        }
        getParent().requestDisallowInterceptTouchEvent(true);
        invalidate();
        return true;
    }

    public final void setDraggingChange(Function1<? super Boolean, Unit> function1) {
        this.LLJILJILJ = function1;
    }

    public final void setEditModeChange(Function1<? super Integer, Unit> function1) {
        this.LLJI = function1;
    }

    public final void setPlayProgress(float f) {
        float f2;
        float fWidth = f * this.LLJJIII.width();
        if (LIZLLL()) {
            f2 = this.LLJJIII.right - fWidth;
        } else {
            f2 = this.LLJJ + fWidth;
        }
        this.LLILLL = f2;
        getSelectedIndexByCurrentX();
        invalidate();
    }

    public final void setPointListChange(InterfaceC1631630sYr<? super Float, ? super List<? extends PointF>, ? super Boolean, ? super Boolean, Unit> interfaceC1631630sYr) {
        this.LLJIJIL = interfaceC1631630sYr;
    }

    public final void setPoints(List<? extends PointF> list) {
        float f;
        setSelectPointIndex(0);
        if (LIZLLL()) {
            f = this.LLJJIII.right;
        } else {
            f = this.LLJJIII.left;
        }
        this.LLILLL = f;
        ((ArrayList) this.LL).clear();
        ((ArrayList) this.LL).addAll(list);
        ArrayList arrayList = (ArrayList) this.LL;
        if (arrayList.size() > 1) {
            C08XD.LJJ(arrayList, new AComparatorS24S0000000_5(42));
        }
        LIZ();
        invalidate();
    }

    public final void setProgressChange(InterfaceC1631620sYq<? super Float, ? super Integer, ? super Boolean, Unit> interfaceC1631620sYq) {
        this.LLJILJIL = interfaceC1631620sYq;
    }

    public final void setSelectPointIndex(int i) {
        this.LLILZLL = i;
        if (i != 0 && i != ((ArrayList) this.LLILLJJLI).size() - 1) {
            if (this.LLILZLL == -1) {
                if (this.LLIZ != 1) {
                    this.LLIZ = 1;
                    Function1<? super Integer, Unit> function1 = this.LLJI;
                    if (function1 != null) {
                        function1.invoke(1);
                        return;
                    }
                    return;
                }
                return;
            }
            if (this.LLIZ == 2) {
                return;
            }
            this.LLIZ = 2;
            Function1<? super Integer, Unit> function12 = this.LLJI;
            if (function12 == null) {
                return;
            }
            function12.invoke(2);
            return;
        }
        if (this.LLIZ == 3) {
            return;
        }
        this.LLIZ = 3;
        Function1<? super Integer, Unit> function13 = this.LLJI;
        if (function13 == null) {
            return;
        }
        function13.invoke(3);
    }

    public C366940Ea4(Context context, AttributeSet attributeSet) {
        int iIntValue;
        int iIntValue2;
        int iIntValue3;
        super(context, attributeSet, 0);
        this.LL = new ArrayList();
        this.LLILLJJLI = new ArrayList();
        this.LLILZ = new PointF();
        this.LLILZIL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 1268));
        this.LLIZ = -1;
        Float fValueOf = Float.valueOf(0.0f);
        this.LLJ = new Pair<>(fValueOf, fValueOf);
        this.LLJILLL = new Path();
        this.LLJJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
        this.LLJJI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10));
        this.LLJJIII = new RectF();
        Paint paint = new Paint();
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a02, getContext());
        if (numLIZJ != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = 0;
        }
        paint.setColor(iIntValue);
        paint.setStrokeWidth(C390810FTz.LIZ(1.0f));
        paint.setStyle(Paint.Style.STROKE);
        paint.setAntiAlias(true);
        this.LLJJIJI = paint;
        Paint paint2 = new Paint();
        Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.a02, getContext());
        if (numLIZJ2 != null) {
            iIntValue2 = numLIZJ2.intValue();
        } else {
            iIntValue2 = 0;
        }
        paint2.setColor(iIntValue2);
        paint2.setStrokeWidth(C390810FTz.LIZ(1.0f));
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setAntiAlias(true);
        this.LLJJIJIIJIL = paint2;
        this.LLJJIJIL = new Rect();
        this.LLJJJ = new Rect();
        Paint paint3 = new Paint();
        paint3.setTextSize(C390810FTz.LIZ(12.0f));
        Integer numLIZJ3 = C1308910kAL.LIZJ(R.attr.a1p, getContext());
        if (numLIZJ3 != null) {
            iIntValue3 = numLIZJ3.intValue();
        } else {
            iIntValue3 = 0;
        }
        paint3.setColor(iIntValue3);
        paint3.setAntiAlias(true);
        C444890HcV c444890HcV = new C444890HcV();
        c444890HcV.LIZ(71);
        paint3.setTypeface(c444890HcV.getTypeface());
        this.LLJJJIL = paint3;
        this.LLJJJJ = new PointF();
        this.LLJJJJJIL = new PointF();
        this.LLJJJJLIIL = new PointF();
        this.LLJJL = new PointF();
        Paint paint4 = new Paint();
        Integer numLIZJ4 = C1308910kAL.LIZJ(R.attr.a04, getContext());
        paint4.setColor(numLIZJ4 != null ? numLIZJ4.intValue() : 0);
        paint4.setStrokeWidth(C390810FTz.LIZ(1.0f));
        paint4.setStyle(Paint.Style.STROKE);
        paint4.setAntiAlias(true);
        this.LLJJLIIIJLLLLLLLZ = paint4;
        this.LLJL = -1;
        this.LLJLIL = new RectF();
        this.LLJLILLLLZIIL = C390810FTz.LIZ(8.0f);
        Paint paint5 = new Paint();
        paint5.setColor(-1);
        paint5.setStrokeWidth(C390810FTz.LIZ(2.0f));
        paint5.setStyle(Paint.Style.FILL_AND_STROKE);
        paint5.setAntiAlias(true);
        this.LLJLL = paint5;
        Paint paint6 = new Paint();
        paint6.setColor(-1);
        paint6.setStrokeWidth(C390810FTz.LIZ(2.0f));
        paint6.setStyle(Paint.Style.FILL_AND_STROKE);
        paint6.setAntiAlias(true);
        this.LLJLLIL = paint6;
    }

    public final void LJ(PointF pointF, PointF pointF2) {
        float fWidth;
        double dHeight;
        double d;
        if (LIZLLL()) {
            RectF rectF = this.LLJJIII;
            fWidth = (rectF.right - pointF.x) / rectF.width();
        } else {
            fWidth = (pointF.x - this.LLJJ) / this.LLJJIII.width();
        }
        double d2 = pointF.y;
        double dHeight2 = ((double) this.LLJJIII.height()) / 2.0d;
        int i = this.LLJJI;
        if (d2 >= dHeight2 + ((double) i)) {
            dHeight = (((double) (pointF.y - i)) - (((double) this.LLJJIII.height()) / 2.0d)) / (((double) this.LLJJIII.height()) / 2.0d);
            d = -0.9d;
        } else {
            dHeight = (((((double) this.LLJJIII.height()) / 2.0d) + ((double) this.LLJJI)) - ((double) pointF.y)) / (((double) this.LLJJIII.height()) / 2.0d);
            d = 9.0d;
        }
        pointF2.set(fWidth, (float) ((dHeight * d) + ((double) 1)));
    }

    public final void LJFF(boolean z, boolean z2) {
        float fWidth;
        ((ArrayList) this.LL).clear();
        for (PointF pointF : this.LLILLJJLI) {
            PointF pointF2 = new PointF();
            LJ(pointF, pointF2);
            ((ArrayList) this.LL).add(pointF2);
        }
        if (LIZLLL()) {
            RectF rectF = this.LLJJIII;
            fWidth = (rectF.right - this.LLILLL) / rectF.width();
        } else {
            fWidth = (this.LLILLL - this.LLJJ) / this.LLJJIII.width();
        }
        InterfaceC1631630sYr<? super Float, ? super List<? extends PointF>, ? super Boolean, ? super Boolean, Unit> interfaceC1631630sYr = this.LLJIJIL;
        if (interfaceC1631630sYr != null) {
            interfaceC1631630sYr.invoke(Float.valueOf(fWidth), this.LL, Boolean.valueOf(z), Boolean.valueOf(z2));
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        float f;
        super.onSizeChanged(i, i2, i3, i4);
        this.LLJJJIL.getTextBounds("10x", 0, 3, this.LLJJIJIL);
        this.LLJJJIL.getTextBounds("1x", 0, 2, this.LLJJJ);
        this.LLJJIII.set(this.LLJJ, this.LLJJI, getWidth() - this.LLJJ, getHeight() - this.LLJJI);
        if (LIZLLL()) {
            f = this.LLJJIII.right;
        } else {
            f = this.LLJJIII.left;
        }
        this.LLILLL = f;
        LIZ();
    }

    public static void LIZJ(Canvas canvas, float f, float f2, float f3, float f4, int i, float f5, Path path, Paint paint) {
        path.reset();
        float f6 = (f3 - f) / i;
        if (i >= 0) {
            int i2 = 0;
            while (true) {
                float f7 = (i2 * (f5 + f6)) + f;
                if (f7 >= f3) {
                    path.lineTo(f3, f4);
                    break;
                }
                path.moveTo(f7, f2);
                float f8 = f7 + f6;
                if (f8 > f3) {
                    f8 = f3;
                }
                path.lineTo(f8, f2);
                if (i2 == i) {
                    break;
                } else {
                    i2++;
                }
            }
        }
        canvas.drawPath(path, paint);
    }
}
