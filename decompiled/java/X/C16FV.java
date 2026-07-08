package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.BitmapCrashChecker;
import com.ss.android.ugc.aweme.app.R$styleable;

/* JADX INFO: renamed from: X.16FV, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public class C16FV extends C16FY {
    public Drawable.ConstantState LLILLL;
    public Drawable.ConstantState LLILZ;

    public C16FV(Context context) {
        super(context);
        init(null, 0);
    }

    public final void LIZ(boolean z) {
        Drawable background = getBackground();
        if (background != null) {
            if (C1119850fFP.LJJIFFI && (background instanceof BitmapDrawable) && this.LLILLL == null) {
                this.LLILLL = background.getConstantState();
            }
            background.mutate();
            background.setAutoMirrored(z);
        }
    }

    public final void LIZJ(boolean z) {
        Drawable drawable = getDrawable();
        if (drawable != null) {
            if (C1119850fFP.LJJIFFI && (drawable instanceof BitmapDrawable) && this.LLILZ == null) {
                this.LLILZ = drawable.getConstantState();
            }
            drawable.mutate();
            drawable.setAutoMirrored(z);
        }
    }

    @Override // X.C16FY, androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView, android.view.View
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
        LIZ(true);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        LIZ(C783380UoC.LIZ.LIZIZ(i, true));
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        LIZJ(true);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageResource(int i) {
        super.setImageResource(i);
        LIZJ(C783380UoC.LIZ.LIZIZ(i, true));
    }

    public C16FV(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init(attributeSet, 0);
    }

    public final void init(AttributeSet attributeSet, int i) {
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R$styleable.LiveAutoRtlImageView, i, 0);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(R$styleable.LiveAutoRtlImageView_android_src, -1);
        if (resourceId == -1) {
            resourceId = typedArrayObtainStyledAttributes.getResourceId(R$styleable.LiveAutoRtlImageView_srcCompat, -1);
        }
        C783370UoB c783370UoB = C783380UoC.LIZ;
        LIZJ(c783370UoB.LIZIZ(resourceId, true));
        LIZ(c783370UoB.LIZIZ(typedArrayObtainStyledAttributes.getResourceId(R$styleable.LiveAutoRtlImageView_android_background, -1), true));
        typedArrayObtainStyledAttributes.recycle();
    }

    public C16FV(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init(attributeSet, i);
    }
}
