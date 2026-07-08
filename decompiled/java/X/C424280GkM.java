package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.model.DataPoint;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0GkM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C424280GkM extends View implements InterfaceC424310GkP {
    public final Path LL;
    public final List<DataPoint> LLILLJJLI;
    public final List<DataPoint> LLILLL;
    public final int LLILZ;
    public final Paint LLILZIL;
    public final Paint LLILZLL;
    public final Paint LLIZ;
    public final int LLIZLLLIL;
    public final int LLJ;
    public final Canvas LLJI;
    public Bitmap LLJIJIL;
    public DataPoint LLJILJIL;
    public InterfaceC424290GkN LLJILJILJ;

    public C424280GkM(Context context) {
        int iIntValue;
        int iIntValue2;
        super(context);
        this.LL = new Path();
        this.LLILLJJLI = new ArrayList();
        this.LLILLL = new ArrayList();
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a09, getContext());
        if (numLIZJ != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = 0;
        }
        this.LLILZ = iIntValue;
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.FILL);
        Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.a0d, getContext());
        if (numLIZJ2 != null) {
            iIntValue2 = numLIZJ2.intValue();
        } else {
            iIntValue2 = 0;
        }
        paint.setColor(iIntValue2);
        this.LLILZIL = paint;
        Paint paint2 = new Paint();
        paint2.setStyle(Paint.Style.FILL);
        Integer numLIZJ3 = C1308910kAL.LIZJ(R.attr.ee, getContext());
        paint2.setColor(numLIZJ3 != null ? numLIZJ3.intValue() : 0);
        this.LLILZLL = paint2;
        Paint paint3 = new Paint();
        paint3.setStyle(Paint.Style.STROKE);
        paint3.setPathEffect(new DashPathEffect(new float[]{20.0f, 5.0f}, 0.0f));
        paint3.setColor(iIntValue);
        this.LLIZ = paint3;
        this.LLIZLLLIL = Resources.getSystem().getDisplayMetrics().widthPixels;
        this.LLJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
        this.LLJI = new Canvas();
    }

    public static float LIZJ(DataPoint dataPoint) {
        double d = 2;
        return (float) Math.sqrt(((float) Math.pow(dataPoint.x, d)) + ((float) Math.pow(dataPoint.y, d)));
    }

    @Override // X.InterfaceC424310GkP
    public final void LIZ(int i) {
        float f = i * 1000.0f;
        Iterator it2 = ((ArrayList) this.LLILLJJLI).iterator();
        int i2 = 0;
        while (it2.hasNext()) {
            if (((DataPoint) it2.next()).x == f) {
                if (i2 >= 0 && i2 < ((ArrayList) this.LLILLL).size()) {
                    DataPoint dataPoint = (DataPoint) ListProtector.get(this.LLILLL, i2);
                    Canvas canvas = this.LLJI;
                    canvas.drawColor(0, PorterDuff.Mode.MULTIPLY);
                    this.LLJILJIL = dataPoint;
                    canvas.drawCircle(dataPoint.x, dataPoint.y, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)), this.LLILZLL);
                    canvas.drawCircle(dataPoint.x, dataPoint.y, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)), this.LLILZIL);
                    canvas.drawLine(dataPoint.x, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)) + dataPoint.y, dataPoint.x, getMeasuredHeight() - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)), this.LLIZ);
                    return;
                }
                return;
            }
            i2++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x02d6  */
    /* JADX WARN: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onDraw(android.graphics.Canvas r25) {
        /*
            Method dump skipped, instruction units count: 734
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C424280GkM.onDraw(android.graphics.Canvas):void");
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        Object next;
        float f;
        float f2;
        if (motionEvent == null) {
            return false;
        }
        Iterator it2 = ((ArrayList) this.LLILLL).iterator();
        if (!it2.hasNext()) {
            next = null;
        } else {
            next = it2.next();
            if (it2.hasNext()) {
                DataPoint dataPoint = (DataPoint) next;
                if (getLayoutDirection() == 1) {
                    f = this.LLIZLLLIL - dataPoint.x;
                } else {
                    f = dataPoint.x;
                }
                float fAbs = Math.abs(motionEvent.getX() - f);
                do {
                    Object next2 = it2.next();
                    DataPoint dataPoint2 = (DataPoint) next2;
                    if (getLayoutDirection() == 1) {
                        f2 = this.LLIZLLLIL - dataPoint2.x;
                    } else {
                        f2 = dataPoint2.x;
                    }
                    float fAbs2 = Math.abs(motionEvent.getX() - f2);
                    if (Float.compare(fAbs, fAbs2) > 0) {
                        next = next2;
                        fAbs = fAbs2;
                    }
                } while (it2.hasNext());
            }
        }
        int iIndexOf = ((ArrayList) this.LLILLL).indexOf(next);
        if (iIndexOf < 0 || iIndexOf >= ((ArrayList) this.LLILLJJLI).size()) {
            return false;
        }
        float f3 = ((DataPoint) ListProtector.get(this.LLILLJJLI, iIndexOf)).x / 1000.0f;
        if (next != null && !Intrinsics.LJFF(this.LLJILJIL, next)) {
            InterfaceC424290GkN interfaceC424290GkN = this.LLJILJILJ;
            if (interfaceC424290GkN != null) {
                interfaceC424290GkN.LIZJ(f3, ((DataPoint) ListProtector.get(this.LLILLJJLI, iIndexOf)).y);
            }
            LIZ((int) f3);
        }
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action == 1 || action == 3) {
                getParent().requestDisallowInterceptTouchEvent(false);
                InterfaceC424290GkN interfaceC424290GkN2 = this.LLJILJILJ;
                if (interfaceC424290GkN2 != null) {
                    interfaceC424290GkN2.LIZ(f3);
                    return true;
                }
            }
        } else {
            getParent().requestDisallowInterceptTouchEvent(true);
            InterfaceC424290GkN interfaceC424290GkN3 = this.LLJILJILJ;
            if (interfaceC424290GkN3 != null) {
                interfaceC424290GkN3.LIZIZ();
                return true;
            }
        }
        return true;
    }

    @Override // X.InterfaceC424310GkP
    public void setOnPointSelectedListener(InterfaceC424290GkN interfaceC424290GkN) {
        this.LLJILJILJ = interfaceC424290GkN;
    }

    @Override // X.InterfaceC424310GkP
    public void setPoints(List<DataPoint> list) {
        ((ArrayList) this.LLILLJJLI).clear();
        ((ArrayList) this.LLILLJJLI).addAll(list);
        ((ArrayList) this.LLILLL).clear();
        if (!((ArrayList) this.LLILLJJLI).isEmpty()) {
            float f = this.LLIZLLLIL;
            float f2 = 0.6f * f;
            float size = f / (((ArrayList) this.LLILLJJLI).size() - 1);
            Iterator it2 = ((ArrayList) this.LLILLJJLI).iterator();
            if (it2.hasNext()) {
                Object next = it2.next();
                if (it2.hasNext()) {
                    float f3 = ((DataPoint) next).y;
                    do {
                        Object next2 = it2.next();
                        float f4 = ((DataPoint) next2).y;
                        if (Float.compare(f3, f4) < 0) {
                            next = next2;
                            f3 = f4;
                        }
                    } while (it2.hasNext());
                }
                float f5 = ((DataPoint) next).y;
                if (f5 != 0.0f) {
                    int size2 = ((ArrayList) this.LLILLJJLI).size();
                    for (int i = 0; i < size2; i++) {
                        ((ArrayList) this.LLILLL).add(new DataPoint(i * size, (f2 - ((((DataPoint) ListProtector.get(this.LLILLJJLI, i)).y / f5) * f2)) + this.LLJ));
                    }
                }
            } else {
                throw new NoSuchElementException();
            }
        }
        invalidate();
    }

    public static DataPoint LIZIZ(DataPoint dataPoint, DataPoint dataPoint2) {
        return new DataPoint(dataPoint.x - dataPoint2.x, dataPoint.y - dataPoint2.y);
    }

    public static DataPoint LIZLLL(DataPoint dataPoint, float f) {
        return new DataPoint(dataPoint.x * f, dataPoint.y * f);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int i3 = this.LLIZLLLIL;
        setMeasuredDimension(i3, (int) ((((double) i3) * 0.6d) + ((double) (this.LLJ * 2))));
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (this.LLJIJIL == null) {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
            this.LLJIJIL = bitmapCreateBitmap;
            this.LLJI.setBitmap(bitmapCreateBitmap);
        }
    }
}
