package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.View;
import com.ss.android.ugc.aweme.unifiedauthapi.experiment.OppoPermissionPopupMaskDelayExp;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Epy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C376800Epy extends View {
    public Function0<Unit> LL;
    public AnonymousClass0956 LLILLJJLI;
    public int LLILLL;
    public Integer LLILZ;
    public Float LLILZIL;
    public final TextPaint LLILZLL;

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float fExactCenterY;
        super.onDraw(canvas);
        Integer numLIZJ = this.LLILZ;
        if (numLIZJ == null) {
            numLIZJ = C1308910kAL.LIZJ(R.attr.cbx, getContext());
        }
        this.LLILZ = numLIZJ;
        if (numLIZJ != null) {
            this.LLILZLL.setColor(numLIZJ.intValue());
        }
        float width = getWidth() / 2.0f;
        String strValueOf = String.valueOf(this.LLILLL);
        Float f = this.LLILZIL;
        if (f != null) {
            fExactCenterY = f.floatValue();
        } else {
            Rect rect = new Rect();
            this.LLILZLL.getTextBounds(strValueOf, 0, strValueOf.length(), rect);
            this.LLILZIL = Float.valueOf(rect.exactCenterY());
            fExactCenterY = rect.exactCenterY();
        }
        canvas.drawText(String.valueOf(this.LLILLL), width, (getHeight() / 2) - fExactCenterY, this.LLILZLL);
    }

    public final void setCountDownListener(Function0<Unit> function0) {
        this.LL = function0;
    }

    public C376800Epy(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LLILLL = 3;
        this.LLILZ = 0;
        this.LLILZ = C1308910kAL.LIZJ(R.attr.cbx, context);
        TextPaint textPaint = new TextPaint();
        textPaint.setColor(-1);
        C1119920fFW.LIZLLL(context, textPaint, 2, OppoPermissionPopupMaskDelayExp.DEFAULT);
        textPaint.setTextSize(C497740JfY.LIZIZ(60));
        textPaint.setTextAlign(Paint.Align.CENTER);
        this.LLILZLL = textPaint;
    }
}
