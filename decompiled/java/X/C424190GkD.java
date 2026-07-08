package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.BitmapCrashChecker;
import com.ss.android.ugc.aweme.app.R$styleable;

/* JADX INFO: renamed from: X.0GkD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public class C424190GkD extends AppCompatImageView {
    public int LL;
    public boolean LLILLJJLI;

    public C424190GkD(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C20597815iq.LIZ(this);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        try {
            super.onDraw(canvas);
        } catch (RuntimeException e) {
            TryCatchGuardChecker.doCheck(e);
            BitmapCrashChecker.doCheck(e, this);
            throw e;
        }
    }

    public final void setChangeColor(boolean z) {
        this.LLILLJJLI = z;
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        if (this.LLILLJJLI) {
            Context context = C19733712It.LIZ;
            drawable = C19733712It.LJ(drawable, this.LL);
        }
        super.setImageDrawable(drawable);
    }

    @Override // android.widget.ImageView, android.view.View
    public void setSelected(boolean z) {
        int i;
        super.setSelected(z);
        if (z) {
            i = C19733712It.LIZIZ;
        } else {
            Context context = C19733712It.LIZ;
            i = (C19733712It.LIZIZ & 16777215) | Integer.MIN_VALUE;
        }
        this.LL = i;
        setImageDrawable(getDrawable());
    }

    public C424190GkD(Context context, AttributeSet attributeSet, int i) {
        int i2;
        super(context, attributeSet, i);
        this.LLILLJJLI = true;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.AVDmtView);
            typedArrayObtainStyledAttributes.getBoolean(R$styleable.AVDmtView_oldPanel, false);
            this.LLILLJJLI = typedArrayObtainStyledAttributes.getBoolean(R$styleable.AVDmtView_isChangeColor, true);
            if (typedArrayObtainStyledAttributes.getBoolean(R$styleable.AVDmtView_isSelected, true)) {
                i2 = C19733712It.LIZIZ;
            } else {
                i2 = (C19733712It.LIZIZ & 16777215) | Integer.MIN_VALUE;
            }
            this.LL = i2;
        }
        if (this.LLILLJJLI) {
            Context context2 = C19733712It.LIZ;
            setImageDrawable(C19733712It.LJ(getDrawable(), this.LL));
        }
    }

    public /* synthetic */ C424190GkD(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
