package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.BitmapCrashChecker;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0Gbm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public class C418960Gbm extends AppCompatImageView {
    public Drawable LL;
    public int LLILLJJLI;
    public int LLILLL;

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

    public void setChecked(boolean z) {
        if (z) {
            setImageResource(2130971870);
            Drawable drawable = getDrawable();
            this.LL = drawable;
            if (drawable != null) {
                drawable.setColorFilter(this.LLILLJJLI, PorterDuff.Mode.SRC_IN);
                return;
            }
            return;
        }
        setImageResource(2130971869);
        Drawable drawable2 = getDrawable();
        this.LL = drawable2;
        if (drawable2 == null) {
            return;
        }
        drawable2.setColorFilter(this.LLILLL, PorterDuff.Mode.SRC_IN);
    }

    public void setColor(int i) {
        if (this.LL == null) {
            this.LL = getDrawable();
        }
        this.LL.setColorFilter(i, PorterDuff.Mode.SRC_IN);
    }

    public C418960Gbm(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LLILLJJLI = C420650GeV.LIZ(getResources(), R.color.acn, getContext().getTheme());
        this.LLILLL = C420650GeV.LIZ(getResources(), R.color.acm, getContext().getTheme());
        setChecked(false);
    }
}
