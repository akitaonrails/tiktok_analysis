package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.SizeF;
import android.view.View;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS407S0200000_6;

/* JADX INFO: renamed from: X.0Gnc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C426300Gnc extends View {
    public final List<C426310Gnd> LL;
    public final Map<String, Bitmap> LLILLJJLI;
    public SizeF LLILLL;
    public float LLILZ;
    public final float LLILZIL;
    public final Paint LLILZLL;
    public final C01GW LLIZ;
    public final RectF LLIZLLLIL;
    public final Paint LLJ;
    public final Path LLJI;
    public final Rect LLJIJIL;

    private final C19751612Pq getShadowDrawable() {
        return (C19751612Pq) this.LLIZ.getValue();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float f;
        float fLIZIZ;
        float f2;
        float f3;
        float f4;
        super.onDraw(canvas);
        int i = 0;
        if (((ArrayList) this.LL).isEmpty()) {
            f = 0.0f;
        } else {
            float size = ((ArrayList) this.LL).size() * this.LLILLL.getWidth();
            int size2 = ((ArrayList) this.LL).size() - 1;
            if (size2 < 0) {
                size2 = 0;
            }
            f = size + (size2 * this.LLILZ);
        }
        float paddingLeft = getPaddingLeft() + ((((getWidth() - getPaddingLeft()) - getPaddingRight()) - f) / 2.0f);
        float height = (getHeight() - getPaddingBottom()) - this.LLILLL.getHeight();
        for (C426310Gnd c426310Gnd : this.LL) {
            int i2 = i + 1;
            if (i >= 0) {
                C426310Gnd c426310Gnd2 = c426310Gnd;
                Bitmap bitmap = (Bitmap) ((LinkedHashMap) this.LLILLJJLI).get(c426310Gnd2.LIZ);
                if (bitmap != null) {
                    if (((ArrayList) this.LL).size() == 3 && i == 1) {
                        fLIZIZ = height - C418440Gaw.LIZIZ(4);
                    } else {
                        fLIZIZ = height;
                    }
                    this.LLIZLLLIL.set(paddingLeft, fLIZIZ, this.LLILLL.getWidth() + paddingLeft, this.LLILLL.getHeight() + fLIZIZ);
                    canvas.save();
                    canvas.rotate(c426310Gnd2.LIZIZ, this.LLIZLLLIL.centerX(), this.LLIZLLLIL.centerY());
                    C19751612Pq shadowDrawable = getShadowDrawable();
                    RectF rectF = this.LLIZLLLIL;
                    shadowDrawable.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
                    getShadowDrawable().draw(canvas);
                    this.LLJI.reset();
                    Path path = this.LLJI;
                    RectF rectF2 = this.LLIZLLLIL;
                    float f5 = this.LLILZIL;
                    path.addRoundRect(rectF2, f5, f5, Path.Direction.CW);
                    canvas.save();
                    canvas.clipPath(this.LLJI);
                    float width = bitmap.getWidth();
                    float height2 = bitmap.getHeight();
                    float fWidth = this.LLIZLLLIL.width() / this.LLIZLLLIL.height();
                    if (width / height2 > fWidth) {
                        f3 = fWidth * height2;
                        f4 = (width - f3) / 2;
                        f2 = 0.0f;
                    } else {
                        float f6 = width / fWidth;
                        f2 = (height2 - f6) / 2;
                        height2 = f6;
                        f3 = width;
                        f4 = 0.0f;
                    }
                    this.LLJIJIL.set((int) f4, (int) f2, (int) (f4 + f3), (int) (f2 + height2));
                    canvas.drawBitmap(bitmap, this.LLJIJIL, this.LLIZLLLIL, this.LLJ);
                    canvas.restore();
                    RectF rectF3 = new RectF(this.LLIZLLLIL);
                    float strokeWidth = this.LLILZLL.getStrokeWidth() / 2;
                    rectF3.inset(strokeWidth, strokeWidth);
                    float f7 = this.LLILZIL;
                    canvas.drawRoundRect(rectF3, f7 - strokeWidth, f7 - strokeWidth, this.LLILZLL);
                    canvas.restore();
                    paddingLeft += this.LLILLL.getWidth() + this.LLILZ;
                }
                i = i2;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
    }

    public final void setImageRotations(List<Float> list) {
        int i = 0;
        for (Float f : list) {
            int i2 = i + 1;
            if (i >= 0) {
                float fFloatValue = f.floatValue();
                if (i < this.LL.size()) {
                    List<C426310Gnd> list2 = this.LL;
                    C426310Gnd c426310Gnd = (C426310Gnd) ListProtector.get(list2, i);
                    String str = c426310Gnd.LIZ;
                    c426310Gnd.getClass();
                    ListProtector.set(list2, i, new C426310Gnd(str, fFloatValue));
                }
                i = i2;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        requestLayout();
        invalidate();
    }

    public final void setImageSize(SizeF sizeF) {
        this.LLILLL = sizeF;
        invalidate();
    }

    public final void setImageSpacing(float f) {
        this.LLILZ = f;
        invalidate();
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0074 A[LOOP:1: B:18:0x006e->B:20:0x0074, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void setImageUrls(java.util.List<java.lang.String> r10) {
        /*
            Method dump skipped, instruction units count: 207
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C426300Gnc.setImageUrls(java.util.List):void");
    }

    public C426300Gnc(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LL = new ArrayList();
        this.LLILLJJLI = new LinkedHashMap();
        this.LLILLL = new SizeF(C418440Gaw.LIZIZ(48), C418440Gaw.LIZIZ(48));
        this.LLILZ = -C418440Gaw.LIZIZ(12);
        this.LLILZIL = C418440Gaw.LIZIZ(12);
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(-1);
        paint.setStrokeWidth(C418440Gaw.LIZIZ(2));
        this.LLILZLL = paint;
        this.LLIZ = C452501pT.LIZIZ(new AwS407S0200000_6(context, this, 135));
        this.LLIZLLLIL = new RectF();
        this.LLJ = new Paint(1);
        this.LLJI = new Path();
        this.LLJIJIL = new Rect();
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        float width;
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        float fFloatValue = 0.0f;
        if (mode != 1073741824) {
            if (((ArrayList) this.LL).isEmpty()) {
                width = 0.0f;
            } else {
                int i3 = 0;
                width = 0.0f;
                for (Object obj : (ArrayList) this.LL) {
                    int i4 = i3 + 1;
                    if (i3 >= 0) {
                        width += LIZ(this.LLILLL.getWidth(), this.LLILLL.getHeight(), ((C426310Gnd) obj).LIZIZ).getWidth();
                        if (i3 < ((ArrayList) this.LL).size() - 1) {
                            width += this.LLILZ;
                        }
                        i3 = i4;
                    } else {
                        C1697810uHb.LJIJI();
                        throw null;
                    }
                }
            }
            int paddingLeft = (int) (getPaddingLeft() + getPaddingRight() + width);
            if (mode == Integer.MIN_VALUE) {
                size = Math.min(paddingLeft, size);
            } else {
                size = paddingLeft;
            }
        }
        if (mode2 != 1073741824) {
            if (!((ArrayList) this.LL).isEmpty()) {
                Iterator it2 = ((ArrayList) this.LL).iterator();
                if (it2.hasNext()) {
                    float height = LIZ(this.LLILLL.getWidth(), this.LLILLL.getHeight(), ((C426310Gnd) it2.next()).LIZIZ).getHeight();
                    while (it2.hasNext()) {
                        height = Math.max(height, LIZ(this.LLILLL.getWidth(), this.LLILLL.getHeight(), ((C426310Gnd) it2.next()).LIZIZ).getHeight());
                    }
                    Float fValueOf = Float.valueOf(height);
                    if (fValueOf != null) {
                        fFloatValue = fValueOf.floatValue();
                    }
                }
            }
            int paddingTop = (int) (getPaddingTop() + getPaddingBottom() + fFloatValue);
            if (mode2 == Integer.MIN_VALUE) {
                size2 = Math.min(paddingTop, size2);
            } else {
                size2 = paddingTop;
            }
        }
        setMeasuredDimension(size, size2);
    }

    public static SizeF LIZ(float f, float f2, float f3) {
        double d = (((double) f3) * 3.141592653589793d) / 180.0d;
        float fAbs = Math.abs((float) Math.cos(d));
        float fAbs2 = Math.abs((float) Math.sin(d));
        return new SizeF((f * fAbs) + (f2 * fAbs2), (f * fAbs2) + (f2 * fAbs));
    }
}
