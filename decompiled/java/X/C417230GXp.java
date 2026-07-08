package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0GXp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C417230GXp extends TuxTextView {
    public final float LLJJJJ;
    public Integer LLJJJJJIL;
    public boolean LLJJJJLIIL;
    public boolean LLJJL;

    @Override // android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        Integer num;
        if (this.LLJJJJLIIL && (num = this.LLJJJJJIL) != null) {
            int iIntValue = num.intValue();
            ColorStateList textColors = getTextColors();
            getPaint().setStyle(Paint.Style.STROKE);
            getPaint().setStrokeJoin(Paint.Join.ROUND);
            getPaint().setStrokeWidth(this.LLJJJJ);
            setTextColor(iIntValue);
            super.onDraw(canvas);
            setTextColor(textColors);
            getPaint().setStrokeWidth(0.0f);
            getPaint().setStyle(Paint.Style.FILL);
            super.onDraw(canvas);
            return;
        }
        super.onDraw(canvas);
    }

    public final void setNeedStroke(boolean z) {
        this.LLJJJJLIIL = z;
        if (z && !this.LLJJL) {
            this.LLJJJJJIL = C1308910kAL.LIZJ(R.attr.ej, getContext());
            this.LLJJL = true;
        }
    }

    public C417230GXp(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LLJJJJ = C418440Gaw.LIZIZ(1);
        this.LLJJJJJIL = 0;
        this.LLJJJJLIIL = true;
    }
}
