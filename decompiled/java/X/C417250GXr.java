package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.TextPaint;
import android.util.AttributeSet;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.app.R$styleable;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS192S0000000_6;

/* JADX INFO: renamed from: X.0GXr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C417250GXr extends C16F5 {
    public final float LLJJ;
    public final int LLJJI;
    public final C01GW LLJJIII;

    private final TextPaint getTextPaint() {
        return (TextPaint) this.LLJJIII.getValue();
    }

    @Override // android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.LLJJ > 0.0f) {
            getTextPaint().set(getPaint());
            ColorStateList textColors = getTextColors();
            setTextColor(this.LLJJI);
            getPaint().setStyle(Paint.Style.STROKE);
            getPaint().setStrokeWidth(this.LLJJ);
            super.onDraw(canvas);
            setTextColor(textColors);
            getPaint().setStyle(Paint.Style.FILL);
            super.onDraw(canvas);
            return;
        }
        super.onDraw(canvas);
    }

    public C417250GXr(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LLJJI = R.color.a52;
        this.LLJJIII = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(20));
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R$styleable.OutlineTextView, 0, 0);
        try {
            this.LLJJ = typedArrayObtainStyledAttributes.getDimension(R$styleable.OutlineTextView_outline_width, 0.0f);
            this.LLJJI = typedArrayObtainStyledAttributes.getInteger(R$styleable.OutlineTextView_outline_color, R.color.a52);
            typedArrayObtainStyledAttributes.recycle();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }
}
