package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.util.AttributeSet;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.BitmapCrashChecker;
import com.ss.android.ugc.aweme.app.R$styleable;

/* JADX INFO: renamed from: X.0GZM, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public class C0GZM extends SmartImageView {
    public final int LLIZLLLIL;
    public final int LLJ;
    public final int LLJI;
    public final Paint LLJIJIL;
    public LinearGradient LLJILJIL;

    @Override // X.C1322090kVb, android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C20597815iq.LIZ(this);
    }

    public final void LJIIIIZZ(Canvas canvas) {
        super.onDraw(canvas);
        if (this.LLIZLLLIL <= 0) {
            return;
        }
        int height = getHeight() - this.LLIZLLLIL;
        if (this.LLJILJIL == null) {
            LinearGradient linearGradient = new LinearGradient(0.0f, height, 0.0f, getHeight(), new int[]{this.LLJ, this.LLJI}, (float[]) null, Shader.TileMode.CLAMP);
            this.LLJILJIL = linearGradient;
            this.LLJIJIL.setShader(linearGradient);
        }
        canvas.drawRect(0.0f, height, getWidth(), getHeight(), this.LLJIJIL);
    }

    @Override // com.bytedance.lighten.loader.SmartImageView, X.C1322110kVd, X.C1322100kVc, X.C1322090kVb, android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        try {
            LJIIIIZZ(canvas);
        } catch (RuntimeException e) {
            TryCatchGuardChecker.doCheck(e);
            BitmapCrashChecker.doCheck(e, this);
            throw e;
        }
    }

    public C0GZM(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C0GZM(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0);
        this.LLJIJIL = new Paint();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.LinearGradientDraweeView);
        this.LLJ = typedArrayObtainStyledAttributes.getColor(R$styleable.LinearGradientDraweeView_start_color, 0);
        this.LLJI = typedArrayObtainStyledAttributes.getColor(R$styleable.LinearGradientDraweeView_end_color, 0);
        this.LLIZLLLIL = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.LinearGradientDraweeView_lg_height, 0);
        typedArrayObtainStyledAttributes.recycle();
    }
}
