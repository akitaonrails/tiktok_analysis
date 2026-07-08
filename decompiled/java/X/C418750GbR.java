package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.BitmapCrashChecker;
import com.ss.android.ugc.aweme.app.R$styleable;

/* JADX INFO: renamed from: X.0GbR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C418750GbR extends C418740GbQ {
    public final boolean LL;

    @Override // android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C20597815iq.LIZ(this);
    }

    @Override // X.C418740GbQ, androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        try {
            super.onDraw(canvas);
        } catch (RuntimeException e) {
            TryCatchGuardChecker.doCheck(e);
            BitmapCrashChecker.doCheck(e, this);
            throw e;
        }
    }

    @Override // X.C418740GbQ, androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        if (this.LL) {
            Context context = C19733712It.LIZ;
            drawable = C19733712It.LIZLLL(drawable);
        }
        super.setImageDrawable(drawable);
    }

    public C418750GbR(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C418750GbR(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.LL = true;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.AVDmtView);
            typedArrayObtainStyledAttributes.getBoolean(R$styleable.AVDmtView_oldPanel, false);
            this.LL = typedArrayObtainStyledAttributes.getBoolean(R$styleable.AVDmtView_isChangeColor, true);
        }
        if (this.LL) {
            Context context2 = C19733712It.LIZ;
            setImageDrawable(C19733712It.LIZLLL(getDrawable()));
        }
    }
}
