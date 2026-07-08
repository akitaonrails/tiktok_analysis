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

/* JADX INFO: renamed from: X.12Jv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public class C19736512Jv extends AppCompatImageView {
    public Drawable LL;
    public Drawable LLILLJJLI;

    public final void LIZ() {
        setImageDrawable(this.LL);
    }

    public final void LIZJ() {
        setImageDrawable(this.LLILLJJLI);
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

    public final void setStateDrawable(Drawable drawable) {
        this.LL = drawable;
        setImageDrawable(drawable);
    }

    public C19736512Jv(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C19736512Jv(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.TuxPlayerStateView);
            this.LL = typedArrayObtainStyledAttributes.getDrawable(R$styleable.TuxPlayerStateView_tux_first_state_icon);
            this.LLILLJJLI = typedArrayObtainStyledAttributes.getDrawable(R$styleable.TuxPlayerStateView_tux_second_state_icon);
            setImageDrawable(this.LL);
            typedArrayObtainStyledAttributes.recycle();
        }
    }
}
