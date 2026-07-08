package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.BitmapCrashChecker;

/* JADX INFO: renamed from: X.0GbQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public class C418740GbQ extends AppCompatImageView {
    public C418740GbQ() {
        throw null;
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        try {
            super.onDraw(canvas);
        } catch (RuntimeException e) {
            TryCatchGuardChecker.doCheck(e);
            BitmapCrashChecker.doCheck(e, this);
            throw e;
        }
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        super.setBackground(drawable);
        if (drawable != null) {
            drawable.setAutoMirrored(true);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        if (drawable != null) {
            drawable.setAutoMirrored(true);
        }
    }

    public C418740GbQ(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C418740GbQ(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Drawable drawable = getDrawable();
        Drawable background = getBackground();
        Drawable foreground = getForeground();
        if (drawable != null) {
            drawable.setAutoMirrored(true);
        }
        if (background != null) {
            background.setAutoMirrored(true);
        }
        if (foreground != null) {
            foreground.setAutoMirrored(true);
        }
    }
}
