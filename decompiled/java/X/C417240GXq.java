package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.app.R$styleable;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0GXq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C417240GXq extends TuxTextView {
    public int LLJJJJ;
    public int LLJJJJJIL;
    public boolean LLJJJJLIIL;

    @Override // android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        if (!this.LLJJJJLIIL) {
            super.onDraw(canvas);
            return;
        }
        ColorStateList textColors = getTextColors();
        getPaint().setStyle(Paint.Style.STROKE);
        getPaint().setStrokeJoin(Paint.Join.ROUND);
        getPaint().setStrokeWidth(this.LLJJJJ);
        setTextColor(this.LLJJJJJIL);
        super.onDraw(canvas);
        setTextColor(textColors);
        getPaint().setStrokeWidth(0.0f);
        getPaint().setStyle(Paint.Style.FILL);
        super.onDraw(canvas);
    }

    public final void setStrokeColor(int i) {
        this.LLJJJJJIL = i;
    }

    public final void setStrokeWidth(int i) {
        this.LLJJJJ = i;
    }

    public C417240GXq(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 4, 0);
        this.LLJJJJLIIL = true;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.StrokeTuxTextView);
            this.LLJJJJ = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.StrokeTuxTextView_stroke_width, 0);
            int i = R$styleable.StrokeTuxTextView_stroke_color;
            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.bx, context);
            this.LLJJJJJIL = typedArrayObtainStyledAttributes.getColor(i, numLIZJ != null ? numLIZJ.intValue() : 0);
            typedArrayObtainStyledAttributes.recycle();
        }
    }
}
