package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0FFw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public class C387140FFw extends View {
    public int LL;
    public InterfaceC387150FFx LLILLJJLI;
    public final List<String> LLILLL;
    public final List<Integer> LLILZ;
    public Resources LLILZIL;
    public int LLILZLL;
    public int LLIZ;
    public int LLIZLLLIL;
    public int LLJ;
    public int LLJI;
    public TextView LLJIJIL;
    public final C444890HcV LLJILJIL;
    public final C444890HcV LLJILJILJ;
    public int LLJILLL;
    public int LLJJ;
    public float LLJJI;
    public Bitmap LLJJIII;
    public Bitmap LLJJIJI;
    public Bitmap LLJJIJIIJIL;
    public Bitmap LLJJIJIL;
    public Rect LLJJJ;
    public final Rect LLJJJIL;
    public int LLJJJJ;

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
            this.LLJJJJ = 0;
            for (int i = 0; i < ((ArrayList) this.LLILLL).size(); i++) {
                if (((String) ListProtector.get(this.LLILLL, i)).equals("recent")) {
                    this.LLJJJJ++;
                    Rect rect = this.LLJJJ;
                    if (rect != null) {
                        int i2 = this.LLJILLL;
                        rect.set(0, 0, i2, i2);
                    }
                    if (this.LL == i) {
                        canvas.drawBitmap(this.LLJJIJI, (Rect) null, this.LLJJJ, this.LLJILJILJ);
                    } else {
                        canvas.drawBitmap(this.LLJJIII, (Rect) null, this.LLJJJ, this.LLJILJILJ);
                    }
                } else if (((String) ListProtector.get(this.LLILLL, i)).equals("Friend")) {
                    this.LLJJJJ++;
                    Rect rect2 = this.LLJJJ;
                    if (rect2 != null) {
                        int i3 = this.LLJJ;
                        int i4 = this.LLJILLL;
                        rect2.set(0, i3 * i, i4, (i3 * i) + i4);
                    }
                    if (this.LL == i) {
                        canvas.drawBitmap(this.LLJJIJIL, (Rect) null, this.LLJJJ, this.LLJILJILJ);
                    } else {
                        canvas.drawBitmap(this.LLJJIJIIJIL, (Rect) null, this.LLJJJ, this.LLJILJILJ);
                    }
                } else {
                    this.LLJI = (this.LLIZLLLIL - (this.LLJJ * this.LLJJJJ)) / (((ArrayList) this.LLILLL).size() - this.LLJJJJ);
                    this.LLJILJILJ.getTextBounds((String) ListProtector.get(this.LLILLL, i), 0, ((String) ListProtector.get(this.LLILLL, i)).length(), this.LLJJJIL);
                    float f = this.LLJ / 2.0f;
                    int i5 = this.LLJJ;
                    int i6 = this.LLJJJJ;
                    float fHeight = ((i5 * i6) + (this.LLJI * ((i + 1) - i6))) - (this.LLJJJIL.height() / 2.0f);
                    if (this.LL == i) {
                        canvas.drawText((String) ListProtector.get(this.LLILLL, i), f, fHeight, this.LLJILJILJ);
                    } else {
                        canvas.drawText((String) ListProtector.get(this.LLILLL, i), f, fHeight, this.LLJILJIL);
                    }
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x001f  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r9) {
        /*
            r8 = this;
            int r3 = r9.getAction()
            android.widget.TextView r0 = r8.LLJIJIL
            r4 = 0
            if (r0 != 0) goto La
            return r4
        La:
            r1 = -1
            r5 = 8
            r2 = 1
            if (r3 == 0) goto L1f
            if (r3 == r2) goto L19
            r0 = 2
            if (r3 == r0) goto L1f
        L15:
            r8.invalidate()
            return r2
        L19:
            X.C786410Ut5.LLIL(r0, r5)
            r8.LLILZLL = r1
            goto L15
        L1f:
            float r3 = r9.getY()
            int r0 = r8.LLIZLLLIL
            int r7 = r8.LLJI
            int r0 = r0 + r7
            float r0 = (float) r0
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 <= 0) goto L35
            android.widget.TextView r0 = r8.LLJIJIL
            X.C786410Ut5.LLIL(r0, r5)
            r8.LLILZLL = r1
            return r2
        L35:
            int r1 = r8.LLJJ
            float r0 = (float) r1
            float r0 = r3 / r0
            int r0 = (int) r0
            r8.LL = r0
            int r6 = r8.LLJJJJ
            if (r0 < r6) goto L4b
            int r1 = r1 * r6
            float r0 = (float) r1
            float r1 = r3 - r0
            float r0 = (float) r7
            float r1 = r1 / r0
            int r0 = (int) r1
            int r0 = r0 + r6
            r8.LL = r0
        L4b:
            int r1 = r8.LL
            int r0 = r8.LLILZLL
            if (r1 == r0) goto L8c
            X.0FFx r0 = r8.LLILLJJLI
            if (r0 == 0) goto L8c
            if (r1 < 0) goto L8c
            java.util.List<java.lang.String> r0 = r8.LLILLL
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            int r0 = r0.size()
            if (r1 >= r0) goto L8c
            java.util.List<java.lang.String> r1 = r8.LLILLL
            int r0 = r8.LL
            java.lang.Object r1 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r1, r0)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r0 = "recent"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto Lbb
            java.lang.String r0 = "Friend"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto Lbb
            android.widget.TextView r0 = r8.LLJIJIL
            r0.setText(r1)
            android.widget.TextView r0 = r8.LLJIJIL
            X.C786410Ut5.LLIL(r0, r4)
        L85:
            X.0FFx r1 = r8.LLILLJJLI
            int r0 = r8.LL
            r1.LIZ(r0)
        L8c:
            android.widget.TextView r0 = r8.LLJIJIL
            int r0 = r0.getTop()
            float r0 = (float) r0
            float r3 = r3 + r0
            android.widget.TextView r0 = r8.LLJIJIL
            int r0 = r0.getHeight()
            float r0 = (float) r0
            r1 = 1073741824(0x40000000, float:2.0)
            float r0 = r0 / r1
            float r3 = r3 + r0
            int r0 = r8.getTop()
            float r0 = (float) r0
            float r3 = r3 - r0
            int r0 = r8.LLIZLLLIL
            float r0 = (float) r0
            float r3 = r3 - r0
            int r0 = r8.LLJI
            float r0 = (float) r0
            float r0 = r0 / r1
            float r3 = r3 + r0
            int r0 = (int) r3
            android.widget.TextView r1 = r8.LLJIJIL
            float r0 = (float) r0
            X.C786410Ut5.cd(r0, r1)
            int r0 = r8.LL
            r8.LLILZLL = r0
            goto L15
        Lbb:
            android.widget.TextView r0 = r8.LLJIJIL
            X.C786410Ut5.LLIL(r0, r5)
            goto L85
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C387140FFw.onTouchEvent(android.view.MotionEvent):boolean");
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

    public void setIndexLetters(List<String> list) {
        ((ArrayList) this.LLILLL).clear();
        ((ArrayList) this.LLILLL).addAll(list);
        requestLayout();
    }

    public void setOnLetterTouchListener(InterfaceC387150FFx interfaceC387150FFx) {
        this.LLILLJJLI = interfaceC387150FFx;
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

    public void setCurrentIndex(int i) {
        this.LL = i;
        invalidate();
    }

    public C387140FFw(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LL = -1;
        this.LLILLL = new ArrayList();
        this.LLILZ = new ArrayList();
        C444890HcV c444890HcV = new C444890HcV();
        this.LLJILJIL = c444890HcV;
        C444890HcV c444890HcV2 = new C444890HcV();
        this.LLJILJILJ = c444890HcV2;
        this.LLJJJIL = new Rect();
        this.LLJJJJ = 0;
        this.LLILZIL = context.getResources();
        c444890HcV2.LIZ(81);
        c444890HcV2.setTextAlign(Paint.Align.CENTER);
        c444890HcV2.setColor(C1308910kAL.LIZJ(R.attr.a1h, context).intValue());
        c444890HcV2.LIZ(81);
        c444890HcV.setTextAlign(Paint.Align.CENTER);
        c444890HcV.setColor(C1308910kAL.LIZJ(R.attr.a1p, context).intValue());
        this.LLJJIII = ((BitmapDrawable) this.LLILZIL.getDrawable(R.drawable.cbf)).getBitmap();
        this.LLJJIJI = ((BitmapDrawable) this.LLILZIL.getDrawable(R.drawable.cbe)).getBitmap();
        this.LLJJIJIIJIL = ((BitmapDrawable) this.LLILZIL.getDrawable(R.drawable.cc0)).getBitmap();
        this.LLJJIJIL = ((BitmapDrawable) this.LLILZIL.getDrawable(R.drawable.cbz)).getBitmap();
        this.LLJJI = C12ES.LIZJ(2.0f, context);
        this.LLJILLL = (int) C12ES.LIZJ(16.0f, context);
        this.LLJJ = (int) (C12ES.LIZJ(16.0f, context) + this.LLJJI);
        int i = this.LLJILLL;
        this.LLJJJ = new Rect(0, 0, i, i);
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
