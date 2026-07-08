package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0FG1, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public class C0FG1 extends View {
    public int LL;
    public C0FG2 LLILLJJLI;
    public final List<String> LLILLL;
    public final List<Integer> LLILZ;
    public Resources LLILZIL;
    public int LLILZLL;
    public int LLIZ;
    public int LLIZLLLIL;
    public int LLJ;
    public int LLJI;
    public TextView LLJIJIL;
    public Paint LLJILJIL;
    public Paint LLJILJILJ;
    public int LLJILLL;
    public int LLJJ;
    public float LLJJI;
    public Rect LLJJIII;

    private int getSuggestedMinWidth() {
        String str = "";
        for (String str2 : (ArrayList) this.LLILLL) {
            if (str.length() < str2.length()) {
                str = str2;
            }
        }
        return (int) (((double) this.LLJILJILJ.measureText(str)) + 0.5d);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        List<String> list = this.LLILLL;
        if (list != null && ((ArrayList) list).size() != 0) {
            this.LLJ = this.LLIZ;
            int i = 0;
            while (i < ((ArrayList) this.LLILLL).size()) {
                this.LLJI = (this.LLIZLLLIL - 0) / ((ArrayList) this.LLILLL).size();
                this.LLJILJILJ.getTextBounds((String) ListProtector.get(this.LLILLL, i), 0, ((String) ListProtector.get(this.LLILLL, i)).length(), this.LLJJIII);
                float f = this.LLJ / 2.0f;
                int i2 = i + 1;
                float fHeight = ((this.LLJI * i2) + 0) - (this.LLJJIII.height() / 2.0f);
                if (this.LL == i) {
                    canvas.drawText((String) ListProtector.get(this.LLILLL, i), f, fHeight, this.LLJILJILJ);
                } else {
                    canvas.drawText((String) ListProtector.get(this.LLILLL, i), f, fHeight, this.LLJILJIL);
                }
                i = i2;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001b  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r8) {
        /*
            r7 = this;
            int r3 = r8.getAction()
            r1 = -1
            r6 = 8
            r2 = 1
            if (r3 == 0) goto L1b
            if (r3 == r2) goto L13
            r0 = 2
            if (r3 == r0) goto L1b
        Lf:
            r7.invalidate()
            return r2
        L13:
            android.widget.TextView r0 = r7.LLJIJIL
            X.C786410Ut5.LLIL(r0, r6)
            r7.LLILZLL = r1
            goto Lf
        L1b:
            float r3 = r8.getY()
            int r0 = r7.LLIZLLLIL
            int r4 = r7.LLJI
            int r0 = r0 + r4
            float r0 = (float) r0
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 <= 0) goto L31
            android.widget.TextView r0 = r7.LLJIJIL
            X.C786410Ut5.LLIL(r0, r6)
            r7.LLILZLL = r1
            return r2
        L31:
            int r0 = r7.LLJJ
            float r0 = (float) r0
            float r0 = r3 / r0
            int r0 = (int) r0
            r7.LL = r0
            r5 = 0
            if (r0 < 0) goto L44
            float r0 = (float) r5
            float r1 = r3 - r0
            float r0 = (float) r4
            float r1 = r1 / r0
            int r0 = (int) r1
            r7.LL = r0
        L44:
            int r1 = r7.LL
            int r0 = r7.LLILZLL
            if (r1 == r0) goto L85
            X.0FG2 r0 = r7.LLILLJJLI
            if (r0 == 0) goto L85
            if (r1 < 0) goto L85
            java.util.List<java.lang.String> r0 = r7.LLILLL
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            int r0 = r0.size()
            if (r1 >= r0) goto L85
            java.util.List<java.lang.String> r1 = r7.LLILLL
            int r0 = r7.LL
            java.lang.Object r4 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r1, r0)
            java.lang.String r4 = (java.lang.String) r4
            X.0FG2 r1 = r7.LLILLJJLI
            int r0 = r7.LL
            r1.LIZ(r0)
            java.lang.String r0 = "Recent"
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto Lb4
            java.lang.String r0 = "Friend"
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto Lb4
            android.widget.TextView r0 = r7.LLJIJIL
            r0.setText(r4)
            android.widget.TextView r0 = r7.LLJIJIL
            X.C786410Ut5.LLIL(r0, r5)
        L85:
            android.widget.TextView r0 = r7.LLJIJIL
            int r0 = r0.getTop()
            float r0 = (float) r0
            float r3 = r3 + r0
            android.widget.TextView r0 = r7.LLJIJIL
            int r0 = r0.getHeight()
            float r0 = (float) r0
            r1 = 1073741824(0x40000000, float:2.0)
            float r0 = r0 / r1
            float r3 = r3 + r0
            int r0 = r7.getTop()
            float r0 = (float) r0
            float r3 = r3 - r0
            int r0 = r7.LLIZLLLIL
            float r0 = (float) r0
            float r3 = r3 - r0
            int r0 = r7.LLJI
            float r0 = (float) r0
            float r0 = r0 / r1
            float r3 = r3 + r0
            int r0 = (int) r3
            android.widget.TextView r1 = r7.LLJIJIL
            float r0 = (float) r0
            X.C786410Ut5.cd(r0, r1)
            int r0 = r7.LL
            r7.LLILZLL = r0
            goto Lf
        Lb4:
            android.widget.TextView r0 = r7.LLJIJIL
            X.C786410Ut5.LLIL(r0, r6)
            goto L85
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0FG1.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setCurrentIndex(String str) {
        int i = 0;
        while (true) {
            if (i >= ((ArrayList) this.LLILLL).size()) {
                break;
            }
            if (TextUtils.equals(str, (CharSequence) ListProtector.get(this.LLILLL, i))) {
                this.LL = i;
                break;
            }
            i++;
        }
        invalidate();
    }

    public void setIndexLetterTv(TextView textView) {
        this.LLJIJIL = textView;
    }

    public void setOnLetterTouchListener(C0FG2 c0fg2) {
        this.LLILLJJLI = c0fg2;
    }

    public void setRecycleViewPos(int i) {
        int iIntValue = 0;
        for (int i2 = 0; i2 < ((ArrayList) this.LLILZ).size(); i2++) {
            iIntValue += ((Integer) ListProtector.get(this.LLILZ, i2)).intValue();
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

    public C0FG1(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LL = -1;
        this.LLILLL = new ArrayList();
        this.LLILZ = new ArrayList();
        this.LLILZIL = context.getResources();
        Paint paint = new Paint(1);
        this.LLJILJILJ = paint;
        paint.setTextSize(C12ES.LIZJ(11.0f, context));
        this.LLJILJILJ.setTextAlign(Paint.Align.CENTER);
        this.LLJILJILJ.setColor(this.LLILZIL.getColor(R.color.da));
        Paint paint2 = new Paint(1);
        this.LLJILJIL = paint2;
        paint2.setTextSize(C12ES.LIZJ(11.0f, context));
        this.LLJILJIL.setTextAlign(Paint.Align.CENTER);
        this.LLJILJIL.setColor(this.LLILZIL.getColor(R.color.dj));
        this.LLJJI = C12ES.LIZJ(2.0f, context);
        this.LLJILLL = (int) C12ES.LIZJ(16.0f, context);
        this.LLJJ = (int) (C12ES.LIZJ(16.0f, context) + this.LLJJI);
        new Rect(0, 0, this.LLJILLL, this.LLJJ);
        this.LLJJIII = new Rect();
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode != 1073741824) {
            int suggestedMinWidth = getSuggestedMinWidth();
            if (mode == Integer.MIN_VALUE) {
                size = Math.min(suggestedMinWidth, size);
            } else {
                size = suggestedMinWidth;
            }
        }
        this.LLIZ = size;
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode2 != 1073741824) {
            Paint.FontMetrics fontMetrics = this.LLJILJILJ.getFontMetrics();
            int size3 = (int) (((ArrayList) this.LLILLL).size() * (fontMetrics.bottom - fontMetrics.top) * 1.2f);
            if (mode2 == Integer.MIN_VALUE) {
                size2 = Math.min(size3, size2);
            } else {
                size2 = size3;
            }
        }
        this.LLIZLLLIL = size2;
        setMeasuredDimension(size, size2);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
    }
}
