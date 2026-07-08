package X;

import android.content.Context;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0GqJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C427970GqJ extends LinearLayout {
    public final TuxTextView LL;
    public final TuxTextView LLILLJJLI;
    public final FrameLayout LLILLL;
    public final View LLILZ;
    public String LLILZIL;
    public String LLILZLL;
    public float LLIZ;
    public final float LLIZLLLIL;
    public final float LLJ;
    public final float LLJI;
    public final float LLJIJIL;

    private final void setProgressBarWidth(float f) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.LLILLL.getLayoutParams();
        layoutParams.width = (int) f;
        layoutParams.weight = 0.0f;
        C786410Ut5.a6(this.LLILLL, layoutParams);
        int i = (int) (f * this.LLIZ);
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.LLILZ.getLayoutParams();
        layoutParams2.width = i;
        C786410Ut5.W5(this.LLILZ, layoutParams2);
    }

    public final void setStyle(C427980GqK c427980GqK) {
        int i = c427980GqK.LIZ;
        this.LL.setTextColorRes(i);
        this.LLILLJJLI.setTextColorRes(i);
        int i2 = c427980GqK.LIZIZ;
        this.LL.setTuxFont(i2);
        this.LLILLJJLI.setTuxFont(i2);
        requestLayout();
    }

    public C427970GqJ(int i, Context context) {
        super(context, null, 0);
        this.LLILZIL = "Surprise set ";
        this.LLILZLL = "";
        this.LLIZLLLIL = C0H9H.LIZ(150);
        this.LLJ = C0H9H.LIZ(80);
        float f = 4;
        this.LLJI = C0H9H.LIZ(f);
        this.LLJIJIL = C0H9H.LIZ(f);
        LayoutInflater layoutInflaterCloneInContext = C786410Ut5.ne(context).cloneInContext(new ContextThemeWrapper(context, i));
        if (layoutInflaterCloneInContext != null) {
            C786410Ut5.Sd(R.layout.bxs, layoutInflaterCloneInContext, this);
        }
        this.LL = (TuxTextView) findViewById(R.id.fo5);
        this.LLILLJJLI = (TuxTextView) findViewById(R.id.ssc);
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.w8b);
        this.LLILLL = frameLayout;
        View viewFindViewById = findViewById(R.id.s8j);
        this.LLILZ = viewFindViewById;
        C384050F3z c384050F3z = new C384050F3z();
        float f2 = 3;
        c384050F3z.LIZJ = Float.valueOf(C0H9H.LIZ(f2));
        c384050F3z.LIZIZ = Integer.valueOf(R.attr.a02);
        frameLayout.setBackground(c384050F3z.LIZ(context));
        C384050F3z c384050F3z2 = new C384050F3z();
        c384050F3z2.LIZJ = Float.valueOf(C0H9H.LIZ(f2));
        c384050F3z2.LIZIZ = Integer.valueOf(R.attr.ma);
        viewFindViewById.setBackground(c384050F3z2.LIZ(context));
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        if (this.LLIZ < 0.0f) {
            C03DZ.LIZ(this.LLILLL);
            this.LL.setText(this.LLILZIL);
            this.LLILLJJLI.setText(this.LLILZLL);
            super.onMeasure(i, i2);
            return;
        }
        int size = View.MeasureSpec.getSize(i);
        this.LLILLJJLI.setText(this.LLILZLL);
        this.LLILLJJLI.measure(0, i2);
        float measuredWidth = this.LLILLJJLI.getMeasuredWidth() + this.LLJIJIL;
        this.LL.setText(this.LLILZIL);
        this.LL.measure(0, i2);
        float f = size;
        float measuredWidth2 = (f - (this.LL.getMeasuredWidth() + measuredWidth)) - this.LLJI;
        float f2 = this.LLIZLLLIL;
        if (measuredWidth2 >= f2) {
            setProgressBarWidth(f2);
            C786410Ut5.LJZ(0, this.LLILLL);
            this.LL.setText(this.LLILZIL);
            this.LLILLJJLI.setText(this.LLILZLL);
        } else if (measuredWidth2 >= this.LLJ) {
            setProgressBarWidth(measuredWidth2);
            C786410Ut5.LJZ(0, this.LLILLL);
            this.LL.setText(this.LLILZIL);
            this.LLILLJJLI.setText(this.LLILZLL);
        } else if (measuredWidth2 > 0.0f) {
            C786410Ut5.LJZ(8, this.LLILLL);
            this.LL.setText(this.LLILZIL);
            this.LLILLJJLI.setText(this.LLILZLL);
        } else {
            C786410Ut5.LJZ(8, this.LLILLL);
            float f3 = f - measuredWidth;
            if (f3 > 0.0f) {
                this.LL.setMaxWidth((int) f3);
                this.LL.setText(this.LLILZIL);
                this.LLILLJJLI.setText(this.LLILZLL);
            } else {
                this.LL.setText("");
                this.LLILLJJLI.setText(this.LLILZLL);
            }
        }
        super.onMeasure(i, i2);
    }
}
