package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.bytedance.android.livesdk.livesetting.rank.LiveRankStickerRTLStrokeSetting;
import com.ss.android.ugc.aweme.unifiedauthapi.experiment.OppoPermissionPopupMaskDelayExp;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0y9d, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1846630y9d extends C16F5 {
    public int LLJJ;
    public TextPaint LLJJI;
    public int LLJJIII;
    public int LLJJIJI;
    public boolean LLJJIJIIJIL;

    public final void LJJJJI() {
        getPaint().setTypeface(C1119920fFW.LIZ(900));
        TextPaint textPaint = this.LLJJI;
        if (textPaint != null) {
            textPaint.setTypeface(C1119920fFW.LIZ(900));
        }
    }

    public final void LJJJJIZL() {
        getPaint().setTypeface(C1119920fFW.LIZ(OppoPermissionPopupMaskDelayExp.DEFAULT));
        TextPaint textPaint = this.LLJJI;
        if (textPaint != null) {
            textPaint.setTypeface(C1119920fFW.LIZ(OppoPermissionPopupMaskDelayExp.DEFAULT));
        }
    }

    public final void LJJJJL(int i) {
        this.LLJJIII = i;
        TextPaint textPaint = this.LLJJI;
        if (textPaint != null) {
            textPaint.setColor(i);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        float measuredWidth;
        int i;
        canvas.save();
        int i2 = this.LLJJ;
        float f = 2;
        canvas.translate(i2 / f, i2 / f);
        TextPaint textPaint = this.LLJJI;
        if (textPaint != null) {
            if (LiveRankStickerRTLStrokeSetting.INSTANCE.getValue()) {
                measuredWidth = getMeasuredWidth() - (this.LLJJ / f);
            } else {
                measuredWidth = getMeasuredWidth();
            }
            float strokeWidth = textPaint.getStrokeWidth();
            CharSequence charSequenceEllipsize = TextUtils.ellipsize(getText(), getPaint(), measuredWidth, TextUtils.TruncateAt.END);
            if (this.LLJJIJIIJIL) {
                i = this.LLJJIJI;
            } else {
                i = 0;
            }
            float f2 = i;
            canvas.drawText(charSequenceEllipsize.toString(), 0.0f, getBaseline() + f2, textPaint);
            if (this.LLJJIJIIJIL) {
                textPaint.setStrokeWidth(f2);
                canvas.drawText(charSequenceEllipsize.toString(), 0.0f, getBaseline(), textPaint);
                textPaint.setStrokeWidth(strokeWidth);
            }
        }
        super.onDraw(canvas);
        canvas.restore();
    }

    public C1846630y9d(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }

    public final void LJJJJJ(String str, int[] iArr) {
        getPaint().setShader(new LinearGradient(0.0f, 0.0f, (int) getPaint().measureText(str), 0.0f, iArr, (float[]) null, Shader.TileMode.CLAMP));
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        setMeasuredDimension(getMeasuredWidth() + this.LLJJ, getMeasuredHeight() + this.LLJJ);
    }

    @Override // X.C16F5
    public final void LJJJJ(Context context, AttributeSet attributeSet, int i) {
        super.LJJJJ(context, attributeSet, i);
        this.LLJJ = (int) C497740JfY.LIZIZ(3.0f);
        float textSize = getTextSize();
        C1119920fFW.LIZLLL(context, getPaint(), 6, OppoPermissionPopupMaskDelayExp.DEFAULT);
        setTextSize(0, textSize);
        this.LLJJIII = C20736316Cj.LIZIZ(R.attr.epr, context);
        TextPaint textPaint = new TextPaint();
        C1119920fFW.LIZLLL(context, textPaint, 6, OppoPermissionPopupMaskDelayExp.DEFAULT);
        textPaint.setTextSize(textSize);
        textPaint.setColor(this.LLJJIII);
        textPaint.setStyle(Paint.Style.STROKE);
        textPaint.setStrokeJoin(Paint.Join.ROUND);
        textPaint.setStrokeWidth(this.LLJJ);
        this.LLJJI = textPaint;
    }
}
