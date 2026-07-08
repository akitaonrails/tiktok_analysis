package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.BitmapCrashChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0STF, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public class C0STF extends SmartImageView implements View.OnTouchListener {
    public C0STE LLIZLLLIL;
    public Function0<Unit> LLJ;
    public boolean LLJI;
    public boolean LLJIJIL;

    public C0STF() {
        throw null;
    }

    public final boolean LJIIIIZZ() {
        C0STE c0ste = this.LLIZLLLIL;
        return c0ste != null && c0ste.LJIJI();
    }

    @Override // X.C1322090kVb, android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C20597815iq.LIZ(this);
    }

    public final boolean getHasReloaded() {
        return this.LLJI;
    }

    public final Function0<Unit> getImageReloadAction() {
        return this.LLJ;
    }

    public final boolean getSuppressVisibilityChange() {
        return this.LLJIJIL;
    }

    @Override // com.bytedance.lighten.loader.SmartImageView, X.C1322110kVd, X.C1322100kVc, X.C1322090kVb, android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        try {
            super.onDraw(canvas);
        } catch (RuntimeException e) {
            TryCatchGuardChecker.doCheck(e);
            BitmapCrashChecker.doCheck(e, this);
            throw e;
        }
    }

    @Override // X.C1322110kVd, android.widget.ImageView, android.view.View
    public final void onVisibilityAggregated(boolean z) {
        Drawable drawable;
        super.onVisibilityAggregated(z);
        if (!z) {
            if (this.LLJIJIL && C304280BwI.LIZLLL() && (drawable = getDrawable()) != null) {
                drawable.setVisible(true, false);
                return;
            }
            return;
        }
        this.LLJIJIL = false;
    }

    public final void setAdAweme(boolean z) {
        C0STE c0ste = this.LLIZLLLIL;
        if (c0ste != null) {
            c0ste.LLIZLLLIL = z;
        }
    }

    public final void setHasReloaded(boolean z) {
        this.LLJI = z;
    }

    public final void setImageReloadAction(Function0<Unit> function0) {
        this.LLJ = function0;
    }

    public final void setPinchContentAspectRatio(Float f) {
        C0STE c0ste = this.LLIZLLLIL;
        if (c0ste != null) {
            if (f == null || f.floatValue() <= 0.0f) {
                f = null;
            }
            c0ste.LLJLLL = f;
        }
    }

    public final void setPinchEnabled(boolean z) {
        C0STE c0ste = this.LLIZLLLIL;
        if (c0ste != null) {
            c0ste.LLLJL = z;
        }
    }

    public final void setPinchingBackground(Drawable drawable) {
        C0STE c0ste = this.LLIZLLLIL;
        if (c0ste != null) {
            c0ste.LJIIJJI().setBackground(drawable);
        }
    }

    public final void setSuppressVisibilityChange(boolean z) {
        this.LLJIJIL = z;
    }

    public final void setTouchEnabled(boolean z) {
        C0STE c0ste = this.LLIZLLLIL;
        if (c0ste != null) {
            c0ste.LLLJIL = z;
        }
    }

    public C0STF(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }

    @Override // X.C1322100kVc
    public final void inflateHierarchy(Context context, AttributeSet attributeSet) {
        C1331090kk7 c1331090kk7LIZLLL = C1335990ks1.LIZLLL(context, attributeSet);
        setAspectRatio(c1331090kk7LIZLLL.LIZLLL);
        setHierarchy(new C0STV(c1331090kk7LIZLLL));
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        C0STE c0ste = this.LLIZLLLIL;
        if (c0ste == null || !c0ste.onTouch(view, motionEvent)) {
            return false;
        }
        return true;
    }
}
