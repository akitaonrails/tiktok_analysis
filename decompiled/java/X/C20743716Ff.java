package X;

import android.content.Context;
import android.graphics.Canvas;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.16Ff, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public class C20743716Ff extends C20744216Fk implements InterfaceC1834170xpX, C16FX {
    public C20743916Fh LLLIL;
    public C20745516Fx LLLILZ;
    public boolean LLLILZJ;
    public boolean LLLILZLLLI;
    public long LLLIZZ;
    public long LLLJ;
    public boolean LLLJIL;

    public float getDefaultAlpha() {
        return this.LLLIL.LLILLJJLI.LLILLL;
    }

    public float getDisabledAlpha() {
        return this.LLLIL.LLILLJJLI.LLILLJJLI;
    }

    public float getPressedAlpha() {
        return this.LLLIL.LLILLJJLI.LL;
    }

    @Override // android.widget.CompoundButton, android.view.View
    public boolean performClick() {
        if (!this.LLLJIL) {
            return super.performClick();
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        if (jUptimeMillis - this.LLLJ < this.LLLIZZ) {
            return false;
        }
        this.LLLJ = jUptimeMillis;
        return super.performClick();
    }

    @Override // X.C21411718qp, android.widget.CompoundButton, android.widget.Checkable
    public final void toggle() {
        if (this.LLLILZJ) {
            super.toggle();
        }
    }

    @Override // X.C21411718qp, android.view.View
    public final void draw(Canvas canvas) {
        C20743916Fh c20743916Fh = this.LLLIL;
        if (c20743916Fh == null) {
            super.draw(canvas);
            return;
        }
        boolean zLJFF = c20743916Fh.LLILLJJLI.LJFF(canvas);
        super.draw(canvas);
        this.LLLIL.LLILLJJLI.getClass();
        if (!zLJFF) {
            return;
        }
        canvas.restore();
    }

    @Override // X.C21411718qp, android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.LLLILZLLLI && !isEnabled() && isClickable() && motionEvent != null && motionEvent.getAction() == 1 && motionEvent.getX() <= getWidth() && motionEvent.getY() <= getHeight()) {
            performClick();
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // X.InterfaceC1834160xpW
    public void setAllowClickWhenDisabledCompat(boolean z) {
        this.LLLILZLLLI = z;
    }

    public void setDebounceClickEnabled(boolean z) {
        this.LLLJIL = z;
    }

    public void setDefaultAlpha(float f) {
        C20743816Fg c20743816Fg = this.LLLIL.LLILLJJLI;
        c20743816Fg.LLILLL = f;
        c20743816Fg.LLILZ.invalidate();
    }

    public void setDelayInterval(long j) {
        if (j < 0) {
            this.LLLIZZ = 300L;
        } else {
            this.LLLIZZ = j;
        }
    }

    public void setDisabledAlpha(float f) {
        C20743816Fg c20743816Fg = this.LLLIL.LLILLJJLI;
        c20743816Fg.LLILLJJLI = f;
        c20743816Fg.LLILZ.invalidate();
    }

    public void setPressedAlpha(float f) {
        C20743816Fg c20743816Fg = this.LLLIL.LLILLJJLI;
        c20743816Fg.LL = f;
        c20743816Fg.LLILZ.invalidate();
    }

    public void setToggleEnabled(boolean z) {
        this.LLLILZJ = z;
    }

    public C20743716Ff(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.ewt);
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        this.LLLILZ.LJIIIIZZ(i);
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i, float f) {
        super.setTextSize(i, this.LLLILZ.LJIIIZ(f));
    }

    public C20743716Ff(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.LLLILZJ = true;
        this.LLLIZZ = 300L;
        C20743916Fh c20743916Fh = new C20743916Fh(this);
        this.LLLIL = c20743916Fh;
        c20743916Fh.LJII(attributeSet, i, 0);
        C20745516Fx c20745516Fx = new C20745516Fx(this);
        this.LLLILZ = c20745516Fx;
        c20745516Fx.LJII(attributeSet, i, 0);
    }
}
