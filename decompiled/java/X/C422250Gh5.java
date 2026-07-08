package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PointF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.viewchecker.BitmapCrashChecker;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Gh5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C422250Gh5 extends View {
    public final List<PointF> LL;
    public Bitmap LLILLJJLI;
    public Canvas LLILLL;
    public boolean LLILZ;
    public final C0GR4 LLILZIL;
    public Function0<Unit> LLILZLL;
    public Boolean LLIZ;

    public final boolean LIZJ() {
        return this.LLILZ || (this.LL.isEmpty() ^ true);
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        Bitmap bitmap = this.LLILLJJLI;
        if (bitmap != null) {
            bitmap.recycle();
            BitmapCrashChecker.recordBitmapRecyclePoint(bitmap);
        }
        this.LLILLJJLI = null;
        this.LLILLL = null;
        super.onDetachedFromWindow();
    }

    public final boolean LIZIZ() {
        int width = getWidth();
        int height = getHeight();
        if (width <= 0 || height <= 0) {
            return false;
        }
        Bitmap bitmap = this.LLILLJJLI;
        if (bitmap != null) {
            if (!bitmap.isRecycled() && bitmap.getWidth() == width && bitmap.getHeight() == height) {
                if (this.LLILLL == null) {
                    this.LLILLL = new Canvas(bitmap);
                }
                return true;
            }
            bitmap.recycle();
            BitmapCrashChecker.recordBitmapRecyclePoint(bitmap);
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        this.LLILLJJLI = bitmapCreateBitmap;
        this.LLILLL = new Canvas(bitmapCreateBitmap);
        if (this.LLILZ) {
            this.LLILZ = false;
            LIZLLL();
        }
        return true;
    }

    public final void LIZLLL() {
        boolean zLIZJ = LIZJ();
        if (Intrinsics.LJFF(this.LLIZ, Boolean.valueOf(zLIZJ))) {
            return;
        }
        this.LLIZ = Boolean.valueOf(zLIZJ);
        Function0<Unit> function0 = this.LLILZLL;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public final Function0<Unit> getOnAutographContentChanged() {
        return this.LLILZLL;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Bitmap bitmap = this.LLILLJJLI;
        if (bitmap != null) {
            canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        }
        if (!this.LL.isEmpty()) {
            this.LLILZIL.LIZ(canvas, C421860GgS.LIZ(this.LL));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.util.ArrayList, java.util.List] */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v6 */
    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        Canvas canvas;
        ?? arrayList;
        float fAbs;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                        return true;
                    }
                } else {
                    LIZ(motionEvent.getX(), motionEvent.getY());
                    invalidate();
                    LIZLLL();
                    return true;
                }
            }
            getParent().requestDisallowInterceptTouchEvent(false);
            LIZ(motionEvent.getX(), motionEvent.getY());
            if (!((ArrayList) this.LL).isEmpty() && LIZIZ() && (canvas = this.LLILLL) != null) {
                ArrayList arrayList2 = (ArrayList) this.LL;
                if (arrayList2.size() < 3) {
                    arrayList = C13LP.LLIIII(arrayList2);
                } else {
                    arrayList = new ArrayList(arrayList2.size());
                    arrayList.add(ListProtector.get(arrayList2, 0));
                    int size = arrayList2.size() - 1;
                    int i = 1;
                    int i2 = 0;
                    while (i < size) {
                        PointF pointF = (PointF) ListProtector.get(arrayList2, i2);
                        PointF pointF2 = (PointF) ListProtector.get(arrayList2, i);
                        int i3 = i + 1;
                        PointF pointF3 = (PointF) ListProtector.get(arrayList2, i3);
                        float fLIZLLL = C13LZ.LIZLLL(1.0f - (((C422260Gh6.LIZ(pointF, pointF2) + C422260Gh6.LIZ(pointF2, pointF3)) * 0.5f) / 16.0f), 0.0f, 1.0f) * 5.0f;
                        float f = pointF3.x;
                        float f2 = pointF.x;
                        float f3 = f - f2;
                        float f4 = pointF3.y;
                        float f5 = pointF.y;
                        float f6 = f4 - f5;
                        if ((f3 * f3) + (f6 * f6) == 0.0f) {
                            fAbs = C422260Gh6.LIZ(pointF2, pointF);
                        } else {
                            fAbs = Math.abs((((pointF2.x * f6) - (pointF2.y * f3)) + (f * f5)) - (f4 * f2)) / ((float) Math.hypot(f3, f6));
                        }
                        if (fAbs > fLIZLLL) {
                            arrayList.add(pointF2);
                            i2 = i;
                        }
                        i = i3;
                    }
                    arrayList.add(C13LP.LJJLIIIJJI(arrayList2));
                    if (arrayList.size() >= 3) {
                        int i4 = 0;
                        do {
                            int size2 = arrayList.size();
                            arrayList = arrayList;
                            if (size2 >= 2) {
                                ArrayList arrayList3 = new ArrayList(arrayList.size() * 2);
                                arrayList3.add(new PointF(((PointF) ListProtector.get(arrayList, 0)).x, ((PointF) ListProtector.get(arrayList, 0)).y));
                                int size3 = arrayList.size() - 1;
                                int i5 = 0;
                                while (i5 < size3) {
                                    PointF pointF4 = (PointF) ListProtector.get(arrayList, i5);
                                    i5++;
                                    PointF pointF5 = (PointF) ListProtector.get(arrayList, i5);
                                    arrayList3.add(new PointF((pointF4.x * 0.75f) + (pointF5.x * 0.25f), (pointF4.y * 0.75f) + (pointF5.y * 0.25f)));
                                    arrayList3.add(new PointF((pointF4.x * 0.25f) + (pointF5.x * 0.75f), (pointF4.y * 0.25f) + (pointF5.y * 0.75f)));
                                }
                                arrayList3.add(new PointF(((PointF) C13LP.LJJLIIIJJI(arrayList)).x, ((PointF) C13LP.LJJLIIIJJI(arrayList)).y));
                                arrayList = arrayList3;
                            }
                            i4++;
                        } while (i4 < 3);
                    }
                }
                this.LLILZIL.LIZ(canvas, C421860GgS.LIZ(arrayList));
                z = true;
                this.LLILZ = true;
                ((ArrayList) this.LL).clear();
            } else {
                z = true;
            }
            invalidate();
            LIZLLL();
            return z;
        }
        getParent().requestDisallowInterceptTouchEvent(true);
        ((ArrayList) this.LL).clear();
        ((ArrayList) this.LL).add(new PointF(motionEvent.getX(), motionEvent.getY()));
        invalidate();
        LIZLLL();
        return true;
    }

    public final void setOnAutographContentChanged(Function0<Unit> function0) {
        this.LLILZLL = function0;
    }

    public C422250Gh5(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LL = new ArrayList();
        this.LLILZIL = new C0GR4();
    }

    public final void LIZ(float f, float f2) {
        PointF pointF = (PointF) C13LP.LJJLIIIJL(this.LL);
        if (pointF == null) {
            ((ArrayList) this.LL).add(new PointF(f, f2));
            return;
        }
        float f3 = f - pointF.x;
        float f4 = f2 - pointF.y;
        if (((float) Math.sqrt((f3 * f3) + (f4 * f4))) >= 3.0f) {
            ((ArrayList) this.LL).add(new PointF(f, f2));
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        LIZIZ();
    }
}
