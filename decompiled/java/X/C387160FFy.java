package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0FFy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C387160FFy extends View {
    public int LL;
    public InterfaceC387170FFz LLILLJJLI;
    public int LLILLL;
    public int LLILZ;
    public int LLILZIL;
    public int LLILZLL;
    public int LLIZ;
    public TextView LLIZLLLIL;
    public int LLJ;
    public int LLJI;
    public float LLJIJIL;
    public Bitmap LLJILJIL;
    public Bitmap LLJILJILJ;
    public Bitmap LLJILLL;
    public Bitmap LLJJ;
    public int LLJJI;
    public final Paint LLJJIII;
    public final Paint LLJJIJI;
    public final List<String> LLJJIJIIJIL;
    public final List<Integer> LLJJIJIL;
    public final Rect LLJJJ;
    public final Rect LLJJJIL;

    private final int getSuggestedMinWidth() {
        String str = "";
        for (String str2 : (ArrayList) this.LLJJIJIIJIL) {
            if (str.length() < str2.length()) {
                str = str2;
            }
        }
        return (int) (((double) this.LLJJIJI.measureText(str)) + 0.5d);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (((ArrayList) this.LLJJIJIIJIL).size() == 0) {
            return;
        }
        this.LLILZLL = this.LLILZ;
        this.LLJJI = 0;
        int size = this.LLJJIJIIJIL.size();
        for (int i = 0; i < size; i++) {
            if (Intrinsics.LJFF(ListProtector.get(this.LLJJIJIIJIL, i), "Recent")) {
                this.LLJJI++;
                Rect rect = this.LLJJJ;
                int i2 = this.LLJ;
                rect.set(0, 0, i2, i2);
                if (this.LL == i) {
                    Bitmap bitmap = this.LLJILJILJ;
                    if (bitmap != null) {
                        canvas.drawBitmap(bitmap, (Rect) null, this.LLJJJ, this.LLJJIJI);
                    }
                } else {
                    Bitmap bitmap2 = this.LLJILJIL;
                    if (bitmap2 != null) {
                        canvas.drawBitmap(bitmap2, (Rect) null, this.LLJJJ, this.LLJJIJI);
                    }
                }
            } else if (Intrinsics.LJFF(ListProtector.get(this.LLJJIJIIJIL, i), "Friend")) {
                this.LLJJI++;
                Rect rect2 = this.LLJJJ;
                int i3 = this.LLJI;
                int i4 = this.LLJ;
                rect2.set(0, i3 * i, i4, (i3 * i) + i4);
                if (this.LL == i) {
                    Bitmap bitmap3 = this.LLJJ;
                    if (bitmap3 != null) {
                        canvas.drawBitmap(bitmap3, (Rect) null, this.LLJJJ, this.LLJJIJI);
                    }
                } else {
                    Bitmap bitmap4 = this.LLJILLL;
                    if (bitmap4 != null) {
                        canvas.drawBitmap(bitmap4, (Rect) null, this.LLJJJ, this.LLJJIJI);
                    }
                }
            } else {
                this.LLIZ = (this.LLILZIL - (this.LLJI * this.LLJJI)) / (((ArrayList) this.LLJJIJIIJIL).size() - this.LLJJI);
                this.LLJJIJI.getTextBounds((String) ListProtector.get(this.LLJJIJIIJIL, i), 0, ((String) ListProtector.get(this.LLJJIJIIJIL, i)).length(), this.LLJJJIL);
                float f = this.LLILZLL / 2.0f;
                int i5 = this.LLJI;
                int i6 = this.LLJJI;
                float fHeight = ((i5 * i6) + (this.LLIZ * ((i + 1) - i6))) - (this.LLJJJIL.height() / 2.0f);
                if (this.LL == i) {
                    canvas.drawText((String) ListProtector.get(this.LLJJIJIIJIL, i), f, fHeight, this.LLJJIJI);
                } else {
                    canvas.drawText((String) ListProtector.get(this.LLJJIJIIJIL, i), f, fHeight, this.LLJJIII);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x001d  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r8) {
        /*
            Method dump skipped, instruction units count: 210
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C387160FFy.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void setIndexLetterTv$mention_tag_release(TextView textView) {
        this.LLIZLLLIL = textView;
    }

    public final void setOnLetterTouchListener$mention_tag_release(InterfaceC387170FFz interfaceC387170FFz) {
        this.LLILLJJLI = interfaceC387170FFz;
    }

    public final void setRecycleViewPos$mention_tag_release(int i) {
        int size = this.LLJJIJIL.size();
        int iIntValue = 0;
        for (int i2 = 0; i2 < size; i2++) {
            iIntValue += ((Number) ListProtector.get(this.LLJJIJIL, i2)).intValue();
            if (i < iIntValue) {
                if (this.LL != i2) {
                    this.LL = i2;
                    invalidate();
                    return;
                }
                return;
            }
        }
    }

    public C387160FFy(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LL = -1;
        Paint paint = new Paint(1);
        this.LLJJIII = paint;
        Paint paint2 = new Paint(1);
        this.LLJJIJI = paint2;
        this.LLJJIJIIJIL = new ArrayList();
        this.LLJJIJIL = new ArrayList();
        this.LLJJJ = new Rect(0, 0, this.LLJ, this.LLJI);
        this.LLJJJIL = new Rect();
        Resources resources = getContext().getResources();
        Float fValueOf = Float.valueOf(11.0f);
        paint2.setTextSize(C418440Gaw.LIZIZ(fValueOf));
        paint2.setTextAlign(Paint.Align.CENTER);
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1h, getContext());
        if (numLIZJ != null) {
            paint2.setColor(numLIZJ.intValue());
        }
        paint.setTextSize(C418440Gaw.LIZIZ(fValueOf));
        paint.setTextAlign(Paint.Align.CENTER);
        Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.a1k, getContext());
        if (numLIZJ2 != null) {
            paint.setColor(numLIZJ2.intValue());
        }
        this.LLJILJIL = ((BitmapDrawable) resources.getDrawable(R.drawable.cm5)).getBitmap();
        this.LLJILJILJ = ((BitmapDrawable) resources.getDrawable(R.drawable.cm6)).getBitmap();
        this.LLJJ = ((BitmapDrawable) resources.getDrawable(R.drawable.cm8)).getBitmap();
        this.LLJILLL = ((BitmapDrawable) resources.getDrawable(R.drawable.cm7)).getBitmap();
        this.LLJIJIL = C418440Gaw.LIZIZ(Float.valueOf(2.0f));
        this.LLJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(16.0f)));
        this.LLJI = (int) (C418440Gaw.LIZIZ(Float.valueOf(16.0f)) + this.LLJIJIL);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode != 1073741824) {
            int suggestedMinWidth = getSuggestedMinWidth();
            if (mode != Integer.MIN_VALUE || suggestedMinWidth <= size) {
                size = suggestedMinWidth;
            }
        }
        this.LLILZ = size;
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode2 != 1073741824) {
            Paint.FontMetrics fontMetrics = this.LLJJIJI.getFontMetrics();
            int size3 = (int) (((ArrayList) this.LLJJIJIIJIL).size() * (fontMetrics.bottom - fontMetrics.top) * 1.2f);
            if (mode2 != Integer.MIN_VALUE || size3 <= size2) {
                size2 = size3;
            }
        }
        this.LLILZIL = size2;
        setMeasuredDimension(size, size2);
    }
}
